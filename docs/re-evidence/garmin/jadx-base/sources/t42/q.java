package t42;

import android.content.Context;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import j20.x;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;
import s70.y1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f162373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f162374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f162375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f162376e;

    public /* synthetic */ q(Context context, String str, String str2, String str3) {
        this.f162372a = 0;
        this.f162373b = str;
        this.f162374c = str2;
        this.f162376e = context;
        this.f162375d = str3;
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
        int i14 = this.f162372a;
        final String str = this.f162375d;
        String str2 = this.f162374c;
        String str3 = this.f162373b;
        final Context context = this.f162376e;
        boolean z14 = false;
        final int i15 = 1;
        final t2 t2Var = (t2) obj;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_body_weight);
                    String str4 = this.f162373b;
                    String str5 = this.f162374c;
                    String strD = x.d(strQ, StringUtils.SPACE, str4, StringUtils.SPACE, str5);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t21.u(25);
                        mVar.K(objQ);
                    }
                    b92.a aVarA = wz1.a.a(oi0.c.A(context, (e23.l) objQ, strD));
                    x0 x0Var = x0.f111346a;
                    int i16 = b92.a.f16960b;
                    int i17 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i17, 52, aVarA, t2Var, null, null, str4, strQ, str5, null, mVar);
                    x0Var.a(i17, 124, null, t2Var, null, null, this.f162375d, y.Q(mVar, R.string.lbl_weight_characteristic_bmi), null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i18 = (iIntValue2 & 14) | 384;
                    s.a(t2Var, str3, z3.f.c(-1109018559, new y1(t2Var, 2), mVar2), mVar2, i18);
                    s.a(t2Var, str2, z3.f.c(-782844438, new e23.q() { // from class: t42.r
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i19 = i15;
                            p3.m.a aVar = p3.m.f135153a;
                            Context context2 = context;
                            switch (i19) {
                                case 0:
                                    String str6 = (String) obj4;
                                    p3.m mVar3 = (p3.m) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    str6.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= mVar3.B(str6) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        String strQ2 = y.Q(mVar3, R.string.lbl_weight_characteristic_bone_mass);
                                        int i24 = iIntValue3;
                                        String str7 = str;
                                        String strD2 = x.d(strQ2, StringUtils.SPACE, str6, StringUtils.SPACE, str7);
                                        Object objQ2 = mVar3.q();
                                        aVar.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new t21.u(24);
                                            mVar3.K(objQ2);
                                        }
                                        b92.a aVarA2 = wz1.a.a(oi0.c.A(context2, (e23.l) objQ2, strD2));
                                        x0 x0Var2 = x0.f111346a;
                                        int i25 = b92.a.f16960b;
                                        x0Var2.a(((i24 << 3) & 112) | (x0.f111348c << 24), 52, aVarA2, t2Var, null, null, str6, strQ2, str7, null, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    String str8 = (String) obj4;
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    str8.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= mVar4.B(str8) ? 4 : 2;
                                    }
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        String strQ3 = y.Q(mVar4, R.string.lbl_skeletal_muscle_mass);
                                        String str9 = str;
                                        String strD3 = x.d(strQ3, StringUtils.SPACE, str8, StringUtils.SPACE, str9);
                                        Object objQ3 = mVar4.q();
                                        aVar.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new t21.u(23);
                                            mVar4.K(objQ3);
                                        }
                                        b92.a aVarA3 = wz1.a.a(oi0.c.A(context2, (e23.l) objQ3, strD3));
                                        x0 x0Var3 = x0.f111346a;
                                        int i26 = b92.a.f16960b;
                                        x0Var3.a(((iIntValue4 << 3) & 112) | (x0.f111348c << 24), 52, aVarA3, t2Var, null, null, str8, strQ3, str9, null, mVar4);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, i18);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    final int i19 = z14 ? 1 : 0;
                    int i24 = (iIntValue3 & 14) | 384;
                    s.a(t2Var, str3, z3.f.c(2122930040, new e23.q() { // from class: t42.r
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i110 = i19;
                            p3.m.a aVar = p3.m.f135153a;
                            Context context2 = context;
                            switch (i110) {
                                case 0:
                                    String str6 = (String) obj4;
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    str6.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= mVar4.B(str6) ? 4 : 2;
                                    }
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        String strQ2 = y.Q(mVar4, R.string.lbl_weight_characteristic_bone_mass);
                                        int i25 = iIntValue4;
                                        String str7 = str;
                                        String strD2 = x.d(strQ2, StringUtils.SPACE, str6, StringUtils.SPACE, str7);
                                        Object objQ2 = mVar4.q();
                                        aVar.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new t21.u(24);
                                            mVar4.K(objQ2);
                                        }
                                        b92.a aVarA2 = wz1.a.a(oi0.c.A(context2, (e23.l) objQ2, strD2));
                                        x0 x0Var2 = x0.f111346a;
                                        int i26 = b92.a.f16960b;
                                        x0Var2.a(((i25 << 3) & 112) | (x0.f111348c << 24), 52, aVarA2, t2Var, null, null, str6, strQ2, str7, null, mVar4);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    String str8 = (String) obj4;
                                    p3.m mVar5 = (p3.m) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    str8.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= mVar5.B(str8) ? 4 : 2;
                                    }
                                    if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        String strQ3 = y.Q(mVar5, R.string.lbl_skeletal_muscle_mass);
                                        String str9 = str;
                                        String strD3 = x.d(strQ3, StringUtils.SPACE, str8, StringUtils.SPACE, str9);
                                        Object objQ3 = mVar5.q();
                                        aVar.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new t21.u(23);
                                            mVar5.K(objQ3);
                                        }
                                        b92.a aVarA3 = wz1.a.a(oi0.c.A(context2, (e23.l) objQ3, strD3));
                                        x0 x0Var3 = x0.f111346a;
                                        int i27 = b92.a.f16960b;
                                        x0Var3.a(((iIntValue5 << 3) & 112) | (x0.f111348c << 24), 52, aVarA3, t2Var, null, null, str8, strQ3, str9, null, mVar5);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar3), mVar3, i24);
                    s.a(t2Var, str2, z3.f.c(2043647713, new y1(t2Var, 1), mVar3), mVar3, i24);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(String str, String str2, String str3, Context context, int i14) {
        this.f162372a = i14;
        this.f162373b = str;
        this.f162374c = str2;
        this.f162375d = str3;
        this.f162376e = context;
    }
}
