package com.xiaomi.hm.health.stress;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "stressScope", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class StressScopeNamesKt {
    @NotNull
    public static final Scope stressScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, StressScopeNames.STRESS, QualifierKt.named(StressScopeNames.STRESS), null, 4, null);
    }
}
