package com.huami.heartrate.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"", "userId", "Lorg/koin/core/scope/Scope;", "getHrScopeByUserId", "", "closeHrScopeByUserId", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class HeartRateScopeKt {
    public static final void closeHrScopeByUserId(@NotNull String str) {
        getHrScopeByUserId(str).close();
    }

    @NotNull
    public static final synchronized Scope getHrScopeByUserId(@NotNull String str) {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), ScopeKt.HEART_RATE_KOIN_SCOPE_ID + str, QualifierKt.named(ScopeKt.HEART_RATE_KOIN_SCOPE_ID), null, 4, null);
    }
}
