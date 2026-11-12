package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.template.downloadbuttonstyle.RemoteButtonStyleAttr;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.InterstitialKeys;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.RewardKeys;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.constant.StatusChangeMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class by extends com.huawei.hms.ads.uiengine.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f18314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f18315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentRecord f18316c;
    private com.huawei.openalliance.ad.inter.data.i d;
    private pc e;
    private WeakReference<com.huawei.openalliance.ad.views.interfaces.j> f;
    private IPPSUiEngineCallback g;
    private MaterialClickInfo h;
    private String i;

    @Override // com.huawei.hms.ads.uiengine.d
    public Bundle b(String str, IObjectWrapper iObjectWrapper, Bundle bundle) {
        return null;
    }

    public void f(String str, Bundle bundle) {
        if (this.g == null) {
            hw.c("RewardProxy", "on call back, call back is null");
            return;
        }
        hw.b("RewardProxy", "onCallback, method: %s", str);
        try {
            this.g.onCallResult(str, bundle);
        } catch (Throwable th) {
            hw.c("RewardProxy", "onCallback ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public void e(String str, Bundle bundle) {
        Integer numJ = com.huawei.openalliance.ad.utils.dg.j(str);
        if (numJ == null) {
            hw.c("RewardProxy", "invalid status, skip handle.");
            return;
        }
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar == null) {
            hw.c("RewardProxy", "rewardView is null, skip status handle.");
        } else {
            jVar.a(numJ.intValue(), bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // com.huawei.hms.ads.uiengine.d
    public void d(String str, Bundle bundle) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hw.b("RewardProxy", "showDialog, type: %s", str);
        str.hashCode();
        switch (str) {
            case "showCloseConfirm":
                b2 = 0;
                break;
            case "showNonWifiPlay":
                b2 = 1;
                break;
            case "hideNonWifiPlay":
                b2 = 2;
                break;
            case "showDownloadConfirm":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            h(bundle);
            return;
        }
        if (b2 == 1) {
            e();
            return;
        }
        if (b2 == 2) {
            f();
        } else if (b2 != 3) {
            hw.b("RewardProxy", "showDialog, fall to default.");
        } else {
            g();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public void c(String str, Bundle bundle) {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar != null) {
            jVar.a(str, (RewardItem) com.huawei.openalliance.ad.utils.bk.b(new gr(bundle).d(RewardKeys.REWARD_ITEM), RewardItem.class, new Class[0]));
        }
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public boolean b(Bundle bundle) {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar == null || bundle == null) {
            return false;
        }
        gr grVar = new gr(bundle);
        return jVar.a(grVar.a("click_source", 7), (MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(grVar.d("click_info"), MaterialClickInfo.class, new Class[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    @Override // com.huawei.hms.ads.uiengine.d
    public void b(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
        }
        hw.b("RewardProxy", "reportEvent, type: %s", str);
        str.hashCode();
        switch (str) {
            case "playPause":
            case "playEnd":
                g(str, bundle);
                break;
            case "playStart":
                this.e.c();
                break;
            case "showstart":
                d();
                break;
            case "onSoundClick":
                f(bundle);
                break;
            case "phyImp":
                d(bundle);
                break;
            case "imp":
                g(bundle);
                break;
            case "click":
                e(bundle);
                break;
            case "playResume":
                this.e.f();
                break;
            case "playTime":
                c(bundle);
                break;
            default:
                hw.b("RewardProxy", "reportEvent, fall to default");
                break;
        }
    }

    public void b() {
        com.huawei.openalliance.ad.download.app.d.a().c(this.f18314a);
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public boolean a() {
        return com.huawei.openalliance.ad.utils.as.a(this.f18315b, this.f18316c);
    }

    public void a(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(RewardKeys.DIALOG_TYPE, str);
        bundle.putBoolean(RewardKeys.IS_DISPLAYING, z);
        bundle.putString(RewardKeys.DIALOG_CLICK_TYPE, str2);
        try {
            f(RewardMethods.NOTIFY_DIALOG_STATUS, bundle);
        } catch (Throwable th) {
            hw.c("RewardProxy", "notify dialog status ex: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    @Override // com.huawei.hms.ads.uiengine.d
    public void a(String str, IObjectWrapper iObjectWrapper, Bundle bundle) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hw.b("RewardProxy", "callMethod: %s", str);
        str.hashCode();
        switch (str) {
            case "reportCommonEvent":
                b2 = 0;
                break;
            case "showAppDesc":
                b2 = 1;
                break;
            case "showPrivacy":
                b2 = 2;
                break;
            case "update_btn_style":
                b2 = 3;
                break;
            case "showPermission":
                b2 = 4;
                break;
            case "update_btn_data":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            new bs(this.f18315b).a(bundle, this.f18316c, this.e);
            return;
        }
        if (b2 != 1 && b2 != 2) {
            if (b2 == 3) {
                b(iObjectWrapper, bundle);
                return;
            } else if (b2 != 4) {
                if (b2 != 5) {
                    hw.b("RewardProxy", "call method fall to default.");
                    return;
                } else {
                    a(iObjectWrapper, bundle);
                    return;
                }
            }
        }
        a(str);
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public void a(String str, Bundle bundle) {
        new br(this.f18315b).a(str, bundle, this.f18316c, this.e);
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public void a(IPPSUiEngineCallback iPPSUiEngineCallback) {
        this.g = iPPSUiEngineCallback;
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public void a(IObjectWrapper iObjectWrapper, final String str, Bundle bundle) {
        if (iObjectWrapper == null || bundle == null) {
            return;
        }
        gr grVar = new gr(bundle);
        int iB = grVar.b(ParamConstants.BtnParams.DOWNLOAD_BUTTON_STYLE);
        boolean zA = grVar.a(ParamConstants.BtnParams.APP_RELATED, false);
        String strA = grVar.a("download_text", (String) null);
        String strA2 = grVar.a("installed_text", (String) null);
        final int iA = grVar.a("btn_source", 5);
        RemoteButtonStyleAttr remoteButtonStyleAttrA = 4 == iB ? bu.a(bundle) : null;
        if (remoteButtonStyleAttrA == null) {
            iB = 2;
        }
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        if (view instanceof AppDownloadButton) {
            if (this.f18316c.D() == 0) {
                view.setVisibility(8);
                return;
            }
            final com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
            if (jVar == null) {
                hw.c("RewardProxy", "regBtn, rewardView ref is null.");
                return;
            }
            hw.b("RewardProxy", "registerDownloadBtn");
            final AppDownloadButton appDownloadButton = (AppDownloadButton) view;
            bu.b(this.f18315b, appDownloadButton, iB, remoteButtonStyleAttrA);
            if (zA) {
                hw.b("RewardProxy", "register btn");
                appDownloadButton.setAdLandingPageData(new AdLandingPageData(this.f18316c, this.f18315b, true));
                if (!TextUtils.isEmpty(strA2)) {
                    appDownloadButton.setAfDlBtnText(strA2);
                }
                if (!TextUtils.isEmpty(strA)) {
                    appDownloadButton.setDlBtnText(strA);
                }
                a(appDownloadButton, jVar);
            } else {
                hw.a("RewardProxy", "show btn");
                appDownloadButton.a(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.by.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        by.this.a(appDownloadButton, iA, false);
                        jVar.a(2, (Bundle) null);
                    }
                });
                appDownloadButton.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.openalliance.ad.by.2
                    @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
                    public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                        return com.huawei.openalliance.ad.utils.c.b(by.this.f18315b, by.this.f18316c) ? by.this.f18315b.getString(R.string.hiad_learn_more) : com.huawei.openalliance.ad.utils.l.a(str, by.this.f18315b.getString(R.string.hiad_detail));
                    }
                });
            }
            appDownloadButton.setSource(iA);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.d
    public void a(Bundle bundle) {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar != null) {
            jVar.k();
        }
    }

    public void a(long j) {
        ContentRecord contentRecord;
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar != null) {
            iVar.c(j);
            this.d.h(String.valueOf(j));
        }
        if (this.e == null || (contentRecord = this.f18316c) == null) {
            return;
        }
        contentRecord.c(String.valueOf(j));
        this.f18316c.h(j);
        this.e.a(this.f18316c);
    }

    private void h(Bundle bundle) {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        int iA = bundle != null ? new gr(bundle).a(RewardKeys.RWD_GN_TIME, -1) : -1;
        if (jVar == null) {
            hw.c("RewardProxy", "handle close confirm, view is null.");
        } else {
            jVar.a(iA);
            a(RewardMethods.SHOW_CLOSE_CONFIRM, true, (String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    private void g(String str, Bundle bundle) {
        byte b2;
        if (bundle == null || this.e == null) {
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
                this.e.c(jC, jC2, iB, iB2);
            } else if (b2 != 1) {
                hw.b("RewardProxy", "report end or pause fall to default.");
            } else {
                this.e.b(jC, jC2, iB, iB2);
            }
        } catch (Throwable th) {
            hw.c("RewardProxy", "reportPauseOrEnd err: %s", th.getClass().getSimpleName());
        }
    }

    private void g(Bundle bundle) {
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
        this.e.a(c0229a.a());
    }

    private void g() {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar != null) {
            a(RewardMethods.SHOW_DOWNLOAD_CONFIRM, jVar.c(false), (String) null);
        } else {
            hw.c("RewardProxy", "handle download confirm, view is null");
        }
    }

    private void f(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.e.b(new gr(bundle).a("is_mute"));
    }

    private void f() {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar != null) {
            jVar.j();
            jVar.e();
        }
    }

    private void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        gr grVar = new gr(bundle);
        int iB = grVar.b("click_source");
        String strD = grVar.d("click_destination");
        String strD2 = grVar.d("click_info");
        hw.b("RewardProxy", "reportClickEvent.");
        if (hw.a()) {
            hw.a("RewardProxy", "materiaClickInfo: %s", strD2);
        }
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar.b(strD).a(Integer.valueOf(iB)).a((MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(strD2, MaterialClickInfo.class, new Class[0]));
        this.e.a(aVar.a());
    }

    private void e() {
        com.huawei.openalliance.ad.views.interfaces.j jVar = this.f.get();
        if (jVar == null) {
            hw.c("RewardProxy", "handle show nonWifi, view is null.");
        } else {
            jVar.i();
            a("showNonWifiPlay", true, (String) null);
        }
    }

    private void d(Bundle bundle) {
        if (bundle == null) {
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
        this.e.a(jC, iB, pbVar);
    }

    private void d() {
        this.e.b();
    }

    private void c(AppDownloadButton appDownloadButton, Bundle bundle) {
        String str;
        if (appDownloadButton == null || bundle == null) {
            return;
        }
        hw.a("RewardProxy", "update btn clickInfo start");
        String strD = new gr(bundle).d("click_info");
        if (com.huawei.openalliance.ad.utils.dg.b(strD)) {
            str = "update btn clickInfo failed:  clickInfoStr is empty";
        } else {
            MaterialClickInfo materialClickInfo = (MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(strD, MaterialClickInfo.class, new Class[0]);
            if (materialClickInfo != null) {
                this.h = materialClickInfo;
                appDownloadButton.a(materialClickInfo);
                return;
            }
            str = "update btn clickInfo failed:  clickInfo Object is null";
        }
        hw.c("RewardProxy", str);
    }

    private void c(Bundle bundle) {
        ContentRecord contentRecord = this.f18316c;
        if (contentRecord == null || this.e == null) {
            hw.b("RewardProxy", "contentRecord or eventProcessor is null");
            return;
        }
        if (bundle != null) {
            try {
                if (contentRecord.l() != null && this.f18316c.l().equals(this.i)) {
                    hw.b("RewardProxy", "Duplicate escalation videoTime event for %s", this.f18316c.l());
                    return;
                }
                this.e.a(bundle.getLong(ParamConstants.Param.VIDEO_PLAY_TIME));
                this.i = this.f18316c.l();
            } catch (Throwable th) {
                hw.c("RewardProxy", "reportPlayTime err: %s", th.getClass().getSimpleName());
            }
        }
    }

    private void b(AppDownloadButton appDownloadButton, Bundle bundle) {
        if (appDownloadButton == null || bundle == null) {
            return;
        }
        hw.a("RewardProxy", "update btn content start");
        long jC = new gr(bundle).c(RewardKeys.SHOW_TIME);
        Long lValueOf = Long.valueOf(jC);
        lValueOf.getClass();
        if (jC == 0) {
            hw.c("RewardProxy", "update btn content failed: showTime is empty");
            return;
        }
        lValueOf.getClass();
        appDownloadButton.updateStartShowTime(jC);
        appDownloadButton.updateContent(String.valueOf(lValueOf));
    }

    private void b(IObjectWrapper iObjectWrapper, Bundle bundle) {
        if (iObjectWrapper == null || bundle == null) {
            return;
        }
        hw.b("RewardProxy", "update btn style");
        int iB = new gr(bundle).b(ParamConstants.BtnParams.DOWNLOAD_BUTTON_STYLE);
        if (4 == iB) {
            RemoteButtonStyleAttr remoteButtonStyleAttrA = bu.a(bundle);
            if (remoteButtonStyleAttrA == null) {
                hw.c("RewardProxy", "attr null");
            } else {
                a(iObjectWrapper, iB, remoteButtonStyleAttrA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("app_status_method", str);
        if (str2 != null) {
            bundle.putString("app_status", str2);
        }
        f("notifyAppStatus", bundle);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    private void a(String str) {
        com.huawei.openalliance.ad.inter.data.i iVar;
        AppInfo appInfo;
        byte b2;
        if (TextUtils.isEmpty(str) || (iVar = this.d) == null || (appInfo = iVar.getAppInfo()) == null) {
            return;
        }
        hw.b("RewardProxy", "handleAppElementClick, type: %s", str);
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
            MaterialClickInfo materialClickInfo = this.h;
            if (materialClickInfo == null || !com.huawei.openalliance.ad.utils.dg.r(materialClickInfo.f()) || this.h.b() == null) {
                this.d.showAppDetailPage(this.f18315b);
                return;
            } else {
                this.d.a(this.f18315b, this.h);
                return;
            }
        }
        if (b2 == 1) {
            appInfo.showPrivacyPolicy(this.f18315b);
            return;
        }
        if (b2 != 2) {
            hw.b("RewardProxy", "handle app element click, fall to default");
        } else if (TextUtils.isEmpty(appInfo.getPermissionUrl())) {
            com.huawei.openalliance.ad.download.app.h.a(this.f18315b, appInfo);
        } else {
            appInfo.showPermissionPage(this.f18315b);
        }
    }

    private void a(AppDownloadButton appDownloadButton, final com.huawei.openalliance.ad.views.interfaces.j jVar) {
        appDownloadButton.setClickActionListener(new com.huawei.openalliance.ad.views.interfaces.x() { // from class: com.huawei.openalliance.ad.by.3
            @Override // com.huawei.openalliance.ad.views.interfaces.x
            public void b(AppDownloadButton appDownloadButton2) {
                by.this.a(appDownloadButton2, appDownloadButton2.getSource(), true);
            }

            @Override // com.huawei.openalliance.ad.views.interfaces.x
            public void a(AppDownloadButton appDownloadButton2) {
                by.this.a(appDownloadButton2, appDownloadButton2.getSource(), false);
            }
        });
        appDownloadButton.a(new AppDownloadButton.b() { // from class: com.huawei.openalliance.ad.by.4
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.b
            public void a() {
                jVar.a(2, (Bundle) null);
            }
        });
        appDownloadButton.setOnDownloadStatusChangedListener(new AppDownloadButton.OnDownloadStatusChangedListener() { // from class: com.huawei.openalliance.ad.by.5
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onUserCancel(AppInfo appInfo) {
                by.this.a(StatusChangeMethods.CANCEL_DOWN, (String) null);
            }

            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onStatusChanged(AppStatus appStatus) {
                hw.a("RewardProxy", "onStatusChanged:%s", appStatus);
                by.this.a(StatusChangeMethods.STATUS_CHANGE, appStatus.name());
            }
        });
    }

    private void a(AppDownloadButton appDownloadButton, Bundle bundle) {
        if (hw.a()) {
            hw.a("RewardProxy", "update btn click source");
        }
        gr grVar = new gr(bundle);
        int iA = grVar.a("btn_source", -111111);
        boolean zA = grVar.a(RewardKeys.IS_BTN_ONCE_SOURCE, false);
        if (iA == -111111) {
            hw.b("RewardProxy", "no need update source");
        } else if (zA) {
            appDownloadButton.setOnceSource(iA);
        } else {
            appDownloadButton.setSource(iA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppDownloadButton appDownloadButton, int i, boolean z) {
        String str = AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : "";
        if (com.huawei.openalliance.ad.utils.c.b(this.f18315b, this.f18316c)) {
            str = ClickDestination.WEB;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("btn_source", i);
        bundle.putBoolean("is_handled", z);
        bundle.putString("click_destination", str);
        f(RewardMethods.ON_BTN_CLICK, bundle);
    }

    private void a(IObjectWrapper iObjectWrapper, Bundle bundle) {
        hw.b("RewardProxy", "update btn data start");
        if (iObjectWrapper == null || bundle == null) {
            return;
        }
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        if (!(view instanceof AppDownloadButton)) {
            hw.c("RewardProxy", "update btn data failed: btn's type is not AppDownloadButton");
            return;
        }
        AppDownloadButton appDownloadButton = (AppDownloadButton) view;
        b(appDownloadButton, bundle);
        c(appDownloadButton, bundle);
        a(appDownloadButton, bundle);
    }

    static class a implements AppDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<by> f18326a;

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(String str) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onDownloadProgress(AppInfo appInfo, int i) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onStatusChanged(AppStatus appStatus, AppInfo appInfo) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onUserCancel(AppInfo appInfo) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(AppInfo appInfo) {
            by byVar = this.f18326a.get();
            if (byVar == null) {
                return;
            }
            byVar.a(StatusChangeMethods.APP_OPEN, (String) null);
        }

        public a(by byVar) {
            this.f18326a = new WeakReference<>(byVar);
        }
    }

    private void a(IObjectWrapper iObjectWrapper, int i, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        if (iObjectWrapper == null) {
            return;
        }
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        if (view instanceof AppDownloadButton) {
            hw.b("RewardProxy", "update btn start");
            AppDownloadButton appDownloadButton = (AppDownloadButton) view;
            if (this.f.get() == null) {
                return;
            }
            bu.a(this.f18315b, appDownloadButton, i, remoteButtonStyleAttr);
        }
    }

    public by(Context context, com.huawei.openalliance.ad.inter.data.i iVar, com.huawei.openalliance.ad.views.interfaces.j jVar) {
        this.f18315b = context;
        this.d = iVar;
        this.f18316c = pw.a(iVar);
        this.f = new WeakReference<>(jVar);
        Context context2 = this.f18315b;
        pc pcVar = new pc(context2, new tb(context2));
        this.e = pcVar;
        pcVar.a(this.f18316c);
        if (iVar == null || iVar.getAppInfo() == null) {
            return;
        }
        this.f18314a = new a(this);
        com.huawei.openalliance.ad.download.app.d.a().b(this.f18314a);
    }
}
