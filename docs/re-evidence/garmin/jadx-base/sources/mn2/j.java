package mn2;

import c83.a0;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f119822a;

    static {
        int i14 = gt2.c.f79010a;
        f119822a = gt2.b.f79005a.h("PAY#felicaApiExtensions");
    }

    public static final e13.j a(b bVar, String str, String str2, String str3, pn2.m mVar, e23.l lVar) {
        bVar.getClass();
        str.getClass();
        str3.getClass();
        q03.r<a0<pn2.p<rn2.e>>> rVarA = bVar.a(str, str2, str3, mVar);
        e eVar = new e(new d(lVar, bVar, str, str2, str3, mVar, 4), 4);
        rVarA.getClass();
        int i14 = w03.b.f181178a;
        return new e13.j(rVarA, eVar);
    }

    public static final e13.j b(b bVar, String str, String str2, String str3, pn2.m mVar, e23.l lVar) {
        bVar.getClass();
        str.getClass();
        str3.getClass();
        lVar.getClass();
        q03.r<a0<pn2.p<rn2.q>>> rVarN = bVar.n(str, str2, str3, mVar);
        lp2.h hVar = new lp2.h(new d(lVar, bVar, str, str2, str3, mVar, 1), 28);
        rVarN.getClass();
        int i14 = w03.b.f181178a;
        return new e13.j(rVarN, hVar);
    }

    public static e13.b c(a0 a0Var, String str, e23.l lVar, e23.l lVar2, int i14) {
        if ((i14 & 32) != 0) {
            lVar = new mi0.i(7);
        }
        g gVar = new g(a0Var, null, null, 0, lVar, str, lVar2);
        int i15 = w03.b.f181178a;
        return new e13.b(gVar);
    }
}
