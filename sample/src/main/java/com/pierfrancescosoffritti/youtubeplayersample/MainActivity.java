package com.pierfrancescosoffritti.youtubeplayersample;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.pierfrancescosoffritti.youtubeplayersample.baseExample.BaseExampleActivity;
import com.pierfrancescosoffritti.youtubeplayersample.customUIExample.CustomUIActivity;
import com.pierfrancescosoffritti.youtubeplayersample.recyclerViewExample.RecyclerViewActivity;
import com.pierfrancescosoffritti.youtubeplayersample.viewPagerSample.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private MenuItem selectedMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWebView();
        initToolbar();
        initNavDrawer();
    }

    @Override
    public void onResume() {
        super.onResume();

        if(selectedMenuItem != null)
            selectedMenuItem.setChecked(false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initWebView() {
        WebView webview = findViewById(R.id.main_activity_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://github.com/PierfrancescoSoffritti/Android-YouTube-Player/blob/master/README.md");

        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageCommitVisible(WebView view, String url) {
                super.onPageCommitVisible(view, url);
                findViewById(R.id.progressbar).setVisibility(View.GONE);
            }
        });
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_nav_drawer_menu_24dp);
    }

    private void initNavDrawer() {
        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(
                menuItem -> {
                    menuItem.setChecked(true);
                    selectedMenuItem = menuItem;

                    drawerLayout.closeDrawers();

                    if(menuItem.getItemId() == R.id.open_base_example_menu_item) {
                        Intent intent = new Intent(this, BaseExampleActivity.class);
                        startActivity(intent);
                    } else if(menuItem.getItemId() == R.id.open_recycler_view_example_menu_item) {
                        Intent intent = new Intent(this, RecyclerViewActivity.class);
                        startActivity(intent);
                    } else if(menuItem.getItemId() == R.id.open_view_pager_example_menu_item) {
                        Intent intent = new Intent(this, ViewPagerActivity.class);
                        startActivity(intent);
                    } else if(menuItem.getItemId() == R.id.open_custom_ui_example_menu_item) {
                        Intent intent = new Intent(this, CustomUIActivity.class);
                        startActivity(intent);
                    }

                    return true;
                }
        );
    }
}
