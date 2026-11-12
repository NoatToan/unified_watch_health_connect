package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkRouteResult;

/* JADX INFO: loaded from: classes21.dex */
public final class hg extends fm<RouteSearch.WalkRouteQuery, WalkRouteResult> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public hg(Context context, RouteSearch.WalkRouteQuery walkRouteQuery) {
        super(context, walkRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        stringBuffer.append("&origin=").append(fu.a(((RouteSearch.WalkRouteQuery) this.f2534b).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=").append(fu.a(((RouteSearch.WalkRouteQuery) this.f2534b).getFromAndTo().getTo()));
        stringBuffer.append("&multipath=0&output=json&geometry=false");
        if (!TextUtils.isEmpty(((RouteSearch.WalkRouteQuery) this.f2534b).getExtensions())) {
            stringBuffer.append("&extensions=").append(((RouteSearch.WalkRouteQuery) this.f2534b).getExtensions());
        } else {
            stringBuffer.append("&extensions=base");
        }
        return stringBuffer.toString();
    }

    private static WalkRouteResult c(String str) throws AMapException {
        return gc.e(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/direction/walking?";
    }
}
