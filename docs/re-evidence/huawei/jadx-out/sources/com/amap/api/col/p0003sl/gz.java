package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RideRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;

/* JADX INFO: loaded from: classes21.dex */
public final class gz extends fm<RouteSearchV2.RideRouteQuery, RideRouteResultV2> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public gz(Context context, RouteSearchV2.RideRouteQuery rideRouteQuery) {
        super(context, rideRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        stringBuffer.append("&origin=").append(fu.a(((RouteSearchV2.RideRouteQuery) this.f2534b).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=").append(fu.a(((RouteSearchV2.RideRouteQuery) this.f2534b).getFromAndTo().getTo()));
        stringBuffer.append("&alternative_route=").append(((RouteSearchV2.RideRouteQuery) this.f2534b).getAlternativeRoute());
        stringBuffer.append("&output=json&show_fields=");
        stringBuffer.append(fu.a(((RouteSearchV2.RideRouteQuery) this.f2534b).getShowFields()));
        return stringBuffer.toString();
    }

    private static RideRouteResultV2 c(String str) throws AMapException {
        return gc.k(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.c() + "/direction/bicycling?";
    }
}
