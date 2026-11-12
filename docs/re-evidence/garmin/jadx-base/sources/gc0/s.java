package gc0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lgc0/s;", "Landroid/os/Parcelable;", "", "deviceId", "", "userId", "applicationId", "applicationVersionId", "lastUploadTimestamp", "lastDownloadTimestamp", "", "deviceStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/Integer;", "getUserId", "()Ljava/lang/Integer;", "c", "getApplicationId", "d", "getApplicationVersionId", JWKParameterNames.RSA_EXPONENT, "f", "getLastDownloadTimestamp", "g", "Ljava/lang/String;", "getDeviceStatus", "()Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Integer userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationId")
    private final Long applicationId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationVersionId")
    private final Long applicationVersionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUploadTimestamp")
    private final Long lastUploadTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastDownloadTimestamp")
    private final Long lastDownloadTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceStatus")
    private final String deviceStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(Long l14, Integer num, Long l15, Long l16, Long l17, Long l18, String str) {
        this.deviceId = l14;
        this.userId = num;
        this.applicationId = l15;
        this.applicationVersionId = l16;
        this.lastUploadTimestamp = l17;
        this.lastDownloadTimestamp = l18;
        this.deviceStatus = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getLastUploadTimestamp() {
        return this.lastUploadTimestamp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.deviceId, sVar.deviceId) && p005kotlin.jvm.internal.s.g(this.userId, sVar.userId) && p005kotlin.jvm.internal.s.g(this.applicationId, sVar.applicationId) && p005kotlin.jvm.internal.s.g(this.applicationVersionId, sVar.applicationVersionId) && p005kotlin.jvm.internal.s.g(this.lastUploadTimestamp, sVar.lastUploadTimestamp) && p005kotlin.jvm.internal.s.g(this.lastDownloadTimestamp, sVar.lastDownloadTimestamp) && p005kotlin.jvm.internal.s.g(this.deviceStatus, sVar.deviceStatus);
    }

    public final int hashCode() {
        Long l14 = this.deviceId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Integer num = this.userId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l15 = this.applicationId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.applicationVersionId;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.lastUploadTimestamp;
        int iHashCode5 = (iHashCode4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.lastDownloadTimestamp;
        int iHashCode6 = (iHashCode5 + (l18 == null ? 0 : l18.hashCode())) * 31;
        String str = this.deviceStatus;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.deviceId;
        Integer num = this.userId;
        Long l15 = this.applicationId;
        Long l16 = this.applicationVersionId;
        Long l17 = this.lastUploadTimestamp;
        Long l18 = this.lastDownloadTimestamp;
        String str = this.deviceStatus;
        StringBuilder sb3 = new StringBuilder("UserDeviceDTO(deviceId=");
        sb3.append(l14);
        sb3.append(", userId=");
        sb3.append(num);
        sb3.append(", applicationId=");
        kg.f.s(sb3, l15, ", applicationVersionId=", l16, ", lastUploadTimestamp=");
        kg.f.s(sb3, l17, ", lastDownloadTimestamp=", l18, ", deviceStatus=");
        return am.j.o(str, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Integer num = this.userId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l15 = this.applicationId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.applicationVersionId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.lastUploadTimestamp;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        Long l18 = this.lastDownloadTimestamp;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l18);
        }
        parcel.writeString(this.deviceStatus);
    }
}
