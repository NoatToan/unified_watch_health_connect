package db1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.garmin.android.apps.connectmobile.pregnancytracking.data.GlucoseUnitEnumTypeAdapter$GlucoseUnitEnumAdapter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u00102\u001a\u0004\b&\u00103\"\u0004\b4\u00105R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:¨\u0006?"}, d2 = {"Ldb1/r;", "Landroid/os/Parcelable;", "", "value", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "unit", "Ldb1/d;", "logType", "Ldb1/q;", "source", "", "gmtOffset", "Lorg/joda/time/LocalDate;", "calendarDate", "Lorg/joda/time/DateTime;", "userMeasurementTimestamp", "originalUserMeasurementTimestamp", "reportTimestamp", "<init>", "(Ljava/lang/Double;Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;Ldb1/d;Ldb1/q;Ljava/lang/Long;Lorg/joda/time/LocalDate;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Double;", "m", "()Ljava/lang/Double;", "u", "(Ljava/lang/Double;)V", "b", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "j", "()Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "s", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;)V", "c", "Ldb1/d;", "g", "()Ldb1/d;", "o", "(Ldb1/d;)V", "d", "Ldb1/q;", IntegerTokenConverter.CONVERTER_KEY, "()Ldb1/q;", "setSource", "(Ldb1/q;)V", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setGmtOffset", "(Ljava/lang/Long;)V", "Lorg/joda/time/LocalDate;", "()Lorg/joda/time/LocalDate;", "setCalendarDate", "(Lorg/joda/time/LocalDate;)V", "Lorg/joda/time/DateTime;", JWKParameterNames.OCT_KEY_VALUE, "()Lorg/joda/time/DateTime;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Lorg/joda/time/DateTime;)V", "h", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getReportTimestamp", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private Double value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit")
    @JsonAdapter(GlucoseUnitEnumTypeAdapter$GlucoseUnitEnumAdapter.class)
    private com.garmin.android.apps.connectmobile.pregnancytracking.data.a unit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("logType")
    private d logType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("source")
    private q source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmtOffset")
    private Long gmtOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate calendarDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userMeasurementTimestamp")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private DateTime userMeasurementTimestamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originalUserMeasurementTimestamp")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private DateTime originalUserMeasurementTimestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime reportTimestamp;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f59064j = new a(null);
    public static final Parcelable.Creator<r> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.pregnancytracking.data.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : q.valueOf(parcel.readString()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (LocalDate) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(Double d14, com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar, d dVar, q qVar, Long l14, LocalDate localDate, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : qVar, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : localDate, (i14 & 64) != 0 ? null : dateTime, (i14 & 128) != 0 ? null : dateTime2, (i14 & 256) != 0 ? null : dateTime3);
    }

    public static r b(r rVar) {
        return new r(rVar.value, rVar.unit, rVar.logType, rVar.source, rVar.gmtOffset, rVar.calendarDate, rVar.userMeasurementTimestamp, rVar.originalUserMeasurementTimestamp, rVar.reportTimestamp);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getCalendarDate() {
        return this.calendarDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.value, rVar.value) && this.unit == rVar.unit && this.logType == rVar.logType && this.source == rVar.source && p005kotlin.jvm.internal.s.g(this.gmtOffset, rVar.gmtOffset) && p005kotlin.jvm.internal.s.g(this.calendarDate, rVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.userMeasurementTimestamp, rVar.userMeasurementTimestamp) && p005kotlin.jvm.internal.s.g(this.originalUserMeasurementTimestamp, rVar.originalUserMeasurementTimestamp) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, rVar.reportTimestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getGmtOffset() {
        return this.gmtOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getLogType() {
        return this.logType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getOriginalUserMeasurementTimestamp() {
        return this.originalUserMeasurementTimestamp;
    }

    public final int hashCode() {
        Double d14 = this.value;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar = this.unit;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.logType;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        q qVar = this.source;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Long l14 = this.gmtOffset;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        LocalDate localDate = this.calendarDate;
        int iHashCode6 = (iHashCode5 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        DateTime dateTime = this.userMeasurementTimestamp;
        int iHashCode7 = (iHashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.originalUserMeasurementTimestamp;
        int iHashCode8 = (iHashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.reportTimestamp;
        return iHashCode8 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final q getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final com.garmin.android.apps.connectmobile.pregnancytracking.data.a getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final DateTime getUserMeasurementTimestamp() {
        return this.userMeasurementTimestamp;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final void o(d dVar) {
        this.logType = dVar;
    }

    public final void q(DateTime dateTime) {
        this.originalUserMeasurementTimestamp = dateTime;
    }

    public final void r(DateTime dateTime) {
        this.reportTimestamp = dateTime;
    }

    public final void s(com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar) {
        this.unit = aVar;
    }

    public final void t(DateTime dateTime) {
        this.userMeasurementTimestamp = dateTime;
    }

    public final String toString() {
        return "UserGlucoseDTO(value=" + this.value + ", unit=" + this.unit + ", logType=" + this.logType + ", source=" + this.source + ", gmtOffset=" + this.gmtOffset + ", calendarDate=" + this.calendarDate + ", userMeasurementTimestamp=" + this.userMeasurementTimestamp + ", originalUserMeasurementTimestamp=" + this.originalUserMeasurementTimestamp + ", reportTimestamp=" + this.reportTimestamp + ")";
    }

    public final void u(Double d14) {
        this.value = d14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.value;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar = this.unit;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        d dVar = this.logType;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        q qVar = this.source;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(qVar.name());
        }
        Long l14 = this.gmtOffset;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeSerializable(this.calendarDate);
        parcel.writeSerializable(this.userMeasurementTimestamp);
        parcel.writeSerializable(this.originalUserMeasurementTimestamp);
        parcel.writeSerializable(this.reportTimestamp);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb1/r$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static r a(r rVar) {
            rVar.getClass();
            return new r(rVar.getValue(), rVar.getUnit(), rVar.getLogType(), rVar.getSource(), rVar.getGmtOffset(), rVar.getCalendarDate(), rVar.getUserMeasurementTimestamp(), rVar.getOriginalUserMeasurementTimestamp(), rVar.getOriginalUserMeasurementTimestamp());
        }

        private a() {
        }
    }

    public r(Double d14, com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar, d dVar, q qVar, Long l14, LocalDate localDate, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        this.value = d14;
        this.unit = aVar;
        this.logType = dVar;
        this.source = qVar;
        this.gmtOffset = l14;
        this.calendarDate = localDate;
        this.userMeasurementTimestamp = dateTime;
        this.originalUserMeasurementTimestamp = dateTime2;
        this.reportTimestamp = dateTime3;
    }

    public r() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
