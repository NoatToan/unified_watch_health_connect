package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearchV2;
import com.amap.api.services.route.WalkRouteResultV2;

/* JADX INFO: loaded from: classes21.dex */
public final class hh extends fm<RouteSearchV2.WalkRouteQuery, WalkRouteResultV2> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public hh(Context context, RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        super(context, walkRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        stringBuffer.append("&origin=").append(fu.a(((RouteSearchV2.WalkRouteQuery) this.f2534b).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=").append(fu.a(((RouteSearchV2.WalkRouteQuery) this.f2534b).getFromAndTo().getTo()));
        stringBuffer.append("&output=json&isindoor=");
        stringBuffer.append(((RouteSearchV2.WalkRouteQuery) this.f2534b).isIndoor() ? 1 : 0);
        stringBuffer.append("&alternative_route=").append(((RouteSearchV2.WalkRouteQuery) this.f2534b).getAlternativeRoute());
        stringBuffer.append("&show_fields=").append(fu.a(((RouteSearchV2.WalkRouteQuery) this.f2534b).getShowFields()));
        return stringBuffer.toString();
    }

    private static WalkRouteResultV2 c(String str) throws AMapException {
        return gc.f(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.c() + "/direction/walking?";
    }
}
