package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class lua {
    private static String d;

    public static void b() {
        d = "";
        ReleaseLogUtil.c("R_SharedPreferencesUtil", "reset");
    }

    public static String d() {
        if (TextUtils.isEmpty(d)) {
            String strC = KeyValDbManager.d(BaseApplication.b()).c("user_id");
            LogUtil.a("SharedPreferencesUtil", "getUserId userId ", strC, " mUserId ", d);
            d = strC;
        }
        return d;
    }

    public static int c() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(20000), "site_id");
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.d("R_SharedPreferencesUtil", "getSiteId siteId ", strE);
            return 0;
        }
        return CommonUtils.j(strE);
    }

    public static String b(String str) {
        return str + "_" + c();
    }

    public static String d(String str) {
        return nio.a(str);
    }

    public static Set<String> c(String str) {
        return SharedPreferenceManager.a(BaseApplication.b(), str);
    }

    public static void d(String str, List<String> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_SharedPreferencesUtil", "deleteKeyList keyList ", list);
        } else {
            SharedPreferenceManager.d(str, (String[]) list.toArray(new String[0]));
        }
    }

    public static void e(String str, List<String> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_SharedPreferencesUtil", "deleteKeyListByUserId keyList ", list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next()));
        }
        d(str, arrayList);
    }

    public static boolean e(String str, String str2) {
        return SharedPreferenceManager.b(str, str2);
    }

    public static boolean d(String str, String str2) {
        return e(str, d(str2));
    }

    public static boolean a(String str, String str2) {
        return SharedPreferenceManager.e(str, str2);
    }

    public static boolean c(String str, String str2) {
        return a(str, d(str2));
    }

    public static String b(String str, String str2) {
        return SharedPreferenceManager.e(BaseApplication.b(), str, str2);
    }

    public static String h(String str, String str2) {
        return b(str, d(str2));
    }

    public static void e(String str, String str2, String str3, StorageParams storageParams) {
        SharedPreferenceManager.e(BaseApplication.b(), str, str2, str3, storageParams);
    }

    public static void b(String str, String str2, String str3) {
        e(str, str2, str3, null);
    }

    public static void a(String str, String str2, String str3) {
        b(str, d(str2), str3);
    }

    public static void c(String str, String str2, String str3, StorageParams storageParams) {
        e(str, d(str2), str3, storageParams);
    }

    public static String d(String str, String str2, String str3) {
        return SharedPreferenceManager.b(str, str2, str3);
    }

    public static String c(String str, String str2, String str3) {
        return d(str, b(str2), str3);
    }

    public static String e(String str, String str2, String str3) {
        return d(str, d(str2), str3);
    }

    public static void h(String str, String str2, String str3) {
        SharedPreferenceManager.c(str, str2, str3);
    }

    public static void j(String str, String str2, String str3) {
        h(str, b(str2), str3);
    }

    public static void f(String str, String str2, String str3) {
        h(str, d(str2), str3);
    }

    public static boolean e(String str, String str2, boolean z) {
        return SharedPreferenceManager.b(str, str2, z);
    }

    public static boolean a(String str, String str2, boolean z) {
        return e(str, d(str2), z);
    }

    public static void b(String str, String str2, boolean z) {
        SharedPreferenceManager.a(str, str2, z);
    }

    public static void d(String str, String str2, boolean z) {
        b(str, d(str2), z);
    }

    public static int a(String str, String str2, int i) {
        return SharedPreferenceManager.c(str, str2, i);
    }

    public static int b(String str, String str2, int i) {
        return a(str, d(str2), i);
    }

    public static void e(String str, String str2, int i) {
        SharedPreferenceManager.d(str, str2, i);
    }

    public static void c(String str, String str2, int i) {
        e(str, d(str2), i);
    }

    public static long c(String str, String str2, long j) {
        return SharedPreferenceManager.d(str, str2, j);
    }

    public static long b(String str, String str2, long j) {
        return c(str, b(str2), j);
    }

    public static long d(String str, String str2, long j) {
        return c(str, d(str2), j);
    }

    public static void e(String str, String str2, long j) {
        SharedPreferenceManager.c(str, str2, j);
    }

    public static void g(String str, String str2, long j) {
        e(str, b(str2), j);
    }

    public static void a(String str, String str2, long j) {
        e(str, d(str2), j);
    }

    public static float e(String str, String str2, float f) {
        return SharedPreferenceManager.a(str, str2, f);
    }

    public static float d(String str, String str2, float f) {
        return e(str, d(str2), f);
    }

    public static void c(String str, String str2, float f) {
        SharedPreferenceManager.c(str, str2, f);
    }

    public static void a(String str, String str2, float f) {
        c(str, d(str2), f);
    }

    public static boolean e() {
        return e("HiHealthService", "pullAllStatus", false);
    }

    public static boolean a() {
        return e() || !CloudUtils.a();
    }
}
