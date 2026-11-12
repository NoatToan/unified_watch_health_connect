package com.huawei.hms.ads.uiengine;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.ads.template.downloadbuttonstyle.RemoteButtonStyleAttr;
import com.huawei.hms.ads.uiengine.common.InterstitialApi;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.br;
import com.huawei.openalliance.ad.bs;
import com.huawei.openalliance.ad.bu;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.InterstitialKeys;
import com.huawei.openalliance.ad.constant.InterstitialMethods;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.NativeSdkCallbackMethods;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.download.app.h;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.im;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.iy;
import com.huawei.openalliance.ad.pb;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.sx;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.l;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.interfaces.x;
import com.huawei.openalliance.ad.views.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class f implements InterstitialApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12861a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentRecord f12863c;
    private pc d;
    private com.huawei.openalliance.ad.inter.data.d e;
    private WeakReference<s> f;
    private AppDownloadButton g;

    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public void updateShowId(long j) {
        if (this.f12863c == null || this.d == null) {
            hw.b("InterstitialProxy", "updateShowId, contentRecord or eventProcessor is null");
            return;
        }
        hw.a("InterstitialProxy", NativeSdkCallbackMethods.UPDATE_SHOW_ID);
        com.huawei.openalliance.ad.inter.data.d dVar = this.e;
        if (dVar != null) {
            dVar.c(j);
            this.e.h(String.valueOf(j));
        }
        this.f12863c.h(j);
        this.f12863c.c(String.valueOf(j));
        this.d.a(this.f12863c);
        AppDownloadButton appDownloadButton = this.g;
        if (appDownloadButton != null) {
            appDownloadButton.updateStartShowTime(j);
            this.g.updateContent(String.valueOf(j));
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public void setIsVideoCompleted(boolean z) {
        s sVar = this.f.get();
        if (sVar != null) {
            sVar.setCompleted(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public void reportEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str) || this.d == null) {
            hw.c("InterstitialProxy", "eventType or eventProcessor is null.");
            return;
        }
        hw.b("InterstitialProxy", "reportEvent, type: %s", str);
        str.hashCode();
        switch (str) {
            case "playPause":
            case "playEnd":
                b(str, bundle);
                break;
            case "playStart":
                this.d.c();
                break;
            case "showstart":
                this.d.b();
                break;
            case "onSoundClick":
                d(bundle);
                break;
            case "phyImp":
                b(bundle);
                break;
            case "imp":
                e(bundle);
                break;
            case "click":
                c(bundle);
                break;
            case "playResume":
                this.d.f();
                break;
            case "playTime":
                a(bundle);
                break;
            default:
                hw.b("InterstitialProxy", "reportEvent, fail to default");
                break;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public void registerBtn(View view, Bundle bundle) {
        if (view == null || bundle == null) {
            hw.c("InterstitialProxy", "btn or param is null.");
            return;
        }
        gr grVar = new gr(bundle);
        int iB = grVar.b(ParamConstants.BtnParams.DOWNLOAD_BUTTON_STYLE);
        boolean zA = grVar.a(ParamConstants.BtnParams.APP_RELATED, false);
        String strA = grVar.a("download_text", (String) null);
        String strA2 = grVar.a("installed_text", (String) null);
        final String strA3 = grVar.a(InterstitialKeys.BTN_TEXT, "");
        int iA = grVar.a("btn_source", 5);
        RemoteButtonStyleAttr remoteButtonStyleAttrA = 4 == iB ? bu.a(bundle) : null;
        if (remoteButtonStyleAttrA == null) {
            iB = 2;
        }
        if (hw.a()) {
            hw.a("InterstitialProxy", "btnStyle is %s, isAppRelated is %s, downloadText is %s, installedText is %s, btnText is %s, btnSource is %s.", Integer.valueOf(iB), Boolean.valueOf(zA), strA, strA2, strA3, Integer.valueOf(iA));
        }
        if (!(view instanceof AppDownloadButton)) {
            hw.b("InterstitialProxy", "btn is %s, not AppDownloadButton.", view.getClass().getSimpleName());
            return;
        }
        ContentRecord contentRecord = this.f12863c;
        if (contentRecord != null && contentRecord.D() == 0) {
            view.setVisibility(8);
            return;
        }
        if (this.f.get() == null) {
            hw.c("InterstitialProxy", "register button, interstitial container is null.");
            return;
        }
        hw.b("InterstitialProxy", "registerDownloadBtn");
        AppDownloadButton appDownloadButton = (AppDownloadButton) view;
        this.g = appDownloadButton;
        bu.b(this.f12862b, appDownloadButton, iB, remoteButtonStyleAttrA);
        if (zA) {
            hw.b("InterstitialProxy", "register btn");
            this.g.setAdLandingPageData(new AdLandingPageData(this.f12863c, this.f12862b, true));
            if (!TextUtils.isEmpty(strA2)) {
                this.g.setAfDlBtnText(strA2);
            }
            if (!TextUtils.isEmpty(strA)) {
                this.g.setDlBtnText(strA);
            }
            a(this.g);
        } else {
            hw.a("InterstitialProxy", "show btn.");
            this.g.a(new View.OnClickListener() { // from class: com.huawei.hms.ads.uiengine.f.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    f fVar = f.this;
                    fVar.a(fVar.g, false);
                }
            });
            this.g.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.hms.ads.uiengine.f.2
                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
                public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                    return com.huawei.openalliance.ad.utils.c.b(f.this.f12862b, f.this.f12863c) ? f.this.f12862b.getString(R.string.hiad_learn_more) : l.a(strA3, f.this.f12862b.getString(R.string.hiad_detail));
                }
            });
        }
        this.g.setSource(iA);
    }

    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public boolean processWhyEventUnified() {
        return as.a(this.f12862b, this.f12863c);
    }

    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public void onAnalysis(String str, Bundle bundle) {
        new br(this.f12862b).a(str, bundle, this.f12863c, this.d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    @Override // com.huawei.hms.ads.uiengine.common.InterstitialApi
    public Bundle callMethod(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hw.b("InterstitialProxy", "callMethod: %s", str);
        str.hashCode();
        switch (str) {
            case "reportCommonEvent":
                new bs(this.f12862b).a(bundle, this.f12863c, this.d);
                return null;
            case "showNonWifiPlay":
                c();
                return null;
            case "showAppDesc":
            case "showPrivacy":
            case "showPermission":
                c(str, bundle);
                return null;
            case "onAdClick":
                return a();
            case "hideNonWifiPlay":
                d();
                return null;
            case "update_btn_style":
                f(bundle);
                return null;
            case "updateBtnClickInfo":
                g(bundle);
                return null;
            case "queryProxyUrl":
                return i(bundle);
            case "handleClose":
                b();
                return null;
            default:
                hw.b("InterstitialProxy", "call method default.");
                return null;
        }
    }

    public void a(String str, Bundle bundle) {
        s sVar = this.f.get();
        if (sVar != null) {
            sVar.onCallBack(str, bundle);
        }
    }

    private Bundle i(Bundle bundle) {
        if (bundle == null) {
            hw.c("InterstitialProxy", "getProxyUrl, param is null");
            return null;
        }
        gr grVar = new gr(bundle);
        String strD = grVar.d(InterstitialKeys.ORI_URL);
        String strD2 = grVar.d("sha256");
        hw.b("InterstitialProxy", "getProxyUrl, videoUrl is %s, sha256 is %s.", strD, strD2);
        if (!dg.l(strD) || dg.b(strD2)) {
            hw.b("InterstitialProxy", "videoUrl or sha256 is invalid.");
            return null;
        }
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.f(strD);
        videoInfo.d(strD2);
        String strA = as.a(this.f12862b, videoInfo, new a(this, videoInfo));
        hw.b("InterstitialProxy", "proxyUrl is %s.", strA);
        gr grVar2 = new gr();
        grVar2.b(InterstitialKeys.PROXY_URL, strA);
        return grVar2.a();
    }

    private void h(Bundle bundle) {
        if (this.f.get() == null || this.e == null) {
            hw.c("InterstitialProxy", "showAppDesc, container or interstitial is null.");
            return;
        }
        MaterialClickInfo materialClickInfo = (MaterialClickInfo) bk.b(this.f12862b, new gr(bundle).d("click_info"), MaterialClickInfo.class, new Class[0]);
        if (materialClickInfo == null || !dg.r(materialClickInfo.f()) || materialClickInfo.b() == null) {
            this.e.showAppDetailPage(this.f12862b);
        } else {
            hw.a("InterstitialProxy", "showAppDesc with clickInfo.");
            this.e.a(this.f12862b, materialClickInfo);
        }
    }

    private void g(Bundle bundle) {
        MaterialClickInfo materialClickInfo = (MaterialClickInfo) bk.b(this.f12862b, new gr(bundle).d("click_info"), MaterialClickInfo.class, new Class[0]);
        if (hw.a()) {
            hw.a("InterstitialProxy", "updateBtnClickInfo, clickInfo is %s.", materialClickInfo);
        }
        AppDownloadButton appDownloadButton = this.g;
        if (appDownloadButton != null) {
            appDownloadButton.a(materialClickInfo);
        }
    }

    private void f(Bundle bundle) {
        String str;
        if (this.g == null || bundle == null) {
            str = "null btn or param";
        } else {
            gr grVar = new gr(bundle);
            hw.b("InterstitialProxy", "update btn");
            int iB = grVar.b(ParamConstants.BtnParams.DOWNLOAD_BUTTON_STYLE);
            if (4 != iB) {
                return;
            }
            RemoteButtonStyleAttr remoteButtonStyleAttrA = bu.a(bundle);
            if (remoteButtonStyleAttrA != null) {
                bu.a(this.f12862b, this.g, iB, remoteButtonStyleAttrA);
                return;
            }
            str = "attr null";
        }
        hw.c("InterstitialProxy", str);
    }

    private void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        gr grVar = new gr(bundle);
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(grVar.c("show_duration"))).a(Integer.valueOf(grVar.b("show_ratio"))).e(grVar.d(MapKeyNames.CREATIVE_SIZE)).d(grVar.d("show_position")).c(grVar.a("isInteractiveImp"));
        int iB = grVar.b("imp_source");
        if (-1 != iB) {
            c0229a.b(Integer.valueOf(iB));
        }
        this.d.a(c0229a.a());
    }

    private void d(Bundle bundle) {
        if (bundle == null) {
            hw.c("InterstitialProxy", "reportSoundClick, param is null.");
        } else {
            this.d.b(new gr(bundle).a("is_mute"));
        }
    }

    private void d() {
        s sVar = this.f.get();
        if (sVar != null) {
            sVar.c();
            sVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    private void c(String str, Bundle bundle) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            hw.c("InterstitialProxy", "method is null.");
            return;
        }
        AppInfo appInfo = this.e.getAppInfo();
        if (appInfo == null) {
            hw.c("InterstitialProxy", "appInfo is null.");
            return;
        }
        hw.b("InterstitialProxy", "handleAppElementClick, method is %s.", str);
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -406271339) {
            if (iHashCode != 73660875) {
                if (iHashCode == 1076470956 && str.equals("showPermission")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("showPrivacy")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("showAppDesc")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            h(bundle);
            return;
        }
        if (b2 == 1) {
            appInfo.showPrivacyPolicy(this.f12862b);
        } else if (b2 != 2) {
            hw.b("InterstitialProxy", "handleAppElementClick, fail to default");
        } else {
            a(appInfo);
        }
    }

    private void c(Bundle bundle) {
        if (bundle == null) {
            hw.c("InterstitialProxy", "reportClickEvent, param is null.");
            return;
        }
        gr grVar = new gr(bundle);
        int iB = grVar.b("click_source");
        String strD = grVar.d("click_destination");
        String strD2 = grVar.d("click_info");
        if (hw.a()) {
            hw.a("InterstitialProxy", "reportClickEvent, clickSource is %s, clickDestination is %s, materialClickInfoStr is %s.", Integer.valueOf(iB), strD, strD2);
        }
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar.a(Integer.valueOf(iB)).b(strD).a((MaterialClickInfo) bk.b(strD2, MaterialClickInfo.class, new Class[0]));
        this.d.a(aVar.a());
    }

    private void c() {
        s sVar = this.f.get();
        if (sVar != null) {
            sVar.pauseView();
            sVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    private void b(String str, Bundle bundle) {
        byte b2;
        if (bundle == null || this.d == null) {
            hw.c("InterstitialProxy", "param or process is null, can't report pause or end");
            return;
        }
        try {
            gr grVar = new gr(bundle);
            long jC = grVar.c("video_start_ts");
            long jC2 = grVar.c("video_end_ts");
            int iB = grVar.b("video_start_time");
            int iB2 = grVar.b("video_end_time");
            int iHashCode = str.hashCode();
            if (iHashCode != -1891923166) {
                if (iHashCode == -493598457 && str.equals("playEnd")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(InterstitialKeys.RPT_PLAY_PAUSE)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                this.d.c(jC, jC2, iB, iB2);
            } else if (b2 != 1) {
                hw.b("InterstitialProxy", "report end or pause fall to default.");
            } else {
                this.d.b(jC, jC2, iB, iB2);
            }
        } catch (Throwable th) {
            hw.c("InterstitialProxy", "report pause or end err: %s", th.getClass().getSimpleName());
        }
    }

    private void b(Bundle bundle) {
        if (bundle == null) {
            hw.c("InterstitialProxy", "reportPhyShow, param is null.");
            return;
        }
        gr grVar = new gr(bundle);
        long jC = grVar.c("show_duration");
        int iB = grVar.b("show_ratio");
        int iB2 = grVar.b("video_played_time");
        int iB3 = grVar.b("video_progress");
        pb pbVar = new pb();
        pbVar.b(Integer.valueOf(iB2));
        pbVar.a(Integer.valueOf(iB3));
        this.d.a(jC, iB, pbVar);
    }

    private void b() {
        s sVar = this.f.get();
        if (sVar == null) {
            hw.c("InterstitialProxy", "handleClose, container is null.");
        } else {
            sVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppDownloadButton appDownloadButton, boolean z) {
        s sVar = this.f.get();
        if (sVar == null) {
            hw.c("InterstitialProxy", "handleBtnClick, container is null.");
            return;
        }
        String strD = AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : "";
        gr grVar = new gr();
        grVar.b(InterstitialKeys.IS_BTN_HANDLED, z);
        if (!z) {
            strD = new gr(sVar.i()).d("click_destination");
        }
        if (com.huawei.openalliance.ad.utils.c.b(this.f12862b, this.f12863c)) {
            strD = ClickDestination.WEB;
        }
        if (dg.b(strD)) {
            sVar.a((Bundle) null);
        } else {
            grVar.b("click_destination", strD);
            sVar.a(grVar.a());
        }
    }

    private void a(AppDownloadButton appDownloadButton) {
        appDownloadButton.setClickActionListener(new x() { // from class: com.huawei.hms.ads.uiengine.f.3
            @Override // com.huawei.openalliance.ad.views.interfaces.x
            public void b(AppDownloadButton appDownloadButton2) {
                hw.b("InterstitialProxy", "DownloadButton onClickActionValid.");
                f.this.a(appDownloadButton2, true);
            }

            @Override // com.huawei.openalliance.ad.views.interfaces.x
            public void a(AppDownloadButton appDownloadButton2) {
                f.this.a(appDownloadButton2, false);
            }
        });
        appDownloadButton.a(new AppDownloadButton.b() { // from class: com.huawei.hms.ads.uiengine.f.4
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.b
            public void a() {
                s sVar = (s) f.this.f.get();
                if (sVar != null) {
                    sVar.a(2, (Bundle) null);
                }
            }
        });
        appDownloadButton.setOnDownloadStatusChangedListener(new AppDownloadButton.OnDownloadStatusChangedListener() { // from class: com.huawei.hms.ads.uiengine.f.5
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onUserCancel(AppInfo appInfo) {
            }

            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onStatusChanged(AppStatus appStatus) {
                if (appStatus == null || f.this.f.get() == null) {
                    return;
                }
                hw.a("InterstitialProxy", "onStatusChanged, status:%s", appStatus.toString());
                ((s) f.this.f.get()).onAppStatusChanged(appStatus.toString());
            }
        });
    }

    private void a(AppInfo appInfo) {
        if (TextUtils.isEmpty(appInfo.getPermissionUrl())) {
            h.a(this.f12862b, appInfo);
        } else {
            appInfo.showPermissionPage(this.f12862b);
        }
    }

    private void a(Bundle bundle) {
        if (bundle == null || this.f12863c == null) {
            hw.c("InterstitialProxy", "param or contentRecord is null.");
            return;
        }
        gr grVar = new gr(bundle);
        String str = this.f12861a;
        if (str != null && str.equals(this.f12863c.l())) {
            hw.b("InterstitialProxy", "Duplicate escalation videoTime event for %s", this.f12863c.l());
            return;
        }
        this.d.a(grVar.c(ParamConstants.Param.VIDEO_PLAY_TIME));
        this.f12861a = this.f12863c.l();
    }

    /* JADX INFO: loaded from: classes33.dex */
    static class a implements iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<f> f12870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private VideoInfo f12871b;

        @Override // com.huawei.openalliance.ad.iy
        public void a(int i) {
            hw.c("InterstitialProxy", "InterstitialStreamListener onError, code is %s.", Integer.valueOf(i));
            f fVar = this.f12870a.get();
            if (fVar == null) {
                hw.c("InterstitialProxy", "proxy is null.");
                return;
            }
            gr grVar = new gr();
            grVar.b(InterstitialKeys.STREAM_ERROR_CODE, i);
            VideoInfo videoInfo = this.f12871b;
            if (videoInfo != null && !TextUtils.isEmpty(videoInfo.g())) {
                grVar.b(InterstitialKeys.STREAM_DATA_CONSUME, im.a().a(this.f12871b.g()));
            }
            fVar.a(InterstitialMethods.NOTIFY_STREAM_ERROR, grVar.a());
        }

        public a(f fVar, VideoInfo videoInfo) {
            this.f12870a = new WeakReference<>(fVar);
            this.f12871b = videoInfo;
        }
    }

    private Bundle a() {
        s sVar = this.f.get();
        if (sVar != null) {
            return sVar.h();
        }
        hw.c("InterstitialProxy", "handleVideoClick, container is null.");
        return null;
    }

    public f(Context context, s sVar, ContentRecord contentRecord, com.huawei.openalliance.ad.inter.data.d dVar) {
        this.f12862b = context;
        this.f = new WeakReference<>(sVar);
        this.f12863c = contentRecord;
        this.e = dVar;
        pc pcVar = new pc(context, new sx(context));
        this.d = pcVar;
        pcVar.a(contentRecord);
    }
}
