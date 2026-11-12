package defpackage;

import android.text.TextUtils;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.headset.api.HeadsetHost;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class nnb {
    public static CirculateDeviceInfo a(HeadsetHost headsetHost) {
        tpe.f("HeadsetUtil", "convert headset host: id=" + headsetHost.getHostId() + ", name=" + headsetHost.getName() + ", device type=" + headsetHost.getExtra().getString(DeviceContractKt.COLUMN_DEVICE_TYPE) + ", id=" + tpe.e(headsetHost.getExtra().getString("id", "")) + ", idHash=" + tpe.e(headsetHost.getExtra().getString("idhash", "")) + ", mac=" + tpe.e(headsetHost.getExtra().getString("mac", "")));
        CirculateDeviceInfo circulateDeviceInfo = new CirculateDeviceInfo();
        circulateDeviceInfo.f10301a = b(headsetHost);
        circulateDeviceInfo.h = new ExtraBundle.b().f(CirculateDeviceInfo.MIPLAY_ID, TextUtils.equals(headsetHost.getExtra().getString(DeviceContractKt.COLUMN_DEVICE_TYPE), "AndroidTv") ? headsetHost.getHostId() : "").a();
        return circulateDeviceInfo;
    }

    public static String b(HeadsetHost headsetHost) {
        String string = headsetHost.getExtra().getString(DeviceContractKt.COLUMN_DEVICE_TYPE, "");
        String string2 = headsetHost.getExtra().getString("idhash", "");
        if (!TextUtils.equals(string, "AndroidTv") || TextUtils.isEmpty(string2)) {
            return headsetHost.getHostId();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(65536);
        arrayList.add(262145);
        for (CirculateDeviceInfo circulateDeviceInfo : qx3.g().l(arrayList)) {
            if (circulateDeviceInfo.h.f("mac", CirculateDeviceInfo.DEFAULT_MAC).equalsIgnoreCase(headsetHost.getExtra().getString("mac", ""))) {
                return circulateDeviceInfo.f10301a;
            }
        }
        return string2;
    }
}
