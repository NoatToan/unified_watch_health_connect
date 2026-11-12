package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTHost {
    void bindProcessToNetwork(int i, Callback callback);

    void checkAbilityOfJumpToThirdpartyApplication(String str, Callback callback);

    void checkAppIsExist(ReadableMap readableMap, Callback callback);

    void checkFirmwareAutoUpgradeOpen(ReadableMap readableMap, Callback callback);

    void checkPhoneLocationServerIsOpen(Callback callback);

    void checkStoreSupportted(Callback callback);

    void clearFreqCameraNeedShowRedPoint();

    void closeCurrentPage(ReadableMap readableMap);

    void colorsToImageBase64(String str, String str2, String str3, String str4, Callback callback);

    void connectWifiWithSSID(String str, Callback callback);

    void convertCronToDate(ReadableMap readableMap, Callback callback);

    void convertDateToCron(ReadableMap readableMap, Callback callback);

    void createExecutor(String str, String str2, Callback callback);

    void decodeBase64(String str, Callback callback);

    void encodeBase64(String str, Callback callback);

    void encodeMD5(String str, Callback callback);

    void encodeSHA1(String str, Callback callback);

    void encodeSHA2(String str, Callback callback);

    void executeMethod(String str, String str2, String str3, Callback callback);

    void generateECCCryptoObjectWithCurveType(int i, Callback callback);

    void getAppName(Callback callback);

    void getBtGateWaySubDeviceRSSIWithMac(String str, Callback callback);

    void getConnectedWifi(Callback callback);

    void getCurrentTimeMillis(Callback callback);

    void getDevicesWithModel(String str, boolean z, Callback callback);

    void getFreqCameraNeedShowRedPoint(Callback callback);

    void getLocation(Callback callback);

    void getNavigationBarHeight(Callback callback);

    void getPhoneScreenInfo(Callback callback);

    void getPhysicsDimension(Callback callback);

    void getSystemTimeZoneOffset(Callback callback);

    void getSystemTimezoneNameWithCallback(Callback callback);

    void getUserConfigs(int i, ReadableArray readableArray, Callback callback);

    void goCustomPlugin(ReadableMap readableMap);

    void ijaiBeautifyMap(String str, ReadableArray readableArray, ReadableMap readableMap, Callback callback);

    void isBatchConvertSceneVisisble(Callback callback);

    void isBatchConvertSceneVisisbleWith(ReadableMap readableMap, Callback callback);

    void jumpToThirdpartyApplication(String str, Callback callback);

    void keepScreenNotLock(boolean z);

    void launchCountDownWhenDevice(boolean z, ReadableMap readableMap);

    void loadCurrentCountryCode(Callback callback);

    void loadInfoCallback(String str, Callback callback);

    void loadOperatorsType(Callback callback);

    void loadRealDeviceConfig(String str, Callback callback);

    void notifyCameraStorageChangeStateChanged(ReadableMap readableMap);

    void notifyMultikeyStateChanged(ReadableMap readableMap);

    void openAddDeviceGroupPage();

    void openAddDeviceGroupPageWithGroupModel(String str);

    void openAddIRController(String str, int i, ReadableArray readableArray, ReadableMap readableMap);

    void openAddToDesktopPage();

    void openAssociatePage(ReadableMap readableMap);

    void openBatchConvertScene();

    void openBleGroupUpgradePage(int i);

    void openBleMeshDeviceUpgradePage();

    void openBleOtaDeviceUpgradePage(ReadableMap readableMap);

    void openBtGatewayActivity();

    void openBtGatewayPage();

    void openBtGatewayPageWithParams(ReadableMap readableMap, Callback callback);

    void openChangeDeviceIconDialog(ReadableMap readableMap, Callback callback);

    void openChangeDeviceName();

    void openCommonDeviceSettingPage(int i);

    void openConfigRouterSubPage();

    void openConnectSucceedPage(String str, String str2);

    void openConsumesDetailPage(ReadableMap readableMap, Callback callback);

    void openConsumesPageWithParams(ReadableMap readableMap, Callback callback);

    void openCurtainGroupNamePage(String str, String str2, String str3);

    void openDeclarationWithConfig(ReadableMap readableMap, Callback callback);

    void openDeleteDevice(String str);

    void openDevice(String str, String str2, ReadableMap readableMap, Callback callback);

    void openDeviceCallSettingPage(String str);

    void openDeviceHubGatewayPage(ReadableMap readableMap);

    void openDeviceOfflineAlert();

    void openDeviceServicePage(ReadableMap readableMap);

    void openDeviceSettingPageWithType(int i);

    void openDeviceTimeZoneSettingPage(ReadableMap readableMap);

    void openDeviceUpgradeHistoryPage();

    void openDeviceUpgradePage();

    void openDirectorySelectPage(Callback callback);

    void openEditDeviceGroupPage(ReadableArray readableArray);

    void openFeedbackInput();

    void openFileSelectPage(String str, Callback callback);

    void openFirmWareAutoOTAPage();

    void openFirmwareAutoUpgradeSwitch(ReadableMap readableMap, Callback callback);

    void openGenerateCrontabStringPage(ReadableMap readableMap, Callback callback);

    void openHelpPage();

    void openIftttAutoPage();

    void openIftttAutoPageWithDid(String str);

    void openLightGroupUpgradePage();

    void openMeshDeviceGroupPage(String str, String str2, int i);

    void openMiPayPage(ReadableMap readableMap, Callback callback);

    void openNFCWriteDeviceInfoPage(String str);

    void openNFCWriteDeviceInfoPage_debugonly(ReadableMap readableMap);

    void openNFCWritePageForConnectTV(ReadableMap readableMap);

    void openOneTimePassword(String str, int i, int i2);

    void openOperationUrl(String str);

    void openPhoneBluSettingActivity();

    void openPhoneLocationServerSettingPage();

    void openPluginPage(String str, String str2, ReadableMap readableMap, Callback callback);

    void openPluginRecommendScene(String str, int i);

    void openPowerMultikeyPage(String str, String str2);

    void openPowerSwitchNameActivity();

    @Deprecated
    void openPrivacyLicense(String str, ReadableArray readableArray, String str2, ReadableArray readableArray2, Callback callback);

    void openResetAndConnectDevicePage();

    void openRoomManagementPage();

    void openRoomManagementPageByDid(String str);

    void openSecuritySetting();

    void openShareDevicePage();

    void openShareListBar(String str, String str2, ReadableArray readableArray, String str3);

    void openSystemFileWindow(String str);

    void openSystemShareWindow(String str);

    @Deprecated
    void openTimerSettingPage(String str, String str2, String str3, String str4);

    @Deprecated
    void openTimerSettingPageWithCustomIdentifier(String str, String str2, String str3, String str4, String str5);

    void openTimerSettingPageWithOptions(ReadableMap readableMap);

    void openTimerSettingPageWithOptionsV2(ReadableMap readableMap);

    @Deprecated
    void openTimerSettingPageWithVariousTypeParams(String str, String str2, String str3, String str4);

    void openVirtualGroupInitPage(ReadableMap readableMap);

    void openVoiceCtrlDevListPage();

    void openVoiceCtrlDeviceAuthPage();

    void openWebPage(String str, ReadableMap readableMap);

    void openWifiChoosePage(Callback callback);

    void openXiaoAiLearnPage(ReadableMap readableMap);

    void openZigbeeConnectDeviceList(String str);

    void pageShouldAdapterSoftKeyboard(boolean z, Callback callback);

    void phoneHasNfc(Callback callback);

    void pointsScaleToImageBase64(int i, int i2, String str, String str2, int i3, Callback callback);

    void pointsToImageBase64(int i, int i2, String str, String str2, Callback callback);

    @Deprecated
    void privacyAndProtocolReview(String str, ReadableArray readableArray, String str2, ReadableArray readableArray2);

    void refreshDeviceList(Callback callback);

    void registerFontEnable(ReadableMap readableMap);

    void removeExecutor(String str);

    void saveInfo(String str, String str2);

    void setPadScrollDealStrategy(ReadableMap readableMap);

    void sharedSecretFromCryptoObject(String str, String str2, Callback callback);

    void showDeclarationWithConfig(ReadableMap readableMap, Callback callback);

    void zhuimiRobotTracesToImageBase64(int i, int i2, String str, Callback callback);

    void zhuimiRobotTracesToImageBase64V2(int i, int i2, String str, Callback callback);
}
