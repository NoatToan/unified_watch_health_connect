package ic1;

import c2.t;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gc1.a f92603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Double f92604c;

    public /* synthetic */ a(gc1.a aVar, Double d14, int i14) {
        this.f92602a = i14;
        this.f92603b = aVar;
        this.f92604c = d14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f92602a;
        Double d14 = this.f92604c;
        gc1.a aVar = this.f92603b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    b.b(aVar, d14, mVar, 8);
                } else {
                    mVar.e();
                }
                break;
            default:
                l22.a aVar2 = aVar.f76926b;
                t2 t2Var = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    float fDoubleValue = (float) d14.doubleValue();
                    String strF = fDoubleValue > 0.0f ? androidx.core.view.j.f((int) fDoubleValue, " %") : aVar2.getString(R.string.no_value_card);
                    x0 x0Var = x0.f111346a;
                    String string = aVar2.getString(R.string.pulse_ox_avg_spo2);
                    int i15 = iIntValue2 & 14;
                    int i16 = x0.f111348c;
                    x0Var.a(i15 | (i16 << 24), 124, null, t2Var, null, null, strF, string, null, null, mVar2);
                    x0Var.h(t2Var, mVar2, i15 | (i16 << 3));
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
