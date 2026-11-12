package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes21.dex */
public final class fx extends fm<RouteSearch.DrivePlanQuery, DriveRoutePlanResult> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fx(Context context, RouteSearch.DrivePlanQuery drivePlanQuery) {
        super(context, drivePlanQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        if (((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo() != null) {
            stringBuffer.append("&origin=").append(fu.a(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getFrom()));
            if (!gc.i(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=").append(fu.a(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getTo()));
            if (!gc.i(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getDestinationPoiID());
            }
            if (!gc.i(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getOriginType());
            }
            if (!gc.i(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getDestinationType());
            }
            if (!gc.i(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getPlateProvince());
            }
            if (!gc.i(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getFromAndTo().getPlateNumber());
            }
        }
        if (((RouteSearch.DrivePlanQuery) this.f2534b).getDestParentPoiID() != null) {
            stringBuffer.append("&parentid=").append(((RouteSearch.DrivePlanQuery) this.f2534b).getDestParentPoiID());
        }
        StringBuffer stringBufferAppend = stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.DrivePlanQuery) this.f2534b).getMode());
        stringBufferAppend.append(sb.toString());
        StringBuffer stringBufferAppend2 = stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearch.DrivePlanQuery) this.f2534b).getCarType());
        stringBufferAppend2.append(sb2.toString());
        StringBuffer stringBufferAppend3 = stringBuffer.append("&firsttime=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((RouteSearch.DrivePlanQuery) this.f2534b).getFirstTime());
        stringBufferAppend3.append(sb3.toString());
        StringBuffer stringBufferAppend4 = stringBuffer.append("&interval=");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(((RouteSearch.DrivePlanQuery) this.f2534b).getInterval());
        stringBufferAppend4.append(sb4.toString());
        StringBuffer stringBufferAppend5 = stringBuffer.append("&count=");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(((RouteSearch.DrivePlanQuery) this.f2534b).getCount());
        stringBufferAppend5.append(sb5.toString());
        return stringBuffer.toString();
    }

    private static DriveRoutePlanResult c(String str) throws AMapException {
        return gc.n(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.b() + "/etd/driving?";
    }
}
