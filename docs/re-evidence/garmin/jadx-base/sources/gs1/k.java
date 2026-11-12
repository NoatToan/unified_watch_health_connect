package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%¨\u0006*"}, d2 = {"Lgs1/k;", "Landroid/os/Parcelable;", "", "userProfilePK", "deviceId", "", "calendarDate", "napTimeSec", "napStartTimestampGMT", "napEndTimestampGMT", "napFeedback", "", "napSource", "napStartTimeOffset", "napEndTimeOffset", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "getUserProfilePK", "()Ljava/lang/Long;", "b", "getDeviceId", "c", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "d", JWKParameterNames.RSA_EXPONENT, "getNapStartTimestampGMT", "f", "getNapEndTimestampGMT", "g", "getNapFeedback", "h", "Ljava/lang/Integer;", "getNapSource", "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "getNapStartTimeOffset", "j", "getNapEndTimeOffset", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napTimeSec")
    private final Long napTimeSec;

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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            Integer num;
            Integer numValueOf;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Long l14 = lValueOf2;
            Long l15 = lValueOf3;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num2 = numValueOf3;
                numValueOf = null;
                num = num2;
            } else {
                num = numValueOf3;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new k(lValueOf, l14, string, l15, string2, string3, string4, numValueOf2, num, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(Long l14, Long l15, String str, Long l16, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? null : num2, (i14 & 512) != 0 ? null : num3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getNapTimeSec() {
        return this.napTimeSec;
    }

    public final DateTime d(LocalDate localDate) {
        DateTime dateTimePlusMinutes;
        DateTime dateTimePlusMinutes2;
        DateTime dateTimeQ = g22.k.q(this.napStartTimestampGMT, "yyyy-MM-dd'T'HH:mm:ss", DateTimeZone.getDefault());
        if (dateTimeQ != null) {
            Integer num = this.napStartTimeOffset;
            dateTimePlusMinutes = dateTimeQ.plusMinutes(num != null ? num.intValue() : 0);
        } else {
            dateTimePlusMinutes = null;
        }
        DateTime dateTimeQ2 = g22.k.q(this.napEndTimestampGMT, "yyyy-MM-dd'T'HH:mm:ss", DateTimeZone.getDefault());
        if (dateTimeQ2 != null) {
            Integer num2 = this.napEndTimeOffset;
            dateTimePlusMinutes2 = dateTimeQ2.plusMinutes(num2 != null ? num2.intValue() : 0);
        } else {
            dateTimePlusMinutes2 = null;
        }
        LocalDate localDate2 = dateTimePlusMinutes != null ? dateTimePlusMinutes.toLocalDate() : null;
        LocalDate localDate3 = dateTimePlusMinutes2 != null ? dateTimePlusMinutes2.toLocalDate() : null;
        if (p005kotlin.jvm.internal.s.g(localDate2, localDate3) || localDate.equals(localDate2)) {
            return dateTimePlusMinutes;
        }
        if (localDate.equals(localDate3)) {
            return dateTimePlusMinutes2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfilePK, kVar.userProfilePK) && p005kotlin.jvm.internal.s.g(this.deviceId, kVar.deviceId) && p005kotlin.jvm.internal.s.g(this.calendarDate, kVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.napTimeSec, kVar.napTimeSec) && p005kotlin.jvm.internal.s.g(this.napStartTimestampGMT, kVar.napStartTimestampGMT) && p005kotlin.jvm.internal.s.g(this.napEndTimestampGMT, kVar.napEndTimestampGMT) && p005kotlin.jvm.internal.s.g(this.napFeedback, kVar.napFeedback) && p005kotlin.jvm.internal.s.g(this.napSource, kVar.napSource) && p005kotlin.jvm.internal.s.g(this.napStartTimeOffset, kVar.napStartTimeOffset) && p005kotlin.jvm.internal.s.g(this.napEndTimeOffset, kVar.napEndTimeOffset);
    }

    public final int hashCode() {
        Long l14 = this.userProfilePK;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.deviceId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.calendarDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l16 = this.napTimeSec;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str2 = this.napStartTimestampGMT;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.napEndTimestampGMT;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.napFeedback;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.napSource;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.napStartTimeOffset;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.napEndTimeOffset;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePK;
        Long l15 = this.deviceId;
        String str = this.calendarDate;
        Long l16 = this.napTimeSec;
        String str2 = this.napStartTimestampGMT;
        String str3 = this.napEndTimestampGMT;
        String str4 = this.napFeedback;
        Integer num = this.napSource;
        Integer num2 = this.napStartTimeOffset;
        Integer num3 = this.napEndTimeOffset;
        StringBuilder sbJ = f3.j(l14, l15, "DailyNapDTO(userProfilePK=", ", deviceId=", ", calendarDate=");
        n23.j.q(l16, str, ", napTimeSec=", ", napStartTimestampGMT=", sbJ);
        sn.a.t(sbJ, str2, ", napEndTimestampGMT=", str3, ", napFeedback=");
        fb1.c.u(num, str4, ", napSource=", ", napStartTimeOffset=", sbJ);
        return b71.i.h(sbJ, num2, ", napEndTimeOffset=", num3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePK;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.deviceId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.calendarDate);
        Long l16 = this.napTimeSec;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.napStartTimestampGMT);
        parcel.writeString(this.napEndTimestampGMT);
        parcel.writeString(this.napFeedback);
        Integer num = this.napSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.napStartTimeOffset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.napEndTimeOffset;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
    }

    public k(Long l14, Long l15, String str, Long l16, String str2, String str3, String str4, Integer num, Integer num2, Integer num3) {
        this.userProfilePK = l14;
        this.deviceId = l15;
        this.calendarDate = str;
        this.napTimeSec = l16;
        this.napStartTimestampGMT = str2;
        this.napEndTimestampGMT = str3;
        this.napFeedback = str4;
        this.napSource = num;
        this.napStartTimeOffset = num2;
        this.napEndTimeOffset = num3;
    }

    public k() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
