package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.core.AMapException;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class fr extends fq<gp, CloudItemDetail> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    public final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fr(Context context, gp gpVar) {
        super(context, gpVar);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.e() + "/datasearch/id";
    }

    private static CloudItemDetail c(String str) throws AMapException {
        if (str == null || str.equals("")) {
            return null;
        }
        try {
            return d(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static CloudItemDetail d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayA = a(jSONObject);
        if (jSONArrayA == null || jSONArrayA.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = jSONArrayA.getJSONObject(0);
        CloudItemDetail cloudItemDetailC = c(jSONObject2);
        a(cloudItemDetailC, jSONObject2);
        return cloudItemDetailC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put(MedalConstants.EVENT_KEY, il.f(this.i));
        hashtable.put("layerId", ((gp) this.f2534b).f2584a);
        hashtable.put("output", "json");
        hashtable.put("id", ((gp) this.f2534b).f2585b);
        String strA = io.a();
        String strA2 = io.a(this.i, strA, iy.b(hashtable));
        hashtable.put("ts", strA);
        hashtable.put("scode", strA2);
        return hashtable;
    }
}
