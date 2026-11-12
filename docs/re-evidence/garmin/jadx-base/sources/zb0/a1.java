package zb0;

import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a1 implements com.garmin.android.apps.connectmobile.settings.d.a, j42.b.InterfaceC1852b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f203425a;

    public /* synthetic */ a1(c1 c1Var) {
        this.f203425a = c1Var;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        Object value;
        int i14 = c1.f203441z;
        wn1.g gVarY6 = this.f203425a.y6();
        gVarY6.f186225h.U2(f14);
        p2 p2Var = gVarY6.f186226i;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, wn1.d.a((wn1.d) value, null, null, Float.valueOf(f14), null, null, null, 59)));
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        Object value;
        int i14 = c1.f203441z;
        wn1.g gVarY6 = this.f203425a.y6();
        gVarY6.f186225h.K1(d14);
        p2 p2Var = gVarY6.f186226i;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, wn1.d.a((wn1.d) value, null, null, null, Double.valueOf(d14), null, null, 55)));
    }
}
