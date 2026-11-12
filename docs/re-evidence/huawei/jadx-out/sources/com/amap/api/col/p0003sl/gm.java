package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.poisearch.PoiResult;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gm extends gj<gq, PoiResult> {
    private int k;
    private boolean l;
    private List<String> m;
    private List<SuggestionCity> n;

    public gm(Context context, gq gqVar) {
        super(context, gqVar);
        this.k = 0;
        this.l = false;
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = ft.a() + "/place";
        if (((gq) this.f2534b).f2587b == null) {
            return str + "/text?";
        }
        if (((gq) this.f2534b).f2587b.getShape().equals("Bound")) {
            String str2 = str + "/around?";
            this.l = true;
            return str2;
        }
        if (!((gq) this.f2534b).f2587b.getShape().equals("Rectangle") && !((gq) this.f2534b).f2587b.getShape().equals("Polygon")) {
            return str;
        }
        return str + "/polygon?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public PoiResult a(String str) throws AMapException {
        ArrayList<PoiItem> arrayList = new ArrayList<>();
        if (str == null) {
            return PoiResult.createPagedResult(((gq) this.f2534b).f2586a, ((gq) this.f2534b).f2587b, this.m, this.n, ((gq) this.f2534b).f2586a.getPageSize(), this.k, arrayList);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.k = jSONObject.optInt("count");
            arrayList = gc.c(jSONObject);
            if (!jSONObject.has("suggestion")) {
                return PoiResult.createPagedResult(((gq) this.f2534b).f2586a, ((gq) this.f2534b).f2587b, this.m, this.n, ((gq) this.f2534b).f2586a.getPageSize(), this.k, arrayList);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("suggestion");
            if (jSONObjectOptJSONObject == null) {
                return PoiResult.createPagedResult(((gq) this.f2534b).f2586a, ((gq) this.f2534b).f2587b, this.m, this.n, ((gq) this.f2534b).f2586a.getPageSize(), this.k, arrayList);
            }
            this.n = gc.a(jSONObjectOptJSONObject);
            this.m = gc.b(jSONObjectOptJSONObject);
            return PoiResult.createPagedResult(((gq) this.f2534b).f2586a, ((gq) this.f2534b).f2587b, this.m, this.n, ((gq) this.f2534b).f2586a.getPageSize(), this.k, arrayList);
        } catch (JSONException e) {
            fu.a(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            fu.a(e2, "PoiSearchKeywordHandler", "paseJSONException");
        }
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        return a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(boolean z) {
        List<LatLonPoint> polyGonList;
        StringBuilder sb = new StringBuilder("output=json");
        if (((gq) this.f2534b).f2587b != null) {
            if (((gq) this.f2534b).f2587b.getShape().equals("Bound")) {
                if (z) {
                    double dA = fu.a(((gq) this.f2534b).f2587b.getCenter().getLongitude());
                    double dA2 = fu.a(((gq) this.f2534b).f2587b.getCenter().getLatitude());
                    sb.append("&location=");
                    sb.append(dA + "," + dA2);
                }
                sb.append("&radius=");
                sb.append(((gq) this.f2534b).f2587b.getRange());
                sb.append("&sortrule=");
                sb.append(b(((gq) this.f2534b).f2587b.isDistanceSort()));
            } else if (((gq) this.f2534b).f2587b.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((gq) this.f2534b).f2587b.getLowerLeft();
                LatLonPoint upperRight = ((gq) this.f2534b).f2587b.getUpperRight();
                double dA3 = fu.a(lowerLeft.getLatitude());
                double dA4 = fu.a(lowerLeft.getLongitude());
                double dA5 = fu.a(upperRight.getLatitude());
                sb.append("&polygon=" + dA4 + "," + dA3 + ";" + fu.a(upperRight.getLongitude()) + "," + dA5);
            } else if (((gq) this.f2534b).f2587b.getShape().equals("Polygon") && (polyGonList = ((gq) this.f2534b).f2587b.getPolyGonList()) != null && polyGonList.size() > 0) {
                sb.append("&polygon=" + fu.a(polyGonList));
            }
        }
        String city = ((gq) this.f2534b).f2586a.getCity();
        if (!c(city)) {
            String strB = b(city);
            sb.append("&city=");
            sb.append(strB);
        }
        String strB2 = b(((gq) this.f2534b).f2586a.getQueryString());
        if (!c(strB2)) {
            sb.append("&keywords=");
            sb.append(strB2);
        }
        sb.append("&offset=");
        sb.append(((gq) this.f2534b).f2586a.getPageSize());
        sb.append("&page=");
        sb.append(((gq) this.f2534b).f2586a.getPageNum());
        String building = ((gq) this.f2534b).f2586a.getBuilding();
        if (building != null && building.trim().length() > 0) {
            sb.append("&building=");
            sb.append(((gq) this.f2534b).f2586a.getBuilding());
        }
        String strB3 = b(((gq) this.f2534b).f2586a.getCategory());
        if (!c(strB3)) {
            sb.append("&types=");
            sb.append(strB3);
        }
        if (!c(((gq) this.f2534b).f2586a.getExtensions())) {
            sb.append("&extensions=");
            sb.append(((gq) this.f2534b).f2586a.getExtensions());
        } else {
            sb.append("&extensions=base");
        }
        sb.append("&key=");
        sb.append(il.f(this.i));
        if (((gq) this.f2534b).f2586a.getCityLimit()) {
            sb.append("&citylimit=true");
        } else {
            sb.append("&citylimit=false");
        }
        if (((gq) this.f2534b).f2586a.isRequireSubPois()) {
            sb.append("&children=1");
        } else {
            sb.append("&children=0");
        }
        if (this.l) {
            if (((gq) this.f2534b).f2586a.isSpecial()) {
                sb.append("&special=1");
            } else {
                sb.append("&special=0");
            }
        }
        if (((gq) this.f2534b).f2587b == null && ((gq) this.f2534b).f2586a.getLocation() != null) {
            sb.append("&sortrule=");
            sb.append(b(((gq) this.f2534b).f2586a.isDistanceSort()));
            double dA6 = fu.a(((gq) this.f2534b).f2586a.getLocation().getLongitude());
            double dA7 = fu.a(((gq) this.f2534b).f2586a.getLocation().getLatitude());
            sb.append("&location=");
            sb.append(dA6 + "," + dA7);
        }
        Map<String, String> customParams = ((gq) this.f2534b).f2586a.getCustomParams();
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

    private static String b(boolean z) {
        if (z) {
            return "distance";
        }
        return "weight";
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
        gt.b bVar = new gt.b();
        if (this.l) {
            gv gvVarF = f();
            double dA = gvVarF != null ? gvVarF.a() : 0.0d;
            bVar.f2596a = getURL() + a(false) + Constants.LANGUAGE_ASSIGN_STR + ServiceSettings.getInstance().getLanguage();
            if (((gq) this.f2534b).f2587b.getShape().equals("Bound")) {
                bVar.f2597b = new gv.a(fu.a(((gq) this.f2534b).f2587b.getCenter().getLatitude()), fu.a(((gq) this.f2534b).f2587b.getCenter().getLongitude()), dA);
            }
            return bVar;
        }
        bVar.f2596a = getURL() + c() + Constants.LANGUAGE_ASSIGN_STR + ServiceSettings.getInstance().getLanguage();
        return bVar;
    }
}
