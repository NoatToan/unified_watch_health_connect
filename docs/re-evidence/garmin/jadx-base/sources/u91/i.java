package u91;

import am.q1;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Parcelable;
import bd0.u;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionActivity;
import com.garmin.device.filetransfer.core.background.BackgroundTransferWorker;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.roomorama.caldroid.CaldroidFragment;
import e23.p;
import e23.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.i7;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import l72.f0;
import l72.h3;
import lc.m0;
import lc.u0;
import lc.v0;
import ok2.g0;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import tn2.s0;
import u1.a2;
import ug2.x;
import uj1.c0;
import uj1.i0;
import uj1.j0;
import v62.e1;
import vd0.l0;
import yj1.o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f169558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f169559c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f169557a = i14;
        this.f169558b = obj;
        this.f169559c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:191:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:196:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:201:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:206:0x070a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0727  */
    /* JADX WARN: Code duplicated, block: B:216:0x0745  */
    /* JADX WARN: Code duplicated, block: B:221:0x0762  */
    /* JADX WARN: Code duplicated, block: B:226:0x077f  */
    /* JADX WARN: Code duplicated, block: B:265:0x08be  */
    /* JADX WARN: Code duplicated, block: B:270:0x08db  */
    /* JADX WARN: Code duplicated, block: B:275:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:280:0x0915  */
    /* JADX WARN: Code duplicated, block: B:290:0x0955  */
    /* JADX WARN: Code duplicated, block: B:329:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:344:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c4  */
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
        Object obj3;
        Object value;
        Object value2;
        int i14 = this.f169557a;
        int i15 = 5;
        int i16 = 4;
        int i17 = 6;
        m.a aVar = m.f135153a;
        int i18 = 0;
        int iCompare = 0;
        int i19 = 3;
        int i24 = 2;
        final int i25 = 1;
        Object obj4 = this.f169559c;
        Object obj5 = this.f169558b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.a((aa1.f) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ua0.b.a((l90.b) obj5, (e23.l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                Parcelable.Creator<ub1.h> creator = ub1.h.CREATOR;
                ((ub1.h) obj5).U0((r) obj4, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 3:
                fg0.k kVar = (fg0.k) obj5;
                RaceTimePredictionActivity raceTimePredictionActivity = (RaceTimePredictionActivity) obj4;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                RaceTimePredictionActivity.a aVar2 = RaceTimePredictionActivity.f41078b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar);
                    String str = com.garmin.android.apps.connectmobile.race_time_prediction.presentation.a.b.f41086b.f41084a;
                    boolean zR = mVar.r(kVar) | mVar.r(raceTimePredictionActivity) | mVar.r(m0VarI);
                    Object objQ = mVar.q();
                    if (zR) {
                        obj3 = objQ;
                        s0 s0Var = new s0(kVar, 7, raceTimePredictionActivity, m0VarI);
                        mVar.K(s0Var);
                        obj3 = s0Var;
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            obj3 = objQ;
                            s0 s0Var2 = new s0(kVar, 7, raceTimePredictionActivity, m0VarI);
                            mVar.K(s0Var2);
                            obj3 = s0Var2;
                        }
                    }
                    obj3 = objQ;
                    nc.y.b(m0VarI, str, null, null, null, null, null, null, (e23.l) obj3, mVar, 0, 1020);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                String str2 = (String) obj5;
                m0 m0Var = (m0) obj4;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    int i26 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    boolean zR2 = mVar2.r(m0Var);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new x(m0Var, i24);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new x(m0Var, i24);
                            mVar2.K(objQ2);
                        }
                    }
                    h3.e(dVarA, str2, null, null, (e23.a) objQ2, null, null, mVar2, 0, 108);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                yj1.a aVar3 = (yj1.a) obj5;
                p pVar = (p) obj4;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (aVar3.f197517b) {
                        mVar3.C(2106247286);
                        pVar.invoke(mVar3, 6);
                        mVar3.f();
                    } else {
                        mVar3.C(2106288609);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                yj1.b bVar = (yj1.b) obj5;
                e23.l lVar = (e23.l) obj4;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    hf.a(bVar.f197524g, lVar, null, false, d92.c.a(ff.f88115a, mVar4), mVar4, 0, 92);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e) obj5;
                x3 x3Var = (x3) obj4;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarB = a2.b(x2.d(aVar5, 1.0f), a2.a(mVar5), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC = h4.k.c(rVarB, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar5);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar5, j92.b.f97899b.f97920e), mVar5);
                    yj1.b bVar3 = (yj1.b) x3Var.getF182175a();
                    boolean zR3 = mVar5.r(eVar);
                    Object objQ3 = mVar5.q();
                    if (zR3) {
                        objQ3 = new uj1.b0(eVar, i19);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new uj1.b0(eVar, i19);
                            mVar5.K(objQ3);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ3;
                    boolean zR4 = mVar5.r(eVar);
                    Object objQ4 = mVar5.q();
                    if (zR4) {
                        objQ4 = new uj1.b0(eVar, i16);
                        mVar5.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new uj1.b0(eVar, i16);
                            mVar5.K(objQ4);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ4;
                    boolean zR5 = mVar5.r(eVar);
                    Object objQ5 = mVar5.q();
                    if (zR5) {
                        objQ5 = new uj1.b0(eVar, i15);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new uj1.b0(eVar, i15);
                            mVar5.K(objQ5);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ5;
                    boolean zR6 = mVar5.r(eVar);
                    Object objQ6 = mVar5.q();
                    if (zR6) {
                        objQ6 = new c0(eVar, i24);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new c0(eVar, i24);
                            mVar5.K(objQ6);
                        }
                    }
                    uj1.z.e(bVar3, aVar7, aVar8, aVar9, (e23.l) objQ6, mVar5, 0);
                    if (((yj1.b) x3Var.getF182175a()).f197524g) {
                        mVar5.C(-906304140);
                        String str3 = ((yj1.b) x3Var.getF182175a()).f197525h;
                        if (str3 == null) {
                            str3 = "";
                        }
                        boolean zR7 = mVar5.r(eVar);
                        Object objQ7 = mVar5.q();
                        if (zR7) {
                            objQ7 = new c0(eVar, i19);
                            mVar5.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == m.a.f135155b) {
                                objQ7 = new c0(eVar, i19);
                                mVar5.K(objQ7);
                            }
                        }
                        uj1.z.a(str3, (e23.l) objQ7, mVar5, 0);
                        mVar5.f();
                    } else {
                        mVar5.C(-906075422);
                        mVar5.f();
                    }
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                h82.r rVar = (h82.r) obj5;
                i0 i0Var = (i0) obj4;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i27 = i0.f171523j;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    rVar.t(R.string.incident_detection_how_to_use_safety_features, mVar6, 0);
                    if (i0Var.f171524f) {
                        mVar6.C(-801995050);
                        rVar.o(R.string.msg_how_to_use_safety_features_plus, 0, 2, null, mVar6);
                        mVar6.f();
                    } else {
                        mVar6.C(-801895013);
                        rVar.o(R.string.msg_how_to_use_safety_features, 0, 2, null, mVar6);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f) obj5;
                p1 p1Var = (p1) obj4;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar10 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    o oVar = (o) p1Var.getF182175a();
                    boolean zR8 = mVar7.r(fVar);
                    Object objQ8 = mVar7.q();
                    if (zR8) {
                        objQ8 = new uj1.m0(fVar, i19);
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new uj1.m0(fVar, i19);
                            mVar7.K(objQ8);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ8;
                    boolean zR9 = mVar7.r(fVar);
                    Object objQ9 = mVar7.q();
                    if (zR9) {
                        objQ9 = new uj1.m0(fVar, i16);
                        mVar7.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new uj1.m0(fVar, i16);
                            mVar7.K(objQ9);
                        }
                    }
                    e23.a aVar12 = (e23.a) objQ9;
                    boolean zR10 = mVar7.r(fVar);
                    Object objQ10 = mVar7.q();
                    if (zR10) {
                        objQ10 = new uj1.m0(fVar, i15);
                        mVar7.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new uj1.m0(fVar, i15);
                            mVar7.K(objQ10);
                        }
                    }
                    e23.a aVar13 = (e23.a) objQ10;
                    boolean zR11 = mVar7.r(fVar);
                    Object objQ11 = mVar7.q();
                    if (zR11) {
                        objQ11 = new uj1.m0(fVar, i17);
                        mVar7.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new uj1.m0(fVar, i17);
                            mVar7.K(objQ11);
                        }
                    }
                    e23.a aVar14 = (e23.a) objQ11;
                    boolean zR12 = mVar7.r(fVar);
                    Object objQ12 = mVar7.q();
                    if (zR12) {
                        objQ12 = new uj1.m0(fVar, 7);
                        mVar7.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new uj1.m0(fVar, 7);
                            mVar7.K(objQ12);
                        }
                    }
                    e23.a aVar15 = (e23.a) objQ12;
                    boolean zR13 = mVar7.r(fVar);
                    Object objQ13 = mVar7.q();
                    if (zR13) {
                        objQ13 = new j0(fVar, i15);
                        mVar7.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new j0(fVar, i15);
                            mVar7.K(objQ13);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ13;
                    boolean zR14 = mVar7.r(fVar);
                    Object objQ14 = mVar7.q();
                    if (zR14) {
                        objQ14 = new j0(fVar, i17);
                        mVar7.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new j0(fVar, i17);
                            mVar7.K(objQ14);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ14;
                    boolean zR15 = mVar7.r(fVar);
                    Object objQ15 = mVar7.q();
                    if (zR15) {
                        objQ15 = new j0(fVar, 7);
                        mVar7.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == m.a.f135155b) {
                            objQ15 = new j0(fVar, 7);
                            mVar7.K(objQ15);
                        }
                    }
                    uj1.z.d(oVar, aVar11, aVar12, aVar13, aVar14, aVar15, lVar2, lVar3, (e23.l) objQ15, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                q1 q1Var = (q1) obj5;
                Comparator comparator = (Comparator) obj4;
                x0 x0Var = (x0) obj;
                x0 x0Var2 = (x0) obj2;
                uk0.i iVar = uk0.i.f171830a;
                if (x0Var != x0Var2) {
                    x0Var.getClass();
                    x0 x0VarD = z0.d(x0Var, x0Var);
                    x0Var2.getClass();
                    x0 x0VarD2 = z0.d(x0Var2, x0Var2);
                    iCompare = q1Var.compare(x0VarD, x0VarD2);
                    if (iCompare == 0) {
                        iCompare = x0Var == x0VarD ? -1 : x0Var2 == x0VarD2 ? 1 : comparator.compare(x0Var, x0Var2);
                    }
                }
                return Integer.valueOf(iCompare);
            case 11:
                jk0.o oVar2 = (jk0.o) obj5;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    if (oVar2.equals(obj4)) {
                        mVar8.C(101514920);
                        r.a aVar16 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.a(n5.c.a(R.drawable.check, mVar8, 0), null, x2.q(aVar16, j92.b.f97901d.f97904c), u0.f(mVar8), mVar8, 48, 0);
                        mVar8.f();
                    } else {
                        mVar8.C(101871420);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 12:
                q qVar = (q) obj5;
                uk0.a aVar17 = (uk0.a) obj4;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97919d;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    r.a aVar18 = r.S;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar9, 0);
                    int iHashCode2 = Long.hashCode(mVar9.getU());
                    i2 i2VarX2 = mVar9.x();
                    r rVarC2 = h4.k.c(aVar18, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar19);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar9);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar9, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar9);
                    u2 u2Var = u2.f22900a;
                    if (qVar != null) {
                        mVar9.C(1976068287);
                        qVar.invoke(u2Var, mVar9, 6);
                        mVar9.f();
                    } else {
                        mVar9.C(1976114415);
                        mVar9.f();
                    }
                    i7.b(aVar17.f171796b.f25613a, null, x2.q(aVar18, j92.b.f97901d.f97905d), u0.f(mVar9), mVar9, 48, 0);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ur2.b.a((vr2.q) obj5, (e23.l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ux1.j.a((dy1.f) obj5, (String) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                Map map = (Map) obj5;
                String str4 = (String) obj4;
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar3, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode3 = Long.hashCode(mVar10.getU());
                    i2 i2VarX3 = mVar10.x();
                    r rVarC3 = h4.k.c(rVarF, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar20);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar10, iHashCode3, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar10);
                    b0 b0Var2 = b0.f22601a;
                    List list = (List) map.get(str4);
                    if (list == null) {
                        mVar10.C(1964005592);
                        mVar10.f();
                    } else {
                        mVar10.C(1964005593);
                        for (Object obj6 : list) {
                            int i28 = i18 + 1;
                            if (i18 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj6;
                            e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                            r.a aVar21 = r.S;
                            e3Var.v(3462, activityListItemDTO, null, x2.f(aVar21, 1.0f), mVar10, false);
                            if (i18 < list.size() - 1) {
                                mVar10.C(-755383217);
                                r rVarF2 = x2.f(aVar21, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                c2.l.f(x2.h(rVarF2, j92.b.f97899b.f97920e), mVar10);
                                mVar10.f();
                            } else {
                                mVar10.C(-755002661);
                                mVar10.f();
                            }
                            i18 = i28;
                        }
                        mVar10.f();
                    }
                    mVar10.y();
                    x1 x1Var11 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                v50.a.a((x50.d) obj5, (r) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                vc0.q qVar2 = (vc0.q) obj4;
                ((Integer) obj2).getClass();
                Logger logger = vc0.q.f177002e;
                ((DialogInterface) obj).getClass();
                kh2.g.f104792a.getClass();
                kh2.g.a.e((androidx.fragment.app.m) obj5);
                new u(qVar2.f177003c.getUnitID(), new vc0.r(qVar2)).a();
                return Unit.INSTANCE;
            case 18:
                vc0.s sVar = (vc0.s) obj5;
                ((Integer) obj2).getClass();
                Logger logger2 = vc0.s.f177006e;
                ((DialogInterface) obj).getClass();
                kh2.g.a aVar22 = kh2.g.f104792a;
                Context context = sVar.f64388a;
                aVar22.getClass();
                kh2.g.a.e(context);
                vc0.s.v(sVar, (fi2.x) obj4, 4);
                return Unit.INSTANCE;
            case 19:
                vc0.s sVar2 = (vc0.s) obj5;
                ((Integer) obj2).getClass();
                Logger logger3 = vc0.s.f177006e;
                ((DialogInterface) obj).getClass();
                kh2.g.a aVar23 = kh2.g.f104792a;
                Context context2 = sVar2.f64388a;
                aVar23.getClass();
                kh2.g.a.e(context2);
                vc0.s.v(sVar2, (fi2.y) obj4, 2);
                return Unit.INSTANCE;
            case 20:
                oe0.d dVar = (oe0.d) obj5;
                Calendar calendar = (Calendar) obj;
                String str5 = (String) obj2;
                calendar.getClass();
                str5.getClass();
                ((p1) obj4).setValue(calendar);
                String strE = g22.n.e(str5);
                dVar.getClass();
                p2 p2Var = dVar.f131261f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, pe0.c.a((pe0.c) value, null, null, null, null, null, 0.0d, null, strE, false, null, 895)));
                LocalDate localDate = new LocalDate(calendar.getTimeInMillis());
                String strPrint = str5.equals(CaldroidFragment.MONTH) ? DateTimeFormat.forPattern("yyyy-MM-dd").print(localDate.withDayOfMonth(1)) : DateTimeFormat.forPattern("yyyy-MM-dd").print(localDate);
                strPrint.getClass();
                dVar.x4(strPrint);
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                vd0.l.c((Uri) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                vd0.p.e((zc.d) obj5, (e23.a) obj4, (m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 23:
                pe0.g gVar = (pe0.g) obj5;
                pe0.g gVar2 = (pe0.g) obj4;
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    if (gVar == gVar2) {
                        mVar11.C(1225408685);
                        r.a aVar24 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ = x2.q(aVar24, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, rVarQ, u0.f(mVar11), mVar11, 48, 0);
                        mVar11.f();
                    } else {
                        mVar11.C(1225749809);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                l0.c((pe0.h) obj5, (e23.l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                p1 p1Var2 = (p1) obj5;
                pe0.g gVar3 = (pe0.g) obj4;
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    f0.a aVar25 = f0.a.f111000a;
                    z3.e eVarC = z3.f.c(-1588867079, new vd0.x(gVar3, i25), mVar12);
                    boolean zB = mVar12.B(p1Var2);
                    Object objQ16 = mVar12.q();
                    if (zB) {
                        objQ16 = new vd0.c(p1Var2, 2);
                        mVar12.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == m.a.f135155b) {
                            objQ16 = new vd0.c(p1Var2, 2);
                            mVar12.K(objQ16);
                        }
                    }
                    aVar25.g(6, 6, (e23.a) objQ16, eVarC, null, mVar12, false);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                oe0.s sVar3 = (oe0.s) obj5;
                Calendar calendar2 = (Calendar) obj;
                String str6 = (String) obj2;
                calendar2.getClass();
                str6.getClass();
                ((p1) obj4).setValue(calendar2);
                String strE2 = g22.n.e(str6);
                sVar3.getClass();
                p2 p2Var2 = sVar3.f131412h;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.j.a((pe0.j) value2, null, null, null, null, null, 0.0d, null, strE2, false, null, null, 1919)));
                LocalDate localDate2 = new LocalDate(calendar2.getTimeInMillis());
                String strPrint2 = str6.equals(CaldroidFragment.MONTH) ? DateTimeFormat.forPattern("yyyy-MM-dd").print(localDate2.withDayOfMonth(1)) : DateTimeFormat.forPattern("yyyy-MM-dd").print(localDate2);
                strPrint2.getClass();
                sVar3.y4(strPrint2);
                return Unit.INSTANCE;
            case 27:
                vk2.g gVar4 = (vk2.g) obj5;
                al2.b bVar6 = (al2.b) obj;
                CoreTransferException coreTransferException = (CoreTransferException) obj2;
                BackgroundTransferWorker.a aVar26 = BackgroundTransferWorker.f50764q;
                bVar6.getClass();
                rs2.c cVar = ((ok2.g) obj4).f132682a;
                al2.c cVar2 = new al2.c(cVar, g0.AUTOMATIC_STANDARD, bVar6, coreTransferException, null, 0, false, false, PsExtractor.VIDEO_STREAM_MASK, null);
                gVar4.f178678j.put(cVar.getF92741e(), cVar2);
                gVar4.f178675g.debug("Sync request: " + bVar6 + ", " + coreTransferException);
                gVar4.b(cVar2);
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                vn.a.a((im.b) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                h82.r rVar2 = (h82.r) obj5;
                final vp1.f fVar2 = (vp1.f) obj4;
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i29 = vp1.f.f179398h;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    boolean zR16 = mVar13.r(fVar2);
                    Object objQ17 = mVar13.q();
                    if (zR16) {
                        final int i30 = false ? 1 : 0;
                        objQ17 = new e23.a() { // from class: vp1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i34 = i30;
                                f fVar3 = fVar2;
                                switch (i34) {
                                    case 0:
                                        int i35 = f.f179398h;
                                        fVar3.e("CHARGE_OVERVIEW");
                                        break;
                                    default:
                                        int i36 = f.f179398h;
                                        fVar3.e("MAXIMIZING_CHARGE");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar13.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == m.a.f135155b) {
                            final int i34 = false ? 1 : 0;
                            objQ17 = new e23.a() { // from class: vp1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i35 = i34;
                                    f fVar3 = fVar2;
                                    switch (i35) {
                                        case 0:
                                            int i36 = f.f179398h;
                                            fVar3.e("CHARGE_OVERVIEW");
                                            break;
                                        default:
                                            int i37 = f.f179398h;
                                            fVar3.e("MAXIMIZING_CHARGE");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar13.K(objQ17);
                        }
                    }
                    rVar2.B(R.string.help_solar_charging_overview, null, false, (e23.a) objQ17, mVar13, 0, 6);
                    boolean zR17 = mVar13.r(fVar2);
                    Object objQ18 = mVar13.q();
                    if (zR17) {
                        objQ18 = new e23.a() { // from class: vp1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i35 = i25;
                                f fVar3 = fVar2;
                                switch (i35) {
                                    case 0:
                                        int i36 = f.f179398h;
                                        fVar3.e("CHARGE_OVERVIEW");
                                        break;
                                    default:
                                        int i37 = f.f179398h;
                                        fVar3.e("MAXIMIZING_CHARGE");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar13.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == m.a.f135155b) {
                            objQ18 = new e23.a() { // from class: vp1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i35 = i25;
                                    f fVar3 = fVar2;
                                    switch (i35) {
                                        case 0:
                                            int i36 = f.f179398h;
                                            fVar3.e("CHARGE_OVERVIEW");
                                            break;
                                        default:
                                            int i37 = f.f179398h;
                                            fVar3.e("MAXIMIZING_CHARGE");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar13.K(objQ18);
                        }
                    }
                    rVar2.B(R.string.help_solar_charging_maximizing, null, false, (e23.a) objQ18, mVar13, 0, 6);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i14, int i15) {
        this.f169557a = i15;
        this.f169558b = obj;
        this.f169559c = obj2;
    }
}
