package com.huawei.openalliance.ad.views;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.AdConfigMapKey;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.DialogClickType;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.RewardEvent;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.jm;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.nt;
import com.huawei.openalliance.ad.nx;
import com.huawei.openalliance.ad.om;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pn;
import com.huawei.openalliance.ad.pw;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.ay;
import com.huawei.openalliance.ad.utils.az;
import com.huawei.openalliance.ad.utils.ba;
import com.huawei.openalliance.ad.utils.bi;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dr;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.dw;
import com.huawei.openalliance.ad.uv;
import com.huawei.openalliance.ad.uw;
import com.huawei.openalliance.ad.ux;
import com.huawei.openalliance.ad.uy;
import com.huawei.openalliance.ad.va;
import com.huawei.openalliance.ad.vd;
import com.huawei.openalliance.ad.ve;
import com.huawei.openalliance.ad.vf;
import com.huawei.openalliance.ad.vg;
import com.huawei.openalliance.ad.vh;
import com.huawei.openalliance.ad.vi;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import com.huawei.openalliance.ad.vj;
import com.huawei.openalliance.ad.vk;
import com.huawei.openalliance.ad.vm;
import com.huawei.openalliance.ad.vn;
import com.huawei.openalliance.ad.vo;
import com.huawei.openalliance.ad.vp;
import com.huawei.openalliance.ad.vq;
import com.huawei.openalliance.ad.vr;
import com.huawei.openalliance.ad.vs;
import com.huawei.openalliance.ad.vt;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class PPSRewardView extends AutoScaleSizeRelativeLayout implements jm.a, lu, SegmentMediaStateListener, IViewLifeCycle, com.huawei.openalliance.ad.views.interfaces.k {
    private int A;
    private ViewGroup B;
    private PPSAppDetailTemplateView C;
    private TextView D;
    private MaterialClickInfo E;
    private boolean F;
    private boolean G;
    private MuteListener H;
    private NetworkChangeListener I;
    private com.huawei.openalliance.ad.download.l J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private PPSWebView O;
    private Dialog P;
    private Dialog Q;
    private IRewardAdStatusListener R;
    private INonwifiActionListener S;
    private PPSAppDetailView T;
    private PPSAppDetailView U;
    private PPSExpandButtonDetailView V;
    private t W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final va f20985a;
    private TextView aa;
    private AdLandingPageData ab;
    private az ac;
    private boolean ad;
    private ChoicesView ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private u al;
    private boolean am;
    private f an;
    private boolean ao;
    private boolean ap;
    private RelativeLayout aq;
    private LinearLayout ar;
    private ba as;
    private View.OnClickListener at;
    private VideoInfo au;
    private TextView av;
    private int aw;
    private String ax;
    private hr ay;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private om f20986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jm f20987c;
    private com.huawei.openalliance.ad.inter.data.i d;
    private boolean e;
    private boolean f;
    private RewardVideoView g;
    private int h;
    private int i;
    private int j;
    private TextView k;
    private ImageView l;
    private ImageView m;
    private boolean n;
    private int o;
    private boolean p;
    private Context q;
    private ContentRecord r;
    private ProgressBar s;
    private PPSLabelSourceView t;
    private PPSLabelView u;
    private boolean v;
    private boolean w;
    private dn x;
    private AlertDialog y;
    private u z;

    private int a(int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private boolean a(int i) {
        return (i == 4 || i == 3) ? false : true;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void b(boolean z) {
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setTemplateErrorListener(com.huawei.openalliance.ad.views.interfaces.ab abVar) {
    }

    public void setWebPopUpView(u uVar) {
        this.al = uVar;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setOrientation(int i) {
        if (i == 0 || 1 == i) {
            this.o = i;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setNonwifiDialog(Dialog dialog) {
        this.Q = dialog;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setContentRecord(ContentRecord contentRecord) {
        this.r = contentRecord;
    }

    public void setClickInfo(MaterialClickInfo materialClickInfo) {
        this.E = materialClickInfo;
    }

    public void setBottomViewVisibility(int i) {
        if ((this.ak || this.d.getAppInfo() != null) && getAppDetailView() != null) {
            getAppDetailView().setVisibility(i);
        }
        PPSLabelView pPSLabelView = this.u;
        if (pPSLabelView != null) {
            pPSLabelView.setVisibility(i);
        }
        if (this.aa != null && !dg.b(this.d.getLabel())) {
            this.aa.setVisibility(i);
        }
        TextView textView = this.av;
        if (textView != null) {
            textView.setVisibility(i);
        }
        dw.a(this.t);
    }

    public void setAdDialog(AlertDialog alertDialog) {
        this.y = alertDialog;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.12
            @Override // java.lang.Runnable
            public void run() {
                String str;
                hw.b("PPSRewardView", RewardMethods.RESUME_VIEW);
                if (vm.a(PPSRewardView.this.P) || vm.a(PPSRewardView.this.getNonwifiDialog()) || vm.a(PPSRewardView.this.getAdDialog())) {
                    str = "do not resume when dialog is showing";
                } else {
                    if (PPSRewardView.this.O == null || PPSRewardView.this.O.getVisibility() != 0) {
                        if (PPSRewardView.this.g == null || PPSRewardView.this.r()) {
                            return;
                        }
                        PPSRewardView.this.g.resumeView();
                        if (PPSRewardView.this.p) {
                            PPSRewardView.this.g.a(true, PPSRewardView.this.K);
                            return;
                        }
                        return;
                    }
                    str = "do not resume landing page is showing";
                }
                hw.b("PPSRewardView", str);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void removeRewardAdStatusListener() {
        this.R = null;
    }

    public void removeNonwifiActionListener() {
        this.S = null;
    }

    public boolean r() {
        return this.n;
    }

    public void q() {
        this.am = false;
        setWebPopUpView(null);
        c("130");
    }

    public void play() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.9
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", "manual play()");
                if (PPSRewardView.this.d != null) {
                    PPSRewardView pPSRewardView = PPSRewardView.this;
                    pPSRewardView.a(pPSRewardView.d.P());
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.13
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", RewardMethods.PAUSE_VIEW);
                if (PPSRewardView.this.g != null) {
                    PPSRewardView.this.g.pauseView();
                    PPSRewardView.this.g.a();
                }
            }
        });
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jm jmVar = this.f20987c;
        if (jmVar != null) {
            jmVar.j();
        }
        if (getEndCardDisPlaying()) {
            setBottomViewVisibility(8);
            return;
        }
        String strA = com.huawei.openalliance.ad.utils.c.a(this.r, getContext(), true);
        if (this.av != null) {
            if (!this.af || TextUtils.isEmpty(strA)) {
                this.av.setVisibility(8);
                a(this.aa, this.d.getLabel());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentProgress(String str, String str2, int i, int i2) {
        int i3;
        if (r()) {
            return;
        }
        boolean z = this.L;
        if (!z && this.M < 0) {
            this.M = i2;
            this.L = true;
        } else if (z && (i3 = this.M) >= 0) {
            long j = i2 - i3;
            this.N = j;
            jm jmVar = this.f20987c;
            if (jmVar != null) {
                c(j, jmVar.c());
            }
            om omVar = this.f20986b;
            if (omVar != null) {
                omVar.a(i2, this.h);
            }
        }
        om omVar2 = this.f20986b;
        if (omVar2 != null && omVar2.a(str2, i2)) {
            hw.c("PPSRewardView", "play localFile timeout.");
            onSegmentMediaError(str, str2, i2, -5, -1);
            return;
        }
        int i4 = this.h;
        if (i2 > i4 && i4 > 0) {
            i2 = i4;
        }
        int i5 = i2 / 1000;
        hw.a("PPSRewardView", "onSegmentProgress: %d, originTime: %d", Integer.valueOf(i5), Integer.valueOf(i2));
        g(i5);
        h(i5);
        c(i5);
        if (i2 >= this.h) {
            hw.b("PPSRewardView", "time countdown finish, manually stop");
            RewardVideoView rewardVideoView = this.g;
            if (rewardVideoView != null) {
                rewardVideoView.setVideoFinish(true);
                onSegmentMediaCompletion(null, str2, i2);
                this.g.b();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaStop(String str, String str2, int i) {
        hw.b("PPSRewardView", "onSegmentMediaStop:" + ds.a(str2));
        if (r()) {
            return;
        }
        f(i);
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaStart(String str, String str2, int i) {
        hw.b("PPSRewardView", "onSegmentMediaStart:" + ds.a(str2));
        this.L = true;
        this.ag = true;
        this.M = i;
        ProgressBar progressBar = this.s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaPause(String str, String str2, int i) {
        hw.b("PPSRewardView", "onSegmentMediaPause:" + ds.a(str2));
        f(i);
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaError(String str, String str2, int i, int i2, int i3) {
        hw.c("PPSRewardView", "onSegmentMediaError:" + ds.a(str2) + ", playTime:" + i + ",errorCode:" + i2 + ",extra:" + i3);
        if (a(str2, i, i2)) {
            hw.b("PPSRewardView", "switch to online play.");
            this.f20986b.b(str2);
            return;
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        c();
        f(i);
        IRewardAdStatusListener iRewardAdStatusListener = this.R;
        if (iRewardAdStatusListener != null) {
            iRewardAdStatusListener.onAdError(i2, i3);
        }
        if (cb.e(getContext())) {
            return;
        }
        G();
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaCompletion(String str, String str2, int i) {
        hw.b("PPSRewardView", "onSegmentMediaCompletion:" + ds.a(str2));
        if (r()) {
            return;
        }
        this.n = true;
        f(i);
        O();
        om omVar = this.f20986b;
        if (omVar != null) {
            omVar.a(i, this.h);
        }
    }

    public void onEvent(final RewardEvent rewardEvent, final boolean z) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.4
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", "onEvent: %s", rewardEvent.a());
                if (RewardEvent.CLOSE != rewardEvent && (RewardEvent.BACKPRESSED != rewardEvent || PPSRewardView.this.Z())) {
                    return;
                }
                PPSRewardView.this.d(z);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void onEvent(RewardEvent rewardEvent) {
        onEvent(rewardEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("PPSRewardView", "onDetechedFromWindow");
        jm jmVar = this.f20987c;
        if (jmVar != null) {
            jmVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.a("PPSRewardView", "onAttachedToWindow");
        jm jmVar = this.f20987c;
        if (jmVar != null) {
            jmVar.h();
        }
    }

    public void o() {
        getWebPopUpView().b();
        setWebPopUpView(null);
        this.am = false;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void n() {
        this.P = null;
        resumeView();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void m() {
        this.P = null;
        if (this.ag) {
            a((Integer) 3);
        }
        this.f20985a.a();
        L();
    }

    public void l() {
        hw.b("PPSRewardView", "handleMaskingClick, isDownloadAd: %s", Boolean.valueOf(this.f20986b.b(this.d)));
        a((Integer) 14);
        this.f20986b.a(22, getClickInfo());
        f fVar = this.an;
        if (fVar != null) {
            fVar.a();
            removeView(this.an);
        }
        if (getEndCardView() != null) {
            getEndCardView().c();
        }
        setBottomViewVisibility(0);
        d(this.ax);
        this.v = false;
        this.ah = false;
        setClickInfo(null);
    }

    public void k() {
        if (getAdDialog() != null || getPopUpView() == null || this.d.ag()) {
            return;
        }
        setAdDialog(getPopUpView().getDialog());
        boolean zA = getPopUpView().a();
        hw.b("PPSRewardView", "show ad dialog, ret: %s", Boolean.valueOf(zA));
        if (zA) {
            a("127");
            pauseView();
            getAdDialog().setOnCancelListener(new uv(this));
        }
    }

    public boolean j() {
        return this.f20986b.b(this.d) && getAppDetailView() != null && this.T.getAppDownloadButton().getStatus() == AppStatus.DOWNLOAD;
    }

    public void i() {
        if (this.K) {
            J();
        } else {
            I();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public boolean h() {
        return getAppDetailView() instanceof PPSExpandButtonDetailView;
    }

    public int getmInsreTemplate() {
        return this.A;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public WebSettings getWebViewSettings() {
        PPSWebView pPSWebView = this.O;
        if (pPSWebView != null) {
            return pPSWebView.getSettings();
        }
        return null;
    }

    public u getWebPopUpView() {
        return this.al;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public u getPopUpView() {
        return this.z;
    }

    public int getOrientation() {
        return this.o;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public Dialog getNonwifiDialog() {
        return this.Q;
    }

    public t getEndCardView() {
        return this.W;
    }

    public boolean getEndCardDisPlaying() {
        return this.v;
    }

    public MaterialClickInfo getClickInfo() {
        return this.E;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public az getAppointJs() {
        return this.ac;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public AppDownloadButton getAppDownloadButton() {
        if (getAppDetailView() == null) {
            return null;
        }
        return getAppDetailView().getAppDownloadButton();
    }

    public PPSAppDetailView getAppDetailView() {
        return this.T;
    }

    public AlertDialog getAdDialog() {
        return this.y;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void g() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.2
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", RewardMethods.STOP_VIEW);
                if (PPSRewardView.this.O != null && bi.e(PPSRewardView.this.d.I()) && PPSRewardView.this.ap) {
                    PPSRewardView.this.O.onStop();
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void f() {
        setNonwifiDialog(null);
        this.p = true;
        L();
    }

    public void e(boolean z) {
        this.K = z;
        N();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void e() {
        setNonwifiDialog(null);
        this.p = true;
        this.ad = false;
        RewardVideoView rewardVideoView = this.g;
        if (rewardVideoView != null) {
            rewardVideoView.resumeView();
            this.g.a(true, this.K);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0) {
                setClickInfo(tz.a(this, motionEvent));
                if (getEndCardView() != null && getEndCardView().getVisibility() == 0) {
                    getEndCardView().setButtonAndSixElementsClickInfo(getClickInfo());
                }
            }
            if (1 == iA) {
                tz.a(this, motionEvent, null, getClickInfo());
                if (getEndCardView() != null && getEndCardView().getVisibility() == 0) {
                    getEndCardView().setButtonAndSixElementsClickInfo(getClickInfo());
                }
            }
        } catch (Throwable th) {
            hw.c("PPSRewardView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.3
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", RewardMethods.DESTROY_VIEW);
                if (PPSRewardView.this.d != null && PPSRewardView.this.d.getAppInfo() != null) {
                    com.huawei.openalliance.ad.download.app.e.h().b(PPSRewardView.this.d.getAppInfo(), PPSRewardView.this.J);
                }
                if (PPSRewardView.this.g != null) {
                    PPSRewardView.this.g.b();
                    PPSRewardView.this.g.destroyView();
                }
                if (PPSRewardView.this.O != null) {
                    PPSRewardView.this.O.destroy();
                }
                if (PPSRewardView.this.P != null) {
                    if (PPSRewardView.this.P.isShowing()) {
                        PPSRewardView.this.P.dismiss();
                    }
                    PPSRewardView.this.P = null;
                }
                if (PPSRewardView.this.getAdDialog() != null) {
                    if (PPSRewardView.this.getAdDialog().isShowing() && PPSRewardView.this.getPopUpView() != null) {
                        PPSRewardView.this.getPopUpView().b();
                    }
                    PPSRewardView.this.setAdDialog(null);
                }
                PPSRewardView.this.f20985a.b();
                if (PPSRewardView.this.z != null) {
                    PPSRewardView.this.z.c();
                    PPSRewardView.this.z = null;
                }
                com.huawei.openalliance.ad.download.app.d.a().c(PPSRewardView.this.ay);
                if (PPSRewardView.this.W != null) {
                    PPSRewardView.this.W.a();
                }
            }
        });
    }

    public void d(boolean z) {
        ((PPSRewardActivity) getContext()).setRequestedOrientation(getOrientation());
        setAppDetailViewType(0);
        boolean zX = fp.b(this.q).X();
        hw.b("PPSRewardView", "handleCloseClick, closeBtnClicked: %s, showDialogForCloseBtn: %s", Boolean.valueOf(z), Boolean.valueOf(zX));
        if (!z || zX) {
            g(z);
            return;
        }
        if (this.ag) {
            a((Integer) 3);
        }
        L();
    }

    public void d() {
        if (this.v || getAppDetailView() == null) {
            return;
        }
        getAppDetailView().setVisibility(0);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public boolean c(boolean z) {
        AppDownloadButton appDownloadButton;
        ba baVar;
        if ((z && !pa.v(this.ab.f())) || this.G || (appDownloadButton = getAppDetailView().getAppDownloadButton()) == null || appDownloadButton.d() || this.am || appDownloadButton.getStatus() != AppStatus.DOWNLOAD) {
            return false;
        }
        this.am = true;
        if (!z && (baVar = this.as) != null) {
            if (baVar.a()) {
                return false;
            }
            this.as.a(true);
            this.G = true;
        }
        X();
        getWebPopUpView().setAdPopupData(this.ab);
        boolean zA = getWebPopUpView().a();
        if (zA) {
            c("127");
        }
        return zA;
    }

    public void c(String str) {
        this.f20986b.a(str, this.r);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void c() {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public void b(String str) {
        this.f20986b.a(str, this.d, this.R);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public void b(com.huawei.openalliance.ad.views.interfaces.b bVar) {
        IRewardAdStatusListener iRewardAdStatusListener;
        String str;
        hw.b("PPSRewardView", "onClick, isAppRelated: %s, isHandled: %s, destination:%s", Boolean.valueOf(bVar.a()), Boolean.valueOf(bVar.b()), bVar.c());
        this.d.e(true);
        com.huawei.openalliance.ad.utils.ah.b();
        if (!ClickDestination.WEB.equals(bVar.c()) || this.d.I() == 0) {
            str = ("app".equals(bVar.c()) || ClickDestination.HARMONY_SERVICE.equals(bVar.c())) ? "4" : "2";
            iRewardAdStatusListener = this.R;
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdClicked();
            }
            a((Integer) 1);
            this.f20985a.d();
            if (bVar.b()) {
            }
            b(bVar.d());
        }
        b(str);
        iRewardAdStatusListener = this.R;
        if (iRewardAdStatusListener != null) {
            iRewardAdStatusListener.onAdClicked();
        }
        a((Integer) 1);
        this.f20985a.d();
        if (bVar.b()) {
            b(bVar.d());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    @Override // com.huawei.openalliance.ad.jm.a
    public void b(long j, int i) {
        int i2;
        int playedTime;
        RewardVideoView rewardVideoView;
        if (!this.f) {
            this.f = true;
            if (this.f20986b != null) {
                int playedProgress = 0;
                if (r()) {
                    playedTime = this.au.getVideoDuration();
                } else {
                    RewardVideoView rewardVideoView2 = this.g;
                    if (rewardVideoView2 != null) {
                        playedTime = rewardVideoView2.getPlayedTime();
                    } else {
                        i2 = 0;
                    }
                    if (r()) {
                        playedProgress = 100;
                    } else {
                        rewardVideoView = this.g;
                        if (rewardVideoView != null) {
                            playedProgress = rewardVideoView.getPlayedProgress();
                        }
                    }
                    this.f20986b.a(j, i, i2, playedProgress);
                }
                i2 = playedTime;
                if (r()) {
                    playedProgress = 100;
                } else {
                    rewardVideoView = this.g;
                    if (rewardVideoView != null) {
                        playedProgress = rewardVideoView.getPlayedProgress();
                    }
                }
                this.f20986b.a(j, i, i2, playedProgress);
            }
        }
        Z();
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b() {
        this.e = false;
        this.f = false;
        long jC = as.c();
        hw.a("PPSRewardView", "onViewPhysicalShowStart: %s", Long.valueOf(jC));
        String strValueOf = String.valueOf(jC);
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar != null) {
            iVar.g(false);
            this.d.a(false);
            this.d.h(strValueOf);
            this.d.c(jC);
        }
        om omVar = this.f20986b;
        if (omVar != null) {
            omVar.a(strValueOf);
            this.f20986b.a(jC);
        }
        RewardVideoView rewardVideoView = this.g;
        if (rewardVideoView != null) {
            rewardVideoView.a(strValueOf);
            this.g.a(jC);
        }
        AdLandingPageData adLandingPageData = this.ab;
        if (adLandingPageData != null && this.O != null) {
            adLandingPageData.c(strValueOf);
            this.ab.a(jC);
            this.O.setAdLandingPageData(this.ab);
        }
        if (this.ab != null && getAppDetailView() != null) {
            this.ab.c(strValueOf);
            this.ab.a(jC);
            getAppDetailView().a(strValueOf);
            getAppDetailView().a(jC);
        }
        if (getEndCardView() != null) {
            getEndCardView().a(strValueOf);
            getEndCardView().a(jC);
        }
        om omVar2 = this.f20986b;
        if (omVar2 != null) {
            omVar2.b();
        }
        if (this.O != null && this.f20986b.b(this.d) && this.ap) {
            this.O.onResume();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void addRewardAdStatusListener(IRewardAdStatusListener iRewardAdStatusListener) {
        if (iRewardAdStatusListener == null) {
            return;
        }
        this.R = iRewardAdStatusListener;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void addNonwifiActionListener(INonwifiActionListener iNonwifiActionListener) {
        if (iNonwifiActionListener == null) {
            return;
        }
        this.S = iNonwifiActionListener;
        if (getAppDetailView() != null) {
            getAppDetailView().setOnNonWifiDownloadListener(iNonwifiActionListener);
        }
        if (getEndCardView() != null) {
            getEndCardView().setOnNonWifiDownloadListener(iNonwifiActionListener);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(boolean z, String str) {
        if (getAdDialog() != null) {
            getAdDialog().dismiss();
            if (z) {
                resumeView();
            }
            setAdDialog(null);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(boolean z) {
        com.huawei.openalliance.ad.inter.data.i iVar;
        if (!z && this.ad && (iVar = this.d) != null && iVar.ak()) {
            pauseView();
            D();
        }
        if (z) {
            E();
            e();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(String str) {
        if (this.d == null || this.q == null || getPopUpView() == null || TextUtils.isEmpty(str)) {
            hw.c("PPSRewardView", "invalid parameter");
            return;
        }
        setContentRecord(pw.a(this.d));
        getPopUpView();
        u.a(this.q, str, this.r);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(Integer num) {
        if (this.f20987c != null) {
            a(Long.valueOf(System.currentTimeMillis() - this.f20987c.d()), Integer.valueOf(this.f20987c.c()), num);
        }
    }

    public void a(com.huawei.openalliance.ad.views.interfaces.b bVar) {
        if (bVar == null || bVar.e() == null) {
            hw.c("PPSRewardView", "invalid click");
            return;
        }
        Integer numE = bVar.e();
        int iIntValue = numE.intValue();
        hw.b("PPSRewardView", "click action: %d", numE);
        if (iIntValue == 0) {
            b(bVar);
        } else if (iIntValue == 1 && j()) {
            this.G = true;
            k();
        }
    }

    public void a(MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar == null || TextUtils.isEmpty(iVar.M())) {
            hw.b("PPSRewardView", "on download dialog clicked, landing page url is empty.");
            return;
        }
        om omVar = this.f20986b;
        if (omVar != null && omVar.a(21, materialClickInfo)) {
            hw.b("PPSRewardView", "click dialog to landing page.");
            b("2");
        }
        if (!this.e) {
            a(Long.valueOf(this.d.getMinEffectiveShowTime()), Integer.valueOf(this.d.getMinEffectiveShowRatio()), (Integer) 1);
        }
        a(false, DialogClickType.NO_BUTTON_AREA);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(final IRewardAd iRewardAd, final boolean z) {
        if (this.d != null) {
            hw.c("PPSRewardView", "has been registered");
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    try {
                        IRewardAd iRewardAd2 = iRewardAd;
                        if (iRewardAd2 instanceof com.huawei.openalliance.ad.inter.data.i) {
                            PPSRewardView.this.d = (com.huawei.openalliance.ad.inter.data.i) iRewardAd2;
                            PPSRewardView pPSRewardView = PPSRewardView.this;
                            pPSRewardView.setContentRecord(pw.a(pPSRewardView.d));
                            PPSRewardView pPSRewardView2 = PPSRewardView.this;
                            pPSRewardView2.a(pPSRewardView2.getContext(), PPSRewardView.this.r);
                            if (PPSRewardView.this.d.ag()) {
                                PPSRewardView.this.c();
                            }
                            PPSRewardView pPSRewardView3 = PPSRewardView.this;
                            pPSRewardView3.au = pPSRewardView3.d.P();
                            if (PPSRewardView.this.au != null) {
                                hw.b("PPSRewardView", "register:" + iRewardAd.getContentId());
                                PPSRewardView.this.w();
                                PPSRewardView.this.t();
                                PPSRewardView.this.f(z);
                                PPSRewardView.this.W();
                                PPSRewardView.this.v();
                                if (!PPSRewardView.this.af) {
                                    String adChoiceUrl = iRewardAd.getAdChoiceUrl();
                                    String adChoiceIcon = iRewardAd.getAdChoiceIcon();
                                    if (!TextUtils.isEmpty(adChoiceUrl)) {
                                        if (TextUtils.isEmpty(adChoiceIcon)) {
                                            PPSRewardView.this.ae.b();
                                        } else {
                                            PPSRewardView.this.ae.setAdChoiceIcon(adChoiceIcon);
                                        }
                                    }
                                    PPSRewardView.this.ae.setOnClickListener(new ux(PPSRewardView.this, iRewardAd));
                                }
                                if (PPSRewardView.this.R != null) {
                                    PPSRewardView.this.R.onAdShown();
                                }
                                PPSRewardView.this.d.f(true);
                                va vaVar = PPSRewardView.this.f20985a;
                                PPSRewardView pPSRewardView4 = PPSRewardView.this;
                                vaVar.a(pPSRewardView4, iRewardAd, pPSRewardView4.g);
                                return;
                            }
                            str = "there is no video";
                        } else {
                            PPSRewardView.this.c();
                            str = "there is no reward ad";
                        }
                        hw.c("PPSRewardView", str);
                    } catch (Throwable th) {
                        hw.d("PPSRewardView", "refresh ui error " + th.getClass().getSimpleName());
                    }
                }
            });
        }
    }

    public void a(Drawable drawable, Drawable drawable2) {
        ViewGroup viewGroup;
        getAppDetailView().setAppIconImageDrawable(drawable);
        PPSAppDetailTemplateView pPSAppDetailTemplateView = this.C;
        if (pPSAppDetailTemplateView != null) {
            pPSAppDetailTemplateView.setAppIconImageDrawable(drawable);
        }
        if (!(drawable instanceof com.huawei.openalliance.ad.views.gif.b) && (viewGroup = this.B) != null && drawable2 != null && this.A != 3) {
            viewGroup.setBackground(drawable2);
            View viewD = dr.d(this.q);
            if (viewD != null) {
                this.B.addView(viewD, 0);
            }
        }
        hw.a("PPSRewardView", "get icon suucess");
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a(long j, int i) {
        c(this.N, i);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a() {
        this.M = -1;
        this.L = false;
    }

    private void z() {
        PPSWebView pPSWebView = this.O;
        if (pPSWebView != null) {
            pPSWebView.setVisibility(8);
            this.O.setAdLandingPageData(this.ab);
            A();
            if (this.f20986b.b(this.d) && this.ao) {
                this.O.loadPage();
                this.ap = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0038 A[PHI: r1
      0x0038: PHI (r1v20 java.util.List<com.huawei.openalliance.ad.inter.data.ImageInfo>) = 
      (r1v5 java.util.List<com.huawei.openalliance.ad.inter.data.ImageInfo>)
      (r1v3 java.util.List<com.huawei.openalliance.ad.inter.data.ImageInfo>)
     binds: [B:8:0x0036, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    private void y() {
        AppInfo appInfo = new AppInfo();
        appInfo.o(this.d.J());
        List<ImageInfo> listL = this.d.L();
        if (bm.a(listL) || TextUtils.isEmpty(listL.get(0).getUrl())) {
            listL = this.d.K();
            if (!bm.a(listL)) {
                appInfo.d(listL.get(0).getUrl());
            }
        } else {
            appInfo.d(listL.get(0).getUrl());
        }
        if (7 == this.d.I() && this.r.ag() != null) {
            appInfo.a(this.r.ag().getPackageName());
            appInfo.x(this.r.ag().l());
            appInfo.n(this.r.ag().getAppName());
        }
        this.ab.a(appInfo);
        this.ak = true;
        getAppDetailView().setAppRelated(false);
        if (this.d.I() == 0) {
            getAppDetailView().b();
        }
    }

    private boolean x() {
        int i = this.A;
        return i == 1 || i == 3 || i == 4 || i == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        int i;
        hw.b("PPSRewardView", "initContentView");
        this.u.setDataAndRefreshUi(this.r);
        if (this.f20986b.b(this.r) && ((i = this.A) == 4 || i == 5)) {
            PPSExpandButtonDetailView pPSExpandButtonDetailView = this.V;
            this.T = pPSExpandButtonDetailView;
            pPSExpandButtonDetailView.setExtraViewVisibility(8);
        } else {
            this.T = C() ? this.V : this.U;
            getAppDetailView().setBackgroundColor(getResources().getColor(R.color.hiad_90_percent_white));
        }
        getAppDetailView().setVisibility(0);
        this.K = this.d.ad();
        this.ao = fp.b(this.q).Y();
        if (nx.a(this.r)) {
            this.ao = false;
            ((RelativeLayout.LayoutParams) this.aq.getLayoutParams()).addRule(2, R.id.reward_download_container);
        }
        this.ab = new AdLandingPageData(pw.a(this.d), getContext(), true);
        N();
        this.ab.e(this.d.ak());
        z();
        if (!this.f20986b.a(this.d) || com.huawei.openalliance.ad.utils.c.b(this.q, this.r)) {
            y();
        } else {
            this.ab.c(true);
            com.huawei.openalliance.ad.download.app.e.h().a(this.d.getAppInfo(), this.J);
        }
        getAppDetailView().setAppDetailClickListener(new ve(this));
        getAppDetailView().setNeedPerBeforDownload(true);
        if (x()) {
            getAppDetailView().setLoadAppIconSelf(false);
        }
        getAppDetailView().setAdLandingData(this.ab);
        getAppDetailView().setInteractedListener(new vd(this));
        getAppDetailView().setInterType(this.d.I());
        a(this.r.ag());
        this.u.a(AdSource.a(this.d.t()), this.d.u());
        String strA = com.huawei.openalliance.ad.utils.c.a(this.r, getContext(), true);
        this.ax = strA;
        d(strA);
        dw.a(this.t);
        this.F = this.f20986b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        hw.b("PPSRewardView", "init pop-up");
        this.aj = pa.s(this.d.getCtrlSwitchs());
        boolean zU = fp.b(this.q).U();
        if (!this.aj) {
            hw.b("PPSRewardView", "switch is off, skip init popup.");
            return;
        }
        if (bi.g(this.d.I()) || this.d.getAppInfo() == null) {
            hw.b("PPSRewardView", "appInfo is null or web, skip init popup");
            return;
        }
        this.z = new u(getContext(), getOrientation());
        getPopUpView().setAdPopupData(this.ab);
        getPopUpView().setPopUpClickListener(new vq(this, zU));
        u();
    }

    private void u() {
        View viewFindViewById = findViewById(R.id.reward_content_area);
        viewFindViewById.setClickable(true);
        viewFindViewById.setOnTouchListener(new uy(this));
        PPSAppDetailTemplateView pPSAppDetailTemplateView = this.C;
        if (pPSAppDetailTemplateView != null) {
            pPSAppDetailTemplateView.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        PPSAppDetailTemplateView pPSAppDetailTemplateView;
        hw.b("PPSRewardView", "initTemplateView");
        if (this.f20986b.b(this.r)) {
            int i = this.A;
            if ((i != 3 && i != 4 && i != 5) || (pPSAppDetailTemplateView = this.C) == null || this.D == null) {
                return;
            }
            pPSAppDetailTemplateView.setVisibility(0);
            this.C.setAdLandingData(this.ab);
            com.huawei.openalliance.ad.inter.data.i iVar = this.d;
            if (iVar == null || iVar.getAppInfo() == null || TextUtils.isEmpty(this.d.getAppInfo().getAppDesc())) {
                this.D.setVisibility(4);
            } else {
                this.D.setVisibility(0);
                this.D.setText(this.d.getAppInfo().getAppDesc());
            }
            b(this.q);
            B();
        }
    }

    private void setAppDetailViewType(int i) {
        if (getAppDetailView() != null) {
            getAppDetailView().setDetailViewType(i);
        }
    }

    private void s() {
        this.k.setMaxWidth((int) (((double) com.huawei.openalliance.ad.utils.d.a(getContext(), dk.k(getContext()))) * 0.5d));
    }

    private void h(int i) {
        if (this.d.ag()) {
            return;
        }
        int i2 = this.i;
        int i3 = i2 - i;
        if ((i3 >= 0 && i3 != 0) || i2 <= 0) {
            return;
        }
        P();
    }

    private void g(boolean z) {
        if (!cb.e(getContext()) && !F()) {
            L();
            return;
        }
        if (!this.d.ag()) {
            pauseView();
            K();
            return;
        }
        if (z) {
            if (this.ag) {
                a((Integer) 3);
            }
            L();
        } else if (this.w || !(this.ah || U())) {
            L();
        } else {
            pauseView();
            V();
        }
    }

    private void g(int i) {
        if (this.d.ag()) {
            return;
        }
        int i2 = this.j;
        int i3 = i2 - i;
        if ((i3 >= 0 && i3 != 0) || i2 < 0) {
            return;
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.5
            @Override // java.lang.Runnable
            public void run() {
                PPSRewardView.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z) {
        hw.b("PPSRewardView", "initVideoView");
        dn dnVar = this.x;
        String strC = dnVar.c(dnVar.e(this.au.getVideoDownloadUrl()));
        if (com.huawei.openalliance.ad.utils.ai.b(strC)) {
            hw.b("PPSRewardView", "change path to local");
            this.au.a(strC);
        }
        jm jmVar = this.f20987c;
        if (jmVar != null) {
            jmVar.b(this.d.getMinEffectiveShowTime(), this.d.getMinEffectiveShowRatio());
        }
        om omVar = this.f20986b;
        if (omVar != null) {
            omVar.c(this.d);
        }
        RewardVideoView rewardVideoView = this.g;
        if (rewardVideoView != null) {
            rewardVideoView.setAudioFocusType(this.d.al());
            this.g.a(this);
            this.g.a(this.H);
            this.g.a(this.A, this.f20986b.b(this.r));
            this.g.setRewardAd(this.d);
            this.g.setVisibility(0);
            this.g.a(this.I);
        }
        int iAj = (int) this.d.aj();
        this.h = iAj;
        this.i = nx.a(this.q, iAj);
        this.j = b(this.h);
        if (z) {
            a(this.au);
        }
    }

    private void f(int i) {
        int i2;
        if (this.L && (i2 = this.M) >= 0) {
            this.N = i - i2;
            this.L = false;
        }
        this.M = -1;
    }

    private int e(String str) {
        Integer numJ;
        if (str == null || str.trim().length() == 0 || (numJ = dg.j(str)) == null || numJ.intValue() < 0 || numJ.intValue() > 100) {
            return 90;
        }
        return numJ.intValue();
    }

    private int e(int i) {
        return a(i, this.h / 1000);
    }

    private void d(String str) {
        if (!this.af || TextUtils.isEmpty(str)) {
            this.av.setVisibility(8);
            a(this.aa, this.d.getLabel());
        } else {
            this.av.setText(str);
            this.aa.setVisibility(8);
            this.av.setVisibility(0);
        }
    }

    private int d(int i) {
        return a(i, this.i);
    }

    private void c(long j, int i) {
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar == null || this.e || j <= iVar.getMinEffectiveShowTime()) {
            return;
        }
        this.e = true;
        a(Long.valueOf(j), Integer.valueOf(i), (Integer) null);
    }

    private void c(int i) {
        if (this.k == null) {
            return;
        }
        this.k.setText(this.f20986b.a(e(i), d(i), this.d));
        if (this.k.getVisibility() != 0) {
            this.k.setVisibility(0);
        }
    }

    private void b(Integer num) {
        if (this.f20986b != null) {
            if (num == null) {
                num = 7;
            }
            this.f20986b.a(num.intValue(), getClickInfo());
        }
    }

    private void b(Context context, ContentRecord contentRecord) {
        int iA = this.f20986b.a(contentRecord, getOrientation());
        this.A = iA;
        hw.b("PPSRewardView", "insreTemplate %s", Integer.valueOf(iA));
        int i = this.A;
        if (i == 1) {
            a(context, R.layout.hiad_reward_layout, R.id.reward_layout, R.color.hiad_emui_color_subbg);
            return;
        }
        if (i == 3) {
            a(context, R.layout.hiad_reward_layout3, R.id.reward_layout, R.color.hiad_emui_color_subbg);
            PPSAppDetailTemplateView pPSAppDetailTemplateView = (PPSAppDetailTemplateView) findViewById(R.id.reward_app_detail_template);
            this.C = pPSAppDetailTemplateView;
            pPSAppDetailTemplateView.setLoadAppIconSelf(false);
            this.D = (TextView) findViewById(R.id.reward_app_detail_appdesc_template);
            return;
        }
        if (i == 4) {
            a(context, R.layout.hiad_reward_layout4, R.id.reward_layout, R.color.hiad_emui_color_subbg);
            this.C = (PPSAppDetailTemplateView) findViewById(R.id.reward_app_detail_template);
            this.D = (TextView) findViewById(R.id.reward_app_detail_appdesc_template);
        } else {
            if (i != 5) {
                a(context, R.layout.hiad_reward_layout, R.id.reward_layout, R.color.hiad_black);
                return;
            }
            a(context, R.layout.hiad_reward_layout5, R.id.reward_layout, R.color.hiad_emui_color_subbg);
            PPSAppDetailTemplateView pPSAppDetailTemplateView2 = (PPSAppDetailTemplateView) findViewById(R.id.reward_app_detail_template);
            this.C = pPSAppDetailTemplateView2;
            pPSAppDetailTemplateView2.setLoadAppIconSelf(false);
            this.D = (TextView) findViewById(R.id.reward_app_detail_appdesc_template);
        }
    }

    private void b(Context context) {
        if (as.n(context)) {
            this.D.setTextSize(1, 21.0f);
            int i = this.A;
            if (i == 3) {
                this.D.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin - ((int) dr.a(context, 14)));
                this.C.setLayoutParams(layoutParams);
                return;
            }
            if (i == 4) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - ((int) dr.a(context, 8)), layoutParams2.rightMargin, layoutParams2.bottomMargin);
                this.C.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.D.getLayoutParams();
                layoutParams3.setMargins(layoutParams3.leftMargin, layoutParams3.topMargin, layoutParams3.rightMargin, layoutParams3.bottomMargin);
                this.D.setLayoutParams(layoutParams3);
                return;
            }
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
            layoutParams4.setMargins(layoutParams4.leftMargin, layoutParams4.topMargin, layoutParams4.rightMargin, layoutParams4.bottomMargin + ((int) dr.a(context, 2)));
            this.C.setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.D.getLayoutParams();
            layoutParams5.setMargins(layoutParams5.leftMargin, layoutParams5.topMargin, layoutParams5.rightMargin, layoutParams5.bottomMargin);
            this.D.setLayoutParams(layoutParams5);
        }
    }

    private int b(int i) {
        String str;
        int iE;
        setContentRecord(pw.a(this.d));
        Map<String, String> mapAK = this.r.aK();
        if (mapAK != null) {
            str = mapAK.get(AdConfigMapKey.MAPKEY_RWDCLOSTBTN);
            iE = e(str);
        } else {
            str = "";
            iE = 90;
        }
        hw.b("PPSRewardView", "Reward close button input string is " + str);
        return Math.min((i * iE) / 100000, 27);
    }

    private boolean a(String str, int i, int i2) {
        return (this.g == null || dg.l(str) || !this.g.a(i, this.K, i2)) ? false : true;
    }

    private void a(Long l, Integer num, Integer num2) {
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar == null) {
            return;
        }
        boolean zA = com.huawei.openalliance.ad.utils.c.a(iVar.d(), num2);
        if (!this.d.X() || (zA && !this.d.b())) {
            om omVar = this.f20986b;
            if (omVar != null) {
                omVar.a(l.longValue(), num.intValue(), num2);
            }
            if (zA) {
                this.d.a(true);
            }
            if (this.d.X()) {
                return;
            }
            this.d.g(true);
            this.f20985a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final VideoInfo videoInfo) {
        if (videoInfo == null) {
            return;
        }
        boolean zF = F();
        if (zF || cb.c(getContext())) {
            hw.b("PPSRewardView", "video is cached or is wifi network");
            if (zF) {
                this.ad = false;
            }
            RewardVideoView rewardVideoView = this.g;
            if (rewardVideoView != null) {
                rewardVideoView.a(true, this.K);
                return;
            }
            return;
        }
        if (!cb.e(getContext())) {
            G();
            return;
        }
        hw.b("PPSRewardView", "video not cached, stop");
        this.p = false;
        RewardVideoView rewardVideoView2 = this.g;
        if (rewardVideoView2 != null) {
            rewardVideoView2.b();
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.6
            @Override // java.lang.Runnable
            public void run() {
                if ((PPSRewardView.this.S == null || !PPSRewardView.this.S.onVideoPlay(videoInfo.getVideoFileSize())) && (PPSRewardView.this.d == null || PPSRewardView.this.d.ak())) {
                    PPSRewardView.this.D();
                } else {
                    hw.b("PPSRewardView", "app has handled, do not pop up dialog");
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PPSRewardView.this.p = true;
                            PPSRewardView.this.ad = false;
                            if (PPSRewardView.this.g != null) {
                                PPSRewardView.this.g.a(true, PPSRewardView.this.K);
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getIconUrl()) || !this.f20986b.b(this.r)) {
            return;
        }
        int i = this.A;
        if (i == 1 || i == 3 || i == 5) {
            getAppDetailView().a(new ImageView(getContext()), appInfo.getIconUrl(), new vo(this));
        }
    }

    private static void a(TextView textView, String str) {
        if (textView == null || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ContentRecord contentRecord) {
        b(context, contentRecord);
        this.aq = (RelativeLayout) findViewById(R.id.reward_content_area);
        this.ar = (LinearLayout) findViewById(R.id.reward_close_container);
        TextView textView = (TextView) findViewById(R.id.reward_count_down);
        this.k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.l = (ImageView) findViewById(R.id.reward_mute_icon);
        this.m = (ImageView) findViewById(R.id.reward_close);
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar == null || !iVar.ag()) {
            M();
        }
        this.g = (RewardVideoView) findViewById(R.id.reward_video_view);
        this.U = (PPSAppDetailView) findViewById(R.id.reward_download_area);
        this.V = (PPSExpandButtonDetailView) findViewById(R.id.reward_expand_button_download_area);
        this.ae = (ChoicesView) findViewById(R.id.reward_why_this_ad);
        boolean zD = cc.a(context).d();
        this.af = zD;
        if (zD) {
            this.ae.setVisibility(8);
        }
        setBackgroundColor(-16777216);
        setUseRatioInMatchParentMode(false);
        this.l.setImageResource(dk.a(this.A, true));
        this.l.setOnClickListener(this.at);
        dk.a(this.l);
        this.m.setOnClickListener(this.at);
        this.O = (PPSWebView) findViewById(R.id.reward_webview);
        this.s = (ProgressBar) findViewById(R.id.reward_progress);
        this.t = (PPSLabelSourceView) findViewById(R.id.custom_ad_bg_layout);
        boolean zA = as.a(this.af, contentRecord.bf(), contentRecord.be());
        this.t.b(context, zA);
        this.t.a(this, contentRecord, zA);
        this.aa = this.t.getAdSource();
        this.u = this.t.getAdLabel();
        this.av = this.t.getAdJumpText();
        if (!zA || a(this.A) || bi.c(contentRecord.D())) {
            if (zA) {
                this.av.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
                this.av.setPadding(as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0, as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0);
            }
            this.av.setTextColor(getResources().getColor(R.color.hiad_ad_source_color));
            this.av.setTextSize(1, 10.0f);
        }
        s();
        if (nx.a(contentRecord)) {
            this.O.setWebViewBackgroundColor(getResources().getColor(R.color.hiad_black));
            this.O.d();
        }
        this.O.setPPSWebEventCallback(nt.a());
        this.x = com.huawei.openalliance.ad.dk.a(context, "normal");
        dk.a(context, getOrientation(), findViewById(R.id.reward_layout));
        if (contentRecord == null || contentRecord.ag() == null) {
            return;
        }
        this.ay = new hr(new TextView[]{this.av, this.aa}, this.r, this, new boolean[]{true, this.af}, this.d.getLabel());
        com.huawei.openalliance.ad.download.app.d.a().b(this.ay);
    }

    private void a(Context context, int i, int i2, int i3) {
        inflate(context, i, this);
        this.aw = i;
        ViewGroup viewGroup = (ViewGroup) findViewById(i2);
        this.B = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(i3));
    }

    private void a(Context context) {
        this.q = context;
        try {
            this.f20986b = new nx(context, this);
            this.f20987c = new jm(this, this);
        } catch (Throwable th) {
            hw.c("PPSRewardView", "init error " + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z() {
        PPSLabelView pPSLabelView = this.u;
        if (pPSLabelView == null || !pPSLabelView.c()) {
            return false;
        }
        this.u.b();
        return true;
    }

    private void Y() {
        AdLandingPageData adLandingPageData = this.ab;
        if (adLandingPageData == null) {
            return;
        }
        if (pa.B(adLandingPageData.f()) != 2) {
            hw.a("PPSRewardView", "no need popup strategy %s.", Integer.valueOf(pa.B(this.ab.f())));
            return;
        }
        if (this.ab.getAppInfo() == null || this.ab.n() == null) {
            hw.a("PPSRewardView", "app or pageType para error.");
            return;
        }
        if (!"1".equals(this.ab.n()) && !"2".equals(this.ab.n())) {
            hw.a("PPSRewardView", "landing type no need pop.");
            return;
        }
        if (!this.f20986b.b(this.d)) {
            hw.a("PPSRewardView", "not download related no need pop.");
            return;
        }
        long jD = this.ab.getAppInfo().D();
        if (jD < 0) {
            hw.c("PPSRewardView", "delay time error:%s", Long.valueOf(jD));
        } else {
            hw.b("PPSRewardView", "show app download dialog start delayTime %s", Long.valueOf(jD));
            dq.a(new uw(this), jD);
        }
    }

    private void X() {
        if (getWebPopUpView() == null) {
            setWebPopUpView(new u(getContext(), 0));
            getWebPopUpView().setPopUpClickListener(new vr(this));
            getWebPopUpView().getDialog().setOnCancelListener(new vs(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        boolean zL = pa.l(this.d.getCtrlSwitchs());
        this.ah = zL;
        if (!zL) {
            hw.b("PPSRewardView", "switch is off, skip init endCard.");
            return;
        }
        if (this.d.I() == 0) {
            this.ah = false;
            hw.b("PPSRewardView", "display type, skip init endCard.");
            return;
        }
        if (!bi.g(this.d.I()) && this.d.getAppInfo() == null) {
            this.ah = false;
            hw.b("PPSRewardView", "appInfo is null, skip init endCard.");
            return;
        }
        boolean zW = fp.b(this.q).W();
        this.ai = zW;
        hw.b("PPSRewardView", "init endCard, showMasking: %s", Boolean.valueOf(zW));
        this.W = new t(getContext(), getOrientation(), this.r);
        if (bi.f(this.d.I()) || com.huawei.openalliance.ad.utils.c.b(this.q, this.r)) {
            getEndCardView().setAppRelated(false);
        }
        getEndCardView().setInterType(this.d.I());
        getEndCardView().setAdLandingPageData(this.ab);
        getEndCardView().setEndCardClickListener(new vh(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.aq.addView(getEndCardView(), layoutParams);
        getEndCardView().c();
    }

    private void V() {
        if (!this.w && Q()) {
            this.w = true;
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        RewardVideoView rewardVideoView = this.g;
        if (rewardVideoView != null) {
            rewardVideoView.f();
        }
        if (this.R == null || !r()) {
            return;
        }
        this.R.onAdCompleted();
    }

    private boolean U() {
        return this.f20986b.b(this.d) && !TextUtils.isEmpty(this.d.M());
    }

    private void T() {
        PPSAppDetailTemplateView pPSAppDetailTemplateView = this.C;
        if (pPSAppDetailTemplateView != null) {
            pPSAppDetailTemplateView.setVisibility(4);
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setVisibility(4);
        }
        if (this.V == null || !this.f20986b.b(this.r)) {
            return;
        }
        int i = this.A;
        if (i == 4 || i == 5) {
            this.V.setExtraViewVisibility(0);
        }
    }

    private void S() {
        ProgressBar progressBar;
        setAppDetailViewType(1);
        PPSWebView pPSWebView = this.O;
        if (pPSWebView != null) {
            if (!this.ao) {
                pPSWebView.loadPage();
                this.ap = true;
                this.O.onResume();
            }
            if (!this.L && (progressBar = this.s) != null) {
                progressBar.setVisibility(8);
            }
            b("2");
            RewardVideoView rewardVideoView = this.g;
            if (rewardVideoView != null) {
                rewardVideoView.setVisibility(4);
            }
            T();
            this.O.setVisibility(0);
            this.O.setIsInLandingpage(true);
            ba baVar = this.as;
            if (baVar != null) {
                baVar.a(false);
            }
            this.O.setRealOpenTime(System.currentTimeMillis());
        }
        if ("1".equals(this.d.ai()) && pa.i(this.d.getCtrlSwitchs())) {
            getAppDetailView().setVisibility(8);
        }
        if (nx.a(this.r)) {
            ((PPSRewardActivity) getContext()).setRequestedOrientation(1);
        }
        if (this.F) {
            this.F = false;
            Toast.makeText(getContext(), R.string.hiad_third_party_page_hint, 0).show();
        }
        Y();
    }

    private void R() {
        if (!this.ai || TextUtils.isEmpty(this.d.M())) {
            return;
        }
        this.an = new f(this.q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = this.aq;
        if (relativeLayout != null) {
            relativeLayout.addView(this.an, layoutParams);
        }
        LinearLayout linearLayout = this.ar;
        if (linearLayout != null) {
            linearLayout.bringToFront();
        }
        this.an.setOnClickListener(new vi(this));
    }

    private boolean Q() {
        Z();
        if (!this.ah) {
            if (!U()) {
                return false;
            }
            S();
            return true;
        }
        setBottomViewVisibility(8);
        if (getEndCardView() != null) {
            getEndCardView().b();
        }
        R();
        this.v = true;
        return true;
    }

    private void P() {
        b("1");
    }

    private void O() {
        b("-1");
        V();
    }

    private void N() {
        if (this.l == null) {
            return;
        }
        this.l.setImageResource(dk.a(this.A, this.K));
    }

    private void M() {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private void L() {
        H();
        IRewardAdStatusListener iRewardAdStatusListener = this.R;
        if (iRewardAdStatusListener != null) {
            iRewardAdStatusListener.onAdClosed();
        }
    }

    private void K() {
        if (this.P == null) {
            Resources resources = getResources();
            int i = R.plurals.hiad_reward_close_dialog_message;
            int i2 = this.i;
            Dialog dialogA = com.huawei.openalliance.ad.utils.ac.a(getContext(), (String) null, resources.getQuantityString(i, i2, Integer.valueOf(i2)), getResources().getString(R.string.hiad_reward_close_dialog_continue), getResources().getString(R.string.hiad_reward_close_dialog_close), new vf(this));
            this.P = dialogA;
            dialogA.setOnCancelListener(new vg(this));
        }
    }

    private void J() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.11
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", "unmuteSound");
                PPSRewardView.this.K = false;
                if (PPSRewardView.this.g != null) {
                    PPSRewardView.this.g.d();
                    if (PPSRewardView.this.f20986b != null) {
                        PPSRewardView.this.f20986b.a(false);
                    }
                }
            }
        });
    }

    private void I() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.10
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", "muteSound");
                PPSRewardView.this.K = true;
                if (PPSRewardView.this.g != null) {
                    PPSRewardView.this.g.c();
                    if (PPSRewardView.this.f20986b != null) {
                        PPSRewardView.this.f20986b.a(true);
                    }
                }
            }
        });
    }

    private void H() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.8
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSRewardView", "onClose");
                if (PPSRewardView.this.f20986b != null) {
                    PPSRewardView.this.f20986b.a();
                }
            }
        });
        this.f20985a.b();
    }

    private void G() {
        Toast toastMakeText = Toast.makeText(getContext(), R.string.hiad_network_error, 0);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    private boolean F() {
        VideoInfo videoInfo = this.au;
        if (videoInfo == null) {
            return false;
        }
        String videoDownloadUrl = videoInfo.getVideoDownloadUrl();
        return (dg.l(videoDownloadUrl) && TextUtils.isEmpty(this.x.e(videoDownloadUrl))) ? false : true;
    }

    private void E() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardView.7
            @Override // java.lang.Runnable
            public void run() {
                if (PPSRewardView.this.Q == null || !PPSRewardView.this.Q.isShowing()) {
                    return;
                }
                PPSRewardView.this.Q.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        dq.a(new vm(this));
    }

    private boolean C() {
        return pa.f(this.d.getCtrlSwitchs()) == 2 || as.n(this.q);
    }

    private void B() {
        TextView textView;
        if (C() && (textView = this.D) != null && this.A == 3) {
            textView.setVisibility(8);
        }
    }

    private void A() {
        ba baVar = new ba(getContext(), this.ab, getAppDetailView().getAppDownloadButton(), this.O, new vt(this));
        this.as = baVar;
        baVar.a(1);
        this.O.addJavascriptInterface(this.as, Constants.PPS_JS_NAME);
        this.O.addJavascriptInterface(new ay(getContext(), pn.a(this.ab)), Constants.LANDING_JS_NAME);
        az azVar = new az(getContext(), pn.a(this.ab), this.O);
        this.ac = azVar;
        this.O.addJavascriptInterface(azVar, Constants.APPOINT_JS_NAME);
    }

    public PPSRewardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20985a = new va();
        this.e = false;
        this.f = false;
        this.n = false;
        this.o = 1;
        this.p = true;
        this.v = false;
        this.w = false;
        this.y = null;
        this.F = false;
        this.G = false;
        this.H = new vj(this);
        this.I = new vk(this);
        this.J = new vp(this);
        this.K = true;
        this.L = false;
        this.M = -1;
        this.N = -1L;
        this.ad = true;
        this.af = true;
        this.ag = false;
        this.ah = true;
        this.ai = false;
        this.aj = true;
        this.ak = false;
        this.am = false;
        this.ao = true;
        this.ap = false;
        this.at = new vn(this);
        a(context);
    }

    public PPSRewardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20985a = new va();
        this.e = false;
        this.f = false;
        this.n = false;
        this.o = 1;
        this.p = true;
        this.v = false;
        this.w = false;
        this.y = null;
        this.F = false;
        this.G = false;
        this.H = new vj(this);
        this.I = new vk(this);
        this.J = new vp(this);
        this.K = true;
        this.L = false;
        this.M = -1;
        this.N = -1L;
        this.ad = true;
        this.af = true;
        this.ag = false;
        this.ah = true;
        this.ai = false;
        this.aj = true;
        this.ak = false;
        this.am = false;
        this.ao = true;
        this.ap = false;
        this.at = new vn(this);
        a(context);
    }

    public PPSRewardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20985a = new va();
        this.e = false;
        this.f = false;
        this.n = false;
        this.o = 1;
        this.p = true;
        this.v = false;
        this.w = false;
        this.y = null;
        this.F = false;
        this.G = false;
        this.H = new vj(this);
        this.I = new vk(this);
        this.J = new vp(this);
        this.K = true;
        this.L = false;
        this.M = -1;
        this.N = -1L;
        this.ad = true;
        this.af = true;
        this.ag = false;
        this.ah = true;
        this.ai = false;
        this.aj = true;
        this.ak = false;
        this.am = false;
        this.ao = true;
        this.ap = false;
        this.at = new vn(this);
        a(context);
    }

    public PPSRewardView(Context context) {
        super(context);
        this.f20985a = new va();
        this.e = false;
        this.f = false;
        this.n = false;
        this.o = 1;
        this.p = true;
        this.v = false;
        this.w = false;
        this.y = null;
        this.F = false;
        this.G = false;
        this.H = new vj(this);
        this.I = new vk(this);
        this.J = new vp(this);
        this.K = true;
        this.L = false;
        this.M = -1;
        this.N = -1L;
        this.ad = true;
        this.af = true;
        this.ag = false;
        this.ah = true;
        this.ai = false;
        this.aj = true;
        this.ak = false;
        this.am = false;
        this.ao = true;
        this.ap = false;
        this.at = new vn(this);
        a(context);
    }
}
