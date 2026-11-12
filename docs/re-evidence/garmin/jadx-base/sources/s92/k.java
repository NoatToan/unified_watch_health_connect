package s92;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Ls92/k;", "Landroid/os/Parcelable;", "", "syncDeviceData", "syncApplicationData", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "setSyncDeviceData", "(Z)V", "getSyncApplicationData", "setSyncApplicationData", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("syncDeviceData")
    private boolean syncDeviceData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("syncApplicationData")
    private boolean syncApplicationData;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSyncDeviceData() {
        return this.syncDeviceData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.syncDeviceData == kVar.syncDeviceData && this.syncApplicationData == kVar.syncApplicationData;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.syncApplicationData) + (Boolean.hashCode(this.syncDeviceData) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("DataSyncIndicatorsDTO(syncDeviceData=", ", syncApplicationData=", ")", this.syncDeviceData, this.syncApplicationData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.syncDeviceData ? 1 : 0);
        parcel.writeInt(this.syncApplicationData ? 1 : 0);
    }

    public k(boolean z14, boolean z15) {
        this.syncDeviceData = z14;
        this.syncApplicationData = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
