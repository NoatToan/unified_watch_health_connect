package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;

/* JADX INFO: loaded from: classes12.dex */
public class bv extends MediaPlayerAgent implements MediaErrorListener, MediaStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.hms.ads.uiengine.a f18295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaStateListener f18296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaErrorListener f18297c;

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void stopWhenUrlMatchs(String str) {
        try {
            this.f18295a.b(str);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "stopWhenUrlMatchs err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void stop() {
        try {
            this.f18295a.b();
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "stop err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void removeMediaStateListener(MediaStateListener mediaStateListener) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.f18295a.c(bundle);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "removeMediaErrorListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void removeMediaErrorListener(MediaErrorListener mediaErrorListener) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.f18295a.d(bundle);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "removeMediaErrorListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void playWhenUrlMatchs(String str) {
        try {
            this.f18295a.a(str);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "playWhenUrlMatchs err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void pauseWhenUrlMatchs(String str) {
        try {
            this.f18295a.c(str);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "pauseWhenUrlMatchs er: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onProgress(int i, int i2) {
        MediaStateListener mediaStateListener = this.f18296b;
        if (mediaStateListener != null) {
            mediaStateListener.onProgress(i, i2);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
        MediaStateListener mediaStateListener = this.f18296b;
        if (mediaStateListener != null) {
            mediaStateListener.onMediaStop(this, i);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
        MediaStateListener mediaStateListener = this.f18296b;
        if (mediaStateListener != null) {
            mediaStateListener.onMediaStart(this, i);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
        MediaStateListener mediaStateListener = this.f18296b;
        if (mediaStateListener != null) {
            mediaStateListener.onMediaPause(this, i);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
        MediaStateListener mediaStateListener = this.f18296b;
        if (mediaStateListener != null) {
            mediaStateListener.onMediaCompletion(this, i);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
    public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
        MediaErrorListener mediaErrorListener = this.f18297c;
        if (mediaErrorListener != null) {
            mediaErrorListener.onError(this, i, i2, i3);
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void addMediaStateListener(MediaStateListener mediaStateListener) {
        this.f18296b = mediaStateListener;
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.f18295a.a(bundle);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "addMediaStateListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.media.MediaPlayerAgent
    public void addMediaErrorListener(MediaErrorListener mediaErrorListener) {
        this.f18297c = mediaErrorListener;
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.f18295a.b(bundle);
        } catch (Throwable th) {
            hw.b("MediaPlayerAgentProxy", "addMediaErrorListener err: %s", th.getClass().getSimpleName());
        }
    }

    public bv(Context context, com.huawei.hms.ads.uiengine.a aVar) {
        super(context);
        this.f18295a = aVar;
    }
}
