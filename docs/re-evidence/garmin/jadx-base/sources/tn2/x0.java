package tn2;

import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f165732b;

    public /* synthetic */ x0(y0 y0Var, int i14) {
        this.f165731a = i14;
        this.f165732b = y0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165731a;
        int i15 = 16;
        int i16 = 11;
        int i17 = 15;
        y0 y0Var = this.f165732b;
        switch (i14) {
            case 0:
                y0.c cVar = (y0.c) obj;
                Logger logger = y0.f165733f;
                cVar.getClass();
                y0.f165733f.trace("start renewCache");
                o62.b0 b0Var = new o62.b0(i15, cVar, y0Var);
                int i18 = w03.b.f181178a;
                return new z03.h(b0Var).d(new z03.h(new o62.b0(i17, new y0.d.b(cVar), y0Var)));
            case 1:
                Logger logger2 = y0.f165733f;
                a73.h hVar = new a73.h(y0Var, i16);
                int i19 = w03.b.f181178a;
                new z03.d(hVar).k(l13.a.f108328c).a(new y03.h());
                return Unit.INSTANCE;
            case 2:
                rn2.j jVar = (rn2.j) obj;
                Logger logger3 = y0.f165733f;
                jVar.getClass();
                y0.f165733f.trace("Felica card list fetched");
                com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(6, jVar.d(), y0Var);
                int i24 = w03.b.f181178a;
                return new z03.d(bVar).d(new e13.k(new e13.o(q03.r.e(y0Var.f165735a.f165632a.f165680a.E(p13.a1.b(qs2.a.f147386o.f147399d), false)).g(l13.a.f108328c), new v(new m(10), i16)), new p0(new sy.i(22, y0Var, jVar), i15)));
            default:
                Throwable th3 = (Throwable) obj;
                Logger logger4 = y0.f165733f;
                th3.getClass();
                o62.b0 b0Var2 = new o62.b0(i17, new y0.d.a(th3), y0Var);
                int i25 = w03.b.f181178a;
                return new z03.h(b0Var2);
        }
    }
}
