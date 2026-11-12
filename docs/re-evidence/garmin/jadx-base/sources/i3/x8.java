package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x8 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b f90302b;

    public /* synthetic */ x8(s1.b bVar, int i14) {
        this.f90301a = i14;
        this.f90302b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o4.t0 t0Var = (o4.t0) obj;
        switch (this.f90301a) {
            case 0:
                float fFloatValue = ((Number) this.f90302b.e()).floatValue();
                float fD = e9.d(t0Var, fFloatValue);
                float fE = e9.e(t0Var, fFloatValue);
                t0Var.w(fE == 0.0f ? 1.0f : fD / fE);
                t0Var.T0(e9.f87966c);
                break;
            default:
                t0Var.getClass();
                float fFloatValue2 = ((((Number) this.f90302b.e()).floatValue() - 1.6f) * 0.5f) + 1.0f;
                t0Var.v(fFloatValue2);
                t0Var.w(fFloatValue2);
                break;
        }
        return Unit.INSTANCE;
    }
}
