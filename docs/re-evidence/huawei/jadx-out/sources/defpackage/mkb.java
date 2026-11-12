package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class mkb {
    public static void f(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceIdentify mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceIdentify value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.b(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.b(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void i(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceModel mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceModel value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.i(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.i(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void e(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceCertModel mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceCertModel value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.a(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.a(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void n(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateManufactureInfo mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateManufactureInfo packageData: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.o(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.o(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void k(String str, String str2) {
        if (!v(str) || str2 == null) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceUdid mac or deviceUdid is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceUdid packageData: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.h(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.h(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void d(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateBTVersion mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateBtVersion value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.e(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.e(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void a(String str, int i) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceDeviceVersionType mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceVersionType value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.b(i);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.b(i);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static int m(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceVersionType mac is invalid");
            return -1;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceVersionType value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return -1;
        }
        return mkaVar.o();
    }

    public static String i(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceModel mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceModel value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.f();
    }

    public static String e(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceModel mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceCertModel value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.c();
    }

    public static String o(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getManufactureInfo mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getManufactureInfo packageData: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.m();
    }

    public static String j(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceUdid mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceUdid packageData: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.j();
    }

    public static String g(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceName mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceName value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.g();
    }

    public static void g(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceName mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceName value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.f(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.f(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void o(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateHiLinkDeviceId mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateHiLinkDeviceId value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.m(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.m(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static String k(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getHiLinkDeviceId mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getHiLinkDeviceId value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.k();
    }

    public static void b(String str, int i) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceFactoryReset macAddress is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceFactoryReset value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.c(i);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.c(i);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static int f(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceFactoryReset macAddress is invalid");
            return -1;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceFactoryReset value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return -1;
        }
        return mkaVar.d();
    }

    public static String a(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getBTVersion mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getBtVersion value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.e();
    }

    public static void c(String str, int i) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateProductType mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateProductType value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.a(i);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.a(i);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static int r(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getProductType mac is invalid");
            return -1;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getProductType value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return -1;
        }
        return mkaVar.p();
    }

    public static void e(String str, int i) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceConnectState mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceConnectState value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.e(i);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.e(i);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static int d(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceConnectState mac is invalid");
            return 3;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceConnectState value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return 3;
        }
        return mkaVar.a();
    }

    public static void c(String str, boolean z) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateHandshakeStatus mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateHandshakeStatus value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.d(z);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.d(z);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static boolean n(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getHandShakeStatus mac is invalid");
            return false;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getHandShakeStatus value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return false;
        }
        return mkaVar.w();
    }

    public static void b(String str, boolean z) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateOTAStatus mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateOtaStatus value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.a(z);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.a(z);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static boolean q(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getOTAStatus mac is invalid");
            return false;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getOtaStatus value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return false;
        }
        return mkaVar.y();
    }

    public static void e(String str, DeviceCapability deviceCapability) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceCapability mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceCapability value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.d(deviceCapability);
            deviceCapability.resetDeviceCapability();
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        }
    }

    public static DeviceCapability c(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceCapability mac is invalid");
            return new DeviceCapability();
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceCapability value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return mko.a(str);
        }
        return mkaVar.b();
    }

    public static void l(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceVersion mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceVersion value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.j(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.j(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static String l(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceVersion mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceVersion value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.n();
    }

    public static void r(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateUuid mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateUuid value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.r(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.r(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static String x(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getUuid mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getUuid value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.r();
    }

    public static int t(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getPowerSave mac is invalid");
            return -1;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getPowerSave value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            return -1;
        }
        return mkaVar.s();
    }

    public static void d(String str, int i) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updatePowerSave mac is invalid");
            return;
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updatePowerSave value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.d(i);
            mkf.e.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.d(i);
            mkf.e.put(str, mkaVar);
        }
    }

    public static void m(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateUdidFromDevice mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateUdidFromDevice value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.n(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.n(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static String p(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getUdidFromDevice mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getUdidFromDevice value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.q();
    }

    public static void p(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateUnConvertedUdid mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateUnConvertedUdid value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.p(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.p(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static String s(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getUnConvertedUdid mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getUnConvertedUdid value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.t();
    }

    public static void j(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceSoftVersion mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceSoftVersion value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.g(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.g(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static String h(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceSoftVersion mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceSoftVersion value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.h();
    }

    public static String b(String str) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "getDeviceExpandCapability mac is invalid");
            return "";
        }
        mka mkaVar = mkf.e.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "getDeviceExpandCapability value: ", Boolean.valueOf(mkaVar == null));
        return mkaVar == null ? "" : mkaVar.l();
    }

    public static void b(String str, String str2) {
        if (!v(str)) {
            LogUtil.j("DeviceStatusPackageMgr", "updateDeviceExpandCapability mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceExpandCapability value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.l(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.l(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static List<String> d() {
        ArrayList arrayList = new ArrayList();
        for (mka mkaVar : mkf.e.values()) {
            if (mkaVar.a() == 2) {
                arrayList.add(mkaVar.i());
            }
        }
        return arrayList;
    }

    private static boolean v(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static void a(String str, String str2) {
        if (!v(str)) {
            LogUtil.a("DeviceStatusPackageMgr", "updateDeviceCountryCode mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceCountryCode value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.d(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.d(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void c(String str, String str2) {
        if (!v(str)) {
            LogUtil.a("DeviceStatusPackageMgr", "updateDeviceEmuiVersion mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        LogUtil.a("DeviceStatusPackageMgr", "updateDeviceEmuiVersion value: ", Boolean.valueOf(mkaVar == null));
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.c(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.c(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }

    public static void h(String str, String str2) {
        if (!v(str)) {
            LogUtil.a("DeviceStatusPackageMgr", "updateDeviceEmuiVersion mac is invalid");
            return;
        }
        ConcurrentHashMap<String, mka> concurrentHashMap = mkf.e;
        mka mkaVar = concurrentHashMap.get(str);
        if (mkaVar == null) {
            mka mkaVar2 = new mka();
            mkaVar2.k(str2);
            concurrentHashMap.putIfAbsent(str, mkaVar2);
        } else {
            mkaVar.k(str2);
            concurrentHashMap.put(str, mkaVar);
        }
    }
}
