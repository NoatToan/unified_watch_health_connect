package com.huami.bloodoxygen.core.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0013\u0010\u0007\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lorg/koin/core/scope/Scope;", "a", "", "BLOOD_OXYGEN_KOIN_SCOPE_ID", "Ljava/lang/String;", "getBloodOxygenKoinScope", "()Lorg/koin/core/scope/Scope;", "bloodOxygenKoinScope", "core_release"}, k = 2, mv = {1, 5, 1})
public final class BloodOxygenKoinScopeKt {

    @NotNull
    public static final String BLOOD_OXYGEN_KOIN_SCOPE_ID = "blood_oxygen_koin_scope_id";

    private static final synchronized Scope a() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), BLOOD_OXYGEN_KOIN_SCOPE_ID, QualifierKt.named(BLOOD_OXYGEN_KOIN_SCOPE_ID), null, 4, null);
    }

    @NotNull
    public static final Scope getBloodOxygenKoinScope() {
        return a();
    }
}
