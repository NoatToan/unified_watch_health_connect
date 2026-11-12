package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.hz;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IRouteSearchV2;
import com.huawei.watchface.videoedit.gles.transition.SquareChangeAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RouteSearchV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IRouteSearchV2 f3787a;

    /* JADX INFO: loaded from: classes21.dex */
    public static class BusMode {
        public static final int BUS_COMFORTABLE = 4;
        public static final int BUS_DEFAULT = 0;
        public static final int BUS_LEASE_CHANGE = 2;
        public static final int BUS_LEASE_WALK = 3;
        public static final int BUS_NO_SUBWAY = 5;
        public static final int BUS_SAVE_MONEY = 1;
        public static final int BUS_SUBWAY = 6;
        public static final int BUS_SUBWAY_FIRST = 7;
        public static final int BUS_WASTE_LESS = 8;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public interface OnRoutePlanSearchListener {
        void onDriveRoutePlanSearched(DriveRoutePlanResult driveRoutePlanResult, int i);
    }

    public interface OnRouteSearchListener {
        void onBusRouteSearched(BusRouteResultV2 busRouteResultV2, int i);

        void onDriveRouteSearched(DriveRouteResultV2 driveRouteResultV2, int i);

        void onRideRouteSearched(RideRouteResultV2 rideRouteResultV2, int i);

        void onWalkRouteSearched(WalkRouteResultV2 walkRouteResultV2, int i);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(TruckRouteRestult truckRouteRestult, int i);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class ShowFields {
        public static final int ALL = -1;
        public static final int CHARGE_STATION_INFO = 64;
        public static final int CITIES = 8;
        public static final int COST = 1;
        public static final int ELEC_COSUME_INFO = 32;
        public static final int NAVI = 4;
        public static final int POLINE = 16;
        public static final int TMCS = 2;
    }

    public enum DrivingStrategy {
        DEFAULT(32),
        AVOID_CONGESTION(33),
        HIGHWAY_PRIORITY(34),
        AVOID_HIGHWAY(35),
        LESS_CHARGE(36),
        ROAD_PRIORITY(37),
        SPEED_PRIORITY(38),
        AVOID_CONGESTION_HIGHWAY_PRIORITY(39),
        AVOID_CONGESTION_AVOID_HIGHWAY(40),
        AVOID_CONGESTION_LESS_CHARGE(41),
        LESS_CHARGE_AVOID_HIGHWAY(42),
        AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY(43),
        AVOID_CONGESTION_ROAD_PRIORITY(44),
        AVOID_CONGESTION_SPEED_PRIORITY(45);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3801a;

        DrivingStrategy(int i) {
            this.f3801a = i;
        }

        public final int getValue() {
            return this.f3801a;
        }

        public static DrivingStrategy fromValue(int i) {
            return values()[i - 32];
        }
    }

    public RouteSearchV2(Context context) throws AMapException {
        if (this.f3787a == null) {
            try {
                this.f3787a = new hz(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public void setRouteSearchListener(OnRouteSearchListener onRouteSearchListener) {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.setRouteSearchListener(onRouteSearchListener);
        }
    }

    public DriveRouteResultV2 calculateDriveRoute(DriveRouteQuery driveRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateDriveRoute(driveRouteQuery);
        }
        return null;
    }

    public void calculateDriveRouteAsyn(DriveRouteQuery driveRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateDriveRouteAsyn(driveRouteQuery);
        }
    }

    public WalkRouteResultV2 calculateWalkRoute(WalkRouteQuery walkRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateWalkRoute(walkRouteQuery);
        }
        return null;
    }

    public void calculateWalkRouteAsyn(WalkRouteQuery walkRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateWalkRouteAsyn(walkRouteQuery);
        }
    }

    public void calculateRideRouteAsyn(RideRouteQuery rideRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateRideRouteAsyn(rideRouteQuery);
        }
    }

    public RideRouteResultV2 calculateRideRoute(RideRouteQuery rideRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateRideRoute(rideRouteQuery);
        }
        return null;
    }

    public BusRouteResultV2 calculateBusRoute(BusRouteQuery busRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateBusRoute(busRouteQuery);
        }
        return null;
    }

    public void calculateBusRouteAsyn(BusRouteQuery busRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f3787a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateBusRouteAsyn(busRouteQuery);
        }
    }

    public static class FromAndTo implements Parcelable, Cloneable {
        public static final Parcelable.Creator<FromAndTo> CREATOR = new Parcelable.Creator<FromAndTo>() { // from class: com.amap.api.services.route.RouteSearchV2.FromAndTo.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FromAndTo createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FromAndTo[] newArray(int i) {
                return a(i);
            }

            private static FromAndTo a(Parcel parcel) {
                return new FromAndTo(parcel);
            }

            private static FromAndTo[] a(int i) {
                return new FromAndTo[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f3802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f3803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3804c;
        private String d;
        private String e;
        private String f;
        private String g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f3802a = latLonPoint;
            this.f3803b = latLonPoint2;
        }

        public LatLonPoint getFrom() {
            return this.f3802a;
        }

        public LatLonPoint getTo() {
            return this.f3803b;
        }

        public String getStartPoiID() {
            return this.f3804c;
        }

        public void setStartPoiID(String str) {
            this.f3804c = str;
        }

        public String getDestinationPoiID() {
            return this.d;
        }

        public void setDestinationPoiID(String str) {
            this.d = str;
        }

        public String getOriginType() {
            return this.e;
        }

        public void setOriginType(String str) {
            this.e = str;
        }

        public String getDestinationType() {
            return this.f;
        }

        public void setDestinationType(String str) {
            this.f = str;
        }

        public String getPlateNumber() {
            return this.g;
        }

        public void setPlateNumber(String str) {
            this.g = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3802a, i);
            parcel.writeParcelable(this.f3803b, i);
            parcel.writeString(this.f3804c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public FromAndTo(Parcel parcel) {
            this.f3802a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f3803b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f3804c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        }

        public FromAndTo() {
        }

        public int hashCode() {
            String str = this.d;
            int iHashCode = str == null ? 0 : str.hashCode();
            LatLonPoint latLonPoint = this.f3802a;
            int iHashCode2 = latLonPoint == null ? 0 : latLonPoint.hashCode();
            String str2 = this.f3804c;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            LatLonPoint latLonPoint2 = this.f3803b;
            int iHashCode4 = latLonPoint2 == null ? 0 : latLonPoint2.hashCode();
            String str3 = this.e;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f;
            return ((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FromAndTo fromAndTo = (FromAndTo) obj;
            String str = this.d;
            if (str == null) {
                if (fromAndTo.d != null) {
                    return false;
                }
            } else if (!str.equals(fromAndTo.d)) {
                return false;
            }
            LatLonPoint latLonPoint = this.f3802a;
            if (latLonPoint == null) {
                if (fromAndTo.f3802a != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(fromAndTo.f3802a)) {
                return false;
            }
            String str2 = this.f3804c;
            if (str2 == null) {
                if (fromAndTo.f3804c != null) {
                    return false;
                }
            } else if (!str2.equals(fromAndTo.f3804c)) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.f3803b;
            if (latLonPoint2 == null) {
                if (fromAndTo.f3803b != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(fromAndTo.f3803b)) {
                return false;
            }
            String str3 = this.e;
            if (str3 == null) {
                if (fromAndTo.e != null) {
                    return false;
                }
            } else if (!str3.equals(fromAndTo.e)) {
                return false;
            }
            String str4 = this.f;
            if (str4 == null) {
                if (fromAndTo.f != null) {
                    return false;
                }
            } else if (!str4.equals(fromAndTo.f)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public FromAndTo m784clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearchV2", "FromAndToclone");
            }
            FromAndTo fromAndTo = new FromAndTo(this.f3802a, this.f3803b);
            fromAndTo.setStartPoiID(this.f3804c);
            fromAndTo.setDestinationPoiID(this.d);
            fromAndTo.setOriginType(this.e);
            fromAndTo.setDestinationType(this.f);
            return fromAndTo;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class SpeedCost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3817b;

        public int getSpeed() {
            return this.f3816a;
        }

        public void setSpeed(int i) {
            this.f3816a = i;
        }

        public float getValue() {
            return this.f3817b;
        }

        public void setValue(float f) {
            this.f3817b = f;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class CurveCost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f3792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3793b;

        public float getAccess() {
            return this.f3792a;
        }

        public void setAccess(float f) {
            this.f3792a = f;
        }

        public float getValue() {
            return this.f3793b;
        }

        public void setValue(float f) {
            this.f3793b = f;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class SlopeCost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f3814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3815b;

        public float getUp() {
            return this.f3814a;
        }

        public void setUp(float f) {
            this.f3814a = f;
        }

        public float getDown() {
            return this.f3815b;
        }

        public void setDown(float f) {
            this.f3815b = f;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class TransCost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f3818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3819b;

        public float getAccess() {
            return this.f3818a;
        }

        public void setAccess(float f) {
            this.f3818a = f;
        }

        public float getDecess() {
            return this.f3819b;
        }

        public void setDecess(float f) {
            this.f3819b = f;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class PowerTrainLoss {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3810c;
        private int d;

        public int getPowerDemand() {
            return this.f3808a;
        }

        public void setPowerDemand(int i) {
            this.f3808a = i;
        }

        public float getPowerDemandValue() {
            return this.f3809b;
        }

        public void setPowerDemandValue(float f) {
            this.f3809b = f;
        }

        public int getSpeed() {
            return this.f3810c;
        }

        public void setSpeed(int i) {
            this.f3810c = i;
        }

        public int getSpeedValue() {
            return this.d;
        }

        public void setSpeedValue(int i) {
            this.d = i;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class CustomCostMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<SpeedCost> f3794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CurveCost f3795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SlopeCost f3796c;
        private float d;
        private TransCost e;
        private float f;
        private PowerTrainLoss g;

        public List<SpeedCost> getSpeedCosts() {
            return this.f3794a;
        }

        public void setSpeedCosts(List<SpeedCost> list) {
            this.f3794a = list;
        }

        public CurveCost getCurveCost() {
            return this.f3795b;
        }

        public void setCurveCost(CurveCost curveCost) {
            this.f3795b = curveCost;
        }

        public SlopeCost getSlopeCost() {
            return this.f3796c;
        }

        public void setSlopeCost(SlopeCost slopeCost) {
            this.f3796c = slopeCost;
        }

        public float getAuxCost() {
            return this.d;
        }

        public void setAuxCost(float f) {
            this.d = f;
        }

        public TransCost getTransCost() {
            return this.e;
        }

        public void setTransCost(TransCost transCost) {
            this.e = transCost;
        }

        public float getFerryCost() {
            return this.f;
        }

        public void setFerryCost(float f) {
            this.f = f;
        }

        public PowerTrainLoss getPowerTrainLosses() {
            return this.g;
        }

        public void setPowerTrainLosses(PowerTrainLoss powerTrainLoss) {
            this.g = powerTrainLoss;
        }

        public String toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                List<SpeedCost> list = this.f3794a;
                if (list != null) {
                    for (SpeedCost speedCost : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("speed", speedCost.getSpeed());
                        jSONObject2.put("value", speedCost.getValue());
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("speed_cost", jSONArray);
                }
                if (this.f3795b != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("access", this.f3795b.getAccess());
                    jSONObject3.put("value", this.f3795b.getValue());
                    jSONObject.put("curve_cost", jSONObject3);
                }
                if (this.f3796c != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(SquareChangeAnimation.UP, this.f3796c.getUp());
                    jSONObject4.put(SquareChangeAnimation.DOWN, this.f3796c.getDown());
                    jSONObject.put("slope_cost", jSONObject4);
                }
                jSONObject.put("aux_cost", this.d);
                if (this.e != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("access", this.e.getAccess());
                    jSONObject5.put("decess", this.e.getDecess());
                    jSONObject.put("trans_cost", jSONObject5);
                }
                jSONObject.put("ferry_cost", this.f);
                if (this.g != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("powerdemand", this.g.getPowerDemand());
                    jSONObject6.put("value", this.g.getPowerDemandValue());
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("speed", this.g.getSpeed());
                    jSONObject7.put("value", this.g.getSpeedValue());
                    jSONArray2.put(jSONObject6);
                    jSONArray2.put(jSONObject7);
                    jSONObject.put("powertrain_loss", jSONArray2);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static class NewEnergy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CustomCostMode f3806b;
        private String i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f3807c = -1.0f;
        private float d = -1.0f;
        private float e = 1.5f;
        private float f = 100.0f;
        private float g = 0.0f;
        private float h = 0.0f;
        private int j = 0;

        public String getKey() {
            return this.f3805a;
        }

        public void setKey(String str) {
            this.f3805a = str;
        }

        public CustomCostMode getCustomCostMode() {
            return this.f3806b;
        }

        public void setCustomCostMode(CustomCostMode customCostMode) {
            this.f3806b = customCostMode;
        }

        public float getMaxVehicleCharge() {
            return this.f3807c;
        }

        public void setMaxVehicleCharge(float f) {
            this.f3807c = f;
        }

        public float getVehicleCharge() {
            return this.d;
        }

        public void setVehicleCharge(float f) {
            this.d = f;
        }

        public float getLoad() {
            return this.e;
        }

        public void setLoad(float f) {
            this.e = f;
        }

        public float getLeavingPercent() {
            return this.f;
        }

        public void setLeavingPercent(float f) {
            this.f = f;
        }

        public float getArrivingPercent() {
            return this.g;
        }

        public void setArrivingPercent(float f) {
            this.g = f;
        }

        public float getDestinationArrivingPercent() {
            return this.h;
        }

        public void setDestinationArrivingPercent(float f) {
            this.h = f;
        }

        public String getCustomChargingArguments() {
            return this.i;
        }

        public void setCustomChargingArguments(String str) {
            this.i = str;
        }

        public int getWaypointsArrivingPercent() {
            return this.j;
        }

        public void setWaypointsArrivingPercent(int i) {
            this.j = i;
        }

        public String buildParam() {
            StringBuilder sb = new StringBuilder();
            if (this.f3805a != null) {
                sb.append("&key=");
                sb.append(this.f3805a);
            }
            if (this.f3806b != null) {
                sb.append("&custom_cost_mode=");
                sb.append(this.f3806b.toJson());
            }
            if (this.f3807c > 0.0f) {
                sb.append("&max_vehicle_charge=");
                sb.append(this.f3807c);
            }
            if (this.d > 0.0f) {
                sb.append("&vehicle_charge=");
                sb.append(this.d);
            }
            sb.append("&load=");
            sb.append(this.e);
            sb.append("&leaving_percent=");
            sb.append(this.f);
            sb.append("&arriving_percent=");
            sb.append(this.g);
            sb.append("&destination_arriving_percent=");
            sb.append(this.h);
            if (this.i != null) {
                sb.append("&custom_charging_arguments=");
                sb.append(this.i);
            }
            if (this.j > 0) {
                sb.append("&waypoints_arriving_percent=");
                sb.append(this.j);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public class AlternativeRoute {
        public static final int ALTERNATIVE_ROUTE_ONE = 1;
        public static final int ALTERNATIVE_ROUTE_THREE = 3;
        public static final int ALTERNATIVE_ROUTE_TWO = 2;

        public AlternativeRoute() {
        }
    }

    public static class WalkRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<WalkRouteQuery> CREATOR = new Parcelable.Creator<WalkRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.WalkRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ WalkRouteQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ WalkRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static WalkRouteQuery a(Parcel parcel) {
                return new WalkRouteQuery(parcel);
            }

            private static WalkRouteQuery[] a(int i) {
                return new WalkRouteQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FromAndTo f3820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3822c;
        private int d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public WalkRouteQuery(FromAndTo fromAndTo) {
            this.f3821b = 1;
            this.f3822c = false;
            this.d = 1;
            this.f3820a = fromAndTo;
        }

        public FromAndTo getFromAndTo() {
            return this.f3820a;
        }

        public boolean isIndoor() {
            return this.f3822c;
        }

        public void setIndoor(boolean z) {
            this.f3822c = z;
        }

        public int getAlternativeRoute() {
            return this.d;
        }

        public void setAlternativeRoute(int i) {
            this.d = i;
        }

        public int getShowFields() {
            return this.f3821b;
        }

        public void setShowFields(int i) {
            this.f3821b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3820a, i);
            parcel.writeBooleanArray(new boolean[]{this.f3822c});
            parcel.writeInt(this.d);
            parcel.writeInt(this.f3821b);
        }

        public WalkRouteQuery(Parcel parcel) {
            this.f3821b = 1;
            this.f3822c = false;
            this.d = 1;
            this.f3820a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            boolean[] zArr = new boolean[1];
            parcel.readBooleanArray(zArr);
            this.f3822c = zArr[0];
            this.d = parcel.readInt();
            this.f3821b = parcel.readInt();
        }

        public WalkRouteQuery() {
            this.f3821b = 1;
            this.f3822c = false;
            this.d = 1;
        }

        public int hashCode() {
            int iHashCode = this.f3820a.hashCode();
            return (((((iHashCode * 31) + this.f3821b) * 31) + (this.f3822c ? 1 : 0)) * 31) + this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            if (this.f3821b == walkRouteQuery.f3821b && this.f3822c == walkRouteQuery.f3822c && this.d == walkRouteQuery.d) {
                return this.f3820a.equals(walkRouteQuery.f3820a);
            }
            return false;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public WalkRouteQuery m786clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearchV2", "WalkRouteQueryclone");
            }
            WalkRouteQuery walkRouteQuery = new WalkRouteQuery(this.f3820a);
            walkRouteQuery.setShowFields(this.f3821b);
            walkRouteQuery.setIndoor(this.f3822c);
            walkRouteQuery.setAlternativeRoute(this.d);
            return walkRouteQuery;
        }
    }

    public static class DriveRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DriveRouteQuery> CREATOR = new Parcelable.Creator<DriveRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.DriveRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DriveRouteQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DriveRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static DriveRouteQuery a(Parcel parcel) {
                return new DriveRouteQuery(parcel);
            }

            private static DriveRouteQuery[] a(int i) {
                return new DriveRouteQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FromAndTo f3797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private NewEnergy f3798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3799c;
        private List<LatLonPoint> d;
        private List<List<LatLonPoint>> e;
        private String f;
        private boolean g;
        private int h;
        private String i;
        private int j;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public DriveRouteQuery(FromAndTo fromAndTo, DrivingStrategy drivingStrategy, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
            this.f3799c = DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
            this.f3797a = fromAndTo;
            this.f3799c = drivingStrategy.getValue();
            this.d = list;
            this.e = list2;
            this.f = str;
        }

        public NewEnergy getNewEnergy() {
            return this.f3798b;
        }

        public void setNewEnergy(NewEnergy newEnergy) {
            this.f3798b = newEnergy;
        }

        public FromAndTo getFromAndTo() {
            return this.f3797a;
        }

        public DrivingStrategy getMode() {
            return DrivingStrategy.fromValue(this.f3799c);
        }

        public int getCarType() {
            return this.h;
        }

        public List<LatLonPoint> getPassedByPoints() {
            return this.d;
        }

        public List<List<LatLonPoint>> getAvoidpolygons() {
            return this.e;
        }

        public String getAvoidRoad() {
            return this.f;
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<LatLonPoint> list = this.d;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.d.size(); i++) {
                LatLonPoint latLonPoint = this.d.get(i);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i < this.d.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            return stringBuffer.toString();
        }

        public boolean hasPassPoint() {
            return !fu.a(getPassedPointStr());
        }

        public String getAvoidpolygonsStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<List<LatLonPoint>> list = this.e;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.e.size(); i++) {
                List<LatLonPoint> list2 = this.e.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    LatLonPoint latLonPoint = list2.get(i2);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(",");
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i2 < list2.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                if (i < this.e.size() - 1) {
                    stringBuffer.append("|");
                }
            }
            return stringBuffer.toString();
        }

        public boolean hasAvoidpolygons() {
            return !fu.a(getAvoidpolygonsStr());
        }

        public boolean hasAvoidRoad() {
            return !fu.a(getAvoidRoad());
        }

        public String getExclude() {
            return this.i;
        }

        public void setExclude(String str) {
            this.i = str;
        }

        public int getShowFields() {
            return this.j;
        }

        public void setShowFields(int i) {
            this.j = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3797a, i);
            parcel.writeInt(this.f3799c);
            parcel.writeTypedList(this.d);
            List<List<LatLonPoint>> list = this.e;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(list.size());
                Iterator<List<LatLonPoint>> it = this.e.iterator();
                while (it.hasNext()) {
                    parcel.writeTypedList(it.next());
                }
            }
            parcel.writeString(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h);
            parcel.writeString(this.i);
            parcel.writeInt(this.j);
        }

        public DriveRouteQuery(Parcel parcel) {
            this.f3799c = DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
            this.f3797a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3799c = parcel.readInt();
            this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            int i = parcel.readInt();
            if (i == 0) {
                this.e = null;
            } else {
                this.e = new ArrayList();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.e.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
            }
            this.f = parcel.readString();
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt();
            this.i = parcel.readString();
            this.j = parcel.readInt();
        }

        public DriveRouteQuery() {
            this.f3799c = DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
        }

        public int hashCode() {
            String str = this.f;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<List<LatLonPoint>> list = this.e;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            FromAndTo fromAndTo = this.f3797a;
            int iHashCode3 = fromAndTo == null ? 0 : fromAndTo.hashCode();
            int i = this.f3799c;
            List<LatLonPoint> list2 = this.d;
            return ((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DriveRouteQuery driveRouteQuery = (DriveRouteQuery) obj;
            String str = this.f;
            if (str == null) {
                if (driveRouteQuery.f != null) {
                    return false;
                }
            } else if (!str.equals(driveRouteQuery.f)) {
                return false;
            }
            List<List<LatLonPoint>> list = this.e;
            if (list == null) {
                if (driveRouteQuery.e != null) {
                    return false;
                }
            } else if (!list.equals(driveRouteQuery.e)) {
                return false;
            }
            FromAndTo fromAndTo = this.f3797a;
            if (fromAndTo == null) {
                if (driveRouteQuery.f3797a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(driveRouteQuery.f3797a)) {
                return false;
            }
            if (this.f3799c != driveRouteQuery.f3799c) {
                return false;
            }
            List<LatLonPoint> list2 = this.d;
            if (list2 == null) {
                if (driveRouteQuery.d != null) {
                    return false;
                }
            } else if (!list2.equals(driveRouteQuery.d) || this.g != driveRouteQuery.isUseFerry() || this.h != driveRouteQuery.h || this.j != driveRouteQuery.j) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DriveRouteQuery m783clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearchV2", "DriveRouteQueryclone");
            }
            DriveRouteQuery driveRouteQuery = new DriveRouteQuery(this.f3797a, DrivingStrategy.fromValue(this.f3799c), this.d, this.e, this.f);
            driveRouteQuery.setUseFerry(this.g);
            driveRouteQuery.setCarType(this.h);
            driveRouteQuery.setExclude(this.i);
            driveRouteQuery.setShowFields(this.j);
            driveRouteQuery.setNewEnergy(this.f3798b);
            return driveRouteQuery;
        }

        public boolean isUseFerry() {
            return this.g;
        }

        public void setUseFerry(boolean z) {
            this.g = z;
        }

        public void setCarType(int i) {
            this.h = i;
        }
    }

    public static class RideRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<RideRouteQuery> CREATOR = new Parcelable.Creator<RideRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.RideRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RideRouteQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RideRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static RideRouteQuery a(Parcel parcel) {
                return new RideRouteQuery(parcel);
            }

            private static RideRouteQuery[] a(int i) {
                return new RideRouteQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FromAndTo f3811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3813c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RideRouteQuery(FromAndTo fromAndTo) {
            this.f3812b = 1;
            this.f3813c = 1;
            this.f3811a = fromAndTo;
        }

        public FromAndTo getFromAndTo() {
            return this.f3811a;
        }

        public int getShowFields() {
            return this.f3812b;
        }

        public void setShowFields(int i) {
            this.f3812b = i;
        }

        public int getAlternativeRoute() {
            return this.f3813c;
        }

        public void setAlternativeRoute(int i) {
            this.f3813c = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3811a, i);
            parcel.writeInt(this.f3813c);
            parcel.writeInt(this.f3812b);
        }

        public RideRouteQuery(Parcel parcel) {
            this.f3812b = 1;
            this.f3813c = 1;
            this.f3811a = (FromAndTo) parcel.readParcelable(RouteSearch.FromAndTo.class.getClassLoader());
            this.f3813c = parcel.readInt();
            this.f3812b = parcel.readInt();
        }

        public RideRouteQuery() {
            this.f3812b = 1;
            this.f3813c = 1;
        }

        public int hashCode() {
            FromAndTo fromAndTo = this.f3811a;
            return (((((fromAndTo == null ? 0 : fromAndTo.hashCode()) + 31) * 31) + this.f3812b) * 31) + this.f3813c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RideRouteQuery rideRouteQuery = (RideRouteQuery) obj;
            FromAndTo fromAndTo = this.f3811a;
            if (fromAndTo == null) {
                if (rideRouteQuery.f3811a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(rideRouteQuery.f3811a)) {
                return false;
            }
            return this.f3812b == rideRouteQuery.f3812b && this.f3813c == rideRouteQuery.f3813c;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public RideRouteQuery m785clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearchV2", "RideRouteQueryclone");
            }
            RideRouteQuery rideRouteQuery = new RideRouteQuery(this.f3811a);
            rideRouteQuery.setShowFields(this.f3812b);
            rideRouteQuery.setAlternativeRoute(this.f3813c);
            return rideRouteQuery;
        }
    }

    public static class BusRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<BusRouteQuery> CREATOR = new Parcelable.Creator<BusRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.BusRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ BusRouteQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ BusRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static BusRouteQuery a(Parcel parcel) {
                return new BusRouteQuery(parcel);
            }

            private static BusRouteQuery[] a(int i) {
                return new BusRouteQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FromAndTo f3789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3791c;
        private String d;
        private String e;
        private String f;
        private int g;
        private String h;
        private String i;
        private String j;
        private String k;
        private int l;
        private int m;
        private int n;
        private int o;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BusRouteQuery(FromAndTo fromAndTo, int i, String str, int i2) {
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
            this.f3789a = fromAndTo;
            this.f3790b = i;
            this.f3791c = str;
            this.g = i2;
        }

        public FromAndTo getFromAndTo() {
            return this.f3789a;
        }

        public int getMode() {
            return this.f3790b;
        }

        public String getCity() {
            return this.f3791c;
        }

        public int getNightFlag() {
            return this.g;
        }

        public String getCityd() {
            return this.d;
        }

        public void setCityd(String str) {
            this.d = str;
        }

        public int getShowFields() {
            return this.o;
        }

        public void setShowFields(int i) {
            this.o = i;
        }

        public String getDate() {
            return this.e;
        }

        public void setDate(String str) {
            this.e = str;
        }

        public String getTime() {
            return this.f;
        }

        public void setTime(String str) {
            this.f = str;
        }

        public String getOriginPoiId() {
            return this.h;
        }

        public void setOriginPoiId(String str) {
            this.h = str;
        }

        public String getDestinationPoiId() {
            return this.i;
        }

        public void setDestinationPoiId(String str) {
            this.i = str;
        }

        public String getAd1() {
            return this.j;
        }

        public void setAd1(String str) {
            this.j = str;
        }

        public String getAd2() {
            return this.k;
        }

        public void setAd2(String str) {
            this.k = str;
        }

        public int getAlternativeRoute() {
            return this.l;
        }

        public void setAlternativeRoute(int i) {
            this.l = i;
        }

        public int getMultiExport() {
            return this.m;
        }

        public void setMultiExport(int i) {
            this.m = i;
        }

        public int getMaxTrans() {
            return this.n;
        }

        public void setMaxTrans(int i) {
            this.n = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3789a, i);
            parcel.writeInt(this.f3790b);
            parcel.writeString(this.f3791c);
            parcel.writeInt(this.g);
            parcel.writeString(this.d);
            parcel.writeInt(this.o);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.n);
            parcel.writeInt(this.m);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public BusRouteQuery(Parcel parcel) {
            this.f3790b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
            this.f3789a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3790b = parcel.readInt();
            this.f3791c = parcel.readString();
            this.g = parcel.readInt();
            this.d = parcel.readString();
            this.o = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.n = parcel.readInt();
            this.m = parcel.readInt();
            this.l = parcel.readInt();
            this.j = parcel.readString();
            this.k = parcel.readString();
        }

        public BusRouteQuery() {
            this.f3790b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
        }

        public int hashCode() {
            int iHashCode = this.f3789a.hashCode();
            int i = this.f3790b;
            int iHashCode2 = this.f3791c.hashCode();
            int iHashCode3 = this.d.hashCode();
            int iHashCode4 = this.e.hashCode();
            int iHashCode5 = this.f.hashCode();
            int i2 = this.g;
            int iHashCode6 = this.h.hashCode();
            int iHashCode7 = this.i.hashCode();
            int iHashCode8 = this.j.hashCode();
            int iHashCode9 = this.k.hashCode();
            int i3 = this.l;
            return (((((((((((((((((((((((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + i3) * 31) + this.m) * 31) + this.n) * 31) + this.o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusRouteQuery busRouteQuery = (BusRouteQuery) obj;
            if (this.f3790b == busRouteQuery.f3790b && this.g == busRouteQuery.g && this.h.equals(busRouteQuery.h) && this.i.equals(busRouteQuery.i) && this.l == busRouteQuery.l && this.m == busRouteQuery.m && this.n == busRouteQuery.n && this.o == busRouteQuery.o && this.f3789a.equals(busRouteQuery.f3789a) && this.f3791c.equals(busRouteQuery.f3791c) && this.d.equals(busRouteQuery.d) && this.e.equals(busRouteQuery.e) && this.f.equals(busRouteQuery.f) && this.j.equals(busRouteQuery.j)) {
                return this.k.equals(busRouteQuery.k);
            }
            return false;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BusRouteQuery m782clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearchV2", "BusRouteQueryclone");
            }
            BusRouteQuery busRouteQuery = new BusRouteQuery(this.f3789a, this.f3790b, this.f3791c, this.g);
            busRouteQuery.setCityd(this.d);
            busRouteQuery.setShowFields(this.o);
            busRouteQuery.setDate(this.e);
            busRouteQuery.setTime(this.f);
            busRouteQuery.setAd1(this.j);
            busRouteQuery.setAd2(this.k);
            busRouteQuery.setOriginPoiId(this.h);
            busRouteQuery.setDestinationPoiId(this.i);
            busRouteQuery.setMaxTrans(this.n);
            busRouteQuery.setMultiExport(this.m);
            busRouteQuery.setAlternativeRoute(this.l);
            return busRouteQuery;
        }
    }
}
