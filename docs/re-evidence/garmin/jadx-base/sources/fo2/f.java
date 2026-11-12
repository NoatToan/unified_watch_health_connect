package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lfo2/f;", "Landroid/os/Parcelable;", "", "deviceId", "", "thisDeviceActiveWithCurrentUser", "otherDeviceActiveWithCurrentUser", "<init>", "(JZZ)V", "a", "J", "getDeviceId", "()J", "b", "Z", "()Z", "c", "getOtherDeviceActiveWithCurrentUser", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("thisDeviceActiveWithCurrentUser")
    private final boolean thisDeviceActiveWithCurrentUser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("otherDeviceActiveWithCurrentUser")
    private final boolean otherDeviceActiveWithCurrentUser;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(long j8, boolean z14, boolean z15) {
        this.deviceId = j8;
        this.thisDeviceActiveWithCurrentUser = z14;
        this.otherDeviceActiveWithCurrentUser = z15;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getThisDeviceActiveWithCurrentUser() {
        return this.thisDeviceActiveWithCurrentUser;
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
        return this.deviceId == fVar.deviceId && this.thisDeviceActiveWithCurrentUser == fVar.thisDeviceActiveWithCurrentUser && this.otherDeviceActiveWithCurrentUser == fVar.otherDeviceActiveWithCurrentUser;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.otherDeviceActiveWithCurrentUser) + q6.f.g(Long.hashCode(this.deviceId) * 31, 31, this.thisDeviceActiveWithCurrentUser);
    }

    public final String toString() {
        long j8 = this.deviceId;
        boolean z14 = this.thisDeviceActiveWithCurrentUser;
        boolean z15 = this.otherDeviceActiveWithCurrentUser;
        StringBuilder sb3 = new StringBuilder("DeviceRegistrationStatusResponse(deviceId=");
        sb3.append(j8);
        sb3.append(", thisDeviceActiveWithCurrentUser=");
        sb3.append(z14);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", otherDeviceActiveWithCurrentUser=", z15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.deviceId);
        parcel.writeInt(this.thisDeviceActiveWithCurrentUser ? 1 : 0);
        parcel.writeInt(this.otherDeviceActiveWithCurrentUser ? 1 : 0);
    }
}
