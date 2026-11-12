package hs1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b3\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b+\u0010<R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b-\u0010?R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b7\u0010BR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010ER\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\b#\u0010GR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b/\u0010JR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b@\u0010MR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b=\u0010PR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lhs1/d;", "", "", "uuid", "", "userProfilePk", "_calendarDate", "source", "", "includesWellnessData", "includesActivityData", "Lhs1/o;", "wellnessChronology", "Lhs1/i;", "movement", "Lhs1/c;", "calories", "Lhs1/e;", "heartRate", "Lhs1/g;", "intensityMinutes", "Lhs1/m;", "stress", "Lhs1/a;", "bodyBattery", "Lhs1/f;", "hydration", "Lhs1/l;", "respiration", "Lhs1/k;", "pulseOx", "Lhs1/h;", "jetLag", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhs1/o;Lhs1/i;Lhs1/c;Lhs1/e;Lhs1/g;Lhs1/m;Lhs1/a;Lhs1/f;Lhs1/l;Lhs1/k;Lhs1/h;)V", "a", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "b", "J", "getUserProfilePk", "()J", "c", "get_calendarDate", "d", "getSource", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "f", "Lhs1/o;", "m", "()Lhs1/o;", "h", "Lhs1/i;", IntegerTokenConverter.CONVERTER_KEY, "()Lhs1/i;", "Lhs1/c;", "()Lhs1/c;", "j", "Lhs1/e;", "()Lhs1/e;", JWKParameterNames.OCT_KEY_VALUE, "Lhs1/g;", "()Lhs1/g;", "l", "Lhs1/m;", "()Lhs1/m;", "Lhs1/a;", "()Lhs1/a;", JWKParameterNames.RSA_MODULUS, "Lhs1/f;", "()Lhs1/f;", "o", "Lhs1/l;", "()Lhs1/l;", "p", "Lhs1/k;", "()Lhs1/k;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lhs1/h;", "getJetLag", "()Lhs1/h;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String _calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("source")
    private final String source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includesWellnessData")
    private final Boolean includesWellnessData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includesActivityData")
    private final Boolean includesActivityData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessChronology")
    private final o wellnessChronology;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("movement")
    private final i movement;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final c calories;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heartRate")
    private final e heartRate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("intensityMinutes")
    private final g intensityMinutes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stress")
    private final m stress;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBattery")
    private final a bodyBattery;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydration")
    private final f hydration;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respiration")
    private final l respiration;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pulseOx")
    private final k pulseOx;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("jetLag")
    private final h jetLag;

    public /* synthetic */ d(String str, long j8, String str2, String str3, Boolean bool, Boolean bool2, o oVar, i iVar, c cVar, e eVar, g gVar, m mVar, a aVar, f fVar, l lVar, k kVar, h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, str2, str3, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : bool2, (i14 & 64) != 0 ? null : oVar, (i14 & 128) != 0 ? null : iVar, (i14 & 256) != 0 ? null : cVar, (i14 & 512) != 0 ? null : eVar, (i14 & 1024) != 0 ? null : gVar, (i14 & 2048) != 0 ? null : mVar, (i14 & 4096) != 0 ? null : aVar, (i14 & 8192) != 0 ? null : fVar, (i14 & 16384) != 0 ? null : lVar, (32768 & i14) != 0 ? null : kVar, (i14 & 65536) != 0 ? null : hVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBodyBattery() {
        return this.bodyBattery;
    }

    public final LocalDate b() {
        return g22.k.w(this._calendarDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getHydration() {
        return this.hydration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.uuid, dVar.uuid) && this.userProfilePk == dVar.userProfilePk && s.g(this._calendarDate, dVar._calendarDate) && s.g(this.source, dVar.source) && s.g(this.includesWellnessData, dVar.includesWellnessData) && s.g(this.includesActivityData, dVar.includesActivityData) && s.g(this.wellnessChronology, dVar.wellnessChronology) && s.g(this.movement, dVar.movement) && s.g(this.calories, dVar.calories) && s.g(this.heartRate, dVar.heartRate) && s.g(this.intensityMinutes, dVar.intensityMinutes) && s.g(this.stress, dVar.stress) && s.g(this.bodyBattery, dVar.bodyBattery) && s.g(this.hydration, dVar.hydration) && s.g(this.respiration, dVar.respiration) && s.g(this.pulseOx, dVar.pulseOx) && s.g(this.jetLag, dVar.jetLag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIncludesActivityData() {
        return this.includesActivityData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIncludesWellnessData() {
        return this.includesWellnessData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g getIntensityMinutes() {
        return this.intensityMinutes;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(q6.f.e(this.uuid.hashCode() * 31, 31, this.userProfilePk), 31, this._calendarDate), 31, this.source);
        Boolean bool = this.includesWellnessData;
        int iHashCode = (iJ + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.includesActivityData;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        o oVar = this.wellnessChronology;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        i iVar = this.movement;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        c cVar = this.calories;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e eVar = this.heartRate;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.intensityMinutes;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        m mVar = this.stress;
        int iHashCode8 = (iHashCode7 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        a aVar = this.bodyBattery;
        int iHashCode9 = (iHashCode8 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f fVar = this.hydration;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        l lVar = this.respiration;
        int iHashCode11 = (iHashCode10 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        k kVar = this.pulseOx;
        int iHashCode12 = (iHashCode11 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        h hVar = this.jetLag;
        return iHashCode12 + (hVar != null ? hVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final i getMovement() {
        return this.movement;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getPulseOx() {
        return this.pulseOx;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final l getRespiration() {
        return this.respiration;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final m getStress() {
        return this.stress;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final o getWellnessChronology() {
        return this.wellnessChronology;
    }

    public final String toString() {
        String str = this.uuid;
        long j8 = this.userProfilePk;
        String str2 = this._calendarDate;
        String str3 = this.source;
        Boolean bool = this.includesWellnessData;
        Boolean bool2 = this.includesActivityData;
        o oVar = this.wellnessChronology;
        i iVar = this.movement;
        c cVar = this.calories;
        e eVar = this.heartRate;
        g gVar = this.intensityMinutes;
        m mVar = this.stress;
        a aVar = this.bodyBattery;
        f fVar = this.hydration;
        l lVar = this.respiration;
        k kVar = this.pulseOx;
        h hVar = this.jetLag;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "DailySummary(uuid=", str, ", userProfilePk=");
        sn.a.t(sbJ, ", _calendarDate=", str2, ", source=", str3);
        e0.r(bool, bool2, ", includesWellnessData=", ", includesActivityData=", sbJ);
        sbJ.append(", wellnessChronology=");
        sbJ.append(oVar);
        sbJ.append(", movement=");
        sbJ.append(iVar);
        sbJ.append(", calories=");
        sbJ.append(cVar);
        sbJ.append(", heartRate=");
        sbJ.append(eVar);
        sbJ.append(", intensityMinutes=");
        sbJ.append(gVar);
        sbJ.append(", stress=");
        sbJ.append(mVar);
        sbJ.append(", bodyBattery=");
        sbJ.append(aVar);
        sbJ.append(", hydration=");
        sbJ.append(fVar);
        sbJ.append(", respiration=");
        sbJ.append(lVar);
        sbJ.append(", pulseOx=");
        sbJ.append(kVar);
        sbJ.append(", jetLag=");
        sbJ.append(hVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    public d(String str, long j8, String str2, String str3, Boolean bool, Boolean bool2, o oVar, i iVar, c cVar, e eVar, g gVar, m mVar, a aVar, f fVar, l lVar, k kVar, h hVar) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.uuid = str;
        this.userProfilePk = j8;
        this._calendarDate = str2;
        this.source = str3;
        this.includesWellnessData = bool;
        this.includesActivityData = bool2;
        this.wellnessChronology = oVar;
        this.movement = iVar;
        this.calories = cVar;
        this.heartRate = eVar;
        this.intensityMinutes = gVar;
        this.stress = mVar;
        this.bodyBattery = aVar;
        this.hydration = fVar;
        this.respiration = lVar;
        this.pulseOx = kVar;
        this.jetLag = hVar;
    }
}
