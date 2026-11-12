package org.koin.core.component;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lorg/koin/core/component/KoinScopeComponent;", "Lorg/koin/core/component/KoinComponent;", "", "closeScope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "koin-core"}, k = 1, mv = {1, 5, 1})
public interface KoinScopeComponent extends KoinComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void closeScope(@NotNull KoinScopeComponent koinScopeComponent) {
            if (koinScopeComponent.getScope().isNotClosed()) {
                koinScopeComponent.getScope().close();
            }
        }

        @NotNull
        public static Koin getKoin(@NotNull KoinScopeComponent koinScopeComponent) {
            return KoinComponent.DefaultImpls.getKoin(koinScopeComponent);
        }
    }

    void closeScope();

    @NotNull
    Scope getScope();
}
