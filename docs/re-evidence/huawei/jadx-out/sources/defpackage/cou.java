package defpackage;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public class cou {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cql f31230b = new cql();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f31228a = {40, 44};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cou f31229c = null;

    public static cou a() {
        cou couVar;
        synchronized (d) {
            if (f31229c == null) {
                f31229c = new cou();
            }
            couVar = f31229c;
        }
        return couVar;
    }

    public int a(DeviceInfo deviceInfo, int i, byte[] bArr) {
        int iE;
        LogUtil.b("DeviceDualChannelHelper", "getSocketChannelForDestPackageName serviceId: , ", Integer.valueOf(i));
        int i2 = 0;
        if (deviceInfo == null || bArr == null) {
            LogUtil.e("DeviceDualChannelHelper", "getSocketChannelForDestPackageName params is null");
            return 0;
        }
        if (ckl.j.get(deviceInfo.getDeviceMac()) == null) {
            LogUtil.e("DeviceDualChannelHelper", "getSocketChannelForDestPackageName SUPPORT_EXTEND_SOCKET is null");
            return 0;
        }
        Boolean bool = ckl.j.get(deviceInfo.getDeviceMac());
        if (!bool.booleanValue()) {
            LogUtil.e("DeviceDualChannelHelper", "getSocketChannelForDestPackageName not support dual socket ", bool);
            return 0;
        }
        try {
            TreeSet<Byte> treeSet = new TreeSet<>();
            int length = bArr.length - 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 2, bArr2, 0, length);
            if (i == 52) {
                treeSet.add((byte) 4);
            } else if (i == 55) {
                treeSet.add((byte) 2);
            } else {
                LogUtil.e("DeviceDualChannelHelper", "getSocketChannelForDestPackageName serviceId else");
            }
            Iterator<cqi> it = this.f31230b.c(bArr2, treeSet).d().iterator();
            String strD = "";
            while (true) {
                if (!it.hasNext()) {
                    iE = 0;
                    break;
                }
                strD = d(i, it.next());
                if (!TextUtils.isEmpty(strD)) {
                    iE = e(deviceInfo.getDeviceMac(), i, strD);
                    break;
                }
                LogUtil.d("DeviceDualChannelHelper", "getSocketChannelForDestPackageName TlvException");
                return i2;
            }
            try {
                LogUtil.b("DeviceDualChannelHelper", "serviceId 52 or 55 destPackageName: ", strD, " socketChannel: ", Integer.valueOf(iE));
                return iE;
            } catch (cpy unused) {
                i2 = iE;
            } catch (NumberFormatException unused2) {
                i2 = iE;
                LogUtil.d("DeviceDualChannelHelper", "getSocketChannelForDestPackageName NumberFormatException");
                return i2;
            }
        } catch (cpy unused3) {
        } catch (NumberFormatException unused4) {
        }
    }

    private String d(int i, cqi cqiVar) {
        try {
            if (i == 52) {
                if (cqiVar.c() == 4) {
                    return new String(cqiVar.d(), "UTF-8");
                }
                LogUtil.e("DeviceDualChannelHelper", "getDestPackageNameByTlv 52 deal else value");
                return "";
            }
            if (i == 55) {
                if (cqiVar.c() == 2) {
                    return new String(cqiVar.d(), "UTF-8");
                }
                LogUtil.e("DeviceDualChannelHelper", "getDestPackageNameByTlv 55 deal else value");
                return "";
            }
            LogUtil.e("DeviceDualChannelHelper", "getDestPackageNameByTlv else serviceId");
            return "";
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("DeviceDualChannelHelper", "getDestPackageNameByTlv UnsupportedEncodingException");
            return "";
        }
    }

    public int e(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("DeviceDualChannelHelper", "getSocketChannelByPackageName param is invalid");
            return 0;
        }
        LogUtil.b("DeviceDualChannelHelper", "getSocketChannelByPackageName identify: ", cpl.e(str), " serviceId: ", Integer.valueOf(i), " destPackageName: ", str2);
        List<cmk> list = ckl.e.get(str);
        if (list != null) {
            for (cmk cmkVar : list) {
                if (cmkVar.c() == i && cmkVar.e() != null && cmkVar.e().contains(str2)) {
                    return ckl.f1684c.get(str).intValue();
                }
            }
        }
        return 0;
    }

    public int a(DeviceInfo deviceInfo, cmg cmgVar, int i, int i2) {
        for (int i3 : f31228a) {
            if (i3 == i) {
                LogUtil.b("DeviceDualChannelHelper", "sendCommand serviceId not with channel");
                LogUtil.b("DeviceDualChannelHelper", "sendCommand not with channel");
                return cmgVar.g();
            }
        }
        return b(deviceInfo, i, i2);
    }

    private int b(DeviceInfo deviceInfo, int i, int i2) {
        if (ckl.f1683b.get(deviceInfo.getDeviceMac()) == null) {
            LogUtil.e("DeviceDualChannelHelper", "dealElseCommand SUPPORT_DUAL_SOCKET is null");
            return 0;
        }
        Boolean bool = ckl.f1683b.get(deviceInfo.getDeviceMac());
        if (!bool.booleanValue()) {
            LogUtil.b("DeviceDualChannelHelper", "isNewSocketChannel not support dual socket ", bool);
            return 0;
        }
        int iIntValue = ckl.f1684c.get(deviceInfo.getDeviceMac()) != null ? ckl.f1684c.get(deviceInfo.getDeviceMac()).intValue() : 0;
        if (c(deviceInfo.getDeviceMac(), i) || e(deviceInfo.getDeviceMac(), i, i2)) {
            return iIntValue;
        }
        return 0;
    }

    private boolean e(String str, int i, int i2) {
        boolean z = false;
        if (str == null) {
            LogUtil.e("DeviceDualChannelHelper", "isNewSocketExtendChannel input is invalid.");
            return false;
        }
        if (ckl.j.get(str) == null) {
            LogUtil.e("DeviceDualChannelHelper", "isNewSocketExtendChannel SUPPORT_EXTEND_SOCKET is null.");
            return false;
        }
        Boolean bool = ckl.j.get(str);
        if (!bool.booleanValue()) {
            LogUtil.b("DeviceDualChannelHelper", "isNewSocketExtendChannel not support dual socket ", bool);
            return false;
        }
        List<cmk> list = ckl.e.get(str);
        if (list == null) {
            LogUtil.e("DeviceDualChannelHelper", "isNewSocketExtendChannel mcuCommands is null, identify: ", cpl.e(str));
            return false;
        }
        for (cmk cmkVar : list) {
            if (cmkVar.c() == i && cmkVar.d() != null && cmkVar.d().contains(Integer.valueOf(i2))) {
                z = true;
                break;
            }
        }
        LogUtil.b("DeviceDualChannelHelper", "isNewSocketExtendChannel isRunMcuSocket: ", Boolean.valueOf(z));
        return z;
    }

    public boolean c(String str, int i) {
        if (str == null) {
            LogUtil.e("DeviceDualChannelHelper", "getChannelId input is invalid.");
            return false;
        }
        SparseBooleanArray sparseBooleanArray = ckl.f1682a.get(str);
        if (sparseBooleanArray == null) {
            LogUtil.b("DeviceDualChannelHelper", "getChannelId dualServices is null.");
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    public void c() {
        d();
    }

    private static void d() {
        synchronized (d) {
            f31229c = null;
        }
    }
}
