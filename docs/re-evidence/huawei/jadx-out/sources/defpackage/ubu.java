package defpackage;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.notification.HealthCommondReceiver;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes19.dex */
public class ubu {
    public static void c(final Context context) {
        LogUtil.a("SleepNotificationHelper", "pullUpAlarm start");
        if (!fua.c(context)) {
            LogUtil.a("SleepNotificationHelper", "pullUpAlarm not supported");
            return;
        }
        final pjo pjoVarB = pjo.b();
        if (!pjoVarB.isPluginAvaiable()) {
            LogUtil.a("SleepNotificationHelper", "PluginSleepDetectionProxy is not available,load plugin");
            pjoVarB.loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: ubw
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context2, Intent intent) {
                    return ubu.d(context, pjoVarB, context2, intent);
                }
            });
        } else {
            d(context, pjoVarB);
        }
    }

    static /* synthetic */ boolean d(Context context, pjo pjoVar, Context context2, Intent intent) {
        LogUtil.a("SleepNotificationHelper", "PluginSleepDetectionProxy loadPlugin success");
        d(context, pjoVar);
        return true;
    }

    private static void d(final Context context, final pjo pjoVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ubt
            @Override // java.lang.Runnable
            public final void run() {
                ubu.d(pjoVar, context);
            }
        });
    }

    static /* synthetic */ void d(final pjo pjoVar, final Context context) {
        pjoVar.syncSleepAlarmInfo();
        HandlerExecutor.c(new Runnable() { // from class: ubx
            @Override // java.lang.Runnable
            public final void run() {
                ubu.a(pjoVar, context);
            }
        });
    }

    static /* synthetic */ void a(pjo pjoVar, Context context) {
        if (!pjoVar.isOpenNotification()) {
            LogUtil.a("SleepNotificationHelper", "pullUpAlarm isOpenNotification is false");
            c();
        } else {
            d(context);
        }
    }

    private static void d(Context context) {
        long[] jArrH = h();
        long j = jArrH[0];
        long j2 = jArrH[1];
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < j || jCurrentTimeMillis > j2 || j > j2) {
            LogUtil.a("SleepNotificationHelper", "The current time is out of range.");
            c();
        }
        if (jCurrentTimeMillis > j2) {
            j += 86400000;
            j2 += 86400000;
        }
        long j3 = j;
        long j4 = j2;
        AlarmManager alarmManagerM = CommonUtils.m();
        if (alarmManagerM == null) {
            LogUtil.j("SleepNotificationHelper", "manager is null!");
            return;
        }
        LogUtil.j("SleepNotificationHelper", "pullUpAlarm startTime: ", Long.valueOf(j3), " , endTime: ", Long.valueOf(j4));
        ThreadPoolManager.c().execute(new Runnable() { // from class: ucc
            @Override // java.lang.Runnable
            public final void run() {
                PowerKitManager.a().e(ubu.g());
            }
        });
        List<PendingIntent> listA = a(context);
        alarmManagerM.setRepeating(0, j4, 86400000L, listA.get(1));
        alarmManagerM.setRepeating(0, j3, 86400000L, listA.get(0));
    }

    public static void e() {
        LogUtil.a("SleepNotificationHelper", "handlerNotification");
        final Context contextB = BaseApplication.b();
        if (!fua.c(contextB)) {
            b();
            return;
        }
        final pjo pjoVarB = pjo.b();
        if (pjoVarB.isPluginAvaiable()) {
            if (!pjoVarB.isOpenNotification()) {
                LogUtil.a("SleepNotificationHelper", "handlerNotification isOpenNotification = false");
                return;
            } else {
                pjoVarB.sleepRecordStatus(new IBaseResponseCallback() { // from class: uby
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        ubu.c(contextB, pjoVarB, i, obj);
                    }
                });
                return;
            }
        }
        b(contextB);
    }

    static /* synthetic */ void c(Context context, pjo pjoVar, int i, Object obj) {
        if (i != 3) {
            b(context);
            pjoVar.disconnect();
        }
    }

    public static void c(Intent intent) {
        if (TextUtils.isEmpty(intent.getStringExtra("timeZoneId"))) {
            e();
            d(BaseApplication.b());
        } else if (xjk.d(intent)) {
            LogUtil.a("SleepNotificationHelper", "handlerNotification timezone has changed.");
            d(BaseApplication.b());
        } else {
            e();
        }
    }

    public static boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long[] jArrH = h();
        return jCurrentTimeMillis >= jArrH[0] && jCurrentTimeMillis <= jArrH[1];
    }

    private static long[] h() {
        int sleepTime = pjo.b().getSleepTime();
        int iNextInt = new SecureRandom().nextInt(11);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, sleepTime / 60);
        calendar.set(12, (sleepTime % 60) - (iNextInt + 20));
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        return new long[]{timeInMillis, 10800000 + timeInMillis};
    }

    public static void b() {
        c();
        AlarmManager alarmManagerM = CommonUtils.m();
        if (alarmManagerM == null) {
            LogUtil.j("SleepNotificationHelper", "manager is null!");
            return;
        }
        List<PendingIntent> listA = a(BaseApplication.b());
        alarmManagerM.cancel(listA.get(0));
        alarmManagerM.cancel(listA.get(1));
        ThreadPoolManager.c().execute(new Runnable() { // from class: ubv
            @Override // java.lang.Runnable
            public final void run() {
                PowerKitManager.a().b(ubu.g());
            }
        });
    }

    public static void c() {
        LogUtil.a("SleepNotificationHelper", "closeNotification");
        lsb.d().e(20210816);
    }

    private static List<PendingIntent> a(Context context) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(context, (Class<?>) HealthCommondReceiver.class);
        intent.setAction("start");
        intent.setPackage(BaseApplication.d());
        intent.putExtra("timeZoneId", TimeZone.getDefault().getID());
        arrayList.add(PendingIntent.getBroadcast(context, 1, intent, 201326592));
        Intent intent2 = new Intent(context, (Class<?>) HealthCommondReceiver.class);
        intent2.setAction(TtmlNode.END);
        intent2.setPackage(BaseApplication.d());
        intent2.putExtra("timeZoneId", TimeZone.getDefault().getID());
        arrayList.add(PendingIntent.getBroadcast(context, 2, intent2, 201326592));
        return arrayList;
    }

    public static void b(Context context) {
        RemoteViews remoteViews;
        LogUtil.a("SleepNotificationHelper", "showNotification");
        if (a()) {
            return;
        }
        if (!n()) {
            LogUtil.j("SleepNotificationHelper", "It's not a reminder time.");
            return;
        }
        d(System.currentTimeMillis());
        if (EnvironmentInfo.i() || CommonUtil.bm()) {
            LogUtil.a("SleepNotificationHelper", "showNotification isHarmony4AndLater");
            e(context);
            return;
        }
        if (BaseActivity.isMiui()) {
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout_sleep_notification_xiaomi);
        } else {
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout_sleep_notification_tar_31);
        }
        if (LanguageUtil.ba(context)) {
            remoteViews.setImageViewBitmap(R.id.right_icon, qqz.e(context, R.mipmap.ic_public_play).getBitmap());
        }
        Intent intent = new Intent(context, (Class<?>) HealthCommondReceiver.class);
        intent.setAction("endTheDay");
        intent.setPackage(BaseApplication.d());
        remoteViews.setOnClickPendingIntent(R.id.notify_close, PendingIntent.getBroadcast(context, 2, intent, 201326592));
        remoteViews.setOnClickPendingIntent(R.id.start_sleep, PendingIntent.getActivity(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&isStart=true&fromType=1&pullTime=" + System.currentTimeMillis())), 67108864));
        remoteViews.setImageViewResource(R.id.icon, R.drawable.healthlogo_ic_notification);
        String string = context.getResources().getString(R.string.IDS_app_name_health);
        String upperCase = context.getResources().getString(R.string.IDS_sleep_start).toUpperCase();
        String strI = i();
        remoteViews.setTextViewText(R.id.app_name_text, string);
        remoteViews.setTextViewText(R.id.textContent, strI);
        remoteViews.setTextViewText(R.id.right_icon_text, upperCase);
        lsb.d().c(20210816, lsb.d().c().setSmallIcon(com.huawei.plugindaemon.R.drawable.healthlogo_ic_notification).setWhen(System.currentTimeMillis()).setContentText(strI).setShowWhen(false).setVisibility(1).setPriority(1).setOngoing(true).setContentIntent(PendingIntent.getActivity(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=1")), 67108864)).setStyle(new Notification.DecoratedCustomViewStyle()).setCustomBigContentView(remoteViews).build());
    }

    private static void e(Context context) {
        new Intent(context, (Class<?>) HealthCommondReceiver.class).setAction("endTheDay");
        Notification.Builder style = lsb.d().c().setSmallIcon(com.huawei.plugindaemon.R.drawable.healthlogo_ic_notification).setContentTitle(context.getResources().getString(R.string.IDS_intel_record_sleep)).setContentText(context.getResources().getString(R.string.IDS_sleep_notification_2)).setStyle(new Notification.BigTextStyle()).setWhen(System.currentTimeMillis()).setShowWhen(false).setVisibility(1).setPriority(1).setOngoing(true).setContentIntent(PendingIntent.getActivity(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=1")), 67108864)).setStyle(new Notification.BigTextStyle());
        style.addAction(new Notification.Action.Builder((Icon) null, context.getResources().getString(R.string.IDS_sleep_start), PendingIntent.getActivity(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&isStart=true&fromType=1&pullTime=" + System.currentTimeMillis())), 67108864)).build());
        lsb.d().c(20210816, style.build());
    }

    private static String i() {
        Context contextB = BaseApplication.b();
        int iNextInt = new SecureRandom().nextInt(4);
        if (iNextInt == 0) {
            return contextB.getString(R.string.IDS_sleep_notification_1);
        }
        if (iNextInt == 1) {
            return contextB.getString(R.string.IDS_sleep_notification_2);
        }
        if (iNextInt == 2) {
            return contextB.getString(R.string.IDS_sleep_notification_3);
        }
        if (iNextInt == 3) {
            return contextB.getString(R.string.IDS_sleep_notification_4);
        }
        return contextB.getString(R.string.IDS_sleep_notification_1);
    }

    public static boolean a() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "SLEEP_NOTIFY_CLOSE_TIME");
        LogUtil.a("SleepNotificationHelper", "isTodayClose closeTime: ", strE);
        boolean zB = b(CommonUtil.i(strE), System.currentTimeMillis());
        LogUtil.a("SleepNotificationHelper", "isTodayClose: ", Boolean.valueOf(zB));
        return zB;
    }

    public static void d(long j) {
        LogUtil.a("SleepNotificationHelper", "setCloseTime: ", Long.valueOf(j));
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "SLEEP_NOTIFY_CLOSE_TIME", String.valueOf(j), null);
    }

    private static boolean b(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    private static List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("start");
        arrayList.add(TtmlNode.END);
        return arrayList;
    }

    private static boolean n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int sleepTime = pjo.b().getSleepTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, sleepTime / 60);
        calendar.set(12, (sleepTime % 60) - 30);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        return jCurrentTimeMillis >= timeInMillis && jCurrentTimeMillis <= timeInMillis + 10800000;
    }
}
