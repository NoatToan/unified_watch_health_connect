package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class fv extends fm<DistanceSearch.DistanceQuery, DistanceResult> {
    private final String k;
    private final String l;
    private final String m;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fv(Context context, DistanceSearch.DistanceQuery distanceQuery) {
        super(context, distanceQuery);
        this.k = "/distance?";
        this.l = "|";
        this.m = ",";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        List<LatLonPoint> origins = ((DistanceSearch.DistanceQuery) this.f2534b).getOrigins();
        if (origins != null && origins.size() > 0) {
            stringBuffer.append("&origins=");
            int size = origins.size();
            for (int i = 0; i < size; i++) {
                LatLonPoint latLonPoint = origins.get(i);
                if (latLonPoint != null) {
                    double dA = fu.a(latLonPoint.getLatitude());
                    stringBuffer.append(fu.a(latLonPoint.getLongitude()));
                    stringBuffer.append(",");
                    stringBuffer.append(dA);
                    if (i < size) {
                        stringBuffer.append("|");
                    }
                }
            }
        }
        LatLonPoint destination = ((DistanceSearch.DistanceQuery) this.f2534b).getDestination();
        if (destination != null) {
            double dA2 = fu.a(destination.getLatitude());
            double dA3 = fu.a(destination.getLongitude());
            stringBuffer.append("&destination=");
            stringBuffer.append(dA3);
            stringBuffer.append(",");
            stringBuffer.append(dA2);
        }
        stringBuffer.append("&type=").append(((DistanceSearch.DistanceQuery) this.f2534b).getType());
        if (!TextUtils.isEmpty(((DistanceSearch.DistanceQuery) this.f2534b).getExtensions())) {
            stringBuffer.append("&extensions=").append(((DistanceSearch.DistanceQuery) this.f2534b).getExtensions());
        } else {
            stringBuffer.append("&extensions=base");
        }
        stringBuffer.append("&output=json");
        if (((DistanceSearch.DistanceQuery) this.f2534b).getType() == 1) {
            stringBuffer.append("&strategy=").append(((DistanceSearch.DistanceQuery) this.f2534b).getMode());
        }
        return stringBuffer.toString();
    }

    private static DistanceResult c(String str) throws AMapException {
        return gc.l(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/distance?";
    }
}
