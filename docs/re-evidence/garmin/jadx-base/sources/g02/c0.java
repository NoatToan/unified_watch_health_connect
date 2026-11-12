package g02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f74337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f74339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f74340e;

    public /* synthetic */ c0(int i14, String str, String str2, String str3, String str4) {
        this.f74336a = i14;
        this.f74337b = str;
        this.f74338c = str2;
        this.f74339d = str3;
        this.f74340e = str4;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String strP;
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f74336a) {
            case 0:
                k0Var.getClass();
                String str = this.f74337b;
                if (str == null) {
                    str = this.f74338c;
                }
                String str2 = this.f74339d;
                if (str2 == null) {
                    str2 = this.f74340e;
                }
                p5.h0.n(k0Var, str + ", " + str2);
                break;
            default:
                k0Var.getClass();
                String str3 = this.f74337b;
                String str4 = this.f74338c;
                String str5 = this.f74339d;
                String str6 = this.f74340e;
                if (str3 != null) {
                    if (str6 == null) {
                        str6 = "";
                    }
                    strP = oi0.c.P(p13.x.k(str3, str4, str5, str6));
                } else {
                    if (str6 == null) {
                        str6 = "";
                    }
                    strP = oi0.c.P(p13.x.k(str4, str5, str6));
                }
                p5.h0.n(k0Var, strP);
                break;
        }
        return Unit.INSTANCE;
    }
}
