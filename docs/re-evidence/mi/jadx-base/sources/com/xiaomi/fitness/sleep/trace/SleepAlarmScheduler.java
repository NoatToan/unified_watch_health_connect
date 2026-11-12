package com.xiaomi.fitness.sleep.trace;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.policy.TraceSchedule;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepAlarmScheduler;", "Lcom/xiaomi/fitness/sleep/trace/SleepSamplingScheduler;", "<init>", "()V", "performRegisterNextSchedule", "", "context", "Landroid/content/Context;", "current", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "delay", "", "performEndSchedule", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAlarmScheduler extends SleepSamplingScheduler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepAlarmScheduler$Companion;", "", "<init>", "()V", "getExecuteTracePendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PendingIntent getExecuteTracePendingIntent(Context context, TraceSchedule schedule) {
            Intent intentPutExtra = new Intent(context, (Class<?>) SleepTraceService.class).setAction(ActionManager.ACTION_EXECUTE_TRACE).addCategory(ActionManager.CATEGORY_SLEEP_TRACE).putExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, System.currentTimeMillis());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            intentPutExtra.putExtra(ActionManager.EXTRA_TRACE_SCHEDULE_DATA, schedule != null ? TraceSchedule.INSTANCE.toByteData(schedule) : null);
            return PendingIntentExtKt.getForegroundServicePendingIntent$default(context, 0, intentPutExtra, 0, 4, null);
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepSamplingScheduler
    public void performEndSchedule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LogExtKt.logi("cancel sleep trace intent");
        Object systemService = context.getSystemService(DialWidgetType.ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(INSTANCE.getExecuteTracePendingIntent(context, null));
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepSamplingScheduler
    public void performRegisterNextSchedule(@NotNull Context context, @NotNull TraceSchedule current, long delay) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(current, "current");
        AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(context, System.currentTimeMillis() + delay, INSTANCE.getExecuteTracePendingIntent(context, current), 0, 4, null);
    }
}
