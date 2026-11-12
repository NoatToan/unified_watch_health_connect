package b21;

import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u8 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f15287b;

    public /* synthetic */ u8(u21.u0 u0Var, int i14) {
        this.f15286a = i14;
        this.f15287b = u0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f15286a) {
            case 0:
                u21.u0 u0Var = this.f15287b;
                ge1.b.T(androidx.lifecycle.v1.a(u0Var), null, null, new u21.y0(u0Var, null), 3);
                return Unit.INSTANCE;
            case 1:
                this.f15287b.u1();
                return Unit.INSTANCE;
            case 2:
                return ParametersHolderKt.parametersOf((s21.t) this.f15287b.f168159j.getValue());
            default:
                u21.u0 u0Var2 = this.f15287b;
                ge1.b.T(androidx.lifecycle.v1.a(u0Var2), null, null, new u21.a1(u0Var2, null), 3);
                return Unit.INSTANCE;
        }
    }
}
