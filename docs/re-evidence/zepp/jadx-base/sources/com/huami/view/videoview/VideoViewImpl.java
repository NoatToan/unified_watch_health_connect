package com.huami.view.videoview;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes15.dex */
public class VideoViewImpl extends VideoView implements a, MediaPlayer.OnPreparedListener {
    private View a;
    private Uri b;
    private FrameVideoViewListener c;

    public VideoViewImpl(Context context) {
        super(context);
    }

    @Override // com.huami.view.videoview.a
    public void init(View view, Uri uri) {
        this.a = view;
        this.b = uri;
        setOnPreparedListener(this);
    }

    @Override // com.huami.view.videoview.a
    public void onPause() {
        this.a.setVisibility(0);
        stopPlayback();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        mediaPlayer.setOnInfoListener(new InfoListener(this.a));
        FrameVideoViewListener frameVideoViewListener = this.c;
        if (frameVideoViewListener != null) {
            frameVideoViewListener.mediaPlayerPrepared(mediaPlayer);
        }
    }

    @Override // com.huami.view.videoview.a
    public void onResume() {
        setVideoURI(this.b);
        start();
    }

    @Override // com.huami.view.videoview.a
    public void setFrameVideoViewListener(FrameVideoViewListener frameVideoViewListener) {
        this.c = frameVideoViewListener;
    }

    @Override // com.huami.view.videoview.a
    public void stop() {
    }

    public VideoViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnPreparedListener(this);
    }
}
