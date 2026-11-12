package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public abstract class RewardMediaView extends AutoScaleSizeRelativeLayout implements IViewLifeCycle, com.huawei.openalliance.ad.views.interfaces.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.huawei.openalliance.ad.inter.data.i f21080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f21081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f21082c;
    protected boolean d;
    private VideoInfo e;
    private final Set<SegmentMediaStateListener> f;
    private int g;
    private long h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;
    private long m;
    private Handler n;

    public void a(long j) {
    }

    public void a(String str) {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void setRewardAd(IRewardAd iRewardAd) {
        String videoDownloadUrl;
        f();
        if (iRewardAd instanceof com.huawei.openalliance.ad.inter.data.i) {
            com.huawei.openalliance.ad.inter.data.i iVar = (com.huawei.openalliance.ad.inter.data.i) iRewardAd;
            this.f21080a = iVar;
            VideoInfo videoInfoP = iVar.P();
            this.e = videoInfoP;
            this.m = videoInfoP.getVideoDuration();
            videoDownloadUrl = this.e.getVideoDownloadUrl();
        } else {
            this.f21080a = null;
            this.e = null;
            this.n.removeMessages(1);
            videoDownloadUrl = "";
        }
        this.f21081b = videoDownloadUrl;
    }

    public IRewardAd getRewardAd() {
        return this.f21080a;
    }

    protected void e() {
        this.k = false;
        this.l = true;
        Iterator<SegmentMediaStateListener> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaError(this.f21080a.getContentId(), this.f21081b, 0, -1, -1);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        this.n.removeMessages(1);
        this.f.clear();
    }

    public void a(boolean z, boolean z2) {
        if (this.f21082c) {
            if (!this.d) {
                e();
                return;
            }
            this.n.removeMessages(1);
            this.n.sendEmptyMessage(1);
            g();
            if (0 == this.h) {
                this.h = as.c();
            }
            if (this.i != 0) {
                this.j += as.c() - this.i;
            }
        }
    }

    public void a(SegmentMediaStateListener segmentMediaStateListener) {
        if (segmentMediaStateListener != null) {
            this.f.add(segmentMediaStateListener);
        }
    }

    public void a() {
        this.n.removeMessages(1);
        this.i = as.c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return ((long) this.g) >= this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.k = false;
        Iterator<SegmentMediaStateListener> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaCompletion(this.f21080a.getContentId(), this.f21081b, this.g);
        }
    }

    private void i() {
        Iterator<SegmentMediaStateListener> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaPause(this.f21080a.getContentId(), this.f21081b, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.m <= 0 || this.l) {
            return;
        }
        for (SegmentMediaStateListener segmentMediaStateListener : this.f) {
            String contentId = this.f21080a.getContentId();
            String str = this.f21081b;
            int i = this.g;
            segmentMediaStateListener.onSegmentProgress(contentId, str, (int) (((long) i) / this.m), i);
        }
    }

    private void g() {
        if (this.k) {
            return;
        }
        this.k = true;
        Iterator<SegmentMediaStateListener> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().onSegmentMediaStart(this.f21080a.getContentId(), this.f21081b, this.g);
        }
    }

    private void f() {
        this.m = 0L;
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
        this.l = false;
        this.d = false;
        this.f21082c = false;
    }

    public RewardMediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = new CopyOnWriteArraySet();
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
        this.k = false;
        this.l = false;
        this.f21082c = false;
        this.d = false;
        this.m = 0L;
        this.n = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.RewardMediaView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String str;
                try {
                    if (1 == message.what) {
                        RewardMediaView.this.g = (int) ((as.c() - RewardMediaView.this.h) - RewardMediaView.this.j);
                        if (!RewardMediaView.this.k()) {
                            RewardMediaView.this.h();
                            RewardMediaView.this.n.removeMessages(1);
                            RewardMediaView.this.n.sendEmptyMessageDelayed(1, 100L);
                            return;
                        }
                        RewardMediaView.this.j();
                    }
                } catch (IllegalStateException unused) {
                    str = "handleMessage IllegalStateException";
                    hw.c("RewardMediaView", str);
                } catch (Throwable th) {
                    str = "handleMessage " + th.getClass().getSimpleName();
                    hw.c("RewardMediaView", str);
                }
            }
        };
    }

    public RewardMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new CopyOnWriteArraySet();
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
        this.k = false;
        this.l = false;
        this.f21082c = false;
        this.d = false;
        this.m = 0L;
        this.n = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.RewardMediaView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String str;
                try {
                    if (1 == message.what) {
                        RewardMediaView.this.g = (int) ((as.c() - RewardMediaView.this.h) - RewardMediaView.this.j);
                        if (!RewardMediaView.this.k()) {
                            RewardMediaView.this.h();
                            RewardMediaView.this.n.removeMessages(1);
                            RewardMediaView.this.n.sendEmptyMessageDelayed(1, 100L);
                            return;
                        }
                        RewardMediaView.this.j();
                    }
                } catch (IllegalStateException unused) {
                    str = "handleMessage IllegalStateException";
                    hw.c("RewardMediaView", str);
                } catch (Throwable th) {
                    str = "handleMessage " + th.getClass().getSimpleName();
                    hw.c("RewardMediaView", str);
                }
            }
        };
    }

    public RewardMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new CopyOnWriteArraySet();
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
        this.k = false;
        this.l = false;
        this.f21082c = false;
        this.d = false;
        this.m = 0L;
        this.n = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.RewardMediaView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String str;
                try {
                    if (1 == message.what) {
                        RewardMediaView.this.g = (int) ((as.c() - RewardMediaView.this.h) - RewardMediaView.this.j);
                        if (!RewardMediaView.this.k()) {
                            RewardMediaView.this.h();
                            RewardMediaView.this.n.removeMessages(1);
                            RewardMediaView.this.n.sendEmptyMessageDelayed(1, 100L);
                            return;
                        }
                        RewardMediaView.this.j();
                    }
                } catch (IllegalStateException unused) {
                    str = "handleMessage IllegalStateException";
                    hw.c("RewardMediaView", str);
                } catch (Throwable th) {
                    str = "handleMessage " + th.getClass().getSimpleName();
                    hw.c("RewardMediaView", str);
                }
            }
        };
    }

    public RewardMediaView(Context context) {
        super(context);
        this.f = new CopyOnWriteArraySet();
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
        this.k = false;
        this.l = false;
        this.f21082c = false;
        this.d = false;
        this.m = 0L;
        this.n = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.RewardMediaView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String str;
                try {
                    if (1 == message.what) {
                        RewardMediaView.this.g = (int) ((as.c() - RewardMediaView.this.h) - RewardMediaView.this.j);
                        if (!RewardMediaView.this.k()) {
                            RewardMediaView.this.h();
                            RewardMediaView.this.n.removeMessages(1);
                            RewardMediaView.this.n.sendEmptyMessageDelayed(1, 100L);
                            return;
                        }
                        RewardMediaView.this.j();
                    }
                } catch (IllegalStateException unused) {
                    str = "handleMessage IllegalStateException";
                    hw.c("RewardMediaView", str);
                } catch (Throwable th) {
                    str = "handleMessage " + th.getClass().getSimpleName();
                    hw.c("RewardMediaView", str);
                }
            }
        };
    }
}
