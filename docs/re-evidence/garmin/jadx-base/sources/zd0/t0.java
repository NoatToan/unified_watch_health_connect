package zd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f204133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c80.s0 f204134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c80.y0 f204135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f204136e;

    public /* synthetic */ t0(u0 u0Var, c80.s0 s0Var, c80.y0 y0Var, j0 j0Var, e23.l lVar, int i14) {
        this.f204132a = i14;
        this.f204133b = u0Var;
        this.f204134c = s0Var;
        this.f204135d = y0Var;
        this.f204136e = j0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f204132a;
        j0 j0Var = this.f204136e;
        c80.y0 y0Var = this.f204135d;
        c80.s0 s0Var = this.f204134c;
        u0 u0Var = this.f204133b;
        Context context = (Context) obj;
        switch (i14) {
            case 0:
                int i15 = u0.f204141p;
                context.getClass();
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo alert tapped in " + s0Var);
                u0Var.f204146e.a(ht.q.CLOSE, y0Var.f25637a, s0Var);
                u0.z(u0Var, y0Var, s0Var, false, 12);
                j0Var.a(context);
                break;
            default:
                int i16 = u0.f204141p;
                context.getClass();
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo tapped in " + s0Var);
                u0Var.f204146e.a(ht.q.TAP, y0Var.f25637a, s0Var);
                c80.k0 k0Var = y0Var.f25647k;
                if (k0Var.f25402b && k0Var.f25403c) {
                    u0.z(u0Var, y0Var, s0Var, false, 4);
                }
                j0Var.a(context);
                break;
        }
        return Unit.INSTANCE;
    }
}
