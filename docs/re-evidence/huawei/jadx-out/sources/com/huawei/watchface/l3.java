package com.huawei.watchface;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.manager.WatchFaceKaleidoscopeManager;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.manager.WatchFaceWearManager;
import com.huawei.watchface.mvp.model.datatype.DownloadQueryBean;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.TryoutBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.DelectUserDesignationWatchFaceCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.PluginOperationAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class l3 implements PluginOperationAdapter {
    public static volatile l3 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f30281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f30282c;

    public l3(Context context) {
        if (context != null) {
            this.f30280a = context.getApplicationContext();
        } else {
            this.f30280a = Environment.getApplicationContext();
        }
        this.f30281b = new HashMap();
        this.f30282c = new HashMap();
        a();
    }

    public static l3 a(Context context) {
        if (d == null) {
            synchronized (l3.class) {
                if (d == null) {
                    d = new l3(context);
                }
            }
        }
        return d;
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void applyWatchFaceThemeAlbumInfo(String str) throws Throwable {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).k(str);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void cancelInstallWatchFace(String str, String str2) {
        HwWatchFaceManager.getInstance(this.f30280a).cancelInstallWatchFaceByH5(str, str2);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void cancelTryOutWatchFace(String str, String str2) {
        j2.g().a(str, str2);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void choosePicToClip() {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).choosePicToClip();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void choosePicToH5Clip() {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).q();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void chooseWearToClip() {
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).q();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void deleteDesignationUserWatchFace(String str, String str2, DelectUserDesignationWatchFaceCallback delectUserDesignationWatchFaceCallback) {
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).deleteDesignationWatchFace(str, str2, delectUserDesignationWatchFaceCallback);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void deleteDesignationWatchFace(String str, String str2) {
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).h5deleteWatchFace(str, str2);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void deleteWatchFace(String str, String str2) {
        HwWatchFaceManager.getInstance(this.f30280a).deleteWatchFace(str, str2);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String downloadAndInstallWatchFace(DownloadQueryBean downloadQueryBean) {
        j2.g().c(downloadQueryBean.getHitopId(), downloadQueryBean.getVersion());
        return z1.c().a(downloadQueryBean);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getAlbumPackageName() {
        return WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).t();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getBuildNumber() {
        return HwWatchFaceApi.getInstance(this.f30280a).getSoftVersion();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getCurrentWatchFaceId() {
        return HwWatchFaceManager.getInstance(this.f30280a).getCurrentWatchFaceId();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getFirmware() {
        return "6.0.1";
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getIsoCode() {
        return HwWatchFaceApi.getInstance(this.f30280a).getCommonCountryCode();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getKaleidoscopePackageName() {
        return WatchFaceKaleidoscopeManager.getInstance(Environment.getApplicationContext()).t();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getLocale() {
        return LanguageUtils.a(true);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getMemberExpiredWatchFaceIdStore() {
        return HwWatchFaceManager.getInstance(this.f30280a).getMemberExpiredWatchFaceIdStore();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getPhoneWatchType() {
        return HwWatchFaceApi.getInstance(this.f30280a).getDeviceModel();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getPreWatchFaceIdStore() {
        return HwWatchFaceManager.getInstance(this.f30280a).getPreWatchFaceIdStore();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getScreenSize() {
        return HwWatchFaceBtManager.getInstance(this.f30280a).getWatchFaceScreen(true, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getTokenAndDeviceType() {
        return c2.a(Environment.getApplicationContext()).l();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getTryOutWatchFacePackageName() {
        return j2.g().j();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getVideoAlbumPackageName() {
        return HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVideoPackageName();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceData() {
        return e4.d(Environment.getApplicationContext());
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceDownloadData() {
        return f2.a(Environment.getApplicationContext()).o();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public int getWatchFaceDownloadItemNum() {
        return f2.a(Environment.getApplicationContext()).p();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceIdStore() {
        return HwWatchFaceManager.getInstance(this.f30280a).getWatchFaceIdStore();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceInfo() {
        return HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getWatchFaceInfo();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public int getWatchFaceInstallState() {
        return HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getWatchFaceInstallState();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void getWatchFaceNames(String str) {
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getWatchFaceNames(str);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void getWatchFacePayInfo(InstallWatchFaceBean installWatchFaceBean) {
        i2.a((Context) Environment.getApplicationContext()).d(installWatchFaceBean);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceSignBean() {
        return i2.a((Context) Environment.getApplicationContext()).i();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceSortList() {
        ArrayList<WatchResourcesInfo> allWatchInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getAllWatchInfo();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<WatchResourcesInfo> it = allWatchInfo.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().getWatchInfoId());
            stringBuffer.append(",");
        }
        return stringBuffer.toString();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceSortState() {
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceSupportInfo();
        return (watchFaceSupportInfo == null || !watchFaceSupportInfo.isWatchFaceSort()) ? "0" : "1";
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void getWatchFaceThemeAlbumInfo(String str, String str2, String str3, String str4) {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).getWatchFaceInfo(str, str2, str3, str4);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void getWatchFaceThemeWearInfo(String str, String str2, String str3, String str4) {
        HwLog.i("Opera_PluginOperationAdapterImpl", "getWatchFaceThemeWearInfo");
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).getWatchFaceInfo(str, str2, str3, str4);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFaceUrlBase() {
        return WatchFaceHttpUtil.J();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchFileType() {
        return "hwt";
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchOtherThemeVersion() {
        return HwWatchFaceManager.getInstance(this.f30280a).getWatchOtherThemeVersion();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWatchThemeVersion() {
        return HwWatchFaceBtManager.getInstance(this.f30280a).getWatchFaceMaxVersion(false, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String getWearPackageName() {
        return HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWearPackageName();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void installTryoutWatchFace(TryoutBean tryoutBean) {
        j2.g().c(tryoutBean);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public boolean isBluetoothConnected() {
        return HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceInfo() != null;
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public boolean isEnterWatchFaceAlbum() {
        return e4.a("EnteringWatchFaceAlbum", "socialsharedpreference", false);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void obtainWidgetColor(String str, String str2, String str3, String str4, String str5) {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).a(str, str2, str3, str4, str5);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void openSystemFileManager(WebViewActivity webViewActivity) {
        e2.b(Environment.getApplicationContext()).c(webViewActivity);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void payCombination(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var, boolean z) {
        i2.a((Context) Environment.getApplicationContext()).a(vipPayInfoCoupons, i3Var, v4Var, z);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void payForVip(BaseReq baseReq, i3 i3Var) {
        i2.a((Context) Environment.getApplicationContext()).a(baseReq, i3Var, false);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void payForVipIAP4(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var) {
        i2.a((Context) Environment.getApplicationContext()).b(vipPayInfoCoupons, i3Var, v4Var);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void payForVipNew(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var, boolean z) {
        i2.a((Context) Environment.getApplicationContext()).b(vipPayInfoCoupons, i3Var, v4Var, z);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void releaseWatchFaceLoginHelper() {
        h2.e();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void reselectionWearTransmit() {
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).w();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void saveWatchFaceThemeAlbumInfo(String str) {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).saveWatchFaceInfo(str);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void saveWatchFaceThemeWearInfo(String str) {
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).saveWatchFaceInfo(str);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public String sendContinueDownloadWatchFace(int i, DownloadQueryBean downloadQueryBean) {
        return f2.a(Environment.getApplicationContext()).a(i, downloadQueryBean);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setAlbumWatchFaceGoBack() {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).F();
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setDefaultWatchFace(String str, String str2, String str3) {
        HwWatchFaceManager.getInstance(this.f30280a).setDefaultWatchFace(str, str2, str3, null);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setEnterWatchFaceMarket(boolean z) {
        e4.a("EnteringWatchFaceMarket", z, "socialsharedpreference");
        if (z) {
            WatchFaceKaleidoscopeManager.getInstance(Environment.getApplicationContext()).w();
        }
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setEnteringWatchFaceAlbum(boolean z) {
        e4.a("EnteringWatchFaceAlbum", z, "socialsharedpreference");
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback, boolean z) {
        a(operateWatchFaceCallback, z);
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback);
        WatchFaceKaleidoscopeManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback);
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setWatchFaceDeleteId(String str, String str2) {
        HwWatchFaceManager.getInstance(this.f30280a).setWatchFaceDeleteId(str, str2);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void setWatchFaceSortList(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("Opera_PluginOperationAdapterImpl", "str is null");
            return;
        }
        if (!HwWatchFaceManager.getInstance(Environment.getApplicationContext()).isBtConnect()) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyH5DeviceIsBreak();
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).dismissStartSaveDialog();
            return;
        }
        HwLog.i("Opera_PluginOperationAdapterImpl", "setWatchFaceSortList str is " + str);
        String[] strArrSplit = str.split(",");
        ArrayList<WatchResourcesInfo> arrayList = new ArrayList<>(strArrSplit.length);
        for (String str2 : strArrSplit) {
            WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
            watchResourcesInfo.setWatchInfoId(str2);
            watchResourcesInfo.setVipFreeWatchFace(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVipFreeFromCache(str2));
            arrayList.add(watchResourcesInfo);
        }
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).startSaveDialog();
        HwLog.i("Opera_PluginOperationAdapterImpl", "setWatchFaceSortList watchResourcesInfos is " + arrayList.toString());
        HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).sortWatchList(arrayList, new IBaseResponseCallback() { // from class: com.huawei.watchface.l3$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                l3.a(i, obj);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void showInstallProgress(int i, WebViewActivity webViewActivity) {
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).showInstallProgress(i, webViewActivity);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void syncWatchFaceThemeAlbumInfo(String str) {
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).c(str);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void transferWatchFaceFile(Uri uri, WebViewActivity webViewActivity) {
        e2.b(Environment.getApplicationContext()).a(uri, webViewActivity);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void updateWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback, boolean z) {
        a(operateWatchFaceCallback, z);
        if (z) {
            return;
        }
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback);
        WatchFaceKaleidoscopeManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback);
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void uploadPayEvent(String str) {
        i2.a((Context) Environment.getApplicationContext()).d(str);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void uploadPayResult(String str, String str2) {
        i2.a((Context) Environment.getApplicationContext()).a(str, str2);
    }

    @Override // com.huawei.watchface.utils.callback.PluginOperationAdapter
    public void uploadSubscriptionPayResult(PayResultInfo payResultInfo) {
        i2.a((Context) Environment.getApplicationContext()).b(payResultInfo);
    }

    public final void a() {
        this.f30281b.put(1, 258);
        this.f30281b.put(2, 257);
        this.f30281b.put(3, 259);
        this.f30282c.put("km", 1);
        this.f30282c.put("s", 0);
        this.f30282c.put("cal", 2);
    }

    public final void a(OperateWatchFaceCallback operateWatchFaceCallback, boolean z) {
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).setWatchFaceCallback(operateWatchFaceCallback, z);
        i2.a((Context) Environment.getApplicationContext()).a(operateWatchFaceCallback);
        a2.b().a(operateWatchFaceCallback);
        c4.a(Environment.getApplicationContext()).a(operateWatchFaceCallback);
        j2.g().a(operateWatchFaceCallback);
        z1.c().a(operateWatchFaceCallback);
        HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).setRegisterH5Callback(operateWatchFaceCallback);
        m1.b().a(operateWatchFaceCallback);
        c2.a(Environment.getApplicationContext()).a(operateWatchFaceCallback);
    }

    public static /* synthetic */ void a(int i, Object obj) {
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).dismissStartSaveDialog();
        if (i == 101) {
            HwLog.i("Opera_PluginOperationAdapterImpl", "send watchface is success");
        } else {
            HwLog.i("Opera_PluginOperationAdapterImpl", "send watchface is failure");
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).showToast();
        }
    }
}
