package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ipb {
    public static boolean c(long j, Context context) {
        if (j != -1 || !StepCounterSupportUtils.c(context)) {
            return false;
        }
        ReleaseLogUtil.d("R_StepBiUtils", "reportNotStep");
        SharedPerferenceUtils.ae(context);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(3);
        c(context, linkedHashMap);
        linkedHashMap.put("errorCode", String.valueOf(1005));
        linkedHashMap.put("reportNum", String.valueOf(SharedPerferenceUtils.m(context)));
        linkedHashMap.put("isAllowStep", String.valueOf(StepCounterSupportUtils.b(context)));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
        return true;
    }

    public static boolean b(int i, int i2, Context context) {
        if (i != i2) {
            return false;
        }
        ReleaseLogUtil.d("R_StepBiUtils", npt.d("reportSendSameStep startStep:", Integer.valueOf(i)));
        SharedPerferenceUtils.ag(context);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        c(context, linkedHashMap);
        linkedHashMap.put("errorCode", String.valueOf(1006));
        linkedHashMap.put("reportNum", String.valueOf(SharedPerferenceUtils.l(context)));
        linkedHashMap.put("startStep", String.valueOf(i));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
        return true;
    }

    private static void c(Context context, LinkedHashMap<String, String> linkedHashMap) {
        if (CommonUtil.bg()) {
            String str = Build.DISPLAY;
            if (TextUtils.isEmpty(str) || !str.contains("log")) {
                return;
            }
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo) || HuaweiHealth.c().equals(accountInfo) || accountInfo.length() <= 4) {
                return;
            }
            int length = accountInfo.length();
            int i = length / 3;
            String strSubstring = accountInfo.substring(0, i);
            int i2 = length / 2;
            String strSubstring2 = accountInfo.substring(i, i2);
            String strSubstring3 = accountInfo.substring(i2, length);
            linkedHashMap.put("HF", strSubstring);
            linkedHashMap.put("HS", strSubstring2);
            linkedHashMap.put("HT", strSubstring3);
        }
    }

    public static void h() {
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), 1009);
    }

    public static void e(List<String> list) {
        if (coq.d(list)) {
            LogUtil.j("R_StepBiUtils", "reportHWPhoneServiceBeKilled thirdMobileMgrList empty");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put("errorCode", String.valueOf(1010));
        linkedHashMap.put("thirdMobileMgrList", new Gson().toJson(list));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void b(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1011));
        c(context, linkedHashMap);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void i() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), d(1012));
    }

    public static void b() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), d(1013));
    }

    public static void d() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), d(1014));
    }

    public static void a() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), d(1015));
    }

    private static LinkedHashMap<String, String> d(int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("errorCode", String.valueOf(i));
        linkedHashMap.put("model", Build.MODEL);
        linkedHashMap.put("thermalLevel", String.valueOf(ThermalCallback.getInstance().getThermalLevel()));
        linkedHashMap.put("isKeepStepAlive", String.valueOf(nzz.a()));
        return linkedHashMap;
    }

    public static void e() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), c(1016));
    }

    public static void c() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), c(1017));
    }

    public static void f() {
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), c(1018));
    }

    private static LinkedHashMap<String, String> c(int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(i));
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("serialNumber", cot.e());
        linkedHashMap.put("devBoard", Build.BOARD);
        linkedHashMap.put("devModel", Build.MODEL);
        linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("appVersion", String.valueOf(CommonUtil.e(BaseApplication.getContext())));
        return linkedHashMap;
    }

    public static void a(long j, int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("errorCode", String.valueOf(1019));
        linkedHashMap.put("currentStep", String.valueOf(i));
        linkedHashMap.put("recoverDuration", String.valueOf(System.currentTimeMillis() - j));
        linkedHashMap.put("clickTime", String.valueOf(j));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void a(int i) {
        e(i, "NULL");
    }

    public static void e(int i, String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1021));
        linkedHashMap.put("type", String.valueOf(i));
        linkedHashMap.put("state", str);
        linkedHashMap.put("brand", Build.MANUFACTURER);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void c(int i, int i2, long j) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1001));
        linkedHashMap.put("current", String.valueOf(i));
        linkedHashMap.put("base", String.valueOf(i2));
        linkedHashMap.put("duration", String.valueOf(j));
        c(BaseApplication.getContext(), linkedHashMap);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void g() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put("errorCode", String.valueOf(1022));
        linkedHashMap.put("isSporting", String.valueOf(nty.a()));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void d(int i, int i2, long j) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1023));
        linkedHashMap.put("lastStandTotalStep", String.valueOf(i));
        linkedHashMap.put("lastExtendTotalStep", String.valueOf(i2));
        linkedHashMap.put("accuracy", String.valueOf(j));
        c(BaseApplication.getContext(), linkedHashMap);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void d(int i, int i2, int i3) {
        if (i2 - Math.max(i, i3) > 0) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
            linkedHashMap.put("errorCode", String.valueOf(1024));
            linkedHashMap.put("originalStep", String.valueOf(i));
            linkedHashMap.put("thirdBrandStep", String.valueOf(i2));
            linkedHashMap.put("dbStep", String.valueOf(i3));
            OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
        }
    }

    public static void j() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1025));
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void a(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1026));
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        linkedHashMap.put("source", str);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void d(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1027));
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        linkedHashMap.put("isHw", String.valueOf(CommonUtil.bg()));
        linkedHashMap.put("switch", str);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void c(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1028));
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        linkedHashMap.put("action", str);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void e(String str) {
        LinkedHashMap<String, String> linkedHashMapC = c(1029);
        linkedHashMapC.put("source", str);
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMapC);
    }

    public static void k() {
        if (CommonUtil.bg()) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1020));
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("devModel", Build.MODEL);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }

    public static void b(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("errorCode", String.valueOf(1030));
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        linkedHashMap.put("isHw", String.valueOf(CommonUtil.bg()));
        linkedHashMap.put("action", str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
    }
}
