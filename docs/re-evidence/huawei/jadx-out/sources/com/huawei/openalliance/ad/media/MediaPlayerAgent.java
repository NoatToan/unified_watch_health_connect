package com.huawei.openalliance.ad.media;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.exception.c;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaPlayerReleaseListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.ap;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.dj;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.ds;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public class MediaPlayerAgent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ap f19532a = new ap("thread_media_player_ctrl");
    private int A;
    private Context C;
    private boolean D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f19534c;
    private String e;
    private volatile String f;
    private boolean g;
    private int l;
    private long m;
    private AudioManager s;
    private Object y;
    private WeakReference<Surface> z;
    private int d = 0;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private int k = 0;
    private final MediaState n = new MediaState();
    private final byte[] o = new byte[0];
    private final byte[] p = new byte[0];
    private final byte[] q = new byte[0];
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private boolean w = false;
    private volatile int x = 0;
    private boolean B = false;
    private boolean E = false;
    private final CopyOnWriteArraySet<MediaStateListener> F = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<MediaBufferListener> G = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<MediaErrorListener> H = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<MuteListener> I = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<com.huawei.openalliance.ad.media.listener.a> J = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<MediaPlayer.OnVideoSizeChangedListener> K = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<PPSVideoRenderListener> L = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<MediaPlayerReleaseListener> M = new CopyOnWriteArraySet<>();
    private final MediaPlayer.OnVideoSizeChangedListener N = new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.1
        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayerAgent.this.a(mediaPlayer, i, i2);
        }
    };
    private MediaPlayer.OnCompletionListener O = new MediaPlayer.OnCompletionListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.12
        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (MediaPlayerAgent.this.n.isState(MediaState.State.ERROR) || MediaPlayerAgent.this.n.isState(MediaState.State.PLAYBACK_COMPLETED)) {
                return;
            }
            MediaPlayerAgent.this.n.a(MediaState.State.PLAYBACK_COMPLETED);
            int currentPosition = mediaPlayer.getCurrentPosition();
            int iH = MediaPlayerAgent.this.h();
            hw.b("MediaPlayerAgent", "onCompletion %d duration: %d", Integer.valueOf(currentPosition), Integer.valueOf(iH));
            int iMax = Math.max(currentPosition, iH);
            MediaPlayerAgent.this.a(100, iMax);
            MediaPlayerAgent.this.b(iMax);
            MediaPlayerAgent.this.q();
            MediaPlayerAgent.d(MediaPlayerAgent.this.e);
            MediaPlayerAgent.this.k = 0;
            MediaPlayerAgent.this.r = 0;
        }
    };
    private MediaPlayer.OnInfoListener P = new MediaPlayer.OnInfoListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.23
        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            hw.b("MediaPlayerAgent", "onInfo what: %d extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 3) {
                MediaPlayerAgent.this.o();
            } else {
                if (i == 701) {
                    MediaPlayerAgent.this.n();
                    return true;
                }
                if (i != 702) {
                    if (i != 804 && i != 805) {
                        return true;
                    }
                    MediaPlayerAgent.this.b(i, i2);
                    return true;
                }
            }
            MediaPlayerAgent.this.q();
            return true;
        }
    };
    private MediaPlayer.OnPreparedListener Q = new MediaPlayer.OnPreparedListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.34
        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            hw.b("MediaPlayerAgent", "onPrepared");
            MediaPlayerAgent.this.i = false;
            mediaPlayer.setOnInfoListener(MediaPlayerAgent.this.P);
            if (MediaPlayerAgent.this.j || MediaPlayerAgent.this.n.isNotState(MediaState.State.PREPARING)) {
                MediaPlayerAgent.this.n.a(MediaState.State.PREPARED);
                MediaPlayerAgent mediaPlayerAgent = MediaPlayerAgent.this;
                mediaPlayerAgent.g(mediaPlayerAgent.h());
                return;
            }
            try {
                MediaPlayerAgent.this.n.a(MediaState.State.PREPARED);
                mediaPlayer.start();
                MediaPlayerAgent.b(mediaPlayer, MediaPlayerAgent.this.m, 3);
                MediaPlayerAgent.this.n.a(MediaState.State.PLAYING);
                if (hw.a()) {
                    hw.a("MediaPlayerAgent", "seek to prefer pos: %d", Long.valueOf(MediaPlayerAgent.this.m));
                }
                MediaPlayerAgent.this.d(mediaPlayer.getCurrentPosition());
                MediaPlayerAgent mediaPlayerAgent2 = MediaPlayerAgent.this;
                mediaPlayerAgent2.g(mediaPlayerAgent2.h());
                MediaPlayerAgent.this.t();
            } catch (IllegalStateException unused) {
                hw.c("MediaPlayerAgent", "onPrepared - IllegalStateException");
                MediaPlayerAgent.this.n.a(MediaState.State.ERROR);
                MediaPlayerAgent.this.a(0, -1, -1);
            }
        }
    };
    private MediaPlayer.OnErrorListener R = new MediaPlayer.OnErrorListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.39
        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            hw.c("MediaPlayerAgent", "onError - what: %d extra: %d currentState: %s - agent: %s", Integer.valueOf(i), Integer.valueOf(i2), MediaPlayerAgent.this.n, MediaPlayerAgent.this);
            MediaPlayerAgent.this.q();
            if (MediaPlayerAgent.this.n.isState(MediaState.State.ERROR)) {
                hw.b("MediaPlayerAgent", "do not notify error when already error");
                return true;
            }
            MediaPlayerAgent.this.n.a(MediaState.State.ERROR);
            MediaPlayerAgent.this.a(mediaPlayer.getCurrentPosition(), i, i2);
            return true;
        }
    };
    private MediaPlayer.OnBufferingUpdateListener S = new MediaPlayer.OnBufferingUpdateListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.40
        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            if (MediaPlayerAgent.this.n.a()) {
                if (i < 0) {
                    i = 0;
                }
                if (i > 100) {
                    i = 100;
                }
                MediaPlayerAgent.this.c(i);
            }
        }
    };
    private Callable<Boolean> T = new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.8
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(MediaPlayerAgent.this.j());
        }
    };
    private Runnable U = new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.32
        @Override // java.lang.Runnable
        public void run() {
            int iH;
            MediaPlayerAgent.d(MediaPlayerAgent.this.e);
            if (MediaPlayerAgent.this.n.isNotState(MediaState.State.PREPARING) && MediaPlayerAgent.this.n.isNotState(MediaState.State.PLAYING) && MediaPlayerAgent.this.n.isNotState(MediaState.State.PREPARED)) {
                return;
            }
            int currentPlayPosition = MediaPlayerAgent.this.getCurrentPlayPosition();
            if (MediaPlayerAgent.this.F.size() > 0 && (iH = MediaPlayerAgent.this.h()) > 0) {
                int iCeil = (int) Math.ceil((currentPlayPosition * 100.0f) / iH);
                if (iCeil > 100) {
                    iCeil = 100;
                }
                MediaPlayerAgent.this.a(iCeil, currentPlayPosition);
                if (currentPlayPosition >= iH) {
                    MediaPlayerAgent.y(MediaPlayerAgent.this);
                    if (MediaPlayerAgent.this.r > 2) {
                        hw.b("MediaPlayerAgent", "reach end count exceeds");
                        MediaPlayerAgent.this.O.onCompletion(MediaPlayerAgent.this.c());
                        return;
                    }
                }
            }
            if (MediaPlayerAgent.this.g && MediaPlayerAgent.this.G.size() > 0 && MediaPlayerAgent.this.r == 0) {
                if (Math.abs(currentPlayPosition - MediaPlayerAgent.this.k) < 100) {
                    MediaPlayerAgent.this.n();
                } else {
                    MediaPlayerAgent.this.q();
                    MediaPlayerAgent.this.k = currentPlayPosition;
                }
            }
            MediaPlayerAgent.b(MediaPlayerAgent.this.U, MediaPlayerAgent.this.e, 200L);
        }
    };
    private AudioManager.OnAudioFocusChangeListener V = new AudioManager.OnAudioFocusChangeListener() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.38
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            MediaPlayerAgent.b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.38.1
                @Override // java.lang.Runnable
                public void run() {
                    hw.b("MediaPlayerAgent", "onAudioFocusChange %d previous: %d", Integer.valueOf(i), Integer.valueOf(MediaPlayerAgent.this.v));
                    int i2 = i;
                    if (i2 == -3) {
                        b();
                    } else if (i2 == -2 || i2 == -1) {
                        a();
                    } else if (i2 == 1 || i2 == 2) {
                        c();
                    }
                    MediaPlayerAgent.this.v = i;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            hw.b("MediaPlayerAgent", "handleAudioFocusGain - muteOnlyOnLostAudioFocus: " + MediaPlayerAgent.this.B);
            if (MediaPlayerAgent.this.B) {
                if (!MediaPlayerAgent.this.u) {
                    return;
                }
            } else {
                if (MediaPlayerAgent.this.v == -2 || MediaPlayerAgent.this.v == -1) {
                    if (MediaPlayerAgent.this.t) {
                        MediaPlayerAgent.this.a((Long) null);
                        MediaPlayerAgent.this.t = false;
                        return;
                    }
                    return;
                }
                if (MediaPlayerAgent.this.v != -3 || !MediaPlayerAgent.this.u) {
                    return;
                }
            }
            MediaPlayerAgent.this.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            hw.b("MediaPlayerAgent", "handleAudioFocusLossTransientCanDuck soundMuted: " + MediaPlayerAgent.this.w);
            if (MediaPlayerAgent.this.w) {
                return;
            }
            MediaPlayerAgent.this.l();
            MediaPlayerAgent.this.u = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (!MediaPlayerAgent.this.B) {
                boolean zJ = MediaPlayerAgent.this.j();
                hw.b("MediaPlayerAgent", "handleAudioFocusLoss isPlaying: %s", Boolean.valueOf(zJ));
                if (zJ) {
                    MediaPlayerAgent.this.pause();
                    MediaPlayerAgent.this.t = true;
                    return;
                }
                return;
            }
            hw.b("MediaPlayerAgent", "handleAudioFocusLoss muteOnlyOnLostAudioFocus: " + MediaPlayerAgent.this.B);
            b();
        }
    };

    public void unmuteSound() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.13
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.m();
            }
        });
    }

    public String toString() {
        return "MediaPlayerAgent@" + Integer.toHexString(hashCode()) + " [" + ds.a(this.f) + "]";
    }

    public void stopWhenUrlMatchs(final String str) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.4
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 == null || !TextUtils.equals(str2, MediaPlayerAgent.this.f)) {
                    return;
                }
                MediaPlayerAgent.this.f();
            }
        });
    }

    public void stop() {
        c(true);
    }

    public void setVideoSizeChangeListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        a(onVideoSizeChangedListener);
    }

    public void setSurface(final Surface surface) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.10
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.a(surface);
            }
        });
    }

    public void setSoundVolume(final float f) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.14
            @Override // java.lang.Runnable
            public void run() {
                hw.a("MediaPlayerAgent", "setSoundVolume %f result: %s", Float.valueOf(f), Boolean.valueOf(MediaPlayerAgent.this.b(f)));
            }
        });
    }

    public void setPreferStartPlayTime(int i) {
        this.m = i;
    }

    public void setPPSVideoRenderListener(PPSVideoRenderListener pPSVideoRenderListener) {
        a(pPSVideoRenderListener);
    }

    public void setMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        a(mediaPlayerReleaseListener);
    }

    public void setMediaFile(final String str) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MediaPlayerAgent.this.b(str);
                } catch (c e) {
                    hw.a("MediaPlayerAgent", "set media file error:%s", e.getMessage());
                    hw.c("MediaPlayerAgent", "set media file error:" + e.getClass().getSimpleName());
                }
            }
        });
    }

    public void setDefaultDuration(int i) {
        synchronized (this.p) {
            this.l = i;
        }
    }

    public void seekToMillis(final long j, final int i) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.7
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.a(j, i);
            }
        });
    }

    public void seekTo(int i, int i2) {
        MediaPlayer mediaPlayer;
        try {
            if (!this.n.a() || this.i) {
                return;
            }
            synchronized (this.o) {
                mediaPlayer = this.f19534c;
            }
            int iH = (h() * i) / 100;
            b(mediaPlayer, iH, i2);
            a(i, iH);
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "seekTo IllegalStateException");
        }
    }

    public void seekTo(int i) {
        seekTo(i, 0);
    }

    public void reset() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.36
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.v();
            }
        });
    }

    public void removeVideoSizeChangeListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener == null) {
            return;
        }
        this.K.remove(onVideoSizeChangedListener);
    }

    public void removePPSVideoRenderListener(PPSVideoRenderListener pPSVideoRenderListener) {
        if (pPSVideoRenderListener == null) {
            return;
        }
        this.L.remove(pPSVideoRenderListener);
    }

    public void removeMuteListener(MuteListener muteListener) {
        if (muteListener == null) {
            return;
        }
        this.I.remove(muteListener);
    }

    public void removeMediaStateListener(MediaStateListener mediaStateListener) {
        if (mediaStateListener == null) {
            return;
        }
        this.F.remove(mediaStateListener);
    }

    public void removeMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        if (mediaPlayerReleaseListener == null) {
            return;
        }
        this.M.remove(mediaPlayerReleaseListener);
    }

    public void removeMediaInfoListener(com.huawei.openalliance.ad.media.listener.a aVar) {
        if (aVar == null) {
            return;
        }
        this.J.remove(aVar);
    }

    public void removeMediaErrorListener(MediaErrorListener mediaErrorListener) {
        if (mediaErrorListener == null) {
            return;
        }
        this.H.remove(mediaErrorListener);
    }

    public void removeMediaBufferListener(MediaBufferListener mediaBufferListener) {
        if (mediaBufferListener == null) {
            return;
        }
        this.G.remove(mediaBufferListener);
    }

    public void release() {
        synchronized (this.q) {
            int i = this.d - 1;
            this.d = i;
            if (i < 0) {
                this.d = 0;
            }
            if (hw.a()) {
                hw.a("MediaPlayerAgent", "release - instanceRefCount: %d - agent: %s", Integer.valueOf(this.d), this);
            }
            if (this.d == 0) {
                b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.33
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaPlayerAgent.this.u();
                    }
                });
            }
        }
    }

    public void prepare() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.2
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.e();
            }
        });
    }

    public void playWhenUrlMatchs(final String str) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.43
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 == null || !TextUtils.equals(str2, MediaPlayerAgent.this.f)) {
                    hw.b("MediaPlayerAgent", "playWhenUrlMatchs - url not match");
                } else {
                    MediaPlayerAgent.this.a((Long) null);
                }
            }
        });
    }

    public void play(final Long l) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.42
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.a(l);
            }
        });
    }

    public void play() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.41
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.a((Long) null);
            }
        });
    }

    public void pauseWhenUrlMatchs(final String str) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.6
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 == null || !TextUtils.equals(str2, MediaPlayerAgent.this.f)) {
                    return;
                }
                MediaPlayerAgent.this.g();
            }
        });
    }

    public void pause() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.5
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.g();
            }
        });
    }

    public void muteSound() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.11
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.l();
            }
        });
    }

    public boolean isPlaying() {
        if (this.n.isState(MediaState.State.END)) {
            return false;
        }
        return ((Boolean) dj.a(this.T, 300L, Boolean.valueOf(this.n.isState(MediaState.State.PLAYING)))).booleanValue();
    }

    public int getInstanceRefCount() {
        int i;
        synchronized (this.q) {
            i = this.d;
        }
        return i;
    }

    public MediaState getCurrentState() {
        return this.n;
    }

    public int getCurrentPlayPosition() {
        MediaPlayer mediaPlayer;
        if (this.n.isState(MediaState.State.END) || this.n.isState(MediaState.State.ERROR) || this.n.isState(MediaState.State.IDLE)) {
            return 0;
        }
        try {
            synchronized (this.o) {
                mediaPlayer = this.f19534c;
            }
            if (mediaPlayer != null) {
                return mediaPlayer.getCurrentPosition();
            }
            return 0;
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "getCurrentPlayPosition IllegalStateException");
            return 0;
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.35
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.u();
            }
        });
    }

    public void b() {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.37
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.x();
            }
        });
    }

    public void addReportVideoTimeListenersSet(ReportVideoTimeListener reportVideoTimeListener) {
        if (this.f19533b == null) {
            this.f19533b = new b(this.C);
        }
        this.f19533b.a(reportVideoTimeListener);
    }

    public void addMuteListener(MuteListener muteListener) {
        if (muteListener == null) {
            return;
        }
        this.I.add(muteListener);
    }

    public void addMediaStateListener(MediaStateListener mediaStateListener) {
        if (mediaStateListener == null) {
            return;
        }
        this.F.add(mediaStateListener);
    }

    public void addMediaInfoListener(com.huawei.openalliance.ad.media.listener.a aVar) {
        if (aVar == null) {
            return;
        }
        this.J.add(aVar);
    }

    public void addMediaErrorListener(MediaErrorListener mediaErrorListener) {
        if (mediaErrorListener == null) {
            return;
        }
        this.H.add(mediaErrorListener);
    }

    public void addMediaBufferListener(MediaBufferListener mediaBufferListener) {
        if (mediaBufferListener == null) {
            return;
        }
        this.G.add(mediaBufferListener);
    }

    public void acquire() {
        synchronized (this.q) {
            this.d++;
            if (hw.a()) {
                hw.a("MediaPlayerAgent", "acquire - instanceRefCount: %d - agent: %s", Integer.valueOf(this.d), this);
            }
        }
    }

    boolean a(String str, MediaPlayer mediaPlayer) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = this.C.getContentResolver().openTypedAssetFileDescriptor(Uri.parse(str), "*/*", null);
        if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
            df.a(assetFileDescriptorOpenTypedAssetFileDescriptor);
            return false;
        }
        try {
            if (assetFileDescriptorOpenTypedAssetFileDescriptor.getDeclaredLength() < 0) {
                mediaPlayer.setDataSource(assetFileDescriptorOpenTypedAssetFileDescriptor.getFileDescriptor());
            } else {
                mediaPlayer.setDataSource(assetFileDescriptorOpenTypedAssetFileDescriptor.getFileDescriptor(), assetFileDescriptorOpenTypedAssetFileDescriptor.getStartOffset(), assetFileDescriptorOpenTypedAssetFileDescriptor.getDeclaredLength());
            }
            return true;
        } finally {
            df.a(assetFileDescriptorOpenTypedAssetFileDescriptor);
        }
    }

    public void a(boolean z) {
        this.B = z;
    }

    public void a(PPSVideoRenderListener pPSVideoRenderListener) {
        if (pPSVideoRenderListener == null) {
            return;
        }
        this.L.add(pPSVideoRenderListener);
    }

    public void a(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        if (mediaPlayerReleaseListener == null) {
            return;
        }
        this.M.add(mediaPlayerReleaseListener);
    }

    public void a(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener == null) {
            return;
        }
        this.K.add(onVideoSizeChangedListener);
    }

    public void a(long j, int i) {
        MediaPlayer mediaPlayer;
        try {
            hw.b("MediaPlayerAgent", "seekToMillis " + j);
            if (this.n.a()) {
                synchronized (this.o) {
                    mediaPlayer = this.f19534c;
                }
                b(mediaPlayer, j, i);
                long jH = h();
                if (jH > 0) {
                    a((int) ((100 * j) / jH), (int) j);
                }
            }
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "seekTo IllegalStateException");
        }
    }

    public void a(int i) {
        this.x = i;
    }

    public void a(final float f) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.15
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.c(f);
            }
        });
    }

    public String a() {
        return this.f;
    }

    private boolean y() {
        hw.b("MediaPlayerAgent", "isNeedAudioFocus type: %s soundMute: %s", Integer.valueOf(this.x), Boolean.valueOf(this.w));
        if (this.x == 0) {
            return true;
        }
        if (this.x == 2) {
            return false;
        }
        return (this.x == 1 && this.w) ? false : true;
    }

    static /* synthetic */ int y(MediaPlayerAgent mediaPlayerAgent) {
        int i = mediaPlayerAgent.r;
        mediaPlayerAgent.r = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void x() {
        String str;
        try {
            try {
                hw.b("MediaPlayerAgent", "abandonAudioFocus");
                Object obj = this.y;
                if (obj instanceof AudioFocusRequest) {
                    this.s.abandonAudioFocusRequest((AudioFocusRequest) obj);
                }
                this.y = null;
            } catch (IllegalStateException unused) {
                str = "abandonAudioFocus IllegalStateException";
                hw.c("MediaPlayerAgent", str);
            } catch (Exception e) {
                str = "abandonAudioFocus " + e.getClass().getSimpleName();
                hw.c("MediaPlayerAgent", str);
            }
        } finally {
            this.u = false;
            this.t = false;
            this.v = 0;
        }
    }

    private void w() {
        String str;
        if (!y()) {
            hw.c("MediaPlayerAgent", "audio focus is not needed");
            return;
        }
        try {
            hw.b("MediaPlayerAgent", "requestAudioFocus");
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setOnAudioFocusChangeListener(this.V).build();
            this.y = audioFocusRequestBuild;
            this.s.requestAudioFocus(audioFocusRequestBuild);
        } catch (IllegalStateException unused) {
            str = "requestAudioFocus IllegalStateException";
            hw.c("MediaPlayerAgent", str);
        } catch (Exception e) {
            str = "requestAudioFocus " + e.getClass().getSimpleName();
            hw.c("MediaPlayerAgent", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        synchronized (this.o) {
            hw.b("MediaPlayerAgent", "resetInternal - agent: %s", this);
            try {
                if (this.f19534c == null) {
                    this.k = 0;
                    this.r = 0;
                    this.i = false;
                    this.u = false;
                    this.t = false;
                    this.v = 0;
                    this.A = 0;
                    this.n.a(MediaState.State.IDLE);
                    q();
                    d(this.e);
                } else {
                    if (this.n.a()) {
                        int currentPosition = this.f19534c.getCurrentPosition();
                        this.f19534c.stop();
                        if (this.n.isState(MediaState.State.PLAYBACK_COMPLETED)) {
                            currentPosition = 0;
                        }
                        e(currentPosition);
                        a(0, 0);
                        c(0);
                    }
                    this.f19534c.reset();
                    this.k = 0;
                    this.r = 0;
                    this.i = false;
                    this.u = false;
                    this.t = false;
                    this.v = 0;
                    this.A = 0;
                    this.n.a(MediaState.State.IDLE);
                    q();
                    d(this.e);
                }
            } catch (IllegalStateException unused) {
                hw.c("MediaPlayerAgent", "media player reset IllegalStateException");
            } catch (Throwable th) {
                hw.c("MediaPlayerAgent", "media player reset exception: %s", th.getClass().getSimpleName());
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.media.MediaPlayer, android.media.MediaPlayer$OnVideoSizeChangedListener] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void u() {
        String str;
        synchronized (this.o) {
            if (this.n.isState(MediaState.State.END)) {
                return;
            }
            this.n.a(MediaState.State.END);
            hw.b("MediaPlayerAgent", "release - agent: %s", this);
            f19532a.b();
            v();
            MediaPlayer mediaPlayer = this.f19534c;
            if (mediaPlayer != null) {
                ?? r2 = 0;
                try {
                    try {
                        mediaPlayer.setSurface(null);
                        this.f19534c.setOnVideoSizeChangedListener(null);
                        this.f19534c.release();
                        this.f19534c = null;
                        str = "MediaPlayerAgent";
                        r2 = "release media player";
                    } catch (Throwable th) {
                        this.f19534c.setOnVideoSizeChangedListener(r2);
                        this.f19534c.release();
                        this.f19534c = r2;
                        hw.b("MediaPlayerAgent", "release media player");
                        p();
                        throw th;
                    }
                } catch (IllegalStateException unused) {
                    hw.c("MediaPlayerAgent", "media player reset surface IllegalStateException");
                    this.f19534c.setOnVideoSizeChangedListener(null);
                    this.f19534c.release();
                    this.f19534c = null;
                    str = "MediaPlayerAgent";
                    r2 = "release media player";
                }
                hw.b(str, r2);
                p();
            }
            this.F.clear();
            this.G.clear();
            this.H.clear();
            this.I.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (hw.a()) {
            hw.a("MediaPlayerAgent", "progress");
        }
        d(this.e);
        if (this.F.size() > 0) {
            b(this.U);
        }
    }

    private void s() {
        if (!this.w) {
            hw.b("MediaPlayerAgent", "already unmuted, don't notify");
            return;
        }
        hw.b("MediaPlayerAgent", "notifyUnmute");
        this.w = false;
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.29
            @Override // java.lang.Runnable
            public void run() {
                for (MuteListener muteListener : MediaPlayerAgent.this.I) {
                    if (muteListener != null) {
                        muteListener.onUnmute();
                    }
                }
            }
        });
    }

    private void r() {
        if (this.w) {
            hw.b("MediaPlayerAgent", "already muted, don't notify");
            return;
        }
        hw.b("MediaPlayerAgent", "notifyMute");
        this.w = true;
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.28
            @Override // java.lang.Runnable
            public void run() {
                for (MuteListener muteListener : MediaPlayerAgent.this.I) {
                    if (muteListener != null) {
                        muteListener.onMute();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.h && this.g) {
            this.h = false;
            hw.b("MediaPlayerAgent", "notifyBufferingEnd currentState: %s", this.n);
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.22
                @Override // java.lang.Runnable
                public void run() {
                    for (MediaBufferListener mediaBufferListener : MediaPlayerAgent.this.G) {
                        if (mediaBufferListener != null) {
                            mediaBufferListener.onBufferingEnd();
                        }
                    }
                }
            });
        }
    }

    private void p() {
        CopyOnWriteArraySet<MediaPlayerReleaseListener> copyOnWriteArraySet = this.M;
        if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0) {
            return;
        }
        hw.b("MediaPlayerAgent", "notify player release");
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.21
            @Override // java.lang.Runnable
            public void run() {
                for (MediaPlayerReleaseListener mediaPlayerReleaseListener : MediaPlayerAgent.this.M) {
                    if (mediaPlayerReleaseListener != null) {
                        mediaPlayerReleaseListener.onPlayerRelease();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        CopyOnWriteArraySet<PPSVideoRenderListener> copyOnWriteArraySet = this.L;
        if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0) {
            return;
        }
        hw.b("MediaPlayerAgent", "notifyRenderStart");
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.20
            @Override // java.lang.Runnable
            public void run() {
                for (PPSVideoRenderListener pPSVideoRenderListener : MediaPlayerAgent.this.L) {
                    if (pPSVideoRenderListener != null) {
                        pPSVideoRenderListener.onVideoRenderStart();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!this.h && this.g && this.G.size() > 0) {
            if (this.n.isState(MediaState.State.PLAYING) || this.n.isState(MediaState.State.PREPARING)) {
                hw.b("MediaPlayerAgent", "notifyBufferingStart currentState: %s", this.n);
                this.h = true;
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.19
                    @Override // java.lang.Runnable
                    public void run() {
                        for (MediaBufferListener mediaBufferListener : MediaPlayerAgent.this.G) {
                            if (mediaBufferListener != null) {
                                mediaBufferListener.onBufferingStart();
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.u = false;
        if (b(1.0f)) {
            s();
        }
        if (this.x == 1 && j()) {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.u = false;
        if (b(0.0f)) {
            r();
        }
        if (this.x == 1 && j()) {
            b();
        }
    }

    private Surface k() {
        WeakReference<Surface> weakReference = this.z;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        MediaPlayer mediaPlayer;
        if (this.n.a()) {
            try {
                synchronized (this.o) {
                    mediaPlayer = this.f19534c;
                }
                if (mediaPlayer != null) {
                    hw.b("MediaPlayerAgent", "in play %s", Boolean.valueOf(mediaPlayer.isPlaying()));
                    return mediaPlayer.isPlaying();
                }
            } catch (IllegalStateException unused) {
                hw.c("MediaPlayerAgent", "isPlaying IllegalStateException");
            }
        }
        return false;
    }

    private int i() {
        int i;
        synchronized (this.p) {
            i = this.l;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h() {
        MediaPlayer mediaPlayer;
        int duration;
        if (this.n.isState(MediaState.State.END)) {
            return 0;
        }
        int i = i();
        if (this.n.a() && !this.i) {
            try {
                synchronized (this.o) {
                    mediaPlayer = this.f19534c;
                }
                if (mediaPlayer != null && (duration = mediaPlayer.getDuration()) > 0) {
                    return duration;
                }
            } catch (IllegalStateException unused) {
                hw.c("MediaPlayerAgent", "getDuration IllegalStateException");
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final int i) {
        hw.b("MediaPlayerAgent", "notifyDurationReady: %d", Integer.valueOf(i));
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.30
            @Override // java.lang.Runnable
            public void run() {
                for (com.huawei.openalliance.ad.media.listener.a aVar : MediaPlayerAgent.this.J) {
                    if (aVar != null) {
                        aVar.a(i);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        hw.b("MediaPlayerAgent", "pauseInternal before State: %s - agent: %s", this.n, this);
        this.t = false;
        if (this.n.isState(MediaState.State.ERROR) || a(this.n) || b(this.n)) {
            return;
        }
        try {
            MediaPlayer mediaPlayerC = c();
            if (mediaPlayerC.isPlaying()) {
                mediaPlayerC.pause();
            }
            this.n.a(MediaState.State.PAUSED);
            f(mediaPlayerC.getCurrentPosition());
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "pause IllegalStateException");
            this.n.a(MediaState.State.ERROR);
        }
        q();
        d(this.e);
        hw.b("MediaPlayerAgent", "pause");
    }

    private void f(final int i) {
        hw.b("MediaPlayerAgent", "notifyMediaPause playTime: %d", Integer.valueOf(i));
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.26
            @Override // java.lang.Runnable
            public void run() {
                for (MediaStateListener mediaStateListener : MediaPlayerAgent.this.F) {
                    if (mediaStateListener != null) {
                        mediaStateListener.onMediaPause(MediaPlayerAgent.this, i);
                    }
                }
            }
        });
        b bVar = this.f19533b;
        if (bVar != null) {
            bVar.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        d(true);
    }

    private void e(final int i) {
        hw.b("MediaPlayerAgent", "notifyMediaStop playTime: %d", Integer.valueOf(i));
        b();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.25
            @Override // java.lang.Runnable
            public void run() {
                for (MediaStateListener mediaStateListener : MediaPlayerAgent.this.F) {
                    if (mediaStateListener != null) {
                        mediaStateListener.onMediaStop(MediaPlayerAgent.this, i);
                    }
                }
            }
        });
        b bVar = this.f19533b;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        hw.b("MediaPlayerAgent", "prepareInternal - current state: %s - agent: %s", this.n, this);
        if (this.n.isState(MediaState.State.END)) {
            return;
        }
        if (this.D && k() == null) {
            hw.b("MediaPlayerAgent", "setSurfaceFirst, current surface is null, prepare on setSurface.");
            this.E = true;
            return;
        }
        hw.b("MediaPlayerAgent", "prepareInternal - current state after set file: %s", this.n);
        if (this.n.isState(MediaState.State.INITIALIZED)) {
            this.j = true;
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (this.n.isState(MediaState.State.END) || this.n.isState(MediaState.State.ERROR) || this.n.isState(MediaState.State.IDLE)) {
            return;
        }
        if (this.n.a() || this.n.isState(MediaState.State.PREPARING)) {
            try {
                MediaPlayer mediaPlayerC = c();
                int currentPosition = mediaPlayerC.getCurrentPosition();
                if (this.n.a() && !this.i) {
                    mediaPlayerC.stop();
                }
                if (this.n.isState(MediaState.State.PLAYBACK_COMPLETED)) {
                    currentPosition = 0;
                }
                e(currentPosition);
                if (z) {
                    a(0, 0);
                }
                this.n.a(MediaState.State.INITIALIZED);
            } catch (IllegalStateException unused) {
                hw.c("MediaPlayerAgent", "stop IllegalStateException");
                this.n.a(MediaState.State.ERROR);
            }
        }
        this.k = 0;
        this.r = 0;
        q();
        d(this.e);
        hw.b("MediaPlayerAgent", "stop - agent: %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        f19532a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        hw.b("MediaPlayerAgent", "notifyMediaStart playTime: %d", Integer.valueOf(i));
        w();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.24
            @Override // java.lang.Runnable
            public void run() {
                for (MediaStateListener mediaStateListener : MediaPlayerAgent.this.F) {
                    if (mediaStateListener != null) {
                        mediaStateListener.onMediaStart(MediaPlayerAgent.this, i);
                    }
                }
            }
        });
        b bVar = this.f19533b;
        if (bVar != null) {
            bVar.a();
        }
    }

    private void d() {
        try {
            b(this.f);
            hw.b("MediaPlayerAgent", "play - current state after set file: %s", this.n);
            if (this.n.isState(MediaState.State.INITIALIZED)) {
                b(true);
            }
        } catch (c e) {
            hw.a("MediaPlayerAgent", "set media file error:%s", e.getMessage());
            hw.c("MediaPlayerAgent", "set media file error:" + e.getClass().getSimpleName());
            this.n.a(MediaState.State.ERROR);
            a(0, -1, -1);
        }
    }

    private void c(final boolean z) {
        b(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.3
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayerAgent.this.d(z);
            }
        });
    }

    private void c(String str) throws IOException, c {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MediaPlayer mediaPlayerC = c();
        if (Uri.parse(str).getScheme() != null) {
            if (str.startsWith(Scheme.FILE.toString())) {
                str = str.substring(Scheme.FILE.toString().length());
            } else if (str.startsWith(Scheme.DISKCACHE.toString())) {
                String strC = dk.a(this.C, "normal").c(str);
                if (!ai.d(new File(strC))) {
                    strC = dk.a(this.C, Constants.TPLATE_CACHE).c(str);
                }
                mediaPlayerC.setDataSource(strC);
            } else if (str.startsWith(Scheme.CONTENT.toString())) {
                if (!a(str, mediaPlayerC)) {
                    hw.c("MediaPlayerAgent", "set remote media fail");
                    throw new c();
                }
            } else if (str.startsWith(Scheme.HTTP.toString()) || str.startsWith(Scheme.HTTPS.toString())) {
                this.g = true;
            }
            mediaPlayerC.setDataSource(str);
        } else {
            mediaPlayerC.setDataSource(str);
        }
        mediaPlayerC.setVideoScalingMode(1);
        this.n.a(MediaState.State.INITIALIZED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        if (this.g) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.18
                @Override // java.lang.Runnable
                public void run() {
                    for (MediaBufferListener mediaBufferListener : MediaPlayerAgent.this.G) {
                        if (mediaBufferListener != null) {
                            mediaBufferListener.onBufferUpdate(i);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        this.u = false;
        if (b(f)) {
            s();
        }
        if (this.x == 1 && j()) {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPlayer c() {
        MediaPlayer mediaPlayer;
        synchronized (this.o) {
            if (this.f19534c == null) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.setOnCompletionListener(this.O);
                mediaPlayer2.setOnPreparedListener(this.Q);
                mediaPlayer2.setOnErrorListener(this.R);
                mediaPlayer2.setOnBufferingUpdateListener(this.S);
                mediaPlayer2.setOnVideoSizeChangedListener(this.N);
                mediaPlayer2.setLooping(false);
                mediaPlayer2.setAudioStreamType(3);
                this.f19534c = mediaPlayer2;
            }
            mediaPlayer = this.f19534c;
        }
        return mediaPlayer;
    }

    private boolean b(MediaState mediaState) {
        return mediaState.isState(MediaState.State.END) || mediaState.isState(MediaState.State.PAUSED) || mediaState.isState(MediaState.State.PLAYBACK_COMPLETED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(float f) {
        if (this.n.isState(MediaState.State.END)) {
            return false;
        }
        try {
            c().setVolume(f, f);
            return true;
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "mute IllegalStateException");
            return false;
        }
    }

    private void b(boolean z) {
        if (this.n.isState(MediaState.State.END)) {
            return;
        }
        try {
            hw.b("MediaPlayerAgent", "prepareMediaPlayer");
            this.n.a(MediaState.State.PREPARING);
            this.i = true;
            c().prepareAsync();
            if (z) {
                n();
            }
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "prepareMediaPlayer IllegalStateException");
            this.n.a(MediaState.State.ERROR);
            a(0, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) throws c {
        if (this.n.isState(MediaState.State.END)) {
            return;
        }
        hw.a("MediaPlayerAgent", "setMediaFileUrl: %s", ds.a(str));
        MediaPlayer mediaPlayerC = c();
        try {
            if (this.n.a()) {
                mediaPlayerC.stop();
            }
        } catch (IllegalStateException unused) {
            hw.c("MediaPlayerAgent", "setMediaFileUrl stop IllegalStateException");
        } catch (Throwable th) {
            hw.c("MediaPlayerAgent", "setMediaFileUrl exception: %s", th.getClass().getSimpleName());
        }
        try {
            mediaPlayerC.reset();
            this.n.a(MediaState.State.IDLE);
        } catch (Throwable th2) {
            hw.c("MediaPlayerAgent", "mediaPlayer reset exception: %s", th2.getClass().getSimpleName());
        }
        this.f = str;
        if (TextUtils.isEmpty(str)) {
            hw.c("MediaPlayerAgent", "media file url is empty");
            this.n.a(MediaState.State.ERROR);
            throw new c("media file url is empty");
        }
        try {
            c(str);
        } catch (Exception unused2) {
            hw.c("MediaPlayerAgent", "setMediaFileUrl Exception");
            this.n.a(MediaState.State.ERROR);
            throw new c("setMediaFileUrl Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Runnable runnable, String str, long j) {
        f19532a.a(runnable, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Runnable runnable) {
        f19532a.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MediaPlayer mediaPlayer, long j, int i) {
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(j, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, final int i2) {
        hw.b("MediaPlayerAgent", "notifyVideoPictureNotPlaying");
        if (i2 < -10000 || i2 == -1004) {
            int i3 = this.A;
            if (i3 < 20) {
                this.A = i3 + 1;
                c(false);
                play();
            } else {
                stop();
                this.R.onError(c(), i, i2);
            }
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.31
            @Override // java.lang.Runnable
            public void run() {
                for (com.huawei.openalliance.ad.media.listener.a aVar : MediaPlayerAgent.this.J) {
                    if (aVar != null) {
                        aVar.b(i2);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        hw.b("MediaPlayerAgent", "notifyMediaCompletion playTime: %d", Integer.valueOf(i));
        b();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.17
            @Override // java.lang.Runnable
            public void run() {
                for (MediaStateListener mediaStateListener : MediaPlayerAgent.this.F) {
                    if (mediaStateListener != null) {
                        mediaStateListener.onMediaCompletion(MediaPlayerAgent.this, i);
                    }
                }
            }
        });
        b bVar = this.f19533b;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    private boolean a(MediaState mediaState) {
        return mediaState.isState(MediaState.State.INITIALIZED) || mediaState.isState(MediaState.State.IDLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[Catch: IllegalStateException -> 0x00c1, TryCatch #0 {IllegalStateException -> 0x00c1, blocks: (B:26:0x008a, B:28:0x008f, B:32:0x00a0, B:33:0x00a3, B:37:0x00b3, B:36:0x00af, B:29:0x0094, B:31:0x009e), top: B:51:0x008a }] */
    public void a(Long l) {
        long jLongValue;
        int currentPosition;
        if (this.n.isState(MediaState.State.END)) {
            hw.b("MediaPlayerAgent", "play - current state: %s - agent: %s", this.n, this);
            return;
        }
        if (hw.a()) {
            hw.a("MediaPlayerAgent", "play file: %s", ds.a(this.f));
        }
        if (l != null) {
            this.m = l.longValue();
        }
        this.j = false;
        if (this.n.isState(MediaState.State.ERROR) || this.n.isState(MediaState.State.IDLE) || this.n.isState(MediaState.State.PLAYING)) {
            hw.b("MediaPlayerAgent", "play - current state: %s - agent: %s", this.n, this);
            if (!this.n.isState(MediaState.State.PLAYING)) {
                d();
                return;
            }
            if (l != null) {
                b(c(), l.longValue(), 3);
            }
            d(c().getCurrentPosition());
            t();
            return;
        }
        MediaPlayer mediaPlayerC = c();
        hw.b("MediaPlayerAgent", "play - state before play: %s - agent: %s", this.n, this);
        if (this.i || !(this.n.isState(MediaState.State.PAUSED) || this.n.isState(MediaState.State.PLAYBACK_COMPLETED) || this.n.isState(MediaState.State.PREPARED))) {
            d();
        } else {
            try {
                mediaPlayerC.start();
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    if (this.n.isState(MediaState.State.PREPARED)) {
                        jLongValue = this.m;
                    }
                    if (this.n.isState(MediaState.State.PLAYBACK_COMPLETED)) {
                        currentPosition = 0;
                    } else {
                        currentPosition = mediaPlayerC.getCurrentPosition();
                    }
                    this.n.a(MediaState.State.PLAYING);
                    d(currentPosition);
                    t();
                }
                b(mediaPlayerC, jLongValue, 3);
                if (this.n.isState(MediaState.State.PLAYBACK_COMPLETED)) {
                    currentPosition = 0;
                } else {
                    currentPosition = mediaPlayerC.getCurrentPosition();
                }
                this.n.a(MediaState.State.PLAYING);
                d(currentPosition);
                t();
            } catch (IllegalStateException unused) {
                hw.c("MediaPlayerAgent", "play - start IllegalStateException");
                this.n.a(MediaState.State.ERROR);
                a(mediaPlayerC.getCurrentPosition(), -100, 0);
                q();
            }
        }
        hw.b("MediaPlayerAgent", "play - current state: %s", this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface) {
        String str;
        if (this.n.isState(MediaState.State.END)) {
            return;
        }
        if (surface != null && !surface.isValid()) {
            hw.c("MediaPlayerAgent", "setSurfaceInternal - surface is invalid");
            return;
        }
        if (surface == k()) {
            hw.b("MediaPlayerAgent", "setSurfaceInternal - pass-in surface is the same as currentSurface");
            return;
        }
        this.z = new WeakReference<>(surface);
        try {
            hw.b("MediaPlayerAgent", "setSurfaceInternal, prepareOnSetSurface: %s", Boolean.valueOf(this.E));
            c().setSurface(surface);
            if (this.E) {
                this.E = false;
                e();
            }
        } catch (IllegalArgumentException unused) {
            str = "setSurface IllegalArgumentException";
            hw.c("MediaPlayerAgent", str);
        } catch (IllegalStateException unused2) {
            str = "setSurface IllegalStateException";
            hw.c("MediaPlayerAgent", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaPlayer mediaPlayer, int i, int i2) {
        Iterator<MediaPlayer.OnVideoSizeChangedListener> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(mediaPlayer, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i2, final int i3) {
        hw.b("MediaPlayerAgent", "notifyError playTime: %d", Integer.valueOf(i));
        b();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.27
            @Override // java.lang.Runnable
            public void run() {
                for (MediaErrorListener mediaErrorListener : MediaPlayerAgent.this.H) {
                    if (mediaErrorListener != null) {
                        mediaErrorListener.onError(MediaPlayerAgent.this, i, i2, i3);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i2) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.MediaPlayerAgent.16
            @Override // java.lang.Runnable
            public void run() {
                for (MediaStateListener mediaStateListener : MediaPlayerAgent.this.F) {
                    if (mediaStateListener != null) {
                        mediaStateListener.onProgress(i, i2);
                    }
                }
            }
        });
    }

    public MediaPlayerAgent(Context context) {
        this.D = false;
        Context applicationContext = context.getApplicationContext();
        this.C = applicationContext;
        this.D = HiAd.a(applicationContext).n();
        this.s = (AudioManager) context.getSystemService("audio");
        this.e = "progress_task" + hashCode();
        f19532a.a();
    }
}
