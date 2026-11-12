package cq;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.stats.climbs.ClimbListActivity;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f54987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m00.a f54988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f54989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailChartDTO f54990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ClimbListActivity f54991f;

    public /* synthetic */ c(i53.c cVar, m00.a aVar, List list, ActivityDetailChartDTO activityDetailChartDTO, ClimbListActivity climbListActivity, int i14) {
        this.f54986a = i14;
        this.f54987b = cVar;
        this.f54988c = aVar;
        this.f54989d = list;
        this.f54990e = activityDetailChartDTO;
        this.f54991f = climbListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [m00.a] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strA;
        String strB;
        Iterator it;
        int i14 = 0;
        ?? r14 = 1;
        switch (this.f54986a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = ClimbListActivity.f29815a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1209969352, new c(this.f54987b, this.f54988c, this.f54989d, this.f54990e, this.f54991f, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m00.a aVar = this.f54988c;
                String str = aVar.f115519d;
                l22.b bVar = aVar.f115517b;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = ClimbListActivity.f29815a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    float f14 = 8;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarZ = c2.l.z(aVar2, 16, f14);
                    mVar2.C(1846048805);
                    Iterator it3 = this.f54987b.iterator();
                    ?? r15 = aVar;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i17 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        ps.x1 x1Var3 = (ps.x1) next;
                        String strG = r15.g(Integer.valueOf(i17));
                        Double averageGrade = x1Var3.getAverageGrade();
                        if (averageGrade == null) {
                            strA = bVar.a(R.string.lbl_grade_value, str);
                        } else {
                            String str2 = l3.f23126d.format(averageGrade.doubleValue());
                            str2.getClass();
                            strA = bVar.a(R.string.lbl_grade_value, str2);
                        }
                        String strH = r15.h(R.string.lbl_distance);
                        Double distance = x1Var3.getDistance();
                        if (distance == null || (strB = ss.k.b(ls.e.BIKE_DISTANCE, bVar, distance, r14)) == null) {
                            strB = str;
                        }
                        String strH2 = r15.h(R.string.activities_ascent_label);
                        String strA2 = r15.a(x1Var3.getElevationGain(), r14);
                        ?? r29 = r14;
                        List list = this.f54989d;
                        boolean zR = mVar2.r(list) | mVar2.r(x1Var3);
                        ?? r34 = r15;
                        ActivityDetailChartDTO activityDetailChartDTO = this.f54990e;
                        boolean zR2 = zR | mVar2.r(activityDetailChartDTO);
                        ClimbListActivity climbListActivity = this.f54991f;
                        boolean zR3 = zR2 | mVar2.r(climbListActivity) | mVar2.k(i14);
                        Object objQ = mVar2.q();
                        if (zR3) {
                            it = it3;
                        } else {
                            p3.m.f135153a.getClass();
                            it = it3;
                            if (objQ == p3.m.a.f135155b) {
                            }
                            p3.m mVar3 = mVar2;
                            l72.l.e(strG, strA, strH, strB, strH2, strA2, rVarZ, null, false, (e23.a) objQ, mVar3, 0, 384);
                            it3 = it;
                            mVar2 = mVar3;
                            i14 = i17;
                            r14 = r29 == true ? 1 : 0;
                            r15 = r34;
                        }
                        objQ = new a42.q(list, x1Var3, activityDetailChartDTO, climbListActivity, i14, 1);
                        mVar2.K(objQ);
                        p3.m mVar4 = mVar2;
                        l72.l.e(strG, strA, strH, strB, strH2, strA2, rVarZ, null, false, (e23.a) objQ, mVar4, 0, 384);
                        it3 = it;
                        mVar2 = mVar4;
                        i14 = i17;
                        r14 = r29 == true ? 1 : 0;
                        r15 = r34;
                    }
                    p3.m mVar5 = mVar2;
                    mVar5.f();
                    mVar5.y();
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
