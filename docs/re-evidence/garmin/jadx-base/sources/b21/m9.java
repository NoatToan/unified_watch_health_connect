package b21;

import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m9 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15050b;

    public /* synthetic */ m9(boolean z14, int i14) {
        this.f15049a = i14;
        this.f15050b = z14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f15049a) {
            case 0:
                return ParametersHolderKt.parametersOf(Boolean.valueOf(this.f15050b));
            case 1:
                return p3.p0.n(Boolean.valueOf(this.f15050b));
            default:
                return ParametersHolderKt.parametersOf(Boolean.valueOf(this.f15050b));
        }
    }
}
