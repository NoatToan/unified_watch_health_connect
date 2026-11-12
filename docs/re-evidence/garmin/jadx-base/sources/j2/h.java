package j2;

import e23.l;
import h5.e2;
import i4.t;
import l3.i1;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f96538b;

    public /* synthetic */ h(k0 k0Var, int i14) {
        this.f96537a = i14;
        this.f96538b = k0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f96537a;
        boolean z14 = false;
        k0 k0Var = this.f96538b;
        switch (i14) {
            case 0:
                int i15 = i.F;
                Boolean boolA = ((t) obj).a();
                if (boolA != null) {
                    h0.C(k0Var, boolA.booleanValue() ? r5.a.On : r5.a.Off);
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 1:
                int i16 = k.D;
                Boolean boolA2 = ((t) obj).a();
                if (boolA2 != null) {
                    h0.C(k0Var, boolA2.booleanValue() ? r5.a.On : r5.a.Off);
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            default:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                i1 i1Var = (i1) e2Var;
                i1Var.f109272b = true;
                i1Var.f109271a.invoke(k0Var);
                h5.k.g(i1Var).U();
                return Boolean.FALSE;
        }
    }
}
