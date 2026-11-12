package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.BusRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;

/* JADX INFO: loaded from: classes21.dex */
public final class fo extends fm<RouteSearchV2.BusRouteQuery, BusRouteResultV2> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fo(Context context, RouteSearchV2.BusRouteQuery busRouteQuery) {
        super(context, busRouteQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        stringBuffer.append("&origin=").append(fu.a(((RouteSearchV2.BusRouteQuery) this.f2534b).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=").append(fu.a(((RouteSearchV2.BusRouteQuery) this.f2534b).getFromAndTo().getTo()));
        String city = ((RouteSearchV2.BusRouteQuery) this.f2534b).getCity();
        if (!gc.i(city)) {
            city = b(city);
            stringBuffer.append("&city1=").append(city);
        }
        if (!gc.i(((RouteSearchV2.BusRouteQuery) this.f2534b).getCity())) {
            stringBuffer.append("&city2=").append(b(city));
        }
        StringBuffer stringBufferAppend = stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearchV2.BusRouteQuery) this.f2534b).getMode());
        stringBufferAppend.append(sb.toString());
        stringBuffer.append("&nightflag=").append(((RouteSearchV2.BusRouteQuery) this.f2534b).getNightFlag());
        stringBuffer.append("&show_fields=").append(fu.a(((RouteSearchV2.BusRouteQuery) this.f2534b).getShowFields()));
        String originPoiId = ((RouteSearchV2.BusRouteQuery) this.f2534b).getOriginPoiId();
        if (!TextUtils.isEmpty(originPoiId)) {
            stringBuffer.append("&originpoi=").append(originPoiId);
        }
        String destinationPoiId = ((RouteSearchV2.BusRouteQuery) this.f2534b).getDestinationPoiId();
        if (!TextUtils.isEmpty(destinationPoiId)) {
            stringBuffer.append("&destinationpoi=").append(destinationPoiId);
        }
        String ad1 = ((RouteSearchV2.BusRouteQuery) this.f2534b).getAd1();
        if (!TextUtils.isEmpty(ad1)) {
            stringBuffer.append("&ad1=").append(ad1);
        }
        String ad2 = ((RouteSearchV2.BusRouteQuery) this.f2534b).getAd2();
        if (!TextUtils.isEmpty(ad2)) {
            stringBuffer.append("&ad2=").append(ad2);
        }
        String date = ((RouteSearchV2.BusRouteQuery) this.f2534b).getDate();
        if (!TextUtils.isEmpty(date)) {
            stringBuffer.append("&date=").append(date);
        }
        String time = ((RouteSearchV2.BusRouteQuery) this.f2534b).getTime();
        if (!TextUtils.isEmpty(time)) {
            stringBuffer.append("&time=").append(time);
        }
        stringBuffer.append("&AlternativeRoute=").append(((RouteSearchV2.BusRouteQuery) this.f2534b).getAlternativeRoute());
        stringBuffer.append("&multiexport=").append(((RouteSearchV2.BusRouteQuery) this.f2534b).getMultiExport());
        stringBuffer.append("&max_trans=").append(((RouteSearchV2.BusRouteQuery) this.f2534b).getMaxTrans());
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    private static BusRouteResultV2 c(String str) throws AMapException {
        return gc.b(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.c() + "/direction/transit/integrated?";
    }
}
