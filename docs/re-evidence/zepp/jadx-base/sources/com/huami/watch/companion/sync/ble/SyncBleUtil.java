package com.huami.watch.companion.sync.ble;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.core.util.Consumer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.passport.Keeper;
import com.huami.passport.entity.HttpDNS;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.UserInfo;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.sport.pb.PersonalBest;
import com.huami.watch.companion.sync.SyncDataMapper;
import com.huami.watch.companion.weather.WeatherWatchExtender;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleUtil {
    private static final String a = "Sync-BLE-Util";

    public class a extends HMCallback {
        public final /* synthetic */ Consumer a;

        public a(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Sync WeatherInfo To Watch, Success: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class b extends HMCallback {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Sync Weather TemperatureUnit To Watch, Success:" + z, new Object[0]);
        }
    }

    public class c extends HMCallback {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Consumer b;

        public c(boolean z, Consumer consumer) {
            this.a = z;
            this.b = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send Weather DailyNotify, ON[" + this.a + "], Success:" + z, new Object[0]);
            Consumer consumer = this.b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class d extends HMCallback {
        public final /* synthetic */ HMAlertModeExt a;

        public d(HMAlertModeExt hMAlertModeExt) {
            this.a = hMAlertModeExt;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send Alert[" + this.a.getMode() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.a.getAlertApp() + "], Success: " + z, new Object[0]);
        }
    }

    public class e extends HMCallback {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Sync WatchFace [" + this.a + "] To Watch, Success: " + z, new Object[0]);
        }
    }

    public class f extends HMCallback {
        public final /* synthetic */ Consumer a;

        public f(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send Enable GoalRemind, Success: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class g extends HMCallback {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send Distance Unit, Success:" + z, new Object[0]);
        }
    }

    public class h extends HMCallback {
        public final /* synthetic */ Consumer a;

        public h(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send User StepGoal, Success: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class i extends HMCallback {
        public final /* synthetic */ Consumer a;

        public i(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send User CalorieGoal, Success: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class j extends HMCallback {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Consumer b;

        public j(boolean z, Consumer consumer) {
            this.a = z;
            this.b = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send User HeartRate AllDay, ON[" + this.a + "], Success:" + z, new Object[0]);
            Consumer consumer = this.b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class l extends HMCallback {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Consumer b;

        public l(boolean z, Consumer consumer) {
            this.a = z;
            this.b = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send AllDay Stress, ON[" + this.a + "], Success:" + z, new Object[0]);
            Consumer consumer = this.b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class n extends HMCallback {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Consumer b;

        public n(boolean z, Consumer consumer) {
            this.a = z;
            this.b = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send Sedentary Reminder, ON[" + this.a + "], Success:" + z, new Object[0]);
            Consumer consumer = this.b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public class p extends HMCallback {
        public final /* synthetic */ Consumer a;

        public p(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Send HeartRate Zone, Success: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    private static String a(Context context) {
        String json;
        LoginToken tokenCache = Keeper.getTokenCache(context);
        if (tokenCache != null) {
            Gson gsonCreate = new GsonBuilder().create();
            LoginToken loginToken = new LoginToken();
            ArrayList arrayList = new ArrayList();
            List<HttpDNS> domains = tokenCache.getDomains();
            if (domains != null && domains.size() > 0) {
                for (HttpDNS httpDNS : domains) {
                    if ("api-mifit.huami.com".equals(httpDNS.getHost())) {
                        arrayList.add(httpDNS);
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                Log.d(a, "domains is Empty!!!", new Object[0]);
                return null;
            }
            loginToken.setDomains(arrayList);
            UserInfo.RegistInfo registInfo = new UserInfo.RegistInfo();
            UserInfo.RegistInfo registInfo2 = tokenCache.getRegistInfo();
            if (registInfo2 != null) {
                registInfo.setRegion(registInfo2.getRegion());
                registInfo.setCountryCode(registInfo2.getCountryCode());
            }
            loginToken.setRegistInfo(registInfo);
            TokenInfo tokenInfo = new TokenInfo();
            TokenInfo tokenInfo2 = tokenCache.getTokenInfo();
            if (tokenInfo2 != null) {
                tokenInfo.setUserId(tokenInfo2.getUserId());
                tokenInfo.setLoginToken(tokenInfo2.getLoginToken());
                tokenInfo.setAppToken(tokenInfo2.getAppToken());
            }
            loginToken.setTokenInfo(tokenInfo);
            json = gsonCreate.toJson(loginToken);
        } else {
            json = null;
        }
        int length = json == null ? 0 : json.getBytes().length;
        Log.d(a, "send LoginToken :" + length, new Object[0]);
        if (length <= 1023) {
            return json;
        }
        Log.e(a, "send LoginToken  size more than 1KB!!!!", new Object[0]);
        return null;
    }

    private static void b(HMAlertApp hMAlertApp, String str, String str2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            Log.w(a, "Alert is Empty, Abort!!", new Object[0]);
        } else {
            c(new HMAlertModeExt(hMAlertApp, str, str2));
        }
    }

    public static void c(@NonNull HMAlertModeExt hMAlertModeExt) {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.alert(hMAlertModeExt, new d(hMAlertModeExt));
        }
    }

    @WorkerThread
    public static int getWatchFaceSelected() {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        int iIntValue = hMSmartWatchDevice != null ? hMSmartWatchDevice.getSkinIdSync().intValue() : 0;
        Log.d(a, "Get WatchFace Selected: " + iIntValue, new Object[0]);
        return iIntValue;
    }

    @WorkerThread
    public static List<Integer> getWatchFaces() {
        ArrayList arrayList = new ArrayList();
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            arrayList.addAll(hMSmartWatchDevice.getWatchFacesAllSync());
        }
        Log.d(a, "Get WatchFaces: " + ArraysUtil.toString(arrayList), new Object[0]);
        return arrayList;
    }

    @WorkerThread
    public static List<SmartWatchProfile.BleWidget> getWidgets() {
        ArrayList arrayList = new ArrayList();
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            arrayList.addAll(hMSmartWatchDevice.getWidgetsAll());
        }
        Log.d(a, "Get Widgets: " + ArraysUtil.toString(arrayList), new Object[0]);
        return arrayList;
    }

    public static void requestIsAllDayStress(Consumer<Object> consumer) {
        Log.d(a, "Request AllDay Stress...", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.isAllDayPressureEnabled(new m(consumer));
        }
    }

    public static void requestSedentaryReminderEnabled(Consumer<Object> consumer) {
        Log.d(a, "Request Sedentary Reminder Enabled...", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.isSedentaryReminderEnabled(new o(consumer));
        }
    }

    public static void sendAlertFindWatch() {
        Log.d(a, "Send Alert FindWatch...", new Object[0]);
        c(new HMAlertModeExt(HMAlertMode.ALERT_FIND));
    }

    public static void sendDistanceUnit(boolean z) {
        Log.d(a, "Send Distance Unit: Metric[" + z + "]...", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.setDistanceUnit(z, new g());
        }
    }

    public static void sendEnableGoalRemind(boolean z, Consumer<Boolean> consumer) {
        Log.d(a, "Send Enable GoalRemind: " + z, new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.enableGoalRemind(z, new f(consumer));
        }
    }

    public static void sendHeartRateZone(HMMiLiProDevice hMMiLiProDevice, byte b2, byte[] bArr, byte[] bArr2, byte b3, Consumer<Boolean> consumer) {
        Log.d(a, "Send HeartRate Zone...", new Object[0]);
        if (hMMiLiProDevice != null) {
            hMMiLiProDevice.setHeartRateZone(b2, bArr, bArr2, b3, new p(consumer));
        }
    }

    public static void sendIsAllDayStress(boolean z, Consumer<Boolean> consumer) {
        Log.d(a, "Send AllDay Stress, ON[" + z + "]", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.enableAllDayPressure(z, new l(z, consumer));
        }
    }

    @WorkerThread
    public static boolean sendLoginToken(Context context) {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        String strA = a(context);
        boolean zSyncLoginToken = (hMSmartWatchDevice == null || TextUtils.isEmpty(strA)) ? false : hMSmartWatchDevice.syncLoginToken(strA);
        Log.d(a, "Send Login Token  [" + strA + "], Success: " + zSyncLoginToken, new Object[0]);
        return zSyncLoginToken;
    }

    @WorkerThread
    public static boolean sendPBInfos(List<PersonalBest> list, boolean z) {
        List<SmartWatchProfile.BlePBInfo> blePBWatchData = SyncDataMapper.toBlePBWatchData(list);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        boolean pBInfos = hMSmartWatchDevice != null ? hMSmartWatchDevice.setPBInfos(blePBWatchData, z) : false;
        Log.d(a, "Send PBInfo [" + ArraysUtil.toString(blePBWatchData) + "], Success: " + pBInfos, new Object[0]);
        return pBInfos;
    }

    public static void sendSedentaryReminder(boolean z, Consumer<Boolean> consumer) {
        Log.d(a, "Send Sedentary Reminder, ON[" + z + "]", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            HMSedentaryConfig hMSedentaryConfig = new HMSedentaryConfig();
            hMSedentaryConfig.setEnable(z);
            hMSedentaryConfig.setInterval((short) 0);
            hMSedentaryConfig.setPeriodEnable(false);
            hMSedentaryConfig.setStartIndex(0);
            hMSedentaryConfig.setStopIndex(0);
            hMSmartWatchDevice.setSedentaryReminder(hMSedentaryConfig, new n(z, consumer));
        }
    }

    public static void sendUserCalorieGoal(Context context) {
        sendUserCalorieGoal(HealthData.getUserGoalCal(context), null);
    }

    public static void sendUserHeartRateAllDay(Context context) {
        sendUserHeartRateAllDay(HealthData.isAllDayHR(context), null);
    }

    public static void sendUserStepGoal(Context context) {
        sendUserStepGoal(HealthData.getUserGoalSteps(context), null);
    }

    public static void sendWeatherDailyNotify(Context context) {
        sendWeatherDailyNotify(WeatherWatchExtender.isDailyNotificationEnabled(context), null);
    }

    public static void sendWeatherSettings(Context context) {
        boolean zIsUnitFahrenheit = WeatherWatchExtender.isUnitFahrenheit(context);
        boolean zIsDailyNotificationEnabled = WeatherWatchExtender.isDailyNotificationEnabled(context);
        syncWeatherTemperatureUnitToWatch(zIsUnitFahrenheit);
        sendWeatherDailyNotify(zIsDailyNotificationEnabled, null);
    }

    @WorkerThread
    public static boolean syncSystemTimeToWatch() {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        boolean dateTimeSync = hMSmartWatchDevice.setDateTimeSync(calendar);
        Log.d(a, "Sync SystemTime [" + calendar + ", " + TimeUtil.formatDateTime(calendar.getTimeInMillis()) + "] To Watch, Success: " + dateTimeSync, new Object[0]);
        return dateTimeSync;
    }

    public static void syncUserHeartRateAllDayFromWatch(Consumer<Object> consumer) {
        Log.d(a, "Sync User HeartRate AllDay From Watch...", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.isHRAllDayEnabled(new k(consumer));
        }
    }

    @WorkerThread
    public static void syncUserInfoToWatch(Context context) {
        GenderExt genderExt;
        int iIntValue;
        com.huami.watch.companion.account.UserInfo userInfo = UserInfoManager.get();
        Log.d(a, "Sync UserInfo To Watch: " + userInfo, new Object[0]);
        if (UserInfoManager.hasEmptyInfo(userInfo)) {
            Log.w(a, "UserInfo has Empty item, Abort!!", new Object[0]);
            return;
        }
        UserInfoExt userInfoExt = new UserInfoExt();
        int gender = userInfo.getGender();
        if (gender != 0) {
            genderExt = gender != 1 ? GenderExt.UNSPECIFIED : GenderExt.MALE;
        } else {
            genderExt = GenderExt.FEMALE;
        }
        userInfoExt.setGender(genderExt);
        userInfoExt.setBirthDate(new BirthDateExt((short) userInfo.getBirthday().getYear(), (byte) userInfo.getBirthday().getMonth(), (byte) 0));
        userInfoExt.setHeight((short) userInfo.getHeight());
        userInfoExt.setWeight((short) userInfo.getWeight());
        String uid = Account.getUID(context);
        Log.d(a, "Sync UID To Watch: " + uid, new Object[0]);
        if (TextUtils.isEmpty(uid)) {
            iIntValue = 0;
        } else {
            try {
                iIntValue = Integer.valueOf(uid).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                iIntValue = 0;
            }
        }
        userInfoExt.setUid(iIntValue);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            Log.d(a, "Sync UserInfo To Watch, Success: " + hMSmartWatchDevice.setUserInfoSync(userInfoExt), new Object[0]);
        }
    }

    @AnyThread
    public static void syncWatchFaceToWatch(int i2) {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.setWatchFace(i2, new e(i2));
        }
    }

    public static void syncWeatherAlertToWatch(String str, String str2) {
        Log.d(a, "Sync Weather Alert To Watch...", new Object[0]);
        b(HMAlertApp.WEATHER_ALERT, str, str2);
    }

    public static void syncWeatherInfoToWatch(Function0<HMWeatherInfo> function0, Consumer<Boolean> consumer) {
        if (function0 == null) {
            Log.w(a, "WeatherInfo is Null, Abort!!", new Object[0]);
            return;
        }
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.setWeatherInfo(function0, new a(consumer));
        }
    }

    public static void syncWeatherTemperatureUnitToWatch(boolean z) {
        Log.d(a, "Sync Weather TemperatureUnit To Watch [Unit is F: " + z + "]", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.setWeatherTemperatureUnitAsync(z, new b());
        }
    }

    @WorkerThread
    public static boolean syncWidgetsToWatch(List<SmartWatchProfile.BleWidget> list) {
        if (ArraysUtil.isEmpty(list)) {
            Log.d(a, "Widgets is Empty, Abort!!", new Object[0]);
            return false;
        }
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        boolean widgets = hMSmartWatchDevice != null ? hMSmartWatchDevice.setWidgets(list) : false;
        Log.d(a, "Sync Widgets To Watch [" + ArraysUtil.toString(list) + "], Success: " + widgets, new Object[0]);
        return widgets;
    }

    public class k extends HMCallback<Object> {
        public final /* synthetic */ Consumer a;

        public k(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Sync User HeartRate AllDay, ON: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(Object obj) {
            Log.d(SyncBleUtil.a, "Sync User HeartRate AllDay, Result: " + obj, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(obj);
            }
        }
    }

    public class m extends HMCallback<Object> {
        public final /* synthetic */ Consumer a;

        public m(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Request AllDay Stress, ON: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(Object obj) {
            Log.d(SyncBleUtil.a, "Request AllDay Stress, Result: " + obj, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(obj);
            }
        }
    }

    public class o extends HMCallback<Object> {
        public final /* synthetic */ Consumer a;

        public o(Consumer consumer) {
            this.a = consumer;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleUtil.a, "Request Sedentary Reminder, ON: " + z, new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(Object obj) {
            Log.d(SyncBleUtil.a, "Request Sedentary Reminder Fail!!", new Object[0]);
            Consumer consumer = this.a;
            if (consumer != null) {
                consumer.accept(obj);
            }
        }
    }

    public static void sendUserCalorieGoal(int i2, Consumer<Boolean> consumer) {
        Log.d(a, "Send User CalorieGoal: " + i2, new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.setCalorieGoal(i2, new i(consumer));
        }
    }

    public static void sendUserHeartRateAllDay(boolean z, Consumer<Boolean> consumer) {
        Log.d(a, "Send User HeartRate AllDay, ON[" + z + "]", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.enableHRAllDay(z, new j(z, consumer));
        }
    }

    public static void sendUserStepGoal(int i2, Consumer<Boolean> consumer) {
        Log.d(a, "Send User StepGoal: " + i2, new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.setGoal(i2, new h(consumer));
        }
    }

    public static void sendWeatherDailyNotify(boolean z, Consumer<Boolean> consumer) {
        Log.d(a, "Send Weather DailyNotify, ON[" + z + "]", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.enableWeatherDailyNotify(z, new c(z, consumer));
        }
    }
}
