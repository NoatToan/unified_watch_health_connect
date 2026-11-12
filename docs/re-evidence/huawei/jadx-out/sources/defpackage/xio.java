package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xio {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53067c;

    private xio() {
        this.f53066b = "hw.unitedevice.";
        this.f53067c = 1;
        LogUtil.b("HwP2pKitManager", "enter HwHiWearKitManager");
    }

    public int a() {
        int i;
        synchronized (d) {
            i = (this.f53067c + 1) % 32766;
            this.f53067c = i;
        }
        return i;
    }

    public boolean d(byte[] bArr, xiv xivVar, Map<Integer, PingCallback> map) {
        if (bArr != null && bArr[0] == 57 && bArr[1] == 1) {
            LogUtil.e("HwP2pKitManager", "isHealthResult sport bt-proxy");
            return true;
        }
        if (xivVar == null || map == null) {
            LogUtil.e("HwP2pKitManager", "isHealthResult input param is invalid.");
            return false;
        }
        String strC = xivVar.c();
        if (strC == null) {
            LogUtil.e("HwP2pKitManager", "isHealthResult destPkgName is invalid.");
            return false;
        }
        LogUtil.b("HwP2pKitManager", "isHealthResult destPkgName: ", strC);
        if (strC.startsWith(this.f53066b)) {
            return true;
        }
        return strC.equals("com.huawei.health") && xivVar.f() == 3 && map.containsKey(Integer.valueOf(xivVar.a()));
    }

    public boolean d(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null || bArr == null || bArr.length < 2) {
            LogUtil.e("HwP2pKitManager", "isP2pResult input param is invalid.");
            return false;
        }
        cpl.b("HwP2pKitManager", bArr, "fuzzyDevice:", cpl.a(deviceInfo), "isP2pResult. content:");
        byte b2 = bArr[0];
        if (b2 == 52 && bArr[1] == 1) {
            LogUtil.b("HwP2pKitManager", "isP2pResult p2p data received");
            return true;
        }
        if (b2 != 57 || bArr[1] != 1) {
            return false;
        }
        LogUtil.b("HwP2pKitManager", "isP2pResult p2p data received sport watch bt-proxy");
        return true;
    }

    public xiv c(byte[] bArr) {
        List<cqa> listA = xit.a(bArr);
        if (listA == null || listA.isEmpty()) {
            LogUtil.e("HwP2pKitManager", "parseP2pResponse tlv format is invalid");
            return null;
        }
        xiv xivVar = new xiv();
        for (cqa cqaVar : listA) {
            switch (cpb.a(cqaVar.b())) {
                case 1:
                    xivVar.e(xit.c(cqaVar));
                    break;
                case 2:
                    xivVar.a(xit.c(cqaVar));
                    break;
                case 3:
                    xivVar.b(cph.a(cqaVar.c()));
                    break;
                case 4:
                    xivVar.e(cph.a(cqaVar.c()));
                    break;
                case 5:
                    xivVar.a(cph.a(cqaVar.c()));
                    break;
                case 6:
                    xivVar.d(cph.a(cqaVar.c()));
                    break;
                case 7:
                    xivVar.a(cph.d(cqaVar.c()));
                    break;
                case 8:
                    xivVar.a(cqaVar);
                    break;
            }
        }
        return xivVar;
    }

    public xix a(byte[] bArr) {
        xix xixVar = new xix();
        List<cqa> listD = xit.d(bArr);
        if (listD == null || listD.isEmpty()) {
            LogUtil.e("HwP2pKitManager", "parseP2pResponse payloadTlv format is invalid");
            return xixVar;
        }
        for (cqa cqaVar : listD) {
            int iA = cpb.a(cqaVar.b());
            if (iA == 1) {
                xixVar.e(xit.c(cqaVar));
            } else if (iA == 2) {
                xixVar.d(cph.a(cqaVar.c()));
            } else if (iA == 3) {
                xixVar.c(cph.a(cqaVar.c()));
            } else if (iA == 4) {
                xixVar.e(cph.a(cqaVar.c()));
            }
        }
        return xixVar;
    }

    public UniteDevice b() {
        ArrayList<UniteDevice> arrayList = new ArrayList(cju.d().getDeviceList().values());
        if (arrayList.isEmpty()) {
            return null;
        }
        for (UniteDevice uniteDevice : arrayList) {
            DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
            if (deviceInfo.isUsing() && deviceInfo.getDeviceConnectState() == 2 && deviceInfo.getDeviceType() > 0) {
                return uniteDevice;
            }
        }
        return null;
    }

    public UniteDevice e(String str) {
        LogUtil.b("HwP2pKitManager", "getConnectedDevice enter.");
        UniteDevice uniteDevice = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HwP2pKitManager", "getConnectedDevice identify is Empty.");
            return null;
        }
        ArrayList<UniteDevice> arrayList = new ArrayList(cju.d().getDeviceList().values());
        if (arrayList.isEmpty()) {
            LogUtil.e("HwP2pKitManager", "getConnectedDevice deviceList is Empty.");
            return null;
        }
        for (UniteDevice uniteDevice2 : arrayList) {
            if (c(uniteDevice2, uniteDevice2.getDeviceInfo(), str)) {
                uniteDevice = uniteDevice2;
                break;
            }
        }
        LogUtil.b("HwP2pKitManager", "getConnectedDevice deviceList end.");
        return uniteDevice;
    }

    private boolean c(UniteDevice uniteDevice, DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null) {
            LogUtil.e("HwP2pKitManager", "deviceInfo is null.");
            return false;
        }
        if (str.equals(uniteDevice.getIdentify()) || str.equals(deviceInfo.getDeviceMac())) {
            return deviceInfo.getDeviceConnectState() == 2 && deviceInfo.getDeviceType() > 0;
        }
        LogUtil.e("HwP2pKitManager", "identify is not equal.");
        return false;
    }

    public static xio c() {
        return c.f53068b;
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static xio f53068b = new xio();
    }
}
