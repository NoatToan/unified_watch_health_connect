package com.huami.sleep.koin;

import com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "sleepDataScope", "Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "heartRateRepo", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesKt {
    @NotNull
    public static final IHeartRateRepo heartRateRepo(@NotNull Koin koin) {
        return (IHeartRateRepo) sleepDataScope(koin).get(Reflection.getOrCreateKotlinClass(IHeartRateRepo.class), null, null);
    }

    @NotNull
    public static final Scope sleepDataScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null);
    }
}
