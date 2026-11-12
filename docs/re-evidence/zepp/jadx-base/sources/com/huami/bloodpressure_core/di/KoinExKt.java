package com.huami.bloodpressure_core.di;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0002\u001a(\u0010\u0006\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/scope/Scope;", "bloodPressureScope", "Lorg/koin/core/Koin;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "getInBloodPressure", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExKt {
    @NotNull
    public static final Scope bloodPressureScope() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME, QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME), null, 4, null);
    }

    public static final /* synthetic */ <T> T getInBloodPressure(Scope scope, Qualifier qualifier) {
        Scope scopeBloodPressureScope = bloodPressureScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeBloodPressureScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object getInBloodPressure$default(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopeBloodPressureScope = bloodPressureScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopeBloodPressureScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Scope bloodPressureScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME, QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME), null, 4, null);
    }
}
