package androidx.room;

import defpackage.C0468zhz;
import defpackage.asContextElement;
import defpackage.boxBoolean;
import defpackage.createFailure;
import defpackage.probeCoroutineCreated;
import defpackage.runBlocking;
import defpackage.yyt;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zga;
import defpackage.zgf;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a9\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"acquireTransactionThread", "Lkotlin/coroutines/ContinuationInterceptor;", "Ljava/util/concurrent/Executor;", "controlJob", "Lkotlinx/coroutines/Job;", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RoomDatabaseKt {
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object withTransaction(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        C04201 c04201;
        ContinuationInterceptor transactionDispatcher;
        ContinuationInterceptor continuationInterceptor;
        Object objD;
        if (continuation instanceof C04201) {
            c04201 = (C04201) continuation;
            if ((c04201.label & Integer.MIN_VALUE) != 0) {
                c04201.label -= Integer.MIN_VALUE;
            } else {
                c04201 = new C04201(continuation);
            }
        } else {
            c04201 = new C04201(continuation);
        }
        Object objCreateTransactionContext = c04201.result;
        Object objA = zbg.a();
        int i = c04201.label;
        if (i == 0) {
            createFailure.c(objCreateTransactionContext);
            TransactionElement transactionElement = (TransactionElement) c04201.getF54257c().get(TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                c04201.L$0 = roomDatabase;
                c04201.L$1 = function1;
                c04201.label = 1;
                objCreateTransactionContext = createTransactionContext(roomDatabase, c04201);
            } else {
                continuationInterceptor = transactionDispatcher;
                C04212 c04212 = new C04212(roomDatabase, function1, null);
                c04201.L$0 = null;
                c04201.L$1 = null;
                c04201.label = 2;
                objD = zga.d(continuationInterceptor, c04212, c04201);
                if (objD != objA) {
                    return objD;
                }
            }
            return objA;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(objCreateTransactionContext);
            return objCreateTransactionContext;
        }
        function1 = (Function1) c04201.L$1;
        roomDatabase = (RoomDatabase) c04201.L$0;
        createFailure.c(objCreateTransactionContext);
        continuationInterceptor = (CoroutineContext) objCreateTransactionContext;
        C04212 c04213 = new C04212(roomDatabase, function1, null);
        c04201.L$0 = null;
        c04201.L$1 = null;
        c04201.label = 2;
        objD = zga.d(continuationInterceptor, c04213, c04201);
        if (objD != objA) {
            return objA;
        }
        return objD;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$withTransaction$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabaseExt.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
    static final class C04212<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ RoomDatabase $this_withTransaction;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TransactionElement transactionElement;
            TransactionElement transactionElement2;
            Throwable th;
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getF54264a().get(TransactionElement.INSTANCE);
                zcp.e(element);
                transactionElement = (TransactionElement) element;
                transactionElement.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        Function1<Continuation<? super R>, Object> function1 = this.$block;
                        this.L$0 = transactionElement;
                        this.label = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == objA) {
                            return objA;
                        }
                        transactionElement2 = transactionElement;
                        obj = objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    transactionElement.release();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement2 = (TransactionElement) this.L$0;
                try {
                    createFailure.c(obj);
                } catch (Throwable th4) {
                    TransactionElement transactionElement3 = transactionElement2;
                    th = th4;
                    transactionElement = transactionElement3;
                    try {
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    } catch (Throwable th5) {
                        transactionElement2 = transactionElement;
                        th = th5;
                        TransactionElement transactionElement4 = transactionElement2;
                        th = th;
                        transactionElement = transactionElement4;
                        transactionElement.release();
                        throw th;
                    }
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            try {
                this.$this_withTransaction.endTransaction();
                transactionElement2.release();
                return obj;
            } catch (Throwable th6) {
                th = th6;
                TransactionElement transactionElement5 = transactionElement2;
                th = th;
                transactionElement = transactionElement5;
                transactionElement.release();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C04212) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            C04212 c04212 = new C04212(this.$this_withTransaction, this.$block, continuation);
            c04212.L$0 = obj;
            return c04212;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04212(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super C04212> continuation) {
            super(2, continuation);
            this.$this_withTransaction = roomDatabase;
            this.$block = function1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object createTransactionContext(RoomDatabase roomDatabase, Continuation<? super CoroutineContext> continuation) {
        AnonymousClass1 anonymousClass1;
        RoomDatabase roomDatabase2;
        CompletableJob completableJob;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object objA = zbg.a();
        int i = anonymousClass1.label;
        if (i == 0) {
            createFailure.c(obj);
            final CompletableJob completableJobA = C0468zhz.a(null, 1, null);
            Job job = (Job) anonymousClass1.getF54257c().get(Job.INSTANCE);
            if (job != null) {
                job.invokeOnCompletion(new Function1<Throwable, yzc>() { // from class: androidx.room.RoomDatabaseKt.createTransactionContext.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
                        invoke2(th);
                        return yzc.e;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        Job.b.c(completableJobA, null, 1, null);
                    }

                    {
                        super(1);
                    }
                });
            }
            anonymousClass1.L$0 = roomDatabase;
            anonymousClass1.L$1 = completableJobA;
            anonymousClass1.label = 1;
            Object objAcquireTransactionThread = acquireTransactionThread(roomDatabase.getTransactionExecutor(), completableJobA, anonymousClass1);
            if (objAcquireTransactionThread == objA) {
                return objA;
            }
            roomDatabase2 = roomDatabase;
            completableJob = completableJobA;
            obj = objAcquireTransactionThread;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = (CompletableJob) anonymousClass1.L$1;
            roomDatabase2 = (RoomDatabase) anonymousClass1.L$0;
            createFailure.c(obj);
        }
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) obj;
        return continuationInterceptor.plus(new TransactionElement(completableJob, continuationInterceptor)).plus(asContextElement.e(roomDatabase2.getSuspendingTransactionId(), boxBoolean.c(System.identityHashCode(completableJob))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object acquireTransactionThread(Executor executor, final Job job, Continuation<? super ContinuationInterceptor> continuation) {
        zgf zgfVar = new zgf(zbg.c(continuation), 1);
        zgfVar.initCancellability();
        final zgf zgfVar2 = zgfVar;
        zgfVar2.invokeOnCancellation(new Function1<Throwable, yzc>() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
                invoke2(th);
                return yzc.e;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Job.b.c(job, null, 1, null);
            }

            {
                super(1);
            }
        });
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabaseExt.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
                    final /* synthetic */ CancellableContinuation<ContinuationInterceptor> $continuation;
                    final /* synthetic */ Job $controlJob;
                    private /* synthetic */ Object L$0;
                    int label;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objA = zbg.a();
                        int i = this.label;
                        if (i == 0) {
                            createFailure.c(obj);
                            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                            CancellableContinuation<ContinuationInterceptor> cancellableContinuation = this.$continuation;
                            yyt.c cVar = yyt.f53903b;
                            CoroutineContext.Element element = coroutineScope.getF54264a().get(ContinuationInterceptor.INSTANCE);
                            zcp.e(element);
                            cancellableContinuation.resumeWith(yyt.e(element));
                            this.label = 1;
                            if (this.$controlJob.join(this) == objA) {
                                return objA;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            createFailure.c(obj);
                        }
                        return yzc.e;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$continuation, this.$controlJob, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(CancellableContinuation<? super ContinuationInterceptor> cancellableContinuation, Job job, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$continuation = cancellableContinuation;
                        this.$controlJob = job;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    runBlocking.c(null, new AnonymousClass1(zgfVar2, job, null), 1, null);
                }
            });
        } catch (RejectedExecutionException e) {
            zgfVar2.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB;
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$createTransactionContext$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", i = {0, 0}, l = {100}, m = "createTransactionContext", n = {"$this$createTransactionContext", "controlJob"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.createTransactionContext(null, this);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$withTransaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", i = {0, 0}, l = {51, 52}, m = "withTransaction", n = {"$this$withTransaction", "block"}, s = {"L$0", "L$1"})
    static final class C04201<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.withTransaction(null, null, this);
        }

        C04201(Continuation<? super C04201> continuation) {
            super(continuation);
        }
    }
}
