package am;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import com.google.maps.android.BuildConfig;
import i3.h7;
import i3.i7;
import i3.mh;
import i3.ve;
import i3.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import v62.l4;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f4065b;

    public /* synthetic */ l1(p3.p1 p1Var, int i14) {
        this.f4064a = 3;
        this.f4065b = p1Var;
    }

    private final Object a(Object obj, Object obj2) {
        String strName;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = TestGoogleAgeSignalsActivity.f41746b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = u1.a2.b(aVar, u1.a2.a(mVar), true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarB, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                ue2.e eVar2 = new ue2.e();
                Integer numF = eVar2.f();
                String str = "";
                String strM = numF != null ? ue2.e.m(numF.intValue()) : "";
                ue2.a aVarH = eVar2.h();
                if (aVarH == null || (strName = aVarH.name()) == null) {
                    strName = "";
                }
                o13.p<Integer, Integer> pVarG = eVar2.g();
                if (pVarG != null) {
                    str = pVarG.f128594a + "-" + pVarG.f128595b;
                }
                StringBuilder sbI = p6.b.i("accessStatus: ", strM, "\nerror: ", strName, "\nageRange: ");
                sbI.append(str);
                objQ = sbI.toString();
                mVar.K(objQ);
            }
            d92.b.f58624b.getClass();
            mh.c((String) objQ, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 6, 0, 131068);
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarC2 = c2.l.C(x2.f(aVar, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new l51.c(this.f4065b, 10);
                mVar.K(objQ2);
            }
            f0Var.i("Close", rVarC2, false, (e23.a) objQ2, mVar, 3078, 4);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = TestGoogleAgeSignalsActivity.f41746b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = u1.a2.b(aVar, u1.a2.a(mVar), true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarB, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ue2.e().f();
                mVar.K(objQ);
            }
            Integer num = (Integer) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(p13.x.k("UNSPECIFIED (0)", "SHARED (1)", "NOT_SHARED (2)", "VERIFICATION_REQUIRED (3)"));
                mVar.K(objQ2);
            }
            p3.p1 p1Var = (p3.p1) objQ2;
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(((List) p1Var.getF182175a()).get(num != null ? num.intValue() : ((List) p1Var.getF182175a()).indexOf(p13.h0.b0((List) p1Var.getF182175a()))));
                mVar.K(objQ3);
            }
            p3.p1 p1Var2 = (p3.p1) objQ3;
            List list = (List) p1Var.getF182175a();
            String str = (String) p1Var2.getF182175a();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            Object objQ4 = mVar.q();
            int i15 = 13;
            if (objQ4 == c2565a) {
                objQ4 = new ky0.k(p1Var2, i15);
                mVar.K(objQ4);
            }
            l72.g1.b(rVarC2, "Test Access Status", list, str, "Set Test Access Status", null, null, false, true, null, (e23.l) objQ4, mVar, 100687920, 736);
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarC3 = c2.l.C(x2.f(aVar, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            Object objQ5 = mVar.q();
            p3.p1 p1Var3 = this.f4065b;
            if (objQ5 == c2565a) {
                objQ5 = new kk1.a(p1Var, p1Var2, p1Var3);
                mVar.K(objQ5);
            }
            f0Var.d(24624, 9, (e23.a) objQ5, rVarC3, "Save", mVar, null, false);
            h4.r rVarC4 = c2.l.C(x2.f(aVar, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            Object objQ6 = mVar.q();
            if (objQ6 == c2565a) {
                objQ6 = new l51.c(p1Var3, 13);
                mVar.K(objQ6);
            }
            f0Var.i("Cancel", rVarC4, false, (e23.a) objQ6, mVar, 3078, 4);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2) {
        p3.p1 p1Var;
        p3.p1 p1Var2;
        p3.m.a.C2565a c2565a;
        j92.e eVar;
        h4.r.a aVar;
        p3.p1 p1Var3;
        p3.p1 p1Var4;
        Object next;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = TestGoogleAgeSignalsActivity.f41746b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarB = u1.a2.b(h4.r.S, u1.a2.a(mVar), true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarB, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            Object obj3 = null;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new ue2.e().g();
                mVar.K(objQ);
            }
            o13.p pVar = (o13.p) objQ;
            Object objQ2 = mVar.q();
            int i15 = 18;
            if (objQ2 == c2565a2) {
                j23.l lVar = new j23.l(0, 18);
                ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
                Iterator<Integer> it = lVar.iterator();
                while (((j23.k) it).f96801c) {
                    int iNextInt = ((p13.p0) it).nextInt();
                    arrayList.add(iNextInt == 0 ? BuildConfig.TRAVIS : String.valueOf(iNextInt));
                }
                objQ2 = p3.p0.n(new ArrayList(arrayList));
                mVar.K(objQ2);
            }
            p3.p1 p1Var5 = (p3.p1) objQ2;
            Object objQ3 = mVar.q();
            if (objQ3 == p3.m.a.f135155b) {
                Iterator it3 = ((List) p1Var5.getF182175a()).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!p005kotlin.jvm.internal.s.g((String) next, String.valueOf(pVar != null ? (Integer) pVar.f128594a : null)));
                String str = (String) next;
                if (str == null) {
                    str = (String) p13.h0.b0((List) p1Var5.getF182175a());
                }
                objQ3 = p3.p0.n(str);
                mVar.K(objQ3);
            }
            p3.p1 p1Var6 = (p3.p1) objQ3;
            Object objQ4 = mVar.q();
            if (objQ4 == p3.m.a.f135155b) {
                for (Object obj4 : (List) p1Var5.getF182175a()) {
                    if (p005kotlin.jvm.internal.s.g((String) obj4, String.valueOf(pVar != null ? (Integer) pVar.f128595b : null))) {
                        obj3 = obj4;
                        break;
                    }
                }
                String str2 = (String) obj3;
                if (str2 == null) {
                    str2 = (String) p13.h0.b0((List) p1Var5.getF182175a());
                }
                objQ4 = p3.p0.n(str2);
                mVar.K(objQ4);
            }
            p3.p1 p1Var7 = (p3.p1) objQ4;
            Object objQ5 = mVar.q();
            p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
            if (objQ5 == c2565a3) {
                objQ5 = p3.p0.n("");
                mVar.K(objQ5);
            }
            p3.p1 p1Var8 = (p3.p1) objQ5;
            List list = (List) p1Var5.getF182175a();
            String str3 = (String) p1Var6.getF182175a();
            h4.r.a aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            Object objQ6 = mVar.q();
            if (objQ6 == c2565a3) {
                objQ6 = new c1(p1Var8, p1Var6, i15);
                mVar.K(objQ6);
            }
            l72.g1.b(rVarC2, "Age Min", list, str3, "Set Age Min", null, null, false, true, null, (e23.l) objQ6, mVar, 100687920, 736);
            List list2 = (List) p1Var5.getF182175a();
            String str4 = (String) p1Var7.getF182175a();
            h4.r rVarC3 = c2.l.C(aVar4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            Object objQ7 = mVar.q();
            if (objQ7 == c2565a3) {
                p1Var = p1Var7;
                p1Var2 = p1Var8;
                objQ7 = new c1(p1Var2, p1Var, 19);
                mVar.K(objQ7);
            } else {
                p1Var = p1Var7;
                p1Var2 = p1Var8;
            }
            p3.p1 p1Var9 = p1Var;
            p3.p1 p1Var10 = p1Var2;
            l72.g1.b(rVarC3, "Age Max", list2, str4, "Set Age Max", null, null, false, true, null, (e23.l) objQ7, mVar, 100687920, 736);
            if (d53.w.J((String) p1Var10.getF182175a())) {
                c2565a = c2565a3;
                eVar = eVar2;
                aVar = aVar4;
                p1Var3 = p1Var10;
                mVar.C(-290291);
                mVar.f();
            } else {
                mVar.C(-615915);
                String str5 = (String) p1Var10.getF182175a();
                d92.b.f58624b.getClass();
                p1Var3 = p1Var10;
                c2565a = c2565a3;
                eVar = eVar2;
                aVar = aVar4;
                mh.c(str5, c2.l.C(aVar4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97931h, d92.b.a(mVar).k().e(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131068);
                mVar = mVar;
                mVar.f();
            }
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r.a aVar5 = aVar;
            j92.e eVar3 = eVar;
            h4.r rVarC4 = c2.l.C(x2.f(aVar5, 1.0f), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
            Object objQ8 = mVar.q();
            p3.p1 p1Var11 = this.f4065b;
            p3.m.a.C2565a c2565a4 = c2565a;
            if (objQ8 == c2565a4) {
                p1Var4 = p1Var11;
                ho.d0 d0Var = new ho.d0(p1Var6, p1Var9, p1Var4, p1Var3, 17);
                mVar.K(d0Var);
                objQ8 = d0Var;
            } else {
                p1Var4 = p1Var11;
            }
            p3.m mVar2 = mVar;
            p3.p1 p1Var12 = p1Var4;
            f0Var.d(24624, 9, (e23.a) objQ8, rVarC4, "Save", mVar2, null, false);
            h4.r rVarC5 = c2.l.C(x2.f(aVar5, 1.0f), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
            Object objQ9 = mVar2.q();
            if (objQ9 == c2565a4) {
                objQ9 = new l51.c(p1Var12, 11);
                mVar2.K(objQ9);
            }
            f0Var.i("Cancel", rVarC5, false, (e23.a) objQ9, mVar2, 3078, 4);
            mVar2.y();
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        u4.d dVarA;
        u4.d dVarA2;
        h4.r rVarQ;
        u4.d dVarA3;
        u4.d dVarA4;
        int i14 = this.f4064a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 1;
        boolean z14 = false;
        p3.p1 p1Var = this.f4065b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                ((Boolean) obj2).booleanValue();
                str.getClass();
                p1Var.setValue(str);
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(-758867590);
                        ao1.e.d(mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-758817277);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        b3.b.f15502a.getClass();
                        dVarA = d3.l.a();
                    } else {
                        b3.b.f15502a.getClass();
                        dVarA = d3.k.a();
                    }
                    i7.b(dVarA, gl1.y.Q(mVar2, ((Boolean) p1Var.getF182175a()).booleanValue() ? R.string.common_collapse_lbl : R.string.common_expand_lbl), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2), mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                zf.b.e(p1Var, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_skip_button);
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.k(p1Var, i15);
                        mVar3.K(objQ);
                    }
                    f0Var.i(strQ, rVarF, false, (e23.a) objQ, mVar3, 3120, 4);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_skip_button);
                    Object objQ2 = mVar4.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cw1.k(p1Var, 3);
                        mVar4.K(objQ2);
                    }
                    f0Var2.i(strQ2, rVarF2, false, (e23.a) objQ2, mVar4, 3120, 4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        b3.b.a aVar2 = b3.b.a.f15503a;
                        dVarA2 = d3.d.f57307a;
                        if (dVarA2 == null) {
                            g6.f.a aVar3 = g6.f.f75994b;
                            u4.d.a aVar4 = new u4.d.a("Filled.ArrowDropUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                            p13.j0 j0Var = u4.m.f168519a;
                            o4.d0.f128823b.getClass();
                            o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                            o4.u1.f129010b.getClass();
                            o4.v1.f129019b.getClass();
                            int i16 = o4.v1.f129021d;
                            u4.e eVar = new u4.e();
                            eVar.k(7.0f, 14.0f);
                            eVar.j(5.0f, -5.0f);
                            eVar.j(5.0f, 5.0f);
                            eVar.c();
                            u4.d.a.b(aVar4, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i16, 1.0f);
                            dVarA2 = aVar4.c();
                            d3.d.f57307a = dVarA2;
                        }
                    } else {
                        b3.b.a aVar5 = b3.b.a.f15503a;
                        dVarA2 = d3.c.a();
                    }
                    u4.d dVar = dVarA2;
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar5);
                    h4.r.a aVar6 = h4.r.S;
                    float f75992b = ((g6.c) mVar5.A(kotlin.t1.f91490h)).getF94882b();
                    if (f75992b <= 1.0f) {
                        d92.b.f58625c.getClass();
                        rVarQ = x2.q(aVar6, j92.b.f97901d.f97904c);
                    } else if (f75992b <= 1.5f) {
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97901d.f97904c * f75992b;
                        g6.f.a aVar7 = g6.f.f75994b;
                        rVarQ = x2.q(aVar6, f14);
                    } else {
                        d92.b.f58625c.getClass();
                        float f15 = j92.b.f97901d.f97904c * 1.5f;
                        g6.f.a aVar8 = g6.f.f75994b;
                        rVarQ = x2.q(aVar6, f15);
                    }
                    i7.b(dVar, null, rVarQ, jA, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    wf.f.a aVar9 = new wf.f.a((Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b));
                    vs.d dVar2 = (vs.d) p1Var.getF182175a();
                    aVar9.f184930c = dVar2 != null ? dVar2.f179704b : null;
                    wf.g.a(aVar9);
                    jf.r.b(aVar9.a(), null, x2.q(h4.r.S, wz1.b.f188181a), n5.c.a(2131231969, mVar6, 0), n5.c.a(2131231969, mVar6, 0), null, null, null, null, null, null, null, mVar6, 48, 0, 32736);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar7.C(116185070);
                        h4.r.a aVar11 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.c cVar = j92.b.f97901d;
                        float f16 = cVar.f97904c;
                        float f17 = cVar.f97903b;
                        h4.r rVarN = x2.n(aVar11, f16, f16);
                        h4.d.f81522a.getClass();
                        f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar7.getU());
                        p3.i2 i2VarX = mVar7.x();
                        h4.r rVarC = h4.k.c(rVarN, mVar7);
                        h5.g.V.getClass();
                        h5.e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar7.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar12);
                        } else {
                            mVar7.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar7, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar7);
                        i7.a(n5.c.a(R.drawable.ic_exclamation, mVar7, 0), null, u1.n.e(l4.k.b(c2.u.f22885a.c(x2.u(x2.h(aVar11, f17), f17), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(mVar7).f().f(), o4.m1.f128891a), d92.b.a(mVar7).f().f63508c, mVar7, 48, 0);
                        mVar7.y();
                        mVar7.f();
                    } else {
                        mVar7.C(117030750);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        s62.a.f157643a.getClass();
                        dVarA3 = v62.l1.a(t62.b.f162798a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA3 = l4.a(t62.b.f162798a);
                    }
                    i7.b(dVarA3, ((Boolean) p1Var.getF182175a()).booleanValue() ? "clock" : "keyboard", null, 0L, mVar8, 0, 12);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        s62.a.f157643a.getClass();
                        dVarA4 = v62.k1.a(t62.b.f162798a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA4 = v62.h1.a(t62.b.f162798a);
                    }
                    u4.d dVar3 = dVarA4;
                    long jA2 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar9);
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVar3, null, x2.q(aVar13, j92.b.f97901d.f97904c), jA2, mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    i3.r1 r1Var = i3.r1.f89474a;
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(mVar10).f().a();
                    r1Var.getClass();
                    i3.s1.a(zBooleanValue, null, null, false, i3.r1.a(jA3, 0L, mVar10, 62), mVar10, 48, 44);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p1Var.setValue(o4.z1.a(y7.c((g6.l) obj, (g6.l) obj2)));
                return Unit.INSTANCE;
            case 13:
                p1Var.setValue(o4.z1.a(y7.c((g6.l) obj, (g6.l) obj2)));
                return Unit.INSTANCE;
            case 14:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    if (((dg0.a) p1Var.getF182175a()) == dg0.a.PRIMARY_EVENT) {
                        mVar11.C(1891350178);
                        s62.a.f157643a.getClass();
                        u4.d dVarA5 = v62.e1.a(t62.b.f162798a);
                        long jG = fb1.c.g(d92.b.f58623a, mVar11);
                        h4.r.a aVar15 = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA5, null, jg.b.O(aVar15, j92.b.f97901d.f97904c, mVar11), jG, mVar11, 48, 0);
                        mVar11.f();
                    } else {
                        mVar11.C(1891723139);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    if (((dg0.a) p1Var.getF182175a()) == dg0.a.SUPPORTING_EVENT) {
                        mVar12.C(737358187);
                        s62.a.f157643a.getClass();
                        u4.d dVarA6 = v62.e1.a(t62.b.f162798a);
                        long jG2 = fb1.c.g(d92.b.f58623a, mVar12);
                        h4.r.a aVar17 = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA6, null, jg.b.O(aVar17, j92.b.f97901d.f97904c, mVar12), jG2, mVar12, 48, 0);
                        mVar12.f();
                    } else {
                        mVar12.C(737731148);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar18 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    if (((dg0.a) p1Var.getF182175a()) == dg0.a.NO_PRIORITY) {
                        mVar13.C(-1004580431);
                        s62.a.f157643a.getClass();
                        u4.d dVarA7 = v62.e1.a(t62.b.f162798a);
                        long jG3 = fb1.c.g(d92.b.f58623a, mVar13);
                        h4.r.a aVar19 = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA7, null, jg.b.O(aVar19, j92.b.f97901d.f97904c, mVar13), jG3, mVar13, 48, 0);
                        mVar13.f();
                    } else {
                        mVar13.C(-1004230658);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                DeviceAutoDetectActivity.a aVar20 = DeviceAutoDetectActivity.f41730c;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    boolean z15 = ((Boolean) p1Var.getF182175a()) == null;
                    jg1.a.f98724a.getClass();
                    g02.s0.a(null, z15, jg1.a.f98725b, mVar14, 384, 1);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar15, p1Var.getF182175a() != 0 ? R.string.review_content_restore_original : R.string.review_content_translate);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar15), mVar15, 0, 0, 131070);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    h4.r.a aVar21 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ2 = x2.q(aVar21, j92.b.f97901d.f97905d);
                    Object objQ3 = mVar16.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new jt1.h(p1Var, 1);
                        mVar16.K(objQ3);
                    }
                    jt1.c.f100809a.getClass();
                    h7.a((e23.a) objQ3, rVarQ2, false, null, null, jt1.c.f100810b, mVar16, 1572870, 60);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 20:
                b5.a0 a0Var = (b5.a0) obj;
                a0Var.getClass();
                p1Var.setValue(n4.c.a(a0Var.f15750c));
                return Unit.INSTANCE;
            case 21:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    t4.d dVarA8 = n5.c.a(((Boolean) p1Var.getF182175a()).booleanValue() ? R.drawable.ic_arrow_up_filled : R.drawable.ic_arrow_down_filled, mVar17, 0);
                    long jA4 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar17);
                    g6.f.a aVar22 = g6.f.f75994b;
                    i7.a(dVarA8, null, x2.q(h4.r.S, 10), jA4, mVar17, 432, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i17 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    g6.f.a aVar23 = g6.f.f75994b;
                    k2.h hVarA = k2.i.a(8);
                    long jZ = fb1.c.z(d92.b.f58623a, mVar18);
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA, jZ, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(842331147, new l1(p1Var, 28, z14 ? (byte) 1 : (byte) 0), mVar18), mVar18, 12582912, 105);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                int i18 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    p3.x1 x1Var19 = p3.n.f135158a;
                    g6.f.a aVar24 = g6.f.f75994b;
                    k2.h hVarA2 = k2.i.a(8);
                    long jZ2 = fb1.c.z(d92.b.f58623a, mVar19);
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA2, jZ2, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(1131112725, new l1(p1Var, 25, z14 ? (byte) 1 : (byte) 0), mVar19), mVar19, 12582912, 105);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                int i19 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    p3.x1 x1Var20 = p3.n.f135158a;
                    g6.f.a aVar25 = g6.f.f75994b;
                    k2.h hVarA3 = k2.i.a(8);
                    long jZ3 = fb1.c.z(d92.b.f58623a, mVar20);
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA3, jZ3, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(-1974035960, new l1(p1Var, 26, z14 ? (byte) 1 : (byte) 0), mVar20), mVar20, 12582912, 105);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                int i24 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    p3.x1 x1Var21 = p3.n.f135158a;
                    h4.r rVarB = u1.a2.b(h4.r.S, u1.a2.a(mVar21), true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarB, j92.b.f97899b.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar26 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar26, mVar21, 48);
                    int iHashCode2 = Long.hashCode(mVar21.getU());
                    p3.i2 i2VarX2 = mVar21.x();
                    h4.r rVarC2 = h4.k.c(rVarY, mVar21);
                    h5.g.V.getClass();
                    h5.e0.a aVar27 = h5.g.a.f81805b;
                    if (mVar21.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar21.z();
                    if (mVar21.getT()) {
                        mVar21.M(aVar27);
                    } else {
                        mVar21.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar21);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar21);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar21.getT() || !p005kotlin.jvm.internal.s.g(mVar21.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar21, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar21);
                    c2.b0 b0Var = c2.b0.f22601a;
                    Object objQ4 = mVar21.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ4 == c2565a) {
                        ue2.a aVarH = new ue2.e().h();
                        String str2 = aVarH != null ? aVarH.name() + " (" + aVarH.f170259a + ")" : null;
                        mVar21.K(str2);
                        objQ4 = str2;
                    }
                    String str3 = (String) objQ4;
                    Object objQ5 = mVar21.q();
                    if (objQ5 == c2565a) {
                        w13.c<ue2.a> cVar2 = ue2.a.f170258q;
                        ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                        for (ue2.a aVar28 : cVar2) {
                            arrayList.add(aVar28.name() + " (" + aVar28.f170259a + ")");
                        }
                        objQ5 = p3.p0.n(arrayList);
                        mVar21.K(objQ5);
                    }
                    p3.p1 p1Var2 = (p3.p1) objQ5;
                    Object objQ6 = mVar21.q();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ6 == c2565a2) {
                        List list = (List) p1Var2.getF182175a();
                        List list2 = (List) p1Var2.getF182175a();
                        if (str3 == null) {
                            str3 = (String) p13.h0.b0((List) p1Var2.getF182175a());
                        }
                        objQ6 = p3.p0.n(list.get(list2.indexOf(str3)));
                        mVar21.K(objQ6);
                    }
                    p3.p1 p1Var3 = (p3.p1) objQ6;
                    List list3 = (List) p1Var2.getF182175a();
                    String str4 = (String) p1Var3.getF182175a();
                    h4.r.a aVar29 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC3 = c2.l.C(aVar29, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    Object objQ7 = mVar21.q();
                    int i25 = 12;
                    if (objQ7 == c2565a2) {
                        objQ7 = new ky0.k(p1Var3, i25);
                        mVar21.K(objQ7);
                    }
                    l72.g1.b(rVarC3, "Test Error", list3, str4, "Set Test Error", null, null, false, true, null, (e23.l) objQ7, mVar21, 100687920, 736);
                    l72.f0 f0Var3 = l72.f0.f110999a;
                    h4.r rVarC4 = c2.l.C(x2.f(aVar29, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    Object objQ8 = mVar21.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new j1(p1Var3, p1Var, 16);
                        mVar21.K(objQ8);
                    }
                    f0Var3.d(24624, 9, (e23.a) objQ8, rVarC4, "Save", mVar21, null, false);
                    h4.r rVarC5 = c2.l.C(x2.f(aVar29, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    Object objQ9 = mVar21.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new l51.c(p1Var, 12);
                        mVar21.K(objQ9);
                    }
                    f0Var3.i("Cancel", rVarC5, false, (e23.a) objQ9, mVar21, 3078, 4);
                    mVar21.y();
                    p3.x1 x1Var22 = p3.n.f135158a;
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 26:
                return a(obj, obj2);
            case 27:
                return b(obj, obj2);
            case 28:
                return c(obj, obj2);
            default:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                int i26 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    p3.x1 x1Var23 = p3.n.f135158a;
                    g6.f.a aVar30 = g6.f.f75994b;
                    k2.h hVarA4 = k2.i.a(8);
                    long jZ4 = fb1.c.z(d92.b.f58623a, mVar22);
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA4, jZ4, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(1547965473, new l1(p1Var, 27, z14 ? (byte) 1 : (byte) 0), mVar22), mVar22, 12582912, 105);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l1(p3.p1 p1Var, int i14, byte b14) {
        this.f4064a = i14;
        this.f4065b = p1Var;
    }
}
