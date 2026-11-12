package ds;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f60896b;

    public /* synthetic */ c0(Integer num, int i14) {
        this.f60895a = i14;
        this.f60896b = num;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f60895a;
        String strH = null;
        Integer num = this.f60896b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(-1067477077, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                t4.d dVarA = n5.c.a(num != null ? num.intValue() : R.drawable.bg_orange_gradient, mVar, 0);
                f5.k.f68985a.getClass();
                h4.r rVarA = l4.r.a(rVar, dVarA, null, f5.k.a.f68993h, 0.0f, null, 54);
                mVar.f();
                return rVarA;
            case 1:
                c2.t tVar = (c2.t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        l3.f23124b.getClass();
                        strH = l3.a.Z0(iIntValue2);
                    }
                    if (strH == null) {
                        strH = sn.a.h(mVar2, 172437121, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(172435199);
                        mVar2.f();
                    }
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strH, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar2), mVar2, 0, 0, 131068);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(tVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (num != null) {
                        int iIntValue4 = num.intValue();
                        l3.f23124b.getClass();
                        strH = l3.a.Z0(iIntValue4);
                    }
                    if (strH == null) {
                        strH = sn.a.h(mVar3, 1391886359, R.string.no_value, mVar3);
                    } else {
                        mVar3.C(1391883166);
                        mVar3.f();
                    }
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC2 = tVar2.c(aVar2, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strH, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar3), mVar3, 0, 0, 131068);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
