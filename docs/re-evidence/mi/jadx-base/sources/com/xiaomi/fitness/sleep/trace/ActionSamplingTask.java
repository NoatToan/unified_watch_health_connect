package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import android.os.Handler;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sensor.ActionEventListener;
import com.xiaomi.fitness.sensor.ActionSensor;
import com.xiaomi.fitness.sensor.ActionSensorEvent;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDao;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.sampling.SamplingTask;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0017J\b\u0010\u000e\u001a\u00020\rH\u0017R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ActionSamplingTask;", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingTask;", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mActionSensorListener", "Lcom/xiaomi/fitness/sensor/ActionEventListener;", "mActionSensor", "Lcom/xiaomi/fitness/sensor/ActionSensor;", LifecycleConstantKt.ON_START, "", LifecycleConstantKt.ON_STOP, "type", "", "getType", "()Ljava/lang/String;", "InnerActionEventListener", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActionSamplingTask extends SamplingTask<List<? extends SleepTraceLog>> {

    @NotNull
    private static final String TAG = "ActionSamplingTask";

    @Nullable
    private ActionSensor mActionSensor;

    @Nullable
    private ActionEventListener mActionSensorListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ActionSamplingTask$InnerActionEventListener;", "Lcom/xiaomi/fitness/sensor/ActionEventListener;", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/ActionSamplingTask;)V", "mCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "Ljava/util/Calendar;", "onEvent", "", "event", "Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "addLightLog", "logs", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "addInteractiveLog", "addMotionLog", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nActionSamplingTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionSamplingTask.kt\ncom/xiaomi/fitness/sleep/trace/ActionSamplingTask$InnerActionEventListener\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n37#2:132\n36#2,3:133\n*S KotlinDebug\n*F\n+ 1 ActionSamplingTask.kt\ncom/xiaomi/fitness/sleep/trace/ActionSamplingTask$InnerActionEventListener\n*L\n69#1:132\n69#1:133,3\n*E\n"})
    public final class InnerActionEventListener implements ActionEventListener {
        private final Calendar mCalendar = Calendar.getInstance();

        public InnerActionEventListener() {
        }

        private final void addInteractiveLog(ActionSensorEvent event, List<SleepTraceLog> logs) {
            LogExtKt.logi("InnerActionEventListener: addInteractiveLog: event=" + event);
            if (event.hasValidValues(2)) {
                SleepTraceLog sleepTraceLog = new SleepTraceLog(1, 0, 2, Boolean.valueOf(event.getState(2) == 2), SleepTraceUtil.INSTANCE.getUTCTimestamp(event.getRealTimestampNanos()));
                LogExtKt.logi("InnerActionEventListener: addInteractiveLog: log=" + sleepTraceLog);
                logs.add(sleepTraceLog);
            }
        }

        private final void addLightLog(ActionSensorEvent event, List<SleepTraceLog> logs) {
            float[] values;
            LogExtKt.logi("InnerActionEventListener: addLightLog: event=" + event);
            if (!event.hasValidValues(3) || (values = event.getValues(3)) == null) {
                return;
            }
            if (!(values.length == 0)) {
                SleepTraceLog sleepTraceLog = new SleepTraceLog(1, 0, 3, Float.valueOf(values[0]), SleepTraceUtil.INSTANCE.getUTCTimestamp(event.getRealTimestampNanos()));
                LogExtKt.logi("InnerActionEventListener: addLightLog: log=" + sleepTraceLog);
                logs.add(sleepTraceLog);
            }
        }

        private final void addMotionLog(ActionSensorEvent event, List<SleepTraceLog> logs) {
            LogExtKt.logi("InnerActionEventListener: addMotionLog: event=" + event);
            if (event.hasValidValues(1)) {
                SleepTraceLog sleepTraceLog = new SleepTraceLog(1, 0, 1, Boolean.valueOf(event.getState(1) == 2), SleepTraceUtil.INSTANCE.getUTCTimestamp(event.getRealTimestampNanos()));
                LogExtKt.logi("InnerActionEventListener: addMotionLog: log=" + sleepTraceLog);
                logs.add(sleepTraceLog);
            }
        }

        @Override // com.xiaomi.fitness.sensor.ActionEventListener
        public void onEvent(@NotNull ActionSensorEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logi("InnerActionEventListener: onEvent: " + event);
            LinkedList linkedList = new LinkedList();
            addInteractiveLog(event, linkedList);
            this.mCalendar.setTimeInMillis(SleepTraceUtil.INSTANCE.getUTCTimestamp(event.getRealTimestampNanos()));
            int i = this.mCalendar.get(11);
            if (i >= 21 || i <= 5) {
                addLightLog(event, linkedList);
            }
            if (UserSleepModel.INSTANCE.getInstance().requireSleepState(ActionSamplingTask.this.getApplicationContext(), System.currentTimeMillis() + ((long) SleepAnalyzeContract.INSTANCE.getUnprotectedSleepDuration())) == 2) {
                addMotionLog(event, linkedList);
                LogExtKt.logi("has custom schedule but is sleep state, add motion log");
            }
            if (!linkedList.isEmpty()) {
                SleepTraceDao sleepTraceDao = SleepTraceDatabase.INSTANCE.get(ActionSamplingTask.this.getApplicationContext()).sleepTraceDao();
                SleepTraceLog[] sleepTraceLogArr = (SleepTraceLog[]) linkedList.toArray(new SleepTraceLog[0]);
                sleepTraceDao.insert((SleepTraceLog[]) Arrays.copyOf(sleepTraceLogArr, sleepTraceLogArr.length));
            }
            ActionSamplingTask.this.inputSamplingData(Collections.unmodifiableList(linkedList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionSamplingTask(@NotNull Context appContext) {
        super(appContext);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    @NotNull
    public String getType() {
        return "Action";
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    public void onStart() {
        this.mActionSensor = new ActionSensor(getApplicationContext(), 0, 2, null);
        this.mActionSensorListener = new InnerActionEventListener();
        ActionSensor actionSensor = this.mActionSensor;
        Intrinsics.checkNotNull(actionSensor);
        ActionEventListener actionEventListener = this.mActionSensorListener;
        Intrinsics.checkNotNull(actionEventListener);
        actionSensor.registerListener(actionEventListener, new Handler());
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    public void onStop() {
        ActionSensor actionSensor = this.mActionSensor;
        Intrinsics.checkNotNull(actionSensor);
        ActionEventListener actionEventListener = this.mActionSensorListener;
        Intrinsics.checkNotNull(actionEventListener);
        actionSensor.unregisterListener(actionEventListener);
        this.mActionSensor = null;
        this.mActionSensorListener = null;
    }
}
