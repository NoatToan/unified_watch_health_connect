package nw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnw0/d;", "", "Lnw0/e0;", "loadBehavioursState", "Lnw0/h0;", "saveBehavioursState", "Lnw0/j0;", "screenMode", "", "selectionRequired", "behaviourSelectionLimitReached", "isAutoLoggingEnabled", "showAllowAutoLogging", "<init>", "(Lnw0/e0;Lnw0/h0;Lnw0/j0;ZZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f128010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f128011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f128012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f128013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f128014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f128015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f128016g;

    public /* synthetic */ d(e0 e0Var, h0 h0Var, j0 j0Var, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? e0.c.f128019a : e0Var, (i14 & 2) != 0 ? null : h0Var, (i14 & 4) != 0 ? null : j0Var, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? false : z17);
    }

    public static d a(d dVar, e0 e0Var, h0 h0Var, j0 j0Var, boolean z14, boolean z15, boolean z16, boolean z17, int i14) {
        if ((i14 & 1) != 0) {
            e0Var = dVar.f128010a;
        }
        e0 e0Var2 = e0Var;
        if ((i14 & 2) != 0) {
            h0Var = dVar.f128011b;
        }
        h0 h0Var2 = h0Var;
        if ((i14 & 4) != 0) {
            j0Var = dVar.f128012c;
        }
        j0 j0Var2 = j0Var;
        if ((i14 & 8) != 0) {
            z14 = dVar.f128013d;
        }
        boolean z18 = z14;
        if ((i14 & 16) != 0) {
            z15 = dVar.f128014e;
        }
        boolean z19 = z15;
        if ((i14 & 32) != 0) {
            z16 = dVar.f128015f;
        }
        boolean z24 = z16;
        if ((i14 & 64) != 0) {
            z17 = dVar.f128016g;
        }
        dVar.getClass();
        e0Var2.getClass();
        return new d(e0Var2, h0Var2, j0Var2, z18, z19, z24, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f128010a, dVar.f128010a) && p005kotlin.jvm.internal.s.g(this.f128011b, dVar.f128011b) && p005kotlin.jvm.internal.s.g(this.f128012c, dVar.f128012c) && this.f128013d == dVar.f128013d && this.f128014e == dVar.f128014e && this.f128015f == dVar.f128015f && this.f128016g == dVar.f128016g;
    }

    public final int hashCode() {
        int iHashCode = this.f128010a.hashCode() * 31;
        h0 h0Var = this.f128011b;
        int iHashCode2 = (iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        j0 j0Var = this.f128012c;
        return Boolean.hashCode(this.f128016g) + q6.f.g(q6.f.g(q6.f.g((iHashCode2 + (j0Var != null ? j0Var.hashCode() : 0)) * 31, 31, this.f128013d), 31, this.f128014e), 31, this.f128015f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditBehavioursUiState(loadBehavioursState=");
        sb3.append(this.f128010a);
        sb3.append(", saveBehavioursState=");
        sb3.append(this.f128011b);
        sb3.append(", screenMode=");
        sb3.append(this.f128012c);
        sb3.append(", selectionRequired=");
        sb3.append(this.f128013d);
        sb3.append(", behaviourSelectionLimitReached=");
        kg.f.q(", isAutoLoggingEnabled=", ", showAllowAutoLogging=", sb3, this.f128014e, this.f128015f);
        return hb.a.k(sb3, this.f128016g, ")");
    }

    public d(e0 e0Var, h0 h0Var, j0 j0Var, boolean z14, boolean z15, boolean z16, boolean z17) {
        e0Var.getClass();
        this.f128010a = e0Var;
        this.f128011b = h0Var;
        this.f128012c = j0Var;
        this.f128013d = z14;
        this.f128014e = z15;
        this.f128015f = z16;
        this.f128016g = z17;
    }

    public d() {
        this(null, null, null, false, false, false, false, 127, null);
    }
}
