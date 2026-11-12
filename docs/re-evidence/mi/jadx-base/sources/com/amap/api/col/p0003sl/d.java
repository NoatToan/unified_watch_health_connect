package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import defpackage.bes;
import defpackage.m2t;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends g<String, List<OfflineMapProvince>> {
    public Context d;

    public d(Context context, String str) {
        super(context, str);
    }

    @Override // com.amap.api.col.p0003sl.g
    public final String b() {
        return "015";
    }

    @Override // com.amap.api.col.p0003sl.g
    public final JSONObject c(x0.c cVar) {
        JSONObject jSONObject;
        if (cVar == null || (jSONObject = cVar.f) == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("015");
        if (!jSONObjectOptJSONObject.has("result")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", new JSONObject().put("offlinemap_with_province_vfour", jSONObjectOptJSONObject));
                return jSONObject2;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObjectOptJSONObject;
    }

    @Override // com.amap.api.col.p0003sl.g
    public final Map<String, String> e() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.f6061a);
        return hashtable;
    }

    public final void h(Context context) {
        this.d = context;
    }

    @Override // com.amap.api.col.p0003sl.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List<OfflineMapProvince> a(JSONObject jSONObject) throws AMapException {
        try {
            if (this.d != null) {
                bes.p(jSONObject.toString(), this.d);
            }
        } catch (Throwable th) {
            m2t.r(th, "OfflineUpdateCityHandlerAbstract", "loadData jsonInit");
            th.printStackTrace();
        }
        try {
            Context context = this.d;
            if (context != null) {
                return bes.g(jSONObject, context);
            }
            return null;
        } catch (JSONException e) {
            m2t.r(e, "OfflineUpdateCityHandlerAbstract", "loadData parseJson");
            e.printStackTrace();
            return null;
        }
    }
}
