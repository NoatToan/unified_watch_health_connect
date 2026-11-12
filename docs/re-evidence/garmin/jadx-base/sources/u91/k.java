package u91;

import h4.r;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import p5.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aa1.g f169561b;

    public /* synthetic */ k(aa1.g gVar, int i14) {
        this.f169560a = i14;
        this.f169561b = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f169560a) {
            case 0:
                r rVar = (r) obj;
                rVar.getClass();
                return v.c(new k(this.f169561b, 4), rVar, false);
            case 1:
                r rVar2 = (r) obj;
                rVar2.getClass();
                return v.c(new k(this.f169561b, 3), rVar2, false);
            case 2:
                r rVar3 = (r) obj;
                rVar3.getClass();
                return v.c(new k(this.f169561b, 5), rVar3, false);
            case 3:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                String str = this.f169561b.f2285k;
                if (str == null) {
                    str = "";
                }
                h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 4:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                String str2 = this.f169561b.f2279e;
                if (str2 == null) {
                    str2 = "";
                }
                h0.n(k0Var2, str2);
                return Unit.INSTANCE;
            default:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                String str3 = this.f169561b.f2283i;
                if (str3 == null) {
                    str3 = "";
                }
                h0.n(k0Var3, str3);
                return Unit.INSTANCE;
        }
    }
}
