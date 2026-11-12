package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.constant.MzImpCannotReportInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.views.VideoView;
import com.huawei.operation.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class jz implements jx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<View> f19423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaStateListener f19424c;
    private final List<String> d;
    private final List<String> e;
    private final pc g;
    private final ContentRecord h;
    private int k;
    private long l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long q;
    private jp r;
    private VideoView s;
    private boolean t;
    private String u;
    private long v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean[] f19422a = new boolean[5];
    private final jt f = jt.a();
    private int i = 0;
    private boolean j = false;

    public void e() {
        try {
            int iL = l();
            MzImpCannotReportInfo mzImpCannotReportInfo = new MzImpCannotReportInfo();
            mzImpCannotReportInfo.setReason(Integer.valueOf(iL));
            mzImpCannotReportInfo.setMinShowRatio(Integer.valueOf(this.k));
            mzImpCannotReportInfo.setMinShowTime(Long.valueOf(this.l));
            mzImpCannotReportInfo.setPercent(Integer.valueOf(this.n));
            mzImpCannotReportInfo.setMaxShowAreaPer(Integer.valueOf(this.m));
            mzImpCannotReportInfo.setDuration(Long.valueOf(this.o));
            mzImpCannotReportInfo.setPlayPercentage(Integer.valueOf(this.p));
            mzImpCannotReportInfo.setExposeType(Integer.valueOf(this.i));
            new com.huawei.openalliance.ad.analysis.c(this.f19423b.get().getContext().getApplicationContext()).a(this.h, mzImpCannotReportInfo);
        } catch (Exception e) {
            hw.d("VideoMzMonitor", "reportImpCannotReport error: %s", e.getClass().getSimpleName());
        }
    }

    public void d() {
        hw.b(r(), "hasShowStart %s", Boolean.valueOf(this.j));
        this.q = com.huawei.openalliance.ad.utils.as.c();
        if (h()) {
            a(this.f19423b.get().getContext(), g());
        }
        if (this.j) {
            k();
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void c() {
        jp jpVar = this.r;
        if (jpVar != null) {
            jpVar.j();
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void b() {
        this.f.a(this.d);
        this.f.a(this.e);
        jp jpVar = this.r;
        if (jpVar != null) {
            jpVar.i();
            this.r = null;
        }
        VideoView videoView = this.s;
        if (videoView != null) {
            videoView.removeMediaStateListener(this.f19424c);
            this.s = null;
            this.f19424c = null;
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(boolean z) {
        this.t = z;
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(String str, long j) {
        this.u = str;
        this.v = j;
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(VideoView videoView) {
        if (videoView == null) {
            hw.c(r(), "video view is null.");
            return;
        }
        hw.b(r(), "set video view");
        this.s = videoView;
        MediaStateListener mediaStateListener = new MediaStateListener() { // from class: com.huawei.openalliance.ad.jz.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i, int i2) {
                jz.this.a(i, i2);
                jz.this.o = i2;
                jz.this.p = i;
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
                jz.this.d();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
                jz.this.p = 100;
            }
        };
        this.f19424c = mediaStateListener;
        this.s.addMediaStateListener(mediaStateListener);
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(View view) {
        hw.b(r(), "setContainerView, view is %s", view.getClass().getSimpleName());
        this.f19423b = new WeakReference<>(view);
        if (view instanceof VideoView) {
            a((VideoView) view);
        }
        this.r = new jp(this.f19423b.get()) { // from class: com.huawei.openalliance.ad.jz.3
            @Override // com.huawei.openalliance.ad.jp
            protected void a(long j, int i) {
                super.a(j, i);
                hw.b(jz.this.r(), "onViewShowEnd, %s, %s", Long.valueOf(j), Integer.valueOf(i));
                if (i > jz.this.m) {
                    jz.this.m = i;
                }
                jz jzVar = jz.this;
                jzVar.a(j, jzVar.m);
                if (jz.this.f19422a[1] || jz.this.t) {
                    return;
                }
                jz.this.e();
            }

            @Override // com.huawei.openalliance.ad.jp
            protected void a(int i) {
                super.a(i);
                hw.a(jz.this.r(), "onUpdateViewShowArea, per %s", Integer.valueOf(i));
                if (i > jz.this.m) {
                    jz.this.m = i;
                }
            }

            @Override // com.huawei.openalliance.ad.jp
            protected void a() {
                super.a();
                hw.b(jz.this.r(), "onViewShowStart.");
                jz.this.j = true;
            }
        };
        this.f19423b.get().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.openalliance.ad.jz.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                hw.b(jz.this.r(), "onViewDetachedFromWindow, viewMonitor is %s", jz.this.r == null ? Constants.NULL : "not null");
                if (jz.this.r != null) {
                    jz.this.r.i();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                hw.b(jz.this.r(), "onViewAttachedToWindow, viewMonitor is %s", jz.this.r == null ? Constants.NULL : "not null");
                if (jz.this.r != null) {
                    jz.this.r.h();
                }
            }
        });
        hw.a(r(), "viewMonitor is %s", this.r == null ? Constants.NULL : "not null");
        jp jpVar = this.r;
        if (jpVar != null) {
            jpVar.h();
        }
    }

    public void a(int i, int i2) {
        hw.a(r(), "doOnProgress, maxShowArea %s, percentage %s, playTime is %s", Integer.valueOf(this.m), Integer.valueOf(i), Integer.valueOf(i2));
        this.o = i2;
        this.p = i;
        if (this.m >= this.k) {
            int i3 = this.i;
            if ((i3 == 2 || i2 <= this.l) && (i3 != 2 || i < this.n)) {
                return;
            }
            i();
            a(i2, this.m, -1);
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a() {
        i();
        j();
        a(this.o, this.m, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String r() {
        return "VideoMzMonitor_" + hashCode();
    }

    private View q() {
        WeakReference<View> weakReference = this.f19423b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private String p() {
        if (q() instanceof js) {
            return com.huawei.openalliance.ad.utils.dk.a((js) q());
        }
        hw.c(r(), "getSlotPosition failed, view is not IView");
        return "";
    }

    private boolean o() {
        return this.i == 2 && this.p < this.n;
    }

    private boolean n() {
        return this.i != 2 && ((long) this.o) <= this.l;
    }

    private boolean m() {
        return this.m < this.k;
    }

    private int l() {
        if (m() && n()) {
            return 3;
        }
        if (m() && o()) {
            return 5;
        }
        if (m()) {
            return 2;
        }
        if (n()) {
            return 1;
        }
        return o() ? 4 : 0;
    }

    private void k() {
        if (this.f19422a[0]) {
            hw.a(r(), "hasReport showStart");
            return;
        }
        this.h.h(this.q);
        this.h.c(String.valueOf(this.q));
        this.g.a(this.h);
        hw.b(r(), "callHwShowStart");
        pc pcVar = this.g;
        if (pcVar != null) {
            pcVar.b();
            this.f19422a[0] = true;
        }
    }

    private void j() {
        hw.b(r(), "callMzClick");
        this.f.a(this.e, this.h);
    }

    private void i() {
        if (this.f19422a[3] || this.t) {
            hw.a(r(), "has reported mz imp");
            return;
        }
        hw.b(r(), "callMzOnImp");
        this.f.a(1, this.d, q(), this.h);
        this.f.a(this.u, this.v);
        this.f19422a[3] = true;
    }

    private boolean h() {
        ContentRecord contentRecord = this.h;
        return com.huawei.openalliance.ad.utils.c.a(contentRecord == null ? null : contentRecord.bc());
    }

    private String g() {
        return com.huawei.openalliance.ad.utils.as.b("yyyyMMdd") + com.huawei.openalliance.ad.constant.Constants.LINK + this.h.o() + com.huawei.openalliance.ad.constant.Constants.LINK + this.h.p();
    }

    private void f() {
        ContentRecord contentRecord = this.h;
        if (contentRecord == null) {
            this.k = 50;
            this.l = 2000L;
            this.n = 50;
            return;
        }
        this.i = contentRecord.m();
        this.k = this.h.d();
        this.l = this.h.c();
        this.n = this.h.e();
        hw.b(r(), "exposeType %s, showRatio %s, showTime %s, percentage %s.", Integer.valueOf(this.i), Integer.valueOf(this.k), Long.valueOf(this.l), Integer.valueOf(this.n));
        if (this.k == 0) {
            this.k = 50;
        }
        if (this.l == 0) {
            this.l = 2000L;
        }
        if (this.n == 0) {
            this.n = 50;
        }
        if (this.k > 100) {
            this.k = 100;
        }
    }

    private void a(final Context context, final String str) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jz.2
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context).b(str, "task support mz but has impSmartCtrl", jz.this.h);
            }
        });
    }

    private void a(long j, int i, int i2) {
        if (this.f19422a[1] || this.t) {
            hw.a(r(), "hasReport Imp");
            return;
        }
        hw.b(r(), "callHwShow, %s, %s", Long.valueOf(j), Integer.valueOf(i));
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229aE = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a().a(Integer.valueOf(i)).a(Long.valueOf(j)).a(com.huawei.openalliance.ad.utils.b.a(q())).d(p()).e(vv.b(q()));
        if (i2 != -1) {
            c0229aE.b(Integer.valueOf(i2));
        }
        pc pcVar = this.g;
        if (pcVar != null) {
            pcVar.a(c0229aE.a());
            this.f19422a[1] = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, int i) {
        if (this.f19422a[2]) {
            hw.a(r(), "hasReport phyShow");
            return;
        }
        hw.b(r(), "callHwPhyShow, %s, %s", Long.valueOf(j), Integer.valueOf(i));
        if (this.g != null) {
            pb pbVar = new pb();
            pbVar.a(Integer.valueOf(this.p));
            pbVar.b(Integer.valueOf(this.o));
            this.g.a(j, i, pbVar);
            this.f19422a[2] = true;
        }
    }

    public jz(List<String> list, List<String> list2, pc pcVar, ContentRecord contentRecord) {
        this.d = list;
        this.e = list2;
        this.g = pcVar;
        this.h = contentRecord;
        f();
    }
}
