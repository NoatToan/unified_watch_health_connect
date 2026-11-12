package r53;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/h0;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f150636b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150638b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i0 f150640d;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150637a = obj;
            this.f150638b |= Integer.MIN_VALUE;
            return h0.this.collect(null, this);
        }
    }

    public h0(i iVar, e23.p pVar) {
        this.f150635a = iVar;
        this.f150636b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) {
        a aVar;
        i0 i0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150638b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150638b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150637a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150638b;
        if (i15 == 0) {
            o13.r.b(obj);
            i iVar = this.f150635a;
            i0 i0Var2 = new i0(this.f150636b, jVar);
            try {
                aVar.f150640d = i0Var2;
                aVar.f150638b = 1;
                if (iVar.collect(i0Var2, aVar) == aVar2) {
                    return aVar2;
                }
            } catch (AbortFlowException e4) {
                e = e4;
                i0Var = i0Var2;
                if (e.owner == i0Var) {
                    throw e;
                }
                g8.i.v(aVar.getF157466b());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i0Var = aVar.f150640d;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e14) {
                e = e14;
                if (e.owner == i0Var) {
                    throw e;
                }
                g8.i.v(aVar.getF157466b());
            }
        }
        return Unit.INSTANCE;
    }
}
