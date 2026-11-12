package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.poisearch.PoiSearchV2;
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
public final class a0 extends wvs<String, PoiItemV2> {
    public PoiSearchV2.Query y;

    public a0(Context context, String str, PoiSearchV2.Query query) {
        super(context, str);
        this.y = query;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String o() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append((String) this.s);
        sb.append("&output=json");
        PoiSearchV2.Query query = this.y;
        String strT = (query == null || query.getShowFields() == null) ? null : wvs.t(this.y.getShowFields());
        if (strT != null) {
            sb.append("&show_fields=");
            sb.append(strT);
        }
        sb.append("&key=" + e0t.k(this.v));
        String channel = this.y.getChannel();
        if (!TextUtils.isEmpty(channel)) {
            sb.append("&channel=");
            sb.append(channel);
        }
        String premium = this.y.getPremium();
        if (!TextUtils.isEmpty(premium)) {
            sb.append("&permium=");
            sb.append(premium);
        }
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

    public static PoiItemV2 v(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return fvs.h0(jSONObjectOptJSONObject);
    }

    public static PoiItemV2 w(String str) throws AMapException {
        try {
            return v(new JSONObject(str));
        } catch (JSONException e) {
            xts.i(e, "PoiSearchIdHandlerV2", "paseJSONJSONException");
            return null;
        } catch (Exception e2) {
            xts.i(e2, "PoiSearchIdHandlerV2", "paseJSONException");
            return null;
        }
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return w(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.d() + "/place/detail?";
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
