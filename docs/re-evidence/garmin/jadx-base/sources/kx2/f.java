package kx2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u000e\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lkx2/f;", "Landroid/os/Parcelable;", "", "garminDeviceToMobileDevice", "cloudInitialUpload", "cloudProcessingCheckback", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "a", "Ljava/lang/Long;", "getGarminDeviceToMobileDevice", "()Ljava/lang/Long;", "setGarminDeviceToMobileDevice", "(Ljava/lang/Long;)V", "b", "getCloudInitialUpload", "c", "getCloudProcessingCheckback", "d", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GarminDeviceToMobileDevice")
    private Long garminDeviceToMobileDevice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CloudInitialUpload")
    private Long cloudInitialUpload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CloudProcessingCheckback")
    private Long cloudProcessingCheckback;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(Long l14, Long l15, Long l16, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : l16);
    }

    public final void b(Long l14) {
        this.cloudInitialUpload = l14;
    }

    public final void d(Long l14) {
        this.cloudProcessingCheckback = l14;
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
        return s.g(this.garminDeviceToMobileDevice, fVar.garminDeviceToMobileDevice) && s.g(this.cloudInitialUpload, fVar.cloudInitialUpload) && s.g(this.cloudProcessingCheckback, fVar.cloudProcessingCheckback);
    }

    public final int hashCode() {
        Long l14 = this.garminDeviceToMobileDevice;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.cloudInitialUpload;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.cloudProcessingCheckback;
        return iHashCode2 + (l16 != null ? l16.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.garminDeviceToMobileDevice;
        Long l15 = this.cloudInitialUpload;
        return p6.b.g(f3.j(l14, l15, "SaMDFileTransferDuration(garminDeviceToMobileDevice=", ", cloudInitialUpload=", ", cloudProcessingCheckback="), this.cloudProcessingCheckback, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.garminDeviceToMobileDevice;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.cloudInitialUpload;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.cloudProcessingCheckback;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
    }

    public f(Long l14, Long l15, Long l16) {
        this.garminDeviceToMobileDevice = l14;
        this.cloudInitialUpload = l15;
        this.cloudProcessingCheckback = l16;
    }

    public f() {
        this(null, null, null, 7, null);
    }
}
