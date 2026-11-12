package com.xiaomi.hm.health.device;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.huami.account.UserLegalInfoManager;
import com.huami.device.feature.health.HealthDetect;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.ecg.sync.mili.MiliEcgSync;
import com.huami.ecg.sync.mili.device.OnSyncData;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.moving.webapi.SportWebParams;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import com.huami.wallet.ui.utils.WalletUI;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMDisplayData;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportCalibrateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.device.HMDeviceFreeTask;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.ecg.MiliDeviceEcgSyncImpl;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.feature.sync.SyncMenstruation;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMFirstBeatJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMPaiJob;
import com.xiaomi.hm.health.device.service.DeviceSettingsUploader;
import com.xiaomi.hm.health.device.service.DeviceStatisticV2Collector;
import com.xiaomi.hm.health.device.service.DeviceStatisticWrapper;
import com.xiaomi.hm.health.device.service.UpdateWeatherWrapper;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.appsort.utils.AppSortUtilKt;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.firstbeat.FirstbeatSyncResult;
import com.xiaomi.hm.health.firstbeat.FirstbeatUtils;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.receiver.TimeUnitHelper;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceFreeTask extends AsyncTask {
    private static final String g = "HMDeviceFreeTask";
    private HMDeviceSource a;
    private HMBaseDevice b;
    private DeviceConfig c;
    private String d;
    private Lazy<MenstruationDataManager> e = KoinJavaComponent.inject(MenstruationDataManager.class);
    private Lazy<DeviceSnService> f = KoinJavaComponent.inject(DeviceSnService.class);

    public static class DeviceConfig {
        private static final String l = "lastLocationKey";
        public int a = -1;
        public int b = -1;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public long f = -1;
        public String g = Language.getDefault();
        public int h = -1;
        public String i = Language.getDefault();
        public boolean j = false;
        public long k = -1;
        public String dateFormat = null;
        public String lastLocationKey = null;

        public static DeviceConfig a(String jsonStr) {
            DeviceConfig deviceConfig = new DeviceConfig();
            try {
                JSONObject jSONObject = new JSONObject(jsonStr);
                deviceConfig.a = jSONObject.optInt("userInfoCode", -1);
                deviceConfig.b = jSONObject.optInt("displayType", -1);
                deviceConfig.c = jSONObject.optInt(SportWebParams.PARAMA_METRIC, -1);
                deviceConfig.d = jSONObject.optInt("showSms", -1);
                deviceConfig.e = jSONObject.optInt("showIncall", -1);
                deviceConfig.f = jSONObject.optLong("weatherTimestamp", -1L);
                deviceConfig.g = jSONObject.optString(UserLegalInfoManager.KEY_LANGUAGE, Language.getDefault());
                deviceConfig.h = jSONObject.optInt("displayDataCode", -1);
                deviceConfig.i = jSONObject.optString("deviceLanguage");
                deviceConfig.j = jSONObject.optBoolean("hasCorrectAlarm", false);
                deviceConfig.k = jSONObject.optLong("sunriseSunsetTimeStamp", -1L);
                deviceConfig.dateFormat = jSONObject.optString("dateFormat", "");
                deviceConfig.lastLocationKey = jSONObject.optString(l, "");
            } catch (Exception e) {
                HMLog.d(HMDeviceFreeTask.g, e.toString(), new Object[0]);
            }
            return deviceConfig;
        }

        public String b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("displayType", this.b);
                jSONObject.put(SportWebParams.PARAMA_METRIC, this.c);
                jSONObject.put("showSms", this.d);
                jSONObject.put("showIncall", this.e);
                jSONObject.put("weatherTimestamp", this.f);
                jSONObject.put("userInfoCode", this.a);
                jSONObject.put(UserLegalInfoManager.KEY_LANGUAGE, this.g);
                jSONObject.put("displayDataCode", this.h);
                String str = this.i;
                if (str != null) {
                    jSONObject.put("deviceLanguage", str);
                }
                jSONObject.put("hasCorrectAlarm", this.j);
                jSONObject.put("sunriseSunsetTimeStamp", this.k);
                if (!TextUtils.isEmpty(this.dateFormat)) {
                    jSONObject.put("dateFormat", this.dateFormat);
                }
                jSONObject.put(l, this.lastLocationKey);
            } catch (Exception e) {
                HMLog.d(HMDeviceFreeTask.g, e.toString(), new Object[0]);
            }
            return jSONObject.toString();
        }

        public void resetDisplayDataCode() {
            this.h = -1;
        }

        public void resetLastLocationKey() {
            this.lastLocationKey = "";
        }

        public void setDeviceLanguage(String deviceLanguage) {
            this.i = deviceLanguage;
        }
    }

    public class a extends HMCallback<ArrayList<HMPaiData>> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(ArrayList<HMPaiData> datas) {
            if (datas == null || datas.size() == 0) {
                return;
            }
            new HMPaiJob().onDataOut((List<? extends HMPaiData>) datas);
        }
    }

    public class b implements IHMFirstbeatDataCallback {
        public final /* synthetic */ FirstbeatSyncResult a;

        public b(final FirstbeatSyncResult val$syncResult) {
            this.a = val$syncResult;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onData(List<GpsRecord> records) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onFinish(boolean ret) {
            HMLog.i(HMDeviceFreeTask.g, "start sync firstbeat data finished ,result:" + ret, new Object[0]);
            if (!ret || this.a.getFirstbeatData() == null) {
                return;
            }
            new HMFirstBeatJob().onDataOut(this.a.getFirstbeatData());
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback
        public void onFirstbeatData(BleFirstbeatData data) {
            this.a.setFirstbeatData(data);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onStart() {
            HMLog.i(HMDeviceFreeTask.g, "start sync firstbeat data", new Object[0]);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI_TEMPO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_W.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_RIO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private boolean A() {
        if (GPSDataController.getInstance().isRunning()) {
            HMLog.i(g, "doFree do nothing when running", new Object[0]);
            return false;
        }
        if (WalletUI.getInstance().isInWallet()) {
            HMLog.i(g, "doFree do nothing when in wallet", new Object[0]);
            return false;
        }
        if (AccessDoorUI.getInstance().isInAccessDoor()) {
            HMLog.i(g, "doFree do nothing when in accessDoor", new Object[0]);
            return false;
        }
        if (this.a != HMDeviceSource.VDEVICE && HMDeviceManager.getInstance().isConnected(this.a.getType())) {
            return true;
        }
        HMLog.i(g, "doFree do nothing when invalid device state", new Object[0]);
        return false;
    }

    @Deprecated
    private void B() throws InterruptedException {
        if ((this.b instanceof HMMiLiProDevice) && HMDeviceConfig.isSupportEcg(this.a)) {
            MiliEcgSync.INSTANCE.sync(HMDeviceManager.getInstance().getEcgSyncTime(this.a.getType()), new MiliDeviceEcgSyncImpl((HMMiLiProDevice) this.b), new OnSyncData() { // from class: fs2
                @Override // com.huami.ecg.sync.mili.device.OnSyncData
                public final void onSuccess(Calendar calendar) {
                    this.a.s(calendar);
                }
            });
        }
    }

    @Deprecated
    private void C() {
        HMBaseDevice hMBaseDevice = this.b;
        if (hMBaseDevice instanceof HMMiLiProDevice) {
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMBaseDevice;
            Scope scopeOrNull = KoinJavaComponent.getKoin().getScopeOrNull(FemaleHealthScopeNames.FEMALE_HEALTH);
            boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.FEMALE_HEALTH, this.a);
            HMLog.d(g, "syncFemaleData, scope=" + scopeOrNull + ", hasFeature=" + zHasFeature, new Object[0]);
            if (!zHasFeature || scopeOrNull == null || this.e.getValue() == null) {
                return;
            }
            new SyncMenstruation(hMMiLiProDevice).start();
        }
    }

    @Deprecated
    private void D() {
        if (!this.b.getDeviceInfo().getDeviceFeature().hasSw(10)) {
            HMLog.i(g, "device not support firstbeat data", new Object[0]);
            return;
        }
        HMLog.i(g, "ready to sync firstbeat data", new Object[0]);
        long firstbeatUpdateTime = FirstbeatUtils.INSTANCE.getFirstbeatUpdateTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(firstbeatUpdateTime);
        ((HMMiLiProDevice) this.b).startSyncFirstbeatData(calendar, Calendar.getInstance(), new b(new FirstbeatSyncResult()));
    }

    @Deprecated
    private void E() {
        boolean zIsFwSupportPAI;
        if (HMDeviceConfig.hasFeaturePAI(this.a)) {
            zIsFwSupportPAI = k(this.a) ? AppSortUtilKt.isFwSupportPAI(this.a) : true;
        } else {
            zIsFwSupportPAI = false;
        }
        if (zIsFwSupportPAI) {
            ((HMMiLiProDevice) this.b).startSyncPaiData(HMDeviceManager.getInstance().getPaiSyncTime(this.a.getType()), new a());
        }
    }

    @Deprecated
    private void F() {
        Spo2Proxy.INSTANCE.syncFromDevice(this.b);
    }

    private void G() {
        if (DeviceStatisticV2Collector.INSTANCE.supportStatisticV2(this.b)) {
            DeviceStatisticV2Collector.syncStatisticData(this.b);
        } else {
            HMLog.i(g, "not support statics v2", new Object[0]);
        }
    }

    @Deprecated
    private void H() {
        if (!HMDeviceManager.getInstance().supportPressure()) {
            HMLog.i(g, "not support stress", new Object[0]);
            return;
        }
        int value = this.b.getDeviceInfo().getDeviceSource().getValue();
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        String boundDeviceAddress = hMDeviceManager.getBoundDeviceAddress(hMDeviceType);
        StressUseCaseUtils.INSTANCE.syncDeviceData(hMDeviceType.getValue(), value, hMDeviceManager.getBoundDeviceId(hMDeviceType), boundDeviceAddress, this.f.getValue().getSn(hMDeviceType) + "");
    }

    private void I() {
        if (HMDeviceConfig.hasFeatureClassicBt(this.a)) {
            HMLog.i(g, "syncOtherData:" + HMWatchLogic.getInstance().syncOtherData(), new Object[0]);
        }
    }

    private void J(@NotNull HMBaseDevice device) {
        if (ConfigHelperKt.hasFeature(Feature.UPLOAD_DEVICE_SETTINGS, device.getDeviceSource())) {
            DeviceSettingsUploader.upload(device);
        }
    }

    public static DeviceConfig getDeviceConfig() {
        DeviceConfig deviceConfig = new DeviceConfig();
        String deviceConfigString = HMKeeper.getDeviceConfigString();
        return !TextUtils.isEmpty(deviceConfigString) ? DeviceConfig.a(deviceConfigString) : deviceConfig;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    private void i() {
        boolean z;
        if (!HMDeviceConfig.hasFeatureCalendarAndStartDayOfWeek() || TextUtils.equals(this.c.i, this.d)) {
            z = false;
        } else {
            HMBaseDevice hMBaseDevice = this.b;
            if ((hMBaseDevice instanceof HMMiLiProDevice) && hMBaseDevice.isConnected()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            byte b2 = Language.isChinese() ? (byte) 1 : (byte) 0;
            boolean otherCalendarSync = ((HMMiLiProDevice) this.b).setOtherCalendarSync(b2);
            HMLog.i(g, "calendar: " + ((int) b2) + ", setCalendar: " + otherCalendarSync, new Object[0]);
            if (otherCalendarSync) {
                this.c.i = this.d;
            }
        }
    }

    private void j() {
        List<AlarmClockExt> oneBandAlarmExt;
        HMDeviceSource hMDeviceSource = this.a;
        if (!((hMDeviceSource == HMDeviceSource.MILI || hMDeviceSource == HMDeviceSource.MILI_1A || hMDeviceSource == HMDeviceSource.MILI_1S) && !this.c.j) || (oneBandAlarmExt = AlarmClockManager.getInstance().getOneBandAlarmExt()) == null || oneBandAlarmExt.size() <= 0) {
            return;
        }
        this.c.j = ((HMMiLiDevice) this.b).setAlarmSync(oneBandAlarmExt);
    }

    private boolean k(HMDeviceSource deviceSource) {
        Iterator<Map.Entry<HMDeviceSource, String>> it2 = AppSortUtilKt.SUPPORT_PAI_FW_VERSION_MAP.entrySet().iterator();
        while (it2.hasNext()) {
            if (deviceSource == it2.next().getKey()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "call sub item sync error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(boolean z) {
        return "supportHuamiOSWeather: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "setWeatherForHuamiOS return for cityInfo null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "setWeatherForHuamiOS return for locationKey null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "setWeatherForHuamiOS return for name null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q() {
        return "setWeatherForHuamiOS return for locationKey not change";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(boolean z) {
        return "setWeatherForHuamiOS ret: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Calendar calendar) {
        HMDeviceManager.getInstance().setEcgSyncTime(this.a.getType(), calendar);
    }

    public static void saveDeviceConfig(DeviceConfig config) {
        if (config != null) {
            HMKeeper.saveDeviceConfigString(config.b());
        }
    }

    private void t() {
        boolean displaySettingSync;
        HMDeviceSource hMDeviceSource;
        SortableAppItems sortableAppItems = HMAppSortDataManager.getInstance().getDisplaySetting().get(this.a);
        if (sortableAppItems != null && ((hMDeviceSource = this.a) == HMDeviceSource.MILI_PEYTO || hMDeviceSource == HMDeviceSource.MILI_TEMPO) && (this.b instanceof HMMiLiProDevice)) {
            if (HMDeviceConfig.isSupportNewProtocal(this.a)) {
                ((HMMiLiProDevice) this.b).setPagesSync(HMDeviceUtils.transFromHMDisplaySetting(sortableAppItems));
                displaySettingSync = false;
            } else {
                displaySettingSync = ((HMMiLiProDevice) this.b).setDisplaySettingSync(sortableAppItems);
            }
            HMLog.i(g, "setAppSort result:" + displaySettingSync, new Object[0]);
        }
        HMAppSortDataManager.getInstance().upgradeDisplaySetting();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    private void u() {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.b;
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMUserInfo userInfo = hMPersonInfo.getUserInfo();
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        UserInfoExt userInfoExt = HMDeviceUtils.toUserInfoExt(userInfo);
        int iHashCode = userInfoExt.hashCode();
        if (iHashCode != this.c.a) {
            boolean userInfoSync = hMMiLiProDevice.setUserInfoSync(userInfoExt);
            HMLog.i(g, "setUserInfoSync:" + userInfoSync, new Object[0]);
            if (userInfoSync) {
                this.c.a = iHashCode;
            }
        }
        boolean zIsMetric = UnitManager.getInstance().isMetric();
        if (zIsMetric != this.c.c) {
            boolean distanceUnitSync = hMMiLiProDevice.setDistanceUnitSync(zIsMetric);
            HMLog.i(g, "setDistanceUnitSync metric:" + zIsMetric + ",ret:" + distanceUnitSync, new Object[0]);
            if (distanceUnitSync) {
                this.c.c = zIsMetric ? 1 : 0;
            }
        }
        TimeUnitHelper.checkTimeUnitSync();
        HMDisplayType hMDisplayTypeG = HMDeviceUtils.g(miliConfig.getTimePanelType());
        byte type = hMDisplayTypeG.getType();
        if (type != this.c.b) {
            boolean displayTypeSync = hMMiLiProDevice.setDisplayTypeSync(hMDisplayTypeG);
            HMLog.i(g, "setDisplayTypeSync type:" + hMDisplayTypeG + ",ret:" + displayTypeSync, new Object[0]);
            if (displayTypeSync) {
                this.c.b = type;
            }
        }
        ?? r2 = (HMDeviceUtils.isSupportContactNameForSystemLanguage() && (miliConfig.isSmsNameDisplayEnabled() || HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_PEYTO))) ? 1 : 0;
        ?? r4 = (HMDeviceUtils.isSupportContactNameForSystemLanguage() && (hMPersonInfo.getMiliConfig().isIncallNameDisplayEnabled() || BtPhoneDeviceLifeCycle.isBtPhoneEnable())) ? 1 : 0;
        if (r2 != this.c.d) {
            boolean zShowContactSync = hMMiLiProDevice.showContactSync(HMAlertMode.ALERT_SMS, r2);
            HMLog.i(g, "showContactSync ALERT_SMS " + ((boolean) r2) + " result:" + zShowContactSync, new Object[0]);
            if (zShowContactSync) {
                this.c.d = r2;
            }
        }
        if (r4 != this.c.e) {
            boolean zShowContactSync2 = hMMiLiProDevice.showContactSync(HMAlertMode.ALERT_INCALL, r4);
            HMLog.i(g, "showContactSync ALERT_INCALL " + ((boolean) r4) + " result:" + zShowContactSync2, new Object[0]);
            if (zShowContactSync2) {
                this.c.e = r4;
            }
        }
    }

    private void v() {
        List<HMDisplayData> listF;
        if (!HMDeviceConfig.hasFeatureSecondaryScreen(this.a) || (listF = HMDeviceUtils.f()) == null || listF.size() <= 0) {
            return;
        }
        boolean displayDataSync = ((HMMiLiProDevice) this.b).setDisplayDataSync(listF);
        HMLog.i(g, "setDisplayDataSync result:" + displayDataSync, new Object[0]);
        if (displayDataSync) {
            this.c.h = listF.hashCode();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    private void w() {
        HMDeviceSource hMDeviceSource = this.a;
        if (hMDeviceSource == HMDeviceSource.MILI_TEMPO || hMDeviceSource == HMDeviceSource.MILI_WUHAN || hMDeviceSource == HMDeviceSource.MILI_CHONGQING || hMDeviceSource == HMDeviceSource.MILI_BEATS || hMDeviceSource == HMDeviceSource.MILI_BEATS_W || hMDeviceSource == HMDeviceSource.MILI_BEATS_P || hMDeviceSource == HMDeviceSource.MILI_CINCO || hMDeviceSource == HMDeviceSource.MILI_CINCO_L || hMDeviceSource == HMDeviceSource.MILI_RIO) {
            String indoorRunCalibratedData = RunningManager.getIndoorRunCalibratedData();
            if (TextUtils.isEmpty(indoorRunCalibratedData)) {
                return;
            }
            String[] strArrSplit = indoorRunCalibratedData.split(",");
            try {
                SportCalibrateInfo sportCalibrateInfo = new SportCalibrateInfo();
                sportCalibrateInfo.setStartTimestamp((int) Long.parseLong(strArrSplit[0]));
                boolean z = true;
                sportCalibrateInfo.setDistance(Integer.parseInt(strArrSplit[1]));
                sportCalibrateInfo.setStep(Integer.parseInt(strArrSplit[2]));
                int i = Integer.parseInt(strArrSplit[3]);
                switch (c.a[this.a.ordinal()]) {
                    case 1:
                        if (i != 3) {
                            z = false;
                        }
                        break;
                    case 2:
                        if (i != 8) {
                            z = false;
                        }
                        break;
                    case 3:
                        if (i != 9) {
                            z = false;
                        }
                        break;
                    case 4:
                    case 5:
                        if (i != 6) {
                            z = false;
                        }
                        break;
                    case 6:
                        if (i != 7) {
                            z = false;
                        }
                        break;
                    case 7:
                    case 8:
                    case 9:
                        if (i != this.a.getValue() + 100) {
                            z = false;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
                if (z) {
                    HMLog.i(g, "sportCalibrateSync result:" + ((HMMiLiProDevice) this.b).sportCalibrateSync(sportCalibrateInfo), new Object[0]);
                } else {
                    HMLog.i(g, "sportCalibrate sport record not belong to current device!", new Object[0]);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            RunningManager.clearIndoorRunCalibratedData();
        }
    }

    private void x() {
        String dateFormat = HMDeviceUtils.getDateFormat(this.a);
        if (TextUtils.isEmpty(dateFormat) || dateFormat.equals(this.c.dateFormat)) {
            return;
        }
        HMBaseDevice hMBaseDevice = this.b;
        if (hMBaseDevice instanceof HMMiLiProDevice) {
            boolean dateFormatSync = ((HMMiLiProDevice) hMBaseDevice).setDateFormatSync(dateFormat);
            HMLog.i(g, "setDateFormatSync:" + dateFormat + " result:" + dateFormatSync, new Object[0]);
            if (dateFormatSync) {
                this.c.dateFormat = dateFormat;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    private void y() {
        long lastUpdateTime;
        boolean z;
        HMBaseDevice hMBaseDevice = this.b;
        if (hMBaseDevice instanceof HMMiLiProDevice) {
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMBaseDevice;
            final boolean zSupportHuamiOSWeather = hMMiLiProDevice.supportHuamiOSWeather();
            HMLog.info(g, new Function0() { // from class: hs2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceFreeTask.m(zSupportHuamiOSWeather);
                }
            });
            if (zSupportHuamiOSWeather) {
                z(hMMiLiProDevice);
                return;
            }
            if (HMDeviceConfig.hasFeatureWeather(this.a)) {
                WeatherInfos weatherInfoForDevice = DeviceXFunctionsKt.getWeatherApi().getWeatherInfoForDevice();
                if (weatherInfoForDevice != null) {
                    long lastUpdateTime2 = weatherInfoForDevice.getLastUpdateTime();
                    DeviceConfig deviceConfig = this.c;
                    if (lastUpdateTime2 == deviceConfig.f && this.d.equals(deviceConfig.g)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    boolean zUpdateWeatherToDeviceBlock = UpdateWeatherWrapper.updateWeatherToDeviceBlock(hMMiLiProDevice, weatherInfoForDevice);
                    HMLog.i(g, "updateWeatherToDeviceBlock result:" + zUpdateWeatherToDeviceBlock, new Object[0]);
                    this.c.f = zUpdateWeatherToDeviceBlock ? weatherInfoForDevice.getLastUpdateTime() : -1L;
                }
                if (weatherInfoForDevice != null) {
                    UpdateWeatherWrapper.weatherAlert(hMMiLiProDevice, weatherInfoForDevice.getAlertInfos());
                }
            }
            WeatherInfos weatherInfo = DeviceXFunctionsKt.getWeatherApi().getWeatherInfo();
            if (weatherInfo == null) {
                HMLog.e(g, "getWeatherInfo is null.", new Object[0]);
                return;
            }
            List<ForecastWeatherInfo> forecastWeatherInfos = weatherInfo.getForecastWeatherInfos();
            if (forecastWeatherInfos != null && forecastWeatherInfos.size() > 0) {
                Iterator<ForecastWeatherInfo> it2 = forecastWeatherInfos.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        lastUpdateTime = -1;
                        break;
                    }
                    ForecastWeatherInfo next = it2.next();
                    if (TimeUtils.isToday(next.getDate())) {
                        lastUpdateTime = next.getLastUpdateTime();
                        break;
                    }
                }
            } else {
                lastUpdateTime = -1;
                break;
            }
            if (!HMDeviceConfig.hasFeatureBackLight(this.a) || lastUpdateTime == this.c.k) {
                return;
            }
            boolean zSyncSunriseSunsetInfo2DeviceBlock = UpdateWeatherWrapper.syncSunriseSunsetInfo2DeviceBlock((HMMiLiProDevice) this.b, DeviceXFunctionsKt.getWeatherApi().getWeatherInfo());
            HMLog.i(g, "syncSunriseSunsetInfo: " + zSyncSunriseSunsetInfo2DeviceBlock, new Object[0]);
            this.c.k = zSyncSunriseSunsetInfo2DeviceBlock ? lastUpdateTime : -1L;
        }
    }

    private void z(HMMiLiProDevice proDevice) {
        WeatherInfos weatherInfo = DeviceXFunctionsKt.getWeatherApi().getWeatherInfo();
        if (weatherInfo == null) {
            return;
        }
        CityInfo cityInfo = weatherInfo.getCityInfo();
        if (cityInfo == null) {
            HMLog.info(g, new Function0() { // from class: ks2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceFreeTask.n();
                }
            });
            return;
        }
        if (TextUtils.isEmpty(cityInfo.getLocationKey())) {
            HMLog.info(g, new Function0() { // from class: ls2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceFreeTask.o();
                }
            });
            return;
        }
        if (TextUtils.isEmpty(cityInfo.getName())) {
            HMLog.info(g, new Function0() { // from class: js2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceFreeTask.p();
                }
            });
            return;
        }
        if (TextUtils.equals(this.c.lastLocationKey, cityInfo.getLocationKey())) {
            HMLog.info(g, new Function0() { // from class: is2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceFreeTask.q();
                }
            });
            return;
        }
        this.c.lastLocationKey = cityInfo.getLocationKey();
        final boolean zUpdateWeatherSettings = ((WeatherModule) proDevice.getChannelModule(WeatherModule.class)).updateWeatherSettings(new WeatherSetting(null, new City(cityInfo.getLocationKey(), cityInfo.getName()), null));
        HMLog.info(g, new Function0() { // from class: gs2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceFreeTask.r(zUpdateWeatherSettings);
            }
        });
    }

    @Override // android.os.AsyncTask
    public Object doInBackground(Object[] params) {
        HMDeviceType hMDeviceType = (HMDeviceType) params[0];
        this.a = HMDeviceManager.getInstance().getBoundDeviceSource(hMDeviceType);
        this.c = getDeviceConfig();
        this.d = Language.getDefault();
        this.b = HMDeviceManager.getInstance().getDevice(hMDeviceType);
        HMLog.i(g, "doFree type:" + hMDeviceType + ",source:" + this.a, new Object[0]);
        if (!A()) {
            return Boolean.FALSE;
        }
        HMLog.i(g, "doFree start...", new Object[0]);
        HMBaseDevice hMBaseDevice = this.b;
        if (hMBaseDevice != null && hMBaseDevice.isConnected()) {
            AlarmClockManager.getInstance().correctAlarmWhenDoFree(this.a, this.b);
            if (HMDeviceConfig.hasFeaturePro(this.a)) {
                u();
            }
            x();
            y();
            v();
            t();
            j();
            HealthDetect.INSTANCE.getUserConfig().adjustConfig();
            w();
            DeviceStatisticWrapper.getAndUpload(this.b);
            i();
            J(this.b);
            try {
                if (SyncCenterManager.INSTANCE.isUsingSyncCenter()) {
                    HMLog.i(g, "use ysnc cneter", new Object[0]);
                } else {
                    E();
                    D();
                    C();
                    F();
                    B();
                    H();
                    G();
                }
            } catch (Exception e) {
                HMLog.error(g, "001", e, new Function0() { // from class: ms2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceFreeTask.l();
                    }
                });
            }
        }
        DeviceConfig deviceConfig = this.c;
        deviceConfig.g = this.d;
        String strB = deviceConfig.b();
        HMLog.i(g, "configStr:" + strB, new Object[0]);
        HMKeeper.saveDeviceConfigString(strB);
        I();
        HMLog.i(g, "doFree stop...", new Object[0]);
        return Boolean.TRUE;
    }
}
