package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;

/* JADX INFO: loaded from: classes4.dex */
public final class cys extends kts<RouteSearch.TruckRouteQuery, TruckRouteRestult> {
    public final String A;
    public final String y;
    public final String z;

    public cys(Context context, RouteSearch.TruckRouteQuery truckRouteQuery) {
        super(context, truckRouteQuery);
        this.y = "/direction/truck?";
        this.z = "|";
        this.A = ",";
    }

    public static TruckRouteRestult t(String str) throws AMapException {
        return fvs.A0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.c() + "/direction/truck?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        if (((RouteSearch.TruckRouteQuery) this.s).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(xts.d(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getFrom()));
            if (!fvs.s0(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(xts.d(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getTo()));
            if (!fvs.s0(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getDestinationPoiID());
            }
            if (!fvs.s0(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getOriginType());
            }
            if (!fvs.s0(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getDestinationType());
            }
            if (!fvs.s0(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getPlateProvince());
            }
            if (!fvs.s0(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getMode());
        if (((RouteSearch.TruckRouteQuery) this.s).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getPassedPointStr());
        }
        stringBuffer.append("&size=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getTruckSize());
        stringBuffer.append("&height=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getTruckHeight());
        stringBuffer.append("&width=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getTruckWidth());
        stringBuffer.append("&load=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getTruckLoad());
        stringBuffer.append("&weight=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getTruckWeight());
        stringBuffer.append("&axis=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getTruckAxis());
        if (TextUtils.isEmpty(((RouteSearch.TruckRouteQuery) this.s).getExtensions())) {
            stringBuffer.append("&extensions=base");
        } else {
            stringBuffer.append("&extensions=");
            stringBuffer.append(((RouteSearch.TruckRouteQuery) this.s).getExtensions());
        }
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }
}
