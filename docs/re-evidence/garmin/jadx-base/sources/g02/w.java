package g02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f74601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74602c;

    public /* synthetic */ w(String str, boolean z14, int i14) {
        this.f74600a = i14;
        this.f74602c = str;
        this.f74601b = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f74600a;
        boolean z14 = this.f74601b;
        String str = this.f74602c;
        switch (i14) {
            case 0:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                if (z14) {
                    k23.l<Object>[] lVarArr = p5.h0.f136016a;
                    p5.d0.f135959a.getClass();
                    k0Var.a(p5.d0.N, str);
                }
                return Unit.INSTANCE;
            case 1:
                h4.r rVar = (h4.r) obj;
                rVar.getClass();
                return p5.v.c(new w(z14, str, 0), rVar, true);
            case 2:
                p5.k0 k0Var2 = (p5.k0) obj;
                l72.x0 x0Var = l72.x0.f111346a;
                k0Var2.getClass();
                p5.h0.n(k0Var2, str);
                if (!z14) {
                    p5.h0.b(k0Var2);
                }
                return Unit.INSTANCE;
            default:
                p5.k0 k0Var3 = (p5.k0) obj;
                l72.x0 x0Var2 = l72.x0.f111346a;
                k0Var3.getClass();
                p5.h0.n(k0Var3, str);
                if (!z14) {
                    p5.h0.b(k0Var3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w(boolean z14, String str, int i14) {
        this.f74600a = i14;
        this.f74601b = z14;
        this.f74602c = str;
    }
}
