package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.LruCache;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class kzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LruCache<String, Integer> f39682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwg f39683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwi f39684c;
    private static final Context e = BaseApplication.getContext();
    private static Map<Map<Integer, String>, HiAccountInfo> d = new ArrayMap(16);

    private kzw() {
        this.f39682a = new LruCache<>(20);
        this.f39683b = kwg.b();
        this.f39684c = kwi.b();
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kzw f39685c = new kzw();
    }

    public static kzw c() {
        return d.f39685c;
    }

    public int i() {
        return kxq.c().d(l(), 0);
    }

    private String l() {
        if (this.f39683b == null) {
            return "";
        }
        String strJ = j();
        if (!HiCommonUtil.a(strJ)) {
            LogUtil.d("HiH_HiHealthKitBinderHelper", "getStringHuid() from cache");
            return strJ;
        }
        int iG = g();
        String strD = this.f39683b.d(iG);
        ArrayMap arrayMap = new ArrayMap(16);
        arrayMap.put(Integer.valueOf(iG), strD);
        HiAccountInfo hiAccountInfoB = this.f39683b.b(iG, strD);
        if (hiAccountInfoB != null) {
            hiAccountInfoB.setLogin(1);
            d.put(arrayMap, hiAccountInfoB);
            LogUtil.d("HiH_HiHealthKitBinderHelper", "getStringHuid() from DB");
        }
        return strD;
    }

    public void c(String str) {
        if (HiCommonUtil.a(str)) {
            return;
        }
        for (Map.Entry<Map<Integer, String>, HiAccountInfo> entry : d.entrySet()) {
            HiAccountInfo value = entry.getValue();
            if (str.equals(value.getHuid())) {
                value.setLogin(1);
                d.put(entry.getKey(), value);
            }
        }
    }

    public void b(String str) {
        if (HiCommonUtil.a(str)) {
            return;
        }
        for (Map.Entry<Map<Integer, String>, HiAccountInfo> entry : d.entrySet()) {
            HiAccountInfo value = entry.getValue();
            if (str.equals(value.getHuid())) {
                value.setLogin(0);
                d.put(entry.getKey(), value);
            }
        }
    }

    private String j() {
        String huid = null;
        for (Map.Entry<Map<Integer, String>, HiAccountInfo> entry : d.entrySet()) {
            if (entry.getValue().getIsLogin() == 1 && entry.getValue().getAppId() == g()) {
                huid = entry.getValue().getHuid();
            }
        }
        return huid;
    }

    int d(String str) throws RemoteException {
        Integer num = this.f39682a.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iE = e(str);
        if (iE <= 0) {
            String str2 = "initAppId() app <= 0 " + b(str, iE);
            ReleaseLogUtil.e("HiH_HiHealthKitBinderHelper", str2);
            throw new RemoteException(str2);
        }
        this.f39682a.put(str, Integer.valueOf(iE));
        return iE;
    }

    public kym h() throws RemoteException {
        String strD = ljp.d(e);
        if (b() == 0) {
            ReleaseLogUtil.d("HiH_HiHealthKitBinderHelper", "getInsertAppContext() isAppValid health or wear, packageName = ", strD);
            return new kym(d(strD), strD);
        }
        return new kym(a(), strD);
    }

    int b() {
        return f();
    }

    private int f() {
        if (ljp.b(e, "com.huawei.health")) {
            LogUtil.d("HiH_HiHealthKitBinderHelper", "checkAppTypeSync() isAppValid true needn't to Auth, packageName = ", "com.huawei.health");
            return 0;
        }
        LogUtil.d("HiH_HiHealthKitBinderHelper", "checkAppTypeSync() is thirdParty, packageName = ", "com.huawei.health");
        return -1;
    }

    public int a() throws RemoteException {
        return c(this.f39682a, ljp.e(e));
    }

    public int d() throws RemoteException {
        return c(this.f39682a, ljp.e(e));
    }

    int a(String str) throws RemoteException {
        return c(this.f39682a, str);
    }

    private int c(LruCache<String, Integer> lruCache, String str) throws RemoteException {
        Integer num = lruCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(str);
        LogUtil.d("HiH_HiHealthKitBinderHelper", "initCurrentAppId() ", b(str, iG));
        if (iG <= 0) {
            String str2 = "initCurrentAppId() app <= 0 " + b(str, iG);
            ReleaseLogUtil.e("HiH_HiHealthKitBinderHelper", str2);
            throw new RemoteException(str2);
        }
        lruCache.put(str, Integer.valueOf(iG));
        return iG;
    }

    private int g(String str) {
        HiAppInfo hiAppInfoA;
        int iB = this.f39684c.b(str);
        if (iB > 0) {
            LogUtil.a("HiHealthKitBinderHelper", "appID = ", Integer.valueOf(iB));
            return iB;
        }
        ReleaseLogUtil.d("HiH_HiHealthKitBinderHelper", "queryOrCreateAppId() app <= 0");
        if ("com.huawei.health".equals(str)) {
            hiAppInfoA = ljp.d(e, str);
        } else {
            hiAppInfoA = ljp.a(e, str);
        }
        if (hiAppInfoA == null) {
            return iB;
        }
        ReleaseLogUtil.d("HiH_HiHealthKitBinderHelper", "queryOrCreateAppId appInfo = ", hiAppInfoA);
        int iE = (int) this.f39684c.e(hiAppInfoA, 0);
        LogUtil.a("HiHealthKitBinderHelper", "appID = ", Integer.valueOf(iE));
        return iE;
    }

    public int e(String str) {
        return i(str);
    }

    private int i(String str) {
        HiAppInfo hiAppInfoA;
        int iB = this.f39684c.b(str);
        if (iB <= 0) {
            ReleaseLogUtil.d("HiH_HiHealthKitBinderHelper", "initBinderSync() app <= 0");
            if ("com.huawei.health".equals(str)) {
                hiAppInfoA = ljp.d(e, str);
            } else {
                hiAppInfoA = ljp.a(e, str);
            }
            if (hiAppInfoA == null) {
                return iB;
            }
            ReleaseLogUtil.d("HiH_HiHealthKitBinderHelper", "initBinderSync() appInfo = ", hiAppInfoA);
            iB = (int) this.f39684c.e(hiAppInfoA, 0);
        }
        LogUtil.d("HiH_HiHealthKitBinderHelper", "initBinderSync() ", b(str, iB));
        return iB;
    }

    public int g() {
        return g("com.huawei.health");
    }

    public static boolean e() {
        KeyguardManager keyguardManager = (KeyguardManager) e.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        boolean z;
        if (iArr == null || iArr.length <= 0) {
            z = false;
        } else {
            for (int i : iArr) {
                if (!HiHealthDataType.p(i)) {
                    ReleaseLogUtil.e("HiH_HiHealthKitBinderHelper", "isKitValidTypes readType = ", Integer.valueOf(i), " not allow to apply");
                    return false;
                }
            }
            z = true;
        }
        if (iArr2 == null || iArr2.length <= 0) {
            return z;
        }
        for (int i2 : iArr2) {
            if (!HiHealthDataType.s(i2)) {
                ReleaseLogUtil.e("HiH_HiHealthKitBinderHelper", "isKitValidTypes writeType = ", Integer.valueOf(i2), " not allow to apply");
                return false;
            }
        }
        return true;
    }

    public static int d(List list) {
        Object obj = list.get(0);
        if (obj instanceof HiHealthKitData) {
            return ((HiHealthKitData) obj).getType();
        }
        return 0;
    }

    public static <T> String c(Map map, T t) {
        Object obj = map.get(t);
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    public static <T> int b(Map map, T t) {
        Object obj = map.get(t);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public static <T> long a(Map map, T t) {
        Object obj = map.get(t);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    private String b(String str, int i) {
        return "packageName = " + str + ", app = " + i;
    }

    public String a(StartSportParam startSportParam) {
        JSONObject jSONObject = new JSONObject();
        Bundle valueHolder = startSportParam.getValueHolder();
        try {
            for (String str : valueHolder.keySet()) {
                jSONObject.put(str, valueHolder.get(str));
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HiH_HiHealthKitBinderHelper", "Error put value: ", e2.getMessage());
        }
        return jSONObject.toString();
    }

    public static List<Integer> e(List<HiHealthKitData> list) {
        ArrayList arrayList = new ArrayList(10);
        Iterator<HiHealthKitData> it = list.iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            if (!arrayList.contains(Integer.valueOf(type))) {
                arrayList.add(Integer.valueOf(type));
            }
        }
        return arrayList;
    }
}
