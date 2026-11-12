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

/* JADX INFO: loaded from: classes21.dex */
public final class hy implements IRouteSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteSearch.OnRouteSearchListener f2686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearch.OnTruckRouteSearchListener f2687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch.OnRoutePlanSearchListener f2688c;
    private Context d;
    private Handler e;

    public hy(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.d = context.getApplicationContext();
        this.e = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setRouteSearchListener(RouteSearch.OnRouteSearchListener onRouteSearchListener) {
        this.f2686a = onRouteSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setOnTruckRouteSearchListener(RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener) {
        this.f2687b = onTruckRouteSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setOnRoutePlanSearchListener(RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener) {
        this.f2688c = onRoutePlanSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final WalkRouteResult calculateWalkRoute(RouteSearch.WalkRouteQuery walkRouteQuery) throws AMapException {
        try {
            gd.a(this.d);
            if (walkRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(walkRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a().b(walkRouteQuery.getFromAndTo());
            RouteSearch.WalkRouteQuery walkRouteQueryClone = walkRouteQuery.m781clone();
            WalkRouteResult walkRouteResultD = new hg(this.d, walkRouteQueryClone).d();
            if (walkRouteResultD != null) {
                walkRouteResultD.setWalkQuery(walkRouteQueryClone);
            }
            return walkRouteResultD;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateWalkRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateWalkRouteAsyn(final RouteSearch.WalkRouteQuery walkRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hy.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Handler] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str = "result";
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 102;
                    messageObtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    WalkRouteResult walkRouteResultCalculateWalkRoute = null;
                    try {
                        try {
                            walkRouteResultCalculateWalkRoute = hy.this.calculateWalkRoute(walkRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hy.this.f2686a;
                        bundle.putParcelable(str, walkRouteResultCalculateWalkRoute);
                        messageObtainMessage.setData(bundle);
                        hy.this.e.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateWalkRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final BusRouteResult calculateBusRoute(RouteSearch.BusRouteQuery busRouteQuery) throws AMapException {
        try {
            gd.a(this.d);
            if (busRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(busRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            RouteSearch.BusRouteQuery busRouteQueryClone = busRouteQuery.m775clone();
            BusRouteResult busRouteResultD = new fn(this.d, busRouteQueryClone).d();
            if (busRouteResultD != null) {
                busRouteResultD.setBusQuery(busRouteQueryClone);
            }
            return busRouteResultD;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateBusRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateBusRouteAsyn(final RouteSearch.BusRouteQuery busRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hy.2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Handler] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str = "result";
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 100;
                    messageObtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    BusRouteResult busRouteResultCalculateBusRoute = null;
                    try {
                        try {
                            busRouteResultCalculateBusRoute = hy.this.calculateBusRoute(busRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hy.this.f2686a;
                        bundle.putParcelable(str, busRouteResultCalculateBusRoute);
                        messageObtainMessage.setData(bundle);
                        hy.this.e.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateBusRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final DriveRouteResult calculateDriveRoute(RouteSearch.DriveRouteQuery driveRouteQuery) throws AMapException {
        try {
            gd.a(this.d);
            if (driveRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(driveRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a().a(driveRouteQuery.getPassedByPoints());
            gw.a().c(driveRouteQuery.getAvoidpolygons());
            RouteSearch.DriveRouteQuery driveRouteQueryClone = driveRouteQuery.m777clone();
            DriveRouteResult driveRouteResultD = new fy(this.d, driveRouteQueryClone).d();
            if (driveRouteResultD != null) {
                driveRouteResultD.setDriveQuery(driveRouteQueryClone);
            }
            return driveRouteResultD;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateDriveRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateDriveRouteAsyn(final RouteSearch.DriveRouteQuery driveRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hy.3
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Handler] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str = "result";
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 101;
                    messageObtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    DriveRouteResult driveRouteResultCalculateDriveRoute = null;
                    try {
                        try {
                            driveRouteResultCalculateDriveRoute = hy.this.calculateDriveRoute(driveRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hy.this.f2686a;
                        bundle.putParcelable(str, driveRouteResultCalculateDriveRoute);
                        messageObtainMessage.setData(bundle);
                        hy.this.e.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateDriveRouteAsyn");
        }
    }

    private static boolean a(RouteSearch.FromAndTo fromAndTo) {
        return (fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateRideRouteAsyn(final RouteSearch.RideRouteQuery rideRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hy.4
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Handler] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str = "result";
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 103;
                    messageObtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    RideRouteResult rideRouteResultCalculateRideRoute = null;
                    try {
                        try {
                            rideRouteResultCalculateRideRoute = hy.this.calculateRideRoute(rideRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hy.this.f2686a;
                        bundle.putParcelable(str, rideRouteResultCalculateRideRoute);
                        messageObtainMessage.setData(bundle);
                        hy.this.e.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateRideRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final RideRouteResult calculateRideRoute(RouteSearch.RideRouteQuery rideRouteQuery) throws AMapException {
        try {
            gd.a(this.d);
            if (rideRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(rideRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a().a(rideRouteQuery.getFromAndTo());
            RouteSearch.RideRouteQuery rideRouteQueryClone = rideRouteQuery.m779clone();
            RideRouteResult rideRouteResultD = new gy(this.d, rideRouteQueryClone).d();
            if (rideRouteResultD != null) {
                rideRouteResultD.setRideQuery(rideRouteQueryClone);
            }
            return rideRouteResultD;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculaterideRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final TruckRouteRestult calculateTruckRoute(RouteSearch.TruckRouteQuery truckRouteQuery) throws AMapException {
        try {
            gd.a(this.d);
            if (truckRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(truckRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a().a(truckRouteQuery.getFromAndTo(), truckRouteQuery.getPassedByPoints());
            gw.a();
            gw.b(truckRouteQuery.getPassedByPoints());
            RouteSearch.TruckRouteQuery truckRouteQueryClone = truckRouteQuery.m780clone();
            TruckRouteRestult truckRouteRestultD = new hf(this.d, truckRouteQueryClone).d();
            if (truckRouteRestultD != null) {
                truckRouteRestultD.setTruckQuery(truckRouteQueryClone);
            }
            return truckRouteRestultD;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateDriveRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateTruckRouteAsyn(final RouteSearch.TruckRouteQuery truckRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hy.5
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 104;
                    messageObtainMessage.arg1 = 17;
                    Bundle bundle = new Bundle();
                    TruckRouteRestult truckRouteRestultCalculateTruckRoute = null;
                    try {
                        try {
                            truckRouteRestultCalculateTruckRoute = hy.this.calculateTruckRoute(truckRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hy.this.f2687b;
                        bundle.putParcelable("result", truckRouteRestultCalculateTruckRoute);
                        messageObtainMessage.setData(bundle);
                        hy.this.e.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final DriveRoutePlanResult calculateDrivePlan(RouteSearch.DrivePlanQuery drivePlanQuery) throws AMapException {
        try {
            gd.a(this.d);
            if (drivePlanQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(drivePlanQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            DriveRoutePlanResult driveRoutePlanResultD = new fx(this.d, drivePlanQuery.m776clone()).d();
            if (driveRoutePlanResultD != null) {
                driveRoutePlanResultD.setDrivePlanQuery(drivePlanQuery);
            }
            return driveRoutePlanResultD;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateDrivePlan");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateDrivePlanAsyn(final RouteSearch.DrivePlanQuery drivePlanQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hy.6
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 105;
                    messageObtainMessage.arg1 = 18;
                    Bundle bundle = new Bundle();
                    DriveRoutePlanResult driveRoutePlanResultCalculateDrivePlan = null;
                    try {
                        try {
                            driveRoutePlanResultCalculateDrivePlan = hy.this.calculateDrivePlan(drivePlanQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hy.this.f2688c;
                        bundle.putParcelable("result", driveRoutePlanResultCalculateDrivePlan);
                        messageObtainMessage.setData(bundle);
                        hy.this.e.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }
}
