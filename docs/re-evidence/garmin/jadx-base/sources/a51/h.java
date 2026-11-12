package a51;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import fb1.g0;
import h4.r;
import h5.e0;
import i3.mh;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1445e;

    public /* synthetic */ h(int i14, String str, String str2, String str3, String str4) {
        this.f1441a = 3;
        this.f1442b = str;
        this.f1443c = str2;
        this.f1444d = str3;
        this.f1445e = str4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x038b  */
    /* JADX WARN: Code duplicated, block: B:106:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x0135  */
    /* JADX WARN: Code duplicated, block: B:41:0x013e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0216  */
    /* JADX WARN: Code duplicated, block: B:53:0x0223  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Object obj3;
        Object obj4;
        Throwable th3;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        x0 x0Var;
        p3.m mVar;
        String str;
        int i14 = this.f1441a;
        int i15 = 6;
        p3.m.a aVar = p3.m.f135153a;
        String str2 = this.f1442b;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(aVar2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    boolean zB = mVar2.B(str2);
                    Object objQ = mVar2.q();
                    if (zB) {
                        obj3 = objQ;
                        defpackage.b bVar2 = new defpackage.b(str2, 5);
                        mVar2.K(bVar2);
                        obj3 = bVar2;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj3 = objQ;
                            defpackage.b bVar3 = new defpackage.b(str2, 5);
                            mVar2.K(bVar3);
                            obj3 = bVar3;
                        }
                    }
                    obj3 = objQ;
                    r rVarC3 = v.c((e23.l) obj3, aVar2, false);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var2 = j92.f.f97931h;
                    mh.c(this.f1443c, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar2), mVar2, 0, 0, 131068);
                    String str3 = this.f1444d;
                    boolean zB2 = mVar2.B(str3);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        obj4 = objQ2;
                        defpackage.b bVar4 = new defpackage.b(str3, i15);
                        mVar2.K(bVar4);
                        obj4 = bVar4;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj4 = objQ2;
                            defpackage.b bVar5 = new defpackage.b(str3, i15);
                            mVar2.K(bVar5);
                            obj4 = bVar5;
                        }
                    }
                    obj4 = objQ2;
                    mh.c(this.f1445e, v.c((e23.l) obj4, aVar2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar2), mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m.f40713m;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1316795174, new h(this.f1442b, this.f1443c, this.f1444d, this.f1445e, 2, (byte) 0), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m.f40713m;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    r.a aVar6 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    x0Var3.e(c2.l.y(aVar6, j92.b.f97899b.f97920e), z3.f.c(121059775, new g0(0, this.f1442b, this.f1443c, this.f1444d, this.f1445e), mVar4), mVar4, (l72.x0.f111348c << 6) | 48, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                mw0.k.a(this.f1442b, this.f1443c, this.f1444d, this.f1445e, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r.a aVar7 = r.S;
                    r rVarD = x2.d(aVar7, 1.0f);
                    boolean zB3 = mVar5.B(str2);
                    Object objQ3 = mVar5.q();
                    if (zB3) {
                        objQ3 = new o60.b(str2, z14 ? 1 : 0);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new o60.b(str2, z14 ? 1 : 0);
                            mVar5.K(objQ3);
                        }
                    }
                    r rVarC4 = v.c((e23.l) objQ3, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar8 = h4.d.a.f81536n;
                    z zVarA3 = y.a(kVar2, aVar8, mVar5, 0);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    r rVarC5 = h4.k.c(rVarC4, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar9);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA3, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar5);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar5.getT()) {
                        th3 = null;
                    } else {
                        th3 = null;
                        if (!s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC5, mVar5);
                        r rVarA = b0.f22601a.a(x2.f(aVar7, 1.0f), 1.0f, true);
                        zVarA = y.a(kVar2, aVar8, mVar5, 0);
                        iHashCode = Long.hashCode(mVar5.getU());
                        i2VarX = mVar5.x();
                        rVarC = h4.k.c(rVarA, mVar5);
                        if (mVar5.F() != null) {
                            p0.l();
                            throw th3;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar9);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar, zVarA, mVar5);
                        b4.c(c1623g, i2VarX, mVar5);
                        if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar5, iHashCode, bVar6);
                        }
                        b4.c(fVar, rVarC, mVar5);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(this.f1444d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, mVar5), mVar5, 0, 0, 131070);
                        x0Var = j92.f.f97933j;
                        x0 x0VarF = d92.c.f(x0Var, mVar5);
                        d92.b.f58625c.getClass();
                        mh.c(this.f1445e, c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar5, 0, 0, 131068);
                        mVar = mVar5;
                        mVar.y();
                        str = this.f1443c;
                        if (str != null) {
                            mVar.C(-1326782360);
                            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                            mVar = mVar;
                            mVar.f();
                        } else {
                            mVar.C(-1326611302);
                            mVar.f();
                        }
                        mVar.y();
                    }
                    v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC5, mVar5);
                    r rVarA2 = b0.f22601a.a(x2.f(aVar7, 1.0f), 1.0f, true);
                    zVarA = y.a(kVar2, aVar8, mVar5, 0);
                    iHashCode = Long.hashCode(mVar5.getU());
                    i2VarX = mVar5.x();
                    rVarC = h4.k.c(rVarA2, mVar5);
                    if (mVar5.F() != null) {
                        p0.l();
                        throw th3;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar9);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar, zVarA, mVar5);
                    b4.c(c1623g, i2VarX, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar6);
                    } else {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar6);
                    }
                    b4.c(fVar, rVarC, mVar5);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f1444d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, mVar5), mVar5, 0, 0, 131070);
                    x0Var = j92.f.f97933j;
                    x0 x0VarF2 = d92.c.f(x0Var, mVar5);
                    d92.b.f58625c.getClass();
                    mh.c(this.f1445e, c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar5, 0, 0, 131068);
                    mVar = mVar5;
                    mVar.y();
                    str = this.f1443c;
                    if (str != null) {
                        mVar.C(-1326782360);
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(-1326611302);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    gl.c.f77766a.getClass();
                    m92.y.b(d0.a(gl.c.a(mVar6).l()), this.f1442b, null, null, this.f1443c, null, mVar6, 384, 40);
                    m92.y.b(d0.a(gl.c.a(mVar6).b()), this.f1444d, null, null, this.f1445e, null, mVar6, 384, 40);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, int i14, byte b14) {
        this.f1441a = i14;
        this.f1442b = str;
        this.f1443c = str2;
        this.f1444d = str3;
        this.f1445e = str4;
    }
}
