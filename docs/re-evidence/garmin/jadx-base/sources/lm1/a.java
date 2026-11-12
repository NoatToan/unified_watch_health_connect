package lm1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b\u001c\u0010\"\"\u0004\b&\u0010$R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$¨\u0006*"}, d2 = {"Llm1/a;", "Landroid/os/Parcelable;", "", "userProfilePK", "", "epochTimestamp", "deviceId", "calendarDate", "", "epochDuration", "spO2Reading", "readingConfidence", "<init>", "(JLjava/lang/String;JLjava/lang/String;III)V", "a", "J", "getUserProfilePK", "()J", "setUserProfilePK", "(J)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setEpochTimestamp", "(Ljava/lang/String;)V", "c", "getDeviceId", "setDeviceId", "d", "getCalendarDate", "setCalendarDate", JWKParameterNames.RSA_EXPONENT, "I", "getEpochDuration", "()I", "setEpochDuration", "(I)V", "f", "setSpO2Reading", "g", "getReadingConfidence", "setReadingConfidence", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2169a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("epochTimestamp")
    private String epochTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private long deviceId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String calendarDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("epochDuration")
    private int epochDuration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2Reading")
    private int spO2Reading;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingConfidence")
    private int readingConfidence;

    /* JADX INFO: renamed from: lm1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2169a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(long j8, String str, long j14, String str2, int i14, int i15, int i16, int i17, j jVar) {
        this((i17 & 1) != 0 ? -1L : j8, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? -1L : j14, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEpochTimestamp() {
        return this.epochTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSpO2Reading() {
        return this.spO2Reading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.userProfilePK == aVar.userProfilePK && s.g(this.epochTimestamp, aVar.epochTimestamp) && this.deviceId == aVar.deviceId && s.g(this.calendarDate, aVar.calendarDate) && this.epochDuration == aVar.epochDuration && this.spO2Reading == aVar.spO2Reading && this.readingConfidence == aVar.readingConfidence;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userProfilePK) * 31;
        String str = this.epochTimestamp;
        int iE = f.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.deviceId);
        String str2 = this.calendarDate;
        return Integer.hashCode(this.readingConfidence) + q2.d(this.spO2Reading, q2.d(this.epochDuration, (iE + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        long j8 = this.userProfilePK;
        String str = this.epochTimestamp;
        long j14 = this.deviceId;
        String str2 = this.calendarDate;
        int i14 = this.epochDuration;
        int i15 = this.spO2Reading;
        int i16 = this.readingConfidence;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "SpO2EpochDTO(userProfilePK=", ", epochTimestamp=", str);
        x.j(j14, ", deviceId=", ", calendarDate=", sbK);
        f.q(i14, str2, ", epochDuration=", ", spO2Reading=", sbK);
        return androidx.core.view.j.e(i15, i16, ", readingConfidence=", ")", sbK);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePK);
        parcel.writeString(this.epochTimestamp);
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.calendarDate);
        parcel.writeInt(this.epochDuration);
        parcel.writeInt(this.spO2Reading);
        parcel.writeInt(this.readingConfidence);
    }

    public a(long j8, String str, long j14, String str2, int i14, int i15, int i16) {
        this.userProfilePK = j8;
        this.epochTimestamp = str;
        this.deviceId = j14;
        this.calendarDate = str2;
        this.epochDuration = i14;
        this.spO2Reading = i15;
        this.readingConfidence = i16;
    }

    public a() {
        this(0L, null, 0L, null, 0, 0, 0, 127, null);
    }
}
