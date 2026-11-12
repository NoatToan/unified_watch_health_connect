package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\u000f\u0010\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J9\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/paging/SingleRunner;", "", "cancelPreviousInEqualPriority", "", "(Z)V", "holder", "Landroidx/paging/SingleRunner$Holder;", "runInIsolation", "", "priority", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SingleRunner {
    public static final int DEFAULT_PRIORITY = 0;
    private final Holder holder;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runner", "Landroidx/paging/SingleRunner;", "(Landroidx/paging/SingleRunner;)V", "getRunner", "()Landroidx/paging/SingleRunner;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class CancelIsolatedRunnerException extends CancellationException {

        @NotNull
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(@NotNull SingleRunner runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }

        @NotNull
        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "singleRunner", "Landroidx/paging/SingleRunner;", "cancelPreviousInEqualPriority", "", "(Landroidx/paging/SingleRunner;Z)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "previous", "Lkotlinx/coroutines/Job;", "previousPriority", "", "onFinish", "", "job", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEnqueue", "priority", "(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Holder {
        private final boolean cancelPreviousInEqualPriority;
        private final Mutex mutex;
        private Job previous;
        private int previousPriority;
        private final SingleRunner singleRunner;

        public Holder(@NotNull SingleRunner singleRunner, boolean z) {
            Intrinsics.checkNotNullParameter(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z;
            this.mutex = MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object onFinish(@NotNull Job job, @NotNull Continuation<? super Unit> continuation) {
            SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
            Mutex mutex;
            Holder holder;
            if (continuation instanceof SingleRunner$Holder$onFinish$1) {
                singleRunner$Holder$onFinish$1 = (SingleRunner$Holder$onFinish$1) continuation;
                int i = singleRunner$Holder$onFinish$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$onFinish$1.label = i - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuation);
                }
            } else {
                singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuation);
            }
            Object obj = singleRunner$Holder$onFinish$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = singleRunner$Holder$onFinish$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                singleRunner$Holder$onFinish$1.L$0 = this;
                singleRunner$Holder$onFinish$1.L$1 = job;
                singleRunner$Holder$onFinish$1.L$2 = mutex;
                singleRunner$Holder$onFinish$1.label = 1;
                if (mutex.lock(null, singleRunner$Holder$onFinish$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                holder = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex2 = (Mutex) singleRunner$Holder$onFinish$1.L$2;
                Job job2 = (Job) singleRunner$Holder$onFinish$1.L$1;
                holder = (Holder) singleRunner$Holder$onFinish$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                job = job2;
            }
            try {
                if (job == holder.previous) {
                    holder.previous = null;
                }
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                mutex.unlock(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Nullable
        public final Object tryEnqueue(int i, @NotNull Job job, @NotNull Continuation<? super Boolean> continuation) {
            SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
            Holder holder;
            ?? r2;
            Mutex mutex;
            ?? r1;
            Holder holder2;
            int i2;
            if (continuation instanceof SingleRunner$Holder$tryEnqueue$1) {
                singleRunner$Holder$tryEnqueue$1 = (SingleRunner$Holder$tryEnqueue$1) continuation;
                int i3 = singleRunner$Holder$tryEnqueue$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$tryEnqueue$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuation);
                }
            } else {
                singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuation);
            }
            Object obj = singleRunner$Holder$tryEnqueue$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = singleRunner$Holder$tryEnqueue$1.label;
            boolean z = true;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        i = singleRunner$Holder$tryEnqueue$1.I$0;
                        Mutex mutex2 = (Mutex) singleRunner$Holder$tryEnqueue$1.L$2;
                        Job job2 = (Job) singleRunner$Holder$tryEnqueue$1.L$1;
                        holder = (Holder) singleRunner$Holder$tryEnqueue$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 = job2;
                        mutex = mutex2;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = singleRunner$Holder$tryEnqueue$1.I$0;
                        Mutex mutex3 = (Mutex) singleRunner$Holder$tryEnqueue$1.L$2;
                        Job job3 = (Job) singleRunner$Holder$tryEnqueue$1.L$1;
                        holder2 = (Holder) singleRunner$Holder$tryEnqueue$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        mutex = mutex3;
                    }
                    holder = holder2;
                    r2 = r1;
                    holder.previous = r2;
                    holder.previousPriority = i;
                    job = mutex;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                    job.unlock(null);
                    return boolBoxBoolean;
                }
                ResultKt.throwOnFailure(obj);
                Mutex mutex4 = this.mutex;
                singleRunner$Holder$tryEnqueue$1.L$0 = this;
                singleRunner$Holder$tryEnqueue$1.L$1 = job;
                singleRunner$Holder$tryEnqueue$1.L$2 = mutex4;
                singleRunner$Holder$tryEnqueue$1.I$0 = i;
                singleRunner$Holder$tryEnqueue$1.label = 1;
                if (mutex4.lock(null, singleRunner$Holder$tryEnqueue$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                holder = this;
                r2 = job;
                mutex = mutex4;
                Job job4 = holder.previous;
                if (job4 == null || !job4.isActive() || (i2 = holder.previousPriority) < i || (i2 == i && holder.cancelPreviousInEqualPriority)) {
                    if (job4 != null) {
                        job4.cancel((CancellationException) new CancelIsolatedRunnerException(holder.singleRunner));
                    }
                    if (job4 != null) {
                        singleRunner$Holder$tryEnqueue$1.L$0 = holder;
                        singleRunner$Holder$tryEnqueue$1.L$1 = r2;
                        singleRunner$Holder$tryEnqueue$1.L$2 = mutex;
                        singleRunner$Holder$tryEnqueue$1.I$0 = i;
                        singleRunner$Holder$tryEnqueue$1.label = 2;
                        if (job4.join(singleRunner$Holder$tryEnqueue$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = r2;
                        holder2 = holder;
                        mutex = mutex;
                        holder = holder2;
                        r2 = r1;
                    }
                    holder.previous = r2;
                    holder.previousPriority = i;
                    job = mutex;
                } else {
                    z = false;
                    job = mutex;
                }
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z);
                job.unlock(null);
                return boolBoxBoolean2;
            } catch (Throwable th) {
                job.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.paging.SingleRunner$runInIsolation$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@"}, d2 = {"runInIsolation", "", "priority", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "continuation"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {49}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleRunner.this.runInIsolation(0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.SingleRunner$runInIsolation$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {55, 59, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ int $priority;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.$priority = i;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            AnonymousClass2 anonymousClass2 = SingleRunner.this.new AnonymousClass2(this.$priority, this.$block, completion);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
        /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.SingleRunner$Holder] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Job job;
            ?? r9;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            int i = 4;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        Job job2 = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        job = job2;
                    } else if (r1 == 2) {
                        Job job3 = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        r1 = job;
                        r9 = SingleRunner.this.holder;
                        i = 0;
                        this.L$0 = null;
                        this.label = 3;
                        if (r9.onFinish(r1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r1 != 3) {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
                }
                Job job4 = (Job) element;
                Holder holder = SingleRunner.this.holder;
                int i2 = this.$priority;
                this.L$0 = job4;
                this.label = 1;
                Object objTryEnqueue = holder.tryEnqueue(i2, job4, this);
                if (objTryEnqueue == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job = job4;
                obj = objTryEnqueue;
                if (((Boolean) obj).booleanValue()) {
                    Function1 function1 = this.$block;
                    this.L$0 = job;
                    this.label = 2;
                    if (function1.invoke2(this) == coroutine_suspended) {
                        r1 = job;
                        return coroutine_suspended;
                    }
                    r1 = job;
                    r9 = SingleRunner.this.holder;
                    i = 0;
                    this.L$0 = null;
                    this.label = 3;
                    if (r9.onFinish(r1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                ?? r3 = SingleRunner.this.holder;
                this.L$0 = th2;
                this.label = i;
                if (r3.onFinish(r1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.runInIsolation(i, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object runInIsolation(int i, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        SingleRunner singleRunner;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(i, function1, null);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (CancelIsolatedRunnerException e) {
                e = e;
                singleRunner = this;
                if (e.getRunner() != singleRunner) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleRunner = (SingleRunner) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancelIsolatedRunnerException e2) {
                e = e2;
                if (e.getRunner() != singleRunner) {
                    throw e;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public SingleRunner(boolean z) {
        this.holder = new Holder(this, z);
    }

    public /* synthetic */ SingleRunner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
