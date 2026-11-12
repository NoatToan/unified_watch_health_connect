package com.huami.heartrate.koin;

import com.huami.heartrate.model.UserOfHeartRate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/huami/heartrate/model/UserOfHeartRate;", "userOfHeartRate", "Lorg/koin/core/scope/Scope;", "getOrCreateHeartRateScope", "", "HEART_RATE_KOIN_SCOPE_ID", "Ljava/lang/String;", "HEART_RATE_USER_KEY", "heartrate-service_release"}, k = 2, mv = {1, 5, 1})
public final class ScopeKt {

    @NotNull
    public static final String HEART_RATE_KOIN_SCOPE_ID = "heart_rate_koin_scope_id";

    @NotNull
    public static final String HEART_RATE_USER_KEY = "heart_rate_user_key";

    @NotNull
    public static final Scope getOrCreateHeartRateScope(@NotNull UserOfHeartRate userOfHeartRate) {
        String str = HEART_RATE_KOIN_SCOPE_ID + userOfHeartRate.getUserId();
        Koin koin = GlobalContext.INSTANCE.get();
        koin.setProperty(HEART_RATE_USER_KEY, userOfHeartRate);
        Scope scopeOrNull = koin.getScopeOrNull(str);
        return scopeOrNull == null ? Koin.getOrCreateScope$default(koin, str, QualifierKt.named(HEART_RATE_KOIN_SCOPE_ID), null, 4, null) : scopeOrNull;
    }
}
