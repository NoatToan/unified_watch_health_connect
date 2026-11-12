package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.CloudParamKeys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class fq<T, V> extends fm<T, V> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        return null;
    }

    public fq(Context context, T t) {
        super(context, t);
        this.f2533a = false;
    }

    protected static JSONArray a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optJSONArray("list");
        }
        return null;
    }

    protected static int b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(CloudParamKeys.INFO)) == null) {
            return 0;
        }
        return jSONObjectOptJSONObject.optInt("count");
    }

    protected static CloudItemDetail c(JSONObject jSONObject) throws JSONException {
        CloudItemDetail cloudItemDetail = new CloudItemDetail(gc.a(jSONObject, "id"), new LatLonPoint(jSONObject.optDouble("point_y"), jSONObject.optDouble("point_x")), gc.a(jSONObject, "title"), gc.a(jSONObject, "address"));
        cloudItemDetail.setCreatetime(gc.a(jSONObject, "gmt_create"));
        cloudItemDetail.setUpdatetime(gc.a(jSONObject, "gmt_modified"));
        if (jSONObject.has("_distance")) {
            String strOptString = jSONObject.optString("_distance");
            if (!c(strOptString)) {
                cloudItemDetail.setDistance(Integer.parseInt(strOptString));
            }
        }
        return cloudItemDetail;
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put(j2.v, Constants.GZIP);
        map.put("User-Agent", "AMAP SDK Android Search 9.7.4");
        map.put("X-INFO", io.b(this.i));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "9.7.4", "cloud"));
        map.put("logversion", "2.1");
        return map;
    }

    protected static void a(CloudItem cloudItem, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap<String, String> map = new HashMap<>();
        if (itKeys == null) {
            return;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                map.put(next.toString(), jSONObject.optString(next.toString()));
            }
        }
        cloudItem.setCustomfield(map);
    }

    private static boolean c(String str) {
        return str == null || str.equals("") || str.equals("[]");
    }

    @Override // com.amap.api.col.p0003sl.fl
    protected final V a(byte[] bArr) throws AMapException {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            fu.a(e, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        fu.c(str);
        return a(str);
    }
}
