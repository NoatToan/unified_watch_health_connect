package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, lre> f40709a = new ConcurrentHashMap<>(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40710c = false;
    private boolean e = false;

    public boolean a() {
        return this.f40710c;
    }

    public void c(boolean z) {
        this.f40710c = z;
    }

    public void d(boolean z) {
        this.e = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public static void d(String str, boolean z) {
        if (!a(str)) {
            LogUtil.j("HwDeviceStatusPackageData", "updateHandShakeStatus mac is invalid");
            return;
        }
        ConcurrentHashMap<String, lre> concurrentHashMap = f40709a;
        lre lreVar = concurrentHashMap.get(str);
        LogUtil.a("HwDeviceStatusPackageData", "updateHandShakeStatus value: ", Boolean.valueOf(lreVar == null));
        if (lreVar == null) {
            lre lreVar2 = new lre();
            lreVar2.d(z);
            concurrentHashMap.putIfAbsent(str, lreVar2);
        } else {
            lreVar.d(z);
            concurrentHashMap.put(str, lreVar);
        }
    }

    public static boolean b(String str) {
        if (!a(str)) {
            LogUtil.j("HwDeviceStatusPackageData", "getOTAStatus mac is invalid");
            return false;
        }
        lre lreVar = f40709a.get(str);
        LogUtil.a("HwDeviceStatusPackageData", "getOtaStatus value: ", Boolean.valueOf(lreVar == null));
        if (lreVar == null) {
            return false;
        }
        return lreVar.a();
    }

    public static void c(String str, boolean z) {
        if (!a(str)) {
            LogUtil.j("HwDeviceStatusPackageData", "updateOTAStatus mac is invalid");
            return;
        }
        ConcurrentHashMap<String, lre> concurrentHashMap = f40709a;
        lre lreVar = concurrentHashMap.get(str);
        LogUtil.a("HwDeviceStatusPackageData", "updateOtaStatus value: ", Boolean.valueOf(lreVar == null));
        if (lreVar == null) {
            lre lreVar2 = new lre();
            lreVar2.c(z);
            concurrentHashMap.putIfAbsent(str, lreVar2);
        } else {
            lreVar.c(z);
            concurrentHashMap.put(str, lreVar);
        }
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str);
    }
}
