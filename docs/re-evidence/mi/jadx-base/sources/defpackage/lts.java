package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes4.dex */
public final class lts extends kts<RouteSearch.BusRouteQuery, BusRouteResult> {
    public lts(Context context, RouteSearch.BusRouteQuery busRouteQuery) {
        super(context, busRouteQuery);
    }

    public static BusRouteResult t(String str) throws AMapException {
        return fvs.u(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/direction/transit/integrated?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&origin=");
        stringBuffer.append(xts.d(((RouteSearch.BusRouteQuery) this.s).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(xts.d(((RouteSearch.BusRouteQuery) this.s).getFromAndTo().getTo()));
        String city = ((RouteSearch.BusRouteQuery) this.s).getCity();
        if (!fvs.s0(city)) {
            city = kts.b(city);
            stringBuffer.append("&city=");
            stringBuffer.append(city);
        }
        if (!fvs.s0(((RouteSearch.BusRouteQuery) this.s).getCity())) {
            String strB = kts.b(city);
            stringBuffer.append("&cityd=");
            stringBuffer.append(strB);
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.BusRouteQuery) this.s).getMode());
        stringBuffer.append(sb.toString());
        stringBuffer.append("&nightflag=");
        stringBuffer.append(((RouteSearch.BusRouteQuery) this.s).getNightFlag());
        if (TextUtils.isEmpty(((RouteSearch.BusRouteQuery) this.s).getExtensions())) {
            stringBuffer.append("&extensions=base");
        } else {
            stringBuffer.append("&extensions=");
            stringBuffer.append(((RouteSearch.BusRouteQuery) this.s).getExtensions());
        }
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }
}
