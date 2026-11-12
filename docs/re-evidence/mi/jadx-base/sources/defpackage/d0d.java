package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.device.api.DeviceStat;

/* JADX INFO: loaded from: classes5.dex */
public interface d0d {

    public interface a {
        void a();
    }

    Class<?> getAlarmVideoActivityClass(String str, String str2);

    Class<?> getAlarmVideoNormalPlayerActivityClass(String str);

    Class<?> getAlarmVideoPlayerActivityClass(String str);

    Class<?> getAlbumActivityClass();

    Class<?> getAlbumViewerActivityClass();

    Class<?> getCloudVideoDownloadActivityClass();

    Class<?> getCreateSceneFromRecommendActivityClass();

    Class<?> getDeviceLauncher2Class();

    Class<?> getDeviceNetworkInfoActivityClass();

    Class<?> getLightGroupManageActivityClass();

    Class<?> getLightGroupSettingActivityClass();

    Class<?> getLightGroupSettingV2ActivityClass();

    View getLoadingRNView(String str, String str2, a aVar);

    Class<?> getLocalAlarmPlayerActivityClass();

    Class<?> getNASDiscoveryActivityClass();

    Class<?> getNASInfoActivityClass();

    Class<?> getPlaybackVideoActivityClass();

    Class<?> getPluginRecommendSceneActivityClass();

    Class<?> getResetPageRouteClass();

    Class<?> getScanBarcodeActivityClass();

    Class<?> getScreenLinkageDeviceActivityClass();

    Class<?> getStereoSettingActivityClass();

    Class<?> getTimerSettingActivityClass();

    Class<?> getTimezoneActivityClass();

    void goBleOtaDeviceUpdateActivity(Activity activity, int i, String str, String str2, String str3, String str4);

    void isBatchConvertSceneVisisbleWith(Activity activity, String str, Callback callback);

    boolean isSupportWriteNfc(Activity activity);

    void loadUrl(String str, String str2) throws RemoteException;

    void loadUrlSupportRedirect(String str, String str2, boolean z) throws RemoteException;

    void openAddIRController(Activity activity, DeviceStat deviceStat, int i, String[] strArr, Bundle bundle);

    void openAssociatePage(Activity activity, String str);

    void openBtGatewayPage(Activity activity, String str);

    void openChangeDeviceIconDialog(Activity activity, String str, String str2, int i, int i2);

    void openChangeDeviceName(Activity activity, String str, String str2, int i, String str3, Callback callback);

    void openCloudVideoBuyPage(Context context, String str, String str2, String str3);

    void openCloudVideoManagePage(Context context, String str, String str2);

    void openConnectSucceedPage(Activity activity, String str, String str2);

    void openConvertScenePage(Activity activity);

    void openCurtainGroupNamePage(Activity activity, String str, String str2, String str3);

    void openDeclarationWithConfig(Activity activity, DeviceStat deviceStat, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, ReadableMap readableMap, int i2, String str6);

    void openDeleteDevice(Activity activity, String str, String str2, int i);

    void openEditDeviceGroupPage(Activity activity, ReadableArray readableArray);

    void openEditDeviceGroupPage(Activity activity, String str);

    void openEditDeviceGroupPage(Activity activity, String str, String str2);

    void openHelpPage(Activity activity, String str, String str2);

    void openMainMicoPage(Context context, String str);

    void openMiHomeLoginPage(Context context);

    void openMiHomeMainPage(Context context);

    void openNFCWriteActivityForConnectTV(Activity activity, String str);

    void openNFCWriteActivityForOpenPlugin(Context context, String str, String str2, String str3);

    void openOperationBannerPage(Context context, String str, String str2);

    void openOperationCommonWebView(Activity activity, String str);

    void openPrivacyLicense(Activity activity, String str, String str2, String str3, ReadableArray readableArray, String str4, ReadableArray readableArray2, Callback callback);

    void openRoomManagementPage(Activity activity, String str);

    void openSecuritySetting(Activity activity, String str, String str2);

    void openShareDevicePage(Activity activity, String str);

    void openShareListBar(Activity activity, DeviceStat deviceStat, String str, String str2, ReadableArray readableArray, String str3);

    void openVoiceCtrlDeviceAuthPage(Context context, String str);

    void openXiaoAiLearnPage(Activity activity, String str, boolean z, boolean z2);

    void privacyAndProtocolReview(Activity activity, String str, String str2, ReadableArray readableArray, String str3, ReadableArray readableArray2, int i);

    void showUserLicenseUriDialog(Activity activity, DeviceStat deviceStat, boolean z, String str, String str2, View.OnClickListener onClickListener, Intent intent);

    void startPowerMultikeyActivity(Activity activity, String str, String str2, int i);

    void writeNFCData(Activity activity, String str, int i) throws Exception;
}
