package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022-\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"simpleChannelFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class SimpleChannelFlowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2 $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", i = {0, 1}, l = {64, 65}, m = "invokeSuspend", n = {"producer", "producer"}, s = {"L$0", "L$0"})
        public static final class C00601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FlowCollector $this_flow;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00601(FlowCollector flowCollector, Continuation continuation) {
                super(2, continuation);
                this.$this_flow = flowCollector;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                C00601 c00601 = new C00601(this.$this_flow, completion);
                c00601.L$0 = obj;
                return c00601;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x005c A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:15:0x005d  */
            /* JADX WARN: Code duplicated, block: B:18:0x0069  */
            /* JADX WARN: Code duplicated, block: B:20:0x007b A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x007c  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0079 -> B:7:0x001a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.label
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r12.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r5 = r12.L$0
                    kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                L1a:
                    r13 = r1
                    r1 = r5
                    goto L50
                L1d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L25:
                    java.lang.Object r1 = r12.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r5 = r12.L$0
                    kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto L61
                L31:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Object r13 = r12.L$0
                    r5 = r13
                    kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                    r13 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.Channel r13 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r13, r4, r4, r1, r4)
                    androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                    r8.<init>(r12, r13, r4)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                    kotlinx.coroutines.channels.ChannelIterator r13 = r13.iterator()
                L50:
                    r12.L$0 = r1
                    r12.L$1 = r13
                    r12.label = r3
                    java.lang.Object r5 = r13.hasNext(r12)
                    if (r5 != r0) goto L5d
                    return r0
                L5d:
                    r11 = r1
                    r1 = r13
                    r13 = r5
                    r5 = r11
                L61:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L7c
                    java.lang.Object r13 = r1.next()
                    kotlinx.coroutines.flow.FlowCollector r6 = r12.$this_flow
                    r12.L$0 = r5
                    r12.L$1 = r1
                    r12.label = r2
                    java.lang.Object r13 = r6.emit(r13, r12)
                    if (r13 != r0) goto L1a
                    return r0
                L7c:
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r5, r4, r3, r4)
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt.AnonymousClass1.C00601.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, completion);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C00601 c00601 = new C00601((FlowCollector) this.L$0, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c00601, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> Flow<T> simpleChannelFlow(@NotNull Function2<? super SimpleProducerScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt__ContextKt.buffer$default(FlowKt.flow(new AnonymousClass1(block, null)), -2, null, 2, null);
    }
}
