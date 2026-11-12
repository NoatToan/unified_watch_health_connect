package com.huawei.openalliance.ad.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.SwipeDirectionIn2100072;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.ShakeClickReportInfo;
import com.huawei.openalliance.ad.inter.data.SwipeClickReportInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.jl;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.ILinkedMediaStateListener;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.nr;
import com.huawei.openalliance.ad.oh;
import com.huawei.openalliance.ad.ph;
import com.huawei.openalliance.ad.sa;
import com.huawei.openalliance.ad.sb;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.ua;
import com.huawei.openalliance.ad.ut;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;
import com.huawei.openalliance.ad.uu;
import com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton;
import com.huawei.openalliance.ad.views.interfaces.IPPSLinkedView;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
abstract class j extends RelativeLayout implements jl.a, IPPSLinkedView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static View.OnTouchListener f21248a = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    protected List<View> A;
    protected PPSSplashView B;
    protected WindowManager C;
    protected w D;
    protected ImageView E;
    protected boolean F;
    protected d G;
    protected View H;
    protected int I;
    protected ViewStub J;
    protected View K;
    protected View L;
    protected int M;
    protected boolean N;
    protected long O;
    protected long P;
    protected long Q;
    protected long R;
    protected boolean S;
    protected boolean T;
    protected int U;
    protected int V;
    protected float W;
    protected boolean aA;
    protected boolean aB;
    protected String aC;
    protected com.huawei.openalliance.ad.analysis.c aD;
    protected com.huawei.openalliance.ad.analysis.h aE;
    protected float aF;
    protected boolean aG;
    protected int aH;
    protected PPSSplashProView aI;
    protected PPSSplashSwipeView aJ;
    protected PPSSplashTwistView aK;
    protected sb aL;
    protected sa aM;
    protected double aN;
    protected int aO;
    protected int aP;
    protected int aQ;
    protected int aR;
    protected WeakReference<Context> aS;
    protected int aT;
    protected PPSSplashSwipeClickView aU;
    protected PPSSplashTwistClickView aV;
    protected boolean aW;
    protected ua aX;
    protected PPSVideoRenderListener aY;
    protected final ReportVideoTimeListener aZ;
    protected float aa;
    protected int ab;
    protected int ac;
    protected int ad;
    protected int ae;
    protected float af;
    protected float ag;
    protected float ah;
    protected int[] ai;
    protected boolean aj;
    protected boolean ak;
    protected LinkedAdListener al;
    protected boolean am;
    protected boolean an;
    protected boolean ao;
    protected boolean ap;
    protected boolean aq;
    protected boolean ar;
    protected boolean as;
    protected boolean at;
    protected boolean au;
    protected ValueAnimator av;
    protected boolean aw;
    protected int ax;
    protected boolean ay;
    protected Integer az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f21249b;
    private long bA;
    private boolean bB;
    private boolean bC;
    private boolean bD;
    private boolean bE;
    protected MediaStateListener ba;
    protected com.huawei.openalliance.ad.media.listener.a bb;
    protected View.OnClickListener bc;
    protected View.OnTouchListener bd;
    protected View.OnTouchListener be;
    protected View.OnTouchListener bf;
    protected MediaErrorListener bg;
    protected MuteListener bh;
    protected MediaBufferListener bi;
    protected View.OnClickListener bj;
    private String bk;
    private double bl;
    private double bm;
    private double bn;
    private double bo;
    private double bp;
    private double bq;
    private double br;
    private double bs;
    private double bt;
    private float bu;
    private Integer bv;
    private Integer bw;
    private Integer bx;
    private boolean by;
    private boolean bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f21250c;
    protected final ut d;
    protected final uu e;
    protected MaterialClickInfo f;
    protected Context g;
    protected gk h;
    protected PPSWLSView i;
    protected PPSSplashAdSourceView j;
    protected jl k;
    protected LinkedSplashAd l;
    protected jj m;
    protected int n;
    protected VideoInfo o;
    protected oh p;
    protected PPSLinkedView.OnLinkedAdSwitchListener q;
    protected PPSLinkedView.OnLinkedAdClickListener r;
    protected PPSLinkedView.OnLinkedAdPreparedListener s;
    protected ILinkedMediaStateListener t;
    protected MuteListener u;
    protected aj v;
    protected IAppDownloadButton w;
    protected h x;
    protected LinkedSurfaceView y;
    protected PPSDestView z;

    protected abstract void a(int i);

    protected abstract void a(int i, boolean z);

    protected abstract void a(Integer num, boolean z);

    protected abstract void a(boolean z);

    protected abstract boolean a(MaterialClickInfo materialClickInfo);

    protected abstract void f();

    protected abstract void g();

    protected abstract void h();

    protected abstract void i();

    protected abstract void j();

    public void o() {
        String str;
        try {
            if (this.l == null) {
                return;
            }
            if (this.aD == null) {
                this.aD = new com.huawei.openalliance.ad.analysis.c(this.g);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.bz && jCurrentTimeMillis - this.bA >= 1000) {
                this.bA = jCurrentTimeMillis;
                if (this.v != null) {
                    str = this.v.getWidth() + "*" + this.v.getHeight();
                } else {
                    str = null;
                }
                ContentRecord contentRecordA = ph.a(this.l);
                ShakeClickReportInfo.a aVar = new ShakeClickReportInfo.a();
                aVar.a(this.bB).b((Integer) 2).a(new MaterialClickInfo.a().a(this.bk).c((Integer) 2).b(str).a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(getContext()))).a()).a(this.bk).a(Integer.valueOf(this.aO)).c(Integer.valueOf(this.aR)).a(Float.valueOf(this.bu)).d(Integer.valueOf(this.aQ)).b(dg.a(this.bm) + "," + dg.a(this.bn) + "," + dg.a(this.bp) + "," + dg.a(this.bq) + "," + dg.a(this.bs) + "," + dg.a(this.bt));
                this.aD.a(contentRecordA, aVar.a());
                this.bB = false;
                this.bz = false;
            }
        } catch (Exception e) {
            hw.c("PPSBaseLinkedView", "recordShakeClickInfo error : %s", e.getClass().getSimpleName());
        }
    }

    public aj n() {
        return this.v;
    }

    public jj m() {
        return this.m;
    }

    protected void l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.O = jCurrentTimeMillis;
        jj jjVar = this.m;
        if (jjVar != null) {
            jjVar.a(jCurrentTimeMillis);
        }
    }

    protected void k() {
        hw.b("PPSBaseLinkedView", "reportAdShowStartEvent, showStartTime: %s", Long.valueOf(this.O));
        this.T = false;
        String strValueOf = String.valueOf(this.O);
        LinkedSplashAd linkedSplashAd = this.l;
        if (linkedSplashAd == null) {
            hw.c("PPSBaseLinkedView", "linkedSplashAd is null! please register first");
            return;
        }
        linkedSplashAd.h(strValueOf);
        this.l.c(this.O);
        this.l.h(false);
        this.l.a(false);
        this.l.j(true);
        if (!this.l.aa()) {
            this.l.g(true);
        }
        this.p.a(strValueOf);
        this.p.a(this.O);
        IAppDownloadButton iAppDownloadButton = this.w;
        if (iAppDownloadButton != null) {
            iAppDownloadButton.updateContent(strValueOf);
            this.w.updateStartShowTime(this.O);
        }
        hw.a("PPSBaseLinkedView", "report showStart. ");
        this.p.b();
    }

    public void a(boolean z, int i, int i2, int i3) {
        try {
            if (this.l == null) {
                return;
            }
            if (this.aD == null) {
                this.aD = new com.huawei.openalliance.ad.analysis.c(this.g);
            }
            if (this.aT == 0 && i2 <= 0 && Math.abs(i2) < Math.abs(i)) {
                i3 = 2;
            }
            float fI = com.huawei.openalliance.ad.utils.d.i(getContext());
            ContentRecord contentRecordA = ph.a(this.l);
            SwipeClickReportInfo.a aVar = new SwipeClickReportInfo.a();
            aVar.a(z).b((Integer) 1).a(this.f).d(Integer.valueOf((int) (this.aP / fI))).c(Integer.valueOf(SwipeDirectionIn2100072.transformSwipeDirectionType(this.aT))).a(i).b(i2).a(fI).a(Integer.valueOf(i3));
            this.aD.a(contentRecordA, aVar.a());
        } catch (Exception e) {
            hw.d("PPSBaseLinkedView", "reportSwipeClickInfo, error: %s", e.getClass().getSimpleName());
        }
    }

    protected void a(Context context) {
        int iH;
        if (this.U <= 0 && cc.a(context).a(context)) {
            iH = Math.max(this.U, cc.a(context).a(this));
        } else if (this.U > 0 || cc.a(context).a(context)) {
            return;
        } else {
            iH = as.h(context);
        }
        this.U = iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u() {
        hw.a("PPSBaseLinkedView", "acceptableAngle: diffDegreeX: %s, diffDegreeY: %s, diffDegreeZ: %s, limitDegree: %s", Double.valueOf(this.bl), Double.valueOf(this.bo), Double.valueOf(this.br), Integer.valueOf(this.aQ));
        double d2 = this.bl;
        double d3 = this.aN;
        return d2 >= d3 || this.bo >= d3 || this.br >= d3;
    }

    private boolean t() {
        hw.a("PPSBaseLinkedView", "acceptableAcceleration: sqrtAcc: %s, limitAcc: %s", Float.valueOf(this.bu), Integer.valueOf(this.aR));
        return this.bu >= ((float) this.aR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s() {
        hw.a("PPSBaseLinkedView", "interactiveLogic is %s", Integer.valueOf(this.aO));
        if (this.aO == 1) {
            return t() && u();
        }
        return t() || u();
    }

    private void r() {
        hw.a("PPSBaseLinkedView", "releaseSensor");
        if (this.aM != null || this.aL != null) {
            o();
        }
        sa saVar = this.aM;
        if (saVar != null) {
            saVar.b();
        }
        sb sbVar = this.aL;
        if (sbVar != null) {
            sbVar.b();
        }
    }

    private void q() {
        hw.b("PPSBaseLinkedView", "resetDegree");
        this.bv = null;
        this.bw = null;
        this.bx = null;
        this.bl = 0.0d;
        this.bm = 0.0d;
        this.bn = 0.0d;
        this.bo = 0.0d;
        this.bp = 0.0d;
        this.bq = 0.0d;
        this.br = 0.0d;
        this.bs = 0.0d;
        this.bt = 0.0d;
        this.bu = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        r();
        q();
    }

    private void b(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.h = fp.b(applicationContext);
        this.p = new nr(this.g, this);
        this.C = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        this.aB = cc.a(this.g).d();
        this.aC = this.g.getPackageName();
        this.aD = new com.huawei.openalliance.ad.analysis.c(this.g);
        this.aE = new com.huawei.openalliance.ad.analysis.h(this.g);
        this.aF = com.huawei.openalliance.ad.utils.d.i(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double b(double d2, double d3) {
        if (Math.abs(d2) < this.aQ || Math.abs(d3) < this.aQ) {
            return 0.0d;
        }
        return Math.abs(d2) + Math.abs(d3);
    }

    private boolean a(double d2, double d3) {
        return ((double) this.aQ) > Math.abs(d3) || Math.abs(d2) > Math.abs(d3) / 2.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d2, double d3, double d4) {
        if (d2 - ((double) this.bv.intValue()) < 0.0d && a(this.bm, d2 - ((double) this.bv.intValue()))) {
            this.bm = Math.min(this.bm, d2 - ((double) this.bv.intValue()));
        } else if (a(this.bn, d2 - ((double) this.bv.intValue()))) {
            this.bn = Math.max(this.bn, d2 - ((double) this.bv.intValue()));
        }
        if (d3 - ((double) this.bw.intValue()) < 0.0d && a(this.bp, d3 - ((double) this.bw.intValue()))) {
            this.bp = Math.min(this.bp, d3 - ((double) this.bw.intValue()));
        } else if (a(this.bq, d3 - ((double) this.bw.intValue()))) {
            this.bq = Math.max(this.bq, d3 - ((double) this.bw.intValue()));
        }
        if (d4 - ((double) this.bx.intValue()) < 0.0d && a(this.bs, d4 - ((double) this.bx.intValue()))) {
            this.bs = Math.min(this.bs, d4 - ((double) this.bx.intValue()));
        } else if (a(this.bt, d4 - ((double) this.bx.intValue()))) {
            this.bt = Math.max(this.bt, d4 - ((double) this.bx.intValue()));
        }
    }

    public j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f21249b = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.f21250c = "skip_btn_delay_id_" + hashCode();
        this.d = new ut();
        this.e = new uu();
        this.n = 1;
        this.F = true;
        this.M = 0;
        this.N = false;
        this.Q = -1L;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.ae = IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW;
        this.ai = new int[2];
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.aw = false;
        this.ay = true;
        this.aA = true;
        this.aB = true;
        this.aG = false;
        this.aH = 0;
        this.aW = false;
        this.by = false;
        this.aY = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.j.6
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.a("PPSBaseLinkedView", "onVideoRenderStart, alreadyNotified: %s", Boolean.valueOf(j.this.bD));
                if (j.this.bD) {
                    return;
                }
                j.this.bD = true;
                j.this.f();
            }
        };
        this.aZ = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.j.7
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSBaseLinkedView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (j.this.p != null) {
                    j.this.p.b(j);
                }
            }
        };
        this.ba = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.j.8
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (i4 > 0 && !j.this.bD) {
                    hw.a("PPSBaseLinkedView", "onProgress onRenderStart, playtime: %s", Integer.valueOf(i4));
                    j.this.bD = true;
                    j.this.f();
                }
                if (i4 > 0) {
                    j.this.o.e(i4);
                    j.this.e.b(true);
                }
                if (j.this.t != null) {
                    j.this.t.onMediaProgress(i3, i4);
                }
                if (j.this.N) {
                    j.this.d.a(i3);
                }
                if (j.this.p != null) {
                    j.this.p.a(i4, j.this.o == null ? 0L : j.this.o.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStop: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaStop(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStart: %s", Integer.valueOf(i3));
                j.this.N = true;
                j.this.e.b(true);
                j.this.R = i3;
                j.this.P = System.currentTimeMillis();
                if (!j.this.aj) {
                    j.this.l();
                    j.this.k();
                }
                oh ohVar = j.this.p;
                if (i3 > 0) {
                    ohVar.j();
                    j.this.d.e();
                } else {
                    ohVar.i();
                    j.this.d.a(j.this.o);
                }
                if (j.this.l != null && j.this.l.isFromExsplash()) {
                    j.this.aD.b(j.this.aC, 1, j.this.l.getSlotId(), j.this.l.getContentId(), (System.currentTimeMillis() - j.this.h.bV().longValue()) - ((long) j.this.h.bW()));
                }
                if (j.this.t != null) {
                    j.this.t.onMediaStart(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaPause: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaPause(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaCompletion: %s", Integer.valueOf(i3));
                j.this.a(i3, true);
                j.this.bE = true;
                if (j.this.ad == 2 && j.this.k != null && j.this.k.g()) {
                    hw.b("PPSBaseLinkedView", "onMediaCompletion, start play");
                    j.this.e.a();
                }
                if (j.this.t != null) {
                    j.this.t.onMediaCompletion(i3);
                }
            }
        };
        this.bb = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.j.9
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                hw.b("PPSBaseLinkedView", "onDurationReady:");
                if (!j.this.aw && j.this.s != null) {
                    j.this.aw = true;
                    j.this.s.onPrepared();
                }
                if (j.this.az == null) {
                    j.this.az = Integer.valueOf(i3);
                    if (j.this.l == null || j.this.l.getVideoInfo() == null) {
                        return;
                    }
                    j.this.l.getVideoInfo().a(i3);
                }
            }
        };
        this.bc = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i3;
                if (j.this.bC) {
                    if (j.this.ad == 1) {
                        j jVar = j.this;
                        if (!jVar.a(jVar.f)) {
                            return;
                        }
                    }
                    j.this.bC = false;
                    hw.b("PPSBaseLinkedView", "onClick");
                    if (j.this.ad == 2) {
                        i3 = 10;
                    } else {
                        i3 = 2 == j.this.aI.getMode() ? 17 : 9;
                        j.this.g();
                    }
                    j.this.a(i3);
                    j.this.by = true;
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.j.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            j.this.bC = true;
                        }
                    }, 500L);
                }
            }
        };
        this.bd = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.11

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f21254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f21255c;
            private boolean d;
            private boolean e;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.d = false;
                    this.e = false;
                    this.f21254b = motionEvent.getX();
                    this.f21255c = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "startX = %s, startY = %s", Float.valueOf(this.f21254b), Float.valueOf(this.f21255c));
                    }
                    j.this.f = tz.a(view, motionEvent);
                }
                if (2 == motionEvent.getAction()) {
                    this.e = true;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "endX = %s, endY = %s, startX - endX = %s, startY-endY = %s", Float.valueOf(x), Float.valueOf(y), Float.valueOf(this.f21254b - x), Float.valueOf(this.f21255c - y));
                    }
                    if (dw.a(j.this.aT, j.this.aP, this.f21254b - x, this.f21255c - y)) {
                        j.this.v.setOnTouchListener(null);
                        tz.a(view, motionEvent, 1, j.this.f);
                        j.this.a(true, (int) (x - this.f21254b), (int) (y - this.f21255c), 0);
                        j.this.a(18);
                        this.d = true;
                    }
                }
                if (1 == motionEvent.getAction()) {
                    tz.a(view, motionEvent, null, j.this.f);
                    if (!this.d && this.e) {
                        j.this.a(false, (int) (motionEvent.getX() - this.f21254b), (int) (motionEvent.getY() - this.f21255c), 1);
                    }
                }
                return true;
            }
        };
        this.be = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.setEnabled(false);
                j.this.v.setOnTouchListener(null);
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                j.this.f = tz.b(view, motionEvent);
                if (j.this.f != null) {
                    j.this.f.e(0);
                    j.this.f.a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(j.this.g)));
                }
                j.this.a(17);
                return true;
            }
        };
        this.bf = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.13
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    j.this.f = tz.a(view, motionEvent);
                }
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                tz.a(view, motionEvent, null, j.this.f);
                return false;
            }
        };
        this.bg = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.j.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                hw.c("PPSBaseLinkedView", "media play error, isMoved: %s", Boolean.valueOf(j.this.aj));
                j.this.h();
                j.this.i();
                j.this.e.b(false);
                if (j.this.t != null) {
                    hw.b("PPSBaseLinkedView", "call onMediaError. ");
                    j.this.t.onMediaError(i3, i4, i5);
                }
            }
        };
        this.bh = new MuteListener() { // from class: com.huawei.openalliance.ad.views.j.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("PPSBaseLinkedView", "onUnmute");
                if (j.this.u != null) {
                    j.this.u.onUnmute();
                }
                j.this.d.b(1);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("PPSBaseLinkedView", "onMute");
                if (j.this.u != null) {
                    j.this.u.onMute();
                }
                j.this.d.b(0);
            }
        };
        this.bi = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.j.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                j.this.d.g();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                j.this.d.f();
            }
        };
        this.bj = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j.this.a(!view.isSelected());
            }
        };
        this.bC = true;
        this.bD = false;
        this.bE = false;
        b(context);
    }

    protected static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<PPSLinkedView> f21266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ContentRecord f21267b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final PPSLinkedView pPSLinkedView = this.f21266a.get();
            if (pPSLinkedView != null) {
                final int[] choiceViewLoc = pPSLinkedView.i.getChoiceViewLoc();
                final int[] choiceViewSize = pPSLinkedView.i.getChoiceViewSize();
                if (as.a(choiceViewLoc, 2) && as.a(choiceViewSize, 2)) {
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.j.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            pPSLinkedView.a(a.this.f21267b, choiceViewLoc, choiceViewSize);
                        }
                    });
                }
            }
        }

        public a(PPSLinkedView pPSLinkedView, ContentRecord contentRecord) {
            this.f21266a = new WeakReference<>(pPSLinkedView);
            this.f21267b = contentRecord;
        }
    }

    protected class d extends CountDownTimer {
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            hw.a("PPSBaseLinkedView", "onTick: %d", Long.valueOf(j));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            hw.b("PPSBaseLinkedView", "CountDownTimer onFinish");
            if (j.this.ad == 1) {
                j.this.a((Integer) 8, false);
                j.this.ax = 2;
                dq.a(j.this.f21250c);
                if (j.this.at) {
                    return;
                }
                j.this.j();
                j.this.at = true;
            }
        }

        d(long j, long j2) {
            super(j, j2);
        }
    }

    public j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21249b = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.f21250c = "skip_btn_delay_id_" + hashCode();
        this.d = new ut();
        this.e = new uu();
        this.n = 1;
        this.F = true;
        this.M = 0;
        this.N = false;
        this.Q = -1L;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.ae = IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW;
        this.ai = new int[2];
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.aw = false;
        this.ay = true;
        this.aA = true;
        this.aB = true;
        this.aG = false;
        this.aH = 0;
        this.aW = false;
        this.by = false;
        this.aY = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.j.6
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.a("PPSBaseLinkedView", "onVideoRenderStart, alreadyNotified: %s", Boolean.valueOf(j.this.bD));
                if (j.this.bD) {
                    return;
                }
                j.this.bD = true;
                j.this.f();
            }
        };
        this.aZ = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.j.7
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSBaseLinkedView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (j.this.p != null) {
                    j.this.p.b(j);
                }
            }
        };
        this.ba = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.j.8
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (i4 > 0 && !j.this.bD) {
                    hw.a("PPSBaseLinkedView", "onProgress onRenderStart, playtime: %s", Integer.valueOf(i4));
                    j.this.bD = true;
                    j.this.f();
                }
                if (i4 > 0) {
                    j.this.o.e(i4);
                    j.this.e.b(true);
                }
                if (j.this.t != null) {
                    j.this.t.onMediaProgress(i3, i4);
                }
                if (j.this.N) {
                    j.this.d.a(i3);
                }
                if (j.this.p != null) {
                    j.this.p.a(i4, j.this.o == null ? 0L : j.this.o.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStop: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaStop(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStart: %s", Integer.valueOf(i3));
                j.this.N = true;
                j.this.e.b(true);
                j.this.R = i3;
                j.this.P = System.currentTimeMillis();
                if (!j.this.aj) {
                    j.this.l();
                    j.this.k();
                }
                oh ohVar = j.this.p;
                if (i3 > 0) {
                    ohVar.j();
                    j.this.d.e();
                } else {
                    ohVar.i();
                    j.this.d.a(j.this.o);
                }
                if (j.this.l != null && j.this.l.isFromExsplash()) {
                    j.this.aD.b(j.this.aC, 1, j.this.l.getSlotId(), j.this.l.getContentId(), (System.currentTimeMillis() - j.this.h.bV().longValue()) - ((long) j.this.h.bW()));
                }
                if (j.this.t != null) {
                    j.this.t.onMediaStart(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaPause: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaPause(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaCompletion: %s", Integer.valueOf(i3));
                j.this.a(i3, true);
                j.this.bE = true;
                if (j.this.ad == 2 && j.this.k != null && j.this.k.g()) {
                    hw.b("PPSBaseLinkedView", "onMediaCompletion, start play");
                    j.this.e.a();
                }
                if (j.this.t != null) {
                    j.this.t.onMediaCompletion(i3);
                }
            }
        };
        this.bb = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.j.9
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                hw.b("PPSBaseLinkedView", "onDurationReady:");
                if (!j.this.aw && j.this.s != null) {
                    j.this.aw = true;
                    j.this.s.onPrepared();
                }
                if (j.this.az == null) {
                    j.this.az = Integer.valueOf(i3);
                    if (j.this.l == null || j.this.l.getVideoInfo() == null) {
                        return;
                    }
                    j.this.l.getVideoInfo().a(i3);
                }
            }
        };
        this.bc = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i3;
                if (j.this.bC) {
                    if (j.this.ad == 1) {
                        j jVar = j.this;
                        if (!jVar.a(jVar.f)) {
                            return;
                        }
                    }
                    j.this.bC = false;
                    hw.b("PPSBaseLinkedView", "onClick");
                    if (j.this.ad == 2) {
                        i3 = 10;
                    } else {
                        i3 = 2 == j.this.aI.getMode() ? 17 : 9;
                        j.this.g();
                    }
                    j.this.a(i3);
                    j.this.by = true;
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.j.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            j.this.bC = true;
                        }
                    }, 500L);
                }
            }
        };
        this.bd = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.11

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f21254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f21255c;
            private boolean d;
            private boolean e;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.d = false;
                    this.e = false;
                    this.f21254b = motionEvent.getX();
                    this.f21255c = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "startX = %s, startY = %s", Float.valueOf(this.f21254b), Float.valueOf(this.f21255c));
                    }
                    j.this.f = tz.a(view, motionEvent);
                }
                if (2 == motionEvent.getAction()) {
                    this.e = true;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "endX = %s, endY = %s, startX - endX = %s, startY-endY = %s", Float.valueOf(x), Float.valueOf(y), Float.valueOf(this.f21254b - x), Float.valueOf(this.f21255c - y));
                    }
                    if (dw.a(j.this.aT, j.this.aP, this.f21254b - x, this.f21255c - y)) {
                        j.this.v.setOnTouchListener(null);
                        tz.a(view, motionEvent, 1, j.this.f);
                        j.this.a(true, (int) (x - this.f21254b), (int) (y - this.f21255c), 0);
                        j.this.a(18);
                        this.d = true;
                    }
                }
                if (1 == motionEvent.getAction()) {
                    tz.a(view, motionEvent, null, j.this.f);
                    if (!this.d && this.e) {
                        j.this.a(false, (int) (motionEvent.getX() - this.f21254b), (int) (motionEvent.getY() - this.f21255c), 1);
                    }
                }
                return true;
            }
        };
        this.be = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.setEnabled(false);
                j.this.v.setOnTouchListener(null);
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                j.this.f = tz.b(view, motionEvent);
                if (j.this.f != null) {
                    j.this.f.e(0);
                    j.this.f.a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(j.this.g)));
                }
                j.this.a(17);
                return true;
            }
        };
        this.bf = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.13
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    j.this.f = tz.a(view, motionEvent);
                }
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                tz.a(view, motionEvent, null, j.this.f);
                return false;
            }
        };
        this.bg = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.j.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                hw.c("PPSBaseLinkedView", "media play error, isMoved: %s", Boolean.valueOf(j.this.aj));
                j.this.h();
                j.this.i();
                j.this.e.b(false);
                if (j.this.t != null) {
                    hw.b("PPSBaseLinkedView", "call onMediaError. ");
                    j.this.t.onMediaError(i3, i4, i5);
                }
            }
        };
        this.bh = new MuteListener() { // from class: com.huawei.openalliance.ad.views.j.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("PPSBaseLinkedView", "onUnmute");
                if (j.this.u != null) {
                    j.this.u.onUnmute();
                }
                j.this.d.b(1);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("PPSBaseLinkedView", "onMute");
                if (j.this.u != null) {
                    j.this.u.onMute();
                }
                j.this.d.b(0);
            }
        };
        this.bi = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.j.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                j.this.d.g();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                j.this.d.f();
            }
        };
        this.bj = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j.this.a(!view.isSelected());
            }
        };
        this.bC = true;
        this.bD = false;
        this.bE = false;
        b(context);
    }

    protected class b implements sa.a {
        @Override // com.huawei.openalliance.ad.sa.a
        public void a(float f, float f2, float f3) {
            String str;
            j.this.bz = true;
            j.this.bu = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
            if (hw.a()) {
                hw.a("PPSBaseLinkedView", "accLimitNew: %s, xAcc: %s yAcc: %s zAcc: %s, sqrtAcc: %s", Integer.valueOf(j.this.aR), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(j.this.bu));
            }
            if (j.this.s()) {
                j.this.bB = true;
                hw.b("PPSBaseLinkedView", "meet, diffX: %s, diffY: %s, diffZ: %s, limit: %s", Double.valueOf(j.this.bl), Double.valueOf(j.this.bo), Double.valueOf(j.this.br), Integer.valueOf(j.this.aQ));
                j.this.p();
                if (j.this.v != null) {
                    str = j.this.v.getWidth() + "*" + j.this.v.getHeight();
                } else {
                    str = null;
                }
                j.this.f = new MaterialClickInfo.a().a(Float.valueOf(j.this.aF)).b(str).c((Integer) 2).a();
                if (j.this.aO == 1) {
                    j.this.f.b(j.this.bk);
                }
                j.this.a(19);
            }
        }

        protected b() {
        }
    }

    protected class c implements sb.a {
        @Override // com.huawei.openalliance.ad.sb.a
        public void a(double d, double d2, double d3) {
            String str;
            j.this.bz = true;
            hw.b("PPSBaseLinkedView", "xDegree=%s, yDegree=%s, zDegree=%s", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3));
            if (j.this.bv == null) {
                j.this.bv = Integer.valueOf((int) d);
            }
            if (j.this.bw == null) {
                j.this.bw = Integer.valueOf((int) d2);
            }
            if (j.this.bx == null) {
                j.this.bx = Integer.valueOf((int) d3);
            }
            j.this.a(d, d2, d3);
            j jVar = j.this;
            jVar.bl = jVar.b(jVar.bm, j.this.bn);
            j jVar2 = j.this;
            jVar2.bo = jVar2.b(jVar2.bp, j.this.bq);
            j jVar3 = j.this;
            jVar3.br = jVar3.b(jVar3.bs, j.this.bt);
            if (j.this.u()) {
                j.this.bk = dg.a(j.this.bl) + "," + dg.a(j.this.bo) + "," + dg.a(j.this.br);
            }
            if (hw.a()) {
                hw.a("PPSBaseLinkedView", "diffDegreeX: %s diffDegreeY: %s diffDegreeZ: %s", Double.valueOf(j.this.bl), Double.valueOf(j.this.bo), Double.valueOf(j.this.br));
                hw.a("PPSBaseLinkedView", "diffLeftDegreeX: %s diffRightDegreeX: %s ", Double.valueOf(j.this.bm), Double.valueOf(j.this.bn));
                hw.a("PPSBaseLinkedView", "diffLeftDegreeY: %s diffRightDegreeY: %s ", Double.valueOf(j.this.bp), Double.valueOf(j.this.bq));
                hw.a("PPSBaseLinkedView", "diffLeftDegreeZ: %s diffRightDegreeZ: %s ", Double.valueOf(j.this.bs), Double.valueOf(j.this.bt));
            }
            if (j.this.s()) {
                j.this.bB = true;
                hw.b("PPSBaseLinkedView", "meet, diffX: %s, diffY: %s, diffZ: %s, limit: %s", Double.valueOf(j.this.bl), Double.valueOf(j.this.bo), Double.valueOf(j.this.br), Integer.valueOf(j.this.aQ));
                j.this.p();
                if (j.this.v != null) {
                    str = j.this.v.getWidth() + "*" + j.this.v.getHeight();
                } else {
                    str = null;
                }
                j.this.f = new MaterialClickInfo.a().a(j.this.bk).a(Float.valueOf(j.this.aF)).b(str).c((Integer) 2).a();
                j.this.a(19);
            }
        }

        protected c() {
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21249b = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.f21250c = "skip_btn_delay_id_" + hashCode();
        this.d = new ut();
        this.e = new uu();
        this.n = 1;
        this.F = true;
        this.M = 0;
        this.N = false;
        this.Q = -1L;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.ae = IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW;
        this.ai = new int[2];
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.aw = false;
        this.ay = true;
        this.aA = true;
        this.aB = true;
        this.aG = false;
        this.aH = 0;
        this.aW = false;
        this.by = false;
        this.aY = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.j.6
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.a("PPSBaseLinkedView", "onVideoRenderStart, alreadyNotified: %s", Boolean.valueOf(j.this.bD));
                if (j.this.bD) {
                    return;
                }
                j.this.bD = true;
                j.this.f();
            }
        };
        this.aZ = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.j.7
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSBaseLinkedView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (j.this.p != null) {
                    j.this.p.b(j);
                }
            }
        };
        this.ba = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.j.8
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (i4 > 0 && !j.this.bD) {
                    hw.a("PPSBaseLinkedView", "onProgress onRenderStart, playtime: %s", Integer.valueOf(i4));
                    j.this.bD = true;
                    j.this.f();
                }
                if (i4 > 0) {
                    j.this.o.e(i4);
                    j.this.e.b(true);
                }
                if (j.this.t != null) {
                    j.this.t.onMediaProgress(i3, i4);
                }
                if (j.this.N) {
                    j.this.d.a(i3);
                }
                if (j.this.p != null) {
                    j.this.p.a(i4, j.this.o == null ? 0L : j.this.o.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStop: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaStop(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStart: %s", Integer.valueOf(i3));
                j.this.N = true;
                j.this.e.b(true);
                j.this.R = i3;
                j.this.P = System.currentTimeMillis();
                if (!j.this.aj) {
                    j.this.l();
                    j.this.k();
                }
                oh ohVar = j.this.p;
                if (i3 > 0) {
                    ohVar.j();
                    j.this.d.e();
                } else {
                    ohVar.i();
                    j.this.d.a(j.this.o);
                }
                if (j.this.l != null && j.this.l.isFromExsplash()) {
                    j.this.aD.b(j.this.aC, 1, j.this.l.getSlotId(), j.this.l.getContentId(), (System.currentTimeMillis() - j.this.h.bV().longValue()) - ((long) j.this.h.bW()));
                }
                if (j.this.t != null) {
                    j.this.t.onMediaStart(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaPause: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaPause(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaCompletion: %s", Integer.valueOf(i3));
                j.this.a(i3, true);
                j.this.bE = true;
                if (j.this.ad == 2 && j.this.k != null && j.this.k.g()) {
                    hw.b("PPSBaseLinkedView", "onMediaCompletion, start play");
                    j.this.e.a();
                }
                if (j.this.t != null) {
                    j.this.t.onMediaCompletion(i3);
                }
            }
        };
        this.bb = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.j.9
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                hw.b("PPSBaseLinkedView", "onDurationReady:");
                if (!j.this.aw && j.this.s != null) {
                    j.this.aw = true;
                    j.this.s.onPrepared();
                }
                if (j.this.az == null) {
                    j.this.az = Integer.valueOf(i3);
                    if (j.this.l == null || j.this.l.getVideoInfo() == null) {
                        return;
                    }
                    j.this.l.getVideoInfo().a(i3);
                }
            }
        };
        this.bc = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i3;
                if (j.this.bC) {
                    if (j.this.ad == 1) {
                        j jVar = j.this;
                        if (!jVar.a(jVar.f)) {
                            return;
                        }
                    }
                    j.this.bC = false;
                    hw.b("PPSBaseLinkedView", "onClick");
                    if (j.this.ad == 2) {
                        i3 = 10;
                    } else {
                        i3 = 2 == j.this.aI.getMode() ? 17 : 9;
                        j.this.g();
                    }
                    j.this.a(i3);
                    j.this.by = true;
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.j.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            j.this.bC = true;
                        }
                    }, 500L);
                }
            }
        };
        this.bd = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.11

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f21254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f21255c;
            private boolean d;
            private boolean e;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.d = false;
                    this.e = false;
                    this.f21254b = motionEvent.getX();
                    this.f21255c = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "startX = %s, startY = %s", Float.valueOf(this.f21254b), Float.valueOf(this.f21255c));
                    }
                    j.this.f = tz.a(view, motionEvent);
                }
                if (2 == motionEvent.getAction()) {
                    this.e = true;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "endX = %s, endY = %s, startX - endX = %s, startY-endY = %s", Float.valueOf(x), Float.valueOf(y), Float.valueOf(this.f21254b - x), Float.valueOf(this.f21255c - y));
                    }
                    if (dw.a(j.this.aT, j.this.aP, this.f21254b - x, this.f21255c - y)) {
                        j.this.v.setOnTouchListener(null);
                        tz.a(view, motionEvent, 1, j.this.f);
                        j.this.a(true, (int) (x - this.f21254b), (int) (y - this.f21255c), 0);
                        j.this.a(18);
                        this.d = true;
                    }
                }
                if (1 == motionEvent.getAction()) {
                    tz.a(view, motionEvent, null, j.this.f);
                    if (!this.d && this.e) {
                        j.this.a(false, (int) (motionEvent.getX() - this.f21254b), (int) (motionEvent.getY() - this.f21255c), 1);
                    }
                }
                return true;
            }
        };
        this.be = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.setEnabled(false);
                j.this.v.setOnTouchListener(null);
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                j.this.f = tz.b(view, motionEvent);
                if (j.this.f != null) {
                    j.this.f.e(0);
                    j.this.f.a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(j.this.g)));
                }
                j.this.a(17);
                return true;
            }
        };
        this.bf = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.13
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    j.this.f = tz.a(view, motionEvent);
                }
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                tz.a(view, motionEvent, null, j.this.f);
                return false;
            }
        };
        this.bg = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.j.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                hw.c("PPSBaseLinkedView", "media play error, isMoved: %s", Boolean.valueOf(j.this.aj));
                j.this.h();
                j.this.i();
                j.this.e.b(false);
                if (j.this.t != null) {
                    hw.b("PPSBaseLinkedView", "call onMediaError. ");
                    j.this.t.onMediaError(i3, i4, i5);
                }
            }
        };
        this.bh = new MuteListener() { // from class: com.huawei.openalliance.ad.views.j.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("PPSBaseLinkedView", "onUnmute");
                if (j.this.u != null) {
                    j.this.u.onUnmute();
                }
                j.this.d.b(1);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("PPSBaseLinkedView", "onMute");
                if (j.this.u != null) {
                    j.this.u.onMute();
                }
                j.this.d.b(0);
            }
        };
        this.bi = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.j.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                j.this.d.g();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                j.this.d.f();
            }
        };
        this.bj = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j.this.a(!view.isSelected());
            }
        };
        this.bC = true;
        this.bD = false;
        this.bE = false;
        b(context);
    }

    public j(Context context) {
        super(context);
        this.f21249b = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.f21250c = "skip_btn_delay_id_" + hashCode();
        this.d = new ut();
        this.e = new uu();
        this.n = 1;
        this.F = true;
        this.M = 0;
        this.N = false;
        this.Q = -1L;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.ae = IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW;
        this.ai = new int[2];
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.aw = false;
        this.ay = true;
        this.aA = true;
        this.aB = true;
        this.aG = false;
        this.aH = 0;
        this.aW = false;
        this.by = false;
        this.aY = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.j.6
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.a("PPSBaseLinkedView", "onVideoRenderStart, alreadyNotified: %s", Boolean.valueOf(j.this.bD));
                if (j.this.bD) {
                    return;
                }
                j.this.bD = true;
                j.this.f();
            }
        };
        this.aZ = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.j.7
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSBaseLinkedView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (j.this.p != null) {
                    j.this.p.b(j);
                }
            }
        };
        this.ba = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.j.8
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (i4 > 0 && !j.this.bD) {
                    hw.a("PPSBaseLinkedView", "onProgress onRenderStart, playtime: %s", Integer.valueOf(i4));
                    j.this.bD = true;
                    j.this.f();
                }
                if (i4 > 0) {
                    j.this.o.e(i4);
                    j.this.e.b(true);
                }
                if (j.this.t != null) {
                    j.this.t.onMediaProgress(i3, i4);
                }
                if (j.this.N) {
                    j.this.d.a(i3);
                }
                if (j.this.p != null) {
                    j.this.p.a(i4, j.this.o == null ? 0L : j.this.o.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStop: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaStop(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaStart: %s", Integer.valueOf(i3));
                j.this.N = true;
                j.this.e.b(true);
                j.this.R = i3;
                j.this.P = System.currentTimeMillis();
                if (!j.this.aj) {
                    j.this.l();
                    j.this.k();
                }
                oh ohVar = j.this.p;
                if (i3 > 0) {
                    ohVar.j();
                    j.this.d.e();
                } else {
                    ohVar.i();
                    j.this.d.a(j.this.o);
                }
                if (j.this.l != null && j.this.l.isFromExsplash()) {
                    j.this.aD.b(j.this.aC, 1, j.this.l.getSlotId(), j.this.l.getContentId(), (System.currentTimeMillis() - j.this.h.bV().longValue()) - ((long) j.this.h.bW()));
                }
                if (j.this.t != null) {
                    j.this.t.onMediaStart(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaPause: %s", Integer.valueOf(i3));
                j.this.a(i3, false);
                if (j.this.t != null) {
                    j.this.t.onMediaPause(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                hw.b("PPSBaseLinkedView", "onMediaCompletion: %s", Integer.valueOf(i3));
                j.this.a(i3, true);
                j.this.bE = true;
                if (j.this.ad == 2 && j.this.k != null && j.this.k.g()) {
                    hw.b("PPSBaseLinkedView", "onMediaCompletion, start play");
                    j.this.e.a();
                }
                if (j.this.t != null) {
                    j.this.t.onMediaCompletion(i3);
                }
            }
        };
        this.bb = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.j.9
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                hw.b("PPSBaseLinkedView", "onDurationReady:");
                if (!j.this.aw && j.this.s != null) {
                    j.this.aw = true;
                    j.this.s.onPrepared();
                }
                if (j.this.az == null) {
                    j.this.az = Integer.valueOf(i3);
                    if (j.this.l == null || j.this.l.getVideoInfo() == null) {
                        return;
                    }
                    j.this.l.getVideoInfo().a(i3);
                }
            }
        };
        this.bc = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i3;
                if (j.this.bC) {
                    if (j.this.ad == 1) {
                        j jVar = j.this;
                        if (!jVar.a(jVar.f)) {
                            return;
                        }
                    }
                    j.this.bC = false;
                    hw.b("PPSBaseLinkedView", "onClick");
                    if (j.this.ad == 2) {
                        i3 = 10;
                    } else {
                        i3 = 2 == j.this.aI.getMode() ? 17 : 9;
                        j.this.g();
                    }
                    j.this.a(i3);
                    j.this.by = true;
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.j.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            j.this.bC = true;
                        }
                    }, 500L);
                }
            }
        };
        this.bd = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.11

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f21254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f21255c;
            private boolean d;
            private boolean e;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.d = false;
                    this.e = false;
                    this.f21254b = motionEvent.getX();
                    this.f21255c = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "startX = %s, startY = %s", Float.valueOf(this.f21254b), Float.valueOf(this.f21255c));
                    }
                    j.this.f = tz.a(view, motionEvent);
                }
                if (2 == motionEvent.getAction()) {
                    this.e = true;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (hw.a()) {
                        hw.a("PPSBaseLinkedView", "endX = %s, endY = %s, startX - endX = %s, startY-endY = %s", Float.valueOf(x), Float.valueOf(y), Float.valueOf(this.f21254b - x), Float.valueOf(this.f21255c - y));
                    }
                    if (dw.a(j.this.aT, j.this.aP, this.f21254b - x, this.f21255c - y)) {
                        j.this.v.setOnTouchListener(null);
                        tz.a(view, motionEvent, 1, j.this.f);
                        j.this.a(true, (int) (x - this.f21254b), (int) (y - this.f21255c), 0);
                        j.this.a(18);
                        this.d = true;
                    }
                }
                if (1 == motionEvent.getAction()) {
                    tz.a(view, motionEvent, null, j.this.f);
                    if (!this.d && this.e) {
                        j.this.a(false, (int) (motionEvent.getX() - this.f21254b), (int) (motionEvent.getY() - this.f21255c), 1);
                    }
                }
                return true;
            }
        };
        this.be = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.setEnabled(false);
                j.this.v.setOnTouchListener(null);
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                j.this.f = tz.b(view, motionEvent);
                if (j.this.f != null) {
                    j.this.f.e(0);
                    j.this.f.a(Float.valueOf(com.huawei.openalliance.ad.utils.d.i(j.this.g)));
                }
                j.this.a(17);
                return true;
            }
        };
        this.bf = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.j.13
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    j.this.f = tz.a(view, motionEvent);
                }
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                tz.a(view, motionEvent, null, j.this.f);
                return false;
            }
        };
        this.bg = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.j.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                hw.c("PPSBaseLinkedView", "media play error, isMoved: %s", Boolean.valueOf(j.this.aj));
                j.this.h();
                j.this.i();
                j.this.e.b(false);
                if (j.this.t != null) {
                    hw.b("PPSBaseLinkedView", "call onMediaError. ");
                    j.this.t.onMediaError(i3, i4, i5);
                }
            }
        };
        this.bh = new MuteListener() { // from class: com.huawei.openalliance.ad.views.j.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("PPSBaseLinkedView", "onUnmute");
                if (j.this.u != null) {
                    j.this.u.onUnmute();
                }
                j.this.d.b(1);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("PPSBaseLinkedView", "onMute");
                if (j.this.u != null) {
                    j.this.u.onMute();
                }
                j.this.d.b(0);
            }
        };
        this.bi = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.j.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                j.this.d.g();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                j.this.d.f();
            }
        };
        this.bj = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.j.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j.this.a(!view.isSelected());
            }
        };
        this.bC = true;
        this.bD = false;
        this.bE = false;
        b(context);
    }
}
