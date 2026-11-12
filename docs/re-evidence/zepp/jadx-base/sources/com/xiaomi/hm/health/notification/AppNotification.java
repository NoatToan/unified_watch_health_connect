package com.xiaomi.hm.health.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.huami.mifit.analytics.Analytics;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.sleep.napsleep.ui.NapSleepDetailActivity;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.step.ui.StepInfoActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMVibrateType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMFwChangeLogActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.discovery.jsbridge.entity.SystemNotice;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.RankWebAPI;
import java.util.Calendar;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class AppNotification {
    public static final int ID_FEMALE_ALARM = 12;
    public static final int ID_FRIEND_MESSAGE = 8;
    private static final String b = "AppNotification";
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 7;
    private static final int h = 39;
    private static final int i = 9;
    private static final int j = 10;
    private static final int k = 11;
    private static final int l = 13;
    private static Bitmap n = null;
    private static final int p = 6000;
    private final DeviceXNavigator a = (DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class);
    private static final String m = HMConfig.getScheme() + "://" + HMConfig.getAppHost() + "/action?name=%s";
    private static NotificationManager o = (NotificationManager) BraceletApp.getContext().getSystemService(SleepHomeActivity.FROM_NOTIFICATION);

    public class a implements RankWebAPI.OnRankHandler {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        public a(final String[] val$title, final int val$step, final Context val$context, final String val$content) {
            this.a = val$title;
            this.b = val$step;
            this.c = val$context;
            this.d = val$content;
        }

        @Override // com.xiaomi.hm.health.webapi.RankWebAPI.OnRankHandler
        public void onFailed(String log) {
            HMLog.d(AppNotification.b, "failed log : " + log, new Object[0]);
            this.a[0] = AppNotification.this.h(this.b);
            HMLog.d(AppNotification.b, "title:" + this.a[0], new Object[0]);
            AppNotification.o.notify(1, AppNotification.f(this.a[0], this.d, PendingIntent.getActivity(this.c, 1, StepInfoActivity.INSTANCE.launchStepDetail(this.c, "", 16), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
            HMKeeper.setLastShownDailySportTime(Calendar.getInstance().getTimeInMillis());
            Analytics.event(this.c, StatEvent.EventId.MINE_PERFORMANCE_NOTIFICATION_VIEMNUM);
        }

        @Override // com.xiaomi.hm.health.webapi.RankWebAPI.OnRankHandler
        public void onRank(int rank) {
            HMLog.d(AppNotification.b, "rank : " + rank, new Object[0]);
            if (rank < 30) {
                this.a[0] = AppNotification.this.h(this.b);
            } else {
                this.a[0] = AppNotification.this.g(rank);
            }
            HMLog.d(AppNotification.b, "title:" + this.a[0], new Object[0]);
            AppNotification.o.notify(1, AppNotification.f(this.a[0], this.d, PendingIntent.getActivity(this.c, 1, StepInfoActivity.INSTANCE.launchStepDetail(this.c, "", 16), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
            HMKeeper.setLastShownDailySportTime(Calendar.getInstance().getTimeInMillis());
            Analytics.event(this.c, StatEvent.EventId.MINE_PERFORMANCE_NOTIFICATION_VIEMNUM);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMVibrateType.values().length];
            a = iArr;
            try {
                iArr[HMVibrateType.MOTOR_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMVibrateType.MOTOR_DISCONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMVibrateType.MOTOR_SMART_ALARM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMVibrateType.MOTOR_ALARM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMVibrateType.MOTOR_GOAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMVibrateType.MOTOR_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMVibrateType.MOTOR_SHUTDOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMVibrateType.MOTOR_AUTH_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMVibrateType.MOTOR_TEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMVibrateType.MOTOR_SPEED_WARNING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static void cancelFindPhoneNotification() {
        o.cancel(9);
        HMLog.i(b, "cancelFindPhoneNotification", new Object[0]);
    }

    public static void cancelFwUpgradeFinish() {
        o.cancel(11);
    }

    public static void cancelNapNotification(String date) {
        o.cancel(date, 13);
    }

    public static void cancelSBENotification() {
        o.cancel(10);
    }

    public static void cancelSleepNotification(String date) {
        o.cancel(date, 2);
    }

    public static Notification createImpNotification(String title, String content, PendingIntent intent) {
        return createNotification(title, content, R.drawable.app_icon, true, true, intent);
    }

    public static Notification createNotification(String title, String content, @DrawableRes int icon, boolean autoCancel, PendingIntent intent) {
        return createNotification(title, content, icon, false, autoCancel, intent);
    }

    private void e(final int step) {
        Context context = BraceletApp.getContext();
        String[] strArr = new String[1];
        String string = context.getString(R.string.app_day_report_content);
        if (!NetUtil.isNetworkConnected(context)) {
            strArr[0] = h(step);
        } else {
            strArr[0] = g(56);
            RankWebAPI.getTodayStepRank(step, new a(strArr, step, context, string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Notification f(String title, String content, PendingIntent intent) {
        return createNotification(title, content, R.drawable.app_icon, true, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g(int percent) {
        return BraceletApp.getContext().getResources().getQuantityString(R.plurals.app_day_report_title_rank, percent, Integer.valueOf(percent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h(int step) {
        return step >= 6000 ? BraceletApp.getContext().getString(R.string.app_day_report_title, Integer.valueOf(step)) : BraceletApp.getContext().getString(R.string.app_day_report_title_low, Integer.valueOf(step));
    }

    private boolean i() {
        return HMPersonInfo.getInstance().getMiliConfig().ismOpenSleepNotify();
    }

    private boolean j() {
        return !HMPersonInfo.getInstance().getMiliConfig().getDayReportNoti().equals(Constant.OFF);
    }

    public static AppNotification newInstance() {
        return new AppNotification();
    }

    public static void showFemaleAlarmNotification(String title, String desc) {
        Context context = BraceletApp.getContext();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(String.format(m, HMIntentHandler.NAME_FEMALE)));
        o.notify(12, f(title, desc, PendingIntent.getActivity(context, 12, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
    }

    public static void showFindPhoneNotification(HMDeviceSource source) {
        Context context = BraceletApp.getContext();
        Intent intent = new Intent(context, (Class<?>) StartUpActivity.class);
        intent.putExtra(StartUpActivity.FROM_NOTIFY_KEY, StartUpActivity.FROM_NOTIFY);
        o.notify(9, createImpNotification(context.getString(R.string.app_name), context.getString(R.string.find_phone_notification_tips, context.getString(HMDeviceConfig.hasBoundWatch() ? R.string.device_watch : R.string.device_band)), PendingIntent.getActivity(context, 9, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
        HMLog.i(b, "showFindPhoneNotification", new Object[0]);
    }

    public static void showFwUpgradeFinish(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            String changeLog = HMFwOnlineUpgradeManager.getInstance().getChangeLog(deviceInfo);
            if (!TextUtils.isEmpty(changeLog)) {
                Intent intent = new Intent(BraceletApp.getContext(), (Class<?>) HMFwChangeLogActivity.class);
                intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG, changeLog);
                Context context = BraceletApp.getContext();
                o.notify(11, f(context.getString(R.string.app_name), context.getString(R.string.fw_upgrade_finish_notify), PendingIntent.getActivity(context, 11, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
                return;
            }
        }
        HMLog.i(b, "not show fw!", new Object[0]);
    }

    public static void showJsBridgeNotification(SystemNotice notice) {
        if (notice == null) {
            return;
        }
        Context context = BraceletApp.getContext();
        Intent intent = new Intent(context, (Class<?>) StartUpActivity.class);
        intent.putExtra(StartUpActivity.FROM_NOTIFY_KEY, StartUpActivity.FROM_JS_BRIDGE);
        intent.putExtra(StartUpActivity.KEY_INTENT_TYPE, notice.intentType);
        intent.putExtra(StartUpActivity.KEY_INTENT_URL, notice.intentUrl);
        int iHashCode = notice.notifyId.hashCode();
        o.notify(iHashCode, f(notice.title, notice.description, PendingIntent.getActivity(context, iHashCode, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
    }

    public static void showNapNotification(String date) {
        Context context = BraceletApp.getContext();
        Intent intent = new Intent(context, (Class<?>) NapSleepDetailActivity.class);
        intent.putExtra("extra_date", date);
        o.notify(date, 13, f(context.getString(R.string.notify_sleep_sync_success), context.getString(R.string.notify_sleep_show_detail), PendingIntent.getActivity(context, (int) (SportDay.fromString(date).getTimestamp() / 1000), intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
        HMLog.i(b, "showNapNotification", new Object[0]);
    }

    public static void showSBENotification() {
        Context context = BraceletApp.getContext();
        Notification notificationF = f(context.getString(R.string.app_name), context.getString(R.string.sbe_notification), PendingIntent.getActivity(context, 10, new Intent("android.settings.BLUETOOTH_SETTINGS"), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456));
        notificationF.flags |= 2;
        o.notify(10, notificationF);
    }

    public void cancelBatteryLowNotification() {
        o.cancel(6);
    }

    public void cancelNormandyBatteryLowNotification() {
        o.cancel(7);
    }

    public void cancleBatteryFullNotification() {
        o.cancel(5);
    }

    public String getString(@StringRes int stringRes) {
        return BraceletApp.getContext().getString(stringRes);
    }

    public boolean notifyDeviceVibrated(HMVibrateType type) {
        String string;
        HMLog.d(b, "notifyBraceletVibrated:" + type, new Object[0]);
        Context context = BraceletApp.getContext();
        PendingIntent activity = PendingIntent.getActivity(context, 39, new Intent(context, (Class<?>) StartUpActivity.class), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456);
        switch (b.a[type.ordinal()]) {
            case 1:
                string = getString(R.string.notify_status_motor_call);
                break;
            case 2:
                string = getString(R.string.notify_status_motor_disconnect);
                break;
            case 3:
                string = getString(R.string.notify_status_motor_smart_alarm);
                break;
            case 4:
                string = getString(R.string.notify_status_motor_alarm);
                break;
            case 5:
                string = getString(R.string.notify_status_motor_goal);
                break;
            case 6:
                string = getString(R.string.notify_status_motor_auth);
                break;
            case 7:
                string = getString(R.string.notify_status_motor_shut_down);
                break;
            case 8:
                string = getString(R.string.notify_status_motor_auth_success);
                break;
            case 9:
                string = getString(R.string.notify_status_motor_test);
                break;
            case 10:
                return true;
            default:
                return false;
        }
        o.notify(39, f(getString(R.string.notify_status_motor), string, activity));
        return true;
    }

    public void onBatteryFullNotification(boolean isBand) {
        Context context = BraceletApp.getContext();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        if (device == null || device.getDeviceSource() == null) {
            return;
        }
        o.notify(5, f(getString(isBand ? R.string.bracelet_notify_title : R.string.watch_notify_title), "", PendingIntent.getActivity(context, 5, this.a.createDeviceSettingIntent(context, device.getDeviceSource()), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
    }

    public void onBatteryLowNotification(int level, boolean isBand) {
        String string;
        HMLog.d(b, "onBatteryLowNotification:" + level, new Object[0]);
        Context context = BraceletApp.getContext();
        String string2 = getString(isBand ? R.string.noti_bracelet_low_battery_title : R.string.noti_watch_low_battery_title);
        if (level > 10 || level <= 5) {
            if ((level > 0) && (level <= 5)) {
                string = getString(isBand ? R.string.noti_bracelet_low_battery_content_mid : R.string.noti_watch_low_battery_content_mid);
            } else if (level == 0) {
                string2 = getString(isBand ? R.string.noti_bracelet_low_battery_title_low : R.string.noti_watch_low_battery_title_low);
                string = getString(isBand ? R.string.noti_bracelet_low_battery_content_low : R.string.noti_watch_low_battery_content_low);
            } else {
                string = "";
            }
        } else {
            string = getString(isBand ? R.string.noti_bracelet_low_battery_content_high : R.string.noti_watch_low_battery_content_high);
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        if (device == null || device.getDeviceSource() == null) {
            return;
        }
        o.notify(6, f(string2, string, PendingIntent.getActivity(context, 6, this.a.createDeviceSettingIntent(context, device.getDeviceSource()), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
    }

    public void onNormandyBatteryLowNotification() {
        String string = getString(R.string.normandy_low_battery_notification_title, getString(R.string.chip_device_name));
        String string2 = getString(R.string.normandy_low_battery_notification_tips);
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        if (device == null || device.getDeviceSource() == null) {
            return;
        }
        o.notify(7, f(string, string2, PendingIntent.getActivity(BraceletApp.getContext(), 7, this.a.createDeviceSettingIntent(BraceletApp.getContext(), device.getDeviceSource()), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
    }

    public void showDailyReportNotifi() {
        StepsInfo todayStepInfo;
        if (TimeUtils.isToday(HMKeeper.getLastShownDailySportTime()) || !j()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        HMLog.d(b, "step hour:" + i2 + ",min:" + i3, new Object[0]);
        if ((i2 * 60) + i3 < 1290 || i2 >= 23 || (todayStepInfo = SportDataManager.getInstance().getTodayStepInfo()) == null) {
            return;
        }
        int stepsCount = todayStepInfo.getStepsCount();
        HMLog.d(b, "step : " + stepsCount, new Object[0]);
        if (stepsCount > 0) {
            e(stepsCount);
        }
    }

    public void showSleepNotification() {
        if (!i()) {
            HMLog.d(b, "Last show sleep notification time : " + TimeUtils.debugTime(HMKeeper.getLastShownDailySleepTime()), new Object[0]);
            return;
        }
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.app_sleep_report_content);
        Calendar calendar = Calendar.getInstance();
        int i2 = (calendar.get(11) * 60) + calendar.get(12);
        int i3 = SportDataManager.getInstance().getThisWeekSummery().dayWakeUpTime;
        if (i3 > 1440) {
            i3 += SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
        }
        HMLog.i(b, "now count:" + i2 + ", week count:" + i3, new Object[0]);
        if (i2 <= i3 || i2 < 420 || i2 > 630) {
            return;
        }
        HMLog.i(b, "now time : " + TimeUtils.debugTime(calendar.getTimeInMillis()), new Object[0]);
        SleepInfo sleepInfo = HMDataCacheCenter.getInstance().getTodaySportData().getSleepInfo();
        if (sleepInfo == null || !sleepInfo.getHasSleep()) {
            return;
        }
        HMLog.i(b, "sleep info : " + sleepInfo.toString(), new Object[0]);
        int sleepCount = sleepInfo.getSleepCount();
        if (TimeUtils.isToday(HMKeeper.getLastShownDailySleepTime()) && HMKeeper.getLastShownDailySleepCount() >= sleepCount) {
            HMLog.d(b, "today shown", new Object[0]);
            return;
        }
        String str = String.format(context.getString(R.string.app_sleep_report_title), Integer.valueOf(sleepCount / 60), Integer.valueOf(sleepCount % 60));
        Intent intent = new Intent(context, (Class<?>) SleepHomeActivity.class);
        intent.putExtra("type", 1);
        o.notify(2, f(str, string, PendingIntent.getActivity(context, 2, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
        HMKeeper.setLastShownDailySleepTime(Calendar.getInstance().getTimeInMillis());
        HMKeeper.setLastShownDailySleepCount(sleepCount);
        Analytics.event(context, StatEvent.EventId.MINE_SLEEP_NOTIFICATION_VIEMNUM);
    }

    public static Notification createNotification(String title, String content, @DrawableRes int icon, boolean high, boolean autoCancel, PendingIntent intent) {
        Context context = BraceletApp.getContext();
        String simpleName = AppNotification.class.getSimpleName();
        HMLog.i(b, "notify permit allowed: " + NotificationManagerCompat.from(context).areNotificationsEnabled(), new Object[0]);
        if (n == null) {
            n = BitmapFactory.decodeResource(context.getResources(), icon);
        }
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context).setLargeIcon(n).setContentTitle(title).setContentText(content).setAutoCancel(autoCancel).setContentIntent(intent);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(simpleName, title, high ? 4 : 2);
            notificationChannel.setDescription(content);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            notificationChannel.enableLights(false);
            notificationChannel.setLightColor(Color.rgb(255, 90, 0));
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                HMLog.i(b, "NotificationManager is null!!!", new Object[0]);
            }
            contentIntent.setChannelId(simpleName);
        }
        contentIntent.setColor(ContextCompat.getColor(context, R.color.black));
        contentIntent.setSmallIcon(R.drawable.push_notification);
        return contentIntent.build();
    }

    public String getString(@StringRes int resId, Object... formatArgs) {
        return BraceletApp.getContext().getString(resId, formatArgs);
    }

    public static void showSleepNotification(String date) {
        Context context = BraceletApp.getContext();
        Intent intent = new Intent(context, (Class<?>) SleepHomeActivity.class);
        intent.putExtra("key", date);
        intent.putExtra(SleepHomeActivity.SOURCE_FROM, 2);
        o.notify(date, 2, f(context.getString(R.string.notify_sleep_sync_success), context.getString(R.string.notify_sleep_show_detail), PendingIntent.getActivity(context, (int) (SportDay.fromString(date).getTimestamp() / 1000), intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
        HMLog.i(b, "showSleepNotification", new Object[0]);
    }
}
