package gj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$¨\u0006+"}, d2 = {"Lgj1/h;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "userId", "applicationVersionId", "applicationId", "", "lastUploadTimestamp", "lastDownloadTimestamp", "deviceStatus", "", "isPrimaryWearable", "Lgj1/b;", "deviceWeightsDTO", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLgj1/b;)V", "a", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "b", "getUserId", "setUserId", "c", "getApplicationVersionId", "setApplicationVersionId", "d", "getApplicationId", "setApplicationId", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "()Ljava/lang/String;", "setLastUploadTimestamp", "(Ljava/lang/String;)V", "f", "getLastDownloadTimestamp", "setLastDownloadTimestamp", "g", "getDeviceStatus", "setDeviceStatus", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private Long userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationVersionId")
    private Long applicationVersionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationId")
    private Long applicationId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUploadTimestamp")
    private String lastUploadTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastDownloadTimestamp")
    private String lastDownloadTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceStatus")
    private String deviceStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f77673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f77674i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            return new h(lValueOf, lValueOf2, lValueOf3, lValueOf4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(Long l14, Long l15, Long l16, Long l17, String str, String str2, String str3, boolean z14, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : l16, (i14 & 8) != 0 ? null : l17, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLastUploadTimestamp() {
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.id, hVar.id) && s.g(this.userId, hVar.userId) && s.g(this.applicationVersionId, hVar.applicationVersionId) && s.g(this.applicationId, hVar.applicationId) && s.g(this.lastUploadTimestamp, hVar.lastUploadTimestamp) && s.g(this.lastDownloadTimestamp, hVar.lastDownloadTimestamp) && s.g(this.deviceStatus, hVar.deviceStatus) && this.f77673h == hVar.f77673h && s.g(this.f77674i, hVar.f77674i);
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.userId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.applicationVersionId;
        int iHashCode3 = (iHashCode2 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.applicationId;
        int iHashCode4 = (iHashCode3 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str = this.lastUploadTimestamp;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastDownloadTimestamp;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceStatus;
        int iG = q6.f.g((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f77673h);
        b bVar = this.f77674i;
        return iG + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.id;
        Long l15 = this.userId;
        Long l16 = this.applicationVersionId;
        Long l17 = this.applicationId;
        String str = this.lastUploadTimestamp;
        String str2 = this.lastDownloadTimestamp;
        String str3 = this.deviceStatus;
        boolean z14 = this.f77673h;
        b bVar = this.f77674i;
        StringBuilder sbJ = f3.j(l14, l15, "UserDeviceDTO(id=", ", userId=", ", applicationVersionId=");
        kg.f.s(sbJ, l16, ", applicationId=", l17, ", lastUploadTimestamp=");
        sn.a.t(sbJ, str, ", lastDownloadTimestamp=", str2, ", deviceStatus=");
        v.h.C(str3, ", isPrimaryWearable=", ", deviceWeightsDTO=", sbJ, z14);
        sbJ.append(bVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.userId;
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
        Long l17 = this.applicationId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeString(this.lastUploadTimestamp);
        parcel.writeString(this.lastDownloadTimestamp);
        parcel.writeString(this.deviceStatus);
        parcel.writeInt(this.f77673h ? 1 : 0);
        b bVar = this.f77674i;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public h(Long l14, Long l15, Long l16, Long l17, String str, String str2, String str3, boolean z14, b bVar) {
        this.id = l14;
        this.userId = l15;
        this.applicationVersionId = l16;
        this.applicationId = l17;
        this.lastUploadTimestamp = str;
        this.lastDownloadTimestamp = str2;
        this.deviceStatus = str3;
        this.f77673h = z14;
        this.f77674i = bVar;
    }

    public h() {
        this(null, null, null, null, null, null, null, false, null, 511, null);
    }
}
