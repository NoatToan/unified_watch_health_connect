package co0;

import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006*"}, d2 = {"Lco0/e;", "", "", "changeState", "", "lactateThresholdHeartRateUsed", "maxHeartRateUsed", "restingHeartRateUsed", "", "restingHrAutoUpdateUsed", "sport", "trainingMethod", "zone1Floor", "zone2Floor", "zone3Floor", "zone4Floor", "zone5Floor", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "getChangeState", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getLactateThresholdHeartRateUsed", "()Ljava/lang/Integer;", "c", "d", "getRestingHeartRateUsed", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "getRestingHrAutoUpdateUsed", "()Ljava/lang/Boolean;", "f", "g", "getTrainingMethod", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("changeState")
    private final String changeState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lactateThresholdHeartRateUsed")
    private final Integer lactateThresholdHeartRateUsed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxHeartRateUsed")
    private final Integer maxHeartRateUsed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restingHeartRateUsed")
    private final Integer restingHeartRateUsed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restingHrAutoUpdateUsed")
    private final Boolean restingHrAutoUpdateUsed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private final String sport;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingMethod")
    private final String trainingMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zone1Floor")
    private final Integer zone1Floor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zone2Floor")
    private final Integer zone2Floor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zone3Floor")
    private final Integer zone3Floor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zone4Floor")
    private final Integer zone4Floor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zone5Floor")
    private final Integer zone5Floor;

    public e(String str, Integer num, Integer num2, Integer num3, Boolean bool, String str2, String str3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.changeState = str;
        this.lactateThresholdHeartRateUsed = num;
        this.maxHeartRateUsed = num2;
        this.restingHeartRateUsed = num3;
        this.restingHrAutoUpdateUsed = bool;
        this.sport = str2;
        this.trainingMethod = str3;
        this.zone1Floor = num4;
        this.zone2Floor = num5;
        this.zone3Floor = num6;
        this.zone4Floor = num7;
        this.zone5Floor = num8;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMaxHeartRateUsed() {
        return this.maxHeartRateUsed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSport() {
        return this.sport;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getZone1Floor() {
        return this.zone1Floor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getZone2Floor() {
        return this.zone2Floor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getZone3Floor() {
        return this.zone3Floor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.changeState, eVar.changeState) && s.g(this.lactateThresholdHeartRateUsed, eVar.lactateThresholdHeartRateUsed) && s.g(this.maxHeartRateUsed, eVar.maxHeartRateUsed) && s.g(this.restingHeartRateUsed, eVar.restingHeartRateUsed) && s.g(this.restingHrAutoUpdateUsed, eVar.restingHrAutoUpdateUsed) && s.g(this.sport, eVar.sport) && s.g(this.trainingMethod, eVar.trainingMethod) && s.g(this.zone1Floor, eVar.zone1Floor) && s.g(this.zone2Floor, eVar.zone2Floor) && s.g(this.zone3Floor, eVar.zone3Floor) && s.g(this.zone4Floor, eVar.zone4Floor) && s.g(this.zone5Floor, eVar.zone5Floor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getZone4Floor() {
        return this.zone4Floor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getZone5Floor() {
        return this.zone5Floor;
    }

    public final int hashCode() {
        String str = this.changeState;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.lactateThresholdHeartRateUsed;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxHeartRateUsed;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.restingHeartRateUsed;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.restingHrAutoUpdateUsed;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.sport;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trainingMethod;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.zone1Floor;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.zone2Floor;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.zone3Floor;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.zone4Floor;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.zone5Floor;
        return iHashCode11 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.changeState;
        Integer num = this.lactateThresholdHeartRateUsed;
        Integer num2 = this.maxHeartRateUsed;
        Integer num3 = this.restingHeartRateUsed;
        Boolean bool = this.restingHrAutoUpdateUsed;
        String str2 = this.sport;
        String str3 = this.trainingMethod;
        Integer num4 = this.zone1Floor;
        Integer num5 = this.zone2Floor;
        Integer num6 = this.zone3Floor;
        Integer num7 = this.zone4Floor;
        Integer num8 = this.zone5Floor;
        StringBuilder sbN = u0.n("HeartRateZones(changeState=", num, str, ", lactateThresholdHeartRateUsed=", ", maxHeartRateUsed=");
        x.m(sbN, num2, ", restingHeartRateUsed=", num3, ", restingHrAutoUpdateUsed=");
        i.s(sbN, bool, ", sport=", str2, ", trainingMethod=");
        fb1.c.u(num4, str3, ", zone1Floor=", ", zone2Floor=", sbN);
        x.m(sbN, num5, ", zone3Floor=", num6, ", zone4Floor=");
        return i.h(sbN, num7, ", zone5Floor=", num8, ")");
    }
}
