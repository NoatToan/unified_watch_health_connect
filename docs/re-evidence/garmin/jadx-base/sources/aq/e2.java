package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f11926b;

    public /* synthetic */ e2(f2 f2Var, int i14) {
        this.f11925a = i14;
        this.f11926b = f2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f11925a) {
            case 0:
                this.f11926b.f11940c.V0(false);
                break;
            case 1:
                this.f11926b.f11940c.V0(false);
                break;
            default:
                this.f11926b.f11940c.V0(true);
                break;
        }
        return Unit.INSTANCE;
    }
}
