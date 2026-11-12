package com.huawei.operation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.Build;
import android.os.PowerManager;
import com.huawei.common.OpAnalyticsApi;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hianalytics.v2.HiAnalytics;
import com.huawei.hianalytics.v2.HiAnalyticsConf;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.lmp;
import defpackage.niz;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ProcessUtil;
import health.compact.a.Sha256;
import health.compact.a.Utils;
import java.util.Date;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OpAnalyticsUtil {
    private static final int ERROR = -1;
    private static final int HASDK_CACHE_CAPACITY = 10;
    private static final String TAG = "OpAnalyticsUtil";

    private OpAnalyticsUtil() {
    }

    class OpAnalyticsImpl2 implements OpAnalyticsApi {
        private OpAnalyticsImpl2() {
        }

        @Override // com.huawei.common.OpAnalyticsApi
        public void onReport(String str, String str2) {
            OpAnalyticsUtil.this.setProbabilityProblemEvent(str, str2);
        }

        @Override // com.huawei.common.OpAnalyticsApi
        public void reportErrorCode(String str, LinkedHashMap<String, String> linkedHashMap) {
            if (str == null) {
                LogUtil.e(OpAnalyticsUtil.TAG, "reportErrorCode eventKey is null.");
                return;
            }
            if (str.equals(OperationKey.ACCOUNT_SDK_API_ERROR_CODE_80070011.value())) {
                OpAnalyticsUtil.this.setKeyProcessEvent(str, linkedHashMap);
            } else if (!str.equals(OperationKey.HEALTH_APP_PROBABILITY_PROBLEM_85070032.value())) {
                LogUtil.a(OpAnalyticsUtil.TAG, "reportErrorCode no branch, eventKey = ", str);
            } else {
                OpAnalyticsUtil opAnalyticsUtil = OpAnalyticsUtil.this;
                opAnalyticsUtil.setEvent(str, opAnalyticsUtil.buildMap(linkedHashMap));
            }
        }
    }

    public void init(Context context) {
        init(context, null);
    }

    public void init(final Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (Utils.h()) {
            final HiAnalyticsConf.Builder builder = new HiAnalyticsConf.Builder(context);
            final HiAnalyticsConfig.Builder builder2 = new HiAnalyticsConfig.Builder();
            GRSManager.c(context).d("biOperation", new GrsQueryCallback() { // from class: com.huawei.operation.OpAnalyticsUtil.1
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    lmp.b("Login_OpAnalyticsUtil", "getUrl success isFirstInit = ", Boolean.valueOf(HiAnalytics.getInitFlag()));
                    lmp.e(OpAnalyticsUtil.TAG, "url", str);
                    if (!HiAnalytics.getInitFlag()) {
                        OpAnalyticsUtil.this.setInitBuilder(builder, str, context);
                    } else {
                        builder.setCollectURL(1, str).setCollectURL(0, str).setEnableUDID(true).setUDID(CommonUtil.k(context)).setEnableSN(false).setEnableImei(false).setDecryptBatchPolicy(200, 50, 400).setAndroidId(FoundationCommonUtil.getAndroidId(context)).refresh(false);
                    }
                    OpAnalyticsUtil.this.setDiffConfigBuilder(builder2, str, context, HiAnalytics.getInitFlag());
                    HiAnalyticsManager.setCacheSize(10);
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(0, null);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    lmp.b(OpAnalyticsUtil.TAG, "onCallBackFail code = ", Integer.valueOf(i));
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(-1, null);
                    }
                }
            });
            if (!CommonUtil.af(context)) {
                HiAnalyticTools.enableLog(context);
            }
            LoginInit.getInstance(context).setOpAnalyticsApi(new OpAnalyticsImpl2());
        }
    }

    static class OpAnalyticsUtilHolder {
        private static final OpAnalyticsUtil INSTANCE = new OpAnalyticsUtil();

        private OpAnalyticsUtilHolder() {
        }
    }

    public static OpAnalyticsUtil getInstance() {
        return OpAnalyticsUtilHolder.INSTANCE;
    }

    public void setEvent(String str, LinkedHashMap<String, String> linkedHashMap) {
        setEventByType(str, linkedHashMap, false);
    }

    public void setEventWithReportImmediately(String str, LinkedHashMap<String, String> linkedHashMap) {
        setEventByType(str, linkedHashMap, true);
    }

    public void setEvent2nd(String str, LinkedHashMap<String, String> linkedHashMap) {
        setEvent(str, linkedHashMap);
    }

    public void setEventWithActionType(int i, String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("actiontype", String.valueOf(i));
        setEvent(str, linkedHashMap);
    }

    public void setEventOneErrorCode(String str, int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("errorCode", Integer.toString(i));
        setKeyProcessEvent(str, linkedHashMap);
    }

    public void setKeyProcessEvent(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null) {
            LogUtil.j(TAG, "map is null!");
            return;
        }
        if (CommonUtil.ap() && !Utils.o()) {
            linkedHashMap.put(OpAnalyticsConstants.DEVICE_SERIAL_NUMBER, CommonUtil.i());
        }
        setEvent2nd(str, linkedHashMap);
    }

    public void setProbabilityProblemEvent(String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("keyWords", str);
        linkedHashMap.put("messages", str2);
        setEventWithReportImmediately(OperationKey.HEALTH_APP_PROBABILITY_PROBLEM_85070032.value(), buildMap(linkedHashMap));
    }

    public void setNotificationPushEvent(String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH, str);
        linkedHashMap.put("packageName", str2);
        setEventWithReportImmediately(OperationKey.HEALTH_APP_PROBABILITY_PROBLEM_85070032.value(), buildMap(linkedHashMap));
    }

    public void setRiskWarningEvent(String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("keyWords", str);
        linkedHashMap.put("messages", str2);
        setEventWithReportImmediately(OperationKey.HEALTH_APP_RISK_WARNING_85070037.value(), buildMap(linkedHashMap));
    }

    public void setRiskWarningEventMap(String str, LinkedHashMap linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        linkedHashMap.put("keyWords", str);
        setEventWithReportImmediately(OperationKey.HEALTH_APP_RISK_WARNING_85070037.value(), buildMap(linkedHashMap));
    }

    private void syncReportOpEvent(String str, LinkedHashMap<String, String> linkedHashMap) {
        setEventWithReportImmediately(str, buildMap(linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    public void isSetIgnoringBatteryOptimizations(Context context, String str) {
        LogUtil.a(TAG, "isSetIgnoringBatteryOptimizations action enter.");
        if (CommonUtil.bg()) {
            return;
        }
        Object systemService = context.getSystemService("power");
        ?? IsIgnoringBatteryOptimizations = systemService instanceof PowerManager ? ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName()) : 0;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(3);
        linkedHashMap.put("action", String.valueOf((int) IsIgnoringBatteryOptimizations));
        linkedHashMap.put("phoneMode", Build.MODEL);
        linkedHashMap.put("from", str);
        LogUtil.a(TAG, "isSetIgnoringBatteryOptimizations action" + IsIgnoringBatteryOptimizations + ", phoneMode: " + Build.MODEL + ", from: " + str);
        setEvent2nd(OperationKey.HEALTH_APP_SET_INGORE_BATTERY_OPTIMIZATIONS_1090106.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiffConfigBuilder(HiAnalyticsConfig.Builder builder, String str, Context context, boolean z) {
        builder.setCollectURL(str).setEnableUDID(true).setEnableSN(true).setAndroidId(FoundationCommonUtil.getAndroidId(context));
        builder.setEnableImei(false).setUdid(CommonUtil.d(context, false));
        HiAnalyticsConfig hiAnalyticsConfigBuild = builder.build();
        if (!z) {
            new HiAnalyticsInstance.Builder(context).setDiffConf(hiAnalyticsConfigBuild).create("HiHealth");
        } else {
            new HiAnalyticsInstance.Builder(context).setDiffConf(hiAnalyticsConfigBuild).refresh("HiHealth");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitBuilder(HiAnalyticsConf.Builder builder, String str, Context context) {
        builder.setCollectURL(1, str).setCollectURL(0, str).setEnableUDID(true).setEnableSN(true).setDecryptBatchPolicy(200, 50, 400).setAndroidId(FoundationCommonUtil.getAndroidId(context));
        builder.setEnableImei(false).setUDID(CommonUtil.d(context, false)).create();
        LogUtil.a(TAG, "hms-hianalytics-visual switch is open");
    }

    private void setEventByType(final String str, final LinkedHashMap<String, String> linkedHashMap, final boolean z) {
        LogUtil.a(TAG, "setEventByType isImmediately:", Boolean.valueOf(z));
        ThreadPoolManager.c().b(TAG, new Runnable() { // from class: com.huawei.operation.OpAnalyticsUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1502lambda$setEventByType$0$comhuaweioperationOpAnalyticsUtil(str, linkedHashMap, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setEventByType$0$com-huawei-operation-OpAnalyticsUtil, reason: not valid java name */
    /* synthetic */ void m1502lambda$setEventByType$0$comhuaweioperationOpAnalyticsUtil(String str, LinkedHashMap linkedHashMap, boolean z) {
        if (Utils.h()) {
            if (niz.c()) {
                lmp.e(TAG, "setEvent()");
                OpAnalyticsImpl.setEvent(1, str, buildMap(linkedHashMap), z);
                return;
            } else {
                lmp.a(TAG, "setEvent() AnalyticsStatus is false");
                return;
            }
        }
        lmp.a(TAG, "setEvent() BuildConfig.SUPPORT_ANALYTICS = ", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinkedHashMap<String, String> buildMap(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put(OpAnalyticsConstants.OPERATION_ID, Sha256.d(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), "SHA-256"));
        linkedHashMap.put(OpAnalyticsConstants.OPERATION_VER, "1");
        linkedHashMap.put("time", String.valueOf(new Date(System.currentTimeMillis())));
        return linkedHashMap;
    }

    public void sqliteDatabaseLockedExceptionSetEvent(SQLiteDatabaseLockedException sQLiteDatabaseLockedException, String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("process_name", ProcessUtil.c());
        linkedHashMap.put("method_name", str);
        setEvent2nd(OperationKey.HEALTH_APP_DATABASE_LOCKED_2129025.value(), linkedHashMap);
        LogUtil.b("SqliteDatabaseLockedExceptionTag", "ErrorType: ", str, " sqliteDatabaseLockedException, biKey:", OperationKey.HEALTH_APP_DAEMON_EXCEPTION_2129026.value());
    }
}
