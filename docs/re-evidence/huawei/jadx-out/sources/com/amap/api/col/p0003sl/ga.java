package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ga extends fm<GeocodeQuery, ArrayList<GeocodeAddress>> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public ga(Context context, GeocodeQuery geocodeQuery) {
        super(context, geocodeQuery);
    }

    private static ArrayList<GeocodeAddress> c(String str) throws AMapException {
        ArrayList<GeocodeAddress> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("count") && jSONObject.getInt("count") > 0) {
                return gc.i(jSONObject);
            }
        } catch (JSONException e) {
            fu.a(e, "GeocodingHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            fu.a(e2, "GeocodingHandler", "paseJSONException");
        }
        return arrayList;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/geocode/geo?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("output=json&address=");
        stringBuffer.append(b(((GeocodeQuery) this.f2534b).getLocationName()));
        String city = ((GeocodeQuery) this.f2534b).getCity();
        if (!gc.i(city)) {
            stringBuffer.append("&city=").append(b(city));
        }
        if (!gc.i(((GeocodeQuery) this.f2534b).getCountry())) {
            stringBuffer.append("&country=").append(b(((GeocodeQuery) this.f2534b).getCountry()));
        }
        stringBuffer.append("&key=" + il.f(this.i));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.col.p0003sl.fl
    protected final gt.b e() {
        gt.b bVar = new gt.b();
        bVar.f2596a = getURL() + c() + Constants.LANGUAGE_ASSIGN_STR + ServiceSettings.getInstance().getLanguage();
        return bVar;
    }
}
