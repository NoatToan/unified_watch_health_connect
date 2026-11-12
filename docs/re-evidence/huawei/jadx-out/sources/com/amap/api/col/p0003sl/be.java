package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class be extends ca<String, bd> {
    @Override // com.amap.api.col.p0003sl.ca
    protected final /* synthetic */ bd a(JSONObject jSONObject) throws AMapException {
        return b(jSONObject);
    }

    public be(Context context, String str) {
        super(context, str);
    }

    @Override // com.amap.api.col.p0003sl.ca
    protected final JSONObject a(im.b bVar) {
        if (bVar == null || bVar.f == null) {
            return null;
        }
        return bVar.f.optJSONObject("016");
    }

    @Override // com.amap.api.col.p0003sl.ca
    protected final String a() {
        return "016";
    }

    @Override // com.amap.api.col.p0003sl.ca
    protected final Map<String, String> b() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.f2301a);
        return hashtable;
    }

    private static bd b(JSONObject jSONObject) throws AMapException {
        bd bdVar = new bd();
        try {
            String strOptString = jSONObject.optString("update", "");
            if (strOptString.equals("0")) {
                bdVar.a(false);
            } else if (strOptString.equals("1")) {
                bdVar.a(true);
            }
            bdVar.a(jSONObject.optString("version", ""));
            return bdVar;
        } catch (Throwable th) {
            jv.c(th, "OfflineInitHandlerAbstract", "loadData parseJson");
            return bdVar;
        }
    }
}
