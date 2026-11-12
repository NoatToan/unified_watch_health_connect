package defpackage;

import android.content.Context;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sts<T, V> extends kts<T, V> {
    public sts(Context context, T t) {
        super(context, t);
        this.f6269r = false;
    }

    public static JSONArray t(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optJSONArray("list");
        }
        return null;
    }

    public static void u(CloudItem cloudItem, JSONObject jSONObject) {
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

    public static int v(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("info")) == null) {
            return 0;
        }
        return jSONObjectOptJSONObject.optInt("count");
    }

    public static CloudItemDetail w(JSONObject jSONObject) throws JSONException {
        CloudItemDetail cloudItemDetail = new CloudItemDetail(fvs.v(jSONObject, "id"), new LatLonPoint(jSONObject.optDouble("point_y"), jSONObject.optDouble("point_x")), fvs.v(jSONObject, "title"), fvs.v(jSONObject, Home.JSON_KEY_ADDRESS));
        cloudItemDetail.setCreatetime(fvs.v(jSONObject, "gmt_create"));
        cloudItemDetail.setUpdatetime(fvs.v(jSONObject, "gmt_modified"));
        if (jSONObject.has("_distance")) {
            String strOptString = jSONObject.optString("_distance");
            if (!x(strOptString)) {
                cloudItemDetail.setDistance(Integer.parseInt(strOptString));
            }
        }
        return cloudItemDetail;
    }

    private static boolean x(String str) {
        return str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    @Override // com.amap.api.col.p0003sl.u
    public final V f(byte[] bArr) throws AMapException {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            xts.i(e, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        xts.m(str);
        return e(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        return null;
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android Search 9.7.4");
        map.put("X-INFO", g0t.i(this.v));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "9.7.4", "cloud"));
        map.put("logversion", "2.1");
        return map;
    }
}
