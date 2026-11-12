package vd0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l22.a f177438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe0.i f177439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f177440d;

    public /* synthetic */ z(int i14, l22.a aVar, pe0.i iVar, boolean z14) {
        this.f177437a = i14;
        this.f177438b = aVar;
        this.f177439c = iVar;
        this.f177440d = z14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f177437a;
        boolean z14 = this.f177440d;
        pe0.i iVar = this.f177439c;
        l22.a aVar = this.f177438b;
        switch (i18) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    ls.e eVar = ls.e.TOTAL_DISTANCE;
                    Double d14 = iVar.f137448a;
                    String strB = ss.k.b(eVar, aVar, d14 != null ? Double.valueOf(d14.doubleValue() / ((double) 100)) : null, 16);
                    if (strB == null) {
                        strB = sn.a.h(mVar, -545838377, R.string.no_value, mVar);
                    } else {
                        mVar.C(-545842283);
                        mVar.f();
                    }
                    String str = strB;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String strQ = gl1.y.Q(mVar, R.string.total_distance);
                    if (z14) {
                        i14 = -545832751;
                        i15 = R.string.f28709km;
                    } else {
                        i14 = -545831695;
                        i15 = R.string.f28711mi;
                    }
                    x0Var.f((iIntValue & 14) | (l72.x0.f111348c << 24), 116, null, t2Var, null, null, str, strQ, sn.a.h(mVar, i14, i15, mVar), null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    ls.e eVar2 = ls.e.TOTAL_DISTANCE;
                    Double d15 = iVar.f137448a;
                    String strB2 = ss.k.b(eVar2, aVar, d15 != null ? Double.valueOf(d15.doubleValue() / ((double) 100)) : null, 16);
                    if (strB2 == null) {
                        strB2 = sn.a.h(mVar2, -468944148, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(-468947899);
                        mVar2.f();
                    }
                    String str2 = strB2;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    String strQ2 = gl1.y.Q(mVar2, R.string.total_distance);
                    if (z14) {
                        i16 = -468938778;
                        i17 = R.string.f28709km;
                    } else {
                        i16 = -468937722;
                        i17 = R.string.f28711mi;
                    }
                    x0Var2.f((iIntValue2 & 14) | (l72.x0.f111348c << 24), 116, null, t2Var2, null, null, str2, strQ2, sn.a.h(mVar2, i16, i17, mVar2), null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
