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

/* JADX INFO: loaded from: classes21.dex */
public final class hz implements IRouteSearchV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteSearchV2.OnRouteSearchListener f2701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f2703c;

    public hz(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2702b = context.getApplicationContext();
        this.f2703c = gf.a();
    }

    private static boolean a(RouteSearchV2.FromAndTo fromAndTo) {
        return (fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void setRouteSearchListener(RouteSearchV2.OnRouteSearchListener onRouteSearchListener) {
        this.f2701a = onRouteSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final DriveRouteResultV2 calculateDriveRoute(RouteSearchV2.DriveRouteQuery driveRouteQuery) throws AMapException {
        try {
            gd.a(this.f2702b);
            if (driveRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(driveRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a();
            gw.b(driveRouteQuery.getPassedByPoints());
            gw.a().c(driveRouteQuery.getAvoidpolygons());
            RouteSearchV2.DriveRouteQuery driveRouteQueryClone = driveRouteQuery.m783clone();
            DriveRouteResultV2 driveRouteResultV2D = new fz(this.f2702b, driveRouteQueryClone).d();
            if (driveRouteResultV2D != null) {
                driveRouteResultV2D.setDriveQuery(driveRouteQueryClone);
            }
            return driveRouteResultV2D;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateDriveRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateDriveRouteAsyn(final RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hz.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 101;
                    messageObtainMessage.arg1 = 101;
                    Bundle bundle = new Bundle();
                    DriveRouteResultV2 driveRouteResultV2CalculateDriveRoute = null;
                    try {
                        try {
                            driveRouteResultV2CalculateDriveRoute = hz.this.calculateDriveRoute(driveRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hz.this.f2701a;
                        bundle.putParcelable("result", driveRouteResultV2CalculateDriveRoute);
                        messageObtainMessage.setData(bundle);
                        hz.this.f2703c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateDriveRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final WalkRouteResultV2 calculateWalkRoute(RouteSearchV2.WalkRouteQuery walkRouteQuery) throws AMapException {
        try {
            gd.a(this.f2702b);
            if (walkRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(walkRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a().b(walkRouteQuery.getFromAndTo());
            RouteSearchV2.WalkRouteQuery walkRouteQueryClone = walkRouteQuery.m786clone();
            WalkRouteResultV2 walkRouteResultV2D = new hh(this.f2702b, walkRouteQueryClone).d();
            if (walkRouteResultV2D != null) {
                walkRouteResultV2D.setWalkQuery(walkRouteQueryClone);
            }
            return walkRouteResultV2D;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateWalkRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateWalkRouteAsyn(final RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hz.2
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 102;
                    messageObtainMessage.arg1 = 101;
                    Bundle bundle = new Bundle();
                    WalkRouteResultV2 walkRouteResultV2CalculateWalkRoute = null;
                    try {
                        try {
                            walkRouteResultV2CalculateWalkRoute = hz.this.calculateWalkRoute(walkRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hz.this.f2701a;
                        bundle.putParcelable("result", walkRouteResultV2CalculateWalkRoute);
                        messageObtainMessage.setData(bundle);
                        hz.this.f2703c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateWalkRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final RideRouteResultV2 calculateRideRoute(RouteSearchV2.RideRouteQuery rideRouteQuery) throws AMapException {
        try {
            gd.a(this.f2702b);
            if (rideRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(rideRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            gw.a().a(rideRouteQuery.getFromAndTo());
            RouteSearchV2.RideRouteQuery rideRouteQueryClone = rideRouteQuery.m785clone();
            RideRouteResultV2 rideRouteResultV2D = new gz(this.f2702b, rideRouteQueryClone).d();
            if (rideRouteResultV2D != null) {
                rideRouteResultV2D.setRideQuery(rideRouteQueryClone);
            }
            return rideRouteResultV2D;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculaterideRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateRideRouteAsyn(final RouteSearchV2.RideRouteQuery rideRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hz.3
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 103;
                    messageObtainMessage.arg1 = 101;
                    Bundle bundle = new Bundle();
                    RideRouteResultV2 rideRouteResultV2CalculateRideRoute = null;
                    try {
                        try {
                            rideRouteResultV2CalculateRideRoute = hz.this.calculateRideRoute(rideRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hz.this.f2701a;
                        bundle.putParcelable("result", rideRouteResultV2CalculateRideRoute);
                        messageObtainMessage.setData(bundle);
                        hz.this.f2703c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateRideRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final BusRouteResultV2 calculateBusRoute(RouteSearchV2.BusRouteQuery busRouteQuery) throws AMapException {
        try {
            gd.a(this.f2702b);
            if (busRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!a(busRouteQuery.getFromAndTo())) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            RouteSearchV2.BusRouteQuery busRouteQueryClone = busRouteQuery.m782clone();
            BusRouteResultV2 busRouteResultV2D = new fo(this.f2702b, busRouteQueryClone).d();
            if (busRouteResultV2D != null) {
                busRouteResultV2D.setBusQuery(busRouteQueryClone);
            }
            return busRouteResultV2D;
        } catch (AMapException e) {
            fu.a(e, "RouteSearch", "calculateBusRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateBusRouteAsyn(final RouteSearchV2.BusRouteQuery busRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hz.4
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.what = 100;
                    messageObtainMessage.arg1 = 101;
                    Bundle bundle = new Bundle();
                    BusRouteResultV2 busRouteResultV2CalculateBusRoute = null;
                    try {
                        try {
                            busRouteResultV2CalculateBusRoute = hz.this.calculateBusRoute(busRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        messageObtainMessage.obj = hz.this.f2701a;
                        bundle.putParcelable("result", busRouteResultV2CalculateBusRoute);
                        messageObtainMessage.setData(bundle);
                        hz.this.f2703c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "RouteSearch", "calculateBusRouteAsyn");
        }
    }
}
