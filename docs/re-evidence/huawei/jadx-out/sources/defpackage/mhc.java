package defpackage;

import android.text.TextUtils;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = DeviceFeatureSupportApi.class)
@Singleton
public class mhc implements DeviceFeatureSupportApi {
    private Map<String, String> e;

    private boolean b(int i) {
        return i == 78 || i == 57;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportExclusiveGuardian(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "exclusiveServiceSupport api is null. ");
            featureSupportCallback.success(false);
        } else {
            deviceGeneralSettingApi.exclusiveServiceSupport(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: mhe
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    mhc.c(featureSupportCallback, z);
                }
            });
        }
    }

    static /* synthetic */ void c(FeatureSupportCallback featureSupportCallback, boolean z) {
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "exclusiveServiceSupport result:", Boolean.valueOf(z));
        featureSupportCallback.success(z);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportExclusiveGuardianFromLocal(DeviceInfo deviceInfo) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "isSupportExclusiveGuardianFromLocal api is null. ");
            return false;
        }
        return deviceGeneralSettingApi.isSupportExclusiveGuardianFromLocal(deviceInfo.getDeviceIdentify());
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportMusic(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isSupportMusicInfoList() || deviceCapabilityB.isSupportMusicControl();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportMyWatchFace(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 224) && !Utils.k();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportWechatBind(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        WechatDeviceProviderApi wechatDeviceProviderApi = (WechatDeviceProviderApi) Services.b("FeatureDataOpen", WechatDeviceProviderApi.class);
        if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
            eei.e(deviceInfo);
        }
        wechatDeviceProviderApi.checkSupportWechatDevice(deviceInfo, new WechatDeviceProviderApi.CheckResultListener<Boolean>() { // from class: mhc.5
            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(Boolean bool) {
                ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "getWechatBind checkSupportWechatDevice: ", bool);
                FeatureSupportCallback featureSupportCallback2 = featureSupportCallback;
                if (featureSupportCallback2 != null) {
                    featureSupportCallback2.success(bool.booleanValue());
                }
            }

            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            public void onError(int i, String str) {
                ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "getWechatBind checkSupportWechatDevice onError code: ", Integer.valueOf(i), " msg:", str);
                FeatureSupportCallback featureSupportCallback2 = featureSupportCallback;
                if (featureSupportCallback2 != null) {
                    featureSupportCallback2.success(false);
                }
            }
        });
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportHighMonitoring(DeviceInfo deviceInfo) {
        return dfd.c(deviceInfo) && ipg.e();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportWatchFaceMarket(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null || !deviceCapabilityB.isSupportWatchFace()) {
            return false;
        }
        if (deviceInfo.getPowerSaveModel() != 1 || !b(deviceInfo.getProductType())) {
            return true;
        }
        LogUtil.j("DeviceFeatureSupportImpl", "getPowerSaveModel is power state");
        return false;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportWallet(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            featureSupportCallback.success(false);
        } else {
            deviceGeneralSettingApi.querySupportWallet(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: mhd
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    mhc.b(featureSupportCallback, z);
                }
            });
        }
    }

    static /* synthetic */ void b(FeatureSupportCallback featureSupportCallback, boolean z) {
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "checkSupportWallet result:", Boolean.valueOf(z));
        featureSupportCallback.success(z);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportCamera(DeviceInfo deviceInfo) {
        meo meoVarA = meo.a();
        meoVarA.d(deviceInfo);
        return meoVarA.b(deviceInfo);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportCmccAi(DeviceInfo deviceInfo) {
        boolean zD = lwd.c().d();
        boolean zE = lwd.c().e(deviceInfo, lvi.j(deviceInfo.getProductType()));
        LogUtil.a("DeviceFeatureSupportImpl", "checkSupportCamera isSupportCmccProduct:", Boolean.valueOf(zE), "isChineseUseAndLanguage:", Boolean.valueOf(zD));
        return zD && zE;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportKeepAlive(DeviceInfo deviceInfo) {
        return nzz.c();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportBaidouSatellite(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        final DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi != null) {
            deviceGeneralSettingApi.querySupportWallet(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: mhi
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    mhc.a(featureSupportCallback, deviceGeneralSettingApi, deviceInfo, z);
                }
            });
        } else if (featureSupportCallback != null) {
            featureSupportCallback.success(false);
        }
    }

    static /* synthetic */ void a(final FeatureSupportCallback featureSupportCallback, DeviceGeneralSettingApi deviceGeneralSettingApi, DeviceInfo deviceInfo, boolean z) {
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "checkSupportWallet result:", Boolean.valueOf(z));
        if (z) {
            deviceGeneralSettingApi.querySupportSatellite(deviceInfo, new DeviceGeneralSettingCallback() { // from class: mha
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z2) {
                    mhc.d(featureSupportCallback, z2);
                }
            });
        } else if (featureSupportCallback != null) {
            featureSupportCallback.success(false);
        }
    }

    static /* synthetic */ void d(FeatureSupportCallback featureSupportCallback, boolean z) {
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "baiduSatelliteSupport ret:", Boolean.valueOf(z));
        if (featureSupportCallback != null) {
            featureSupportCallback.success(z);
        }
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportVascularElasticity(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 75);
        boolean z = zD && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.vascular-health");
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "setVascularItem isSupportCapability:", Boolean.valueOf(zD), " isSupportVascular:", Boolean.valueOf(z));
        return z;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportHiResearch(DeviceInfo deviceInfo) {
        if (Utils.o()) {
            LogUtil.j("DeviceFeatureSupportImpl", "isOversea hide the innovation research  card");
            return false;
        }
        boolean zC = c(deviceInfo);
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "isSupportInnovationResearch: ", Boolean.valueOf(zC));
        return zC;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportIntelligentHomeLinkage(DeviceInfo deviceInfo) {
        boolean zE = e(deviceInfo);
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "intelligentHomeLinkageSupport isIntelligentHomeShow:", Boolean.valueOf(zE));
        return zE;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportSleepBreathe(DeviceInfo deviceInfo) {
        boolean zB = mbt.a().b(deviceInfo);
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "isSupportSleepBreathe isSupportSleepBreathe:", Boolean.valueOf(zB));
        return zB;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportOfflineMap(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceFeatureSupportImpl", "isSupportOfflineMap enter");
        if (!a(deviceInfo)) {
            ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "isSupportOfflineMap enter isSupport = false");
            return false;
        }
        DeviceManagerCommonConfigApi deviceManagerCommonConfigApi = (DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class);
        if (!deviceManagerCommonConfigApi.hasFutureConfig("com.huawei.health.offlinemap")) {
            boolean z = !Utils.r();
            LogUtil.a("DeviceFeatureSupportImpl", "isSupportOfflineMap not find the config, default isSupportShow = ", Boolean.valueOf(z));
            return z;
        }
        return b(deviceManagerCommonConfigApi);
    }

    private boolean a(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 201) || eey.d(deviceInfo, 202);
    }

    private boolean b(DeviceManagerCommonConfigApi deviceManagerCommonConfigApi) {
        if (Utils.h()) {
            return a(deviceManagerCommonConfigApi);
        }
        return c(deviceManagerCommonConfigApi);
    }

    private boolean a(DeviceManagerCommonConfigApi deviceManagerCommonConfigApi) {
        if (!deviceManagerCommonConfigApi.isSupportFeature("com.huawei.health.offlinemap", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            LogUtil.a("DeviceFeatureSupportImpl", "isSupportOfflineMap account not support, isSupport = false");
            return false;
        }
        if (Utils.r()) {
            LogUtil.a("DeviceFeatureSupportImpl", "isSupportOfflineMap config check area is TW");
            return deviceManagerCommonConfigApi.isSupportFeature("com.huawei.health.offlinemap", "TW");
        }
        LogUtil.a("DeviceFeatureSupportImpl", "isSupportOfflineMap account support");
        return true;
    }

    private boolean c(DeviceManagerCommonConfigApi deviceManagerCommonConfigApi) {
        String country = Locale.getDefault().getCountry();
        LogUtil.a("DeviceFeatureSupportImpl", "isSupportOfflineMap localCountryCode = ", country);
        return deviceManagerCommonConfigApi.isSupportFeature("com.huawei.health.offlinemap", country);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportHealthMonitoring(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        if ((deviceCapabilityB.isSupportCoreSleep() && loj.c(58)) || deviceCapabilityB.isActivityReminder()) {
            return true;
        }
        if (deviceCapabilityB.isSupportContinueHeartRate()) {
            LogUtil.a("DeviceFeatureSupportImpl", "prepare add press continue heart rate item");
            return true;
        }
        if (deviceCapabilityB.isSupportHeartRateEnable() && !deviceCapabilityB.isSupportContinueHeartRate()) {
            LogUtil.a("DeviceFeatureSupportImpl", "prepare add press cycle heart rate item");
            return true;
        }
        if (deviceCapabilityB.isSupportPressAutoMonitor()) {
            LogUtil.a("DeviceFeatureSupportImpl", "prepare add press auto monitor item");
            return true;
        }
        if (mbt.a().b(deviceInfo)) {
            return true;
        }
        return eey.d(deviceInfo, 29);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportFamilyHeart(DeviceInfo deviceInfo) {
        boolean zC = lxc.c(deviceInfo.getDeviceIdentify());
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "SUPPORT_FAMILY_MODE_HEART isSupportFamilyModeHeart:", Boolean.valueOf(zC), " PairMode", Integer.valueOf(mgb.d(deviceInfo.getDeviceIdentify())));
        return zC && lxc.a(deviceInfo.getDeviceIdentify());
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportNotificationLive(DeviceInfo deviceInfo) {
        if (Utils.o() || !CommonUtil.bc()) {
            return false;
        }
        boolean zD = eey.d(deviceInfo, 176);
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "isSupportNotificationLive isSupportOperation:", Boolean.valueOf(zD));
        if (!zD) {
            zD = eey.d(deviceInfo, 219);
            ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "isSupportNotificationLiveLevel isSupportOperation:", Boolean.valueOf(zD));
        }
        return zD && EnvironmentInfo.g();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportArrhythmia(DeviceInfo deviceInfo) {
        return grt.e(deviceInfo);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportEarphoneManager(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 112);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportAPPMarket(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        if (a()) {
            LogUtil.a("DeviceFeatureSupportImpl", "initAppMarketCard isKoreaVersion is true");
            if (featureSupportCallback != null) {
                featureSupportCallback.success(false);
                return;
            }
            return;
        }
        if (!lyy.b().b(deviceInfo)) {
            lyy.b().a(b(deviceInfo.getDeviceIdentify()), new IBaseResponseCallback() { // from class: mhg
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    mhc.c(featureSupportCallback, i, obj);
                }
            });
        } else if (featureSupportCallback != null) {
            featureSupportCallback.success(true);
        }
    }

    static /* synthetic */ void c(FeatureSupportCallback featureSupportCallback, int i, Object obj) {
        LogUtil.a("DeviceFeatureSupportImpl", "showAppMarket errorCode:", Integer.valueOf(i));
        if (featureSupportCallback != null) {
            featureSupportCallback.success(i == 1);
        }
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportAlarm(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isEventAlarm() || deviceCapabilityB.isSmartAlarm();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportWeatherItem(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        if (isSupportWeatherPush(deviceInfo)) {
            featureSupportCallback.success(true);
            return;
        }
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "isSupportWeatherItem api is null. ");
            featureSupportCallback.success(false);
        } else {
            deviceGeneralSettingApi.querySupportWeather(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: mhf
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    mhc.e(featureSupportCallback, z);
                }
            });
        }
    }

    static /* synthetic */ void e(FeatureSupportCallback featureSupportCallback, boolean z) {
        LogUtil.a("DeviceFeatureSupportImpl", "querySupportWeather onResult:", Boolean.valueOf(z));
        featureSupportCallback.success(z);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportWeatherPush(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isWeatherPush();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportContacts(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isContacts();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportContactDataSync(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 23);
        boolean zD2 = eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_BASKETBALL);
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "isSupportContactDataSync isSyncContact:", Boolean.valueOf(zD), " isSupportSportContact:", Boolean.valueOf(zD2));
        return zD || zD2;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportQuickReplySms(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 82);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportEsim(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        return (deviceCapabilityB == null || qrs.ah(BaseApplication.getContext()) || !deviceCapabilityB.isSupportEsim()) ? false : true;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportNewEsim(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        return deviceCapabilityB != null && isSupportEsim(deviceInfo) && deviceCapabilityB.isSupportNewEsim();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportFindDevice(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 79);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportHelp(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        boolean z = false;
        if (deviceCapabilityB == null) {
            return false;
        }
        boolean zIsSupportHelp = deviceCapabilityB.isSupportHelp();
        if (zIsSupportHelp && lvi.a(deviceInfo.getProductType()).z()) {
            z = true;
        }
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "DEVICE_SETTING_HELP isSupportHelp:", Boolean.valueOf(zIsSupportHelp), " isSupportHelpUx:", Boolean.valueOf(z));
        return z;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportStudentInfo(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        boolean zD = lxc.d(deviceIdentify);
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "SUPPORT_STUDENT_INFO isSupportFamilyModeUserInfo:", Boolean.valueOf(zD), " PairMode:", Integer.valueOf(mgb.d(deviceIdentify)));
        return zD && lxc.a(deviceIdentify);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isEnableNMPA(DeviceInfo deviceInfo) {
        return mbt.a().b();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportQuickAPPEcg(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        return (isSupportQuickAPPEcgAnalysic(deviceInfo) || !(deviceCapabilityB != null ? deviceCapabilityB.isSupportEcgAuth() : false) || Utils.o()) ? false : true;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportQuickAPPEcgAnalysic(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        boolean zIsSupportEcgAuth = deviceCapabilityB != null ? deviceCapabilityB.isSupportEcgAuth() : false;
        boolean z = eey.d(deviceInfo, 226) && eey.d(deviceInfo, 106) && fxn.d();
        boolean z2 = eey.d(deviceInfo, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce");
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "addEcgItem isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z2), ", isSupportExtInfoSupportEcg:", Boolean.valueOf(z));
        return z2 || z;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportHeartIndex(DeviceInfo deviceInfo) {
        String deviceName = deviceInfo.getDeviceName();
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "showHeartIndexItem currentDeviceName:", deviceName);
        return !TextUtils.isEmpty(deviceName) && deviceInfo.getProductType() == 11 && deviceName.contains("HUAWEI CM-R1P");
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportMessageAlert(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isMessageAlert();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportTemperature(DeviceInfo deviceInfo) {
        return mbw.a();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isSupportHealthCalendarSync(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        if (d(deviceInfo)) {
            featureSupportCallback.success(true);
            return;
        }
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "isSupportHealthCalendarSync api is null. ");
            featureSupportCallback.success(false);
        } else {
            deviceGeneralSettingApi.querySupportCalendar(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: mhh
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    mhc.a(featureSupportCallback, z);
                }
            });
        }
    }

    static /* synthetic */ void a(FeatureSupportCallback featureSupportCallback, boolean z) {
        LogUtil.a("DeviceFeatureSupportImpl", "querySupportCalendar onResult:", Boolean.valueOf(z));
        featureSupportCallback.success(z);
    }

    private boolean d(DeviceInfo deviceInfo) {
        boolean zC = mga.c(deviceInfo);
        LogUtil.a("DeviceFeatureSupportImpl", "getSingleFrameDevice: ", Integer.valueOf(deviceInfo.getSingleFrameDevice()));
        if (zC) {
            if (!CommonUtil.bg() || deviceInfo.getSingleFrameDevice() == 1) {
                return eey.d(deviceInfo, 184);
            }
            return false;
        }
        return eey.d(deviceInfo, 171);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportSleep(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        return deviceCapabilityB != null && deviceCapabilityB.isSupportCoreSleep() && loj.c(58);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportPressure(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null || !deviceCapabilityB.isSupportPressAutoMonitor()) {
            return false;
        }
        LogUtil.a("DeviceFeatureSupportImpl", "prepare add press auto monitor item");
        return true;
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportEmotionPressure(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 206) && !ets.e();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportPhysiological(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 114);
        LogUtil.a("DeviceFeatureSupportImpl", "addMenstrualPredictItem isSupportMenstrualPredict: ", Boolean.valueOf(zD));
        if (!zD) {
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY");
        LogUtil.a("DeviceFeatureSupportImpl", "addMenstrualPredictItem showState: ", strE);
        return !"false".equals(strE);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportHeart(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isSupportContinueHeartRate() || deviceCapabilityB.isSupportHeartRateEnable();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportBloodOxygen(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        return deviceCapabilityB.isSupportCycleBloodOxygenSwitch();
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportGolf(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 105);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportBloodPressure(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 59);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportWheelchair(DeviceInfo deviceInfo) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isCanadaCountry()) {
            return false;
        }
        return eey.d(deviceInfo, 276);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportMicroWorkout(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 305);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isSupportOutdoorAdventure(DeviceInfo deviceInfo) {
        if (Utils.o()) {
            return false;
        }
        return eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public void isServiceSupport(DeviceInfo deviceInfo, final DeviceFeatureSupportApi.ServiceSupportCallBack serviceSupportCallBack) {
        final String str = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + deviceInfo.getDeviceIdentify();
        Map<String, String> map = this.e;
        if (map == null) {
            this.e = new HashMap();
        } else if (map.containsKey(str)) {
            serviceSupportCallBack.onResult(this.e.get(str));
            return;
        }
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainSgwCcpcHuawei", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"));
        oet.d().c(noCheckUrl + "/forward/ccpc/ccpc/queryInfoForSportsHealthAccess/4600", d(), ofe.c((Object) b()), String.class, new ResultCallback<String>() { // from class: mhc.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                LogUtil.a("DeviceFeatureSupportImpl", "isServiceSupport onSuccess:");
                mhc.this.e.put(str, str2);
                serviceSupportCallBack.onResult(str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("DeviceFeatureSupportImpl", "isServiceSupport onFail:", th.getMessage());
                serviceSupportCallBack.onResult("");
            }
        });
    }

    @Override // com.huawei.devicefeature.DeviceFeatureSupportApi
    public boolean isActivityReminder(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "deviceCapability is null");
            return false;
        }
        return deviceCapabilityB.isActivityReminder();
    }

    private Map<String, String> b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        HashMap map = new HashMap();
        map.put("sportsCountryCode", strE);
        map.put("sportsLanguageCode", LanguageUtil.b(BaseApplication.getContext()));
        map.put("accessToken", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015));
        return map;
    }

    private Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("Accept", "application/json");
        map.put("Content-Type", "application/json");
        map.put("SGW-APP-ID", "E0686CFBA30672BB267D4A66CE99AF15");
        return map;
    }

    private DeviceCapability b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceFeatureSupportImpl", "capabilityNegotiation id is empty");
            return null;
        }
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA != null) {
            return deviceCapabilityA;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "DeviceFeatureSupportImpl");
        if (mapD == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "serviceCapabilityNegotiation(id) map is null");
            return null;
        }
        DeviceCapability deviceCapability = mapD.get(str);
        if (deviceCapability != null) {
            eej.a(str, deviceCapability);
            return deviceCapability;
        }
        LogUtil.j("DeviceFeatureSupportImpl", "serviceCapabilityNegotiation(id) cap is null, id:", CommonUtil.n(str));
        return deviceCapability;
    }

    private boolean a() {
        boolean zA = Utils.a(BaseApplication.getContext());
        LogUtil.a("DeviceFeatureSupportImpl", "isKoreaVersion is:", Boolean.valueOf(zA));
        return zA;
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        if (!eey.d(deviceInfo, 100) && eey.d(deviceInfo, 59)) {
            return true;
        }
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            LogUtil.a("DeviceFeatureSupportImpl", "isSupportInnovationResearch deviceCapability == null");
            return false;
        }
        if ((deviceCapabilityB.isSupportAtrialOperator() && !eei.d(deviceInfo)) || deviceCapabilityB.isSupportEcgAuth() || eey.d(deviceInfo, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) || eey.d(deviceInfo, 95)) {
            return true;
        }
        return deviceCapabilityB.isSupportSleepBreathe();
    }

    public boolean e(DeviceInfo deviceInfo) {
        boolean z = false;
        if (Utils.o()) {
            LogUtil.a("DeviceFeatureSupportImpl", "isIntelligentHomeShow version is oversea or googlePlay");
            return false;
        }
        if (deviceInfo == null) {
            LogUtil.a("DeviceFeatureSupportImpl", "isIntelligentHomeShow deviceInfo == null");
            return false;
        }
        DeviceCapability deviceCapabilityB = b(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityB == null) {
            return false;
        }
        boolean zB = b(deviceInfo);
        boolean zIsSupportIntelligentHomeLinkage = deviceCapabilityB.isSupportIntelligentHomeLinkage();
        ReleaseLogUtil.d("R_DeviceFeatureSupportImpl", "intelligentHomeSwitch:", Boolean.valueOf(zB), "; isSupportIntelligentHomeLinkage:", Boolean.valueOf(zIsSupportIntelligentHomeLinkage));
        if (CommonUtil.bu() && zIsSupportIntelligentHomeLinkage && zB) {
            return true;
        }
        if (zIsSupportIntelligentHomeLinkage) {
            if (zB) {
                z = true;
            } else {
                String strE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), String.valueOf(10008), "intelligent_home_switch");
                LogUtil.a("DeviceFeatureSupportImpl", "devicePairSwitchFlag:", strE);
                if (strE != null && !TextUtils.isEmpty(strE)) {
                    z = Boolean.parseBoolean(strE);
                }
            }
        }
        LogUtil.a("DeviceFeatureSupportImpl", "isIntelligentHomeVisible:", Boolean.valueOf(z));
        return z;
    }

    private boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getProductType() <= 71) {
            LogUtil.a("DeviceFeatureSupportImpl", "getIntelligentHomeSwitchFromCloud not new product");
            return true;
        }
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (hiLinkDeviceId == null || hiLinkDeviceId.isEmpty()) {
            LogUtil.j("DeviceFeatureSupportImpl", "getIntelligentHomeSwitchFromCloud HiLinkDeviceId is null");
            return false;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType()));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j("DeviceFeatureSupportImpl", "getIntelligentHomeSwitchFromCloud pluginInfo is null");
            return true;
        }
        edz edzVarI = pluginInfoByUuid.i();
        if (edzVarI != null) {
            try {
                String string = new JSONObject(edzVarI.e()).getString("ai_tips_product_" + hiLinkDeviceId);
                LogUtil.a("DeviceFeatureSupportImpl", "hiLinkDeviceInfo is:", string);
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has("intelligent_home_switch")) {
                    return jSONObject.optBoolean("intelligent_home_switch");
                }
            } catch (JSONException unused) {
                LogUtil.e("DeviceFeatureSupportImpl", "getIntelligentHomeSwitchFromCloud JSONException");
            }
        } else {
            LogUtil.j("DeviceFeatureSupportImpl", "pluginInfoForWear is null");
        }
        return true;
    }
}
