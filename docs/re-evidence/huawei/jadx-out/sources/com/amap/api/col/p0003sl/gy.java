package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes21.dex */
public final class gy extends fm<RouteSearch.RideRouteQuery, RideRouteResult> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public gy(Context context, RouteSearch.RideRouteQuery rideRouteQuery) {
        super(context, rideRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        stringBuffer.append("&origin=").append(fu.a(((RouteSearch.RideRouteQuery) this.f2534b).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=").append(fu.a(((RouteSearch.RideRouteQuery) this.f2534b).getFromAndTo().getTo()));
        stringBuffer.append("&output=json&geometry=false");
        if (!TextUtils.isEmpty(((RouteSearch.RideRouteQuery) this.f2534b).getExtensions())) {
            stringBuffer.append("&extensions=").append(((RouteSearch.RideRouteQuery) this.f2534b).getExtensions());
        } else {
            stringBuffer.append("&extensions=base");
        }
        return stringBuffer.toString();
    }

    private static RideRouteResult c(String str) throws AMapException {
        return gc.j(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.b() + "/direction/bicycling?";
    }
}
