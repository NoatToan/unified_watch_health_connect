package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.poisearch.PoiSearch;
import defpackage.e0t;
import defpackage.fvs;
import defpackage.gv5;
import defpackage.wts;
import defpackage.wvs;
import defpackage.xts;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends wvs<String, PoiItem> {
    public PoiSearch.Query y;

    public z(Context context, String str, PoiSearch.Query query) {
        super(context, str);
        this.y = query;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String o() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append((String) this.s);
        sb.append("&output=json");
        PoiSearch.Query query = this.y;
        if (query == null || wvs.u(query.getExtensions())) {
            sb.append("&extensions=base");
        } else {
            sb.append("&extensions=");
            sb.append(this.y.getExtensions());
        }
        sb.append("&children=1");
        sb.append("&key=" + e0t.k(this.v));
        Map<String, String> customParams = this.y.getCustomParams();
        if (!customParams.isEmpty()) {
            for (Map.Entry<String, String> entry : customParams.entrySet()) {
                sb.append(gv5.CONNECT_STR);
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    public static PoiItem v(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return fvs.d0(jSONObjectOptJSONObject);
    }

    public static PoiItem w(String str) throws AMapException {
        try {
            return v(new JSONObject(str));
        } catch (JSONException e) {
            xts.i(e, "PoiSearchIdHandler", "paseJSONJSONException");
            return null;
        } catch (Exception e2) {
            xts.i(e2, "PoiSearchIdHandler", "paseJSONException");
            return null;
        }
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return w(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/place/detail?";
    }

    @Override // com.amap.api.col.p0003sl.u
    public final d0.b n() {
        d0.b bVar = new d0.b();
        bVar.f5985a = getURL() + q() + "language=" + ServiceSettings.getInstance().getLanguage();
        return bVar;
    }

    @Override // defpackage.kts
    public final String q() {
        return o();
    }
}
