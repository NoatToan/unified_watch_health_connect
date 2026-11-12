package com.huawei.hwsportmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class GolfShotTrack implements Parcelable {
    public static final Parcelable.Creator<GolfShotTrack> CREATOR = new Parcelable.Creator<GolfShotTrack>() { // from class: com.huawei.hwsportmodel.GolfShotTrack.4
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GolfShotTrack createFromParcel(Parcel parcel) {
            return new GolfShotTrack(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GolfShotTrack[] newArray(int i) {
            return new GolfShotTrack[i];
        }
    };

    @SerializedName("dis")
    @Expose
    private int mDistance;

    @SerializedName("lat")
    @Expose
    private double mLatitude;

    @SerializedName("lon")
    @Expose
    private double mLongitude;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GolfShotTrack(c cVar) {
        this.mLongitude = cVar.e.doubleValue();
        this.mLatitude = cVar.f17742b.doubleValue();
        this.mDistance = cVar.d;
    }

    public GolfShotTrack(Parcel parcel) {
        this.mLongitude = parcel.readDouble();
        this.mLatitude = parcel.readDouble();
        this.mDistance = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.mLatitude);
        parcel.writeInt(this.mDistance);
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f17742b;
        private int d;
        private Double e;

        public c a(Double d) {
            this.e = d;
            return this;
        }

        public c e(Double d) {
            this.f17742b = d;
            return this;
        }

        public c d(int i) {
            this.d = i;
            return this;
        }

        public GolfShotTrack d() {
            return new GolfShotTrack(this);
        }
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public int getDistance() {
        return this.mDistance;
    }

    public String toString() {
        return "GolfShotTrack{mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + ", mDistance=" + this.mDistance + '}';
    }
}
