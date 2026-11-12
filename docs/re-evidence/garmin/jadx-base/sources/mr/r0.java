package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmr/r0;", "", "Ljr/d;", "activityTypeConfiguration", "Lps/r;", "activitySummaryDto", "Lps/s0;", "exerciseSetsDTO", "", "hasGear", "hasDeviceInfo", "isManualActivity", "Lps/p;", "splitsDTO", "<init>", "(Ljr/d;Lps/r;Lps/s0;ZZLjava/lang/Boolean;Lps/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr.d f120291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps.r f120292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ps.s0 f120293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f120294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f120295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f120296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ps.p f120297g;

    public /* synthetic */ r0(jr.d dVar, ps.r rVar, ps.s0 s0Var, boolean z14, boolean z15, Boolean bool, ps.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : rVar, (i14 & 4) != 0 ? null : s0Var, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : pVar);
    }

    public static r0 a(r0 r0Var, jr.d dVar, int i14) {
        if ((i14 & 1) != 0) {
            dVar = r0Var.f120291a;
        }
        jr.d dVar2 = dVar;
        ps.r rVar = r0Var.f120292b;
        ps.s0 s0Var = r0Var.f120293c;
        boolean z14 = r0Var.f120294d;
        boolean z15 = r0Var.f120295e;
        Boolean bool = (i14 & 32) != 0 ? r0Var.f120296f : null;
        ps.p pVar = r0Var.f120297g;
        r0Var.getClass();
        return new r0(dVar2, rVar, s0Var, z14, z15, bool, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p005kotlin.jvm.internal.s.g(this.f120291a, r0Var.f120291a) && p005kotlin.jvm.internal.s.g(this.f120292b, r0Var.f120292b) && p005kotlin.jvm.internal.s.g(this.f120293c, r0Var.f120293c) && this.f120294d == r0Var.f120294d && this.f120295e == r0Var.f120295e && p005kotlin.jvm.internal.s.g(this.f120296f, r0Var.f120296f) && p005kotlin.jvm.internal.s.g(this.f120297g, r0Var.f120297g);
    }

    public final int hashCode() {
        jr.d dVar = this.f120291a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        ps.r rVar = this.f120292b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        ps.s0 s0Var = this.f120293c;
        int iG = q6.f.g(q6.f.g((iHashCode2 + (s0Var == null ? 0 : s0Var.hashCode())) * 31, 31, this.f120294d), 31, this.f120295e);
        Boolean bool = this.f120296f;
        int iHashCode3 = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        ps.p pVar = this.f120297g;
        return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "TabsData(activityTypeConfiguration=" + this.f120291a + ", activitySummaryDto=" + this.f120292b + ", exerciseSetsDTO=" + this.f120293c + ", hasGear=" + this.f120294d + ", hasDeviceInfo=" + this.f120295e + ", isManualActivity=" + this.f120296f + ", splitsDTO=" + this.f120297g + ")";
    }

    public r0(jr.d dVar, ps.r rVar, ps.s0 s0Var, boolean z14, boolean z15, Boolean bool, ps.p pVar) {
        this.f120291a = dVar;
        this.f120292b = rVar;
        this.f120293c = s0Var;
        this.f120294d = z14;
        this.f120295e = z15;
        this.f120296f = bool;
        this.f120297g = pVar;
    }

    public r0() {
        this(null, null, null, false, false, null, null, 127, null);
    }
}
