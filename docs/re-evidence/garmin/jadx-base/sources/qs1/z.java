package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lqs1/z;", "Landroid/os/Parcelable;", "", "tripReportId", "ratingDateMs", "<init>", "(JJ)V", "a", "J", "d", "()J", "b", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripReportId")
    private final long tripReportId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ratingDateMs")
    private final long ratingDateMs;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public z(long j8, long j14) {
        this.tripReportId = j8;
        this.ratingDateMs = j14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getRatingDateMs() {
        return this.ratingDateMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTripReportId() {
        return this.tripReportId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.tripReportId == zVar.tripReportId && this.ratingDateMs == zVar.ratingDateMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.ratingDateMs) + (Long.hashCode(this.tripReportId) * 31);
    }

    public final String toString() {
        return am.j.i(this.ratingDateMs, ")", e0.k(this.tripReportId, "UserReviewRatingDTO(tripReportId=", ", ratingDateMs="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.tripReportId);
        parcel.writeLong(this.ratingDateMs);
    }
}
