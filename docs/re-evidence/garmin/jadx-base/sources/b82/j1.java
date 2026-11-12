package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f16638c;

    public /* synthetic */ j1(boolean z14, g1 g1Var, int i14) {
        this.f16636a = i14;
        this.f16637b = z14;
        this.f16638c = g1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str;
        String str2;
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f16636a) {
            case 0:
                k0Var.getClass();
                boolean z14 = this.f16637b;
                g1 g1Var = this.f16638c;
                if (z14) {
                    str = g1Var.f16584c;
                    if (str == null) {
                        str = g1Var.f16582a;
                    }
                } else {
                    str = g1Var.f16585d;
                    if (str == null) {
                        str = g1Var.f16583b;
                    }
                }
                p5.h0.n(k0Var, str);
                break;
            default:
                k0Var.getClass();
                boolean z15 = this.f16637b;
                g1 g1Var2 = this.f16638c;
                if (z15) {
                    str2 = g1Var2.f16584c;
                    if (str2 == null) {
                        str2 = g1Var2.f16582a;
                    }
                } else {
                    str2 = g1Var2.f16585d;
                    if (str2 == null) {
                        str2 = g1Var2.f16583b;
                    }
                }
                p5.h0.n(k0Var, str2);
                break;
        }
        return Unit.INSTANCE;
    }
}
