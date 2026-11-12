package k03;

import i03.q;
import i03.s;

/* JADX INFO: loaded from: classes3.dex */
public class g implements s {
    @Override // i03.s
    public final Object a(i03.g gVar, q qVar) {
        if (j03.q.a.BULLET == j03.q.f96178a.a(qVar)) {
            return new l03.b(gVar.f86934a, j03.q.f96179b.a(qVar).intValue());
        }
        return new l03.i(gVar.f86934a, String.valueOf(j03.q.f96180c.a(qVar)).concat(". "));
    }
}
