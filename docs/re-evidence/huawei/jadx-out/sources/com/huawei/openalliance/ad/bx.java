package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.template.downloadbuttonstyle.RemoteButtonStyleAttr;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.NativeSdkCallbackMethods;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.StatusChangeMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSNativeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class bx extends com.huawei.hms.ads.uiengine.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.huawei.hms.ads.template.downloadbuttonstyle.a f18301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f18302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<PPSNativeView> f18303c;
    private ContentRecord d;
    private rc e;
    private com.huawei.openalliance.ad.inter.data.e f;
    private IPPSUiEngineCallback g;
    private String h;
    private b i;

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(Bundle bundle) {
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void c() {
    }

    public void f() {
        com.huawei.hms.ads.template.downloadbuttonstyle.a aVar = this.f18301a;
        if (aVar != null) {
            aVar.b();
            this.f18301a = null;
        }
        com.huawei.openalliance.ad.download.app.d.a().c(this.i);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public boolean e() throws RemoteException {
        if (com.huawei.openalliance.ad.utils.c.b()) {
            throw new RemoteException("Use engine down!");
        }
        return bt.a(this.f18302b, this.d);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public boolean d() {
        return this.f.ad();
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void b(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        if (str.equals("playTime")) {
            e(bundle);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void b(String str, long j, long j2, int i, int i2) {
        this.e.a(j, j2, i, i2, str);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void b(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            if (view instanceof AppDownloadButton) {
                hw.b("NativeProxy", "updateDownBtn");
                ((AppDownloadButton) view).setNativeAd(this.f);
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public String b() {
        ContentRecord contentRecord = this.d;
        if (contentRecord != null) {
            return contentRecord.l();
        }
        return null;
    }

    protected boolean a(boolean z, boolean z2) {
        if (h()) {
            return false;
        }
        if (z) {
            return z2;
        }
        int interActionType = this.f.getInterActionType();
        if (interActionType == 2 || interActionType == 5 || interActionType == 4 || interActionType == 8) {
            return true;
        }
        return interActionType == 3 && this.f.getAppInfo() != null;
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(boolean z) {
        this.e.b(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // com.huawei.hms.ads.uiengine.c
    public void a(String str, IObjectWrapper iObjectWrapper, Bundle bundle) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hw.b("NativeProxy", "callMethod: %s", str);
        str.hashCode();
        switch (str) {
            case "update_btn_txt":
                b2 = 0;
                break;
            case "reportCommonEvent":
                b2 = 1;
                break;
            case "onCommonAnalysis":
                b2 = 2;
                break;
            case "update_btn_style":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(iObjectWrapper, bundle);
            return;
        }
        if (b2 == 1) {
            b(bundle);
            c(bundle);
            new bs(this.f18302b).a(bundle, this.d, this.e);
        } else if (b2 == 2) {
            new br(this.f18302b).a(bundle, this.d, this.e);
        } else if (b2 != 3) {
            hw.b("NativeProxy", "call method fall to default.");
        } else {
            c(iObjectWrapper, bundle);
        }
    }

    public void a(String str, Bundle bundle) {
        if (this.g == null) {
            hw.c("NativeProxy", "on call back, call back is null");
            return;
        }
        hw.b("NativeProxy", "onCallback, method: %s", str);
        try {
            this.g.onCallResult(str, bundle);
        } catch (Throwable th) {
            hw.c("NativeProxy", "onCallback ex: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    @Override // com.huawei.hms.ads.uiengine.c
    public void a(String str, long j, long j2, int i, int i2) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "playPause":
                b2 = 0;
                break;
            case "playStart":
                b2 = 1;
                break;
            case "playEnd":
                b2 = 2;
                break;
            case "playResume":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.e.b(j, j2, i, i2);
            return;
        }
        if (b2 == 1) {
            this.e.c();
        } else if (b2 == 2) {
            this.e.c(j, j2, i, i2);
        } else {
            if (b2 != 3) {
                return;
            }
            this.e.f();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(String str, int i) {
        hw.b("NativeProxy", "reportAdShowEvent");
        PPSNativeView pPSNativeView = this.f18303c.get();
        if (!EventType.INTERACTSHOW.value().equals(str)) {
            if (pPSNativeView != null) {
                pPSNativeView.setNativeAd(this.f);
                pPSNativeView.a(Integer.valueOf(i));
                return;
            }
            return;
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.b(Integer.valueOf(i));
        String strA = com.huawei.openalliance.ad.utils.dk.a((js) pPSNativeView);
        com.huawei.openalliance.ad.inter.data.e eVar = this.f;
        if (eVar != null) {
            hw.a("NativeProxy", "slotId: %s, contentId: %s, slot pos: %s", eVar.getSlotId(), this.f.getContentId(), strA);
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(strA)) {
            c0229a.d(strA);
        }
        if (pPSNativeView != null) {
            c0229a.a(com.huawei.openalliance.ad.utils.b.a(pPSNativeView));
        }
        this.e.c(c0229a.a());
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(String str) {
        hw.a("NativeProxy", "updateShowId: %s", str);
        com.huawei.openalliance.ad.inter.data.e eVar = this.f;
        if (eVar != null) {
            eVar.h(str);
        }
        ContentRecord contentRecord = this.d;
        if (contentRecord == null) {
            return;
        }
        contentRecord.c(str);
        this.e.a(this.d);
        gr grVar = new gr();
        grVar.b("showId", str);
        a(NativeSdkCallbackMethods.UPDATE_SHOW_ID, grVar.a());
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(IPPSUiEngineCallback iPPSUiEngineCallback) {
        this.g = iPPSUiEngineCallback;
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(IObjectWrapper iObjectWrapper, String str, Bundle bundle) {
        int i = bundle.getInt(ParamConstants.BtnParams.DOWNLOAD_BUTTON_STYLE);
        if (3 == i) {
            RemoteButtonStyleAttr remoteButtonStyleAttrA = bu.a(bundle);
            if (remoteButtonStyleAttrA != null) {
                a(iObjectWrapper, str, i, remoteButtonStyleAttrA);
                return;
            }
            i = 2;
        }
        a(iObjectWrapper, str, i, (RemoteButtonStyleAttr) null);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(IObjectWrapper iObjectWrapper, String str) {
        a(iObjectWrapper, str, 0, (RemoteButtonStyleAttr) null);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(IObjectWrapper iObjectWrapper, Bundle bundle) {
        hw.b("NativeProxy", "onAdClickWithParam");
        if (iObjectWrapper == null || this.f == null) {
            return;
        }
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        PPSNativeView pPSNativeView = this.f18303c.get();
        pPSNativeView.setNativeAd(this.f);
        int i = bundle.getInt("imp_source");
        String string = bundle.getString("click_info");
        boolean z = bundle.getBoolean(ParamConstants.Param.OPEN_LANDING, true);
        int i2 = bundle.getInt(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS);
        String string2 = bundle.getString(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH, "n");
        a(i2, string2, this.f.getVideoInfo());
        MaterialClickInfo materialClickInfo = (MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(string, MaterialClickInfo.class, new Class[0]);
        if (pPSNativeView == null) {
            return;
        }
        a(bundle, pPSNativeView, i2, string2);
        pPSNativeView.setMaterialClickInfo(materialClickInfo);
        String string3 = bundle.getString(ParamConstants.Param.CLICK_DESTINATION);
        if (com.huawei.openalliance.ad.utils.dg.b(string3)) {
            pPSNativeView.a(view, i, z, this.f);
        } else {
            pPSNativeView.a(view, i, string3);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(IObjectWrapper iObjectWrapper, int i) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            PPSNativeView pPSNativeView = this.f18303c.get();
            if (pPSNativeView != null) {
                pPSNativeView.a(view, i, this.f);
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            PPSNativeView pPSNativeView = this.f18303c.get();
            if (view == null || pPSNativeView == null) {
                return;
            }
            pPSNativeView.b(view);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(long j, long j2) {
        new com.huawei.openalliance.ad.analysis.c(this.f18302b).a(this.d, j, j2);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(long j) {
        hw.a("NativeProxy", "updateStartShowTime: %s", Long.valueOf(j));
        com.huawei.openalliance.ad.inter.data.e eVar = this.f;
        if (eVar != null) {
            eVar.a(j);
        }
        ContentRecord contentRecord = this.d;
        if (contentRecord == null) {
            return;
        }
        contentRecord.h(j);
        this.e.a(this.d);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a(int i) {
        com.huawei.openalliance.ad.inter.data.e eVar = this.f;
        if (eVar == null || eVar.getAppInfo() == null) {
            return;
        }
        PPSNativeView pPSNativeView = this.f18303c.get();
        if (!com.huawei.openalliance.ad.utils.dk.b(this.f18302b) || pPSNativeView == null) {
            b(i);
        } else {
            hw.b("NativeProxy", "screenLocked clickSixElements");
            com.huawei.hms.ads.inner.a.a(pPSNativeView.getContext(), new a(this, i));
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void a() {
        PPSNativeView pPSNativeView = this.f18303c.get();
        if (pPSNativeView != null) {
            pPSNativeView.g();
        }
    }

    private boolean i() {
        return e.a() != null && Integer.parseInt(e.a()) >= 30468100;
    }

    private boolean h() {
        com.huawei.openalliance.ad.inter.data.e eVar = this.f;
        return (eVar == null || eVar.getAppInfo() == null || this.f.getInterActionType() != 7 || com.huawei.openalliance.ad.utils.k.a(this.f18302b, this.f.getAppInfo().getPackageName())) ? false : true;
    }

    private void e(Bundle bundle) {
        ContentRecord contentRecord = this.d;
        if (contentRecord == null || this.e == null) {
            hw.b("NativeProxy", "contentRecord or eventProcessor is null");
            return;
        }
        if (bundle != null) {
            try {
                if (contentRecord.l() != null && this.d.l().equals(this.h)) {
                    hw.b("NativeProxy", "Duplicate escalation videoTime event for %s", this.d.l());
                    return;
                }
                this.e.a(bundle.getLong(ParamConstants.Param.VIDEO_PLAY_TIME));
                this.h = this.d.l();
            } catch (Throwable th) {
                hw.c("NativeProxy", "reportPlayTime err: %s", th.getClass().getSimpleName());
            }
        }
    }

    private RemoteButtonStyleAttr d(Bundle bundle) {
        if (new gr(bundle).b(ParamConstants.BtnParams.DOWNLOAD_BUTTON_STYLE) != 3) {
            return null;
        }
        return bu.a(bundle);
    }

    private void c(IObjectWrapper iObjectWrapper, Bundle bundle) {
        if (iObjectWrapper == null || bundle == null) {
            return;
        }
        hw.b("NativeProxy", "update btn style");
        RemoteButtonStyleAttr remoteButtonStyleAttrD = d(bundle);
        if (remoteButtonStyleAttrD == null) {
            hw.c("NativeProxy", "attr null");
        } else {
            a(iObjectWrapper, 3, remoteButtonStyleAttrD);
        }
    }

    private void c(Bundle bundle) {
        PPSNativeView pPSNativeView;
        if (EventType.SHOWSTART.value().equals(new gr(bundle).d("eventType")) && (pPSNativeView = this.f18303c.get()) != null && pPSNativeView.i()) {
            if (!this.f.isVideoAd() || this.f.q() == null || this.f.q().intValue() == 0) {
                this.f.h(false);
                this.f.a(false);
            }
            this.f.j(true);
        }
    }

    private AppDownloadButton c(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        if (!(view instanceof AppDownloadButton)) {
            return null;
        }
        AppDownloadButton appDownloadButton = (AppDownloadButton) view;
        if (this.f18303c.get() == null) {
            return null;
        }
        return appDownloadButton;
    }

    private void b(IObjectWrapper iObjectWrapper, Bundle bundle) {
        String str;
        if (iObjectWrapper == null || bundle == null) {
            return;
        }
        hw.b("NativeProxy", "update btn text");
        RemoteButtonStyleAttr remoteButtonStyleAttrD = d(bundle);
        if (remoteButtonStyleAttrD == null) {
            str = "attr null";
        } else {
            AppDownloadButton appDownloadButtonC = c(iObjectWrapper);
            if (appDownloadButtonC != null) {
                a(remoteButtonStyleAttrD, appDownloadButtonC);
                return;
            }
            str = "btn null";
        }
        hw.c("NativeProxy", str);
    }

    private void b(Bundle bundle) {
        PPSNativeView pPSNativeView;
        gr grVar = new gr(bundle);
        if ((EventType.CLICK.value().equals(grVar.d("eventType")) || EventType.REPEATEDCLICK.value().equals(grVar.d("eventType"))) && (pPSNativeView = this.f18303c.get()) != null) {
            pPSNativeView.c((View) pPSNativeView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i == 0) {
            hw.b("NativeProxy", " hiadsdk's AIDL: onAdClickSixElementsBtn: DESC");
            PPSNativeView pPSNativeView = this.f18303c.get();
            if (pPSNativeView == null || pPSNativeView.getClickInfo() == null) {
                this.f.showAppDetailPage(this.f18302b);
                return;
            } else {
                hw.a("NativeProxy", pPSNativeView.getClickInfo().toString());
                this.f.a(this.f18302b, pPSNativeView.getClickInfo());
                return;
            }
        }
        if (i == 1) {
            hw.b("NativeProxy", " hiadsdk's AIDL: onAdClickSixElementsBtn: PRIVACY");
            this.f.getAppInfo().showPrivacyPolicyInWeb(this.f18302b);
        } else {
            if (i != 2) {
                return;
            }
            hw.b("NativeProxy", " hiadsdk's AIDL: onAdClickSixElementsBtn: PERMISSION");
            if (!TextUtils.isEmpty(this.f.getAppInfo().getPermissionUrl())) {
                this.f.getAppInfo().showPermissionPageInWeb(this.f18302b);
                return;
            }
            PPSNativeView pPSNativeView2 = this.f18303c.get();
            if (pPSNativeView2 != null) {
                com.huawei.openalliance.ad.download.app.h.a(pPSNativeView2.getContext(), this.f.getAppInfo());
            }
        }
    }

    private void a(boolean z, RemoteButtonStyleAttr remoteButtonStyleAttr, AppDownloadButton appDownloadButton, String str) {
        int interActionType = this.f.getInterActionType();
        if (remoteButtonStyleAttr == null) {
            if (interActionType == 2 || interActionType == 5) {
                return;
            }
            appDownloadButton.setAfDlBtnText(str);
            return;
        }
        if (z) {
            a(remoteButtonStyleAttr, appDownloadButton);
            return;
        }
        if (!TextUtils.isEmpty(remoteButtonStyleAttr.A())) {
            appDownloadButton.setBfDlBtnTxt(remoteButtonStyleAttr.A());
        }
        if (interActionType != 8 && !TextUtils.isEmpty(remoteButtonStyleAttr.B())) {
            appDownloadButton.setAfDlBtnText(remoteButtonStyleAttr.B());
        } else {
            if (interActionType == 2 || interActionType == 5) {
                return;
            }
            appDownloadButton.setAfDlBtnText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("app_status_method", str);
        if (str2 != null) {
            bundle.putString("app_status", str2);
        }
        a("notifyAppStatus", bundle);
    }

    protected static void a(PPSNativeView pPSNativeView, AppDownloadButton appDownloadButton, com.huawei.openalliance.ad.inter.data.e eVar) {
        if (pPSNativeView != null) {
            pPSNativeView.h();
            pPSNativeView.a(appDownloadButton, 1, eVar);
        }
    }

    private void a(AppDownloadButton appDownloadButton) {
        appDownloadButton.setOnDownloadStatusChangedListener(new AppDownloadButton.OnDownloadStatusChangedListener() { // from class: com.huawei.openalliance.ad.bx.3
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onUserCancel(AppInfo appInfo) {
                bx.this.a(StatusChangeMethods.CANCEL_DOWN, (String) null);
            }

            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onStatusChanged(AppStatus appStatus) {
                hw.a("NativeProxy", "onStatusChanged: %s", appStatus);
                if (appStatus == null) {
                    appStatus = AppStatus.DOWNLOAD;
                }
                bx.this.a(StatusChangeMethods.STATUS_CHANGE, appStatus.name());
            }
        });
    }

    private void a(RemoteButtonStyleAttr remoteButtonStyleAttr, AppDownloadButton appDownloadButton) {
        if (remoteButtonStyleAttr == null) {
            hw.c("NativeProxy", "reset err, attr is null");
            return;
        }
        if (!TextUtils.isEmpty(remoteButtonStyleAttr.A())) {
            appDownloadButton.setBfDlBtnTxt(remoteButtonStyleAttr.A());
        }
        if (!TextUtils.isEmpty(remoteButtonStyleAttr.B())) {
            appDownloadButton.setAfDlBtnText(remoteButtonStyleAttr.B());
        }
        if (!TextUtils.isEmpty(remoteButtonStyleAttr.C())) {
            appDownloadButton.setRemoteBfDlBtnTxt(remoteButtonStyleAttr.C());
        }
        if (TextUtils.isEmpty(remoteButtonStyleAttr.D())) {
            return;
        }
        appDownloadButton.setRemoteAfDlBtnText(remoteButtonStyleAttr.D());
    }

    private void a(IObjectWrapper iObjectWrapper, String str, int i, final RemoteButtonStyleAttr remoteButtonStyleAttr) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            if (view instanceof AppDownloadButton) {
                hw.b("NativeProxy", "registerDownloadBtn");
                final AppDownloadButton appDownloadButton = (AppDownloadButton) view;
                final PPSNativeView pPSNativeView = this.f18303c.get();
                boolean zI = i();
                if (pPSNativeView != null) {
                    if (a(zI, remoteButtonStyleAttr != null && remoteButtonStyleAttr.F())) {
                        pPSNativeView.setNativeAd(this.f);
                        if (pPSNativeView.register(appDownloadButton)) {
                            hw.a("NativeProxy", "register succ");
                            a(zI, remoteButtonStyleAttr, appDownloadButton, str);
                            appDownloadButton.setNeedAppendProgress(true);
                            bu.b(this.f18302b, appDownloadButton, i, remoteButtonStyleAttr);
                        } else {
                            view.setVisibility(8);
                        }
                        a(appDownloadButton);
                        return;
                    }
                    if (this.f.getInterActionType() == 0) {
                        view.setVisibility(8);
                        return;
                    }
                    hw.a("NativeProxy", "show btn");
                    appDownloadButton.a(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.bx.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            bx.a(pPSNativeView, appDownloadButton, bx.this.f);
                        }
                    });
                    final String strA = a(zI, str, remoteButtonStyleAttr);
                    bu.b(this.f18302b, appDownloadButton, i, remoteButtonStyleAttr);
                    com.huawei.openalliance.ad.inter.data.e eVar = this.f;
                    if (eVar != null && eVar.getInterActionType() == 7) {
                        appDownloadButton.setNativeAd(this.f);
                    }
                    appDownloadButton.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.openalliance.ad.bx.2
                        @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
                        public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                            if (bx.this.f.getInterActionType() == 7 && AppStatus.INSTALLED == appStatus) {
                                return charSequence;
                            }
                            RemoteButtonStyleAttr remoteButtonStyleAttr2 = remoteButtonStyleAttr;
                            return bx.this.a(remoteButtonStyleAttr2 != null ? !TextUtils.isEmpty(remoteButtonStyleAttr2.G()) : false, strA);
                        }
                    });
                }
            }
        }
    }

    private void a(IObjectWrapper iObjectWrapper, int i, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        AppDownloadButton appDownloadButtonC = c(iObjectWrapper);
        if (appDownloadButtonC == null) {
            hw.c("NativeProxy", "btn null");
        } else {
            hw.b("NativeProxy", "update btn style start");
            bu.a(this.f18302b, appDownloadButtonC, i, remoteButtonStyleAttr);
        }
    }

    private void a(Bundle bundle, PPSNativeView pPSNativeView, int i, String str) {
        MetaData metaDataJ;
        if (this.f.ai() == null || this.f.ai().intValue() != 3 || (metaDataJ = this.d.j()) == null) {
            return;
        }
        try {
            if (hw.a()) {
                hw.a("NativeProxy", "video_info: %s, preview_image_info: %s", bundle.getString(MapKeyNames.VIDEO_INFO), bundle.getString(MapKeyNames.PREVIEW_IMAGE_INFO));
            }
            ImageInfo imageInfo = (ImageInfo) com.huawei.openalliance.ad.utils.bk.b(bundle.getString(MapKeyNames.PREVIEW_IMAGE_INFO), ImageInfo.class, new Class[0]);
            if (imageInfo != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(imageInfo);
                metaDataJ.b(arrayList);
            }
            VideoInfo videoInfo = (VideoInfo) com.huawei.openalliance.ad.utils.bk.b(bundle.getString(MapKeyNames.VIDEO_INFO), VideoInfo.class, new Class[0]);
            if (videoInfo != null) {
                metaDataJ.a(videoInfo);
            }
            com.huawei.openalliance.ad.inter.data.VideoInfo videoInfo2 = new com.huawei.openalliance.ad.inter.data.VideoInfo(videoInfo);
            pPSNativeView.setMetaData(com.huawei.openalliance.ad.utils.bk.b(metaDataJ));
            a(i, str, videoInfo2);
            pPSNativeView.setVideoInfo(videoInfo2);
        } catch (Throwable th) {
            hw.c("NativeProxy", "resetMetaDataAndProgress ex: %s", th.getClass().getSimpleName());
        }
    }

    private void a(int i, String str, com.huawei.openalliance.ad.inter.data.VideoInfo videoInfo) {
        if (videoInfo != null) {
            videoInfo.g(Boolean.TRUE.toString());
            videoInfo.e(i);
            videoInfo.e(str);
        }
    }

    private String a(boolean z, String str, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        if (remoteButtonStyleAttr != null) {
            if (z) {
                return remoteButtonStyleAttr.E();
            }
            int interActionType = this.f.getInterActionType();
            if ((interActionType == 1 || interActionType == 3) && !TextUtils.isEmpty(remoteButtonStyleAttr.E())) {
                return remoteButtonStyleAttr.E();
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(boolean z, String str) {
        if (h()) {
            return this.f18302b.getString(R.string.hiad_learn_more);
        }
        return z ? str : com.huawei.openalliance.ad.utils.l.a(str, this.f18302b.getString(R.string.hiad_detail));
    }

    static class a implements OnSuccessListener<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<bx> f18311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18312b;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            hw.b("NativeProxy", "onSuccess ret: %s.", bool);
            bx bxVar = this.f18311a.get();
            if (bxVar == null) {
                hw.c("NativeProxy", "proxy is null");
            } else {
                hw.b("NativeProxy", "proxy adClickSixElementsBtn");
                bxVar.b(this.f18312b);
            }
        }

        public a(bx bxVar, int i) {
            this.f18311a = new WeakReference<>(bxVar);
            this.f18312b = i;
        }
    }

    static class b implements AppDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<bx> f18313a;

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
            bx bxVar = this.f18313a.get();
            if (bxVar == null) {
                return;
            }
            bxVar.a(StatusChangeMethods.APP_OPEN, (String) null);
        }

        public b(bx bxVar) {
            this.f18313a = new WeakReference<>(bxVar);
        }
    }

    public bx(Context context, PPSNativeView pPSNativeView, com.huawei.openalliance.ad.inter.data.e eVar) {
        this.f18302b = context;
        this.f18303c = new WeakReference<>(pPSNativeView);
        this.f = eVar;
        this.d = pl.a(eVar);
        this.e = new pc(context, new sz(context, eVar == null ? 3 : eVar.e()), this.d);
        if (eVar == null || eVar.getAppInfo() == null) {
            return;
        }
        this.i = new b(this);
        com.huawei.openalliance.ad.download.app.d.a().b(this.i);
    }
}
