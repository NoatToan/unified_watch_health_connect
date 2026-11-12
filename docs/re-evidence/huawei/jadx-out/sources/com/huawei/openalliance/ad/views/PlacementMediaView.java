package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaPlayerReleaseListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PlacementMediaView extends AutoScaleSizeRelativeLayout implements lu, IViewLifeCycle, com.huawei.openalliance.ad.views.interfaces.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.huawei.openalliance.ad.inter.data.h f21069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f21070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f21071c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    private PlacementMediaFile g;
    private final Set<SegmentMediaStateListener> h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    private Handler p;

    abstract void a();

    abstract void a(int i);

    public void a(long j) {
    }

    public void a(MediaBufferListener mediaBufferListener) {
    }

    public void a(MediaErrorListener mediaErrorListener) {
    }

    abstract void a(MediaPlayerReleaseListener mediaPlayerReleaseListener);

    public void a(MuteListener muteListener) {
    }

    public void a(PPSVideoRenderListener pPSVideoRenderListener) {
    }

    public void a(SegmentMediaStateListener segmentMediaStateListener) {
    }

    public void a(String str) {
    }

    abstract void b();

    public void b(int i) {
    }

    public void b(long j) {
    }

    public void b(MediaBufferListener mediaBufferListener) {
    }

    public void b(MediaErrorListener mediaErrorListener) {
    }

    public void b(MuteListener muteListener) {
    }

    public void c() {
    }

    public void c(int i) {
    }

    public void d() {
    }

    protected void d(int i) {
    }

    public void e() {
    }

    public void g() {
    }

    abstract ImageView getLastFrame();

    abstract MediaState getMediaState();

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    public boolean i() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
    }

    public void setAudioFocusType(int i) {
    }

    abstract void setMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener);

    public void setSoundVolume(float f) {
    }

    public void setPlacementAd(IPlacementAd iPlacementAd) {
        String contentId;
        j();
        if (iPlacementAd instanceof com.huawei.openalliance.ad.inter.data.h) {
            com.huawei.openalliance.ad.inter.data.h hVar = (com.huawei.openalliance.ad.inter.data.h) iPlacementAd;
            this.f21069a = hVar;
            PlacementMediaFile mediaFile = hVar.getMediaFile();
            this.g = mediaFile;
            this.k = mediaFile.getDuration();
            this.f21070b = this.g.getUrl();
            contentId = iPlacementAd.getContentId();
        } else {
            this.f21069a = null;
            this.g = null;
            this.p.removeMessages(1);
            contentId = "";
            this.f21070b = "";
        }
        this.f21071c = contentId;
    }

    protected void h() {
        this.n = false;
        this.o = true;
        Iterator<SegmentMediaStateListener> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaError(this.f21071c, this.f21070b, 0, -1, -1);
        }
    }

    public IPlacementAd getPlacementAd() {
        return this.f21069a;
    }

    public long getDuration() {
        PlacementMediaFile mediaFile;
        com.huawei.openalliance.ad.inter.data.h hVar = this.f21069a;
        if (hVar == null || (mediaFile = hVar.getMediaFile()) == null) {
            return 0L;
        }
        return mediaFile.getDuration();
    }

    public void f() {
        this.p.removeMessages(1);
        this.l = as.c();
        m();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        this.p.removeMessages(1);
        this.h.clear();
        a();
    }

    public void b(SegmentMediaStateListener segmentMediaStateListener) {
        if (segmentMediaStateListener != null) {
            this.h.add(segmentMediaStateListener);
        }
    }

    public void a(boolean z, boolean z2) {
        hw.b("PlacementMediaView", "play, mediaCached: %s, mediaAvalible: %s", Boolean.valueOf(this.d), Boolean.valueOf(this.e));
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PlacementMediaView.2
            @Override // java.lang.Runnable
            public void run() {
                if (!PlacementMediaView.this.d) {
                    PlacementMediaView.this.f = true;
                    return;
                }
                if (!PlacementMediaView.this.e) {
                    PlacementMediaView.this.h();
                    return;
                }
                PlacementMediaView.this.p.removeMessages(1);
                PlacementMediaView.this.p.sendEmptyMessage(1);
                PlacementMediaView.this.k();
                if (0 == PlacementMediaView.this.j) {
                    PlacementMediaView.this.j = as.c();
                }
                if (PlacementMediaView.this.l != 0) {
                    PlacementMediaView.b(PlacementMediaView.this, as.c() - PlacementMediaView.this.l);
                }
            }
        }, 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        return ((long) this.i) >= this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.n = false;
        Iterator<SegmentMediaStateListener> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaCompletion(this.f21071c, this.f21070b, this.i);
        }
    }

    private void m() {
        Iterator<SegmentMediaStateListener> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaPause(this.f21071c, this.f21070b, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.k <= 0 || this.o) {
            return;
        }
        for (SegmentMediaStateListener segmentMediaStateListener : this.h) {
            String str = this.f21071c;
            String str2 = this.f21070b;
            int i = this.i;
            segmentMediaStateListener.onSegmentProgress(str, str2, (int) (((long) i) / this.k), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.n) {
            return;
        }
        this.n = true;
        Iterator<SegmentMediaStateListener> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaStart(this.f21071c, this.f21070b, this.i);
        }
    }

    private void j() {
        this.i = 0;
        this.j = 0L;
        this.l = 0L;
        this.k = 0L;
        this.m = 0L;
        this.n = false;
        this.o = false;
        this.e = false;
        this.d = false;
        this.f = false;
    }

    static /* synthetic */ long b(PlacementMediaView placementMediaView, long j) {
        long j2 = placementMediaView.m + j;
        placementMediaView.m = j2;
        return j2;
    }

    public PlacementMediaView(Context context) {
        super(context);
        this.h = new CopyOnWriteArraySet();
        this.i = 0;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.n = false;
        this.o = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.p = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.PlacementMediaView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String str;
                try {
                    if (1 == message.what) {
                        PlacementMediaView.this.i = (int) ((as.c() - PlacementMediaView.this.j) - PlacementMediaView.this.m);
                        if (!PlacementMediaView.this.o()) {
                            PlacementMediaView.this.l();
                            PlacementMediaView.this.p.removeMessages(1);
                            PlacementMediaView.this.p.sendEmptyMessageDelayed(1, 100L);
                            return;
                        }
                        PlacementMediaView.this.n();
                    }
                } catch (IllegalStateException unused) {
                    str = "handleMessage IllegalStateException";
                    hw.c("PlacementMediaView", str);
                } catch (Throwable th) {
                    str = "handleMessage " + th.getClass().getSimpleName();
                    hw.c("PlacementMediaView", str);
                }
            }
        };
    }
}
