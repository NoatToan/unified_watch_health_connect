package com.huawei.hms.mlsdk.asr.o;

import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hms.mlsdk.asr.engine.cloud.vo.RttSegment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.operation.jsoperation.JsUtil;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f14413c;

    public final String a() {
        return this.f14411a;
    }

    public final JSONObject b() {
        return this.f14413c;
    }

    public final String c() {
        return this.f14412b;
    }

    public static h a(String str) throws JSONException {
        h hVar = new h();
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(AwarenessRequest.Field.COMMAND)) {
            hVar.f14411a = jSONObject.getString(AwarenessRequest.Field.COMMAND);
        }
        if (jSONObject.has("retCode")) {
            hVar.f14412b = jSONObject.getString("retCode");
        }
        if (jSONObject.has("retMsg")) {
            jSONObject.getString("retMsg");
        }
        if (!JsUtil.ServiceType.DATA.equalsIgnoreCase(hVar.f14411a) && !CommonConstant.RETKEY.STATUS.equalsIgnoreCase(hVar.f14411a)) {
            return hVar;
        }
        hVar.f14413c = jSONObject.getJSONObject("result");
        return hVar;
    }

    public static f a(JSONObject jSONObject) throws JSONException {
        f fVar = new f();
        if (jSONObject != null) {
            if (jSONObject.has("text")) {
                fVar.a(jSONObject.getString("text"));
            }
            if (jSONObject.has(JsUtil.SCORE)) {
                jSONObject.getDouble(JsUtil.SCORE);
            }
            if (jSONObject.has("endTimeOffset")) {
                jSONObject.getInt("endTimeOffset");
            }
            if (jSONObject.has("final")) {
                fVar.a(jSONObject.getBoolean("final"));
            }
            if (jSONObject.has("isPartialFinal")) {
                fVar.b(jSONObject.getBoolean("isPartialFinal"));
            }
            if (jSONObject.has("words")) {
                fVar.b(a(jSONObject.getJSONArray("words")));
            }
            if (jSONObject.has("sentences")) {
                fVar.a(a(jSONObject.getJSONArray("sentences")));
            }
        }
        return fVar;
    }

    private static ArrayList<RttSegment> a(JSONArray jSONArray) throws JSONException {
        ArrayList<RttSegment> arrayList = new ArrayList<>();
        if (jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = "";
                String string2 = jSONObject.has("startTime") ? jSONObject.getString("startTime") : "";
                String string3 = jSONObject.has("endTime") ? jSONObject.getString("endTime") : "";
                if (jSONObject.has("text")) {
                    string = jSONObject.getString("text");
                }
                arrayList.add(new RttSegment(string2, string3, string));
            }
        }
        return arrayList;
    }
}
