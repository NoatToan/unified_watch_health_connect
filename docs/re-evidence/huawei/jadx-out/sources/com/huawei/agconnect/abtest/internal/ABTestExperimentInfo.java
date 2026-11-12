package com.huawei.agconnect.abtest.internal;

import com.huawei.agconnect.abtest.ABTestException;
import com.huawei.agconnect.common.api.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ABTestExperimentInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4792c;
    private String d;
    private boolean e;

    JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("experimentId", this.f4790a);
            jSONObject.put("variantId", this.f4791b);
            jSONObject.put("startTime", this.f4792c);
            jSONObject.put("triggerEventId", this.d);
            jSONObject.put("isTriggerEventReport", this.e);
            return jSONObject;
        } catch (JSONException e) {
            Logger.e("ABTest", "json error", e);
            return jSONObject;
        }
    }

    public boolean d() {
        return this.e;
    }

    String c() {
        return this.f4791b;
    }

    String b() {
        return this.d;
    }

    public void a(boolean z) {
        this.e = z;
    }

    String a() {
        return this.f4790a;
    }

    static ABTestExperimentInfo a(JSONObject jSONObject) {
        String str;
        if (jSONObject.opt("experimentId") == null) {
            str = "not exist experimentId";
        } else if (jSONObject.opt("variantId") == null) {
            str = "not exist variantId";
        } else {
            if (jSONObject.opt("startTime") != null) {
                String strOptString = jSONObject.optString("experimentId");
                String strOptString2 = jSONObject.optString("variantId");
                String strOptString3 = jSONObject.optString("startTime");
                String strOptString4 = jSONObject.optString("triggerEventId");
                boolean zOptBoolean = jSONObject.optBoolean("isTriggerEventReport");
                ABTestExperimentInfo aBTestExperimentInfo = new ABTestExperimentInfo();
                aBTestExperimentInfo.f4790a = strOptString;
                aBTestExperimentInfo.f4791b = strOptString2;
                aBTestExperimentInfo.f4792c = strOptString3;
                aBTestExperimentInfo.d = strOptString4;
                aBTestExperimentInfo.e = zOptBoolean;
                return aBTestExperimentInfo;
            }
            str = "not exist startTime key or format error";
        }
        Logger.e("ABTest", str);
        return null;
    }

    static ABTestExperimentInfo a(Map<String, String> map) throws ABTestException {
        String str = map.get("experimentId");
        if (str == null) {
            throw new ABTestException("not exist experimentId key", 2);
        }
        String str2 = map.get("variantId");
        if (str2 == null) {
            throw new ABTestException("not exist variantId key", 2);
        }
        String str3 = map.get("startTime");
        String str4 = map.get("triggerEventId");
        ABTestExperimentInfo aBTestExperimentInfo = new ABTestExperimentInfo();
        aBTestExperimentInfo.f4790a = str;
        aBTestExperimentInfo.f4791b = str2;
        aBTestExperimentInfo.f4792c = str3;
        aBTestExperimentInfo.d = str4;
        aBTestExperimentInfo.e = false;
        return aBTestExperimentInfo;
    }
}
