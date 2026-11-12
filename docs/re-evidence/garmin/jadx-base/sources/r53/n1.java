package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/n1;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f150757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f150758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f150759c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 111}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150761b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n1 f150763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f150764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f150765f;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150760a = obj;
            this.f150761b |= Integer.MIN_VALUE;
            return n1.this.collect(null, this);
        }
    }

    public n1(Object obj, i iVar, e23.q qVar) {
        this.f150757a = obj;
        this.f150758b = iVar;
        this.f150759c = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r8.collect(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // r53.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) {
        a aVar;
        n1 n1Var;
        j jVar2;
        p005kotlin.jvm.internal.r0 r0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150761b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150761b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150760a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150761b;
        if (i15 != 0) {
            if (i15 == 1) {
                r0Var = aVar.f150765f;
                j jVar3 = aVar.f150764e;
                n1Var = aVar.f150763d;
                o13.r.b(obj);
                jVar2 = jVar3;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
        ?? r14 = this.f150757a;
        r0VarS.f105810a = r14;
        aVar.f150763d = this;
        aVar.f150764e = jVar;
        aVar.f150765f = r0VarS;
        aVar.f150761b = 1;
        if (jVar.emit(r14, aVar) != aVar2) {
            n1Var = this;
            jVar2 = jVar;
            r0Var = r0VarS;
        }
        return aVar2;
        i iVar = n1Var.f150758b;
        o1 o1Var = new o1(r0Var, n1Var.f150759c, jVar2);
        aVar.f150763d = null;
        aVar.f150764e = null;
        aVar.f150765f = null;
        aVar.f150761b = 2;
    }
}
