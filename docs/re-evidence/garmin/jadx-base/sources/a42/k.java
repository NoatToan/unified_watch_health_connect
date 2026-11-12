package a42;

import a03.t0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import i3.mh;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1039b;

    public /* synthetic */ k(s sVar, int i14) {
        this.f1038a = i14;
        this.f1039b = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        hy1.a aVarValueOf;
        int i14;
        int i15;
        p3.m mVar;
        String str;
        String strH;
        String strName;
        int i16 = this.f1038a;
        int i17 = 2;
        s sVar = this.f1039b;
        switch (i16) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                s.a aVar = s.f1073g;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i18 = 6 | ((iIntValue << 3) & 112);
                    rVar.k(z3.f.c(-296577225, new l(rVar, 0), mVar2), mVar2, i18);
                    rVar.a(z3.f.c(-2120485010, new t0(i17, rVar, sVar), mVar2), mVar2, i18);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                s.a aVar2 = s.f1073g;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    sVar.i(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                s.a aVar3 = s.f1073g;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    sVar.j(mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                s.a aVar4 = s.f1073g;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    sVar.h(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                s.a aVar5 = s.f1073g;
                rVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(rVar2) ? 4 : 2;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                    UserSettingsDTO.c cVarG = ((u32.a) KoinJavaComponent.get$default(u32.a.class, null, null, 6, null)).getUserSettings().G();
                    if (cVarG == null || (strName = cVarG.name()) == null || (aVarValueOf = hy1.a.valueOf(strName)) == null) {
                        aVarValueOf = hy1.a.NOT_SPECIFIED;
                    }
                    if (aVarValueOf == hy1.a.NOT_SPECIFIED) {
                        aVarValueOf = hy1.a.MALE;
                    }
                    hy1.b.a aVar6 = hy1.b.f86367a;
                    f12.l.f68084a.getClass();
                    int iU = f12.l.a.a().u();
                    aVar6.getClass();
                    o13.p pVarA = hy1.b.a.a(aVarValueOf, iU);
                    rVar2.D(R.string.gcm_training_status_vo2_max_header, mVar6, (iIntValue5 << 3) & 112);
                    int i19 = (iIntValue5 << 6) & 896;
                    rVar2.o(R.string.msg_a_window_into_your_fitness, i19, 2, null, mVar6);
                    p3.m mVar7 = mVar6;
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar8);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar7.C(1393540132);
                    t tVar = t.f1083a;
                    int i24 = R.string.activities_lbl_value1_and_up;
                    Iterator it = p13.x.k(new s.d(R.string.lbl_superior, R.string.activities_lbl_value1_and_up, tVar), new s.d(R.string.lbl_excellent, R.string.lbl_value1_to_value2, u.f1084a), new s.d(R.string.lbl_good, R.string.lbl_value1_to_value2, v.f1085a), new s.d(R.string.lbl_fair, R.string.lbl_value1_to_value2, w.f1086a), new s.d(R.string.lbl_poor, R.string.activities_lbl_value1_and_below, x.f1087a)).iterator();
                    int i25 = 0;
                    p3.m mVar8 = mVar7;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        s sVar2 = this.f1039b;
                        if (zHasNext) {
                            Object next = it.next();
                            int i26 = i25 + 1;
                            if (i25 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            s.d dVar = (s.d) next;
                            if (pVarA != null) {
                                o13.p pVar = ((o13.p[]) pVarA.f128595b)[i25];
                                dVar.getClass();
                                pVar.getClass();
                                Float f14 = (Float) pVar.f128594a;
                                int iFloatValue = f14 != null ? (int) f14.floatValue() : 0;
                                Float f15 = (Float) pVar.f128595b;
                                int iFloatValue2 = f15 != null ? (int) f15.floatValue() : 0;
                                int i27 = dVar.f1081b;
                                if (i27 == i24) {
                                    strH = am.j.h(iFloatValue, "≥ ");
                                } else {
                                    strH = i27 == R.string.activities_lbl_value1_and_below ? am.j.h(iFloatValue2, "≤ ") : androidx.core.view.j.d(iFloatValue, iFloatValue2, " - ");
                                }
                                str = strH;
                            } else {
                                str = null;
                            }
                            p3.m mVar9 = mVar8;
                            sVar2.g(gl1.y.Q(mVar8, dVar.f1080a), str, dVar.f1082c.invoke().f128833a, false, mVar9, 0);
                            i24 = R.string.activities_lbl_value1_and_up;
                            i25 = i26;
                            mVar8 = mVar9;
                        } else {
                            mVar8.f();
                            mVar8.y();
                            e12.e eVarC = bo1.a.a().c();
                            if (eVarC.o0()) {
                                i14 = -683635132;
                                i15 = R.string.gcm_training_status_vo2_max_description_5_including_rowing;
                            } else {
                                i14 = -683631693;
                                i15 = R.string.gcm_training_status_vo2_max_description_5;
                            }
                            String strH2 = sn.a.h(mVar8, i14, i15, mVar8);
                            Object objQ = mVar8.q();
                            p3.m.f135153a.getClass();
                            Object obj4 = p3.m.a.f135155b;
                            if (objQ == obj4) {
                                objQ = new a03.h(18);
                                mVar8.K(objQ);
                            }
                            rVar2.p(strH2, oi0.c.A(context, (e23.l) objQ, strH2), mVar8, i19);
                            if (eVarC.S()) {
                                mVar8.C(282509811);
                                String strQ = gl1.y.Q(mVar8, R.string.gcm_training_status_vo2_max_description_3);
                                Object objQ2 = mVar8.q();
                                if (objQ2 == obj4) {
                                    objQ2 = new a03.h(19);
                                    mVar8.K(objQ2);
                                }
                                rVar2.p(strQ, oi0.c.A(context, (e23.l) objQ2, strQ), mVar8, i19);
                                mVar8.f();
                            } else {
                                mVar8.C(282723153);
                                mVar8.f();
                            }
                            if (eVarC.L0()) {
                                mVar8.C(282822663);
                                String strQ2 = gl1.y.Q(mVar8, R.string.vo2_max_and_training_status_title);
                                Object objQ3 = mVar8.q();
                                if (objQ3 == obj4) {
                                    objQ3 = new a03.h(20);
                                    mVar8.K(objQ3);
                                }
                                String strA = oi0.c.A(context, (e23.l) objQ3, strQ2);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar8);
                                h4.r.a aVar9 = h4.r.S;
                                d92.b.f58625c.getClass();
                                j92.e eVar = j92.b.f97899b;
                                float f16 = eVar.f97920e;
                                h4.r rVarC3 = c2.l.C(aVar9, f16, f16, f16, 0.0f, 8);
                                boolean zB = mVar8.B(strA);
                                Object objQ4 = mVar8.q();
                                if (zB || objQ4 == obj4) {
                                    objQ4 = new defpackage.b(strA, 3);
                                    mVar8.K(objQ4);
                                }
                                p3.m mVar10 = mVar8;
                                mh.c(strQ2, p5.v.c((e23.l) objQ4, rVarC3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar10, 0, 0, 131068);
                                String strQ3 = gl1.y.Q(mVar10, R.string.gcm_training_status_vo2_max_description_2);
                                Object objQ5 = mVar10.q();
                                if (objQ5 == obj4) {
                                    objQ5 = new a03.h(21);
                                    mVar10.K(objQ5);
                                }
                                String strA2 = oi0.c.A(context, (e23.l) objQ5, strQ3);
                                j92.f.f97924a.getClass();
                                x0 x0VarF = d92.c.f(j92.f.f97932i, mVar10);
                                float f17 = eVar.f97920e;
                                h4.r rVarC4 = c2.l.C(aVar9, f17, eVar.f97918c, f17, 0.0f, 8);
                                boolean zB2 = mVar10.B(strA2);
                                Object objQ6 = mVar10.q();
                                if (zB2 || objQ6 == obj4) {
                                    objQ6 = new defpackage.b(strA2, 4);
                                    mVar10.K(objQ6);
                                }
                                mh.c(strQ3, p5.v.c((e23.l) objQ6, rVarC4, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar10, 0, 0, 131068);
                                p3.m mVar11 = mVar10;
                                mVar11.f();
                                mVar = mVar11;
                            } else {
                                mVar8.C(283970097);
                                mVar8.f();
                                mVar = mVar8;
                            }
                            String strQ4 = gl1.y.Q(mVar, R.string.activities_cooper_institute);
                            String strP = gl1.y.P(R.string.gcm_training_status_vo2_max_description_4, new Object[]{am.j.m("<link>", strQ4, "</link>")}, mVar);
                            String strP2 = gl1.y.P(R.string.gcm_training_status_vo2_max_description_4, new Object[]{strQ4}, mVar);
                            Object objQ7 = mVar.q();
                            if (objQ7 == obj4) {
                                objQ7 = new a03.h(23);
                                mVar.K(objQ7);
                            }
                            String strA3 = oi0.c.A(context, (e23.l) objQ7, strP2);
                            boolean zR = mVar.r(sVar2) | mVar.r(context);
                            Object objQ8 = mVar.q();
                            if (zR || objQ8 == obj4) {
                                objQ8 = new a11.n(3, sVar2, context);
                                mVar.K(objQ8);
                            }
                            rVar2.w(strP, strA3, (e23.a) objQ8, mVar, (iIntValue5 << 9) & 7168, 0);
                            x1 x1Var6 = p3.n.f135158a;
                        }
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }
}
