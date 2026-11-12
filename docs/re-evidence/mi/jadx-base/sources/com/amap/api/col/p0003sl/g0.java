package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import defpackage.e0t;
import defpackage.fvs;
import defpackage.kts;
import defpackage.wts;
import defpackage.xts;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends kts<RegeocodeQuery, RegeocodeAddress> {
    public g0(Context context, RegeocodeQuery regeocodeQuery) {
        super(context, regeocodeQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String t(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json&location=");
        if (z) {
            sb.append(xts.a(((RegeocodeQuery) this.s).getPoint().getLongitude()));
            sb.append(",");
            sb.append(xts.a(((RegeocodeQuery) this.s).getPoint().getLatitude()));
        }
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.s).getPoiType())) {
            sb.append("&poitype=");
            sb.append(((RegeocodeQuery) this.s).getPoiType());
        }
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.s).getMode())) {
            sb.append("&mode=");
            sb.append(((RegeocodeQuery) this.s).getMode());
        }
        if (TextUtils.isEmpty(((RegeocodeQuery) this.s).getExtensions())) {
            sb.append("&extensions=base");
        } else {
            sb.append("&extensions=");
            sb.append(((RegeocodeQuery) this.s).getExtensions());
        }
        sb.append("&radius=");
        sb.append((int) ((RegeocodeQuery) this.s).getRadius());
        sb.append("&coordsys=");
        sb.append(((RegeocodeQuery) this.s).getLatLonType());
        sb.append("&key=");
        sb.append(e0t.k(this.v));
        return sb.toString();
    }

    public static RegeocodeAddress u(String str) throws AMapException {
        RegeocodeAddress regeocodeAddress = new RegeocodeAddress();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("regeocode");
            if (jSONObjectOptJSONObject == null) {
                return regeocodeAddress;
            }
            regeocodeAddress.setFormatAddress(fvs.v(jSONObjectOptJSONObject, "formatted_address"));
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("addressComponent");
            if (jSONObjectOptJSONObject2 != null) {
                fvs.J(jSONObjectOptJSONObject2, regeocodeAddress);
            }
            regeocodeAddress.setPois(fvs.U(jSONObjectOptJSONObject));
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("roads");
            if (jSONArrayOptJSONArray != null) {
                fvs.R(jSONArrayOptJSONArray, regeocodeAddress);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("roadinters");
            if (jSONArrayOptJSONArray2 != null) {
                fvs.H(jSONArrayOptJSONArray2, regeocodeAddress);
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("aois");
            if (jSONArrayOptJSONArray3 != null) {
                fvs.X(jSONArrayOptJSONArray3, regeocodeAddress);
            }
        } catch (JSONException e) {
            xts.i(e, "ReverseGeocodingHandler", "paseJSON");
        }
        return regeocodeAddress;
    }

    private static f0 v() {
        e0 e0VarC = d0.b().c("regeo");
        if (e0VarC == null) {
            return null;
        }
        return (f0) e0VarC;
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return u(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/geocode/regeo?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.u
    public final d0.b n() {
        f0 f0VarV = v();
        double dL = f0VarV != null ? f0VarV.l() : 0.0d;
        d0.b bVar = new d0.b();
        bVar.f5985a = getURL() + t(false) + "language=" + ServiceSettings.getInstance().getLanguage();
        T t = this.s;
        if (t != 0 && ((RegeocodeQuery) t).getPoint() != null) {
            bVar.f5986b = new f0.a(((RegeocodeQuery) this.s).getPoint().getLatitude(), ((RegeocodeQuery) this.s).getPoint().getLongitude(), dL);
        }
        return bVar;
    }

    @Override // defpackage.kts
    public final String q() {
        return t(true);
    }
}
