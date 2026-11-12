package org.koin.androidx.scope;

import androidx.lifecycle.u1;
import ch.qos.logback.core.joran.action.Action;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/koin/androidx/scope/ScopeViewModel;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinScopeComponent;", "<init>", "()V", "", "onCloseScope", "onCleared", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ScopeViewModel extends u1 implements KoinScopeComponent {
    private final Scope scope = KoinScopeComponentKt.createScope(this, this);

    @Override // org.koin.core.component.KoinComponent
    public Koin getKoin() {
        return KoinScopeComponent.DefaultImpls.getKoin(this);
    }

    @Override // org.koin.core.component.KoinScopeComponent
    public Scope getScope() {
        return this.scope;
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        super.onCleared();
        onCloseScope();
        getScope().close();
    }

    public void onCloseScope() {
    }
}
