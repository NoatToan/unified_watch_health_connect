package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkRouteResult;

/* JADX INFO: loaded from: classes4.dex */
public final class eys extends kts<RouteSearch.WalkRouteQuery, WalkRouteResult> {
    public eys(Context context, RouteSearch.WalkRouteQuery walkRouteQuery) {
        super(context, walkRouteQuery);
    }

    public static WalkRouteResult t(String str) throws AMapException {
        return fvs.f0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/direction/walking?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&origin=");
        stringBuffer.append(xts.d(((RouteSearch.WalkRouteQuery) this.s).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(xts.d(((RouteSearch.WalkRouteQuery) this.s).getFromAndTo().getTo()));
        stringBuffer.append("&multipath=0");
        stringBuffer.append("&output=json");
        stringBuffer.append("&geometry=false");
        if (TextUtils.isEmpty(((RouteSearch.WalkRouteQuery) this.s).getExtensions())) {
            stringBuffer.append("&extensions=base");
        } else {
            stringBuffer.append("&extensions=");
            stringBuffer.append(((RouteSearch.WalkRouteQuery) this.s).getExtensions());
        }
        return stringBuffer.toString();
    }
}
