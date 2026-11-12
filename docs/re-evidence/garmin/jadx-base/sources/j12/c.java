package j12;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0017\u0010&\"\u0004\b)\u0010(R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b+\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b,\u0010(R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010.\u001a\u0004\b*\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lj12/c;", "Landroid/os/Parcelable;", "", "userDeviceId", "", "userProfileNumber", "applicationNumber", "applicationVersionNumber", "", "lastUsedDeviceApplicationKey", "lastUsedDeviceName", "lastUsedDeviceUploadTime", "imageUrl", "", "isReleased", "<init>", "(JIIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V", "a", "J", "f", "()J", "setUserDeviceId", "(J)V", "b", "I", "getUserProfileNumber", "()I", "setUserProfileNumber", "(I)V", "c", "getApplicationNumber", "setApplicationNumber", "d", "getApplicationVersionNumber", "setApplicationVersionNumber", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getLastUsedDeviceApplicationKey", "()Ljava/lang/String;", "setLastUsedDeviceApplicationKey", "(Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "g", "setLastUsedDeviceUploadTime", "h", "getImageUrl", "Z", "()Z", "setReleased", "(Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userDeviceId")
    private long userDeviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileNumber")
    private int userProfileNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationNumber")
    private int applicationNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationVersionNumber")
    private int applicationVersionNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUsedDeviceApplicationKey")
    private String lastUsedDeviceApplicationKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUsedDeviceName")
    private String lastUsedDeviceName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUsedDeviceUploadTime")
    private long lastUsedDeviceUploadTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private String imageUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("released")
    private boolean isReleased;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(long j8, int i14, int i15, int i16, String str, String str2, long j14, String str3, boolean z14, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0L : j8, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16, (i17 & 16) != 0 ? null : str, (i17 & 32) != 0 ? null : str2, (i17 & 64) == 0 ? j14 : 0L, (i17 & 128) == 0 ? str3 : null, (i17 & 256) != 0 ? false : z14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLastUsedDeviceName() {
        return this.lastUsedDeviceName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastUsedDeviceUploadTime() {
        return this.lastUsedDeviceUploadTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.userDeviceId == cVar.userDeviceId && this.userProfileNumber == cVar.userProfileNumber && this.applicationNumber == cVar.applicationNumber && this.applicationVersionNumber == cVar.applicationVersionNumber && s.g(this.lastUsedDeviceApplicationKey, cVar.lastUsedDeviceApplicationKey) && s.g(this.lastUsedDeviceName, cVar.lastUsedDeviceName) && this.lastUsedDeviceUploadTime == cVar.lastUsedDeviceUploadTime && s.g(this.imageUrl, cVar.imageUrl) && this.isReleased == cVar.isReleased;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getUserDeviceId() {
        return this.userDeviceId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void h(String str) {
        this.imageUrl = str;
    }

    public final int hashCode() {
        int iD = q2.d(this.applicationVersionNumber, q2.d(this.applicationNumber, q2.d(this.userProfileNumber, Long.hashCode(this.userDeviceId) * 31, 31), 31), 31);
        String str = this.lastUsedDeviceApplicationKey;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastUsedDeviceName;
        int iE = q6.f.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.lastUsedDeviceUploadTime);
        String str3 = this.imageUrl;
        return Boolean.hashCode(this.isReleased) + ((iE + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void i(String str) {
        this.lastUsedDeviceName = str;
    }

    public final String toString() {
        long j8 = this.userDeviceId;
        int i14 = this.userProfileNumber;
        int i15 = this.applicationNumber;
        int i16 = this.applicationVersionNumber;
        String str = this.lastUsedDeviceApplicationKey;
        String str2 = this.lastUsedDeviceName;
        long j14 = this.lastUsedDeviceUploadTime;
        String str3 = this.imageUrl;
        boolean z14 = this.isReleased;
        StringBuilder sbW = v.h.w(i14, "LastUsedDeviceDTO(userDeviceId=", ", userProfileNumber=", j8);
        androidx.core.view.j.m(i15, i16, ", applicationNumber=", ", applicationVersionNumber=", sbW);
        sn.a.t(sbW, ", lastUsedDeviceApplicationKey=", str, ", lastUsedDeviceName=", str2);
        x.j(j14, ", lastUsedDeviceUploadTime=", ", imageUrl=", sbW);
        return am.j.n(str3, ", isReleased=", ")", sbW, z14);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userDeviceId);
        parcel.writeInt(this.userProfileNumber);
        parcel.writeInt(this.applicationNumber);
        parcel.writeInt(this.applicationVersionNumber);
        parcel.writeString(this.lastUsedDeviceApplicationKey);
        parcel.writeString(this.lastUsedDeviceName);
        parcel.writeLong(this.lastUsedDeviceUploadTime);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.isReleased ? 1 : 0);
    }

    public c(long j8, int i14, int i15, int i16, String str, String str2, long j14, String str3, boolean z14) {
        this.userDeviceId = j8;
        this.userProfileNumber = i14;
        this.applicationNumber = i15;
        this.applicationVersionNumber = i16;
        this.lastUsedDeviceApplicationKey = str;
        this.lastUsedDeviceName = str2;
        this.lastUsedDeviceUploadTime = j14;
        this.imageUrl = str3;
        this.isReleased = z14;
    }

    public c() {
        this(0L, 0, 0, 0, null, null, 0L, null, false, 511, null);
    }
}
