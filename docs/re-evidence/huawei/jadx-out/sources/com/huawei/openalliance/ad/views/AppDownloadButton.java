package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.ads.uiengine.common.IProgressButton;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.LandingDetailsActivity;
import com.huawei.openalliance.ad.activity.PPSActivity;
import com.huawei.openalliance.ad.activity.PPSInstallAuthorActivity;
import com.huawei.openalliance.ad.activity.PPSInterstitialAdActivity;
import com.huawei.openalliance.ad.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.TextState;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.NativeSdkCallbackMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.download.app.AppStatusV1;
import com.huawei.openalliance.ad.dr;
import com.huawei.openalliance.ad.ds;
import com.huawei.openalliance.ad.dt;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.ng;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pe;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.pq;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.ti;
import com.huawei.openalliance.ad.tk;
import com.huawei.openalliance.ad.tm;
import com.huawei.openalliance.ad.tn;
import com.huawei.openalliance.ad.tp;
import com.huawei.openalliance.ad.tr;
import com.huawei.openalliance.ad.tu;
import com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack;
import com.huawei.openalliance.ad.utils.aq;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bf;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton;
import com.huawei.openalliance.ad.views.interfaces.IPPSLinkedView;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;
import com.huawei.openalliance.ad.views.interfaces.IPPSPlacementView;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class AppDownloadButton extends com.huawei.openalliance.ad.views.a implements com.huawei.openalliance.ad.download.l, IAppDownloadButton {
    private d A;
    private boolean B;
    private boolean C;
    private boolean D;
    private String E;
    private boolean F;
    private int G;
    private f H;
    private AppDownloadListenerV1 I;
    private MaterialClickInfo J;
    private boolean K;
    private b L;
    private boolean M;
    private Boolean N;
    private HandleUrlCallBack O;
    private com.huawei.openalliance.ad.inter.data.e d;
    private AppInfo e;
    private boolean f;
    private OnDownloadStatusChangedListener g;
    private OnNonWifiDownloadListener h;
    private e i;
    private AppStatus j;
    private AppStatus k;
    private int l;
    private ContentRecord m;
    private boolean n;
    private int o;
    private Integer p;
    private boolean q;
    private int r;
    private List<TextState> s;
    private IPPSNativeView t;
    private IPPSLinkedView u;
    private IPPSPlacementView v;
    private PPSAppDetailView w;
    private boolean x;
    private com.huawei.openalliance.ad.views.interfaces.x y;
    private View.OnClickListener z;

    /* JADX INFO: loaded from: classes41.dex */
    public interface ButtonTextWatcher {
        CharSequence beforeTextChanged(CharSequence charSequence, AppStatus appStatus);
    }

    public interface OnDownloadStatusChangedListener {
        void onStatusChanged(AppStatus appStatus);

        void onUserCancel(AppInfo appInfo);
    }

    public interface OnNonWifiDownloadListener {
        boolean onNonWifiDownload(AppInfo appInfo, long j);
    }

    public interface OnResolutionRequiredListener {
        void onResolutionRequired(AppInfo appInfo, Bundle bundle);
    }

    public interface OnStatusRefreshedListener {
        void onRefreshed(AppStatus appStatus);
    }

    public interface b {
        void a();
    }

    public interface e {
        CharSequence a(CharSequence charSequence, AppStatus appStatus);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public int getCancelBtnHeight(int i) {
        return i;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public View getProgressBtn() {
        return this;
    }

    @Deprecated
    public void setButtonTextWatcher(ButtonTextWatcher buttonTextWatcher) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setCancelBtnHeight(int i) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setResetListener(IProgressButton.ProgressButtonResetListener progressButtonResetListener) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setShowCancelBtn(boolean z) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setTextInner(CharSequence charSequence, boolean z) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void updateStartShowTime(long j) {
        ContentRecord contentRecord = this.m;
        if (contentRecord != null) {
            contentRecord.h(j);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void updateContent(String str) {
        ContentRecord contentRecord = this.m;
        if (contentRecord != null) {
            contentRecord.c(str);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        super.setVisibilityInner(i);
    }

    public void setVenusExt(String str) {
        this.E = str;
    }

    public void setSource(int i) {
        this.o = i;
        hw.b(this.f21122a, "setSource: %s", Integer.valueOf(i));
    }

    public void setShowPermissionDialog(boolean z) {
        this.n = z;
    }

    @Override // com.huawei.openalliance.ad.views.a, com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setResetWidth(boolean z) {
        super.setResetWidth(z);
    }

    public void setRemoteBfDlBtnTxt(String str) {
        AppInfo appInfo = this.e;
        if (appInfo != null) {
            appInfo.y(str);
        }
    }

    public void setRemoteAfDlBtnText(String str) {
        AppInfo appInfo = this.e;
        if (appInfo != null) {
            appInfo.z(str);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setPpsPlacementView(IPPSPlacementView iPPSPlacementView) {
        this.v = iPPSPlacementView;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setPpsNativeView(IPPSNativeView iPPSNativeView) {
        this.t = iPPSNativeView;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setPpsLinkedView(IPPSLinkedView iPPSLinkedView) {
        this.u = iPPSLinkedView;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public boolean setPlacementAd(IPlacementAd iPlacementAd) {
        if (iPlacementAd == null) {
            return false;
        }
        try {
            this.o = 1;
            if (iPlacementAd instanceof com.huawei.openalliance.ad.inter.data.h) {
                ContentRecord contentRecordA = pq.a((com.huawei.openalliance.ad.inter.data.h) iPlacementAd);
                this.m = contentRecordA;
                super.setAdData(contentRecordA);
                if (this.F) {
                    super.j();
                }
            }
            if (this.m != null) {
                AppInfo appInfo = iPlacementAd.getAppInfo();
                if (appInfo != null) {
                    setShowPermissionDialog(appInfo.isPermPromptForCard());
                }
                setAppInfo(appInfo);
                MetaData metaDataJ = this.m.j();
                if (metaDataJ != null) {
                    this.s = metaDataJ.w();
                }
                this.B = pa.m(this.m.X());
                return true;
            }
        } catch (Throwable th) {
            hw.c(this.f21122a, "register placementAd ex: %s", th.getClass().getSimpleName());
        }
        return false;
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.b(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.a(i, i2, i3, i4);
    }

    public void setOnceSource(int i) {
        this.q = false;
        this.p = Integer.valueOf(this.o);
        this.o = i;
    }

    public void setOnResolutionRequiredListener(OnResolutionRequiredListener onResolutionRequiredListener) {
        this.H = new f(onResolutionRequiredListener);
    }

    public void setOnNonWifiDownloadListener(OnNonWifiDownloadListener onNonWifiDownloadListener) {
        this.h = onNonWifiDownloadListener;
    }

    public void setOnDownloadStatusChangedListener(OnDownloadStatusChangedListener onDownloadStatusChangedListener) {
        this.g = onDownloadStatusChangedListener;
    }

    public void setNeedShowPermision(boolean z) {
        this.x = z;
    }

    public void setNeedShowConfirmDialog(boolean z) {
        this.C = z;
    }

    public void setNeedAppendProgress(boolean z) {
        this.K = z;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public boolean setNativeAd(INativeAd iNativeAd) {
        String str;
        StringBuilder sb;
        if (iNativeAd == null) {
            setAppInfo(null);
            this.m = null;
            this.d = null;
            return false;
        }
        if (iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e) {
            this.d = (com.huawei.openalliance.ad.inter.data.e) iNativeAd;
        }
        try {
            this.o = 1;
            ContentRecord contentRecordA = pl.a(this.d);
            this.m = contentRecordA;
            super.setAdData(contentRecordA);
            if (this.F) {
                super.j();
            }
            AppInfo appInfo = iNativeAd.getAppInfo();
            setAppInfo(appInfo);
            com.huawei.openalliance.ad.inter.data.e eVar = this.d;
            if (eVar != null) {
                MetaData metaData = (MetaData) bk.b(eVar.W(), MetaData.class, new Class[0]);
                if (metaData != null) {
                    this.s = metaData.w();
                }
                this.B = pa.m(this.d.getCtrlSwitchs());
            }
            if (appInfo != null) {
                setShowPermissionDialog(appInfo.isPermPromptForCard());
                return true;
            }
        } catch (RuntimeException e2) {
            e = e2;
            str = this.f21122a;
            sb = new StringBuilder("setNativeAd RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.d(str, sb.toString());
        } catch (Exception e3) {
            e = e3;
            str = this.f21122a;
            sb = new StringBuilder("setNativeAd Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.d(str, sb.toString());
        }
        return false;
    }

    public void setLinkedCoverClickListener(View.OnClickListener onClickListener) {
        this.z = onClickListener;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setHandleUrlCallBack(HandleUrlCallBack handleUrlCallBack) {
        this.O = handleUrlCallBack;
    }

    public void setDlBtnText(String str) {
        if (this.e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.w(str);
    }

    public void setClickActionListener(com.huawei.openalliance.ad.views.interfaces.x xVar) {
        this.y = xVar;
    }

    public void setButtonTextWatcherInner(e eVar) {
        this.i = eVar;
    }

    public void setBfDlBtnTxt(String str) {
        AppInfo appInfo = this.e;
        if (appInfo != null) {
            appInfo.w(str);
        }
    }

    public void setAppInfo(AppInfo appInfo) {
        hw.b(this.f21122a, "setAppInfo appInfo is " + dg.b(appInfo));
        this.e = appInfo;
        if (appInfo != null) {
            com.huawei.openalliance.ad.download.app.e.h().a(appInfo, this.A);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setAppDownloadButtonStyle(AppDownloadButtonStyle appDownloadButtonStyle) {
        this.f21123b = appDownloadButtonStyle;
        refreshStatusAsync(null);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setAppDetailView(PPSAppDetailView pPSAppDetailView) {
        this.w = pPSAppDetailView;
    }

    public void setAllowedNonWifiNetwork(boolean z) {
        this.f = z;
    }

    public void setAfDlBtnText(String str) {
        if (this.e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.x(str);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void setAdLandingPageData(AdLandingPageData adLandingPageData) {
        String str;
        String str2;
        try {
            if (adLandingPageData == null) {
                setAppInfo(null);
                this.m = null;
                return;
            }
            ContentRecord contentRecordZ = adLandingPageData.z();
            this.m = contentRecordZ;
            super.setAdData(contentRecordZ);
            if (this.F) {
                super.j();
            }
            AppInfo appInfo = adLandingPageData.getAppInfo();
            if (appInfo != null) {
                setAppInfo(appInfo);
                setShowPermissionDialog(appInfo.isPermPromptForLanding());
            }
            updateContent(adLandingPageData.c());
            updateStartShowTime(adLandingPageData.F());
            this.o = 2;
            this.N = Boolean.valueOf(getAutoOpenInLandingPage());
            this.s = adLandingPageData.g();
            this.B = pa.m(this.m.X());
        } catch (IllegalArgumentException unused) {
            str = this.f21122a;
            str2 = "setAdLandingPageData IllegalArgumentException";
            hw.c(str, str2);
        } catch (Exception unused2) {
            str = this.f21122a;
            str2 = "setAdLandingPageData error";
            hw.c(str, str2);
        }
    }

    public void removeResolutionRequiredListener() {
        com.huawei.openalliance.ad.download.app.e.h().b(this.e, this.H);
        this.H = null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void refreshStatusAsync(OnStatusRefreshedListener onStatusRefreshedListener) {
        c((AppDownloadTask) null);
        com.huawei.openalliance.ad.utils.o.f(new g(this, onStatusRefreshedListener));
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public AppStatus refreshStatus() {
        if (hw.a()) {
            hw.a(this.f21122a, "refreshStatus starts:%d", Long.valueOf(as.c()));
        }
        c(l());
        if (hw.a()) {
            hw.a(this.f21122a, "refreshStatus ends:%d", Long.valueOf(as.c()));
        }
        return this.j;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (hw.a()) {
            String str = this.f21122a;
            AppStatus appStatus = this.j;
            hw.a(str, "onVisibilityChanged, status:%s", appStatus == null ? null : appStatus.toString());
        }
        super.onVisibilityChanged(view, i);
        this.M = i == 0;
        if (this.F) {
            refreshStatusAsync(null);
        } else {
            hw.c(this.f21122a, "not attached to window, return.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        String str;
        String str2;
        super.onDetachedFromWindow();
        this.F = false;
        try {
            if (hw.a()) {
                String str3 = this.f21122a;
                AppInfo appInfo = this.e;
                hw.a(str3, "onDetachedFromWindow, packageName:%s", appInfo == null ? null : appInfo.getPackageName());
            } else {
                hw.b(this.f21122a, "onDetachedFromWindow appinfo is " + dg.b(this.e));
            }
            com.huawei.openalliance.ad.download.app.e.h().b(this.e, this.A);
            com.huawei.openalliance.ad.download.app.e.h().b(this.e, this.H);
        } catch (RuntimeException unused) {
            str = this.f21122a;
            str2 = "onDetachedFromWindow RuntimeException";
            hw.c(str, str2);
        } catch (Exception unused2) {
            str = this.f21122a;
            str2 = "onDetachedFromWindow Exception";
            hw.c(str, str2);
        }
    }

    @Override // com.huawei.openalliance.ad.views.a, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            p();
            b bVar = this.L;
            if (bVar != null) {
                bVar.a();
            }
            IPPSPlacementView iPPSPlacementView = this.v;
            if (iPPSPlacementView != null) {
                updateContent(iPPSPlacementView.getShowId());
            }
            if (a(false)) {
                return;
            }
            if (isFastClick()) {
                hw.b(this.f21122a, "fast click, ignore");
                return;
            }
            IPPSNativeView iPPSNativeView = this.t;
            if (iPPSNativeView != null) {
                iPPSNativeView.h();
            }
            if (!dk.b(getContext())) {
                o();
            } else {
                hw.b("AppDownloadButton", "screenLocked onBtnClick");
                com.huawei.hms.ads.inner.a.a(getContext(), new h(this));
            }
        } catch (Throwable th) {
            hw.c(this.f21122a, "ApDownLoadBut click err: " + th.getClass().getSimpleName());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        String str;
        String str2;
        super.onAttachedToWindow();
        this.F = true;
        if (this.m != null) {
            super.j();
        }
        try {
            if (hw.a()) {
                String str3 = this.f21122a;
                AppInfo appInfo = this.e;
                hw.a(str3, "onAttachedToWindow, packageName:%s", appInfo == null ? null : appInfo.getPackageName());
            } else {
                hw.b(this.f21122a, "onAttachedToWindow appinfo is " + dg.b(this.e));
            }
            com.huawei.openalliance.ad.download.app.e.h().a(this.e, this.A);
            com.huawei.openalliance.ad.download.app.e.h().a(this.e, this.H);
            refreshStatusAsync(null);
            l();
            OnDownloadStatusChangedListener onDownloadStatusChangedListener = this.g;
            if (onDownloadStatusChangedListener != null) {
                onDownloadStatusChangedListener.onStatusChanged(getStatus());
            }
        } catch (RuntimeException unused) {
            str = this.f21122a;
            str2 = "onAttachedToWindow RuntimeException";
            hw.c(str, str2);
        } catch (Exception unused2) {
            str = this.f21122a;
            str2 = "onAttachedToWindow Exception";
            hw.c(str, str2);
        }
    }

    public AppDownloadButtonStyle getStyle() {
        return this.f21123b;
    }

    @Override // com.huawei.openalliance.ad.views.a, com.huawei.hms.ads.uiengine.common.IProgressButton
    public AppStatus getStatus() {
        AppStatus appStatus = this.j;
        return appStatus == null ? AppStatus.DOWNLOAD : appStatus;
    }

    public int getSource() {
        return this.o;
    }

    public int getRoundRadius() {
        return getStyle().e();
    }

    public boolean getAutoOpenInLandingPage() {
        if (this.o == 4) {
            this.N = false;
        }
        if (this.N == null) {
            Context context = getContext();
            this.N = Boolean.valueOf((context instanceof LandingDetailsActivity) || (context instanceof PPSActivity));
        }
        return this.N.booleanValue();
    }

    public AppInfo getAppInfo() {
        return this.e;
    }

    public void f() {
        a(true);
    }

    public void e() {
        if (hw.a()) {
            hw.a(this.f21122a, "downloadApp, status:%s", getStatus());
        }
        if ((getStatus() == AppStatus.DOWNLOAD || getStatus() == AppStatus.PAUSE || getStatus() == AppStatus.WAITING_FOR_WIFI) && this.e != null) {
            AppDownloadTask task = getTask();
            if (task == null) {
                AppDownloadTask appDownloadTaskG = G();
                if (appDownloadTaskG != null) {
                    appDownloadTaskG.a(this.f);
                }
                com.huawei.openalliance.ad.download.app.e.h().c(appDownloadTaskG);
                return;
            }
            task.a(Integer.valueOf(this.o));
            task.c(Integer.valueOf(this.r));
            task.i(this.E);
            task.a(this.f);
            com.huawei.openalliance.ad.download.app.e.h().a(task, true);
        }
    }

    @Override // com.huawei.openalliance.ad.views.v, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                if (motionEvent.getAction() == 0) {
                    this.J.c(Integer.valueOf((int) motionEvent.getRawX()));
                    this.J.d(Integer.valueOf((int) motionEvent.getRawY()));
                }
            } catch (Throwable th) {
                hw.c(this.f21122a, "check touch ex: %s", th.getClass().getSimpleName());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean d() {
        return this.D;
    }

    public void d(String str) {
        if (this.m == null) {
            hw.b(this.f21122a, "reportClickEvent, record is null.");
            return;
        }
        pc pcVar = new pc(getContext(), sw.a(getContext(), this.m.f()));
        pcVar.a(this.m);
        C();
        if (B()) {
            hw.b(this.f21122a, "reportClick event.");
            pcVar.a(e(str).a());
            J();
            this.J = null;
            D();
        }
    }

    public void continueDownload() {
        if (g()) {
            return;
        }
        e();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton
    public void cancel() {
        k();
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void c(String str) {
        if (hw.a()) {
            String str2 = this.f21122a;
            AppInfo appInfo = this.e;
            hw.a(str2, "onStatusChanged, packageName:%s, packageName:%s", str, appInfo == null ? null : appInfo.getPackageName());
        }
        AppInfo appInfo2 = this.e;
        if (appInfo2 == null || !appInfo2.getPackageName().equals(str)) {
            return;
        }
        H();
    }

    public void c() {
        Context context = getContext();
        if (!(context instanceof Activity) || getStatus() != AppStatus.DOWNLOAD || !this.B || !this.C) {
            e();
            return;
        }
        ds dsVar = new ds(context);
        dsVar.a(new dr.a() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.7
            @Override // com.huawei.openalliance.ad.dr.a
            public void c(AppInfo appInfo) {
            }

            @Override // com.huawei.openalliance.ad.dr.a
            public void b(AppInfo appInfo) {
                if (AppDownloadButton.this.I != null) {
                    AppDownloadButton.this.I.onNewStatusChanged(AppStatusV1.PRE_CHECK_FAILED, 1002, appInfo);
                }
            }

            @Override // com.huawei.openalliance.ad.dr.a
            public void a(AppInfo appInfo) {
                AppDownloadButton.this.setNeedShowConfirmDialog(false);
                AppDownloadButton.this.e();
            }
        });
        this.D = true;
        dsVar.a(this.e, this.m, getLeftSize());
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void b(String str) {
        a(str);
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void b(AppDownloadTask appDownloadTask) {
        if (hw.a()) {
            String str = this.f21122a;
            String strN = appDownloadTask.n();
            AppInfo appInfo = this.e;
            hw.a(str, "onStatusChanged, taskId:%s, packageName:%s, status:%s", strN, appInfo == null ? null : appInfo.getPackageName(), appDownloadTask.i());
        }
        AppInfo appInfo2 = this.e;
        if (appInfo2 == null || !appInfo2.getPackageName().equals(appDownloadTask.n())) {
            return;
        }
        if (!"11".equals(appDownloadTask.H()) || appDownloadTask.i() != com.huawei.openalliance.ad.download.e.WAITING) {
            H();
        } else if (this.M) {
            d(appDownloadTask);
        } else {
            hw.a(this.f21122a, "not visible");
        }
    }

    public void b() {
        AppInfo appInfo = this.e;
        if (appInfo == null || appInfo.a(Integer.valueOf(this.o)) || m()) {
            c();
            return;
        }
        AppDownloadTask task = getTask();
        if ((task != null && task.o()) || this.f) {
            setAllowedNonWifiNetwork(true);
            c();
        } else {
            dt dtVar = new dt(getContext());
            dtVar.a(new dr.a() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.6
                @Override // com.huawei.openalliance.ad.dr.a
                public void c(AppInfo appInfo2) {
                    AppDownloadButton.this.F();
                }

                @Override // com.huawei.openalliance.ad.dr.a
                public void b(AppInfo appInfo2) {
                    if (AppDownloadButton.this.I != null) {
                        AppDownloadButton.this.I.onNewStatusChanged(AppStatusV1.PRE_CHECK_FAILED, 1003, appInfo2);
                    }
                }

                @Override // com.huawei.openalliance.ad.dr.a
                public void a(AppInfo appInfo2) {
                    AppDownloadButton.this.setAllowedNonWifiNetwork(true);
                    AppDownloadButton.this.setNeedShowConfirmDialog(false);
                    AppDownloadButton.this.c();
                }
            });
            dtVar.a(this.e, this.m, getLeftSize());
        }
    }

    public void a(Throwable th) {
        try {
            new com.huawei.openalliance.ad.analysis.c(getContext()).a(this.m, th);
        } catch (Exception e2) {
            hw.d("AppDownloadButton", "reportClickActionException catch exception: %s", e2.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.download.k
    public void a(String str, final int i) {
        if (hw.a()) {
            hw.a(this.f21122a, "status %s, packageName:%s", Integer.valueOf(i), str);
        }
        if (com.huawei.openalliance.ad.utils.l.a(this.e)) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.9
                @Override // java.lang.Runnable
                public void run() {
                    AppDownloadButton.this.G = i;
                    AppDownloadButton.this.refreshStatus();
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void a(String str) {
        AppInfo appInfo = this.e;
        if (appInfo == null || str == null || !str.equals(appInfo.getPackageName())) {
            return;
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.10
            @Override // java.lang.Runnable
            public void run() {
                AppDownloadButton.this.refreshStatus();
                if (AppDownloadButton.this.g != null) {
                    AppDownloadButton.this.g.onStatusChanged(AppDownloadButton.this.j);
                }
            }
        });
    }

    public void a(CharSequence charSequence, boolean z) {
        hw.a(this.f21122a, "download button text is: %s, useWatcher is:", charSequence, Boolean.valueOf(z));
        e eVar = this.i;
        if (eVar == null || !z) {
            super.setText(charSequence);
        } else {
            super.setText(eVar.a(charSequence, this.j));
        }
    }

    public void a(b bVar) {
        this.L = bVar;
    }

    public void a(MaterialClickInfo materialClickInfo) {
        this.J = materialClickInfo;
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void a(AppDownloadTask appDownloadTask) {
        if (hw.a()) {
            String str = this.f21122a;
            String strN = appDownloadTask.n();
            AppInfo appInfo = this.e;
            hw.a(str, "onProgressChanged, taskId:%s, packageName:%s, progress:%s", strN, appInfo == null ? null : appInfo.getPackageName(), Integer.valueOf(appDownloadTask.l()));
        }
        AppInfo appInfo2 = this.e;
        if (appInfo2 == null || !appInfo2.getPackageName().equals(appDownloadTask.n())) {
            return;
        }
        H();
    }

    public void a() {
        if (k()) {
            com.huawei.openalliance.ad.download.app.l.b(getContext(), this.e);
            OnDownloadStatusChangedListener onDownloadStatusChangedListener = this.g;
            if (onDownloadStatusChangedListener != null) {
                onDownloadStatusChangedListener.onUserCancel(this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.m == null) {
            return;
        }
        Context context = getContext();
        String packageName = this.e.getPackageName();
        pc pcVar = new pc(context, sw.a(context, this.m.f()));
        pcVar.a(this.m);
        if (aq.b(context, packageName)) {
            a(context, pcVar);
        } else {
            a(context, packageName, pcVar);
        }
    }

    private boolean y() {
        return pa.F(this.m.X()) && com.huawei.openalliance.ad.utils.l.a(this.e);
    }

    private void x() {
        Context context = getContext();
        AppDownloadTask appDownloadTaskG = G();
        if (context == null || appDownloadTaskG == null) {
            return;
        }
        com.huawei.openalliance.ad.download.ag.e.a(context).a(appDownloadTaskG);
    }

    private void w() {
        if (!y() || this.G == 1) {
            z();
        } else {
            x();
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.3
                @Override // java.lang.Runnable
                public void run() {
                    AppDownloadButton.this.z();
                }
            }, 600L);
        }
    }

    private void v() {
        AppStatus status = getStatus();
        hw.b(this.f21122a, "onClick, status:" + status);
        try {
            switch (AnonymousClass2.f20720b[status.ordinal()]) {
                case 1:
                    b(this.x);
                    d(m() ? "restore" : "download");
                    break;
                case 2:
                case 3:
                    b(false);
                    break;
                case 4:
                    AppDownloadTask task = getTask();
                    if (task != null) {
                        com.huawei.openalliance.ad.download.app.e.h().b(task);
                    }
                    break;
                case 5:
                    w();
                    break;
                case 6:
                    AppDownloadTask task2 = getTask();
                    if (task2 != null) {
                        e(task2);
                    }
                    break;
                default:
                    break;
            }
        } catch (Throwable th) {
            hw.d(this.f21122a, "doClickAction err: %s", th.getClass().getSimpleName());
            a(th);
        }
    }

    private void u() {
        com.huawei.openalliance.ad.views.interfaces.x xVar = this.y;
        if (xVar != null) {
            xVar.a(this);
        }
    }

    private boolean t() {
        if (!n()) {
            return false;
        }
        tr trVar = new tr(getContext(), this.m, null);
        trVar.a(this.o);
        trVar.a(Boolean.valueOf(getAutoOpenInLandingPage()));
        trVar.b(this.E);
        trVar.a();
        trVar.a(this.O);
        trVar.a(true);
        d(ClickDestination.AGMINIMARKET);
        return true;
    }

    private boolean s() {
        if (!"9".equals(this.e.b(Integer.valueOf(this.o))) || TextUtils.isEmpty(this.e.getPackageName()) || TextUtils.isEmpty(this.e.A())) {
            return false;
        }
        tn tnVar = new tn(getContext(), this.m);
        tnVar.a(this.O);
        boolean zA = tnVar.a();
        tnVar.a(zA);
        if (zA) {
            d(tnVar.c());
            return true;
        }
        u();
        return false;
    }

    private boolean r() {
        String strB = this.e.b(Integer.valueOf(this.o));
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(this.e.t()) || !strB.equals("7")) {
            return false;
        }
        ti tiVar = new ti(getContext(), this.m);
        tiVar.a(this.O);
        boolean zA = tiVar.a();
        tiVar.a(zA);
        if (zA) {
            d(ClickDestination.APPMARKET);
            return true;
        }
        u();
        return false;
    }

    private boolean q() {
        if (this.e == null) {
            u();
            hw.b(this.f21122a, "appInfo is empty");
            return false;
        }
        if (this.j == AppStatus.INSTALLED || m() || this.e.a(Integer.valueOf(this.o))) {
            return true;
        }
        String strB = this.e.b(Integer.valueOf(this.o));
        if (!TextUtils.isEmpty(strB)) {
            if (strB.equals("7") && !TextUtils.isEmpty(this.e.t())) {
                return true;
            }
            if (strB.equals("9") && !TextUtils.isEmpty(this.e.getPackageName()) && !TextUtils.isEmpty(this.e.A())) {
                return true;
            }
        }
        if (!TextUtils.isEmpty(this.e.getDownloadUrl())) {
            return true;
        }
        u();
        return false;
    }

    private void p() {
        Integer num = this.p;
        if (num != null) {
            if (this.q) {
                this.o = num.intValue();
                this.p = null;
            } else {
                this.q = true;
            }
        }
        hw.b(this.f21122a, "clickSource:%s", Integer.valueOf(this.o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (g()) {
            return;
        }
        v();
    }

    private boolean n() {
        AppInfo appInfo = this.e;
        if (appInfo == null) {
            return false;
        }
        String strB = appInfo.b(Integer.valueOf(this.o));
        return (TextUtils.isEmpty(strB) || TextUtils.isEmpty(this.e.getPackageName()) || !strB.equals("6")) ? false : true;
    }

    private boolean m() {
        AppInfo appInfo = this.e;
        return appInfo != null && "11".equals(appInfo.getPriorInstallWay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AppDownloadTask l() {
        AppDownloadTask appDownloadTask;
        if (hw.a()) {
            hw.a(this.f21122a, "refresAppStatus, start.");
        }
        AppStatus appStatusA = AppStatus.DOWNLOAD;
        AppInfo appInfo = this.e;
        String str = null;
        AppDownloadTask task = null;
        if (appInfo != null) {
            String packageName = appInfo.getPackageName();
            if (com.huawei.openalliance.ad.utils.k.b(getContext(), this.e.getPackageName()) != null) {
                appStatusA = AppStatus.INSTALLED;
            } else {
                task = getTask();
                if (task != null) {
                    appStatusA = a(task, packageName, false);
                }
            }
            AppDownloadTask appDownloadTask2 = task;
            str = packageName;
            appDownloadTask = appDownloadTask2;
        } else {
            appDownloadTask = null;
        }
        this.k = this.j;
        this.j = appStatusA;
        if (hw.a()) {
            hw.a(this.f21122a, "refresAppStatus, status:%s, packageName:%s", this.j, str);
        }
        return appDownloadTask;
    }

    private boolean k() {
        String strC = com.huawei.openalliance.ad.download.app.e.h().c(this.e);
        if (strC != null) {
            this.e.v(strC);
        }
        boolean zB = com.huawei.openalliance.ad.download.app.e.h().b(this.e);
        refreshStatus();
        setOnNonWifiDownloadListener(null);
        setNeedShowConfirmDialog(true);
        setNeedShowConfirmDialog(true);
        return zB;
    }

    private boolean i() {
        AppInfo appInfo;
        if (com.huawei.openalliance.ad.utils.c.b(getContext(), this.m)) {
            return true;
        }
        if (this.o != 1 || (appInfo = this.e) == null) {
            return false;
        }
        return "21".equalsIgnoreCase(appInfo.a());
    }

    private boolean h() {
        if (this.m == null) {
            return false;
        }
        com.huawei.openalliance.ad.inter.data.e eVar = this.d;
        tp tpVar = new tp(getContext(), this.m, true, eVar != null ? eVar.ap() : null);
        tpVar.a(this.O);
        boolean zA = tpVar.a();
        if (zA) {
            hw.b(this.f21122a, "list page btn openLandingPage");
            d(ClickDestination.WEB);
        }
        tpVar.a(zA);
        return zA;
    }

    private AppDownloadTask getTask() {
        ContentRecord contentRecord;
        AppDownloadTask appDownloadTaskD = com.huawei.openalliance.ad.download.app.e.h().d(this.e);
        if (appDownloadTaskD != null && (contentRecord = this.m) != null) {
            appDownloadTaskD.k(contentRecord.n());
            appDownloadTaskD.l(this.m.aa());
            if (!appDownloadTaskD.K()) {
                appDownloadTaskD.m(this.m.o());
            }
            appDownloadTaskD.n(this.m.l());
            appDownloadTaskD.e(this.m.aQ());
            appDownloadTaskD.q(this.m.aP());
            appDownloadTaskD.h(this.m.aD());
            appDownloadTaskD.g(this.m.aC());
            appDownloadTaskD.r(this.m.bv());
            if (appDownloadTaskD.C() == null) {
                pc pcVar = new pc(getContext(), sw.a(getContext(), this.m.f()));
                pcVar.a(this.m);
                appDownloadTaskD.a(pcVar);
                return appDownloadTaskD;
            }
            ContentRecord contentRecordA = appDownloadTaskD.C().a();
            if (contentRecordA != null) {
                contentRecordA.G(this.m.aC());
                contentRecordA.H(this.m.aD());
                contentRecordA.c(this.m.l());
                contentRecordA.ag(this.m.bv());
            }
        }
        return appDownloadTaskD;
    }

    private long getLeftSize() {
        if (this.e == null) {
            return 0L;
        }
        AppDownloadTask task = getTask();
        long fileSize = this.e.getFileSize();
        if (task != null) {
            long fileSize2 = this.e.getFileSize() - task.g();
            if (fileSize2 > 0) {
                return fileSize2;
            }
        }
        return fileSize;
    }

    private String getAdTag() {
        IPPSNativeView iPPSNativeView = this.t;
        if (iPPSNativeView != null) {
            return iPPSNativeView.getAdTag();
        }
        return null;
    }

    private boolean g() {
        String str;
        String str2;
        if (q()) {
            I();
            if (s()) {
                str = this.f21122a;
                str2 = "open harmony service";
            } else {
                if (this.j == AppStatus.INSTALLED) {
                    v();
                    return true;
                }
                if (i()) {
                    return h();
                }
                if (r()) {
                    str = this.f21122a;
                    str2 = "open Ag detail";
                } else {
                    if (!t()) {
                        return false;
                    }
                    str = this.f21122a;
                    str2 = "open Ag mini detail";
                }
            }
        } else {
            str = this.f21122a;
            str2 = "click action invalid.";
        }
        hw.b(str, str2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(AppDownloadTask appDownloadTask) {
        if (this.e == null || this.m == null) {
            hw.c(this.f21122a, "installApk, appinfo or content record is null");
            return;
        }
        if (appDownloadTask == null) {
            hw.c(this.f21122a, "installApk, task is null");
        } else if (appDownloadTask.K()) {
            com.huawei.openalliance.ad.download.app.e.h().c(appDownloadTask);
        } else {
            pe.a(getContext()).a(this.e, appDownloadTask, new a(this, appDownloadTask, this.I));
        }
    }

    private void e(AppDownloadTask appDownloadTask) {
        hw.a(this.f21122a, "installApk");
        ContentRecord contentRecordA = appDownloadTask.C().a();
        if (contentRecordA == null) {
            hw.b(this.f21122a, "contentRecord is null! continue install.");
            f(appDownloadTask);
            return;
        }
        if (bf.a(appDownloadTask, getContext())) {
            if (dk.o(getContext())) {
                hw.b(this.f21122a, "start InstallAuthorActivity!");
                a(contentRecordA);
                if (contentRecordA.ag().E() == 1) {
                    appDownloadTask.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
                    b(appDownloadTask);
                    return;
                }
            } else if (pa.D(contentRecordA.X())) {
                hw.b(this.f21122a, "app is background, stop install!");
                appDownloadTask.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
                b(appDownloadTask);
                return;
            }
        }
        f(appDownloadTask);
    }

    private com.huawei.openalliance.ad.processor.eventbeans.b.a e(String str) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        if (hw.a()) {
            String str2 = this.f21122a;
            int i = this.o;
            hw.a(str2, "prepare click info, source: %s, clickInfo: %s", Integer.valueOf(i), this.J);
        }
        A();
        aVar.b(str).a(Integer.valueOf(this.o)).a(this.J).d(com.huawei.openalliance.ad.utils.b.a(getContext())).e(getAdTag());
        return aVar;
    }

    private void d(AppDownloadTask appDownloadTask) {
        if (!appDownloadTask.J()) {
            appDownloadTask.a(com.huawei.openalliance.ad.download.e.FAILED);
            H();
        } else {
            hw.a(this.f21122a, "switch to nextInstallWay");
            appDownloadTask.a(com.huawei.openalliance.ad.download.e.IDLE);
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.1
                @Override // java.lang.Runnable
                public void run() {
                    AppDownloadButton.this.j = AppStatus.DOWNLOAD;
                    AppDownloadButton.this.b(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AppDownloadTask appDownloadTask) {
        if (hw.a()) {
            String str = this.f21122a;
            AppStatus appStatus = this.j;
            AppStatus appStatus2 = this.k;
            AppInfo appInfo = this.e;
            hw.a(str, "processStatus, status:%s, preStatus:%s, packageName:%s", appStatus, appStatus2, appInfo == null ? null : appInfo.getPackageName());
        }
        Context context = getContext();
        AppStatus appStatus3 = this.j;
        if (appStatus3 == null) {
            appStatus3 = AppStatus.DOWNLOAD;
        }
        b(appStatus3);
        AppDownloadButtonStyle.Style styleA = this.f21123b.a(getContext(), appStatus3, this.o);
        setTextColor(styleA.textColor);
        int i = this.l;
        Drawable drawable = styleA.background;
        if (i != -1) {
            setProgressDrawable(drawable, this.l);
        } else {
            setProgressDrawable(drawable);
        }
        a(appStatus3);
        switch (AnonymousClass2.f20720b[appStatus3.ordinal()]) {
            case 1:
                a(context, this.o, AppStatus.DOWNLOAD);
                return;
            case 2:
            case 3:
                a(context, this.o, AppStatus.PAUSE);
                if (this.o == 11) {
                    return;
                }
                break;
            case 4:
                a(context, this.o, AppStatus.DOWNLOADING);
                if (this.o == 11) {
                    return;
                }
                break;
            case 5:
                a(context);
                return;
            case 6:
                if (appDownloadTask != null) {
                    a(appDownloadTask, context);
                    return;
                }
                return;
            case 7:
                if (appDownloadTask != null) {
                    b(appDownloadTask, context);
                    return;
                }
                return;
            default:
                return;
        }
        setProgress(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (!cb.e(getContext())) {
            Toast.makeText(getContext(), R.string.hiad_network_no_available, 0).show();
            AppDownloadListenerV1 appDownloadListenerV1 = this.I;
            if (appDownloadListenerV1 != null) {
                appDownloadListenerV1.onNewStatusChanged(AppStatusV1.PRE_CHECK_FAILED, 1004, this.e);
                return;
            }
            return;
        }
        if (this.e.w() && this.n && z) {
            com.huawei.openalliance.ad.download.app.h.a(getContext(), this.e, new com.huawei.openalliance.ad.download.app.h.a() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.5
                @Override // com.huawei.openalliance.ad.download.app.h.a
                public void a(int i) {
                    if (AppDownloadButton.this.I != null) {
                        AppDownloadButton.this.I.onNewStatusChanged(AppStatusV1.PRE_CHECK_FAILED, i, AppDownloadButton.this.e);
                    }
                }

                @Override // com.huawei.openalliance.ad.download.app.h.a
                public void a() {
                    AppDownloadButton.this.setNeedShowConfirmDialog(false);
                    AppDownloadButton.this.E();
                }
            });
        } else {
            E();
        }
    }

    private void b(AppStatus appStatus) {
        if (appStatus == AppStatus.DOWNLOAD && this.l != 0) {
            hw.a(this.f21122a, "status:DOWNLOAD, progress: %s, change to 0", Integer.valueOf(this.l));
            this.l = 0;
        }
        AppDownloadButtonStyle.Style styleB = this.f21123b.b();
        if (this.l != 0 || styleB == null || styleB.background == null || styleB.background.getLevel() == 0) {
            return;
        }
        hw.b(this.f21122a, "downloadingStyle.level is: %s, change to 0", Integer.valueOf(styleB.background.getLevel()));
        styleB.background.setLevel(0);
    }

    private void b(AppDownloadTask appDownloadTask, Context context) {
        if (appDownloadTask != null && (com.huawei.openalliance.ad.utils.ai.b(appDownloadTask.d()) || appDownloadTask.K() || "11".equals(appDownloadTask.H()))) {
            a(context, this.o, AppStatus.INSTALLING);
            return;
        }
        a(context, this.o, AppStatus.DOWNLOAD);
        this.j = AppStatus.DOWNLOAD;
        com.huawei.openalliance.ad.download.app.e.h().a(this.e);
    }

    private com.huawei.openalliance.ad.uriaction.interfaces.a b(Context context) {
        if (this.m == null || context == null) {
            hw.b(this.f21122a, "getClickAction, invalid param");
            return null;
        }
        HashMap map = new HashMap();
        MetaData metaDataJ = this.m.j();
        if (metaDataJ != null) {
            map.put("appId", metaDataJ.n());
            map.put("thirdId", metaDataJ.m());
        }
        return tu.a(context, this.m, map);
    }

    private boolean a(boolean z) {
        AppDownloadListenerV1 appDownloadListenerV1;
        if (getStatus() == AppStatus.DOWNLOAD && (appDownloadListenerV1 = this.I) != null) {
            appDownloadListenerV1.onNewStatusChanged(AppStatusV1.FIRST_CLICK_BUTTON, 1000, this.e);
        }
        if (this.e != null && !z) {
            return false;
        }
        AppDownloadListenerV1 appDownloadListenerV2 = this.I;
        if (appDownloadListenerV2 != null) {
            appDownloadListenerV2.onNewStatusChanged(AppStatusV1.PRE_CHECK_FAILED, 1002, this.e);
        }
        hw.b(this.f21122a, "cancel download");
        return true;
    }

    private void a(boolean z, int i) {
        if (this.O == null) {
            return;
        }
        gr grVar = new gr();
        grVar.b("clickActionType", i);
        grVar.b(NativeSdkCallbackMethods.HANDLE_URL_RESULT, z);
        this.O.a(grVar.a());
    }

    private void a(AppDownloadTask appDownloadTask, Context context) {
        if (appDownloadTask != null && (com.huawei.openalliance.ad.utils.ai.b(appDownloadTask.d()) || appDownloadTask.K())) {
            a(context, this.o, AppStatus.INSTALL);
            return;
        }
        a(context, this.o, AppStatus.DOWNLOAD);
        this.j = AppStatus.DOWNLOAD;
        com.huawei.openalliance.ad.download.app.e.h().a(this.e);
    }

    private void a(ContentRecord contentRecord) {
        hw.b(this.f21122a, "startInstallAuthorActivity");
        Intent intent = new Intent(getContext(), (Class<?>) PPSInstallAuthorActivity.class);
        intent.setFlags(HiUserInfo.DATA_CLOUD);
        intent.putExtra(Constants.CONTENT_KEY, bk.b(contentRecord));
        PPSInstallAuthorActivity.a(new com.huawei.openalliance.ad.views.interfaces.g() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.4
            @Override // com.huawei.openalliance.ad.views.interfaces.g
            public void a(AppDownloadTask appDownloadTask) {
                if (appDownloadTask != null) {
                    AppDownloadButton.this.f(appDownloadTask);
                }
            }
        });
        intent.setClipData(Constants.CLIP_DATA);
        getContext().startActivity(intent);
    }

    private void a(Context context, String str, pc pcVar) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVarE = e(com.huawei.openalliance.ad.utils.l.a(str, this.e));
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarB = b(context);
        aVarB.a(this.O);
        if ((aVarB instanceof tk) && aVarB.a()) {
            hw.b(this.f21122a, "open fast app via sdk.");
            a(context, pcVar, aVarE, false);
            aVarB.a(true);
            return;
        }
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        aVar.a(this.e).c(str).a(this.m, context);
        boolean zA = com.huawei.openalliance.ad.utils.k.a(context, str, this.e.getIntentUri(), aVar.a());
        hw.b(this.f21122a, "handle android click, ret: %s", Boolean.valueOf(zA));
        if (zA) {
            a(context, pcVar, aVarE);
            a(true, 3);
            return;
        }
        hw.b(this.f21122a, "handleClick, openAppIntent failed");
        pcVar.a(EventType.INTENTFAIL, Integer.valueOf(com.huawei.openalliance.ad.utils.l.b(str, this.e)), Integer.valueOf(com.huawei.openalliance.ad.utils.k.a(context, str) ? 2 : 1));
        if (!com.huawei.openalliance.ad.utils.k.a(context, str, aVar.a())) {
            hw.b(this.f21122a, "handleClick, openAppMainPage failed");
            return;
        }
        pcVar.a(Integer.valueOf(this.o));
        com.huawei.openalliance.ad.download.app.l.a(context, this.e);
        C();
        pcVar.a(aVarE.a());
        J();
        this.J = null;
        D();
        a(true, 6);
    }

    private void a(Context context, pc pcVar, com.huawei.openalliance.ad.processor.eventbeans.b.a aVar, boolean z) {
        com.huawei.openalliance.ad.download.app.l.a(context, this.e);
        if (z) {
            pcVar.a(EventType.INTENTSUCCESS, Integer.valueOf(com.huawei.openalliance.ad.utils.l.b(this.e.getPackageName(), this.e)), (Integer) null);
        }
        C();
        pcVar.a(aVar.a());
        J();
        this.J = null;
        D();
    }

    private void a(Context context, pc pcVar, com.huawei.openalliance.ad.processor.eventbeans.b.a aVar) {
        a(context, pcVar, aVar, true);
    }

    private void a(Context context, pc pcVar) {
        AppInfo appInfo;
        if (this.m != null && (appInfo = this.e) != null && !TextUtils.isEmpty(appInfo.getUniqueId())) {
            this.m.v(this.e.getUniqueId());
        }
        tm tmVar = new tm(context, this.m);
        boolean zA = tmVar.a();
        tmVar.a(this.O);
        tmVar.a(zA);
        hw.b(this.f21122a, "handle harmony click, ret: %s", Boolean.valueOf(zA));
        if (zA) {
            C();
            pcVar.a(e(ClickDestination.HARMONY_APP).a());
            J();
            this.J = null;
            D();
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        try {
            super.setPadding(0, 0, 0, 0);
            this.f21123b = new AppDownloadButtonStyle(context);
            setOnClickListener(this);
            setCancelBtnClickListener(new c(this));
            this.A = new d(this);
            com.huawei.openalliance.ad.download.app.e.a(context.getApplicationContext());
            com.huawei.openalliance.ad.download.app.i.a(context);
            this.I = com.huawei.openalliance.ad.download.app.e.h().i();
        } catch (Throwable unused) {
            hw.c(this.f21122a, "AppDownloadButton init failed");
        }
    }

    private void a(Context context, int i, AppStatus appStatus) {
        if (com.huawei.openalliance.ad.utils.c.b(context, this.m)) {
            super.setText(context.getString(R.string.hiad_learn_more));
            return;
        }
        String strA = a(i, appStatus);
        if (TextUtils.isEmpty(strA)) {
            a(a(context, appStatus), com.huawei.openalliance.ad.utils.c.a(this.m, appStatus));
            return;
        }
        if (this.K && i == 1 && appStatus == AppStatus.DOWNLOADING) {
            strA = strA + NumberFormat.getPercentInstance().format((this.l * 1.0f) / 100.0f);
        }
        a((CharSequence) strA, false);
    }

    private void a(Context context) {
        a(context, this.o, AppStatus.INSTALLED);
    }

    private String a(Context context, AppStatus appStatus) {
        if (context == null || appStatus == null || this.e == null) {
            return "";
        }
        int i = AnonymousClass2.f20720b[appStatus.ordinal()];
        if (i == 1) {
            AppInfo appInfo = this.e;
            return com.huawei.openalliance.ad.utils.l.a(context, appInfo, com.huawei.openalliance.ad.utils.l.a(appInfo, Boolean.valueOf(getAutoOpenInLandingPage())));
        }
        if (i == 3) {
            return context.getString(R.string.hiad_download_resume);
        }
        if (i == 4) {
            if (this.o == 11) {
                return context.getString(R.string.hiad_download_downloading);
            }
            return NumberFormat.getPercentInstance().format((this.l * 1.0f) / 100.0f);
        }
        if (i == 5) {
            return com.huawei.openalliance.ad.utils.l.a(context, this.e, this.G);
        }
        if (i == 6) {
            return context.getString(R.string.hiad_download_install);
        }
        if (i != 7) {
            return null;
        }
        return context.getString(R.string.hiad_download_installing);
    }

    private String a(int i, AppStatus appStatus) {
        String strD = null;
        if (m() || bm.a(this.s)) {
            return null;
        }
        int i2 = i != 1 ? 1 : 2;
        int iA = TextState.a(appStatus);
        String strC = com.huawei.openalliance.ad.utils.d.c();
        String strD2 = null;
        String strD3 = null;
        for (TextState textState : this.s) {
            hw.a(this.f21122a, "state.getShowPosition() is %d", Integer.valueOf(textState.a()));
            if (textState != null && i2 == textState.a()) {
                if (iA == textState.b()) {
                    if (strC.equalsIgnoreCase(new Locale(textState.c()).getLanguage())) {
                        strD = textState.d();
                        break;
                    }
                    if (1 == textState.e()) {
                        strD2 = textState.d();
                    }
                }
                if (textState.b() == 0) {
                    strD3 = textState.d();
                }
            }
        }
        if (!TextUtils.isEmpty(strD)) {
            strD2 = strD;
        }
        if (!TextUtils.isEmpty(strD2)) {
            strD3 = strD2;
        }
        return dg.e(strD3);
    }

    private AppStatus a(AppDownloadTask appDownloadTask, String str, boolean z) {
        AppStatus appStatus;
        com.huawei.openalliance.ad.download.e eVarI = appDownloadTask.i();
        if (hw.a()) {
            hw.a(this.f21122a, "refreshStatus, downloadStatus:%d, packageName:%s", Integer.valueOf(eVarI != null ? eVarI.a() : -1), str);
        }
        switch (AnonymousClass2.f20719a[eVarI.ordinal()]) {
            case 1:
                int iL = appDownloadTask.l();
                this.l = iL;
                return iL > 0 ? AppStatus.PAUSE : AppStatus.DOWNLOAD;
            case 2:
                appStatus = AppStatus.WAITING_FOR_WIFI;
                break;
            case 3:
            case 4:
                appStatus = AppStatus.DOWNLOADING;
                break;
            case 5:
                return AppStatus.INSTALL;
            case 6:
                appStatus = AppStatus.INSTALLING;
                break;
            case 7:
                if (z) {
                    return AppStatus.INSTALLED;
                }
                AppStatus appStatus2 = AppStatus.DOWNLOAD;
                com.huawei.openalliance.ad.download.app.e.h().a(this.e);
                return appStatus2;
            case 8:
                DownloadTask.c cVarP = appDownloadTask.p();
                this.l = appDownloadTask.l();
                return (cVarP != DownloadTask.c.NONE || this.l > 0) ? AppStatus.PAUSE : AppStatus.DOWNLOAD;
            default:
                return AppStatus.DOWNLOAD;
        }
        this.l = appDownloadTask.l();
        return appStatus;
    }

    private void J() {
        IPPSNativeView iPPSNativeView = this.t;
        if (iPPSNativeView != null) {
            iPPSNativeView.c(this);
        }
    }

    private void I() {
        com.huawei.openalliance.ad.views.interfaces.x xVar = this.y;
        if (xVar != null) {
            xVar.b(this);
        }
        View.OnClickListener onClickListener = this.z;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    private void H() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.8
            @Override // java.lang.Runnable
            public void run() {
                AppDownloadButton.this.refreshStatus();
                if (AppDownloadButton.this.g == null || AppDownloadButton.this.k == AppDownloadButton.this.getStatus()) {
                    return;
                }
                AppDownloadButton.this.g.onStatusChanged(AppDownloadButton.this.getStatus());
            }
        });
    }

    private AppDownloadTask G() {
        pc pcVar;
        if (this.m != null) {
            pcVar = new pc(getContext(), sw.a(getContext(), this.m.f()));
            pcVar.a(this.m);
        } else {
            pcVar = null;
        }
        AppDownloadTask appDownloadTaskA = new AppDownloadTask.a().a(this.f).a(this.e).a(pcVar).a(com.huawei.openalliance.ad.download.app.e.h().e(this.e)).b(com.huawei.openalliance.ad.download.app.e.h().f(this.e)).a();
        if (appDownloadTaskA != null) {
            appDownloadTaskA.a(Integer.valueOf(this.o));
            appDownloadTaskA.f(getAutoOpenInLandingPage());
            appDownloadTaskA.c(Integer.valueOf(this.r));
            appDownloadTaskA.i(this.E);
            ContentRecord contentRecord = this.m;
            if (contentRecord != null) {
                appDownloadTaskA.l(contentRecord.aa());
                appDownloadTaskA.k(this.m.n());
                appDownloadTaskA.m(this.m.o());
                appDownloadTaskA.n(this.m.l());
                appDownloadTaskA.g(this.m.aC());
                appDownloadTaskA.h(this.m.aD());
                appDownloadTaskA.r(this.m.bv());
            }
        }
        return appDownloadTaskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        hw.b(this.f21122a, "preWifiDownload");
        if (this.e != null) {
            AppDownloadTask task = getTask();
            if (task == null) {
                task = G();
                com.huawei.openalliance.ad.download.app.e.h().b(task);
            }
            if (task != null) {
                task.a(DownloadTask.a.WAITING_WIFI_DOWNLOAD);
            }
            if (getStatus() == AppStatus.DOWNLOAD || getStatus() == AppStatus.WAITING_FOR_WIFI || getStatus() == AppStatus.PAUSE) {
                com.huawei.openalliance.ad.download.app.e.h().e(task);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (!cb.e(getContext())) {
            Toast.makeText(getContext(), R.string.hiad_network_no_available, 0).show();
            return;
        }
        if (cb.c(getContext())) {
            c();
            return;
        }
        long leftSize = getLeftSize();
        OnNonWifiDownloadListener onNonWifiDownloadListener = this.h;
        if (onNonWifiDownloadListener == null) {
            b();
        } else if (onNonWifiDownloadListener.onNonWifiDownload(this.e, leftSize)) {
            c();
        }
    }

    private void D() {
        IPPSNativeView iPPSNativeView = this.t;
        if (iPPSNativeView != null) {
            iPPSNativeView.f();
        }
    }

    private void C() {
        IPPSNativeView iPPSNativeView = this.t;
        if (iPPSNativeView != null) {
            iPPSNativeView.a(2);
        }
        IPPSLinkedView iPPSLinkedView = this.u;
        if (iPPSLinkedView != null) {
            iPPSLinkedView.a(2);
        }
        PPSAppDetailView pPSAppDetailView = this.w;
        if (pPSAppDetailView != null) {
            pPSAppDetailView.a((Integer) 2);
        }
        IPPSPlacementView iPPSPlacementView = this.v;
        if (iPPSPlacementView != null) {
            iPPSPlacementView.a(2);
        }
        if (getContext() instanceof LandingDetailsActivity) {
            new ng(getContext(), this.m, this.J).a();
        }
    }

    private boolean B() {
        if (this.o == 1 || (getContext() instanceof LandingDetailsActivity)) {
            return true;
        }
        if (this.m.f() == 7 && (getContext() instanceof PPSRewardActivity)) {
            return true;
        }
        return this.m.f() == 12 && (getContext() instanceof PPSInterstitialAdActivity);
    }

    static class a implements pe.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<AppDownloadButton> f20729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        AppDownloadTask f20730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AppDownloadListenerV1 f20731c;

        @Override // com.huawei.openalliance.ad.pe.a
        public void b() {
            hw.b("AppInsResCallback", "onSystemInstallStart");
            this.f20730b.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
            d();
        }

        @Override // com.huawei.openalliance.ad.pe.a
        public void a(int i) {
            hw.c("AppInsResCallback", "install app failed.");
            this.f20730b.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
            d();
            AppDownloadListenerV1 appDownloadListenerV1 = this.f20731c;
            if (appDownloadListenerV1 != null) {
                appDownloadListenerV1.onNewStatusChanged(AppStatusV1.INSTALL_FAILED, 1002, this.f20730b.B());
            }
        }

        @Override // com.huawei.openalliance.ad.pe.a
        public void a() {
            hw.b("AppInsResCallback", "onSilentInstallStart");
            this.f20730b.a(com.huawei.openalliance.ad.download.e.INSTALLING);
            d();
        }

        private void d() {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.c();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            AppDownloadButton appDownloadButton = this.f20729a.get();
            if (appDownloadButton != null) {
                appDownloadButton.refreshStatus();
            }
        }

        a(AppDownloadButton appDownloadButton, AppDownloadTask appDownloadTask, AppDownloadListenerV1 appDownloadListenerV1) {
            this.f20729a = new WeakReference<>(appDownloadButton);
            this.f20730b = appDownloadTask;
            this.f20731c = appDownloadListenerV1;
        }
    }

    static class d implements com.huawei.openalliance.ad.download.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<com.huawei.openalliance.ad.download.l> f20734a;

        @Override // com.huawei.openalliance.ad.download.l
        public void c(String str) {
            com.huawei.openalliance.ad.download.l lVar = this.f20734a.get();
            if (lVar != null) {
                lVar.c(str);
            }
        }

        @Override // com.huawei.openalliance.ad.download.l
        public void b(String str) {
            com.huawei.openalliance.ad.download.l lVar = this.f20734a.get();
            if (lVar != null) {
                lVar.b(str);
            }
        }

        @Override // com.huawei.openalliance.ad.download.l
        public void b(AppDownloadTask appDownloadTask) {
            com.huawei.openalliance.ad.download.l lVar = this.f20734a.get();
            if (lVar != null) {
                lVar.b(appDownloadTask);
            }
        }

        @Override // com.huawei.openalliance.ad.download.k
        public void a(String str, int i) {
            com.huawei.openalliance.ad.download.l lVar = this.f20734a.get();
            if (lVar != null) {
                lVar.a(str, i);
            }
        }

        @Override // com.huawei.openalliance.ad.download.l
        public void a(String str) {
            com.huawei.openalliance.ad.download.l lVar = this.f20734a.get();
            if (lVar != null) {
                lVar.a(str);
            }
        }

        @Override // com.huawei.openalliance.ad.download.l
        public void a(AppDownloadTask appDownloadTask) {
            com.huawei.openalliance.ad.download.l lVar = this.f20734a.get();
            if (lVar != null) {
                lVar.a(appDownloadTask);
            }
        }

        public d(com.huawei.openalliance.ad.download.l lVar) {
            this.f20734a = new WeakReference<>(lVar);
        }
    }

    private void A() {
        if (this.J == null) {
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        this.J.c("ad_download_btn_dynamic");
        this.J.i(Integer.valueOf(iArr[0]));
        this.J.j(Integer.valueOf(iArr[1]));
        this.J.k(Integer.valueOf(getWidth()));
        this.J.l(Integer.valueOf(getHeight()));
        this.J.m(0);
        this.J.n(0);
        this.J.o(0);
        this.J.p(0);
        this.J.q(Integer.valueOf(com.huawei.openalliance.ad.utils.d.f(getContext()).widthPixels));
        this.J.r(Integer.valueOf(com.huawei.openalliance.ad.utils.d.f(getContext()).heightPixels));
    }

    public AppDownloadButton(Context context, Boolean bool, IProgressButton iProgressButton, ImageView imageView) {
        super(context, bool, iProgressButton, imageView);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, (AttributeSet) null, -1, -1);
    }

    public AppDownloadButton(Context context, Boolean bool, IProgressButton iProgressButton) {
        super(context, bool, iProgressButton);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, (AttributeSet) null, -1, -1);
    }

    public AppDownloadButton(Context context, Boolean bool) {
        super(context, bool);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, (AttributeSet) null, -1, -1);
    }

    static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OnStatusRefreshedListener f20736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<AppDownloadButton> f20737b;

        @Override // java.lang.Runnable
        public void run() {
            final AppDownloadButton appDownloadButton = this.f20737b.get();
            if (appDownloadButton != null) {
                final AppDownloadTask appDownloadTaskL = appDownloadButton.l();
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.AppDownloadButton.g.1
                    @Override // java.lang.Runnable
                    public void run() {
                        appDownloadButton.c(appDownloadTaskL);
                        if (g.this.f20736a != null) {
                            g.this.f20736a.onRefreshed(appDownloadButton.j);
                        }
                    }
                });
            }
        }

        public g(AppDownloadButton appDownloadButton, OnStatusRefreshedListener onStatusRefreshedListener) {
            this.f20736a = onStatusRefreshedListener;
            this.f20737b = new WeakReference<>(appDownloadButton);
        }
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, attributeSet, i, i2);
    }

    static class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<AppDownloadButton> f20733a;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppDownloadButton appDownloadButton = this.f20733a.get();
            if (appDownloadButton == null) {
                return;
            }
            hw.b(appDownloadButton.f21122a, "on cancel btn click.");
            appDownloadButton.a();
        }

        public c(AppDownloadButton appDownloadButton) {
            this.f20733a = new WeakReference<>(appDownloadButton);
        }
    }

    static class f implements OnResolutionRequiredListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        OnResolutionRequiredListener f20735a;

        @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnResolutionRequiredListener
        public void onResolutionRequired(AppInfo appInfo, Bundle bundle) {
            hw.b("ResReqListener", "onResolutionRequired");
            OnResolutionRequiredListener onResolutionRequiredListener = this.f20735a;
            if (onResolutionRequiredListener != null) {
                onResolutionRequiredListener.onResolutionRequired(appInfo, bundle);
            }
        }

        public f(OnResolutionRequiredListener onResolutionRequiredListener) {
            this.f20735a = onResolutionRequiredListener;
        }
    }

    static class h implements OnSuccessListener<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<AppDownloadButton> f20741a;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            hw.b("AppDownloadButton", "onSuccess ret: %s.", bool);
            AppDownloadButton appDownloadButton = this.f20741a.get();
            if (appDownloadButton == null) {
                hw.c("AppDownloadButton", "button is null");
            } else {
                hw.b("AppDownloadButton", "button doClick");
                appDownloadButton.o();
            }
        }

        public h(AppDownloadButton appDownloadButton) {
            this.f20741a = new WeakReference<>(appDownloadButton);
        }
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, attributeSet, i, -1);
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.views.AppDownloadButton$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20720b;

        static {
            int[] iArr = new int[AppStatus.values().length];
            f20720b = iArr;
            try {
                iArr[AppStatus.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20720b[AppStatus.WAITING_FOR_WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20720b[AppStatus.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20720b[AppStatus.DOWNLOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20720b[AppStatus.INSTALLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20720b[AppStatus.INSTALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20720b[AppStatus.INSTALLING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[com.huawei.openalliance.ad.download.e.values().length];
            f20719a = iArr2;
            try {
                iArr2[com.huawei.openalliance.ad.download.e.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.WAITING_FOR_WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.WAITING.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.DOWNLOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.DOWNLOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.INSTALLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.INSTALLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20719a[com.huawei.openalliance.ad.download.e.IDLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public AppDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, attributeSet, -1, -1);
    }

    public AppDownloadButton(Context context) {
        super(context);
        this.j = AppStatus.DOWNLOAD;
        this.l = -1;
        this.n = true;
        this.o = 1;
        this.q = false;
        this.r = 2;
        this.x = true;
        this.C = true;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.K = false;
        a(context, (AttributeSet) null, -1, -1);
    }
}
