package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class jzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39252a = String.valueOf(20015);
    private static String d;

    public static boolean g() {
        return true;
    }

    public static boolean c(String str) {
        return lua.d(f39252a, str);
    }

    public static void c(String str, String str2) {
        lua.f(f39252a, str, str2);
    }

    public static String a(String str) {
        return lua.e(f39252a, str, "");
    }

    public static void b(String str, int i) {
        lua.c(f39252a, str, i);
    }

    public static int b(String str) {
        return lua.b(f39252a, str, 0);
    }

    public static void d(String str, boolean z) {
        lua.d(f39252a, str, z);
    }

    public static void e(boolean z) {
        d("HL_SUPPORT_HEALTH_LIFE", z);
    }

    public static void a(qey qeyVar) {
        if (qeyVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "setPlanDetail planDetail is null isDeleteSuccess ", Boolean.valueOf(c("HL_HEALTH_LIFE_PLAN_DETAIL")));
            return;
        }
        String strD = HiJsonUtil.d(qeyVar);
        c("HL_HEALTH_LIFE_PLAN_DETAIL", strD);
        LogUtil.b("HL_HealthLifeCacheUtil", "setPlanDetail json ", strD);
    }

    public static qey c() {
        String strA = a("HL_HEALTH_LIFE_PLAN_DETAIL");
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "getPlanDetail json ", strA);
            return null;
        }
        return (qey) HiJsonUtil.d(strA, qey.class);
    }

    public static void a(qfj qfjVar) {
        if (qfjVar != null) {
            c("HL_QUERY_SCHEDULES_RESP", HiJsonUtil.d(qfjVar));
        } else {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "setQuerySchedulesResp querySchedulesResp is null isSuccess ", Boolean.valueOf(c("HL_QUERY_SCHEDULES_RESP")));
        }
    }

    public static qfj f() {
        String strA = a("HL_QUERY_SCHEDULES_RESP");
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "getQuerySchedulesResp json ", strA);
            return null;
        }
        return (qfj) HiJsonUtil.d(strA, qfj.class);
    }

    public static void e(qfj qfjVar) {
        if (qfjVar != null) {
            c("HL_LAST_QUERY_SCHEDULES_RESP", HiJsonUtil.d(qfjVar));
        } else {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "refreshLastQuerySchedulesResp querySchedulesResp is null isSuccess ", Boolean.valueOf(c("HL_LAST_QUERY_SCHEDULES_RESP")));
        }
    }

    public static qfj e() {
        String strA = a("HL_LAST_QUERY_SCHEDULES_RESP");
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "getLastQuerySchedulesResp json ", strA);
            return null;
        }
        return (qfj) HiJsonUtil.d(strA, qfj.class);
    }

    public static void a(List<nrh> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "setArkUiDataList list ", list, " isDeleteSuccess ", Boolean.valueOf(c("HL_ARK_UI_DATA_LIST")));
            return;
        }
        String strD = HiJsonUtil.d(list);
        c("HL_ARK_UI_DATA_LIST", strD);
        LogUtil.b("HL_HealthLifeCacheUtil", "setArkUiDataList json ", strD);
    }

    public static List<nrh> d() {
        String strA = a("HL_ARK_UI_DATA_LIST");
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "getArkUiDataList json ", strA);
            return Collections.EMPTY_LIST;
        }
        return (List) HiJsonUtil.d(strA, new TypeToken<List<nrh>>() { // from class: com.huawei.healthlife.util.HealthLifeCacheUtil$1
        }.getType());
    }

    public static void b(List<fer> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "setHealthLifeVersion list ", list, " isDeleteSuccess ", Boolean.valueOf(c("HL_HEALTH_LIFE_VERSION")));
            return;
        }
        String strD = HiJsonUtil.d(list);
        c("HL_HEALTH_LIFE_VERSION", strD);
        LogUtil.b("HL_HealthLifeCacheUtil", "setHealthLifeVersion json ", strD);
    }

    public static int a() {
        String strA = a("HL_HEALTH_LIFE_VERSION");
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "getHealthLifeVersion json ", strA);
            return 0;
        }
        return kad.d(DateFormatUtil.a(System.currentTimeMillis()), (List) HiJsonUtil.d(strA, new TypeToken<List<fer>>() { // from class: com.huawei.healthlife.util.HealthLifeCacheUtil$2
        }.getType()));
    }

    public static List<fer> b() {
        String strA = a("HL_HEALTH_LIFE_VERSION");
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeCacheUtil", "getHealthLifeVersion json ", strA);
            return Collections.EMPTY_LIST;
        }
        return (List) HiJsonUtil.d(strA, new TypeToken<List<fer>>() { // from class: com.huawei.healthlife.util.HealthLifeCacheUtil$3
        }.getType());
    }

    public static void b(int i) {
        b("HL_HEALTH_LIFE_GUIDE_PAGE", i);
    }

    public static int i() {
        return b("HL_HEALTH_LIFE_GUIDE_PAGE");
    }

    public static void d(String str) {
        d = str;
    }

    public static String j() {
        return d;
    }

    public static void h() {
        d = "";
    }
}
