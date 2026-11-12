package org.koin.androidx.scope;

import androidx.lifecycle.u1;
import ch.qos.logback.core.joran.action.Action;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/koin/androidx/scope/ScopeHandlerViewModel;", "Landroidx/lifecycle/u1;", "<init>", "()V", "", "onCleared", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "setScope", "(Lorg/koin/core/scope/Scope;)V", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopeHandlerViewModel extends u1 {
    private Scope scope;

    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        super.onCleared();
        Scope scope = this.scope;
        if (scope != null && !scope.get_closed()) {
            scope.getLogger().debug("Closing scope " + this.scope);
            scope.close();
        }
        this.scope = null;
    }

    public final void setScope(Scope scope) {
        this.scope = scope;
    }
}
