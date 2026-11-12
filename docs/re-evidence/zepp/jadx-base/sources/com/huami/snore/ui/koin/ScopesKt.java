package com.huami.snore.ui.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "snoreDataScope", "snore_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesKt {
    @NotNull
    public static final Scope snoreDataScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, SnoreDataScopeNames.SNORE_DATA, QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), null, 4, null);
    }
}
