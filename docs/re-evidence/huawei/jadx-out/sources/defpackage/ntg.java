package defpackage;

import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.util.SmartRulesApi;
import health.compact.a.SharedPreferenceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes39.dex */
@ApiDefine(uri = SmartRulesApi.class)
@Singleton
public class ntg implements SmartRulesApi {
    @Override // com.huawei.hwsmartinteractmgr.util.SmartRulesApi
    public boolean isRuleOpen(int i, String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(i), str);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        try {
            return new JSONObject(strE).getBoolean(k.g);
        } catch (JSONException e) {
            LogUtil.e("SmarterUtils", "isRuleOpen JSONException exception = ", e.getMessage());
            return false;
        }
    }

    @Override // com.huawei.hwsmartinteractmgr.util.SmartRulesApi
    public String getRuleData(int i, String str, String str2) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(i), str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strE);
            if (jSONObject.getBoolean(k.g)) {
                return jSONObject.getJSONObject(e.n).getString(str2);
            }
            return null;
        } catch (JSONException e) {
            LogUtil.e("SmarterUtils", "isRuleOpen JSONException exception = ", e.getMessage());
            return null;
        }
    }

    @Override // com.huawei.hwsmartinteractmgr.util.SmartRulesApi
    public void deleteSmartMsgByType(int i) {
        nsr.b(BaseApplication.getContext()).a(i);
    }
}
