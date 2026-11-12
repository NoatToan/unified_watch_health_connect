package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRouteSearch;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import defpackage.ays;
import defpackage.cys;
import defpackage.dus;
import defpackage.eys;
import defpackage.gus;
import defpackage.lts;
import defpackage.rws;
import defpackage.wts;
import defpackage.xts;
import defpackage.xws;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements IRouteSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RouteSearch.OnRouteSearchListener f6255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RouteSearch.OnTruckRouteSearchListener f6256b;
    public RouteSearch.OnRoutePlanSearchListener c;
    public Context d;
    public Handler e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearch.WalkRouteQuery f6257a;

        public a(RouteSearch.WalkRouteQuery walkRouteQuery) {
            this.f6257a = walkRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 102;
            messageObtainMessage.arg1 = 1;
            Bundle bundle = new Bundle();
            WalkRouteResult walkRouteResultCalculateWalkRoute = null;
            try {
                try {
                    walkRouteResultCalculateWalkRoute = t0.this.calculateWalkRoute(this.f6257a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = t0.this.f6255a;
                bundle.putParcelable("result", walkRouteResultCalculateWalkRoute);
                messageObtainMessage.setData(bundle);
                t0.this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearch.BusRouteQuery f6259a;

        public b(RouteSearch.BusRouteQuery busRouteQuery) {
            this.f6259a = busRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.arg1 = 1;
            Bundle bundle = new Bundle();
            BusRouteResult busRouteResultCalculateBusRoute = null;
            try {
                try {
                    busRouteResultCalculateBusRoute = t0.this.calculateBusRoute(this.f6259a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = t0.this.f6255a;
                bundle.putParcelable("result", busRouteResultCalculateBusRoute);
                messageObtainMessage.setData(bundle);
                t0.this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearch.DriveRouteQuery f6261a;

        public c(RouteSearch.DriveRouteQuery driveRouteQuery) {
            this.f6261a = driveRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 101;
            messageObtainMessage.arg1 = 1;
            Bundle bundle = new Bundle();
            DriveRouteResult driveRouteResultCalculateDriveRoute = null;
            try {
                try {
                    driveRouteResultCalculateDriveRoute = t0.this.calculateDriveRoute(this.f6261a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = t0.this.f6255a;
                bundle.putParcelable("result", driveRouteResultCalculateDriveRoute);
                messageObtainMessage.setData(bundle);
                t0.this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearch.RideRouteQuery f6263a;

        public d(RouteSearch.RideRouteQuery rideRouteQuery) {
            this.f6263a = rideRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 103;
            messageObtainMessage.arg1 = 1;
            Bundle bundle = new Bundle();
            RideRouteResult rideRouteResultCalculateRideRoute = null;
            try {
                try {
                    rideRouteResultCalculateRideRoute = t0.this.calculateRideRoute(this.f6263a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = t0.this.f6255a;
                bundle.putParcelable("result", rideRouteResultCalculateRideRoute);
                messageObtainMessage.setData(bundle);
                t0.this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearch.TruckRouteQuery f6265a;

        public e(RouteSearch.TruckRouteQuery truckRouteQuery) {
            this.f6265a = truckRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 104;
            messageObtainMessage.arg1 = 17;
            Bundle bundle = new Bundle();
            TruckRouteRestult truckRouteRestultCalculateTruckRoute = null;
            try {
                try {
                    truckRouteRestultCalculateTruckRoute = t0.this.calculateTruckRoute(this.f6265a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = t0.this.f6256b;
                bundle.putParcelable("result", truckRouteRestultCalculateTruckRoute);
                messageObtainMessage.setData(bundle);
                t0.this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteSearch.DrivePlanQuery f6267a;

        public f(RouteSearch.DrivePlanQuery drivePlanQuery) {
            this.f6267a = drivePlanQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.what = 105;
            messageObtainMessage.arg1 = 18;
            Bundle bundle = new Bundle();
            DriveRoutePlanResult driveRoutePlanResultCalculateDrivePlan = null;
            try {
                try {
                    driveRoutePlanResultCalculateDrivePlan = t0.this.calculateDrivePlan(this.f6267a);
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                }
            } finally {
                messageObtainMessage.obj = t0.this.c;
                bundle.putParcelable("result", driveRoutePlanResultCalculateDrivePlan);
                messageObtainMessage.setData(bundle);
                t0.this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    public t0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.d = context.getApplicationContext();
        this.e = y.a();
    }

    public static boolean b(RouteSearch.FromAndTo fromAndTo) {
        return (fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final BusRouteResult calculateBusRoute(RouteSearch.BusRouteQuery busRouteQuery) throws AMapException {
        try {
            x.c(this.d);
            if (busRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(busRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            RouteSearch.BusRouteQuery busRouteQueryClone = busRouteQuery.m104clone();
            BusRouteResult busRouteResultM = new lts(this.d, busRouteQueryClone).m();
            if (busRouteResultM != null) {
                busRouteResultM.setBusQuery(busRouteQueryClone);
            }
            return busRouteResultM;
        } catch (AMapException e2) {
            xts.i(e2, "RouteSearch", "calculateBusRoute");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateBusRouteAsyn(RouteSearch.BusRouteQuery busRouteQuery) {
        try {
            ays.a().b(new b(busRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateBusRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final DriveRoutePlanResult calculateDrivePlan(RouteSearch.DrivePlanQuery drivePlanQuery) throws AMapException {
        try {
            x.c(this.d);
            if (drivePlanQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(drivePlanQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            DriveRoutePlanResult driveRoutePlanResultM = new dus(this.d, drivePlanQuery.m105clone()).m();
            if (driveRoutePlanResultM != null) {
                driveRoutePlanResultM.setDrivePlanQuery(drivePlanQuery);
            }
            return driveRoutePlanResultM;
        } catch (AMapException e2) {
            xts.i(e2, "RouteSearch", "calculateDrivePlan");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateDrivePlanAsyn(RouteSearch.DrivePlanQuery drivePlanQuery) {
        try {
            ays.a().b(new f(drivePlanQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final DriveRouteResult calculateDriveRoute(RouteSearch.DriveRouteQuery driveRouteQuery) throws AMapException {
        try {
            x.c(this.d);
            if (driveRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(driveRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a().g(driveRouteQuery.getPassedByPoints());
            rws.a().o(driveRouteQuery.getAvoidpolygons());
            RouteSearch.DriveRouteQuery driveRouteQueryClone = driveRouteQuery.m106clone();
            DriveRouteResult driveRouteResultM = new gus(this.d, driveRouteQueryClone).m();
            if (driveRouteResultM != null) {
                driveRouteResultM.setDriveQuery(driveRouteQueryClone);
            }
            return driveRouteResultM;
        } catch (AMapException e2) {
            xts.i(e2, "RouteSearch", "calculateDriveRoute");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateDriveRouteAsyn(RouteSearch.DriveRouteQuery driveRouteQuery) {
        try {
            ays.a().b(new c(driveRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateDriveRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final RideRouteResult calculateRideRoute(RouteSearch.RideRouteQuery rideRouteQuery) throws AMapException {
        try {
            x.c(this.d);
            if (rideRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(rideRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a().c(rideRouteQuery.getFromAndTo());
            RouteSearch.RideRouteQuery rideRouteQueryClone = rideRouteQuery.m108clone();
            RideRouteResult rideRouteResultM = new xws(this.d, rideRouteQueryClone).m();
            if (rideRouteResultM != null) {
                rideRouteResultM.setRideQuery(rideRouteQueryClone);
            }
            return rideRouteResultM;
        } catch (AMapException e2) {
            xts.i(e2, "RouteSearch", "calculaterideRoute");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateRideRouteAsyn(RouteSearch.RideRouteQuery rideRouteQuery) {
        try {
            ays.a().b(new d(rideRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateRideRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final TruckRouteRestult calculateTruckRoute(RouteSearch.TruckRouteQuery truckRouteQuery) throws AMapException {
        try {
            x.c(this.d);
            if (truckRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(truckRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a().d(truckRouteQuery.getFromAndTo(), truckRouteQuery.getPassedByPoints());
            rws.a();
            rws.l(truckRouteQuery.getPassedByPoints());
            RouteSearch.TruckRouteQuery truckRouteQueryClone = truckRouteQuery.m109clone();
            TruckRouteRestult truckRouteRestultM = new cys(this.d, truckRouteQueryClone).m();
            if (truckRouteRestultM != null) {
                truckRouteRestultM.setTruckQuery(truckRouteQueryClone);
            }
            return truckRouteRestultM;
        } catch (AMapException e2) {
            xts.i(e2, "RouteSearch", "calculateDriveRoute");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateTruckRouteAsyn(RouteSearch.TruckRouteQuery truckRouteQuery) {
        try {
            ays.a().b(new e(truckRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final WalkRouteResult calculateWalkRoute(RouteSearch.WalkRouteQuery walkRouteQuery) throws AMapException {
        try {
            x.c(this.d);
            if (walkRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!b(walkRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            rws.a().j(walkRouteQuery.getFromAndTo());
            RouteSearch.WalkRouteQuery walkRouteQueryClone = walkRouteQuery.m110clone();
            WalkRouteResult walkRouteResultM = new eys(this.d, walkRouteQueryClone).m();
            if (walkRouteResultM != null) {
                walkRouteResultM.setWalkQuery(walkRouteQueryClone);
            }
            return walkRouteResultM;
        } catch (AMapException e2) {
            xts.i(e2, "RouteSearch", "calculateWalkRoute");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateWalkRouteAsyn(RouteSearch.WalkRouteQuery walkRouteQuery) {
        try {
            ays.a().b(new a(walkRouteQuery));
        } catch (Throwable th) {
            xts.i(th, "RouteSearch", "calculateWalkRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setOnRoutePlanSearchListener(RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener) {
        this.c = onRoutePlanSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setOnTruckRouteSearchListener(RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener) {
        this.f6256b = onTruckRouteSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setRouteSearchListener(RouteSearch.OnRouteSearchListener onRouteSearchListener) {
        this.f6255a = onRouteSearchListener;
    }
}
