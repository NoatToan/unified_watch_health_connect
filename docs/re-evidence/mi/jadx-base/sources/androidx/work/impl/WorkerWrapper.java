package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.onetrack.OneTrack;
import defpackage.anr;
import defpackage.h14;
import defpackage.jnr;
import defpackage.lhe;
import defpackage.m1p;
import defpackage.ppe;
import defpackage.r0a;
import defpackage.t0a;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002TUB\u0011\b\u0000\u0012\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\"\u0010\tR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010GR\u0014\u0010H\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010+R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006V"}, d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "Landroidx/work/impl/WorkerWrapper$Resolution;", "runWorker", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/a$a;", "result", "", "onWorkFinished", "(Landroidx/work/a$a;)Z", "", "stopReason", "resetWorkerStatus", "(I)Z", "handleResult", "trySetRunning", "()Z", "", "workSpecId", "", "iterativelyFailWorkAndDependents", "(Ljava/lang/String;)V", "reschedule", "resetPeriodic", "setSucceeded", "", "tags", "createWorkDescription", "(Ljava/util/List;)Ljava/lang/String;", "Llhe;", "launch", "()Llhe;", "interrupt", "(I)V", "setFailed", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/WorkerParameters$a;", "Landroidx/work/a;", "builderWorker", "Landroidx/work/a;", "Lm1p;", "workTaskExecutor", "Lm1p;", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/Configuration;", "Lh14;", Feature.CLOCK, "Lh14;", "Lr0a;", "foregroundProcessor", "Lr0a;", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "Landroidx/work/impl/model/WorkSpecDao;", "workSpecDao", "Landroidx/work/impl/model/WorkSpecDao;", "Landroidx/work/impl/model/DependencyDao;", "dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "Ljava/util/List;", "workDescription", "Lkotlinx/coroutines/CompletableJob;", "workerJob", "Lkotlinx/coroutines/CompletableJob;", "Landroidx/work/impl/model/WorkGenerationalId;", "getWorkGenerationalId", "()Landroidx/work/impl/model/WorkGenerationalId;", "workGenerationalId", "Landroidx/work/impl/WorkerWrapper$Builder;", "builder", "<init>", "(Landroidx/work/impl/WorkerWrapper$Builder;)V", "Builder", "Resolution", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nWorkerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,607:1\n29#2:608\n29#2:609\n27#2:610\n32#2:611\n19#2:612\n19#2:613\n24#2:614\n24#2:615\n24#2:616\n24#2:617\n19#2:618\n*S KotlinDebug\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper\n*L\n206#1:608\n240#1:609\n315#1:610\n318#1:611\n354#1:612\n367#1:613\n374#1:614\n381#1:615\n384#1:616\n477#1:617\n151#1:618\n*E\n"})
public final class WorkerWrapper {

    @NotNull
    private final Context appContext;

    @Nullable
    private final androidx.work.a builderWorker;

    @NotNull
    private final h14 clock;

    @NotNull
    private final Configuration configuration;

    @NotNull
    private final DependencyDao dependencyDao;

    @NotNull
    private final r0a foregroundProcessor;

    @NotNull
    private final WorkerParameters.a runtimeExtras;

    @NotNull
    private final List<String> tags;

    @NotNull
    private final WorkDatabase workDatabase;

    @NotNull
    private final String workDescription;

    @NotNull
    private final WorkSpec workSpec;

    @NotNull
    private final WorkSpecDao workSpecDao;

    @NotNull
    private final String workSpecId;

    @NotNull
    private final m1p workTaskExecutor;

    @NotNull
    private final CompletableJob workerJob;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010;\u001a\u00020,\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020!\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b<\u0010=J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Builder;", "", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "withRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)Landroidx/work/impl/WorkerWrapper$Builder;", "Landroidx/work/a;", "worker", "withWorker", "(Landroidx/work/a;)Landroidx/work/impl/WorkerWrapper$Builder;", "Landroidx/work/impl/WorkerWrapper;", OneTrack.Param.BUILD, "()Landroidx/work/impl/WorkerWrapper;", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/Configuration;", "getConfiguration", "()Landroidx/work/Configuration;", "Lm1p;", "workTaskExecutor", "Lm1p;", "getWorkTaskExecutor", "()Lm1p;", "Lr0a;", "foregroundProcessor", "Lr0a;", "getForegroundProcessor", "()Lr0a;", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "getWorkDatabase", "()Landroidx/work/impl/WorkDatabase;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "", "", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Landroidx/work/a;", "getWorker", "()Landroidx/work/a;", "setWorker", "(Landroidx/work/a;)V", "Landroidx/work/WorkerParameters$a;", "getRuntimeExtras", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "context", "<init>", "(Landroid/content/Context;Landroidx/work/Configuration;Lm1p;Lr0a;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/model/WorkSpec;Ljava/util/List;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Builder {

        @NotNull
        private final Context appContext;

        @NotNull
        private final Configuration configuration;

        @NotNull
        private final r0a foregroundProcessor;

        @NotNull
        private WorkerParameters.a runtimeExtras;

        @NotNull
        private final List<String> tags;

        @NotNull
        private final WorkDatabase workDatabase;

        @NotNull
        private final WorkSpec workSpec;

        @NotNull
        private final m1p workTaskExecutor;

        @Nullable
        private androidx.work.a worker;

        @SuppressLint({"LambdaLast"})
        public Builder(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor, @NotNull r0a foregroundProcessor, @NotNull WorkDatabase workDatabase, @NotNull WorkSpec workSpec, @NotNull List<String> tags) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
            Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.a();
        }

        @NotNull
        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        @NotNull
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        public final Configuration getConfiguration() {
            return this.configuration;
        }

        @NotNull
        public final r0a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        @NotNull
        public final WorkerParameters.a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        @NotNull
        public final List<String> getTags() {
            return this.tags;
        }

        @NotNull
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        @NotNull
        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        public final m1p getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        @Nullable
        public final androidx.work.a getWorker() {
            return this.worker;
        }

        public final void setRuntimeExtras(@NotNull WorkerParameters.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.runtimeExtras = aVar;
        }

        public final void setWorker(@Nullable androidx.work.a aVar) {
            this.worker = aVar;
        }

        @NotNull
        public final Builder withRuntimeExtras(@Nullable WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }

        @VisibleForTesting
        @NotNull
        public final Builder withWorker(@NotNull androidx.work.a worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            this.worker = worker;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution;", "", "()V", "Failed", "Finished", "ResetWorkerStatus", "Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Resolution {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "Landroidx/work/a$a;", "result", "Landroidx/work/a$a;", "getResult", "()Landroidx/work/a$a;", "<init>", "(Landroidx/work/a$a;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
        public static final class Failed extends Resolution {

            @NotNull
            private final androidx.work.a.AbstractC0080a result;

            /* JADX WARN: Multi-variable type inference failed */
            public Failed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @NotNull
            public final androidx.work.a.AbstractC0080a getResult() {
                return this.result;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(@NotNull androidx.work.a.AbstractC0080a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public /* synthetic */ Failed(androidx.work.a.AbstractC0080a abstractC0080a, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new androidx.work.a.AbstractC0080a.C0081a() : abstractC0080a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "Landroidx/work/a$a;", "result", "Landroidx/work/a$a;", "getResult", "()Landroidx/work/a$a;", "<init>", "(Landroidx/work/a$a;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
        public static final class Finished extends Resolution {

            @NotNull
            private final androidx.work.a.AbstractC0080a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(@NotNull androidx.work.a.AbstractC0080a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            public final androidx.work.a.AbstractC0080a getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "reason", "", "(I)V", "getReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ResetWorkerStatus extends Resolution {
            private final int reason;

            public ResetWorkerStatus() {
                this(0, 1, null);
            }

            public final int getReason() {
                return this.reason;
            }

            public ResetWorkerStatus(int i) {
                super(null);
                this.reason = i;
            }

            public /* synthetic */ ResetWorkerStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? WorkInfo.STOP_REASON_NOT_STOPPED : i);
            }
        }

        private Resolution() {
        }

        public /* synthetic */ Resolution(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$launch$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWorkerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper$launch$1\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,607:1\n32#2:608\n*S KotlinDebug\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper$launch$1\n*L\n105#1:608\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean invokeSuspend$lambda$1(Resolution resolution, WorkerWrapper workerWrapper) {
            boolean zResetWorkerStatus;
            if (resolution instanceof Resolution.Finished) {
                zResetWorkerStatus = workerWrapper.onWorkFinished(((Resolution.Finished) resolution).getResult());
            } else if (resolution instanceof Resolution.Failed) {
                workerWrapper.setFailed(((Resolution.Failed) resolution).getResult());
                zResetWorkerStatus = false;
            } else {
                if (!(resolution instanceof Resolution.ResetWorkerStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                zResetWorkerStatus = workerWrapper.resetWorkerStatus(((Resolution.ResetWorkerStatus) resolution).getReason());
            }
            return Boolean.valueOf(zResetWorkerStatus);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WorkerWrapper.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Resolution failed;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            androidx.work.a.AbstractC0080a abstractC0080a = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableJob completableJob = WorkerWrapper.this.workerJob;
                    WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(WorkerWrapper.this, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(completableJob, workerWrapper$launch$1$resolution$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                failed = (Resolution) obj;
            } catch (WorkerStoppedException e) {
                failed = new Resolution.ResetWorkerStatus(e.getReason());
            } catch (CancellationException unused) {
                failed = new Resolution.Failed(abstractC0080a, i2, objArr3 == true ? 1 : 0);
            } catch (Throwable th) {
                ppe.e().d(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                failed = new Resolution.Failed(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = WorkerWrapper.this.workDatabase;
            final WorkerWrapper workerWrapper = WorkerWrapper.this;
            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.AnonymousClass1.invokeSuspend$lambda$1(failed, workerWrapper);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
            return objRunInTransaction;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$runWorker$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", i = {0, 0}, l = {299}, m = "runWorker", n = {"this", "params"}, s = {"L$0", "L$1"})
    public static final class C13121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13121(Continuation<? super C13121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkerWrapper.this.runWorker(this);
        }
    }

    public WorkerWrapper(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.tags = tags;
        this.workDescription = createWorkDescription(tags);
        this.workerJob = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    private final String createWorkDescription(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt___CollectionsKt.joinToString$default(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    private final boolean handleResult(androidx.work.a.AbstractC0080a result) {
        if (result instanceof androidx.work.a.AbstractC0080a.c) {
            String str = WorkerWrapperKt.TAG;
            ppe.e().f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.isPeriodic() ? resetPeriodic() : setSucceeded(result);
        }
        if (result instanceof androidx.work.a.AbstractC0080a.b) {
            String str2 = WorkerWrapperKt.TAG;
            ppe.e().f(str2, "Worker result RETRY for " + this.workDescription);
            return reschedule(WorkInfo.STOP_REASON_NOT_STOPPED);
        }
        String str3 = WorkerWrapperKt.TAG;
        ppe.e().f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.isPeriodic()) {
            return resetPeriodic();
        }
        if (result == null) {
            result = new androidx.work.a.AbstractC0080a.C0081a();
        }
        return setFailed(result);
    }

    private final void iterativelyFailWorkAndDependents(String workSpecId) {
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(workSpecId);
        while (!listMutableListOf.isEmpty()) {
            String str = (String) CollectionsKt__MutableCollectionsKt.removeLast(listMutableListOf);
            if (this.workSpecDao.getState(str) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str);
            }
            listMutableListOf.addAll(this.dependencyDao.getDependentWorkIds(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onWorkFinished(androidx.work.a.AbstractC0080a result) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(result);
        }
        if (state.isFinished()) {
            return false;
        }
        return reschedule(WorkInfo.STOP_REASON_UNKNOWN);
    }

    private final boolean reschedule(int stopReason) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        this.workSpecDao.setStopReason(this.workSpecId, stopReason);
        return true;
    }

    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resetWorkerStatus(int stopReason) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            String str = WorkerWrapperKt.TAG;
            ppe.e().a(str, "Status for " + this.workSpecId + " is " + state + " ; not doing any work");
            return false;
        }
        String str2 = WorkerWrapperKt.TAG;
        ppe.e().a(str2, "Status for " + this.workSpecId + " is " + state + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, stopReason);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x0230  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object runWorker(Continuation<? super Resolution> continuation) {
        C13121 c13121;
        Data dataMerge;
        WorkerWrapper workerWrapper;
        WorkerParameters workerParameters;
        Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        if (continuation instanceof C13121) {
            c13121 = (C13121) continuation;
            int i = c13121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13121.label = i - Integer.MIN_VALUE;
            } else {
                c13121 = new C13121(continuation);
            }
        } else {
            c13121 = new C13121(continuation);
        }
        Object objWithContext = c13121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13121.label;
        int i3 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            final boolean zIsEnabled = this.configuration.getTracer().isEnabled();
            final String traceTag = this.workSpec.getTraceTag();
            if (zIsEnabled && traceTag != null) {
                this.configuration.getTracer().beginAsyncSection(traceTag, this.workSpec.hashCode());
            }
            Boolean shouldExit = (Boolean) this.workDatabase.runInTransaction(new Callable() { // from class: vnr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.runWorker$lambda$1(this.f37072a);
                }
            });
            Intrinsics.checkNotNullExpressionValue(shouldExit, "shouldExit");
            int i4 = 0;
            if (shouldExit.booleanValue()) {
                return new Resolution.ResetWorkerStatus(i4, i3, defaultConstructorMarker);
            }
            if (this.workSpec.isPeriodic()) {
                dataMerge = this.workSpec.input;
            } else {
                InputMerger inputMergerCreateInputMergerWithDefaultFallback = this.configuration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.workSpec.inputMergerClassName);
                if (inputMergerCreateInputMergerWithDefaultFallback == null) {
                    String str = WorkerWrapperKt.TAG;
                    ppe.e().c(str, "Could not create Input Merger " + this.workSpec.inputMergerClassName);
                    return new Resolution.Failed(objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
                }
                dataMerge = inputMergerCreateInputMergerWithDefaultFallback.merge(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(this.workSpec.input), (Iterable) this.workSpecDao.getInputsFromPrerequisites(this.workSpecId)));
            }
            Data data = dataMerge;
            UUID uuidFromString = UUID.fromString(this.workSpecId);
            List<String> list = this.tags;
            WorkerParameters.a aVar = this.runtimeExtras;
            WorkSpec workSpec = this.workSpec;
            WorkerParameters workerParameters2 = new WorkerParameters(uuidFromString, data, list, aVar, workSpec.runAttemptCount, workSpec.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new jnr(this.workDatabase, this.workTaskExecutor), new anr(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
            final androidx.work.a aVarCreateWorkerWithDefaultFallback = this.builderWorker;
            if (aVarCreateWorkerWithDefaultFallback == null) {
                try {
                    aVarCreateWorkerWithDefaultFallback = this.configuration.getWorkerFactory().createWorkerWithDefaultFallback(this.appContext, this.workSpec.workerClassName, workerParameters2);
                } catch (Throwable th) {
                    String str2 = WorkerWrapperKt.TAG;
                    ppe.e().c(str2, "Could not create Worker " + this.workSpec.workerClassName);
                    Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = this.configuration.getWorkerInitializationExceptionHandler();
                    if (workerInitializationExceptionHandler != null) {
                        WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, new WorkerExceptionInfo(this.workSpec.workerClassName, workerParameters2, th), WorkerWrapperKt.TAG);
                    }
                    return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
                }
            }
            aVarCreateWorkerWithDefaultFallback.setUsed();
            CoroutineContext.Element element = c13121.getContext().get(Job.INSTANCE);
            Intrinsics.checkNotNull(element);
            Job job = (Job) element;
            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapper.runWorker.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    if (th2 instanceof WorkerStoppedException) {
                        aVarCreateWorkerWithDefaultFallback.stop(((WorkerStoppedException) th2).getReason());
                    }
                    if (!zIsEnabled || traceTag == null) {
                        return;
                    }
                    this.configuration.getTracer().endAsyncSection(traceTag, this.getWorkSpec().hashCode());
                }
            });
            if (!trySetRunning()) {
                return new Resolution.ResetWorkerStatus(0, 1, null);
            }
            int i5 = 1;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            int i6 = 0;
            if (job.isCancelled()) {
                return new Resolution.ResetWorkerStatus(i6, i5, defaultConstructorMarker2);
            }
            t0a t0aVarB = workerParameters2.b();
            Intrinsics.checkNotNullExpressionValue(t0aVarB, "params.foregroundUpdater");
            Executor executorC = this.workTaskExecutor.c();
            Intrinsics.checkNotNullExpressionValue(executorC, "workTaskExecutor.getMainThreadExecutor()");
            CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(executorC);
            try {
                WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(this, aVarCreateWorkerWithDefaultFallback, t0aVarB, null);
                c13121.L$0 = this;
                c13121.L$1 = workerParameters2;
                c13121.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, workerWrapper$runWorker$result$1, c13121);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                workerWrapper = this;
                workerParameters = workerParameters2;
            } catch (CancellationException e) {
                e = e;
                workerWrapper = this;
                String str3 = WorkerWrapperKt.TAG;
                ppe.e().g(str3, workerWrapper.workDescription + " was cancelled", e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                workerWrapper = this;
                workerParameters = workerParameters2;
                String str4 = WorkerWrapperKt.TAG;
                ppe.e().d(str4, workerWrapper.workDescription + " failed because it threw an exception/error", th);
                workerExecutionExceptionHandler = workerWrapper.configuration.getWorkerExecutionExceptionHandler();
                if (workerExecutionExceptionHandler != null) {
                    WorkerExceptionUtilsKt.safeAccept(workerExecutionExceptionHandler, new WorkerExceptionInfo(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.TAG);
                }
                return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            workerParameters = (WorkerParameters) c13121.L$1;
            workerWrapper = (WorkerWrapper) c13121.L$0;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (CancellationException e2) {
                e = e2;
                String str5 = WorkerWrapperKt.TAG;
                ppe.e().g(str5, workerWrapper.workDescription + " was cancelled", e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                String str6 = WorkerWrapperKt.TAG;
                ppe.e().d(str6, workerWrapper.workDescription + " failed because it threw an exception/error", th);
                workerExecutionExceptionHandler = workerWrapper.configuration.getWorkerExecutionExceptionHandler();
                if (workerExecutionExceptionHandler != null) {
                    WorkerExceptionUtilsKt.safeAccept(workerExecutionExceptionHandler, new WorkerExceptionInfo(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.TAG);
                }
                return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
            }
        }
        androidx.work.a.AbstractC0080a result = (androidx.work.a.AbstractC0080a) objWithContext;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return new Resolution.Finished(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean runWorker$lambda$1(WorkerWrapper workerWrapper) {
        WorkSpec workSpec = workerWrapper.workSpec;
        if (workSpec.state != WorkInfo.State.ENQUEUED) {
            String str = WorkerWrapperKt.TAG;
            ppe.e().a(str, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!workSpec.isPeriodic() && !workerWrapper.workSpec.isBackedOff()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.calculateNextRunTime()) {
            return Boolean.FALSE;
        }
        ppe.e().a(WorkerWrapperKt.TAG, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    private final boolean setSucceeded(androidx.work.a.AbstractC0080a result) {
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data dataE = ((androidx.work.a.AbstractC0080a.c) result).e();
        Intrinsics.checkNotNullExpressionValue(dataE, "success.outputData");
        this.workSpecDao.setOutput(this.workSpecId, dataE);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.getDependentWorkIds(this.workSpecId)) {
            if (this.workSpecDao.getState(str) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(str)) {
                String str2 = WorkerWrapperKt.TAG;
                ppe.e().f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                this.workSpecDao.setLastEnqueueTime(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    private final boolean trySetRunning() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: wnr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper.trySetRunning$lambda$11(this.f38184a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean trySetRunning$lambda$11(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, WorkInfo.STOP_REASON_NOT_STOPPED);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    @NotNull
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void interrupt(int stopReason) {
        this.workerJob.cancel((CancellationException) new WorkerStoppedException(stopReason));
    }

    @NotNull
    public final lhe<Boolean> launch() {
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.a().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new AnonymousClass1(null), 2, null);
    }

    @VisibleForTesting
    public final boolean setFailed(@NotNull androidx.work.a.AbstractC0080a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data dataE = ((androidx.work.a.AbstractC0080a.C0081a) result).e();
        Intrinsics.checkNotNullExpressionValue(dataE, "failure.outputData");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, dataE);
        return false;
    }
}
