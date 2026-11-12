package com.xmlywind.sdk.videoplayer;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.xmlywind.logger.SigmobLog;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class f extends e implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
    public MediaPlayer f;

    public f(VideoAdView videoAdView) {
        super(videoAdView);
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void a() {
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.6
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer = f.this.f;
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.start();
            }
        });
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void a(final float f) {
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.10
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer = f.this.f;
                if (mediaPlayer == null) {
                    return;
                }
                float f2 = f;
                mediaPlayer.setVolume(f2, f2);
            }
        });
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void a(final long j) {
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MediaPlayer mediaPlayer = f.this.f;
                    if (mediaPlayer == null) {
                        return;
                    }
                    mediaPlayer.seekTo((int) j);
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void a(Surface surface) {
        SigmobLog.d("setSurface() called with: surface = [" + surface + "]");
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setSurface(surface);
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void b() {
        d();
        HandlerThread handlerThread = new HandlerThread("VideoPlayerMediaSystem");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(this.b.getLooper());
        this.d = new Handler();
        this.c.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    f.this.f = new MediaPlayer();
                    f.this.f.setAudioStreamType(3);
                    f fVar = f.this;
                    fVar.f.setLooping(fVar.e.j.d);
                    f fVar2 = f.this;
                    fVar2.f.setOnPreparedListener(fVar2);
                    f fVar3 = f.this;
                    fVar3.f.setOnCompletionListener(fVar3);
                    f fVar4 = f.this;
                    fVar4.f.setOnBufferingUpdateListener(fVar4);
                    f.this.f.setScreenOnWhilePlaying(true);
                    f fVar5 = f.this;
                    fVar5.f.setOnSeekCompleteListener(fVar5);
                    f fVar6 = f.this;
                    fVar6.f.setOnErrorListener(fVar6);
                    f fVar7 = f.this;
                    fVar7.f.setOnInfoListener(fVar7);
                    f fVar8 = f.this;
                    fVar8.f.setOnVideoSizeChangedListener(fVar8);
                    Method declaredMethod = MediaPlayer.class.getDeclaredMethod("setDataSource", String.class, Map.class);
                    f fVar9 = f.this;
                    declaredMethod.invoke(fVar9.f, fVar9.e.j.a().toString(), f.this.e.j.c);
                    f.this.f.prepareAsync();
                    f.this.f.setSurface(new Surface(f.this.a));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void c() {
        Handler handler = this.c;
        if (handler == null || this.f == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.7
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer = f.this.f;
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.pause();
            }
        });
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public void d() {
        final HandlerThread handlerThread;
        final MediaPlayer mediaPlayer;
        Handler handler = this.c;
        if (handler == null || (handlerThread = this.b) == null || (mediaPlayer = this.f) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.9
            @Override // java.lang.Runnable
            public void run() {
                mediaPlayer.setSurface(null);
                mediaPlayer.release();
                handlerThread.quit();
                f.this.c = null;
            }
        });
        this.f = null;
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public long e() {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.xmlywind.sdk.videoplayer.e
    public long f() {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, final int i) {
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.13
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.setBufferProgress(i);
            }
        });
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.12
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.j();
            }
        });
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
        Handler handler = this.d;
        if (handler == null) {
            return false;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.3
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.b(i, i2);
            }
        });
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, final int i, final int i2) {
        Handler handler = this.d;
        if (handler == null || this.e == null) {
            return false;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.4
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.a(i, i2);
            }
        });
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.11
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.e();
            }
        });
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.2
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.w();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.e == null) {
            return;
        }
        SigmobLog.d("onSurfaceTextureAvailable() called with: surface = [" + surfaceTexture + "], width = [" + i + "], height = [" + i2 + "]");
        SurfaceTexture surfaceTexture2 = this.a;
        if (surfaceTexture2 != null) {
            this.e.D.setSurfaceTexture(surfaceTexture2);
        } else {
            this.a = surfaceTexture;
            b();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        SigmobLog.d("onSurfaceTextureDestroyed() called with: surface = [" + surfaceTexture + "]");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        SigmobLog.d("onSurfaceTextureSizeChanged() called with: surface = [" + surfaceTexture + "], width = [" + i + "], height = [" + i2 + "]");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, final int i, final int i2) {
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.f.5
            @Override // java.lang.Runnable
            public void run() {
                VideoAdView videoAdView = f.this.e;
                if (videoAdView == null) {
                    return;
                }
                videoAdView.c(i, i2);
            }
        });
    }
}
