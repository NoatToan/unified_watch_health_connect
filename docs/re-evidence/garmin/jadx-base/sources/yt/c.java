package yt;

import androidx.lifecycle.n0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c2.x2;
import ca0.q1;
import com.garmin.android.apps.connectmobile.R;
import f72.t9;
import l72.b2;
import l72.c2;
import l72.u0;
import p005kotlin.Unit;
import p3.a2;
import p3.m1;
import p3.n1;
import p3.p1;
import p3.x1;
import p3.z1;
import v62.l1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f199278b;

    public /* synthetic */ c(h hVar, int i14) {
        this.f199277a = i14;
        this.f199278b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:114:0x034b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
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
        int i14 = this.f199277a;
        int i15 = 4;
        p3.m.a aVar = p3.m.f135153a;
        h hVar = this.f199278b;
        boolean z14 = false;
        int i16 = 2;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = h.f199301x;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarA = l4.k.a(h4.r.S, 0.6f);
                    boolean zR = mVar.r(hVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new a(hVar, i16);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a(hVar, i16);
                            mVar.K(objQ);
                        }
                    }
                    u0.a(rVarA, null, null, null, (e23.a) objQ, mVar, 6, 14);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = h.f199301x;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarF = o53.f0.F(hVar.f199305d, Boolean.FALSE, mVar2, 48);
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarA2 = l4.k.a(h4.r.S, 0.6f);
                    if (((Boolean) p1VarF.getF182175a()).booleanValue()) {
                        s62.a.f157643a.getClass();
                        t62.c.f162799a.getClass();
                        dVarA = j72.a.a(t9.f69810a);
                    } else {
                        s62.a.f157643a.getClass();
                        t62.c.f162799a.getClass();
                        dVarA = j72.b.a(t9.f69810a);
                    }
                    c2 c2Var = c2.OVERLAY;
                    b2 b2Var = b2.SMALL;
                    boolean zR2 = mVar2.r(hVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new a(hVar, i15);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(hVar, i15);
                            mVar2.K(objQ2);
                        }
                    }
                    f0Var.c(rVarA2, dVarA, c2Var, b2Var, false, null, null, (e23.a) objQ2, mVar2, 3462, 112);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = h.f199301x;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    Object objQ3 = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new z1(0.1f);
                        mVar3.K(objQ3);
                    }
                    m1 m1Var = (m1) objQ3;
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new a2(0);
                        mVar3.K(objQ4);
                    }
                    n1 n1Var = (n1) objQ4;
                    y0<Float> y0Var = hVar.f199304c;
                    n0 viewLifecycleOwner = hVar.getViewLifecycleOwner();
                    Object objQ5 = mVar3.q();
                    if (objQ5 == c2565a) {
                        h.c cVar = new h.c(new q1(m1Var, 12));
                        mVar3.K(cVar);
                        objQ5 = cVar;
                    }
                    y0Var.f(viewLifecycleOwner, (z0) objQ5);
                    y0<Integer> y0Var2 = hVar.w6().f199343d;
                    n0 viewLifecycleOwner2 = hVar.getViewLifecycleOwner();
                    Object objQ6 = mVar3.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new h.c(new f(z14 ? 1 : 0, m1Var, n1Var));
                        mVar3.K(objQ6);
                    }
                    y0Var2.f(viewLifecycleOwner2, (z0) objQ6);
                    z02.b.a(false, null, null, null, false, z3.f.c(329132930, new xk1.e(hVar, 23, m1Var, n1Var), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i24 = h.f199301x;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1530598691, new c(hVar, 7), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i25 = h.f199301x;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r rVarD = x2.d(c2.l.C(h4.r.S, 0.0f, w02.b0.x(mVar5, hVar.f199317p), 0.0f, w02.b0.x(mVar5, hVar.f199318q), 5), 1.0f);
                    n nVarW6 = hVar.w6();
                    boolean zR3 = mVar5.r(hVar);
                    Object objQ7 = mVar5.q();
                    if (zR3) {
                        objQ7 = new j(hVar);
                        mVar5.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new j(hVar);
                            mVar5.K(objQ7);
                        }
                    }
                    f0.d(rVarD, nVarW6, (e23.p) ((k23.g) objQ7), mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i26 = h.f199301x;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2011040474, new c(hVar, 6), mVar6), mVar6, 196608, 31);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i27 = h.f199301x;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    l72.s sVar = l72.s.f111232a;
                    l72.s.b bVar = l72.s.b.INFO;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = l1.a(t62.b.f162798a);
                    String string = hVar.getResources().getString(R.string.annual_report_loading_banner_title);
                    string.getClass();
                    sVar.d(null, bVar, dVarA2, string, hVar.getResources().getString(R.string.annual_report_loading_banner_body), null, null, null, mVar7, 48, 481);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i28 = h.f199301x;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    l72.s sVar2 = l72.s.f111232a;
                    l72.s.b bVar2 = l72.s.b.INFO;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = v62.a.a(t62.b.f162798a);
                    String string2 = hVar.getResources().getString(R.string.annual_report_intro_no_data_banner_title);
                    string2.getClass();
                    sVar2.d(null, bVar2, dVarA3, string2, hVar.getResources().getString(R.string.annual_report_intro_no_data_banner_body), null, null, null, mVar8, 48, 481);
                } else {
                    mVar8.e();
                }
                break;
            default:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i29 = h.f199301x;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(837449714, new c(hVar, i15), mVar9), mVar9, 196608, 31);
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
