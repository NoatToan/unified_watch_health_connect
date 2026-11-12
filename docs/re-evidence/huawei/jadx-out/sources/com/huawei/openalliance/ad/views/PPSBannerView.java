package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.BannerSize;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.listeners.BannerAdListener;
import com.huawei.openalliance.ad.jp;
import com.huawei.openalliance.ad.jq;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.mp;
import com.huawei.openalliance.ad.mq;
import com.huawei.openalliance.ad.nh;
import com.huawei.openalliance.ad.oe;
import com.huawei.openalliance.ad.oy;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class PPSBannerView extends v implements lu, com.huawei.openalliance.ad.views.interfaces.h {
    private static final byte[] B = new byte[0];
    private ImageView A;
    private float C;
    private hr D;
    private b E;
    private a F;
    private int G;
    private List<String> H;
    private String I;
    private String J;
    private com.huawei.openalliance.ad.analysis.h K;
    private RequestOptions L;
    private Location M;
    private String N;
    private RewardVerifyConfig O;
    private TextView P;
    private int Q;
    private jp R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Handler f20828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private oe f20829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20830c;
    private long d;
    private String e;
    private BannerAdListener f;
    private BannerSize g;
    private ChoicesView h;
    private ImageView i;
    private com.huawei.hms.ads.a j;
    private boolean k;
    private PPSNativeView l;
    private PPSNativeView m;
    private ImageView n;
    private ImageView o;
    private LinearLayout p;
    private PPSLabelSourceView q;
    private PPSLabelView r;
    private TextView s;
    private AutoScaleSizeRelativeLayout t;
    private INativeAd u;
    private INativeAd v;
    private int w;
    private gk x;
    private boolean y;
    private String z;

    enum a {
        STARTED,
        PAUSED,
        RESUMED,
        DESTROYED
    }

    enum b {
        IDLE,
        LOADING
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        this.O = rewardVerifyConfig;
    }

    public void setRequestOptions(RequestOptions requestOptions) {
        this.L = requestOptions;
    }

    public void setLocation(Location location) {
        this.M = location;
    }

    public void setContentBundle(String str) {
        this.N = str;
    }

    public void setBannerState(a aVar) {
        synchronized (B) {
            this.F = aVar;
        }
    }

    public void setBannerSize(BannerSize bannerSize) {
        this.g = bannerSize;
        setAdViewParam(getContext());
    }

    public void setBannerRefresh(long j) {
        long jB = b(j);
        this.f20830c = jB;
        hw.b("PPSBannerView", "setBannerRefresh:%s", Long.valueOf(jB));
    }

    public void setAdListener(BannerAdListener bannerAdListener) {
        this.f = bannerAdListener;
    }

    public void setAdId(String str) {
        this.e = str;
    }

    public void resume() {
        if (getBannerState() == a.DESTROYED) {
            hw.b("PPSBannerView", "hasDestroyed");
            return;
        }
        hw.b("PPSBannerView", "resume");
        setBannerState(a.RESUMED);
        k();
    }

    public void pause() {
        if (getBannerState() == a.DESTROYED) {
            hw.b("PPSBannerView", "hasDestroyed");
            return;
        }
        hw.b("PPSBannerView", "pause");
        setBannerState(a.PAUSED);
        l();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jp jpVar = this.R;
        if (jpVar != null) {
            jpVar.j();
        }
        String strA = com.huawei.openalliance.ad.utils.c.a(d(this.u), getContext(), true);
        if (this.P != null) {
            if (!this.k || TextUtils.isEmpty(strA)) {
                this.P.setVisibility(8);
                h();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jp jpVar = this.R;
        if (jpVar != null) {
            jpVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        jp jpVar = this.R;
        if (jpVar != null) {
            jpVar.h();
        }
        oy.a(getContext()).b(getContext());
    }

    public void loadAd() {
        if (i()) {
            return;
        }
        if (!this.f20829b.a()) {
            a(m(), 1, 1001);
            return;
        }
        if (getAdLoadState() != b.IDLE) {
            hw.c("PPSBannerView", "ad is loading now!");
            a(m(), 1, 701);
            return;
        }
        setAdLoadState(b.LOADING);
        ArrayList arrayList = new ArrayList();
        String str = this.I;
        if (str == null || str.isEmpty()) {
            arrayList = null;
        } else {
            arrayList.add(this.I);
        }
        hw.a("PPSBannerView", "load ad cacheContentIds is %s", this.I);
        this.f20829b.a(this.M);
        this.f20829b.a(this.L);
        this.f20829b.b(this.N);
        this.f20829b.a(Integer.valueOf(this.g.a()));
        this.f20829b.b(Integer.valueOf(this.g.b()));
        this.f20829b.a(this.e, 8, arrayList, this.f20830c == 0 ? 0 : 1);
        k();
    }

    @Override // com.huawei.openalliance.ad.views.v
    protected String getTAG() {
        return "PPSBannerView_" + hashCode();
    }

    public RequestOptions getRequestOptions() {
        return this.L;
    }

    public Location getLocation() {
        return this.M;
    }

    public BiddingInfo getBiddingInfo() {
        INativeAd iNativeAd = this.u;
        return (iNativeAd == null || iNativeAd.getBiddingInfo() == null) ? new BiddingInfo() : this.u.getBiddingInfo();
    }

    public a getBannerState() {
        a aVar;
        synchronized (B) {
            aVar = this.F;
        }
        return aVar;
    }

    public BannerSize getBannerSize() {
        return this.g;
    }

    public long getBannerRefresh() {
        return this.f20830c;
    }

    public String getAdId() {
        return this.e;
    }

    public void destroy() {
        hw.b("PPSBannerView", "destroy");
        setBannerState(a.DESTROYED);
        l();
        p();
        this.f20828a = null;
        this.f20829b = null;
        com.huawei.openalliance.ad.download.app.d.a().c(this.D);
    }

    public void b() {
        PPSNativeView pPSNativeView = this.l;
        if (pPSNativeView != null) {
            pPSNativeView.e();
        }
        PPSNativeView pPSNativeView2 = this.m;
        if (pPSNativeView2 != null) {
            pPSNativeView2.e();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.h
    public void a(List<String> list) {
        this.H = list;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.h
    public void a(Drawable drawable, INativeAd iNativeAd) {
        if (drawable == null || iNativeAd == null) {
            a(m(), 1, ErrorCode.ERROR_CODE_OTHER);
            hw.c("PPSBannerView", "onAdContentLoaded,content is null");
        } else {
            this.u = iNativeAd;
            this.z = iNativeAd.getLabel();
            this.I = iNativeAd.getContentId();
            if (0 == a(iNativeAd)) {
                b(iNativeAd);
                hw.a("PPSBannerView", "do not show ad due to ad expired");
                a(false, 1, 704);
                if (a(this.J, this.H)) {
                    a(2, this.v, (List<String>) null);
                }
            } else if (a(this.I, this.H)) {
                hw.a("PPSBannerView", "do not show ad due to ad cancelled");
                c(iNativeAd);
                a(false, 1, 705);
            } else {
                n();
                a(drawable);
                a(m(), 0, 0);
                o();
            }
            this.J = this.I;
            this.v = iNativeAd;
        }
        setAdLoadState(b.IDLE);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.h
    public void a(long j) {
        this.d = b(j);
        k();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.h
    public void a(int i) {
        hw.a("PPSBannerView", "onReqAdFail ");
        if (a(this.I, this.H)) {
            a(2, this.u, (List<String>) null);
            a(false, 1, 705);
        } else {
            a(m(), 1, i);
        }
        setAdLoadState(b.IDLE);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.h
    public void a() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.2
            @Override // java.lang.Runnable
            public void run() {
                PPSBannerView.this.K.a(PPSBannerView.this.u instanceof com.huawei.openalliance.ad.inter.data.e ? ((com.huawei.openalliance.ad.inter.data.e) PPSBannerView.this.u).f() : "", PPSBannerView.this.e, 8, ErrorCode.ERROR_CODE_OTHER, (String) null, (String) null);
            }
        });
    }

    private void setChoiceViewPosition(int i) {
        hw.a("PPSBannerView", "bannerView option = %d", Integer.valueOf(i));
        if (this.h == null) {
            hw.a("PPSBannerView", "choicesView is null, error");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.h.getLayoutParams());
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.hiad_banner_choice_custom_margin);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.hiad_banner_choice_custom_margin);
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(20);
                    layoutParams.setMargins(dimensionPixelOffset, 0, 0, dimensionPixelOffset2);
                } else if (i != 4) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(21);
                    layoutParams.setMargins(0, dimensionPixelOffset2, dimensionPixelOffset, 0);
                } else {
                    this.h.setVisibility(8);
                }
                this.h.setLayoutParams(layoutParams);
                this.h.bringToFront();
            }
            layoutParams.addRule(12);
            layoutParams.addRule(21);
            layoutParams.setMargins(0, 0, dimensionPixelOffset, dimensionPixelOffset2);
            layoutParams.setMarginEnd(dimensionPixelOffset);
            this.h.setLayoutParams(layoutParams);
            this.h.bringToFront();
        }
        layoutParams.addRule(10);
        layoutParams.addRule(20);
        layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset2, 0, 0);
        layoutParams.setMarginStart(dimensionPixelOffset);
        this.h.setLayoutParams(layoutParams);
        this.h.bringToFront();
    }

    private void setChildrenViewsInVisible(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerVisibility(int i) {
        synchronized (B) {
            this.G = i;
        }
    }

    private void setAdViewParam(Context context) {
        AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = this.t;
        if (autoScaleSizeRelativeLayout == null || this.g == null || context == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) autoScaleSizeRelativeLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.t.setLayoutParams(layoutParams);
        this.t.setRatio(Float.valueOf((this.g.a() * 1.0f) / this.g.b()));
    }

    private void setAdLoadState(b bVar) {
        synchronized (B) {
            this.E = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Handler handler = this.f20828a;
        if (handler == null || !handler.hasMessages(1001)) {
            return;
        }
        hw.a("PPSBannerView", "stopCloseAdWhenExpire");
        this.f20828a.removeMessages(1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f20828a == null || this.u == null || m()) {
            return;
        }
        if (this.f20828a.hasMessages(1001)) {
            this.f20828a.removeMessages(1001);
        }
        hw.a("PPSBannerView", "start closeAdWhenExpire");
        this.f20828a.sendEmptyMessageDelayed(1001, a(this.u));
    }

    private void n() {
        hw.b("PPSBannerView", "hide activity");
        jq.a().a(NotifyMessageNames.FEEDBACK_RECEIVE, new Intent("com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        return this.f20830c > 0 || this.d > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Handler handler = this.f20828a;
        if (handler == null || !handler.hasMessages(1000)) {
            return;
        }
        hw.b("PPSBannerView", "stopRefreshAd");
        this.f20828a.removeMessages(1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j = this.f20830c;
        if (j != 0) {
            c(j);
        } else {
            c(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        if (this.f20828a != null && this.f20829b != null) {
            return false;
        }
        hw.b("PPSBannerView", "view has been destroyed, need re init");
        return true;
    }

    private void h() {
        TextView textView;
        int i;
        String str = this.z;
        if (str == null || str.isEmpty()) {
            textView = this.s;
            i = 8;
        } else {
            this.s.setText(this.z);
            textView = this.s;
            i = 0;
        }
        textView.setVisibility(i);
    }

    private int getBannerVisibility() {
        int i;
        synchronized (B) {
            i = this.G;
        }
        return i;
    }

    private b getAdLoadState() {
        b bVar;
        synchronized (B) {
            bVar = this.E;
        }
        return bVar;
    }

    private void g() {
        ContentRecord contentRecordD = d(this.u);
        if (contentRecordD == null || contentRecordD.ag() == null) {
            return;
        }
        this.D = new hr(new TextView[]{this.P, this.s}, contentRecordD, new boolean[]{true, this.k}, this.z);
        com.huawei.openalliance.ad.download.app.d.a().b(this.D);
    }

    private void f() {
        if (this.j == null) {
            com.huawei.hms.ads.a aVar = new com.huawei.hms.ads.a(getContext(), this.t);
            this.j = aVar;
            aVar.setOnCloseCallBack(new com.huawei.hms.ads.b() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.8
                @Override // com.huawei.hms.ads.b
                public List<String> c() {
                    if (PPSBannerView.this.u == null) {
                        return null;
                    }
                    return PPSBannerView.this.u.getAdCloseKeyWords();
                }

                @Override // com.huawei.hms.ads.b
                public void b() {
                    if (PPSBannerView.this.u instanceof com.huawei.openalliance.ad.inter.data.e) {
                        com.huawei.openalliance.ad.utils.d.a(PPSBannerView.this.getContext(), (com.huawei.openalliance.ad.inter.data.e) PPSBannerView.this.u);
                    }
                }

                @Override // com.huawei.hms.ads.b
                public void a(String str) {
                    if (PPSBannerView.this.l != null) {
                        PPSBannerView.this.l.setVisibility(8);
                    }
                    if (PPSBannerView.this.m != null) {
                        PPSBannerView.this.m.setVisibility(8);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (str == null || str.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList.add(str);
                    }
                    PPSBannerView pPSBannerView = PPSBannerView.this;
                    pPSBannerView.a(0, pPSBannerView.u, arrayList);
                    PPSBannerView pPSBannerView2 = PPSBannerView.this;
                    pPSBannerView2.a(pPSBannerView2.m(), 2, 0);
                }

                @Override // com.huawei.hms.ads.b
                public void a() {
                    if (PPSBannerView.this.l != null) {
                        PPSBannerView.this.l.setVisibility(8);
                    }
                    if (PPSBannerView.this.m != null) {
                        PPSBannerView.this.m.setVisibility(8);
                    }
                }
            });
            AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = this.t;
            if (autoScaleSizeRelativeLayout != null) {
                autoScaleSizeRelativeLayout.addView(this.j);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.j.getLayoutParams());
            layoutParams.addRule(13);
            this.j.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.huawei.hms.ads.a aVar = this.j;
        if (aVar != null) {
            ViewGroup viewGroup = (ViewGroup) aVar.getParent();
            if (viewGroup != null && (viewGroup instanceof ViewGroup)) {
                setChildrenViewsInVisible(viewGroup);
            }
            this.j.setVisibility(0);
        }
        AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = this.t;
        if (autoScaleSizeRelativeLayout != null) {
            autoScaleSizeRelativeLayout.setBackgroundColor(getResources().getColor(R.color.hiad_whythisad_root_bg));
        }
    }

    private void d() {
        hw.a("PPSBannerView", "initChoicesView start");
        if (this.h == null) {
            ChoicesView choicesView = new ChoicesView(getContext());
            this.h = choicesView;
            choicesView.setId(R.id.hiad_choice_view);
            this.t.addView(this.h);
        }
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSBannerView.this.j != null) {
                    PPSBannerView.this.e();
                    PPSBannerView.this.j.b();
                } else if (PPSBannerView.this.u instanceof com.huawei.openalliance.ad.inter.data.e) {
                    com.huawei.openalliance.ad.utils.d.a(PPSBannerView.this.getContext(), (com.huawei.openalliance.ad.inter.data.e) PPSBannerView.this.u);
                }
                PPSBannerView.this.h.setVisibility(8);
            }
        });
        if (BannerSize.BANNER == getBannerSize()) {
            this.h.a();
            this.h.a(R.dimen.hiad_banner_choice_view_size);
        }
    }

    private ContentRecord d(INativeAd iNativeAd) {
        String str;
        if (iNativeAd == null) {
            str = "nativeAd is null when convert";
        } else {
            if (iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e) {
                return pl.a((com.huawei.openalliance.ad.inter.data.e) iNativeAd);
            }
            str = "ad is not native ad when convert";
        }
        hw.c("PPSBannerView", str);
        return null;
    }

    private void c(INativeAd iNativeAd) {
        if (this.K == null || iNativeAd == null) {
            return;
        }
        hw.a("PPSBannerView", "reportAdCancelled");
        this.K.a("49", d(iNativeAd), 0L);
    }

    private void c(long j) {
        Handler handler = this.f20828a;
        if (handler == null) {
            return;
        }
        if (handler.hasMessages(1000)) {
            this.f20828a.removeMessages(1000);
        }
        if (getBannerVisibility() == 4 || getBannerState() == a.PAUSED || getBannerState() == a.DESTROYED) {
            hw.b("PPSBannerView", "stopRefreshAd");
        } else if (0 != j) {
            hw.b("PPSBannerView", "start refreshAd ad will be refreshed in %d s", Long.valueOf(j));
            this.f20828a.sendEmptyMessageDelayed(1000, j * 1000);
        }
    }

    private void c() {
        if (this.A == null) {
            return;
        }
        hw.b("PPSBannerView", "init compliance activity");
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSBannerView.this.u == null || !(PPSBannerView.this.u instanceof com.huawei.openalliance.ad.inter.data.e)) {
                    return;
                }
                ComplianceActivity.a(PPSBannerView.this.getContext(), view, pl.a((com.huawei.openalliance.ad.inter.data.e) PPSBannerView.this.u), false);
            }
        });
    }

    private void b(PPSNativeView pPSNativeView) {
        mq adSessionAgent = pPSNativeView.getAdSessionAgent();
        if (adSessionAgent != null) {
            adSessionAgent.a(this.i, mp.CLOSE_AD, null);
            adSessionAgent.a(this.r, mp.OTHER, null);
            adSessionAgent.a(this.s, mp.OTHER, null);
            adSessionAgent.a(this.P, mp.OTHER, null);
            adSessionAgent.a(this.h, mp.OTHER, null);
            adSessionAgent.a(this.j, mp.OTHER, null);
        }
    }

    private void b(INativeAd iNativeAd) {
        if (this.K == null || iNativeAd == null) {
            return;
        }
        hw.a("PPSBannerView", "reportAdExpire");
        this.K.a("48", d(iNativeAd), iNativeAd.getEndTime());
    }

    private void b(Context context) {
        View.inflate(context, R.layout.hiad_view_banner_ad, this);
        this.l = (PPSNativeView) findViewById(R.id.hiad_banner_layout_1);
        this.m = (PPSNativeView) findViewById(R.id.hiad_banner_layout_2);
        this.n = (ImageView) findViewById(R.id.hiad_banner_image_1);
        this.o = (ImageView) findViewById(R.id.hiad_banner_image_2);
        this.p = (LinearLayout) findViewById(R.id.custom_ad_bg_layout_container);
        this.q = (PPSLabelSourceView) findViewById(R.id.custom_ad_bg_layout);
        this.A = (ImageView) findViewById(R.id.compliance_icon_banner);
        this.t = (AutoScaleSizeRelativeLayout) findViewById(R.id.hiad_banner_ad);
        setAdViewParam(context);
        this.t.setVisibility(8);
        this.k = cc.a(context).d();
        hw.b("PPSBannerView", "isChinaRom = " + this.k);
        if (this.k) {
            ImageView imageView = (ImageView) findViewById(R.id.hiad_banner_close_button);
            this.i = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PPSBannerView pPSBannerView = PPSBannerView.this;
                    pPSBannerView.a(0, pPSBannerView.u, (List<String>) null);
                    PPSBannerView pPSBannerView2 = PPSBannerView.this;
                    pPSBannerView2.a(pPSBannerView2.m(), 2, 0);
                }
            });
        } else {
            f();
            d();
            c();
        }
        a(this.l);
        a(this.m);
    }

    private long b(long j) {
        gk gkVar;
        if (0 == j || (gkVar = this.x) == null) {
            return 0L;
        }
        long jBJ = gkVar.bJ();
        long jBL = this.x.bL();
        if (hw.a()) {
            hw.a("PPSBannerView", "setBannerRefresh,minInterval:%d,maxInterval:%d", Long.valueOf(jBJ), Long.valueOf(jBL));
        }
        if (jBJ > jBL) {
            return 0L;
        }
        return j < jBJ ? jBJ : Math.min(j, jBL);
    }

    private boolean a(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        hw.a("PPSBannerView", "invalidcontentIds is %s", list);
        hw.a("PPSBannerView", "currentContentId is %s", str);
        return list.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, int i2) {
        hw.a("PPSBannerView", "notifyResult isRefreshAd:%s,resultType:%d", Boolean.valueOf(z), Integer.valueOf(i));
        if (!z) {
            l();
            a(i, i2);
        } else if (2 == i) {
            a(i, i2);
        } else if (this.y) {
            a(i, i2);
            this.y = false;
        }
    }

    private void a(String str) {
        if (!this.k || TextUtils.isEmpty(str)) {
            this.P.setVisibility(8);
            h();
        } else {
            this.P.setText(str);
            this.s.setVisibility(8);
            this.P.setVisibility(0);
        }
    }

    private void a(final PPSNativeView pPSNativeView) {
        pPSNativeView.setOnNativeAdImpressionListener(new PPSNativeView.b() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.5
            @Override // com.huawei.openalliance.ad.views.PPSNativeView.b
            public void a() {
                if (PPSBannerView.this.i()) {
                    return;
                }
                pPSNativeView.setAdContainerSizeMatched(PPSBannerView.this.f20829b.a(PPSBannerView.this.g, PPSBannerView.this.C) ? "1" : "0");
            }
        });
    }

    private void a(AttributeSet attributeSet) {
        StringBuilder sb;
        BannerSize bannerSize;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.PPSBannerView);
        try {
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    String string = typedArrayObtainStyledAttributes.getString(R.styleable.PPSBannerView_hiad_adId);
                    if (string != null && !string.isEmpty()) {
                        this.e = string;
                    }
                    String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.PPSBannerView_hiad_bannerSize);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.equals(BannerSize.BANNER_STR)) {
                            bannerSize = BannerSize.BANNER;
                        } else if (string2.equals(BannerSize.LARGE_BANNER_STR)) {
                            bannerSize = BannerSize.LARGE_BANNER;
                        }
                        this.g = bannerSize;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (RuntimeException e) {
                    sb = new StringBuilder("initDefAttr ");
                    sb.append(e.getClass().getSimpleName());
                    hw.c("PPSBannerView", sb.toString());
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    sb = new StringBuilder("initDefAttr ");
                    sb.append(th.getClass().getSimpleName());
                    hw.c("PPSBannerView", sb.toString());
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void a(Drawable drawable, final ImageView imageView) {
        if (drawable instanceof com.huawei.openalliance.ad.views.gif.b) {
            ((com.huawei.openalliance.ad.views.gif.b) drawable).a(new com.huawei.openalliance.ad.views.gif.d() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.10
                @Override // com.huawei.openalliance.ad.views.gif.d
                public void b() {
                }

                @Override // com.huawei.openalliance.ad.views.gif.d
                public void c() {
                }

                @Override // com.huawei.openalliance.ad.views.gif.d
                public void a() {
                    imageView.requestLayout();
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
    /* JADX WARN: Code duplicated, block: B:42:0x014d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:46:0x0181  */
    private void a(Drawable drawable) {
        ImageView imageView;
        int i;
        PPSNativeView pPSNativeView;
        INativeAd iNativeAd;
        hw.a("PPSBannerView", "banner view showAd start");
        if (i()) {
            return;
        }
        INativeAd iNativeAd2 = this.u;
        if (iNativeAd2 instanceof com.huawei.openalliance.ad.inter.data.e) {
            RewardVerifyConfig rewardVerifyConfig = this.O;
            if (rewardVerifyConfig != null) {
                iNativeAd2.setRewardVerifyConfig(rewardVerifyConfig);
            }
            this.f20829b.a((com.huawei.openalliance.ad.inter.data.e) this.u);
            com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) this.u;
            boolean zA = as.a(this.k, eVar.isTransparencyOpen(), eVar.getTransparencyTplUrl());
            this.q.a(getContext(), zA);
            this.q.a(this, pl.a(eVar), zA);
            PPSLabelView adLabel = this.q.getAdLabel();
            this.r = adLabel;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) adLabel.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.r.setLayoutParams(marginLayoutParams);
            this.s = this.q.getAdSource();
            this.P = this.q.getAdJumpText();
            this.r.setDataAndRefreshUi(pl.a(eVar));
            if (zA) {
                this.P.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
                TextView textView = this.P;
                int i2 = this.Q;
                textView.setPadding(i2, 0, i2, 0);
            }
            this.P.setTextColor(getResources().getColor(R.color.hiad_ad_source_color));
            this.P.setTextSize(1, 10.0f);
            a(com.huawei.openalliance.ad.utils.c.a(d(this.u), getContext(), true));
            this.r.setText(getResources().getString(R.string.hiad_ad_label_new));
            this.r.a(eVar.getDspName(), eVar.getDspLogo(), eVar.u());
        }
        this.t.setVisibility(0);
        INativeAd iNativeAd3 = this.u;
        if (iNativeAd3 == null || TextUtils.equals(iNativeAd3.getAdSign(), "1")) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
        }
        if (!this.k) {
            com.huawei.hms.ads.a aVar = this.j;
            if (aVar != null) {
                aVar.a();
            }
            ChoicesView choicesView = this.h;
            if (choicesView != null) {
                choicesView.setVisibility(0);
                setChoiceViewPosition(1);
            }
            if (this.A != null && (iNativeAd = this.u) != null && !bm.a(iNativeAd.getCompliance())) {
                imageView = this.A;
            }
            i = this.w;
            this.w = i + 1;
            if (i % 2 == 0) {
                this.o.setImageDrawable(null);
                this.m.setVisibility(8);
                this.n.setImageDrawable(drawable);
                a(drawable, this.n);
                if (!this.k) {
                    this.l.setIsCustomDislikeThisAdEnabled(true);
                    this.l.setChoiceViewPosition(4);
                }
                b();
                this.l.register(this.u);
                b(this.l);
                pPSNativeView = this.l;
            } else {
                this.n.setImageDrawable(null);
                this.l.setVisibility(8);
                this.o.setImageDrawable(drawable);
                a(drawable, this.o);
                if (!this.k) {
                    this.m.setIsCustomDislikeThisAdEnabled(true);
                    this.m.setChoiceViewPosition(4);
                }
                b();
                this.m.register(this.u);
                b(this.m);
                pPSNativeView = this.m;
            }
            pPSNativeView.setVisibility(0);
            dw.a(this.q);
            dw.a(this.p);
            this.t.requestLayout();
            super.setAdData(d(this.u));
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.9
                @Override // java.lang.Runnable
                public void run() {
                    PPSBannerView.this.j();
                }
            }, 100L);
            g();
        }
        imageView = this.i;
        imageView.setVisibility(0);
        i = this.w;
        this.w = i + 1;
        if (i % 2 == 0) {
            this.o.setImageDrawable(null);
            this.m.setVisibility(8);
            this.n.setImageDrawable(drawable);
            a(drawable, this.n);
            if (!this.k) {
                this.l.setIsCustomDislikeThisAdEnabled(true);
                this.l.setChoiceViewPosition(4);
            }
            b();
            this.l.register(this.u);
            b(this.l);
            pPSNativeView = this.l;
        } else {
            this.n.setImageDrawable(null);
            this.l.setVisibility(8);
            this.o.setImageDrawable(drawable);
            a(drawable, this.o);
            if (!this.k) {
                this.m.setIsCustomDislikeThisAdEnabled(true);
                this.m.setChoiceViewPosition(4);
            }
            b();
            this.m.register(this.u);
            b(this.m);
            pPSNativeView = this.m;
        }
        pPSNativeView.setVisibility(0);
        dw.a(this.q);
        dw.a(this.p);
        this.t.requestLayout();
        super.setAdData(d(this.u));
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSBannerView.9
            @Override // java.lang.Runnable
            public void run() {
                PPSBannerView.this.j();
            }
        }, 100L);
        g();
    }

    private void a(Context context) {
        this.f20829b = new nh(context, this);
        gk gkVarB = fp.b(context);
        this.x = gkVarB;
        this.C = gkVarB.bR();
        this.K = new com.huawei.openalliance.ad.analysis.h(context);
        this.Q = as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp));
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        r4.onClose(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, INativeAd iNativeAd, List<String> list) {
        AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = this.t;
        if (autoScaleSizeRelativeLayout != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c(iNativeAd);
                    }
                } else if (autoScaleSizeRelativeLayout.getVisibility() == 0) {
                    b(iNativeAd);
                }
            } else if ((this.w - 1) % 2 == 0) {
            }
            PPSNativeView pPSNativeView = this.l;
            if (pPSNativeView != null) {
                pPSNativeView.setVisibility(8);
            }
            PPSNativeView pPSNativeView2 = this.m;
            if (pPSNativeView2 != null) {
                pPSNativeView2.setVisibility(8);
            }
            this.t.setVisibility(8);
            jp jpVar = this.R;
            if (jpVar != null) {
                jpVar.onGlobalLayout();
            }
        }
    }

    private void a(int i, int i2) {
        BannerAdListener bannerAdListener = this.f;
        if (bannerAdListener == null) {
            return;
        }
        if (i == 0) {
            bannerAdListener.onAdLoaded();
        } else if (i == 1) {
            bannerAdListener.onAdFailedToLoad(i2);
        } else {
            if (i != 2) {
                return;
            }
            bannerAdListener.onAdClosed();
        }
    }

    private long a(INativeAd iNativeAd) {
        long j = 0;
        if (iNativeAd != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long endTime = iNativeAd.getEndTime();
            j = jCurrentTimeMillis < endTime ? endTime - jCurrentTimeMillis : 0L;
            hw.a("PPSBannerView", "calcAdLeftTime,currentTime:" + jCurrentTimeMillis + ",expireTime:" + endTime + ",leftTime:" + j);
        }
        return j;
    }

    public PPSBannerView(Context context, BannerSize bannerSize, String str) {
        super(context);
        this.g = BannerSize.BANNER;
        this.k = true;
        this.w = 0;
        this.y = true;
        this.C = 0.05f;
        this.E = b.IDLE;
        this.F = a.STARTED;
        this.G = 0;
        this.R = new jp(this) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i) {
                hw.a("PPSBannerView", "onViewShowEnd");
                PPSBannerView.this.setBannerVisibility(4);
                PPSBannerView.this.l();
                PPSBannerView.this.p();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                hw.a("PPSBannerView", "onViewShowStart");
                PPSBannerView.this.setBannerVisibility(0);
                PPSBannerView.this.k();
                PPSBannerView.this.o();
            }
        };
        this.f20828a = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1000) {
                    PPSBannerView.this.loadAd();
                } else {
                    if (i != 1001) {
                        return;
                    }
                    PPSBannerView pPSBannerView = PPSBannerView.this;
                    pPSBannerView.a(1, pPSBannerView.u, (List<String>) null);
                }
            }
        };
        this.g = bannerSize;
        this.e = str;
        a(context);
    }

    public PPSBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = BannerSize.BANNER;
        this.k = true;
        this.w = 0;
        this.y = true;
        this.C = 0.05f;
        this.E = b.IDLE;
        this.F = a.STARTED;
        this.G = 0;
        this.R = new jp(this) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i2) {
                hw.a("PPSBannerView", "onViewShowEnd");
                PPSBannerView.this.setBannerVisibility(4);
                PPSBannerView.this.l();
                PPSBannerView.this.p();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                hw.a("PPSBannerView", "onViewShowStart");
                PPSBannerView.this.setBannerVisibility(0);
                PPSBannerView.this.k();
                PPSBannerView.this.o();
            }
        };
        this.f20828a = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1000) {
                    PPSBannerView.this.loadAd();
                } else {
                    if (i2 != 1001) {
                        return;
                    }
                    PPSBannerView pPSBannerView = PPSBannerView.this;
                    pPSBannerView.a(1, pPSBannerView.u, (List<String>) null);
                }
            }
        };
        a(attributeSet);
        a(context);
    }

    public PPSBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = BannerSize.BANNER;
        this.k = true;
        this.w = 0;
        this.y = true;
        this.C = 0.05f;
        this.E = b.IDLE;
        this.F = a.STARTED;
        this.G = 0;
        this.R = new jp(this) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i2) {
                hw.a("PPSBannerView", "onViewShowEnd");
                PPSBannerView.this.setBannerVisibility(4);
                PPSBannerView.this.l();
                PPSBannerView.this.p();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                hw.a("PPSBannerView", "onViewShowStart");
                PPSBannerView.this.setBannerVisibility(0);
                PPSBannerView.this.k();
                PPSBannerView.this.o();
            }
        };
        this.f20828a = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1000) {
                    PPSBannerView.this.loadAd();
                } else {
                    if (i2 != 1001) {
                        return;
                    }
                    PPSBannerView pPSBannerView = PPSBannerView.this;
                    pPSBannerView.a(1, pPSBannerView.u, (List<String>) null);
                }
            }
        };
        a(attributeSet);
        a(context);
    }

    public PPSBannerView(Context context) {
        super(context);
        this.g = BannerSize.BANNER;
        this.k = true;
        this.w = 0;
        this.y = true;
        this.C = 0.05f;
        this.E = b.IDLE;
        this.F = a.STARTED;
        this.G = 0;
        this.R = new jp(this) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i2) {
                hw.a("PPSBannerView", "onViewShowEnd");
                PPSBannerView.this.setBannerVisibility(4);
                PPSBannerView.this.l();
                PPSBannerView.this.p();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                hw.a("PPSBannerView", "onViewShowStart");
                PPSBannerView.this.setBannerVisibility(0);
                PPSBannerView.this.k();
                PPSBannerView.this.o();
            }
        };
        this.f20828a = new Handler(Looper.myLooper()) { // from class: com.huawei.openalliance.ad.views.PPSBannerView.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1000) {
                    PPSBannerView.this.loadAd();
                } else {
                    if (i2 != 1001) {
                        return;
                    }
                    PPSBannerView pPSBannerView = PPSBannerView.this;
                    pPSBannerView.a(1, pPSBannerView.u, (List<String>) null);
                }
            }
        };
        a(context);
    }
}
