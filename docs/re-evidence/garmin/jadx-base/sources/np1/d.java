package np1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b \u0010#\"\u0004\b)\u0010%R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0011\u0010#\"\u0004\b*\u0010%R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b\u0017\u0010#\"\u0004\b+\u0010%R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010!\u001a\u0004\b(\u0010#\"\u0004\b,\u0010%R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010!\u001a\u0004\b\u001a\u0010#\"\u0004\b-\u0010%¨\u0006."}, d2 = {"Lnp1/d;", "", "", "readingTimestampLocal", "readingTimestampGmt", "", "solarUtilization", "", "isCharging", "notChargingTooHot", "notChargingTooCold", "notChargingBatteryFull", "notChargingExternalPower", "notChargingUserDisabled", "notChargingOther", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZZZZZZZ)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "setReadingTimestampLocal", "(Ljava/lang/String;)V", "b", "g", "setReadingTimestampGmt", "c", "F", IntegerTokenConverter.CONVERTER_KEY, "()F", "setSolarUtilization", "(F)V", "d", "Z", "j", "()Z", "setCharging", "(Z)V", JWKParameterNames.RSA_EXPONENT, "setNotChargingTooHot", "f", "setNotChargingTooCold", "setNotChargingBatteryFull", "setNotChargingExternalPower", "setNotChargingUserDisabled", "setNotChargingOther", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingTimestampLocal")
    private String readingTimestampLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingTimestampGmt")
    private String readingTimestampGmt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("solarUtilization")
    private float solarUtilization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("charging")
    private boolean isCharging;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingTooHot")
    private boolean notChargingTooHot;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingTooCold")
    private boolean notChargingTooCold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingBatteryFull")
    private boolean notChargingBatteryFull;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingExternalPower")
    private boolean notChargingExternalPower;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingUserDisabled")
    private boolean notChargingUserDisabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingOther")
    private boolean notChargingOther;

    public /* synthetic */ d(String str, String str2, float f14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? 0.0f : f14, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? false : z17, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? false : z19, (i14 & 512) != 0 ? false : z24);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getNotChargingBatteryFull() {
        return this.notChargingBatteryFull;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNotChargingExternalPower() {
        return this.notChargingExternalPower;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getNotChargingOther() {
        return this.notChargingOther;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNotChargingTooCold() {
        return this.notChargingTooCold;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNotChargingTooHot() {
        return this.notChargingTooHot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.readingTimestampLocal, dVar.readingTimestampLocal) && s.g(this.readingTimestampGmt, dVar.readingTimestampGmt) && Float.compare(this.solarUtilization, dVar.solarUtilization) == 0 && this.isCharging == dVar.isCharging && this.notChargingTooHot == dVar.notChargingTooHot && this.notChargingTooCold == dVar.notChargingTooCold && this.notChargingBatteryFull == dVar.notChargingBatteryFull && this.notChargingExternalPower == dVar.notChargingExternalPower && this.notChargingUserDisabled == dVar.notChargingUserDisabled && this.notChargingOther == dVar.notChargingOther;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getNotChargingUserDisabled() {
        return this.notChargingUserDisabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReadingTimestampGmt() {
        return this.readingTimestampGmt;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getReadingTimestampLocal() {
        return this.readingTimestampLocal;
    }

    public final int hashCode() {
        String str = this.readingTimestampLocal;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.readingTimestampGmt;
        return Boolean.hashCode(this.notChargingOther) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.d(this.solarUtilization, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.isCharging), 31, this.notChargingTooHot), 31, this.notChargingTooCold), 31, this.notChargingBatteryFull), 31, this.notChargingExternalPower), 31, this.notChargingUserDisabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getSolarUtilization() {
        return this.solarUtilization;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    public final String toString() {
        String str = this.readingTimestampLocal;
        String str2 = this.readingTimestampGmt;
        float f14 = this.solarUtilization;
        boolean z14 = this.isCharging;
        boolean z15 = this.notChargingTooHot;
        boolean z16 = this.notChargingTooCold;
        boolean z17 = this.notChargingBatteryFull;
        boolean z18 = this.notChargingExternalPower;
        boolean z19 = this.notChargingUserDisabled;
        boolean z24 = this.notChargingOther;
        StringBuilder sbI = p6.b.i("SolarInputReadingDTO(readingTimestampLocal=", str, ", readingTimestampGmt=", str2, ", solarUtilization=");
        sbI.append(f14);
        sbI.append(", isCharging=");
        sbI.append(z14);
        sbI.append(", notChargingTooHot=");
        kg.f.q(", notChargingTooCold=", ", notChargingBatteryFull=", sbI, z15, z16);
        kg.f.q(", notChargingExternalPower=", ", notChargingUserDisabled=", sbI, z17, z18);
        return com.airbnb.lottie.animation.keyframe.a.f(", notChargingOther=", ")", sbI, z19, z24);
    }

    public d(String str, String str2, float f14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.readingTimestampLocal = str;
        this.readingTimestampGmt = str2;
        this.solarUtilization = f14;
        this.isCharging = z14;
        this.notChargingTooHot = z15;
        this.notChargingTooCold = z16;
        this.notChargingBatteryFull = z17;
        this.notChargingExternalPower = z18;
        this.notChargingUserDisabled = z19;
        this.notChargingOther = z24;
    }

    public d() {
        this(null, null, 0.0f, false, false, false, false, false, false, false, 1023, null);
    }
}
