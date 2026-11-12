package com.huami.nps.di;

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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0002\u001a(\u0010\u0006\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/scope/Scope;", "npsScope", "Lorg/koin/core/Koin;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "getInNps", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "nps_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExKt {
    public static final /* synthetic */ <T> T getInNps(Scope scope, Qualifier qualifier) {
        Scope scopeNpsScope = npsScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeNpsScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object getInNps$default(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopeNpsScope = npsScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopeNpsScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Scope npsScope() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), NpsModuleKt.NPS_SCOPE_NAME, QualifierKt.named(NpsModuleKt.NPS_SCOPE_NAME), null, 4, null);
    }

    @NotNull
    public static final Scope npsScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, NpsModuleKt.NPS_SCOPE_NAME, QualifierKt.named(NpsModuleKt.NPS_SCOPE_NAME), null, 4, null);
    }
}
