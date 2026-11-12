package tt;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00107\u001a\u0004\b4\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b(\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\b,\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010=\u001a\u0004\b$\u0010>R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010?\u001a\u0004\b \u0010@¨\u0006A"}, d2 = {"Ltt/i;", "", "Ltt/n;", "coverPage", "Ltt/r;", "steps", "Ltt/o;", "pushes", "Ltt/q;", "sleepScore", "Ltt/p;", "sleep", "Ltt/l;", "bodyBattery", "Ltt/f;", "activitySummary", "Ltt/g;", "activityTime", "Ltt/c;", "activityDistance", "Ltt/d;", "activityElevation", "Ltt/b;", "activityCalories", "Ltt/a;", "achievements", "<init>", "(Ltt/n;Ltt/r;Ltt/o;Ltt/q;Ltt/p;Ltt/l;Ltt/f;Ltt/g;Ltt/c;Ltt/d;Ltt/b;Ltt/a;)V", "a", "Ltt/n;", IntegerTokenConverter.CONVERTER_KEY, "()Ltt/n;", "b", "Ltt/r;", "m", "()Ltt/r;", "c", "Ltt/o;", "j", "()Ltt/o;", "d", "Ltt/q;", "l", "()Ltt/q;", JWKParameterNames.RSA_EXPONENT, "Ltt/p;", JWKParameterNames.OCT_KEY_VALUE, "()Ltt/p;", "f", "Ltt/l;", "h", "()Ltt/l;", "g", "Ltt/f;", "()Ltt/f;", "Ltt/g;", "()Ltt/g;", "Ltt/c;", "()Ltt/c;", "Ltt/d;", "()Ltt/d;", "Ltt/b;", "()Ltt/b;", "Ltt/a;", "()Ltt/a;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coverPage")
    private final n coverPage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private final r steps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushes")
    private final o pushes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepScore")
    private final q sleepScore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleep")
    private final p sleep;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBattery")
    private final l bodyBattery;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activitySummary")
    private final f activitySummary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTime")
    private final g activityTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDistance")
    private final c activityDistance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityElevation")
    private final d activityElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityCalories")
    private final b activityCalories;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("achievements")
    private final a achievements;

    public i(n nVar, r rVar, o oVar, q qVar, p pVar, l lVar, f fVar, g gVar, c cVar, d dVar, b bVar, a aVar) {
        this.coverPage = nVar;
        this.steps = rVar;
        this.pushes = oVar;
        this.sleepScore = qVar;
        this.sleep = pVar;
        this.bodyBattery = lVar;
        this.activitySummary = fVar;
        this.activityTime = gVar;
        this.activityDistance = cVar;
        this.activityElevation = dVar;
        this.activityCalories = bVar;
        this.achievements = aVar;
    }

    public static i a(i iVar, n nVar) {
        return new i(nVar, iVar.steps, iVar.pushes, iVar.sleepScore, iVar.sleep, iVar.bodyBattery, iVar.activitySummary, iVar.activityTime, iVar.activityDistance, iVar.activityElevation, iVar.activityCalories, iVar.achievements);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getAchievements() {
        return this.achievements;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getActivityCalories() {
        return this.activityCalories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getActivityDistance() {
        return this.activityDistance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getActivityElevation() {
        return this.activityElevation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.coverPage, iVar.coverPage) && s.g(this.steps, iVar.steps) && s.g(this.pushes, iVar.pushes) && s.g(this.sleepScore, iVar.sleepScore) && s.g(this.sleep, iVar.sleep) && s.g(this.bodyBattery, iVar.bodyBattery) && s.g(this.activitySummary, iVar.activitySummary) && s.g(this.activityTime, iVar.activityTime) && s.g(this.activityDistance, iVar.activityDistance) && s.g(this.activityElevation, iVar.activityElevation) && s.g(this.activityCalories, iVar.activityCalories) && s.g(this.achievements, iVar.achievements);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getActivitySummary() {
        return this.activitySummary;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getActivityTime() {
        return this.activityTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l getBodyBattery() {
        return this.bodyBattery;
    }

    public final int hashCode() {
        n nVar = this.coverPage;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        r rVar = this.steps;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        o oVar = this.pushes;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        q qVar = this.sleepScore;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        p pVar = this.sleep;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        l lVar = this.bodyBattery;
        int iHashCode6 = (iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        f fVar = this.activitySummary;
        int iHashCode7 = (iHashCode6 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.activityTime;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        c cVar = this.activityDistance;
        int iHashCode9 = (iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.activityElevation;
        int iHashCode10 = (iHashCode9 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.activityCalories;
        int iHashCode11 = (iHashCode10 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.achievements;
        return iHashCode11 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final n getCoverPage() {
        return this.coverPage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final o getPushes() {
        return this.pushes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final p getSleep() {
        return this.sleep;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final q getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final r getSteps() {
        return this.steps;
    }

    public final String toString() {
        return "AnnualReportDTO(coverPage=" + this.coverPage + ", steps=" + this.steps + ", pushes=" + this.pushes + ", sleepScore=" + this.sleepScore + ", sleep=" + this.sleep + ", bodyBattery=" + this.bodyBattery + ", activitySummary=" + this.activitySummary + ", activityTime=" + this.activityTime + ", activityDistance=" + this.activityDistance + ", activityElevation=" + this.activityElevation + ", activityCalories=" + this.activityCalories + ", achievements=" + this.achievements + ")";
    }
}
