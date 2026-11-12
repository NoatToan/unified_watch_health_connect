package com.xiaomi.eco.connection;

import com.xiaomi.eco.api.EcoBleConnection;
import com.xiaomi.eco.api.i;
import defpackage.jpc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "mac", "did", "", "isDeviceOwner", "", "bindType", "Lcom/xiaomi/eco/api/i;", "apiCall", "Ljpc;", "bleManager", "model", "deviceType", "Lcom/xiaomi/eco/api/EcoBleConnection;", "createEcoConnection", "(Ljava/lang/String;Ljava/lang/String;ZILcom/xiaomi/eco/api/i;Ljpc;Ljava/lang/String;I)Lcom/xiaomi/eco/api/EcoBleConnection;", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0})
public final class ConnectionFactoryKt {
    @NotNull
    public static final EcoBleConnection createEcoConnection(@NotNull String mac, @Nullable String str, boolean z, int i, @NotNull i apiCall, @NotNull jpc bleManager, @NotNull String model, int i2) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        Intrinsics.checkNotNullParameter(bleManager, "bleManager");
        Intrinsics.checkNotNullParameter(model, "model");
        EcoBleConnection ecoBleConnection = new EcoBleConnection(mac, str, z, i, apiCall, bleManager, model, i2);
        ecoBleConnection.setRetryStrategy(new LimitTimesStrategy(6, 10000));
        return ecoBleConnection;
    }
}
