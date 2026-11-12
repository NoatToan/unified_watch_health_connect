package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.DialModule;
import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerApiFactory;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerCallback;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.customvibrate.CustomVibrateApi;
import com.huami.bluetooth.profile.channel.module.customvibrate.CustomVibrateFactory;
import com.huami.bluetooth.profile.channel.module.display_list_setting.impl.DisplayListSettingFactory;
import com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule;
import com.huami.bluetooth.profile.channel.module.health.HealthModule;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.channel.module.health.impl.HeartHealthImpl;
import com.huami.bluetooth.profile.channel.module.health.impl.HuamiOsHeartHealthImpl;
import com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener;
import com.huami.bluetooth.profile.channel.module.notification.NotificationApi;
import com.huami.bluetooth.profile.channel.module.notification.NotificationApiV2;
import com.huami.bluetooth.profile.channel.module.notification.NotificationApiV3;
import com.huami.bluetooth.profile.channel.module.notification.NotificationProtocolWrapper;
import com.huami.bluetooth.profile.channel.module.notification.entity.AppReplyResult;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoResponse;
import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteModule;
import com.huami.bluetooth.profile.channel.module.openapp.AppPageType;
import com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.pb.PBApi;
import com.huami.bluetooth.profile.channel.module.pb.PBApiFactory;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsApi;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsImpl;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v1.SettingsLanguageV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v1.WearingWayV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.statistics.IOldStatisticsApiDelegate;
import com.huami.bluetooth.profile.channel.module.statistics.api.StatisticsApiFactory;
import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.GpsInjectResponse;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.SensorData;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorApi;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorApiFactory;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorModule;
import com.huami.bluetooth.profile.ecf.data.ActivityGoal;
import com.huami.bluetooth.profile.ecf.data.HRZone;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.LiftWristTouch;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.bluetooth.profile.ecf.data.Touchscreen;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.HMBleModule;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.CincoEntrance;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.model.HMDeviceState;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMDisplayData;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMNegativeScreen;
import com.xiaomi.hm.health.bt.model.HMOffWistLockConfig;
import com.xiaomi.hm.health.bt.model.HMPeytoSettings;
import com.xiaomi.hm.health.bt.model.HMProDisplayItem;
import com.xiaomi.hm.health.bt.model.HMProDisplayItemExt;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import com.xiaomi.hm.health.bt.model.PasswordInfo;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.selftest.HMChaohuTestInfo;
import com.xiaomi.hm.health.bt.profile.adreminder.AdReminder;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertController;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.alert.NotificationControllerFactory;
import com.xiaomi.hm.health.bt.profile.alert.NotificationInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMAMCProfile;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.DeviceAuthorizationFactory;
import com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.AGpsDto;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ConnectionParameters;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.beep.BeepItem;
import com.xiaomi.hm.health.bt.profile.collect.DataCollect;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.DfuExecutor;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.dfu.DfuUpgradeApiImp;
import com.xiaomi.hm.health.bt.profile.dfu.HMDfuProfile;
import com.xiaomi.hm.health.bt.profile.dfu.HMDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareUpgradeTask;
import com.xiaomi.hm.health.bt.profile.dfu.HMFwUpgradeProfile;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.NewDfuProfile;
import com.xiaomi.hm.health.bt.profile.dfu.NewDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeModel;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import com.xiaomi.hm.health.bt.profile.feature.AGpsFeatureInit;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure.BloodPressureMeasureResult;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.HMSyncBodyTemperatureTaskNew;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.IHMBodyTemperatureDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.CommonGdspSyncTask;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.dump.HMDumpSettings;
import com.xiaomi.hm.health.bt.profile.gdsp.dump.HMDumpTask;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportCalibrateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.highlowhr.HmHighLowHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.highlowhr.HmSyncHighLowHrDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.HMSyncSpo2DataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureData;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureInfo;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateData;
import com.xiaomi.hm.health.bt.profile.hr.HmNewHeartRateController;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualNotifiedData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairStatus;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import com.xiaomi.hm.health.bt.profile.nfc.IHMNFCStatusListener;
import com.xiaomi.hm.health.bt.profile.nfc.ITradeNotify;
import com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi;
import com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApiFactory;
import com.xiaomi.hm.health.bt.profile.nfc.NFCFeature;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusBalanceResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusConsumerListResponse;
import com.xiaomi.hm.health.bt.profile.observe.UpgradeCallback;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.HMLFProfile;
import com.xiaomi.hm.health.bt.profile.slre.ILFEventListener;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.HMSmartWatchSyncFirstbeatTask;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechEvent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechProfile;
import com.xiaomi.hm.health.bt.profile.speech.ISpeechListener;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.bt.profile.sport.SportItemDataConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportRemindConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportSupplementPanelApiFactory;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import com.xiaomi.hm.health.bt.profile.sport.coaching.HMCoachingState;
import com.xiaomi.hm.health.bt.profile.sport.coaching.HMCoachingWorkout;
import com.xiaomi.hm.health.bt.profile.user.HMUserProfile;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile;
import com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule;
import com.xiaomi.hm.health.bt.profile.usernew.WeightUnit;
import com.xiaomi.hm.health.bt.profile.weather.ExtensionInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMForecastWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeAqi;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMSunriseSunsetInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherProfile;
import com.xiaomi.hm.health.bt.profile.weather.HMWindAndHumidityInfo;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.IWeatherProfile;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherFactory;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes19.dex */
public class HMMiLiProDevice extends HMMiLiDevice implements ILFEventListener, ISpeechListener, MusicControllerApi, ITradeNotify, PhoneMuteApi {
    private static final String N = "HMMiLiProDevice";
    private NFCControllerApi D;
    private ISportSupplementPanelApi E;
    private HMCallback<HMLFEvent> F;
    private HMCallback<HMSpeechEvent> G;
    private HMSpeechProfile H;
    private DfuApi I;
    private NotificationApi J;
    private NotificationProtocolWrapper K;
    private HMPeytoSettings L;
    public HMProSensorDataController mSensorDataController;
    public MiLiProProfile miLiProProfile;
    public HMUserProfile userProfile;
    public final Object weatherSyncObj;
    private static final HashMap<String, HMDeviceSource> M = new a();
    private static final UUID O = GattUtils.uuid128(22);

    public class a extends HashMap<String, HMDeviceSource> {
        public a() {
            putAll(ProxyContainer.getProxy().getMiliProNames());
        }
    }

    public class b implements IHMDataCallback<List<HMPaiData>> {
        public final /* synthetic */ HMCallback a;

        public b(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<HMPaiData> data, HMDeviceError error) {
            this.a.onFinish(new ArrayList(data));
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            this.a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.onStart();
        }
    }

    public class c implements IHMDataCallback<List<Spo2Data>> {
        public final /* synthetic */ HMCallback a;

        public c(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<Spo2Data> data, HMDeviceError error) {
            this.a.onFinish(data);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            this.a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.onStart();
        }
    }

    public class d implements IHMRawDataCallback<List<Spo2Data>> {
        public final /* synthetic */ HMCallback a;

        public d(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<Spo2Data> data, HMDeviceError error) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            this.a.sendOnProgressMessage(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback
        public void onRawData(List<RawData> rawData) {
            this.a.sendOnFinishMessage(rawData);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.sendOnStartMessage();
        }
    }

    public class e implements IHMDataCallback<List<HMTemperatureData>> {
        public final /* synthetic */ HMCallback a;

        public e(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<HMTemperatureData> datas, HMDeviceError error) {
            this.a.sendOnDataMessage(new HMTemperatureInfo(new ArrayList(datas)));
            this.a.sendOnFinishMessage(error.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.sendOnStartMessage();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class f<T> implements IHMDataCallback<List<T>> {
        public final /* synthetic */ HMCallback a;

        public f(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<T> datas, HMDeviceError error) {
            this.a.sendOnDataMessage(datas);
            this.a.sendOnFinishMessage(error.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.sendOnStartMessage();
        }
    }

    public class g implements IHMDataCallback<List<HmHighLowHrData>> {
        public final /* synthetic */ HMCallback a;

        public g(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<HmHighLowHrData> data, HMDeviceError error) {
            this.a.onFinish(data);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            this.a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.onStart();
        }
    }

    public class h implements Function1<Boolean, Unit> {
        public final /* synthetic */ HMCallback a;

        public h(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean result) {
            this.a.onFinish(result);
            return null;
        }
    }

    public class i implements IHMDataCallback<List<ActivityData>> {
        public final /* synthetic */ HMCallback a;

        public i(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<ActivityData> data, HMDeviceError error) {
            this.a.sendOnDataMessage(data);
            this.a.sendOnFinishMessage(error.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.a.sendOnStartMessage();
        }
    }

    public HMMiLiProDevice(Context context, BluetoothDevice device) {
        super(context, device);
        this.miLiProProfile = null;
        this.mSensorDataController = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.userProfile = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.weatherSyncObj = new Object();
        this.L = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A4(HMCallback hMCallback, HMAlertModeExt hMAlertModeExt) {
        if (hMCallback == null) {
            alertSync(hMAlertModeExt);
        } else {
            hMCallback.sendOnStartMessage();
            hMCallback.sendOnFinishMessage(alertSync(hMAlertModeExt));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getTargetSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A6(boolean z) {
        return "set dial default color result: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A7(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setWatchFace(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B4(HMCallback hMCallback, short s, short s2, byte b2) {
        hMCallback.sendOnStartMessage();
        HMAlertController hMAlertController = this.alertController;
        hMCallback.sendOnFinishMessage(hMAlertController != null && hMAlertController.alert(s, s2, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        IUserInfoProfile iUserInfoProfileZ7 = Z7();
        UserInfoExt userInfo = iUserInfoProfileZ7 != null ? iUserInfoProfileZ7.getUserInfo(getMDeviceSource()) : null;
        hMCallback.sendOnDataMessage(userInfo);
        hMCallback.sendOnFinishMessage(userInfo != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B6(int i2, HMCallback hMCallback) {
        final boolean dialDefaultColorSync = setDialDefaultColorSync(i2);
        HMLog.info(N, new Function0() { // from class: x43
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMMiLiProDevice.A6(dialDefaultColorSync);
            }
        });
        if (hMCallback != null) {
            hMCallback.sendOnFinishMessage(dialDefaultColorSync);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B7(HMCallback hMCallback, LocationExt locationExt) {
        boolean zP8;
        hMCallback.sendOnStartMessage();
        DeviceInfo deviceInfo = getDeviceInfo();
        Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null || !deviceFeature.hasSw(19)) {
            IUserInfoProfile iUserInfoProfileZ7 = Z7();
            zP8 = iUserInfoProfileZ7 != null && iUserInfoProfileZ7.setLocation(locationExt);
        } else {
            zP8 = p8(locationExt);
        }
        hMCallback.sendOnFinishMessage(zP8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        DeviceInfo deviceInfo = this.miLiProProfile.getDeviceInfo();
        hMCallback.sendOnFinishMessage(deviceInfo != null ? this.miLiProProfile.setWeixinId(getWeixinId(null, deviceInfo.getDeviceID())) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getWatchFacesAllSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C6(HMCallback hMCallback, HMDisconnectRemindConfig hMDisconnectRemindConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setDisconnectRemind(hMDisconnectRemindConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C7(HMCallback hMCallback, Function0 function0) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setWeatherInfoSync(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D4(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(bindWeixin(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D5(HMCallback hMCallback, MiLiHwConfig miLiHwConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(initSync(miLiHwConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D6(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDisplayDataSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D7(HMCallback hMCallback, WeightUnit weightUnit) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setWeightUnitSync(weightUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E4(Exception exc) {
        return "checkNotificationApi exception: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int E5(PageItem pageItem, PageItem pageItem2) {
        return pageItem.getIndex() - pageItem2.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E6(HMCallback hMCallback, HMProDisplayItem hMProDisplayItem) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(g8(hMProDisplayItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E7(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setWorldClockSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F4(HMCallback hMCallback, IHMNFCStatusListener iHMNFCStatusListener) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(connectNfcSync(iHMNFCStatusListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F5(IFirmwareUpgradeCallback iFirmwareUpgradeCallback, int i2, long j, HMFirmwareType hMFirmwareType) {
        boolean zUpgrade;
        if (!isConnected()) {
            iFirmwareUpgradeCallback.onFwStop(false);
            return;
        }
        DfuApi dfuApi = getDfuApi();
        if (dfuApi == null) {
            iFirmwareUpgradeCallback.onFwStop(false);
            return;
        }
        dfuApi.initApi();
        DfuUpgradeApiImp dfuUpgradeApiImp = new DfuUpgradeApiImp();
        try {
            dfuApi.setRunning(true);
            zUpgrade = dfuUpgradeApiImp.upgrade(dfuApi, dfuApi.queryProtocolInfo(), i2, j, hMFirmwareType, iFirmwareUpgradeCallback);
        } catch (Exception e2) {
            Debug.fi(N, "invokeUpgrade exception: " + e2.toString());
            zUpgrade = false;
        }
        dfuApi.setRunning(false);
        dfuApi.deInit();
        c8(zUpgrade, hMFirmwareType);
        iFirmwareUpgradeCallback.onFwStop(zUpgrade);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F6(HMCallback hMCallback, DisplaySetting displaySetting) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDisplaySettingSync(displaySetting));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F7(HMCallback hMCallback, HMAlertMode hMAlertMode, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(showContactSync(hMAlertMode, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G4(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(deleteDialSync(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G5(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(isAlreadyPersonal(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G6(HMCallback hMCallback, HMDisplayType hMDisplayType) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDisplayTypeSync(hMDisplayType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G7(HMCallback hMCallback, SportCalibrateInfo sportCalibrateInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(sportCalibrateSync(sportCalibrateInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H4(ArrayList arrayList, HMCallback hMCallback) {
        boolean zDeleteDials = this.miLiProProfile.deleteDials(arrayList);
        Debug.fi(N, "deleteDials result: " + zDeleteDials);
        if (hMCallback != null) {
            hMCallback.sendOnFinishMessage(zDeleteDials);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        SettingsApi settingsApi = this.miLiProProfile.getSettingsApi();
        if (settingsApi == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(settingsApi.isHidConnect());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H6(HMCallback hMCallback, boolean z, long j) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDistanceTargetSync(z, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit H7(HMCallback hMCallback, Integer num) {
        Debug.fi(N, "open app module version: " + num);
        hMCallback.onFinish(num.intValue() > 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(disableBindSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        SettingsApi settingsApi = this.miLiProProfile.getSettingsApi();
        if (settingsApi == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(settingsApi.isHidDisable());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I6(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDistanceUnitSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I7(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        SettingsApi settingsApi = this.miLiProProfile.getSettingsApi();
        if (settingsApi == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(settingsApi.disableHid(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.isMultiLinkBond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J6(HMCallback hMCallback, CincoEntrance cincoEntrance) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setEntranceAvailabilitySync(cincoEntrance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J7(final Function1 function1) {
        final boolean zSupportHuamiOSWeather = supportHuamiOSWeather();
        runOnMainThread(new Runnable() { // from class: s43
            @Override // java.lang.Runnable
            public final void run() {
                HMMiLiProDevice.I7(function1, zSupportHuamiOSWeather);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(disconnectNfcSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K5(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(isSupportCity(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K6(HMCallback hMCallback, ExtensionInfo extensionInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setExtensionInfoSync(extensionInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K7(HMCallback hMCallback, boolean z) {
        if (callNonConnected(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.switchMenstruationDeviceNotifySync(z) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.enableConnectedAdv(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L5(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(nfcLoadService(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L6(HMCallback hMCallback, ArrayList arrayList) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(h8(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L7(HMCallback hMCallback, boolean z) {
        if (callNonConnected(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.switchSmartPredictSync(z) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.enableGoalRemind(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M5() {
        return "notify failed, The device is disconnected";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M6(int i2, HMCallback hMCallback) {
        Debug.fi(N, "setStepTarget to ProDevice--->" + i2);
        hMCallback.sendOnStartMessage();
        IUserInfoProfile iUserInfoProfileZ7 = Z7();
        hMCallback.sendOnFinishMessage(iUserInfoProfileZ7 != null && iUserInfoProfileZ7.setGoal(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M7(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(switchSpo2Sync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableHrBroadcastSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N5() {
        return "notify failed, NotificationApi is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N6(HMCallback hMCallback, byte b2, byte[] bArr, byte[] bArr2, byte b3) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setHeartRateZoneSync(b2, bArr, bArr2, b3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit N7(HMCallback hMCallback, Integer num) {
        Debug.fi(N, "writeActivityData response code: " + num);
        hMCallback.sendOnFinishMessage(num);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableHrSleepSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit O5(HMCallback hMCallback, Boolean bool) {
        hMCallback.onFinish(bool);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O6(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        SettingsApi settingsApi = this.miLiProProfile.getSettingsApi();
        if (settingsApi == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(settingsApi.setHidConnect(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O7(HMCallback hMCallback, HMCoachingWorkout hMCoachingWorkout, int i2, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setCoachingWorkout(hMCoachingWorkout, i2, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.enableLockScreen(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P5(final HMCallback hMCallback, NotificationInfo notificationInfo) {
        hMCallback.sendOnStartMessage();
        if (!isConnected()) {
            HMLog.info(N, new Function0() { // from class: z43
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.M5();
                }
            });
            hMCallback.onFinish(false);
            return;
        }
        NotificationApi notificationApi = this.J;
        if (notificationApi != null) {
            notificationApi.notify(notificationInfo, new Function1() { // from class: e53
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HMMiLiProDevice.O5(hMCallback, (Boolean) obj);
                }
            });
        } else {
            HMLog.info(N, new Function0() { // from class: d53
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.N5();
                }
            });
            hMCallback.onFinish(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P6(HMCallback hMCallback, HMHrReminder hMHrReminder) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setHrReminderSync(hMHrReminder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P7(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        HMAlertController hMAlertController = this.alertController;
        hMCallback.sendOnFinishMessage(hMAlertController != null && hMAlertController.pair());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableMessagePreviewSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q5() {
        RealtimeStep realtimeStepSync = getRealtimeStepSync();
        Debug.fi(N, "WAKE_UP step:" + realtimeStepSync);
        if (realtimeStepSync != null) {
            onStepChanged(realtimeStepSync);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q6(HMCallback hMCallback, HMLanguage hMLanguage) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setLanguageSync(hMLanguage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q7(HMCallback hMCallback, AuthInfo authInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(unbindSync(authInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.enableMultiLink(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(passwordInteraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R6(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(i8(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R7(HMCallback hMCallback, HMNFCCardType hMNFCCardType) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(updateEmptyCardList(hMNFCCardType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableOsaSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S5(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.phoneMute(z ? (byte) 1 : (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S6(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setLiftWristSensitivitySync(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit S7(HMFirmwareInfo hMFirmwareInfo, Boolean bool) {
        if (hMFirmwareInfo.getContinueUpgradeState() != HMFirmwareInfo.ContinueUpgradeState.CONTINUE || hMFirmwareInfo.getContinueModeExtraInfo().isLast() || !bool.booleanValue()) {
            c8(bool.booleanValue(), hMFirmwareInfo.getFwType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableSportHeartRateSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.phoneMute((byte) 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T6(HMCallback hMCallback, LiftWristTouch liftWristTouch) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(k8(liftWristTouch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T7(HMCallback hMCallback, HMNFCCardConfig hMNFCCardConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(updateNfcCardConfigSync(hMNFCCardConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableSwimLogSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(queryPwd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U6(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setLongPressKey(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U7(HMCallback hMCallback, List list, HMNFCCardType hMNFCCardType) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(updateNfcCardListSync(list, hMNFCCardType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V4(HMCallback hMCallback, HMLiftWristConfig hMLiftWristConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enableWristBrightSync(hMLiftWristConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.getCoachingState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V6(HMCallback hMCallback, boolean z, int i2) {
        if (callNonConnected(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.setMenstruationNotifySync(z, i2) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V7(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(updatePasswordInteraction(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.enableWristFlip(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(readSeFlagSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W6(HMCallback hMCallback, boolean z, int i2) {
        if (callNonConnected(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.setMenstruationOvulationSync(z, i2) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W7(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(verifyPwd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.findPhone((byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(readSpo2Sync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X6(HMCallback hMCallback, HMNegativeScreen hMNegativeScreen) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setNegativeScreen(hMNegativeScreen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X7(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(writeMasterSeFlagSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.findPhone((byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(readWristAndPinStateSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y6(HMCallback hMCallback, NowTimeConfig nowTimeConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setNowTimeConfig(nowTimeConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y7(HMCallback hMCallback, HMPaiData hMPaiData) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.writePaiData(hMPaiData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getAlarmsSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z5(HMCallback hMCallback) {
        Progress progress = new Progress();
        DfuApi dfuApi = getDfuApi();
        if (dfuApi == null) {
            hMCallback.sendOnFinishMessage(false);
            return;
        }
        dfuApi.initApi();
        while (true) {
            try {
                UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus = dfuApi.queryUpgradeStatus(true);
                if (upgradeStatueResponseQueryUpgradeStatus.getUpgradeStatus() != UpgradeStatus.IN_UPGRADING) {
                    break;
                }
                progress.total = upgradeStatueResponseQueryUpgradeStatus.getFirmwareSize();
                progress.progress = upgradeStatueResponseQueryUpgradeStatus.getFirmwareUpgradedSize();
                hMCallback.sendOnProgressMessage(progress);
                try {
                    Thread.sleep(5000L);
                } catch (Exception unused) {
                }
            } catch (Exception e2) {
                Debug.fi(N, "query: " + e2);
            }
        }
        Debug.fi(N, "升级成功，刷新下版本号");
        try {
            DeviceInfo deviceInfo = isConnected() ? this.mProfile.getDeviceInfo() : null;
            if (deviceInfo != null) {
                updateDeviceInfo(deviceInfo);
            }
        } catch (Exception e3) {
            Debug.fi(N, "registerUpgradeCallback refreshDeviceInfo: " + e3);
        }
        hMCallback.sendOnFinishMessage(true);
        dfuApi.deInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z6(HMCallback hMCallback, byte b2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setOtherCalendarSync(b2));
    }

    @Nullable
    private IUserInfoProfile Z7() {
        if (!isConnected()) {
            Debug.fi(N, "return userProfile for not connected.");
            return this.userProfile;
        }
        if (this.userProfile.getUserinfoCharacteristic() == null) {
            Debug.fi(N, "return UserInfoModule");
            return (IUserInfoProfile) getChannelModule(UserInfoModule.class);
        }
        Debug.fi(N, "return userProfile");
        return this.userProfile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a5(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getBalance(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a6(HMCallback hMCallback, int i2, long j) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.removeCoachingWorkout(i2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a7(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setPagesSync(list));
    }

    private boolean a8(HMFirmwareType type) {
        if (type == HMFirmwareType.FIRMWARE_BATCH) {
            return isConnected();
        }
        return type == HMFirmwareType.FIRMWARE_GPS || type == HMFirmwareType.FONT || type == HMFirmwareType.FONT_LATIN || type == HMFirmwareType.RESOURCE || type == HMFirmwareType.RESOURCE_COMPRESS || type == HMFirmwareType.RESOURCE_BASE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.getBlePairStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b6(int i2, int i3, int i4, HMCallback hMCallback) {
        int iReplaceDial = this.miLiProProfile.replaceDial(i2, i3, i4);
        Debug.fi(N, "replaceDial result: " + iReplaceDial);
        if (hMCallback != null) {
            hMCallback.sendOnFinishMessage(Integer.valueOf(iReplaceDial));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b7(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setPasswordInteraction());
    }

    private boolean b8(DeviceInfo deviceInfo, MiLiHwConfig config) {
        if (deviceInfo == null) {
            Debug.fi(N, "recover device info null");
            return false;
        }
        if (deviceInfo.isMiLiNfc()) {
            Debug.fi(N, "device not support hr~");
            return true;
        }
        boolean zRecoverHrSetting = getHeartHealthApi().recoverHrSetting(config.hrEnable, config.hrInterval, config.hrSleepEnable, config.atrialFibEnable, true);
        Boolean bool = config.sportHRCheckEnable;
        if (bool == null) {
            return zRecoverHrSetting;
        }
        boolean zEnableSportHeartRateSync = zRecoverHrSetting & enableSportHeartRateSync(bool.booleanValue());
        Debug.fi(N, "set sportHrCheckEnable: " + config.sportHRCheckEnable + ", ret: " + zEnableSportHeartRateSync);
        return zEnableSportHeartRateSync;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getCRSCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c6() {
        return "protocol version not support logo request";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c7(Function1 function1, MenstrualPeriodData[] menstrualPeriodDataArr) {
        if (!isConnected()) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
        if (menstruationModule != null) {
            function1.invoke(Boolean.valueOf(menstruationModule.setPeriodDataSync(menstrualPeriodDataArr)));
        } else {
            function1.invoke(Boolean.FALSE);
        }
    }

    private void c8(boolean ret, HMFirmwareType type) {
        if (ret && a8(type)) {
            updateDeviceInfo(this.mProfile.getDeviceInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d5(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getCardInfo(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d6(HMCallback hMCallback, LogoResponse logoResponse) {
        hMCallback.sendOnStartMessage();
        NotificationApi notificationApi = this.J;
        if (notificationApi instanceof NotificationApiV2) {
            ((NotificationApiV2) notificationApi).responseLogoRequest(logoResponse, new h(hMCallback));
        } else {
            HMLog.info(N, new Function0() { // from class: b53
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.c6();
                }
            });
            hMCallback.onFinish(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d7(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setPressureSwitchSync(z));
    }

    @Nullable
    private static HMDeviceSource d8(String deviceName) {
        HashMap<String, HMDeviceSource> regexMap;
        if (TextUtils.isEmpty(deviceName) || (regexMap = HMBleModule.getRegexMap()) == null) {
            return null;
        }
        for (Map.Entry<String, HMDeviceSource> entry : regexMap.entrySet()) {
            if (Pattern.matches(entry.getKey(), deviceName)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e5(HMCallback hMCallback, Calendar calendar) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(isConnected() ? this.miLiProProfile.getCollectData(calendar) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e6(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        HMChaohuTestInfo hMChaohuTestInfoSelfTest = this.miLiProProfile.selfTest();
        hMCallback.sendOnDataMessage(hMChaohuTestInfoSelfTest);
        hMCallback.sendOnFinishMessage(hMChaohuTestInfoSelfTest != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e7(HMCallback hMCallback, HMRealtimeAqi hMRealtimeAqi) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(l8(hMRealtimeAqi));
    }

    private boolean e8(List<AdReminder> reminders) {
        if (!isConnected()) {
            return false;
        }
        boolean adReminder = true;
        Iterator<AdReminder> it2 = reminders.iterator();
        while (it2.hasNext()) {
            adReminder &= this.miLiProProfile.setAdReminder(it2.next());
        }
        return adReminder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f5(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getConsumeList(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f6(HMCallback hMCallback, int i2, int i3, int i4) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(sendLocSync(i2, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f7(HMCallback hMCallback, HMRealtimeWeatherInfo hMRealtimeWeatherInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(m8(hMRealtimeWeatherInfo));
    }

    private boolean f8(String city) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean city2 = hMWeatherProfile.setCity(city);
            hMWeatherProfile.deInit();
            return city2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getCplc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g6(HMCallback hMCallback, HMMusicControl hMMusicControl) {
        hMCallback.sendOnStartMessage();
        MusicControllerApi musicControllerApiCreateMusicControllerApi = MusicControllerApiFactory.INSTANCE.createMusicControllerApi(this);
        if (musicControllerApiCreateMusicControllerApi == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(musicControllerApiCreateMusicControllerApi.sendMusicControl(hMMusicControl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g7(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setRecordStep(i2));
    }

    private boolean g8(HMProDisplayItem item) {
        return (this.d.getDeviceSource() != HMDeviceSource.MILI_PRO || this.d.getFirmwareVersion() >= 16777474) ? this.miLiProProfile.setDisplayItem(new HMProDisplayItemExt(item)) : this.miLiProProfile.setDisplayItem(item);
    }

    public static List<String> getSupportDeviceNames() {
        return new ArrayList(M.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnDataMessage(getDeviceStateSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h6(HMCallback hMCallback, ApduRequest apduRequest) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(sendNfcDataSync(apduRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h7(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setReminderSync(list));
    }

    private boolean h8(ArrayList<HMForecastWeatherInfo> infos) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean forecastWeathers = hMWeatherProfile.setForecastWeathers(infos);
            hMWeatherProfile.deInit();
            return forecastWeathers;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnDataMessage(getDfuStateSync());
        hMCallback.sendOnFinishMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i6(HMCallback hMCallback, HMSpeechInfo hMSpeechInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(sendSpeechInfoSync(hMSpeechInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i7(HMCallback hMCallback, HMSedentaryConfig hMSedentaryConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setSedentary(hMSedentaryConfig));
    }

    private boolean i8(String lang) {
        HMOtherVersion hMOtherVersionInitOtherVersion;
        if (!isConnected()) {
            return false;
        }
        boolean languageNew = this.miLiProProfile.setLanguageNew(lang);
        if (languageNew && (hMOtherVersionInitOtherVersion = this.miLiProProfile.initOtherVersion(this.d.getDeviceSource())) != null) {
            this.d.setOtherVersion(hMOtherVersionInitOtherVersion);
        }
        return languageNew;
    }

    public static boolean isSupportDeviceName(String deviceName) {
        return y4(deviceName) || M.get(deviceName) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnDataMessage(getDfuV5UpgradeStatusSync());
        hMCallback.sendOnFinishMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j6(HMCallback hMCallback, HMAccessInfo hMAccessInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setAccessInfoSync(hMAccessInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j7(HMCallback hMCallback, HMSilentConfig hMSilentConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setSilent(hMSilentConfig));
    }

    private boolean j8(HMLanguage language) {
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            Debug.fi(N, "setLanguageSyncByWatchSetting settingsModule null");
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsLanguageV1 settingsLanguageV1 = new SettingsLanguageV1();
        settingsLanguageV1.setGroupVersion(settingsModule.getVersionOrDefault());
        settingsLanguageV1.setLanguage(new EnumData(language.getLanguage()));
        map.put(SettingsGroupType.LANGUAGE, settingsLanguageV1);
        return settingsModule.writeSettingSync(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getDialIdsSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k6(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setActivityMode(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k7(HMCallback hMCallback, SportRemindConfig sportRemindConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setSportRemindConfigSync(sportRemindConfig));
    }

    private boolean k8(final LiftWristTouch liftWristTouch) {
        return isConnected() && this.miLiProProfile.setLiftWristTouch(liftWristTouch).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.getHeartRateData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l6(HMCallback hMCallback, boolean z, long j) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setActivityTarget(z, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l7(HMCallback hMCallback, StandAlertConfig standAlertConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setStandAlertConfig(standAlertConfig));
    }

    private boolean l8(HMRealtimeAqi info) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean realtimeAqi = hMWeatherProfile.setRealtimeAqi(info);
            hMWeatherProfile.deInit();
            return realtimeAqi;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getLNTCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m6(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(e8(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m7(HMCallback hMCallback, boolean z, long j) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setStandTarget(z, j));
    }

    private boolean m8(HMRealtimeWeatherInfo info) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean realtimeWeather = hMWeatherProfile.setRealtimeWeather(info);
            hMWeatherProfile.deInit();
            return realtimeWeather;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getLanguagesSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n6(HMCallback hMCallback, HMAidInfo hMAidInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setAidInfoSync(hMAidInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n7(HMCallback hMCallback, byte b2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setStartDayOfWeekSync(b2));
    }

    private boolean n8(final Touchscreen touchScreen) {
        return isConnected() && this.miLiProProfile.setTouchScreen(touchScreen).booleanValue();
    }

    public static HMDeviceSource nameToSource(String deviceName) {
        HMDeviceSource hMDeviceSourceD8 = d8(deviceName);
        return hMDeviceSourceD8 != null ? hMDeviceSourceD8 : M.get(deviceName);
    }

    private void o4() {
        try {
            if (this.J == null) {
                this.J = NotificationControllerFactory.INSTANCE.create(this.miLiProProfile);
            }
        } catch (Exception e2) {
            HMLog.info(N, new Function0() { // from class: u43
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.E4(e2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o5(HMCallback hMCallback) {
        if (!isConnected()) {
            hMCallback.sendOnFinishMessage((Object) null);
        } else {
            MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
            hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.syncSettingDataSync() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit o6(HMCallback hMCallback, Boolean bool) {
        hMCallback.onFinish(bool);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o7(HMCallback hMCallback, boolean z, long j) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setStepTargetSync(z, j));
    }

    private boolean o8(boolean enable, String password) {
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        ScreenLockAndPassword screenLockAndPassword = new ScreenLockAndPassword();
        screenLockAndPassword.setSwitch(Boolean.valueOf(enable));
        screenLockAndPassword.setPassword(new StringData(password));
        map.put(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD, screenLockAndPassword);
        return settingsModule.writeSettingSync(map);
    }

    private void p4() {
        DfuApi dfuApi = getDfuApi();
        if (dfuApi != null) {
            Debug.fi(N, "clear DfuApi");
            dfuApi.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getNfcCardInfoSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p6() {
        return "protocol version not support logo request";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p7(HMCallback hMCallback, HMSunriseSunsetInfo hMSunriseSunsetInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setSunriseSunsetSync(hMSunriseSunsetInfo));
    }

    private boolean p8(LocationExt location) {
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        WearingWayV1 wearingWayV1 = new WearingWayV1();
        wearingWayV1.setGroupVersion(settingsModule.getVersionOrDefault());
        if (!location.getWear().equals(LocationExt.Wear.WRIST) && !location.getWear().equals(LocationExt.Wear.CHEST)) {
            return false;
        }
        wearingWayV1.setWearingWay(new EnumData(location.getWay().getValue()));
        map.put(SettingsGroupType.WEARING, wearingWayV1);
        return settingsModule.writeSettingSync(map);
    }

    private HeartHealthApi q4() {
        DeviceInfo deviceInfo = getDeviceInfo();
        Feature deviceFeature = deviceInfo != null ? deviceInfo.getDeviceFeature() : new Feature();
        SettingsApi settingsApi = this.miLiProProfile.getSettingsApi();
        return settingsApi instanceof SettingsImpl ? new HuamiOsHeartHealthImpl(settingsApi) : new HeartHealthImpl(this.miLiProProfile.getEcfController(), getHeartRateController(), deviceFeature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getNfcTradeInfoSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q6(final HMCallback hMCallback, AppReplyResult appReplyResult) {
        hMCallback.sendOnStartMessage();
        NotificationApi notificationApi = this.J;
        if (notificationApi instanceof NotificationApiV2) {
            ((NotificationApiV2) notificationApi).setAppReplyResult(appReplyResult, new Function1() { // from class: f53
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HMMiLiProDevice.o6(hMCallback, (Boolean) obj);
                }
            });
        } else {
            HMLog.info(N, new Function0() { // from class: c53
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.p6();
                }
            });
            hMCallback.onFinish(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q7(HMCallback hMCallback, HMTarget hMTarget) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setTargetsSync(hMTarget));
    }

    private boolean q8(HMWindAndHumidityInfo info) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean windAndHumidity = hMWeatherProfile.setWindAndHumidity(info);
            hMWeatherProfile.deInit();
            return windAndHumidity;
        }
    }

    private boolean r4(HMLiftWristConfig config, Integer sensitivity) {
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        int i2 = 0;
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        DisplayAndBrightnessV1 displayAndBrightnessV1 = new DisplayAndBrightnessV1();
        displayAndBrightnessV1.setGroupVersion(settingsModule.getVersionOrDefault());
        if (config != null) {
            if (config.isAllDay()) {
                i2 = 2;
            } else if (config.isEnable()) {
                i2 = 1;
            }
            EnumData enumData = new EnumData(i2);
            Time time = new Time(config.getStartHour(), config.getStartMinutes());
            Time time2 = new Time(config.getStopHour(), config.getStopMinutes());
            displayAndBrightnessV1.setScreenOnByTurningWristMode(enumData);
            displayAndBrightnessV1.setScreenOnByTurningWristBeginTime(time);
            displayAndBrightnessV1.setScreenOnByTurningWristEndTime(time2);
        }
        if (sensitivity != null) {
            displayAndBrightnessV1.setScreenOnByTurningWristActiveSpeed(new EnumData(sensitivity.intValue()));
        }
        map.put(SettingsGroupType.DISPLAY, displayAndBrightnessV1);
        return settingsModule.writeSettingSync(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getOffWristLockStateSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r6(HMCallback hMCallback, HMAutoBacklightInfo hMAutoBacklightInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setAutoBacklightSync(hMAutoBacklightInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r7(HMCallback hMCallback, byte b2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setTempUnitSync(b2));
    }

    private void r8(DeviceDataRecover item) {
        item.recover(this);
    }

    private int s4(DeviceInfo deviceInfo) {
        boolean zC = HMDeviceFeature.c(deviceInfo);
        HMBaseProfile hMDfuProfile = zC ? new HMDfuProfile(this.miLiProProfile) : new HMFwUpgradeProfile(this.miLiProProfile);
        if (!hMDfuProfile.init()) {
            return 0;
        }
        int state = zC ? ((HMDfuProfile) hMDfuProfile).getState() : ((HMFwUpgradeProfile) hMDfuProfile).getState();
        hMDfuProfile.deInit();
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getPasswordSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s6(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setBeepsSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s7(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setTimeUnitSync(z));
    }

    private int t4() {
        DfuApi dfuApi = getDfuApi();
        if (dfuApi == null || !dfuApi.initApi()) {
            return 0;
        }
        try {
            return dfuApi.queryUpgradeStatus(false).getCode();
        } catch (Exception e2) {
            Debug.fi(N, "Query State failed:" + e2.toString());
            return 0;
        } finally {
            dfuApi.deInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        HMPeytoSettings hMPeytoSettingsU4 = u4();
        if (hMPeytoSettingsU4 != null) {
            this.L = hMPeytoSettingsU4;
        }
        hMCallback.sendOnDataMessage(hMPeytoSettingsU4);
        hMCallback.sendOnFinishMessage(hMPeytoSettingsU4 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t6(HMCallback hMCallback, byte b2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setBtPhoneDelaySync(b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t7(boolean z) {
        return "device not connect when set time unit: " + z;
    }

    private HMPeytoSettings u4() {
        try {
            return this.miLiProProfile.getDeviceSettingsNew();
        } catch (Exception e2) {
            Debug.i(N, "getPeytoSettingSync exception:" + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        Boolean pressureSwitchSync = getPressureSwitchSync();
        if (pressureSwitchSync != null) {
            hMCallback.sendOnDataMessage(pressureSwitchSync);
        }
        hMCallback.sendOnFinishMessage(pressureSwitchSync != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u6(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setButtonIgnore(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u7(boolean z, boolean z2) {
        return "set time unit: " + z + ", result: " + z2;
    }

    @Nullable
    private String v4() {
        BluetoothGattService service = this.miLiProProfile.getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null) {
            Debug.fi(N, "getProperties service null");
            return null;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(O);
        if (characteristic != null) {
            return GattUtils.parseProperties(characteristic.getProperties());
        }
        Debug.fi(N, "getProperties characteristic null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getRemindersSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v6(HMCallback hMCallback, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.setCalorieGoal(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v7(HMCallback hMCallback, Touchscreen touchscreen) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(n8(touchscreen));
    }

    private static void w4(HashMap<String, HMDeviceSource> supporDeviceSource) {
        M.putAll(supporDeviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getSkinIdSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w6(HMCallback hMCallback, boolean z, long j) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setCalorieTargetSync(z, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w7(HMCallback hMCallback, boolean z, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setUnwearPasswordSync(z, str));
    }

    private boolean x4() {
        String strV4 = v4();
        Debug.fi(N, "properties: " + strV4);
        if (strV4 == null || !strV4.contains("READ")) {
            return true;
        }
        BluetoothGattService service = this.miLiProProfile.getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null) {
            Debug.fi(N, "invokePair service null");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(O);
        if (characteristic != null) {
            return this.miLiProProfile.read(characteristic) != null;
        }
        Debug.fi(N, "invokePair characteristic null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ HMStatisticInfo x5() {
        return this.miLiProProfile.getStatisticInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x6(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(f8(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x7(HMCallback hMCallback, UserInfoExt userInfoExt) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setUserInfoSync(userInfoExt));
    }

    private static boolean y4(String deviceName) {
        HashMap<String, HMDeviceSource> regexMap;
        if (TextUtils.isEmpty(deviceName) || (regexMap = HMBleModule.getRegexMap()) == null) {
            return false;
        }
        Iterator<String> it2 = regexMap.keySet().iterator();
        while (it2.hasNext()) {
            if (Pattern.matches(it2.next(), deviceName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y5(HMCallback hMCallback, long j, long j2) {
        if (callNonConnected(hMCallback)) {
            return;
        }
        hMCallback.sendOnFinishMessage(this.miLiProProfile.getStorageState(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y6(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDateFormatSync(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y7(HMCallback hMCallback, HMVibrateInfo hMVibrateInfo) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setVibrateSync(hMVibrateInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.miLiProProfile.activateSignature());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z5(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(Integer.valueOf(getSwimLogSwitchSync()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z6() {
        return "setDeviceNotificationListener failed, NotificationApi is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z7(HMCallback hMCallback, HMVibrateInfo hMVibrateInfo) {
        hMCallback.sendOnStartMessage();
        hMVibrateInfo.test = true;
        boolean vibrateSync = setVibrateSync(hMVibrateInfo);
        hMVibrateInfo.test = false;
        Debug.fi(N, "testRet: " + vibrateSync);
        hMCallback.sendOnFinishMessage(setVibrateSync(hMVibrateInfo));
    }

    public void activateSignature(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: p33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z4(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void alert(final HMAlertModeExt mode, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: k83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A4(callback, mode);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean alertSync(final HMAlertModeExt mode) {
        HMDeviceSource deviceSource;
        if (!isConnected()) {
            Debug.fi(N, "alertSync return as no connection!!!");
            return false;
        }
        if (mode.getMode() == HMAlertMode.ALERT_FIND && supportModule(ObsoleteModule.class)) {
            ObsoleteModule obsoleteModule = (ObsoleteModule) getChannelModule(ObsoleteModule.class);
            if (obsoleteModule == null) {
                return false;
            }
            return obsoleteModule.getObsoleteApi().sendIASCommand(new byte[]{3});
        }
        DeviceInfo deviceInfo = getDeviceInfo();
        boolean z = deviceInfo != null && ((deviceSource = deviceInfo.getDeviceSource()) == HMDeviceSource.MILI_QINLING || deviceSource == HMDeviceSource.MILI_PRO || deviceSource == HMDeviceSource.MILI_NFC || deviceSource == HMDeviceSource.MILI_ROCKY || deviceSource == HMDeviceSource.MILI_PRO_I);
        if (mode.getMode() == HMAlertMode.ALERT_LOVE && !z) {
            mode = new HMAlertModeExt(HMAlertApp.CARE, mode.getTitle(), mode.getMessage());
        }
        boolean z2 = !z || deviceInfo.getFirmwareVersion() >= ProfileUtils.getVersionCodeFromVersionName("V1.0.1.63");
        HMAlertController hMAlertController = this.alertController;
        return hMAlertController != null && hMAlertController.alert(mode, z2, hasFeatureSw(26));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        if (!info.needAuth()) {
            return new AuthResult(0, NewProtocolSuccess.INSTANCE);
        }
        try {
            IDeviceAuthorization iDeviceAuthorizationCreateAuthorization = DeviceAuthorizationFactory.INSTANCE.createAuthorization(this.miLiProProfile, this);
            return iDeviceAuthorizationCreateAuthorization == null ? new AuthResult(4, AppAuthError.NO_AUTH_IMPL) : iDeviceAuthorizationCreateAuthorization.authorize(info, callback);
        } catch (Exception e2) {
            Debug.fi(N, "Auth exception:" + e2.toString());
            return new AuthResult(4, AppAuthError.AUTH_EXCEPTION);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void bindWeixin(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C4(callback);
            }
        });
    }

    public boolean changeCitySync() {
        if (isConnected()) {
            return this.miLiProProfile.changeCity();
        }
        return false;
    }

    public synchronized boolean configSportDataItem(SportItemDataConfig config) {
        return sendPiece(config.toCommand(), 10);
    }

    public synchronized boolean configSportTypeSort(SportTypeConfig sportTypes) {
        return sendPiece(sportTypes.toCommand(), 9);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void confirmFindPhone(@NotNull HMCallback<?> callback) {
        findPhoneConfirm(callback);
    }

    public void connectNfc(final HMCallback<HMNFCStatus> callback, final IHMNFCStatusListener listener) {
        runOnDeviceMultiThread(new Runnable() { // from class: y13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F4(callback, listener);
            }
        });
    }

    public HMNFCStatus connectNfcSync(IHMNFCStatusListener listener) {
        if (isConnected()) {
            return this.D.connect(listener);
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public <T> T createModule(Class<T> cls) {
        if (cls != HealthModule.class) {
            return (T) super.createModule(cls);
        }
        if (this.miLiProProfile == null) {
            return null;
        }
        return (T) new HealthModule(q4());
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        MiLiProProfile miLiProProfileNewProfile = newProfile(context, device);
        this.miLiProProfile = miLiProProfileNewProfile;
        this.mSensorDataController = newSensorDataController(miLiProProfileNewProfile);
        this.alertController = new HMAlertController(this.miLiProProfile);
        this.userProfile = new HMUserProfile(this.miLiProProfile);
        this.I = new NewDfuProfile(this.miLiProProfile);
        return this.miLiProProfile;
    }

    public void deleteDial(final int id, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: c73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G4(callback, id);
            }
        });
    }

    public boolean deleteDialSync(int id) {
        return isConnected() && this.miLiProProfile.deleteDial(id);
    }

    public void deleteDials(final ArrayList<Integer> dials, @Nullable final HMCallback<Boolean> callback) {
        if (callNonConnected(callback) || dials == null) {
            return;
        }
        runOnDeviceOnlyThread(new Runnable() { // from class: p43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H4(dials, callback);
            }
        });
    }

    public boolean deleteDialsSync(ArrayList<Integer> dials) {
        boolean zDeleteDials = this.miLiProProfile.deleteDials(dials);
        Debug.fi(N, "deleteDials result: " + zDeleteDials);
        return isConnected() && zDeleteDials;
    }

    public HMCardTSResponse<Boolean> deleteSwitchCardTimeSync(HMCardSwitchTime hmCardSwitchTime) {
        if (!isConnected() || hmCardSwitchTime == null) {
            return null;
        }
        return this.D.deleteSwitchTime(hmCardSwitchTime);
    }

    public void disableBind(final boolean disable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: n33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I4(callback, disable);
            }
        });
    }

    public boolean disableBindSync(boolean disable) {
        return isConnected() && this.miLiProProfile.disableBind(disable);
    }

    public void disableHid(final boolean disable, final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: m33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J4(callback, disable);
            }
        });
    }

    public void disconnectNfc(final HMCallback<HMNFCStatus> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: o63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K4(callback);
            }
        });
    }

    public HMNFCStatus disconnectNfcSync() {
        if (isConnected()) {
            return this.D.disconnect();
        }
        return null;
    }

    public void dump(HMDumpSettings settings, File file, IHMDataCallback<File> callback) {
        runOnDeviceOnlyThread(new HMDumpTask(this.miLiProProfile, settings, file, callback));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void enableConnectedAdv(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L4(callback, enable);
            }
        });
    }

    public void enableGoalRemind(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: v33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M4(callback, enable);
            }
        });
    }

    public void enableHrBroadcast(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: t33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N4(callback, enable);
            }
        });
    }

    public boolean enableHrBroadcastSync(boolean enable) {
        return isConnected() && this.miLiProProfile.enableHrBroadcast(enable);
    }

    public void enableHrSleep(final boolean enable, final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: i33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.O4(callback, enable);
            }
        });
    }

    public boolean enableHrSleepSync(boolean enable) {
        if (isConnected()) {
            return getHeartHealthApi().setSleepAssistantEnable(enable);
        }
        return false;
    }

    public void enableLockScreen(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: s33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P4(callback, enable);
            }
        });
    }

    public void enableMessagePreview(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: o33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q4(callback, enable);
            }
        });
    }

    public boolean enableMessagePreviewSync(boolean enable) {
        if (isConnected()) {
            return this.miLiProProfile.enableMessagePreview(enable);
        }
        return false;
    }

    public void enableMultiLink(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: x33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R4(callback, enable);
            }
        });
    }

    public void enableOsa(final boolean enable, final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: d33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S4(callback, enable);
            }
        });
    }

    public boolean enableOsaSync(boolean enable) {
        if (isConnected()) {
            return getHeartHealthApi().enableOsa(enable);
        }
        return false;
    }

    public void enableSportHeartRate(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: f33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T4(callback, enable);
            }
        });
    }

    public boolean enableSportHeartRateSync(boolean enable) {
        return isConnected() && this.miLiProProfile.enableSportHeartRate(enable);
    }

    public void enableSwimLog(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: l33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U4(callback, enable);
            }
        });
    }

    public boolean enableSwimLogSync(boolean enable) {
        return isConnected() && this.miLiProProfile.enableSwimLog(enable);
    }

    public void enableWristBright(final HMLiftWristConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: z73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.V4(callback, config);
            }
        });
    }

    public boolean enableWristBrightSync(HMLiftWristConfig config) {
        DeviceInfo deviceInfo = getDeviceInfo();
        Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature != null && deviceFeature.hasSw(19)) {
            return r4(config, null);
        }
        if (deviceInfo == null) {
            return false;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        return (deviceSource == HMDeviceSource.MILI_PRO || deviceSource == HMDeviceSource.MILI_NFC || deviceSource == HMDeviceSource.MILI_PRO_I || deviceSource == HMDeviceSource.MILI_QINLING || deviceSource == HMDeviceSource.MILI_ROCKY) ? this.miLiProProfile.enableWristBright(config.isEnable()) : this.miLiProProfile.enableWristBright(config);
    }

    public void enableWristFlip(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: q33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W4(callback, enable);
            }
        });
    }

    public void findPhoneConfirm(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: f63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X4(callback);
            }
        });
    }

    public void findPhoneStop(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: w83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y4(callback);
            }
        });
    }

    public void gdspSync(HMGDSPType type, Calendar calendar, final IHMDataCallback<HMGDSPData> callback) {
        if (isConnected() && getDeviceInfo() != null) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getSingletonTask(this.miLiProProfile, calendar, type, getMDeviceSource(), getGdspVersion(), callback));
        } else {
            callback.onStart();
            callback.onStop(null, new HMDeviceError(3));
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public AGpsDto getAGpsDto() {
        return new AGpsFeatureInit().getAGpsDto(this);
    }

    public void getAlarms(final HMCallback<ArrayList<AlarmClockExt>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: e63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z4(callback);
            }
        });
    }

    public ArrayList<AlarmClockExt> getAlarmsSync() {
        if (this.hmOSDelegate.supportModule(15)) {
            List<AlarmClockExt> alarms = this.hmOSDelegate.getAlarms();
            if (alarms != null) {
                return new ArrayList<>(alarms);
            }
            return null;
        }
        ArrayList<AlarmClockExt> alarms2 = isConnected() ? this.miLiProProfile.getAlarms() : null;
        Debug.fi(N, "getAlarmsSync: " + (alarms2 != null ? new JSONArray((Collection) alarms2).toString() : "null"));
        return alarms2;
    }

    public Boolean getAutoOtaAtNightSwitch() {
        if (isConnected()) {
            return this.miLiProProfile.getAutoOtaAtNightSwitch();
        }
        return null;
    }

    public BusBalanceResponse getBalance(byte[] data) {
        return this.D.getBalance(data);
    }

    public void getBlePairStatus(final HMCallback<BlePairStatus> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: l43
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b5(callback);
                }
            });
        } else {
            callback.onFinish((BlePairStatus) null);
        }
    }

    @Nullable
    public BlePairStatus getBlePairStatusSync() {
        if (isConnected()) {
            return this.miLiProProfile.getBlePairStatus();
        }
        return null;
    }

    public int getBtPhoneDelaySync() {
        IntData incomingCallDelayTime;
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule != null) {
            SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
            if (settingsModule.supportGroup(settingsGroupType)) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(General.KEY_INCOMING_CALL_DELAY_TIME));
                Settings settingsQueryFieldsSync = settingsModule.queryFieldsSync(false, settingsGroupType, arrayList);
                if ((settingsQueryFieldsSync instanceof General) && (incomingCallDelayTime = ((General) settingsQueryFieldsSync).getIncomingCallDelayTime()) != null) {
                    return incomingCallDelayTime.getValue();
                }
                return -1;
            }
        }
        Debug.fi(N, "not support getBtPhoneDelay");
        return -1;
    }

    public void getCRSCode(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: t53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c5(callback);
            }
        });
    }

    public BusCardInfoResponse getCardInfo(byte[] data) {
        return this.D.getCardInfo(data);
    }

    public void getCollectData(final Calendar time, final HMCallback<DataCollect> callback) {
        if (HMDeviceFeature.hasFeatureCollectData(getDeviceInfo())) {
            runOnDeviceOnlyThread(new Runnable() { // from class: p23
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e5(callback, time);
                }
            });
        } else {
            callback.onStart();
            callback.onFinish((DataCollect) null);
        }
    }

    public BusConsumerListResponse getConsumeList(byte[] data) {
        return this.D.getConsumeList(data);
    }

    public String getCplc() {
        return this.D.getCplc();
    }

    public void getDeviceState(final HMCallback<HMDeviceState> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: e33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h5(callback);
            }
        });
    }

    public HMDeviceState getDeviceStateSync() {
        if (isConnected()) {
            return new HMDeviceState(this.miLiProProfile.getDeviceState());
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public DfuApi getDfuApi() {
        String str;
        if (this.I == null) {
            str = "DfuApi is null";
        } else {
            str = "DfuApi:" + this.I.hashCode();
        }
        Debug.fi(N, str);
        return this.I;
    }

    public void getDfuState(final HMCallback<DfuState> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: a43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i5(callback);
            }
        });
    }

    public DfuState getDfuStateSync() {
        DeviceInfo deviceInfo;
        if (!isConnected() || (deviceInfo = getDeviceInfo()) == null) {
            return new DfuState();
        }
        return new DfuState(deviceInfo.getDeviceFeature().hasBase(3) ? t4() : s4(deviceInfo));
    }

    public void getDfuUpgradeStatus(final HMCallback<UpgradeStatus> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: r63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j5(callback);
            }
        });
    }

    public UpgradeStatus getDfuV5UpgradeStatusSync() {
        if (!isConnected()) {
            return UpgradeStatus.IDLE;
        }
        DfuApi dfuApi = getDfuApi();
        if (dfuApi == null) {
            return UpgradeStatus.IDLE;
        }
        if (!dfuApi.initApi()) {
            return UpgradeStatus.IDLE;
        }
        try {
            return dfuApi.queryUpgradeStatus(false).getUpgradeStatus();
        } catch (Exception e2) {
            Debug.fi(N, "getDfuV5UpgradeStatus: " + e2.toString());
            return UpgradeStatus.IDLE;
        } finally {
            dfuApi.deInit();
        }
    }

    public void getDialIds(final HMCallback<ArrayList<Integer>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: e73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k5(callback);
            }
        });
    }

    public ArrayList<Integer> getDialIdsSync() {
        if (isConnected()) {
            return this.miLiProProfile.getDialIds();
        }
        return null;
    }

    public void getHeartRateData(final HMCallback<HeartRateData> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: u53
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l5(callback);
                }
            });
        } else {
            callback.onStart();
            callback.onFinish((HeartRateData) null);
        }
    }

    @Nullable
    public HidStatus getHidStatus() {
        return this.miLiProProfile.getHidStatus();
    }

    public String getLNTCode() {
        return this.D.getLNTCode();
    }

    public void getLanguages(final HMCallback<ArrayList<HMLanguage>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: l83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n5(callback);
            }
        });
    }

    public ArrayList<HMLanguage> getLanguagesSync() {
        DeviceInfo deviceInfo;
        if (isConnected() && (deviceInfo = this.miLiProProfile.getDeviceInfo()) != null) {
            return new ArrayList<>(deviceInfo.getLanguageComBination().getLanguageList());
        }
        return null;
    }

    public Boolean getLockStatus() {
        if (isConnected()) {
            return this.miLiProProfile.getLockStatus();
        }
        return null;
    }

    public void getMenstruationConfig(final HMCallback<MenstruationConfig> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: a83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o5(callback);
            }
        });
    }

    public void getNfcCardInfo(final HMCallback<HMNFCCardInfo> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: l63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p5(callback);
            }
        });
    }

    public HMNFCCardInfo getNfcCardInfoSync() {
        if (isConnected()) {
            return this.D.getCardInfo();
        }
        return null;
    }

    public void getNfcTradeInfo(final HMCallback<ArrayList<HMNFCTradeInfo>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: t23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.q5(callback);
            }
        });
    }

    public ArrayList<HMNFCTradeInfo> getNfcTradeInfoSync() {
        if (isConnected()) {
            return this.D.getTradeInfo();
        }
        return null;
    }

    public NotificationApi getNotificationApi() {
        o4();
        return this.J;
    }

    public NotificationProtocolWrapper getNotificationWrapper() {
        if (this.K == null) {
            this.K = new NotificationProtocolWrapper(this.miLiProProfile);
        }
        return this.K;
    }

    public void getOffWristLockState(final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: s63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r5(callback);
            }
        });
    }

    public Boolean getOffWristLockStateSync() {
        if (isConnected()) {
            return this.miLiProProfile.getOffWristLockState();
        }
        return null;
    }

    public void getPassword(final HMCallback<PasswordInfo> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: g63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s5(callback);
            }
        });
    }

    public PasswordInfo getPasswordSync() {
        if (isConnected()) {
            return this.miLiProProfile.getPassword();
        }
        return null;
    }

    public HMPeytoSettings getPeytoSettings() {
        return this.L;
    }

    public void getPressureSwitch(final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: d63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u5(callback);
            }
        });
    }

    public Boolean getPressureSwitchSync() {
        if (!isConnected()) {
            Debug.fi(N, "read pressure enable fail by device not connect");
            return null;
        }
        if (this.d.getDeviceFeature().hasSw(3)) {
            return getHeartHealthApi().getPressureEnable();
        }
        Debug.fi(N, "device not support pressure");
        return null;
    }

    public BaseProfile getProfile() {
        return this.miLiProProfile;
    }

    public void getReminders(final HMCallback<ArrayList<HMReminderInfo>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: s53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v5(callback);
            }
        });
    }

    public ArrayList<HMReminderInfo> getRemindersSync() {
        if (!isConnected()) {
            return null;
        }
        if (!supportModule(EventReminderModule.class)) {
            return this.miLiProProfile.getReminders();
        }
        EventReminderModule eventReminderModule = (EventReminderModule) getChannelModule(EventReminderModule.class);
        if (eventReminderModule != null) {
            return eventReminderModule.queryEventItemsSync();
        }
        return null;
    }

    public void getSkinId(final HMCallback<Integer> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: k53
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.w5(callback);
                }
            });
        } else {
            callback.onStart();
            callback.onFinish((Integer) null);
        }
    }

    public Integer getSkinIdSync() {
        if (!isConnected()) {
            return null;
        }
        Feature feature = new Feature();
        if (this.d != null) {
            feature = this.d.getDeviceFeature();
        }
        return !(isTimexDevice() && feature.getVersion() == 0) ? this.miLiProProfile.getSkinId() : this.miLiProProfile.getSkinIdTimexVendor();
    }

    @Nullable
    @WorkerThread
    public SportItemDataConfig getSportItemDataConfig(int sportType) {
        if (isConnected()) {
            return this.miLiProProfile.getSportDataConfig(sportType);
        }
        return null;
    }

    @Nullable
    @WorkerThread
    public SportTypeConfig getSportTypeConfig() {
        HMGenericResponse sportTypeConfig;
        if (!isConnected() || (sportTypeConfig = this.miLiProProfile.getSportTypeConfig()) == null || !sportTypeConfig.isCommandSuccess()) {
            return null;
        }
        List<SportTypeItem> fromRawData = SportTypeConfig.INSTANCE.parseFromRawData(sportTypeConfig.commandResponseData());
        if (fromRawData.isEmpty()) {
            return null;
        }
        return new SportTypeConfig(fromRawData, getDeviceInfo().getDeviceFeature().hasSw(13), getDeviceInfo().getDeviceFeature().hasSw(14));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @WorkerThread
    public HMStatisticInfo getStatisticInfoInternal() {
        return StatisticsApiFactory.createStatisticsApi(this, new IOldStatisticsApiDelegate() { // from class: x13
            @Override // com.huami.bluetooth.profile.channel.module.statistics.ICompatStatisticsApi
            public final HMStatisticInfo getStatisticsInfo() {
                return this.a.x5();
            }
        }).getStatisticsInfo();
    }

    public void getStorageState(final long dialSize, final long dialId, final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: j73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y5(callback, dialSize, dialId);
            }
        });
    }

    public boolean getStorageStateSync(long dialSize, long dialId) {
        if (isConnected()) {
            return this.miLiProProfile.getStorageState(dialSize, dialId);
        }
        return false;
    }

    public void getSwimLogSwitch(final HMCallback<Integer> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: y53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z5(callback);
            }
        });
    }

    public int getSwimLogSwitchSync() {
        if (isConnected()) {
            return this.miLiProProfile.getSwimLogSwitch();
        }
        return -1;
    }

    public HMTarget getTargetSync() {
        if (isConnected()) {
            return this.miLiProProfile.getTargets();
        }
        return null;
    }

    public void getTargets(final HMCallback<HMTarget> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: p73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A5(callback);
            }
        });
    }

    public void getTemperatureInfo(final HMCallback<HMTemperatureInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(GdspFactory.INSTANCE.getTemperatureTask(this.miLiProProfile, Calendar.getInstance(), getGdspVersion(), new e(callback)));
    }

    public synchronized UpgradeStatueResponse getUpgradeStatusSync() {
        if (!isConnected()) {
            return null;
        }
        DfuApi dfuApi = getDfuApi();
        if (dfuApi == null) {
            return null;
        }
        dfuApi.initApi();
        try {
            try {
                UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus = dfuApi.queryUpgradeStatus(false);
                dfuApi.deInit();
                return upgradeStatueResponseQueryUpgradeStatus;
            } catch (Exception e2) {
                Debug.fi(N, "getUpgradeStatusSync: " + e2);
                dfuApi.deInit();
                return null;
            }
        } catch (Throwable th) {
            dfuApi.deInit();
            throw th;
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void getUserInfo(final HMCallback<UserInfoExt> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: n63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B5(callback);
            }
        });
    }

    public void getWatchFacesAll(final HMCallback<List<Integer>> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: p53
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.C5(callback);
                }
            });
        } else {
            callback.sendOnStartMessage();
            callback.sendOnFinishMessage((List<Integer>) null);
        }
    }

    public List<Integer> getWatchFacesAllSync() {
        return isConnected() ? this.miLiProProfile.getWatchFacesAll() : new ArrayList();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void init(final MiLiHwConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(new Runnable() { // from class: r83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D5(callback, config);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void initChannel(boolean initCharacteristicsResult) {
        if (x4()) {
            super.initChannel(initCharacteristicsResult);
        } else {
            Q(Status.INIT_FAILED);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean initSync(final MiLiHwConfig config) {
        boolean targetsSync;
        WorldClockModule worldClockModule;
        DeviceInfo deviceInfo = getDeviceInfo();
        Feature deviceFeature = deviceInfo != null ? deviceInfo.getDeviceFeature() : new Feature();
        WeightUnit weightUnit = config.weightUnit;
        if (weightUnit != null) {
            Debug.fi(N, "setWeightGoal: " + setWeightUnitSync(weightUnit));
        }
        boolean z = false;
        if (isHuamiOs() || deviceFeature.hasSw(9)) {
            targetsSync = setTargetsSync(new HMTarget(config.goalRemind, Long.valueOf(config.goals), Long.valueOf(config.calorieGoal.intValue()), Long.valueOf(config.weightGoal.intValue()), Long.valueOf(config.sleepGoal.intValue()), Long.valueOf(config.standTarget), Long.valueOf(config.activityTarget)));
            Debug.fi(N, "init setTargetsSync: goalRemind: " + config.goalRemind + ", step: " + config.goals + ", calorie: " + config.calorieGoal + ", weight: " + config.weightGoal + ", sleep: " + config.sleepGoal + ", stand: " + config.standTarget + ", activity: " + config.activityTarget + ", ret: " + targetsSync);
        } else {
            List<ActivityGoal> list = config.activityGoals;
            if (list == null) {
                IUserInfoProfile iUserInfoProfileZ7 = Z7();
                Debug.fi(N, "setGoal goals=" + config.goals + ",ret=" + (iUserInfoProfileZ7 != null && iUserInfoProfileZ7.setGoal(config.goals)));
                targetsSync = this.miLiProProfile.enableGoalRemind(config.goalRemind);
                Debug.fi(N, "goalRemind:" + config.goalRemind + ",ret:" + targetsSync);
            } else {
                targetsSync = setActivityGoal(list);
                Debug.fi(N, "setActivityGoal ret: " + targetsSync);
            }
        }
        CincoEntrance cincoEntrance = config.cincoEntrance;
        if (cincoEntrance != null) {
            targetsSync = setEntranceAvailabilitySync(cincoEntrance);
            Debug.fi(N, "set entrance: " + targetsSync);
        }
        if (!isTimexDevice()) {
            targetsSync = setAlarmSync(config.alarms);
            Debug.fi(N, "setAlarms ret=" + targetsSync);
        }
        Debug.fi(N, "recoverHrDetectSetting: " + (targetsSync & b8(deviceInfo, config)));
        boolean zEnableConnectedAdv = (deviceInfo == null || !deviceInfo.isMiLiDTH() || deviceInfo.getFirmwareVersion() >= ProfileUtils.getVersionCodeFromVersionName("V4.0.0.20")) ? this.miLiProProfile.enableConnectedAdv(config.enableConnectedBtAdv) : this.miLiProProfile.enableConnectedAdv(false);
        Debug.fi(N, "enableConnectedBroadcast enableAdv=" + config.enableConnectedBtAdv + ",ret=" + zEnableConnectedAdv);
        if (!this.miLiProProfile.isSupportWeixin()) {
            Debug.fi(N, "NOT SUPPORT WEIXIN!!!");
        } else if (deviceInfo != null) {
            zEnableConnectedAdv = this.miLiProProfile.setWeixinId(getWeixinId(null, deviceInfo.getDeviceID()));
            Debug.fi(N, "setWeixinId ret=" + zEnableConnectedAdv);
        } else {
            Debug.fi(N, "setWeixinId failed as device info is null!!!");
        }
        if (config.userInfoExt != null) {
            IUserInfoProfile iUserInfoProfileZ8 = Z7();
            if (iUserInfoProfileZ8 != null && iUserInfoProfileZ8.setUserInfo(config.userInfoExt)) {
                z = true;
            }
            zEnableConnectedAdv = z;
        }
        Debug.fi(N, "userInfoExt:" + config.userInfoExt + ",ret:" + zEnableConnectedAdv);
        HMProDisplayItem hMProDisplayItem = config.displayItem;
        if (hMProDisplayItem != null) {
            zEnableConnectedAdv = g8(hMProDisplayItem);
        }
        Debug.fi(N, "displayItem:" + config.displayItem + ",ret:" + zEnableConnectedAdv);
        HMSedentaryConfig hMSedentaryConfig = config.sedentaryConfig;
        if (hMSedentaryConfig != null) {
            zEnableConnectedAdv = this.miLiProProfile.setSedentary(hMSedentaryConfig);
        }
        Debug.fi(N, "sedentaryConfig:" + config.sedentaryConfig + ",ret:" + zEnableConnectedAdv);
        StandAlertConfig standAlertConfig = config.standAlertConfig;
        if (standAlertConfig != null) {
            zEnableConnectedAdv = this.miLiProProfile.setStandAlertConfig(standAlertConfig);
        }
        Debug.fi(N, "standAlertConfig: " + config.standAlertConfig + ", ret:" + zEnableConnectedAdv);
        HMSilentConfig hMSilentConfig = config.silentConfig;
        if (hMSilentConfig != null) {
            zEnableConnectedAdv = this.miLiProProfile.setSilent(hMSilentConfig);
        }
        Debug.fi(N, "silentConfig:" + config.silentConfig + ",ret:" + zEnableConnectedAdv);
        Debug.fi(N, "isMetric:" + config.isMetric + ",ret:" + this.miLiProProfile.setMileageUnit(config.isMetric));
        Debug.fi(N, "is12Hour:" + config.is12Hour + ",ret:" + setTimeUnitSync(config.is12Hour));
        Debug.fi(N, "displayType:" + config.displayType + ",ret:" + this.miLiProProfile.setDisplayType(config.displayType.getType()));
        Debug.fi(N, "showSms:" + config.showSms + ",ret:" + this.miLiProProfile.showContact(HMAlertMode.ALERT_SMS, config.showSms));
        boolean zShowContact = this.miLiProProfile.showContact(HMAlertMode.ALERT_INCALL, config.showIncall);
        Debug.fi(N, "showIncall:" + config.showIncall + ",ret:" + zShowContact);
        HMLiftWristConfig hMLiftWristConfig = config.liftWristConfig;
        if (hMLiftWristConfig != null) {
            zShowContact = enableWristBrightSync(hMLiftWristConfig);
        }
        Debug.fi(N, "gesScreen:" + config.liftWristConfig + ",ret:" + zShowContact);
        Integer num = config.liftWristSensitivity;
        if (num != null) {
            Debug.fi(N, "set listWristSensitivity: " + config.liftWristSensitivity + ", ret: " + setLiftWristSensitivitySync(num.intValue()));
        }
        Debug.fi(N, "recordStep:" + config.recordStep + ",ret:" + this.miLiProProfile.setRecordStep(config.recordStep));
        boolean zEnableWristFlip = this.miLiProProfile.enableWristFlip(config.filpWrist);
        Debug.fi(N, "filpWrist:" + config.filpWrist + ",ret:" + zEnableWristFlip);
        DisplaySetting displaySetting = config.displaySetting;
        if (displaySetting != null) {
            zEnableWristFlip = setDisplaySettingSync(displaySetting);
            Debug.fi(N, "displaySetting:" + config.displaySetting + ",ret:" + zEnableWristFlip);
        }
        List<PageItem> list2 = config.appSortInfo;
        if (list2 != null) {
            Collections.sort(list2, new Comparator() { // from class: t43
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return HMMiLiProDevice.E5((PageItem) obj, (PageItem) obj2);
                }
            });
            zEnableWristFlip = setPagesSync(config.appSortInfo);
            Debug.fi(N, "appSortInfo: " + config.appSortInfo + ", ret: " + zEnableWristFlip);
        }
        HMDisconnectRemindConfig hMDisconnectRemindConfig = config.disconnectRemindConfig;
        if (hMDisconnectRemindConfig != null) {
            zEnableWristFlip = this.miLiProProfile.setDisconnectRemind(hMDisconnectRemindConfig);
            Debug.fi(N, "setDisconnectRemind:" + config.disconnectRemindConfig + ",ret:" + zEnableWristFlip);
        }
        HMNegativeScreen hMNegativeScreen = config.negativeScreen;
        if (hMNegativeScreen != null) {
            zEnableWristFlip = this.miLiProProfile.setNegativeScreen(hMNegativeScreen);
            Debug.fi(N, "setNegativeScreen:" + config.negativeScreen + ",ret:" + zEnableWristFlip);
        }
        List<HMReminderInfo> list3 = config.reminderInfos;
        if (list3 != null && list3.size() > 0) {
            zEnableWristFlip = setReminderSync(config.reminderInfos);
            Debug.fi(N, "setReminderSync:" + config.reminderInfos.size() + ",ret:" + zEnableWristFlip);
        }
        Boolean bool = config.enableLockScreen;
        if (bool != null) {
            zEnableWristFlip = this.miLiProProfile.enableLockScreen(bool.booleanValue());
            Debug.fi(N, "enableLockScreen:" + config.enableLockScreen + ",ret:" + zEnableWristFlip);
        }
        if (!TextUtils.isEmpty(config.dateFormat)) {
            zEnableWristFlip = setDateFormatSync(config.dateFormat);
            Debug.fi(N, "setDateFormatSync:" + config.dateFormat + ",ret:" + zEnableWristFlip);
        }
        List<HMDisplayData> list4 = config.displayDataList;
        if (list4 != null && list4.size() > 0) {
            zEnableWristFlip = setDisplayDataSync(config.displayDataList);
            Debug.fi(N, "setDisplayDataSync:" + config.displayDataList.size() + ",ret:" + zEnableWristFlip);
        }
        List<PageItem> list5 = config.displayPageDataList;
        if (list5 != null && !list5.isEmpty()) {
            zEnableWristFlip = setPagesSync(config.displayPageDataList);
            Debug.fi(N, "setDisplayDataSync:" + config.displayPageDataList.size() + ",ret:" + zEnableWristFlip);
        }
        if (config.getHrReminder() != null) {
            zEnableWristFlip = setHrReminderSync(config.getHrReminder());
        }
        Boolean bool2 = config.messagePreview;
        if (bool2 != null) {
            zEnableWristFlip = enableMessagePreviewSync(bool2.booleanValue());
        }
        HMAutoBacklightInfo hMAutoBacklightInfo = config.backNightInfo;
        if (hMAutoBacklightInfo != null) {
            zEnableWristFlip = setAutoBacklightSync(hMAutoBacklightInfo);
        }
        Boolean bool3 = config.sportHrBroadcast;
        if (bool3 != null) {
            zEnableWristFlip = enableHrBroadcastSync(bool3.booleanValue());
        }
        Boolean bool4 = config.avoidSpiteBinding;
        if (bool4 != null) {
            zEnableWristFlip = disableBindSync(bool4.booleanValue());
        }
        HMOffWistLockConfig hMOffWistLockConfig = config.offWistLockConfig;
        if (hMOffWistLockConfig != null) {
            zEnableWristFlip = setUnwearPasswordSync(hMOffWistLockConfig.getEnable(), config.offWistLockConfig.getPassword());
            Debug.fi(N, "setUnwearPasswordSync:" + zEnableWristFlip);
        }
        Boolean bool5 = config.enableMultiLink;
        if (bool5 != null) {
            zEnableWristFlip = this.miLiProProfile.enableMultiLink(bool5.booleanValue());
            Debug.fi(N, "enableMultiLink:" + zEnableWristFlip);
        }
        List<HMVibrateInfo> list6 = config.vibrateInfos;
        if (list6 != null && list6.size() > 0) {
            for (HMVibrateInfo hMVibrateInfo : config.vibrateInfos) {
                boolean vibrateSync = setVibrateSync(hMVibrateInfo);
                Debug.fi(N, "setVibrate, id: " + ((int) hMVibrateInfo.id) + ", ret: " + vibrateSync);
                zEnableWristFlip = vibrateSync;
            }
        }
        Byte b2 = config.calendar;
        if (b2 != null) {
            zEnableWristFlip = setOtherCalendarSync(b2.byteValue());
            Debug.fi(N, "set calendar: " + zEnableWristFlip);
        }
        Byte b3 = config.startDayOfWeek;
        if (b3 != null) {
            zEnableWristFlip = setStartDayOfWeekSync(b3.byteValue());
            Debug.fi(N, "set startDayOfWeek: " + zEnableWristFlip);
        }
        if (deviceFeature.hasSw(1) && (worldClockModule = (WorldClockModule) getChannelModule(WorldClockModule.class)) != null) {
            List<? extends WorldTime> arrayList = config.worldTimes;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            zEnableWristFlip = worldClockModule.setWorldClockSync(arrayList);
            Debug.fi(N, "set worldClock: " + zEnableWristFlip);
        }
        HRZone hRZone = config.hrZone;
        if (hRZone != null) {
            zEnableWristFlip = setHRZone(hRZone);
            Debug.fi(N, "HRZone:" + config.hrZone);
        }
        Touchscreen touchscreen = config.touchscreen;
        if (touchscreen != null) {
            zEnableWristFlip = n8(touchscreen);
            Debug.fi(N, "Touchscreen:" + config.touchscreen);
        }
        LiftWristTouch liftWristTouch = config.liftWristTouch;
        if (liftWristTouch != null) {
            zEnableWristFlip = k8(liftWristTouch);
            Debug.fi(N, "LiftWristTouch:" + config.liftWristTouch);
        }
        List<BeepItem> list7 = config.beepItems;
        if (list7 != null && list7.size() > 0) {
            zEnableWristFlip = setBeepsSync(config.beepItems);
            Debug.fi(N, "set Beeps:" + zEnableWristFlip);
        }
        NowTimeConfig nowTimeConfig = config.nowTimeConfig;
        if (nowTimeConfig != null) {
            zEnableWristFlip = setNowTimeConfig(nowTimeConfig);
            Debug.fi(N, "set now Time:" + zEnableWristFlip);
        }
        Iterator<DeviceDataRecover> it2 = config.getSyncMapFactory().iterator();
        while (it2.hasNext()) {
            r8(it2.next());
        }
        return zEnableWristFlip;
    }

    public void invokeUpgrade(final long crc32, final int totalSize, final HMFirmwareType firmwareType, final IFirmwareUpgradeCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: o43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F5(callback, totalSize, crc32, firmwareType);
            }
        });
    }

    public boolean isAlreadyPersonal(byte[] data) {
        return this.D.isAlreadyPersonal(data);
    }

    public boolean isContactShow(final HMAlertMode mode) {
        if (isConnected()) {
            return this.miLiProProfile.isContactShow(mode);
        }
        return false;
    }

    public void isHidConnect(final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: r53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H5(callback);
            }
        });
    }

    public void isHidDisable(final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: h63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I5(callback);
            }
        });
    }

    public void isMultiLinkBond(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: b63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J5(callback);
            }
        });
    }

    public boolean isSupportCardTimeSwitchSync() {
        if (isConnected()) {
            return this.D.isSupportCardTimeSwitch();
        }
        return false;
    }

    public boolean isSupportCity(byte[] data) {
        return this.D.isSupportCity(data);
    }

    public boolean listenDeviceOpenAppPage(Function1<AppPageType, Pair<Boolean, AppPageType>> listener) {
        if (!supportModule(29)) {
            Debug.fi(N, "not support open app page module");
            return false;
        }
        OpenAppModule openAppModule = (OpenAppModule) getChannelModule(OpenAppModule.class);
        if (openAppModule == null) {
            Debug.fi(N, "get open app page module fail");
        } else {
            openAppModule.listenOpenAppPage(listener);
        }
        return openAppModule != null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public synchronized HMHeartRateController newHeartRateController() {
        if (hasFeatureSw(34)) {
            return new HmNewHeartRateController(this.miLiProProfile, this);
        }
        return new HMHeartRateController(this.miLiProProfile, this);
    }

    public MiLiProProfile newProfile(Context context, BluetoothDevice device) {
        MiLiProProfile miLiProProfile = new MiLiProProfile(context, device, this);
        miLiProProfile.setDeviceAndBleBridge(this);
        return miLiProProfile;
    }

    public HMProSensorDataController newSensorDataController(@NonNull MiLiProProfile profile) {
        return new HMProSensorDataController(profile, this);
    }

    public void nfcLoadService(final byte[] data, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: j43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L5(callback, data);
            }
        });
    }

    public void notify(final NotificationInfo info, final HMCallback<Boolean> callback) {
        o4();
        runOnDeviceMultiThread(new Runnable() { // from class: m83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P5(callback, info);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        ConnectModule connectModule;
        p4();
        DeviceInfo deviceInfo = getDeviceInfo();
        NFCControllerApi nFCControllerApiCreateApi = NFCControllerApiFactory.INSTANCE.createApi(this.miLiProProfile);
        this.D = nFCControllerApiCreateApi;
        if (nFCControllerApiCreateApi != null) {
            nFCControllerApiCreateApi.registerTradeNotify(this);
        }
        this.E = SportSupplementPanelApiFactory.INSTANCE.create(this.miLiProProfile, this);
        if (deviceInfo != null) {
            if (HMDeviceFeature.hasFeatureAlarmSync(deviceInfo.getDeviceSource())) {
                this.L = u4();
                Debug.fi(N, "settings:" + this.L);
            }
            if (HMLFProfile.isSupport(this.miLiProProfile)) {
                HMLFProfile hMLFProfile = new HMLFProfile(this.miLiProProfile, getDeviceType());
                hMLFProfile.setListener(this);
                hMLFProfile.init();
            }
            if (HMSpeechProfile.isSupport(this.miLiProProfile)) {
                HMSpeechProfile hMSpeechProfile = new HMSpeechProfile(this.miLiProProfile);
                this.H = hMSpeechProfile;
                hMSpeechProfile.setListener(this);
                this.H.init();
            }
            HMAlertController hMAlertController = this.alertController;
            if (hMAlertController != null) {
                hMAlertController.updateVersion();
            }
            if (supportModule(ConnectModule.class) && (connectModule = (ConnectModule) getChannelModule(ConnectModule.class)) != null) {
                connectModule.registerEventListener(getDeviceType(), this);
            }
            this.J = NotificationControllerFactory.INSTANCE.create(this.miLiProProfile);
            this.K = new NotificationProtocolWrapper(this.miLiProProfile);
        }
        super.onDeviceConnected();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnecting() {
        ISportSupplementPanelApi iSportSupplementPanelApi = this.E;
        if (iSportSupplementPanelApi != null) {
            iSportSupplementPanelApi.release();
        }
        HMAlertController hMAlertController = this.alertController;
        if (hMAlertController != null) {
            hMAlertController.resetVersion();
        }
        super.onDeviceConnecting();
    }

    @Override // com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
    public void onLFEvent(HMLFEvent event) {
        Debug.fi(N, "HMLFEvent:" + event);
        HMCallback<HMLFEvent> hMCallback = this.F;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(event);
        }
        if (event.getLfType() == LfType.WAKE_UP) {
            runOnDeviceMultiThread(new Runnable() { // from class: m53
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.Q5();
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.speech.ISpeechListener
    public void onSpeechEvent(HMSpeechEvent event) {
        HMCallback<HMSpeechEvent> hMCallback = this.G;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(event);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.ITradeNotify
    public void onTrade(int count) {
        Debug.fi(N, "On trade:" + count);
        if (this.F != null) {
            this.F.sendOnDataMessage(new HMLFEvent(HMDeviceType.MILI, LfType.NFC_TRADE));
        }
    }

    public void passwordInteraction(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: z53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R5(callback);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void phoneMute(final boolean isMute, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: r33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S5(callback, isMute);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void phoneMutePermissionMiss(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: o53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T5(callback);
            }
        });
    }

    public boolean queryPwd() {
        return isConnected() && this.D.queryPwd();
    }

    public HMCardTSResponse<List<HMCardSwitchTime>> querySwitchCardTimeSync(String aid, int cardType) {
        if (!isConnected() || TextUtils.isEmpty(aid)) {
            return null;
        }
        return this.D.querySwitchTimes(aid, cardType);
    }

    public void readCoachingStorageStateWorkout(final HMCallback<HMCoachingState> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: m63
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.V5(callback);
                }
            });
        } else {
            callback.sendOnFinishMessage((HMCoachingState) null);
        }
    }

    public void readMasterSeFlag(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: p63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W5(callback);
            }
        });
    }

    public boolean readSeFlagSync() {
        return isConnected() && this.D.readSeFlag();
    }

    public void readSpo2(final HMCallback<Object> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: q53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X5(callback);
            }
        });
    }

    public Object readSpo2Sync() {
        if (isConnected()) {
            return this.miLiProProfile.readSpo2();
        }
        return null;
    }

    public void readWristAndPinState(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: i23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y5(callback);
            }
        });
    }

    public boolean readWristAndPinStateSync() {
        return isConnected() && this.D.readWristAndPinState();
    }

    @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi
    public void registerControllerListener(@NotNull MusicControllerCallback listener) {
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void registerPhoneMuteListener(@NonNull PhoneMuteListener listener) {
    }

    public void registerUpgradeCallback(final HMCallback<Integer> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: h53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z5(callback);
            }
        });
    }

    public void removeCoachingWorkout(final int workoutIndex, final long workoutId, final HMCallback callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: i73
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a6(callback, workoutIndex, workoutId);
                }
            });
        } else {
            callback.sendOnFinishMessage(false);
        }
    }

    public boolean replaceDial(int src, int dest, int destSize) {
        int iReplaceDial = this.miLiProProfile.replaceDial(src, dest, destSize);
        Debug.fi(N, "replaceDial result: " + iReplaceDial);
        return isConnected() && iReplaceDial == DialModule.DiaResultCode.SUCCESS.getValue();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return isConnected() && this.miLiProProfile.reset();
    }

    public void responseLogoRequest(final LogoResponse response, final HMCallback<Boolean> callback) {
        o4();
        runOnDeviceMultiThread(new Runnable() { // from class: l73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d6(callback, response);
            }
        });
    }

    public void selfTest(final HMCallback<HMChaohuTestInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: v53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e6(callback);
            }
        });
    }

    public void sendLoc(final int longitude, final int latitude, final int altitude, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: h73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f6(callback, longitude, latitude, altitude);
            }
        });
    }

    public GpsInjectResponse sendLocSync(int longitude, int latitude, int altitude) {
        if (!isConnected()) {
            return null;
        }
        if (supportModule(VirtualSensorModule.class)) {
            VirtualSensorApi virtualSensorApiCreate = VirtualSensorApiFactory.INSTANCE.create(this);
            if (virtualSensorApiCreate == null) {
                return null;
            }
            return new GpsInjectResponse(virtualSensorApiCreate.syncSensorData(SensorData.INSTANCE.buildGpsSensorData(System.currentTimeMillis(), latitude, longitude, Integer.valueOf(altitude), null)), Integer.valueOf(HMNotifyResponse.ResponseCode.RESERVED.getValue() & 255));
        }
        HMNotifyResponse hMNotifyResponseSendLocWithResponse = this.miLiProProfile.sendLocWithResponse(longitude, latitude, altitude);
        if (hMNotifyResponseSendLocWithResponse == null) {
            return null;
        }
        return new GpsInjectResponse(hMNotifyResponseSendLocWithResponse.isSuccess(), Integer.valueOf(hMNotifyResponseSendLocWithResponse.getCode() & 255));
    }

    @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi
    public boolean sendMusicControl(@NotNull HMMusicControl control) {
        return new HMAMCProfile(this.miLiProProfile).sendMusicControl(control);
    }

    public void sendNfcData(final ApduRequest request, final HMCallback<ApduResponse> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: t83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h6(callback, request);
            }
        });
    }

    public ApduResponse sendNfcDataSync(ApduRequest request) {
        if (isConnected()) {
            return request.getType() == HMNFCCardType.MASTERCARD ? this.D.sendMasterCardData(request.getData(), request.getDataLen()) : this.D.sendData(request.getData(), request.getDataLen(), request.isEncrypt());
        }
        return null;
    }

    public synchronized boolean sendPiece(byte[] cmd, int type) {
        Debug.fi(N, "send piece data");
        return this.miLiProProfile.patchWrite(cmd, type);
    }

    public void sendSpeechInfo(final HMSpeechInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: z13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i6(callback, info);
            }
        });
    }

    public boolean sendSpeechInfoSync(HMSpeechInfo info) {
        return info != null && isConnected() && this.H.sendSpeechInfo(info);
    }

    public void sendSportCommand(final SportCommand command, final SportInfo info, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        ISportSupplementPanelApi iSportSupplementPanelApi = this.E;
        if (iSportSupplementPanelApi != null) {
            iSportSupplementPanelApi.control(command, info);
        } else {
            callback.sendOnStartMessage();
            callback.sendOnFinishMessage(false);
        }
    }

    public void sendSportCommandPiece(final SportCommand command, final SportInfo info, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        ISportSupplementPanelApi iSportSupplementPanelApi = this.E;
        if (iSportSupplementPanelApi != null) {
            iSportSupplementPanelApi.controlWithoutHeartbeat(command, info);
        } else {
            callback.sendOnStartMessage();
            callback.sendOnFinishMessage(false);
        }
    }

    public void sendSportConfig(final SportConfig config, final IHMSportListener listener, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        ISportSupplementPanelApi iSportSupplementPanelApi = this.E;
        if (iSportSupplementPanelApi != null) {
            iSportSupplementPanelApi.initPanel(config, listener);
        } else {
            callback.sendOnStartMessage();
            callback.sendOnFinishMessage(false);
        }
    }

    @WorkerThread
    public boolean sendSportDataItem(final SportItemDataConfig config) {
        if (isConnected()) {
            return configSportDataItem(config);
        }
        return false;
    }

    public void sendSportNoTimerConfig(SportConfig config, final IHMSportListener listener, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        config.setNeedDeviceClock(false);
        this.E.initPanel(config, listener);
    }

    @WorkerThread
    public boolean sendSportTypeSort(final SportTypeConfig sportTypes) {
        if (isConnected()) {
            return configSportTypeSort(sportTypes);
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean sendUpgradeInfo(List<HMFirmwareInfo> firmwares) {
        if (!isConnected()) {
            return false;
        }
        if (isTimexDevice()) {
            return this.miLiProProfile.sendUpgradeInfo(firmwares);
        }
        return true;
    }

    public void setAccessInfo(final HMAccessInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: s73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j6(callback, info);
            }
        });
    }

    public boolean setAccessInfoSync(HMAccessInfo info) {
        if (isConnected()) {
            return this.D.setCardName(info);
        }
        return false;
    }

    public boolean setActivityGoal(List<ActivityGoal> goals) {
        boolean z;
        ActivityGoal next;
        Debug.fi(N, "setActivityGoal - goals: " + goals);
        boolean z2 = false;
        if (!isConnected()) {
            return false;
        }
        if (this.d.getDeviceFeature().hasSw(9)) {
            return this.miLiProProfile.setMultiGoal(goals);
        }
        if (HMDeviceFeature.MULTI_ACTIVITY_GOAL_DEVICE.contains(getMDeviceSource())) {
            return this.miLiProProfile.setMultiGoalEcfExtend(goals);
        }
        Iterator<ActivityGoal> it2 = goals.iterator();
        do {
            z = true;
            if (it2.hasNext()) {
                next = it2.next();
            }
            return this.miLiProProfile.enableGoalRemind(z2) & z;
        } while (next.getType() != ActivityGoal.GoalType.STEP);
        boolean zIsRemindEnable = next.isRemindEnable();
        IUserInfoProfile iUserInfoProfileZ7 = Z7();
        if (iUserInfoProfileZ7 != null && iUserInfoProfileZ7.setGoal(next.getValue())) {
            z2 = true;
        }
        z = z2;
        z2 = zIsRemindEnable;
        return this.miLiProProfile.enableGoalRemind(z2) & z;
    }

    public void setActivityMode(final int mode, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: g73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k6(callback, mode);
            }
        });
    }

    public void setActivityTarget(final boolean remind, final long activityTarget, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l6(callback, remind, activityTarget);
            }
        });
    }

    public void setAdReminder(final List<AdReminder> reminders, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: v23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m6(callback, reminders);
            }
        });
    }

    public void setAidInfo(final HMAidInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: t73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n6(callback, info);
            }
        });
    }

    public boolean setAidInfoSync(HMAidInfo info) {
        if (!isConnected() || info == null) {
            return false;
        }
        return this.D.modifyCardState(info);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean setAlarmSync(final List<AlarmClockExt> clocks) {
        if (clocks == null || clocks.size() == 0) {
            return false;
        }
        if (this.hmOSDelegate.supportModule(15)) {
            return this.hmOSDelegate.resetAlarms(clocks);
        }
        boolean z = true;
        for (AlarmClockExt alarmClockExt : clocks) {
            boolean alarm = this.miLiProProfile.setAlarm(alarmClockExt);
            Debug.fi(N, "setAlarmSync alarm:" + alarmClockExt + ",ret:" + alarm);
            z = alarm;
        }
        return z;
    }

    public void setAppReplyResult(final AppReplyResult replyResult, final HMCallback<Boolean> callback) {
        o4();
        runOnDeviceMultiThread(new Runnable() { // from class: k73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.q6(callback, replyResult);
            }
        });
    }

    public void setAutoBacklight(final HMAutoBacklightInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: u73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r6(callback, info);
            }
        });
    }

    public boolean setAutoBacklightSync(HMAutoBacklightInfo info) {
        Debug.fi(N, "AutoBackLightInfo: " + info);
        if (!isConnected() || info == null) {
            return false;
        }
        return this.miLiProProfile.setAutoBlacklight(info);
    }

    public void setAutoOtaAtNightSwitch(boolean open) {
        if (isConnected()) {
            this.miLiProProfile.setAutoOtaAtNightSwitch(open);
        }
    }

    public void setBeeps(final List<BeepItem> beepItems, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: u23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s6(callback, beepItems);
            }
        });
    }

    public boolean setBeepsSync(List<BeepItem> beepItems) {
        return isConnected() && this.miLiProProfile.setBeepSettings(beepItems);
    }

    public void setBtPhoneDelay(final byte delay, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: x63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.t6(callback, delay);
            }
        });
    }

    public boolean setBtPhoneDelaySync(byte delay) {
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule != null) {
            SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
            if (settingsModule.supportGroup(settingsGroupType)) {
                General general = new General();
                general.setIncomingCallDelayTime(new IntData(delay));
                HashMap<SettingsGroupType, Settings> map = new HashMap<>();
                map.put(settingsGroupType, general);
                return settingsModule.writeSettingSync(map);
            }
        }
        HMAlertController hMAlertController = this.alertController;
        return hMAlertController != null && hMAlertController.setBtPhoneDelay(delay);
    }

    public void setButtonIgnore(final boolean ignore, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: h33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u6(callback, ignore);
            }
        });
    }

    public void setCalorieGoal(final int goal, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v6(callback, goal);
            }
        });
    }

    public void setCalorieTarget(final boolean remind, final long calorieTarget, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: b43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w6(callback, remind, calorieTarget);
            }
        });
    }

    public boolean setCalorieTargetSync(boolean remind, long calorieGoal) {
        if (isConnected()) {
            return this.miLiProProfile.setCalorieTarget(remind, calorieGoal);
        }
        return false;
    }

    public void setCity(final String city, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: k23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x6(callback, city);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean setConnectionParameters(ConnectionParameters parameters) {
        return isConnected() && this.miLiProProfile.setLEParams(parameters.getConnIntMin(), parameters.getConnIntMax(), parameters.getLatency(), parameters.getTimeout(), 0);
    }

    public void setDateFormat(final String format, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: l23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y6(callback, format);
            }
        });
    }

    public boolean setDateFormatSync(String format) {
        if (isConnected()) {
            return this.miLiProProfile.setDateFormat(format);
        }
        return false;
    }

    public void setDeviceNotificationListener(DeviceNotificationListener listener) {
        o4();
        NotificationApi notificationApi = this.J;
        if (notificationApi != null) {
            notificationApi.setDeviceNotificationListener(listener);
        } else {
            HMLog.info(N, new Function0() { // from class: a53
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.z6();
                }
            });
        }
    }

    public void setDialDefaultColor(final int colorId, @Nullable final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(new Runnable() { // from class: i63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B6(colorId, callback);
            }
        });
    }

    public boolean setDialDefaultColorSync(int colorId) {
        if (isConnected()) {
            return this.miLiProProfile.setDialDefaultColor(colorId);
        }
        return false;
    }

    public void setDisconnectRemind(final HMDisconnectRemindConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: v73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C6(callback, config);
            }
        });
    }

    public void setDisplayData(final List<HMDisplayData> displayDatas, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: r23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D6(callback, displayDatas);
            }
        });
    }

    public boolean setDisplayDataSync(List<HMDisplayData> displayDatas) {
        if (isConnected()) {
            return this.miLiProProfile.setDisplayData(displayDatas);
        }
        return false;
    }

    public void setDisplayItem(final HMProDisplayItem item, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E6(callback, item);
            }
        });
    }

    public void setDisplaySetting(final DisplaySetting setting, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: s83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F6(callback, setting);
            }
        });
    }

    public boolean setDisplaySettingSync(DisplaySetting setting) {
        return DisplayListSettingFactory.INSTANCE.createDisplaySettingApi(this).setDisplaySetting(setting);
    }

    public boolean setDisplaySettingSyncInternal(DisplaySetting setting) {
        if (!isConnected() || setting == null) {
            return false;
        }
        return isTimexDevice() ? this.miLiProProfile.setDisplaySettingByTimexVendor(setting) : this.miLiProProfile.setDisplaySetting(setting);
    }

    public void setDisplayType(final HMDisplayType type, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: w73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G6(callback, type);
            }
        });
    }

    public boolean setDisplayTypeSync(HMDisplayType type) {
        if (isConnected()) {
            return this.miLiProProfile.setDisplayType(type.getType());
        }
        return false;
    }

    public void setDistanceTarget(final boolean remind, final long distanceTarget, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H6(callback, remind, distanceTarget);
            }
        });
    }

    public boolean setDistanceTargetSync(boolean remind, long distanceTarget) {
        if (isConnected()) {
            return this.miLiProProfile.setDistanceTarget(remind, distanceTarget);
        }
        return false;
    }

    public void setDistanceUnit(final boolean isMetric, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: g33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I6(callback, isMetric);
            }
        });
    }

    public boolean setDistanceUnitSync(boolean isMetric) {
        if (isConnected()) {
            return this.miLiProProfile.setMileageUnit(isMetric);
        }
        return false;
    }

    public void setEntranceAvailability(final CincoEntrance entrance, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: r73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J6(callback, entrance);
            }
        });
    }

    public boolean setEntranceAvailabilitySync(CincoEntrance entrance) {
        if (isConnected()) {
            return this.miLiProProfile.setEntranceAvailability(entrance.getShowXiaoai(), entrance.getXiaoaiAvailable(), entrance.getShowNfc(), entrance.getNfcAvailable(), entrance.getShowBank(), entrance.getBankAvailable(), entrance.getShowBusDoor(), entrance.getBusDoorAvailable());
        }
        return false;
    }

    public void setExtensionInfo(final ExtensionInfo extensionInfo, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: e23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K6(callback, extensionInfo);
            }
        });
    }

    public boolean setExtensionInfoSync(ExtensionInfo extensionInfo) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean extensionInfo2 = hMWeatherProfile.setExtensionInfo(extensionInfo);
            hMWeatherProfile.deInit();
            return extensionInfo2;
        }
    }

    public void setForecastWeatherInfo(final ArrayList<HMForecastWeatherInfo> infos, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: o23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L6(callback, infos);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setGoal(final int goal, final HMCallback callBack) {
        if (callNonConnected(callBack)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: t63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M6(goal, callBack);
            }
        });
    }

    public boolean setHRZone(final HRZone zone) {
        return isConnected() && this.miLiProProfile.setHRZone(zone);
    }

    public void setHeartRateZone(final byte type, final byte[] percents, final byte[] zones, final byte restHR, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: y63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N6(callback, type, percents, zones, restHR);
            }
        });
    }

    public boolean setHeartRateZoneSync(byte type, byte[] percents, byte[] zones, byte restHR) {
        return this.miLiProProfile.setHeartRateZone(type, percents, zones, restHR);
    }

    public void setHidConnect(final boolean connect, final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: b33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.O6(callback, connect);
            }
        });
    }

    public boolean setHidStatus(HidStatus status) {
        return this.miLiProProfile.setHidStatus(status);
    }

    public void setHrReminder(final HMHrReminder reminder, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: x73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P6(callback, reminder);
            }
        });
    }

    public boolean setHrReminderSync(HMHrReminder reminder) {
        if (!isConnected() || reminder == null) {
            return false;
        }
        return getHeartHealthApi().setHrReminder(reminder);
    }

    public void setLFEventCallback(HMCallback<HMLFEvent> callback) {
        this.F = callback;
    }

    public void setLanguage(final HMLanguage language, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: y73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q6(callback, language);
            }
        });
    }

    public void setLanguageByISOCode(final String lang, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: n23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R6(callback, lang);
            }
        });
    }

    public boolean setLanguageSync(HMLanguage language) {
        boolean language2;
        HMOtherVersion hMOtherVersionInitOtherVersion;
        if (!isConnected()) {
            return false;
        }
        if (this.d.getLanguageComBination().isContainLanguageGroup()) {
            language2 = j8(language);
        } else {
            language2 = this.d.getLanguageComBination().isContainLanguageFeature() ? this.miLiProProfile.setLanguage(language) : this.miLiProProfile.setLanguageNew(language.getLang());
        }
        if (language2 && (hMOtherVersionInitOtherVersion = this.miLiProProfile.initOtherVersion(this.d.getDeviceSource())) != null) {
            this.d.setOtherVersion(hMOtherVersionInitOtherVersion);
        }
        return language2;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean setLatency(int minLatency, int maxLatency) {
        return true;
    }

    public void setLiftWristSensitivity(final int sensitivity, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: f73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S6(callback, sensitivity);
            }
        });
    }

    public boolean setLiftWristSensitivitySync(int sensitivity) {
        DeviceInfo deviceInfo = getDeviceInfo();
        Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null || !deviceFeature.hasSw(19)) {
            return isConnected() && this.miLiProProfile.setLiftWristSensitivity((byte) sensitivity);
        }
        return isConnected() && r4(null, Integer.valueOf(sensitivity));
    }

    public void setLiftWristTouchSync(final LiftWristTouch liftWristTouch, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: m73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T6(callback, liftWristTouch);
            }
        });
    }

    public void setLongPressKey(final int key, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: b73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U6(callback, key);
            }
        });
    }

    public void setMenstrualNotifiedDataListener(Function1<MenstrualNotifiedData, Unit> function) {
        MenstruationModule menstruationModule = (MenstruationModule) getChannelModule(MenstruationModule.class);
        if (menstruationModule != null) {
            menstruationModule.setMenstrualPeriodDataChangeListener(function);
        }
    }

    public void setMenstruationNotify(final boolean enable, final int days, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: z33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.V6(callback, enable, days);
            }
        });
    }

    public void setMenstruationOvulation(final boolean enable, final int days, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: y33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W6(callback, enable, days);
            }
        });
    }

    public void setNegativeScreen(final HMNegativeScreen screen, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: b83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X6(callback, screen);
            }
        });
    }

    public void setNowTimeConfig(@NotNull final NowTimeConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: n73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y6(callback, config);
            }
        });
    }

    public void setOtherCalendar(final byte calendar, final HMCallback callback) {
        runOnDeviceOnlyThread(new Runnable() { // from class: v63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z6(callback, calendar);
            }
        });
    }

    public boolean setOtherCalendarSync(byte calendar) {
        Debug.fi(N, "calendar: " + ((int) calendar));
        return isConnected() && this.miLiProProfile.setOtherCalendar(calendar);
    }

    public boolean setPBInfos(List<SmartWatchProfile.BlePBInfo> pbInfos, boolean isFull) {
        PBApi pBApiCreate;
        if (isConnected() && (pBApiCreate = PBApiFactory.INSTANCE.create(this.mProfile)) != null) {
            return pBApiCreate.setPBInfos(pbInfos, isFull);
        }
        return false;
    }

    public void setPages(final List<PageItem> pages, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: s23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a7(callback, pages);
            }
        });
    }

    public boolean setPagesSync(List<PageItem> pages) {
        return DisplayListSettingFactory.INSTANCE.createDisplaySettingApi(this).setDisplayItems(pages);
    }

    public boolean setPagesSyncInternal(List<PageItem> pages) {
        return isConnected() && this.miLiProProfile.setPages(this.d == null ? new Feature() : this.d.getDeviceFeature(), pages);
    }

    public void setPasswordInteraction(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: q63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b7(callback);
            }
        });
    }

    public void setPeriodData(final MenstrualPeriodData[] periodData, final Function1<Boolean, Unit> function) {
        runOnDeviceMultiThread(new Runnable() { // from class: r43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c7(function, periodData);
            }
        });
    }

    public void setPressureSwitch(final boolean open, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: w33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d7(callback, open);
            }
        });
    }

    public boolean setPressureSwitchSync(boolean open) {
        return isConnected() && this.d.getDeviceFeature().hasSw(3) && getHeartHealthApi().enablePressure(open);
    }

    public void setRealtimeAqiInfo(final HMRealtimeAqi info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: f23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e7(callback, info);
            }
        });
    }

    public void setRealtimeWeatherInfo(final HMRealtimeWeatherInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: g23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f7(callback, info);
            }
        });
    }

    public void setRecordStep(final int step, final HMCallback callBack) {
        if (callNonConnected(callBack)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: z63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g7(callBack, step);
            }
        });
    }

    public void setReminder(final List<HMReminderInfo> reminderInfos, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: w23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h7(callback, reminderInfos);
            }
        });
    }

    public boolean setReminderSync(List<HMReminderInfo> list) {
        DeviceInfo deviceInfo;
        if (list == null || list.size() == 0 || !isConnected() || (deviceInfo = getDeviceInfo()) == null) {
            return false;
        }
        boolean reminder = true;
        if (supportModule(EventReminderModule.class)) {
            EventReminderModule eventReminderModule = (EventReminderModule) getChannelModule(EventReminderModule.class);
            return eventReminderModule != null && eventReminderModule.handleAmbiguousOperationsSync((HMReminderInfo[]) list.toArray(new HMReminderInfo[list.size()]));
        }
        int i2 = !deviceInfo.isMiLiPro() ? 1 : 0;
        Iterator<HMReminderInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            reminder &= this.miLiProProfile.setReminder(it2.next(), i2);
        }
        return reminder;
    }

    public void setSedentary(final HMSedentaryConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i7(callback, config);
            }
        });
    }

    public void setSilent(final HMSilentConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: e83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j7(callback, config);
            }
        });
    }

    public void setSpeechEventCallback(HMCallback<HMSpeechEvent> callback) {
        this.G = callback;
    }

    public void setSportRemindConfig(final SportRemindConfig config, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: a23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k7(callback, config);
            }
        });
    }

    public boolean setSportRemindConfigSync(SportRemindConfig config) {
        return isConnected() && this.miLiProProfile.setSportRemindConfig(config);
    }

    public void setStandAlertConfig(@NotNull final StandAlertConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: o73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l7(callback, config);
            }
        });
    }

    public void setStandTarget(final boolean remind, final long standTarget, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: f43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m7(callback, remind, standTarget);
            }
        });
    }

    public void setStartDayOfWeek(final byte dayOfWeek, final HMCallback callback) {
        runOnDeviceOnlyThread(new Runnable() { // from class: w63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n7(callback, dayOfWeek);
            }
        });
    }

    public boolean setStartDayOfWeekSync(byte dayOfWeek) {
        Debug.fi(N, "dayOfWeek: " + ((int) dayOfWeek));
        return isConnected() && this.miLiProProfile.setStartDayOfWeek(dayOfWeek);
    }

    public void setStepTarget(final boolean remind, final long stepTarget, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: e43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o7(callback, remind, stepTarget);
            }
        });
    }

    public boolean setStepTargetSync(boolean remind, long stepTarget) {
        if (isConnected()) {
            return this.miLiProProfile.setStepTarget(remind, stepTarget);
        }
        return false;
    }

    public void setSunriseSunset(final HMSunriseSunsetInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: h23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p7(callback, info);
            }
        });
    }

    public boolean setSunriseSunsetSync(HMSunriseSunsetInfo info) {
        Debug.fi(N, "rsInfo: " + info);
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMWeatherProfile hMWeatherProfile = new HMWeatherProfile(this.miLiProProfile);
            if (!hMWeatherProfile.init()) {
                return false;
            }
            boolean sunriseSunset = hMWeatherProfile.setSunriseSunset(info);
            hMWeatherProfile.deInit();
            return sunriseSunset;
        }
    }

    public void setTargets(final HMTarget target, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: f83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.q7(callback, target);
            }
        });
    }

    public boolean setTargetsSync(HMTarget target) {
        if (isConnected()) {
            return this.miLiProProfile.setTargets(target);
        }
        return false;
    }

    public void setTempUnit(final byte unit, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: u63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r7(callback, unit);
            }
        });
    }

    public boolean setTempUnitSync(byte tempUnit) {
        synchronized (this.weatherSyncObj) {
            try {
                if (tempUnit < 0) {
                    return false;
                }
                if (!isConnected()) {
                    return false;
                }
                IWeatherProfile iWeatherProfileCreateWeatherProfile = WeatherFactory.createWeatherProfile(this.miLiProProfile);
                if (!iWeatherProfileCreateWeatherProfile.init()) {
                    return false;
                }
                boolean temperatureUnitSync = iWeatherProfileCreateWeatherProfile.setTemperatureUnitSync(tempUnit);
                iWeatherProfileCreateWeatherProfile.deInit();
                return temperatureUnitSync;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HMCardTSResponse<Boolean> setTimeSwitchCardSync(HMCardSwitchTime hmCardSwitchTime) {
        if (!isConnected() || hmCardSwitchTime == null) {
            return null;
        }
        return this.D.setTimeSwitch(hmCardSwitchTime);
    }

    public void setTimeUnit(final boolean is12Hour, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: k33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s7(callback, is12Hour);
            }
        });
    }

    public boolean setTimeUnitSync(final boolean is12Hour) {
        if (!isConnected()) {
            HMLog.error(N, new Function0() { // from class: v43
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiProDevice.t7(is12Hour);
                }
            });
            return false;
        }
        final boolean timeUnit = this.miLiProProfile.setTimeUnit(is12Hour);
        HMLog.info(N, new Function0() { // from class: y43
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMMiLiProDevice.u7(is12Hour, timeUnit);
            }
        });
        return timeUnit;
    }

    public void setTouchscreenSync(final Touchscreen touchScreen, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: q73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v7(callback, touchScreen);
            }
        });
    }

    public void setUnwearPassword(final boolean enable, final String password, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: g43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w7(callback, enable, password);
            }
        });
    }

    public boolean setUnwearPasswordSync(boolean enable, String password) {
        DeviceInfo deviceInfo = getDeviceInfo();
        Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if ((deviceFeature != null && deviceFeature.hasSw(19)) || isHuamiOs()) {
            return o8(enable, password);
        }
        return isConnected() && this.miLiProProfile.setUnwearPassword(enable, password);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setUserInfo(final UserInfoExt infoExt, final HMCallback callback) {
        runOnDeviceOnlyThread(new Runnable() { // from class: i83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x7(callback, infoExt);
            }
        });
    }

    public boolean setUserInfoSync(UserInfoExt infoExt) {
        IUserInfoProfile iUserInfoProfileZ7;
        return isConnected() && (iUserInfoProfileZ7 = Z7()) != null && iUserInfoProfileZ7.setUserInfo(infoExt);
    }

    public void setVibrate(final HMVibrateInfo info, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: g83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y7(callback, info);
            }
        });
    }

    public boolean setVibrateSync(HMVibrateInfo info) {
        Debug.fi(N, "vibrateInfo: " + info);
        CustomVibrateApi customVibrateApiCreate = CustomVibrateFactory.create(this);
        if (customVibrateApiCreate == null) {
            return false;
        }
        return customVibrateApiCreate.setCustomVibrate(info);
    }

    public void setVibrateWithTest(final HMVibrateInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: h83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z7(callback, info);
            }
        });
    }

    public void setWatchFace(final int watchFaceId, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: a73
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A7(callback, watchFaceId);
            }
        });
    }

    public boolean setWatchFaceSync(int watchFaceId) {
        return isConnected() && this.miLiProProfile.setWatchFace(watchFaceId);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setWearLocation(final LocationExt location, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B7(callback, location);
            }
        });
    }

    public void setWeatherInfo(final Function0<HMWeatherInfo> weatherInfoGetter, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: y23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C7(callback, weatherInfoGetter);
            }
        });
    }

    public boolean setWeatherInfoSync(Function0<HMWeatherInfo> weatherInfoGetter) {
        boolean zL8;
        boolean zH8;
        boolean zM8;
        boolean extensionInfoSync;
        boolean zQ8;
        HMWeatherInfo hMWeatherInfoInvoke = weatherInfoGetter.getA();
        if (hMWeatherInfoInvoke == null) {
            return false;
        }
        String cityInfo = hMWeatherInfoInvoke.getCityInfo();
        boolean sunriseSunsetSync = true;
        boolean zF8 = !TextUtils.isEmpty(cityInfo) ? f8(cityInfo) : true;
        Debug.fi(N, "setCity: " + zF8);
        boolean tempUnitSync = setTempUnitSync(hMWeatherInfoInvoke.getTempUnit());
        Debug.fi(N, "tempUnit: " + ((int) hMWeatherInfoInvoke.getTempUnit()) + ", ret: " + tempUnitSync);
        boolean z = zF8 & tempUnitSync;
        HMRealtimeAqi aqiInfo = hMWeatherInfoInvoke.getAqiInfo();
        if (aqiInfo != null) {
            zL8 = l8(aqiInfo);
            z &= zL8;
        } else {
            zL8 = true;
        }
        Debug.fi(N, "setAqi: " + zL8);
        ArrayList<HMForecastWeatherInfo> forecastInfo = hMWeatherInfoInvoke.getForecastInfo();
        if (forecastInfo == null || forecastInfo.size() <= 0) {
            zH8 = true;
        } else {
            zH8 = h8(forecastInfo);
            z &= zH8;
        }
        Debug.fi(N, "forecast ret: " + zH8);
        HMRealtimeWeatherInfo realtimeInfo = hMWeatherInfoInvoke.getRealtimeInfo();
        if (realtimeInfo != null) {
            zM8 = m8(realtimeInfo);
            z &= zM8;
        } else {
            zM8 = true;
        }
        Debug.fi(N, "realtimeRet: " + zM8);
        ExtensionInfo extensionInfo = hMWeatherInfoInvoke.getExtensionInfo();
        if (extensionInfo != null) {
            extensionInfoSync = setExtensionInfoSync(extensionInfo);
            z &= extensionInfoSync;
        } else {
            extensionInfoSync = true;
        }
        Debug.fi(N, "extensionInfoRet: " + extensionInfoSync);
        HMWindAndHumidityInfo windAndHumidityInfo = hMWeatherInfoInvoke.getWindAndHumidityInfo();
        if (windAndHumidityInfo != null) {
            zQ8 = q8(windAndHumidityInfo);
            z &= zQ8;
        } else {
            zQ8 = true;
        }
        Debug.fi(N, "windAndHumidityRet: " + zQ8);
        HMSunriseSunsetInfo sunriseSunsetInfo = hMWeatherInfoInvoke.getSunriseSunsetInfo();
        if (sunriseSunsetInfo != null) {
            sunriseSunsetSync = setSunriseSunsetSync(sunriseSunsetInfo);
            z &= sunriseSunsetSync;
        }
        Debug.fi(N, "sunriseSunsetRet: " + sunriseSunsetSync);
        return z;
    }

    public void setWeightUnit(final WeightUnit weightUnit, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D7(callback, weightUnit);
            }
        });
    }

    public boolean setWeightUnitSync(WeightUnit weightUnit) {
        if (!isConnected()) {
            return false;
        }
        General general = new General();
        general.setWeightUnit(new EnumData(weightUnit.getValue()));
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        map.put(SettingsGroupType.GENERAL, general);
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            return false;
        }
        return settingsModule.writeSettingSync(map);
    }

    @Deprecated
    public void setWorldClock(final List<WorldTime> worldTimes, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: q23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E7(callback, worldTimes);
            }
        });
    }

    @Deprecated
    public boolean setWorldClockSync(List<WorldTime> worldTimes) {
        return isConnected() && this.miLiProProfile.setWorldTime(worldTimes);
    }

    public void showContact(final HMAlertMode mode, final boolean show, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: j83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F7(callback, mode, show);
            }
        });
    }

    public boolean showContactSync(final HMAlertMode mode, final boolean show) {
        if (isConnected()) {
            return this.miLiProProfile.showContact(mode, show);
        }
        return false;
    }

    public void sportCalibrate(final SportCalibrateInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: p83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G7(callback, info);
            }
        });
    }

    public boolean sportCalibrateSync(SportCalibrateInfo info) {
        if (isConnected()) {
            return this.miLiProProfile.sportCalibrate(info);
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void startSensorData(final int type, final IHMSensorDataCallback callback) {
        HMProSensorDataController hMProSensorDataController;
        if (isConnected() && (hMProSensorDataController = this.mSensorDataController) != null) {
            hMProSensorDataController.startAsync(type, callback);
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    public void startSyncBodyTemperature(Calendar startTimeAllDay, Calendar startTimeSingle, Calendar startTime80s, IHMBodyTemperatureDataCallback callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncBodyTemperatureTaskNew(this.miLiProProfile, startTimeAllDay, startTimeSingle, startTime80s, getGdspVersion(), callback));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public void startSyncFirstbeatData(Calendar startTime, Calendar endTime, final IHMFirstbeatDataCallback callback) {
        Debug.fi(N, "sync firstbeat data");
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSmartWatchSyncFirstbeatTask(this.miLiProProfile, startTime, endTime, callback));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public void startSyncHighLowHrData(final Calendar calendar, final HMCallback<List<HmHighLowHrData>> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(new HmSyncHighLowHrDataTask(this.miLiProProfile, calendar, new g(callback)));
    }

    public void startSyncHrData(final Calendar calendar, final IHMHrDataCallback callBack) {
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getProHrTask(this.miLiProProfile, calendar, getGdspVersion(), callBack));
        } else {
            callBack.onHrStart();
            callBack.onHrStop(false);
        }
    }

    public void startSyncPaiData(final Calendar calendar, final HMCallback<ArrayList<HMPaiData>> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(GdspFactory.INSTANCE.getPaiTask(this.miLiProProfile, calendar, getGdspVersion(), new b(callback)));
    }

    public void startSyncPressureDataAllDay(final Calendar calendar, final IHMPressureDataCallback callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getPressureTask(this.miLiProProfile, calendar, getGdspVersion(), false, callback));
        } else {
            callback.onPressureStart();
            callback.onPressureStop(false);
        }
    }

    public void startSyncPressureDataSingle(final Calendar calendar, final IHMPressureDataCallback callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getPressureTask(this.miLiProProfile, calendar, getGdspVersion(), true, callback));
        } else {
            callback.onPressureStart();
            callback.onPressureStop(false);
        }
    }

    public <T> void startSyncRawData(Calendar calendar, HmRawDataCallback<T> callback) {
        Debug.fi(N, "同步Raw数据");
        runOnDeviceOnlyThread(GdspFactory.INSTANCE.getByteArrayTask(this.miLiProProfile, calendar, callback.getDataType(), getGdspVersion(), CallbackExtKt.toGdspCallback(callback)));
    }

    public void startSyncSpo2Data(final Calendar calendar, byte type, final HMCallback<List<Spo2Data>> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        DeviceInfo deviceInfo = getDeviceInfo();
        runOnDeviceOnlyThread(GdspFactory.INSTANCE.getSpo2Task(this.miLiProProfile, calendar, type, getGdspVersion(), deviceInfo != null ? deviceInfo.getDeviceFeature().hasSw(25) : false, new c(callback)));
    }

    public void startSyncSpo2RawData(final Calendar calendar, byte type, final HMCallback<List<RawData>> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        DeviceInfo deviceInfo = getDeviceInfo();
        runOnDeviceOnlyThread(new HMSyncSpo2DataTask(deviceInfo != null ? deviceInfo.getDeviceFeature().hasSw(25) : false, this.miLiProProfile, type, calendar, new d(callback)));
    }

    public boolean stopDeviceSync() {
        if (isConnected()) {
            return this.miLiProProfile.stopDevice();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void stopFindPhone(@NotNull HMCallback<?> callback) {
        findPhoneStop(callback);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void stopSensorData() {
        HMProSensorDataController hMProSensorDataController = this.mSensorDataController;
        if (hMProSensorDataController != null) {
            hMProSensorDataController.stopAsync();
        }
    }

    public void supportActivityData(final HMCallback<Boolean> callback) {
        if (!supportModule(OpenAppModule.class)) {
            Debug.fi(N, "not support OpenAppModule");
            callback.onFinish(false);
            return;
        }
        OpenAppModule openAppModule = (OpenAppModule) getChannelModule(OpenAppModule.class);
        if (openAppModule != null) {
            openAppModule.queryVersion(new Function1() { // from class: i53
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HMMiLiProDevice.H7(callback, (Integer) obj);
                }
            });
        } else {
            Debug.fi(N, "openAppModule is null.");
            callback.onFinish(false);
        }
    }

    public void supportHuamiOSWeather(final Function1<Boolean, Unit> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: q43
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.J7(callback);
                }
            });
        } else {
            callback.invoke(Boolean.FALSE);
        }
    }

    public boolean supportMsgReply() {
        o4();
        NotificationApi notificationApi = this.J;
        if (notificationApi == null || !(notificationApi instanceof NotificationApiV3)) {
            return false;
        }
        return ((NotificationApiV3) notificationApi).supportMsgReply();
    }

    public boolean supportNfcFeature(NFCFeature nfcFeature) throws Exception {
        return isConnected() && this.D.hasFeature(nfcFeature);
    }

    public void switchMenstruationDeviceNotify(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: j33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K7(callback, enable);
            }
        });
    }

    public void switchSmartPredict(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: a33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L7(callback, enable);
            }
        });
    }

    public void switchSpo2(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: u33
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M7(callback, enable);
            }
        });
    }

    public boolean switchSpo2Sync(boolean enable) {
        if (isConnected()) {
            return this.miLiProProfile.switchSpo2(enable);
        }
        return false;
    }

    public void syncActivityTodayDataFromDevice(Calendar startTime, HMCallback<List<ActivityData>> callback) {
        runOnDeviceOnlyThread(GdspFactory.INSTANCE.getActivityTodayDataTask(this.miLiProProfile, startTime, getGdspVersion(), new i(callback)));
    }

    public void syncActivityTodayDataToDevice(ArrayList<ActivityData> data, final HMCallback<Integer> callback) {
        if (!supportModule(OpenAppModule.class)) {
            Debug.fi(N, "not support OpenAppModule");
            return;
        }
        OpenAppModule openAppModule = (OpenAppModule) getChannelModule(OpenAppModule.class);
        callback.sendOnStartMessage();
        if (openAppModule != null) {
            openAppModule.writeActivityData(data, new Function1() { // from class: g53
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HMMiLiProDevice.N7(callback, (Integer) obj);
                }
            });
        } else {
            Debug.fi(N, "openAppModule is null.");
            callback.sendOnFinishMessage(false);
        }
    }

    public void syncBloodPressureResultData(Calendar startTime, IGdspSyncCallback<BloodPressureMeasureResult> callback) {
        Debug.fi(N, "同步血压测量结果");
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getGdspBloodPressureResultTask(this.mProfile, startTime, callback));
        } else {
            callback.onResult(GDSPErrorCode.OPERATION_FAILED);
        }
    }

    public void syncCoachingWorkout(final HMCoachingWorkout workout, final int index, final boolean isUpdate, final HMCallback callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: b23
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.O7(callback, workout, index, isUpdate);
                }
            });
        } else {
            callback.sendOnFinishMessage(false);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return submitOnDeviceOnlyThread(GdspFactory.INSTANCE.getProSyncDataTask(this.miLiProProfile, calendar, getGdspVersion(), getMDeviceSource(), deviceInfo.getDeviceFeature(), callback));
    }

    public <T> void syncGdspListData(BaseGdspSyncParam<List<T>> param, HMCallback<List<T>> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        param.setGdspVersion(getGdspVersion());
        runOnDeviceOnlyThread(new CommonGdspSyncTask(this.miLiProProfile, param, CallbackExtKt.toGdspListCallback(new f(callback))));
    }

    public void syncSleepBPResultData(Calendar startTime, IGdspSyncCallback<BloodPressureMeasureResult> callback) {
        Debug.fi(N, "同步睡眠连续血压测量结果");
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getGdspSleepBPResultTask(this.mProfile, startTime, callback));
        } else {
            callback.onResult(GDSPErrorCode.OPERATION_FAILED);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void triggerPair(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: k63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P7(callback);
            }
        });
    }

    public void unbind(final AuthInfo info, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: o83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q7(callback, info);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean unbindSync(AuthInfo info) {
        if (!isConnected()) {
            return false;
        }
        try {
            IDeviceAuthorization iDeviceAuthorizationCreateAuthorization = DeviceAuthorizationFactory.INSTANCE.createAuthorization(this.miLiProProfile, this);
            if (iDeviceAuthorizationCreateAuthorization == null) {
                return false;
            }
            return iDeviceAuthorizationCreateAuthorization.deAuthorize(info);
        } catch (Exception e2) {
            Debug.fi(N, "Auth exception:" + e2.toString());
            return false;
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi
    public void unregisterControllerListener(@NotNull MusicControllerCallback listener) {
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void unregisterPhoneMuteListener(@NonNull PhoneMuteListener listener) {
    }

    public void updateEmptyCardList(final HMNFCCardType type, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: v83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R7(callback, type);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(final HMFirmwareInfo firmwareInfo, final IHMFirmwareUpgradeCallback callback) {
        UpgradeCallback upgradeCallback = new UpgradeCallback(callback, new Function1() { // from class: j53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.S7(firmwareInfo, (Boolean) obj);
            }
        });
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            Debug.fi(N, "device info is null!!!");
            callback.onFwStart(0);
            callback.onFwStop(false);
        } else {
            if (!deviceInfo.getDeviceFeature().hasBase(3)) {
                if (HMDeviceFeature.c(deviceInfo)) {
                    runOnDeviceOnlyThread(new HMDfuTask(this.mProfile, firmwareInfo, upgradeCallback));
                    return;
                } else {
                    runOnDeviceOnlyThread(new HMFirmwareUpgradeTask(this.mProfile, firmwareInfo, upgradeCallback));
                    return;
                }
            }
            DfuApi dfuApi = getDfuApi();
            if (dfuApi == null) {
                return;
            }
            if (firmwareInfo.getUpgradeModel() == UpgradeModel.BACKGROUND) {
                runOnDeviceMultiThread(new NewDfuTask(dfuApi, firmwareInfo, upgradeCallback));
            } else {
                runOnDeviceOnlyThread(new NewDfuTask(dfuApi, firmwareInfo, upgradeCallback));
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrades(List<HMFirmwareInfo> firmwares, final IHMFirmwareUpgradeCallback callback) {
        new DfuExecutor(firmwares, this, callback).run();
    }

    public void updateNfcCardConfig(final HMNFCCardConfig config, final HMCallback<HMNFCCardStatus> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: u83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T7(callback, config);
            }
        });
    }

    public HMNFCCardStatus updateNfcCardConfigSync(HMNFCCardConfig config) {
        if (isConnected()) {
            return this.D.updateCardConfig(config);
        }
        return null;
    }

    public void updateNfcCardList(final List<HMNFCCardIdent> cardIdents, final HMNFCCardType type, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: x23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U7(callback, cardIdents, type);
            }
        });
    }

    public boolean updateNfcCardListSync(List<HMNFCCardIdent> cardIdents, HMNFCCardType type) {
        return isConnected() && this.D.updateCardList(cardIdents, type);
    }

    public void updatePasswordInteraction(final String password, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: j23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.V7(callback, password);
            }
        });
    }

    public boolean verifyPwd() {
        return isConnected() && this.D.verifyPwd();
    }

    public void writeMasterSeFlag(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: w53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X7(callback);
            }
        });
    }

    public boolean writeMasterSeFlagSync() {
        return isConnected() && this.D.writeSeFlag();
    }

    public void writePaiData(final HMPaiData data, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: q83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y7(callback, data);
            }
        });
    }

    public boolean writePaiDataSync(HMPaiData data) {
        if (isConnected()) {
            return this.miLiProProfile.writePaiData(data);
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void alert(final short time, final short offsetTime, final byte num, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: z23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B4(callback, time, offsetTime, num);
            }
        });
    }

    public void getBalance(final byte[] data, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: n43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a5(callback, data);
            }
        });
    }

    public boolean getCRSCode() {
        return this.D.getCRSCode();
    }

    public void getCardInfo(final byte[] data, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: k43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d5(callback, data);
            }
        });
    }

    public void getConsumeList(final byte[] data, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: i43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f5(callback, data);
            }
        });
    }

    public void getCplc(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: n53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g5(callback);
            }
        });
    }

    public void getLNTCode(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: j63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m5(callback);
            }
        });
    }

    public void getPeytoSettings(final HMCallback<HMPeytoSettings> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: l53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.t5(callback);
            }
        });
    }

    public void isAlreadyPersonal(final byte[] data, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: m43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G5(callback, data);
            }
        });
    }

    public void isSupportCity(final byte[] data, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: h43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K5(callback, data);
            }
        });
    }

    public ApduResponse nfcLoadService(byte[] data) {
        return this.D.nfcLoadService(data);
    }

    public PasswordInteractionResponse passwordInteraction() {
        return this.D.passwordInteraction();
    }

    public void queryPwd(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: a63
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U5(callback);
            }
        });
    }

    public void sendMusicControl(final HMMusicControl control, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: n83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g6(callback, control);
            }
        });
    }

    public boolean setPasswordInteraction() {
        return this.D.setPasswordInteraction();
    }

    public boolean updateEmptyCardList(HMNFCCardType type) {
        return isConnected() && this.D.updateEmptyCardList(type);
    }

    public boolean updatePasswordInteraction(String password) {
        return this.D.updatePasswordInteraction(password);
    }

    public void verifyPwd(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: w43
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W7(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void bindWeixin(final String weiXinId, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: m23
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D4(callback, weiXinId);
            }
        });
    }

    public boolean setNowTimeConfig(@NotNull NowTimeConfig config) {
        if (isConnected()) {
            return this.miLiProProfile.setNowTimeConfig(config);
        }
        return false;
    }

    public boolean setStandAlertConfig(@NotNull StandAlertConfig config) {
        if (isConnected()) {
            return this.miLiProProfile.setStandAlertConfig(config);
        }
        return false;
    }

    public void replaceDial(final int src, final int dest, final int destSize, @Nullable final HMCallback<Integer> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(new Runnable() { // from class: x53
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b6(src, dest, destSize, callback);
            }
        });
    }

    @WorkerThread
    public boolean supportHuamiOSWeather() {
        BuiltInModule builtInModule = (BuiltInModule) getChannelModule(BuiltInModule.class);
        if (builtInModule == null) {
            return false;
        }
        return builtInModule.supportModule(14);
    }

    public boolean bindWeixin(String weiXinId) {
        DeviceInfo deviceInfo = this.miLiProProfile.getDeviceInfo();
        if (deviceInfo != null) {
            return this.miLiProProfile.setWeixinId(getWeixinId(weiXinId, deviceInfo.getDeviceID()));
        }
        return false;
    }

    public void startSyncRawData(Calendar calendar, int type, HMCallback<HmGdspRawData> callback) {
        Debug.fi(N, "同步Raw数据");
        runOnDeviceOnlyThread(GdspFactory.INSTANCE.getByteArrayTask(this.miLiProProfile, calendar, type, getGdspVersion(), CallbackExtKt.toGdspCallback(callback, type)));
    }

    public HMMiLiProDevice(Context context, String device) {
        super(context, device);
        this.miLiProProfile = null;
        this.mSensorDataController = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.userProfile = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.weatherSyncObj = new Object();
        this.L = null;
    }
}
