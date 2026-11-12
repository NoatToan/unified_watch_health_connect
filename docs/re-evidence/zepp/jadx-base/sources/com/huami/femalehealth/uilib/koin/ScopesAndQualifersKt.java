package com.huami.femalehealth.uilib.koin;

import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.db.FemaleHealthDb;
import com.huami.femalehealth.logiclib.dto.Myself;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0000¨\u0006\f"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "femaleHealthScope", "femaleHealthContextScope", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "femaleHealthAppExecutors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "femaleHealthWebApi", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", "femaleHealthDb", "Lcom/huami/femalehealth/logiclib/dto/Myself;", "femaleHealthMyself", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {
    @NotNull
    public static final AppExecutors femaleHealthAppExecutors(@NotNull Koin koin) {
        return (AppExecutors) femaleHealthScope(koin).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null);
    }

    @NotNull
    public static final Scope femaleHealthContextScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, FemaleContextScopeNames.FEMALE_HEALTH_CONTEXT_HOLDER, QualifierKt.named(FemaleContextScopeNames.FEMALE_HEALTH_CONTEXT_HOLDER), null, 4, null);
    }

    @NotNull
    public static final FemaleHealthDb femaleHealthDb(@NotNull Koin koin) {
        return (FemaleHealthDb) femaleHealthScope(koin).get(Reflection.getOrCreateKotlinClass(FemaleHealthDb.class), null, null);
    }

    @NotNull
    public static final Myself femaleHealthMyself(@NotNull Koin koin) {
        return (Myself) femaleHealthScope(koin).get(Reflection.getOrCreateKotlinClass(Myself.class), null, null);
    }

    @NotNull
    public static final Scope femaleHealthScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, FemaleHealthScopeNames.FEMALE_HEALTH, QualifierKt.named(FemaleHealthScopeNames.FEMALE_HEALTH), null, 4, null);
    }

    @NotNull
    public static final FemaleHealthWebApi femaleHealthWebApi(@NotNull Koin koin) {
        return (FemaleHealthWebApi) femaleHealthScope(koin).get(Reflection.getOrCreateKotlinClass(FemaleHealthWebApi.class), null, null);
    }
}
