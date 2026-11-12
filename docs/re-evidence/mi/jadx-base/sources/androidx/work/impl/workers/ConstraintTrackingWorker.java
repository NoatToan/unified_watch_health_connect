package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.core.util.Consumer;
import androidx.work.CoroutineWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import defpackage.enr;
import defpackage.lhe;
import defpackage.ppe;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/a$a;", "setupAndRunConstraintTrackingWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/a;", "delegate", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "workConstraintsTracker", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "runWorker", "(Landroidx/work/a;Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/WorkerParameters;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ConstraintUnsatisfiedException", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n29#2:169\n19#2:170\n19#2:171\n19#2:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n*L\n65#1:169\n75#1:170\n78#1:171\n87#1:172\n*E\n"})
public final class ConstraintTrackingWorker extends CoroutineWorker {

    @NotNull
    private final WorkerParameters workerParameters;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/a$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/a$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super a.AbstractC0080a>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                this.label = 1;
                obj = constraintTrackingWorker.setupAndRunConstraintTrackingWork(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super a.AbstractC0080a> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {}, l = {125}, m = "runWorker", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.runWorker(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/a$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/a$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker$runWorker$2\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n22#2:169\n22#2:170\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker$runWorker$2\n*L\n137#1:169\n144#1:170\n*E\n"})
    public static final class C13212 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super a.AbstractC0080a>, Object> {
        final /* synthetic */ a $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13212(a aVar, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super C13212> continuation) {
            super(2, continuation);
            this.$delegate = aVar;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13212 c13212 = new C13212(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
            c13212.L$0 = obj;
            return c13212;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.Job] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            lhe<a.AbstractC0080a> lheVar;
            Object objAwait;
            AtomicInteger atomicInteger2;
            Job job;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.label;
            try {
                if (r2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    AtomicInteger atomicInteger3 = new AtomicInteger(WorkInfo.STOP_REASON_NOT_STOPPED);
                    lhe<a.AbstractC0080a> lheVarStartWork = this.$delegate.startWork();
                    Intrinsics.checkNotNullExpressionValue(lheVarStartWork, "delegate.startWork()");
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger3, lheVarStartWork, null), 3, null);
                    try {
                        this.L$0 = atomicInteger3;
                        this.L$1 = lheVarStartWork;
                        this.L$2 = jobLaunch$default;
                        this.label = 1;
                        objAwait = ListenableFutureKt.await(lheVarStartWork, this);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicInteger2 = atomicInteger3;
                        job = jobLaunch$default;
                        lheVar = lheVarStartWork;
                        a.AbstractC0080a abstractC0080a = (a.AbstractC0080a) objAwait;
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        return abstractC0080a;
                    } catch (CancellationException e) {
                        e = e;
                        atomicInteger = atomicInteger3;
                        lheVar = lheVarStartWork;
                    } catch (Throwable th) {
                        th = th;
                        String str = ConstraintTrackingWorkerKt.TAG;
                        a aVar = this.$delegate;
                        ppe.e().b(str, "Delegated worker " + aVar.getClass() + " threw exception in startWork.", th);
                        throw th;
                    }
                } else {
                    if (r2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    job = (Job) this.L$2;
                    lheVar = (lhe) this.L$1;
                    atomicInteger = (AtomicInteger) this.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            atomicInteger2 = atomicInteger;
                            objAwait = obj;
                            try {
                                a.AbstractC0080a abstractC0080a2 = (a.AbstractC0080a) objAwait;
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                return abstractC0080a2;
                            } catch (CancellationException e2) {
                                e = e2;
                                atomicInteger = atomicInteger2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            String str2 = ConstraintTrackingWorkerKt.TAG;
                            a aVar2 = this.$delegate;
                            ppe.e().b(str2, "Delegated worker " + aVar2.getClass() + " threw exception in startWork.", th);
                            throw th;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                    }
                }
                String str3 = ConstraintTrackingWorkerKt.TAG;
                a aVar3 = this.$delegate;
                ppe.e().b(str3, "Delegated worker " + aVar3.getClass() + " was cancelled", e);
                boolean z = atomicInteger.get() != -256;
                if (lheVar.isCancelled() && z) {
                    throw new ConstraintUnsatisfiedException(atomicInteger.get());
                }
                throw e;
            } catch (Throwable th3) {
                Job.DefaultImpls.cancel$default((Job) r2, (CancellationException) null, 1, (Object) null);
                throw th3;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super a.AbstractC0080a> continuation) {
            return ((C13212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {0, 0}, l = {97}, m = "setupAndRunConstraintTrackingWork", n = {"this", "delegate"}, s = {"L$0", "L$1"})
    public static final class C13221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13221(Continuation<? super C13221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/a$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/a$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super a.AbstractC0080a>, Object> {
        final /* synthetic */ a $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(a aVar, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$delegate = aVar;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new AnonymousClass5(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                a aVar = this.$delegate;
                WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
                WorkSpec workSpec = this.$workSpec;
                this.label = 1;
                obj = constraintTrackingWorker.runWorker(aVar, workConstraintsTracker, workSpec, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super a.AbstractC0080a> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object runWorker(a aVar, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super a.AbstractC0080a> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCoroutineScope = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            C13212 c13212 = new C13212(aVar, workConstraintsTracker, workSpec, null);
            anonymousClass1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(c13212, anonymousClass1);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoroutineScope);
        }
        Intrinsics.checkNotNullExpressionValue(objCoroutineScope, "delegate: ListenableWork….cancel()\n        }\n    }");
        return objCoroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object setupAndRunConstraintTrackingWork(Continuation<? super a.AbstractC0080a> continuation) {
        C13221 c13221;
        ConstraintTrackingWorker constraintTrackingWorker;
        a aVar;
        int stopReason;
        if (continuation instanceof C13221) {
            c13221 = (C13221) continuation;
            int i = c13221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13221.label = i - Integer.MIN_VALUE;
            } else {
                c13221 = new C13221(continuation);
            }
        } else {
            c13221 = new C13221(continuation);
        }
        C13221 c13222 = c13221;
        Object objWithContext = c13222.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
            if (string == null || string.length() == 0) {
                ppe.e().c(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
                a.AbstractC0080a abstractC0080aA = a.AbstractC0080a.a();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aA, "failure()");
                return abstractC0080aA;
            }
            enr enrVarE = enr.e(getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(enrVarE, "getInstance(applicationContext)");
            WorkSpecDao workSpecDao = enrVarE.j().workSpecDao();
            String string2 = getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
            WorkSpec workSpec = workSpecDao.getWorkSpec(string2);
            if (workSpec == null) {
                a.AbstractC0080a abstractC0080aA2 = a.AbstractC0080a.a();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aA2, "failure()");
                return abstractC0080aA2;
            }
            Trackers trackersI = enrVarE.i();
            Intrinsics.checkNotNullExpressionValue(trackersI, "workManagerImpl.trackers");
            WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackersI);
            if (!workConstraintsTracker.areAllConstraintsMet(workSpec)) {
                String str = ConstraintTrackingWorkerKt.TAG;
                ppe.e().a(str, "Constraints not met for delegate " + string + ". Requesting retry.");
                a.AbstractC0080a abstractC0080aB = a.AbstractC0080a.b();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aB, "retry()");
                return abstractC0080aB;
            }
            String str2 = ConstraintTrackingWorkerKt.TAG;
            ppe.e().a(str2, "Constraints met for delegate " + string);
            try {
                WorkerFactory workerFactory = getWorkerFactory();
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                a aVarCreateWorkerWithDefaultFallback = workerFactory.createWorkerWithDefaultFallback(applicationContext, string, this.workerParameters);
                Executor executorC = this.workerParameters.k().c();
                Intrinsics.checkNotNullExpressionValue(executorC, "workerParameters.taskExecutor.mainThreadExecutor");
                try {
                    CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(executorC);
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(aVarCreateWorkerWithDefaultFallback, workConstraintsTracker, workSpec, null);
                    c13222.L$0 = this;
                    c13222.L$1 = aVarCreateWorkerWithDefaultFallback;
                    c13222.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, anonymousClass5, c13222);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    constraintTrackingWorker = this;
                    aVar = aVarCreateWorkerWithDefaultFallback;
                } catch (CancellationException e) {
                    e = e;
                    constraintTrackingWorker = this;
                    aVar = aVarCreateWorkerWithDefaultFallback;
                    if (constraintTrackingWorker.isStopped() || (e instanceof ConstraintUnsatisfiedException)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                        } else if (constraintTrackingWorker.isStopped()) {
                            stopReason = constraintTrackingWorker.getStopReason();
                        } else {
                            if (!(e instanceof ConstraintUnsatisfiedException)) {
                                throw new IllegalStateException("Unreachable");
                            }
                            stopReason = ((ConstraintUnsatisfiedException) e).getStopReason();
                        }
                        aVar.stop(stopReason);
                    }
                    if (e instanceof ConstraintUnsatisfiedException) {
                        throw e;
                    }
                    a.AbstractC0080a abstractC0080aB2 = a.AbstractC0080a.b();
                    Intrinsics.checkNotNullExpressionValue(abstractC0080aB2, "{\n            // there a…throw cancelled\n        }");
                    return abstractC0080aB2;
                }
            } catch (Throwable th) {
                ppe.e().a(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
                Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = enrVarE.getConfiguration().getWorkerInitializationExceptionHandler();
                if (workerInitializationExceptionHandler != null) {
                    WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, new WorkerExceptionInfo(string, this.workerParameters, th), ConstraintTrackingWorkerKt.TAG);
                }
                a.AbstractC0080a abstractC0080aA3 = a.AbstractC0080a.a();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aA3, "failure()");
                return abstractC0080aA3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c13222.L$1;
            constraintTrackingWorker = (ConstraintTrackingWorker) c13222.L$0;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (CancellationException e2) {
                e = e2;
                if (constraintTrackingWorker.isStopped()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                    } else if (constraintTrackingWorker.isStopped()) {
                        stopReason = constraintTrackingWorker.getStopReason();
                    } else {
                        if (!(e instanceof ConstraintUnsatisfiedException)) {
                            throw new IllegalStateException("Unreachable");
                        }
                        stopReason = ((ConstraintUnsatisfiedException) e).getStopReason();
                    }
                    aVar.stop(stopReason);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                    } else if (constraintTrackingWorker.isStopped()) {
                        stopReason = constraintTrackingWorker.getStopReason();
                    } else {
                        if (!(e instanceof ConstraintUnsatisfiedException)) {
                            throw new IllegalStateException("Unreachable");
                        }
                        stopReason = ((ConstraintUnsatisfiedException) e).getStopReason();
                    }
                    aVar.stop(stopReason);
                }
                if (e instanceof ConstraintUnsatisfiedException) {
                    throw e;
                }
                a.AbstractC0080a abstractC0080aB3 = a.AbstractC0080a.b();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aB3, "{\n            // there a…throw cancelled\n        }");
                return abstractC0080aB3;
            }
        }
        return (a.AbstractC0080a) objWithContext;
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation<? super a.AbstractC0080a> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return BuildersKt.withContext(ExecutorsKt.from(backgroundExecutor), new AnonymousClass2(null), continuation);
    }
}
