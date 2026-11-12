package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {232, 98}, m = "invokeSuspend")
public final class t1 extends v13.i implements e23.q<r53.j<? super j0>, Integer, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f196479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f196480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f196481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f196482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z53.b f196483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f196484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(t13.d dVar, s1 s1Var, c1 c1Var) {
        super(3, dVar);
        this.f196481d = s1Var;
        this.f196482e = c1Var;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super j0> jVar, Integer num, t13.d<? super Unit> dVar) {
        t1 t1Var = new t1(dVar, this.f196481d, this.f196482e);
        t1Var.f196479b = jVar;
        t1Var.f196480c = num;
        return t1Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r53.s.v(r9, r0, r11) == r1) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar;
        int iIntValue;
        e2.a aVar;
        z53.b bVar;
        r53.i w1Var;
        c1 c1Var = this.f196482e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196478a;
        s1 s1Var = this.f196481d;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iIntValue = this.f196484g;
                    bVar = this.f196483f;
                    aVar = (e2.a) this.f196480c;
                    jVar = this.f196479b;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            jVar = this.f196479b;
            iIntValue = ((Number) this.f196480c).intValue();
            aVar = s1Var.f196413k;
            bVar = aVar.f195892a;
            this.f196479b = jVar;
            this.f196480c = aVar;
            this.f196483f = bVar;
            this.f196484g = iIntValue;
            this.f196478a = 1;
            if (bVar.c(this) != aVar2) {
            }
            return aVar2;
            k1 k1Var = aVar.f195893b.f195891l;
            z0 z0VarA = k1Var.a(c1Var);
            z0.c.f196665b.getClass();
            if (p005kotlin.jvm.internal.s.g(z0VarA, z0.c.f196666c)) {
                w1Var = new r53.l(new j0[0]);
                bVar.e(null);
            } else {
                if (!(k1Var.a(c1Var) instanceof z0.a)) {
                    k1Var.c(c1Var, z0.c.f196667d);
                }
                Unit unit = Unit.INSTANCE;
                bVar.e(null);
                w1Var = new w1(r53.s.u(s1Var.f196410h.a(c1Var), iIntValue == 0 ? 0 : 1), iIntValue);
            }
            this.f196479b = null;
            this.f196480c = null;
            this.f196483f = null;
            this.f196478a = 2;
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }
}
