package org.koin.compose.scope;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p3.y2;

/* JADX INFO: loaded from: classes3.dex */
@KoinExperimentalAPI
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lorg/koin/compose/scope/CompositionKoinScopeLoader;", "Lp3/y2;", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/Koin;", "koin", "<init>", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/Koin;)V", "", "close", "()V", "onRemembered", "onForgotten", "onAbandoned", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
@KoinInternalApi
public final class CompositionKoinScopeLoader implements y2 {
    public static final int $stable = 8;
    private final Koin koin;
    private final Scope scope;

    public CompositionKoinScopeLoader(Scope scope, Koin koin) {
        scope.getClass();
        koin.getClass();
        this.scope = scope;
        this.koin = koin;
    }

    private final void close() {
        this.koin.getLogger().debug(this + " -> close scope id: '" + this.scope.getId() + CoreConstants.SINGLE_QUOTE_CHAR);
        this.scope.close();
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final Scope getScope() {
        return this.scope;
    }

    @Override // p3.y2
    public void onAbandoned() {
        close();
    }

    @Override // p3.y2
    public void onForgotten() {
        close();
    }

    @Override // p3.y2
    public void onRemembered() {
    }
}
