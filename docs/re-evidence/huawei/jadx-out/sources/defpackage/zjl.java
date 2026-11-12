package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Be\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012:\u0010\u0007\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013RD\u0010\u0007\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "upstream", "keySelector", "Lkotlin/Function1;", "", "areEquivalent", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zjl<T> implements Flow<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2<Object, Object, Boolean> f54188b;
    private final Flow<T> d;
    public final Function1<T, Object> e;

    /* JADX WARN: Multi-variable type inference failed */
    public zjl(Flow<? extends T> flow, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        this.d = flow;
        this.e = function1;
        this.f54188b = function2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zjl<T> f54189a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FlowCollector<T> f54190c;
        final /* synthetic */ zcw.e<Object> e;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
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
        public final Object emit(T t, Continuation<? super yzc> continuation) {
            C0367e c0367e;
            if (continuation instanceof C0367e) {
                c0367e = (C0367e) continuation;
                if ((c0367e.f54192c & Integer.MIN_VALUE) != 0) {
                    c0367e.f54192c -= Integer.MIN_VALUE;
                } else {
                    c0367e = new C0367e(this, continuation);
                }
            } else {
                c0367e = new C0367e(this, continuation);
            }
            Object obj = c0367e.d;
            Object objA = zbg.a();
            int i = c0367e.f54192c;
            if (i == 0) {
                createFailure.c(obj);
                T t2 = (T) this.f54189a.e.invoke(t);
                if (this.e.f53983c == DONE.f54244b || !this.f54189a.f54188b.invoke(this.e.f53983c, t2).booleanValue()) {
                    this.e.f53983c = t2;
                    FlowCollector<T> flowCollector = this.f54190c;
                    c0367e.f54192c = 1;
                    if (flowCollector.emit(t, c0367e) == objA) {
                        return objA;
                    }
                } else {
                    return yzc.e;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            return yzc.e;
        }

        /* JADX INFO: renamed from: zjl$e$e, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {77}, m = "emit", n = {}, s = {})
        static final class C0367e extends ContinuationImpl {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e<T> f54191b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f54192c;
            /* synthetic */ Object d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.d = obj;
                this.f54192c |= Integer.MIN_VALUE;
                return this.f54191b.emit(null, this);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0367e(e<? super T> eVar, Continuation<? super C0367e> continuation) {
                super(continuation);
                this.f54191b = eVar;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(zjl<T> zjlVar, zcw.e<Object> eVar, FlowCollector<? super T> flowCollector) {
            this.f54189a = zjlVar;
            this.e = eVar;
            this.f54190c = flowCollector;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) {
        zcw.e eVar = new zcw.e();
        eVar.f53983c = (T) DONE.f54244b;
        Object objCollect = this.d.collect(new e(this, eVar, flowCollector), continuation);
        return objCollect == zbg.a() ? objCollect : yzc.e;
    }
}
