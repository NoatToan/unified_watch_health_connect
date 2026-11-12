package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c5 f89754b;

    public /* synthetic */ t4(c5 c5Var, int i14) {
        this.f89753a = i14;
        this.f89754b = c5Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f89753a) {
            case 0:
                this.f89754b.c(((q5) obj).f89412a);
                break;
            case 1:
                this.f89754b.a(((Long) obj).longValue());
                break;
            case 2:
                Long l14 = (Long) obj;
                l14.longValue();
                c5 c5Var = this.f89754b;
                c5Var.j(l14, c5Var.i());
                break;
            default:
                Long l15 = (Long) obj;
                l15.longValue();
                c5 c5Var2 = this.f89754b;
                c5Var2.j(c5Var2.k(), l15);
                break;
        }
        return Unit.INSTANCE;
    }
}
