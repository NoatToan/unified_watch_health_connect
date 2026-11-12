package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.poisearch.PoiResult;
import defpackage.e0t;
import defpackage.fvs;
import defpackage.gv5;
import defpackage.iws;
import defpackage.kts;
import defpackage.wts;
import defpackage.wvs;
import defpackage.xts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends wvs<iws, PoiResult> {
    public List<String> A;
    public List<SuggestionCity> B;
    public int y;
    public boolean z;

    public b0(Context context, iws iwsVar) {
        super(context, iwsVar);
        this.y = 0;
        this.z = false;
        this.A = new ArrayList();
        this.B = new ArrayList();
    }

    public static String w(boolean z) {
        return z ? "distance" : "weight";
    }

    public static f0 y() {
        e0 e0VarC = d0.b().c("regeo");
        if (e0VarC == null) {
            return null;
        }
        return (f0) e0VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = wts.b() + "/place";
        T t = this.s;
        if (((iws) t).f22183b == null) {
            return str + "/text?";
        }
        if (((iws) t).f22183b.getShape().equals("Bound")) {
            String str2 = str + "/around?";
            this.z = true;
            return str2;
        }
        if (!((iws) this.s).f22183b.getShape().equals("Rectangle") && !((iws) this.s).f22183b.getShape().equals("Polygon")) {
            return str;
        }
        return str + "/polygon?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.u
    public final d0.b n() {
        d0.b bVar = new d0.b();
        if (this.z) {
            f0 f0VarY = y();
            double dL = f0VarY != null ? f0VarY.l() : 0.0d;
            bVar.f5985a = getURL() + v(false) + "language=" + ServiceSettings.getInstance().getLanguage();
            if (((iws) this.s).f22183b.getShape().equals("Bound")) {
                bVar.f5986b = new f0.a(xts.a(((iws) this.s).f22183b.getCenter().getLatitude()), xts.a(((iws) this.s).f22183b.getCenter().getLongitude()), dL);
            }
        } else {
            bVar.f5985a = getURL() + q() + "language=" + ServiceSettings.getInstance().getLanguage();
        }
        return bVar;
    }

    @Override // defpackage.kts
    public final String q() {
        return v(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String v(boolean z) {
        List<LatLonPoint> polyGonList;
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        T t = this.s;
        if (((iws) t).f22183b != null) {
            if (((iws) t).f22183b.getShape().equals("Bound")) {
                if (z) {
                    double dA = xts.a(((iws) this.s).f22183b.getCenter().getLongitude());
                    double dA2 = xts.a(((iws) this.s).f22183b.getCenter().getLatitude());
                    sb.append("&location=");
                    sb.append(dA + "," + dA2);
                }
                sb.append("&radius=");
                sb.append(((iws) this.s).f22183b.getRange());
                sb.append("&sortrule=");
                sb.append(w(((iws) this.s).f22183b.isDistanceSort()));
            } else if (((iws) this.s).f22183b.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((iws) this.s).f22183b.getLowerLeft();
                LatLonPoint upperRight = ((iws) this.s).f22183b.getUpperRight();
                double dA3 = xts.a(lowerLeft.getLatitude());
                double dA4 = xts.a(lowerLeft.getLongitude());
                double dA5 = xts.a(upperRight.getLatitude());
                sb.append("&polygon=" + dA4 + "," + dA3 + ";" + xts.a(upperRight.getLongitude()) + "," + dA5);
            } else if (((iws) this.s).f22183b.getShape().equals("Polygon") && (polyGonList = ((iws) this.s).f22183b.getPolyGonList()) != null && polyGonList.size() > 0) {
                sb.append("&polygon=" + xts.f(polyGonList));
            }
        }
        String city = ((iws) this.s).f22182a.getCity();
        if (!wvs.u(city)) {
            String strB = kts.b(city);
            sb.append("&city=");
            sb.append(strB);
        }
        String strB2 = kts.b(((iws) this.s).f22182a.getQueryString());
        if (!wvs.u(strB2)) {
            sb.append("&keywords=");
            sb.append(strB2);
        }
        sb.append("&offset=");
        sb.append(((iws) this.s).f22182a.getPageSize());
        sb.append("&page=");
        sb.append(((iws) this.s).f22182a.getPageNum());
        String building = ((iws) this.s).f22182a.getBuilding();
        if (building != null && building.trim().length() > 0) {
            sb.append("&building=");
            sb.append(((iws) this.s).f22182a.getBuilding());
        }
        String strB3 = kts.b(((iws) this.s).f22182a.getCategory());
        if (!wvs.u(strB3)) {
            sb.append("&types=");
            sb.append(strB3);
        }
        if (wvs.u(((iws) this.s).f22182a.getExtensions())) {
            sb.append("&extensions=base");
        } else {
            sb.append("&extensions=");
            sb.append(((iws) this.s).f22182a.getExtensions());
        }
        sb.append("&key=");
        sb.append(e0t.k(this.v));
        if (((iws) this.s).f22182a.getCityLimit()) {
            sb.append("&citylimit=true");
        } else {
            sb.append("&citylimit=false");
        }
        if (((iws) this.s).f22182a.isRequireSubPois()) {
            sb.append("&children=1");
        } else {
            sb.append("&children=0");
        }
        if (this.z) {
            if (((iws) this.s).f22182a.isSpecial()) {
                sb.append("&special=1");
            } else {
                sb.append("&special=0");
            }
        }
        T t2 = this.s;
        if (((iws) t2).f22183b == null && ((iws) t2).f22182a.getLocation() != null) {
            sb.append("&sortrule=");
            sb.append(w(((iws) this.s).f22182a.isDistanceSort()));
            double dA6 = xts.a(((iws) this.s).f22182a.getLocation().getLongitude());
            double dA7 = xts.a(((iws) this.s).f22182a.getLocation().getLatitude());
            sb.append("&location=");
            sb.append(dA6 + "," + dA7);
        }
        Map<String, String> customParams = ((iws) this.s).f22182a.getCustomParams();
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final PoiResult e(String str) throws AMapException {
        ArrayList<PoiItem> arrayList = new ArrayList<>();
        if (str == null) {
            T t = this.s;
            return PoiResult.createPagedResult(((iws) t).f22182a, ((iws) t).f22183b, this.A, this.B, ((iws) t).f22182a.getPageSize(), this.y, arrayList);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.y = jSONObject.optInt("count");
            arrayList = fvs.U(jSONObject);
            if (!jSONObject.has("suggestion")) {
                T t2 = this.s;
                return PoiResult.createPagedResult(((iws) t2).f22182a, ((iws) t2).f22183b, this.A, this.B, ((iws) t2).f22182a.getPageSize(), this.y, arrayList);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("suggestion");
            if (jSONObjectOptJSONObject == null) {
                T t3 = this.s;
                return PoiResult.createPagedResult(((iws) t3).f22182a, ((iws) t3).f22183b, this.A, this.B, ((iws) t3).f22182a.getPageSize(), this.y, arrayList);
            }
            this.B = fvs.w(jSONObjectOptJSONObject);
            this.A = fvs.M(jSONObjectOptJSONObject);
            ArrayList<PoiItem> arrayList2 = arrayList;
            T t4 = this.s;
            return PoiResult.createPagedResult(((iws) t4).f22182a, ((iws) t4).f22183b, this.A, this.B, ((iws) t4).f22182a.getPageSize(), this.y, arrayList2);
        } catch (JSONException e) {
            xts.i(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            xts.i(e2, "PoiSearchKeywordHandler", "paseJSONException");
        }
    }
}
