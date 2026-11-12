package g51;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import ew1.r1;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f75938b;

    public /* synthetic */ b(f fVar, int i14) {
        this.f75937a = i14;
        this.f75938b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c7  */
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
        int i14 = this.f75937a;
        int i15 = 4;
        final f fVar = this.f75938b;
        boolean z14 = false;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = f.f75946f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    fVar.i(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = f.f75946f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i19 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.pacepro_help_about_title_1, mVar2, i19);
                    int i24 = (iIntValue2 << 6) & 896;
                    rVar.l(R.string.pacepro_help_about_info_1, i24, 2, null, mVar2);
                    rVar.t(R.string.pacepro_help_about_title_2, mVar2, i19);
                    String strQ = y.Q(mVar2, R.string.pacepro_help_about_info_2_with_links);
                    String strQ2 = y.Q(mVar2, R.string.pacepro_help_about_info_2);
                    boolean zR = mVar2.r(fVar);
                    Object objQ = mVar2.q();
                    m.a aVar = m.f135153a;
                    if (zR) {
                        obj4 = objQ;
                        final int i25 = z14 ? 1 : 0;
                        Object obj6 = new l() { // from class: g51.d
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                int i26 = i25;
                                f fVar2 = fVar;
                                String str = (String) obj7;
                                switch (i26) {
                                    case 0:
                                        int i27 = f.f75946f;
                                        str.getClass();
                                        fVar2.e("PACING_STRATEGY_ACTION");
                                        break;
                                    default:
                                        int i28 = f.f75946f;
                                        str.getClass();
                                        fVar2.e("UPHILL_EFFORT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(obj6);
                        obj4 = obj6;
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            obj4 = objQ;
                            final int i26 = z14 ? 1 : 0;
                            Object obj7 = new l() { // from class: g51.d
                                @Override // e23.l
                                public final Object invoke(Object obj8) {
                                    int i27 = i26;
                                    f fVar2 = fVar;
                                    String str = (String) obj8;
                                    switch (i27) {
                                        case 0:
                                            int i28 = f.f75946f;
                                            str.getClass();
                                            fVar2.e("PACING_STRATEGY_ACTION");
                                            break;
                                        default:
                                            int i29 = f.f75946f;
                                            str.getClass();
                                            fVar2.e("UPHILL_EFFORT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj7);
                            obj4 = obj7;
                        }
                    }
                    obj4 = objQ;
                    l lVar = (l) obj4;
                    boolean zR2 = mVar2.r(fVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        obj5 = objQ2;
                        Object obj8 = new l() { // from class: g51.d
                            @Override // e23.l
                            public final Object invoke(Object obj9) {
                                int i27 = i16;
                                f fVar2 = fVar;
                                String str = (String) obj9;
                                switch (i27) {
                                    case 0:
                                        int i28 = f.f75946f;
                                        str.getClass();
                                        fVar2.e("PACING_STRATEGY_ACTION");
                                        break;
                                    default:
                                        int i29 = f.f75946f;
                                        str.getClass();
                                        fVar2.e("UPHILL_EFFORT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(obj8);
                        obj5 = obj8;
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            obj5 = objQ2;
                            Object obj9 = new l() { // from class: g51.d
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    int i27 = i16;
                                    f fVar2 = fVar;
                                    String str = (String) obj10;
                                    switch (i27) {
                                        case 0:
                                            int i28 = f.f75946f;
                                            str.getClass();
                                            fVar2.e("PACING_STRATEGY_ACTION");
                                            break;
                                        default:
                                            int i29 = f.f75946f;
                                            str.getClass();
                                            fVar2.e("UPHILL_EFFORT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj9);
                            obj5 = obj9;
                        }
                    }
                    obj5 = objQ2;
                    rVar.y(strQ, null, strQ2, i53.a.a(lVar, (l) obj5), mVar2, (iIntValue2 << 12) & 57344, 2);
                    rVar.o(R.string.pacepro_help_about_info_3, i24, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i27 = f.f75946f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    fVar.g(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i28 = f.f75946f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    fVar.k(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i29 = f.f75946f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    fVar.l(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i30 = f.f75946f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    fVar.j(mVar6, h82.c.f82429e);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i34 = f.f75946f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    fVar.h(mVar7, h82.c.f82429e);
                } else {
                    mVar7.e();
                }
                break;
            default:
                r rVar2 = (r) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i35 = f.f75946f;
                rVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    int i36 = ((iIntValue8 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(2076878613, new fe1.a(rVar2, i15), mVar8), mVar8, i36);
                    rVar2.a(z3.f.c(889511166, new r1(29, rVar2, fVar), mVar8), mVar8, i36);
                } else {
                    mVar8.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
