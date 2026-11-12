package id0;

import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Scope f92896b;

    public /* synthetic */ q3(Scope scope, int i14) {
        this.f92895a = i14;
        this.f92896b = scope;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f92895a;
        Scope scope = this.f92896b;
        switch (i14) {
            case 0:
                r3 r3Var = r3.f92907a;
                return (zy0.n) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zy0.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
            default:
                return Scope.close$lambda$8(scope);
        }
    }
}
