package org.koin.core.component;

import ch.qos.logback.core.joran.action.Action;
import org.koin.core.Koin;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/koin/core/component/KoinScopeComponent;", "Lorg/koin/core/component/KoinComponent;", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KoinScopeComponent extends KoinComponent {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Koin getKoin(KoinScopeComponent koinScopeComponent) {
            return KoinComponent.DefaultImpls.getKoin(koinScopeComponent);
        }
    }

    Scope getScope();
}
