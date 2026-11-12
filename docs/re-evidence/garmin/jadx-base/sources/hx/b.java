package hx;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import kg.f;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lhx/b;", "Landroid/os/Parcelable;", "", "eventType", "eventStartTimeGmt", "", "timezoneOffset", "", "durationInMilliseconds", "bodyBatteryImpact", "feedbackType", "shortFeedBack", "moveIQActivityType", "moveIQActivitySubType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "b", "h", "c", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "d", "Ljava/lang/Long;", "getDurationInMilliseconds", "()Ljava/lang/Long;", JWKParameterNames.RSA_EXPONENT, "f", IntegerTokenConverter.CONVERTER_KEY, "g", "j", "getMoveIQActivityType", "getMoveIQActivitySubType", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventStartTimeGmt")
    private final String eventStartTimeGmt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timezoneOffset")
    private final Integer timezoneOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationInMilliseconds")
    private final Long durationInMilliseconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryImpact")
    private final Integer bodyBatteryImpact;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackType")
    private final String feedbackType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortFeedback")
    private final String shortFeedBack;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moveIQActivityType")
    private final Integer moveIQActivityType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moveIQActivitySubType")
    private final Integer moveIQActivitySubType;

    /* JADX INFO: renamed from: hx.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1710b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Integer num;
            Integer numValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            Long l14 = lValueOf;
            Integer num2 = numValueOf3;
            String string4 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num3 = numValueOf4;
                numValueOf = null;
                num = num3;
            } else {
                num = numValueOf4;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new b(string, string2, numValueOf2, l14, num2, string3, string4, num, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C1710b();
    }

    public /* synthetic */ b(String str, String str2, Integer num, Long l14, Integer num2, String str3, String str4, Integer num3, Integer num4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : num3, (i14 & 256) != 0 ? null : num4);
    }

    public static DateTime g(b bVar) {
        DateTime dateTimeQ = k.q(bVar.eventStartTimeGmt, "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
        if (dateTimeQ == null) {
            return null;
        }
        Long l14 = bVar.durationInMilliseconds;
        return dateTimeQ.plusMillis(l14 != null ? (int) l14.longValue() : 0);
    }

    public final c b() {
        for (c cVar : c.values()) {
            if (s.g(cVar.f86014a, this.eventType)) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getBodyBatteryImpact() {
        return this.bodyBatteryImpact;
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
        return s.g(this.eventType, bVar.eventType) && s.g(this.eventStartTimeGmt, bVar.eventStartTimeGmt) && s.g(this.timezoneOffset, bVar.timezoneOffset) && s.g(this.durationInMilliseconds, bVar.durationInMilliseconds) && s.g(this.bodyBatteryImpact, bVar.bodyBatteryImpact) && s.g(this.feedbackType, bVar.feedbackType) && s.g(this.shortFeedBack, bVar.shortFeedBack) && s.g(this.moveIQActivityType, bVar.moveIQActivityType) && s.g(this.moveIQActivitySubType, bVar.moveIQActivitySubType);
    }

    public final Integer f() {
        Long l14 = this.durationInMilliseconds;
        if (l14 != null) {
            return Integer.valueOf((int) (l14.longValue() / ((long) 1000)));
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEventStartTimeGmt() {
        return this.eventStartTimeGmt;
    }

    public final int hashCode() {
        String str = this.eventType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventStartTimeGmt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.timezoneOffset;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l14 = this.durationInMilliseconds;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num2 = this.bodyBatteryImpact;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.feedbackType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shortFeedBack;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.moveIQActivityType;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.moveIQActivitySubType;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFeedbackType() {
        return this.feedbackType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getShortFeedBack() {
        return this.shortFeedBack;
    }

    public final DateTime k(String str) {
        return k.q(this.eventStartTimeGmt, str, DateTimeZone.UTC);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public final boolean o() {
        String str = this.shortFeedBack;
        String str2 = null;
        if (str == null || str.equals("NONE")) {
            str = null;
        }
        if (str != null) {
            return true;
        }
        String str3 = this.feedbackType;
        if (str3 != null && !str3.equals("NONE")) {
            str2 = str3;
        }
        return str2 != null;
    }

    public final String toString() {
        String str = this.eventType;
        String str2 = this.eventStartTimeGmt;
        Integer num = this.timezoneOffset;
        Long l14 = this.durationInMilliseconds;
        Integer num2 = this.bodyBatteryImpact;
        String str3 = this.feedbackType;
        String str4 = this.shortFeedBack;
        Integer num3 = this.moveIQActivityType;
        Integer num4 = this.moveIQActivitySubType;
        StringBuilder sbI = p6.b.i("BodyBatteryEventDTO(eventType=", str, ", eventStartTimeGmt=", str2, ", timezoneOffset=");
        sbI.append(num);
        sbI.append(", durationInMilliseconds=");
        sbI.append(l14);
        sbI.append(", bodyBatteryImpact=");
        p6.b.l(num2, ", feedbackType=", str3, ", shortFeedBack=", sbI);
        fb1.c.u(num3, str4, ", moveIQActivityType=", ", moveIQActivitySubType=", sbI);
        return f3.i(sbI, num4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventType);
        parcel.writeString(this.eventStartTimeGmt);
        Integer num = this.timezoneOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Long l14 = this.durationInMilliseconds;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Integer num2 = this.bodyBatteryImpact;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        parcel.writeString(this.feedbackType);
        parcel.writeString(this.shortFeedBack);
        Integer num3 = this.moveIQActivityType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num3);
        }
        Integer num4 = this.moveIQActivitySubType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx/b$a;", "", "<init>", "()V", "", "NONE", "Ljava/lang/String;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, Integer num, Long l14, Integer num2, String str3, String str4, Integer num3, Integer num4) {
        this.eventType = str;
        this.eventStartTimeGmt = str2;
        this.timezoneOffset = num;
        this.durationInMilliseconds = l14;
        this.bodyBatteryImpact = num2;
        this.feedbackType = str3;
        this.shortFeedBack = str4;
        this.moveIQActivityType = num3;
        this.moveIQActivitySubType = num4;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
