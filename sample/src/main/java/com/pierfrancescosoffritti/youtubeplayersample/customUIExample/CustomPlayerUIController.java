package com.pierfrancescosoffritti.youtubeplayersample.customUIExample;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import com.pierfrancescosoffritti.youtubeplayer.ui.AbstractPlayerUIController;
import com.pierfrancescosoffritti.youtubeplayer.ui.menu.YouTubePlayerMenu;
import com.pierfrancescosoffritti.youtubeplayersample.R;

class CustomPlayerUIController extends AbstractPlayerUIController {

    CustomPlayerUIController() {

    }

    @Override
    public void onControlsViewInflated(View controlsView) {

    }

    @Override
    public void onReady() {

    }

    @Override
    public void onStateChange(int state) {

    }

    @Override
    public void onPlaybackQualityChange(String playbackQuality) {

    }

    @Override
    public void onPlaybackRateChange(String playbackRate) {

    }

    @Override
    public void onError(int error) {

    }

    @Override
    public void onApiChange() {

    }

    @Override
    public void onCurrentSecond(float second) {

    }

    @Override
    public void onVideoDuration(float duration) {

    }

    @Override
    public void onMessage(String message) {

    }

    @Override
    public void onVideoId(String videoId) {

    }

    @Override
    public void onYouTubePlayerEnterFullScreen() {

    }

    @Override
    public void onYouTubePlayerExitFullScreen() {

    }

    @Override
    public void showUI(boolean show) {

    }

    @Override
    public void showPlayPauseButton(boolean show) {

    }

    @Override
    public void showVideoTitle(boolean show) {

    }

    @Override
    public void setVideoTitle(@NonNull String videoTitle) {

    }

    @Override
    public void enableLiveVideoUI(boolean enable) {

    }

    @Override
    public void setCustomAction1(@NonNull Drawable icon, @Nullable View.OnClickListener clickListener) {

    }

    @Override
    public void setCustomAction2(@NonNull Drawable icon, @Nullable View.OnClickListener clickListener) {

    }

    @Override
    public void showCustomAction1(boolean show) {

    }

    @Override
    public void showCustomAction2(boolean show) {

    }

    @Override
    public void showFullscreenButton(boolean show) {

    }

    @Override
    public void setCustomFullScreenButtonClickListener(@NonNull View.OnClickListener customFullScreenButtonClickListener) {

    }

    @Override
    public void showMenuButton(boolean show) {

    }

    @Override
    public void setCustomMenuButtonClickListener(@NonNull View.OnClickListener customMenuButtonClickListener) {

    }

    @Override
    public void showCurrentTime(boolean show) {

    }

    @Override
    public void showDuration(boolean show) {

    }

    @Override
    public void showSeekBar(boolean show) {

    }

    @Override
    public void showYouTubeButton(boolean show) {

    }

    @Override
    public void addView(@NonNull View view) {

    }

    @Override
    public void removeView(@NonNull View view) {

    }

    @NonNull
    @Override
    public YouTubePlayerMenu getMenu() {
        return null;
    }

    @Override
    public void setMenu(@NonNull YouTubePlayerMenu youTubePlayerMenu) {

    }
}
