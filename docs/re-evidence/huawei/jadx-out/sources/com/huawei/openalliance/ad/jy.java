package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MzImpCannotReportInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.views.VideoView;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class jy implements jx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<View> f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f19414c;
    private final List<String> d;
    private final pc f;
    private final ContentRecord g;
    private int h;
    private long i;
    private long j;
    private long k;
    private int l;
    private jp o;
    private boolean p;
    private String q;
    private long r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean[] f19412a = new boolean[5];
    private final jt e = jt.a();
    private final String m = Constants.IMP_EVENT_MONITOR_ID + hashCode();
    private boolean n = false;

    @Override // com.huawei.openalliance.ad.jx
    public void a(VideoView videoView) {
    }

    @Override // com.huawei.openalliance.ad.jx
    public void c() {
        jp jpVar = this.o;
        if (jpVar != null) {
            jpVar.j();
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void b() {
        this.e.a(this.f19414c);
        this.e.a(this.d);
        jp jpVar = this.o;
        if (jpVar != null) {
            jpVar.i();
            this.o = null;
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(boolean z) {
        this.p = z;
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(String str, long j) {
        this.q = str;
        this.r = j;
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a(final View view) {
        hw.b(n(), "setContainerView, view is %s", view.getClass().getSimpleName());
        this.f19413b = new WeakReference<>(view);
        this.o = new jp(this.f19413b.get()) { // from class: com.huawei.openalliance.ad.jy.1
            @Override // com.huawei.openalliance.ad.jp
            protected void a(long j, int i) {
                super.a(j, i);
                hw.b(jy.this.n(), "onViewShowEnd, %s, %s", Long.valueOf(j), Integer.valueOf(i));
                com.huawei.openalliance.ad.utils.dq.a(jy.this.m);
                jy.this.b(j, i);
                if (j <= jy.this.i || i < jy.this.h) {
                    if (jy.this.f19412a[1] || jy.this.p) {
                        return;
                    }
                    jy.this.a(j, i);
                    return;
                }
                jy.this.a(j, i, -1);
            }

            @Override // com.huawei.openalliance.ad.jp
            protected void a(int i) {
                super.a(i);
                hw.a(jy.this.n(), "onUpdateViewShowArea, %s", Integer.valueOf(i));
                if (i > jy.this.l) {
                    jy.this.l = i;
                }
                if (i < jy.this.h) {
                    jy.this.g();
                } else {
                    jy.this.f();
                }
            }

            @Override // com.huawei.openalliance.ad.jp
            protected void a() {
                super.a();
                hw.b(jy.this.n(), "onViewShowStart");
                if (jy.this.k()) {
                    jy.this.a(view.getContext(), jy.this.e());
                }
                jy.this.k = com.huawei.openalliance.ad.utils.as.c();
                jy.this.j();
            }
        };
        this.f19413b.get().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.openalliance.ad.jy.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                hw.b(jy.this.n(), "onViewDetachedFromWindow, viewMonitor is %s", jy.this.o == null ? "not null" : com.huawei.operation.utils.Constants.NULL);
                if (jy.this.o != null) {
                    hw.a(jy.this.n(), "viewMonitor is not null, call onViewDetachedFromWindow");
                    jy.this.o.i();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                hw.b(jy.this.n(), "onViewAttachedToWindow, viewMonitor is %s", jy.this.o == null ? "not null" : com.huawei.operation.utils.Constants.NULL);
                if (jy.this.o != null) {
                    jy.this.o.h();
                }
            }
        });
        if (this.o != null) {
            hw.a(n(), "viewMonitor is not null, call onViewAttachedToWindow");
            this.o.h();
        }
    }

    public void a(long j, int i) {
        int i2;
        try {
            com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(this.f19413b.get().getContext().getApplicationContext());
            MzImpCannotReportInfo mzImpCannotReportInfo = new MzImpCannotReportInfo();
            mzImpCannotReportInfo.setMinShowTime(Long.valueOf(this.i));
            mzImpCannotReportInfo.setMinShowRatio(Integer.valueOf(this.h));
            mzImpCannotReportInfo.setDuration(Long.valueOf(j));
            mzImpCannotReportInfo.setMaxShowAreaPer(Integer.valueOf(i));
            long j2 = this.i;
            if (j > j2 || i >= this.h) {
                i2 = j <= j2 ? 1 : 2;
            } else {
                i2 = 3;
            }
            mzImpCannotReportInfo.setReason(i2);
            cVar.a(this.g, mzImpCannotReportInfo);
        } catch (Exception e) {
            hw.d("ImageMzMonitor", "reportImpCannotReport error: %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.jx
    public void a() {
        h();
        i();
        a(com.huawei.openalliance.ad.utils.as.c() - this.k, this.l, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n() {
        return "ImageMzMonitor_" + hashCode();
    }

    private View m() {
        WeakReference<View> weakReference = this.f19413b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private String l() {
        if (m() instanceof js) {
            return com.huawei.openalliance.ad.utils.dk.a((js) m());
        }
        hw.c(n(), "getSlotPosition failed, view is not IView");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        ContentRecord contentRecord = this.g;
        return com.huawei.openalliance.ad.utils.c.a(contentRecord == null ? null : contentRecord.bc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f19412a[0]) {
            hw.a(n(), "has reported hw showstart");
            return;
        }
        this.g.h(this.k);
        this.g.c(String.valueOf(this.k));
        this.f.a(this.g);
        hw.b(n(), "callHwShowStart");
        pc pcVar = this.f;
        if (pcVar != null) {
            pcVar.b();
            this.f19412a[0] = true;
        }
    }

    private void i() {
        hw.b(n(), "callMzClick");
        this.e.a(this.d, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f19412a[3] || this.p) {
            hw.a(n(), "has reported mz imp");
            return;
        }
        hw.b(n(), "callMzOnImp");
        this.e.a(this.f19414c, m(), this.g);
        this.e.a(this.q, this.r);
        this.f19412a[3] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i;
        if (this.n) {
            this.n = false;
            com.huawei.openalliance.ad.utils.dq.a(this.m);
            long jC = com.huawei.openalliance.ad.utils.as.c() - this.j;
            if (jC <= this.i || (i = this.l) < this.h) {
                return;
            }
            a(jC, i, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.j = com.huawei.openalliance.ad.utils.as.c();
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.jy.4
            @Override // java.lang.Runnable
            public void run() {
                jy.this.a(com.huawei.openalliance.ad.utils.as.c() - jy.this.j, jy.this.l, -1);
                jy.this.h();
            }
        }, this.m, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        return com.huawei.openalliance.ad.utils.as.b("yyyyMMdd") + Constants.LINK + this.g.o() + Constants.LINK + this.g.p();
    }

    private void d() {
        ContentRecord contentRecord = this.g;
        if (contentRecord == null) {
            this.h = 50;
            this.i = 1000L;
            return;
        }
        this.h = contentRecord.d();
        this.i = this.g.c();
        hw.b(n(), "showRatio %s, showTime %s.", Integer.valueOf(this.h), Long.valueOf(this.i));
        if (this.h == 0) {
            this.h = 50;
        }
        if (this.i == 0) {
            this.i = 1000L;
        }
        if (this.h > 100) {
            this.h = 100;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, int i) {
        if (this.f19412a[2]) {
            hw.a(n(), "has reported hw phyImp");
            return;
        }
        hw.b(n(), "callHwPhyShow, %s, %s", Long.valueOf(j), Integer.valueOf(i));
        pc pcVar = this.f;
        if (pcVar != null) {
            pcVar.a(j, i);
            this.f19412a[2] = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final String str) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jy.3
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context).b(str, "task support mz but has impSmartCtrl", jy.this.g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, int i, int i2) {
        if (this.f19412a[1] || this.p) {
            hw.a(n(), "has reported hw imp");
            return;
        }
        h();
        hw.b(n(), "callHwShow, %s, %s", Long.valueOf(j), Integer.valueOf(i));
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229aA = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a().a(Integer.valueOf(i)).a(Long.valueOf(j)).e(vv.b(m())).d(l()).a(com.huawei.openalliance.ad.utils.b.a(m()));
        if (i2 != -1) {
            c0229aA.b(Integer.valueOf(i2));
        }
        pc pcVar = this.f;
        if (pcVar != null) {
            pcVar.a(c0229aA.a());
            this.f19412a[1] = true;
        }
    }

    public jy(List<String> list, List<String> list2, pc pcVar, ContentRecord contentRecord) {
        this.f19414c = list;
        this.d = list2;
        this.f = pcVar;
        this.g = contentRecord;
        d();
    }
}
