package or0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h82.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f133332b;

    public /* synthetic */ d(j jVar, int i14) {
        this.f133331a = i14;
        this.f133332b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x040c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0432  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x020a  */
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
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        p3.m mVar;
        r rVar;
        Object obj6;
        Object obj7;
        int i14 = this.f133331a;
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 2;
        final j jVar = this.f133332b;
        boolean z14 = false;
        final int i16 = 1;
        switch (i14) {
            case 0:
                r rVar2 = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j.a aVar2 = j.f133348g;
                rVar2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i17 = (iIntValue << 3) & 112;
                    rVar2.D(R.string.lbl_weekly_progress, mVar2, i17);
                    int i18 = (iIntValue << 6) & 896;
                    rVar2.l(R.string.intensity_minutes_general_info, i18, 2, null, mVar2);
                    int i19 = i17 | 6;
                    rVar2.j(z3.f.c(1511998764, new ix0.f(rVar2, 21), mVar2), mVar2, i19);
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    if (c22.b.a((Context) mVar2.A(y3Var)) >= 1.5f) {
                        mVar2.C(583171144);
                        jVar.j(jVar.f133349f, mVar2, ir0.d.f94788d);
                        mVar2.f();
                    } else {
                        mVar2.C(583278962);
                        jVar.i(jVar.f133349f, mVar2, ir0.d.f94788d);
                        mVar2.f();
                    }
                    rVar2.o(R.string.lbl_help_intro_text, i18, 2, null, mVar2);
                    rVar2.j(z3.f.c(-1045911453, new ix0.f(rVar2, 22), mVar2), mVar2, i19);
                    rVar2.j(z3.f.c(901818980, new ix0.f(rVar2, 23), mVar2), mVar2, i19);
                    if (((lr0.a) KoinJavaComponent.get$default(lr0.a.class, null, null, 6, null)).c()) {
                        mVar2.C(583920600);
                        rVar2.j(z3.f.c(1709046526, new ix0.f(rVar2, 24), mVar2), mVar2, i19);
                        mVar2.f();
                    } else {
                        mVar2.C(584171917);
                        rVar2.j(z3.f.c(-885733881, new ix0.f(rVar2, 25), mVar2), mVar2, i19);
                        mVar2.f();
                    }
                    rVar2.t(R.string.common_learn_more, mVar2, i17);
                    final Context context = (Context) mVar2.A(y3Var);
                    boolean zR = mVar2.r(jVar) | mVar2.r(context);
                    Object objQ = mVar2.q();
                    if (zR) {
                        obj4 = objQ;
                        final boolean z15 = z14 ? 1 : 0;
                        Object obj8 = new e23.a() { // from class: or0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = z15;
                                Context context2 = context;
                                j jVar2 = jVar;
                                switch (i24) {
                                    case 0:
                                        j.a aVar3 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    case 1:
                                        j.a aVar4 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                    case 2:
                                        j.a aVar5 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    default:
                                        j.a aVar6 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(obj8);
                        obj4 = obj8;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            final int z16 = z14 ? 1 : 0;
                            Object obj9 = new e23.a() { // from class: or0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = z16;
                                    Context context2 = context;
                                    j jVar2 = jVar;
                                    switch (i24) {
                                        case 0:
                                            j.a aVar3 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        case 1:
                                            j.a aVar4 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                        case 2:
                                            j.a aVar5 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        default:
                                            j.a aVar6 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj9);
                            obj4 = obj9;
                        }
                    }
                    obj4 = objQ;
                    rVar2.i((e23.a) obj4, R.string.lbl_cdc_title, mVar2, i18);
                    boolean zR2 = mVar2.r(jVar) | mVar2.r(context);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        obj5 = objQ2;
                        Object obj10 = new e23.a() { // from class: or0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i16;
                                Context context2 = context;
                                j jVar2 = jVar;
                                switch (i24) {
                                    case 0:
                                        j.a aVar3 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    case 1:
                                        j.a aVar4 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                    case 2:
                                        j.a aVar5 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    default:
                                        j.a aVar6 = j.f133348g;
                                        h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(obj10);
                        obj5 = obj10;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj5 = objQ2;
                            Object obj11 = new e23.a() { // from class: or0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i16;
                                    Context context2 = context;
                                    j jVar2 = jVar;
                                    switch (i24) {
                                        case 0:
                                            j.a aVar3 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        case 1:
                                            j.a aVar4 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                        case 2:
                                            j.a aVar5 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        default:
                                            j.a aVar6 = j.f133348g;
                                            h82.c.f(jVar2, context2, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj11);
                            obj5 = obj11;
                        }
                    }
                    obj5 = objQ2;
                    rVar2.i((e23.a) obj5, R.string.lbl_aha_title, mVar2, i18);
                } else {
                    mVar2.e();
                }
                break;
            case 1:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j.a aVar3 = j.f133348g;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    jVar.k(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 2:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                j.a aVar4 = j.f133348g;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    jVar.g(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 3:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                j.a aVar5 = j.f133348g;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    jVar.m(mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 4:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                j.a aVar6 = j.f133348g;
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    jVar.l(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 5:
                r rVar3 = (r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                j.a aVar7 = j.f133348g;
                rVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar7.B(rVar3) ? 4 : 2;
                }
                int i24 = iIntValue6;
                if (mVar7.n(i24 & 1, (i24 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    int i25 = (i24 << 3) & 112;
                    rVar3.D(R.string.lbl_weekly_progress, mVar7, i25);
                    if (jVar.f133349f != null) {
                        mVar7.C(-2064379673);
                        rVar3.m((i24 << 6) & 896, 2, y.P(R.string.string_space_string_pattern, new Object[]{y.Q(mVar7, R.string.intensity_msg_health_organizations_recommendation), y.Q(mVar7, R.string.intensity_msg_im_week_total)}, mVar7), null, mVar7);
                        if (c22.b.a((Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b)) >= 1.5f) {
                            mVar7.C(-2063886587);
                            jVar.j(jVar.f133349f, mVar7, ir0.d.f94788d);
                            mVar7.f();
                        } else {
                            mVar7.C(-2063770833);
                            jVar.i(jVar.f133349f, mVar7, ir0.d.f94788d);
                            mVar7.f();
                        }
                        mVar7.f();
                        mVar = mVar7;
                        rVar = rVar3;
                    } else {
                        mVar7.C(-2063650677);
                        r rVar4 = rVar3;
                        p3.m mVar8 = mVar7;
                        rVar4.l(R.string.intensity_msg_health_organizations_recommendation, (i24 << 6) & 896, 2, null, mVar8);
                        mVar8.f();
                        rVar = rVar4;
                        mVar = mVar8;
                    }
                    int i26 = (i24 << 6) & 896;
                    rVar.o(R.string.lbl_help_intro_text, i26, 2, null, mVar);
                    r rVar5 = rVar;
                    p3.m mVar9 = mVar;
                    int i27 = i25 | 6;
                    rVar5.j(z3.f.c(1960673013, new ix0.f(rVar5, 27), mVar9), mVar9, i27);
                    rVar5.j(z3.f.c(1306981534, new ix0.f(rVar5, 28), mVar9), mVar9, i27);
                    if (((lr0.a) KoinJavaComponent.get$default(lr0.a.class, null, null, 6, null)).c()) {
                        mVar9.C(-2062966755);
                        rVar5.j(z3.f.c(20455267, new ix0.f(rVar5, 29), mVar9), mVar9, i27);
                        mVar9.f();
                    } else {
                        mVar9.C(-2062715438);
                        rVar5.j(z3.f.c(591381370, new f(rVar5, 0), mVar9), mVar9, i27);
                        mVar9.f();
                    }
                    rVar5.t(R.string.common_learn_more, mVar9, i25);
                    final Context context2 = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR3 = mVar9.r(jVar) | mVar9.r(context2);
                    Object objQ3 = mVar9.q();
                    if (zR3) {
                        obj6 = objQ3;
                        Object obj12 = new e23.a() { // from class: or0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i15;
                                Context context3 = context2;
                                j jVar2 = jVar;
                                switch (i28) {
                                    case 0:
                                        j.a aVar8 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    case 1:
                                        j.a aVar9 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                    case 2:
                                        j.a aVar10 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    default:
                                        j.a aVar11 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(obj12);
                        obj6 = obj12;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj6 = objQ3;
                            Object obj13 = new e23.a() { // from class: or0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i15;
                                    Context context3 = context2;
                                    j jVar2 = jVar;
                                    switch (i28) {
                                        case 0:
                                            j.a aVar8 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        case 1:
                                            j.a aVar9 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                        case 2:
                                            j.a aVar10 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        default:
                                            j.a aVar11 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(obj13);
                            obj6 = obj13;
                        }
                    }
                    obj6 = objQ3;
                    rVar5.i((e23.a) obj6, R.string.lbl_cdc_title, mVar9, i26);
                    boolean zR4 = mVar9.r(jVar) | mVar9.r(context2);
                    Object objQ4 = mVar9.q();
                    if (zR4) {
                        obj7 = objQ4;
                        final int i28 = 3;
                        Object obj14 = new e23.a() { // from class: or0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i28;
                                Context context3 = context2;
                                j jVar2 = jVar;
                                switch (i29) {
                                    case 0:
                                        j.a aVar8 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    case 1:
                                        j.a aVar9 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                    case 2:
                                        j.a aVar10 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                        break;
                                    default:
                                        j.a aVar11 = j.f133348g;
                                        h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(obj14);
                        obj7 = obj14;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj7 = objQ4;
                            final int i29 = 3;
                            Object obj15 = new e23.a() { // from class: or0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i29;
                                    Context context3 = context2;
                                    j jVar2 = jVar;
                                    switch (i210) {
                                        case 0:
                                            j.a aVar8 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        case 1:
                                            j.a aVar9 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                        case 2:
                                            j.a aVar10 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.cdc.gov/physical-activity-basics/about/index.html");
                                            break;
                                        default:
                                            j.a aVar11 = j.f133348g;
                                            h82.c.f(jVar2, context3, "https://www.heart.org/en/healthy-living/fitness/fitness-basics/aha-recs-for-physical-activity-in-adults");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(obj15);
                            obj7 = obj15;
                        }
                    }
                    obj7 = objQ4;
                    rVar5.i((e23.a) obj7, R.string.lbl_aha_title, mVar9, i26);
                } else {
                    mVar7.e();
                }
                break;
            default:
                r rVar6 = (r) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                j.a aVar8 = j.f133348g;
                rVar6.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar10.B(rVar6) ? 4 : 2;
                }
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    int i30 = ((iIntValue7 << 3) & 112) | 6;
                    rVar6.k(z3.f.c(-151209059, new ix0.f(rVar6, 26), mVar10), mVar10, i30);
                    rVar6.a(z3.f.c(-483076460, new oo0.f(1, rVar6, jVar), mVar10), mVar10, i30);
                } else {
                    mVar10.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
