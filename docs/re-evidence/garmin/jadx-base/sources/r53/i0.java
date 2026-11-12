package r53;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/i0;", "Lr53/j;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements j<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p f150643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f150644b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i0 f150645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150647c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f150649e;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150646b = obj;
            this.f150647c |= Integer.MIN_VALUE;
            return i0.this.emit(null, this);
        }
    }

    public i0(e23.p pVar, j jVar) {
        this.f150643a = pVar;
        this.f150644b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    @Override // r53.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, t13.d<? super Unit> dVar) {
        a aVar;
        Object obj2;
        Object obj3;
        i0 i0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150647c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150647c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj4 = aVar.f150646b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150647c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(obj4);
            aVar.f150645a = this;
            aVar.f150649e = obj;
            aVar.f150647c = 1;
            Object objInvoke = this.f150643a.invoke(obj, aVar);
            if (objInvoke != aVar2) {
                obj2 = objInvoke;
                obj3 = obj;
                i0Var = this;
            }
            return aVar2;
        }
        if (i15 == 1) {
            Object obj5 = aVar.f150649e;
            i0 i0Var2 = aVar.f150645a;
            o13.r.b(obj4);
            obj3 = obj5;
            i0Var = i0Var2;
            obj2 = obj4;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i0Var = aVar.f150645a;
            o13.r.b(obj4);
        }
        if (z14) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(i0Var);
        if (((Boolean) obj2).booleanValue()) {
            j jVar = i0Var.f150644b;
            aVar.f150645a = i0Var;
            aVar.f150649e = null;
            aVar.f150647c = 2;
        } else {
            z14 = false;
        }
        if (z14) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(i0Var);
    }
}
