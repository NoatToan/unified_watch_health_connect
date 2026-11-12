package com.xiaomi.fitness.sleep.trace.model;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.format.DateUtils;
import com.mi.health.sleep.SleepDataHelperKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0007R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/model/UserSleepModel;", "", "<init>", "()V", "mAlarmClockApps", "", "", "mWakeTimePrediction", "Lcom/xiaomi/fitness/sleep/trace/model/WakeTimePrediction;", "requireSleepState", "", "ctx", "Landroid/content/Context;", "timeInMillis", "", "calcPredictWakeupTime", "context", "def", "getWakeupClock", "timeMillis", "getWakeupClockWithAM", "thisYear", "thisDay", "requireRecentSleepPeriod", "Lcom/xiaomi/fitness/sleep/trace/model/SleepPeriodInfo;", "requireExactRecentSleepPeriod", "defaultWakeUpHour", "defaultWakeUpMin", "defaultSleepHour", "defaultSleepMin", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserSleepModel {
    private static final int GET_UP_DURATION_OF_HOUR = 5;

    @NotNull
    private static final String KEY_ALARM = "alarm";

    @NotNull
    private static final String KEY_DAY = "day";

    @NotNull
    private static final String KEY_YEAR = "year";
    private static final int SLEEP_OFFSET_HOUR = -1;
    public static final int STATE_GET_UP_TIME = 3;
    public static final int STATE_NON = 0;
    public static final int STATE_READY_SLEEP_TIME = 1;
    public static final int STATE_SLEEP_TIME = 2;

    @NotNull
    private static final String TAG = "UserSleepModel";

    @NotNull
    private static final String USER_SLEEP_PREF = "user_sleep_mode_pref";

    @NotNull
    private final List<String> mAlarmClockApps;

    @NotNull
    private final WakeTimePrediction mWakeTimePrediction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long SCHEDULE_WAKE_TIME_OFFSET_MINUTES = TimeUnit.MINUTES.toMillis(20);

    @NotNull
    private static final Lazy<UserSleepModel> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: piq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserSleepModel.instance_delegate$lambda$12();
        }
    });

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nJ\u001e\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u001e\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/model/UserSleepModel$Companion;", "", "<init>", "()V", "STATE_NON", "", "STATE_READY_SLEEP_TIME", "STATE_SLEEP_TIME", "STATE_GET_UP_TIME", "SCHEDULE_WAKE_TIME_OFFSET_MINUTES", "", "TAG", "", "instance", "Lcom/xiaomi/fitness/sleep/trace/model/UserSleepModel;", "getInstance", "()Lcom/xiaomi/fitness/sleep/trace/model/UserSleepModel;", "instance$delegate", "Lkotlin/Lazy;", "USER_SLEEP_PREF", "KEY_ALARM", "KEY_DAY", "KEY_YEAR", "GET_UP_DURATION_OF_HOUR", "SLEEP_OFFSET_HOUR", "prepare", "", "context", "Landroid/content/Context;", "nextSleepTime", "getNextSleepTime", "()J", "getPrevSleepTime", "dataTime", "getSleepTimeOfDate", "dateTime", "defaultSleepHour", "defaultSleepMin", "getWakeupTimeOfDate", "defaultWakeupHour", "defaultWakeupMin", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserSleepModel getInstance() {
            return (UserSleepModel) UserSleepModel.instance$delegate.getValue();
        }

        public final long getNextSleepTime() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
            int earliestSleepHourOfDay = companion.getEarliestSleepHourOfDay();
            int earliestSleepMin = companion.getEarliestSleepMin();
            Intrinsics.checkNotNull(calendar);
            TimeUtils.formatTimeCalendar(calendar, earliestSleepHourOfDay, earliestSleepMin, 0, 0);
            calendar.add(11, -1);
            long timeInMillis = calendar.getTimeInMillis();
            return timeInMillis < jCurrentTimeMillis ? timeInMillis + TimeUnit.DAYS.toMillis(1L) : timeInMillis;
        }

        public final long getPrevSleepTime(long dataTime) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(dataTime);
            Intrinsics.checkNotNull(calendar);
            TimeUtils.formatTimeCalendar(calendar, 0, 0, 0, 0);
            SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
            int earliestSleepHourOfDay = companion.getEarliestSleepHourOfDay();
            int earliestSleepMin = companion.getEarliestSleepMin();
            calendar.set(11, earliestSleepHourOfDay);
            calendar.set(12, earliestSleepMin);
            if (calendar.getTimeInMillis() > dataTime) {
                calendar.add(5, -1);
            }
            return calendar.getTimeInMillis();
        }

        public final long getSleepTimeOfDate(long dateTime, int defaultSleepHour, int defaultSleepMin) {
            SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
            if (companion.isCustomSleepSchedule()) {
                defaultSleepHour = companion.getEarliestSleepHourOfDay();
                defaultSleepMin = companion.getEarliestSleepMin();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(dateTime);
            Intrinsics.checkNotNull(calendar);
            TimeUtils.formatTimeCalendar(calendar, defaultSleepHour, defaultSleepMin, 0, 0);
            return calendar.getTimeInMillis();
        }

        public final long getWakeupTimeOfDate(long dateTime, int defaultWakeupHour, int defaultWakeupMin) {
            SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
            if (companion.isCustomSleepSchedule()) {
                defaultWakeupHour = companion.getEarliestSleepHourOfDay();
                defaultWakeupMin = companion.getEarliestSleepMin();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(dateTime);
            Intrinsics.checkNotNull(calendar);
            TimeUtils.formatTimeCalendar(calendar, defaultWakeupHour, defaultWakeupMin, 0, 0);
            return calendar.getTimeInMillis();
        }

        public final void prepare(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.getSharedPreferences(UserSleepModel.USER_SLEEP_PREF, 0);
        }
    }

    private UserSleepModel() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(SleepDataHelperKt.DEAK_CLOCK_PKG);
        linkedList.add("com.android.alarmclock");
        this.mAlarmClockApps = Collections.unmodifiableList(linkedList);
        WakeTimePrediction wakeTimePrediction = new WakeTimePrediction();
        this.mWakeTimePrediction = wakeTimePrediction;
        final Calendar calendar = Calendar.getInstance();
        wakeTimePrediction.addSampleGroupModel(new WakeTimePrediction.SampleGroupModel("weekend", new Function1() { // from class: qiq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UserSleepModel._init_$lambda$2(calendar, ((Long) obj).longValue()));
            }
        }));
        wakeTimePrediction.addSampleGroupModel(new WakeTimePrediction.SampleGroupModel("weekday", new Function1() { // from class: riq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UserSleepModel._init_$lambda$3(((Long) obj).longValue()));
            }
        }));
        wakeTimePrediction.addSampleGroupModel(new WakeTimePrediction.SampleGroupModel("workday", new Function1() { // from class: siq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UserSleepModel._init_$lambda$5(calendar, ((Long) obj).longValue()));
            }
        }));
        wakeTimePrediction.addSampleGroupModel(new WakeTimePrediction.SampleGroupModel("996", new Function1() { // from class: tiq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UserSleepModel._init_$lambda$7(calendar, ((Long) obj).longValue()));
            }
        }));
        wakeTimePrediction.addSampleGroupModel(new WakeTimePrediction.SampleGroupModel("sunday", new Function1() { // from class: uiq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UserSleepModel._init_$lambda$9(calendar, ((Long) obj).longValue()));
            }
        }));
        wakeTimePrediction.addSampleGroupModel(new WakeTimePrediction.SampleGroupModel("saturday", new Function1() { // from class: viq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UserSleepModel._init_$lambda$11(calendar, ((Long) obj).longValue()));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$11(Calendar calendar, long j) {
        boolean z;
        Intrinsics.checkNotNull(calendar);
        synchronized (calendar) {
            calendar.setTimeInMillis(j);
            z = calendar.get(7) == 7;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(Calendar calendar, long j) {
        boolean z;
        Intrinsics.checkNotNull(calendar);
        synchronized (calendar) {
            calendar.setTimeInMillis(j);
            int i = calendar.get(7);
            z = true;
            if (i != 7 && i != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(long j) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public static final boolean _init_$lambda$5(Calendar calendar, long j) {
        boolean z;
        Intrinsics.checkNotNull(calendar);
        synchronized (calendar) {
            calendar.setTimeInMillis(j);
            int i = calendar.get(7);
            if (i != 7) {
                z = i != 1;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$7(Calendar calendar, long j) {
        boolean z;
        Intrinsics.checkNotNull(calendar);
        synchronized (calendar) {
            calendar.setTimeInMillis(j);
            z = calendar.get(7) != 1;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$9(Calendar calendar, long j) {
        boolean z;
        Intrinsics.checkNotNull(calendar);
        synchronized (calendar) {
            calendar.setTimeInMillis(j);
            z = calendar.get(7) == 1;
        }
        return z;
    }

    private final long getWakeupClock(Context context, long timeMillis) {
        if (DateUtils.isToday(timeMillis)) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeMillis);
        int i = calendar.get(1);
        int i2 = calendar.get(6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(USER_SLEEP_PREF, 0);
        int i3 = sharedPreferences.getInt(KEY_YEAR, 0);
        int i4 = sharedPreferences.getInt(KEY_DAY, 0);
        long j = sharedPreferences.getLong("alarm", 0L);
        if (i == i3 && i2 == i4 && j != 0) {
            return j;
        }
        sharedPreferences.edit().clear().apply();
        long wakeupClockWithAM = getWakeupClockWithAM(context, i, i2);
        if (wakeupClockWithAM != 0) {
            sharedPreferences.edit().putInt(KEY_YEAR, i).putInt(KEY_DAY, i2).putLong("alarm", wakeupClockWithAM).apply();
        }
        return wakeupClockWithAM;
    }

    private final long getWakeupClockWithAM(Context context, int thisYear, int thisDay) {
        PendingIntent showIntent;
        Object systemService = context.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager.AlarmClockInfo nextAlarmClock = ((AlarmManager) systemService).getNextAlarmClock();
        if (nextAlarmClock != null && (showIntent = nextAlarmClock.getShowIntent()) != null && this.mAlarmClockApps.contains(showIntent.getCreatorPackage())) {
            long triggerTime = nextAlarmClock.getTriggerTime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(triggerTime);
            int i = calendar.get(1);
            int i2 = calendar.get(6);
            int i3 = calendar.get(11);
            int i4 = calendar.get(9);
            if (thisYear == i && thisDay == i2 && i4 == 0 && i3 <= 7 && i3 >= 3) {
                long millis = triggerTime + TimeUnit.MINUTES.toMillis(65L);
                SleepTraceUtil.INSTANCE.sleepTrace("Clock wakeup " + millis, new Object[0]);
                return millis;
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserSleepModel instance_delegate$lambda$12() {
        return new UserSleepModel();
    }

    public final long calcPredictWakeupTime(@NotNull Context context, long timeInMillis, long def) {
        Intrinsics.checkNotNullParameter(context, "context");
        long wakeupClock = getWakeupClock(context, timeInMillis);
        return wakeupClock != 0 ? wakeupClock : def;
    }

    @NotNull
    public final SleepPeriodInfo requireExactRecentSleepPeriod(long timeInMillis, int defaultWakeUpHour, int defaultWakeUpMin, int defaultSleepHour, int defaultSleepMin) {
        int earliestWakeHourOfDay;
        int earliestWakeMin;
        int earliestSleepHourOfDay;
        int earliestSleepMin;
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        if (companion.isCustomSleepSchedule()) {
            earliestWakeHourOfDay = companion.getEarliestWakeHourOfDay();
            earliestWakeMin = companion.getEarliestWakeMin();
            earliestSleepHourOfDay = companion.getEarliestSleepHourOfDay();
            earliestSleepMin = companion.getEarliestSleepMin();
        } else {
            earliestWakeHourOfDay = defaultWakeUpHour;
            earliestWakeMin = defaultWakeUpMin;
            earliestSleepHourOfDay = defaultSleepHour;
            earliestSleepMin = defaultSleepMin;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        Intrinsics.checkNotNull(calendar);
        TimeUtils.formatTimeCalendar(calendar, earliestWakeHourOfDay, earliestWakeMin, 0, 0);
        if (timeInMillis >= calendar.getTimeInMillis()) {
            calendar.add(5, 1);
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        TimeUtils.formatTimeCalendar(calendar, earliestSleepHourOfDay, earliestSleepMin, 0, 0);
        if (calendar.getTimeInMillis() >= timeInMillis2) {
            calendar.add(5, -1);
        }
        if (timeInMillis2 - calendar.getTimeInMillis() > TimeUnit.DAYS.toMillis(1L)) {
            calendar.add(5, 1);
        }
        long timeInMillis3 = calendar.getTimeInMillis();
        Logger.d(TAG, "exact sleep period: " + timeInMillis3 + ", " + timeInMillis2);
        return new SleepPeriodInfo(timeInMillis3, timeInMillis2, timeInMillis2);
    }

    @NotNull
    public final SleepPeriodInfo requireRecentSleepPeriod(@NotNull Context context, long timeInMillis) {
        Intrinsics.checkNotNullParameter(context, "context");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        Intrinsics.checkNotNull(calendar);
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        TimeUtils.formatTimeCalendar(calendar, companion.getEarliestWakeHourOfDay(), companion.getEarliestWakeMin(), 0, 0);
        calendar.add(11, 5);
        if (timeInMillis >= calendar.getTimeInMillis()) {
            calendar.add(5, 1);
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        long millis = timeInMillis2 - TimeUnit.HOURS.toMillis(5L);
        calendar.setTimeInMillis(timeInMillis);
        TimeUtils.formatTimeCalendar(calendar, companion.getEarliestSleepHourOfDay(), companion.getEarliestSleepMin(), 0, 0);
        calendar.add(11, -1);
        if (calendar.getTimeInMillis() >= timeInMillis2) {
            calendar.add(5, -1);
        }
        if (timeInMillis2 - calendar.getTimeInMillis() > TimeUnit.DAYS.toMillis(1L)) {
            calendar.add(5, 1);
        }
        long timeInMillis3 = calendar.getTimeInMillis();
        long jCalcPredictWakeupTime = calcPredictWakeupTime(context, timeInMillis, millis);
        long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(jCalcPredictWakeupTime, timeInMillis2);
        long millis2 = jCalcPredictWakeupTime >= millis ? millis - TimeUnit.SECONDS.toMillis(1L) : RangesKt___RangesKt.coerceAtLeast(jCalcPredictWakeupTime, millis - RangesKt___RangesKt.coerceAtMost((millis - timeInMillis3) / ((long) 25), SCHEDULE_WAKE_TIME_OFFSET_MINUTES));
        LogExtKt.logi("sleep period: " + timeInMillis3 + ", " + millis2 + ", " + jCoerceAtLeast);
        return new SleepPeriodInfo(timeInMillis3, millis2, jCoerceAtLeast);
    }

    public final int requireSleepState(@NotNull Context ctx, long timeInMillis) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        SleepPeriodInfo sleepPeriodInfoRequireRecentSleepPeriod = requireRecentSleepPeriod(ctx, timeInMillis);
        if (timeInMillis < sleepPeriodInfoRequireRecentSleepPeriod.getEarliestSleepTime() || timeInMillis > sleepPeriodInfoRequireRecentSleepPeriod.getLatestWakeupTime()) {
            return 0;
        }
        return timeInMillis < sleepPeriodInfoRequireRecentSleepPeriod.getEarliestWakeupTime() ? 2 : 3;
    }
}
