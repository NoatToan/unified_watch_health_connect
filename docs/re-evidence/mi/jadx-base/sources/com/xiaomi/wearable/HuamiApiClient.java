package com.xiaomi.wearable;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.hm.m;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/wearable/HuamiApiClient;", "", "", "mac", "did", "Lcom/xiaomi/wearable/hm/m;", "getRemoteHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/wearable/hm/m;", "Lcom/xiaomi/wearable/HuamiApiChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addHuamiApiChangeListener", "(Ljava/lang/String;Lcom/xiaomi/wearable/HuamiApiChangeListener;)V", "removeRemoteHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "getHuamiDeviceCall", "(Lcom/xiaomi/wearable/core/DeviceInfo;)Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", Home.JSON_KEY_ADDRESS, "removeHuamiDeviceCall", "(Ljava/lang/String;)V", "Companion", "huami-export_release"}, k = 1, mv = {2, 0, 0})
public interface HuamiApiClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/wearable/HuamiApiClient$Companion;", "", "<init>", "()V", "huami-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addHuamiApiChangeListener(@NotNull String mac, @NotNull HuamiApiChangeListener listener);

    @NotNull
    IDeviceApiCall getHuamiDeviceCall(@NotNull DeviceInfo deviceInfo);

    @Nullable
    m getRemoteHuamiApi(@Nullable String mac, @Nullable String did);

    void removeHuamiDeviceCall(@NotNull String address);

    void removeRemoteHuamiApi(@Nullable String mac, @Nullable String did);
}
