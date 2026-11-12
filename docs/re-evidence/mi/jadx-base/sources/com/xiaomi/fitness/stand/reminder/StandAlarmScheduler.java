package com.xiaomi.fitness.stand.reminder;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.stand.StandDetectConstants;
import com.xiaomi.fitness.stand.reminder.StandAlarmScheduler;
import com.xiaomi.fitness.stand.repo.StandDetectPreference;
import com.xiaomi.fitness.stand.repo.StandDetectRepository;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J \u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0007J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0007J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0018\u0010(\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010*\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u001a\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020!H\u0002J\u0010\u00101\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00102\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00103\u001a\u0002042\u0006\u0010\u0019\u001a\u000205H\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/stand/reminder/StandAlarmScheduler;", "", "<init>", "()V", "TAG", "", "MIN_5", "", "standRepo", "Lcom/xiaomi/fitness/stand/repo/StandDetectRepository;", "getStandRepo", "()Lcom/xiaomi/fitness/stand/repo/StandDetectRepository;", "standRepo$delegate", "Lkotlin/Lazy;", "recorder", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getRecorder", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "recorder$delegate", "registerAlarm", "", "context", "Landroid/content/Context;", AccountInteractActivity.KEY_REQUEST_CODE, "", "remindTime", "action", "cancelAllAlarm", "cancelAlarm", "handleReminder", "time", "onHandleShowNoticeAction", "shouldIgnore", "", "isSupportSedentary", "isSupportStandReminder", "checkStandAndRecordIfDone", "startTime", "checkSteps", "endTime", "checkSport", "registerNextCheckStandAlarm", "cancelNotice", "reason", "onHandleReminderCancelAction", "onHandleAddRecordAction", "recordValidStand", "startTimeSec", "autoDetect", "onHandleStopRemindAction", "onHandleStopRemindToday", "getAlarmTime", "", "", "createStandItem", "Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;", "timeInSecond", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStandAlarmScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandAlarmScheduler.kt\ncom/xiaomi/fitness/stand/reminder/StandAlarmScheduler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1053#2:386\n*S KotlinDebug\n*F\n+ 1 StandAlarmScheduler.kt\ncom/xiaomi/fitness/stand/reminder/StandAlarmScheduler\n*L\n214#1:386\n*E\n"})
public final class StandAlarmScheduler {

    @NotNull
    private final String TAG = StandDetectConstants.TAG;
    private final long MIN_5 = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: standRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy standRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u8o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandAlarmScheduler.standRepo_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: recorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: v8o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandAlarmScheduler.recorder_delegate$lambda$1();
        }
    });

    private final void cancelAlarm(Context context, int requestCode, String action) {
        Intent intent = new Intent(context, (Class<?>) StandDetectReceiver.class);
        intent.setAction(action);
        PendingIntent broadcastPendingIntent$default = PendingIntentExtKt.getBroadcastPendingIntent$default(context, requestCode, intent, 0, 4, null);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(DialWidgetType.ALARM);
        if (alarmManager != null) {
            alarmManager.cancel(broadcastPendingIntent$default);
        }
    }

    private final void cancelAllAlarm(Context context) {
        StandDetectConstants standDetectConstants = StandDetectConstants.INSTANCE;
        cancelAlarm(context, 0, standDetectConstants.getACTION_STAND_REMINDER_SHOW());
        cancelAlarm(context, 1, standDetectConstants.getACTION_STAND_REMINDER_CANCEL());
    }

    private final void cancelNotice(Context context, String reason) {
        StandReminderHelper.INSTANCE.cancel(context, reason);
    }

    public static /* synthetic */ void cancelNotice$default(StandAlarmScheduler standAlarmScheduler, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        standAlarmScheduler.cancelNotice(context, str);
    }

    private final boolean checkSport(long startTime, long endTime) {
        List<SportBasicReport> sportRecords = getStandRepo().getSportRecords(startTime - TimeUnit.HOURS.toSeconds(2L), endTime);
        if (!(!sportRecords.isEmpty())) {
            return false;
        }
        for (SportBasicReport sportBasicReport : sportRecords) {
            long startTime2 = sportBasicReport.getStartTime();
            long endTime2 = sportBasicReport.getEndTime();
            if (startTime2 < startTime && endTime2 > startTime) {
                if (endTime2 - startTime >= this.MIN_5) {
                    return true;
                }
            } else if (startTime2 < startTime || endTime2 > endTime) {
                if (startTime2 < endTime && endTime2 > endTime && endTime - startTime2 >= this.MIN_5) {
                    return true;
                }
            } else if (endTime2 - startTime2 >= this.MIN_5) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkSteps(long startTime, long endTime) {
        List<StepItem> stepRecords = getStandRepo().getStepRecords(startTime, endTime);
        if (!stepRecords.isEmpty()) {
            StepItem stepItem = null;
            int steps = 0;
            for (StepItem stepItem2 : CollectionsKt___CollectionsKt.sortedWith(stepRecords, new Comparator() { // from class: com.xiaomi.fitness.stand.reminder.StandAlarmScheduler$checkSteps$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StepItem) t).getTime()), Long.valueOf(((StepItem) t2).getTime()));
                }
            })) {
                if (stepItem == null) {
                    stepItem = stepItem2;
                }
                steps = Math.abs(stepItem.getTime() - stepItem2.getTime()) > this.MIN_5 ? 0 : steps + stepItem2.getSteps();
                if (steps >= 100) {
                    return true;
                }
                stepItem = stepItem2;
            }
        }
        return false;
    }

    private final ValidStandItem createStandItem(long timeInSecond) {
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(timeInSecond * j);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return ValidStandItem.INSTANCE.create(calendar.getTimeInMillis() / j);
    }

    private final long[] getAlarmTime(int[] remindTime) {
        int i = remindTime[0] / 100;
        int i2 = remindTime[1] / 100;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, i);
        calendar.set(12, 50);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (jCurrentTimeMillis <= timeInMillis) {
            return new long[]{timeInMillis, TimeUnit.MINUTES.toMillis(10L) + timeInMillis};
        }
        calendar.set(11, i2 - 1);
        calendar.set(12, 50);
        long timeInMillis2 = calendar.getTimeInMillis();
        calendar.add(12, 10);
        long timeInMillis3 = calendar.getTimeInMillis();
        if (jCurrentTimeMillis >= timeInMillis2) {
            calendar.set(11, i);
            calendar.set(12, 50);
            calendar.add(5, 1);
            long timeInMillis4 = calendar.getTimeInMillis();
            return jCurrentTimeMillis < timeInMillis3 ? new long[]{timeInMillis4, timeInMillis3} : new long[]{timeInMillis4, TimeUnit.MINUTES.toMillis(10L) + timeInMillis4};
        }
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(12, 50);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis5 = calendar.getTimeInMillis();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(10L) + timeInMillis5;
        if (jCurrentTimeMillis >= timeInMillis5) {
            calendar.add(10, 1);
            timeInMillis5 = calendar.getTimeInMillis();
            if (jCurrentTimeMillis < millis) {
                return new long[]{timeInMillis5, millis};
            }
        }
        return new long[]{timeInMillis5, timeUnit.toMillis(10L) + timeInMillis5};
    }

    private final FitnessDataRecorder getRecorder() {
        return (FitnessDataRecorder) this.recorder.getValue();
    }

    private final StandDetectRepository getStandRepo() {
        return (StandDetectRepository) this.standRepo.getValue();
    }

    private final boolean isSupportSedentary() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SEDENTARY);
        }
        return false;
    }

    private final boolean isSupportStandReminder() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.STAND_REMINDER);
        }
        return false;
    }

    private final void onHandleAddRecordAction(Context context, long time) {
        recordValidStand(time / ((long) 1000), false);
        cancelNotice(context, "handle add record");
        registerNextCheckStandAlarm(context);
    }

    private final void onHandleReminderCancelAction(Context context) {
        cancelNotice(context, "handle cancel reminder");
        registerNextCheckStandAlarm(context);
    }

    private final void onHandleShowNoticeAction(Context context, long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() / ((long) 1000);
        TimeUnit.HOURS.toSeconds(1L);
        if (!checkStandAndRecordIfDone(timeInMillis)) {
            if (StandDetectPreference.INSTANCE.getStandReminderEnable() && !shouldIgnore()) {
                StandReminderHelper.INSTANCE.createAndShow(context, time);
            }
            registerNextCheckStandAlarm(context);
            return;
        }
        Logger.i(this.TAG, "has valid stand (" + timeInMillis + ")");
        cancelNotice(context, "has valid stand");
        registerNextCheckStandAlarm(context);
    }

    private final void onHandleStopRemindAction(Context context) {
        StandDetectPreference.INSTANCE.setStandReminderEnable(false);
        cancelNotice(context, "handle stop remind");
        registerNextCheckStandAlarm(context);
    }

    private final void onHandleStopRemindToday(Context context) {
        StandDetectPreference.INSTANCE.setReminderIsShowToday(false);
        cancelNotice(context, "handle stop remind today");
        registerNextCheckStandAlarm(context);
    }

    private final void recordValidStand(long startTimeSec, boolean autoDetect) {
        getRecorder().recordValidStand(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid(), FitnessDateUtils.getCurrentTZOffsetInSec(), createStandItem(startTimeSec));
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, autoDetect ? "miui_function_stand" : "miui_function_stand_manual", null, 4, null);
    }

    public static /* synthetic */ void recordValidStand$default(StandAlarmScheduler standAlarmScheduler, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        standAlarmScheduler.recordValidStand(j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder recorder_delegate$lambda$1() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerAlarm$lambda$2(StandAlarmScheduler this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        long[] alarmTime = this$0.getAlarmTime(StandDetectPreference.INSTANCE.getRemindTime());
        this$0.cancelAllAlarm(context);
        this$0.registerAlarm(context, 0, alarmTime[0], StandDetectConstants.INSTANCE.getACTION_STAND_REMINDER_SHOW());
    }

    private final void registerNextCheckStandAlarm(Context context) {
        registerAlarm(context);
    }

    private final boolean shouldIgnore() {
        StandDetectPreference standDetectPreference = StandDetectPreference.INSTANCE;
        if (!standDetectPreference.checkReminderIsShowToday()) {
            Logger.i(this.TAG, "stand reminder not show today, ignore reminder");
            return true;
        }
        if (isSupportSedentary() || isSupportStandReminder()) {
            return true;
        }
        int[] detectNapTime = standDetectPreference.getDetectNapTime();
        int i = detectNapTime[0];
        int i2 = detectNapTime[1];
        boolean napEnable = standDetectPreference.getNapEnable();
        Calendar calendar = Calendar.getInstance();
        TimeUtils.setToZeroOClock(calendar);
        calendar.set(11, i / 100);
        calendar.set(12, i % 100);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, i2 / 100);
        calendar.set(12, i2 % 100);
        long timeInMillis2 = calendar.getTimeInMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i(this.TAG, "shouldIgnore: napEnable = " + napEnable + ", start = " + timeInMillis + ", end = " + timeInMillis2 + ", cur = " + jCurrentTimeMillis);
        if (!napEnable || jCurrentTimeMillis < timeInMillis || jCurrentTimeMillis > timeInMillis2) {
            return false;
        }
        Logger.i(this.TAG, "nap time, ignore reminder");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandDetectRepository standRepo_delegate$lambda$0() {
        return new StandDetectRepository();
    }

    public final boolean checkStandAndRecordIfDone(long startTime) {
        long seconds = TimeUnit.HOURS.toSeconds(1L) + startTime;
        if (!getStandRepo().getStandRecordsSync(startTime, seconds).isEmpty()) {
            Logger.i(this.TAG, "has valid stand (" + startTime + ")");
            return true;
        }
        if (checkSteps(startTime, seconds)) {
            Logger.i(this.TAG, "enough steps to valid stand (" + startTime + ")");
            recordValidStand$default(this, startTime, false, 2, null);
            return true;
        }
        if (!checkSport(startTime, seconds)) {
            return false;
        }
        Logger.i(this.TAG, "enough sport duration to valid stand (" + startTime + ")");
        recordValidStand$default(this, startTime, false, 2, null);
        return true;
    }

    public final void handleReminder(@NotNull Context context, @Nullable String action, long time) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i(this.TAG, "handleReminder: %1$tF %1$tT, action = %2$s", Long.valueOf(time), action);
        UIUtils.INSTANCE.checkNotInMainThread();
        StandDetectConstants standDetectConstants = StandDetectConstants.INSTANCE;
        if (Intrinsics.areEqual(action, standDetectConstants.getACTION_STAND_REMINDER_SHOW())) {
            onHandleShowNoticeAction(context, time);
            return;
        }
        if (Intrinsics.areEqual(action, standDetectConstants.getACTION_STAND_REMINDER_CANCEL())) {
            onHandleReminderCancelAction(context);
            return;
        }
        if (Intrinsics.areEqual(action, standDetectConstants.getACTION_STAND_RECORD())) {
            onHandleAddRecordAction(context, time);
        } else if (Intrinsics.areEqual(action, standDetectConstants.getACTION_STAND_STOP_REMIND())) {
            onHandleStopRemindAction(context);
        } else if (Intrinsics.areEqual(action, standDetectConstants.getACTION_STAND_STOP_REMIND_TODAY())) {
            onHandleStopRemindToday(context);
        }
    }

    public final void registerAlarm(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExecutorHelper.runInBackground(new Runnable() { // from class: t8o
            @Override // java.lang.Runnable
            public final void run() {
                StandAlarmScheduler.registerAlarm$lambda$2(this.f34456a, context);
            }
        });
    }

    private final void registerAlarm(Context context, int requestCode, long remindTime, String action) {
        Logger.i(this.TAG, "registerAlarm %s, will execute at %tR, %tD", null, action, Long.valueOf(remindTime), Long.valueOf(remindTime));
        Intent intent = new Intent(context, (Class<?>) StandDetectReceiver.class);
        intent.setAction(action);
        intent.putExtra(StandDetectConstants.KEY_TIME, remindTime);
        AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(context, remindTime, PendingIntentExtKt.getBroadcastPendingIntent$default(context, requestCode, intent, 0, 4, null), 0, 4, null);
    }
}
