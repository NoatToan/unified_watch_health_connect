package w61;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.c f183198b;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar, int i14) {
        this.f183197a = i14;
        this.f183198b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x028d  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:276:0x08af  */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v31, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v42, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        hy1.a aVarValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        int i14;
        int i15;
        Object obj5;
        Object obj6;
        String strName;
        Object obj7;
        Object obj8;
        Object obj9;
        int i16 = this.f183197a;
        int i17 = 14;
        int i18 = 12;
        p3.m.a aVar = p3.m.f135153a;
        int i19 = 16;
        final com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar = this.f183198b;
        boolean z14 = true;
        final int i24 = 0;
        switch (i16) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    cVar.w(mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    cVar.p(mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    cVar.n(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    cVar.q(mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    cVar.o(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                h82.r rVar = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                rVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar.D(R.string.gcm_receiving_training_status_title, mVar6, (iIntValue6 << 3) & 112);
                    int i25 = (iIntValue6 << 6) & 896;
                    rVar.o(R.string.gcm_receiving_training_status_description_1_v3, i25, 2, null, mVar6);
                    rVar.o(R.string.gcm_receiving_training_status_description_2, i25, 2, null, mVar6);
                    rVar.o(R.string.gcm_receiving_training_status_description_3, i25, 2, null, mVar6);
                    if (cVar.f40123f > 1) {
                        mVar6.C(-937033760);
                        rVar.c(mVar6, iIntValue6 & 14);
                        Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                        boolean zR = mVar6.r(context);
                        Object objQ = mVar6.q();
                        if (zR) {
                            obj4 = objQ;
                            Object hVar = new tz1.h(context, i17);
                            mVar6.K(hVar);
                            obj4 = hVar;
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj4 = objQ;
                                Object hVar2 = new tz1.h(context, i17);
                                mVar6.K(hVar2);
                                obj4 = hVar2;
                            }
                        }
                        obj4 = objQ;
                        rVar.v((e23.a) obj4, R.string.manage_primary_training_device_link, mVar6, (iIntValue6 << 9) & 7168);
                        mVar6.f();
                    } else {
                        mVar6.C(-936715669);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    cVar.t(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar9 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                rVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar2) ? 4 : 2;
                }
                int i26 = iIntValue8;
                if (mVar8.n(i26 & 1, (i26 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    final Context context2 = (Context) mVar8.A(y3Var);
                    rVar2.D(R.string.gcm_training_status_vo2_max_header, mVar8, (i26 << 3) & 112);
                    UserSettingsDTO.c cVarG = GCMSettingManager.s().G();
                    if (cVarG == null || (strName = cVarG.name()) == null || (aVarValueOf = hy1.a.valueOf(strName)) == null) {
                        aVarValueOf = hy1.a.NOT_SPECIFIED;
                    }
                    if (aVarValueOf == hy1.a.NOT_SPECIFIED) {
                        aVarValueOf = hy1.a.MALE;
                    }
                    hy1.b.a aVar10 = hy1.b.f86367a;
                    f12.l.f68084a.getClass();
                    int iU = f12.l.a.a().u();
                    aVar10.getClass();
                    o13.p pVarA = hy1.b.a.a(aVarValueOf, iU);
                    String strQ = gl1.y.Q(mVar8, R.string.gcm_training_status_vo2_max_description_1_short);
                    Object objQ2 = mVar8.q();
                    aVar.getClass();
                    Object obj10 = p3.m.a.f135155b;
                    Object obj11 = objQ2;
                    if (objQ2 == obj10) {
                        Object dVar = new w40.d(i18);
                        mVar8.K(dVar);
                        obj11 = dVar;
                    }
                    int i27 = (i26 << 6) & 896;
                    rVar2.p(strQ, oi0.c.A(context2, (e23.l) obj11, strQ), mVar8, i27);
                    h4.r.a aVar11 = h4.r.S;
                    float f14 = 8;
                    g6.f.a aVar12 = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(aVar11, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode = Long.hashCode(mVar8.getU());
                    i2 i2VarX = mVar8.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar13 = h5.g.a.f81805b;
                    String strP = null;
                    if (mVar8.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar13);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar8);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar8);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (pVarA != null) {
                        mVar8.C(-975404056);
                        String strP2 = gl1.y.P(R.string.activities_lbl_value1_and_up, new Object[]{String.valueOf(((o13.p[]) pVarA.f128595b)[0].f128594a)}, mVar8);
                        mVar8.f();
                        str = strP2;
                    } else {
                        mVar8.C(-975260991);
                        mVar8.f();
                        str = null;
                    }
                    String strQ2 = gl1.y.Q(mVar8, R.string.lbl_superior);
                    f02.f0.f67733a.getClass();
                    gl.c cVar2 = gl.c.f77766a;
                    cVar2.getClass();
                    gl.e eVar = gl.c.f77767b;
                    long j8 = eVar.U;
                    final com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar3 = this.f183198b;
                    cVar3.m(0, 8, j8, strQ2, str, mVar8, false);
                    if (pVarA != null) {
                        B b14 = pVarA.f128595b;
                        mVar8.C(-974984409);
                        o13.p[] pVarArr = (o13.p[]) b14;
                        String strP3 = gl1.y.P(R.string.lbl_value1_to_value2, new Object[]{String.valueOf(pVarArr[1].f128594a), String.valueOf(pVarArr[1].f128595b)}, mVar8);
                        mVar8.f();
                        str2 = strP3;
                    } else {
                        mVar8.C(-974809631);
                        mVar8.f();
                        str2 = null;
                    }
                    String strQ3 = gl1.y.Q(mVar8, R.string.lbl_excellent);
                    cVar2.getClass();
                    cVar3.m(0, 8, eVar.f77805s, strQ3, str2, mVar8, false);
                    if (pVarA != null) {
                        B b15 = pVarA.f128595b;
                        mVar8.C(-974531065);
                        o13.p[] pVarArr2 = (o13.p[]) b15;
                        String strP4 = gl1.y.P(R.string.lbl_value1_to_value2, new Object[]{String.valueOf(pVarArr2[2].f128594a), String.valueOf(pVarArr2[2].f128595b)}, mVar8);
                        mVar8.f();
                        str3 = strP4;
                    } else {
                        mVar8.C(-974356287);
                        mVar8.f();
                        str3 = null;
                    }
                    String strQ4 = gl1.y.Q(mVar8, R.string.lbl_good);
                    cVar2.getClass();
                    cVar3.m(0, 8, eVar.A, strQ4, str3, mVar8, false);
                    if (pVarA != null) {
                        B b16 = pVarA.f128595b;
                        mVar8.C(-974087641);
                        o13.p[] pVarArr3 = (o13.p[]) b16;
                        String strP5 = gl1.y.P(R.string.lbl_value1_to_value2, new Object[]{String.valueOf(pVarArr3[3].f128594a), String.valueOf(pVarArr3[3].f128595b)}, mVar8);
                        mVar8.f();
                        str4 = strP5;
                    } else {
                        mVar8.C(-973912863);
                        mVar8.f();
                        str4 = null;
                    }
                    String strQ5 = gl1.y.Q(mVar8, R.string.lbl_fair);
                    cVar2.getClass();
                    cVar3.m(0, 8, eVar.O, strQ5, str4, mVar8, false);
                    if (pVarA != null) {
                        mVar8.C(-973624284);
                        strP = gl1.y.P(R.string.activities_lbl_value1_and_below, new Object[]{String.valueOf(((o13.p[]) pVarA.f128595b)[4].f128595b)}, mVar8);
                        mVar8.f();
                    } else {
                        mVar8.C(-973477375);
                        mVar8.f();
                    }
                    String str5 = strP;
                    String strQ6 = gl1.y.Q(mVar8, R.string.lbl_poor);
                    cVar2.getClass();
                    cVar3.m(0, 8, eVar.f77772b0, strQ6, str5, mVar8, false);
                    mVar8.y();
                    e12.e eVarC = bo1.a.a().c();
                    if (eVarC.o0()) {
                        i14 = 916048182;
                        i15 = R.string.gcm_training_status_vo2_max_description_5_including_rowing;
                    } else {
                        i14 = 916051621;
                        i15 = R.string.gcm_training_status_vo2_max_description_5;
                    }
                    String strH = sn.a.h(mVar8, i14, i15, mVar8);
                    Object objQ3 = mVar8.q();
                    Object obj12 = objQ3;
                    if (objQ3 == obj10) {
                        Object dVar2 = new w40.d(13);
                        mVar8.K(dVar2);
                        obj12 = dVar2;
                    }
                    rVar2.p(strH, oi0.c.A(context2, (e23.l) obj12, strH), mVar8, i27);
                    if (eVarC.S()) {
                        mVar8.C(-1666934289);
                        String strQ7 = gl1.y.Q(mVar8, R.string.gcm_training_status_vo2_max_description_3_lowercase);
                        Object objQ4 = mVar8.q();
                        if (objQ4 == obj10) {
                            obj6 = objQ4;
                            Object dVar3 = new w40.d(i17);
                            mVar8.K(dVar3);
                            obj6 = dVar3;
                        }
                        obj6 = objQ4;
                        rVar2.p(strQ7, oi0.c.A(context2, (e23.l) obj6, strQ7), mVar8, i27);
                        mVar8.f();
                    } else {
                        mVar8.C(-1666734401);
                        mVar8.f();
                    }
                    if (eVarC.L0()) {
                        mVar8.C(-1666633496);
                        String strQ8 = gl1.y.Q(mVar8, R.string.vo2_max_and_training_status_title);
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        Object objQ5 = mVar8.q();
                        if (objQ5 == obj10) {
                            obj5 = objQ5;
                            Object dVar4 = new w40.d(15);
                            mVar8.K(dVar4);
                            obj5 = dVar4;
                        }
                        obj5 = objQ5;
                        r0Var.f105810a = oi0.c.A(context2, (e23.l) obj5, strQ8);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        float f15 = 16;
                        mh.c(strQ8, p5.v.c(new s0(r0Var, 11), c2.l.C(aVar11, f15, f15, f15, 0.0f, 8), false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar8), mVar8, 0, 0, 131068);
                        String strQ9 = gl1.y.Q(mVar8, R.string.gcm_training_status_vo2_max_description_2_lowercase);
                        Context context3 = (Context) mVar8.A(y3Var);
                        Object objQ6 = mVar8.q();
                        Object obj13 = objQ6;
                        if (objQ6 == obj10) {
                            Object dVar5 = new w40.d(i19);
                            mVar8.K(dVar5);
                            obj13 = dVar5;
                        }
                        r0Var.f105810a = oi0.c.A(context3, (e23.l) obj13, strQ9);
                        j92.f.f97924a.getClass();
                        mh.c(strQ9, p5.v.c(new s0(r0Var, 12), c2.l.C(aVar11, f15, f14, f15, 0.0f, 8), false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar8), mVar8, 0, 0, 131068);
                        mVar8.f();
                    } else {
                        mVar8.C(-1665442817);
                        mVar8.f();
                    }
                    String strP6 = gl1.y.P(R.string.gcm_training_status_vo2_max_description_4_lowercase, new Object[]{am.j.m("<link>", gl1.y.Q(mVar8, R.string.activities_cooper_institute), "</link>")}, mVar8);
                    String strP7 = gl1.y.P(R.string.gcm_training_status_vo2_max_description_4, new Object[]{d53.u.v(gl1.y.Q(mVar8, R.string.activities_cooper_institute), "®", "", false)}, mVar8);
                    Context context4 = (Context) mVar8.A(y3Var);
                    Object objQ7 = mVar8.q();
                    Object obj14 = objQ7;
                    if (objQ7 == obj10) {
                        Object dVar6 = new w40.d(17);
                        mVar8.K(dVar6);
                        obj14 = dVar6;
                    }
                    String strA = oi0.c.A(context4, (e23.l) obj14, strP7);
                    boolean zR2 = mVar8.r(cVar3) | mVar8.r(context2);
                    Object objQ8 = mVar8.q();
                    Object obj15 = objQ8;
                    if (zR2 || objQ8 == obj10) {
                        final int i28 = z14 ? 1 : 0;
                        Object obj16 = new e23.a() { // from class: w61.o
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i28;
                                Context context5 = context2;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar4 = cVar3;
                                switch (i29) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar14 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                                        h82.c.f(cVar4, context5, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar15 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                                        h82.c.f(cVar4, context5, "http://www.cooperinstitute.org");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(obj16);
                        obj15 = obj16;
                    }
                    rVar2.w(strP6, strA, (e23.a) obj15, mVar8, (i26 << 9) & 7168, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar14 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                rVar3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar3) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    int i29 = 26;
                    int i30 = ((iIntValue9 << 3) & 112) | 6;
                    rVar3.k(z3.f.c(-826429264, new vu0.h(rVar3, i29), mVar9), mVar9, i30);
                    rVar3.a(z3.f.c(-1255153881, new vq0.a(i29, rVar3, cVar), mVar9), mVar9, i30);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar15 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                rVar4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(rVar4) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    rVar4.D(R.string.lbl_vo2_max, mVar10, (iIntValue10 << 3) & 112);
                    rVar4.m((iIntValue10 << 6) & 896, 2, gl1.y.Q(mVar10, R.string.vo2_max_generic_description_learn_more), null, mVar10);
                    String strQ10 = gl1.y.Q(mVar10, R.string.lbl_what_is_vo2_max);
                    boolean zR3 = mVar10.r(cVar);
                    Object objQ9 = mVar10.q();
                    if (zR3) {
                        obj7 = objQ9;
                        Object lVar = new l(cVar, i24);
                        mVar10.K(lVar);
                        obj7 = lVar;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            obj7 = objQ9;
                            Object lVar2 = new l(cVar, i24);
                            mVar10.K(lVar2);
                            obj7 = lVar2;
                        }
                    }
                    obj7 = objQ9;
                    int i34 = (iIntValue10 << 12) & 57344;
                    rVar4.C(strQ10, null, false, (e23.a) obj7, mVar10, i34, 6);
                    String strQ11 = gl1.y.Q(mVar10, R.string.lbl_how_to_get_vo2_max);
                    boolean zR4 = mVar10.r(cVar);
                    Object objQ10 = mVar10.q();
                    if (zR4) {
                        obj8 = objQ10;
                        Object lVar3 = new l(cVar, z14 ? 1 : 0);
                        mVar10.K(lVar3);
                        obj8 = lVar3;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj8 = objQ10;
                            Object lVar4 = new l(cVar, z14 ? 1 : 0);
                            mVar10.K(lVar4);
                            obj8 = lVar4;
                        }
                    }
                    obj8 = objQ10;
                    rVar4.C(strQ11, null, false, (e23.a) obj8, mVar10, i34, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar16 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    cVar.i(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar17 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                rVar5.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(rVar5) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    int i35 = (iIntValue12 << 6) & 896;
                    rVar5.E(gl1.y.Q(mVar12, R.string.gcm_training_status_your_7d_avg), mVar12, i35);
                    rVar5.m(i35, 2, gl1.y.Q(mVar12, R.string.ohrv_help_description), null, mVar12);
                    int i36 = ((iIntValue12 << 3) & 112) | 6;
                    rVar5.j(z3.f.c(1090512779, new vu0.h(rVar5, 27), mVar12), mVar12, i36);
                    rVar5.j(z3.f.c(-861570430, new vu0.h(rVar5, 28), mVar12), mVar12, i36);
                    final Context context5 = (Context) mVar12.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR5 = mVar12.r(cVar) | mVar12.r(context5);
                    Object objQ11 = mVar12.q();
                    if (zR5) {
                        obj9 = objQ11;
                        Object obj17 = new e23.a() { // from class: w61.o
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i24;
                                Context context6 = context5;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar4 = cVar;
                                switch (i210) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar18 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                                        h82.c.f(cVar4, context6, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar19 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                                        h82.c.f(cVar4, context6, "http://www.cooperinstitute.org");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(obj17);
                        obj9 = obj17;
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            obj9 = objQ11;
                            Object obj18 = new e23.a() { // from class: w61.o
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i24;
                                    Context context6 = context5;
                                    com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar4 = cVar;
                                    switch (i210) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar18 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                                            h82.c.f(cVar4, context6, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar19 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                                            h82.c.f(cVar4, context6, "http://www.cooperinstitute.org");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(obj18);
                            obj9 = obj18;
                        }
                    }
                    obj9 = objQ11;
                    rVar5.i((e23.a) obj9, R.string.ohrv_help_link, mVar12, i35);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar18 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    cVar.u(mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar19 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    cVar.h(mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar20 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    cVar.j(mVar15, 0);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar21 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    cVar.s(mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar22 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    cVar.g(mVar17, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar23 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    cVar.r(mVar18, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar24 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var19 = p3.n.f135158a;
                    cVar.v(mVar19, 0);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
        }
    }
}
