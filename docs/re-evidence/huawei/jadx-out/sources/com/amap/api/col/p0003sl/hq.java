package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IDistanceSearch;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;

/* JADX INFO: loaded from: classes21.dex */
public class hq implements IDistanceSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2641a = "hq";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f2643c;
    private DistanceSearch.OnDistanceSearchListener d;

    public hq(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2642b = context.getApplicationContext();
        this.f2643c = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public DistanceResult calculateRouteDistance(DistanceSearch.DistanceQuery distanceQuery) throws AMapException {
        try {
            gd.a(this.f2642b);
            if (distanceQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (a(distanceQuery)) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            DistanceSearch.DistanceQuery distanceQueryClone = distanceQuery.m774clone();
            DistanceResult distanceResultD = new fv(this.f2642b, distanceQueryClone).d();
            if (distanceResultD != null) {
                distanceResultD.setDistanceQuery(distanceQueryClone);
            }
            return distanceResultD;
        } catch (AMapException e) {
            fu.a(e, f2641a, "calculateWalkRoute");
            throw e;
        }
    }

    private static boolean a(DistanceSearch.DistanceQuery distanceQuery) {
        return distanceQuery.getDestination() == null || distanceQuery.getOrigins() == null || distanceQuery.getOrigins().size() <= 0;
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void calculateRouteDistanceAsyn(final DistanceSearch.DistanceQuery distanceQuery) {
        he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hq.1
            @Override // java.lang.Runnable
            public final void run() {
                Message messageObtainMessage = gf.a().obtainMessage();
                messageObtainMessage.what = 400;
                messageObtainMessage.arg1 = 16;
                Bundle bundle = new Bundle();
                DistanceResult distanceResultCalculateRouteDistance = null;
                try {
                    try {
                        distanceResultCalculateRouteDistance = hq.this.calculateRouteDistance(distanceQuery);
                        bundle.putInt("errorCode", 1000);
                    } catch (AMapException e) {
                        bundle.putInt("errorCode", e.getErrorCode());
                    }
                } finally {
                    messageObtainMessage.obj = hq.this.d;
                    bundle.putParcelable("result", distanceResultCalculateRouteDistance);
                    messageObtainMessage.setData(bundle);
                    hq.this.f2643c.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void setDistanceSearchListener(DistanceSearch.OnDistanceSearchListener onDistanceSearchListener) {
        this.d = onDistanceSearchListener;
    }
}
