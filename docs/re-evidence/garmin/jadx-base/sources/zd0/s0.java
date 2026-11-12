package zd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f204128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c80.s0 f204129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c80.y0 f204130d;

    public /* synthetic */ s0(c80.y0 y0Var, u0 u0Var, c80.s0 s0Var, int i14) {
        this.f204127a = i14;
        this.f204130d = y0Var;
        this.f204128b = u0Var;
        this.f204129c = s0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f204127a;
        c80.y0 y0Var = this.f204130d;
        c80.s0 s0Var = this.f204129c;
        u0 u0Var = this.f204128b;
        switch (i14) {
            case 0:
                int i15 = u0.f204141p;
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo alert dismissed in " + s0Var);
                u0Var.f204146e.a(ht.q.CLOSE, y0Var.f25637a, s0Var);
                u0.z(u0Var, y0Var, s0Var, false, 12);
                break;
            case 1:
                int i16 = u0.f204141p;
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo shown at " + s0Var);
                u0Var.f204146e.a(ht.q.SHOW, y0Var.f25637a, s0Var);
                break;
            case 2:
                int i17 = u0.f204141p;
                if (!y0Var.f25647k.f25402b) {
                    a2 a2Var = a2.PROMOTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "PromosManager", "Promotion is not dismissible but close was tapped. This is an error condition.");
                } else {
                    i2.f36769a.getClass();
                    i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo dismissed in " + s0Var);
                    u0Var.f204146e.a(ht.q.CLOSE, y0Var.f25637a, s0Var);
                    u0.z(u0Var, y0Var, s0Var, true, 4);
                }
                break;
            case 3:
                int i18 = u0.f204141p;
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo shown at " + s0Var);
                u0Var.f204146e.a(ht.q.SHOW, y0Var.f25637a, s0Var);
                break;
            case 4:
                int i19 = u0.f204141p;
                if (!y0Var.f25647k.f25402b) {
                    a2 a2Var2 = a2.PROMOTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "PromosManager", "Promotion is not dismissible but close was tapped. This is an error condition.");
                }
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo dismissed in " + s0Var);
                u0Var.f204146e.a(ht.q.CLOSE, y0Var.f25637a, s0Var);
                u0.z(u0Var, y0Var, s0Var, true, 4);
                break;
            default:
                int i24 = u0.f204141p;
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo alert shown at " + s0Var);
                u0Var.f204146e.a(ht.q.SHOW, y0Var.f25637a, s0Var);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s0(u0 u0Var, c80.s0 s0Var, c80.y0 y0Var, int i14) {
        this.f204127a = i14;
        this.f204128b = u0Var;
        this.f204129c = s0Var;
        this.f204130d = y0Var;
    }
}
