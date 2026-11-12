package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;

/* JADX INFO: loaded from: classes21.dex */
public final class hf extends fm<RouteSearch.TruckRouteQuery, TruckRouteRestult> {
    private final String k;
    private final String l;
    private final String m;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public hf(Context context, RouteSearch.TruckRouteQuery truckRouteQuery) {
        super(context, truckRouteQuery);
        this.k = "/direction/truck?";
        this.l = "|";
        this.m = ",";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        if (((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo() != null) {
            stringBuffer.append("&origin=").append(fu.a(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getFrom()));
            if (!gc.i(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=").append(fu.a(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getTo()));
            if (!gc.i(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getDestinationPoiID());
            }
            if (!gc.i(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getOriginType());
            }
            if (!gc.i(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getDestinationType());
            }
            if (!gc.i(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getPlateProvince());
            }
            if (!gc.i(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getMode());
        if (((RouteSearch.TruckRouteQuery) this.f2534b).hasPassPoint()) {
            stringBuffer.append("&waypoints=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getPassedPointStr());
        }
        stringBuffer.append("&size=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getTruckSize());
        stringBuffer.append("&height=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getTruckHeight());
        stringBuffer.append("&width=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getTruckWidth());
        stringBuffer.append("&load=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getTruckLoad());
        stringBuffer.append("&weight=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getTruckWeight());
        stringBuffer.append("&axis=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getTruckAxis());
        if (!TextUtils.isEmpty(((RouteSearch.TruckRouteQuery) this.f2534b).getExtensions())) {
            stringBuffer.append("&extensions=").append(((RouteSearch.TruckRouteQuery) this.f2534b).getExtensions());
        } else {
            stringBuffer.append("&extensions=base");
        }
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    private static TruckRouteRestult c(String str) throws AMapException {
        return gc.m(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.b() + "/direction/truck?";
    }
}
