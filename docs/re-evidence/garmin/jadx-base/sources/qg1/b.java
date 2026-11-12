package qg1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lqg1/b;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "date", "", "deviceId", "deviceBackupId", "", "deviceName", "imageUrl", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lorg/joda/time/DateTime;", "b", "()Lorg/joda/time/DateTime;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "c", "d", "Ljava/lang/String;", "g", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getImageUrl", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceBackupId")
    private final Long deviceBackupId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceName")
    private final String deviceName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceImageUrl")
    private final String imageUrl;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b((DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(DateTime dateTime, Long l14, Long l15, String str, String str2) {
        this.date = dateTime;
        this.deviceId = l14;
        this.deviceBackupId = l15;
        this.deviceName = str;
        this.imageUrl = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getDeviceBackupId() {
        return this.deviceBackupId;
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
        return s.g(this.date, bVar.date) && s.g(this.deviceId, bVar.deviceId) && s.g(this.deviceBackupId, bVar.deviceBackupId) && s.g(this.deviceName, bVar.deviceName) && s.g(this.imageUrl, bVar.imageUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        DateTime dateTime = this.date;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Long l14 = this.deviceId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.deviceBackupId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.deviceName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        DateTime dateTime = this.date;
        Long l14 = this.deviceId;
        Long l15 = this.deviceBackupId;
        String str = this.deviceName;
        String str2 = this.imageUrl;
        StringBuilder sb3 = new StringBuilder("DeviceBackupDTO(date=");
        sb3.append(dateTime);
        sb3.append(", deviceId=");
        sb3.append(l14);
        sb3.append(", deviceBackupId=");
        i.q(l15, ", deviceName=", str, ", imageUrl=", sb3);
        return j.o(str2, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.date);
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.deviceBackupId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.deviceName);
        parcel.writeString(this.imageUrl);
    }
}
