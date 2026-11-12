package nc1;

import b11.o;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import l72.x0;
import o13.p;
import o4.d0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f125357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f125358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f125359d;

    public /* synthetic */ a(Object obj, Object obj2, double d14, int i14) {
        this.f125356a = i14;
        this.f125358c = obj;
        this.f125359d = obj2;
        this.f125357b = d14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f125356a;
        double d14 = this.f125357b;
        Object obj4 = this.f125359d;
        Object obj5 = this.f125358c;
        switch (i14) {
            case 0:
                String str = (String) obj5;
                gc1.a aVar = (gc1.a) obj4;
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    String str2 = null;
                    x0 x0Var = x0.f111346a;
                    String string = aVar.f76926b.getString(R.string.pulse_ox_avg_spo2);
                    if (d14 > 0.0d) {
                        str2 = "%";
                    }
                    l22.a aVar2 = aVar.f76926b;
                    b92.a aVarA = wz1.a.a(str + "% " + aVar2.a(R.string.lbl_level_peripheral_oxygen_saturation, aVar2.getString(R.string.lbl_average)));
                    int i15 = iIntValue & 14;
                    int i16 = b92.a.f16960b;
                    int i17 = x0.f111348c;
                    x0Var.a((i17 << 24) | i15, 52, aVarA, t2Var, null, null, str, string, str2, null, mVar);
                    x0Var.h(t2Var, mVar, (i17 << 3) | i15);
                } else {
                    mVar.e();
                }
                break;
            default:
                o oVar = (o) obj5;
                p pVar = (p) obj4;
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    Double d15 = oVar.f14357b;
                    z01.b.a(rVar, d15 != null ? Float.valueOf((float) d15.doubleValue()) : null, ((d0) pVar.f128594a).f128833a, ((d0) pVar.f128595b).f128833a, Float.valueOf((float) d14), mVar2, iIntValue2 & 14);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
