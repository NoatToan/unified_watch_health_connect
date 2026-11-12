package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/u;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f150880b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150882b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f150884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f150885e;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150881a = obj;
            this.f150882b |= Integer.MIN_VALUE;
            return u.this.collect(null, this);
        }
    }

    public u(i iVar, e23.q qVar) {
        this.f150879a = iVar;
        this.f150880b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) throws Throwable {
        a aVar;
        u uVar;
        v2 v2Var;
        e23.q qVar;
        s53.x xVar;
        Throwable th3;
        s53.x xVar2;
        e23.q qVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150882b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150882b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150881a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150882b;
        if (i15 == 0) {
            o13.r.b(obj);
            try {
                i iVar = this.f150879a;
                aVar.f150884d = this;
                aVar.f150885e = jVar;
                aVar.f150882b = 1;
                if (iVar.collect(jVar, aVar) != aVar2) {
                    uVar = this;
                    xVar = new s53.x(jVar, aVar.getF157466b());
                    qVar2 = uVar.f150880b;
                    aVar.f150884d = xVar;
                    aVar.f150885e = null;
                    aVar.f150882b = 3;
                    if (qVar2.invoke(xVar, null, aVar) != aVar2) {
                        xVar2 = xVar;
                        xVar2.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                uVar = this;
                v2Var = new v2(th);
                qVar = uVar.f150880b;
                aVar.f150884d = th;
                aVar.f150885e = null;
                aVar.f150882b = 2;
                if (s.b(v2Var, qVar, th, aVar) == aVar2) {
                    throw th;
                }
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                Throwable th5 = (Throwable) aVar.f150884d;
                o13.r.b(obj);
                throw th5;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar2 = (s53.x) aVar.f150884d;
            try {
                o13.r.b(obj);
                xVar2.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                th3 = th6;
                xVar2.releaseIntercepted();
                throw th3;
            }
        }
        jVar = aVar.f150885e;
        uVar = (u) aVar.f150884d;
        try {
            o13.r.b(obj);
            xVar = new s53.x(jVar, aVar.getF157466b());
            try {
                qVar2 = uVar.f150880b;
                aVar.f150884d = xVar;
                aVar.f150885e = null;
                aVar.f150882b = 3;
                if (qVar2.invoke(xVar, null, aVar) != aVar2) {
                    xVar2 = xVar;
                    xVar2.releaseIntercepted();
                    return Unit.INSTANCE;
                }
            } catch (Throwable th7) {
                th3 = th7;
                xVar2 = xVar;
                xVar2.releaseIntercepted();
                throw th3;
            }
        } catch (Throwable th8) {
            th = th8;
            v2Var = new v2(th);
            qVar = uVar.f150880b;
            aVar.f150884d = th;
            aVar.f150885e = null;
            aVar.f150882b = 2;
            if (s.b(v2Var, qVar, th, aVar) == aVar2) {
                throw th;
            }
        }
        return aVar2;
    }
}
