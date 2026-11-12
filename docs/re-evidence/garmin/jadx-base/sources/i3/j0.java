package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f88469b;

    public /* synthetic */ j0(mc mcVar, int i14) {
        this.f88468a = i14;
        this.f88469b = mcVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o4.t0 t0Var = (o4.t0) obj;
        switch (this.f88468a) {
            case 0:
                mc mcVar = this.f88469b;
                float floatValue = mcVar.f88996e.f109328j.getFloatValue();
                float fE = mcVar.f88996e.e().e();
                float f14 = floatValue < fE ? fE - floatValue : 0.0f;
                t0Var.w(f14 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (t0Var.getF128919r() & 4294967295L)) + f14) / Float.intBitsToFloat((int) (t0Var.getF128919r() & 4294967295L))) : 1.0f);
                t0Var.T0(o4.l1.b(0.5f, 0.0f));
                break;
            default:
                mc mcVar2 = this.f88469b;
                float floatValue2 = mcVar2.f88996e.f109328j.getFloatValue();
                float fE2 = mcVar2.f88996e.e().e();
                float f15 = floatValue2 < fE2 ? fE2 - floatValue2 : 0.0f;
                t0Var.w(f15 > 0.0f ? (Float.intBitsToFloat((int) (t0Var.getF128919r() & 4294967295L)) + f15) / Float.intBitsToFloat((int) (4294967295L & t0Var.getF128919r())) : 1.0f);
                t0Var.T0(o4.l1.b(0.5f, 0.0f));
                break;
        }
        return Unit.INSTANCE;
    }
}
