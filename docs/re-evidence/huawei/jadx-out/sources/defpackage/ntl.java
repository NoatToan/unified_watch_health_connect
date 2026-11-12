package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.util.SmartRulesApi;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ntl {
    private static SmartRulesApi c() {
        SmartRulesApi smartRulesApi = (SmartRulesApi) Services.d("HWSmartInteractMgr", SmartRulesApi.class);
        if (smartRulesApi == null) {
            ReleaseLogUtil.a("R_SmarterUtils", "SmartRulesApi service is not available! Module: HWSmartInteractMgr");
        }
        return smartRulesApi;
    }

    public static int a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        ArrayList<String> arrayListD = drw.e().d(c(str));
        if (njy.e(arrayListD)) {
            return 0;
        }
        return arrayListD.size();
    }

    public static HealthDevice.HealthDeviceKind c(String str) {
        return e(str) ? HealthDevice.HealthDeviceKind.valueOf(str) : HealthDevice.HealthDeviceKind.HDK_NOT_DEVICE;
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        for (HealthDevice.HealthDeviceKind healthDeviceKind : HealthDevice.HealthDeviceKind.values()) {
            if (healthDeviceKind.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(int i, String str) {
        SmartRulesApi smartRulesApiC = c();
        if (smartRulesApiC == null) {
            return false;
        }
        return smartRulesApiC.isRuleOpen(i, str);
    }

    public static String c(int i, String str, String str2) {
        SmartRulesApi smartRulesApiC = c();
        if (smartRulesApiC == null) {
            return "";
        }
        return smartRulesApiC.getRuleData(i, str, str2);
    }

    public static int d(int i, String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(i), str);
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(new JSONObject(strE).getString("priority"));
        } catch (NumberFormatException e) {
            LogUtil.e("SmarterUtils", "isRuleOpen ParseException exception = ", e.getMessage());
            return 0;
        } catch (JSONException e2) {
            LogUtil.e("SmarterUtils", "isRuleOpen JSONException exception = ", e2.getMessage());
            return 0;
        }
    }

    public static String c(int i, String str) {
        StringBuffer stringBuffer = new StringBuffer(5);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(i), str);
        if (TextUtils.isEmpty(strE)) {
            return stringBuffer.toString();
        }
        try {
            JSONObject jSONObject = new JSONObject(strE);
            if (!jSONObject.getBoolean(k.g)) {
                return stringBuffer.toString();
            }
            JSONArray jSONArray = jSONObject.getJSONObject(e.n).getJSONArray("recommended_time");
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    String string = jSONObject2.getString("start_time");
                    String string2 = jSONObject2.getString("end_time");
                    stringBuffer.append(string);
                    stringBuffer.append(string2);
                }
            }
            return stringBuffer.toString();
        } catch (JSONException e) {
            LogUtil.e("SmarterUtils", "isRuleOpen JSONException exception = ", e.getMessage());
        }
    }

    public static void d(Context context, int i, int i2) {
        LogUtil.a("SmarterUtils", "setMsgStatus = ", Integer.valueOf(i2));
        nsv nsvVarE = nsv.e(context);
        SmartMsgDbObject smartMsgDbObjectA = nsvVarE.a(i);
        if (smartMsgDbObjectA != null) {
            smartMsgDbObjectA.setStatus(i2);
            nsvVarE.b(smartMsgDbObjectA.getId(), smartMsgDbObjectA);
            LogUtil.a("SmarterUtils", "msgDbObject.getStatus() = ", Integer.valueOf(smartMsgDbObjectA.getStatus()));
        }
    }

    public static boolean a(Context context, String str, long j) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20009), str);
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            return Math.abs(System.currentTimeMillis() - Long.parseLong(strE)) > j;
        } catch (NumberFormatException e) {
            LogUtil.e("SmarterUtils", "checkInterval numberFormatException = ", e.getMessage());
            return false;
        }
    }

    public static void d(Context context, String str, long j) {
        SharedPreferenceManager.e(context, Integer.toString(20009), str, String.valueOf(j), new StorageParams());
    }

    public static void d(Context context, IBaseResponseCallback iBaseResponseCallback) {
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("custom.weight_auto_update_status");
        if (userPreference != null) {
            LogUtil.a("SmarterUtils", "weight switch status ", userPreference.getValue());
            if ("0".equals(userPreference.getValue())) {
                iBaseResponseCallback.a(100001, null);
                return;
            } else {
                iBaseResponseCallback.a(0, null);
                return;
            }
        }
        iBaseResponseCallback.a(0, null);
    }
}
