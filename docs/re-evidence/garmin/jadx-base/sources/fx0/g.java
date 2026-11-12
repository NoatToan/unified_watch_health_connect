package fx0;

import android.content.Context;
import b63.o;
import b82.d2;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import e23.p;
import fo.x;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import l72.t2;
import l72.v2;
import l72.y2;
import o70.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f73797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f73798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f73799d;

    public /* synthetic */ g(float f14, e23.a aVar, r rVar, int i14) {
        this.f73796a = 3;
        this.f73797b = f14;
        this.f73798c = aVar;
        this.f73799d = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x020b  */
    /* JADX WARN: Code duplicated, block: B:93:0x032f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        CustomBarChart customBarChart;
        int i14 = this.f73796a;
        p3.m.a aVar = p3.m.f135153a;
        float f14 = this.f73797b;
        int i15 = 3;
        Object obj4 = this.f73799d;
        Object obj5 = this.f73798c;
        switch (i14) {
            case 0:
                String str = (String) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    boolean zB = mVar.B(str);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new fp0.c(str, 8);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fp0.c(str, 8);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC = v.c((e23.l) objQ, rVarD, false);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    b0 b0Var = b0.f22601a;
                    if (arrayList.isEmpty()) {
                        mVar.C(-458732760);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c("0", b0Var.b(aVar2, h4.d.a.f81536n), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, mVar), mVar, 0, 0, 131068);
                        mVar.f();
                    } else {
                        mVar.C(-458425395);
                        r rVarA = v2.a(x2.f(aVar2, 1.0f), f14 <= 1.0f || ((double) f14) > 1.5d, new a(1), mVar, 6);
                        f2.b.C1415b c1415b = new f2.b.C1415b(((double) f14) <= 1.5d ? 3 : 4);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        c2.j.i iVarK = c2.j.k(eVar.f97917b, h4.d.a.f81534l);
                        c2.j.i iVarJ = c2.j.j(eVar.f97917b, aVar3);
                        boolean zR = mVar.r(arrayList);
                        Object objQ2 = mVar.q();
                        if (zR) {
                            objQ2 = new g0(3, arrayList);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new g0(3, arrayList);
                                mVar.K(objQ2);
                            }
                        }
                        f2.j.a(c1415b, rVarA, null, null, iVarK, iVarJ, null, false, null, (e23.l) objQ2, mVar, 0, 0, 924);
                        mVar.f();
                    }
                    String strQ = gl1.y.Q(mVar, R.string.mct_symptoms_logged);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97933j, mVar);
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97917b;
                    r rVarB = b0Var.b(c2.l.z(aVar2, f15, f15), h4.d.a.f81536n);
                    Object objQ3 = mVar.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new x(15);
                        mVar.K(objQ3);
                    }
                    mh.c(strQ, v.c((e23.l) objQ3, rVarB, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p<? super p3.m, ? super Integer, Unit> pVar = (p) obj5;
                p<? super p3.m, ? super Integer, Unit> pVar2 = (p) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    y2.f111386a.b(this.f73797b, null, pVar, pVar2, false, mVar2, 24576, 2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                iy0.f fVar = (iy0.f) obj5;
                Context context = (Context) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    Object objQ4 = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ4 == c2565a) {
                        obj3 = objQ4;
                        CustomBarChart customBarChart2 = new CustomBarChart(context);
                        customBarChart2.setOnClickListener(new hx0.k(18, context, fVar));
                        mVar3.K(customBarChart2);
                        obj3 = customBarChart2;
                    }
                    obj3 = objQ4;
                    CustomBarChart customBarChart3 = (CustomBarChart) obj3;
                    boolean zB2 = mVar3.B(fVar);
                    Object objQ5 = mVar3.q();
                    if (zB2 || objQ5 == c2565a) {
                        i53.c<am.x0> cVar = fVar.f95791b;
                        o oVar = fVar.f95794e;
                        o oVar2 = fVar.f95793d;
                        customBarChart = customBarChart3;
                        rz.a aVar5 = new rz.a(customBarChart, new iy0.a(context, cVar, g22.l.h(oVar2), g22.l.h(oVar), fVar.f95792c), new iy0.e(customBarChart3, g22.l.h(oVar2), g22.l.h(oVar)), null, new iy0.d(customBarChart3), null, 40, null);
                        mVar3.K(aVar5);
                        objQ5 = aVar5;
                    } else {
                        customBarChart = customBarChart3;
                    }
                    rz.a aVar6 = (rz.a) objQ5;
                    r rVarH = x2.h(x2.f(r.S, 1.0f), f14);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarC3 = c2.l.C(c2.l.v(rVarH, 0.0f, eVar2.f97923h, 1), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    boolean zR2 = mVar3.r(customBarChart);
                    Object objQ6 = mVar3.q();
                    if (zR2 || objQ6 == c2565a) {
                        objQ6 = new di0.c(customBarChart, 5);
                        mVar3.K(objQ6);
                    }
                    e23.l lVar = (e23.l) objQ6;
                    boolean zR3 = mVar3.r(aVar6) | mVar3.B(fVar) | mVar3.r(context) | mVar3.r(customBarChart);
                    Object objQ7 = mVar3.q();
                    if (zR3 || objQ7 == c2565a) {
                        ev2.f fVar2 = new ev2.f(aVar6, fVar, context, customBarChart, 16);
                        mVar3.K(fVar2);
                        objQ7 = fVar2;
                    }
                    p002j6.c.b(lVar, rVarC3, (e23.l) objQ7, mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                t2.b(f14, (e23.a) obj5, (r) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                yq.c cVar2 = (yq.c) obj5;
                Context context2 = (Context) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    d2.f16532a.d(null, z3.f.c(-1693889036, new bn1.d(f14, cVar2, context2, i15), mVar4), mVar4, 48, 1);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                s70.i.b((t) obj5, f14, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(float f14, Object obj, Object obj2, int i14) {
        this.f73796a = i14;
        this.f73797b = f14;
        this.f73798c = obj;
        this.f73799d = obj2;
    }

    public /* synthetic */ g(iy0.f fVar, float f14, Context context) {
        this.f73796a = 2;
        this.f73798c = fVar;
        this.f73797b = f14;
        this.f73799d = context;
    }

    public /* synthetic */ g(String str, ArrayList arrayList, float f14) {
        this.f73796a = 0;
        this.f73798c = str;
        this.f73799d = arrayList;
        this.f73797b = f14;
    }

    public /* synthetic */ g(t tVar, float f14, e23.l lVar, int i14) {
        this.f73796a = 5;
        this.f73798c = tVar;
        this.f73797b = f14;
        this.f73799d = lVar;
    }
}
