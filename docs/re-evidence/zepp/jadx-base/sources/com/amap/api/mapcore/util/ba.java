package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ba extends bw<String, az> {
    public ba(Context context, String str) {
        super(context, str);
    }

    @Override // com.amap.api.mapcore.util.bw
    public final /* synthetic */ az a(JSONObject jSONObject) throws AMapException {
        return b(jSONObject);
    }

    @Override // com.amap.api.mapcore.util.bw
    public final Map<String, String> b() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.a);
        return hashtable;
    }

    @Override // com.amap.api.mapcore.util.bw
    public final JSONObject a(gk.a aVar) {
        JSONObject jSONObject;
        if (aVar == null || (jSONObject = aVar.f) == null) {
            return null;
        }
        return jSONObject.optJSONObject("016");
    }

    private static az b(JSONObject jSONObject) throws AMapException {
        az azVar = new az();
        try {
            String strOptString = jSONObject.optString("update", "");
            if (strOptString.equals("0")) {
                azVar.a(false);
            } else if (strOptString.equals("1")) {
                azVar.a(true);
            }
            azVar.a(jSONObject.optString("version", ""));
        } catch (Throwable th) {
            hn.c(th, "OfflineInitHandlerAbstract", "loadData parseJson");
        }
        return azVar;
    }

    @Override // com.amap.api.mapcore.util.bw
    public final String a() {
        return "016";
    }
}
