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
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider;

/* JADX INFO: loaded from: classes5.dex */
public class kwk implements IUIProvider {
    public final d0d a() {
        return mvk.e().h();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getAlarmVideoActivityClass(String str, String str2) {
        return a().getAlarmVideoActivityClass(str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getAlarmVideoNormalPlayerActivityClass(String str) {
        return a().getAlarmVideoNormalPlayerActivityClass(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getAlarmVideoPlayerActivityClass(String str) {
        return a().getAlarmVideoPlayerActivityClass(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getAlbumActivityClass() {
        return a().getAlbumActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getAlbumViewerActivityClass() {
        return a().getAlbumViewerActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getCloudVideoDownloadActivityClass() {
        return a().getCloudVideoDownloadActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getCreateSceneFromRecommendActivityClass() {
        return a().getCreateSceneFromRecommendActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getDeviceLauncher2Class() {
        return a().getDeviceLauncher2Class();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getDeviceNetworkInfoActivityClass() {
        return a().getDeviceNetworkInfoActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getLightGroupManageActivityClass() {
        return a().getLightGroupManageActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getLightGroupSettingActivityClass() {
        return a().getLightGroupSettingActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getLightGroupSettingV2ActivityClass() {
        return a().getLightGroupSettingV2ActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getLocalAlarmPlayerActivityClass() {
        return a().getLocalAlarmPlayerActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getNASDiscoveryActivityClass() {
        return a().getNASDiscoveryActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getNASInfoActivityClass() {
        return a().getNASInfoActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getPlaybackVideoActivityClass() {
        return a().getPlaybackVideoActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getPluginRecommendSceneActivityClass() {
        return a().getPluginRecommendSceneActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getResetPageRouteClass() {
        return a().getResetPageRouteClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getScanBarcodeActivityClass() {
        return a().getScanBarcodeActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getScreenLinkageDeviceActivityClass() {
        return a().getScreenLinkageDeviceActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getStereoSettingActivityClass() {
        return a().getStereoSettingActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getTimerSettingActivityClass() {
        return a().getTimerSettingActivityClass();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public Class<?> getTimezoneActivityClass() {
        a().getTimezoneActivityClass();
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void goBleOtaDeviceUpdateActivity(Activity activity, int i, String str, String str2, String str3, String str4) {
        a().goBleOtaDeviceUpdateActivity(activity, i, str, str2, str3, str4);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void isBatchConvertSceneVisisbleWith(Activity activity, String str, Callback callback) {
        a().isBatchConvertSceneVisisbleWith(activity, str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public boolean isSupportWriteNfc(Activity activity) {
        return a().isSupportWriteNfc(activity);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void loadUrl(String str, String str2) throws RemoteException {
        a().loadUrl(str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void loadUrlSupportRedirect(String str, String str2, boolean z) throws RemoteException {
        a().loadUrlSupportRedirect(str, str2, z);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openAddIRController(Activity activity, DeviceStat deviceStat, int i, String[] strArr, Bundle bundle) {
        a().openAddIRController(activity, deviceStat, i, strArr, bundle);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openAssociatePage(Activity activity, String str) {
        a().openAssociatePage(activity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openBtGatewayPage(Activity activity, String str) {
        a().openBtGatewayPage(activity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openChangeDeviceIconDialog(Activity activity, String str, String str2, int i, int i2) {
        a().openChangeDeviceIconDialog(activity, str, str2, i, i2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openChangeDeviceName(Activity activity, String str, String str2, int i, String str3, Callback callback) {
        a().openChangeDeviceName(activity, str, str2, i, str3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openCloudVideoBuyPage(Context context, String str, String str2, String str3) {
        a().openCloudVideoBuyPage(context, str, str2, str3);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openCloudVideoManagePage(Context context, String str, String str2) {
        a().openCloudVideoManagePage(context, str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openConnectSucceedPage(Activity activity, String str, String str2) {
        a().openConnectSucceedPage(activity, str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openConvertScenePage(Activity activity) {
        a().openConvertScenePage(activity);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openCurtainGroupNamePage(Activity activity, String str, String str2, String str3) {
        a().openCurtainGroupNamePage(activity, str, str2, str3);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openDeclarationWithConfig(Activity activity, DeviceStat deviceStat, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, ReadableMap readableMap, int i2, String str6) {
        a().openDeclarationWithConfig(activity, deviceStat, str, str2, str3, str4, str5, z, z2, i, readableMap, i2, str6);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openDeleteDevice(Activity activity, String str, String str2, int i) {
        a().openDeleteDevice(activity, str, str2, i);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openEditDeviceGroupPage(Activity activity, ReadableArray readableArray) {
        a().openEditDeviceGroupPage(activity, readableArray);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openHelpPage(Activity activity, String str, String str2) {
        a().openHelpPage(activity, str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openMainMicoPage(Context context, String str) {
        a().openMainMicoPage(context, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openMiHomeLoginPage(Context context) {
        a().openMiHomeLoginPage(context);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openMiHomeMainPage(Context context) {
        a().openMiHomeMainPage(context);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openNFCWriteActivityForConnectTV(Activity activity, String str) {
        a().openNFCWriteActivityForConnectTV(activity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openNFCWriteActivityForOpenPlugin(Context context, String str, String str2, String str3) {
        a().openNFCWriteActivityForOpenPlugin(context, str, str2, str3);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openOperationBannerPage(Context context, String str, String str2) {
        a().openOperationBannerPage(context, str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openOperationCommonWebView(Activity activity, String str) {
        a().openOperationCommonWebView(activity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openPrivacyLicense(Activity activity, String str, String str2, String str3, ReadableArray readableArray, String str4, ReadableArray readableArray2, Callback callback) {
        a().openPrivacyLicense(activity, str, str2, str3, readableArray, str4, readableArray2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openRoomManagementPage(Activity activity, String str) {
        a().openRoomManagementPage(activity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openSecuritySetting(Activity activity, String str, String str2) {
        a().openSecuritySetting(activity, str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openShareDevicePage(Activity activity, String str) {
        a().openShareDevicePage(activity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openShareListBar(Activity activity, DeviceStat deviceStat, String str, String str2, ReadableArray readableArray, String str3) {
        a().openShareListBar(activity, deviceStat, str, str2, readableArray, str3);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openVoiceCtrlDeviceAuthPage(Context context, String str) {
        a().openVoiceCtrlDeviceAuthPage(context, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openXiaoAiLearnPage(Activity activity, String str, boolean z, boolean z2) {
        a().openXiaoAiLearnPage(activity, str, z, z2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void privacyAndProtocolReview(Activity activity, String str, String str2, ReadableArray readableArray, String str3, ReadableArray readableArray2, int i) {
        a().privacyAndProtocolReview(activity, str, str2, readableArray, str3, readableArray2, i);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void showUserLicenseUriDialog(Activity activity, DeviceStat deviceStat, boolean z, String str, String str2, View.OnClickListener onClickListener, Intent intent) {
        a().showUserLicenseUriDialog(activity, deviceStat, z, str, str2, onClickListener, intent);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void startPowerMultikeyActivity(Activity activity, String str, String str2, int i) {
        a().startPowerMultikeyActivity(activity, str, str2, i);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void writeNFCData(Activity activity, String str, int i) throws Exception {
        a().writeNFCData(activity, str, i);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openEditDeviceGroupPage(Activity activity, String str, String str2) {
        a().openEditDeviceGroupPage(activity, str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider
    public void openEditDeviceGroupPage(Activity activity, String str) {
        a().openEditDeviceGroupPage(activity, str);
    }
}
