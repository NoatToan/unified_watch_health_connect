package com.xiaomi.hm.health.di.koin.scope;

import com.xiaomi.hm.health.di.koin.module.MiFitScopeNames;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "userScope", "deviceDataScope", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ScopesKt {
    @NotNull
    public static final Scope deviceDataScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, MiFitScopeNames.DEVICE_DATA, QualifierKt.named(MiFitScopeNames.DEVICE_DATA), null, 4, null);
    }

    @NotNull
    public static final Scope userScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "User", QualifierKt.named("User"), null, 4, null);
    }

    @NotNull
    public static final Scope userScope(@NotNull Scope scope) {
        return userScope(scope.getKoin());
    }
}
