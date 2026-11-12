package a71;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.util.List;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.trainingload.b f1726c;

    public /* synthetic */ a(List list, com.garmin.android.apps.connectmobile.performance.trainingload.b bVar, int i14) {
        this.f1724a = i14;
        this.f1725b = list;
        this.f1726c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strP;
        int i14 = this.f1724a;
        com.garmin.android.apps.connectmobile.performance.trainingload.b bVar = this.f1726c;
        List<e71.f> list = this.f1725b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.trainingload.b.a aVar = com.garmin.android.apps.connectmobile.performance.trainingload.b.f40183k;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-386443520, new a(list, bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.trainingload.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.trainingload.b.f40183k;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar3 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    mVar2.C(1674794233);
                    for (e71.f fVar : list) {
                        String str = fVar.f63303i;
                        String str2 = fVar.f63302h;
                        String str3 = fVar.f63301g;
                        if (str != null) {
                            mVar2.C(1424304379);
                            strP = gl1.y.P(R.string.string_bullet_string_bullet_string_pattern, new Object[]{str3, str2, fVar.f63303i}, mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(1424716741);
                            strP = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{str3, str2}, mVar2);
                            mVar2.f();
                        }
                        String str4 = strP;
                        p2 p2Var = p2.f111205a;
                        String str5 = fVar.f63300f;
                        boolean zR = mVar2.r(bVar) | mVar2.r(fVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new a11.n(6, bVar, fVar);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a11.n(6, bVar, fVar);
                                mVar2.K(objQ);
                            }
                        }
                        p2Var.h(str5, str4, null, null, null, false, false, null, null, null, (e23.a) objQ, mVar2, 0, 0, 1020);
                    }
                    mVar2.f();
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
