package sn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0011\u0010\u0018\"\u0004\b\u001d\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lsn/f;", "Landroid/os/Parcelable;", "", "deviceId", "", "deviceTypeId", "", "deviceVersion", "deviceVersionId", "deviceName", "imageUrl", "<init>", "(JILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "J", "getDeviceId", "()J", "b", "I", "getDeviceTypeId", "()I", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", JWKParameterNames.RSA_EXPONENT, "g", "(Ljava/lang/String;)V", "getImageUrl", "h", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceTypeId")
    private final int deviceTypeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceVersion")
    private final String deviceVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceVersionId")
    private final Long deviceVersionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String deviceName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String imageUrl;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(long j8, int i14, String str, Long l14, String str2, String str3, int i15, j jVar) {
        this(j8, i14, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? null : l14, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDeviceVersion() {
        return this.deviceVersion;
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
        return this.deviceId == fVar.deviceId && this.deviceTypeId == fVar.deviceTypeId && s.g(this.deviceVersion, fVar.deviceVersion) && s.g(this.deviceVersionId, fVar.deviceVersionId) && s.g(this.deviceName, fVar.deviceName) && s.g(this.imageUrl, fVar.imageUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDeviceVersionId() {
        return this.deviceVersionId;
    }

    public final void g(String str) {
        this.deviceName = str;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void h(String str) {
        this.imageUrl = str;
    }

    public final int hashCode() {
        int iD = q2.d(this.deviceTypeId, Long.hashCode(this.deviceId) * 31, 31);
        String str = this.deviceVersion;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.deviceVersionId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.deviceName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.deviceId;
        int i14 = this.deviceTypeId;
        String str = this.deviceVersion;
        Long l14 = this.deviceVersionId;
        String str2 = this.deviceName;
        String str3 = this.imageUrl;
        StringBuilder sbW = v.h.w(i14, "DeviceMetadataDTO(deviceId=", ", deviceTypeId=", j8);
        sbW.append(", deviceVersion=");
        sbW.append(str);
        sbW.append(", deviceVersionId=");
        sbW.append(l14);
        sn.a.t(sbW, ", deviceName=", str2, ", imageUrl=", str3);
        sbW.append(")");
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.deviceId);
        parcel.writeInt(this.deviceTypeId);
        parcel.writeString(this.deviceVersion);
        Long l14 = this.deviceVersionId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.deviceName);
        parcel.writeString(this.imageUrl);
    }

    public f(long j8, int i14, String str, Long l14, String str2, String str3) {
        this.deviceId = j8;
        this.deviceTypeId = i14;
        this.deviceVersion = str;
        this.deviceVersionId = l14;
        this.deviceName = str2;
        this.imageUrl = str3;
    }
}
