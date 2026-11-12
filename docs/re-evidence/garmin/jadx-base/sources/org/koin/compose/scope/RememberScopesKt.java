package org.koin.compose.scope;

import ch.qos.logback.core.joran.action.Action;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "rememberKoinScope", "(Lorg/koin/core/scope/Scope;Lp3/m;I)Lorg/koin/core/scope/Scope;", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberScopesKt {
    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    @KoinExperimentalAPI
    public static final Scope rememberKoinScope(Scope scope, m mVar, int i14) {
        scope.getClass();
        mVar.L(-424940701);
        Koin koin = KoinApplicationKt.getKoin(mVar, 0);
        mVar.L(47274260);
        boolean zB = mVar.B(scope);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new CompositionKoinScopeLoader(scope, koin);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new CompositionKoinScopeLoader(scope, koin);
                mVar.K(objQ);
            }
        }
        mVar.R();
        Scope scope2 = ((CompositionKoinScopeLoader) objQ).getScope();
        mVar.R();
        return scope2;
    }
}
