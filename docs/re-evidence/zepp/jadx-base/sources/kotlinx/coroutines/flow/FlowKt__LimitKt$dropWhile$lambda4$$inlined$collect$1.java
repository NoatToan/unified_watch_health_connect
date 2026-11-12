package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1, reason: invalid class name */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1<T> implements FlowCollector<T> {
    public final /* synthetic */ Ref.BooleanRef a;
    public final /* synthetic */ FlowCollector b;
    public final /* synthetic */ Function2 c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1", f = "Limit.kt", i = {1, 1}, l = {136, 137, 139}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1(Ref.BooleanRef booleanRef, FlowCollector flowCollector, Function2 function2) {
        this.a = booleanRef;
        this.b = flowCollector;
        this.c = function2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1<T> flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1;
        FlowCollector flowCollector;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke = anonymousClass1.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (this.a.element) {
                FlowCollector flowCollector2 = this.b;
                anonymousClass1.b = 1;
                if (flowCollector2.emit(t, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Function2 function2 = this.c;
                anonymousClass1.d = this;
                anonymousClass1.e = t;
                anonymousClass1.b = 2;
                InlineMarker.mark(6);
                objInvoke = function2.invoke(t, anonymousClass1);
                InlineMarker.mark(7);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1 = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                    flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.a.element = true;
                    flowCollector = flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.b;
                    anonymousClass1.d = null;
                    anonymousClass1.e = null;
                    anonymousClass1.b = 3;
                    if (flowCollector.emit(t, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objInvoke);
        } else if (i2 == 2) {
            t = (T) anonymousClass1.e;
            flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1 = (FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1) anonymousClass1.d;
            ResultKt.throwOnFailure(objInvoke);
            if (!((Boolean) objInvoke).booleanValue()) {
                flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.a.element = true;
                flowCollector = flowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.b;
                anonymousClass1.d = null;
                anonymousClass1.e = null;
                anonymousClass1.b = 3;
                if (flowCollector.emit(t, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        return Unit.INSTANCE;
    }
}
