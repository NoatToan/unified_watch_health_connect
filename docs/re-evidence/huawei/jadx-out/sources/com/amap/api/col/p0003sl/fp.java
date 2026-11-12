package com.amap.api.col.p0003sl;

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

/* JADX INFO: loaded from: classes21.dex */
public final class fp<T> extends fm<T, Object> {
    private int k;
    private List<String> l;
    private List<SuggestionCity> m;

    public fp(Context context, T t) {
        super(context, t);
        this.k = 0;
        this.l = new ArrayList();
        this.m = new ArrayList();
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str;
        if (this.f2534b instanceof BusLineQuery) {
            if (((BusLineQuery) this.f2534b).getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
                str = "lineid";
            } else if (((BusLineQuery) this.f2534b).getCategory() != BusLineQuery.SearchType.BY_LINE_NAME) {
                str = "";
            } else {
                str = "linename";
            }
        } else {
            str = "stopname";
        }
        return ft.a() + "/bus/" + str + "?";
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final Object a(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("suggestion");
            if (jSONObjectOptJSONObject != null) {
                this.m = gc.a(jSONObjectOptJSONObject);
                this.l = gc.b(jSONObjectOptJSONObject);
            }
            this.k = jSONObject.optInt("count");
            if (this.f2534b instanceof BusLineQuery) {
                return BusLineResult.createPagedResult((BusLineQuery) this.f2534b, this.k, this.m, this.l, gc.h(jSONObject));
            }
            return BusStationResult.createPagedResult((BusStationQuery) this.f2534b, this.k, this.m, this.l, gc.g(jSONObject));
        } catch (Exception e) {
            fu.a(e, "BusSearchServerHandler", "paseJSON");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuilder sb = new StringBuilder("output=json");
        if (this.f2534b instanceof BusLineQuery) {
            BusLineQuery busLineQuery = (BusLineQuery) this.f2534b;
            if (!TextUtils.isEmpty(busLineQuery.getExtensions())) {
                sb.append("&extensions=");
                sb.append(busLineQuery.getExtensions());
            } else {
                sb.append("&extensions=base");
            }
            if (busLineQuery.getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
                sb.append("&id=");
                sb.append(b(((BusLineQuery) this.f2534b).getQueryString()));
            } else {
                String city = busLineQuery.getCity();
                if (!gc.i(city)) {
                    String strB = b(city);
                    sb.append("&city=");
                    sb.append(strB);
                }
                sb.append("&keywords=" + b(busLineQuery.getQueryString()));
                sb.append("&offset=" + busLineQuery.getPageSize());
                sb.append("&page=" + busLineQuery.getPageNumber());
            }
        } else {
            BusStationQuery busStationQuery = (BusStationQuery) this.f2534b;
            String city2 = busStationQuery.getCity();
            if (!gc.i(city2)) {
                String strB2 = b(city2);
                sb.append("&city=");
                sb.append(strB2);
            }
            sb.append("&keywords=" + b(busStationQuery.getQueryString()));
            sb.append("&offset=" + busStationQuery.getPageSize());
            sb.append("&page=" + busStationQuery.getPageNumber());
        }
        sb.append("&key=" + il.f(this.i));
        return sb.toString();
    }
}
