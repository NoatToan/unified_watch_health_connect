package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RideRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;

/* JADX INFO: loaded from: classes4.dex */
public final class zws extends kts<RouteSearchV2.RideRouteQuery, RideRouteResultV2> {
    public zws(Context context, RouteSearchV2.RideRouteQuery rideRouteQuery) {
        super(context, rideRouteQuery);
    }

    public static RideRouteResultV2 t(String str) throws AMapException {
        return fvs.v0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.d() + "/direction/bicycling?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&origin=");
        stringBuffer.append(xts.d(((RouteSearchV2.RideRouteQuery) this.s).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(xts.d(((RouteSearchV2.RideRouteQuery) this.s).getFromAndTo().getTo()));
        stringBuffer.append("&alternative_route=");
        stringBuffer.append(((RouteSearchV2.RideRouteQuery) this.s).getAlternativeRoute());
        stringBuffer.append("&output=json");
        stringBuffer.append("&show_fields=");
        stringBuffer.append(xts.c(((RouteSearchV2.RideRouteQuery) this.s).getShowFields()));
        return stringBuffer.toString();
    }
}
