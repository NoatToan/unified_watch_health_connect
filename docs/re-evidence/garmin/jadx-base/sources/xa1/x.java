package xa1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f189823b;

    public /* synthetic */ x(b0 b0Var, int i14) {
        this.f189822a = i14;
        this.f189823b = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0184  */
    /* JADX WARN: Code duplicated, block: B:55:0x019f  */
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
        Object obj5;
        int i14 = this.f189822a;
        final b0 b0Var = this.f189823b;
        boolean z14 = false;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = b0.f189732f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    b0Var.k(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = b0.f189732f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b0Var.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i18 = b0.f189732f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    b0Var.h(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i19 = b0.f189732f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    b0Var.j(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                h82.r rVar = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i24 = b0.f189732f;
                rVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i25 = (iIntValue5 << 3) & 112;
                    rVar.D(R.string.about_power_guide_help_section_title, mVar5, i25);
                    int i26 = (iIntValue5 << 6) & 896;
                    rVar.l(R.string.about_power_guide_help_intro, i26, 2, null, mVar5);
                    String strP = gl1.y.P(R.string.about_power_guide_help_paragraph1, new Object[]{am.j.m("<link>", gl1.y.Q(mVar5, R.string.about_power_guide_help_paragraph1_arg1), "</link>"), am.j.m("<link>", gl1.y.Q(mVar5, R.string.about_power_guide_help_paragraph1_arg2), "</link>")}, mVar5);
                    boolean zR = mVar5.r(b0Var);
                    Object objQ = mVar5.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        obj4 = objQ;
                        final boolean z15 = z14 ? 1 : 0;
                        Object obj6 = new e23.l() { // from class: xa1.z
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                int i27 = z15;
                                b0 b0Var2 = b0Var;
                                String str = (String) obj7;
                                switch (i27) {
                                    case 0:
                                        int i28 = b0.f189732f;
                                        str.getClass();
                                        b0Var2.e("ABOUT_EFFORT_LEVEL_ACTION");
                                        break;
                                    default:
                                        int i29 = b0.f189732f;
                                        str.getClass();
                                        b0Var2.e("ABOUT_RIDING_POSITION_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(obj6);
                        obj4 = obj6;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            final int z16 = z14 ? 1 : 0;
                            Object obj7 = new e23.l() { // from class: xa1.z
                                @Override // e23.l
                                public final Object invoke(Object obj8) {
                                    int i27 = z16;
                                    b0 b0Var2 = b0Var;
                                    String str = (String) obj8;
                                    switch (i27) {
                                        case 0:
                                            int i28 = b0.f189732f;
                                            str.getClass();
                                            b0Var2.e("ABOUT_EFFORT_LEVEL_ACTION");
                                            break;
                                        default:
                                            int i29 = b0.f189732f;
                                            str.getClass();
                                            b0Var2.e("ABOUT_RIDING_POSITION_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(obj7);
                            obj4 = obj7;
                        }
                    }
                    obj4 = objQ;
                    e23.l lVar = (e23.l) obj4;
                    boolean zR2 = mVar5.r(b0Var);
                    Object objQ2 = mVar5.q();
                    if (zR2) {
                        obj5 = objQ2;
                        Object obj8 = new e23.l() { // from class: xa1.z
                            @Override // e23.l
                            public final Object invoke(Object obj9) {
                                int i27 = i15;
                                b0 b0Var2 = b0Var;
                                String str = (String) obj9;
                                switch (i27) {
                                    case 0:
                                        int i28 = b0.f189732f;
                                        str.getClass();
                                        b0Var2.e("ABOUT_EFFORT_LEVEL_ACTION");
                                        break;
                                    default:
                                        int i29 = b0.f189732f;
                                        str.getClass();
                                        b0Var2.e("ABOUT_RIDING_POSITION_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(obj8);
                        obj5 = obj8;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj5 = objQ2;
                            Object obj9 = new e23.l() { // from class: xa1.z
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    int i27 = i15;
                                    b0 b0Var2 = b0Var;
                                    String str = (String) obj10;
                                    switch (i27) {
                                        case 0:
                                            int i28 = b0.f189732f;
                                            str.getClass();
                                            b0Var2.e("ABOUT_EFFORT_LEVEL_ACTION");
                                            break;
                                        default:
                                            int i29 = b0.f189732f;
                                            str.getClass();
                                            b0Var2.e("ABOUT_RIDING_POSITION_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(obj9);
                            obj5 = obj9;
                        }
                    }
                    obj5 = objQ2;
                    rVar.j(z3.f.c(-312384116, new w21.d(rVar, strP, lVar, (e23.l) obj5, 23), mVar5), mVar5, i25 | 6);
                    rVar.o(R.string.about_power_guide_help_paragraph2, i26, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                boolean z17 = false;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i27 = b0.f189732f;
                rVar2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar2) ? 4 : 2;
                }
                if ((iIntValue6 & 19) != 18) {
                    z17 = true;
                }
                if (mVar6.n(iIntValue6 & 1, z17)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar2.D(R.string.about_riding_position_help_section_title, mVar6, (iIntValue6 << 3) & 112);
                    int i28 = (iIntValue6 << 6) & 896;
                    rVar2.l(R.string.about_riding_position_help_intro, i28, 2, null, mVar6);
                    rVar2.o(R.string.about_riding_position_help_paragraph, i28, 2, null, mVar6);
                    Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                    Drawable drawable = a7.b.getDrawable(context, R.drawable.icon_aero_upright);
                    Drawable drawable2 = a7.b.getDrawable(context, R.drawable.icon_aero_lowered);
                    Drawable drawable3 = a7.b.getDrawable(context, R.drawable.icon_aero_aero);
                    String strQ = gl1.y.Q(mVar6, R.string.lbl_upright);
                    int i29 = h82.c.f82429e << 6;
                    b0Var.i(drawable, strQ, mVar6, i29);
                    b0Var.i(drawable2, gl1.y.Q(mVar6, R.string.lbl_lowered), mVar6, i29);
                    b0Var.i(drawable3, gl1.y.Q(mVar6, R.string.lbl_aero), mVar6, i29);
                } else {
                    mVar6.e();
                }
                break;
            default:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i30 = b0.f189732f;
                rVar3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(rVar3) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    int i34 = ((iIntValue7 << 3) & 112) | 6;
                    rVar3.k(z3.f.c(749480195, new wd0.a(rVar3, 4), mVar7), mVar7, i34);
                    rVar3.a(z3.f.c(-2104305862, new wb1.i(23, rVar3, b0Var), mVar7), mVar7, i34);
                } else {
                    mVar7.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
