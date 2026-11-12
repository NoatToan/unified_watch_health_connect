package com.xiaomi.hm.health.devicex.manage.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "SCOPE_WATCH_SETTINGS", "Ljava/lang/String;", "Lorg/koin/core/scope/Scope;", "getWatchSettingsScope", "()Lorg/koin/core/scope/Scope;", "watchSettingsScope", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {

    @NotNull
    public static final String SCOPE_WATCH_SETTINGS = "WatchSettings";

    @NotNull
    public static final Scope getWatchSettingsScope() {
        return Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), SCOPE_WATCH_SETTINGS, QualifierKt.named(SCOPE_WATCH_SETTINGS), null, 4, null);
    }
}
