package com.huawei.utils;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.Utils;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class RiskBiAnalytics {

    public enum FitPLANRiskType {
        RISK_TYPE_SEND_PLAN_DEVICE("1"),
        RISK_TYPE_FINISH_PLAN("2"),
        RISK_TYPE_COACH_ADVICE_EMPTY("3"),
        RISK_TYPE_COURSE_CHECK_IN("4"),
        RISK_TYPE_CREATE_PLAN("5"),
        RISK_TYPE_HEAT_ANALYSIS("6");

        private final String mRiskType;

        FitPLANRiskType(String str) {
            this.mRiskType = str;
        }

        public String value() {
            return this.mRiskType;
        }
    }

    public enum SmartPlanRiskType {
        RISK_TYPE_SYNC_PLAN("1"),
        RISK_TYPE_SEND_STOP_PLAN("2"),
        RISK_TYPE_STOP_PLAN("3"),
        RISK_TYPE_SYNC_COMPETITION("4"),
        RISK_TYPE_QUERY_PLAN("5"),
        RISK_TYPE_QUERY_COMPETITION("6"),
        RISK_TYPE_QUERY_AI_COACH("7"),
        RISK_TYPE_AI_COACH_EMPTY("8");

        private final String mRiskType;

        SmartPlanRiskType(String str) {
            this.mRiskType = str;
        }

        public String value() {
            return this.mRiskType;
        }
    }

    public enum PrivacyAgrRiskType {
        RISK_TYPE_AGR_SIGN("1"),
        RISK_TYPE_AGR_QUERY("2");

        private final String mRiskType;

        PrivacyAgrRiskType(String str) {
            this.mRiskType = str;
        }

        public String value() {
            return this.mRiskType;
        }
    }

    public static void e(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(10);
        a(linkedHashMap);
        linkedHashMap.put("FitPlanType", str);
        linkedHashMap.put("keyWords", "FitPlan");
        linkedHashMap.put("messages", sb.toString());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_AI_PLAN_RISK_WARNING_85070038.value(), linkedHashMap);
    }

    public static void a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(10);
        a(linkedHashMap);
        linkedHashMap.put("PrivacyAgrRiskType", str);
        linkedHashMap.put("keyWords", "PrivacyAgrRisk");
        linkedHashMap.put("messages", sb.toString());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PRIVACY_AGR_RISK_WARNING_85070039.value(), linkedHashMap);
    }

    public static void a(int i, SmartPlanRiskType smartPlanRiskType, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(10);
        a(linkedHashMap);
        linkedHashMap.put("PlanType", String.valueOf(i));
        linkedHashMap.put("type", smartPlanRiskType == null ? "" : String.valueOf(smartPlanRiskType.value()));
        linkedHashMap.put("errorCode", str);
        linkedHashMap.put("messages", sb.toString());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_SMART_PLAN_WARNING_85070040.value(), linkedHashMap);
    }

    public static void a(LinkedHashMap<String, String> linkedHashMap) {
        if (CommonUtil.ap()) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (!TextUtils.isEmpty(accountInfo) && !HuaweiHealth.c().equals(accountInfo) && accountInfo.length() > 4) {
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
            if (Utils.o()) {
                return;
            }
            linkedHashMap.put(OpAnalyticsConstants.DEVICE_SERIAL_NUMBER, CommonUtil.i());
        }
    }
}
