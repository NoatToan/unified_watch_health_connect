package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import defpackage.dbs;
import defpackage.m2t;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g<String, dbs> {
    public b(Context context, String str) {
        super(context, str);
    }

    public static dbs h(JSONObject jSONObject) throws AMapException {
        dbs dbsVar = new dbs();
        try {
            String strOptString = jSONObject.optString("update", "");
            if (strOptString.equals("0")) {
                dbsVar.b(false);
            } else if (strOptString.equals("1")) {
                dbsVar.b(true);
            }
            dbsVar.a(jSONObject.optString("version", ""));
        } catch (Throwable th) {
            m2t.r(th, "OfflineInitHandlerAbstract", "loadData parseJson");
        }
        return dbsVar;
    }

    @Override // com.amap.api.col.p0003sl.g
    public final /* synthetic */ dbs a(JSONObject jSONObject) throws AMapException {
        return h(jSONObject);
    }

    @Override // com.amap.api.col.p0003sl.g
    public final String b() {
        return "016";
    }

    @Override // com.amap.api.col.p0003sl.g
    public final JSONObject c(x0.c cVar) {
        JSONObject jSONObject;
        if (cVar == null || (jSONObject = cVar.f) == null) {
            return null;
        }
        return jSONObject.optJSONObject("016");
    }

    @Override // com.amap.api.col.p0003sl.g
    public final Map<String, String> e() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.f6061a);
        return hashtable;
    }
}
