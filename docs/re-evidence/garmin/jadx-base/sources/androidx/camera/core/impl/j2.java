package androidx.camera.core.impl;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface j2 extends x0 {
    @Override // androidx.camera.core.impl.x0
    default Set<x0.b> a(x0.a<?> aVar) {
        return getConfig().a(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    default boolean b(x0.a<?> aVar) {
        return getConfig().b(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    default <ValueT> ValueT c(x0.a<ValueT> aVar, x0.b bVar) {
        return (ValueT) getConfig().c(aVar, bVar);
    }

    @Override // androidx.camera.core.impl.x0
    default Set<x0.a<?>> d() {
        return getConfig().d();
    }

    @Override // androidx.camera.core.impl.x0
    default <ValueT> ValueT e(x0.a<ValueT> aVar) {
        return (ValueT) getConfig().e(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    default <ValueT> ValueT f(x0.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) getConfig().f(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.x0
    default void g(a0.h hVar) {
        getConfig().g(hVar);
    }

    x0 getConfig();

    @Override // androidx.camera.core.impl.x0
    default x0.b h(x0.a<?> aVar) {
        return getConfig().h(aVar);
    }
}
