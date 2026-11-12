package r53;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/f0;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f150596b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150598b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f150600d;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150597a = obj;
            this.f150598b |= Integer.MIN_VALUE;
            return f0.this.collect(null, this);
        }
    }

    public f0(i iVar, int i14) {
        this.f150595a = iVar;
        this.f150596b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) {
        a aVar;
        AbortFlowException e4;
        Object obj;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150598b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150598b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj2 = aVar.f150597a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150598b;
        if (i15 == 0) {
            o13.r.b(obj2);
            Object obj3 = new Object();
            p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
            try {
                i iVar = this.f150595a;
                g0 g0Var = new g0(p0Var, this.f150596b, jVar, obj3);
                aVar.f150600d = obj3;
                aVar.f150598b = 1;
                if (iVar.collect(g0Var, aVar) == aVar2) {
                    return aVar2;
                }
            } catch (AbortFlowException e14) {
                e4 = e14;
                obj = obj3;
                if (e4.owner != obj) {
                    throw e4;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = aVar.f150600d;
            try {
                o13.r.b(obj2);
            } catch (AbortFlowException e15) {
                e4 = e15;
                if (e4.owner != obj) {
                    throw e4;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
