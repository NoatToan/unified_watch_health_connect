package db1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.pregnancytracking.data.GlucoseUnitEnumTypeAdapter$GlucoseUnitEnumAdapter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\b\u0018\u0010,\"\u0004\b/\u0010.R$\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Ldb1/t;", "Landroid/os/Parcelable;", "", "value", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "unit", "Ldb1/d;", "logType", "Ldb1/q;", "source", "Lorg/joda/time/DateTime;", "userMeasurementTimestamp", "gmtMeasurementTimestamp", "reportTimestamp", "Ldb1/o;", "requestOrigin", "<init>", "(Ljava/lang/Double;Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;Ldb1/d;Ldb1/q;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ldb1/o;)V", "a", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/Double;)V", "b", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "getUnit", "()Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "o", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;)V", "c", "Ldb1/d;", "d", "()Ldb1/d;", IntegerTokenConverter.CONVERTER_KEY, "(Ldb1/d;)V", "Ldb1/q;", "getSource", "()Ldb1/q;", "m", "(Ldb1/q;)V", JWKParameterNames.RSA_EXPONENT, "Lorg/joda/time/DateTime;", "f", "()Lorg/joda/time/DateTime;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Lorg/joda/time/DateTime;)V", "h", "getReportTimestamp", "j", "Ldb1/o;", "getRequestOrigin", "()Ldb1/o;", JWKParameterNames.OCT_KEY_VALUE, "(Ldb1/o;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR;

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
    @SerializedName("userMeasurementTimestamp")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private DateTime userMeasurementTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmtMeasurementTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime gmtMeasurementTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime reportTimestamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestOrigin")
    private o requestOrigin;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.pregnancytracking.data.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : q.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0 ? o.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ t(Double d14, com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar, d dVar, q qVar, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : qVar, (i14 & 16) != 0 ? null : dateTime, (i14 & 32) != 0 ? null : dateTime2, (i14 & 64) != 0 ? null : dateTime3, (i14 & 128) != 0 ? null : oVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getGmtMeasurementTimestamp() {
        return this.gmtMeasurementTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getLogType() {
        return this.logType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.value, tVar.value) && this.unit == tVar.unit && this.logType == tVar.logType && this.source == tVar.source && p005kotlin.jvm.internal.s.g(this.userMeasurementTimestamp, tVar.userMeasurementTimestamp) && p005kotlin.jvm.internal.s.g(this.gmtMeasurementTimestamp, tVar.gmtMeasurementTimestamp) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, tVar.reportTimestamp) && this.requestOrigin == tVar.requestOrigin;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getUserMeasurementTimestamp() {
        return this.userMeasurementTimestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final void h(DateTime dateTime) {
        this.gmtMeasurementTimestamp = dateTime;
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
        DateTime dateTime = this.userMeasurementTimestamp;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.gmtMeasurementTimestamp;
        int iHashCode6 = (iHashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.reportTimestamp;
        int iHashCode7 = (iHashCode6 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        o oVar = this.requestOrigin;
        return iHashCode7 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final void i(d dVar) {
        this.logType = dVar;
    }

    public final void j(DateTime dateTime) {
        this.reportTimestamp = dateTime;
    }

    public final void k(o oVar) {
        this.requestOrigin = oVar;
    }

    public final void m(q qVar) {
        this.source = qVar;
    }

    public final void o(com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar) {
        this.unit = aVar;
    }

    public final void q(DateTime dateTime) {
        this.userMeasurementTimestamp = dateTime;
    }

    public final void r(Double d14) {
        this.value = d14;
    }

    public final String toString() {
        return "UserGlucoseInputDTO(value=" + this.value + ", unit=" + this.unit + ", logType=" + this.logType + ", source=" + this.source + ", userMeasurementTimestamp=" + this.userMeasurementTimestamp + ", gmtMeasurementTimestamp=" + this.gmtMeasurementTimestamp + ", reportTimestamp=" + this.reportTimestamp + ", requestOrigin=" + this.requestOrigin + ")";
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
        parcel.writeSerializable(this.userMeasurementTimestamp);
        parcel.writeSerializable(this.gmtMeasurementTimestamp);
        parcel.writeSerializable(this.reportTimestamp);
        o oVar = this.requestOrigin;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(oVar.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb1/t$a;", "", "<init>", "()V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public t(Double d14, com.garmin.android.apps.connectmobile.pregnancytracking.data.a aVar, d dVar, q qVar, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, o oVar) {
        this.value = d14;
        this.unit = aVar;
        this.logType = dVar;
        this.source = qVar;
        this.userMeasurementTimestamp = dateTime;
        this.gmtMeasurementTimestamp = dateTime2;
        this.reportTimestamp = dateTime3;
        this.requestOrigin = oVar;
    }

    public t() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
