package o61;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo61/p;", "", "", "userId", "Lo61/q;", "generic", "cycling", "rowing", "Lx61/e;", "heatAltitudeAcclimation", "<init>", "(JLo61/q;Lo61/q;Lo61/q;Lx61/e;)V", "a", "J", "getUserId", "()J", "b", "Lo61/q;", "()Lo61/q;", "c", "d", "getRowing", JWKParameterNames.RSA_EXPONENT, "Lx61/e;", "getHeatAltitudeAcclimation", "()Lx61/e;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("generic")
    private final q generic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycling")
    private final q cycling;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rowing")
    private final q rowing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heatAltitudeAcclimation")
    private final x61.e heatAltitudeAcclimation;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129635a;

        static {
            int[] iArr = new int[q71.e.values().length];
            try {
                iArr[q71.e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q71.e.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q71.e.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129635a = iArr;
        }
    }

    public p(long j8, q qVar, q qVar2, q qVar3, x61.e eVar) {
        this.userId = j8;
        this.generic = qVar;
        this.cycling = qVar2;
        this.rowing = qVar3;
        this.heatAltitudeAcclimation = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getCycling() {
        return this.cycling;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q getGeneric() {
        return this.generic;
    }

    public final q c(q71.e eVar) {
        eVar.getClass();
        int i14 = a.f129635a[eVar.ordinal()];
        if (i14 == 1) {
            return this.generic;
        }
        if (i14 == 2) {
            return this.cycling;
        }
        if (i14 == 3) {
            return this.rowing;
        }
        u0.r();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.userId == pVar.userId && s.g(this.generic, pVar.generic) && s.g(this.cycling, pVar.cycling) && s.g(this.rowing, pVar.rowing) && s.g(this.heatAltitudeAcclimation, pVar.heatAltitudeAcclimation);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userId) * 31;
        q qVar = this.generic;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        q qVar2 = this.cycling;
        int iHashCode3 = (iHashCode2 + (qVar2 == null ? 0 : qVar2.hashCode())) * 31;
        q qVar3 = this.rowing;
        int iHashCode4 = (iHashCode3 + (qVar3 == null ? 0 : qVar3.hashCode())) * 31;
        x61.e eVar = this.heatAltitudeAcclimation;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "VO2MaxMetricDataDTO(userId=" + this.userId + ", generic=" + this.generic + ", cycling=" + this.cycling + ", rowing=" + this.rowing + ", heatAltitudeAcclimation=" + this.heatAltitudeAcclimation + ")";
    }
}
