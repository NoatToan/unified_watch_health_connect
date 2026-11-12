package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.collection.ArrayMap;
import com.xiaomi.fitness.common.concurrent.ListenableFuture;
import com.xiaomi.fitness.common.concurrent.ListenableFutureImpl;
import com.xiaomi.fitness.common.handler.IJobHandler;
import com.xiaomi.fitness.sleep.trace.ActionManager;
import defpackage.e2p;
import defpackage.jrd;
import defpackage.l0d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b \u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H$¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ActionManager;", "Ljrd;", "Landroid/content/Intent;", "intent", "Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "Lcom/xiaomi/fitness/sleep/trace/ActionManager$ActionPerformResult;", "getFutureIfPresence", "(Landroid/content/Intent;)Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "Landroid/content/Context;", "context", "", "dispatchAction", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/xiaomi/fitness/sleep/trace/IProcessor;", "processor", "addProcessor", "(Lcom/xiaomi/fitness/sleep/trace/IProcessor;)V", "removeProcessor", "onDispatchAction", "postAction", "(Landroid/content/Context;Landroid/content/Intent;)Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "onPerformAction", "(Landroid/content/Context;Landroid/content/Intent;)Lcom/xiaomi/fitness/sleep/trace/ActionManager$ActionPerformResult;", "", "mProcessorSet", "Ljava/util/Set;", "", "mFutures", "Ljava/util/Map;", "<init>", "()V", "Companion", "ActionPerformResult", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nActionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionManager.kt\ncom/xiaomi/fitness/sleep/trace/ActionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public abstract class ActionManager implements jrd {

    @NotNull
    public static final String ACTION_BEGIN_TRACE = "com.mi.health.sleeptrace.action.BEGIN_TRACE";

    @NotNull
    public static final String ACTION_DEVICE_ACTIVE = "com.mi.health.sleeptrace.action.DEVICE_ACTIVE";

    @NotNull
    public static final String ACTION_EXECUTE_TRACE = "com.mi.health.sleeptrace.action.EXECUTE_TRACE";

    @NotNull
    public static final String ACTION_RESTART_TRACE = "com.mi.health.sleeptrace.action.RESTART_TRACE";

    @NotNull
    public static final String ACTION_TRACE_STOP = "com.mi.health.sleeptrace.action.STOP_TRACE";

    @NotNull
    public static final String CATEGORY_DEVICE = "com.mi.health.sleeptrace.category.CATEGORY_DEVICE";

    @NotNull
    public static final String CATEGORY_SLEEP_TRACE = "com.mi.health.sleeptrace.category.SLEEP_TRACE";

    @NotNull
    public static final String CATEGORY_TRACE_STOP = "com.mi.health.sleeptrace.category.TRACE_STOP";

    @NotNull
    public static final String EXTRA_INTENT_TIMESTAMP = "com.mi.health.sleeptrace.timestamp";

    @NotNull
    public static final String EXTRA_RUN_START = "extra_run_start";

    @NotNull
    public static final String EXTRA_TRACE_SCHEDULE_DATA = "extra_trace_schedule_data";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final l0d<ActionManager> sImpl = new e2p<ActionManager>() { // from class: com.xiaomi.fitness.sleep.trace.ActionManager$Companion$sImpl$1
        @Override // defpackage.unq
        public ActionManager constructor() {
            SleepTraceActionManagerImpl sleepTraceActionManagerImpl = new SleepTraceActionManagerImpl();
            sleepTraceActionManagerImpl.addProcessor(new SleepTraceProcessor());
            return sleepTraceActionManagerImpl;
        }
    };

    @NotNull
    private final Set<IProcessor> mProcessorSet = new CopyOnWriteArraySet();

    @NotNull
    private final Map<Intent, ListenableFuture<ActionPerformResult>> mFutures = new ArrayMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ActionManager$ActionPerformResult;", "", "state", "", "intent", "Landroid/content/Intent;", "<init>", "(ILandroid/content/Intent;)V", "getState", "()I", "getIntent", "()Landroid/content/Intent;", "isSuccess", "", "()Z", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionPerformResult {
        public static final int STATE_ALL_SUCCESS = 0;
        public static final int STATE_HAS_EXCEPTION = 1;

        @NotNull
        private final Intent intent;
        private final int state;

        public ActionPerformResult(int i, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.state = i;
            this.intent = intent;
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public final int getState() {
            return this.state;
        }

        public final boolean isSuccess() {
            return this.state == 0;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ActionManager$Companion;", "", "Lcom/xiaomi/fitness/sleep/trace/ActionManager;", "getInstance", "()Lcom/xiaomi/fitness/sleep/trace/ActionManager;", "instance", "", "ACTION_BEGIN_TRACE", "Ljava/lang/String;", "ACTION_RESTART_TRACE", "ACTION_EXECUTE_TRACE", "ACTION_TRACE_STOP", "EXTRA_RUN_START", "EXTRA_TRACE_SCHEDULE_DATA", "CATEGORY_TRACE_STOP", "CATEGORY_SLEEP_TRACE", "ACTION_DEVICE_ACTIVE", "CATEGORY_DEVICE", "EXTRA_INTENT_TIMESTAMP", "Ll0d;", "sImpl", "Ll0d;", "<init>", "()V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionManager getInstance() {
            Object obj = ActionManager.sImpl.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (ActionManager) obj;
        }
    }

    private final ListenableFuture<ActionPerformResult> getFutureIfPresence(Intent intent) {
        synchronized (this.mFutures) {
            for (Map.Entry<Intent, ListenableFuture<ActionPerformResult>> entry : this.mFutures.entrySet()) {
                Intent key = entry.getKey();
                ListenableFuture<ActionPerformResult> value = entry.getValue();
                if (key.filterEquals(intent)) {
                    return value;
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postAction$lambda$1$lambda$0(ListenableFutureImpl f, ActionManager this$0, Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        f.set(this$0.onPerformAction(context, intent));
    }

    public final void addProcessor(@NotNull IProcessor processor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.mProcessorSet.add(processor);
    }

    public final void dispatchAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        onDispatchAction(context, intent);
    }

    @Override // defpackage.jrd
    public /* bridge */ /* synthetic */ IJobHandler getJobHandler(Handler.Callback... callbackArr) {
        return super.getJobHandler(callbackArr);
    }

    public abstract void onDispatchAction(@NotNull Context context, @NotNull Intent intent);

    @NotNull
    public final ActionPerformResult onPerformAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int i = 0;
        if (intent.getAction() != null) {
            Iterator<IProcessor> it = this.mProcessorSet.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    it.next().onHandle(context, intent);
                } catch (Exception unused) {
                    i2++;
                }
            }
            if (i2 != 0) {
                i = 1;
            }
        }
        synchronized (this.mFutures) {
            this.mFutures.remove(intent);
        }
        return new ActionPerformResult(i, intent);
    }

    @NotNull
    public final ListenableFuture<ActionPerformResult> postAction(@NotNull final Context context, @NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        synchronized (this.mFutures) {
            ListenableFuture<ActionPerformResult> futureIfPresence = getFutureIfPresence(intent);
            if (futureIfPresence != null) {
                return futureIfPresence;
            }
            final ListenableFutureImpl listenableFutureImpl = new ListenableFutureImpl();
            getJobHandler(new Handler.Callback[0]).newJob().post(new Runnable() { // from class: ee0
                @Override // java.lang.Runnable
                public final void run() {
                    ActionManager.postAction$lambda$1$lambda$0(listenableFutureImpl, this, context, intent);
                }
            });
            this.mFutures.put(intent, listenableFutureImpl);
            return listenableFutureImpl;
        }
    }

    public final void removeProcessor(@NotNull IProcessor processor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.mProcessorSet.remove(processor);
    }
}
