package m92;

import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import s1.o1;
import s1.q1;
import sk0.r1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f117448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f117449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f117450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f117451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f117452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f117453h;

    public /* synthetic */ v(i53.c cVar, Float f14, float f15, h0.e.d dVar, g6.f fVar, Float f16, Float f17) {
        this.f117446a = 0;
        this.f117448c = cVar;
        this.f117449d = f14;
        this.f117447b = f15;
        this.f117452g = dVar;
        this.f117453h = fVar;
        this.f117450e = f16;
        this.f117451f = f17;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, s1.j] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f117446a) {
            case 0:
                i53.c cVar = (i53.c) this.f117448c;
                Float f14 = (Float) this.f117449d;
                h0.e.d dVar = (h0.e.d) this.f117452g;
                g6.f fVar = (g6.f) this.f117453h;
                Float f15 = (Float) this.f117450e;
                Float f16 = (Float) this.f117451f;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                w.b(fVar2, cVar, f14, this.f117447b, dVar, fVar, null, null, f15, f16);
                break;
            case 1:
                r0 r0Var = (r0) this.f117448c;
                s1.g gVar = (s1.g) this.f117450e;
                s1.r rVar = (s1.r) this.f117451f;
                s1.m mVar = (s1.m) this.f117452g;
                e23.l lVar = (e23.l) this.f117453h;
                long jLongValue = ((Long) obj).longValue();
                ?? jVar = new s1.j(this.f117449d, gVar.d(), rVar, jLongValue, gVar.getTargetValue(), jLongValue, true, new o1(1, mVar));
                q1.g(jVar, jLongValue, this.f117447b, gVar, mVar, lVar);
                r0Var.f105810a = jVar;
                break;
            default:
                u21.i iVar = (u21.i) this.f117448c;
                l22.a aVar = (l22.a) this.f117449d;
                j02.h0 h0Var = (j02.h0) this.f117450e;
                e23.l lVar2 = (e23.l) this.f117451f;
                e23.p pVar = (e23.p) this.f117452g;
                e23.a aVar2 = (e23.a) this.f117453h;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                t21.h.f161878a.getClass();
                e2.f0.b(f0Var, null, t21.h.f161879b, 3);
                List<s21.m> list = iVar.f168000a;
                f0Var.a(list.size(), new t21.d0(new r1(29), list), new t21.e0(t21.c0.f161849a, list), new z3.e(802480018, true, new t21.f0(list, aVar, h0Var, lVar2, iVar, pVar, this.f117447b)));
                e2.f0.b(f0Var, null, new z3.e(-517479318, true, new ak0.p(aVar2, 18)), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, float f14, o13.h hVar, int i14) {
        this.f117446a = i14;
        this.f117448c = obj;
        this.f117449d = obj2;
        this.f117450e = obj3;
        this.f117451f = obj4;
        this.f117452g = obj5;
        this.f117447b = f14;
        this.f117453h = hVar;
    }
}
