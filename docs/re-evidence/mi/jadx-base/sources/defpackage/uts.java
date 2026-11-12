package defpackage;

import android.content.Context;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.core.AMapException;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uts extends sts<fws, CloudItemDetail> {
    public uts(Context context, fws fwsVar) {
        super(context, fwsVar);
    }

    public static CloudItemDetail y(String str) throws AMapException {
        if (str == null || str.equals("")) {
            return null;
        }
        try {
            return z(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static CloudItemDetail z(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayT = sts.t(jSONObject);
        if (jSONArrayT == null || jSONArrayT.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = jSONArrayT.getJSONObject(0);
        CloudItemDetail cloudItemDetailW = sts.w(jSONObject2);
        sts.u(cloudItemDetailW, jSONObject2);
        return cloudItemDetailW;
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return y(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", e0t.k(this.v));
        hashtable.put("layerId", ((fws) this.s).f18329a);
        hashtable.put("output", "json");
        hashtable.put("id", ((fws) this.s).f18330b);
        String strA = g0t.a();
        String strC = g0t.c(this.v, strA, p0t.q(hashtable));
        hashtable.put(DeviceTagInterface.TAG_DATA_START, strA);
        hashtable.put("scode", strC);
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.f() + "/datasearch/id";
    }

    @Override // defpackage.kts
    public final String q() {
        return null;
    }
}
