package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;

/* JADX INFO: loaded from: classes21.dex */
public final class fz extends fm<RouteSearchV2.DriveRouteQuery, DriveRouteResultV2> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fz(Context context, RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        super(context, driveRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        if (((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo() != null) {
            stringBuffer.append("&origin=").append(fu.a(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getFrom()));
            if (!gc.i(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&origin_id=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=").append(fu.a(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getTo()));
            if (!gc.i(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destination_id=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getDestinationPoiID());
            }
            if (!gc.i(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origin_type=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getOriginType());
            }
            if (!gc.i(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&plate=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getFromAndTo().getPlateNumber());
            }
        }
        StringBuffer stringBufferAppend = stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getMode().getValue());
        stringBufferAppend.append(sb.toString());
        stringBuffer.append("&show_fields=").append(fu.a(((RouteSearchV2.DriveRouteQuery) this.f2534b).getShowFields()));
        RouteSearchV2.NewEnergy newEnergy = ((RouteSearchV2.DriveRouteQuery) this.f2534b).getNewEnergy();
        if (newEnergy != null) {
            stringBuffer.append(newEnergy.buildParam());
            stringBuffer.append("&force_new_version=true");
        }
        stringBuffer.append("&ferry=").append(!((RouteSearchV2.DriveRouteQuery) this.f2534b).isUseFerry() ? 1 : 0);
        StringBuffer stringBufferAppend2 = stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getCarType());
        stringBufferAppend2.append(sb2.toString());
        if (((RouteSearchV2.DriveRouteQuery) this.f2534b).hasPassPoint()) {
            stringBuffer.append("&waypoints=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getPassedPointStr());
        }
        if (((RouteSearchV2.DriveRouteQuery) this.f2534b).hasAvoidpolygons()) {
            stringBuffer.append("&avoidpolygons=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getAvoidpolygonsStr());
        }
        if (((RouteSearchV2.DriveRouteQuery) this.f2534b).hasAvoidRoad()) {
            stringBuffer.append("&avoidroad=").append(b(((RouteSearchV2.DriveRouteQuery) this.f2534b).getAvoidRoad()));
        }
        stringBuffer.append("&output=json&geometry=false");
        if (((RouteSearchV2.DriveRouteQuery) this.f2534b).getExclude() != null) {
            stringBuffer.append("&exclude=").append(((RouteSearchV2.DriveRouteQuery) this.f2534b).getExclude());
        }
        return stringBuffer.toString();
    }

    private static DriveRouteResultV2 c(String str) throws AMapException {
        return gc.d(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.c() + "/direction/driving?";
    }
}
