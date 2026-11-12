package androidx.room;

import androidx.media3.extractor.ts.TsExtractor;
import defpackage.RESUMED;
import defpackage.createFailure;
import defpackage.isActive;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zjn;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\r\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/jvm/JvmSuppressWildcards;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
final class CoroutinesRoom$Companion$createFlow$1<R> extends SuspendLambda implements Function2<FlowCollector<R>, Continuation<? super yzc>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DTS_HD}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
        final /* synthetic */ FlowCollector<R> $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineDispatcher transactionDispatcher;
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Channel channelA = defpackage.Channel.a(-1, null, null, 6, null);
                final String[] strArr = this.$tableNames;
                ?? r7 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> tables) {
                        zcp.c(tables, "");
                        channelA.mo1959trySendJP2dKIU(yzc.e);
                    }
                };
                channelA.mo1959trySendJP2dKIU(yzc.e);
                TransactionElement transactionElement = (TransactionElement) coroutineScope.getF54264a().get(TransactionElement.INSTANCE);
                if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                    transactionDispatcher = this.$inTransaction ? CoroutinesRoomKt.getTransactionDispatcher(this.$db) : CoroutinesRoomKt.getQueryDispatcher(this.$db);
                }
                Channel channelA2 = defpackage.Channel.a(0, null, null, 7, null);
                RESUMED.b(coroutineScope, transactionDispatcher, null, new C00061(this.$db, r7, channelA, this.$callable, channelA2, null), 2, null);
                this.label = 1;
                if (zjn.d(this.$$this$flow, channelA2, this) == objA) {
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

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {127, 129}, m = "invokeSuspend", n = {}, s = {})
        static final class C00061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ Channel<yzc> $observerChannel;
            final /* synthetic */ Channel<R> $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: Code duplicated, block: B:18:0x004a  */
            /* JADX WARN: Code duplicated, block: B:19:0x004b  */
            /* JADX WARN: Code duplicated, block: B:22:0x0056 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:7:0x0012, B:16:0x003d, B:20:0x004e, B:22:0x0056, B:12:0x0023, B:15:0x0037), top: B:30:0x0008 }] */
            /* JADX WARN: Code duplicated, block: B:25:0x006f  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
            
                if (r7.$resultChannel.send(r8, r7) == r0) goto L24;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ChannelIterator<yzc> it;
                ChannelIterator<yzc> channelIterator;
                Object objHasNext;
                Object objA = zbg.a();
                int i = this.label;
                try {
                    if (i == 0) {
                        createFailure.c(obj);
                        this.$db.getInvalidationTracker().addObserver(this.$observer);
                        it = this.$observerChannel.iterator();
                        this.L$0 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == objA) {
                            channelIterator = it;
                            obj = objHasNext;
                            if (((Boolean) obj).booleanValue()) {
                                channelIterator.next();
                                R rCall = this.$callable.call();
                                this.L$0 = channelIterator;
                                this.label = 2;
                            } else {
                                this.$db.getInvalidationTracker().removeObserver(this.$observer);
                                return yzc.e;
                            }
                        }
                        return objA;
                    }
                    if (i == 1) {
                        channelIterator = (ChannelIterator) this.L$0;
                        createFailure.c(obj);
                        if (((Boolean) obj).booleanValue()) {
                            channelIterator.next();
                            R rCall2 = this.$callable.call();
                            this.L$0 = channelIterator;
                            this.label = 2;
                        } else {
                            this.$db.getInvalidationTracker().removeObserver(this.$observer);
                            return yzc.e;
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (ChannelIterator) this.L$0;
                        createFailure.c(obj);
                    }
                    it = channelIterator;
                    this.L$0 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == objA) {
                        channelIterator = it;
                        obj = objHasNext;
                        if (((Boolean) obj).booleanValue()) {
                            channelIterator.next();
                            R rCall3 = this.$callable.call();
                            this.L$0 = channelIterator;
                            this.label = 2;
                        } else {
                            this.$db.getInvalidationTracker().removeObserver(this.$observer);
                            return yzc.e;
                        }
                    }
                    return objA;
                } catch (Throwable th) {
                    this.$db.getInvalidationTracker().removeObserver(this.$observer);
                    throw th;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
                return ((C00061) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
                return new C00061(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00061(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, Channel<yzc> channel, Callable<R> callable, Channel<R> channel2, Continuation<? super C00061> continuation) {
                super(2, continuation);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = channel;
                this.$callable = callable;
                this.$resultChannel = channel2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, RoomDatabase roomDatabase, FlowCollector<R> flowCollector, String[] strArr, Callable<R> callable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$inTransaction = z;
            this.$db = roomDatabase;
            this.$$this$flow = flowCollector;
            this.$tableNames = strArr;
            this.$callable = callable;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA = zbg.a();
        int i = this.label;
        if (i == 0) {
            createFailure.c(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (isActive.e(new AnonymousClass1(this.$inTransaction, this.$db, flowCollector, this.$tableNames, this.$callable, null), this) == objA) {
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
    public final Object invoke(FlowCollector<R> flowCollector, Continuation<? super yzc> continuation) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(flowCollector, continuation)).invokeSuspend(yzc.e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, continuation);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, Continuation<? super CoroutinesRoom$Companion$createFlow$1> continuation) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }
}
