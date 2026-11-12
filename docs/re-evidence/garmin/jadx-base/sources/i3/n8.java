package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f89068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f89069c;

    public /* synthetic */ n8(String str, e23.a aVar, int i14) {
        this.f89067a = i14;
        this.f89068b = str;
        this.f89069c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f89067a;
        e23.a aVar = this.f89069c;
        String str = this.f89068b;
        p5.k0 k0Var = (p5.k0) obj;
        switch (i14) {
            case 0:
                p5.h0.E(k0Var, 1.0f);
                p5.h0.n(k0Var, str);
                p5.h0.i(k0Var, null, new gt1.s(aVar, 20));
                break;
            case 1:
                int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                k0Var.getClass();
                p5.h0.p(k0Var, p13.w.c(new p5.g(str, new sg0.q0(aVar, 20))));
                break;
            case 2:
                k0Var.getClass();
                p5.h0.p(k0Var, p13.w.c(new p5.g(str, new t21.a(aVar, 5))));
                break;
            default:
                k0Var.getClass();
                p5.h0.p(k0Var, p13.w.c(new p5.g(str, new t70.a1(aVar, 2))));
                break;
        }
        return Unit.INSTANCE;
    }
}
