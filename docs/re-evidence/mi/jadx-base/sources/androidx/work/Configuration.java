package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.onetrack.OneTrack;
import defpackage.h14;
import defpackage.h1l;
import defpackage.sw5;
import defpackage.wvo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0003RQSB\u0011\b\u0000\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001f\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u001f\u0010-\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u0019\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048G¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010;\u001a\u0002048\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0017\u0010=\u001a\u0002048\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0017\u0010?\u001a\u0002048G¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u00108R\u0017\u0010B\u001a\u00020A8G¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR \u0010E\u001a\u00020A8GX\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010C\u0012\u0004\bF\u0010G\u001a\u0004\bE\u0010DR\u0017\u0010I\u001a\u00020H8G¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006T"}, d2 = {"Landroidx/work/Configuration;", "", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "taskExecutor", "getTaskExecutor", "Lh14;", Feature.CLOCK, "Lh14;", "getClock", "()Lh14;", "Landroidx/work/WorkerFactory;", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "Lh1l;", "runnableScheduler", "Lh1l;", "getRunnableScheduler", "()Lh1l;", "Landroidx/core/util/Consumer;", "", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "schedulingExceptionHandler", "getSchedulingExceptionHandler", "Landroidx/work/WorkerExceptionInfo;", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler", "workerExecutionExceptionHandler", "getWorkerExecutionExceptionHandler", "", "defaultProcessName", "Ljava/lang/String;", "getDefaultProcessName", "()Ljava/lang/String;", "", "minimumLoggingLevel", "I", "getMinimumLoggingLevel", "()I", "minJobSchedulerId", "getMinJobSchedulerId", "maxJobSchedulerId", "getMaxJobSchedulerId", "contentUriTriggerWorkersLimit", "getContentUriTriggerWorkersLimit", "maxSchedulerLimit", "getMaxSchedulerLimit", "", "isUsingDefaultTaskExecutor", "Z", "()Z", "isMarkingJobsAsImportantWhileForeground", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "Landroidx/work/Tracer;", "tracer", "Landroidx/work/Tracer;", "getTracer", "()Landroidx/work/Tracer;", "Landroidx/work/Configuration$Builder;", "builder", "<init>", "(Landroidx/work/Configuration$Builder;)V", "Companion", "Builder", "Provider", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;

    @NotNull
    private final h14 clock;
    private final int contentUriTriggerWorkersLimit;

    @Nullable
    private final String defaultProcessName;

    @NotNull
    private final Executor executor;

    @Nullable
    private final Consumer<Throwable> initializationExceptionHandler;

    @NotNull
    private final InputMergerFactory inputMergerFactory;
    private final boolean isMarkingJobsAsImportantWhileForeground;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;

    @NotNull
    private final h1l runnableScheduler;

    @Nullable
    private final Consumer<Throwable> schedulingExceptionHandler;

    @NotNull
    private final Executor taskExecutor;

    @NotNull
    private final Tracer tracer;

    @NotNull
    private final CoroutineContext workerCoroutineContext;

    @Nullable
    private final Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;

    @NotNull
    private final WorkerFactory workerFactory;

    @Nullable
    private final Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Provider {
        @NotNull
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CoroutineContext workerContext = builder.getWorkerContext();
        Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? ConfigurationKt.asExecutor(workerContext) : null;
            if (executor == null) {
                executor = ConfigurationKt.createDefaultExecutor(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = builder.getExecutor() != null ? ExecutorsKt.from(executor) : Dispatchers.getDefault();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor;
        h14 clock = builder.getClock();
        this.clock = clock == null ? new wvo() : clock;
        WorkerFactory workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? DefaultWorkerFactory.INSTANCE : workerFactory;
        InputMergerFactory inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory;
        h1l runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new sw5() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.workerInitializationExceptionHandler = builder.getWorkerInitializationExceptionHandler$work_runtime_release();
        this.workerExecutionExceptionHandler = builder.getWorkerExecutionExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground();
        Tracer tracer = builder.getTracer();
        this.tracer = tracer == null ? ConfigurationKt.createDefaultTracer() : tracer;
    }

    public static /* synthetic */ void isMarkingJobsAsImportantWhileForeground$annotations() {
    }

    @NotNull
    public final h14 getClock() {
        return this.clock;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    @Nullable
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    @NotNull
    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    @NotNull
    public final h1l getRunnableScheduler() {
        return this.runnableScheduler;
    }

    @Nullable
    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    @NotNull
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Tracer getTracer() {
        return this.tracer;
    }

    @NotNull
    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    @Nullable
    public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler() {
        return this.workerExecutionExceptionHandler;
    }

    @NotNull
    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    @Nullable
    public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler() {
        return this.workerInitializationExceptionHandler;
    }

    /* JADX INFO: renamed from: isMarkingJobsAsImportantWhileForeground, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: isUsingDefaultTaskExecutor, reason: from getter */
    public final boolean getIsUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bT\u0018\u00002\u00020\u0001B\u000b\b\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001B\u0014\b\u0017\u0012\u0007\u0010\u0091\u0001\u001a\u00020?¢\u0006\u0006\b\u008f\u0001\u0010\u0092\u0001J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0018¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b.\u0010,J\u001b\u00101\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0(¢\u0006\u0004\b1\u0010,J\u001b\u00102\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0(¢\u0006\u0004\b2\u0010,J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010B\u001a\u0004\bW\u0010D\"\u0004\bX\u0010FR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010c\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010-\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u0010hR*\u0010k\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010d\u001a\u0004\bl\u0010f\"\u0004\bm\u0010hR*\u0010n\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR$\u0010q\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\"\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010w\u001a\u0004\b|\u0010y\"\u0004\b}\u0010{R\"\u0010\u001a\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010w\u001a\u0004\b~\u0010y\"\u0004\b\u007f\u0010{R$\u0010\u001d\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010w\u001a\u0005\b\u0080\u0001\u0010y\"\u0005\b\u0081\u0001\u0010{R$\u0010 \u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b \u0010w\u001a\u0005\b\u0082\u0001\u0010y\"\u0005\b\u0083\u0001\u0010{R)\u0010\u0084\u0001\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010<\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b<\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0093\u0001"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "Landroidx/work/WorkerFactory;", "workerFactory", "setWorkerFactory", "(Landroidx/work/WorkerFactory;)Landroidx/work/Configuration$Builder;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "setInputMergerFactory", "(Landroidx/work/InputMergerFactory;)Landroidx/work/Configuration$Builder;", "Ljava/util/concurrent/Executor;", "executor", "setExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/work/Configuration$Builder;", "Lkotlin/coroutines/CoroutineContext;", "context", "setWorkerCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/work/Configuration$Builder;", "taskExecutor", "setTaskExecutor", "Lh14;", Feature.CLOCK, "setClock", "(Lh14;)Landroidx/work/Configuration$Builder;", "", "minJobSchedulerId", "maxJobSchedulerId", "setJobSchedulerJobIdRange", "(II)Landroidx/work/Configuration$Builder;", "maxSchedulerLimit", "setMaxSchedulerLimit", "(I)Landroidx/work/Configuration$Builder;", "contentUriTriggerWorkersLimit", "setContentUriTriggerWorkersLimit", "loggingLevel", "setMinimumLoggingLevel", "Lh1l;", "runnableScheduler", "setRunnableScheduler", "(Lh1l;)Landroidx/work/Configuration$Builder;", "Landroidx/core/util/Consumer;", "", "exceptionHandler", "setInitializationExceptionHandler", "(Landroidx/core/util/Consumer;)Landroidx/work/Configuration$Builder;", "schedulingExceptionHandler", "setSchedulingExceptionHandler", "Landroidx/work/WorkerExceptionInfo;", "workerExceptionHandler", "setWorkerInitializationExceptionHandler", "setWorkerExecutionExceptionHandler", "", "processName", "setDefaultProcessName", "(Ljava/lang/String;)Landroidx/work/Configuration$Builder;", "", "markAsImportant", "setMarkingJobsAsImportantWhileForeground", "(Z)Landroidx/work/Configuration$Builder;", "Landroidx/work/Tracer;", "tracer", "setTracer", "(Landroidx/work/Tracer;)Landroidx/work/Configuration$Builder;", "Landroidx/work/Configuration;", OneTrack.Param.BUILD, "()Landroidx/work/Configuration;", "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "workerContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerContext$work_runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "Lh14;", "getClock$work_runtime_release", "()Lh14;", "setClock$work_runtime_release", "(Lh14;)V", "Lh1l;", "getRunnableScheduler$work_runtime_release", "()Lh1l;", "setRunnableScheduler$work_runtime_release", "(Lh1l;)V", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler$work_runtime_release", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "getWorkerExecutionExceptionHandler$work_runtime_release", "setWorkerExecutionExceptionHandler$work_runtime_release", "defaultProcessName", "Ljava/lang/String;", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "I", "getLoggingLevel$work_runtime_release", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", "getContentUriTriggerWorkersLimit$work_runtime_release", "setContentUriTriggerWorkersLimit$work_runtime_release", "markJobsAsImportantWhileForeground", "Z", "getMarkJobsAsImportantWhileForeground$work_runtime_release", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "Landroidx/work/Tracer;", "getTracer$work_runtime_release", "()Landroidx/work/Tracer;", "setTracer$work_runtime_release", "(Landroidx/work/Tracer;)V", "<init>", "()V", "configuration", "(Landroidx/work/Configuration;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        @Nullable
        private h14 clock;
        private int contentUriTriggerWorkersLimit;

        @Nullable
        private String defaultProcessName;

        @Nullable
        private Executor executor;

        @Nullable
        private Consumer<Throwable> initializationExceptionHandler;

        @Nullable
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private boolean markJobsAsImportantWhileForeground;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;

        @Nullable
        private h1l runnableScheduler;

        @Nullable
        private Consumer<Throwable> schedulingExceptionHandler;

        @Nullable
        private Executor taskExecutor;

        @Nullable
        private Tracer tracer;

        @Nullable
        private CoroutineContext workerContext;

        @Nullable
        private Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;

        @Nullable
        private WorkerFactory workerFactory;

        @Nullable
        private Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

        public Builder() {
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
        }

        @NotNull
        public final Configuration build() {
            return new Configuration(this);
        }

        @Nullable
        /* JADX INFO: renamed from: getClock$work_runtime_release, reason: from getter */
        public final h14 getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: getContentUriTriggerWorkersLimit$work_runtime_release, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: getDefaultProcessName$work_runtime_release, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        @Nullable
        /* JADX INFO: renamed from: getExecutor$work_runtime_release, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @Nullable
        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getInputMergerFactory$work_runtime_release, reason: from getter */
        public final InputMergerFactory getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* JADX INFO: renamed from: getLoggingLevel$work_runtime_release, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* JADX INFO: renamed from: getMarkJobsAsImportantWhileForeground$work_runtime_release, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        /* JADX INFO: renamed from: getMaxJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* JADX INFO: renamed from: getMaxSchedulerLimit$work_runtime_release, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* JADX INFO: renamed from: getMinJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        @Nullable
        /* JADX INFO: renamed from: getRunnableScheduler$work_runtime_release, reason: from getter */
        public final h1l getRunnableScheduler() {
            return this.runnableScheduler;
        }

        @Nullable
        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getTaskExecutor$work_runtime_release, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: getTracer$work_runtime_release, reason: from getter */
        public final Tracer getTracer() {
            return this.tracer;
        }

        @Nullable
        /* JADX INFO: renamed from: getWorkerContext$work_runtime_release, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        @Nullable
        public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler$work_runtime_release() {
            return this.workerExecutionExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getWorkerFactory$work_runtime_release, reason: from getter */
        public final WorkerFactory getWorkerFactory() {
            return this.workerFactory;
        }

        @Nullable
        public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler$work_runtime_release() {
            return this.workerInitializationExceptionHandler;
        }

        @NotNull
        public final Builder setClock(@NotNull h14 clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            this.clock = clock;
            return this;
        }

        public final void setClock$work_runtime_release(@Nullable h14 h14Var) {
            this.clock = h14Var;
        }

        @NotNull
        public final Builder setContentUriTriggerWorkersLimit(int contentUriTriggerWorkersLimit) {
            this.contentUriTriggerWorkersLimit = Math.max(contentUriTriggerWorkersLimit, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i) {
            this.contentUriTriggerWorkersLimit = i;
        }

        @NotNull
        public final Builder setDefaultProcessName(@NotNull String processName) {
            Intrinsics.checkNotNullParameter(processName, "processName");
            this.defaultProcessName = processName;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(@Nullable String str) {
            this.defaultProcessName = str;
        }

        @NotNull
        public final Builder setExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.executor = executor;
            return this;
        }

        public final void setExecutor$work_runtime_release(@Nullable Executor executor) {
            this.executor = executor;
        }

        @NotNull
        public final Builder setInitializationExceptionHandler(@NotNull Consumer<Throwable> exceptionHandler) {
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(@Nullable Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        @NotNull
        public final Builder setInputMergerFactory(@NotNull InputMergerFactory inputMergerFactory) {
            Intrinsics.checkNotNullParameter(inputMergerFactory, "inputMergerFactory");
            this.inputMergerFactory = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(@Nullable InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        @NotNull
        public final Builder setJobSchedulerJobIdRange(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.".toString());
            }
            this.minJobSchedulerId = minJobSchedulerId;
            this.maxJobSchedulerId = maxJobSchedulerId;
            return this;
        }

        public final void setLoggingLevel$work_runtime_release(int i) {
            this.loggingLevel = i;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime_release(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
        }

        @NotNull
        public final Builder setMarkingJobsAsImportantWhileForeground(boolean markAsImportant) {
            this.markJobsAsImportantWhileForeground = markAsImportant;
            return this;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i) {
            this.maxJobSchedulerId = i;
        }

        @NotNull
        public final Builder setMaxSchedulerLimit(int maxSchedulerLimit) {
            if (maxSchedulerLimit < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.".toString());
            }
            this.maxSchedulerLimit = Math.min(maxSchedulerLimit, 50);
            return this;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i) {
            this.maxSchedulerLimit = i;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i) {
            this.minJobSchedulerId = i;
        }

        @NotNull
        public final Builder setMinimumLoggingLevel(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        @NotNull
        public final Builder setRunnableScheduler(@NotNull h1l runnableScheduler) {
            Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
            this.runnableScheduler = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(@Nullable h1l h1lVar) {
            this.runnableScheduler = h1lVar;
        }

        @NotNull
        public final Builder setSchedulingExceptionHandler(@NotNull Consumer<Throwable> schedulingExceptionHandler) {
            Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "schedulingExceptionHandler");
            this.schedulingExceptionHandler = schedulingExceptionHandler;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(@Nullable Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        @NotNull
        public final Builder setTaskExecutor(@NotNull Executor taskExecutor) {
            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
            this.taskExecutor = taskExecutor;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(@Nullable Executor executor) {
            this.taskExecutor = executor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final Builder setTracer(@NotNull Tracer tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            this.tracer = tracer;
            return this;
        }

        public final void setTracer$work_runtime_release(@Nullable Tracer tracer) {
            this.tracer = tracer;
        }

        public final void setWorkerContext$work_runtime_release(@Nullable CoroutineContext coroutineContext) {
            this.workerContext = coroutineContext;
        }

        @NotNull
        public final Builder setWorkerCoroutineContext(@NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.workerContext = context;
            return this;
        }

        @NotNull
        public final Builder setWorkerExecutionExceptionHandler(@NotNull Consumer<WorkerExceptionInfo> workerExceptionHandler) {
            Intrinsics.checkNotNullParameter(workerExceptionHandler, "workerExceptionHandler");
            this.workerExecutionExceptionHandler = workerExceptionHandler;
            return this;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime_release(@Nullable Consumer<WorkerExceptionInfo> consumer) {
            this.workerExecutionExceptionHandler = consumer;
        }

        @NotNull
        public final Builder setWorkerFactory(@NotNull WorkerFactory workerFactory) {
            Intrinsics.checkNotNullParameter(workerFactory, "workerFactory");
            this.workerFactory = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(@Nullable WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        @NotNull
        public final Builder setWorkerInitializationExceptionHandler(@NotNull Consumer<WorkerExceptionInfo> workerExceptionHandler) {
            Intrinsics.checkNotNullParameter(workerExceptionHandler, "workerExceptionHandler");
            this.workerInitializationExceptionHandler = workerExceptionHandler;
            return this;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime_release(@Nullable Consumer<WorkerExceptionInfo> consumer) {
            this.workerInitializationExceptionHandler = consumer;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NotNull Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.workerInitializationExceptionHandler = configuration.getWorkerInitializationExceptionHandler();
            this.workerExecutionExceptionHandler = configuration.getWorkerExecutionExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
            this.contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            this.markJobsAsImportantWhileForeground = configuration.getIsMarkingJobsAsImportantWhileForeground();
            this.tracer = configuration.getTracer();
        }
    }
}
