package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcy0/f;", "Landroid/os/Parcelable;", "", "activityId", "", "startDurationOffsetSecond", "<init>", "(JI)V", "a", "J", "b", "()J", "I", "d", "()I", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDurationOffsetSecond")
    private final int startDurationOffsetSecond;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(long j8, int i14) {
        this.activityId = j8;
        this.startDurationOffsetSecond = i14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartDurationOffsetSecond() {
        return this.startDurationOffsetSecond;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.activityId == fVar.activityId && this.startDurationOffsetSecond == fVar.startDurationOffsetSecond;
    }

    public final int hashCode() {
        return Integer.hashCode(this.startDurationOffsetSecond) + (Long.hashCode(this.activityId) * 31);
    }

    public final String toString() {
        StringBuilder sbW = v.h.w(this.startDurationOffsetSecond, "ElevationActivity(activityId=", ", startDurationOffsetSecond=", this.activityId);
        sbW.append(")");
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        parcel.writeInt(this.startDurationOffsetSecond);
    }
}
