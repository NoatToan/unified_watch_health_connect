package pk0;

import c2.x2;
import c80.u;
import com.garmin.android.apps.connectmobile.R;
import e2.f0;
import gl1.y;
import java.util.Locale;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f138232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f138233c;

    public /* synthetic */ h(u uVar, e23.l lVar, int i14) {
        this.f138231a = i14;
        this.f138232b = uVar;
        this.f138233c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        final String str = (String) obj2;
        switch (this.f138231a) {
            case 0:
                f0Var.getClass();
                str.getClass();
                final int i14 = 0;
                final u uVar = this.f138232b;
                final e23.l lVar = this.f138233c;
                f0.b(f0Var, "manual_entry_prompt", new z3.e(-1139263198, true, new e23.q() { // from class: pk0.j
                    /* JADX WARN: Code duplicated, block: B:13:0x0083  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0107  */
                    @Override // e23.q
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i15 = i14;
                        p3.m.a aVar = p3.m.f135153a;
                        String str2 = str;
                        e23.l lVar2 = lVar;
                        u uVar2 = uVar;
                        switch (i15) {
                            case 0:
                                p3.m mVar = (p3.m) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                ((e2.d) obj3).getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                                    u4.d dVar = uVar2.f25613a;
                                    String lowerCase = xy2.b.l(uVar2, mVar).toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    String strP = y.P(R.string.dont_see_your_placeholder, new Object[]{lowerCase}, mVar);
                                    String strQ = y.Q(mVar, R.string.you_can_enter_manually);
                                    String strQ2 = y.Q(mVar, R.string.enter_brand);
                                    boolean zB = mVar.B(lVar2) | mVar.B(str2);
                                    Object objQ = mVar.q();
                                    if (zB) {
                                        objQ = new bb1.d(lVar2, str2, 5);
                                        mVar.K(objQ);
                                    } else {
                                        aVar.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new bb1.d(lVar2, str2, 5);
                                            mVar.K(objQ);
                                        }
                                    }
                                    b82.n.d(dVar, strP, strQ, rVarF, strQ2, (e23.a) objQ, null, null, mVar, 3072, 192);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e2.d) obj3).getClass();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    u4.d dVar2 = uVar2.f25613a;
                                    String lowerCase2 = xy2.b.l(uVar2, mVar2).toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    String strP2 = y.P(R.string.dont_see_your_placeholder, new Object[]{lowerCase2}, mVar2);
                                    String strQ3 = y.Q(mVar2, R.string.you_can_enter_manually);
                                    String strP3 = y.P(R.string.enter_placeholder_model, new Object[]{xy2.b.l(uVar2, mVar2)}, mVar2);
                                    boolean zB2 = mVar2.B(lVar2) | mVar2.B(str2);
                                    Object objQ2 = mVar2.q();
                                    if (zB2) {
                                        objQ2 = new bb1.d(lVar2, str2, 6);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new bb1.d(lVar2, str2, 6);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    b82.n.d(dVar2, strP2, strQ3, rVarF2, strP3, (e23.a) objQ2, null, null, mVar2, 3072, 192);
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 2);
                break;
            default:
                f0Var.getClass();
                str.getClass();
                final int i15 = 1;
                final u uVar2 = this.f138232b;
                final e23.l lVar2 = this.f138233c;
                f0.b(f0Var, "manual_entry_prompt", new z3.e(-848469193, true, new e23.q() { // from class: pk0.j
                    /* JADX WARN: Code duplicated, block: B:13:0x0083  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0107  */
                    @Override // e23.q
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i16 = i15;
                        p3.m.a aVar = p3.m.f135153a;
                        String str2 = str;
                        e23.l lVar3 = lVar2;
                        u uVar3 = uVar2;
                        switch (i16) {
                            case 0:
                                p3.m mVar = (p3.m) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                ((e2.d) obj3).getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                                    u4.d dVar = uVar3.f25613a;
                                    String lowerCase = xy2.b.l(uVar3, mVar).toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    String strP = y.P(R.string.dont_see_your_placeholder, new Object[]{lowerCase}, mVar);
                                    String strQ = y.Q(mVar, R.string.you_can_enter_manually);
                                    String strQ2 = y.Q(mVar, R.string.enter_brand);
                                    boolean zB = mVar.B(lVar3) | mVar.B(str2);
                                    Object objQ = mVar.q();
                                    if (zB) {
                                        objQ = new bb1.d(lVar3, str2, 5);
                                        mVar.K(objQ);
                                    } else {
                                        aVar.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new bb1.d(lVar3, str2, 5);
                                            mVar.K(objQ);
                                        }
                                    }
                                    b82.n.d(dVar, strP, strQ, rVarF, strQ2, (e23.a) objQ, null, null, mVar, 3072, 192);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e2.d) obj3).getClass();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    u4.d dVar2 = uVar3.f25613a;
                                    String lowerCase2 = xy2.b.l(uVar3, mVar2).toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    String strP2 = y.P(R.string.dont_see_your_placeholder, new Object[]{lowerCase2}, mVar2);
                                    String strQ3 = y.Q(mVar2, R.string.you_can_enter_manually);
                                    String strP3 = y.P(R.string.enter_placeholder_model, new Object[]{xy2.b.l(uVar3, mVar2)}, mVar2);
                                    boolean zB2 = mVar2.B(lVar3) | mVar2.B(str2);
                                    Object objQ2 = mVar2.q();
                                    if (zB2) {
                                        objQ2 = new bb1.d(lVar3, str2, 6);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new bb1.d(lVar3, str2, 6);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    b82.n.d(dVar2, strP2, strQ3, rVarF2, strP3, (e23.a) objQ2, null, null, mVar2, 3072, 192);
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
