package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.poisearch.PoiResultV2;
import defpackage.e0t;
import defpackage.fvs;
import defpackage.gv5;
import defpackage.kts;
import defpackage.kws;
import defpackage.wts;
import defpackage.wvs;
import defpackage.xts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends wvs<kws, PoiResultV2> {
    public int y;
    public boolean z;

    public c0(Context context, kws kwsVar) {
        super(context, kwsVar);
        this.y = 0;
        this.z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String v(boolean z) {
        List<LatLonPoint> polyGonList;
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        T t = this.s;
        if (((kws) t).f24382b != null) {
            if (((kws) t).f24382b.getShape().equals("Bound")) {
                if (z) {
                    double dA = xts.a(((kws) this.s).f24382b.getCenter().getLongitude());
                    double dA2 = xts.a(((kws) this.s).f24382b.getCenter().getLatitude());
                    sb.append("&location=");
                    sb.append(dA + "," + dA2);
                }
                sb.append("&radius=");
                sb.append(((kws) this.s).f24382b.getRange());
                sb.append("&sortrule=");
                sb.append(w(((kws) this.s).f24382b.isDistanceSort()));
            } else if (((kws) this.s).f24382b.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((kws) this.s).f24382b.getLowerLeft();
                LatLonPoint upperRight = ((kws) this.s).f24382b.getUpperRight();
                double dA3 = xts.a(lowerLeft.getLatitude());
                double dA4 = xts.a(lowerLeft.getLongitude());
                double dA5 = xts.a(upperRight.getLatitude());
                sb.append("&polygon=" + dA4 + "," + dA3 + ";" + xts.a(upperRight.getLongitude()) + "," + dA5);
            } else if (((kws) this.s).f24382b.getShape().equals("Polygon") && (polyGonList = ((kws) this.s).f24382b.getPolyGonList()) != null && polyGonList.size() > 0) {
                sb.append("&polygon=" + xts.f(polyGonList));
            }
        }
        String city = ((kws) this.s).f24381a.getCity();
        if (!wvs.u(city)) {
            String strB = kts.b(city);
            sb.append("&region=");
            sb.append(strB);
        }
        String strB2 = kts.b(((kws) this.s).f24381a.getQueryString());
        if (!wvs.u(strB2)) {
            sb.append("&keywords=");
            sb.append(strB2);
        }
        sb.append("&page_size=");
        sb.append(((kws) this.s).f24381a.getPageSize());
        sb.append("&page_num=");
        sb.append(((kws) this.s).f24381a.getPageNum());
        String building = ((kws) this.s).f24381a.getBuilding();
        if (building != null && building.trim().length() > 0) {
            sb.append("&building=");
            sb.append(((kws) this.s).f24381a.getBuilding());
        }
        String strB3 = kts.b(((kws) this.s).f24381a.getCategory());
        if (!wvs.u(strB3)) {
            sb.append("&types=");
            sb.append(strB3);
        }
        String strT = wvs.t(((kws) this.s).f24381a.getShowFields());
        if (strT != null) {
            sb.append("&show_fields=");
            sb.append(strT);
        }
        sb.append("&key=");
        sb.append(e0t.k(this.v));
        if (((kws) this.s).f24381a.getCityLimit()) {
            sb.append("&citylimit=true");
        } else {
            sb.append("&citylimit=false");
        }
        if (this.z) {
            if (((kws) this.s).f24381a.isSpecial()) {
                sb.append("&special=1");
            } else {
                sb.append("&special=0");
            }
        }
        String channel = ((kws) this.s).f24381a.getChannel();
        if (!TextUtils.isEmpty(channel)) {
            sb.append("&channel=");
            sb.append(channel);
        }
        String premium = ((kws) this.s).f24381a.getPremium();
        if (!TextUtils.isEmpty(premium)) {
            sb.append("&permium=");
            sb.append(premium);
        }
        T t2 = this.s;
        if (((kws) t2).f24382b == null && ((kws) t2).f24381a.getLocation() != null) {
            sb.append("&sortrule=");
            sb.append(w(((kws) this.s).f24381a.isDistanceSort()));
            double dA6 = xts.a(((kws) this.s).f24381a.getLocation().getLongitude());
            double dA7 = xts.a(((kws) this.s).f24381a.getLocation().getLatitude());
            sb.append("&location=");
            sb.append(dA6 + "," + dA7);
        }
        Map<String, String> customParams = ((kws) this.s).f24381a.getCustomParams();
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

    private static String w(boolean z) {
        return z ? "distance" : "weight";
    }

    private static f0 y() {
        e0 e0VarC = d0.b().c("regeo");
        if (e0VarC == null) {
            return null;
        }
        return (f0) e0VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = wts.d() + "/place";
        T t = this.s;
        if (((kws) t).f24382b == null) {
            return str + "/text?";
        }
        if (((kws) t).f24382b.getShape().equals("Bound")) {
            String str2 = str + "/around?";
            this.z = true;
            return str2;
        }
        if (!((kws) this.s).f24382b.getShape().equals("Rectangle") && !((kws) this.s).f24382b.getShape().equals("Polygon")) {
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
            if (((kws) this.s).f24382b.getShape().equals("Bound")) {
                bVar.f5986b = new f0.a(xts.a(((kws) this.s).f24382b.getCenter().getLatitude()), xts.a(((kws) this.s).f24382b.getCenter().getLongitude()), dL);
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
    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final PoiResultV2 e(String str) throws AMapException {
        ArrayList<PoiItemV2> arrayList = new ArrayList<>();
        if (str == null) {
            T t = this.s;
            return PoiResultV2.createPagedResult(((kws) t).f24381a, ((kws) t).f24382b, this.y, arrayList);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.y = jSONObject.optInt("count");
            arrayList = fvs.Z(jSONObject);
        } catch (JSONException e) {
            xts.i(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            xts.i(e2, "PoiSearchKeywordHandler", "paseJSONException");
        }
        T t2 = this.s;
        return PoiResultV2.createPagedResult(((kws) t2).f24381a, ((kws) t2).f24382b, this.y, arrayList);
    }
}
