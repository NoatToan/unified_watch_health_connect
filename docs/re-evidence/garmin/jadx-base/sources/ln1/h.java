package ln1;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn1.d f113669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.c f113670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi0.h f113671d;

    public /* synthetic */ h(mn1.d dVar, km1.c cVar, oi0.h hVar, int i14) {
        this.f113668a = i14;
        this.f113669b = dVar;
        this.f113670c = cVar;
        this.f113671d = hVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f113668a;
        oi0.h hVar = this.f113671d;
        km1.c cVar = this.f113670c;
        mn1.d dVar = this.f113669b;
        switch (i14) {
            case 0:
                l22.b bVar = dVar.f119771a;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strD = dVar.d(cVar.c0());
                    String string = bVar.getString(R.string.lbl_awake_restlessness);
                    int i15 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i15, 124, null, t2Var, null, null, strD, string, null, null, mVar);
                    int iH0 = (int) (((double) cVar.h0()) * 60.0d);
                    String strB = dVar.b(iH0);
                    String string2 = bVar.getString(R.string.lbl_total_awake_time);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", e5.g(bVar.getString(R.string.lbl_total_awake_time), StringUtils.SPACE, hVar.c(iH0, false)));
                    b92.a aVarB = c0235a.b();
                    int i16 = b92.a.f16960b;
                    x0Var.a(i15, 60, aVarB, t2Var, null, null, strB, string2, null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    String strD2 = dVar.d(cVar.H());
                    String string3 = dVar.f119771a.getString(R.string.sleep_help_deep_sleep_label);
                    int i17 = (iIntValue2 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i17, 124, null, t2Var2, null, null, strD2, string3, null, null, mVar2);
                    int iI0 = (int) (((double) cVar.i0()) * 60.0d);
                    String strB2 = dVar.b(iI0);
                    String strG = dVar.g();
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("merge", e5.g(dVar.g(), StringUtils.SPACE, hVar.c(iI0, false)));
                    b92.a aVarB2 = c0235a2.b();
                    int i18 = b92.a.f16960b;
                    x0Var2.a(i17, 60, aVarB2, t2Var2, null, null, strB2, strG, null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    x0 x0Var3 = x0.f111346a;
                    String strD3 = dVar.d(cVar.M());
                    String string4 = dVar.f119771a.getString(R.string.sleep_help_light_sleep_label);
                    int i19 = (iIntValue3 & 14) | (x0.f111348c << 24);
                    x0Var3.a(i19, 124, null, t2Var3, null, null, strD3, string4, null, null, mVar3);
                    int iJ0 = (int) (((double) cVar.j0()) * 60.0d);
                    String strB3 = dVar.b(iJ0);
                    String strG2 = dVar.g();
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    c0235a3.f16962a.put("merge", e5.g(dVar.g(), StringUtils.SPACE, hVar.c(iJ0, false)));
                    b92.a aVarB3 = c0235a3.b();
                    int i24 = b92.a.f16960b;
                    x0Var3.a(i19, 60, aVarB3, t2Var3, null, null, strB3, strG2, null, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            default:
                t2 t2Var4 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    x0 x0Var4 = x0.f111346a;
                    String strD4 = dVar.d(cVar.a0());
                    String string5 = dVar.f119771a.getString(R.string.sleep_help_rem_sleep_label);
                    int i25 = (iIntValue4 & 14) | (x0.f111348c << 24);
                    x0Var4.a(i25, 124, null, t2Var4, null, null, strD4, string5, null, null, mVar4);
                    int iK0 = (int) (((double) cVar.k0()) * 60.0d);
                    String strB4 = dVar.b(iK0);
                    String strG3 = dVar.g();
                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                    c0235a4.f16962a.put("merge", e5.g(dVar.g(), StringUtils.SPACE, hVar.c(iK0, false)));
                    b92.a aVarB4 = c0235a4.b();
                    int i26 = b92.a.f16960b;
                    x0Var4.a(i25, 60, aVarB4, t2Var4, null, null, strB4, strG3, null, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
