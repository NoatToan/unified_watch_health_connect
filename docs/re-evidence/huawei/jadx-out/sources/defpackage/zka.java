package defpackage;

import com.huawei.hiai.awareness.client.AwarenessRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/SharingStarted;", "()V", AwarenessRequest.Field.COMMAND, "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zka implements SharingStarted {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements Function2<FlowCollector<? super SharingCommand>, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f54213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StateFlow<Integer> f54214c;
        int e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.e;
            if (i == 0) {
                createFailure.c(obj);
                FlowCollector flowCollector = (FlowCollector) this.f54213b;
                zcw.b bVar = new zcw.b();
                this.e = 1;
                if (this.f54214c.collect(new AnonymousClass5(bVar, flowCollector), this) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            throw new yym();
        }

        /* JADX INFO: renamed from: zka$e$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "count", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass5<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zcw.b f54215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector<SharingCommand> f54216b;

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            public final Object e(int i, Continuation<? super yzc> continuation) {
                C0368e c0368e;
                if (continuation instanceof C0368e) {
                    c0368e = (C0368e) continuation;
                    if ((c0368e.f54217b & Integer.MIN_VALUE) != 0) {
                        c0368e.f54217b -= Integer.MIN_VALUE;
                    } else {
                        c0368e = new C0368e(this, continuation);
                    }
                } else {
                    c0368e = new C0368e(this, continuation);
                }
                Object obj = c0368e.d;
                Object objA = zbg.a();
                int i2 = c0368e.f54217b;
                if (i2 == 0) {
                    createFailure.c(obj);
                    if (i <= 0 || this.f54215a.d) {
                        return yzc.e;
                    }
                    this.f54215a.d = true;
                    FlowCollector<SharingCommand> flowCollector = this.f54216b;
                    SharingCommand sharingCommand = SharingCommand.START;
                    c0368e.f54217b = 1;
                    if (flowCollector.emit(sharingCommand, c0368e) == objA) {
                        return objA;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                }
                return yzc.e;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return e(((Number) obj).intValue(), continuation);
            }

            /* JADX INFO: renamed from: zka$e$5$e, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            static final class C0368e extends ContinuationImpl {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f54217b;
                /* synthetic */ Object d;
                final /* synthetic */ AnonymousClass5<T> e;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f54217b |= Integer.MIN_VALUE;
                    return this.e.e(0, this);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0368e(AnonymousClass5<? super T> anonymousClass5, Continuation<? super C0368e> continuation) {
                    super(continuation);
                    this.e = anonymousClass5;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(zcw.b bVar, FlowCollector<? super SharingCommand> flowCollector) {
                this.f54215a = bVar;
                this.f54216b = flowCollector;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, Continuation<? super yzc> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f54214c, continuation);
            eVar.f54213b = obj;
            return eVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(StateFlow<Integer> stateFlow, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f54214c = stateFlow;
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> subscriptionCount) {
        return zjn.e(new e(subscriptionCount, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
