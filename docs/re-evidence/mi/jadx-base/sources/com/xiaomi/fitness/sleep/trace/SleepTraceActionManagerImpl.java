package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.handler.IJobHandler;
import com.xiaomi.fitness.common.utils.ServiceCompat;
import com.xiaomi.fitness.sleep.trace.SleepTraceActionManagerImpl;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceActionManagerImpl;", "Lcom/xiaomi/fitness/sleep/trace/ActionManager;", "<init>", "()V", "onDispatchAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceActionManagerImpl extends ActionManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceActionManagerImpl$Companion;", "", "<init>", "()V", "isSleepStage", "", "context", "Landroid/content/Context;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSleepStage(Context context) {
            return UserSleepModel.INSTANCE.getInstance().requireSleepState(context, System.currentTimeMillis()) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDispatchAction$lambda$1(final Intent intent, final Context context, SleepTraceActionManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogExtKt.logi("dispatch action, intent=" + intent);
        if (!INSTANCE.isSleepStage(context)) {
            this$0.postAction(context, intent);
        } else {
            SleepTraceUtil.INSTANCE.sleepTrace("dispatch action, start sleep trace service", new Object[0]);
            ExecutorHelper.postInMain(new Runnable() { // from class: m0n
                @Override // java.lang.Runnable
                public final void run() {
                    SleepTraceActionManagerImpl.onDispatchAction$lambda$1$lambda$0(context, intent);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDispatchAction$lambda$1$lambda$0(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        ServiceCompat.INSTANCE.startForegroundService(context, intent);
    }

    @Override // com.xiaomi.fitness.sleep.trace.ActionManager, defpackage.jrd
    public /* bridge */ /* synthetic */ IJobHandler getJobHandler(Handler.Callback... callbackArr) {
        return super.getJobHandler(callbackArr);
    }

    @Override // com.xiaomi.fitness.sleep.trace.ActionManager
    public void onDispatchAction(@NotNull final Context context, @NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, System.currentTimeMillis());
        ExecutorHelper.runInBackground(new Runnable() { // from class: l0n
            @Override // java.lang.Runnable
            public final void run() {
                SleepTraceActionManagerImpl.onDispatchAction$lambda$1(intent, context, this);
            }
        });
    }
}
