package com.huami.sky.ui.sleepreminder.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.view.result.ActivityResultLauncher;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.sky.lib.entity.SleepReminderInfo;
import com.huami.sky.ui.ext.SkyNotificationExtKt;
import com.huami.sky.ui.utils.Constant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&\u0012B\u0007¢\u0006\u0004\b$\u0010%J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0007R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006'"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/AlarmManager;", "alarmManager", "", "day", "", "alarmTimeInMillis", "", GoogleApiAvailabilityLight.a, "hour", "minute", "Ljava/util/Calendar;", "c", "b", "dayOfWeek", "a", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "sleepReminderInfo", "startAlarm", "weekDay", "updateAlarm", "cancelAlarm", "", "hasRequirePermission", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "launcher", "requireAlarmPermission", "Landroid/util/SparseArray;", "Landroid/app/PendingIntent;", "Landroid/util/SparseArray;", "alarmPendingIntentArray", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyReminderAlarmManager {

    @NotNull
    private static final String c = "SkyReminderAlarmManager";
    private static final int e = 60;
    private static final int f = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<PendingIntent> alarmPendingIntentArray = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SleepReminderInfo sleepReminderInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SkyReminderAlarmManager d = a.a.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager$Companion;", "", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", DefaultSettingsSpiCall.n, "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", "getInstance", "()Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", "", "MINUTE_60", LogUtil.I, "", "TAG", "Ljava/lang/String;", "WEEK_DAY_7", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SkyReminderAlarmManager getInstance() {
            return SkyReminderAlarmManager.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager$a", "", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", "b", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", "a", "()Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderAlarmManager;", "holder", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final SkyReminderAlarmManager holder = new SkyReminderAlarmManager();

        private a() {
        }

        @NotNull
        public final SkyReminderAlarmManager a() {
            return holder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "取消闹钟失败： " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新入睡通知提醒闹钟, 没有精确闹钟权限";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新入睡通知提醒闹钟, 设置的时间：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepReminderInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SleepReminderInfo sleepReminderInfo) {
            super(0);
            this.a = sleepReminderInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新入睡通知提醒闹钟：" + this.a;
        }
    }

    private final int a(int dayOfWeek) {
        if (dayOfWeek == 1) {
            return 7;
        }
        return dayOfWeek - 1;
    }

    private final int b(int day) {
        if (day >= 7) {
            return 1;
        }
        return 1 + day;
    }

    private final Calendar c(int day, int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, b(day));
        calendar.set(11, hour);
        calendar.set(12, minute);
        calendar.set(13, 0);
        return calendar;
    }

    private final void d(Context context, AlarmManager alarmManager, int day, long alarmTimeInMillis) {
        if (!hasRequirePermission(context)) {
            HMLog.info(c, c.a);
            return;
        }
        Intent intent = new Intent(Constant.SKY_REMINDER_NOTIFICATION_ACTION);
        intent.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, day, intent, SkyNotificationExtKt.pendingIntentFlag());
        this.alarmPendingIntentArray.put(day, broadcast);
        HMLog.info(c, new d(alarmTimeInMillis));
        if (alarmTimeInMillis >= System.currentTimeMillis()) {
            if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, alarmTimeInMillis, broadcast);
            } else {
                alarmManager.setExact(0, alarmTimeInMillis, broadcast);
            }
        }
    }

    public static /* synthetic */ void updateAlarm$default(SkyReminderAlarmManager skyReminderAlarmManager, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        skyReminderAlarmManager.updateAlarm(context, i);
    }

    public final void cancelAlarm(@NotNull Context context) {
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        try {
            SparseArray<PendingIntent> sparseArray = this.alarmPendingIntentArray;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArray.keyAt(i);
                alarmManager.cancel(sparseArray.valueAt(i));
            }
            this.alarmPendingIntentArray.clear();
        } catch (Exception e2) {
            HMLog.info(c, new b(e2));
        }
    }

    public final boolean hasRequirePermission(@NotNull Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        return ((AlarmManager) systemService).canScheduleExactAlarms();
    }

    @RequiresApi(31)
    public final void requireAlarmPermission(@NotNull Context context, @NotNull ActivityResultLauncher<Intent> launcher) {
        launcher.launch(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + context.getPackageName())));
    }

    public final void startAlarm(@NotNull Context context, @NotNull SleepReminderInfo sleepReminderInfo) {
        HMLog.info(c, new e(sleepReminderInfo));
        this.sleepReminderInfo = sleepReminderInfo;
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        List<Integer> days = sleepReminderInfo.getDays();
        int time = sleepReminderInfo.getTime() / 60;
        int time2 = sleepReminderInfo.getTime() % 60;
        Iterator<Integer> it2 = days.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            long timeInMillis = c(iIntValue, time, time2).getTimeInMillis();
            if (timeInMillis > System.currentTimeMillis()) {
                d(context, alarmManager, iIntValue, timeInMillis);
            } else {
                updateAlarm(context, iIntValue);
            }
        }
    }

    public final void updateAlarm(@NotNull Context context, int weekDay) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (weekDay <= 0) {
            weekDay = a(calendar.get(7));
        }
        int i = weekDay;
        SleepReminderInfo sleepReminderInfo = this.sleepReminderInfo;
        if (sleepReminderInfo == null) {
            return;
        }
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        d(context, (AlarmManager) systemService, i, 604800000 + c(i, sleepReminderInfo.getTime() / 60, sleepReminderInfo.getTime() % 60).getTimeInMillis());
    }
}
