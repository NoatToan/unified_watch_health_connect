package o61;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lo61/q;", "", "", "calendarDate", "fitnessAge", "fitnessAgeDescription", "", "maxMetCategory", "vo2MaxValue", "vo2MaxPreciseValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;DD)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "getFitnessAgeDescription", "d", "Ljava/lang/Double;", "getMaxMetCategory", "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "D", "()D", "f", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitnessAge")
    private final String fitnessAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitnessAgeDescription")
    private final String fitnessAgeDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxMetCategory")
    private final Double maxMetCategory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vo2MaxValue")
    private final double vo2MaxValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vo2MaxPreciseValue")
    private final double vo2MaxPreciseValue;

    public /* synthetic */ q(String str, String str2, String str3, Double d14, double d15, double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? Double.valueOf(0.0d) : d14, (i14 & 16) != 0 ? 0.0d : d15, (i14 & 32) != 0 ? 0.0d : d16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    public final LocalDate b() {
        String str = this.calendarDate;
        if (str != null) {
            return g22.k.w(str, "yyyy-MM-dd");
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFitnessAge() {
        return this.fitnessAge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getVo2MaxPreciseValue() {
        return this.vo2MaxPreciseValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getVo2MaxValue() {
        return this.vo2MaxValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s.g(this.calendarDate, qVar.calendarDate) && s.g(this.fitnessAge, qVar.fitnessAge) && s.g(this.fitnessAgeDescription, qVar.fitnessAgeDescription) && s.g(this.maxMetCategory, qVar.maxMetCategory) && Double.compare(this.vo2MaxValue, qVar.vo2MaxValue) == 0 && Double.compare(this.vo2MaxPreciseValue, qVar.vo2MaxPreciseValue) == 0;
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fitnessAge;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fitnessAgeDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.maxMetCategory;
        return Double.hashCode(this.vo2MaxPreciseValue) + org.apache.commons.lang3.e.b((iHashCode3 + (d14 != null ? d14.hashCode() : 0)) * 31, 31, this.vo2MaxValue);
    }

    public final String toString() {
        String str = this.calendarDate;
        String str2 = this.fitnessAge;
        String str3 = this.fitnessAgeDescription;
        Double d14 = this.maxMetCategory;
        double d15 = this.vo2MaxValue;
        double d16 = this.vo2MaxPreciseValue;
        StringBuilder sbI = p6.b.i("VO2MaxRecordDTO(calendarDate=", str, ", fitnessAge=", str2, ", fitnessAgeDescription=");
        b71.i.x(sbI, str3, ", maxMetCategory=", d14, ", vo2MaxValue=");
        sbI.append(d15);
        return am.j.r(sbI, ", vo2MaxPreciseValue=", d16, ")");
    }

    public q(String str, String str2, String str3, Double d14, double d15, double d16) {
        this.calendarDate = str;
        this.fitnessAge = str2;
        this.fitnessAgeDescription = str3;
        this.maxMetCategory = d14;
        this.vo2MaxValue = d15;
        this.vo2MaxPreciseValue = d16;
    }

    public q() {
        this(null, null, null, null, 0.0d, 0.0d, 63, null);
    }
}
