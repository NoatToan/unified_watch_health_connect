package lo;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements r22.e.b, r22.h1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f113910b;

    public /* synthetic */ m(t tVar, int i14) {
        this.f113909a = i14;
        this.f113910b = tVar;
    }

    @Override // r22.e.b
    public void a(int i14, int i15, String str, l3 l3Var) {
        switch (this.f113909a) {
            case 0:
                t tVar = this.f113910b;
                f0 f0Var = tVar.f113949a;
                Context contextRequireContext = tVar.requireContext();
                f0Var.getClass();
                double d14 = i14;
                int i16 = l3Var.f113908b;
                String strD = c22.l3.d(true, contextRequireContext.getString(i16), d14);
                f0Var.f113766c2 = i16 != R.string.lbl_foot;
                f0Var.Z1.put("visibility", Double.valueOf(d14));
                f0.v0(f0Var.f113768d0, strD);
                f0.v0(f0Var.A0, strD);
                tVar.w6();
                break;
            case 1:
                t tVar2 = this.f113910b;
                f0 f0Var2 = tVar2.f113949a;
                Context contextRequireContext2 = tVar2.requireContext();
                f0Var2.getClass();
                double d15 = i14;
                int i17 = l3Var.f113908b;
                String strD2 = c22.l3.d(true, contextRequireContext2.getString(i17), d15);
                f0Var2.f113770d2 = i17 != R.string.lbl_foot;
                f0Var2.Z1.put("splitsMaxDistance", Double.valueOf(d15));
                f0.v0(f0Var2.Q0, strD2);
                tVar2.w6();
                break;
            case 2:
                t tVar3 = this.f113910b;
                f0 f0Var3 = tVar3.f113949a;
                f0Var3.P1 = Integer.parseInt(str);
                f0Var3.Q1 = 0;
                f0Var3.S1 = l3Var;
                f0Var3.K0();
                tVar3.w6();
                break;
            default:
                t tVar4 = this.f113910b;
                tVar4.f113949a.L0(i14, i15, l3Var);
                tVar4.w6();
                break;
        }
    }

    public void b(Double d14, String str) {
        t tVar = this.f113910b;
        tVar.f113949a.e1(false, str, d14.doubleValue());
        if (Double.isNaN(tVar.f113949a.d0())) {
            tVar.f113949a.e1(false, "po2MaxValue", d14.doubleValue());
        }
        if (Double.isNaN(tVar.f113949a.e0())) {
            tVar.f113949a.e1(false, "po2MinValue", d14.doubleValue());
        }
        tVar.w6();
    }
}
