package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f90397b;

    public /* synthetic */ y3(k4 k4Var, int i14) {
        this.f90396a = i14;
        this.f90397b = k4Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f90396a) {
            case 0:
                this.f90397b.c(((q5) obj).f89412a);
                break;
            case 1:
                this.f90397b.h((Long) obj);
                break;
            case 2:
                this.f90397b.a(((Long) obj).longValue());
                break;
            default:
                Long l14 = (Long) obj;
                l14.longValue();
                this.f90397b.h(l14);
                break;
        }
        return Unit.INSTANCE;
    }
}
