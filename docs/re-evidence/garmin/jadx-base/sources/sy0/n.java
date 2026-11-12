package sy0;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsy0/n;", "", "Lmm1/b;", "sleepDataState", "Lq71/d;", "vo2DataState", "Li53/c;", "Lx61/e;", "heatAltitudeAcclimationData", "Lk61/b;", "cyclingAbilityData", "Lcom/garmin/android/apps/connectmobile/performance/model/c;", "trainingLoadData", "Loz1/b;", "trainingReadinessData", "Lgy0/k;", "enduranceScoreData", "Lr61/a;", "dailyRacePredictorData", "<init>", "(Lmm1/b;Lq71/d;Li53/c;Lk61/b;Li53/c;Li53/c;Lgy0/k;Li53/c;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm1.b f161259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q71.d f161260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<x61.e> f161261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k61.b f161262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<com.garmin.android.apps.connectmobile.performance.model.c> f161263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<oz1.b> f161264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gy0.k f161265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<r61.a> f161266h;

    static {
        n61.f.Companion companion = n61.f.INSTANCE;
        Parcelable.Creator<oz1.b> creator = oz1.b.CREATOR;
        com.garmin.android.apps.connectmobile.performance.model.c.b bVar = com.garmin.android.apps.connectmobile.performance.model.c.E;
        Parcelable.Creator<x61.e> creator2 = x61.e.CREATOR;
    }

    public /* synthetic */ n(mm1.b bVar, q71.d dVar, i53.c cVar, k61.b bVar2, i53.c cVar2, i53.c cVar3, gy0.k kVar, i53.c cVar4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? null : bVar2, (i14 & 16) != 0 ? null : cVar2, (i14 & 32) != 0 ? null : cVar3, (i14 & 64) != 0 ? null : kVar, (i14 & 128) != 0 ? null : cVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f161259a, nVar.f161259a) && p005kotlin.jvm.internal.s.g(this.f161260b, nVar.f161260b) && p005kotlin.jvm.internal.s.g(this.f161261c, nVar.f161261c) && p005kotlin.jvm.internal.s.g(this.f161262d, nVar.f161262d) && p005kotlin.jvm.internal.s.g(this.f161263e, nVar.f161263e) && p005kotlin.jvm.internal.s.g(this.f161264f, nVar.f161264f) && p005kotlin.jvm.internal.s.g(this.f161265g, nVar.f161265g) && p005kotlin.jvm.internal.s.g(this.f161266h, nVar.f161266h);
    }

    public final int hashCode() {
        mm1.b bVar = this.f161259a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        q71.d dVar = this.f161260b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.f143238a.hashCode())) * 31;
        i53.c<x61.e> cVar = this.f161261c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        k61.b bVar2 = this.f161262d;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        i53.c<com.garmin.android.apps.connectmobile.performance.model.c> cVar2 = this.f161263e;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        i53.c<oz1.b> cVar3 = this.f161264f;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        gy0.k kVar = this.f161265g;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        i53.c<r61.a> cVar4 = this.f161266h;
        return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReportChartData(sleepDataState=");
        sb3.append(this.f161259a);
        sb3.append(", vo2DataState=");
        sb3.append(this.f161260b);
        sb3.append(", heatAltitudeAcclimationData=");
        sb3.append(this.f161261c);
        sb3.append(", cyclingAbilityData=");
        sb3.append(this.f161262d);
        sb3.append(", trainingLoadData=");
        q6.f.w(sb3, this.f161263e, ", trainingReadinessData=", this.f161264f, ", enduranceScoreData=");
        sb3.append(this.f161265g);
        sb3.append(", dailyRacePredictorData=");
        sb3.append(this.f161266h);
        sb3.append(")");
        return sb3.toString();
    }

    public n(mm1.b bVar, q71.d dVar, i53.c<x61.e> cVar, k61.b bVar2, i53.c<com.garmin.android.apps.connectmobile.performance.model.c> cVar2, i53.c<oz1.b> cVar3, gy0.k kVar, i53.c<r61.a> cVar4) {
        this.f161259a = bVar;
        this.f161260b = dVar;
        this.f161261c = cVar;
        this.f161262d = bVar2;
        this.f161263e = cVar2;
        this.f161264f = cVar3;
        this.f161265g = kVar;
        this.f161266h = cVar4;
    }

    public n() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
