package km1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e¨\u0006)"}, d2 = {"Lkm1/b;", "Landroid/os/Parcelable;", "", "userProfilePK", "deviceId", "", "calendarDate", "", "napTimeSec", "napStartTimestampGMT", "napEndTimestampGMT", "napFeedback", "napSource", "napStartTimeOffset", "napEndTimeOffset", "<init>", "(JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "J", "getUserProfilePK", "()J", "b", "getDeviceId", "c", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "d", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "getNapStartTimestampGMT", "f", "getNapEndTimestampGMT", "g", "getNapSource", IntegerTokenConverter.CONVERTER_KEY, "getNapStartTimeOffset", "j", "getNapEndTimeOffset", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f105434k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napTimeSec")
    private final Integer napTimeSec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napStartTimestampGMT")
    private final String napStartTimestampGMT;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napEndTimestampGMT")
    private final String napEndTimestampGMT;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napFeedback")
    private final String napFeedback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napSource")
    private final Integer napSource;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napStartTimeOffset")
    private final Integer napStartTimeOffset;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napEndTimeOffset")
    private final Integer napEndTimeOffset;

    /* JADX INFO: renamed from: km1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2034b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer num;
            parcel.getClass();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                num = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String string2 = parcel.readString();
            Integer num2 = num;
            String string3 = parcel.readString();
            Integer numValueOf2 = num2;
            String string4 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? numValueOf2 : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? numValueOf2 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new b(j8, j14, string, numValueOf, string2, string3, string4, numValueOf3, numValueOf4, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C2034b();
        f105434k = 8;
    }

    public /* synthetic */ b(long j8, long j14, String str, Integer num, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : num3, (i14 & 512) != 0 ? null : num4);
    }

    public static b b(b bVar, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4) {
        return new b(bVar.userProfilePK, bVar.deviceId, bVar.calendarDate, num, str, str2, bVar.napFeedback, num2, num3, num4);
    }

    public static DateTime d(b bVar) {
        DateTime dateTimeQ;
        DateTime dateTimeQ2;
        bVar.getClass();
        try {
            String str = bVar.napEndTimestampGMT;
            if (str == null || (dateTimeQ2 = g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss", null)) == null) {
                return null;
            }
            Integer num = bVar.napEndTimeOffset;
            return dateTimeQ2.plusMinutes(num != null ? num.intValue() : 0);
        } catch (Exception unused) {
            String str2 = bVar.napEndTimestampGMT;
            if (str2 == null || (dateTimeQ = g22.k.q(str2, "yyyy-MM-ddTHH:mm:ss", null)) == null) {
                return null;
            }
            Integer num2 = bVar.napEndTimeOffset;
            return dateTimeQ.plusMinutes(num2 != null ? num2.intValue() : 0);
        }
    }

    public static DateTime f(b bVar) {
        DateTime dateTimeQ;
        DateTime dateTimeQ2;
        bVar.getClass();
        try {
            String str = bVar.napStartTimestampGMT;
            if (str == null || (dateTimeQ2 = g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss", null)) == null) {
                return null;
            }
            Integer num = bVar.napStartTimeOffset;
            return dateTimeQ2.plusMinutes(num != null ? num.intValue() : 0);
        } catch (Exception unused) {
            String str2 = bVar.napStartTimestampGMT;
            if (str2 == null || (dateTimeQ = g22.k.q(str2, "yyyy-MM-ddTHH:mm:ss", null)) == null) {
                return null;
            }
            Integer num2 = bVar.napStartTimeOffset;
            return dateTimeQ.plusMinutes(num2 != null ? num2.intValue() : 0);
        }
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
        return this.userProfilePK == bVar.userProfilePK && this.deviceId == bVar.deviceId && p005kotlin.jvm.internal.s.g(this.calendarDate, bVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.napTimeSec, bVar.napTimeSec) && p005kotlin.jvm.internal.s.g(this.napStartTimestampGMT, bVar.napStartTimestampGMT) && p005kotlin.jvm.internal.s.g(this.napEndTimestampGMT, bVar.napEndTimestampGMT) && p005kotlin.jvm.internal.s.g(this.napFeedback, bVar.napFeedback) && p005kotlin.jvm.internal.s.g(this.napSource, bVar.napSource) && p005kotlin.jvm.internal.s.g(this.napStartTimeOffset, bVar.napStartTimeOffset) && p005kotlin.jvm.internal.s.g(this.napEndTimeOffset, bVar.napEndTimeOffset);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNapFeedback() {
        return this.napFeedback;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getNapTimeSec() {
        return this.napTimeSec;
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.userProfilePK) * 31, 31, this.deviceId);
        String str = this.calendarDate;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.napTimeSec;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.napStartTimestampGMT;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.napEndTimestampGMT;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.napFeedback;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.napSource;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.napStartTimeOffset;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.napEndTimeOffset;
        return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.userProfilePK;
        long j14 = this.deviceId;
        String str = this.calendarDate;
        Integer num = this.napTimeSec;
        String str2 = this.napStartTimestampGMT;
        String str3 = this.napEndTimestampGMT;
        String str4 = this.napFeedback;
        Integer num2 = this.napSource;
        Integer num3 = this.napStartTimeOffset;
        Integer num4 = this.napEndTimeOffset;
        StringBuilder sbK = ds.e0.k(j8, "DailyNapDTO(userProfilePK=", ", deviceId=");
        p6.b.k(j14, ", calendarDate=", str, sbK);
        sbK.append(", napTimeSec=");
        sbK.append(num);
        sbK.append(", napStartTimestampGMT=");
        sbK.append(str2);
        sn.a.t(sbK, ", napEndTimestampGMT=", str3, ", napFeedback=", str4);
        sbK.append(", napSource=");
        sbK.append(num2);
        sbK.append(", napStartTimeOffset=");
        sbK.append(num3);
        sbK.append(", napEndTimeOffset=");
        sbK.append(num4);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePK);
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.calendarDate);
        Integer num = this.napTimeSec;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.napStartTimestampGMT);
        parcel.writeString(this.napEndTimestampGMT);
        parcel.writeString(this.napFeedback);
        Integer num2 = this.napSource;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.napStartTimeOffset;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.napEndTimeOffset;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lkm1/b$a;", "", "<init>", "()V", "", "DATE_FORMAT", "Ljava/lang/String;", "ALT_DATE_FORMAT", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(long j8, long j14, String str, Integer num, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4) {
        this.userProfilePK = j8;
        this.deviceId = j14;
        this.calendarDate = str;
        this.napTimeSec = num;
        this.napStartTimestampGMT = str2;
        this.napEndTimestampGMT = str3;
        this.napFeedback = str4;
        this.napSource = num2;
        this.napStartTimeOffset = num3;
        this.napEndTimeOffset = num4;
    }
}
