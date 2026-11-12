package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.RouteSearch;

/* JADX INFO: loaded from: classes4.dex */
public final class dus extends kts<RouteSearch.DrivePlanQuery, DriveRoutePlanResult> {
    public dus(Context context, RouteSearch.DrivePlanQuery drivePlanQuery) {
        super(context, drivePlanQuery);
    }

    public static DriveRoutePlanResult t(String str) throws AMapException {
        return fvs.C0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.c() + "/etd/driving?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        if (((RouteSearch.DrivePlanQuery) this.s).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(xts.d(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getFrom()));
            if (!fvs.s0(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(xts.d(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getTo()));
            if (!fvs.s0(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getDestinationPoiID());
            }
            if (!fvs.s0(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getOriginType());
            }
            if (!fvs.s0(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getDestinationType());
            }
            if (!fvs.s0(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getPlateProvince());
            }
            if (!fvs.s0(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getFromAndTo().getPlateNumber());
            }
        }
        if (((RouteSearch.DrivePlanQuery) this.s).getDestParentPoiID() != null) {
            stringBuffer.append("&parentid=");
            stringBuffer.append(((RouteSearch.DrivePlanQuery) this.s).getDestParentPoiID());
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.DrivePlanQuery) this.s).getMode());
        stringBuffer.append(sb.toString());
        stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearch.DrivePlanQuery) this.s).getCarType());
        stringBuffer.append(sb2.toString());
        stringBuffer.append("&firsttime=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((RouteSearch.DrivePlanQuery) this.s).getFirstTime());
        stringBuffer.append(sb3.toString());
        stringBuffer.append("&interval=");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(((RouteSearch.DrivePlanQuery) this.s).getInterval());
        stringBuffer.append(sb4.toString());
        stringBuffer.append("&count=");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(((RouteSearch.DrivePlanQuery) this.s).getCount());
        stringBuffer.append(sb5.toString());
        return stringBuffer.toString();
    }
}
