package so1;

import b71.i;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.DateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018¨\u0006%"}, d2 = {"Lso1/b;", "", "Lorg/joda/time/DateTime;", "activityStartLocalTime", "userLocalTime", "", "userCountryCode", "", "startLatitude", "startLongitude", "", "activityTypeId", "locale", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Lorg/joda/time/DateTime;", "getActivityStartLocalTime", "()Lorg/joda/time/DateTime;", "b", "getUserLocalTime", "c", "Ljava/lang/String;", "getUserCountryCode", "()Ljava/lang/String;", "d", "Ljava/lang/Double;", "getStartLatitude", "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "getStartLongitude", "f", "Ljava/lang/Long;", "getActivityTypeId", "()Ljava/lang/Long;", "g", "getLocale", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityStartLocalTime")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime activityStartLocalTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLocalTime")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime userLocalTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userCountryCode")
    private final String userCountryCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLatitude")
    private final Double startLatitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLongitude")
    private final Double startLongitude;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final Long activityTypeId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    public /* synthetic */ b(DateTime dateTime, DateTime dateTime2, String str, Double d14, Double d15, Long l14, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : dateTime2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : d15, (i14 & 32) != 0 ? null : l14, (i14 & 64) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.activityStartLocalTime, bVar.activityStartLocalTime) && s.g(this.userLocalTime, bVar.userLocalTime) && s.g(this.userCountryCode, bVar.userCountryCode) && s.g(this.startLatitude, bVar.startLatitude) && s.g(this.startLongitude, bVar.startLongitude) && s.g(this.activityTypeId, bVar.activityTypeId) && s.g(this.locale, bVar.locale);
    }

    public final int hashCode() {
        DateTime dateTime = this.activityStartLocalTime;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.userLocalTime;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str = this.userCountryCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.startLatitude;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.startLongitude;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l14 = this.activityTypeId;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.locale;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        DateTime dateTime = this.activityStartLocalTime;
        DateTime dateTime2 = this.userLocalTime;
        String str = this.userCountryCode;
        Double d14 = this.startLatitude;
        Double d15 = this.startLongitude;
        Long l14 = this.activityTypeId;
        String str2 = this.locale;
        StringBuilder sb3 = new StringBuilder("StickerCriteriaDTO(activityStartLocalTime=");
        sb3.append(dateTime);
        sb3.append(", userLocalTime=");
        sb3.append(dateTime2);
        sb3.append(", userCountryCode=");
        i.x(sb3, str, ", startLatitude=", d14, ", startLongitude=");
        sb3.append(d15);
        sb3.append(", activityTypeId=");
        sb3.append(l14);
        sb3.append(", locale=");
        return am.j.o(str2, ")", sb3);
    }

    public b(DateTime dateTime, DateTime dateTime2, String str, Double d14, Double d15, Long l14, String str2) {
        this.activityStartLocalTime = dateTime;
        this.userLocalTime = dateTime2;
        this.userCountryCode = str;
        this.startLatitude = d14;
        this.startLongitude = d15;
        this.activityTypeId = l14;
        this.locale = str2;
    }

    public b() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
