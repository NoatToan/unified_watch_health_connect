package com.huami.watch.companion.sync;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.core.util.Consumer;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.passport.AccountManager;
import com.huami.passport.Keeper;
import com.huami.passport.entity.Profile;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.app.WatchWidgetNewManager;
import com.huami.watch.companion.battery.BatteryInfoHelper;
import com.huami.watch.companion.cloud.api.UserInfoAPI;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.settings.WatchSettings;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.sport.pb.PersonalBest;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleNotificationHelper;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.unlock.UnlockUtil;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.companion.util.KeyValueUtil;
import com.huami.watch.companion.watchface.WatchFace;
import com.huami.watch.companion.watchface.WatchFaceManager;
import com.huami.watch.companion.weather.WeatherWatchExtender;
import com.huami.watch.companion.weather.util.Unit;
import com.huami.watch.hmwatchmanager.bt_connect.ArrivedDataUnpackingManager;
import com.huami.watch.hmwatchmanager.bt_connect.BGService_msg;
import com.huami.watch.hmwatchmanager.bt_connect.DataPackingManager;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.notification.data.StatusBarNotificationData;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.tekartik.sqflite.Constant;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SyncUtil {
    private static final String a = "Sync-Util";
    private static final String b = "SystemTime";
    private static final String c = "SystemTimeZone";
    private static final String d = "SystemTZRawOffset";
    private static final String e = "SystemTZDSTSavings";
    private static final String f = "SystemTZInDaylight";

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ UserInfo b;

        public a(Context context, UserInfo userInfo) {
            this.a = context;
            this.b = userInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            SyncUtil.syncUserInfoToCloud(this.a, this.b);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            UserInfo userInfo = UserInfoManager.get();
            Log.d(SyncUtil.a, "Sync UserInfo From Cloud, Current Info : " + userInfo, new Object[0]);
            if (userInfo.isCloudNeedSync()) {
                return;
            }
            UserInfoAPI.GetUserInfoResult userInfo2 = UserInfoAPI.getUserInfo(this.a);
            boolean z2 = true;
            if (userInfo2.isSuccess) {
                UserInfo userInfo3 = userInfo2.info;
                if (userInfo3 == null) {
                    return;
                }
                if (userInfo3.getBirthday().isEmpty() || userInfo3.getBirthday().equals(userInfo.getBirthday())) {
                    z = false;
                } else {
                    Log.d(SyncUtil.a, "Update Birthday : " + userInfo3.getBirthday(), new Object[0]);
                    userInfo.setBirthday(userInfo3.getBirthday());
                    z = true;
                }
            } else {
                z = false;
            }
            Profile profile = AccountManager.getDefault(this.a).getProfile();
            Log.d(SyncUtil.a, "Get Profile : " + profile, new Object[0]);
            if (profile != null) {
                String countryCode = profile.getCountryCode();
                if (TextUtils.isEmpty(countryCode) || TextUtils.equals(countryCode, userInfo.getCountry())) {
                    z2 = z;
                } else {
                    Log.d(SyncUtil.a, "Update Country : " + countryCode, new Object[0]);
                    if ("UK".equals(countryCode)) {
                        countryCode = SelectAreaManager.GB;
                    }
                    userInfo.setCountry(countryCode);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                UserInfoManager.save(userInfo);
            } else {
                Log.d(SyncUtil.a, "Sync UserInfo From Cloud Finish, Not Need Update!!", new Object[0]);
            }
        }
    }

    public class c implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Device b;
        public final /* synthetic */ String c;

        public c(Context context, Device device, String str) {
            this.a = context;
            this.b = device;
            this.c = str;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() throws Exception {
            return SyncUtil.s(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Context context, boolean z, String str, Consumer consumer, DataTransportResult dataTransportResult) {
        O(context, z, dataTransportResult.getResultCode() == 0, str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(Context context, boolean z, String str, Consumer consumer, Boolean bool) {
        O(context, z, bool.booleanValue(), str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Context context, DataTransportResult dataTransportResult) {
        if (DeviceManager.getManager(CompanionApplication.getContext()).isCurrentDeviceBLE()) {
            SyncBleUtil.sendDistanceUnit(UnitManager.getInstance(context).getDistanceUnit() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Context context, int i, String str, Consumer consumer, DataTransportResult dataTransportResult) {
        P(context, i, dataTransportResult.getResultCode() == 0, str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(Context context, int i, String str, Consumer consumer, Boolean bool) {
        P(context, i, bool.booleanValue(), str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Context context, boolean z, String str, Consumer consumer, DataTransportResult dataTransportResult) {
        Q(context, z, dataTransportResult.getResultCode() == 0, str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Context context, boolean z, String str, Consumer consumer, Boolean bool) {
        Q(context, z, bool.booleanValue(), str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(Context context, int i, String str, Consumer consumer, DataTransportResult dataTransportResult) {
        R(context, i, dataTransportResult.getResultCode() == 0, str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Context context, int i, String str, Consumer consumer, Boolean bool) {
        R(context, i, bool.booleanValue(), str, consumer);
    }

    private static void K(Context context, boolean z, boolean z2, String str, Consumer<Boolean> consumer) {
        if (z2) {
            HealthData.saveHealthSetting(context, str);
            HealthData.updateIsAllDayStress(str);
        }
        Log.d(a, "Send AllDay Stress ON[" + z + "], Success: " + z2, new Object[0]);
        consumer.accept(Boolean.valueOf(z2));
    }

    private static void L(Context context, String str, boolean z, String str2, Consumer<Boolean> consumer) {
        if (z) {
            HealthData.saveHealthSetting(context, str2);
            HealthData.updateAfDisturbTime(str2);
        }
        Log.d(a, "Sync AfDisturbTime [" + str + "] To Watch, Success: " + z, new Object[0]);
        consumer.accept(Boolean.valueOf(z));
    }

    private static void M(Context context, boolean z, boolean z2, String str, Consumer<Boolean> consumer) {
        if (z2) {
            HealthData.saveHealthSetting(context, str);
            HealthData.updateIsAtrialFibrillation(str);
        }
        Log.d(a, "Sync AtrialFibrillation [" + z + "] To Watch, Success: " + z2, new Object[0]);
        consumer.accept(Boolean.valueOf(z2));
    }

    private static void N(Context context, boolean z, boolean z2, String str, Consumer<Boolean> consumer) {
        if (z2) {
            HealthData.saveHealthSetting(context, str);
        }
        Log.d(a, "Sync User LongSit Remind [" + z + "] To Watch, Success: " + z2, new Object[0]);
        consumer.accept(Boolean.valueOf(z2));
    }

    private static void O(Context context, boolean z, boolean z2, String str, Consumer<Boolean> consumer) {
        if (z2) {
            HealthData.saveHealthSetting(context, str);
        }
        Log.d(a, "Sync User StepGoal Remind [" + z + "] To Watch, Success: " + z2, new Object[0]);
        consumer.accept(Boolean.valueOf(z2));
    }

    private static void P(Context context, int i, boolean z, String str, Consumer<Boolean> consumer) {
        Log.d(a, "Sync User CalorieGoal [" + i + "] To Watch, Success: " + z, new Object[0]);
        if (consumer != null) {
            consumer.accept(Boolean.valueOf(z));
        }
    }

    private static void Q(Context context, boolean z, boolean z2, String str, Consumer<Boolean> consumer) {
        if (z2) {
            HealthData.saveHealthSetting(context, str);
            HealthData.updateUserIsAllDayHR(str);
        }
        Log.d(a, "Sync User HeartRate AllDay [" + z + "] To Watch, Success: " + z2, new Object[0]);
        consumer.accept(Boolean.valueOf(z2));
    }

    private static void R(Context context, int i, boolean z, String str, Consumer<Boolean> consumer) {
        if (z) {
            HealthData.saveHealthSetting(context, str);
            HealthData.updateUserGoalSteps(str);
        }
        Log.d(a, "Sync User StepGoal [" + i + "] To Watch, Success: " + z, new Object[0]);
        consumer.accept(Boolean.valueOf(z));
    }

    public static void S(Context context, Transporter transporter) {
        Log.d(a, "Sync AllUserSettings!!", new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_USER_SETTINGS, KeyValueUtil.toJsonStr(UserSettingsManager.getManager(context).getAllWatch()));
        transporter.send(CompanionModule.ACTION_SYNC_USER_SETTINGS, dataBundle);
    }

    private static void T(@NonNull Transporter transporter, Transporter.DataSendResultCallback dataSendResultCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        String id = timeZone.getID();
        int rawOffset = timeZone.getRawOffset();
        int dSTSavings = timeZone.getDSTSavings();
        boolean zInDaylightTime = timeZone.inDaylightTime(new Date());
        Log.d(a, "SyncSystemTime: " + jCurrentTimeMillis + ", TimezoneId : " + id + ", TZRawOffset: " + rawOffset + ", TZDSTSavings: " + dSTSavings + ", Use DST: " + timeZone.useDaylightTime() + ", In DST: " + zInDaylightTime, new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putLong(b, jCurrentTimeMillis);
        dataBundle.putString(c, id);
        dataBundle.putInt(d, rawOffset);
        dataBundle.putInt(e, dSTSavings);
        dataBundle.putBoolean(f, zInDaylightTime);
        transporter.send(CompanionModule.ACTION_SYNC_TIME, dataBundle, dataSendResultCallback);
    }

    private static void U(Context context, @NonNull Transporter transporter) {
        String uid = Account.getUID(context);
        if (TextUtils.isEmpty(uid)) {
            Log.w(a, "UID is Empty!!", new Object[0]);
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("UID", uid);
        dataBundle.putBoolean(CompanionModule.KEY_USER_OVERSEA, Account.isOversea(context));
        dataBundle.putString(CompanionModule.KEY_USER_MI_ID, Account.getMIID(context));
        dataBundle.putString(CompanionModule.KEY_APP_VERSION, AppUtil.getVersionName(context));
        dataBundle.putInt(CompanionModule.KEY_APP_VERSION_CODE, AppUtil.getVersionCode(context));
        dataBundle.putString(CompanionModule.KEY_APP_PLATFORM, "Android");
        dataBundle.putString(CompanionModule.KEY_USER_COUNTRY, Account.getUserCountry(context));
        transporter.send(CompanionModule.ACTION_SYNC_UID, dataBundle);
    }

    private static void V(Context context, @NonNull UserInfo userInfo) {
        Intent intent = new Intent(context, (Class<?>) BGService_msg.class);
        intent.setAction(DataPackingManager.ACTION_UPDATE_USER_INFO);
        Bundle bundle = new Bundle();
        bundle.putInt("gender", userInfo.getGender());
        bundle.putInt("year", userInfo.getBirthday().getYear());
        bundle.putInt("month", userInfo.getBirthday().getMonth());
        bundle.putInt("height", userInfo.getHeight());
        bundle.putFloat("weight", userInfo.getWeight());
        intent.putExtra("bd", bundle);
        context.startService(intent);
    }

    @Deprecated
    private static void W(Context context, String str, String str2) {
        Log.d(a, "Sync Selected : <" + str + ", " + str2 + SearchCriteria.GT, new Object[0]);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) BGService_msg.class);
        intent.setAction(DataPackingManager.ACTION_HUAMI_DATASEND);
        intent.putExtra("url", ArrivedDataUnpackingManager.ACTION_WALL_RECEIVER);
        Bundle bundle = new Bundle();
        bundle.putString(Constant.h, WatchFaceArrivingEvent.CMD_SET);
        bundle.putString("packagename", str);
        bundle.putString("servicename", str2);
        intent.putExtra("bd", bundle);
        context.startService(intent);
    }

    private static boolean X(Context context, @NonNull Device device, String str, int i) {
        return DoLooper.doLoop(new c(context, device, str), 500, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static DoLooper.Result s(Context context, @NonNull Device device, String str) {
        DoLooper.Result result = new DoLooper.Result();
        if (device.isConnected() && DeviceManager.getManager(context).isChannelAvailable(str)) {
            result.finish = true;
            result.success = true;
        }
        return result;
    }

    public static void sendAllDayStress(final Context context, final boolean z, final Consumer<Boolean> consumer) {
        final String healthSettingAllDayStress = HealthData.getHealthSettingAllDayStress(context, z);
        if (TextUtils.isEmpty(healthSettingAllDayStress)) {
            Log.d(a, "Send AllDay Stress, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        } else if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.sendIsAllDayStress(z, new Consumer() { // from class: uj7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SyncUtil.t(context, z, healthSettingAllDayStress, consumer, (Boolean) obj);
                }
            });
        }
    }

    public static void sendEnableMusicControl(Context context, boolean z) {
        if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleNotificationHelper.sendEnableMusicControl(z);
        } else {
            syncUserSettingToWatch(context, UserSettingsKeys.KEY_WATCH_MUSIC_CONTROLLER, Boolean.valueOf(z), (Transporter.DataSendResultCallback) null);
        }
    }

    public static void syncAfDisturbTimeToWatch(final Context context, final String str, final Consumer<Boolean> consumer) {
        final String healthSettingAfDisturbTime = HealthData.getHealthSettingAfDisturbTime(context, str);
        if (!TextUtils.isEmpty(healthSettingAfDisturbTime)) {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingAfDisturbTime, new Transporter.DataSendResultCallback() { // from class: zj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.u(context, str, healthSettingAfDisturbTime, consumer, dataTransportResult);
                }
            });
        } else {
            Log.d(a, "Sync AfDisturbTime To Watch, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        }
    }

    public static void syncAtrialFibrillationToWatch(final Context context, final boolean z, final Consumer<Boolean> consumer) {
        final String healthSettingAtrialFibrillation = HealthData.getHealthSettingAtrialFibrillation(context, z);
        if (!TextUtils.isEmpty(healthSettingAtrialFibrillation)) {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingAtrialFibrillation, new Transporter.DataSendResultCallback() { // from class: nj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.v(context, z, healthSettingAtrialFibrillation, consumer, dataTransportResult);
                }
            });
        } else {
            Log.d(a, "Sync AtrialFibrillation To Watch, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        }
    }

    public static void syncConfirmedPbToWatch(Context context, String str, List<PersonalBest> list) {
        String watchData = PBManager.get().toWatchData(list);
        Log.d(a, "syncConfirmedPbToWatch : " + watchData, new Object[0]);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_PB_DATA, watchData);
        transporter.send(str, dataBundle);
    }

    public static void syncExtraInfoToWatch(Transporter transporter, int i, Transporter.DataSendResultCallback dataSendResultCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CompanionModule.KEY_ENABLE_UNLOCK_MIUI, i);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_EXTRA_INFO, jSONObject.toString());
        transporter.send(CompanionModule.ACTION_SYNC_EXTRA_INFO, dataBundle, dataSendResultCallback);
    }

    public static void syncIntervalRunToWatch(Context context, String str) {
        syncIntervalRunToWatch(context, str, null);
    }

    public static void syncLoginTokenToWatch(Context context) {
        Log.d(a, "syncLoginTokenToWatch", new Object[0]);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("LoginToken", Keeper.getLoginToken(context));
        transporter.send(CompanionModule.ACTION_SYNC_LOGIN_TOKEN, dataBundle);
    }

    public static void syncLongSitRemindToWatch(final Context context, final boolean z, final Consumer<Boolean> consumer) {
        final String healthSettingLongSitRemind = HealthData.getHealthSettingLongSitRemind(context, z);
        if (TextUtils.isEmpty(healthSettingLongSitRemind)) {
            Log.d(a, "Sync LongSit Remind To Watch, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        } else if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.sendSedentaryReminder(z, new Consumer() { // from class: sj7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SyncUtil.x(context, z, healthSettingLongSitRemind, consumer, (Boolean) obj);
                }
            });
        } else {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingLongSitRemind, new Transporter.DataSendResultCallback() { // from class: lj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.w(context, z, healthSettingLongSitRemind, consumer, dataTransportResult);
                }
            });
        }
    }

    public static void syncNotificationRemoveToWatch(StatusBarNotificationData statusBarNotificationData, Transporter transporter) {
        if (transporter == null) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable("data", statusBarNotificationData);
        transporter.send(TransportUri.ACTION_DEL, dataBundle, new Transporter.DataSendResultCallback() { // from class: pj7
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                SyncUtil.y(dataTransportResult);
            }
        });
    }

    public static void syncNotificationToWatch(StatusBarNotificationData statusBarNotificationData, Transporter transporter) {
        if (transporter == null) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable("data", statusBarNotificationData);
        transporter.send(TransportUri.ACTION_ADD, dataBundle, new Transporter.DataSendResultCallback() { // from class: qj7
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                SyncUtil.z(dataTransportResult);
            }
        });
    }

    public static void syncRequestBattery(Transporter transporter, boolean z) {
        if (transporter != null) {
            DataBundle dataBundle = new DataBundle();
            dataBundle.putBoolean(BatteryInfoHelper.KEY_SYNC, z);
            transporter.send(CompanionModule.ACTION_SYNC_BATTERY, dataBundle);
        }
    }

    public static void syncRequestDeviceStorage(Context context, Transporter transporter) {
        if (transporter != null) {
            transporter.send(CompanionModule.ACTION_SYNC_DEVICE_INFO_STORAGE);
        }
        Intent intent = new Intent(context, (Class<?>) BGService_msg.class);
        intent.setAction(DataPackingManager.ACTION_REQUEST_STATUS);
        intent.putExtra("url", DataPackingManager.ACTION_REQUEST_STATUS);
        context.startService(intent);
    }

    public static void syncReserveHeartRateToWatch(Context context, String str, Transporter.DataSendResultCallback dataSendResultCallback) {
        Log.d(a, "syncReserveHeartToWatch : " + str, new Object[0]);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_USER_SETTINGS, KeyValueUtil.toJsonStr(UserSettingsKeys.KEY_RESERVE_HEARTRATE, str));
        transporter.send(CompanionModule.ACTION_SYNC_USER_SETTINGS, dataBundle, dataSendResultCallback);
    }

    public static void syncStepGoalRemindToWatch(final Context context, final boolean z, final Consumer<Boolean> consumer) {
        final String healthSettingStepGoalRemind = HealthData.getHealthSettingStepGoalRemind(context, z);
        if (TextUtils.isEmpty(healthSettingStepGoalRemind)) {
            Log.d(a, "Sync StepGoal Remind To Watch, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        } else if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.sendEnableGoalRemind(z, new Consumer() { // from class: vj7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SyncUtil.B(context, z, healthSettingStepGoalRemind, consumer, (Boolean) obj);
                }
            });
        } else {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingStepGoalRemind, new Transporter.DataSendResultCallback() { // from class: mj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.A(context, z, healthSettingStepGoalRemind, consumer, dataTransportResult);
                }
            });
        }
    }

    public static void syncSystemTimeToWatch(Transporter transporter, Transporter.DataSendResultCallback dataSendResultCallback) {
        boolean zIsCurrentDeviceBLE = DeviceManager.getManager(CompanionApplication.getContext()).isCurrentDeviceBLE();
        Log.d(a, "Sync SystemTime To Watch, BLE: " + zIsCurrentDeviceBLE, new Object[0]);
        if (!zIsCurrentDeviceBLE) {
            T(transporter, dataSendResultCallback);
            return;
        }
        boolean zSyncSystemTimeToWatch = SyncBleUtil.syncSystemTimeToWatch();
        if (dataSendResultCallback != null) {
            dataSendResultCallback.onResultBack(new DataTransportResult(new TransportDataItem(), !zSyncSystemTimeToWatch ? 1 : 0));
        }
    }

    public static void syncSystemTimeToWatchClassic(@NonNull Transporter transporter) {
        T(transporter, null);
    }

    public static void syncUnbindToWatch(Transporter transporter, @NonNull Transporter.DataSendResultCallback dataSendResultCallback) {
        boolean z = !Config.isTestMode();
        Log.d(a, "Sync Unbind To Watch, ResetWatch : " + z, new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putBoolean("ResetDevice", z);
        transporter.send(CompanionModule.ACTION_UNBIND, dataBundle, dataSendResultCallback);
    }

    public static void syncUnitToWatch(final Context context, Transporter transporter) {
        DataBundle dataBundle = new DataBundle();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("distance", UnitManager.getInstance(context).getDistanceUnit());
            jSONObject.put("height", UnitManager.getInstance(context).getHeightUnit());
            jSONObject.put("weight", UnitManager.getInstance(context).getWeightUnit());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        String string = jSONObject.toString();
        Log.d(a, "Sync Unit To Watch : " + string, new Object[0]);
        dataBundle.putString(CompanionModule.KEY_UNIT_CN, string);
        dataBundle.putInt("AppChannel", 0);
        transporter.send(CompanionModule.ACTION_SYNC_UNIT, dataBundle, new Transporter.DataSendResultCallback() { // from class: wj7
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                SyncUtil.C(context, dataTransportResult);
            }
        });
    }

    public static void syncUnlockStatusToWatch(Context context, Transporter transporter) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null || !DeviceCompatibility.isSupportUnlockScreen(context)) {
            return;
        }
        boolean zHasUnlockByWatch = UnlockUtil.hasUnlockByWatch(context, currentDevice.addressShort());
        Log.d(a, "Sync Unlock Status To Watch : " + zHasUnlockByWatch, new Object[0]);
        syncExtraInfoToWatch(transporter, zHasUnlockByWatch ? 1 : 0, null);
    }

    public static void syncUserCalorieGoalToWatch(final Context context, final int i, final Consumer<Boolean> consumer) {
        final String healthSettingCalorie = HealthData.getHealthSettingCalorie(context, i);
        HealthData.saveHealthSetting(context, healthSettingCalorie);
        HealthData.updateUserGoalCalorie(healthSettingCalorie);
        if (TextUtils.isEmpty(healthSettingCalorie)) {
            Log.d(a, "Sync User CalorieGoal To Watch, Success: false", new Object[0]);
            if (consumer != null) {
                consumer.accept(Boolean.FALSE);
                return;
            }
            return;
        }
        if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.sendUserCalorieGoal(i, new Consumer() { // from class: jj7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SyncUtil.E(context, i, healthSettingCalorie, consumer, (Boolean) obj);
                }
            });
        } else {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingCalorie, new Transporter.DataSendResultCallback() { // from class: xj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.D(context, i, healthSettingCalorie, consumer, dataTransportResult);
                }
            });
        }
    }

    public static void syncUserHeartRateAllDayToWatch(final Context context, final boolean z, final Consumer<Boolean> consumer) {
        final String healthSettingHRAllDay = HealthData.getHealthSettingHRAllDay(context, z);
        if (TextUtils.isEmpty(healthSettingHRAllDay)) {
            Log.d(a, "Sync User HeartRate AllDay To Watch, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        } else if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.sendUserHeartRateAllDay(z, new Consumer() { // from class: tj7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SyncUtil.G(context, z, healthSettingHRAllDay, consumer, (Boolean) obj);
                }
            });
        } else {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingHRAllDay, new Transporter.DataSendResultCallback() { // from class: kj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.F(context, z, healthSettingHRAllDay, consumer, dataTransportResult);
                }
            });
        }
    }

    public static void syncUserInfoFromCloudAsync(Context context) {
        Rx.io(new b(context)).safeSubscribe();
    }

    public static boolean syncUserInfoToCloud(Context context, UserInfo userInfo) {
        Log.d(a, "Sync UserInfo To Cloud : " + userInfo, new Object[0]);
        if (!UserInfoManager.get().isCloudNeedSync()) {
            return true;
        }
        UserInfoAPI.PostUserInfoResult postUserInfoResultPostUserInfo = UserInfoAPI.postUserInfo(context, userInfo);
        if (postUserInfoResultPostUserInfo.success) {
            if (!TextUtils.isEmpty(postUserInfoResultPostUserInfo.avatarUrl)) {
                userInfo.setAvatar(postUserInfoResultPostUserInfo.avatarUrl);
            }
            userInfo.setCloudSynced();
            UserInfoManager.save(userInfo);
        }
        return postUserInfoResultPostUserInfo.success;
    }

    public static void syncUserInfoToCloudAsync(Context context) {
        UserInfo userInfo = UserInfoManager.get();
        if (userInfo.isCloudNeedSync()) {
            syncUserInfoToCloudAsync(context, userInfo);
        }
    }

    @WorkerThread
    public static void syncUserInfoToWatch(Context context, Transporter transporter) {
        boolean zIsCurrentDeviceBLE = DeviceManager.getManager(context).isCurrentDeviceBLE();
        Log.d(a, "Sync UserInfo to Watch, BLE: " + zIsCurrentDeviceBLE, new Object[0]);
        if (zIsCurrentDeviceBLE) {
            SyncBleUtil.syncUserInfoToWatch(context);
        } else {
            syncUserInfoToWatchClassic(context, transporter);
        }
    }

    public static void syncUserInfoToWatchClassic(Context context, @NonNull Transporter transporter) {
        U(context, transporter);
        UserInfo userInfo = UserInfoManager.get();
        Log.d(a, "Sync UserInfo to Watch: " + userInfo, new Object[0]);
        if (UserInfoManager.hasEmptyInfo(userInfo)) {
            Log.w(a, "UserInfo is Empty : " + userInfo, new Object[0]);
            return;
        }
        V(context, userInfo);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable(CompanionModule.KEY_USER_INFO, userInfo);
        transporter.send(CompanionModule.ACTION_SYNC_USER_INFO, dataBundle);
    }

    public static void syncUserSavedSelectedWatchFace(Context context) {
        syncUserSavedSelectedWatchFace(context, DeviceManager.getManager(context).getCurrentDevice());
    }

    public static void syncUserSettingToWatch(Transporter transporter, String str, Object obj, Transporter.DataSendResultCallback dataSendResultCallback) {
        Log.d(a, "Sync UserSettings : " + str + ", " + obj, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_USER_SETTINGS, KeyValueUtil.toJsonStr(str, String.valueOf(obj)));
        transporter.send(CompanionModule.ACTION_SYNC_USER_SETTINGS, dataBundle, dataSendResultCallback);
    }

    public static void syncUserStepGoalToWatch(final Context context, final int i, final Consumer<Boolean> consumer) {
        final String healthSettingSteps = HealthData.getHealthSettingSteps(context, i);
        if (TextUtils.isEmpty(healthSettingSteps)) {
            Log.d(a, "Sync User StepGoal To Watch, Success: false", new Object[0]);
            consumer.accept(Boolean.FALSE);
        } else if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.sendUserStepGoal(i, new Consumer() { // from class: rj7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SyncUtil.I(context, i, healthSettingSteps, consumer, (Boolean) obj);
                }
            });
        } else {
            syncUserSettingToWatch(context, "huami.watch.health.config", healthSettingSteps, new Transporter.DataSendResultCallback() { // from class: yj7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncUtil.H(context, i, healthSettingSteps, consumer, dataTransportResult);
                }
            });
        }
    }

    public static void syncWatchFaceToWatch(Context context, String str, String str2) {
        Log.d(a, "Sync Selected New: <" + str + ", " + str2 + SearchCriteria.GT, new Object[0]);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        W(context, str, str2);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("packagename", str);
        dataBundle.putString("servicename", str2);
        transporter.send(CompanionModule.ACTION_SET_WATCH_FACE, dataBundle);
        InitialState.setUserSavedWatchFaceSyncedToWatch(true);
    }

    public static void syncWatchFacesFromWatch(Transporter transporter) {
        Log.d(a, "Sync WatchFaces With Watch!!", new Object[0]);
        Device currentDevice = DeviceManager.getManager(CompanionApplication.getContext()).getCurrentDevice();
        if (currentDevice == null || TextUtils.isEmpty(currentDevice.getCpuId())) {
            Log.d(a, "Sync watchFaces abort:device error!", new Object[0]);
            return;
        }
        if (DeviceFeature.isSupportCloudWatchFaceList(currentDevice)) {
            return;
        }
        Log.d(a, "Sync WatchFaces Device:" + currentDevice.info().getHuamiModel(), new Object[0]);
        List<WatchFace> all = WatchFaceManager.getManager().getAll(currentDevice.getCpuId());
        JSONArray jSONArray = new JSONArray();
        try {
            for (WatchFace watchFace : all) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pkgName", watchFace.packageName);
                jSONObject.put("serviceName", watchFace.serviceName);
                jSONObject.put("label", watchFace.label);
                jSONObject.put("hasSlpt", Boolean.toString(watchFace.hasSlpt));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("watchfaces", jSONArray.toString());
        transporter.send(CompanionModule.ACTION_SYNC_WATCH_FACE, dataBundle, new Transporter.DataSendResultCallback() { // from class: oj7
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                dataTransportResult.getResultCode();
            }
        });
    }

    public static void syncWeatherCityToWatch(Context context) {
        String str = WatchSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_USER_CITY);
        Log.d(a, "syncWeatherCityToWatch : " + str, new Object[0]);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_WEATHER_CITY, str);
        transporter.send(CompanionModule.ACTION_SYNC_WEATHER_CITY, dataBundle);
    }

    public static void syncWeatherConfigToWatch(Context context) {
        boolean zIsUnitFahrenheit = WeatherWatchExtender.isUnitFahrenheit(context);
        boolean zIsDailyNotificationEnabled = WeatherWatchExtender.isDailyNotificationEnabled(context);
        boolean zIsWarningNotificationEnabled = WeatherWatchExtender.isWarningNotificationEnabled(context);
        if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.syncWeatherTemperatureUnitToWatch(zIsUnitFahrenheit);
            SyncBleUtil.sendWeatherDailyNotify(zIsDailyNotificationEnabled, null);
            return;
        }
        String str = Unit.getTemperatureUnit(zIsUnitFahrenheit) + (zIsDailyNotificationEnabled ? 1 : 0) + (zIsWarningNotificationEnabled ? 1 : 0);
        Log.d(a, "Sync WeatherConfig To Watch: " + str, new Object[0]);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_WEATHER_CONFIG, str);
        transporter.send(CompanionModule.ACTION_SYNC_WEATHER_CONFIG, dataBundle);
    }

    public static void syncWidgetSortToWatch(Context context) {
        syncWidgetSortToWatch(context, Transporter.get(context, "com.huami.watch.companion"));
    }

    public static void syncXiaoMiTokenToWatch(Context context) {
        String string = Box.get().getString("MiAccessToken");
        String string2 = Box.get().getString("MiRefreshToken");
        long j = Box.get().getLong("MiTokenExpiresIn");
        Log.d(a, "syncXiaoMiTokenToWatch accessToken : " + string + ", refreshToken : " + string2 + ", expiresIn : " + j, new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("MiAccessToken", string);
        dataBundle.putString("MiRefreshToken", string2);
        dataBundle.putLong("MiTokenExpiresIn", j);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        if (transporter != null) {
            transporter.send(CompanionModule.ACTION_SYNC_XIAO_MI_TOKEN, dataBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Context context, boolean z, String str, Consumer consumer, Boolean bool) {
        K(context, z, bool.booleanValue(), str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Context context, String str, String str2, Consumer consumer, DataTransportResult dataTransportResult) {
        L(context, str, dataTransportResult.getResultCode() == 0, str2, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Context context, boolean z, String str, Consumer consumer, DataTransportResult dataTransportResult) {
        M(context, z, dataTransportResult.getResultCode() == 0, str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context, boolean z, String str, Consumer consumer, DataTransportResult dataTransportResult) {
        N(context, z, dataTransportResult.getResultCode() == 0, str, consumer);
    }

    public static boolean waitCurrentDeviceChannelAvailable(Context context) {
        return waitCurrentDeviceChannelAvailable(context, 10);
    }

    public static boolean waitDeviceChannelAvailable(Context context, Device device) {
        return waitDeviceChannelAvailable(context, device, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Context context, boolean z, String str, Consumer consumer, Boolean bool) {
        N(context, z, bool.booleanValue(), str, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(DataTransportResult dataTransportResult) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(DataTransportResult dataTransportResult) {
    }

    public static void syncIntervalRunToWatch(Context context, String str, Transporter.DataSendResultCallback dataSendResultCallback) {
        Log.d(a, "syncIntervalRunToWatch : " + str, new Object[0]);
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(CompanionModule.KEY_USER_SETTINGS, KeyValueUtil.toJsonStr(UserSettingsKeys.KEY_INTERVAL_RUN, str));
        transporter.send(CompanionModule.ACTION_SYNC_USER_SETTINGS, dataBundle, dataSendResultCallback);
    }

    public static void syncUserSavedSelectedWatchFace(Context context, Device device) {
        if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            return;
        }
        if (InitialState.isUserSavedWatchFaceSyncedToWatch() || device == null) {
            Log.w(a, "Device : " + device + " or already synced, Abort!!", new Object[0]);
            return;
        }
        WatchFace userSelectedWatchFace = WatchFaceManager.getManager().getUserSelectedWatchFace(context, device.getCpuId());
        Log.i(a, "Sync saved WatchFace from Cloud to Watch : " + userSelectedWatchFace, new Object[0]);
        if (userSelectedWatchFace != null) {
            syncWatchFaceToWatch(context, userSelectedWatchFace.packageName, userSelectedWatchFace.serviceName);
        }
        InitialState.setUserSavedWatchFaceSyncedToWatch(true);
    }

    public static void syncWidgetSortToWatch(Context context, @NonNull Transporter transporter) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null) {
            return;
        }
        String strReplaceAll = WatchWidgetNewManager.get().getSyncWidgetToWatchJsonStr(context, DeviceUtil.getHuamiModel(currentDevice)).replaceAll("\\\\", "");
        Log.d(a, "Sync Widget To Watch : " + strReplaceAll, new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("json_str", strReplaceAll);
        transporter.send(CompanionModule.ACTION_SYNC_WIDGET, dataBundle);
        Intent intent = new Intent(context, (Class<?>) BGService_msg.class);
        intent.setAction(CompanionModule.ACTION_SYNC_WIDGET);
        intent.putExtra("url", CompanionModule.ACTION_SYNC_WIDGET);
        Bundle bundle = new Bundle();
        bundle.putString("json_str", strReplaceAll);
        intent.putExtra("bd", bundle);
        context.startService(intent);
    }

    public static boolean waitCurrentDeviceChannelAvailable(Context context, int i) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        return currentDevice != null && waitDeviceChannelAvailable(context, currentDevice, i);
    }

    public static boolean waitDeviceChannelAvailable(Context context, Device device, int i) {
        if (device == null) {
            Log.d(a, "Device is Null, Abort!!", new Object[0]);
            return false;
        }
        boolean zX = X(context, device, DeviceUtil.UNKNOWN_DID, i);
        Log.t(3).d(a, "Is Device ChannelAvailable : " + device + ", " + zX, new Object[0]);
        return zX;
    }

    public static void syncUserInfoToCloudAsync(Context context, @NonNull UserInfo userInfo) {
        Log.d(a, "Sync UserInfo To Cloud Async: " + userInfo, new Object[0]);
        Rx.io(new a(context, userInfo)).safeSubscribe();
    }

    public static void syncUserSettingToWatch(Context context, String str, Object obj, Transporter.DataSendResultCallback dataSendResultCallback) {
        syncUserSettingToWatch(Transporter.get(context, "com.huami.watch.companion"), str, obj, dataSendResultCallback);
    }
}
