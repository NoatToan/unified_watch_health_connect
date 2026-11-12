package com.huami.view.videoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
@TargetApi(14)
public class TextureViewImpl extends TextureView implements a, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener {
    private View a;
    private Uri b;
    private FrameVideoViewListener c;
    private Surface d;
    private MediaPlayer e;
    private boolean f;
    private boolean g;

    public TextureViewImpl(Context context) {
        super(context);
        setSurfaceTextureListener(this);
    }

    private void a() {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.e = mediaPlayer;
            mediaPlayer.setDataSource(getContext(), this.b);
            this.e.setSurface(this.d);
            this.e.setOnPreparedListener(this);
            this.e.setOnInfoListener(new InfoListener(this.a));
            this.e.setOnBufferingUpdateListener(this);
            this.e.prepare();
        } catch (Exception e) {
            FrameVideoViewListener frameVideoViewListener = this.c;
            if (frameVideoViewListener != null) {
                frameVideoViewListener.mediaPlayerPrepareFailed(this.e, e.toString());
            }
            c();
        }
    }

    private void b() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.e.release();
        }
        this.e = null;
        this.f = false;
        this.g = false;
    }

    private void c() {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
        b();
    }

    @Override // com.huami.view.videoview.a
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.huami.view.videoview.a
    public void init(View view, Uri uri) {
        this.a = view;
        this.b = uri;
        if (this.f) {
            b();
        }
        if (this.d != null) {
            a();
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // com.huami.view.videoview.a
    public void onPause() {
        c();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        if (this.g) {
            mediaPlayer.start();
            this.g = false;
        }
        this.f = true;
        FrameVideoViewListener frameVideoViewListener = this.c;
        if (frameVideoViewListener != null) {
            frameVideoViewListener.mediaPlayerPrepared(mediaPlayer);
        }
    }

    @Override // com.huami.view.videoview.a
    public void onResume() {
        if (this.f) {
            this.e.start();
        } else {
            this.g = true;
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.d = new Surface(surfaceTexture);
        if (this.f || this.b == null) {
            return;
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.huami.view.videoview.a
    public void setFrameVideoViewListener(FrameVideoViewListener frameVideoViewListener) {
        this.c = frameVideoViewListener;
    }

    @Override // com.huami.view.videoview.a
    public void stop() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public TextureViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}
