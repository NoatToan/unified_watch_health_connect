package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes4.dex */
public final class gus extends kts<RouteSearch.DriveRouteQuery, DriveRouteResult> {
    public gus(Context context, RouteSearch.DriveRouteQuery driveRouteQuery) {
        super(context, driveRouteQuery);
    }

    public static DriveRouteResult t(String str) throws AMapException {
        return fvs.T(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/direction/driving?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        if (((RouteSearch.DriveRouteQuery) this.s).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(xts.d(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getFrom()));
            if (!fvs.s0(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(xts.d(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getTo()));
            if (!fvs.s0(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getDestinationPoiID());
            }
            if (!fvs.s0(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getOriginType());
            }
            if (!fvs.s0(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getDestinationType());
            }
            if (!fvs.s0(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getPlateProvince());
            }
            if (!fvs.s0(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.DriveRouteQuery) this.s).getMode());
        stringBuffer.append(sb.toString());
        if (TextUtils.isEmpty(((RouteSearch.DriveRouteQuery) this.s).getExtensions())) {
            stringBuffer.append("&extensions=base");
        } else {
            stringBuffer.append("&extensions=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getExtensions());
        }
        stringBuffer.append("&ferry=");
        stringBuffer.append(!((RouteSearch.DriveRouteQuery) this.s).isUseFerry() ? 1 : 0);
        stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearch.DriveRouteQuery) this.s).getCarType());
        stringBuffer.append(sb2.toString());
        if (((RouteSearch.DriveRouteQuery) this.s).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getPassedPointStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.s).hasAvoidpolygons()) {
            stringBuffer.append("&avoidpolygons=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getAvoidpolygonsStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.s).hasAvoidRoad()) {
            stringBuffer.append("&avoidroad=");
            stringBuffer.append(kts.b(((RouteSearch.DriveRouteQuery) this.s).getAvoidRoad()));
        }
        stringBuffer.append("&output=json");
        stringBuffer.append("&geometry=false");
        if (((RouteSearch.DriveRouteQuery) this.s).getExclude() != null) {
            stringBuffer.append("&exclude=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.s).getExclude());
        }
        return stringBuffer.toString();
    }
}
