package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.huawei.openalliance.ad.constant.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gx extends fm<RegeocodeQuery, RegeocodeAddress> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public gx(Context context, RegeocodeQuery regeocodeQuery) {
        super(context, regeocodeQuery);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/geocode/regeo?";
    }

    private static RegeocodeAddress c(String str) throws AMapException {
        RegeocodeAddress regeocodeAddress = new RegeocodeAddress();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("regeocode");
            if (jSONObjectOptJSONObject != null) {
                regeocodeAddress.setFormatAddress(gc.a(jSONObjectOptJSONObject, "formatted_address"));
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("addressComponent");
                if (jSONObjectOptJSONObject2 != null) {
                    gc.a(jSONObjectOptJSONObject2, regeocodeAddress);
                }
                regeocodeAddress.setPois(gc.c(jSONObjectOptJSONObject));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("roads");
                if (jSONArrayOptJSONArray != null) {
                    gc.b(jSONArrayOptJSONArray, regeocodeAddress);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("roadinters");
                if (jSONArrayOptJSONArray2 != null) {
                    gc.a(jSONArrayOptJSONArray2, regeocodeAddress);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("aois");
                if (jSONArrayOptJSONArray3 != null) {
                    gc.c(jSONArrayOptJSONArray3, regeocodeAddress);
                    return regeocodeAddress;
                }
            }
        } catch (JSONException e) {
            fu.a(e, "ReverseGeocodingHandler", "paseJSON");
        }
        return regeocodeAddress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(boolean z) {
        StringBuilder sb = new StringBuilder("output=json&location=");
        if (z) {
            sb.append(fu.a(((RegeocodeQuery) this.f2534b).getPoint().getLongitude()));
            sb.append(",");
            sb.append(fu.a(((RegeocodeQuery) this.f2534b).getPoint().getLatitude()));
        }
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.f2534b).getPoiType())) {
            sb.append("&poitype=");
            sb.append(((RegeocodeQuery) this.f2534b).getPoiType());
        }
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.f2534b).getMode())) {
            sb.append("&mode=");
            sb.append(((RegeocodeQuery) this.f2534b).getMode());
        }
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.f2534b).getExtensions())) {
            sb.append("&extensions=");
            sb.append(((RegeocodeQuery) this.f2534b).getExtensions());
        } else {
            sb.append("&extensions=base");
        }
        sb.append("&radius=");
        sb.append((int) ((RegeocodeQuery) this.f2534b).getRadius());
        sb.append("&coordsys=");
        sb.append(((RegeocodeQuery) this.f2534b).getLatLonType());
        sb.append("&key=");
        sb.append(il.f(this.i));
        return sb.toString();
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        return a(true);
    }

    private static gv f() {
        gu guVarA = gt.a().a("regeo");
        if (guVarA == null) {
            return null;
        }
        return (gv) guVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fl
    protected final gt.b e() {
        gv gvVarF = f();
        double dA = gvVarF != null ? gvVarF.a() : 0.0d;
        gt.b bVar = new gt.b();
        bVar.f2596a = getURL() + a(false) + Constants.LANGUAGE_ASSIGN_STR + ServiceSettings.getInstance().getLanguage();
        if (this.f2534b != 0 && ((RegeocodeQuery) this.f2534b).getPoint() != null) {
            bVar.f2597b = new gv.a(((RegeocodeQuery) this.f2534b).getPoint().getLatitude(), ((RegeocodeQuery) this.f2534b).getPoint().getLongitude(), dA);
        }
        return bVar;
    }
}
