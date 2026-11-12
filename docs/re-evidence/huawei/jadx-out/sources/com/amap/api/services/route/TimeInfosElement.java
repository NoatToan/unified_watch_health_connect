package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TimeInfosElement implements Parcelable {
    public static final Parcelable.Creator<TimeInfosElement> CREATOR = new Parcelable.Creator<TimeInfosElement>() { // from class: com.amap.api.services.route.TimeInfosElement.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeInfosElement[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeInfosElement createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static TimeInfosElement a(Parcel parcel) {
            return new TimeInfosElement(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f3838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f3839c;
    int d;
    private List<TMC> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getPathindex() {
        return this.f3837a;
    }

    public void setPathindex(int i) {
        this.f3837a = i;
    }

    public float getDuration() {
        return this.f3838b;
    }

    public void setDuration(float f) {
        this.f3838b = f;
    }

    public float getTolls() {
        return this.f3839c;
    }

    public void setTolls(float f) {
        this.f3839c = f;
    }

    public int getRestriction() {
        return this.d;
    }

    public void setRestriction(int i) {
        this.d = i;
    }

    public void setTMCs(List<TMC> list) {
        this.e = list;
    }

    public List<TMC> getTMCs() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3837a);
        parcel.writeFloat(this.f3838b);
        parcel.writeFloat(this.f3839c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
    }

    public TimeInfosElement(Parcel parcel) {
        this.e = new ArrayList();
        this.f3837a = parcel.readInt();
        this.f3838b = parcel.readFloat();
        this.f3839c = parcel.readFloat();
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(TMC.CREATOR);
    }

    public TimeInfosElement() {
        this.e = new ArrayList();
    }
}
