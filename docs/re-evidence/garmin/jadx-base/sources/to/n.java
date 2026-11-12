package to;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lto/n;", "Landroid/os/Parcelable;", "", "startTime", "endTime", "<init>", "(JJ)V", "a", "J", "d", "()J", "setStartTime", "(J)V", "b", "setEndTime", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private long startTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTime")
    private long endTime;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(long j8, long j14) {
        this.startTime = j8;
        this.endTime = j14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.startTime == nVar.startTime && this.endTime == nVar.endTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.endTime) + (Long.hashCode(this.startTime) * 31);
    }

    public final String toString() {
        return am.j.i(this.endTime, ")", e0.k(this.startTime, "TimeRangeDTO(startTime=", ", endTime="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }
}
