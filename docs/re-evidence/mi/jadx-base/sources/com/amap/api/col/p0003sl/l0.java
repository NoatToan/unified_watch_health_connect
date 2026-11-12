package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IDistanceSearch;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import defpackage.ays;
import defpackage.wts;
import defpackage.xts;
import defpackage.yts;

/* JADX INFO: loaded from: classes4.dex */
public class l0 implements IDistanceSearch {
    public static final String d = "l0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f6187b;
    public DistanceSearch.OnDistanceSearchListener c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DistanceSearch.DistanceQuery f6188a;

        public a(DistanceSearch.DistanceQuery distanceQuery) {
            this.f6188a = distanceQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 400;
            messageObtainMessage.arg1 = 16;
            Bundle bundle = new Bundle();
            DistanceResult distanceResultCalculateRouteDistance = null;
            try {
                try {
                    distanceResultCalculateRouteDistance = l0.this.calculateRouteDistance(this.f6188a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = l0.this.c;
                bundle.putParcelable("result", distanceResultCalculateRouteDistance);
                messageObtainMessage.setData(bundle);
                l0.this.f6187b.sendMessage(messageObtainMessage);
            }
        }
    }

    public l0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6186a = context.getApplicationContext();
        this.f6187b = y.a();
    }

    public static boolean b(DistanceSearch.DistanceQuery distanceQuery) {
        return distanceQuery.getDestination() == null || distanceQuery.getOrigins() == null || distanceQuery.getOrigins().size() <= 0;
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public DistanceResult calculateRouteDistance(DistanceSearch.DistanceQuery distanceQuery) throws AMapException {
        try {
            x.c(this.f6186a);
            if (distanceQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (b(distanceQuery)) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            DistanceSearch.DistanceQuery distanceQueryClone = distanceQuery.m103clone();
            DistanceResult distanceResultM = new yts(this.f6186a, distanceQueryClone).m();
            if (distanceResultM != null) {
                distanceResultM.setDistanceQuery(distanceQueryClone);
            }
            return distanceResultM;
        } catch (AMapException e) {
            xts.i(e, d, "calculateWalkRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void calculateRouteDistanceAsyn(DistanceSearch.DistanceQuery distanceQuery) {
        ays.a().b(new a(distanceQuery));
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void setDistanceSearchListener(DistanceSearch.OnDistanceSearchListener onDistanceSearchListener) {
        this.c = onDistanceSearchListener;
    }
}
