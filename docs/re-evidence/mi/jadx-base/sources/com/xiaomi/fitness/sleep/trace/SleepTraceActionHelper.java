package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceActionHelper;", "", "<init>", "()V", "dispatchActionDeviceActive", "", "context", "Landroid/content/Context;", "runStart", "", "dispatchActionPerformSleepTrace", "dispatchActionStopTrace", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceActionHelper {

    @NotNull
    public static final SleepTraceActionHelper INSTANCE = new SleepTraceActionHelper();

    private SleepTraceActionHelper() {
    }

    public final void dispatchActionDeviceActive(@NotNull Context context, boolean runStart) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intentPutExtra = new Intent(context, (Class<?>) SleepTraceService.class).setAction(ActionManager.ACTION_DEVICE_ACTIVE).addCategory(ActionManager.CATEGORY_DEVICE).putExtra(ActionManager.EXTRA_RUN_START, runStart);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        ActionManager.INSTANCE.getInstance().dispatchAction(context, intentPutExtra);
    }

    public final void dispatchActionPerformSleepTrace(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intentAddCategory = new Intent(context, (Class<?>) SleepTraceService.class).setAction(ActionManager.ACTION_EXECUTE_TRACE).addCategory(ActionManager.CATEGORY_SLEEP_TRACE);
        Intrinsics.checkNotNullExpressionValue(intentAddCategory, "addCategory(...)");
        ActionManager.INSTANCE.getInstance().dispatchAction(context, intentAddCategory);
    }

    public final void dispatchActionStopTrace(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intentAddCategory = new Intent(context, (Class<?>) SleepTraceService.class).setAction(ActionManager.ACTION_TRACE_STOP).addCategory(ActionManager.CATEGORY_TRACE_STOP);
        Intrinsics.checkNotNullExpressionValue(intentAddCategory, "addCategory(...)");
        ActionManager.INSTANCE.getInstance().dispatchAction(context, intentAddCategory);
    }
}
