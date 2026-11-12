package j70;

import hd1.c0;
import hd1.e0;
import hd1.g0;
import hd1.i0;
import hd1.k0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj70/i;", "", "Lhd1/m;", "realTimeBodyBatteryDTO", "Lhd1/o;", "realTimeCaloriesDTO", "Lhd1/y;", "realTimeFloorsDTO", "Lhd1/a0;", "realTimeHeartRateDTO", "Lhd1/c0;", "realTimeIntensityMinutesDTO", "Lhd1/i0;", "realTimeStepsDTO", "Lhd1/e0;", "realTimePushesDTO", "Lhd1/k0;", "realTimeTrainingReadinessDTO", "Lhd1/g0;", "realTimeRespirationDTO", "<init>", "(Lhd1/m;Lhd1/o;Lhd1/y;Lhd1/a0;Lhd1/c0;Lhd1/i0;Lhd1/e0;Lhd1/k0;Lhd1/g0;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd1.m f97533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd1.o f97534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd1.y f97535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd1.a0 f97536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f97537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f97538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f97539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f97540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f97541i;

    public /* synthetic */ i(hd1.m mVar, hd1.o oVar, hd1.y yVar, hd1.a0 a0Var, c0 c0Var, i0 i0Var, e0 e0Var, k0 k0Var, g0 g0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : mVar, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : yVar, (i14 & 8) != 0 ? null : a0Var, (i14 & 16) != 0 ? null : c0Var, (i14 & 32) != 0 ? null : i0Var, (i14 & 64) != 0 ? null : e0Var, (i14 & 128) != 0 ? null : k0Var, (i14 & 256) != 0 ? null : g0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f97533a, iVar.f97533a) && p005kotlin.jvm.internal.s.g(this.f97534b, iVar.f97534b) && p005kotlin.jvm.internal.s.g(this.f97535c, iVar.f97535c) && p005kotlin.jvm.internal.s.g(this.f97536d, iVar.f97536d) && p005kotlin.jvm.internal.s.g(this.f97537e, iVar.f97537e) && p005kotlin.jvm.internal.s.g(this.f97538f, iVar.f97538f) && p005kotlin.jvm.internal.s.g(this.f97539g, iVar.f97539g) && p005kotlin.jvm.internal.s.g(this.f97540h, iVar.f97540h) && p005kotlin.jvm.internal.s.g(this.f97541i, iVar.f97541i);
    }

    public final int hashCode() {
        hd1.m mVar = this.f97533a;
        int iHashCode = (mVar == null ? 0 : Integer.hashCode(mVar.f83391b)) * 31;
        hd1.o oVar = this.f97534b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        hd1.y yVar = this.f97535c;
        int iHashCode3 = (iHashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        hd1.a0 a0Var = this.f97536d;
        int iHashCode4 = (iHashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        c0 c0Var = this.f97537e;
        int iHashCode5 = (iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        i0 i0Var = this.f97538f;
        int iHashCode6 = (iHashCode5 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        e0 e0Var = this.f97539g;
        int iHashCode7 = (iHashCode6 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        k0 k0Var = this.f97540h;
        int iHashCode8 = (iHashCode7 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        g0 g0Var = this.f97541i;
        return iHashCode8 + (g0Var != null ? Integer.hashCode(g0Var.f83381b) : 0);
    }

    public final String toString() {
        return "DashboardRealTimeData(realTimeBodyBatteryDTO=" + this.f97533a + ", realTimeCaloriesDTO=" + this.f97534b + ", realTimeFloorsDTO=" + this.f97535c + ", realTimeHeartRateDTO=" + this.f97536d + ", realTimeIntensityMinutesDTO=" + this.f97537e + ", realTimeStepsDTO=" + this.f97538f + ", realTimePushesDTO=" + this.f97539g + ", realTimeTrainingReadinessDTO=" + this.f97540h + ", realTimeRespirationDTO=" + this.f97541i + ")";
    }

    public i(hd1.m mVar, hd1.o oVar, hd1.y yVar, hd1.a0 a0Var, c0 c0Var, i0 i0Var, e0 e0Var, k0 k0Var, g0 g0Var) {
        this.f97533a = mVar;
        this.f97534b = oVar;
        this.f97535c = yVar;
        this.f97536d = a0Var;
        this.f97537e = c0Var;
        this.f97538f = i0Var;
        this.f97539g = e0Var;
        this.f97540h = k0Var;
        this.f97541i = g0Var;
    }

    public i() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
