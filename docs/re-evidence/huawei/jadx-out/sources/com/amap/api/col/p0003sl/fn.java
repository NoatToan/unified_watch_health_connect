package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes21.dex */
public final class fn extends fm<RouteSearch.BusRouteQuery, BusRouteResult> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fn(Context context, RouteSearch.BusRouteQuery busRouteQuery) {
        super(context, busRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        stringBuffer.append("&origin=").append(fu.a(((RouteSearch.BusRouteQuery) this.f2534b).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=").append(fu.a(((RouteSearch.BusRouteQuery) this.f2534b).getFromAndTo().getTo()));
        String city = ((RouteSearch.BusRouteQuery) this.f2534b).getCity();
        if (!gc.i(city)) {
            city = b(city);
            stringBuffer.append("&city=").append(city);
        }
        if (!gc.i(((RouteSearch.BusRouteQuery) this.f2534b).getCity())) {
            stringBuffer.append("&cityd=").append(b(city));
        }
        StringBuffer stringBufferAppend = stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.BusRouteQuery) this.f2534b).getMode());
        stringBufferAppend.append(sb.toString());
        stringBuffer.append("&nightflag=").append(((RouteSearch.BusRouteQuery) this.f2534b).getNightFlag());
        if (!TextUtils.isEmpty(((RouteSearch.BusRouteQuery) this.f2534b).getExtensions())) {
            stringBuffer.append("&extensions=").append(((RouteSearch.BusRouteQuery) this.f2534b).getExtensions());
        } else {
            stringBuffer.append("&extensions=base");
        }
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    private static BusRouteResult c(String str) throws AMapException {
        return gc.a(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/direction/transit/integrated?";
    }
}
