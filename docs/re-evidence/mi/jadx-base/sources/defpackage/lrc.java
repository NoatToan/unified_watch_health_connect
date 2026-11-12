package defpackage;

import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.device.api.DeviceStat;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface lrc {
    List<DeviceStat> getBleGatewayDeviceList();

    void getBleGatewaySubDevices(List<String> list, List<String> list2, Callback<List<DeviceStat>> callback);

    DeviceStat getDeviceByDid(String str);

    List<DeviceStat> getDeviceList();
}
