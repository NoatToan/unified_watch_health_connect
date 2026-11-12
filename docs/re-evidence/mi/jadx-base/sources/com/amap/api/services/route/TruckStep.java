package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TruckStep implements Parcelable {
    public static final Parcelable.Creator<TruckStep> CREATOR = new Parcelable.Creator<TruckStep>() { // from class: com.amap.api.services.route.TruckStep.1
        private static TruckStep a(Parcel parcel) {
            return new TruckStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckStep[] newArray(int i) {
            return a(i);
        }

        private static TruckStep[] a(int i) {
            return new TruckStep[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6773b;
    private String c;
    private float d;
    private float e;
    private float f;
    private String g;
    private float h;
    private List<LatLonPoint> i;
    private String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6774k;
    private List<RouteSearchCity> l;
    private List<TMC> m;

    public TruckStep() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.j;
    }

    public String getAssistantAction() {
        return this.f6774k;
    }

    public float getDistance() {
        return this.e;
    }

    public float getDuration() {
        return this.h;
    }

    public String getInstruction() {
        return this.f6772a;
    }

    public String getOrientation() {
        return this.f6773b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.i;
    }

    public String getRoad() {
        return this.c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.l;
    }

    public List<TMC> getTMCs() {
        return this.m;
    }

    public float getTollDistance() {
        return this.f;
    }

    public String getTollRoad() {
        return this.g;
    }

    public float getTolls() {
        return this.d;
    }

    public void setAction(String str) {
        this.j = str;
    }

    public void setAssistantAction(String str) {
        this.f6774k = str;
    }

    public void setDistance(float f) {
        this.e = f;
    }

    public void setDuration(float f) {
        this.h = f;
    }

    public void setInstruction(String str) {
        this.f6772a = str;
    }

    public void setOrientation(String str) {
        this.f6773b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.i = list;
    }

    public void setRoad(String str) {
        this.c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.l = list;
    }

    public void setTMCs(List<TMC> list) {
        this.m = list;
    }

    public void setTollDistance(float f) {
        this.f = f;
    }

    public void setTollRoad(String str) {
        this.g = str;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6772a);
        parcel.writeString(this.f6773b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
        parcel.writeFloat(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f6774k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }

    public TruckStep(Parcel parcel) {
        this.f6772a = parcel.readString();
        this.f6773b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readString();
        this.h = parcel.readFloat();
        this.i = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.j = parcel.readString();
        this.f6774k = parcel.readString();
        this.l = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.m = parcel.createTypedArrayList(TMC.CREATOR);
    }
}
