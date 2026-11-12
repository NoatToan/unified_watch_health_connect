package n70;

import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f124767b;

    public /* synthetic */ y2(z2 z2Var, int i14) {
        this.f124766a = i14;
        this.f124767b = z2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f124766a;
        z2 z2Var = this.f124767b;
        switch (i14) {
            case 0:
                int i15 = z2.f124801j;
                return (ic0.a) KoinJavaComponent.get$default(ic0.a.class, null, new y2(z2Var, 1), 2, null);
            default:
                return ParametersHolderKt.parametersOf(z2Var.f124802a);
        }
    }
}
