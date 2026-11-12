package com.huawei.watchface.utils.callback;

import android.net.Uri;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.watchface.api.PluginBaseAdapter;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.i3;
import com.huawei.watchface.mvp.model.datatype.DownloadQueryBean;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.TryoutBean;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.v4;

/* JADX INFO: loaded from: classes20.dex */
public interface PluginOperationAdapter extends PluginBaseAdapter {
    void applyWatchFaceThemeAlbumInfo(String str);

    void cancelInstallWatchFace(String str, String str2);

    void cancelTryOutWatchFace(String str, String str2);

    void choosePicToClip();

    void choosePicToH5Clip();

    void chooseWearToClip();

    void deleteDesignationUserWatchFace(String str, String str2, DelectUserDesignationWatchFaceCallback delectUserDesignationWatchFaceCallback);

    void deleteDesignationWatchFace(String str, String str2);

    void deleteWatchFace(String str, String str2);

    String downloadAndInstallWatchFace(DownloadQueryBean downloadQueryBean);

    String getAlbumPackageName();

    String getBuildNumber();

    String getCurrentWatchFaceId();

    String getFirmware();

    String getIsoCode();

    String getKaleidoscopePackageName();

    String getLocale();

    String getMemberExpiredWatchFaceIdStore();

    String getPhoneWatchType();

    String getPreWatchFaceIdStore();

    String getScreenSize();

    String getTokenAndDeviceType();

    String getTryOutWatchFacePackageName();

    String getVideoAlbumPackageName();

    String getWatchFaceData();

    String getWatchFaceDownloadData();

    int getWatchFaceDownloadItemNum();

    String getWatchFaceIdStore();

    String getWatchFaceInfo();

    int getWatchFaceInstallState();

    void getWatchFaceNames(String str);

    void getWatchFacePayInfo(InstallWatchFaceBean installWatchFaceBean);

    String getWatchFaceSignBean();

    String getWatchFaceSortList();

    String getWatchFaceSortState();

    void getWatchFaceThemeAlbumInfo(String str, String str2, String str3, String str4);

    void getWatchFaceThemeWearInfo(String str, String str2, String str3, String str4);

    String getWatchFaceUrlBase();

    String getWatchFileType();

    String getWatchOtherThemeVersion();

    String getWatchThemeVersion();

    String getWearPackageName();

    void installTryoutWatchFace(TryoutBean tryoutBean);

    boolean isBluetoothConnected();

    boolean isEnterWatchFaceAlbum();

    void obtainWidgetColor(String str, String str2, String str3, String str4, String str5);

    void openSystemFileManager(WebViewActivity webViewActivity);

    void payCombination(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var, boolean z);

    void payForVip(BaseReq baseReq, i3 i3Var);

    void payForVipIAP4(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var);

    void payForVipNew(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var, boolean z);

    void releaseWatchFaceLoginHelper();

    void reselectionWearTransmit();

    void saveWatchFaceThemeAlbumInfo(String str);

    void saveWatchFaceThemeWearInfo(String str);

    String sendContinueDownloadWatchFace(int i, DownloadQueryBean downloadQueryBean);

    void setAlbumWatchFaceGoBack();

    void setDefaultWatchFace(String str, String str2, String str3);

    void setEnterWatchFaceMarket(boolean z);

    void setEnteringWatchFaceAlbum(boolean z);

    void setWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback, boolean z);

    void setWatchFaceDeleteId(String str, String str2);

    void setWatchFaceSortList(String str);

    void showInstallProgress(int i, WebViewActivity webViewActivity);

    void syncWatchFaceThemeAlbumInfo(String str);

    void transferWatchFaceFile(Uri uri, WebViewActivity webViewActivity);

    void updateWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback, boolean z);

    void uploadPayEvent(String str);

    void uploadPayResult(String str, String str2);

    void uploadSubscriptionPayResult(PayResultInfo payResultInfo);
}
