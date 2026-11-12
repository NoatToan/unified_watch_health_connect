package com.xiaomi.smarthome.devicesubscribe;

import com.xiaomi.smarthome.device.Device;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public interface DeviceSubscriberInterface {
    JSONArray getDeviceCachedProp(String str);

    List<String> getSubscribePropName(Device device);

    void onSubscribedValueChanged(String str, JSONArray jSONArray);
}
