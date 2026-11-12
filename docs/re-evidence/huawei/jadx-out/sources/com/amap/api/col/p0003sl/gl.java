package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.poisearch.PoiSearchV2;
import com.huawei.health.device.model.RecordAction;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gl extends gj<String, PoiItemV2> {
    private PoiSearchV2.Query k;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    public final /* synthetic */ Object a(String str) throws AMapException {
        return d(str);
    }

    public gl(Context context, String str, PoiSearchV2.Query query) {
        super(context, str);
        this.k = query;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.c() + "/place/detail?";
    }

    private static PoiItemV2 d(String str) throws AMapException {
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            fu.a(e, "PoiSearchIdHandlerV2", "paseJSONJSONException");
            return null;
        } catch (Exception e2) {
            fu.a(e2, "PoiSearchIdHandlerV2", "paseJSONException");
            return null;
        }
    }

    private static PoiItemV2 a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return gc.f(jSONObjectOptJSONObject);
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
        PoiSearchV2.Query query = this.k;
        String strA = (query == null || query.getShowFields() == null) ? null : a(this.k.getShowFields());
        if (strA != null) {
            sb.append("&show_fields=");
            sb.append(strA);
        }
        sb.append("&key=" + il.f(this.i));
        String channel = this.k.getChannel();
        if (!TextUtils.isEmpty(channel)) {
            sb.append("&channel=");
            sb.append(channel);
        }
        String premium = this.k.getPremium();
        if (!TextUtils.isEmpty(premium)) {
            sb.append("&permium=");
            sb.append(premium);
        }
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
