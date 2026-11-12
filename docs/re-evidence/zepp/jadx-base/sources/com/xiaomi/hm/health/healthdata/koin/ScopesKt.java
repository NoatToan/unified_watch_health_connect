package com.xiaomi.hm.health.healthdata.koin;

import com.xiaomi.hm.health.healthdata.core.HealthDataDb;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2Dao;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.utils.headset.HearingHealthCoroutineScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000¨\u0006\r"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "healthDataScope", "Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "healthDataDb", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "healthCoreRepo", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "healthWebApi", "Lcom/xiaomi/hm/health/healthdata/core/dao/Spo2Dao;", "spo2Dao", "Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingHealthCoroutineScope;", "headsetCoroutineScope", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ScopesKt {
    @NotNull
    public static final HearingHealthCoroutineScope headsetCoroutineScope(@NotNull Koin koin) {
        return (HearingHealthCoroutineScope) healthDataScope(koin).get(Reflection.getOrCreateKotlinClass(HearingHealthCoroutineScope.class), null, null);
    }

    @NotNull
    public static final HealthCoreDataRepo healthCoreRepo(@NotNull Koin koin) {
        return (HealthCoreDataRepo) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null);
    }

    @NotNull
    public static final HealthDataDb healthDataDb(@NotNull Koin koin) {
        return (HealthDataDb) healthDataScope(koin).get(Reflection.getOrCreateKotlinClass(HealthDataDb.class), null, null);
    }

    @NotNull
    public static final Scope healthDataScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "health_data", QualifierKt.named("health_data"), null, 4, null);
    }

    @NotNull
    public static final UserDataRemoteAPI healthWebApi(@NotNull Koin koin) {
        return (UserDataRemoteAPI) healthDataScope(koin).get(Reflection.getOrCreateKotlinClass(UserDataRemoteAPI.class), null, null);
    }

    @NotNull
    public static final Spo2Dao spo2Dao(@NotNull Koin koin) {
        return healthDataDb(koin).spo2Dao();
    }
}
