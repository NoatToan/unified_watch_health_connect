package ew1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.m8;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f66458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66459c;

    public /* synthetic */ f2(p3.p1 p1Var, e23.a aVar) {
        this.f66457a = 6;
        this.f66459c = p1Var;
        this.f66458b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0284  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String applicationName;
        int i14 = this.f66457a;
        int i15 = 24;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f66458b;
        p3.p1 p1Var = this.f66459c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                h2.a aVar3 = h2.f66500d;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    String strQ = gl1.y.Q(mVar, R.string.lbl_next);
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new eu.a(aVar2, 4);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new eu.a(aVar2, 4);
                            mVar.K(objQ);
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ, rVarF, strQ, mVar, null, zBooleanValue);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    hk1.r rVar = ((jk1.e) p1Var.getF182175a()).f99390d;
                    if (rVar == null || (applicationName = rVar.getApplicationName()) == null) {
                        applicationName = "";
                    }
                    z02.f.c(0, 54, null, this.f66458b, null, applicationName, mVar2, null);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar3, R.string.wallet_terms_and_conditions_title);
                    i53.f fVarA = i53.a.a(new i3("exit", gl1.y.Q(mVar3, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    Object objQ2 = mVar3.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ky0.k(p1Var, i15);
                        mVar3.K(objQ2);
                    }
                    z02.f.d(strQ2, null, null, this.f66458b, fVarA, null, (e23.l) objQ2, mVar3, 12845056, 86);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23479je);
                    Object objQ3 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new om0.h(p1Var, 12);
                        mVar4.K(objQ3);
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", gl1.y.Q(mVar4, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB2 = mVar4.B(aVar2);
                    Object objQ4 = mVar4.q();
                    if (zB2 || objQ4 == c2565a) {
                        objQ4 = new m8(aVar2, i15);
                        mVar4.K(objQ4);
                    }
                    z02.f.e(strW, null, aVar4, fVarA2, (e23.l) objQ4, mVar4, 265216);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar5, ((yv.a) p1Var.getF182175a()).f199801a ? R.string.lbl_empty_string : R.string.device_settings_vector_firmware_update_title);
                    if (((yv.a) p1Var.getF182175a()).f199801a || ((yv.a) p1Var.getF182175a()).f199811k) {
                        aVar2 = null;
                    }
                    z02.f.c(0, 54, null, aVar2, null, strQ3, mVar5, null);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    String strQ4 = !((z10.s1) p1Var.getF182175a()).f201240b ? gl1.y.Q(mVar6, R.string.common_data) : null;
                    boolean zB3 = mVar6.B(aVar2);
                    Object objQ5 = mVar6.q();
                    if (zB3) {
                        objQ5 = new yy1.d(aVar2, 19);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new yy1.d(aVar2, 19);
                            mVar6.K(objQ5);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ5, null, strQ4, mVar6, null);
                } else {
                    mVar6.e();
                }
                break;
            default:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    we0.d dVar = (we0.d) ((g3) p1Var.getF182175a()).f35301b;
                    if (dVar == null) {
                        mVar7.C(1735490585);
                        mVar7.f();
                    } else {
                        mVar7.C(1735490586);
                        af0.f.a(dVar, aVar2, mVar7, we0.d.f184739g);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f2(e23.a aVar, p3.p1 p1Var, int i14) {
        this.f66457a = i14;
        this.f66458b = aVar;
        this.f66459c = p1Var;
    }
}
