package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import defpackage.e0t;
import defpackage.fvs;
import defpackage.kts;
import defpackage.wts;
import defpackage.xts;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends kts<GeocodeQuery, ArrayList<GeocodeAddress>> {
    public w(Context context, GeocodeQuery geocodeQuery) {
        super(context, geocodeQuery);
    }

    public static ArrayList<GeocodeAddress> t(String str) throws AMapException {
        ArrayList<GeocodeAddress> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            return (jSONObject.has("count") && jSONObject.getInt("count") > 0) ? fvs.r0(jSONObject) : arrayList;
        } catch (JSONException e) {
            xts.i(e, "GeocodingHandler", "paseJSONJSONException");
            return arrayList;
        } catch (Exception e2) {
            xts.i(e2, "GeocodingHandler", "paseJSONException");
            return arrayList;
        }
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/geocode/geo?";
    }

    @Override // com.amap.api.col.p0003sl.u
    public final d0.b n() {
        d0.b bVar = new d0.b();
        bVar.f5985a = getURL() + q() + "language=" + ServiceSettings.getInstance().getLanguage();
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json&address=");
        stringBuffer.append(kts.b(((GeocodeQuery) this.s).getLocationName()));
        String city = ((GeocodeQuery) this.s).getCity();
        if (!fvs.s0(city)) {
            String strB = kts.b(city);
            stringBuffer.append("&city=");
            stringBuffer.append(strB);
        }
        if (!fvs.s0(((GeocodeQuery) this.s).getCountry())) {
            stringBuffer.append("&country=");
            stringBuffer.append(kts.b(((GeocodeQuery) this.s).getCountry()));
        }
        stringBuffer.append("&key=" + e0t.k(this.v));
        return stringBuffer.toString();
    }
}
