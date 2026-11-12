package to2;

import d13.j;
import d13.s;
import d13.w;
import e23.l;
import org.slf4j.Logger;
import p005kotlin.Unit;
import q03.o;
import tn2.n0;
import tn2.p0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f165898b;

    public /* synthetic */ d(f fVar, int i14) {
        this.f165897a = i14;
        this.f165898b = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o jVar;
        int i14 = this.f165897a;
        f fVar = this.f165898b;
        switch (i14) {
            case 0:
                h hVar = (h) obj;
                i iVar = fVar.f165903b;
                hVar.getClass();
                iVar.a(hVar);
                return Unit.INSTANCE;
            case 1:
                f.f165901f.error("subscribe:", ((Throwable) obj).getMessage());
                fVar.a();
                return Unit.INSTANCE;
            default:
                q03.l lVar = (q03.l) obj;
                Logger logger = f.f165901f;
                lVar.getClass();
                o wVar = new w(lVar, 3L);
                p0 p0Var = new p0(new n0(8), 24);
                int i15 = q03.g.f142048a;
                w03.b.b(Integer.MAX_VALUE, "maxConcurrency");
                w03.b.b(i15, "bufferSize");
                if (wVar instanceof x03.f) {
                    T tCall = ((x03.f) wVar).call();
                    jVar = tCall == 0 ? d13.h.f57160a : new s(tCall, p0Var);
                } else {
                    jVar = new j(wVar, p0Var, false, Integer.MAX_VALUE, i15);
                }
                e eVar = new e(fVar, 0);
                jVar.getClass();
                w03.a.d dVar = w03.a.f181172c;
                w03.a.c cVar = w03.a.f181171b;
                w03.b.a(dVar, "onNext is null");
                w03.b.a(cVar, "onAfterTerminate is null");
                return new d13.d(jVar, dVar, dVar, eVar, cVar);
        }
    }
}
