package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.hy;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IRouteSearch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RouteSearch {
    public static final int BUS_COMFORTABLE = 4;
    public static final int BUS_DEFAULT = 0;
    public static final int BUS_LEASE_CHANGE = 2;
    public static final int BUS_LEASE_WALK = 3;
    public static final int BUS_NO_SUBWAY = 5;
    public static final int BUS_SAVE_MONEY = 1;
    public static final int BusComfortable = 4;
    public static final int BusDefault = 0;
    public static final int BusLeaseChange = 2;
    public static final int BusLeaseWalk = 3;
    public static final int BusNoSubway = 5;
    public static final int BusSaveMoney = 1;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_CHOICE_HIGHWAY = 9;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_FASTEST_SAVE_MONEY = 11;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_NO_HIGHWAY = 4;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_SAVE_MONEY = 6;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_SAVE_MONEY_NO_HIGHWAY = 7;
    public static final int DRIVEING_PLAN_CHOICE_HIGHWAY = 8;
    public static final int DRIVEING_PLAN_DEFAULT = 1;
    public static final int DRIVEING_PLAN_FASTEST_SHORTEST = 10;
    public static final int DRIVEING_PLAN_NO_HIGHWAY = 2;
    public static final int DRIVEING_PLAN_SAVE_MONEY = 3;
    public static final int DRIVEING_PLAN_SAVE_MONEY_NO_HIGHWAY = 5;
    public static final String DRIVING_EXCLUDE_FERRY = "ferry";
    public static final String DRIVING_EXCLUDE_MOTORWAY = "motorway";
    public static final String DRIVING_EXCLUDE_TOLL = "toll";
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION = 12;
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION_NO_HIGHWAY = 15;
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION_NO_HIGHWAY_SAVE_MONEY = 18;
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION_SAVE_MONEY = 17;
    public static final int DRIVING_MULTI_CHOICE_HIGHWAY = 19;
    public static final int DRIVING_MULTI_CHOICE_HIGHWAY_AVOID_CONGESTION = 20;
    public static final int DRIVING_MULTI_CHOICE_NO_HIGHWAY = 13;
    public static final int DRIVING_MULTI_CHOICE_SAVE_MONEY = 14;
    public static final int DRIVING_MULTI_CHOICE_SAVE_MONEY_NO_HIGHWAY = 16;
    public static final int DRIVING_MULTI_STRATEGY_FASTEST_SAVE_MONEY_SHORTEST = 5;
    public static final int DRIVING_MULTI_STRATEGY_FASTEST_SHORTEST = 11;
    public static final int DRIVING_MULTI_STRATEGY_FASTEST_SHORTEST_AVOID_CONGESTION = 10;
    public static final int DRIVING_NORMAL_CAR = 0;
    public static final int DRIVING_PLUGIN_HYBRID_CAR = 2;
    public static final int DRIVING_PURE_ELECTRIC_VEHICLE = 1;
    public static final int DRIVING_SINGLE_AVOID_CONGESTION = 4;
    public static final int DRIVING_SINGLE_DEFAULT = 0;
    public static final int DRIVING_SINGLE_NO_EXPRESSWAYS = 3;
    public static final int DRIVING_SINGLE_NO_HIGHWAY = 6;
    public static final int DRIVING_SINGLE_NO_HIGHWAY_SAVE_MONEY = 7;
    public static final int DRIVING_SINGLE_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 9;
    public static final int DRIVING_SINGLE_SAVE_MONEY = 1;
    public static final int DRIVING_SINGLE_SAVE_MONEY_AVOID_CONGESTION = 8;
    public static final int DRIVING_SINGLE_SHORTEST = 2;
    public static final int DrivingAvoidCongestion = 4;
    public static final int DrivingDefault = 0;
    public static final int DrivingMultiStrategy = 5;
    public static final int DrivingNoExpressways = 3;
    public static final int DrivingNoHighAvoidCongestionSaveMoney = 9;
    public static final int DrivingNoHighWay = 6;
    public static final int DrivingNoHighWaySaveMoney = 7;
    public static final int DrivingSaveMoney = 1;
    public static final int DrivingSaveMoneyAvoidCongestion = 8;
    public static final int DrivingShortDistance = 2;
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public static final int RIDING_DEFAULT = 0;
    public static final int RIDING_FAST = 2;
    public static final int RIDING_RECOMMEND = 1;
    public static final int RidingDefault = 0;
    public static final int RidingFast = 2;
    public static final int RidingRecommend = 1;
    public static final int TRUCK_AVOID_CONGESTION = 1;
    public static final int TRUCK_AVOID_CONGESTION_CHOICE_HIGHWAY = 9;
    public static final int TRUCK_AVOID_CONGESTION_NO_HIGHWAY = 4;
    public static final int TRUCK_AVOID_CONGESTION__SAVE_MONEY = 6;
    public static final int TRUCK_AVOID_CONGESTION__SAVE_MONEY_NO_HIGHWAY = 7;
    public static final int TRUCK_CHOICE_HIGHWAY = 8;
    public static final int TRUCK_NO_HIGHWAY = 2;
    public static final int TRUCK_SAVE_MONEY = 3;
    public static final int TRUCK_SAVE_MONEY_NO_HIGHWAY = 5;
    public static final int TRUCK_SIZE_HEAVY = 4;
    public static final int TRUCK_SIZE_LIGHT = 2;
    public static final int TRUCK_SIZE_MEDIUM = 3;
    public static final int TRUCK_SIZE_MINI = 1;
    public static final int WALK_DEFAULT = 0;
    public static final int WALK_MULTI_PATH = 1;
    public static final int WalkDefault = 0;
    public static final int WalkMultipath = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IRouteSearch f3764a;

    public interface OnRoutePlanSearchListener {
        void onDriveRoutePlanSearched(DriveRoutePlanResult driveRoutePlanResult, int i);
    }

    public interface OnRouteSearchListener {
        void onBusRouteSearched(BusRouteResult busRouteResult, int i);

        void onDriveRouteSearched(DriveRouteResult driveRouteResult, int i);

        void onRideRouteSearched(RideRouteResult rideRouteResult, int i);

        void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i);
    }

    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(TruckRouteRestult truckRouteRestult, int i);
    }

    public RouteSearch(Context context) throws AMapException {
        if (this.f3764a == null) {
            try {
                this.f3764a = new hy(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public void setRouteSearchListener(OnRouteSearchListener onRouteSearchListener) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.setRouteSearchListener(onRouteSearchListener);
        }
    }

    public void setOnTruckRouteSearchListener(OnTruckRouteSearchListener onTruckRouteSearchListener) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.setOnTruckRouteSearchListener(onTruckRouteSearchListener);
        }
    }

    public void setOnRoutePlanSearchListener(OnRoutePlanSearchListener onRoutePlanSearchListener) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.setOnRoutePlanSearchListener(onRoutePlanSearchListener);
        }
    }

    public WalkRouteResult calculateWalkRoute(WalkRouteQuery walkRouteQuery) throws AMapException {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateWalkRoute(walkRouteQuery);
        }
        return null;
    }

    public void calculateWalkRouteAsyn(WalkRouteQuery walkRouteQuery) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateWalkRouteAsyn(walkRouteQuery);
        }
    }

    public BusRouteResult calculateBusRoute(BusRouteQuery busRouteQuery) throws AMapException {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateBusRoute(busRouteQuery);
        }
        return null;
    }

    public void calculateBusRouteAsyn(BusRouteQuery busRouteQuery) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateBusRouteAsyn(busRouteQuery);
        }
    }

    public DriveRouteResult calculateDriveRoute(DriveRouteQuery driveRouteQuery) throws AMapException {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateDriveRoute(driveRouteQuery);
        }
        return null;
    }

    public void calculateDriveRouteAsyn(DriveRouteQuery driveRouteQuery) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateDriveRouteAsyn(driveRouteQuery);
        }
    }

    public void calculateRideRouteAsyn(RideRouteQuery rideRouteQuery) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateRideRouteAsyn(rideRouteQuery);
        }
    }

    public RideRouteResult calculateRideRoute(RideRouteQuery rideRouteQuery) throws AMapException {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateRideRoute(rideRouteQuery);
        }
        return null;
    }

    public TruckRouteRestult calculateTruckRoute(TruckRouteQuery truckRouteQuery) throws AMapException {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateTruckRoute(truckRouteQuery);
        }
        return null;
    }

    public void calculateTruckRouteAsyn(TruckRouteQuery truckRouteQuery) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateTruckRouteAsyn(truckRouteQuery);
        }
    }

    public DriveRoutePlanResult calculateDrivePlan(DrivePlanQuery drivePlanQuery) throws AMapException {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateDrivePlan(drivePlanQuery);
        }
        return null;
    }

    public void calculateDrivePlanAsyn(DrivePlanQuery drivePlanQuery) {
        IRouteSearch iRouteSearch = this.f3764a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateDrivePlanAsyn(drivePlanQuery);
        }
    }

    public static class FromAndTo implements Parcelable, Cloneable {
        public static final Parcelable.Creator<FromAndTo> CREATOR = new Parcelable.Creator<FromAndTo>() { // from class: com.amap.api.services.route.RouteSearch.FromAndTo.1
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
        private LatLonPoint f3774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f3775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3776c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f3774a = latLonPoint;
            this.f3775b = latLonPoint2;
        }

        public LatLonPoint getFrom() {
            return this.f3774a;
        }

        public LatLonPoint getTo() {
            return this.f3775b;
        }

        public String getStartPoiID() {
            return this.f3776c;
        }

        public void setStartPoiID(String str) {
            this.f3776c = str;
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

        public String getPlateProvince() {
            return this.g;
        }

        public void setPlateProvince(String str) {
            this.g = str;
        }

        public String getPlateNumber() {
            return this.h;
        }

        public void setPlateNumber(String str) {
            this.h = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3774a, i);
            parcel.writeParcelable(this.f3775b, i);
            parcel.writeString(this.f3776c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public FromAndTo(Parcel parcel) {
            this.f3774a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f3775b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f3776c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        }

        public FromAndTo() {
        }

        public int hashCode() {
            String str = this.d;
            int iHashCode = str == null ? 0 : str.hashCode();
            LatLonPoint latLonPoint = this.f3774a;
            int iHashCode2 = latLonPoint == null ? 0 : latLonPoint.hashCode();
            String str2 = this.f3776c;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            LatLonPoint latLonPoint2 = this.f3775b;
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
            LatLonPoint latLonPoint = this.f3774a;
            if (latLonPoint == null) {
                if (fromAndTo.f3774a != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(fromAndTo.f3774a)) {
                return false;
            }
            String str2 = this.f3776c;
            if (str2 == null) {
                if (fromAndTo.f3776c != null) {
                    return false;
                }
            } else if (!str2.equals(fromAndTo.f3776c)) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.f3775b;
            if (latLonPoint2 == null) {
                if (fromAndTo.f3775b != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(fromAndTo.f3775b)) {
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
        public FromAndTo m778clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "FromAndToclone");
            }
            FromAndTo fromAndTo = new FromAndTo(this.f3774a, this.f3775b);
            fromAndTo.setStartPoiID(this.f3776c);
            fromAndTo.setDestinationPoiID(this.d);
            fromAndTo.setOriginType(this.e);
            fromAndTo.setDestinationType(this.f);
            return fromAndTo;
        }
    }

    public static class BusRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<BusRouteQuery> CREATOR = new Parcelable.Creator<BusRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.BusRouteQuery.1
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
        private FromAndTo f3765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3767c;
        private String d;
        private int e;
        private String f;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BusRouteQuery(FromAndTo fromAndTo, int i, String str, int i2) {
            this.f = "base";
            this.f3765a = fromAndTo;
            this.f3766b = i;
            this.f3767c = str;
            this.e = i2;
        }

        public FromAndTo getFromAndTo() {
            return this.f3765a;
        }

        public int getMode() {
            return this.f3766b;
        }

        public String getCity() {
            return this.f3767c;
        }

        public int getNightFlag() {
            return this.e;
        }

        public String getCityd() {
            return this.d;
        }

        public void setCityd(String str) {
            this.d = str;
        }

        public String getExtensions() {
            return this.f;
        }

        public void setExtensions(String str) {
            this.f = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3765a, i);
            parcel.writeInt(this.f3766b);
            parcel.writeString(this.f3767c);
            parcel.writeInt(this.e);
            parcel.writeString(this.d);
            parcel.writeString(this.f);
        }

        public BusRouteQuery(Parcel parcel) {
            this.f = "base";
            this.f3765a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3766b = parcel.readInt();
            this.f3767c = parcel.readString();
            this.e = parcel.readInt();
            this.d = parcel.readString();
            this.f = parcel.readString();
        }

        public BusRouteQuery() {
            this.f = "base";
        }

        public int hashCode() {
            String str = this.f3767c;
            int iHashCode = str == null ? 0 : str.hashCode();
            FromAndTo fromAndTo = this.f3765a;
            int iHashCode2 = fromAndTo == null ? 0 : fromAndTo.hashCode();
            int i = this.f3766b;
            int i2 = this.e;
            String str2 = this.d;
            return ((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + i) * 31) + i2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusRouteQuery busRouteQuery = (BusRouteQuery) obj;
            String str = this.f3767c;
            if (str == null) {
                if (busRouteQuery.f3767c != null) {
                    return false;
                }
            } else if (!str.equals(busRouteQuery.f3767c)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null) {
                if (busRouteQuery.d != null) {
                    return false;
                }
            } else if (!str2.equals(busRouteQuery.d)) {
                return false;
            }
            String str3 = this.f;
            if (str3 == null) {
                if (busRouteQuery.f != null) {
                    return false;
                }
            } else if (!str3.equals(busRouteQuery.f)) {
                return false;
            }
            FromAndTo fromAndTo = this.f3765a;
            if (fromAndTo == null) {
                if (busRouteQuery.f3765a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(busRouteQuery.f3765a)) {
                return false;
            }
            return this.f3766b == busRouteQuery.f3766b && this.e == busRouteQuery.e;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BusRouteQuery m775clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "BusRouteQueryclone");
            }
            BusRouteQuery busRouteQuery = new BusRouteQuery(this.f3765a, this.f3766b, this.f3767c, this.e);
            busRouteQuery.setCityd(this.d);
            busRouteQuery.setExtensions(this.f);
            return busRouteQuery;
        }
    }

    public static class WalkRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<WalkRouteQuery> CREATOR = new Parcelable.Creator<WalkRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.WalkRouteQuery.1
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
        private FromAndTo f3783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3785c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public WalkRouteQuery(FromAndTo fromAndTo, int i) {
            this.f3785c = "base";
            this.f3783a = fromAndTo;
            this.f3784b = i;
        }

        public WalkRouteQuery(FromAndTo fromAndTo) {
            this.f3785c = "base";
            this.f3783a = fromAndTo;
        }

        public FromAndTo getFromAndTo() {
            return this.f3783a;
        }

        public int getMode() {
            return this.f3784b;
        }

        public String getExtensions() {
            return this.f3785c;
        }

        public void setExtensions(String str) {
            this.f3785c = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3783a, i);
            parcel.writeInt(this.f3784b);
            parcel.writeString(this.f3785c);
        }

        public WalkRouteQuery(Parcel parcel) {
            this.f3785c = "base";
            this.f3783a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3784b = parcel.readInt();
            this.f3785c = parcel.readString();
        }

        public WalkRouteQuery() {
            this.f3785c = "base";
        }

        public int hashCode() {
            FromAndTo fromAndTo = this.f3783a;
            return (((fromAndTo == null ? 0 : fromAndTo.hashCode()) + 31) * 31) + this.f3784b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            FromAndTo fromAndTo = this.f3783a;
            if (fromAndTo == null) {
                if (walkRouteQuery.f3783a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(walkRouteQuery.f3783a)) {
                return false;
            }
            String str = this.f3785c;
            if (str == null) {
                if (walkRouteQuery.f3785c != null) {
                    return false;
                }
            } else if (!str.equals(walkRouteQuery.f3785c)) {
                return false;
            }
            return this.f3784b == walkRouteQuery.f3784b;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public WalkRouteQuery m781clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "WalkRouteQueryclone");
            }
            WalkRouteQuery walkRouteQuery = new WalkRouteQuery(this.f3783a);
            walkRouteQuery.setExtensions(this.f3785c);
            return walkRouteQuery;
        }
    }

    public static class DriveRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DriveRouteQuery> CREATOR = new Parcelable.Creator<DriveRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.DriveRouteQuery.1
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
        private FromAndTo f3771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<LatLonPoint> f3773c;
        private List<List<LatLonPoint>> d;
        private String e;
        private boolean f;
        private int g;
        private String h;
        private String i;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public DriveRouteQuery(FromAndTo fromAndTo, int i, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
            this.f = true;
            this.g = 0;
            this.h = null;
            this.i = "base";
            this.f3771a = fromAndTo;
            this.f3772b = i;
            this.f3773c = list;
            this.d = list2;
            this.e = str;
        }

        public FromAndTo getFromAndTo() {
            return this.f3771a;
        }

        public int getMode() {
            return this.f3772b;
        }

        public int getCarType() {
            return this.g;
        }

        public List<LatLonPoint> getPassedByPoints() {
            return this.f3773c;
        }

        public List<List<LatLonPoint>> getAvoidpolygons() {
            return this.d;
        }

        public String getAvoidRoad() {
            return this.e;
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<LatLonPoint> list = this.f3773c;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.f3773c.size(); i++) {
                LatLonPoint latLonPoint = this.f3773c.get(i);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i < this.f3773c.size() - 1) {
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
            List<List<LatLonPoint>> list = this.d;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.d.size(); i++) {
                List<LatLonPoint> list2 = this.d.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    LatLonPoint latLonPoint = list2.get(i2);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(",");
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i2 < list2.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                if (i < this.d.size() - 1) {
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
            return this.h;
        }

        public void setExclude(String str) {
            this.h = str;
        }

        public String getExtensions() {
            return this.i;
        }

        public void setExtensions(String str) {
            this.i = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3771a, i);
            parcel.writeInt(this.f3772b);
            parcel.writeTypedList(this.f3773c);
            List<List<LatLonPoint>> list = this.d;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(list.size());
                Iterator<List<LatLonPoint>> it = this.d.iterator();
                while (it.hasNext()) {
                    parcel.writeTypedList(it.next());
                }
            }
            parcel.writeString(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }

        public DriveRouteQuery(Parcel parcel) {
            this.f = true;
            this.g = 0;
            this.h = null;
            this.i = "base";
            this.f3771a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3772b = parcel.readInt();
            this.f3773c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            int i = parcel.readInt();
            if (i == 0) {
                this.d = null;
            } else {
                this.d = new ArrayList();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.d.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
            }
            this.e = parcel.readString();
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readString();
        }

        public DriveRouteQuery() {
            this.f = true;
            this.g = 0;
            this.h = null;
            this.i = "base";
        }

        public int hashCode() {
            String str = this.e;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<List<LatLonPoint>> list = this.d;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            FromAndTo fromAndTo = this.f3771a;
            int iHashCode3 = fromAndTo == null ? 0 : fromAndTo.hashCode();
            int i = this.f3772b;
            List<LatLonPoint> list2 = this.f3773c;
            return ((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DriveRouteQuery driveRouteQuery = (DriveRouteQuery) obj;
            String str = this.e;
            if (str == null) {
                if (driveRouteQuery.e != null) {
                    return false;
                }
            } else if (!str.equals(driveRouteQuery.e)) {
                return false;
            }
            List<List<LatLonPoint>> list = this.d;
            if (list == null) {
                if (driveRouteQuery.d != null) {
                    return false;
                }
            } else if (!list.equals(driveRouteQuery.d)) {
                return false;
            }
            FromAndTo fromAndTo = this.f3771a;
            if (fromAndTo == null) {
                if (driveRouteQuery.f3771a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(driveRouteQuery.f3771a)) {
                return false;
            }
            if (this.f3772b != driveRouteQuery.f3772b) {
                return false;
            }
            List<LatLonPoint> list2 = this.f3773c;
            if (list2 == null) {
                if (driveRouteQuery.f3773c != null) {
                    return false;
                }
            } else if (!list2.equals(driveRouteQuery.f3773c) || this.f != driveRouteQuery.isUseFerry() || this.g != driveRouteQuery.g) {
                return false;
            }
            String str2 = this.i;
            if (str2 == null) {
                if (driveRouteQuery.i != null) {
                    return false;
                }
            } else if (!str2.equals(driveRouteQuery.i)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DriveRouteQuery m777clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "DriveRouteQueryclone");
            }
            DriveRouteQuery driveRouteQuery = new DriveRouteQuery(this.f3771a, this.f3772b, this.f3773c, this.d, this.e);
            driveRouteQuery.setUseFerry(this.f);
            driveRouteQuery.setCarType(this.g);
            driveRouteQuery.setExclude(this.h);
            driveRouteQuery.setExtensions(this.i);
            return driveRouteQuery;
        }

        public boolean isUseFerry() {
            return this.f;
        }

        public void setUseFerry(boolean z) {
            this.f = z;
        }

        public void setCarType(int i) {
            this.g = i;
        }
    }

    public static class RideRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<RideRouteQuery> CREATOR = new Parcelable.Creator<RideRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.RideRouteQuery.1
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
        private FromAndTo f3777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3779c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RideRouteQuery(FromAndTo fromAndTo, int i) {
            this.f3779c = "base";
            this.f3777a = fromAndTo;
            this.f3778b = i;
        }

        public RideRouteQuery(FromAndTo fromAndTo) {
            this.f3779c = "base";
            this.f3777a = fromAndTo;
        }

        public FromAndTo getFromAndTo() {
            return this.f3777a;
        }

        public int getMode() {
            return this.f3778b;
        }

        public String getExtensions() {
            return this.f3779c;
        }

        public void setExtensions(String str) {
            this.f3779c = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3777a, i);
            parcel.writeInt(this.f3778b);
            parcel.writeString(this.f3779c);
        }

        public RideRouteQuery(Parcel parcel) {
            this.f3779c = "base";
            this.f3777a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3778b = parcel.readInt();
            this.f3779c = parcel.readString();
        }

        public RideRouteQuery() {
            this.f3779c = "base";
        }

        public int hashCode() {
            FromAndTo fromAndTo = this.f3777a;
            return (((fromAndTo == null ? 0 : fromAndTo.hashCode()) + 31) * 31) + this.f3778b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RideRouteQuery rideRouteQuery = (RideRouteQuery) obj;
            FromAndTo fromAndTo = this.f3777a;
            if (fromAndTo == null) {
                if (rideRouteQuery.f3777a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(rideRouteQuery.f3777a)) {
                return false;
            }
            return this.f3778b == rideRouteQuery.f3778b;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public RideRouteQuery m779clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "RideRouteQueryclone");
            }
            RideRouteQuery rideRouteQuery = new RideRouteQuery(this.f3777a);
            rideRouteQuery.setExtensions(this.f3779c);
            return rideRouteQuery;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class TruckRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<TruckRouteQuery> CREATOR = new Parcelable.Creator<TruckRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.TruckRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ TruckRouteQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ TruckRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static TruckRouteQuery a(Parcel parcel) {
                return new TruckRouteQuery(parcel);
            }

            private static TruckRouteQuery[] a(int i) {
                return new TruckRouteQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FromAndTo f3780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3782c;
        private List<LatLonPoint> d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private String j;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public TruckRouteQuery(FromAndTo fromAndTo, int i, List<LatLonPoint> list, int i2) {
            this.j = "base";
            this.f3780a = fromAndTo;
            this.f3782c = i;
            this.d = list;
            this.f3781b = i2;
        }

        protected TruckRouteQuery(Parcel parcel) {
            this.f3781b = 2;
            this.j = "base";
            this.f3780a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3781b = parcel.readInt();
            this.f3782c = parcel.readInt();
            this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.e = parcel.readFloat();
            this.f = parcel.readFloat();
            this.g = parcel.readFloat();
            this.h = parcel.readFloat();
            this.i = parcel.readFloat();
            this.j = parcel.readString();
        }

        public void setMode(int i) {
            this.f3782c = i;
        }

        public void setTruckSize(int i) {
            this.f3781b = i;
        }

        public void setTruckHeight(float f) {
            this.e = f;
        }

        public void setTruckWidth(float f) {
            this.f = f;
        }

        public void setTruckLoad(float f) {
            this.g = f;
        }

        public void setTruckWeight(float f) {
            this.h = f;
        }

        public void setTruckAxis(float f) {
            this.i = f;
        }

        public FromAndTo getFromAndTo() {
            return this.f3780a;
        }

        public int getMode() {
            return this.f3782c;
        }

        public String getExtensions() {
            return this.j;
        }

        public void setExtensions(String str) {
            this.j = str;
        }

        public boolean hasPassPoint() {
            return !fu.a(getPassedPointStr());
        }

        public List<LatLonPoint> getPassedByPoints() {
            return this.d;
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

        public int getTruckSize() {
            return this.f3781b;
        }

        public float getTruckHeight() {
            return this.e;
        }

        public float getTruckWidth() {
            return this.f;
        }

        public float getTruckLoad() {
            return this.g;
        }

        public float getTruckWeight() {
            return this.h;
        }

        public float getTruckAxis() {
            return this.i;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public TruckRouteQuery m780clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "TruckRouteQueryclone");
            }
            TruckRouteQuery truckRouteQuery = new TruckRouteQuery(this.f3780a, this.f3782c, this.d, this.f3781b);
            truckRouteQuery.setExtensions(this.j);
            return truckRouteQuery;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3780a, i);
            parcel.writeInt(this.f3781b);
            parcel.writeInt(this.f3782c);
            parcel.writeTypedList(this.d);
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
            parcel.writeFloat(this.g);
            parcel.writeFloat(this.h);
            parcel.writeFloat(this.i);
            parcel.writeString(this.j);
        }
    }

    public static class DrivePlanQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DrivePlanQuery> CREATOR = new Parcelable.Creator<DrivePlanQuery>() { // from class: com.amap.api.services.route.RouteSearch.DrivePlanQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DrivePlanQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DrivePlanQuery[] newArray(int i) {
                return a(i);
            }

            private static DrivePlanQuery a(Parcel parcel) {
                return new DrivePlanQuery(parcel);
            }

            private static DrivePlanQuery[] a(int i) {
                return new DrivePlanQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FromAndTo f3768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3770c;
        private int d;
        private int e;
        private int f;
        private int g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public DrivePlanQuery(FromAndTo fromAndTo, int i, int i2, int i3) {
            this.f3770c = 1;
            this.d = 0;
            this.f3768a = fromAndTo;
            this.e = i;
            this.f = i2;
            this.g = i3;
        }

        public FromAndTo getFromAndTo() {
            return this.f3768a;
        }

        public String getDestParentPoiID() {
            return this.f3769b;
        }

        public int getMode() {
            return this.f3770c;
        }

        public int getCarType() {
            return this.d;
        }

        public int getFirstTime() {
            return this.e;
        }

        public int getInterval() {
            return this.f;
        }

        public int getCount() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3768a, i);
            parcel.writeString(this.f3769b);
            parcel.writeInt(this.f3770c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public DrivePlanQuery() {
            this.f3770c = 1;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 48;
        }

        protected DrivePlanQuery(Parcel parcel) {
            this.f3770c = 1;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 48;
            this.f3768a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f3769b = parcel.readString();
            this.f3770c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        public int hashCode() {
            FromAndTo fromAndTo = this.f3768a;
            int iHashCode = fromAndTo == null ? 0 : fromAndTo.hashCode();
            String str = this.f3769b;
            int iHashCode2 = str != null ? str.hashCode() : 0;
            int i = this.f3770c;
            return ((((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + i) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DrivePlanQuery drivePlanQuery = (DrivePlanQuery) obj;
            FromAndTo fromAndTo = this.f3768a;
            if (fromAndTo == null) {
                if (drivePlanQuery.f3768a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(drivePlanQuery.f3768a)) {
                return false;
            }
            String str = this.f3769b;
            if (str == null) {
                if (drivePlanQuery.f3769b != null) {
                    return false;
                }
            } else if (!str.equals(drivePlanQuery.f3769b)) {
                return false;
            }
            return this.f3770c == drivePlanQuery.f3770c && this.d == drivePlanQuery.d && this.e == drivePlanQuery.e && this.f == drivePlanQuery.f && this.g == drivePlanQuery.g;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DrivePlanQuery m776clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "RouteSearch", "DriveRouteQueryclone");
            }
            DrivePlanQuery drivePlanQuery = new DrivePlanQuery(this.f3768a, this.e, this.f, this.g);
            drivePlanQuery.setDestParentPoiID(this.f3769b);
            drivePlanQuery.setMode(this.f3770c);
            drivePlanQuery.setCarType(this.d);
            return drivePlanQuery;
        }

        public void setDestParentPoiID(String str) {
            this.f3769b = str;
        }

        public void setMode(int i) {
            this.f3770c = i;
        }

        public void setCarType(int i) {
            this.d = i;
        }
    }
}
