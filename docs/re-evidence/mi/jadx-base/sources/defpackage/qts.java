package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class qts<T> extends kts<T, Object> {
    public List<SuggestionCity> A;
    public int y;
    public List<String> z;

    public qts(Context context, T t) {
        super(context, t);
        this.y = 0;
        this.z = new ArrayList();
        this.A = new ArrayList();
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final Object e(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("suggestion");
            if (jSONObjectOptJSONObject != null) {
                this.A = fvs.w(jSONObjectOptJSONObject);
                this.z = fvs.M(jSONObjectOptJSONObject);
            }
            this.y = jSONObject.optInt("count");
            if (this.s instanceof BusLineQuery) {
                return BusLineResult.createPagedResult((BusLineQuery) this.s, this.y, this.A, this.z, fvs.p0(jSONObject));
            }
            return BusStationResult.createPagedResult((BusStationQuery) this.s, this.y, this.A, this.z, fvs.m0(jSONObject));
        } catch (Exception e) {
            xts.i(e, "BusSearchServerHandler", "paseJSON");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str;
        T t = this.s;
        if (!(t instanceof BusLineQuery)) {
            str = "stopname";
        } else if (((BusLineQuery) t).getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
            str = "lineid";
        } else {
            str = ((BusLineQuery) this.s).getCategory() == BusLineQuery.SearchType.BY_LINE_NAME ? "linename" : "";
        }
        return wts.b() + "/bus/" + str + "?";
    }

    @Override // defpackage.kts
    public final String q() {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        T t = this.s;
        if (t instanceof BusLineQuery) {
            BusLineQuery busLineQuery = (BusLineQuery) t;
            if (TextUtils.isEmpty(busLineQuery.getExtensions())) {
                sb.append("&extensions=base");
            } else {
                sb.append("&extensions=");
                sb.append(busLineQuery.getExtensions());
            }
            if (busLineQuery.getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
                sb.append("&id=");
                sb.append(kts.b(((BusLineQuery) this.s).getQueryString()));
            } else {
                String city = busLineQuery.getCity();
                if (!fvs.s0(city)) {
                    String strB = kts.b(city);
                    sb.append("&city=");
                    sb.append(strB);
                }
                sb.append("&keywords=" + kts.b(busLineQuery.getQueryString()));
                sb.append("&offset=" + busLineQuery.getPageSize());
                sb.append("&page=" + busLineQuery.getPageNumber());
            }
        } else {
            BusStationQuery busStationQuery = (BusStationQuery) t;
            String city2 = busStationQuery.getCity();
            if (!fvs.s0(city2)) {
                String strB2 = kts.b(city2);
                sb.append("&city=");
                sb.append(strB2);
            }
            sb.append("&keywords=" + kts.b(busStationQuery.getQueryString()));
            sb.append("&offset=" + busStationQuery.getPageSize());
            sb.append("&page=" + busStationQuery.getPageNumber());
        }
        sb.append("&key=" + e0t.k(this.v));
        return sb.toString();
    }
}
