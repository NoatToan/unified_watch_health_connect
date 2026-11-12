package defpackage;

import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.device.api.DeviceStat;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class gu5 implements lrc {
    @Override // defpackage.lrc
    public List<DeviceStat> getBleGatewayDeviceList() {
        return null;
    }

    @Override // defpackage.lrc
    public void getBleGatewaySubDevices(List<String> list, List<String> list2, Callback<List<DeviceStat>> callback) {
        if (callback != null) {
            callback.onFailure(-1, "device inject api is null");
        }
    }

    @Override // defpackage.lrc
    public DeviceStat getDeviceByDid(String str) {
        return null;
    }

    @Override // defpackage.lrc
    public List<DeviceStat> getDeviceList() {
        return null;
    }
}
