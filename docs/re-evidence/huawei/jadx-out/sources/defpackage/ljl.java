package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.KeyValDbManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ljl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f40349a;

    static class a {
        private static final ljl d = new ljl();
    }

    public static ljl a(Context context) {
        if (context != null) {
            f40349a = context.getApplicationContext();
        }
        return a.d;
    }

    private ljl() {
    }

    public void c(String str) {
        if (d(f40349a)) {
            LogUtil.d("Debug_DataPlatFormBIAnalytics", "hiLogin biSetUserInfo");
            lmf.d().c(str);
        }
    }

    public void a(String str) {
        if (d(f40349a)) {
            String strD = lkb.d(f40349a);
            if (strD.equals(str)) {
                return;
            }
            LogUtil.d("Debug_DataPlatFormBIAnalytics", "hiLogin biAnalytics");
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("newID", str);
            arrayMap.put("oldID", strD);
            lmf.d().c(f40349a, AnalyticsValue.HEALTH_DATA_PLATFORM_ACCOUNTSWITCH_2150004.value(), arrayMap, 0);
            lmf.d().b(f40349a);
            lkb.e(f40349a, str);
        }
    }

    public void c(long j, int i) {
        if (d(f40349a)) {
            LogUtil.d("Debug_DataPlatFormBIAnalytics", "sync biFirstSyncContinueTime is ", String.valueOf(j));
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("during", Long.valueOf(j));
            ljv.d(f40349a).b(f40349a, AnalyticsValue.HEALTH_DATA_PLATFORM_FIRSTSYNC_TIME_2150002.value(), arrayMap, 0);
            lmf.d().b(f40349a);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
            linkedHashMap.put("during", String.valueOf(j));
            linkedHashMap.put("firstSyncFailCount", String.valueOf(liq.e(i)));
            ljv.d(f40349a).c(OperationKey.HEALTH_DATA_PLATFORM_FIRST_SYNC_TIME.value(), linkedHashMap, false);
        }
    }

    public void a(int i) {
        if (d(f40349a)) {
            LogUtil.d("Debug_DataPlatFormBIAnalytics", "sync biAccountDevicesNum is ", String.valueOf(i));
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("phoneDeviceNum", Integer.valueOf(i));
            ljv.d(f40349a).b(f40349a, AnalyticsValue.HEALTH_DATA_PLATFORM_DEVICENUM_2150003.value(), arrayMap, 0);
            lmf.d().b(f40349a);
        }
    }

    public void c() {
        if (d(f40349a)) {
            LogUtil.d("Debug_DataPlatFormBIAnalytics", "sync biOldDaySyncStatData");
            ArrayMap arrayMap = new ArrayMap(1);
            int iM = lkb.m(f40349a);
            int iL = lkb.l(f40349a);
            int iT = lkb.t(f40349a);
            int iP = lkb.p(f40349a);
            int iK = lkb.k(f40349a);
            int iN = lkb.n(f40349a);
            int iO = lkb.o(f40349a);
            int iQ = lkb.q(f40349a);
            arrayMap.put("date", Integer.valueOf(iM));
            arrayMap.put("totalSync", Integer.valueOf(iL));
            arrayMap.put("UISync", Integer.valueOf(iT));
            arrayMap.put("userinfoSync", Integer.valueOf(iP));
            arrayMap.put("insertSyncDetail", Integer.valueOf(iK));
            arrayMap.put("insertSyncStat", Integer.valueOf(iN));
            arrayMap.put("syncFail", Integer.valueOf(iO));
            arrayMap.put("wearSync", Integer.valueOf(iQ));
            lmf.d().c(f40349a, AnalyticsValue.HEALTH_DATA_PLATFORM_OLDDAYSYNCSTATDATA_2150001.value(), arrayMap, 0);
            lmf.d().b(f40349a);
        }
    }

    public void a() {
        LogUtil.d("Debug_DataPlatFormBIAnalytics", "sync setBiTodaySyncDataZero");
        lkb.a(f40349a, 20080808);
        lkb.j(f40349a, 0);
        lkb.i(f40349a, 0);
        lkb.h(f40349a, 0);
        lkb.b(f40349a, 0);
        lkb.c(f40349a, 0);
        lkb.f(f40349a, 0);
        lkb.g(f40349a, 0);
    }

    public void d() {
        LogUtil.d("Debug_DataPlatFormBIAnalytics", "sync saveTodaySyncData2Yesteday");
        int iB = lkb.b(f40349a);
        int iH = lkb.h(f40349a);
        int iJ = lkb.j(f40349a);
        int i = lkb.i(f40349a);
        int iA = lkb.a(f40349a);
        int iC = lkb.c(f40349a);
        int iG = lkb.g(f40349a);
        int iF = lkb.f(f40349a);
        lkb.l(f40349a, iB);
        lkb.n(f40349a, iH);
        lkb.t(f40349a, iJ);
        lkb.r(f40349a, i);
        lkb.k(f40349a, iA);
        lkb.m(f40349a, iC);
        lkb.o(f40349a, iG);
        lkb.s(f40349a, iF);
    }

    private static boolean d(Context context) {
        LogUtil.d("Debug_DataPlatFormBIAnalytics", "report_switch statusIsChecked() enter ");
        String strC = KeyValDbManager.d(context).c("key_user_experience_plan_check_box");
        LogUtil.d("Debug_DataPlatFormBIAnalytics", "report_switch status = ", strC);
        return "true".equals(strC);
    }
}
