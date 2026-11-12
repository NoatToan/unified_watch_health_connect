package h50;

import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f82032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f82034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f82035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f82036f;

    public /* synthetic */ b(String str, int i14, String str2, String str3, String str4, String str5) {
        this.f82031a = i14;
        this.f82032b = str;
        this.f82033c = str2;
        this.f82034d = str3;
        this.f82035e = str4;
        this.f82036f = str5;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f82031a) {
            case 0:
                k0Var.getClass();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f82032b);
                sb3.append(", ");
                sb3.append(this.f82033c);
                sb3.append(", ");
                sn.a.t(sb3, this.f82034d, ", ", this.f82035e, ", ");
                sb3.append(this.f82036f);
                h0.n(k0Var, sb3.toString());
                break;
            default:
                k0Var.getClass();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f82032b);
                sb4.append(", ");
                sb4.append(this.f82033c);
                sb4.append(", ");
                sn.a.t(sb4, this.f82034d, ", ", this.f82035e, ", ");
                sb4.append(this.f82036f);
                h0.n(k0Var, sb4.toString());
                break;
        }
        return Unit.INSTANCE;
    }
}
