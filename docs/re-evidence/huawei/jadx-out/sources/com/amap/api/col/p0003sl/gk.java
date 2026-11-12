package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.poisearch.PoiSearch;
import com.huawei.health.device.model.RecordAction;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gk extends gj<String, PoiItem> {
    private PoiSearch.Query k;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    public final /* synthetic */ Object a(String str) throws AMapException {
        return d(str);
    }

    public gk(Context context, String str, PoiSearch.Query query) {
        super(context, str);
        this.k = query;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/place/detail?";
    }

    private static PoiItem d(String str) throws AMapException {
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            fu.a(e, "PoiSearchIdHandler", "paseJSONJSONException");
            return null;
        } catch (Exception e2) {
            fu.a(e2, "PoiSearchIdHandler", "paseJSONException");
            return null;
        }
    }

    private static PoiItem a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return gc.e(jSONObjectOptJSONObject);
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        return f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String f() {
        StringBuilder sb = new StringBuilder(RecordAction.ACT_ID_TAG);
        sb.append((String) this.f2534b);
        sb.append("&output=json");
        PoiSearch.Query query = this.k;
        if (query != null && !c(query.getExtensions())) {
            sb.append("&extensions=");
            sb.append(this.k.getExtensions());
        } else {
            sb.append("&extensions=base");
        }
        sb.append("&children=1");
        sb.append("&key=" + il.f(this.i));
        Map<String, String> customParams = this.k.getCustomParams();
        if (!customParams.isEmpty()) {
            for (Map.Entry<String, String> entry : customParams.entrySet()) {
                sb.append("&");
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    @Override // com.amap.api.col.p0003sl.fl
    protected final gt.b e() {
        gt.b bVar = new gt.b();
        bVar.f2596a = getURL() + c() + Constants.LANGUAGE_ASSIGN_STR + ServiceSettings.getInstance().getLanguage();
        return bVar;
    }
}
