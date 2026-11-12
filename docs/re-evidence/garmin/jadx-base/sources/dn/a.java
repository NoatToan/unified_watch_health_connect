package dn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldn/a;", "Landroid/os/Parcelable;", "", "distance", "", "activityId", "", "time", "", "_activityDate", "activityName", "activityStartTime", "<init>", "(IJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "I", "d", "()I", "b", "J", "()J", "c", "D", "f", "()D", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1283a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final int distance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("time")
    private final double time;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDate")
    private final String _activityDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient String f60488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient String f60489f;

    /* JADX INFO: renamed from: dn.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1283a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), parcel.readLong(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, long j8, double d14, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.distance = i14;
        this.activityId = j8;
        this.time = d14;
        this._activityDate = str;
        this.f60488e = str2;
        this.f60489f = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.distance);
        parcel.writeLong(this.activityId);
        parcel.writeDouble(this.time);
        parcel.writeString(this._activityDate);
        parcel.writeString(this.f60488e);
        parcel.writeString(this.f60489f);
    }
}
