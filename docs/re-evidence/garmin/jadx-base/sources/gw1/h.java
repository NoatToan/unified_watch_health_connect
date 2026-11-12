package gw1;

import c2.t;
import c2.t2;
import c2.x2;
import e23.q;
import h4.r;
import java.util.ArrayList;
import l72.x0;
import o13.u;
import p005kotlin.Unit;
import p13.h0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f79854b;

    public /* synthetic */ h(int i14, ArrayList arrayList) {
        this.f79853a = i14;
        this.f79854b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f79853a;
        ArrayList arrayList = this.f79854b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    hw1.i.a(x2.f(r.S, 1.0f), arrayList, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                t2 t2Var = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    u uVar = (u) h0.e0(0, arrayList);
                    if (uVar == null) {
                        mVar2.C(1975456763);
                    } else {
                        mVar2.C(1975456764);
                        x0.f111346a.a((iIntValue2 & 14) | (x0.f111348c << 24), 116, null, t2Var, null, null, (String) uVar.f128605a, (String) uVar.f128606b, (String) uVar.f128607c, null, mVar2);
                        mVar2 = mVar2;
                    }
                    mVar2.f();
                    u uVar2 = (u) h0.e0(1, arrayList);
                    if (uVar2 == null) {
                        mVar2.C(1975582747);
                    } else {
                        mVar2.C(1975582748);
                        x0.f111346a.a((iIntValue2 & 14) | (x0.f111348c << 24), 116, null, t2Var, null, null, (String) uVar2.f128605a, (String) uVar2.f128606b, (String) uVar2.f128607c, null, mVar2);
                    }
                    mVar2.f();
                } else {
                    mVar2.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var2) ? 4 : 2;
                }
                int i15 = iIntValue3;
                if (mVar3.n(i15 & 1, (i15 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    u uVar3 = (u) h0.e0(2, arrayList);
                    if (uVar3 == null) {
                        mVar3.C(1057117860);
                    } else {
                        mVar3.C(1057117861);
                        x0.f111346a.a((i15 & 14) | (x0.f111348c << 24), 116, null, t2Var2, null, null, (String) uVar3.f128605a, (String) uVar3.f128606b, (String) uVar3.f128607c, null, mVar3);
                    }
                    mVar3.f();
                    u uVar4 = (u) h0.e0(3, arrayList);
                    if (uVar4 == null) {
                        mVar3.C(1057243844);
                        mVar3.f();
                    } else {
                        mVar3.C(1057243845);
                        x0.f111346a.a((i15 & 14) | (x0.f111348c << 24), 116, null, t2Var2, null, null, (String) uVar4.f128605a, (String) uVar4.f128606b, (String) uVar4.f128607c, null, mVar3);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
