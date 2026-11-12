package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearchV2;
import com.amap.api.services.route.WalkRouteResultV2;

/* JADX INFO: loaded from: classes4.dex */
public final class gys extends kts<RouteSearchV2.WalkRouteQuery, WalkRouteResultV2> {
    public gys(Context context, RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        super(context, walkRouteQuery);
    }

    public static WalkRouteResultV2 t(String str) throws AMapException {
        return fvs.j0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.d() + "/direction/walking?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&origin=");
        stringBuffer.append(xts.d(((RouteSearchV2.WalkRouteQuery) this.s).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(xts.d(((RouteSearchV2.WalkRouteQuery) this.s).getFromAndTo().getTo()));
        stringBuffer.append("&output=json");
        stringBuffer.append("&isindoor=");
        stringBuffer.append(((RouteSearchV2.WalkRouteQuery) this.s).isIndoor() ? 1 : 0);
        stringBuffer.append("&alternative_route=");
        stringBuffer.append(((RouteSearchV2.WalkRouteQuery) this.s).getAlternativeRoute());
        stringBuffer.append("&show_fields=");
        stringBuffer.append(xts.c(((RouteSearchV2.WalkRouteQuery) this.s).getShowFields()));
        return stringBuffer.toString();
    }
}
