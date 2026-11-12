package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.cr;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pp;
import com.huawei.openalliance.ad.sl;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;
import com.huawei.profile.profile.ProfileExtendConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class PPSAppDetailView extends RelativeLayout {
    private ScanningRelativeLayout A;
    private ParticleRelativeLayout B;
    private com.huawei.openalliance.ad.views.interfaces.a C;
    private int D;
    private int E;
    private MaterialClickInfo F;
    private long G;
    private int H;
    private int I;
    private Handler J;
    private View.OnClickListener K;
    private View.OnTouchListener L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f20809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AppDownloadButton f20810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f20811c;
    protected SixElementsView d;
    private AdLandingPageData e;
    private ImageView f;
    private PPSLabelView g;
    private boolean h;
    private AppInfo i;
    private gk j;
    private ContentRecord k;
    private View l;
    private com.huawei.openalliance.ad.analysis.i m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private com.huawei.openalliance.ad.views.interfaces.c s;
    private INonwifiActionListener t;
    private boolean u;
    private String v;
    private cr w;
    private boolean x;
    private com.huawei.openalliance.ad.views.interfaces.e y;
    private RelativeLayout z;

    public void a(int i) {
    }

    protected int getDetailStyle() {
        return 1;
    }

    public void setSixElementsViewVisibility(int i) {
        this.d.setVisibility(i);
    }

    public void setOnNonWifiDownloadListener(INonwifiActionListener iNonwifiActionListener) {
        this.t = iNonwifiActionListener;
    }

    public void setNonBtnSource(int i) {
        this.I = i;
    }

    public void setNeedShowDspInfo(boolean z) {
        this.h = z;
    }

    public void setNeedPerBeforDownload(boolean z) {
        this.u = z;
    }

    public void setLoadAppIconSelf(boolean z) {
        this.r = z;
    }

    public void setInteractedListener(com.huawei.openalliance.ad.views.interfaces.a aVar) {
        this.C = aVar;
    }

    public void setInterType(int i) {
        this.E = i;
    }

    public void setDetailViewType(int i) {
        this.D = i;
    }

    public void setBtnSource(int i) {
        this.H = i;
        AppDownloadButton appDownloadButton = this.f20810b;
        if (appDownloadButton != null) {
            appDownloadButton.setSource(i);
        }
    }

    public void setAppRelated(boolean z) {
        this.q = z;
    }

    public void setAppIconImageDrawable(Drawable drawable) {
        ImageView imageView = this.f;
        if (imageView == null || drawable == null) {
            return;
        }
        imageView.setBackground(null);
        this.f.setImageDrawable(drawable);
    }

    public void setAppDetailClickListener(com.huawei.openalliance.ad.views.interfaces.c cVar) {
        this.s = cVar;
    }

    public void setAdLandingData(AdLandingPageData adLandingPageData) {
        String str;
        if (adLandingPageData == null) {
            return;
        }
        try {
            hw.b("PPSAppDetailView", "set ad landing data");
            this.e = adLandingPageData;
            this.k = adLandingPageData.z();
            this.i = this.e.getAppInfo();
            PPSLabelView pPSLabelView = this.g;
            if (pPSLabelView != null) {
                pPSLabelView.setDataAndRefreshUi(this.k);
            }
            if (this.i == null) {
                a(this.l, 8);
            } else {
                a();
            }
            if (com.huawei.openalliance.ad.utils.c.b(this.f20809a, this.k)) {
                setAppRelated(false);
            }
            MetaData metaData = (MetaData) bk.b(this.e.u(), MetaData.class, new Class[0]);
            if (metaData != null) {
                this.v = dg.e(metaData.a());
            }
            this.x = adLandingPageData.B();
        } catch (RuntimeException unused) {
            str = "setAdLandingPageData RuntimeException";
            hw.c("PPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "setAdLandingPageData error";
            hw.c("PPSAppDetailView", str);
        }
    }

    public AppInfo getAppInfo() {
        return this.i;
    }

    public AppDownloadButton getAppDownloadButton() {
        return this.f20810b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (tz.a(motionEvent) == 0) {
                MaterialClickInfo materialClickInfoB = tz.b(this, motionEvent);
                this.F = materialClickInfoB;
                AppDownloadButton appDownloadButton = this.f20810b;
                if (appDownloadButton != null) {
                    appDownloadButton.a(materialClickInfoB);
                }
            }
            if (1 == motionEvent.getAction()) {
                tz.b(this, motionEvent, null, this.F);
                AppDownloadButton appDownloadButton2 = this.f20810b;
                if (appDownloadButton2 != null) {
                    appDownloadButton2.a(this.F);
                }
                SixElementsView sixElementsView = this.d;
                if (sixElementsView != null) {
                    sixElementsView.setOrgClickInfo(this.F);
                }
            }
        } catch (Throwable th) {
            hw.c("PPSAppDetailView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void d() {
        com.huawei.openalliance.ad.views.interfaces.e eVar = this.y;
        if (eVar == null || !eVar.b()) {
            return;
        }
        hw.b("PPSAppDetailView", "stop animation.");
        dw.a((View) this.z, false);
        this.y.a();
    }

    public void c() {
        o();
        com.huawei.openalliance.ad.views.interfaces.e eVar = this.y;
        if (eVar == null || eVar.b()) {
            return;
        }
        this.y.setAutoRepeat(true);
        hw.b("PPSAppDetailView", "start animation.");
        try {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.app_download_btn_rl);
            dw.a((View) this.z, true);
            this.y.a(relativeLayout, this.e);
        } catch (Throwable th) {
            hw.c("PPSAppDetailView", "start animation error: %s", th.getClass().getSimpleName());
        }
    }

    protected void b(Context context) {
        AppDownloadButton appDownloadButton = (AppDownloadButton) findViewById(R.id.app_download_btn);
        this.f20810b = appDownloadButton;
        if (appDownloadButton == null) {
            return;
        }
        this.f20810b.setTextColor(context.getResources().getColor(R.color.hiad_emui_8_btn_color));
    }

    public void b() {
        AppDownloadButton appDownloadButton = this.f20810b;
        if (appDownloadButton != null) {
            a(appDownloadButton, 8);
        }
    }

    public void a(String str) {
        ContentRecord contentRecord = this.k;
        if (contentRecord != null) {
            contentRecord.c(str);
            AppDownloadButton appDownloadButton = this.f20810b;
            if (appDownloadButton != null) {
                appDownloadButton.updateContent(str);
            }
        }
    }

    public void a(Integer num) {
        com.huawei.openalliance.ad.views.interfaces.a aVar = this.C;
        if (aVar != null) {
            aVar.a(num.intValue());
        }
    }

    public void a(ImageView imageView, String str, bd.a aVar) {
        if (TextUtils.isEmpty(str) || imageView == null || this.f20809a == null) {
            return;
        }
        hw.b("PPSAppDetailView", "load app icon:" + dg.h(str));
        com.huawei.openalliance.ad.utils.o.d(new a(str, aVar, this.q, this.f20809a));
    }

    protected void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewFullScreen);
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.ViewFullScreen_fullScreen, 0);
                    this.f20811c = integer;
                    hw.a("PPSAppDetailView", "FullScreen %d", Integer.valueOf(integer));
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.PPSAppDetailView);
            if (typedArrayObtainStyledAttributes2 != null) {
                try {
                    int integer2 = typedArrayObtainStyledAttributes2.getInteger(R.styleable.PPSAppDetailView_hiad_detail_type, 0);
                    this.D = integer2;
                    hw.a("PPSAppDetailView", "detailViewType %d", Integer.valueOf(integer2));
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
    }

    public void a(long j) {
        ContentRecord contentRecord = this.k;
        if (contentRecord == null) {
            return;
        }
        contentRecord.h(j);
        AppDownloadButton appDownloadButton = this.f20810b;
        if (appDownloadButton != null) {
            appDownloadButton.updateStartShowTime(j);
        }
    }

    protected void a() {
        ImageView imageView;
        h();
        SixElementsView sixElementsView = this.d;
        if (sixElementsView != null) {
            sixElementsView.a(false);
            this.d.a(this.e);
        }
        if (this.r && (imageView = this.f) != null) {
            a(imageView, this.i.getIconUrl(), new b(this.f));
        }
        this.l.setOnTouchListener(this.L);
        j();
        i();
        this.J.sendEmptyMessageDelayed(1001, ProfileExtendConstants.TIME_OUT);
        AppDownloadButton appDownloadButton = this.f20810b;
        if (appDownloadButton != null) {
            setCancelDownloadButtonVisibility(appDownloadButton.refreshStatus());
        }
    }

    protected int a(Context context) {
        return this.f20811c == 1 ? R.layout.hiad_landing_app_detail_half : R.layout.hiad_landing_app_detail;
    }

    private void setCancelDownloadButtonVisibility(AppStatus appStatus) {
        AppInfo appInfo;
        if (appStatus == AppStatus.DOWNLOAD && (appInfo = this.e.getAppInfo()) != null && appInfo.w()) {
            a(appInfo);
        }
    }

    private void o() {
        AppDownloadButton appDownloadButton;
        AppDownloadButtonStyle extandAppDownloadButtonStyle;
        cr crVar = this.w;
        if (crVar == null || this.f20810b == null) {
            return;
        }
        if (crVar.g()) {
            appDownloadButton = this.f20810b;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyleHm(this.f20809a);
        } else {
            appDownloadButton = this.f20810b;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyle(this.f20809a);
        }
        appDownloadButton.setAppDownloadButtonStyle(extandAppDownloadButtonStyle);
        this.f20810b.refreshStatus();
    }

    private boolean n() {
        AppDownloadButton appDownloadButton;
        if (this.e == null || this.y == null || (appDownloadButton = this.f20810b) == null) {
            return false;
        }
        AppStatus appStatusRefreshStatus = appDownloadButton.refreshStatus();
        return appStatusRefreshStatus == AppStatus.DOWNLOAD || appStatusRefreshStatus == AppStatus.INSTALLED;
    }

    private boolean m() {
        return n() && pa.x(this.e.f());
    }

    private boolean l() {
        return n() && pa.y(this.e.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return n() && !pa.w(this.e.f());
    }

    private void j() {
        if (pa.x(this.e.f())) {
            ScanningRelativeLayout scanningRelativeLayout = this.A;
            this.y = scanningRelativeLayout;
            this.z = scanningRelativeLayout;
            dw.a((View) scanningRelativeLayout, true);
            dw.a((View) this.B, false);
            return;
        }
        if (!pa.y(this.e.f())) {
            dw.a((View) this.A, false);
            dw.a((View) this.B, false);
            return;
        }
        ParticleRelativeLayout particleRelativeLayout = this.B;
        this.y = particleRelativeLayout;
        this.z = particleRelativeLayout;
        dw.a((View) this.A, false);
        dw.a((View) this.B, true);
    }

    private void i() {
        com.huawei.openalliance.ad.views.interfaces.e eVar;
        com.huawei.openalliance.ad.views.interfaces.e eVar2;
        AppDownloadButton appDownloadButton = this.f20810b;
        if (appDownloadButton != null) {
            appDownloadButton.setAdLandingPageData(this.e);
            this.f20810b.setNeedShowPermision(this.u);
            hw.b("PPSAppDetailView", "enable btn scan: %s", Boolean.valueOf(pa.x(this.e.f())));
            hw.b("PPSAppDetailView", "enable btn particle: %s", Boolean.valueOf(pa.y(this.e.f())));
            if (!m() || (eVar2 = this.y) == null || eVar2.b()) {
                if (l() && (eVar = this.y) != null && !eVar.b()) {
                    hw.b("PPSAppDetailView", "show btn particle animation");
                }
                o();
            } else {
                this.f20810b.setAppDownloadButtonStyle(new ac(this.f20809a));
            }
            this.f20810b.setOnDownloadStatusChangedListener(new AppDownloadButton.OnDownloadStatusChangedListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.4
                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
                public void onUserCancel(AppInfo appInfo) {
                }

                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
                public void onStatusChanged(AppStatus appStatus) {
                    PPSAppDetailView.this.a(appStatus);
                }
            });
            this.f20810b.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.5
                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
                public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                    return !PPSAppDetailView.this.q ? com.huawei.openalliance.ad.utils.l.a(PPSAppDetailView.this.v, PPSAppDetailView.this.f20809a.getString(R.string.hiad_download_open)) : charSequence;
                }
            });
            this.f20810b.setOnNonWifiDownloadListener(new AppDownloadButton.OnNonWifiDownloadListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.6
                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnNonWifiDownloadListener
                public boolean onNonWifiDownload(AppInfo appInfo, long j) {
                    if ((PPSAppDetailView.this.t == null || !PPSAppDetailView.this.t.onAppDownload(appInfo, j)) && PPSAppDetailView.this.j.bH() && PPSAppDetailView.this.x) {
                        PPSAppDetailView.this.f20810b.b();
                        return false;
                    }
                    PPSAppDetailView.this.f20810b.setAllowedNonWifiNetwork(true);
                    return true;
                }
            });
            this.f20810b.setSource(this.H);
        }
    }

    private void h() {
        ContentRecord contentRecord;
        MetaData metaDataJ;
        AdSource adSourceB;
        if (!MLAsrConstants.LAN_ZH.equalsIgnoreCase(com.huawei.openalliance.ad.utils.d.a()) || (contentRecord = this.k) == null || !this.h || (metaDataJ = contentRecord.j()) == null || (adSourceB = AdSource.b(metaDataJ.L())) == null || this.g == null) {
            return;
        }
        if (TextUtils.isEmpty(adSourceB.a()) && TextUtils.isEmpty(adSourceB.b())) {
            hw.a("PPSAppDetailView", "loadDspInfo error");
            this.g.setVisibility(8);
        } else {
            hw.a("PPSAppDetailView", "loading dsp info");
            this.g.setVisibility(8);
            this.g.setTextForAppDetailView(adSourceB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getClickDestination() {
        return this.E == 9 ? ClickDestination.HARMONY_SERVICE : ClickDestination.WEB;
    }

    private int getButtonRadius() {
        AppDownloadButton appDownloadButton = getAppDownloadButton();
        if (appDownloadButton == null) {
            return 0;
        }
        return appDownloadButton.getRoundRadius();
    }

    private boolean g() {
        AdLandingPageData adLandingPageData = this.e;
        return adLandingPageData != null && pa.q(adLandingPageData.f()) && this.D == 0;
    }

    private boolean f() {
        AdLandingPageData adLandingPageData = this.e;
        if (adLandingPageData != null) {
            return pa.p(adLandingPageData.f());
        }
        return false;
    }

    private boolean e() {
        AdLandingPageData adLandingPageData = this.e;
        if (adLandingPageData != null) {
            return pa.o(adLandingPageData.f()) || (pa.q(this.e.f()) && this.D == 1);
        }
        return false;
    }

    private int c(Context context) {
        if (R.layout.hiad_landing_expand_button_detail_half == a(context)) {
            return as.a(context, dk.l(context) ? 270 : 480);
        }
        return com.huawei.openalliance.ad.utils.d.a(context, dk.k(context));
    }

    private void b(Context context, AttributeSet attributeSet) {
        String str;
        try {
            a(context, attributeSet);
            this.f20809a = context;
            this.w = cc.a(context);
            this.j = fp.b(context);
            this.m = new com.huawei.openalliance.ad.analysis.i(context);
            this.n = ViewConfiguration.get(context).getScaledTouchSlop();
            this.l = inflate(context, a(context), this);
            this.A = (ScanningRelativeLayout) findViewById(R.id.hiad_detail_btn_scan);
            this.B = (ParticleRelativeLayout) findViewById(R.id.hiad_detail_btn_particle);
            this.f = (ImageView) findViewById(R.id.app_icon);
            this.d = (SixElementsView) findViewById(R.id.app_detail_six_elements);
            PPSLabelView pPSLabelView = (PPSLabelView) findViewById(R.id.hiad_dsp_info);
            this.g = pPSLabelView;
            if (pPSLabelView != null) {
                pPSLabelView.setVisibility(8);
            }
            b(context);
            AppDownloadButton appDownloadButton = this.f20810b;
            if (appDownloadButton != null) {
                appDownloadButton.a(this.K);
                this.f20810b.setAppDetailView(this);
            }
            int buttonRadius = getButtonRadius();
            if (this.A != null && buttonRadius > 0) {
                hw.b("PPSAppDetailView", "got button radius: %s", Integer.valueOf(buttonRadius));
                this.A.setRadius(buttonRadius);
            }
            int iC = c(context);
            hw.b("PPSAppDetailView", "screenWidth is %d", Integer.valueOf(iC));
            if (this.g == null || !MLAsrConstants.LAN_ZH.equalsIgnoreCase(com.huawei.openalliance.ad.utils.d.a())) {
                return;
            }
            this.g.setMaxWidth((int) (((double) iC) * 0.25d));
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("PPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("PPSAppDetailView", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        int i;
        if (this.G > 0 && as.c() - this.G <= 500) {
            hw.c("PPSAppDetailView", "fast click");
            return;
        }
        this.G = as.c();
        if (!z) {
            if (this.s == null || e()) {
                return;
            }
            this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(false, false, getClickDestination(), 28));
            return;
        }
        if (f()) {
            this.f20810b.setSource(this.I);
            this.f20810b.performClick();
        } else if (this.s != null) {
            com.huawei.openalliance.ad.views.interfaces.b bVar = new com.huawei.openalliance.ad.views.interfaces.b(true, false, getClickDestination(), 28);
            if (!g()) {
                i = e() ? 1 : 0;
                this.s.a(bVar);
            }
            bVar.a(i);
            this.s.a(bVar);
        }
    }

    private void a(AppInfo appInfo) {
        new pp(this.f20809a).a(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppStatus appStatus) {
        setCancelDownloadButtonVisibility(appStatus);
        if (hw.a()) {
            hw.a("PPSAppDetailView", "onStatusChanged: %s", appStatus);
        }
        if ((appStatus == AppStatus.DOWNLOAD || appStatus == AppStatus.INSTALLED) && k()) {
            c();
        } else {
            d();
        }
    }

    static class b implements bd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ImageView> f20825a;

        @Override // com.huawei.openalliance.ad.utils.bd.a
        public void a() {
        }

        @Override // com.huawei.openalliance.ad.utils.bd.a
        public void a(final Drawable drawable) {
            if (drawable == null) {
                return;
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageView imageView = (ImageView) b.this.f20825a.get();
                    if (imageView == null) {
                        return;
                    }
                    imageView.setBackground(null);
                    imageView.setImageDrawable(drawable);
                }
            });
        }

        public b(ImageView imageView) {
            this.f20825a = new WeakReference<>(imageView);
        }
    }

    private void a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private bd.a f20820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20821c;
        private dn d;
        private Context e;

        @Override // java.lang.Runnable
        public void run() {
            if (this.e == null) {
                return;
            }
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.b("icon");
            snVar.d(this.f20819a);
            if (!this.f20821c) {
                snVar.c(fp.b(this.e).e());
            }
            so soVarA = new sl(this.e, snVar).a();
            if (soVarA == null) {
                return;
            }
            String strA = soVarA.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            String strC = this.d.c(strA);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            bd.a(this.e, strC, new bd.a() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.a.1
                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a() {
                }

                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a(final Drawable drawable) {
                    if (drawable == null) {
                        return;
                    }
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f20820b.a(drawable);
                        }
                    });
                }
            });
        }

        public a(String str, bd.a aVar, boolean z, Context context) {
            this.f20819a = str;
            this.f20820b = aVar;
            this.f20821c = z;
            context = context != null ? context.getApplicationContext() : context;
            this.e = context;
            this.d = com.huawei.openalliance.ad.dk.a(context, "normal");
        }
    }

    public PPSAppDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        this.o = 0;
        this.p = 0;
        this.q = true;
        this.r = true;
        this.u = false;
        this.f20811c = 0;
        this.x = true;
        this.D = 0;
        this.G = -1L;
        this.H = 5;
        this.I = 5;
        this.J = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!PPSAppDetailView.this.k()) {
                    return true;
                }
                PPSAppDetailView.this.c();
                return true;
            }
        });
        this.K = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSAppDetailView.this.q) {
                    PPSAppDetailView.this.f20810b.onClick(null);
                    if (PPSAppDetailView.this.s != null) {
                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, true, AppStatus.INSTALLED == PPSAppDetailView.this.f20810b.getStatus() ? "app" : ""));
                        return;
                    }
                    return;
                }
                if (PPSAppDetailView.this.s != null) {
                    PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(false, false, PPSAppDetailView.this.getClickDestination()));
                } else {
                    hw.b("PPSAppDetailView", "onButtonClick, appDetailClickListener is null");
                }
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.b("PPSAppDetailView", "action: %s, viewId: %s", Integer.valueOf(motionEvent.getAction()), Integer.valueOf(view.getId()));
                if (PPSAppDetailView.this.f20810b != null) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        PPSAppDetailView.this.o = (int) motionEvent.getRawX();
                        PPSAppDetailView.this.p = (int) motionEvent.getRawY();
                    } else if (action == 1) {
                        int rawX = (int) motionEvent.getRawX();
                        int rawY = (int) motionEvent.getRawY();
                        if (PPSAppDetailView.this.q) {
                            PPSAppDetailView.this.f20810b.setClickActionListener(new com.huawei.openalliance.ad.views.interfaces.x() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.3.1
                                @Override // com.huawei.openalliance.ad.views.interfaces.x
                                public void b(AppDownloadButton appDownloadButton) {
                                    if (PPSAppDetailView.this.s != null) {
                                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, true, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                                    }
                                }

                                @Override // com.huawei.openalliance.ad.views.interfaces.x
                                public void a(AppDownloadButton appDownloadButton) {
                                    if (PPSAppDetailView.this.s != null) {
                                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, false, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                                    }
                                }
                            });
                        }
                        PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
                        pPSAppDetailView.a(pPSAppDetailView.q);
                        if (!dk.a(PPSAppDetailView.this.o, PPSAppDetailView.this.p, rawX, rawY, PPSAppDetailView.this.n)) {
                            if (hw.a()) {
                                hw.a("PPSAppDetailView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            }
                            PPSAppDetailView.this.m.a(rawX, rawY, PPSAppDetailView.this.k);
                        }
                    }
                }
                return true;
            }
        };
        b(context, attributeSet);
    }

    public PPSAppDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        this.o = 0;
        this.p = 0;
        this.q = true;
        this.r = true;
        this.u = false;
        this.f20811c = 0;
        this.x = true;
        this.D = 0;
        this.G = -1L;
        this.H = 5;
        this.I = 5;
        this.J = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!PPSAppDetailView.this.k()) {
                    return true;
                }
                PPSAppDetailView.this.c();
                return true;
            }
        });
        this.K = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSAppDetailView.this.q) {
                    PPSAppDetailView.this.f20810b.onClick(null);
                    if (PPSAppDetailView.this.s != null) {
                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, true, AppStatus.INSTALLED == PPSAppDetailView.this.f20810b.getStatus() ? "app" : ""));
                        return;
                    }
                    return;
                }
                if (PPSAppDetailView.this.s != null) {
                    PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(false, false, PPSAppDetailView.this.getClickDestination()));
                } else {
                    hw.b("PPSAppDetailView", "onButtonClick, appDetailClickListener is null");
                }
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.b("PPSAppDetailView", "action: %s, viewId: %s", Integer.valueOf(motionEvent.getAction()), Integer.valueOf(view.getId()));
                if (PPSAppDetailView.this.f20810b != null) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        PPSAppDetailView.this.o = (int) motionEvent.getRawX();
                        PPSAppDetailView.this.p = (int) motionEvent.getRawY();
                    } else if (action == 1) {
                        int rawX = (int) motionEvent.getRawX();
                        int rawY = (int) motionEvent.getRawY();
                        if (PPSAppDetailView.this.q) {
                            PPSAppDetailView.this.f20810b.setClickActionListener(new com.huawei.openalliance.ad.views.interfaces.x() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.3.1
                                @Override // com.huawei.openalliance.ad.views.interfaces.x
                                public void b(AppDownloadButton appDownloadButton) {
                                    if (PPSAppDetailView.this.s != null) {
                                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, true, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                                    }
                                }

                                @Override // com.huawei.openalliance.ad.views.interfaces.x
                                public void a(AppDownloadButton appDownloadButton) {
                                    if (PPSAppDetailView.this.s != null) {
                                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, false, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                                    }
                                }
                            });
                        }
                        PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
                        pPSAppDetailView.a(pPSAppDetailView.q);
                        if (!dk.a(PPSAppDetailView.this.o, PPSAppDetailView.this.p, rawX, rawY, PPSAppDetailView.this.n)) {
                            if (hw.a()) {
                                hw.a("PPSAppDetailView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            }
                            PPSAppDetailView.this.m.a(rawX, rawY, PPSAppDetailView.this.k);
                        }
                    }
                }
                return true;
            }
        };
        b(context, attributeSet);
    }

    public PPSAppDetailView(Context context) {
        super(context);
        this.h = false;
        this.o = 0;
        this.p = 0;
        this.q = true;
        this.r = true;
        this.u = false;
        this.f20811c = 0;
        this.x = true;
        this.D = 0;
        this.G = -1L;
        this.H = 5;
        this.I = 5;
        this.J = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!PPSAppDetailView.this.k()) {
                    return true;
                }
                PPSAppDetailView.this.c();
                return true;
            }
        });
        this.K = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSAppDetailView.this.q) {
                    PPSAppDetailView.this.f20810b.onClick(null);
                    if (PPSAppDetailView.this.s != null) {
                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, true, AppStatus.INSTALLED == PPSAppDetailView.this.f20810b.getStatus() ? "app" : ""));
                        return;
                    }
                    return;
                }
                if (PPSAppDetailView.this.s != null) {
                    PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(false, false, PPSAppDetailView.this.getClickDestination()));
                } else {
                    hw.b("PPSAppDetailView", "onButtonClick, appDetailClickListener is null");
                }
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.b("PPSAppDetailView", "action: %s, viewId: %s", Integer.valueOf(motionEvent.getAction()), Integer.valueOf(view.getId()));
                if (PPSAppDetailView.this.f20810b != null) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        PPSAppDetailView.this.o = (int) motionEvent.getRawX();
                        PPSAppDetailView.this.p = (int) motionEvent.getRawY();
                    } else if (action == 1) {
                        int rawX = (int) motionEvent.getRawX();
                        int rawY = (int) motionEvent.getRawY();
                        if (PPSAppDetailView.this.q) {
                            PPSAppDetailView.this.f20810b.setClickActionListener(new com.huawei.openalliance.ad.views.interfaces.x() { // from class: com.huawei.openalliance.ad.views.PPSAppDetailView.3.1
                                @Override // com.huawei.openalliance.ad.views.interfaces.x
                                public void b(AppDownloadButton appDownloadButton) {
                                    if (PPSAppDetailView.this.s != null) {
                                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, true, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                                    }
                                }

                                @Override // com.huawei.openalliance.ad.views.interfaces.x
                                public void a(AppDownloadButton appDownloadButton) {
                                    if (PPSAppDetailView.this.s != null) {
                                        PPSAppDetailView.this.s.a(new com.huawei.openalliance.ad.views.interfaces.b(PPSAppDetailView.this.q, false, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                                    }
                                }
                            });
                        }
                        PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
                        pPSAppDetailView.a(pPSAppDetailView.q);
                        if (!dk.a(PPSAppDetailView.this.o, PPSAppDetailView.this.p, rawX, rawY, PPSAppDetailView.this.n)) {
                            if (hw.a()) {
                                hw.a("PPSAppDetailView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            }
                            PPSAppDetailView.this.m.a(rawX, rawY, PPSAppDetailView.this.k);
                        }
                    }
                }
                return true;
            }
        };
        b(context, (AttributeSet) null);
    }
}
