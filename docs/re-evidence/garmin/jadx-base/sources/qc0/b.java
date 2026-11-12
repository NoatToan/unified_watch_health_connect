package qc0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import pp.g;
import u1.a2;
import v.h;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1255291079);
        int i15 = 2;
        int i16 = 4;
        int i17 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, f.c(1693914307, new g(s9.c.c(dVar.f144375f, o0VarE), i16, aVar, s9.c.c(dVar.f144373d, o0VarE)), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(dVar, aVar, i14, i15);
        }
    }

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
    public static final void b(List<sc0.b> list, m mVar, int i14) {
        o0 o0Var;
        int i15;
        boolean z14;
        o0 o0Var2;
        list.getClass();
        o0 o0VarE = mVar.E(1737245085);
        final int i16 = 2;
        int i17 = (o0VarE.r(list) ? 4 : 2) | i14;
        boolean z15 = false;
        int i18 = 1;
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarB = a2.b(l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1606457184);
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                final sc0.b bVar2 = (sc0.b) it.next();
                String str = bVar2.f158469d;
                String str2 = bVar2.f158468c;
                if (str == null || str.length() == 0) {
                    i15 = i16;
                    final int i19 = i18;
                    o0 o0Var3 = o0VarE;
                    boolean z16 = z15;
                    o0Var3.C(209707909);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String str3 = bVar2.f158467b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    final int i24 = z16 ? 1 : 0;
                    e eVarC = f.c(229575597, new p() { // from class: qc0.a
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i25 = i24;
                            sc0.b bVar3 = bVar2;
                            switch (i25) {
                                case 0:
                                    m mVar2 = (m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var2 = n.f135158a;
                                        wf.f.a aVar3 = new wf.f.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar3.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar = wf.h.f184985a;
                                        aVar3.f184946s = new w40.d(24);
                                        wf.g.a(aVar3);
                                        wf.f fVarA = aVar3.a();
                                        r.a aVar4 = r.S;
                                        float f14 = wz1.b.f188181a;
                                        jf.r.a(fVarA, null, x2.u(x2.h(aVar4, f14), f14), null, null, null, null, mVar2, 48, 2040);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    Integer num = bVar3.f158470e;
                                    m mVar3 = (m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        if (num == null) {
                                            mVar3.C(697680164);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(697680165);
                                            i7.a(n5.c.a(num.intValue(), mVar3, 0), null, null, 0L, mVar3, 48, 12);
                                            mVar3.f();
                                        }
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    m mVar4 = (m) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        wf.f.a aVar5 = new wf.f.a((Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar5.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar2 = wf.h.f184985a;
                                        aVar5.f184946s = new w40.d(24);
                                        wf.g.a(aVar5);
                                        wf.f fVarA2 = aVar5.a();
                                        r.a aVar6 = r.S;
                                        float f15 = wz1.b.f188181a;
                                        jf.r.a(fVarA2, null, x2.u(x2.h(aVar6, f15), f15), null, null, null, null, mVar4, 48, 2040);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    Integer num2 = bVar3.f158470e;
                                    m mVar5 = (m) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        if (num2 == null) {
                                            mVar5.C(-506047512);
                                            mVar5.f();
                                        } else {
                                            mVar5.C(-506047511);
                                            i7.a(n5.c.a(num2.intValue(), mVar5, 0), null, null, 0L, mVar5, 48, 12);
                                            mVar5.f();
                                        }
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0Var3);
                    e eVarC2 = f.c(479676876, new p() { // from class: qc0.a
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i25 = i19;
                            sc0.b bVar3 = bVar2;
                            switch (i25) {
                                case 0:
                                    m mVar2 = (m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var2 = n.f135158a;
                                        wf.f.a aVar3 = new wf.f.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar3.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar = wf.h.f184985a;
                                        aVar3.f184946s = new w40.d(24);
                                        wf.g.a(aVar3);
                                        wf.f fVarA = aVar3.a();
                                        r.a aVar4 = r.S;
                                        float f14 = wz1.b.f188181a;
                                        jf.r.a(fVarA, null, x2.u(x2.h(aVar4, f14), f14), null, null, null, null, mVar2, 48, 2040);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    Integer num = bVar3.f158470e;
                                    m mVar3 = (m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        if (num == null) {
                                            mVar3.C(697680164);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(697680165);
                                            i7.a(n5.c.a(num.intValue(), mVar3, 0), null, null, 0L, mVar3, 48, 12);
                                            mVar3.f();
                                        }
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    m mVar4 = (m) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        wf.f.a aVar5 = new wf.f.a((Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar5.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar2 = wf.h.f184985a;
                                        aVar5.f184946s = new w40.d(24);
                                        wf.g.a(aVar5);
                                        wf.f fVarA2 = aVar5.a();
                                        r.a aVar6 = r.S;
                                        float f15 = wz1.b.f188181a;
                                        jf.r.a(fVarA2, null, x2.u(x2.h(aVar6, f15), f15), null, null, null, null, mVar4, 48, 2040);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    Integer num2 = bVar3.f158470e;
                                    m mVar5 = (m) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        if (num2 == null) {
                                            mVar5.C(-506047512);
                                            mVar5.f();
                                        } else {
                                            mVar5.C(-506047511);
                                            i7.a(n5.c.a(num2.intValue(), mVar5, 0), null, null, 0L, mVar5, 48, 12);
                                            mVar5.f();
                                        }
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0Var3);
                    z14 = z16 ? 1 : 0;
                    p2Var.h(str3, str2, null, null, null, false, false, eVarC, eVarC2, null, null, o0Var3, 113246208, 0, 1660);
                    o0Var2 = o0Var3;
                    o0Var2.g0(z14);
                } else {
                    o0VarE.C(210914367);
                    g02.b0 b0Var2 = g02.b0.f74326a;
                    String str4 = bVar2.f158467b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    final int i25 = 3;
                    boolean z17 = z15;
                    i15 = i16;
                    o0Var2 = o0VarE;
                    b0Var2.a(str4, str2, bVar2.f158469d, null, false, f.c(-1847521431, new p() { // from class: qc0.a
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i26 = i16;
                            sc0.b bVar3 = bVar2;
                            switch (i26) {
                                case 0:
                                    m mVar2 = (m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var2 = n.f135158a;
                                        wf.f.a aVar3 = new wf.f.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar3.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar = wf.h.f184985a;
                                        aVar3.f184946s = new w40.d(24);
                                        wf.g.a(aVar3);
                                        wf.f fVarA = aVar3.a();
                                        r.a aVar4 = r.S;
                                        float f14 = wz1.b.f188181a;
                                        jf.r.a(fVarA, null, x2.u(x2.h(aVar4, f14), f14), null, null, null, null, mVar2, 48, 2040);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    Integer num = bVar3.f158470e;
                                    m mVar3 = (m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        if (num == null) {
                                            mVar3.C(697680164);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(697680165);
                                            i7.a(n5.c.a(num.intValue(), mVar3, 0), null, null, 0L, mVar3, 48, 12);
                                            mVar3.f();
                                        }
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    m mVar4 = (m) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        wf.f.a aVar5 = new wf.f.a((Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar5.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar2 = wf.h.f184985a;
                                        aVar5.f184946s = new w40.d(24);
                                        wf.g.a(aVar5);
                                        wf.f fVarA2 = aVar5.a();
                                        r.a aVar6 = r.S;
                                        float f15 = wz1.b.f188181a;
                                        jf.r.a(fVarA2, null, x2.u(x2.h(aVar6, f15), f15), null, null, null, null, mVar4, 48, 2040);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    Integer num2 = bVar3.f158470e;
                                    m mVar5 = (m) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        if (num2 == null) {
                                            mVar5.C(-506047512);
                                            mVar5.f();
                                        } else {
                                            mVar5.C(-506047511);
                                            i7.a(n5.c.a(num2.intValue(), mVar5, 0), null, null, 0L, mVar5, 48, 12);
                                            mVar5.f();
                                        }
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), f.c(-1597420152, new p() { // from class: qc0.a
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i26 = i25;
                            sc0.b bVar3 = bVar2;
                            switch (i26) {
                                case 0:
                                    m mVar2 = (m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var2 = n.f135158a;
                                        wf.f.a aVar3 = new wf.f.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar3.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar = wf.h.f184985a;
                                        aVar3.f184946s = new w40.d(24);
                                        wf.g.a(aVar3);
                                        wf.f fVarA = aVar3.a();
                                        r.a aVar4 = r.S;
                                        float f14 = wz1.b.f188181a;
                                        jf.r.a(fVarA, null, x2.u(x2.h(aVar4, f14), f14), null, null, null, null, mVar2, 48, 2040);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    Integer num = bVar3.f158470e;
                                    m mVar3 = (m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        if (num == null) {
                                            mVar3.C(697680164);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(697680165);
                                            i7.a(n5.c.a(num.intValue(), mVar3, 0), null, null, 0L, mVar3, 48, 12);
                                            mVar3.f();
                                        }
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 2:
                                    m mVar4 = (m) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        wf.f.a aVar5 = new wf.f.a((Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b));
                                        aVar5.f184930c = bVar3.f158466a;
                                        hf.f.c<cg.d.a> cVar2 = wf.h.f184985a;
                                        aVar5.f184946s = new w40.d(24);
                                        wf.g.a(aVar5);
                                        wf.f fVarA2 = aVar5.a();
                                        r.a aVar6 = r.S;
                                        float f15 = wz1.b.f188181a;
                                        jf.r.a(fVarA2, null, x2.u(x2.h(aVar6, f15), f15), null, null, null, null, mVar4, 48, 2040);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    Integer num2 = bVar3.f158470e;
                                    m mVar5 = (m) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var5 = n.f135158a;
                                        if (num2 == null) {
                                            mVar5.C(-506047512);
                                            mVar5.f();
                                        } else {
                                            mVar5.C(-506047511);
                                            i7.a(n5.c.a(num2.intValue(), mVar5, 0), null, null, 0L, mVar5, 48, 12);
                                            mVar5.f();
                                        }
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), null, o0Var2, 14155776, 824);
                    o0Var2.g0(z17);
                    z14 = z17 ? 1 : 0;
                }
                z15 = z14;
                o0VarE = o0Var2;
                i16 = i15;
                i18 = 1;
            }
            o0 o0Var4 = o0VarE;
            o0Var4.g0(z15);
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(aVar3, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0Var4, R.string.sensors_list_footer);
            d6.h.f57752b.getClass();
            int i26 = d6.h.f57757g;
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var4), o0Var4, 0, 0, 130044);
            o0Var = o0Var4;
            o0Var.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 17);
        }
    }
}
