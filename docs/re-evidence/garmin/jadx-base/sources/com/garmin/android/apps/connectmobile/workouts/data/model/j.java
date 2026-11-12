package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/j;", "Landroid/os/Parcelable;", "", "noOfActivities", "", "avgSpeed", "", "activityType", "<init>", "(IDLjava/lang/String;)V", "a", "I", "getNoOfActivities", "()I", "b", "D", "()D", "c", "Ljava/lang/String;", "getActivityType", "()Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noOfActivities")
    private final int noOfActivities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSpeed")
    private final double avgSpeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(int i14, double d14, String str) {
        str.getClass();
        this.noOfActivities = i14;
        this.avgSpeed = d14;
        this.activityType = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAvgSpeed() {
        return this.avgSpeed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.noOfActivities == jVar.noOfActivities && Double.compare(this.avgSpeed, jVar.avgSpeed) == 0 && p005kotlin.jvm.internal.s.g(this.activityType, jVar.activityType);
    }

    public final int hashCode() {
        return this.activityType.hashCode() + org.apache.commons.lang3.e.b(Integer.hashCode(this.noOfActivities) * 31, 31, this.avgSpeed);
    }

    public final String toString() {
        int i14 = this.noOfActivities;
        double d14 = this.avgSpeed;
        String str = this.activityType;
        StringBuilder sb3 = new StringBuilder("HistoricUserAvgSpeedDTO(noOfActivities=");
        sb3.append(i14);
        sb3.append(", avgSpeed=");
        sb3.append(d14);
        return v.e0.h(sb3, ", activityType=", str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.noOfActivities);
        parcel.writeDouble(this.avgSpeed);
        parcel.writeString(this.activityType);
    }
}
