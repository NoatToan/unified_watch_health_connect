package defpackage;

import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ccy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1481a = String.valueOf(CapabilityStatus.AWA_CAP_CODE_APPLICATION);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f1482b;
    private static int e;

    public static boolean b(String str) {
        return lua.c(f1481a, str);
    }

    public static boolean e(String str) {
        return lua.d(f1481a, str);
    }

    public static void d(List<String> list) {
        lua.e(f1481a, list);
    }

    public static void d(String str, String str2) {
        lua.a(f1481a, str, str2);
    }

    public static String c(String str) {
        return lua.h(f1481a, str);
    }

    public static void c(String str, String str2) {
        lua.h(f1481a, str, str2);
    }

    public static String g(String str) {
        return lua.d(f1481a, str, "");
    }

    public static void a(String str, String str2) {
        lua.f(f1481a, str, str2);
    }

    public static String i(String str) {
        return lua.e(f1481a, str, "");
    }

    public static void b(String str, long j) {
        lua.a(f1481a, str, j);
    }

    public static long a(String str) {
        return lua.d(f1481a, str, 0L);
    }

    public static void b(String str, int i) {
        lua.c(f1481a, str, i);
    }

    public static int d(String str) {
        return lua.b(f1481a, str, 0);
    }

    public static void e(String str, boolean z) {
        lua.d(f1481a, str, z);
    }

    public static boolean c(String str, boolean z) {
        return lua.a(f1481a, str, z);
    }

    public static boolean b() {
        return c("is_show_no_sync_history_data_tip", false);
    }

    public static void a(boolean z) {
        e("is_show_no_sync_history_data_tip", z);
    }

    public static int c() {
        LogUtil.a("HL_HealthLifeCacheUtils", "getJoinTime sJoinTime ", Integer.valueOf(e));
        if (e <= 0) {
            e = CommonUtil.j(c("health_model_join_time"));
        }
        return e;
    }

    public static void c(int i, boolean z) {
        LogUtil.a("HL_HealthLifeCacheUtils", "saveJoinTime sJoinTime ", Integer.valueOf(e), " joinTime ", Integer.valueOf(i), " isFromCloud ", Boolean.valueOf(z));
        if (!z && e > 0) {
            return;
        }
        e = i;
        int i2 = e;
        d("health_model_join_time", i2 <= 0 ? "" : String.valueOf(i2));
    }

    public static int d() {
        LogUtil.a("HL_HealthLifeCacheUtils", "getUpgradeTime sUpgradeTime ", Integer.valueOf(f1482b));
        if (f1482b <= 0) {
            f1482b = CommonUtil.j(c("health_model_upgrade_time"));
        }
        return f1482b;
    }

    public static void a(int i, boolean z) {
        LogUtil.a("HL_HealthLifeCacheUtils", "saveUpgradeTime sUpgradeTime ", Integer.valueOf(f1482b), " upgradeTime ", Integer.valueOf(i), " isFromCloud ", Boolean.valueOf(z));
        if (!z && f1482b > 0) {
            return;
        }
        f1482b = i;
        d("health_model_upgrade_time", f1482b <= 0 ? "" : String.valueOf(i));
    }

    public static int a() {
        return d("user_clover_number");
    }

    public static void b(int i) {
        b("user_clover_number", i);
    }

    public static void e() {
        jzl.h();
        ArrayList arrayList = new ArrayList(15);
        arrayList.add("health_model_join_time");
        arrayList.add("health_model_upgrade_time");
        arrayList.add("health_model_challenge_id");
        arrayList.add("health_model_first_join_challenge");
        arrayList.add("health_model_twice_same_challenge");
        arrayList.add("health_model_challenge_join");
        arrayList.add("health_model_current_challenge_join_time");
        arrayList.add("health_model_data_cache");
        arrayList.add("health_life_data_cache_last");
        arrayList.add("health_model_week_task_records_cache");
        arrayList.add("health_life_last_sync_date");
        arrayList.add("flush_data_time");
        arrayList.add("health_life_last_version");
        arrayList.add("health_life_last_sync_time_millis");
        arrayList.add("update_cloud_data_time");
        arrayList.add("user_clover_number");
        d(arrayList);
        ReleaseLogUtil.c("R_HL_HealthLifeCacheUtils", "reset sJoinTime ", Integer.valueOf(e), " sUpgradeTime ", Integer.valueOf(f1482b), " keyList ", arrayList);
        e = 0;
        f1482b = 0;
    }
}
