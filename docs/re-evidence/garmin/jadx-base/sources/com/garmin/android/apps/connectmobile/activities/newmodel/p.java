package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "Landroid/os/Parcelable;", "", "distanceDisplayMeasure", "elevationDisplayMeasure", "speedDisplayMeasure", "verticalSpeedDisplayMeasure", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getDistanceDisplayMeasure", "()Ljava/lang/String;", "b", "getElevationDisplayMeasure", "c", "d", "getVerticalSpeedDisplayMeasure", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceDisplayMeasure")
    private final String distanceDisplayMeasure;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationDisplayMeasure")
    private final String elevationDisplayMeasure;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedDisplayMeasure")
    private final String speedDisplayMeasure;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verticalSpeedDisplayMeasure")
    private final String verticalSpeedDisplayMeasure;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public /* synthetic */ p(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSpeedDisplayMeasure() {
        return this.speedDisplayMeasure;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.distanceDisplayMeasure, pVar.distanceDisplayMeasure) && p005kotlin.jvm.internal.s.g(this.elevationDisplayMeasure, pVar.elevationDisplayMeasure) && p005kotlin.jvm.internal.s.g(this.speedDisplayMeasure, pVar.speedDisplayMeasure) && p005kotlin.jvm.internal.s.g(this.verticalSpeedDisplayMeasure, pVar.verticalSpeedDisplayMeasure);
    }

    public final int hashCode() {
        String str = this.distanceDisplayMeasure;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.elevationDisplayMeasure;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.speedDisplayMeasure;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.verticalSpeedDisplayMeasure;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.distanceDisplayMeasure;
        String str2 = this.elevationDisplayMeasure;
        return e5.h(p6.b.i("DeviceDisplayUnitsDTO(distanceDisplayMeasure=", str, ", elevationDisplayMeasure=", str2, ", speedDisplayMeasure="), this.speedDisplayMeasure, ", verticalSpeedDisplayMeasure=", this.verticalSpeedDisplayMeasure, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.distanceDisplayMeasure);
        parcel.writeString(this.elevationDisplayMeasure);
        parcel.writeString(this.speedDisplayMeasure);
        parcel.writeString(this.verticalSpeedDisplayMeasure);
    }

    public p(String str, String str2, String str3, String str4) {
        this.distanceDisplayMeasure = str;
        this.elevationDisplayMeasure = str2;
        this.speedDisplayMeasure = str3;
        this.verticalSpeedDisplayMeasure = str4;
    }

    public p() {
        this(null, null, null, null, 15, null);
    }
}
