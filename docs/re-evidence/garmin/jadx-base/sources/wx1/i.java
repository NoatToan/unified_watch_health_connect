package wx1;

import g21.f0;
import p005kotlin.Unit;
import p3.p0;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f187955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f187956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f187957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f187958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f187959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f187960h;

    public /* synthetic */ i(h4.r rVar, v21.e eVar, f0 f0Var, x0 x0Var, g21.u uVar, int i14, int i15) {
        this.f187953a = 3;
        this.f187957e = rVar;
        this.f187954b = eVar;
        this.f187958f = f0Var;
        this.f187959g = x0Var;
        this.f187960h = uVar;
        this.f187955c = i14;
        this.f187956d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f187953a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(7);
                k.a(this.f187955c, this.f187956d, (i53.c) this.f187957e, (e23.p) this.f187954b, (e23.a) this.f187958f, (e23.a) this.f187959g, (e23.a) this.f187960h, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                xn0.b.a((z3.e) this.f187957e, (z3.e) this.f187958f, (e23.p) this.f187954b, (z3.e) this.f187959g, (e23.p) this.f187960h, (p3.m) obj, p0.t(this.f187955c | 1), this.f187956d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                xx1.g.a(this.f187955c, this.f187956d, (mx1.e) this.f187957e, (e23.l) this.f187954b, (e23.a) this.f187958f, (e23.a) this.f187959g, (e23.a) this.f187960h, (p3.m) obj, iT2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                y01.m.a((h4.r) this.f187957e, (v21.e) this.f187954b, (f0) this.f187958f, (x0) this.f187959g, (g21.u) this.f187960h, (p3.m) obj, p0.t(this.f187955c | 1), this.f187956d);
                break;
            default:
                ((Integer) obj2).getClass();
                y22.d.a((String) this.f187958f, (i53.c) this.f187957e, this.f187955c, (e23.l) this.f187959g, (e23.p) this.f187954b, (e23.l) this.f187960h, (p3.m) obj, p0.t(this.f187956d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(int i14, int i15, Object obj, o13.h hVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i16, int i17) {
        this.f187953a = i17;
        this.f187955c = i14;
        this.f187956d = i15;
        this.f187957e = obj;
        this.f187954b = hVar;
        this.f187958f = aVar;
        this.f187959g = aVar2;
        this.f187960h = aVar3;
    }

    public /* synthetic */ i(String str, i53.c cVar, int i14, e23.l lVar, e23.p pVar, e23.l lVar2, int i15) {
        this.f187953a = 4;
        this.f187958f = str;
        this.f187957e = cVar;
        this.f187955c = i14;
        this.f187959g = lVar;
        this.f187954b = pVar;
        this.f187960h = lVar2;
        this.f187956d = i15;
    }

    public /* synthetic */ i(z3.e eVar, z3.e eVar2, e23.p pVar, z3.e eVar3, e23.p pVar2, int i14, int i15) {
        this.f187953a = 1;
        this.f187957e = eVar;
        this.f187958f = eVar2;
        this.f187954b = pVar;
        this.f187959g = eVar3;
        this.f187960h = pVar2;
        this.f187955c = i14;
        this.f187956d = i15;
    }
}
