package defpackage;

import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
class uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50280a;

    uk() {
    }

    private void e(String str) {
        this.f50280a = str;
    }

    String a() {
        return this.f50280a;
    }

    static uk a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        uk ukVar = new uk();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("paymentResource");
        if (jSONObjectOptJSONObject != null) {
            ukVar.e(tu.e(jSONObjectOptJSONObject, CommonPickerConstant.RequestParams.KEY_REDIRECT_URL, ""));
            return ukVar;
        }
        ukVar.e(tu.e(jSONObject.optJSONObject("agreementSetup"), "approvalUrl", ""));
        return ukVar;
    }
}
