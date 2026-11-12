package et1;

import org.koin.compose.InjectKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g implements e23.a<ParametersHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3 f65597a;

    public g(x3 x3Var) {
        this.f65597a = x3Var;
    }

    @Override // e23.a
    public final ParametersHolder invoke() {
        ParametersHolder parametersHolder;
        e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(this.f65597a);
        return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
    }
}
