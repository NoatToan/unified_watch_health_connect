package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;

/* JADX INFO: loaded from: classes4.dex */
public final class ius extends kts<RouteSearchV2.DriveRouteQuery, DriveRouteResultV2> {
    public ius(Context context, RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        super(context, driveRouteQuery);
    }

    public static DriveRouteResultV2 t(String str) throws AMapException {
        return fvs.Y(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.d() + "/direction/driving?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        if (((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(xts.d(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getFrom()));
            if (!fvs.s0(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&origin_id=");
                stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(xts.d(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getTo()));
            if (!fvs.s0(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destination_id=");
                stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getDestinationPoiID());
            }
            if (!fvs.s0(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origin_type=");
                stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getOriginType());
            }
            if (!fvs.s0(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&plate=");
                stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearchV2.DriveRouteQuery) this.s).getMode().getValue());
        stringBuffer.append(sb.toString());
        int showFields = ((RouteSearchV2.DriveRouteQuery) this.s).getShowFields();
        stringBuffer.append("&show_fields=");
        stringBuffer.append(xts.c(showFields));
        RouteSearchV2.NewEnergy newEnergy = ((RouteSearchV2.DriveRouteQuery) this.s).getNewEnergy();
        if (newEnergy != null) {
            stringBuffer.append(newEnergy.buildParam());
            stringBuffer.append("&force_new_version=true");
        }
        stringBuffer.append("&ferry=");
        stringBuffer.append(!((RouteSearchV2.DriveRouteQuery) this.s).isUseFerry() ? 1 : 0);
        stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearchV2.DriveRouteQuery) this.s).getCarType());
        stringBuffer.append(sb2.toString());
        if (((RouteSearchV2.DriveRouteQuery) this.s).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getPassedPointStr());
        }
        if (((RouteSearchV2.DriveRouteQuery) this.s).hasAvoidpolygons()) {
            stringBuffer.append("&avoidpolygons=");
            stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getAvoidpolygonsStr());
        }
        if (((RouteSearchV2.DriveRouteQuery) this.s).hasAvoidRoad()) {
            stringBuffer.append("&avoidroad=");
            stringBuffer.append(kts.b(((RouteSearchV2.DriveRouteQuery) this.s).getAvoidRoad()));
        }
        stringBuffer.append("&output=json");
        stringBuffer.append("&geometry=false");
        if (((RouteSearchV2.DriveRouteQuery) this.s).getExclude() != null) {
            stringBuffer.append("&exclude=");
            stringBuffer.append(((RouteSearchV2.DriveRouteQuery) this.s).getExclude());
        }
        return stringBuffer.toString();
    }
}
