package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes4.dex */
public final class xws extends kts<RouteSearch.RideRouteQuery, RideRouteResult> {
    public xws(Context context, RouteSearch.RideRouteQuery rideRouteQuery) {
        super(context, rideRouteQuery);
    }

    public static RideRouteResult t(String str) throws AMapException {
        return fvs.t0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.c() + "/direction/bicycling?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&origin=");
        stringBuffer.append(xts.d(((RouteSearch.RideRouteQuery) this.s).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(xts.d(((RouteSearch.RideRouteQuery) this.s).getFromAndTo().getTo()));
        stringBuffer.append("&output=json");
        stringBuffer.append("&geometry=false");
        if (TextUtils.isEmpty(((RouteSearch.RideRouteQuery) this.s).getExtensions())) {
            stringBuffer.append("&extensions=base");
        } else {
            stringBuffer.append("&extensions=");
            stringBuffer.append(((RouteSearch.RideRouteQuery) this.s).getExtensions());
        }
        return stringBuffer.toString();
    }
}
