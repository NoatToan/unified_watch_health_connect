package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes21.dex */
public final class fy extends fm<RouteSearch.DriveRouteQuery, DriveRouteResult> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fy(Context context, RouteSearch.DriveRouteQuery driveRouteQuery) {
        super(context, driveRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        if (((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo() != null) {
            stringBuffer.append("&origin=").append(fu.a(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getFrom()));
            if (!gc.i(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=").append(fu.a(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getTo()));
            if (!gc.i(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getDestinationPoiID());
            }
            if (!gc.i(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getOriginType());
            }
            if (!gc.i(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getDestinationType());
            }
            if (!gc.i(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getPlateProvince());
            }
            if (!gc.i(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getFromAndTo().getPlateNumber());
            }
        }
        StringBuffer stringBufferAppend = stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.DriveRouteQuery) this.f2534b).getMode());
        stringBufferAppend.append(sb.toString());
        if (!TextUtils.isEmpty(((RouteSearch.DriveRouteQuery) this.f2534b).getExtensions())) {
            stringBuffer.append("&extensions=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getExtensions());
        } else {
            stringBuffer.append("&extensions=base");
        }
        stringBuffer.append("&ferry=").append(!((RouteSearch.DriveRouteQuery) this.f2534b).isUseFerry() ? 1 : 0);
        StringBuffer stringBufferAppend2 = stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearch.DriveRouteQuery) this.f2534b).getCarType());
        stringBufferAppend2.append(sb2.toString());
        if (((RouteSearch.DriveRouteQuery) this.f2534b).hasPassPoint()) {
            stringBuffer.append("&waypoints=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getPassedPointStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.f2534b).hasAvoidpolygons()) {
            stringBuffer.append("&avoidpolygons=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getAvoidpolygonsStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.f2534b).hasAvoidRoad()) {
            stringBuffer.append("&avoidroad=").append(b(((RouteSearch.DriveRouteQuery) this.f2534b).getAvoidRoad()));
        }
        stringBuffer.append("&output=json&geometry=false");
        if (((RouteSearch.DriveRouteQuery) this.f2534b).getExclude() != null) {
            stringBuffer.append("&exclude=").append(((RouteSearch.DriveRouteQuery) this.f2534b).getExclude());
        }
        return stringBuffer.toString();
    }

    private static DriveRouteResult c(String str) throws AMapException {
        return gc.c(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/direction/driving?";
    }
}
