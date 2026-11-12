package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lgs1/t;", "Landroid/os/Parcelable;", "Lgs1/a;", "activitiesForDayDTO", "Lgs1/d;", "allDayHeartRateDTO", "Lgs1/e;", "allDayStressDTO", "Lgs1/i;", "currentDayDailySleepDTO", "Lgs1/m;", "heartRateZonesDTO", "Lgs1/j;", "dailyMovementDTO", "Lgs1/g;", "autoDetectedEventDTO", "Lgs1/o;", "sleepTimesDTO", "Lgs1/z;", "userDailySummary", "Lgs1/a0;", "wellnessActivitySummaries", "Lgs1/q;", "spo2DailyAcclimationDTO", "<init>", "(Lgs1/a;Lgs1/d;Lgs1/e;Lgs1/i;Lgs1/m;Lgs1/j;Lgs1/g;Lgs1/o;Lgs1/z;Lgs1/a0;Lgs1/q;)V", "a", "Lgs1/a;", "d", "()Lgs1/a;", "b", "Lgs1/d;", "f", "()Lgs1/d;", "c", "Lgs1/e;", "g", "()Lgs1/e;", "Lgs1/i;", IntegerTokenConverter.CONVERTER_KEY, "()Lgs1/i;", JWKParameterNames.RSA_EXPONENT, "Lgs1/m;", JWKParameterNames.OCT_KEY_VALUE, "()Lgs1/m;", "Lgs1/j;", "j", "()Lgs1/j;", "Lgs1/g;", "h", "()Lgs1/g;", "Lgs1/o;", "m", "()Lgs1/o;", "Lgs1/z;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Lgs1/z;", "Lgs1/a0;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lgs1/a0;", "Lgs1/q;", "o", "()Lgs1/q;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f78871l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ActivitiesForDay")
    private final gs1.a activitiesForDayDTO;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AllDayHR")
    private final d allDayHeartRateDTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AllDayStress")
    private final e allDayStressDTO;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CurrentDayDailySleep")
    private final i currentDayDailySleepDTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("HRZones")
    private final m heartRateZonesDTO;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DailyMovement")
    private final j dailyMovementDTO;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AutoDetectedEvents")
    private final g autoDetectedEventDTO;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SleepTimes")
    private final o sleepTimesDTO;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UserDailySummary")
    private final z userDailySummary;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("WellnessActivitySummaries")
    private final a0 wellnessActivitySummaries;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Spo2DailyAcclimation")
    private final q spo2DailyAcclimationDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readInt() == 0 ? null : gs1.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : z.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : a0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? q.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public /* synthetic */ t(gs1.a aVar, d dVar, e eVar, i iVar, m mVar, j jVar, g gVar, o oVar, z zVar, a0 a0Var, q qVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? null : iVar, (i14 & 16) != 0 ? null : mVar, (i14 & 32) != 0 ? null : jVar, (i14 & 64) != 0 ? null : gVar, (i14 & 128) != 0 ? null : oVar, (i14 & 256) != 0 ? null : zVar, (i14 & 512) != 0 ? null : a0Var, (i14 & 1024) != 0 ? null : qVar);
    }

    public static t b(t tVar, i iVar, j jVar, int i14) {
        gs1.a aVar = tVar.activitiesForDayDTO;
        d dVar = tVar.allDayHeartRateDTO;
        e eVar = tVar.allDayStressDTO;
        if ((i14 & 8) != 0) {
            iVar = tVar.currentDayDailySleepDTO;
        }
        i iVar2 = iVar;
        m mVar = tVar.heartRateZonesDTO;
        if ((i14 & 32) != 0) {
            jVar = tVar.dailyMovementDTO;
        }
        g gVar = tVar.autoDetectedEventDTO;
        o oVar = tVar.sleepTimesDTO;
        z zVar = tVar.userDailySummary;
        a0 a0Var = tVar.wellnessActivitySummaries;
        q qVar = tVar.spo2DailyAcclimationDTO;
        tVar.getClass();
        return new t(aVar, dVar, eVar, iVar2, mVar, jVar, gVar, oVar, zVar, a0Var, qVar);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final gs1.a getActivitiesForDayDTO() {
        return this.activitiesForDayDTO;
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
        return p005kotlin.jvm.internal.s.g(this.activitiesForDayDTO, tVar.activitiesForDayDTO) && p005kotlin.jvm.internal.s.g(this.allDayHeartRateDTO, tVar.allDayHeartRateDTO) && p005kotlin.jvm.internal.s.g(this.allDayStressDTO, tVar.allDayStressDTO) && p005kotlin.jvm.internal.s.g(this.currentDayDailySleepDTO, tVar.currentDayDailySleepDTO) && p005kotlin.jvm.internal.s.g(this.heartRateZonesDTO, tVar.heartRateZonesDTO) && p005kotlin.jvm.internal.s.g(this.dailyMovementDTO, tVar.dailyMovementDTO) && p005kotlin.jvm.internal.s.g(this.autoDetectedEventDTO, tVar.autoDetectedEventDTO) && p005kotlin.jvm.internal.s.g(this.sleepTimesDTO, tVar.sleepTimesDTO) && p005kotlin.jvm.internal.s.g(this.userDailySummary, tVar.userDailySummary) && p005kotlin.jvm.internal.s.g(this.wellnessActivitySummaries, tVar.wellnessActivitySummaries) && p005kotlin.jvm.internal.s.g(this.spo2DailyAcclimationDTO, tVar.spo2DailyAcclimationDTO);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getAllDayHeartRateDTO() {
        return this.allDayHeartRateDTO;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getAllDayStressDTO() {
        return this.allDayStressDTO;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g getAutoDetectedEventDTO() {
        return this.autoDetectedEventDTO;
    }

    public final int hashCode() {
        gs1.a aVar = this.activitiesForDayDTO;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        d dVar = this.allDayHeartRateDTO;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.allDayStressDTO;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        i iVar = this.currentDayDailySleepDTO;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        m mVar = this.heartRateZonesDTO;
        int iHashCode5 = (iHashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        j jVar = this.dailyMovementDTO;
        int iHashCode6 = (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        g gVar = this.autoDetectedEventDTO;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        o oVar = this.sleepTimesDTO;
        int iHashCode8 = (iHashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        z zVar = this.userDailySummary;
        int iHashCode9 = (iHashCode8 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        a0 a0Var = this.wellnessActivitySummaries;
        int iHashCode10 = (iHashCode9 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        q qVar = this.spo2DailyAcclimationDTO;
        return iHashCode10 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final i getCurrentDayDailySleepDTO() {
        return this.currentDayDailySleepDTO;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final j getDailyMovementDTO() {
        return this.dailyMovementDTO;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m getHeartRateZonesDTO() {
        return this.heartRateZonesDTO;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final o getSleepTimesDTO() {
        return this.sleepTimesDTO;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final q getSpo2DailyAcclimationDTO() {
        return this.spo2DailyAcclimationDTO;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final z getUserDailySummary() {
        return this.userDailySummary;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final a0 getWellnessActivitySummaries() {
        return this.wellnessActivitySummaries;
    }

    public final boolean s() {
        d.c cVarB;
        List<d.b> listB;
        d dVar = this.allDayHeartRateDTO;
        return (dVar == null || (cVarB = dVar.getPayload()) == null || (listB = cVarB.b()) == null || listB.isEmpty()) ? false : true;
    }

    public final boolean t() {
        List<b> listB;
        gs1.a aVar = this.activitiesForDayDTO;
        return (aVar == null || (listB = aVar.b()) == null || listB.isEmpty()) ? false : true;
    }

    public final String toString() {
        return "TimelineDTO(activitiesForDayDTO=" + this.activitiesForDayDTO + ", allDayHeartRateDTO=" + this.allDayHeartRateDTO + ", allDayStressDTO=" + this.allDayStressDTO + ", currentDayDailySleepDTO=" + this.currentDayDailySleepDTO + ", heartRateZonesDTO=" + this.heartRateZonesDTO + ", dailyMovementDTO=" + this.dailyMovementDTO + ", autoDetectedEventDTO=" + this.autoDetectedEventDTO + ", sleepTimesDTO=" + this.sleepTimesDTO + ", userDailySummary=" + this.userDailySummary + ", wellnessActivitySummaries=" + this.wellnessActivitySummaries + ", spo2DailyAcclimationDTO=" + this.spo2DailyAcclimationDTO + ")";
    }

    public final boolean u() {
        e.c payload;
        e eVar = this.allDayStressDTO;
        return (eVar == null || (payload = eVar.getPayload()) == null || !(payload.b().isEmpty() ^ true)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        gs1.a aVar = this.activitiesForDayDTO;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        d dVar = this.allDayHeartRateDTO;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        e eVar = this.allDayStressDTO;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        i iVar = this.currentDayDailySleepDTO;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        m mVar = this.heartRateZonesDTO;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
        j jVar = this.dailyMovementDTO;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        g gVar = this.autoDetectedEventDTO;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
        o oVar = this.sleepTimesDTO;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oVar.writeToParcel(parcel, i14);
        }
        z zVar = this.userDailySummary;
        if (zVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zVar.writeToParcel(parcel, i14);
        }
        a0 a0Var = this.wellnessActivitySummaries;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var.writeToParcel(parcel, i14);
        }
        q qVar = this.spo2DailyAcclimationDTO;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, i14);
        }
    }

    public final boolean y() {
        d.c cVarB;
        List<d.b> listF;
        d dVar = this.allDayHeartRateDTO;
        return (dVar == null || (cVarB = dVar.getPayload()) == null || (listF = cVarB.f()) == null || listF.isEmpty()) ? false : true;
    }

    public final boolean z() {
        j.c cVarB;
        List<j.b> listD;
        j jVar = this.dailyMovementDTO;
        return (jVar == null || (cVarB = jVar.getPayload()) == null || (listD = cVarB.d()) == null || listD.isEmpty()) ? false : true;
    }

    public t(gs1.a aVar, d dVar, e eVar, i iVar, m mVar, j jVar, g gVar, o oVar, z zVar, a0 a0Var, q qVar) {
        this.activitiesForDayDTO = aVar;
        this.allDayHeartRateDTO = dVar;
        this.allDayStressDTO = eVar;
        this.currentDayDailySleepDTO = iVar;
        this.heartRateZonesDTO = mVar;
        this.dailyMovementDTO = jVar;
        this.autoDetectedEventDTO = gVar;
        this.sleepTimesDTO = oVar;
        this.userDailySummary = zVar;
        this.wellnessActivitySummaries = a0Var;
        this.spo2DailyAcclimationDTO = qVar;
    }

    public t() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
