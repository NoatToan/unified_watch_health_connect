package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface p extends Config {
    @Override // androidx.camera.core.impl.Config
    default <ValueT> ValueT a(Config.a<ValueT> aVar) {
        return (ValueT) e().a(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    default void b(String str, Config.b bVar) {
        e().b(str, bVar);
    }

    @Override // androidx.camera.core.impl.Config
    default Set<Config.OptionPriority> c(Config.a<?> aVar) {
        return e().c(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    default <ValueT> ValueT d(Config.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) e().d(aVar, valuet);
    }

    Config e();

    @Override // androidx.camera.core.impl.Config
    default boolean f(Config.a<?> aVar) {
        return e().f(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    default <ValueT> ValueT g(Config.a<ValueT> aVar, Config.OptionPriority optionPriority) {
        return (ValueT) e().g(aVar, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    default Set<Config.a<?>> h() {
        return e().h();
    }

    @Override // androidx.camera.core.impl.Config
    default Config.OptionPriority i(Config.a<?> aVar) {
        return e().i(aVar);
    }
}
