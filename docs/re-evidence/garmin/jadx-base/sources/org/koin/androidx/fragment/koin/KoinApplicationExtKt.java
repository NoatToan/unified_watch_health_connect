package org.koin.androidx.fragment.koin;

import androidx.fragment.app.q;
import lc.u0;
import org.koin.androidx.fragment.android.KoinFragmentFactory;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.w;
import ty1.q1;
import u1.y1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"fragmentFactoryModule", "Lorg/koin/core/module/Module;", "fragmentFactory", "", "Lorg/koin/core/KoinApplication;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinApplicationExtKt {
    private static final Module fragmentFactoryModule = ModuleDSLKt.module$default(false, new y1(5), 1, null);

    public static final void fragmentFactory(KoinApplication koinApplication) {
        koinApplication.getClass();
        Koin.loadModules$default(koinApplication.getKoin(), w.c(fragmentFactoryModule), false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fragmentFactoryModule$lambda$1(Module module) {
        module.getClass();
        q1 q1Var = new q1(10);
        SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(q.class), null, q1Var, Kind.Singleton, j0.f134944a), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP);
        }
        new KoinDefinition(module, singleInstanceFactoryP);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final q fragmentFactoryModule$lambda$1$lambda$0(Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        return new KoinFragmentFactory(null, 1, 0 == true ? 1 : 0);
    }
}
