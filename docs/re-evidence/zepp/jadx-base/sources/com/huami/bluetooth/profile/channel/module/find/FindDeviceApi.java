package com.huami.bluetooth.profile.channel.module.find;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H'J\b\u0010\t\u001a\u00020\bH&J\u0014\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u0014\u0010\u000b\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceApi;", "", "", "queryFindDeviceProtocolVersion", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "", "findDevice", "", "findDeviceSync", "confirmFindPhone", "stopFindPhone", "Lcom/huami/bluetooth/profile/channel/module/find/FindPhoneListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerListener", "unregisterListener", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface FindDeviceApi {
    void confirmFindPhone(@NotNull HMCallback<?> callback);

    @Deprecated(message = "推荐使用同步方法，由调用方处理线程切换", replaceWith = @ReplaceWith(expression = "findDeviceSync", imports = {}))
    void findDevice(@NotNull HMCallback<?> callback);

    boolean findDeviceSync();

    int queryFindDeviceProtocolVersion();

    void registerListener(@NotNull FindPhoneListener listener);

    void stopFindPhone(@NotNull HMCallback<?> callback);

    void unregisterListener(@NotNull FindPhoneListener listener);
}
