package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRouteSearchV2;
import com.amap.api.services.route.BusRouteResultV2;
import com.amap.api.services.route.DriveRouteResultV2;
import com.amap.api.services.route.RideRouteResultV2;
import com.amap.api.services.route.RouteSearchV2;
import com.amap.api.services.route.WalkRouteResultV2;
import defpackage.ays;
import defpackage.gys;
import defpackage.ius;
import defpackage.nts;
import defpackage.rws;
import defpackage.wts;
import defpackage.xts;
import defpackage.zws;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements IRouteSearchV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RouteSearchV2.OnRouteSearchListener f6270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6271b;
    public Handler c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearchV2.DriveRouteQuery f6272a;

        public a(RouteSearchV2.DriveRouteQuery driveRouteQuery) {
            this.f6272a = driveRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 101;
            messageObtainMessage.arg1 = 101;
            Bundle bundle = new Bundle();
            DriveRouteResultV2 driveRouteResultV2CalculateDriveRoute = null;
            try {
                try {
                    driveRouteResultV2CalculateDriveRoute = u0.this.calculateDriveRoute(this.f6272a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = u0.this.f6270a;
                bundle.putParcelable("result", driveRouteResultV2CalculateDriveRoute);
                messageObtainMessage.setData(bundle);
                u0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearchV2.WalkRouteQuery f6274a;

        public b(RouteSearchV2.WalkRouteQuery walkRouteQuery) {
            this.f6274a = walkRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 102;
            messageObtainMessage.arg1 = 101;
            Bundle bundle = new Bundle();
            WalkRouteResultV2 walkRouteResultV2CalculateWalkRoute = null;
            try {
                try {
                    walkRouteResultV2CalculateWalkRoute = u0.this.calculateWalkRoute(this.f6274a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = u0.this.f6270a;
                bundle.putParcelable("result", walkRouteResultV2CalculateWalkRoute);
                messageObtainMessage.setData(bundle);
                u0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearchV2.RideRouteQuery f6276a;

        public c(RouteSearchV2.RideRouteQuery rideRouteQuery) {
            this.f6276a = rideRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 103;
            messageObtainMessage.arg1 = 101;
            Bundle bundle = new Bundle();
            RideRouteResultV2 rideRouteResultV2CalculateRideRoute = null;
            try {
                try {
                    rideRouteResultV2CalculateRideRoute = u0.this.calculateRideRoute(this.f6276a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = u0.this.f6270a;
                bundle.putParcelable("result", rideRouteResultV2CalculateRideRoute);
                messageObtainMessage.setData(bundle);
                u0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearchV2.BusRouteQuery f6278a;

        public d(RouteSearchV2.BusRouteQuery busRouteQuery) {
            this.f6278a = busRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.arg1 = 101;
            Bundle bundle = new Bundle();
            BusRouteResultV2 busRouteResultV2CalculateBusRoute = null;
            try {
                try {
                    busRouteResultV2CalculateBusRoute = u0.this.calculateBusRoute(this.f6278a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = u0.this.f6270a;
                bundle.putParcelable("result", busRouteResultV2CalculateBusRoute);
                messageObtainMessage.setData(bundle);
                u0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public u0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6271b = context.getApplicationContext();
        this.c = y.a();
    }

    public static boolean b(RouteSearchV2.FromAndTo fromAndTo) {
        return (fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final BusRouteResultV2 calculateBusRoute(RouteSearchV2.BusRouteQuery busRouteQuery) throws AMapException {
        try {
            x.c(this.f6271b);
            if (busRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(busRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            RouteSearchV2.BusRouteQuery busRouteQueryClone = busRouteQuery.m111clone();
            BusRouteResultV2 busRouteResultV2M = new nts(this.f6271b, busRouteQueryClone).m();
            if (busRouteResultV2M != null) {
                busRouteResultV2M.setBusQuery(busRouteQueryClone);
            }
            return busRouteResultV2M;
        } catch (AMapException e) {
            xts.i(e, "RouteSearch", "calculateBusRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateBusRouteAsyn(RouteSearchV2.BusRouteQuery busRouteQuery) {
        try {
            ays.a().b(new d(busRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateBusRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final DriveRouteResultV2 calculateDriveRoute(RouteSearchV2.DriveRouteQuery driveRouteQuery) throws AMapException, CloneNotSupportedException {
        try {
            x.c(this.f6271b);
            if (driveRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(driveRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a();
            rws.l(driveRouteQuery.getPassedByPoints());
            rws.a().o(driveRouteQuery.getAvoidpolygons());
            RouteSearchV2.DriveRouteQuery driveRouteQueryClone = driveRouteQuery.m112clone();
            DriveRouteResultV2 driveRouteResultV2M = new ius(this.f6271b, driveRouteQueryClone).m();
            if (driveRouteResultV2M != null) {
                driveRouteResultV2M.setDriveQuery(driveRouteQueryClone);
            }
            return driveRouteResultV2M;
        } catch (AMapException e) {
            xts.i(e, "RouteSearch", "calculateDriveRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateDriveRouteAsyn(RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        try {
            ays.a().b(new a(driveRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateDriveRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final RideRouteResultV2 calculateRideRoute(RouteSearchV2.RideRouteQuery rideRouteQuery) throws AMapException {
        try {
            x.c(this.f6271b);
            if (rideRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(rideRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a().e(rideRouteQuery.getFromAndTo());
            RouteSearchV2.RideRouteQuery rideRouteQueryClone = rideRouteQuery.m114clone();
            RideRouteResultV2 rideRouteResultV2M = new zws(this.f6271b, rideRouteQueryClone).m();
            if (rideRouteResultV2M != null) {
                rideRouteResultV2M.setRideQuery(rideRouteQueryClone);
            }
            return rideRouteResultV2M;
        } catch (AMapException e) {
            xts.i(e, "RouteSearch", "calculaterideRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateRideRouteAsyn(RouteSearchV2.RideRouteQuery rideRouteQuery) {
        try {
            ays.a().b(new c(rideRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateRideRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final WalkRouteResultV2 calculateWalkRoute(RouteSearchV2.WalkRouteQuery walkRouteQuery) throws AMapException {
        try {
            x.c(this.f6271b);
            if (walkRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(walkRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a().k(walkRouteQuery.getFromAndTo());
            RouteSearchV2.WalkRouteQuery walkRouteQueryClone = walkRouteQuery.m115clone();
            WalkRouteResultV2 walkRouteResultV2M = new gys(this.f6271b, walkRouteQueryClone).m();
            if (walkRouteResultV2M != null) {
                walkRouteResultV2M.setWalkQuery(walkRouteQueryClone);
            }
            return walkRouteResultV2M;
        } catch (AMapException e) {
            xts.i(e, "RouteSearch", "calculateWalkRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateWalkRouteAsyn(RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        try {
            ays.a().b(new b(walkRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateWalkRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void setRouteSearchListener(RouteSearchV2.OnRouteSearchListener onRouteSearchListener) {
        this.f6270a = onRouteSearchListener;
    }
}
