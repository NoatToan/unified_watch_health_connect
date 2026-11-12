package com.huami.bluetooth.profile.channel.module.js;

import com.huami.bluetooth.profile.channel.module.js.impl.JSAppMessageApiImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/js/MessageTransferManager;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/js/JSAppMessageApi;", "loadApi", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MessageTransferManager {

    @NotNull
    private static final String a = "MessageTransferManager";

    @NotNull
    private static final Map<String, Integer> b = new LinkedHashMap();

    @NotNull
    private static final Map<Integer, JSAppMessageApi> c = new LinkedHashMap();

    @Nullable
    public final JSAppMessageApi loadApi(@NotNull HMBaseDevice device) throws Exception {
        Integer num;
        int iHashCode = device.hashCode();
        DeviceInfo deviceInfo = device.getDeviceInfo();
        String deviceID = deviceInfo == null ? null : deviceInfo.getDeviceID();
        if (deviceID == null) {
            throw new Exception("Get device id failed");
        }
        Map<Integer, JSAppMessageApi> map = c;
        if (map.containsKey(Integer.valueOf(iHashCode)) && (num = b.get(deviceID)) != null && num.intValue() == iHashCode) {
            return map.get(Integer.valueOf(iHashCode));
        }
        Map<String, Integer> map2 = b;
        Integer num2 = map2.get(deviceID);
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        TypeIntrinsics.asMutableMap(map).remove(num2);
        map2.remove(deviceID);
        Debug.fi(a, "Create js Message api");
        JSAppMessageApiImpl jSAppMessageApiImpl = new JSAppMessageApiImpl(device);
        map.put(Integer.valueOf(iHashCode), jSAppMessageApiImpl);
        map2.put(deviceID, Integer.valueOf(iHashCode));
        return jSAppMessageApiImpl;
    }
}
