package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.axt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class AdCreativeContentRecord extends RecordBean {
    private static final String TAG = "AdCreativeContentRecord";
    private String basicTargetTag;
    private String contentId;
    private String creativeLabel;
    private String deviceParam;
    String encryptEcpm;
    private String industryId1st;
    private String industryId2nd;
    private String metaData;
    private String monitor;
    private String priceType;
    private String tradeMode;
    private long uptime;

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return 2592000000L;
    }

    public String f() {
        return this.tradeMode;
    }

    public String g() {
        return this.monitor;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "uptime<?";
    }

    public String h() {
        return this.metaData;
    }

    public String i() {
        return this.industryId2nd;
    }

    public String e() {
        return this.industryId1st;
    }

    public String b() {
        return this.encryptEcpm;
    }

    public String a() {
        return this.creativeLabel;
    }

    public String c() {
        return this.contentId;
    }

    public String d() {
        return this.basicTargetTag;
    }

    private void b(JSONObject jSONObject) {
        JSONArray jSONArrayA;
        String strOptString;
        JSONObject jSONObjectD = axt.d(jSONObject.optString("creativeLabel"));
        jSONObject.optString("creativeLabel");
        if (jSONObjectD == null || (jSONArrayA = axt.a(jSONObjectD.optString("creativeCategory"))) == null) {
            return;
        }
        String strSubstring = null;
        try {
            strOptString = jSONArrayA.getJSONObject(0).optString("category");
        } catch (JSONException e) {
            HiAdLog.w(TAG, "getCategory exception %s", e.getClass().getSimpleName());
            strOptString = null;
        }
        this.industryId1st = (strOptString == null || strOptString.length() < 4) ? null : strOptString.substring(0, 4);
        if (strOptString != null && strOptString.length() >= 8) {
            strSubstring = strOptString.substring(0, 8);
        }
        this.industryId2nd = strSubstring;
    }

    public AdCreativeContentRecord(JSONObject jSONObject) {
        this.uptime = System.currentTimeMillis();
        if (jSONObject != null) {
            this.contentId = jSONObject.optString("contentid");
            this.metaData = jSONObject.optString("metaData");
            this.monitor = jSONObject.optString(MapKeyNames.THIRD_MONITORS);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("deviceAiParam");
            if (jSONObjectOptJSONObject != null) {
                this.tradeMode = jSONObjectOptJSONObject.optString("tradeMode");
                this.priceType = jSONObjectOptJSONObject.optString("priceType");
                this.deviceParam = jSONObjectOptJSONObject.toString();
                b(jSONObjectOptJSONObject);
                this.creativeLabel = jSONObjectOptJSONObject.optString("creativeLabel");
                this.basicTargetTag = jSONObjectOptJSONObject.optString("basicTargetTag");
                this.encryptEcpm = jSONObjectOptJSONObject.optString("encryptEcpm");
            }
            this.uptime = System.currentTimeMillis();
        }
    }

    public AdCreativeContentRecord() {
        this.uptime = System.currentTimeMillis();
    }
}
