package com.huawei.openalliance.ad.media;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.ds;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes12.dex */
public class a implements IMultiMediaPlayingManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f19605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19606b = new byte[0];
    private MediaPlayerAgent d;
    private Context f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f19607c = new byte[0];
    private Queue<C0222a> e = new ConcurrentLinkedQueue();
    private MediaStateListener g = new MediaStateListener() { // from class: com.huawei.openalliance.ad.media.a.1
        @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
        public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
        }

        @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
        public void onProgress(int i, int i2) {
        }

        @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
        public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "onMediaStop: %s", mediaPlayerAgent);
            }
            a();
        }

        @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
        public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "onMediaPause: %s", mediaPlayerAgent);
            }
            a();
        }

        @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
        public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "onMediaCompletion: %s", mediaPlayerAgent);
            }
            a.this.a();
        }

        private void a() {
            synchronized (a.this.f19607c) {
                if (hw.a()) {
                    hw.a("MultiMediaPlayingManager", "checkAndPlayNext current player: %s", a.this.d);
                }
                if (a.this.d == null) {
                    a.this.a();
                }
            }
        }
    };
    private MediaErrorListener h = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.media.a.2
        @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
        public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "onError: %s", mediaPlayerAgent);
            }
            synchronized (a.this.f19607c) {
                mediaPlayerAgent.removeMediaErrorListener(this);
            }
            a.this.a();
        }
    };

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public void stop(String str, MediaPlayerAgent mediaPlayerAgent) {
        if (TextUtils.isEmpty(str) || mediaPlayerAgent == null) {
            return;
        }
        synchronized (this.f19607c) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "stop - url: %s player: %s  currentPlayer: %s", ds.a(str), mediaPlayerAgent, this.d);
            }
            if (mediaPlayerAgent == this.d) {
                hw.b("MultiMediaPlayingManager", "stop current");
                this.d = null;
                mediaPlayerAgent.stopWhenUrlMatchs(str);
            } else {
                hw.b("MultiMediaPlayingManager", "stop - remove from queue");
                this.e.remove(new C0222a(str, mediaPlayerAgent));
                removeListenersForMediaPlayerAgent(mediaPlayerAgent);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public void removeMediaPlayerAgent(MediaPlayerAgent mediaPlayerAgent) {
        if (mediaPlayerAgent == null) {
            return;
        }
        synchronized (this.f19607c) {
            MediaPlayerAgent mediaPlayerAgent2 = this.d;
            if (mediaPlayerAgent == mediaPlayerAgent2) {
                removeListenersForMediaPlayerAgent(mediaPlayerAgent2);
                this.d = null;
            }
            Iterator<C0222a> it = this.e.iterator();
            while (it.hasNext()) {
                C0222a next = it.next();
                if (next.f19611b == mediaPlayerAgent) {
                    removeListenersForMediaPlayerAgent(next.f19611b);
                    it.remove();
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public void removeListenersForMediaPlayerAgent(MediaPlayerAgent mediaPlayerAgent) {
        synchronized (this.f19607c) {
            if (mediaPlayerAgent != null) {
                mediaPlayerAgent.removeMediaStateListener(this.g);
                mediaPlayerAgent.removeMediaErrorListener(this.h);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public void pause(String str, MediaPlayerAgent mediaPlayerAgent) {
        if (TextUtils.isEmpty(str) || mediaPlayerAgent == null) {
            return;
        }
        synchronized (this.f19607c) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "pause - url: %s player: %s  currentPlayer: %s", ds.a(str), mediaPlayerAgent, this.d);
            }
            if (mediaPlayerAgent == this.d) {
                hw.b("MultiMediaPlayingManager", "pause current");
                mediaPlayerAgent.pauseWhenUrlMatchs(str);
            } else {
                hw.b("MultiMediaPlayingManager", "pause - remove from queue");
                this.e.remove(new C0222a(str, mediaPlayerAgent));
                removeListenersForMediaPlayerAgent(mediaPlayerAgent);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public void manualPlay(String str, MediaPlayerAgent mediaPlayerAgent) {
        if (TextUtils.isEmpty(str) || mediaPlayerAgent == null) {
            return;
        }
        synchronized (this.f19607c) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "manualPlay - url: %s player: %s  currentPlayer: %s", ds.a(str), mediaPlayerAgent, this.d);
            }
            MediaPlayerAgent mediaPlayerAgent2 = this.d;
            if (mediaPlayerAgent2 != null && mediaPlayerAgent != mediaPlayerAgent2) {
                mediaPlayerAgent2.stop();
                hw.b("MultiMediaPlayingManager", "manualPlay - stop other");
            }
            hw.b("MultiMediaPlayingManager", "manualPlay - play new");
            mediaPlayerAgent.addMediaStateListener(this.g);
            mediaPlayerAgent.addMediaErrorListener(this.h);
            mediaPlayerAgent.playWhenUrlMatchs(str);
            this.d = mediaPlayerAgent;
            this.e.remove(new C0222a(str, mediaPlayerAgent));
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public void autoPlay(String str, MediaPlayerAgent mediaPlayerAgent) {
        String str2;
        if (TextUtils.isEmpty(str) || mediaPlayerAgent == null) {
            return;
        }
        synchronized (this.f19607c) {
            if (hw.a()) {
                hw.a("MultiMediaPlayingManager", "autoPlay - url: %s player: %s currentPlayer: %s", ds.a(str), mediaPlayerAgent, this.d);
            }
            MediaPlayerAgent mediaPlayerAgent2 = this.d;
            if (mediaPlayerAgent == mediaPlayerAgent2 || mediaPlayerAgent2 == null) {
                mediaPlayerAgent.addMediaStateListener(this.g);
                mediaPlayerAgent.addMediaErrorListener(this.h);
                mediaPlayerAgent.playWhenUrlMatchs(str);
                this.d = mediaPlayerAgent;
                str2 = "autoPlay - play directly";
            } else {
                C0222a c0222a = new C0222a(str, mediaPlayerAgent);
                this.e.remove(c0222a);
                this.e.add(c0222a);
                str2 = "autoPlay - add to queue";
            }
            hw.b("MultiMediaPlayingManager", str2);
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.media.a$a, reason: collision with other inner class name */
    static class C0222a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f19610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MediaPlayerAgent f19611b;

        public String toString() {
            return "Task [" + ds.a(this.f19610a) + "]";
        }

        public int hashCode() {
            String str = this.f19610a;
            int iHashCode = str != null ? str.hashCode() : -1;
            MediaPlayerAgent mediaPlayerAgent = this.f19611b;
            return iHashCode & super.hashCode() & (mediaPlayerAgent != null ? mediaPlayerAgent.hashCode() : -1);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0222a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0222a c0222a = (C0222a) obj;
            return TextUtils.equals(this.f19610a, c0222a.f19610a) && this.f19611b == c0222a.f19611b;
        }

        C0222a(String str, MediaPlayerAgent mediaPlayerAgent) {
            this.f19610a = str;
            this.f19611b = mediaPlayerAgent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (cb.c(this.f)) {
            synchronized (this.f19607c) {
                C0222a c0222aPoll = this.e.poll();
                if (hw.a()) {
                    hw.a("MultiMediaPlayingManager", "playNextTask - task: %s currentPlayer: %s", c0222aPoll, this.d);
                }
                if (c0222aPoll != null) {
                    if (hw.a()) {
                        hw.a("MultiMediaPlayingManager", "playNextTask - play: %s", c0222aPoll.f19611b);
                    }
                    c0222aPoll.f19611b.addMediaStateListener(this.g);
                    c0222aPoll.f19611b.addMediaErrorListener(this.h);
                    c0222aPoll.f19611b.playWhenUrlMatchs(c0222aPoll.f19610a);
                    this.d = c0222aPoll.f19611b;
                } else {
                    this.d = null;
                }
            }
        }
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f19606b) {
            if (f19605a == null) {
                f19605a = new a(context);
            }
            aVar = f19605a;
        }
        return aVar;
    }

    private a(Context context) {
        this.f = context.getApplicationContext();
    }
}
