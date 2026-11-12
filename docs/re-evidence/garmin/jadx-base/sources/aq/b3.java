package aq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b3 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f11846b;

    public /* synthetic */ b3(e3 e3Var, int i14) {
        this.f11845a = i14;
        this.f11846b = e3Var;
    }

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
        int i14 = this.f11845a;
        e3 e3Var = this.f11846b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = e3.f11927f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    e3Var.j(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = e3.f11927f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.ski_slope_difficulty_help_section_title, mVar2, i17);
                    int i18 = iIntValue2 & 14;
                    rVar.c(mVar2, i18);
                    rVar.A(R.string.ski_slope_difficulty_help_section_paragraph_1, mVar2, i17);
                    rVar.c(mVar2, i18);
                    rVar.A(R.string.ski_slope_difficulty_help_section_paragraph_2, mVar2, i17);
                    rVar.c(mVar2, i18);
                    rVar.D(R.string.ski_slope_difficulty_about_section_title, mVar2, i17);
                    int i19 = (iIntValue2 << 6) & 896;
                    rVar.o(R.string.ski_slope_difficulty_about_section_content, i19, 2, null, mVar2);
                    rVar.c(mVar2, i18);
                    int i24 = h82.c.f82429e;
                    e3Var.k(mVar2, i24);
                    rVar.c(mVar2, i18);
                    e3Var.h(mVar2, i24);
                    rVar.c(mVar2, i18);
                    e3Var.i(mVar2, i24);
                    rVar.c(mVar2, i18);
                    rVar.o(R.string.ski_slope_difficulty_about_section_footer, i19, 2, null, mVar2);
                    rVar.c(mVar2, i18);
                    rVar.D(R.string.ski_slope_difficulty_other_runs_title, mVar2, i17);
                    rVar.c(mVar2, i18);
                    rVar.d(R.string.ski_slope_difficulty_other_runs_paragraph_1, i19, 2, null, mVar2);
                    rVar.c(mVar2, i18);
                    rVar.d(R.string.ski_slope_difficulty_other_runs_paragraph_2, i19, 2, null, mVar2);
                    rVar.o(R.string.ski_slope_difficulty_other_runs_paragraph_3, i19, 2, null, mVar2);
                    rVar.c(mVar2, i18);
                    rVar.D(R.string.ski_slope_difficulty_value_title, mVar2, i17);
                    rVar.o(R.string.ski_slope_difficulty_value_paragraph_1, i19, 2, null, mVar2);
                    rVar.o(R.string.ski_slope_difficulty_value_paragraph_2, i19, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
