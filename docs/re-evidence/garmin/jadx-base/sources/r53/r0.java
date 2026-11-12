package r53;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/r0;", "Lr53/j;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 implements j<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p f150833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f150834b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f150835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150837c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f150839e;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150836b = obj;
            this.f150837c |= Integer.MIN_VALUE;
            return r0.this.emit(null, this);
        }
    }

    public r0(e23.p pVar, p005kotlin.jvm.internal.r0 r0Var) {
        this.f150833a = pVar;
        this.f150834b = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r53.j
    public final Object emit(Object obj, t13.d<? super Unit> dVar) {
        a aVar;
        r0 r0Var;
        T t7;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150837c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150837c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objInvoke = aVar.f150836b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150837c;
        if (i15 == 0) {
            o13.r.b(objInvoke);
            aVar.f150835a = this;
            aVar.f150839e = obj;
            aVar.f150837c = 1;
            objInvoke = this.f150833a.invoke(obj, aVar);
            if (objInvoke == aVar2) {
                return aVar2;
            }
            r0Var = this;
            t7 = obj;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = aVar.f150839e;
            r0Var = aVar.f150835a;
            o13.r.b(objInvoke);
            t7 = obj2;
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        r0Var.f150834b.f105810a = t7;
        throw new AbortFlowException(r0Var);
    }
}
