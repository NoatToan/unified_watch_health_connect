package com.huami.sleepassistant.apilib.koin;

import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000¨\u0006\u000b"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "sleepAssistantScope", "sleepAssistantPublishScope", "sleepScope", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "sleepAssistantAppExecutors", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "sleepAssistantWebApi", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "sleepAssistantDb", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {
    @NotNull
    public static final AppExecutors sleepAssistantAppExecutors(@NotNull Koin koin) {
        return (AppExecutors) sleepAssistantScope(koin).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null);
    }

    @NotNull
    public static final SleepAssistantDb sleepAssistantDb(@NotNull Koin koin) {
        return (SleepAssistantDb) sleepAssistantScope(koin).get(Reflection.getOrCreateKotlinClass(SleepAssistantDb.class), null, null);
    }

    @NotNull
    public static final Scope sleepAssistantPublishScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, SleepAssistantScopeNames.SLEEP_ASSISTANT_PUBLISH, QualifierKt.named(SleepAssistantScopeNames.SLEEP_ASSISTANT_PUBLISH), null, 4, null);
    }

    @NotNull
    public static final Scope sleepAssistantScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, SleepAssistantScopeNames.SLEEP_ASSISTANT, QualifierKt.named(SleepAssistantScopeNames.SLEEP_ASSISTANT), null, 4, null);
    }

    @NotNull
    public static final SleepAssistantWebApi sleepAssistantWebApi(@NotNull Koin koin) {
        return (SleepAssistantWebApi) sleepAssistantScope(koin).get(Reflection.getOrCreateKotlinClass(SleepAssistantWebApi.class), null, null);
    }

    @NotNull
    public static final Scope sleepScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, SleepAssistantScopeNames.SLEEP_ASSISTANT, QualifierKt.named(SleepAssistantScopeNames.SLEEP_ASSISTANT), null, 4, null);
    }
}
