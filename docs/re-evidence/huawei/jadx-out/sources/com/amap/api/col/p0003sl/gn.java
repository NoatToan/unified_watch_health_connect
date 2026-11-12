package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.poisearch.PoiResultV2;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gn extends gj<gr, PoiResultV2> {
    private int k;
    private boolean l;

    public gn(Context context, gr grVar) {
        super(context, grVar);
        this.k = 0;
        this.l = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = ft.c() + "/place";
        if (((gr) this.f2534b).f2589b == null) {
            return str + "/text?";
        }
        if (((gr) this.f2534b).f2589b.getShape().equals("Bound")) {
            String str2 = str + "/around?";
            this.l = true;
            return str2;
        }
        if (!((gr) this.f2534b).f2589b.getShape().equals("Rectangle") && !((gr) this.f2534b).f2589b.getShape().equals("Polygon")) {
            return str;
        }
        return str + "/polygon?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public PoiResultV2 a(String str) throws AMapException {
        ArrayList<PoiItemV2> arrayList = new ArrayList<>();
        if (str == null) {
            return PoiResultV2.createPagedResult(((gr) this.f2534b).f2588a, ((gr) this.f2534b).f2589b, this.k, arrayList);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.k = jSONObject.optInt("count");
            arrayList = gc.d(jSONObject);
        } catch (JSONException e) {
            fu.a(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            fu.a(e2, "PoiSearchKeywordHandler", "paseJSONException");
        }
        return PoiResultV2.createPagedResult(((gr) this.f2534b).f2588a, ((gr) this.f2534b).f2589b, this.k, arrayList);
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        return a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(boolean z) {
        List<LatLonPoint> polyGonList;
        StringBuilder sb = new StringBuilder("output=json");
        if (((gr) this.f2534b).f2589b != null) {
            if (((gr) this.f2534b).f2589b.getShape().equals("Bound")) {
                if (z) {
                    double dA = fu.a(((gr) this.f2534b).f2589b.getCenter().getLongitude());
                    double dA2 = fu.a(((gr) this.f2534b).f2589b.getCenter().getLatitude());
                    sb.append("&location=");
                    sb.append(dA + "," + dA2);
                }
                sb.append("&radius=");
                sb.append(((gr) this.f2534b).f2589b.getRange());
                sb.append("&sortrule=");
                sb.append(b(((gr) this.f2534b).f2589b.isDistanceSort()));
            } else if (((gr) this.f2534b).f2589b.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((gr) this.f2534b).f2589b.getLowerLeft();
                LatLonPoint upperRight = ((gr) this.f2534b).f2589b.getUpperRight();
                double dA3 = fu.a(lowerLeft.getLatitude());
                double dA4 = fu.a(lowerLeft.getLongitude());
                double dA5 = fu.a(upperRight.getLatitude());
                sb.append("&polygon=" + dA4 + "," + dA3 + ";" + fu.a(upperRight.getLongitude()) + "," + dA5);
            } else if (((gr) this.f2534b).f2589b.getShape().equals("Polygon") && (polyGonList = ((gr) this.f2534b).f2589b.getPolyGonList()) != null && polyGonList.size() > 0) {
                sb.append("&polygon=" + fu.a(polyGonList));
            }
        }
        String city = ((gr) this.f2534b).f2588a.getCity();
        if (!c(city)) {
            String strB = b(city);
            sb.append("&region=");
            sb.append(strB);
        }
        String strB2 = b(((gr) this.f2534b).f2588a.getQueryString());
        if (!c(strB2)) {
            sb.append("&keywords=");
            sb.append(strB2);
        }
        sb.append("&page_size=");
        sb.append(((gr) this.f2534b).f2588a.getPageSize());
        sb.append("&page_num=");
        sb.append(((gr) this.f2534b).f2588a.getPageNum());
        String building = ((gr) this.f2534b).f2588a.getBuilding();
        if (building != null && building.trim().length() > 0) {
            sb.append("&building=");
            sb.append(((gr) this.f2534b).f2588a.getBuilding());
        }
        String strB3 = b(((gr) this.f2534b).f2588a.getCategory());
        if (!c(strB3)) {
            sb.append("&types=");
            sb.append(strB3);
        }
        String strA = a(((gr) this.f2534b).f2588a.getShowFields());
        if (strA != null) {
            sb.append("&show_fields=");
            sb.append(strA);
        }
        sb.append("&key=");
        sb.append(il.f(this.i));
        if (((gr) this.f2534b).f2588a.getCityLimit()) {
            sb.append("&citylimit=true");
        } else {
            sb.append("&citylimit=false");
        }
        if (this.l) {
            if (((gr) this.f2534b).f2588a.isSpecial()) {
                sb.append("&special=1");
            } else {
                sb.append("&special=0");
            }
        }
        String channel = ((gr) this.f2534b).f2588a.getChannel();
        if (!TextUtils.isEmpty(channel)) {
            sb.append("&channel=");
            sb.append(channel);
        }
        String premium = ((gr) this.f2534b).f2588a.getPremium();
        if (!TextUtils.isEmpty(premium)) {
            sb.append("&permium=");
            sb.append(premium);
        }
        if (((gr) this.f2534b).f2589b == null && ((gr) this.f2534b).f2588a.getLocation() != null) {
            sb.append("&sortrule=");
            sb.append(b(((gr) this.f2534b).f2588a.isDistanceSort()));
            double dA6 = fu.a(((gr) this.f2534b).f2588a.getLocation().getLongitude());
            double dA7 = fu.a(((gr) this.f2534b).f2588a.getLocation().getLatitude());
            sb.append("&location=");
            sb.append(dA6 + "," + dA7);
        }
        Map<String, String> customParams = ((gr) this.f2534b).f2588a.getCustomParams();
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
            if (((gr) this.f2534b).f2589b.getShape().equals("Bound")) {
                bVar.f2597b = new gv.a(fu.a(((gr) this.f2534b).f2589b.getCenter().getLatitude()), fu.a(((gr) this.f2534b).f2589b.getCenter().getLongitude()), dA);
            }
            return bVar;
        }
        bVar.f2596a = getURL() + c() + Constants.LANGUAGE_ASSIGN_STR + ServiceSettings.getInstance().getLanguage();
        return bVar;
    }
}
