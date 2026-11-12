package com.huawei.hiar;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes33.dex */
public class ARVideoSource {
    private static final String TAG = "ARVideoSource";
    private MediaMetadataRetriever mediaMetadataRetriever;
    private MediaPlayer player;
    private Surface surface;
    private String videoPath;

    public void stopVideoPlay() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public void startPlayVideo() {
        try {
            this.player.prepare();
        } catch (IOException unused) {
            Log.w(TAG, "start Player video fail!");
        }
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setSurface(Surface surface) {
        this.surface = surface;
        this.player.setSurface(surface);
    }

    public void resumeVideoPlay() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public void releasePlayer() throws IOException {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.mediaMetadataRetriever;
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.release();
        }
    }

    public void pauseVideoPlay() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void initPlayer() {
        this.player.reset();
        try {
            Log.d(TAG, "VideoPath is " + this.videoPath);
            this.player.setDataSource(this.videoPath);
            this.player.setSurface(this.surface);
            this.mediaMetadataRetriever.setDataSource(this.videoPath);
            this.player.setOnPreparedListener(new b());
        } catch (IOException unused) {
            Log.w(TAG, "init Player fail!");
        }
    }

    public int getVideoWidth() {
        try {
            return Integer.parseInt(this.mediaMetadataRetriever.extractMetadata(18));
        } catch (NumberFormatException e) {
            Log.e(TAG, "get video width failed!" + e.getClass());
            return 0;
        }
    }

    public int getVideoHeight() {
        try {
            return Integer.parseInt(this.mediaMetadataRetriever.extractMetadata(19));
        } catch (NumberFormatException e) {
            Log.e(TAG, "get video height failed!" + e.getClass());
            return 0;
        }
    }

    class b implements MediaPlayer.OnPreparedListener {
        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            ARVideoSource.this.player.setLooping(true);
            ARVideoSource.this.player.start();
        }

        b() {
        }
    }

    public ARVideoSource(Surface surface, String str) {
        this.surface = surface;
        this.videoPath = str;
        this.player = new MediaPlayer();
        this.mediaMetadataRetriever = new MediaMetadataRetriever();
    }

    public ARVideoSource() {
    }
}
