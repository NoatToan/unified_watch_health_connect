package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.BusRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;

/* JADX INFO: loaded from: classes4.dex */
public final class nts extends kts<RouteSearchV2.BusRouteQuery, BusRouteResultV2> {
    public nts(Context context, RouteSearchV2.BusRouteQuery busRouteQuery) {
        super(context, busRouteQuery);
    }

    public static BusRouteResultV2 t(String str) throws AMapException {
        return fvs.L(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.d() + "/direction/transit/integrated?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&origin=");
        stringBuffer.append(xts.d(((RouteSearchV2.BusRouteQuery) this.s).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(xts.d(((RouteSearchV2.BusRouteQuery) this.s).getFromAndTo().getTo()));
        String city = ((RouteSearchV2.BusRouteQuery) this.s).getCity();
        if (!fvs.s0(city)) {
            city = kts.b(city);
            stringBuffer.append("&city1=");
            stringBuffer.append(city);
        }
        if (!fvs.s0(((RouteSearchV2.BusRouteQuery) this.s).getCity())) {
            String strB = kts.b(city);
            stringBuffer.append("&city2=");
            stringBuffer.append(strB);
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearchV2.BusRouteQuery) this.s).getMode());
        stringBuffer.append(sb.toString());
        stringBuffer.append("&nightflag=");
        stringBuffer.append(((RouteSearchV2.BusRouteQuery) this.s).getNightFlag());
        stringBuffer.append("&show_fields=");
        stringBuffer.append(xts.c(((RouteSearchV2.BusRouteQuery) this.s).getShowFields()));
        String originPoiId = ((RouteSearchV2.BusRouteQuery) this.s).getOriginPoiId();
        if (!TextUtils.isEmpty(originPoiId)) {
            stringBuffer.append("&originpoi=");
            stringBuffer.append(originPoiId);
        }
        String destinationPoiId = ((RouteSearchV2.BusRouteQuery) this.s).getDestinationPoiId();
        if (!TextUtils.isEmpty(destinationPoiId)) {
            stringBuffer.append("&destinationpoi=");
            stringBuffer.append(destinationPoiId);
        }
        String ad1 = ((RouteSearchV2.BusRouteQuery) this.s).getAd1();
        if (!TextUtils.isEmpty(ad1)) {
            stringBuffer.append("&ad1=");
            stringBuffer.append(ad1);
        }
        String ad2 = ((RouteSearchV2.BusRouteQuery) this.s).getAd2();
        if (!TextUtils.isEmpty(ad2)) {
            stringBuffer.append("&ad2=");
            stringBuffer.append(ad2);
        }
        String date = ((RouteSearchV2.BusRouteQuery) this.s).getDate();
        if (!TextUtils.isEmpty(date)) {
            stringBuffer.append("&date=");
            stringBuffer.append(date);
        }
        String time = ((RouteSearchV2.BusRouteQuery) this.s).getTime();
        if (!TextUtils.isEmpty(time)) {
            stringBuffer.append("&time=");
            stringBuffer.append(time);
        }
        stringBuffer.append("&AlternativeRoute=");
        stringBuffer.append(((RouteSearchV2.BusRouteQuery) this.s).getAlternativeRoute());
        stringBuffer.append("&multiexport=");
        stringBuffer.append(((RouteSearchV2.BusRouteQuery) this.s).getMultiExport());
        stringBuffer.append("&max_trans=");
        stringBuffer.append(((RouteSearchV2.BusRouteQuery) this.s).getMaxTrans());
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }
}
