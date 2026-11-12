package a51;

import a11.f0;
import a11.h0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import i3.h7;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1417a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f1423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1427k;

    public /* synthetic */ d(int i14, String str, String str2, int i15, int i16, n1 n1Var, int i17, e23.l lVar, e23.l lVar2, int i18) {
        this.f1420d = i14;
        this.f1418b = str;
        this.f1419c = str2;
        this.f1421e = i15;
        this.f1422f = i16;
        this.f1426j = n1Var;
        this.f1424h = i17;
        this.f1423g = lVar;
        this.f1427k = lVar2;
        this.f1425i = i18;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0194  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x0213  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1417a;
        int i15 = this.f1424h;
        Object obj3 = this.f1427k;
        Object obj4 = this.f1426j;
        switch (i14) {
            case 0:
                n1 n1Var = (n1) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar = r.S;
                    r rVarF = x2.f(aVar, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81537o;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    jVar.getClass();
                    z zVarA = y.a(c2.j.i(f14), aVar2, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC2 = h4.k.c(aVar, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    r rVarA = u2.f22900a.a(aVar, 1.0f, true);
                    String strP = gl1.y.P(R.string.pacepro_lbl_split_number, new Object[]{Integer.valueOf(i15)}, mVar);
                    d92.b.f58624b.getClass();
                    mh.c(strP, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
                    e23.l lVar2 = this.f1423g;
                    boolean zB = mVar.B(lVar2) | mVar.B(n1Var);
                    Object objQ = mVar.q();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (zB) {
                        objQ = new f0(lVar2, n1Var, 2);
                        mVar.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(lVar2, n1Var, 2);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ;
                    boolean z14 = i15 > 1;
                    b.f1412a.getClass();
                    h7.a(aVar5, null, z14, null, null, b.f1413b, mVar, 1572864, 58);
                    boolean zB2 = mVar.B(lVar) | mVar.B(n1Var);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new f0(lVar, n1Var, 3);
                        mVar.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(lVar, n1Var, 3);
                            mVar.K(objQ2);
                        }
                    }
                    h7.a((e23.a) objQ2, null, i15 < this.f1425i, null, null, b.f1414c, mVar, 1572864, 58);
                    mVar.y();
                    mVar.N(2085778134, Integer.valueOf(this.f1420d));
                    int intValue = n1Var.getIntValue();
                    boolean zB3 = mVar.B(n1Var);
                    Object objQ3 = mVar.q();
                    if (zB3) {
                        objQ3 = new h0(n1Var, 1);
                        mVar.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new h0(n1Var, 1);
                            mVar.K(objQ3);
                        }
                    }
                    n02.m.a(null, null, null, this.f1418b, this.f1419c, this.f1421e, this.f1422f, intValue, (e23.l) objQ3, mVar, 0);
                    mVar.Q();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                r82.g.g((r) obj4, this.f1418b, this.f1419c, (String) obj3, this.f1420d, this.f1421e, this.f1422f, this.f1423g, (p3.m) obj, p0.t(i15 | 1), this.f1425i);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(r rVar, String str, String str2, String str3, int i14, int i15, int i16, e23.l lVar, int i17, int i18) {
        this.f1426j = rVar;
        this.f1418b = str;
        this.f1419c = str2;
        this.f1427k = str3;
        this.f1420d = i14;
        this.f1421e = i15;
        this.f1422f = i16;
        this.f1423g = lVar;
        this.f1424h = i17;
        this.f1425i = i18;
    }
}
