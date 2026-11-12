package o11;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import l72.p2;
import l72.r1;
import mt0.s1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p3.x3;
import u1.a2;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p11.a f128524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3 f128525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n11.a f128526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n11.a f128527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n11.a f128528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n11.a f128529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n11.a f128530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n11.a f128531i;

    public /* synthetic */ d(p11.a aVar, x3 x3Var, n11.a aVar2, n11.a aVar3, n11.a aVar4, n11.a aVar5, n11.a aVar6, n11.a aVar7, int i14) {
        this.f128523a = i14;
        this.f128524b = aVar;
        this.f128525c = x3Var;
        this.f128526d = aVar2;
        this.f128527e = aVar3;
        this.f128528f = aVar4;
        this.f128529g = aVar5;
        this.f128530h = aVar6;
        this.f128531i = aVar7;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
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
    public final Object invoke(Object obj, Object obj2) {
        final int i14 = 0;
        final int i15 = 1;
        final int i16 = 2;
        switch (this.f128523a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarF = x2.f(l.D(a2.b(r.S, a2.a(mVar), true)), 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarF, mVar);
                    g.V.getClass();
                    e0.a aVar = g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar);
                    b4.c(g.a.f81809f, i2VarX, mVar);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    r1.b(gl1.y.Q(mVar, R.string.development_settings), f.c(432571450, new d(this.f128524b, this.f128525c, this.f128526d, this.f128527e, this.f128528f, this.f128529g, this.f128530h, this.f128531i, 1), mVar), mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.force_nutrition_setup_flow);
                    String strQ2 = gl1.y.Q(mVar2, R.string.force_nutrition_setup_flow_summary);
                    x3 x3Var = this.f128525c;
                    z3.e eVarC = f.c(-2014299737, new dv0.l(x3Var, i16), mVar2);
                    final p11.a aVar2 = this.f128524b;
                    boolean zR = mVar2.r(aVar2) | mVar2.B(x3Var);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        objQ = new s1(17, aVar2, x3Var);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new s1(17, aVar2, x3Var);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.h(strQ, strQ2, null, null, null, false, false, null, eVarC, null, (e23.a) objQ, mVar2, 100663296, 0, 764);
                    String strQ3 = gl1.y.Q(mVar2, R.string.meal_window_in_minutes);
                    String strQ4 = gl1.y.Q(mVar2, R.string.minute_level_meal_windows_summary);
                    final n11.a aVar4 = this.f128526d;
                    z3.e eVarC2 = f.c(-376238178, new p() { // from class: o11.b
                        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
                        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int i17 = i14;
                            m.a aVar5 = m.f135153a;
                            final p11.a aVar6 = aVar2;
                            n11.a aVar7 = aVar4;
                            final int i18 = 2;
                            final int i19 = 1;
                            boolean z14 = false;
                            m mVar3 = (m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            switch (i17) {
                                case 0:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        r.a aVar8 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ = x2.z(aVar8, h4.d.a.f81538p, 2);
                                        boolean zR2 = mVar3.r(aVar6);
                                        Object objQ2 = mVar3.q();
                                        if (zR2) {
                                            final int i24 = 5;
                                            objQ2 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar9 = (n11.a) obj5;
                                                    switch (i24) {
                                                        case 0:
                                                            aVar9.getClass();
                                                            Boolean boolB = aVar9.b();
                                                            p11.a aVar10 = aVar6;
                                                            aVar10.f134892a.q(boolB);
                                                            aVar10.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar9.getClass();
                                                            Boolean boolB2 = aVar9.b();
                                                            p11.a aVar11 = aVar6;
                                                            aVar11.f134892a.f(boolB2);
                                                            aVar11.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar9.getClass();
                                                            Boolean boolB3 = aVar9.b();
                                                            p11.a aVar12 = aVar6;
                                                            aVar12.f134892a.i(boolB3);
                                                            aVar12.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar9.getClass();
                                                            Boolean boolB4 = aVar9.b();
                                                            p11.a aVar13 = aVar6;
                                                            aVar13.f134892a.B(boolB4);
                                                            aVar13.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar9.getClass();
                                                            Boolean boolB5 = aVar9.b();
                                                            p11.a aVar14 = aVar6;
                                                            aVar14.f134892a.m(boolB5);
                                                            aVar14.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar9.getClass();
                                                            Boolean boolB6 = aVar9.b();
                                                            p11.a aVar15 = aVar6;
                                                            aVar15.f134892a.h(boolB6);
                                                            aVar15.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ2);
                                        } else {
                                            aVar5.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                final int i25 = 5;
                                                objQ2 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar9 = (n11.a) obj5;
                                                        switch (i25) {
                                                            case 0:
                                                                aVar9.getClass();
                                                                Boolean boolB = aVar9.b();
                                                                p11.a aVar10 = aVar6;
                                                                aVar10.f134892a.q(boolB);
                                                                aVar10.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar9.getClass();
                                                                Boolean boolB2 = aVar9.b();
                                                                p11.a aVar11 = aVar6;
                                                                aVar11.f134892a.f(boolB2);
                                                                aVar11.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar9.getClass();
                                                                Boolean boolB3 = aVar9.b();
                                                                p11.a aVar12 = aVar6;
                                                                aVar12.f134892a.i(boolB3);
                                                                aVar12.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar9.getClass();
                                                                Boolean boolB4 = aVar9.b();
                                                                p11.a aVar13 = aVar6;
                                                                aVar13.f134892a.B(boolB4);
                                                                aVar13.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar9.getClass();
                                                                Boolean boolB5 = aVar9.b();
                                                                p11.a aVar14 = aVar6;
                                                                aVar14.f134892a.m(boolB5);
                                                                aVar14.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar9.getClass();
                                                                Boolean boolB6 = aVar9.b();
                                                                p11.a aVar15 = aVar6;
                                                                aVar15.f134892a.h(boolB6);
                                                                aVar15.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ2);
                                            }
                                        }
                                        m11.a.a(rVarZ, aVar7, (e23.l) objQ2, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r.a aVar9 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ2 = x2.z(aVar9, h4.d.a.f81538p, 2);
                                        boolean zR3 = mVar3.r(aVar6);
                                        Object objQ3 = mVar3.q();
                                        if (zR3) {
                                            final int i26 = 3;
                                            objQ3 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar10 = (n11.a) obj5;
                                                    switch (i26) {
                                                        case 0:
                                                            aVar10.getClass();
                                                            Boolean boolB = aVar10.b();
                                                            p11.a aVar11 = aVar6;
                                                            aVar11.f134892a.q(boolB);
                                                            aVar11.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar10.getClass();
                                                            Boolean boolB2 = aVar10.b();
                                                            p11.a aVar12 = aVar6;
                                                            aVar12.f134892a.f(boolB2);
                                                            aVar12.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar10.getClass();
                                                            Boolean boolB3 = aVar10.b();
                                                            p11.a aVar13 = aVar6;
                                                            aVar13.f134892a.i(boolB3);
                                                            aVar13.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar10.getClass();
                                                            Boolean boolB4 = aVar10.b();
                                                            p11.a aVar14 = aVar6;
                                                            aVar14.f134892a.B(boolB4);
                                                            aVar14.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar10.getClass();
                                                            Boolean boolB5 = aVar10.b();
                                                            p11.a aVar15 = aVar6;
                                                            aVar15.f134892a.m(boolB5);
                                                            aVar15.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar10.getClass();
                                                            Boolean boolB6 = aVar10.b();
                                                            p11.a aVar16 = aVar6;
                                                            aVar16.f134892a.h(boolB6);
                                                            aVar16.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ3);
                                        } else {
                                            aVar5.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                final int i27 = 3;
                                                objQ3 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar10 = (n11.a) obj5;
                                                        switch (i27) {
                                                            case 0:
                                                                aVar10.getClass();
                                                                Boolean boolB = aVar10.b();
                                                                p11.a aVar11 = aVar6;
                                                                aVar11.f134892a.q(boolB);
                                                                aVar11.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar10.getClass();
                                                                Boolean boolB2 = aVar10.b();
                                                                p11.a aVar12 = aVar6;
                                                                aVar12.f134892a.f(boolB2);
                                                                aVar12.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar10.getClass();
                                                                Boolean boolB3 = aVar10.b();
                                                                p11.a aVar13 = aVar6;
                                                                aVar13.f134892a.i(boolB3);
                                                                aVar13.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar10.getClass();
                                                                Boolean boolB4 = aVar10.b();
                                                                p11.a aVar14 = aVar6;
                                                                aVar14.f134892a.B(boolB4);
                                                                aVar14.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar10.getClass();
                                                                Boolean boolB5 = aVar10.b();
                                                                p11.a aVar15 = aVar6;
                                                                aVar15.f134892a.m(boolB5);
                                                                aVar15.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar10.getClass();
                                                                Boolean boolB6 = aVar10.b();
                                                                p11.a aVar16 = aVar6;
                                                                aVar16.f134892a.h(boolB6);
                                                                aVar16.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ3);
                                            }
                                        }
                                        m11.a.a(rVarZ2, aVar7, (e23.l) objQ3, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        r.a aVar10 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ3 = x2.z(aVar10, h4.d.a.f81538p, 2);
                                        boolean zR4 = mVar3.r(aVar6);
                                        Object objQ4 = mVar3.q();
                                        if (zR4) {
                                            final int i28 = 4;
                                            objQ4 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar11 = (n11.a) obj5;
                                                    switch (i28) {
                                                        case 0:
                                                            aVar11.getClass();
                                                            Boolean boolB = aVar11.b();
                                                            p11.a aVar12 = aVar6;
                                                            aVar12.f134892a.q(boolB);
                                                            aVar12.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar11.getClass();
                                                            Boolean boolB2 = aVar11.b();
                                                            p11.a aVar13 = aVar6;
                                                            aVar13.f134892a.f(boolB2);
                                                            aVar13.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar11.getClass();
                                                            Boolean boolB3 = aVar11.b();
                                                            p11.a aVar14 = aVar6;
                                                            aVar14.f134892a.i(boolB3);
                                                            aVar14.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar11.getClass();
                                                            Boolean boolB4 = aVar11.b();
                                                            p11.a aVar15 = aVar6;
                                                            aVar15.f134892a.B(boolB4);
                                                            aVar15.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar11.getClass();
                                                            Boolean boolB5 = aVar11.b();
                                                            p11.a aVar16 = aVar6;
                                                            aVar16.f134892a.m(boolB5);
                                                            aVar16.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar11.getClass();
                                                            Boolean boolB6 = aVar11.b();
                                                            p11.a aVar17 = aVar6;
                                                            aVar17.f134892a.h(boolB6);
                                                            aVar17.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ4);
                                        } else {
                                            aVar5.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                final int i29 = 4;
                                                objQ4 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar11 = (n11.a) obj5;
                                                        switch (i29) {
                                                            case 0:
                                                                aVar11.getClass();
                                                                Boolean boolB = aVar11.b();
                                                                p11.a aVar12 = aVar6;
                                                                aVar12.f134892a.q(boolB);
                                                                aVar12.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar11.getClass();
                                                                Boolean boolB2 = aVar11.b();
                                                                p11.a aVar13 = aVar6;
                                                                aVar13.f134892a.f(boolB2);
                                                                aVar13.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar11.getClass();
                                                                Boolean boolB3 = aVar11.b();
                                                                p11.a aVar14 = aVar6;
                                                                aVar14.f134892a.i(boolB3);
                                                                aVar14.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar11.getClass();
                                                                Boolean boolB4 = aVar11.b();
                                                                p11.a aVar15 = aVar6;
                                                                aVar15.f134892a.B(boolB4);
                                                                aVar15.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar11.getClass();
                                                                Boolean boolB5 = aVar11.b();
                                                                p11.a aVar16 = aVar6;
                                                                aVar16.f134892a.m(boolB5);
                                                                aVar16.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar11.getClass();
                                                                Boolean boolB6 = aVar11.b();
                                                                p11.a aVar17 = aVar6;
                                                                aVar17.f134892a.h(boolB6);
                                                                aVar17.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ4);
                                            }
                                        }
                                        m11.a.a(rVarZ3, aVar7, (e23.l) objQ4, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 3:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        r.a aVar11 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ4 = x2.z(aVar11, h4.d.a.f81538p, 2);
                                        boolean zR5 = mVar3.r(aVar6);
                                        Object objQ5 = mVar3.q();
                                        if (zR5) {
                                            final int i30 = z14 ? 1 : 0;
                                            objQ5 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar12 = (n11.a) obj5;
                                                    switch (i30) {
                                                        case 0:
                                                            aVar12.getClass();
                                                            Boolean boolB = aVar12.b();
                                                            p11.a aVar13 = aVar6;
                                                            aVar13.f134892a.q(boolB);
                                                            aVar13.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar12.getClass();
                                                            Boolean boolB2 = aVar12.b();
                                                            p11.a aVar14 = aVar6;
                                                            aVar14.f134892a.f(boolB2);
                                                            aVar14.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar12.getClass();
                                                            Boolean boolB3 = aVar12.b();
                                                            p11.a aVar15 = aVar6;
                                                            aVar15.f134892a.i(boolB3);
                                                            aVar15.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar12.getClass();
                                                            Boolean boolB4 = aVar12.b();
                                                            p11.a aVar16 = aVar6;
                                                            aVar16.f134892a.B(boolB4);
                                                            aVar16.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar12.getClass();
                                                            Boolean boolB5 = aVar12.b();
                                                            p11.a aVar17 = aVar6;
                                                            aVar17.f134892a.m(boolB5);
                                                            aVar17.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar12.getClass();
                                                            Boolean boolB6 = aVar12.b();
                                                            p11.a aVar18 = aVar6;
                                                            aVar18.f134892a.h(boolB6);
                                                            aVar18.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ5);
                                        } else {
                                            aVar5.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                final int i34 = z14 ? 1 : 0;
                                                objQ5 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar12 = (n11.a) obj5;
                                                        switch (i34) {
                                                            case 0:
                                                                aVar12.getClass();
                                                                Boolean boolB = aVar12.b();
                                                                p11.a aVar13 = aVar6;
                                                                aVar13.f134892a.q(boolB);
                                                                aVar13.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar12.getClass();
                                                                Boolean boolB2 = aVar12.b();
                                                                p11.a aVar14 = aVar6;
                                                                aVar14.f134892a.f(boolB2);
                                                                aVar14.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar12.getClass();
                                                                Boolean boolB3 = aVar12.b();
                                                                p11.a aVar15 = aVar6;
                                                                aVar15.f134892a.i(boolB3);
                                                                aVar15.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar12.getClass();
                                                                Boolean boolB4 = aVar12.b();
                                                                p11.a aVar16 = aVar6;
                                                                aVar16.f134892a.B(boolB4);
                                                                aVar16.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar12.getClass();
                                                                Boolean boolB5 = aVar12.b();
                                                                p11.a aVar17 = aVar6;
                                                                aVar17.f134892a.m(boolB5);
                                                                aVar17.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar12.getClass();
                                                                Boolean boolB6 = aVar12.b();
                                                                p11.a aVar18 = aVar6;
                                                                aVar18.f134892a.h(boolB6);
                                                                aVar18.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ5);
                                            }
                                        }
                                        m11.a.a(rVarZ4, aVar7, (e23.l) objQ5, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 4:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        r.a aVar12 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ5 = x2.z(aVar12, h4.d.a.f81538p, 2);
                                        boolean zR6 = mVar3.r(aVar6);
                                        Object objQ6 = mVar3.q();
                                        if (zR6) {
                                            objQ6 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar13 = (n11.a) obj5;
                                                    switch (i18) {
                                                        case 0:
                                                            aVar13.getClass();
                                                            Boolean boolB = aVar13.b();
                                                            p11.a aVar14 = aVar6;
                                                            aVar14.f134892a.q(boolB);
                                                            aVar14.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar13.getClass();
                                                            Boolean boolB2 = aVar13.b();
                                                            p11.a aVar15 = aVar6;
                                                            aVar15.f134892a.f(boolB2);
                                                            aVar15.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar13.getClass();
                                                            Boolean boolB3 = aVar13.b();
                                                            p11.a aVar16 = aVar6;
                                                            aVar16.f134892a.i(boolB3);
                                                            aVar16.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar13.getClass();
                                                            Boolean boolB4 = aVar13.b();
                                                            p11.a aVar17 = aVar6;
                                                            aVar17.f134892a.B(boolB4);
                                                            aVar17.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar13.getClass();
                                                            Boolean boolB5 = aVar13.b();
                                                            p11.a aVar18 = aVar6;
                                                            aVar18.f134892a.m(boolB5);
                                                            aVar18.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar13.getClass();
                                                            Boolean boolB6 = aVar13.b();
                                                            p11.a aVar19 = aVar6;
                                                            aVar19.f134892a.h(boolB6);
                                                            aVar19.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ6);
                                        } else {
                                            aVar5.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                objQ6 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar13 = (n11.a) obj5;
                                                        switch (i18) {
                                                            case 0:
                                                                aVar13.getClass();
                                                                Boolean boolB = aVar13.b();
                                                                p11.a aVar14 = aVar6;
                                                                aVar14.f134892a.q(boolB);
                                                                aVar14.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar13.getClass();
                                                                Boolean boolB2 = aVar13.b();
                                                                p11.a aVar15 = aVar6;
                                                                aVar15.f134892a.f(boolB2);
                                                                aVar15.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar13.getClass();
                                                                Boolean boolB3 = aVar13.b();
                                                                p11.a aVar16 = aVar6;
                                                                aVar16.f134892a.i(boolB3);
                                                                aVar16.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar13.getClass();
                                                                Boolean boolB4 = aVar13.b();
                                                                p11.a aVar17 = aVar6;
                                                                aVar17.f134892a.B(boolB4);
                                                                aVar17.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar13.getClass();
                                                                Boolean boolB5 = aVar13.b();
                                                                p11.a aVar18 = aVar6;
                                                                aVar18.f134892a.m(boolB5);
                                                                aVar18.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar13.getClass();
                                                                Boolean boolB6 = aVar13.b();
                                                                p11.a aVar19 = aVar6;
                                                                aVar19.f134892a.h(boolB6);
                                                                aVar19.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ6);
                                            }
                                        }
                                        m11.a.a(rVarZ5, aVar7, (e23.l) objQ6, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        r.a aVar13 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ6 = x2.z(aVar13, h4.d.a.f81538p, 2);
                                        boolean zR7 = mVar3.r(aVar6);
                                        Object objQ7 = mVar3.q();
                                        if (zR7) {
                                            objQ7 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar14 = (n11.a) obj5;
                                                    switch (i19) {
                                                        case 0:
                                                            aVar14.getClass();
                                                            Boolean boolB = aVar14.b();
                                                            p11.a aVar15 = aVar6;
                                                            aVar15.f134892a.q(boolB);
                                                            aVar15.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar14.getClass();
                                                            Boolean boolB2 = aVar14.b();
                                                            p11.a aVar16 = aVar6;
                                                            aVar16.f134892a.f(boolB2);
                                                            aVar16.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar14.getClass();
                                                            Boolean boolB3 = aVar14.b();
                                                            p11.a aVar17 = aVar6;
                                                            aVar17.f134892a.i(boolB3);
                                                            aVar17.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar14.getClass();
                                                            Boolean boolB4 = aVar14.b();
                                                            p11.a aVar18 = aVar6;
                                                            aVar18.f134892a.B(boolB4);
                                                            aVar18.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar14.getClass();
                                                            Boolean boolB5 = aVar14.b();
                                                            p11.a aVar19 = aVar6;
                                                            aVar19.f134892a.m(boolB5);
                                                            aVar19.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar14.getClass();
                                                            Boolean boolB6 = aVar14.b();
                                                            p11.a aVar110 = aVar6;
                                                            aVar110.f134892a.h(boolB6);
                                                            aVar110.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ7);
                                        } else {
                                            aVar5.getClass();
                                            if (objQ7 == m.a.f135155b) {
                                                objQ7 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar14 = (n11.a) obj5;
                                                        switch (i19) {
                                                            case 0:
                                                                aVar14.getClass();
                                                                Boolean boolB = aVar14.b();
                                                                p11.a aVar15 = aVar6;
                                                                aVar15.f134892a.q(boolB);
                                                                aVar15.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar14.getClass();
                                                                Boolean boolB2 = aVar14.b();
                                                                p11.a aVar16 = aVar6;
                                                                aVar16.f134892a.f(boolB2);
                                                                aVar16.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar14.getClass();
                                                                Boolean boolB3 = aVar14.b();
                                                                p11.a aVar17 = aVar6;
                                                                aVar17.f134892a.i(boolB3);
                                                                aVar17.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar14.getClass();
                                                                Boolean boolB4 = aVar14.b();
                                                                p11.a aVar18 = aVar6;
                                                                aVar18.f134892a.B(boolB4);
                                                                aVar18.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar14.getClass();
                                                                Boolean boolB5 = aVar14.b();
                                                                p11.a aVar19 = aVar6;
                                                                aVar19.f134892a.m(boolB5);
                                                                aVar19.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar14.getClass();
                                                                Boolean boolB6 = aVar14.b();
                                                                p11.a aVar110 = aVar6;
                                                                aVar110.f134892a.h(boolB6);
                                                                aVar110.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        m11.a.a(rVarZ6, aVar7, (e23.l) objQ7, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    Object objQ2 = mVar2.q();
                    aVar3.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new nw1.e(3);
                        mVar2.K(objQ2);
                    }
                    p2Var.h(strQ3, strQ4, null, null, null, false, false, null, eVarC2, null, (e23.a) objQ2, mVar2, 100663296, 6, 764);
                    String strQ5 = gl1.y.Q(mVar2, R.string.has_pregnancy_in_progress);
                    final n11.a aVar5 = this.f128527e;
                    z3.e eVarC3 = f.c(-898151995, new p() { // from class: o11.b
                        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
                        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int i17 = i15;
                            m.a aVar6 = m.f135153a;
                            final p11.a aVar7 = aVar2;
                            n11.a aVar8 = aVar5;
                            final int i18 = 2;
                            final int i19 = 1;
                            boolean z14 = false;
                            m mVar3 = (m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            switch (i17) {
                                case 0:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        r.a aVar9 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ = x2.z(aVar9, h4.d.a.f81538p, 2);
                                        boolean zR2 = mVar3.r(aVar7);
                                        Object objQ3 = mVar3.q();
                                        if (zR2) {
                                            final int i25 = 5;
                                            objQ3 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar14 = (n11.a) obj5;
                                                    switch (i25) {
                                                        case 0:
                                                            aVar14.getClass();
                                                            Boolean boolB = aVar14.b();
                                                            p11.a aVar15 = aVar7;
                                                            aVar15.f134892a.q(boolB);
                                                            aVar15.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar14.getClass();
                                                            Boolean boolB2 = aVar14.b();
                                                            p11.a aVar16 = aVar7;
                                                            aVar16.f134892a.f(boolB2);
                                                            aVar16.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar14.getClass();
                                                            Boolean boolB3 = aVar14.b();
                                                            p11.a aVar17 = aVar7;
                                                            aVar17.f134892a.i(boolB3);
                                                            aVar17.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar14.getClass();
                                                            Boolean boolB4 = aVar14.b();
                                                            p11.a aVar18 = aVar7;
                                                            aVar18.f134892a.B(boolB4);
                                                            aVar18.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar14.getClass();
                                                            Boolean boolB5 = aVar14.b();
                                                            p11.a aVar19 = aVar7;
                                                            aVar19.f134892a.m(boolB5);
                                                            aVar19.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar14.getClass();
                                                            Boolean boolB6 = aVar14.b();
                                                            p11.a aVar110 = aVar7;
                                                            aVar110.f134892a.h(boolB6);
                                                            aVar110.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ3);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                final int i26 = 5;
                                                objQ3 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar14 = (n11.a) obj5;
                                                        switch (i26) {
                                                            case 0:
                                                                aVar14.getClass();
                                                                Boolean boolB = aVar14.b();
                                                                p11.a aVar15 = aVar7;
                                                                aVar15.f134892a.q(boolB);
                                                                aVar15.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar14.getClass();
                                                                Boolean boolB2 = aVar14.b();
                                                                p11.a aVar16 = aVar7;
                                                                aVar16.f134892a.f(boolB2);
                                                                aVar16.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar14.getClass();
                                                                Boolean boolB3 = aVar14.b();
                                                                p11.a aVar17 = aVar7;
                                                                aVar17.f134892a.i(boolB3);
                                                                aVar17.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar14.getClass();
                                                                Boolean boolB4 = aVar14.b();
                                                                p11.a aVar18 = aVar7;
                                                                aVar18.f134892a.B(boolB4);
                                                                aVar18.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar14.getClass();
                                                                Boolean boolB5 = aVar14.b();
                                                                p11.a aVar19 = aVar7;
                                                                aVar19.f134892a.m(boolB5);
                                                                aVar19.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar14.getClass();
                                                                Boolean boolB6 = aVar14.b();
                                                                p11.a aVar110 = aVar7;
                                                                aVar110.f134892a.h(boolB6);
                                                                aVar110.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ3);
                                            }
                                        }
                                        m11.a.a(rVarZ, aVar8, (e23.l) objQ3, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r.a aVar10 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ2 = x2.z(aVar10, h4.d.a.f81538p, 2);
                                        boolean zR3 = mVar3.r(aVar7);
                                        Object objQ4 = mVar3.q();
                                        if (zR3) {
                                            final int i27 = 3;
                                            objQ4 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar14 = (n11.a) obj5;
                                                    switch (i27) {
                                                        case 0:
                                                            aVar14.getClass();
                                                            Boolean boolB = aVar14.b();
                                                            p11.a aVar15 = aVar7;
                                                            aVar15.f134892a.q(boolB);
                                                            aVar15.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar14.getClass();
                                                            Boolean boolB2 = aVar14.b();
                                                            p11.a aVar16 = aVar7;
                                                            aVar16.f134892a.f(boolB2);
                                                            aVar16.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar14.getClass();
                                                            Boolean boolB3 = aVar14.b();
                                                            p11.a aVar17 = aVar7;
                                                            aVar17.f134892a.i(boolB3);
                                                            aVar17.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar14.getClass();
                                                            Boolean boolB4 = aVar14.b();
                                                            p11.a aVar18 = aVar7;
                                                            aVar18.f134892a.B(boolB4);
                                                            aVar18.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar14.getClass();
                                                            Boolean boolB5 = aVar14.b();
                                                            p11.a aVar19 = aVar7;
                                                            aVar19.f134892a.m(boolB5);
                                                            aVar19.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar14.getClass();
                                                            Boolean boolB6 = aVar14.b();
                                                            p11.a aVar110 = aVar7;
                                                            aVar110.f134892a.h(boolB6);
                                                            aVar110.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ4);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                final int i28 = 3;
                                                objQ4 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar14 = (n11.a) obj5;
                                                        switch (i28) {
                                                            case 0:
                                                                aVar14.getClass();
                                                                Boolean boolB = aVar14.b();
                                                                p11.a aVar15 = aVar7;
                                                                aVar15.f134892a.q(boolB);
                                                                aVar15.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar14.getClass();
                                                                Boolean boolB2 = aVar14.b();
                                                                p11.a aVar16 = aVar7;
                                                                aVar16.f134892a.f(boolB2);
                                                                aVar16.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar14.getClass();
                                                                Boolean boolB3 = aVar14.b();
                                                                p11.a aVar17 = aVar7;
                                                                aVar17.f134892a.i(boolB3);
                                                                aVar17.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar14.getClass();
                                                                Boolean boolB4 = aVar14.b();
                                                                p11.a aVar18 = aVar7;
                                                                aVar18.f134892a.B(boolB4);
                                                                aVar18.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar14.getClass();
                                                                Boolean boolB5 = aVar14.b();
                                                                p11.a aVar19 = aVar7;
                                                                aVar19.f134892a.m(boolB5);
                                                                aVar19.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar14.getClass();
                                                                Boolean boolB6 = aVar14.b();
                                                                p11.a aVar110 = aVar7;
                                                                aVar110.f134892a.h(boolB6);
                                                                aVar110.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ4);
                                            }
                                        }
                                        m11.a.a(rVarZ2, aVar8, (e23.l) objQ4, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        r.a aVar11 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ3 = x2.z(aVar11, h4.d.a.f81538p, 2);
                                        boolean zR4 = mVar3.r(aVar7);
                                        Object objQ5 = mVar3.q();
                                        if (zR4) {
                                            final int i29 = 4;
                                            objQ5 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar14 = (n11.a) obj5;
                                                    switch (i29) {
                                                        case 0:
                                                            aVar14.getClass();
                                                            Boolean boolB = aVar14.b();
                                                            p11.a aVar15 = aVar7;
                                                            aVar15.f134892a.q(boolB);
                                                            aVar15.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar14.getClass();
                                                            Boolean boolB2 = aVar14.b();
                                                            p11.a aVar16 = aVar7;
                                                            aVar16.f134892a.f(boolB2);
                                                            aVar16.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar14.getClass();
                                                            Boolean boolB3 = aVar14.b();
                                                            p11.a aVar17 = aVar7;
                                                            aVar17.f134892a.i(boolB3);
                                                            aVar17.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar14.getClass();
                                                            Boolean boolB4 = aVar14.b();
                                                            p11.a aVar18 = aVar7;
                                                            aVar18.f134892a.B(boolB4);
                                                            aVar18.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar14.getClass();
                                                            Boolean boolB5 = aVar14.b();
                                                            p11.a aVar19 = aVar7;
                                                            aVar19.f134892a.m(boolB5);
                                                            aVar19.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar14.getClass();
                                                            Boolean boolB6 = aVar14.b();
                                                            p11.a aVar110 = aVar7;
                                                            aVar110.f134892a.h(boolB6);
                                                            aVar110.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ5);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                final int i210 = 4;
                                                objQ5 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar14 = (n11.a) obj5;
                                                        switch (i210) {
                                                            case 0:
                                                                aVar14.getClass();
                                                                Boolean boolB = aVar14.b();
                                                                p11.a aVar15 = aVar7;
                                                                aVar15.f134892a.q(boolB);
                                                                aVar15.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar14.getClass();
                                                                Boolean boolB2 = aVar14.b();
                                                                p11.a aVar16 = aVar7;
                                                                aVar16.f134892a.f(boolB2);
                                                                aVar16.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar14.getClass();
                                                                Boolean boolB3 = aVar14.b();
                                                                p11.a aVar17 = aVar7;
                                                                aVar17.f134892a.i(boolB3);
                                                                aVar17.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar14.getClass();
                                                                Boolean boolB4 = aVar14.b();
                                                                p11.a aVar18 = aVar7;
                                                                aVar18.f134892a.B(boolB4);
                                                                aVar18.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar14.getClass();
                                                                Boolean boolB5 = aVar14.b();
                                                                p11.a aVar19 = aVar7;
                                                                aVar19.f134892a.m(boolB5);
                                                                aVar19.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar14.getClass();
                                                                Boolean boolB6 = aVar14.b();
                                                                p11.a aVar110 = aVar7;
                                                                aVar110.f134892a.h(boolB6);
                                                                aVar110.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ5);
                                            }
                                        }
                                        m11.a.a(rVarZ3, aVar8, (e23.l) objQ5, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 3:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        r.a aVar12 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ4 = x2.z(aVar12, h4.d.a.f81538p, 2);
                                        boolean zR5 = mVar3.r(aVar7);
                                        Object objQ6 = mVar3.q();
                                        if (zR5) {
                                            final int i34 = z14 ? 1 : 0;
                                            objQ6 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar14 = (n11.a) obj5;
                                                    switch (i34) {
                                                        case 0:
                                                            aVar14.getClass();
                                                            Boolean boolB = aVar14.b();
                                                            p11.a aVar15 = aVar7;
                                                            aVar15.f134892a.q(boolB);
                                                            aVar15.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar14.getClass();
                                                            Boolean boolB2 = aVar14.b();
                                                            p11.a aVar16 = aVar7;
                                                            aVar16.f134892a.f(boolB2);
                                                            aVar16.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar14.getClass();
                                                            Boolean boolB3 = aVar14.b();
                                                            p11.a aVar17 = aVar7;
                                                            aVar17.f134892a.i(boolB3);
                                                            aVar17.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar14.getClass();
                                                            Boolean boolB4 = aVar14.b();
                                                            p11.a aVar18 = aVar7;
                                                            aVar18.f134892a.B(boolB4);
                                                            aVar18.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar14.getClass();
                                                            Boolean boolB5 = aVar14.b();
                                                            p11.a aVar19 = aVar7;
                                                            aVar19.f134892a.m(boolB5);
                                                            aVar19.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar14.getClass();
                                                            Boolean boolB6 = aVar14.b();
                                                            p11.a aVar110 = aVar7;
                                                            aVar110.f134892a.h(boolB6);
                                                            aVar110.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ6);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                final int i35 = z14 ? 1 : 0;
                                                objQ6 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar14 = (n11.a) obj5;
                                                        switch (i35) {
                                                            case 0:
                                                                aVar14.getClass();
                                                                Boolean boolB = aVar14.b();
                                                                p11.a aVar15 = aVar7;
                                                                aVar15.f134892a.q(boolB);
                                                                aVar15.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar14.getClass();
                                                                Boolean boolB2 = aVar14.b();
                                                                p11.a aVar16 = aVar7;
                                                                aVar16.f134892a.f(boolB2);
                                                                aVar16.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar14.getClass();
                                                                Boolean boolB3 = aVar14.b();
                                                                p11.a aVar17 = aVar7;
                                                                aVar17.f134892a.i(boolB3);
                                                                aVar17.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar14.getClass();
                                                                Boolean boolB4 = aVar14.b();
                                                                p11.a aVar18 = aVar7;
                                                                aVar18.f134892a.B(boolB4);
                                                                aVar18.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar14.getClass();
                                                                Boolean boolB5 = aVar14.b();
                                                                p11.a aVar19 = aVar7;
                                                                aVar19.f134892a.m(boolB5);
                                                                aVar19.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar14.getClass();
                                                                Boolean boolB6 = aVar14.b();
                                                                p11.a aVar110 = aVar7;
                                                                aVar110.f134892a.h(boolB6);
                                                                aVar110.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ6);
                                            }
                                        }
                                        m11.a.a(rVarZ4, aVar8, (e23.l) objQ6, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 4:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        r.a aVar13 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ5 = x2.z(aVar13, h4.d.a.f81538p, 2);
                                        boolean zR6 = mVar3.r(aVar7);
                                        Object objQ7 = mVar3.q();
                                        if (zR6) {
                                            objQ7 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar14 = (n11.a) obj5;
                                                    switch (i18) {
                                                        case 0:
                                                            aVar14.getClass();
                                                            Boolean boolB = aVar14.b();
                                                            p11.a aVar15 = aVar7;
                                                            aVar15.f134892a.q(boolB);
                                                            aVar15.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar14.getClass();
                                                            Boolean boolB2 = aVar14.b();
                                                            p11.a aVar16 = aVar7;
                                                            aVar16.f134892a.f(boolB2);
                                                            aVar16.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar14.getClass();
                                                            Boolean boolB3 = aVar14.b();
                                                            p11.a aVar17 = aVar7;
                                                            aVar17.f134892a.i(boolB3);
                                                            aVar17.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar14.getClass();
                                                            Boolean boolB4 = aVar14.b();
                                                            p11.a aVar18 = aVar7;
                                                            aVar18.f134892a.B(boolB4);
                                                            aVar18.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar14.getClass();
                                                            Boolean boolB5 = aVar14.b();
                                                            p11.a aVar19 = aVar7;
                                                            aVar19.f134892a.m(boolB5);
                                                            aVar19.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar14.getClass();
                                                            Boolean boolB6 = aVar14.b();
                                                            p11.a aVar110 = aVar7;
                                                            aVar110.f134892a.h(boolB6);
                                                            aVar110.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ7);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ7 == m.a.f135155b) {
                                                objQ7 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar14 = (n11.a) obj5;
                                                        switch (i18) {
                                                            case 0:
                                                                aVar14.getClass();
                                                                Boolean boolB = aVar14.b();
                                                                p11.a aVar15 = aVar7;
                                                                aVar15.f134892a.q(boolB);
                                                                aVar15.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar14.getClass();
                                                                Boolean boolB2 = aVar14.b();
                                                                p11.a aVar16 = aVar7;
                                                                aVar16.f134892a.f(boolB2);
                                                                aVar16.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar14.getClass();
                                                                Boolean boolB3 = aVar14.b();
                                                                p11.a aVar17 = aVar7;
                                                                aVar17.f134892a.i(boolB3);
                                                                aVar17.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar14.getClass();
                                                                Boolean boolB4 = aVar14.b();
                                                                p11.a aVar18 = aVar7;
                                                                aVar18.f134892a.B(boolB4);
                                                                aVar18.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar14.getClass();
                                                                Boolean boolB5 = aVar14.b();
                                                                p11.a aVar19 = aVar7;
                                                                aVar19.f134892a.m(boolB5);
                                                                aVar19.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar14.getClass();
                                                                Boolean boolB6 = aVar14.b();
                                                                p11.a aVar110 = aVar7;
                                                                aVar110.f134892a.h(boolB6);
                                                                aVar110.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        m11.a.a(rVarZ5, aVar8, (e23.l) objQ7, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        r.a aVar14 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ6 = x2.z(aVar14, h4.d.a.f81538p, 2);
                                        boolean zR7 = mVar3.r(aVar7);
                                        Object objQ8 = mVar3.q();
                                        if (zR7) {
                                            objQ8 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar15 = (n11.a) obj5;
                                                    switch (i19) {
                                                        case 0:
                                                            aVar15.getClass();
                                                            Boolean boolB = aVar15.b();
                                                            p11.a aVar16 = aVar7;
                                                            aVar16.f134892a.q(boolB);
                                                            aVar16.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar15.getClass();
                                                            Boolean boolB2 = aVar15.b();
                                                            p11.a aVar17 = aVar7;
                                                            aVar17.f134892a.f(boolB2);
                                                            aVar17.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar15.getClass();
                                                            Boolean boolB3 = aVar15.b();
                                                            p11.a aVar18 = aVar7;
                                                            aVar18.f134892a.i(boolB3);
                                                            aVar18.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar15.getClass();
                                                            Boolean boolB4 = aVar15.b();
                                                            p11.a aVar19 = aVar7;
                                                            aVar19.f134892a.B(boolB4);
                                                            aVar19.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar15.getClass();
                                                            Boolean boolB5 = aVar15.b();
                                                            p11.a aVar110 = aVar7;
                                                            aVar110.f134892a.m(boolB5);
                                                            aVar110.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar15.getClass();
                                                            Boolean boolB6 = aVar15.b();
                                                            p11.a aVar111 = aVar7;
                                                            aVar111.f134892a.h(boolB6);
                                                            aVar111.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ8);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ8 == m.a.f135155b) {
                                                objQ8 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar15 = (n11.a) obj5;
                                                        switch (i19) {
                                                            case 0:
                                                                aVar15.getClass();
                                                                Boolean boolB = aVar15.b();
                                                                p11.a aVar16 = aVar7;
                                                                aVar16.f134892a.q(boolB);
                                                                aVar16.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar15.getClass();
                                                                Boolean boolB2 = aVar15.b();
                                                                p11.a aVar17 = aVar7;
                                                                aVar17.f134892a.f(boolB2);
                                                                aVar17.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar15.getClass();
                                                                Boolean boolB3 = aVar15.b();
                                                                p11.a aVar18 = aVar7;
                                                                aVar18.f134892a.i(boolB3);
                                                                aVar18.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar15.getClass();
                                                                Boolean boolB4 = aVar15.b();
                                                                p11.a aVar19 = aVar7;
                                                                aVar19.f134892a.B(boolB4);
                                                                aVar19.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar15.getClass();
                                                                Boolean boolB5 = aVar15.b();
                                                                p11.a aVar110 = aVar7;
                                                                aVar110.f134892a.m(boolB5);
                                                                aVar110.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar15.getClass();
                                                                Boolean boolB6 = aVar15.b();
                                                                p11.a aVar111 = aVar7;
                                                                aVar111.f134892a.h(boolB6);
                                                                aVar111.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ8);
                                            }
                                        }
                                        m11.a.a(rVarZ6, aVar8, (e23.l) objQ8, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    Object objQ3 = mVar2.q();
                    final int i17 = 4;
                    if (objQ3 == c2565a) {
                        objQ3 = new nw1.e(4);
                        mVar2.K(objQ3);
                    }
                    p2Var.g(strQ5, null, null, null, eVarC3, false, false, (e23.a) objQ3, mVar2, 100687872, 238);
                    String strQ6 = gl1.y.Q(mVar2, R.string.did_see_pregnancy_in_progress_dialog);
                    final n11.a aVar6 = this.f128528f;
                    z3.e eVarC4 = f.c(-1500082116, new p() { // from class: o11.b
                        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
                        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int i18 = i16;
                            m.a aVar7 = m.f135153a;
                            final p11.a aVar8 = aVar2;
                            n11.a aVar9 = aVar6;
                            final int i19 = 2;
                            final int i110 = 1;
                            boolean z14 = false;
                            m mVar3 = (m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            switch (i18) {
                                case 0:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        r.a aVar10 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ = x2.z(aVar10, h4.d.a.f81538p, 2);
                                        boolean zR2 = mVar3.r(aVar8);
                                        Object objQ4 = mVar3.q();
                                        if (zR2) {
                                            final int i26 = 5;
                                            objQ4 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar15 = (n11.a) obj5;
                                                    switch (i26) {
                                                        case 0:
                                                            aVar15.getClass();
                                                            Boolean boolB = aVar15.b();
                                                            p11.a aVar16 = aVar8;
                                                            aVar16.f134892a.q(boolB);
                                                            aVar16.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar15.getClass();
                                                            Boolean boolB2 = aVar15.b();
                                                            p11.a aVar17 = aVar8;
                                                            aVar17.f134892a.f(boolB2);
                                                            aVar17.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar15.getClass();
                                                            Boolean boolB3 = aVar15.b();
                                                            p11.a aVar18 = aVar8;
                                                            aVar18.f134892a.i(boolB3);
                                                            aVar18.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar15.getClass();
                                                            Boolean boolB4 = aVar15.b();
                                                            p11.a aVar19 = aVar8;
                                                            aVar19.f134892a.B(boolB4);
                                                            aVar19.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar15.getClass();
                                                            Boolean boolB5 = aVar15.b();
                                                            p11.a aVar110 = aVar8;
                                                            aVar110.f134892a.m(boolB5);
                                                            aVar110.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar15.getClass();
                                                            Boolean boolB6 = aVar15.b();
                                                            p11.a aVar111 = aVar8;
                                                            aVar111.f134892a.h(boolB6);
                                                            aVar111.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ4);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                final int i27 = 5;
                                                objQ4 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar15 = (n11.a) obj5;
                                                        switch (i27) {
                                                            case 0:
                                                                aVar15.getClass();
                                                                Boolean boolB = aVar15.b();
                                                                p11.a aVar16 = aVar8;
                                                                aVar16.f134892a.q(boolB);
                                                                aVar16.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar15.getClass();
                                                                Boolean boolB2 = aVar15.b();
                                                                p11.a aVar17 = aVar8;
                                                                aVar17.f134892a.f(boolB2);
                                                                aVar17.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar15.getClass();
                                                                Boolean boolB3 = aVar15.b();
                                                                p11.a aVar18 = aVar8;
                                                                aVar18.f134892a.i(boolB3);
                                                                aVar18.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar15.getClass();
                                                                Boolean boolB4 = aVar15.b();
                                                                p11.a aVar19 = aVar8;
                                                                aVar19.f134892a.B(boolB4);
                                                                aVar19.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar15.getClass();
                                                                Boolean boolB5 = aVar15.b();
                                                                p11.a aVar110 = aVar8;
                                                                aVar110.f134892a.m(boolB5);
                                                                aVar110.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar15.getClass();
                                                                Boolean boolB6 = aVar15.b();
                                                                p11.a aVar111 = aVar8;
                                                                aVar111.f134892a.h(boolB6);
                                                                aVar111.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ4);
                                            }
                                        }
                                        m11.a.a(rVarZ, aVar9, (e23.l) objQ4, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r.a aVar11 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ2 = x2.z(aVar11, h4.d.a.f81538p, 2);
                                        boolean zR3 = mVar3.r(aVar8);
                                        Object objQ5 = mVar3.q();
                                        if (zR3) {
                                            final int i28 = 3;
                                            objQ5 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar15 = (n11.a) obj5;
                                                    switch (i28) {
                                                        case 0:
                                                            aVar15.getClass();
                                                            Boolean boolB = aVar15.b();
                                                            p11.a aVar16 = aVar8;
                                                            aVar16.f134892a.q(boolB);
                                                            aVar16.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar15.getClass();
                                                            Boolean boolB2 = aVar15.b();
                                                            p11.a aVar17 = aVar8;
                                                            aVar17.f134892a.f(boolB2);
                                                            aVar17.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar15.getClass();
                                                            Boolean boolB3 = aVar15.b();
                                                            p11.a aVar18 = aVar8;
                                                            aVar18.f134892a.i(boolB3);
                                                            aVar18.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar15.getClass();
                                                            Boolean boolB4 = aVar15.b();
                                                            p11.a aVar19 = aVar8;
                                                            aVar19.f134892a.B(boolB4);
                                                            aVar19.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar15.getClass();
                                                            Boolean boolB5 = aVar15.b();
                                                            p11.a aVar110 = aVar8;
                                                            aVar110.f134892a.m(boolB5);
                                                            aVar110.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar15.getClass();
                                                            Boolean boolB6 = aVar15.b();
                                                            p11.a aVar111 = aVar8;
                                                            aVar111.f134892a.h(boolB6);
                                                            aVar111.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ5);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                final int i29 = 3;
                                                objQ5 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar15 = (n11.a) obj5;
                                                        switch (i29) {
                                                            case 0:
                                                                aVar15.getClass();
                                                                Boolean boolB = aVar15.b();
                                                                p11.a aVar16 = aVar8;
                                                                aVar16.f134892a.q(boolB);
                                                                aVar16.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar15.getClass();
                                                                Boolean boolB2 = aVar15.b();
                                                                p11.a aVar17 = aVar8;
                                                                aVar17.f134892a.f(boolB2);
                                                                aVar17.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar15.getClass();
                                                                Boolean boolB3 = aVar15.b();
                                                                p11.a aVar18 = aVar8;
                                                                aVar18.f134892a.i(boolB3);
                                                                aVar18.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar15.getClass();
                                                                Boolean boolB4 = aVar15.b();
                                                                p11.a aVar19 = aVar8;
                                                                aVar19.f134892a.B(boolB4);
                                                                aVar19.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar15.getClass();
                                                                Boolean boolB5 = aVar15.b();
                                                                p11.a aVar110 = aVar8;
                                                                aVar110.f134892a.m(boolB5);
                                                                aVar110.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar15.getClass();
                                                                Boolean boolB6 = aVar15.b();
                                                                p11.a aVar111 = aVar8;
                                                                aVar111.f134892a.h(boolB6);
                                                                aVar111.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ5);
                                            }
                                        }
                                        m11.a.a(rVarZ2, aVar9, (e23.l) objQ5, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        r.a aVar12 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ3 = x2.z(aVar12, h4.d.a.f81538p, 2);
                                        boolean zR4 = mVar3.r(aVar8);
                                        Object objQ6 = mVar3.q();
                                        if (zR4) {
                                            final int i210 = 4;
                                            objQ6 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar15 = (n11.a) obj5;
                                                    switch (i210) {
                                                        case 0:
                                                            aVar15.getClass();
                                                            Boolean boolB = aVar15.b();
                                                            p11.a aVar16 = aVar8;
                                                            aVar16.f134892a.q(boolB);
                                                            aVar16.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar15.getClass();
                                                            Boolean boolB2 = aVar15.b();
                                                            p11.a aVar17 = aVar8;
                                                            aVar17.f134892a.f(boolB2);
                                                            aVar17.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar15.getClass();
                                                            Boolean boolB3 = aVar15.b();
                                                            p11.a aVar18 = aVar8;
                                                            aVar18.f134892a.i(boolB3);
                                                            aVar18.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar15.getClass();
                                                            Boolean boolB4 = aVar15.b();
                                                            p11.a aVar19 = aVar8;
                                                            aVar19.f134892a.B(boolB4);
                                                            aVar19.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar15.getClass();
                                                            Boolean boolB5 = aVar15.b();
                                                            p11.a aVar110 = aVar8;
                                                            aVar110.f134892a.m(boolB5);
                                                            aVar110.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar15.getClass();
                                                            Boolean boolB6 = aVar15.b();
                                                            p11.a aVar111 = aVar8;
                                                            aVar111.f134892a.h(boolB6);
                                                            aVar111.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ6);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                final int i211 = 4;
                                                objQ6 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar15 = (n11.a) obj5;
                                                        switch (i211) {
                                                            case 0:
                                                                aVar15.getClass();
                                                                Boolean boolB = aVar15.b();
                                                                p11.a aVar16 = aVar8;
                                                                aVar16.f134892a.q(boolB);
                                                                aVar16.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar15.getClass();
                                                                Boolean boolB2 = aVar15.b();
                                                                p11.a aVar17 = aVar8;
                                                                aVar17.f134892a.f(boolB2);
                                                                aVar17.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar15.getClass();
                                                                Boolean boolB3 = aVar15.b();
                                                                p11.a aVar18 = aVar8;
                                                                aVar18.f134892a.i(boolB3);
                                                                aVar18.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar15.getClass();
                                                                Boolean boolB4 = aVar15.b();
                                                                p11.a aVar19 = aVar8;
                                                                aVar19.f134892a.B(boolB4);
                                                                aVar19.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar15.getClass();
                                                                Boolean boolB5 = aVar15.b();
                                                                p11.a aVar110 = aVar8;
                                                                aVar110.f134892a.m(boolB5);
                                                                aVar110.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar15.getClass();
                                                                Boolean boolB6 = aVar15.b();
                                                                p11.a aVar111 = aVar8;
                                                                aVar111.f134892a.h(boolB6);
                                                                aVar111.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ6);
                                            }
                                        }
                                        m11.a.a(rVarZ3, aVar9, (e23.l) objQ6, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 3:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        r.a aVar13 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ4 = x2.z(aVar13, h4.d.a.f81538p, 2);
                                        boolean zR5 = mVar3.r(aVar8);
                                        Object objQ7 = mVar3.q();
                                        if (zR5) {
                                            final int i35 = z14 ? 1 : 0;
                                            objQ7 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar15 = (n11.a) obj5;
                                                    switch (i35) {
                                                        case 0:
                                                            aVar15.getClass();
                                                            Boolean boolB = aVar15.b();
                                                            p11.a aVar16 = aVar8;
                                                            aVar16.f134892a.q(boolB);
                                                            aVar16.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar15.getClass();
                                                            Boolean boolB2 = aVar15.b();
                                                            p11.a aVar17 = aVar8;
                                                            aVar17.f134892a.f(boolB2);
                                                            aVar17.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar15.getClass();
                                                            Boolean boolB3 = aVar15.b();
                                                            p11.a aVar18 = aVar8;
                                                            aVar18.f134892a.i(boolB3);
                                                            aVar18.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar15.getClass();
                                                            Boolean boolB4 = aVar15.b();
                                                            p11.a aVar19 = aVar8;
                                                            aVar19.f134892a.B(boolB4);
                                                            aVar19.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar15.getClass();
                                                            Boolean boolB5 = aVar15.b();
                                                            p11.a aVar110 = aVar8;
                                                            aVar110.f134892a.m(boolB5);
                                                            aVar110.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar15.getClass();
                                                            Boolean boolB6 = aVar15.b();
                                                            p11.a aVar111 = aVar8;
                                                            aVar111.f134892a.h(boolB6);
                                                            aVar111.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ7);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ7 == m.a.f135155b) {
                                                final int i36 = z14 ? 1 : 0;
                                                objQ7 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar15 = (n11.a) obj5;
                                                        switch (i36) {
                                                            case 0:
                                                                aVar15.getClass();
                                                                Boolean boolB = aVar15.b();
                                                                p11.a aVar16 = aVar8;
                                                                aVar16.f134892a.q(boolB);
                                                                aVar16.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar15.getClass();
                                                                Boolean boolB2 = aVar15.b();
                                                                p11.a aVar17 = aVar8;
                                                                aVar17.f134892a.f(boolB2);
                                                                aVar17.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar15.getClass();
                                                                Boolean boolB3 = aVar15.b();
                                                                p11.a aVar18 = aVar8;
                                                                aVar18.f134892a.i(boolB3);
                                                                aVar18.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar15.getClass();
                                                                Boolean boolB4 = aVar15.b();
                                                                p11.a aVar19 = aVar8;
                                                                aVar19.f134892a.B(boolB4);
                                                                aVar19.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar15.getClass();
                                                                Boolean boolB5 = aVar15.b();
                                                                p11.a aVar110 = aVar8;
                                                                aVar110.f134892a.m(boolB5);
                                                                aVar110.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar15.getClass();
                                                                Boolean boolB6 = aVar15.b();
                                                                p11.a aVar111 = aVar8;
                                                                aVar111.f134892a.h(boolB6);
                                                                aVar111.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        m11.a.a(rVarZ4, aVar9, (e23.l) objQ7, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 4:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        r.a aVar14 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ5 = x2.z(aVar14, h4.d.a.f81538p, 2);
                                        boolean zR6 = mVar3.r(aVar8);
                                        Object objQ8 = mVar3.q();
                                        if (zR6) {
                                            objQ8 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar15 = (n11.a) obj5;
                                                    switch (i19) {
                                                        case 0:
                                                            aVar15.getClass();
                                                            Boolean boolB = aVar15.b();
                                                            p11.a aVar16 = aVar8;
                                                            aVar16.f134892a.q(boolB);
                                                            aVar16.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar15.getClass();
                                                            Boolean boolB2 = aVar15.b();
                                                            p11.a aVar17 = aVar8;
                                                            aVar17.f134892a.f(boolB2);
                                                            aVar17.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar15.getClass();
                                                            Boolean boolB3 = aVar15.b();
                                                            p11.a aVar18 = aVar8;
                                                            aVar18.f134892a.i(boolB3);
                                                            aVar18.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar15.getClass();
                                                            Boolean boolB4 = aVar15.b();
                                                            p11.a aVar19 = aVar8;
                                                            aVar19.f134892a.B(boolB4);
                                                            aVar19.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar15.getClass();
                                                            Boolean boolB5 = aVar15.b();
                                                            p11.a aVar110 = aVar8;
                                                            aVar110.f134892a.m(boolB5);
                                                            aVar110.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar15.getClass();
                                                            Boolean boolB6 = aVar15.b();
                                                            p11.a aVar111 = aVar8;
                                                            aVar111.f134892a.h(boolB6);
                                                            aVar111.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ8);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ8 == m.a.f135155b) {
                                                objQ8 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar15 = (n11.a) obj5;
                                                        switch (i19) {
                                                            case 0:
                                                                aVar15.getClass();
                                                                Boolean boolB = aVar15.b();
                                                                p11.a aVar16 = aVar8;
                                                                aVar16.f134892a.q(boolB);
                                                                aVar16.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar15.getClass();
                                                                Boolean boolB2 = aVar15.b();
                                                                p11.a aVar17 = aVar8;
                                                                aVar17.f134892a.f(boolB2);
                                                                aVar17.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar15.getClass();
                                                                Boolean boolB3 = aVar15.b();
                                                                p11.a aVar18 = aVar8;
                                                                aVar18.f134892a.i(boolB3);
                                                                aVar18.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar15.getClass();
                                                                Boolean boolB4 = aVar15.b();
                                                                p11.a aVar19 = aVar8;
                                                                aVar19.f134892a.B(boolB4);
                                                                aVar19.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar15.getClass();
                                                                Boolean boolB5 = aVar15.b();
                                                                p11.a aVar110 = aVar8;
                                                                aVar110.f134892a.m(boolB5);
                                                                aVar110.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar15.getClass();
                                                                Boolean boolB6 = aVar15.b();
                                                                p11.a aVar111 = aVar8;
                                                                aVar111.f134892a.h(boolB6);
                                                                aVar111.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ8);
                                            }
                                        }
                                        m11.a.a(rVarZ5, aVar9, (e23.l) objQ8, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        r.a aVar15 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ6 = x2.z(aVar15, h4.d.a.f81538p, 2);
                                        boolean zR7 = mVar3.r(aVar8);
                                        Object objQ9 = mVar3.q();
                                        if (zR7) {
                                            objQ9 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar16 = (n11.a) obj5;
                                                    switch (i110) {
                                                        case 0:
                                                            aVar16.getClass();
                                                            Boolean boolB = aVar16.b();
                                                            p11.a aVar17 = aVar8;
                                                            aVar17.f134892a.q(boolB);
                                                            aVar17.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar16.getClass();
                                                            Boolean boolB2 = aVar16.b();
                                                            p11.a aVar18 = aVar8;
                                                            aVar18.f134892a.f(boolB2);
                                                            aVar18.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar16.getClass();
                                                            Boolean boolB3 = aVar16.b();
                                                            p11.a aVar19 = aVar8;
                                                            aVar19.f134892a.i(boolB3);
                                                            aVar19.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar16.getClass();
                                                            Boolean boolB4 = aVar16.b();
                                                            p11.a aVar110 = aVar8;
                                                            aVar110.f134892a.B(boolB4);
                                                            aVar110.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar16.getClass();
                                                            Boolean boolB5 = aVar16.b();
                                                            p11.a aVar111 = aVar8;
                                                            aVar111.f134892a.m(boolB5);
                                                            aVar111.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar16.getClass();
                                                            Boolean boolB6 = aVar16.b();
                                                            p11.a aVar112 = aVar8;
                                                            aVar112.f134892a.h(boolB6);
                                                            aVar112.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ9);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ9 == m.a.f135155b) {
                                                objQ9 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar16 = (n11.a) obj5;
                                                        switch (i110) {
                                                            case 0:
                                                                aVar16.getClass();
                                                                Boolean boolB = aVar16.b();
                                                                p11.a aVar17 = aVar8;
                                                                aVar17.f134892a.q(boolB);
                                                                aVar17.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar16.getClass();
                                                                Boolean boolB2 = aVar16.b();
                                                                p11.a aVar18 = aVar8;
                                                                aVar18.f134892a.f(boolB2);
                                                                aVar18.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar16.getClass();
                                                                Boolean boolB3 = aVar16.b();
                                                                p11.a aVar19 = aVar8;
                                                                aVar19.f134892a.i(boolB3);
                                                                aVar19.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar16.getClass();
                                                                Boolean boolB4 = aVar16.b();
                                                                p11.a aVar110 = aVar8;
                                                                aVar110.f134892a.B(boolB4);
                                                                aVar110.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar16.getClass();
                                                                Boolean boolB5 = aVar16.b();
                                                                p11.a aVar111 = aVar8;
                                                                aVar111.f134892a.m(boolB5);
                                                                aVar111.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar16.getClass();
                                                                Boolean boolB6 = aVar16.b();
                                                                p11.a aVar112 = aVar8;
                                                                aVar112.f134892a.h(boolB6);
                                                                aVar112.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ9);
                                            }
                                        }
                                        m11.a.a(rVarZ6, aVar9, (e23.l) objQ9, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    Object objQ4 = mVar2.q();
                    final int i18 = 5;
                    if (objQ4 == c2565a) {
                        objQ4 = new nw1.e(5);
                        mVar2.K(objQ4);
                    }
                    p2Var.g(strQ6, null, null, null, eVarC4, false, false, (e23.a) objQ4, mVar2, 100687872, 238);
                    String strQ7 = gl1.y.Q(mVar2, R.string.show_post_pregnancy_dialog);
                    final n11.a aVar7 = this.f128529g;
                    final int i19 = 3;
                    z3.e eVarC5 = f.c(-1898794883, new p() { // from class: o11.b
                        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
                        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int i110 = i19;
                            m.a aVar8 = m.f135153a;
                            final p11.a aVar9 = aVar2;
                            n11.a aVar10 = aVar7;
                            final int i111 = 2;
                            final int i112 = 1;
                            boolean z14 = false;
                            m mVar3 = (m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            switch (i110) {
                                case 0:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        r.a aVar11 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ = x2.z(aVar11, h4.d.a.f81538p, 2);
                                        boolean zR2 = mVar3.r(aVar9);
                                        Object objQ5 = mVar3.q();
                                        if (zR2) {
                                            final int i27 = 5;
                                            objQ5 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar16 = (n11.a) obj5;
                                                    switch (i27) {
                                                        case 0:
                                                            aVar16.getClass();
                                                            Boolean boolB = aVar16.b();
                                                            p11.a aVar17 = aVar9;
                                                            aVar17.f134892a.q(boolB);
                                                            aVar17.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar16.getClass();
                                                            Boolean boolB2 = aVar16.b();
                                                            p11.a aVar18 = aVar9;
                                                            aVar18.f134892a.f(boolB2);
                                                            aVar18.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar16.getClass();
                                                            Boolean boolB3 = aVar16.b();
                                                            p11.a aVar19 = aVar9;
                                                            aVar19.f134892a.i(boolB3);
                                                            aVar19.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar16.getClass();
                                                            Boolean boolB4 = aVar16.b();
                                                            p11.a aVar110 = aVar9;
                                                            aVar110.f134892a.B(boolB4);
                                                            aVar110.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar16.getClass();
                                                            Boolean boolB5 = aVar16.b();
                                                            p11.a aVar111 = aVar9;
                                                            aVar111.f134892a.m(boolB5);
                                                            aVar111.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar16.getClass();
                                                            Boolean boolB6 = aVar16.b();
                                                            p11.a aVar112 = aVar9;
                                                            aVar112.f134892a.h(boolB6);
                                                            aVar112.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ5);
                                        } else {
                                            aVar8.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                final int i28 = 5;
                                                objQ5 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar16 = (n11.a) obj5;
                                                        switch (i28) {
                                                            case 0:
                                                                aVar16.getClass();
                                                                Boolean boolB = aVar16.b();
                                                                p11.a aVar17 = aVar9;
                                                                aVar17.f134892a.q(boolB);
                                                                aVar17.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar16.getClass();
                                                                Boolean boolB2 = aVar16.b();
                                                                p11.a aVar18 = aVar9;
                                                                aVar18.f134892a.f(boolB2);
                                                                aVar18.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar16.getClass();
                                                                Boolean boolB3 = aVar16.b();
                                                                p11.a aVar19 = aVar9;
                                                                aVar19.f134892a.i(boolB3);
                                                                aVar19.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar16.getClass();
                                                                Boolean boolB4 = aVar16.b();
                                                                p11.a aVar110 = aVar9;
                                                                aVar110.f134892a.B(boolB4);
                                                                aVar110.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar16.getClass();
                                                                Boolean boolB5 = aVar16.b();
                                                                p11.a aVar111 = aVar9;
                                                                aVar111.f134892a.m(boolB5);
                                                                aVar111.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar16.getClass();
                                                                Boolean boolB6 = aVar16.b();
                                                                p11.a aVar112 = aVar9;
                                                                aVar112.f134892a.h(boolB6);
                                                                aVar112.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ5);
                                            }
                                        }
                                        m11.a.a(rVarZ, aVar10, (e23.l) objQ5, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r.a aVar12 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ2 = x2.z(aVar12, h4.d.a.f81538p, 2);
                                        boolean zR3 = mVar3.r(aVar9);
                                        Object objQ6 = mVar3.q();
                                        if (zR3) {
                                            final int i29 = 3;
                                            objQ6 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar16 = (n11.a) obj5;
                                                    switch (i29) {
                                                        case 0:
                                                            aVar16.getClass();
                                                            Boolean boolB = aVar16.b();
                                                            p11.a aVar17 = aVar9;
                                                            aVar17.f134892a.q(boolB);
                                                            aVar17.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar16.getClass();
                                                            Boolean boolB2 = aVar16.b();
                                                            p11.a aVar18 = aVar9;
                                                            aVar18.f134892a.f(boolB2);
                                                            aVar18.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar16.getClass();
                                                            Boolean boolB3 = aVar16.b();
                                                            p11.a aVar19 = aVar9;
                                                            aVar19.f134892a.i(boolB3);
                                                            aVar19.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar16.getClass();
                                                            Boolean boolB4 = aVar16.b();
                                                            p11.a aVar110 = aVar9;
                                                            aVar110.f134892a.B(boolB4);
                                                            aVar110.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar16.getClass();
                                                            Boolean boolB5 = aVar16.b();
                                                            p11.a aVar111 = aVar9;
                                                            aVar111.f134892a.m(boolB5);
                                                            aVar111.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar16.getClass();
                                                            Boolean boolB6 = aVar16.b();
                                                            p11.a aVar112 = aVar9;
                                                            aVar112.f134892a.h(boolB6);
                                                            aVar112.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ6);
                                        } else {
                                            aVar8.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                final int i210 = 3;
                                                objQ6 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar16 = (n11.a) obj5;
                                                        switch (i210) {
                                                            case 0:
                                                                aVar16.getClass();
                                                                Boolean boolB = aVar16.b();
                                                                p11.a aVar17 = aVar9;
                                                                aVar17.f134892a.q(boolB);
                                                                aVar17.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar16.getClass();
                                                                Boolean boolB2 = aVar16.b();
                                                                p11.a aVar18 = aVar9;
                                                                aVar18.f134892a.f(boolB2);
                                                                aVar18.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar16.getClass();
                                                                Boolean boolB3 = aVar16.b();
                                                                p11.a aVar19 = aVar9;
                                                                aVar19.f134892a.i(boolB3);
                                                                aVar19.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar16.getClass();
                                                                Boolean boolB4 = aVar16.b();
                                                                p11.a aVar110 = aVar9;
                                                                aVar110.f134892a.B(boolB4);
                                                                aVar110.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar16.getClass();
                                                                Boolean boolB5 = aVar16.b();
                                                                p11.a aVar111 = aVar9;
                                                                aVar111.f134892a.m(boolB5);
                                                                aVar111.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar16.getClass();
                                                                Boolean boolB6 = aVar16.b();
                                                                p11.a aVar112 = aVar9;
                                                                aVar112.f134892a.h(boolB6);
                                                                aVar112.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ6);
                                            }
                                        }
                                        m11.a.a(rVarZ2, aVar10, (e23.l) objQ6, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        r.a aVar13 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ3 = x2.z(aVar13, h4.d.a.f81538p, 2);
                                        boolean zR4 = mVar3.r(aVar9);
                                        Object objQ7 = mVar3.q();
                                        if (zR4) {
                                            final int i211 = 4;
                                            objQ7 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar16 = (n11.a) obj5;
                                                    switch (i211) {
                                                        case 0:
                                                            aVar16.getClass();
                                                            Boolean boolB = aVar16.b();
                                                            p11.a aVar17 = aVar9;
                                                            aVar17.f134892a.q(boolB);
                                                            aVar17.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar16.getClass();
                                                            Boolean boolB2 = aVar16.b();
                                                            p11.a aVar18 = aVar9;
                                                            aVar18.f134892a.f(boolB2);
                                                            aVar18.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar16.getClass();
                                                            Boolean boolB3 = aVar16.b();
                                                            p11.a aVar19 = aVar9;
                                                            aVar19.f134892a.i(boolB3);
                                                            aVar19.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar16.getClass();
                                                            Boolean boolB4 = aVar16.b();
                                                            p11.a aVar110 = aVar9;
                                                            aVar110.f134892a.B(boolB4);
                                                            aVar110.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar16.getClass();
                                                            Boolean boolB5 = aVar16.b();
                                                            p11.a aVar111 = aVar9;
                                                            aVar111.f134892a.m(boolB5);
                                                            aVar111.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar16.getClass();
                                                            Boolean boolB6 = aVar16.b();
                                                            p11.a aVar112 = aVar9;
                                                            aVar112.f134892a.h(boolB6);
                                                            aVar112.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ7);
                                        } else {
                                            aVar8.getClass();
                                            if (objQ7 == m.a.f135155b) {
                                                final int i212 = 4;
                                                objQ7 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar16 = (n11.a) obj5;
                                                        switch (i212) {
                                                            case 0:
                                                                aVar16.getClass();
                                                                Boolean boolB = aVar16.b();
                                                                p11.a aVar17 = aVar9;
                                                                aVar17.f134892a.q(boolB);
                                                                aVar17.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar16.getClass();
                                                                Boolean boolB2 = aVar16.b();
                                                                p11.a aVar18 = aVar9;
                                                                aVar18.f134892a.f(boolB2);
                                                                aVar18.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar16.getClass();
                                                                Boolean boolB3 = aVar16.b();
                                                                p11.a aVar19 = aVar9;
                                                                aVar19.f134892a.i(boolB3);
                                                                aVar19.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar16.getClass();
                                                                Boolean boolB4 = aVar16.b();
                                                                p11.a aVar110 = aVar9;
                                                                aVar110.f134892a.B(boolB4);
                                                                aVar110.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar16.getClass();
                                                                Boolean boolB5 = aVar16.b();
                                                                p11.a aVar111 = aVar9;
                                                                aVar111.f134892a.m(boolB5);
                                                                aVar111.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar16.getClass();
                                                                Boolean boolB6 = aVar16.b();
                                                                p11.a aVar112 = aVar9;
                                                                aVar112.f134892a.h(boolB6);
                                                                aVar112.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        m11.a.a(rVarZ3, aVar10, (e23.l) objQ7, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 3:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        r.a aVar14 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ4 = x2.z(aVar14, h4.d.a.f81538p, 2);
                                        boolean zR5 = mVar3.r(aVar9);
                                        Object objQ8 = mVar3.q();
                                        if (zR5) {
                                            final int i36 = z14 ? 1 : 0;
                                            objQ8 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar16 = (n11.a) obj5;
                                                    switch (i36) {
                                                        case 0:
                                                            aVar16.getClass();
                                                            Boolean boolB = aVar16.b();
                                                            p11.a aVar17 = aVar9;
                                                            aVar17.f134892a.q(boolB);
                                                            aVar17.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar16.getClass();
                                                            Boolean boolB2 = aVar16.b();
                                                            p11.a aVar18 = aVar9;
                                                            aVar18.f134892a.f(boolB2);
                                                            aVar18.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar16.getClass();
                                                            Boolean boolB3 = aVar16.b();
                                                            p11.a aVar19 = aVar9;
                                                            aVar19.f134892a.i(boolB3);
                                                            aVar19.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar16.getClass();
                                                            Boolean boolB4 = aVar16.b();
                                                            p11.a aVar110 = aVar9;
                                                            aVar110.f134892a.B(boolB4);
                                                            aVar110.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar16.getClass();
                                                            Boolean boolB5 = aVar16.b();
                                                            p11.a aVar111 = aVar9;
                                                            aVar111.f134892a.m(boolB5);
                                                            aVar111.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar16.getClass();
                                                            Boolean boolB6 = aVar16.b();
                                                            p11.a aVar112 = aVar9;
                                                            aVar112.f134892a.h(boolB6);
                                                            aVar112.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ8);
                                        } else {
                                            aVar8.getClass();
                                            if (objQ8 == m.a.f135155b) {
                                                final int i37 = z14 ? 1 : 0;
                                                objQ8 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar16 = (n11.a) obj5;
                                                        switch (i37) {
                                                            case 0:
                                                                aVar16.getClass();
                                                                Boolean boolB = aVar16.b();
                                                                p11.a aVar17 = aVar9;
                                                                aVar17.f134892a.q(boolB);
                                                                aVar17.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar16.getClass();
                                                                Boolean boolB2 = aVar16.b();
                                                                p11.a aVar18 = aVar9;
                                                                aVar18.f134892a.f(boolB2);
                                                                aVar18.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar16.getClass();
                                                                Boolean boolB3 = aVar16.b();
                                                                p11.a aVar19 = aVar9;
                                                                aVar19.f134892a.i(boolB3);
                                                                aVar19.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar16.getClass();
                                                                Boolean boolB4 = aVar16.b();
                                                                p11.a aVar110 = aVar9;
                                                                aVar110.f134892a.B(boolB4);
                                                                aVar110.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar16.getClass();
                                                                Boolean boolB5 = aVar16.b();
                                                                p11.a aVar111 = aVar9;
                                                                aVar111.f134892a.m(boolB5);
                                                                aVar111.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar16.getClass();
                                                                Boolean boolB6 = aVar16.b();
                                                                p11.a aVar112 = aVar9;
                                                                aVar112.f134892a.h(boolB6);
                                                                aVar112.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ8);
                                            }
                                        }
                                        m11.a.a(rVarZ4, aVar10, (e23.l) objQ8, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 4:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        r.a aVar15 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ5 = x2.z(aVar15, h4.d.a.f81538p, 2);
                                        boolean zR6 = mVar3.r(aVar9);
                                        Object objQ9 = mVar3.q();
                                        if (zR6) {
                                            objQ9 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar16 = (n11.a) obj5;
                                                    switch (i111) {
                                                        case 0:
                                                            aVar16.getClass();
                                                            Boolean boolB = aVar16.b();
                                                            p11.a aVar17 = aVar9;
                                                            aVar17.f134892a.q(boolB);
                                                            aVar17.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar16.getClass();
                                                            Boolean boolB2 = aVar16.b();
                                                            p11.a aVar18 = aVar9;
                                                            aVar18.f134892a.f(boolB2);
                                                            aVar18.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar16.getClass();
                                                            Boolean boolB3 = aVar16.b();
                                                            p11.a aVar19 = aVar9;
                                                            aVar19.f134892a.i(boolB3);
                                                            aVar19.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar16.getClass();
                                                            Boolean boolB4 = aVar16.b();
                                                            p11.a aVar110 = aVar9;
                                                            aVar110.f134892a.B(boolB4);
                                                            aVar110.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar16.getClass();
                                                            Boolean boolB5 = aVar16.b();
                                                            p11.a aVar111 = aVar9;
                                                            aVar111.f134892a.m(boolB5);
                                                            aVar111.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar16.getClass();
                                                            Boolean boolB6 = aVar16.b();
                                                            p11.a aVar112 = aVar9;
                                                            aVar112.f134892a.h(boolB6);
                                                            aVar112.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ9);
                                        } else {
                                            aVar8.getClass();
                                            if (objQ9 == m.a.f135155b) {
                                                objQ9 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar16 = (n11.a) obj5;
                                                        switch (i111) {
                                                            case 0:
                                                                aVar16.getClass();
                                                                Boolean boolB = aVar16.b();
                                                                p11.a aVar17 = aVar9;
                                                                aVar17.f134892a.q(boolB);
                                                                aVar17.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar16.getClass();
                                                                Boolean boolB2 = aVar16.b();
                                                                p11.a aVar18 = aVar9;
                                                                aVar18.f134892a.f(boolB2);
                                                                aVar18.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar16.getClass();
                                                                Boolean boolB3 = aVar16.b();
                                                                p11.a aVar19 = aVar9;
                                                                aVar19.f134892a.i(boolB3);
                                                                aVar19.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar16.getClass();
                                                                Boolean boolB4 = aVar16.b();
                                                                p11.a aVar110 = aVar9;
                                                                aVar110.f134892a.B(boolB4);
                                                                aVar110.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar16.getClass();
                                                                Boolean boolB5 = aVar16.b();
                                                                p11.a aVar111 = aVar9;
                                                                aVar111.f134892a.m(boolB5);
                                                                aVar111.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar16.getClass();
                                                                Boolean boolB6 = aVar16.b();
                                                                p11.a aVar112 = aVar9;
                                                                aVar112.f134892a.h(boolB6);
                                                                aVar112.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ9);
                                            }
                                        }
                                        m11.a.a(rVarZ5, aVar10, (e23.l) objQ9, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        r.a aVar16 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ6 = x2.z(aVar16, h4.d.a.f81538p, 2);
                                        boolean zR7 = mVar3.r(aVar9);
                                        Object objQ10 = mVar3.q();
                                        if (zR7) {
                                            objQ10 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar17 = (n11.a) obj5;
                                                    switch (i112) {
                                                        case 0:
                                                            aVar17.getClass();
                                                            Boolean boolB = aVar17.b();
                                                            p11.a aVar18 = aVar9;
                                                            aVar18.f134892a.q(boolB);
                                                            aVar18.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar17.getClass();
                                                            Boolean boolB2 = aVar17.b();
                                                            p11.a aVar19 = aVar9;
                                                            aVar19.f134892a.f(boolB2);
                                                            aVar19.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar17.getClass();
                                                            Boolean boolB3 = aVar17.b();
                                                            p11.a aVar110 = aVar9;
                                                            aVar110.f134892a.i(boolB3);
                                                            aVar110.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar17.getClass();
                                                            Boolean boolB4 = aVar17.b();
                                                            p11.a aVar111 = aVar9;
                                                            aVar111.f134892a.B(boolB4);
                                                            aVar111.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar17.getClass();
                                                            Boolean boolB5 = aVar17.b();
                                                            p11.a aVar112 = aVar9;
                                                            aVar112.f134892a.m(boolB5);
                                                            aVar112.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar17.getClass();
                                                            Boolean boolB6 = aVar17.b();
                                                            p11.a aVar113 = aVar9;
                                                            aVar113.f134892a.h(boolB6);
                                                            aVar113.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ10);
                                        } else {
                                            aVar8.getClass();
                                            if (objQ10 == m.a.f135155b) {
                                                objQ10 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar17 = (n11.a) obj5;
                                                        switch (i112) {
                                                            case 0:
                                                                aVar17.getClass();
                                                                Boolean boolB = aVar17.b();
                                                                p11.a aVar18 = aVar9;
                                                                aVar18.f134892a.q(boolB);
                                                                aVar18.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar17.getClass();
                                                                Boolean boolB2 = aVar17.b();
                                                                p11.a aVar19 = aVar9;
                                                                aVar19.f134892a.f(boolB2);
                                                                aVar19.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar17.getClass();
                                                                Boolean boolB3 = aVar17.b();
                                                                p11.a aVar110 = aVar9;
                                                                aVar110.f134892a.i(boolB3);
                                                                aVar110.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar17.getClass();
                                                                Boolean boolB4 = aVar17.b();
                                                                p11.a aVar111 = aVar9;
                                                                aVar111.f134892a.B(boolB4);
                                                                aVar111.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar17.getClass();
                                                                Boolean boolB5 = aVar17.b();
                                                                p11.a aVar112 = aVar9;
                                                                aVar112.f134892a.m(boolB5);
                                                                aVar112.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar17.getClass();
                                                                Boolean boolB6 = aVar17.b();
                                                                p11.a aVar113 = aVar9;
                                                                aVar113.f134892a.h(boolB6);
                                                                aVar113.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ10);
                                            }
                                        }
                                        m11.a.a(rVarZ6, aVar10, (e23.l) objQ10, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    Object objQ5 = mVar2.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new nw1.e(6);
                        mVar2.K(objQ5);
                    }
                    p2Var.g(strQ7, null, null, null, eVarC5, false, false, (e23.a) objQ5, mVar2, 100687872, 238);
                    String strQ8 = gl1.y.Q(mVar2, R.string.nutrition_2_developer_options);
                    final n11.a aVar8 = this.f128530h;
                    z3.e eVarC6 = f.c(1997459646, new p() { // from class: o11.b
                        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
                        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int i110 = i17;
                            m.a aVar9 = m.f135153a;
                            final p11.a aVar10 = aVar2;
                            n11.a aVar11 = aVar8;
                            final int i111 = 2;
                            final int i112 = 1;
                            boolean z14 = false;
                            m mVar3 = (m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            switch (i110) {
                                case 0:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        r.a aVar12 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ = x2.z(aVar12, h4.d.a.f81538p, 2);
                                        boolean zR2 = mVar3.r(aVar10);
                                        Object objQ6 = mVar3.q();
                                        if (zR2) {
                                            final int i28 = 5;
                                            objQ6 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar17 = (n11.a) obj5;
                                                    switch (i28) {
                                                        case 0:
                                                            aVar17.getClass();
                                                            Boolean boolB = aVar17.b();
                                                            p11.a aVar18 = aVar10;
                                                            aVar18.f134892a.q(boolB);
                                                            aVar18.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar17.getClass();
                                                            Boolean boolB2 = aVar17.b();
                                                            p11.a aVar19 = aVar10;
                                                            aVar19.f134892a.f(boolB2);
                                                            aVar19.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar17.getClass();
                                                            Boolean boolB3 = aVar17.b();
                                                            p11.a aVar110 = aVar10;
                                                            aVar110.f134892a.i(boolB3);
                                                            aVar110.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar17.getClass();
                                                            Boolean boolB4 = aVar17.b();
                                                            p11.a aVar111 = aVar10;
                                                            aVar111.f134892a.B(boolB4);
                                                            aVar111.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar17.getClass();
                                                            Boolean boolB5 = aVar17.b();
                                                            p11.a aVar112 = aVar10;
                                                            aVar112.f134892a.m(boolB5);
                                                            aVar112.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar17.getClass();
                                                            Boolean boolB6 = aVar17.b();
                                                            p11.a aVar113 = aVar10;
                                                            aVar113.f134892a.h(boolB6);
                                                            aVar113.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ6);
                                        } else {
                                            aVar9.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                final int i29 = 5;
                                                objQ6 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar17 = (n11.a) obj5;
                                                        switch (i29) {
                                                            case 0:
                                                                aVar17.getClass();
                                                                Boolean boolB = aVar17.b();
                                                                p11.a aVar18 = aVar10;
                                                                aVar18.f134892a.q(boolB);
                                                                aVar18.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar17.getClass();
                                                                Boolean boolB2 = aVar17.b();
                                                                p11.a aVar19 = aVar10;
                                                                aVar19.f134892a.f(boolB2);
                                                                aVar19.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar17.getClass();
                                                                Boolean boolB3 = aVar17.b();
                                                                p11.a aVar110 = aVar10;
                                                                aVar110.f134892a.i(boolB3);
                                                                aVar110.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar17.getClass();
                                                                Boolean boolB4 = aVar17.b();
                                                                p11.a aVar111 = aVar10;
                                                                aVar111.f134892a.B(boolB4);
                                                                aVar111.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar17.getClass();
                                                                Boolean boolB5 = aVar17.b();
                                                                p11.a aVar112 = aVar10;
                                                                aVar112.f134892a.m(boolB5);
                                                                aVar112.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar17.getClass();
                                                                Boolean boolB6 = aVar17.b();
                                                                p11.a aVar113 = aVar10;
                                                                aVar113.f134892a.h(boolB6);
                                                                aVar113.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ6);
                                            }
                                        }
                                        m11.a.a(rVarZ, aVar11, (e23.l) objQ6, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r.a aVar13 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ2 = x2.z(aVar13, h4.d.a.f81538p, 2);
                                        boolean zR3 = mVar3.r(aVar10);
                                        Object objQ7 = mVar3.q();
                                        if (zR3) {
                                            final int i210 = 3;
                                            objQ7 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar17 = (n11.a) obj5;
                                                    switch (i210) {
                                                        case 0:
                                                            aVar17.getClass();
                                                            Boolean boolB = aVar17.b();
                                                            p11.a aVar18 = aVar10;
                                                            aVar18.f134892a.q(boolB);
                                                            aVar18.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar17.getClass();
                                                            Boolean boolB2 = aVar17.b();
                                                            p11.a aVar19 = aVar10;
                                                            aVar19.f134892a.f(boolB2);
                                                            aVar19.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar17.getClass();
                                                            Boolean boolB3 = aVar17.b();
                                                            p11.a aVar110 = aVar10;
                                                            aVar110.f134892a.i(boolB3);
                                                            aVar110.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar17.getClass();
                                                            Boolean boolB4 = aVar17.b();
                                                            p11.a aVar111 = aVar10;
                                                            aVar111.f134892a.B(boolB4);
                                                            aVar111.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar17.getClass();
                                                            Boolean boolB5 = aVar17.b();
                                                            p11.a aVar112 = aVar10;
                                                            aVar112.f134892a.m(boolB5);
                                                            aVar112.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar17.getClass();
                                                            Boolean boolB6 = aVar17.b();
                                                            p11.a aVar113 = aVar10;
                                                            aVar113.f134892a.h(boolB6);
                                                            aVar113.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ7);
                                        } else {
                                            aVar9.getClass();
                                            if (objQ7 == m.a.f135155b) {
                                                final int i211 = 3;
                                                objQ7 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar17 = (n11.a) obj5;
                                                        switch (i211) {
                                                            case 0:
                                                                aVar17.getClass();
                                                                Boolean boolB = aVar17.b();
                                                                p11.a aVar18 = aVar10;
                                                                aVar18.f134892a.q(boolB);
                                                                aVar18.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar17.getClass();
                                                                Boolean boolB2 = aVar17.b();
                                                                p11.a aVar19 = aVar10;
                                                                aVar19.f134892a.f(boolB2);
                                                                aVar19.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar17.getClass();
                                                                Boolean boolB3 = aVar17.b();
                                                                p11.a aVar110 = aVar10;
                                                                aVar110.f134892a.i(boolB3);
                                                                aVar110.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar17.getClass();
                                                                Boolean boolB4 = aVar17.b();
                                                                p11.a aVar111 = aVar10;
                                                                aVar111.f134892a.B(boolB4);
                                                                aVar111.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar17.getClass();
                                                                Boolean boolB5 = aVar17.b();
                                                                p11.a aVar112 = aVar10;
                                                                aVar112.f134892a.m(boolB5);
                                                                aVar112.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar17.getClass();
                                                                Boolean boolB6 = aVar17.b();
                                                                p11.a aVar113 = aVar10;
                                                                aVar113.f134892a.h(boolB6);
                                                                aVar113.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        m11.a.a(rVarZ2, aVar11, (e23.l) objQ7, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        r.a aVar14 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ3 = x2.z(aVar14, h4.d.a.f81538p, 2);
                                        boolean zR4 = mVar3.r(aVar10);
                                        Object objQ8 = mVar3.q();
                                        if (zR4) {
                                            final int i212 = 4;
                                            objQ8 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar17 = (n11.a) obj5;
                                                    switch (i212) {
                                                        case 0:
                                                            aVar17.getClass();
                                                            Boolean boolB = aVar17.b();
                                                            p11.a aVar18 = aVar10;
                                                            aVar18.f134892a.q(boolB);
                                                            aVar18.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar17.getClass();
                                                            Boolean boolB2 = aVar17.b();
                                                            p11.a aVar19 = aVar10;
                                                            aVar19.f134892a.f(boolB2);
                                                            aVar19.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar17.getClass();
                                                            Boolean boolB3 = aVar17.b();
                                                            p11.a aVar110 = aVar10;
                                                            aVar110.f134892a.i(boolB3);
                                                            aVar110.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar17.getClass();
                                                            Boolean boolB4 = aVar17.b();
                                                            p11.a aVar111 = aVar10;
                                                            aVar111.f134892a.B(boolB4);
                                                            aVar111.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar17.getClass();
                                                            Boolean boolB5 = aVar17.b();
                                                            p11.a aVar112 = aVar10;
                                                            aVar112.f134892a.m(boolB5);
                                                            aVar112.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar17.getClass();
                                                            Boolean boolB6 = aVar17.b();
                                                            p11.a aVar113 = aVar10;
                                                            aVar113.f134892a.h(boolB6);
                                                            aVar113.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ8);
                                        } else {
                                            aVar9.getClass();
                                            if (objQ8 == m.a.f135155b) {
                                                final int i213 = 4;
                                                objQ8 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar17 = (n11.a) obj5;
                                                        switch (i213) {
                                                            case 0:
                                                                aVar17.getClass();
                                                                Boolean boolB = aVar17.b();
                                                                p11.a aVar18 = aVar10;
                                                                aVar18.f134892a.q(boolB);
                                                                aVar18.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar17.getClass();
                                                                Boolean boolB2 = aVar17.b();
                                                                p11.a aVar19 = aVar10;
                                                                aVar19.f134892a.f(boolB2);
                                                                aVar19.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar17.getClass();
                                                                Boolean boolB3 = aVar17.b();
                                                                p11.a aVar110 = aVar10;
                                                                aVar110.f134892a.i(boolB3);
                                                                aVar110.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar17.getClass();
                                                                Boolean boolB4 = aVar17.b();
                                                                p11.a aVar111 = aVar10;
                                                                aVar111.f134892a.B(boolB4);
                                                                aVar111.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar17.getClass();
                                                                Boolean boolB5 = aVar17.b();
                                                                p11.a aVar112 = aVar10;
                                                                aVar112.f134892a.m(boolB5);
                                                                aVar112.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar17.getClass();
                                                                Boolean boolB6 = aVar17.b();
                                                                p11.a aVar113 = aVar10;
                                                                aVar113.f134892a.h(boolB6);
                                                                aVar113.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ8);
                                            }
                                        }
                                        m11.a.a(rVarZ3, aVar11, (e23.l) objQ8, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 3:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        r.a aVar15 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ4 = x2.z(aVar15, h4.d.a.f81538p, 2);
                                        boolean zR5 = mVar3.r(aVar10);
                                        Object objQ9 = mVar3.q();
                                        if (zR5) {
                                            final int i37 = z14 ? 1 : 0;
                                            objQ9 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar17 = (n11.a) obj5;
                                                    switch (i37) {
                                                        case 0:
                                                            aVar17.getClass();
                                                            Boolean boolB = aVar17.b();
                                                            p11.a aVar18 = aVar10;
                                                            aVar18.f134892a.q(boolB);
                                                            aVar18.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar17.getClass();
                                                            Boolean boolB2 = aVar17.b();
                                                            p11.a aVar19 = aVar10;
                                                            aVar19.f134892a.f(boolB2);
                                                            aVar19.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar17.getClass();
                                                            Boolean boolB3 = aVar17.b();
                                                            p11.a aVar110 = aVar10;
                                                            aVar110.f134892a.i(boolB3);
                                                            aVar110.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar17.getClass();
                                                            Boolean boolB4 = aVar17.b();
                                                            p11.a aVar111 = aVar10;
                                                            aVar111.f134892a.B(boolB4);
                                                            aVar111.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar17.getClass();
                                                            Boolean boolB5 = aVar17.b();
                                                            p11.a aVar112 = aVar10;
                                                            aVar112.f134892a.m(boolB5);
                                                            aVar112.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar17.getClass();
                                                            Boolean boolB6 = aVar17.b();
                                                            p11.a aVar113 = aVar10;
                                                            aVar113.f134892a.h(boolB6);
                                                            aVar113.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ9);
                                        } else {
                                            aVar9.getClass();
                                            if (objQ9 == m.a.f135155b) {
                                                final int i38 = z14 ? 1 : 0;
                                                objQ9 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar17 = (n11.a) obj5;
                                                        switch (i38) {
                                                            case 0:
                                                                aVar17.getClass();
                                                                Boolean boolB = aVar17.b();
                                                                p11.a aVar18 = aVar10;
                                                                aVar18.f134892a.q(boolB);
                                                                aVar18.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar17.getClass();
                                                                Boolean boolB2 = aVar17.b();
                                                                p11.a aVar19 = aVar10;
                                                                aVar19.f134892a.f(boolB2);
                                                                aVar19.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar17.getClass();
                                                                Boolean boolB3 = aVar17.b();
                                                                p11.a aVar110 = aVar10;
                                                                aVar110.f134892a.i(boolB3);
                                                                aVar110.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar17.getClass();
                                                                Boolean boolB4 = aVar17.b();
                                                                p11.a aVar111 = aVar10;
                                                                aVar111.f134892a.B(boolB4);
                                                                aVar111.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar17.getClass();
                                                                Boolean boolB5 = aVar17.b();
                                                                p11.a aVar112 = aVar10;
                                                                aVar112.f134892a.m(boolB5);
                                                                aVar112.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar17.getClass();
                                                                Boolean boolB6 = aVar17.b();
                                                                p11.a aVar113 = aVar10;
                                                                aVar113.f134892a.h(boolB6);
                                                                aVar113.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ9);
                                            }
                                        }
                                        m11.a.a(rVarZ4, aVar11, (e23.l) objQ9, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 4:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        r.a aVar16 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ5 = x2.z(aVar16, h4.d.a.f81538p, 2);
                                        boolean zR6 = mVar3.r(aVar10);
                                        Object objQ10 = mVar3.q();
                                        if (zR6) {
                                            objQ10 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar17 = (n11.a) obj5;
                                                    switch (i111) {
                                                        case 0:
                                                            aVar17.getClass();
                                                            Boolean boolB = aVar17.b();
                                                            p11.a aVar18 = aVar10;
                                                            aVar18.f134892a.q(boolB);
                                                            aVar18.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar17.getClass();
                                                            Boolean boolB2 = aVar17.b();
                                                            p11.a aVar19 = aVar10;
                                                            aVar19.f134892a.f(boolB2);
                                                            aVar19.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar17.getClass();
                                                            Boolean boolB3 = aVar17.b();
                                                            p11.a aVar110 = aVar10;
                                                            aVar110.f134892a.i(boolB3);
                                                            aVar110.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar17.getClass();
                                                            Boolean boolB4 = aVar17.b();
                                                            p11.a aVar111 = aVar10;
                                                            aVar111.f134892a.B(boolB4);
                                                            aVar111.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar17.getClass();
                                                            Boolean boolB5 = aVar17.b();
                                                            p11.a aVar112 = aVar10;
                                                            aVar112.f134892a.m(boolB5);
                                                            aVar112.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar17.getClass();
                                                            Boolean boolB6 = aVar17.b();
                                                            p11.a aVar113 = aVar10;
                                                            aVar113.f134892a.h(boolB6);
                                                            aVar113.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ10);
                                        } else {
                                            aVar9.getClass();
                                            if (objQ10 == m.a.f135155b) {
                                                objQ10 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar17 = (n11.a) obj5;
                                                        switch (i111) {
                                                            case 0:
                                                                aVar17.getClass();
                                                                Boolean boolB = aVar17.b();
                                                                p11.a aVar18 = aVar10;
                                                                aVar18.f134892a.q(boolB);
                                                                aVar18.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar17.getClass();
                                                                Boolean boolB2 = aVar17.b();
                                                                p11.a aVar19 = aVar10;
                                                                aVar19.f134892a.f(boolB2);
                                                                aVar19.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar17.getClass();
                                                                Boolean boolB3 = aVar17.b();
                                                                p11.a aVar110 = aVar10;
                                                                aVar110.f134892a.i(boolB3);
                                                                aVar110.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar17.getClass();
                                                                Boolean boolB4 = aVar17.b();
                                                                p11.a aVar111 = aVar10;
                                                                aVar111.f134892a.B(boolB4);
                                                                aVar111.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar17.getClass();
                                                                Boolean boolB5 = aVar17.b();
                                                                p11.a aVar112 = aVar10;
                                                                aVar112.f134892a.m(boolB5);
                                                                aVar112.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar17.getClass();
                                                                Boolean boolB6 = aVar17.b();
                                                                p11.a aVar113 = aVar10;
                                                                aVar113.f134892a.h(boolB6);
                                                                aVar113.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ10);
                                            }
                                        }
                                        m11.a.a(rVarZ5, aVar11, (e23.l) objQ10, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        r.a aVar17 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ6 = x2.z(aVar17, h4.d.a.f81538p, 2);
                                        boolean zR7 = mVar3.r(aVar10);
                                        Object objQ11 = mVar3.q();
                                        if (zR7) {
                                            objQ11 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar18 = (n11.a) obj5;
                                                    switch (i112) {
                                                        case 0:
                                                            aVar18.getClass();
                                                            Boolean boolB = aVar18.b();
                                                            p11.a aVar19 = aVar10;
                                                            aVar19.f134892a.q(boolB);
                                                            aVar19.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar18.getClass();
                                                            Boolean boolB2 = aVar18.b();
                                                            p11.a aVar110 = aVar10;
                                                            aVar110.f134892a.f(boolB2);
                                                            aVar110.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar18.getClass();
                                                            Boolean boolB3 = aVar18.b();
                                                            p11.a aVar111 = aVar10;
                                                            aVar111.f134892a.i(boolB3);
                                                            aVar111.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar18.getClass();
                                                            Boolean boolB4 = aVar18.b();
                                                            p11.a aVar112 = aVar10;
                                                            aVar112.f134892a.B(boolB4);
                                                            aVar112.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar18.getClass();
                                                            Boolean boolB5 = aVar18.b();
                                                            p11.a aVar113 = aVar10;
                                                            aVar113.f134892a.m(boolB5);
                                                            aVar113.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar18.getClass();
                                                            Boolean boolB6 = aVar18.b();
                                                            p11.a aVar114 = aVar10;
                                                            aVar114.f134892a.h(boolB6);
                                                            aVar114.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ11);
                                        } else {
                                            aVar9.getClass();
                                            if (objQ11 == m.a.f135155b) {
                                                objQ11 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar18 = (n11.a) obj5;
                                                        switch (i112) {
                                                            case 0:
                                                                aVar18.getClass();
                                                                Boolean boolB = aVar18.b();
                                                                p11.a aVar19 = aVar10;
                                                                aVar19.f134892a.q(boolB);
                                                                aVar19.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar18.getClass();
                                                                Boolean boolB2 = aVar18.b();
                                                                p11.a aVar110 = aVar10;
                                                                aVar110.f134892a.f(boolB2);
                                                                aVar110.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar18.getClass();
                                                                Boolean boolB3 = aVar18.b();
                                                                p11.a aVar111 = aVar10;
                                                                aVar111.f134892a.i(boolB3);
                                                                aVar111.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar18.getClass();
                                                                Boolean boolB4 = aVar18.b();
                                                                p11.a aVar112 = aVar10;
                                                                aVar112.f134892a.B(boolB4);
                                                                aVar112.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar18.getClass();
                                                                Boolean boolB5 = aVar18.b();
                                                                p11.a aVar113 = aVar10;
                                                                aVar113.f134892a.m(boolB5);
                                                                aVar113.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar18.getClass();
                                                                Boolean boolB6 = aVar18.b();
                                                                p11.a aVar114 = aVar10;
                                                                aVar114.f134892a.h(boolB6);
                                                                aVar114.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ11);
                                            }
                                        }
                                        m11.a.a(rVarZ6, aVar11, (e23.l) objQ11, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    Object objQ6 = mVar2.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new nw1.e(7);
                        mVar2.K(objQ6);
                    }
                    p2Var.g(strQ8, null, null, null, eVarC6, false, false, (e23.a) objQ6, mVar2, 100687872, 238);
                    String strQ9 = gl1.y.Q(mVar2, R.string.nutrition_natural_language_logging_developer_options);
                    final n11.a aVar9 = this.f128531i;
                    z3.e eVarC7 = f.c(1598746879, new p() { // from class: o11.b
                        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
                        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int i110 = i18;
                            m.a aVar10 = m.f135153a;
                            final p11.a aVar11 = aVar2;
                            n11.a aVar12 = aVar9;
                            final int i111 = 2;
                            final int i112 = 1;
                            boolean z14 = false;
                            m mVar3 = (m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            switch (i110) {
                                case 0:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        r.a aVar13 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ = x2.z(aVar13, h4.d.a.f81538p, 2);
                                        boolean zR2 = mVar3.r(aVar11);
                                        Object objQ7 = mVar3.q();
                                        if (zR2) {
                                            final int i29 = 5;
                                            objQ7 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar18 = (n11.a) obj5;
                                                    switch (i29) {
                                                        case 0:
                                                            aVar18.getClass();
                                                            Boolean boolB = aVar18.b();
                                                            p11.a aVar19 = aVar11;
                                                            aVar19.f134892a.q(boolB);
                                                            aVar19.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar18.getClass();
                                                            Boolean boolB2 = aVar18.b();
                                                            p11.a aVar110 = aVar11;
                                                            aVar110.f134892a.f(boolB2);
                                                            aVar110.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar18.getClass();
                                                            Boolean boolB3 = aVar18.b();
                                                            p11.a aVar111 = aVar11;
                                                            aVar111.f134892a.i(boolB3);
                                                            aVar111.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar18.getClass();
                                                            Boolean boolB4 = aVar18.b();
                                                            p11.a aVar112 = aVar11;
                                                            aVar112.f134892a.B(boolB4);
                                                            aVar112.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar18.getClass();
                                                            Boolean boolB5 = aVar18.b();
                                                            p11.a aVar113 = aVar11;
                                                            aVar113.f134892a.m(boolB5);
                                                            aVar113.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar18.getClass();
                                                            Boolean boolB6 = aVar18.b();
                                                            p11.a aVar114 = aVar11;
                                                            aVar114.f134892a.h(boolB6);
                                                            aVar114.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ7);
                                        } else {
                                            aVar10.getClass();
                                            if (objQ7 == m.a.f135155b) {
                                                final int i210 = 5;
                                                objQ7 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar18 = (n11.a) obj5;
                                                        switch (i210) {
                                                            case 0:
                                                                aVar18.getClass();
                                                                Boolean boolB = aVar18.b();
                                                                p11.a aVar19 = aVar11;
                                                                aVar19.f134892a.q(boolB);
                                                                aVar19.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar18.getClass();
                                                                Boolean boolB2 = aVar18.b();
                                                                p11.a aVar110 = aVar11;
                                                                aVar110.f134892a.f(boolB2);
                                                                aVar110.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar18.getClass();
                                                                Boolean boolB3 = aVar18.b();
                                                                p11.a aVar111 = aVar11;
                                                                aVar111.f134892a.i(boolB3);
                                                                aVar111.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar18.getClass();
                                                                Boolean boolB4 = aVar18.b();
                                                                p11.a aVar112 = aVar11;
                                                                aVar112.f134892a.B(boolB4);
                                                                aVar112.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar18.getClass();
                                                                Boolean boolB5 = aVar18.b();
                                                                p11.a aVar113 = aVar11;
                                                                aVar113.f134892a.m(boolB5);
                                                                aVar113.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar18.getClass();
                                                                Boolean boolB6 = aVar18.b();
                                                                p11.a aVar114 = aVar11;
                                                                aVar114.f134892a.h(boolB6);
                                                                aVar114.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        m11.a.a(rVarZ, aVar12, (e23.l) objQ7, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r.a aVar14 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ2 = x2.z(aVar14, h4.d.a.f81538p, 2);
                                        boolean zR3 = mVar3.r(aVar11);
                                        Object objQ8 = mVar3.q();
                                        if (zR3) {
                                            final int i211 = 3;
                                            objQ8 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar18 = (n11.a) obj5;
                                                    switch (i211) {
                                                        case 0:
                                                            aVar18.getClass();
                                                            Boolean boolB = aVar18.b();
                                                            p11.a aVar19 = aVar11;
                                                            aVar19.f134892a.q(boolB);
                                                            aVar19.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar18.getClass();
                                                            Boolean boolB2 = aVar18.b();
                                                            p11.a aVar110 = aVar11;
                                                            aVar110.f134892a.f(boolB2);
                                                            aVar110.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar18.getClass();
                                                            Boolean boolB3 = aVar18.b();
                                                            p11.a aVar111 = aVar11;
                                                            aVar111.f134892a.i(boolB3);
                                                            aVar111.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar18.getClass();
                                                            Boolean boolB4 = aVar18.b();
                                                            p11.a aVar112 = aVar11;
                                                            aVar112.f134892a.B(boolB4);
                                                            aVar112.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar18.getClass();
                                                            Boolean boolB5 = aVar18.b();
                                                            p11.a aVar113 = aVar11;
                                                            aVar113.f134892a.m(boolB5);
                                                            aVar113.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar18.getClass();
                                                            Boolean boolB6 = aVar18.b();
                                                            p11.a aVar114 = aVar11;
                                                            aVar114.f134892a.h(boolB6);
                                                            aVar114.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ8);
                                        } else {
                                            aVar10.getClass();
                                            if (objQ8 == m.a.f135155b) {
                                                final int i212 = 3;
                                                objQ8 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar18 = (n11.a) obj5;
                                                        switch (i212) {
                                                            case 0:
                                                                aVar18.getClass();
                                                                Boolean boolB = aVar18.b();
                                                                p11.a aVar19 = aVar11;
                                                                aVar19.f134892a.q(boolB);
                                                                aVar19.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar18.getClass();
                                                                Boolean boolB2 = aVar18.b();
                                                                p11.a aVar110 = aVar11;
                                                                aVar110.f134892a.f(boolB2);
                                                                aVar110.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar18.getClass();
                                                                Boolean boolB3 = aVar18.b();
                                                                p11.a aVar111 = aVar11;
                                                                aVar111.f134892a.i(boolB3);
                                                                aVar111.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar18.getClass();
                                                                Boolean boolB4 = aVar18.b();
                                                                p11.a aVar112 = aVar11;
                                                                aVar112.f134892a.B(boolB4);
                                                                aVar112.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar18.getClass();
                                                                Boolean boolB5 = aVar18.b();
                                                                p11.a aVar113 = aVar11;
                                                                aVar113.f134892a.m(boolB5);
                                                                aVar113.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar18.getClass();
                                                                Boolean boolB6 = aVar18.b();
                                                                p11.a aVar114 = aVar11;
                                                                aVar114.f134892a.h(boolB6);
                                                                aVar114.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ8);
                                            }
                                        }
                                        m11.a.a(rVarZ2, aVar12, (e23.l) objQ8, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        r.a aVar15 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ3 = x2.z(aVar15, h4.d.a.f81538p, 2);
                                        boolean zR4 = mVar3.r(aVar11);
                                        Object objQ9 = mVar3.q();
                                        if (zR4) {
                                            final int i213 = 4;
                                            objQ9 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar18 = (n11.a) obj5;
                                                    switch (i213) {
                                                        case 0:
                                                            aVar18.getClass();
                                                            Boolean boolB = aVar18.b();
                                                            p11.a aVar19 = aVar11;
                                                            aVar19.f134892a.q(boolB);
                                                            aVar19.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar18.getClass();
                                                            Boolean boolB2 = aVar18.b();
                                                            p11.a aVar110 = aVar11;
                                                            aVar110.f134892a.f(boolB2);
                                                            aVar110.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar18.getClass();
                                                            Boolean boolB3 = aVar18.b();
                                                            p11.a aVar111 = aVar11;
                                                            aVar111.f134892a.i(boolB3);
                                                            aVar111.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar18.getClass();
                                                            Boolean boolB4 = aVar18.b();
                                                            p11.a aVar112 = aVar11;
                                                            aVar112.f134892a.B(boolB4);
                                                            aVar112.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar18.getClass();
                                                            Boolean boolB5 = aVar18.b();
                                                            p11.a aVar113 = aVar11;
                                                            aVar113.f134892a.m(boolB5);
                                                            aVar113.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar18.getClass();
                                                            Boolean boolB6 = aVar18.b();
                                                            p11.a aVar114 = aVar11;
                                                            aVar114.f134892a.h(boolB6);
                                                            aVar114.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ9);
                                        } else {
                                            aVar10.getClass();
                                            if (objQ9 == m.a.f135155b) {
                                                final int i214 = 4;
                                                objQ9 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar18 = (n11.a) obj5;
                                                        switch (i214) {
                                                            case 0:
                                                                aVar18.getClass();
                                                                Boolean boolB = aVar18.b();
                                                                p11.a aVar19 = aVar11;
                                                                aVar19.f134892a.q(boolB);
                                                                aVar19.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar18.getClass();
                                                                Boolean boolB2 = aVar18.b();
                                                                p11.a aVar110 = aVar11;
                                                                aVar110.f134892a.f(boolB2);
                                                                aVar110.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar18.getClass();
                                                                Boolean boolB3 = aVar18.b();
                                                                p11.a aVar111 = aVar11;
                                                                aVar111.f134892a.i(boolB3);
                                                                aVar111.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar18.getClass();
                                                                Boolean boolB4 = aVar18.b();
                                                                p11.a aVar112 = aVar11;
                                                                aVar112.f134892a.B(boolB4);
                                                                aVar112.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar18.getClass();
                                                                Boolean boolB5 = aVar18.b();
                                                                p11.a aVar113 = aVar11;
                                                                aVar113.f134892a.m(boolB5);
                                                                aVar113.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar18.getClass();
                                                                Boolean boolB6 = aVar18.b();
                                                                p11.a aVar114 = aVar11;
                                                                aVar114.f134892a.h(boolB6);
                                                                aVar114.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ9);
                                            }
                                        }
                                        m11.a.a(rVarZ3, aVar12, (e23.l) objQ9, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 3:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        r.a aVar16 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ4 = x2.z(aVar16, h4.d.a.f81538p, 2);
                                        boolean zR5 = mVar3.r(aVar11);
                                        Object objQ10 = mVar3.q();
                                        if (zR5) {
                                            final int i38 = z14 ? 1 : 0;
                                            objQ10 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar18 = (n11.a) obj5;
                                                    switch (i38) {
                                                        case 0:
                                                            aVar18.getClass();
                                                            Boolean boolB = aVar18.b();
                                                            p11.a aVar19 = aVar11;
                                                            aVar19.f134892a.q(boolB);
                                                            aVar19.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar18.getClass();
                                                            Boolean boolB2 = aVar18.b();
                                                            p11.a aVar110 = aVar11;
                                                            aVar110.f134892a.f(boolB2);
                                                            aVar110.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar18.getClass();
                                                            Boolean boolB3 = aVar18.b();
                                                            p11.a aVar111 = aVar11;
                                                            aVar111.f134892a.i(boolB3);
                                                            aVar111.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar18.getClass();
                                                            Boolean boolB4 = aVar18.b();
                                                            p11.a aVar112 = aVar11;
                                                            aVar112.f134892a.B(boolB4);
                                                            aVar112.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar18.getClass();
                                                            Boolean boolB5 = aVar18.b();
                                                            p11.a aVar113 = aVar11;
                                                            aVar113.f134892a.m(boolB5);
                                                            aVar113.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar18.getClass();
                                                            Boolean boolB6 = aVar18.b();
                                                            p11.a aVar114 = aVar11;
                                                            aVar114.f134892a.h(boolB6);
                                                            aVar114.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ10);
                                        } else {
                                            aVar10.getClass();
                                            if (objQ10 == m.a.f135155b) {
                                                final int i39 = z14 ? 1 : 0;
                                                objQ10 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar18 = (n11.a) obj5;
                                                        switch (i39) {
                                                            case 0:
                                                                aVar18.getClass();
                                                                Boolean boolB = aVar18.b();
                                                                p11.a aVar19 = aVar11;
                                                                aVar19.f134892a.q(boolB);
                                                                aVar19.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar18.getClass();
                                                                Boolean boolB2 = aVar18.b();
                                                                p11.a aVar110 = aVar11;
                                                                aVar110.f134892a.f(boolB2);
                                                                aVar110.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar18.getClass();
                                                                Boolean boolB3 = aVar18.b();
                                                                p11.a aVar111 = aVar11;
                                                                aVar111.f134892a.i(boolB3);
                                                                aVar111.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar18.getClass();
                                                                Boolean boolB4 = aVar18.b();
                                                                p11.a aVar112 = aVar11;
                                                                aVar112.f134892a.B(boolB4);
                                                                aVar112.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar18.getClass();
                                                                Boolean boolB5 = aVar18.b();
                                                                p11.a aVar113 = aVar11;
                                                                aVar113.f134892a.m(boolB5);
                                                                aVar113.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar18.getClass();
                                                                Boolean boolB6 = aVar18.b();
                                                                p11.a aVar114 = aVar11;
                                                                aVar114.f134892a.h(boolB6);
                                                                aVar114.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ10);
                                            }
                                        }
                                        m11.a.a(rVarZ4, aVar12, (e23.l) objQ10, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 4:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        r.a aVar17 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ5 = x2.z(aVar17, h4.d.a.f81538p, 2);
                                        boolean zR6 = mVar3.r(aVar11);
                                        Object objQ11 = mVar3.q();
                                        if (zR6) {
                                            objQ11 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar18 = (n11.a) obj5;
                                                    switch (i111) {
                                                        case 0:
                                                            aVar18.getClass();
                                                            Boolean boolB = aVar18.b();
                                                            p11.a aVar19 = aVar11;
                                                            aVar19.f134892a.q(boolB);
                                                            aVar19.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar18.getClass();
                                                            Boolean boolB2 = aVar18.b();
                                                            p11.a aVar110 = aVar11;
                                                            aVar110.f134892a.f(boolB2);
                                                            aVar110.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar18.getClass();
                                                            Boolean boolB3 = aVar18.b();
                                                            p11.a aVar111 = aVar11;
                                                            aVar111.f134892a.i(boolB3);
                                                            aVar111.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar18.getClass();
                                                            Boolean boolB4 = aVar18.b();
                                                            p11.a aVar112 = aVar11;
                                                            aVar112.f134892a.B(boolB4);
                                                            aVar112.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar18.getClass();
                                                            Boolean boolB5 = aVar18.b();
                                                            p11.a aVar113 = aVar11;
                                                            aVar113.f134892a.m(boolB5);
                                                            aVar113.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar18.getClass();
                                                            Boolean boolB6 = aVar18.b();
                                                            p11.a aVar114 = aVar11;
                                                            aVar114.f134892a.h(boolB6);
                                                            aVar114.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ11);
                                        } else {
                                            aVar10.getClass();
                                            if (objQ11 == m.a.f135155b) {
                                                objQ11 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar18 = (n11.a) obj5;
                                                        switch (i111) {
                                                            case 0:
                                                                aVar18.getClass();
                                                                Boolean boolB = aVar18.b();
                                                                p11.a aVar19 = aVar11;
                                                                aVar19.f134892a.q(boolB);
                                                                aVar19.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar18.getClass();
                                                                Boolean boolB2 = aVar18.b();
                                                                p11.a aVar110 = aVar11;
                                                                aVar110.f134892a.f(boolB2);
                                                                aVar110.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar18.getClass();
                                                                Boolean boolB3 = aVar18.b();
                                                                p11.a aVar111 = aVar11;
                                                                aVar111.f134892a.i(boolB3);
                                                                aVar111.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar18.getClass();
                                                                Boolean boolB4 = aVar18.b();
                                                                p11.a aVar112 = aVar11;
                                                                aVar112.f134892a.B(boolB4);
                                                                aVar112.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar18.getClass();
                                                                Boolean boolB5 = aVar18.b();
                                                                p11.a aVar113 = aVar11;
                                                                aVar113.f134892a.m(boolB5);
                                                                aVar113.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar18.getClass();
                                                                Boolean boolB6 = aVar18.b();
                                                                p11.a aVar114 = aVar11;
                                                                aVar114.f134892a.h(boolB6);
                                                                aVar114.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ11);
                                            }
                                        }
                                        m11.a.a(rVarZ5, aVar12, (e23.l) objQ11, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        r.a aVar18 = r.S;
                                        h4.d.f81522a.getClass();
                                        r rVarZ6 = x2.z(aVar18, h4.d.a.f81538p, 2);
                                        boolean zR7 = mVar3.r(aVar11);
                                        Object objQ12 = mVar3.q();
                                        if (zR7) {
                                            objQ12 = new e23.l() { // from class: o11.c
                                                @Override // e23.l
                                                public final Object invoke(Object obj5) {
                                                    n11.a aVar19 = (n11.a) obj5;
                                                    switch (i112) {
                                                        case 0:
                                                            aVar19.getClass();
                                                            Boolean boolB = aVar19.b();
                                                            p11.a aVar110 = aVar11;
                                                            aVar110.f134892a.q(boolB);
                                                            aVar110.f134901j.setValue(boolB);
                                                            break;
                                                        case 1:
                                                            aVar19.getClass();
                                                            Boolean boolB2 = aVar19.b();
                                                            p11.a aVar111 = aVar11;
                                                            aVar111.f134892a.f(boolB2);
                                                            aVar111.f134905n.setValue(boolB2);
                                                            break;
                                                        case 2:
                                                            aVar19.getClass();
                                                            Boolean boolB3 = aVar19.b();
                                                            p11.a aVar112 = aVar11;
                                                            aVar112.f134892a.i(boolB3);
                                                            aVar112.f134903l.setValue(boolB3);
                                                            break;
                                                        case 3:
                                                            aVar19.getClass();
                                                            Boolean boolB4 = aVar19.b();
                                                            p11.a aVar113 = aVar11;
                                                            aVar113.f134892a.B(boolB4);
                                                            aVar113.f134897f.setValue(boolB4);
                                                            break;
                                                        case 4:
                                                            aVar19.getClass();
                                                            Boolean boolB5 = aVar19.b();
                                                            p11.a aVar114 = aVar11;
                                                            aVar114.f134892a.m(boolB5);
                                                            aVar114.f134899h.setValue(boolB5);
                                                            break;
                                                        default:
                                                            aVar19.getClass();
                                                            Boolean boolB6 = aVar19.b();
                                                            p11.a aVar115 = aVar11;
                                                            aVar115.f134892a.h(boolB6);
                                                            aVar115.f134895d.setValue(boolB6);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ12);
                                        } else {
                                            aVar10.getClass();
                                            if (objQ12 == m.a.f135155b) {
                                                objQ12 = new e23.l() { // from class: o11.c
                                                    @Override // e23.l
                                                    public final Object invoke(Object obj5) {
                                                        n11.a aVar19 = (n11.a) obj5;
                                                        switch (i112) {
                                                            case 0:
                                                                aVar19.getClass();
                                                                Boolean boolB = aVar19.b();
                                                                p11.a aVar110 = aVar11;
                                                                aVar110.f134892a.q(boolB);
                                                                aVar110.f134901j.setValue(boolB);
                                                                break;
                                                            case 1:
                                                                aVar19.getClass();
                                                                Boolean boolB2 = aVar19.b();
                                                                p11.a aVar111 = aVar11;
                                                                aVar111.f134892a.f(boolB2);
                                                                aVar111.f134905n.setValue(boolB2);
                                                                break;
                                                            case 2:
                                                                aVar19.getClass();
                                                                Boolean boolB3 = aVar19.b();
                                                                p11.a aVar112 = aVar11;
                                                                aVar112.f134892a.i(boolB3);
                                                                aVar112.f134903l.setValue(boolB3);
                                                                break;
                                                            case 3:
                                                                aVar19.getClass();
                                                                Boolean boolB4 = aVar19.b();
                                                                p11.a aVar113 = aVar11;
                                                                aVar113.f134892a.B(boolB4);
                                                                aVar113.f134897f.setValue(boolB4);
                                                                break;
                                                            case 4:
                                                                aVar19.getClass();
                                                                Boolean boolB5 = aVar19.b();
                                                                p11.a aVar114 = aVar11;
                                                                aVar114.f134892a.m(boolB5);
                                                                aVar114.f134899h.setValue(boolB5);
                                                                break;
                                                            default:
                                                                aVar19.getClass();
                                                                Boolean boolB6 = aVar19.b();
                                                                p11.a aVar115 = aVar11;
                                                                aVar115.f134892a.h(boolB6);
                                                                aVar115.f134895d.setValue(boolB6);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ12);
                                            }
                                        }
                                        m11.a.a(rVarZ6, aVar12, (e23.l) objQ12, mVar3, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    Object objQ7 = mVar2.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new nw1.e(8);
                        mVar2.K(objQ7);
                    }
                    p2Var.g(strQ9, null, null, null, eVarC7, false, false, (e23.a) objQ7, mVar2, 100687872, 238);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
