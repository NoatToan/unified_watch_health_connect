package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yts extends kts<DistanceSearch.DistanceQuery, DistanceResult> {
    public final String A;
    public final String y;
    public final String z;

    public yts(Context context, DistanceSearch.DistanceQuery distanceQuery) {
        super(context, distanceQuery);
        this.y = "/distance?";
        this.z = "|";
        this.A = ",";
    }

    public static DistanceResult t(String str) throws AMapException {
        return fvs.y0(str);
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/distance?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        List<LatLonPoint> origins = ((DistanceSearch.DistanceQuery) this.s).getOrigins();
        if (origins != null && origins.size() > 0) {
            stringBuffer.append("&origins=");
            int size = origins.size();
            for (int i = 0; i < size; i++) {
                LatLonPoint latLonPoint = origins.get(i);
                if (latLonPoint != null) {
                    double dA = xts.a(latLonPoint.getLatitude());
                    stringBuffer.append(xts.a(latLonPoint.getLongitude()));
                    stringBuffer.append(",");
                    stringBuffer.append(dA);
                    if (i < size) {
                        stringBuffer.append("|");
                    }
                }
            }
        }
        LatLonPoint destination = ((DistanceSearch.DistanceQuery) this.s).getDestination();
        if (destination != null) {
            double dA2 = xts.a(destination.getLatitude());
            double dA3 = xts.a(destination.getLongitude());
            stringBuffer.append("&destination=");
            stringBuffer.append(dA3);
            stringBuffer.append(",");
            stringBuffer.append(dA2);
        }
        stringBuffer.append("&type=");
        stringBuffer.append(((DistanceSearch.DistanceQuery) this.s).getType());
        if (TextUtils.isEmpty(((DistanceSearch.DistanceQuery) this.s).getExtensions())) {
            stringBuffer.append("&extensions=base");
        } else {
            stringBuffer.append("&extensions=");
            stringBuffer.append(((DistanceSearch.DistanceQuery) this.s).getExtensions());
        }
        stringBuffer.append("&output=json");
        if (((DistanceSearch.DistanceQuery) this.s).getType() == 1) {
            stringBuffer.append("&strategy=");
            stringBuffer.append(((DistanceSearch.DistanceQuery) this.s).getMode());
        }
        return stringBuffer.toString();
    }
}
