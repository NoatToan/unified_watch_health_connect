package com.huami.worldclock.koin;

import com.huami.worldclock.proxy.DeviceHolder;
import com.huami.worldclock.proxy.ScopeComponents;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¨\u0006\u0007"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "getDeviceScope", "Lcom/huami/worldclock/proxy/DeviceHolder;", "getDeviceHolder", "Lcom/huami/worldclock/proxy/ScopeComponents;", "getScopeComponents", "worldclock_release"}, k = 2, mv = {1, 5, 1})
public final class DeviceScopesAndQualifierKt {
    @NotNull
    public static final DeviceHolder getDeviceHolder(@NotNull Koin koin) {
        return (DeviceHolder) getDeviceScope(koin).get(Reflection.getOrCreateKotlinClass(DeviceHolder.class), null, null);
    }

    @NotNull
    public static final synchronized Scope getDeviceScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, DeviceQualifier.DEVICE_FEATURE_WORLD_CLOCK, QualifierKt.named(DeviceQualifier.DEVICE_FEATURE_WORLD_CLOCK), null, 4, null);
    }

    @Nullable
    public static final ScopeComponents getScopeComponents(@NotNull Koin koin) {
        return (ScopeComponents) getDeviceScope(koin).get(Reflection.getOrCreateKotlinClass(ScopeComponents.class), null, null);
    }
}
