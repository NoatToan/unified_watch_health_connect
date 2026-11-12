package hq;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f85150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f85152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f85153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2.a0 f85154e;

    public u(List list, int i14, e23.l lVar, l lVar2, c2.a0 a0Var) {
        this.f85150a = list;
        this.f85151b = i14;
        this.f85152c = lVar;
        this.f85153d = lVar2;
        this.f85154e = a0Var;
    }

    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            n nVar = (n) this.f85150a.get(iIntValue);
            mVar2.C(-1786701264);
            int i15 = this.f85151b;
            boolean z14 = i15 == iIntValue;
            h4.r.a aVar = h4.r.S;
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = tn.k.c(mVar2);
            }
            a2.j jVar = (a2.j) objQ;
            e23.l lVar = this.f85152c;
            int i16 = i14 & 112;
            boolean zB = (((i16 ^ 48) > 32 && mVar2.k(iIntValue)) || (i14 & 48) == 32) | mVar2.B(lVar);
            Object objQ2 = mVar2.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new r(lVar, iIntValue);
                mVar2.K(objQ2);
            }
            h4.r rVarB = u1.w.b(aVar, jVar, null, false, null, null, (e23.a) objQ2, 28);
            String str = nVar.f85066a;
            String str2 = nVar.f85067b;
            String str3 = nVar.f85068c;
            String str4 = nVar.f85070e;
            l lVar2 = this.f85153d;
            k kVar = lVar2.f85061c;
            boolean z15 = false;
            boolean z16 = lVar2.f85062d;
            if (z14 || i15 == -1) {
                z15 = true;
            }
            boolean z17 = z14;
            v.c(rVarB, iIntValue, str, str2, str3, "", str4, kVar, z16, z17, z15, true, mVar2, i16 | 196608, 48, 0);
            mVar2.C(-334697484);
            Iterator<T> it = nVar.f85086f.iterator();
            while (it.hasNext()) {
                boolean z18 = z17;
                r1.c0.c(this.f85154e, z18, null, null, null, null, z3.f.c(-64561261, new s(iIntValue, (m) it.next(), lVar2), mVar2), mVar2, 1572864, 30);
                z17 = z18;
            }
            mVar2.f();
            mVar2.f();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
