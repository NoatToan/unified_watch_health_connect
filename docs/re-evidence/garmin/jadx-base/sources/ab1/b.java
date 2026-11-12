package ab1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lab1/b;", "Landroid/os/Parcelable;", "", "powerGuidanceCapable", "", "deviceId", "<init>", "(ZJ)V", "a", "Z", "b", "()Z", "J", "getDeviceId", "()J", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerGuidanceCapable")
    private final boolean powerGuidanceCapable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(boolean z14, long j8) {
        this.powerGuidanceCapable = z14;
        this.deviceId = j8;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPowerGuidanceCapable() {
        return this.powerGuidanceCapable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.powerGuidanceCapable == bVar.powerGuidanceCapable && this.deviceId == bVar.deviceId;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int hashCode() {
        return Long.hashCode(this.deviceId) + (Boolean.hashCode(this.powerGuidanceCapable) * 31);
    }

    public final String toString() {
        return "DeviceDTO(powerGuidanceCapable=" + this.powerGuidanceCapable + ", deviceId=" + this.deviceId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.powerGuidanceCapable ? 1 : 0);
        parcel.writeLong(this.deviceId);
    }
}
