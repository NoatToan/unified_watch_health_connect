package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bj extends ca<String, List<OfflineMapProvince>> {
    private Context d;

    public bj(Context context, String str) {
        super(context, str);
    }

    public final void a(Context context) {
        this.d = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.ca
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<OfflineMapProvince> a(JSONObject jSONObject) throws AMapException {
        try {
            if (this.d != null) {
                bz.c(jSONObject.toString(), this.d);
            }
        } catch (Throwable th) {
            jv.c(th, "OfflineUpdateCityHandlerAbstract", "loadData jsonInit");
            th.printStackTrace();
        }
        try {
            Context context = this.d;
            if (context != null) {
                return bz.a(jSONObject, context);
            }
        } catch (JSONException e) {
            jv.c(e, "OfflineUpdateCityHandlerAbstract", "loadData parseJson");
            e.printStackTrace();
        }
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ca
    protected final JSONObject a(im.b bVar) {
        if (bVar == null || bVar.f == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = bVar.f.optJSONObject("015");
        if (!jSONObjectOptJSONObject.has("result")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result", new JSONObject().put("offlinemap_with_province_vfour", jSONObjectOptJSONObject));
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObjectOptJSONObject;
    }

    @Override // com.amap.api.col.p0003sl.ca
    protected final String a() {
        return "015";
    }

    @Override // com.amap.api.col.p0003sl.ca
    protected final Map<String, String> b() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.f2301a);
        return hashtable;
    }
}
