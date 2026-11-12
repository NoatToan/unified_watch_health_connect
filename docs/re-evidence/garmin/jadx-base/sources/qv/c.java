package qv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010!R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lqv/c;", "Landroid/os/Parcelable;", "", "deviceTypeKey", "", "deviceId", "", "profileSport", "profileSubSport", "profileName", "backupCreationTimestamp", "deviceName", "deviceImageUrl", "<init>", "(Ljava/lang/String;JIILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "J", "getDeviceId", "()J", "c", "I", "getProfileSport", "()I", "d", "getProfileSubSport", JWKParameterNames.RSA_EXPONENT, "h", "f", "j", "(Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceTypeKey")
    private final String deviceTypeKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileSport")
    private final int profileSport;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileSubSport")
    private final int profileSubSport;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileName")
    private final String profileName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("backupCreationTimestamp")
    private final long backupCreationTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String deviceName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String deviceImageUrl;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, long j8, int i14, int i15, String str2, long j14, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.deviceTypeKey = str;
        this.deviceId = j8;
        this.profileSport = i14;
        this.profileSubSport = i15;
        this.profileName = str2;
        this.backupCreationTimestamp = j14;
        this.deviceName = str3;
        this.deviceImageUrl = str4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBackupCreationTimestamp() {
        return this.backupCreationTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDeviceImageUrl() {
        return this.deviceImageUrl;
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
        return s.g(this.deviceTypeKey, cVar.deviceTypeKey) && this.deviceId == cVar.deviceId && this.profileSport == cVar.profileSport && this.profileSubSport == cVar.profileSubSport && s.g(this.profileName, cVar.profileName) && this.backupCreationTimestamp == cVar.backupCreationTimestamp && s.g(this.deviceName, cVar.deviceName) && s.g(this.deviceImageUrl, cVar.deviceImageUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeviceTypeKey() {
        return this.deviceTypeKey;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProfileName() {
        return this.profileName;
    }

    public final int hashCode() {
        int iE = f.e(g.j(q2.d(this.profileSubSport, q2.d(this.profileSport, f.e(this.deviceTypeKey.hashCode() * 31, 31, this.deviceId), 31), 31), 31, this.profileName), 31, this.backupCreationTimestamp);
        String str = this.deviceName;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceImageUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void i(String str) {
        this.deviceImageUrl = str;
    }

    public final void j(String str) {
        this.deviceName = str;
    }

    public final String toString() {
        String str = this.deviceTypeKey;
        long j8 = this.deviceId;
        int i14 = this.profileSport;
        int i15 = this.profileSubSport;
        String str2 = this.profileName;
        long j14 = this.backupCreationTimestamp;
        String str3 = this.deviceName;
        String str4 = this.deviceImageUrl;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "SportProfileBackupDTO(deviceTypeKey=", str, ", deviceId=");
        j.m(i14, i15, ", profileSport=", ", profileSubSport=", sbJ);
        am.j.y(sbJ, ", profileName=", str2, ", backupCreationTimestamp=");
        p6.b.k(j14, ", deviceName=", str3, sbJ);
        return e0.h(sbJ, ", deviceImageUrl=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.deviceTypeKey);
        parcel.writeLong(this.deviceId);
        parcel.writeInt(this.profileSport);
        parcel.writeInt(this.profileSubSport);
        parcel.writeString(this.profileName);
        parcel.writeLong(this.backupCreationTimestamp);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceImageUrl);
    }
}
