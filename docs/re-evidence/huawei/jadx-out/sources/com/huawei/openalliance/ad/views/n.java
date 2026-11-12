package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.constant.SwipeDirectionIn2100072;
import com.huawei.openalliance.ad.cv;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.ShakeClickReportInfo;
import com.huawei.openalliance.ad.inter.data.SwipeClickReportInfo;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.jp;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mw;
import com.huawei.openalliance.ad.oj;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.sa;
import com.huawei.openalliance.ad.sb;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;

/* JADX INFO: loaded from: classes41.dex */
public abstract class n<P extends oj> extends RelativeLayout implements com.huawei.openalliance.ad.views.interfaces.n {
    private int A;
    private int B;
    private int C;
    private float D;
    private Integer E;
    private Integer F;
    private Integer G;
    private int H;
    private MaterialClickInfo I;
    private boolean J;
    private long K;
    private boolean L;
    private View.OnTouchListener M;
    private View.OnTouchListener N;
    private View.OnTouchListener O;
    private jp P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected P f21289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected cv f21290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected mh f21291c;
    protected ContentRecord d;
    protected int e;
    protected int f;
    protected int g;
    protected jj h;
    private String i;
    private boolean j;
    private Long k;
    private View l;
    private sb m;
    private sa n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private double t;
    private double u;
    private double v;
    private double w;
    private double x;
    private boolean y;
    private int z;

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public boolean e() {
        return false;
    }

    protected void f() {
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void setAudioFocusType(int i) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void setAdMediator(jj jjVar) {
        this.h = jjVar;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void setAdContent(ContentRecord contentRecord) {
        int iIntValue;
        this.d = contentRecord;
        this.z = fp.b(getContext()).J();
        if (contentRecord.aL() != null) {
            InteractCfg interactCfgAL = contentRecord.aL();
            if (this.z <= 0 && interactCfgAL.b() != null && interactCfgAL.b().intValue() > 0) {
                this.z = interactCfgAL.b().intValue();
            }
            this.B = interactCfgAL.c() != null ? interactCfgAL.c().intValue() : fp.b(getContext()).M();
            this.A = interactCfgAL.d() != null ? interactCfgAL.d().intValue() : fp.b(getContext()).L();
            this.H = interactCfgAL.g().intValue();
            iIntValue = interactCfgAL.e().intValue();
        } else {
            this.z = fp.b(getContext()).J();
            this.B = fp.b(getContext()).M();
            this.A = fp.b(getContext()).L();
            iIntValue = 0;
        }
        this.C = iIntValue;
        int i = this.z;
        if (i <= 0) {
            i = 200;
        }
        this.z = i;
        hw.a("PPSBaseView", "origin limit Swipe distance is %s dp", Integer.valueOf(i));
        this.z = as.a(getContext(), this.z);
        this.o = this.A * 2;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jp jpVar = this.P;
        if (jpVar != null) {
            jpVar.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("PPSBaseView", "detached from window");
        jp jpVar = this.P;
        if (jpVar != null) {
            jpVar.i();
        }
        this.f21291c.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        jp jpVar = this.P;
        if (jpVar != null) {
            jpVar.h();
        }
    }

    public void j() {
        if (this.f21290b == null) {
            this.f21290b = new com.huawei.openalliance.ad.analysis.c(getContext().getApplicationContext());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.J || jCurrentTimeMillis - this.K < 1000) {
            return;
        }
        this.K = jCurrentTimeMillis;
        String str = getWidth() + "*" + getHeight();
        ShakeClickReportInfo.a aVar = new ShakeClickReportInfo.a();
        aVar.a(this.L).b((Integer) 2).a(new MaterialClickInfo.a().a(this.i).c((Integer) 2).b(str).a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(getContext()))).a()).a(this.i).a(Integer.valueOf(this.C)).c(Integer.valueOf(this.B)).a(Float.valueOf(this.D)).d(Integer.valueOf(this.A)).b(dg.a(this.q) + "," + dg.a(this.r) + "," + dg.a(this.t) + "," + dg.a(this.u) + "," + dg.a(this.w) + "," + dg.a(this.x));
        this.f21290b.a(this.d, aVar.a());
        this.J = false;
        this.L = false;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public boolean i() {
        int iZ = pa.z(this.d.X());
        if (1 == iZ) {
            return this.f21289a.h();
        }
        return 2 == iZ && this.f21289a.h() && this.y;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void h() {
        P p = this.f21289a;
        if (p != null) {
            p.b(this.k);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public jj getAdMediator() {
        return this.h;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void g() {
        P p = this.f21289a;
        if (p != null) {
            p.a(this.k);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        hw.a("PPSBaseView", RewardMethods.DESTROY_VIEW);
        m();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void d() {
        this.h.s();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void c(int i) {
        this.h.f(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void c() {
        hw.b("PPSBaseView", "notifyAdLoaded");
        this.j = true;
        this.k = Long.valueOf(System.currentTimeMillis());
        this.h.a(this.d);
    }

    public void b(int i) {
        this.h.c(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void b() {
        hw.b("PPSBaseView", "show ad");
        this.f21289a.a(this.d);
    }

    public void a(boolean z, int i, int i2, int i3) {
        try {
            if (this.f21290b == null) {
                this.f21290b = new com.huawei.openalliance.ad.analysis.c(getContext().getApplicationContext());
            }
            if (i3 != 0 && this.H == 0 && (i2 > 0 || (i2 <= 0 && Math.abs(i2) < Math.abs(i)))) {
                i3 = 2;
            }
            float fI = com.huawei.openalliance.ad.utils.d.i(getContext());
            SwipeClickReportInfo.a aVar = new SwipeClickReportInfo.a();
            aVar.a(z).b((Integer) 1).a(this.I).d(Integer.valueOf((int) (this.z / fI))).c(Integer.valueOf(SwipeDirectionIn2100072.transformSwipeDirectionType(this.H))).a(i).b(i2).a(fI).a(Integer.valueOf(i3));
            this.f21290b.a(this.d, aVar.a());
        } catch (Exception e) {
            hw.d("PPSBaseView", "reportSwipeClickInfo, error: %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void a(mh mhVar) {
        if (mhVar != null) {
            this.f21291c = mhVar;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void a(View view, Integer num) {
        this.l = view;
        if (view != null) {
            view.setOnTouchListener(this.M);
        }
        ContentRecord contentRecord = this.d;
        String strX = contentRecord == null ? null : contentRecord.X();
        int iN = pa.n(strX);
        if (hw.a()) {
            hw.a("PPSBaseView", "ctrlswitch:%s", strX);
            hw.a("PPSBaseView", "splashpro mode:%d, splashInteractCfg: %s", Integer.valueOf(iN), num);
        }
        if (iN == 2) {
            setOnTouchListener(this.O);
            if (num == null) {
                return;
            }
            if (1 == num.intValue() || 4 == num.intValue()) {
                setOnTouchListener(this.N);
                if (this.l == null || 1 != num.intValue()) {
                    return;
                }
            } else {
                if (2 != num.intValue() && 3 != num.intValue()) {
                    return;
                }
                setOnTouchListener(this.O);
                k();
                l();
                if (this.l == null || 2 != num.intValue()) {
                    return;
                }
            }
            this.l.setOnTouchListener(null);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void a(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void a(int i, int i2) {
        hw.b("PPSBaseView", "user click skip button");
        this.f21289a.a(i, i2, this.k);
        this.f21291c.j();
        this.f21291c.b();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.n
    public void a(int i) {
        this.h.b(i);
    }

    public void a() {
        this.h.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r() {
        hw.a("PPSBaseView", "acceptableAngle: diffDegreeX: %s, diffDegreeY: %s, diffDegreeZ: %s, limitDegree: %s", Double.valueOf(this.p), Double.valueOf(this.s), Double.valueOf(this.v), Integer.valueOf(this.A));
        double d = this.p;
        double d2 = this.o;
        return d >= d2 || this.s >= d2 || this.v >= d2;
    }

    private boolean q() {
        hw.a("PPSBaseView", "acceptableAcceleration: sqrtAcc: %s, limitAcc: %s", Float.valueOf(this.D), Integer.valueOf(this.B));
        return this.D >= ((float) this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        hw.a("PPSBaseView", "interactiveLogic is %s", Integer.valueOf(this.C));
        if (this.C == 1) {
            return q() && r();
        }
        return q() || r();
    }

    private void o() {
        hw.a("PPSBaseView", "releaseSensor");
        if (this.n != null || this.m != null) {
            j();
        }
        sa saVar = this.n;
        if (saVar != null) {
            saVar.b();
        }
        sb sbVar = this.m;
        if (sbVar != null) {
            sbVar.b();
        }
    }

    private void n() {
        hw.b("PPSBaseView", "resetDegree");
        this.E = null;
        this.F = null;
        this.G = null;
        this.p = 0.0d;
        this.q = 0.0d;
        this.r = 0.0d;
        this.s = 0.0d;
        this.t = 0.0d;
        this.u = 0.0d;
        this.v = 0.0d;
        this.w = 0.0d;
        this.x = 0.0d;
        this.D = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        hw.b("PPSBaseView", "stopListener");
        o();
        n();
    }

    private void l() {
        hw.b("PPSBaseView", "setRotationListener");
        if (this.m == null) {
            hw.b("PPSBaseView", " new setRotationListener");
            sb sbVar = new sb(getContext());
            this.m = sbVar;
            sbVar.a(new b());
            this.m.a();
        }
    }

    private void k() {
        hw.b("PPSBaseView", "setAccListener");
        if (this.n == null) {
            hw.b("PPSBaseView", "new setAccListener");
            sa saVar = new sa(getContext());
            this.n = saVar;
            saVar.a(new a());
            this.n.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double b(double d, double d2) {
        if (Math.abs(d) < this.A || Math.abs(d2) < this.A) {
            return 0.0d;
        }
        return Math.abs(d) + Math.abs(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        setOnTouchListener(null);
        view.setEnabled(false);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (hw.a()) {
            hw.a("PPSBaseView", "touch down image x=%f, y=%f", Float.valueOf(rawX), Float.valueOf(rawY));
        }
        MaterialClickInfo materialClickInfoB = tz.b(view, motionEvent);
        if (materialClickInfoB != null) {
            materialClickInfoB.e(0);
            materialClickInfoB.a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(getContext())));
        }
        P p = this.f21289a;
        int i = (int) rawX;
        int i2 = (int) rawY;
        ContentRecord contentRecord = this.d;
        p.a(i, i2, contentRecord, this.k, materialClickInfoB, 2 == pa.n(contentRecord.X()) ? 17 : 7);
        this.f21291c.a(mw.CLICK);
        return true;
    }

    private boolean a(double d, double d2) {
        return ((double) this.A) > Math.abs(d2) || Math.abs(d) > Math.abs(d2) / 2.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d, double d2, double d3) {
        if (d - ((double) this.E.intValue()) < 0.0d && a(this.q, d - ((double) this.E.intValue()))) {
            this.q = Math.min(this.q, d - ((double) this.E.intValue()));
        } else if (a(this.r, d - ((double) this.E.intValue()))) {
            this.r = Math.max(this.r, d - ((double) this.E.intValue()));
        }
        if (d2 - ((double) this.F.intValue()) < 0.0d && a(this.t, d2 - ((double) this.F.intValue()))) {
            this.t = Math.min(this.t, d2 - ((double) this.F.intValue()));
        } else if (a(this.u, d2 - ((double) this.F.intValue()))) {
            this.u = Math.max(this.u, d2 - ((double) this.F.intValue()));
        }
        if (d3 - ((double) this.G.intValue()) < 0.0d && a(this.w, d3 - ((double) this.G.intValue()))) {
            this.w = Math.min(this.w, d3 - ((double) this.G.intValue()));
        } else if (a(this.x, d3 - ((double) this.G.intValue()))) {
            this.x = Math.max(this.x, d3 - ((double) this.G.intValue()));
        }
    }

    class a implements sa.a {
        @Override // com.huawei.openalliance.ad.sa.a
        public void a(float f, float f2, float f3) {
            n.this.J = true;
            n.this.D = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
            if (hw.a()) {
                hw.a("PPSBaseView", "accLimitNew: %s, xAcc: %s yAcc: %s zAcc: %s, sqrtAcc: %s", Integer.valueOf(n.this.B), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(n.this.D));
            }
            if (n.this.k == null || !n.this.p()) {
                return;
            }
            n.this.L = true;
            hw.b("PPSBaseView", "meet, accLimitNew: %s, sqrtAcc: %s", Integer.valueOf(n.this.B), Float.valueOf(n.this.D));
            n.this.m();
            MaterialClickInfo materialClickInfoA = new MaterialClickInfo.a().c((Integer) 2).b(Integer.valueOf(n.this.getWidth()) + "*" + Integer.valueOf(n.this.getHeight())).a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(n.this.getContext()))).a();
            if (n.this.C == 1) {
                materialClickInfoA.b(n.this.i);
            }
            n.this.f21289a.a(0, 0, n.this.d, n.this.k, materialClickInfoA, 19);
            n.this.f21291c.a(mw.CLICK);
        }

        private a() {
        }
    }

    class b implements sb.a {
        @Override // com.huawei.openalliance.ad.sb.a
        public void a(double d, double d2, double d3) {
            n.this.J = true;
            if (hw.a()) {
                hw.a("PPSBaseView", "X:%s Y:%s Z:%s", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3));
            }
            n.this.y = true;
            if (n.this.E == null) {
                n.this.E = Integer.valueOf((int) d);
            }
            if (n.this.F == null) {
                n.this.F = Integer.valueOf((int) d2);
            }
            if (n.this.G == null) {
                n.this.G = Integer.valueOf((int) d3);
            }
            n.this.a(d, d2, d3);
            n nVar = n.this;
            nVar.p = nVar.b(nVar.q, n.this.r);
            n nVar2 = n.this;
            nVar2.s = nVar2.b(nVar2.t, n.this.u);
            n nVar3 = n.this;
            nVar3.v = nVar3.b(nVar3.w, n.this.x);
            if (n.this.r()) {
                n.this.i = dg.a(n.this.p) + "," + dg.a(n.this.s) + "," + dg.a(n.this.v);
            }
            if (hw.a()) {
                hw.a("PPSBaseView", "diffDegreeX: %s diffDegreeY: %s diffDegreeZ: %s", Double.valueOf(n.this.p), Double.valueOf(n.this.s), Double.valueOf(n.this.v));
                hw.a("PPSBaseView", "diffLeftDegreeX: %s diffRightDegreeX: %s ", Double.valueOf(n.this.q), Double.valueOf(n.this.r));
                hw.a("PPSBaseView", "diffLeftDegreeY: %s diffRightDegreeY: %s ", Double.valueOf(n.this.t), Double.valueOf(n.this.u));
                hw.a("PPSBaseView", "diffLeftDegreeZ: %s diffRightDegreeZ: %s ", Double.valueOf(n.this.w), Double.valueOf(n.this.x));
            }
            if (n.this.k == null || !n.this.p()) {
                return;
            }
            n.this.L = true;
            hw.b("PPSBaseView", "meet, diffX: %s, diffY: %s, diffZ: %s, limit: %s", Double.valueOf(n.this.p), Double.valueOf(n.this.s), Double.valueOf(n.this.v), Integer.valueOf(n.this.A));
            n.this.m();
            n.this.f21289a.a(0, 0, n.this.d, n.this.k, new MaterialClickInfo.a().a(n.this.i).c((Integer) 2).b(n.this.getWidth() + "*" + n.this.getHeight()).a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(n.this.getContext()))).a(), 19);
            n.this.f21291c.a(mw.CLICK);
        }

        private b() {
        }
    }

    public n(Context context) {
        super(context);
        this.f21291c = new lw();
        this.j = false;
        this.k = null;
        this.y = false;
        this.M = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.n.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return n.this.a(view, motionEvent);
            }
        };
        this.N = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.n.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f21294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f21295c;
            private boolean d;
            private boolean e;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return a(motionEvent);
            }

            private boolean a(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.d = false;
                    this.e = false;
                    this.f21294b = motionEvent.getX();
                    this.f21295c = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseView", "startX = %s, startY = %s", Float.valueOf(this.f21294b), Float.valueOf(this.f21295c));
                    }
                    n nVar = n.this;
                    nVar.I = tz.b(nVar, motionEvent);
                }
                if (2 == motionEvent.getAction()) {
                    this.e = true;
                    n.this.y = true;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseView", " endX= %s, endY = %s, startX - endX= %s, startY - endY= %s", Float.valueOf(x), Float.valueOf(y), Float.valueOf(this.f21294b - x), Float.valueOf(this.f21295c - y));
                    }
                    if (dw.a(n.this.H, n.this.z, this.f21294b - x, this.f21295c - y)) {
                        tz.b(n.this, motionEvent, 1, n.this.I);
                        n.this.setOnTouchListener(null);
                        n.this.f21289a.a(0, 0, n.this.d, n.this.k, n.this.I, 18);
                        this.d = true;
                        n.this.a(true, (int) (x - this.f21294b), (int) (y - this.f21295c), 0);
                        n.this.I = null;
                        n.this.f21291c.a(mw.CLICK);
                    }
                }
                if (1 == motionEvent.getAction()) {
                    n nVar2 = n.this;
                    tz.b(nVar2, motionEvent, null, nVar2.I);
                    if (!this.d && this.e) {
                        n.this.a(false, (int) (motionEvent.getX() - this.f21294b), (int) (motionEvent.getY() - this.f21295c), 1);
                    }
                }
                return true;
            }
        };
        this.O = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.n.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    n.this.y = true;
                }
                return true;
            }
        };
        this.P = new jp(this) { // from class: com.huawei.openalliance.ad.views.n.4
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i) {
                n.this.f();
                if (n.this.k == null) {
                    hw.c("PPSBaseView", "onViewShowEnd - no adShowStartTime");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = n.this.k.longValue();
                if (n.this.f21289a != null) {
                    n.this.f21289a.a(n.this.d, jCurrentTimeMillis - jLongValue, 100);
                    n.this.f21289a.c();
                }
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.n.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        n.this.f21291c.b();
                    }
                }, 150L);
                n.this.k = null;
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                if (n.this.h != null) {
                    n.this.h.i();
                }
            }
        };
        setOnTouchListener(this.M);
    }
}
