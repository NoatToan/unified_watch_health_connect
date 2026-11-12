package lm1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u0017\u0010!R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!¨\u0006*"}, d2 = {"Llm1/c;", "Landroid/os/Parcelable;", "", "userProfilePK", "deviceId", "", "sleepMeasurementStartGMT", "sleepMeasurementEndGMT", "", "alertThresholdValue", "numberOfEventsBelowThreshold", "durationOfEventsBelowThreshold", "averageSPO2", "averageSpO2HR", "lowestSPO2", "<init>", "(JJLjava/lang/String;Ljava/lang/String;IIIIII)V", "a", "J", "getUserProfilePK", "()J", "setUserProfilePK", "(J)V", "b", "getDeviceId", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", JWKParameterNames.RSA_EXPONENT, "I", "getAlertThresholdValue", "()I", "getNumberOfEventsBelowThreshold", "g", "getDurationOfEventsBelowThreshold", "h", IntegerTokenConverter.CONVERTER_KEY, "getAverageSpO2HR", "j", "getLowestSPO2", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepMeasurementStartGMT")
    private final String sleepMeasurementStartGMT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepMeasurementEndGMT")
    private final String sleepMeasurementEndGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("alertThresholdValue")
    private final int alertThresholdValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfEventsBelowThreshold")
    private final int numberOfEventsBelowThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationOfEventsBelowThreshold")
    private final int durationOfEventsBelowThreshold;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSPO2")
    private final int averageSPO2;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpO2HR")
    private final int averageSpO2HR;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowestSPO2")
    private final int lowestSPO2;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(long j8, long j14, String str, String str2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, j jVar) {
        this((i24 & 1) != 0 ? 0L : j8, (i24 & 2) == 0 ? j14 : 0L, (i24 & 4) != 0 ? "" : str, (i24 & 8) == 0 ? str2 : "", (i24 & 16) != 0 ? 0 : i14, (i24 & 32) != 0 ? 0 : i15, (i24 & 64) != 0 ? 0 : i16, (i24 & 128) != 0 ? 0 : i17, (i24 & 256) != 0 ? 0 : i18, (i24 & 512) != 0 ? 0 : i19);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAverageSPO2() {
        return this.averageSPO2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSleepMeasurementEndGMT() {
        return this.sleepMeasurementEndGMT;
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
        return this.userProfilePK == cVar.userProfilePK && this.deviceId == cVar.deviceId && s.g(this.sleepMeasurementStartGMT, cVar.sleepMeasurementStartGMT) && s.g(this.sleepMeasurementEndGMT, cVar.sleepMeasurementEndGMT) && this.alertThresholdValue == cVar.alertThresholdValue && this.numberOfEventsBelowThreshold == cVar.numberOfEventsBelowThreshold && this.durationOfEventsBelowThreshold == cVar.durationOfEventsBelowThreshold && this.averageSPO2 == cVar.averageSPO2 && this.averageSpO2HR == cVar.averageSpO2HR && this.lowestSPO2 == cVar.lowestSPO2;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSleepMeasurementStartGMT() {
        return this.sleepMeasurementStartGMT;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lowestSPO2) + q2.d(this.averageSpO2HR, q2.d(this.averageSPO2, q2.d(this.durationOfEventsBelowThreshold, q2.d(this.numberOfEventsBelowThreshold, q2.d(this.alertThresholdValue, g.j(g.j(f.e(Long.hashCode(this.userProfilePK) * 31, 31, this.deviceId), 31, this.sleepMeasurementStartGMT), 31, this.sleepMeasurementEndGMT), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        long j8 = this.userProfilePK;
        long j14 = this.deviceId;
        String str = this.sleepMeasurementStartGMT;
        String str2 = this.sleepMeasurementEndGMT;
        int i14 = this.alertThresholdValue;
        int i15 = this.numberOfEventsBelowThreshold;
        int i16 = this.durationOfEventsBelowThreshold;
        int i17 = this.averageSPO2;
        int i18 = this.averageSpO2HR;
        int i19 = this.lowestSPO2;
        StringBuilder sbK = e0.k(j8, "SpO2SleepSummaryDTO(userProfilePK=", ", deviceId=");
        p6.b.k(j14, ", sleepMeasurementStartGMT=", str, sbK);
        sbK.append(", sleepMeasurementEndGMT=");
        sbK.append(str2);
        sbK.append(", alertThresholdValue=");
        sbK.append(i14);
        androidx.core.view.j.m(i15, i16, ", numberOfEventsBelowThreshold=", ", durationOfEventsBelowThreshold=", sbK);
        androidx.core.view.j.m(i17, i18, ", averageSPO2=", ", averageSpO2HR=", sbK);
        return u0.k(sbK, ", lowestSPO2=", i19, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePK);
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.sleepMeasurementStartGMT);
        parcel.writeString(this.sleepMeasurementEndGMT);
        parcel.writeInt(this.alertThresholdValue);
        parcel.writeInt(this.numberOfEventsBelowThreshold);
        parcel.writeInt(this.durationOfEventsBelowThreshold);
        parcel.writeInt(this.averageSPO2);
        parcel.writeInt(this.averageSpO2HR);
        parcel.writeInt(this.lowestSPO2);
    }

    public c(long j8, long j14, String str, String str2, int i14, int i15, int i16, int i17, int i18, int i19) {
        str.getClass();
        str2.getClass();
        this.userProfilePK = j8;
        this.deviceId = j14;
        this.sleepMeasurementStartGMT = str;
        this.sleepMeasurementEndGMT = str2;
        this.alertThresholdValue = i14;
        this.numberOfEventsBelowThreshold = i15;
        this.durationOfEventsBelowThreshold = i16;
        this.averageSPO2 = i17;
        this.averageSpO2HR = i18;
        this.lowestSPO2 = i19;
    }

    public c() {
        this(0L, 0L, null, null, 0, 0, 0, 0, 0, 0, 1023, null);
    }
}
