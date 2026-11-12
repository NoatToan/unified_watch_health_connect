package ds;

import android.content.Context;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import et1.r0;
import i3.e9;
import i3.fe;
import i3.mc;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.m3;
import l72.d3;
import l72.r1;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.u0;
import r1.v1;
import r1.w1;
import u1.a2;
import zo1.f1;
import zo1.x0;
import zo1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60878a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f60880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f60881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f60883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f60884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f60885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f60886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f60887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f60888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f60889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f60890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f60891n;

    public /* synthetic */ b(h4.r rVar, m3 m3Var, m4.b0 b0Var, p1 p1Var, boolean z14, x3 x3Var, String str, o53.b0 b0Var2, i2.a aVar, p1 p1Var2, m4.q qVar, e23.l lVar, e23.l lVar2) {
        this.f60883f = rVar;
        this.f60884g = m3Var;
        this.f60885h = b0Var;
        this.f60879b = p1Var;
        this.f60880c = z14;
        this.f60881d = x3Var;
        this.f60886i = str;
        this.f60887j = b0Var2;
        this.f60888k = aVar;
        this.f60882e = p1Var2;
        this.f60889l = qVar;
        this.f60890m = lVar;
        this.f60891n = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x04eb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        int i14 = this.f60878a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f60891n;
        Object obj4 = this.f60890m;
        Object obj5 = this.f60889l;
        Object obj6 = this.f60881d;
        Object obj7 = this.f60888k;
        Object obj8 = this.f60887j;
        Object obj9 = this.f60886i;
        Object obj10 = this.f60885h;
        Object obj11 = this.f60884g;
        Object obj12 = this.f60882e;
        Object obj13 = this.f60879b;
        Object obj14 = this.f60883f;
        switch (i14) {
            case 0:
                final fe feVar = (fe) obj14;
                final p1 p1Var = (p1) obj13;
                final Context context = (Context) obj9;
                final c.q qVar = (c.q) obj8;
                final i53.f fVar = (i53.f) obj7;
                final p1 p1Var2 = (p1) obj12;
                final x3 x3Var = (x3) obj6;
                final qr.t tVar = (qr.t) obj4;
                final h2.j0 j0Var = (h2.j0) obj3;
                final p1 p1Var3 = (p1) obj11;
                final p1 p1Var4 = (p1) obj10;
                final x3 x3Var2 = (x3) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    final boolean z14 = this.f60880c;
                    c2.v.a(rVarD, null, false, z3.f.c(-378059492, new e23.q() { // from class: ds.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.q
                        public final Object invoke(Object obj15, Object obj16, Object obj17) {
                            x3 x3Var3;
                            qr.t tVar2;
                            h4.r.a aVar2;
                            p3.m.a.C2565a c2565a;
                            c2.w wVar = (c2.w) obj15;
                            p3.m mVar2 = (p3.m) obj16;
                            int iIntValue2 = ((Integer) obj17).intValue();
                            wVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar2.B(wVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                float fG = wVar.g() * 0.65f;
                                g6.f.a aVar3 = g6.f.f75994b;
                                h4.r.a aVar4 = h4.r.S;
                                h4.r rVarD2 = x2.d(aVar4, 1.0f);
                                long jA = tn.k.a(d92.b.f58623a, mVar2);
                                m1.a aVar5 = m1.f128891a;
                                h4.r rVarE = u1.n.e(rVarD2, jA, aVar5);
                                d92.b.f58625c.getClass();
                                j92.e eVar = j92.b.f97899b;
                                float f14 = eVar.f97918c;
                                float f15 = eVar.f97920e;
                                h4.r rVarB = a2.b(c2.l.C(rVarE, 0.0f, 0.0f, 0.0f, f14, 7), a2.a(mVar2), true);
                                c2.j.f22691a.getClass();
                                c2.j.k kVar = c2.j.f22694d;
                                h4.d.f81522a.getClass();
                                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                                int iHashCode = Long.hashCode(mVar2.getU());
                                i2 i2VarX = mVar2.x();
                                h4.r rVarC = h4.k.c(rVarB, mVar2);
                                h5.g.V.getClass();
                                h5.e0.a aVar6 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar6);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, zVarA, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                h5.g.a.b bVar = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                                }
                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                c2.b0 b0Var = c2.b0.f22601a;
                                r1.b(gl1.y.Q(mVar2, R.string.lbl_choose_an_image), null, mVar2, 0, 2);
                                h4.r rVarA = c2.l.A(u1.n.e(x2.f(x2.j(aVar4, fG, 0.0f, 2), 1.0f), d92.b.a(mVar2).c().e(), aVar5), 0.0f, f15, 1);
                                float f16 = eVar.f97920e;
                                i53.f fVar2 = fVar;
                                int size = fVar2.size();
                                Object objQ = mVar2.q();
                                p3.m.f135153a.getClass();
                                p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                if (objQ == c2565a2) {
                                    objQ = new d50.b(18);
                                    mVar2.K(objQ);
                                }
                                e23.p pVar = (e23.p) objQ;
                                p1 p1Var5 = p1Var2;
                                boolean zB = mVar2.B(p1Var5);
                                boolean z15 = z14;
                                boolean zH = zB | mVar2.h(z15);
                                x3 x3Var4 = x3Var;
                                boolean zB2 = zH | mVar2.B(x3Var4);
                                qr.t tVar3 = tVar;
                                boolean zR = zB2 | mVar2.r(tVar3);
                                Object objQ2 = mVar2.q();
                                if (zR || objQ2 == c2565a2) {
                                    x3Var3 = x3Var4;
                                    tVar2 = tVar3;
                                    objQ2 = new e(z15, tVar2, p1Var5, p1Var3, p1Var4, x3Var3, 0);
                                    mVar2.K(objQ2);
                                } else {
                                    x3Var3 = x3Var4;
                                    tVar2 = tVar3;
                                }
                                h2.j0 j0Var2 = j0Var;
                                j0.a(rVarA, fVar2, pVar, f16, (e23.l) objQ2, j0Var2, size, mVar2, 384);
                                if (fVar2.size() > 1) {
                                    mVar2.C(1958778354);
                                    c2565a = c2565a2;
                                    aVar2 = aVar4;
                                    p82.e.a(j0Var2, c2.l.A(b0Var.b(aVar4, h4.d.a.f81537o), 0.0f, f15, 1), fVar2.size(), j0Var2.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, mVar2, 0, 1008);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                } else {
                                    aVar2 = aVar4;
                                    c2565a = c2565a2;
                                    mVar2.C(1959174844);
                                    mVar2.f();
                                }
                                x3 x3Var5 = x3Var2;
                                r1.c0.c(b0Var, ((Boolean) x3Var5.getF182175a()).booleanValue() && ((Boolean) x3Var3.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-622388850, new a42.a(tVar2, 17, x3Var5, x3Var3), mVar2), mVar2, 1572870, 30);
                                boolean z16 = !((Boolean) x3Var5.getF182175a()).booleanValue();
                                v1 v1VarD = u0.d(null, 3);
                                w1.f149304a.getClass();
                                r1.c0.c(b0Var, z16, null, v1VarD, w1.f149305b, null, z3.f.c(-278489673, new a71.n(tVar2, 25), mVar2), mVar2, 1575942, 18);
                                mVar2.y();
                                d3.b(feVar, wVar.c(aVar2, h4.d.a.f81531i), mVar2, 6, 0);
                                p1 p1Var6 = p1Var;
                                if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                                    mVar2.C(-1362242381);
                                    boolean zB3 = mVar2.B(p1Var6);
                                    Context context2 = context;
                                    boolean zR2 = zB3 | mVar2.r(context2);
                                    c.q qVar2 = qVar;
                                    boolean zR3 = zR2 | mVar2.r(qVar2);
                                    Object objQ3 = mVar2.q();
                                    p3.m.a.C2565a c2565a3 = c2565a;
                                    if (zR3 || objQ3 == c2565a3) {
                                        objQ3 = new c42.f(qVar2, p1Var6, context2, 1);
                                        mVar2.K(objQ3);
                                    }
                                    e23.a aVar7 = (e23.a) objQ3;
                                    boolean zB4 = mVar2.B(p1Var6);
                                    Object objQ4 = mVar2.q();
                                    if (zB4 || objQ4 == c2565a3) {
                                        objQ4 = new cw1.k(p1Var6, 27);
                                        mVar2.K(objQ4);
                                    }
                                    j.d(aVar7, (e23.a) objQ4, mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1361670586);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 3078, 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                h4.r rVar = (h4.r) obj14;
                m3 m3Var = (m3) obj11;
                m4.b0 b0Var = (m4.b0) obj10;
                p1 p1Var5 = (p1) obj13;
                x3 x3Var3 = (x3) obj6;
                String str = (String) obj9;
                o53.b0 b0Var2 = (o53.b0) obj8;
                i2.a aVar2 = (i2.a) obj7;
                p1 p1Var6 = (p1) obj12;
                m4.q qVar2 = (m4.q) obj5;
                e23.l lVar = (e23.l) obj4;
                e23.l lVar2 = (e23.l) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    h4.r.a aVar4 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    h4.r rVarF = x2.f(rVar, 1.0f);
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = tn.k.c(mVar2);
                    }
                    a2.j jVar = (a2.j) objQ;
                    boolean zB = mVar2.B(m3Var);
                    Object objQ2 = mVar2.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new b82.h0(m3Var, b0Var, p1Var5, 1);
                        mVar2.K(objQ2);
                    }
                    ve.a(u1.w.b(rVarF, jVar, null, false, null, null, (e23.a) objQ2, 28), null, p6.b.a(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, z3.f.c(1403984176, new ck0.i(rVar, this.f60880c, x3Var3, str, b0Var, b0Var2, aVar2, p1Var6, qVar2, lVar, lVar2, p1Var5), mVar2), mVar2, 12582912, 122);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj14;
                n1 n1Var = (n1) obj11;
                zc.d dVar = (zc.d) obj10;
                mi0.c cVar = (mi0.c) obj8;
                u2.h hVar = (u2.h) obj7;
                e2.i0 i0Var = (e2.i0) obj4;
                e2.i0 i0Var2 = (e2.i0) obj3;
                Context context2 = (Context) obj9;
                p1 p1Var7 = (p1) obj13;
                x3 x3Var4 = (x3) obj6;
                x3 x3Var5 = (x3) obj5;
                p1 p1Var8 = (p1) obj12;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    mVar3.C(-1517933922);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(gl1.y.Q(mVar3, ((p003ji0.j) it.next()).f98791a));
                        list = list;
                    }
                    mVar3.f();
                    p003ji0.r.a(arrayList2, n1Var.getIntValue(), null, z3.f.c(1338485980, new r0(list, dVar, cVar, hVar, i0Var, this.f60880c, i0Var2, context2, p1Var7, x3Var4, x3Var5, p1Var8), mVar3), mVar3, 3072, 4);
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                DateTime dateTime = (DateTime) obj14;
                tf0.i iVar = (tf0.i) obj12;
                e23.l lVar3 = (e23.l) obj11;
                e23.l lVar4 = (e23.l) obj10;
                p1 p1Var9 = (p1) obj13;
                gs1.t tVar2 = (gs1.t) obj9;
                String str2 = (String) obj8;
                e23.l lVar5 = (e23.l) obj7;
                e23.l lVar6 = (e23.l) obj6;
                CustomBarChart customBarChart = (CustomBarChart) obj5;
                rz.a aVar6 = (rz.a) obj4;
                String str3 = (String) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var9.getF182175a()).booleanValue();
                    LocalDate localDate = dateTime.toLocalDate();
                    localDate.getClass();
                    g6.f.a aVar7 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 350);
                    boolean zB2 = mVar4.B(lVar3) | mVar4.r(dateTime);
                    Object objQ3 = mVar4.q();
                    if (zB2) {
                        objQ3 = new ci0.e(lVar3, dateTime, 11);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ci0.e(lVar3, dateTime, 11);
                            mVar4.K(objQ3);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ3;
                    boolean zB3 = mVar4.B(lVar4);
                    Object objQ4 = mVar4.q();
                    if (zB3) {
                        objQ4 = new wr1.d(lVar4, 0);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new wr1.d(lVar4, 0);
                            mVar4.K(objQ4);
                        }
                    }
                    tf0.r.a(zBooleanValue, localDate, iVar, rVarH, aVar8, (e23.l) objQ4, z3.f.c(-1532598479, new f21.r(tVar2, this.f60880c, str2, lVar5, lVar6, customBarChart, p1Var9, aVar6, str3), mVar4), mVar4, 1575936);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                Long l14 = (Long) obj14;
                String str4 = (String) obj13;
                String str5 = (String) obj12;
                yo1.j jVar2 = (yo1.j) obj11;
                List list2 = (List) obj10;
                ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) obj9;
                yo1.f fVar2 = (yo1.f) obj8;
                String str6 = (String) obj7;
                e23.a aVar9 = (e23.a) obj6;
                e23.a aVar10 = (e23.a) obj5;
                e23.l lVar7 = (e23.l) obj4;
                e23.a aVar11 = (e23.a) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    Object objQ5 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = l0.j(t13.h.f161748a, mVar5);
                        mVar5.K(objQ5);
                    }
                    o53.b0 b0Var4 = (o53.b0) objQ5;
                    Object objQ6 = mVar5.q();
                    int i15 = 26;
                    if (objQ6 == c2565a2) {
                        objQ6 = new z81.b(26);
                        mVar5.K(objQ6);
                    }
                    mc mcVarF = e9.f(true, (e23.l) objQ6, mVar5, 54, 0);
                    Object objQ7 = mVar5.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = p0.n(Boolean.FALSE);
                        mVar5.K(objQ7);
                    }
                    p1 p1Var10 = (p1) objQ7;
                    h4.r rVarE = u1.n.e(h4.r.S, p6.b.a(d92.b.f58623a, mVar5), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    h4.r rVarC2 = h4.k.c(rVarE, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar12);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar5);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    String name = jVar2.getName();
                    List<yo1.i> listG = jVar2.g();
                    ArrayList<yo1.i> arrayList3 = new ArrayList();
                    for (Object obj15 : listG) {
                        if (((yo1.i) obj15).getUserPk() != jVar2.getForUserPk()) {
                            arrayList3.add(obj15);
                        }
                    }
                    x1 x1Var7 = p3.n.f135158a;
                    int size = arrayList3.size();
                    if (size == 0) {
                        mVar5.C(-605570870);
                        mVar5.f();
                    } else if (size == 1) {
                        mVar5.C(-605514047);
                        String fullName = ((yo1.i) arrayList3.get(0)).getFullName();
                        name = gl1.y.P(R.string.lbl_groupride_section_title_1, new Object[]{name, fullName != null ? fullName : ""}, mVar5);
                        mVar5.f();
                    } else if (size != 2) {
                        mVar5.C(-605005089);
                        String fullName2 = ((yo1.i) arrayList3.get(0)).getFullName();
                        name = gl1.y.P(R.string.lbl_groupride_section_title_3, new Object[]{name, fullName2 != null ? fullName2 : "", String.valueOf(arrayList3.size() - 1)}, mVar5);
                        mVar5.f();
                    } else {
                        mVar5.C(-605292769);
                        String fullName3 = ((yo1.i) arrayList3.get(0)).getFullName();
                        if (fullName3 == null) {
                            fullName3 = "";
                        }
                        String fullName4 = ((yo1.i) arrayList3.get(1)).getFullName();
                        name = gl1.y.P(R.string.lbl_groupride_section_title_2, new Object[]{name, fullName3, fullName4 != null ? fullName4 : ""}, mVar5);
                        mVar5.f();
                    }
                    boolean zR = mVar5.r(b0Var4) | mVar5.B(mcVarF);
                    Object objQ8 = mVar5.q();
                    if (zR || objQ8 == p3.m.a.f135155b) {
                        objQ8 = new fo.j(b0Var4, p1Var10, mcVarF, 24);
                        mVar5.K(objQ8);
                    }
                    f1.d(0, (e23.a) objQ8, name, mVar5);
                    boolean z15 = this.f60880c;
                    if (z15) {
                        mVar5.C(1371095852);
                        int size2 = arrayList3.size();
                        boolean zB4 = mVar5.B(aVar11);
                        Object objQ9 = mVar5.q();
                        if (zB4 || objQ9 == p3.m.a.f135155b) {
                            objQ9 = new y0(aVar11, 2);
                            mVar5.K(objQ9);
                        }
                        f1.b((e23.a) objQ9, size2, mVar5, 0);
                        mVar5.f();
                    } else {
                        mVar5.C(1371250573);
                        mVar5.f();
                    }
                    if (arrayList3.isEmpty()) {
                        mVar5.C(1372127501);
                        mVar5.f();
                    } else {
                        mVar5.C(1371375038);
                        ArrayList arrayList4 = new ArrayList();
                        for (yo1.i iVar2 : arrayList3) {
                            String fullName5 = iVar2.getFullName();
                            if (fullName5 != null) {
                                com.garmin.android.apps.connectmobile.userprofile.model.j jVar3 = iVar2.f198502n;
                                arrayList4.add(new x0(jVar3 != null ? jVar3.f46876e : null, fullName5));
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        boolean zR2 = mVar5.r(b0Var4) | mVar5.B(mcVarF);
                        Object objQ10 = mVar5.q();
                        if (zR2 || objQ10 == p3.m.a.f135155b) {
                            objQ10 = new fo.j(b0Var4, p1Var10, mcVarF, 25);
                            mVar5.K(objQ10);
                        }
                        f1.e(arrayList4, (e23.a) objQ10, mVar5, 0);
                        mVar5.f();
                    }
                    if (jVar2.getFinal()) {
                        mVar5.C(1372823978);
                        List<yo1.b> listB = jVar2.b();
                        if (listB != null) {
                            arrayList = new ArrayList();
                            for (Object obj16 : listB) {
                                if (((yo1.b) obj16).getWinnerUserPk() == jVar2.getForUserPk()) {
                                    arrayList.add(obj16);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null || arrayList.isEmpty()) {
                            mVar5.C(1372981489);
                            h4.r.a aVar13 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            h4.r rVarZ = c2.l.z(aVar13, eVar.f97920e, eVar.f97918c);
                            boolean zR3 = mVar5.r(b0Var4) | mVar5.B(mcVarF);
                            Object objQ11 = mVar5.q();
                            if (zR3 || objQ11 == p3.m.a.f135155b) {
                                objQ11 = new fo.j(b0Var4, p1Var10, mcVarF, 27);
                                mVar5.K(objQ11);
                            }
                            f1.c(48, (e23.a) objQ11, rVarZ, mVar5, true);
                            mVar5.f();
                        } else {
                            mVar5.C(1373331913);
                            boolean zR4 = mVar5.r(b0Var4) | mVar5.B(mcVarF);
                            Object objQ12 = mVar5.q();
                            if (zR4 || objQ12 == p3.m.a.f135155b) {
                                objQ12 = new fo.j(b0Var4, p1Var10, mcVarF, 28);
                                mVar5.K(objQ12);
                            }
                            f1.h(0, (e23.a) objQ12, str6, mVar5, z15);
                            f1.g(arrayList, mVar5, 0);
                            mVar5.f();
                        }
                        mVar5.f();
                    } else {
                        mVar5.C(1372198212);
                        f1.a(jVar2.getParticipantCompleteCount(), jVar2.getParticipantCount(), 0, mVar5);
                        h4.r.a aVar14 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarZ2 = c2.l.z(aVar14, eVar2.f97920e, eVar2.f97918c);
                        boolean zR5 = mVar5.r(b0Var4) | mVar5.B(mcVarF);
                        Object objQ13 = mVar5.q();
                        if (zR5 || objQ13 == p3.m.a.f135155b) {
                            objQ13 = new fo.j(b0Var4, p1Var10, mcVarF, i15);
                            mVar5.K(objQ13);
                        }
                        f1.c(48, (e23.a) objQ13, rVarZ2, mVar5, false);
                        mVar5.f();
                    }
                    mVar5.y();
                    if (mcVarF.e()) {
                        mVar5.C(-452480756);
                        yo1.h hVar2 = new yo1.h(l14, str4, str5, jVar2, null, null, list2, activityDetailChartDTO, fVar2, false);
                        boolean zBooleanValue2 = ((Boolean) p1Var10.getF182175a()).booleanValue();
                        v9.a.f176280a.getClass();
                        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar5);
                        if (viewModelStoreOwnerA == null) {
                            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return null;
                        }
                        zo1.o.a(hVar2, zBooleanValue2, mcVarF, b0Var4, (zo1.q) v9.b.a(s0.f105811a.b(zo1.q.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, mVar5), str4, z15, str6, aVar9, aVar10, lVar7, null, mVar5, 8, 2048);
                        mVar5.f();
                    } else {
                        mVar5.C(-451290077);
                        mVar5.f();
                    }
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(fe feVar, p1 p1Var, Context context, c.q qVar, i53.f fVar, p1 p1Var2, boolean z14, p1 p1Var3, qr.t tVar, h2.b bVar, p1 p1Var4, p1 p1Var5, x3 x3Var) {
        this.f60883f = feVar;
        this.f60879b = p1Var;
        this.f60886i = context;
        this.f60887j = qVar;
        this.f60888k = fVar;
        this.f60882e = p1Var2;
        this.f60880c = z14;
        this.f60881d = p1Var3;
        this.f60890m = tVar;
        this.f60891n = bVar;
        this.f60884g = p1Var4;
        this.f60885h = p1Var5;
        this.f60889l = x3Var;
    }

    public /* synthetic */ b(Long l14, String str, String str2, yo1.j jVar, List list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z14, String str3, e23.a aVar, e23.a aVar2, e23.l lVar, e23.a aVar3) {
        this.f60883f = l14;
        this.f60879b = str;
        this.f60882e = str2;
        this.f60884g = jVar;
        this.f60885h = list;
        this.f60886i = activityDetailChartDTO;
        this.f60887j = fVar;
        this.f60880c = z14;
        this.f60888k = str3;
        this.f60881d = aVar;
        this.f60889l = aVar2;
        this.f60890m = lVar;
        this.f60891n = aVar3;
    }

    public /* synthetic */ b(List list, n1 n1Var, zc.d dVar, mi0.c cVar, u2.h hVar, e2.i0 i0Var, boolean z14, e2.i0 i0Var2, Context context, p1 p1Var, x3 x3Var, x3 x3Var2, p1 p1Var2) {
        this.f60883f = list;
        this.f60884g = n1Var;
        this.f60885h = dVar;
        this.f60887j = cVar;
        this.f60888k = hVar;
        this.f60890m = i0Var;
        this.f60880c = z14;
        this.f60891n = i0Var2;
        this.f60886i = context;
        this.f60879b = p1Var;
        this.f60881d = x3Var;
        this.f60889l = x3Var2;
        this.f60882e = p1Var2;
    }

    public /* synthetic */ b(DateTime dateTime, tf0.i iVar, e23.l lVar, e23.l lVar2, p1 p1Var, gs1.t tVar, boolean z14, String str, e23.l lVar3, e23.l lVar4, CustomBarChart customBarChart, rz.a aVar, String str2) {
        this.f60883f = dateTime;
        this.f60882e = iVar;
        this.f60884g = lVar;
        this.f60885h = lVar2;
        this.f60879b = p1Var;
        this.f60886i = tVar;
        this.f60880c = z14;
        this.f60887j = str;
        this.f60888k = lVar3;
        this.f60881d = lVar4;
        this.f60889l = customBarChart;
        this.f60890m = aVar;
        this.f60891n = str2;
    }
}
