package yq1;

import b63.o;
import b63.z;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyq1/d;", "", "Lb63/o;", "initialDate", "Lo82/g;", "initialIntervalType", "Lyd1/b;", "selectedYearlyTab", "", "isLoading", "isPortrait", "isTooltipVisible", "isSensorOrientation", "isEditGoalAvailable", "isOneDaySelected", "<init>", "(Lb63/o;Lo82/g;Lyd1/b;ZZZZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f198791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f198792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd1.b f198793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f198794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f198795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f198796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f198797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f198798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f198799i;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(o oVar, g gVar, yd1.b bVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(oVar, (i14 & 2) != 0 ? g.f130850c : gVar, (i14 & 4) != 0 ? yd1.b.WEEKLY : bVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? true : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? true : z17, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? true : z19);
    }

    public static d a(d dVar, o oVar, g gVar, yd1.b bVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            oVar = dVar.f198791a;
        }
        o oVar2 = oVar;
        if ((i14 & 2) != 0) {
            gVar = dVar.f198792b;
        }
        g gVar2 = gVar;
        if ((i14 & 4) != 0) {
            bVar = dVar.f198793c;
        }
        yd1.b bVar2 = bVar;
        if ((i14 & 8) != 0) {
            z14 = dVar.f198794d;
        }
        boolean z19 = z14;
        if ((i14 & 16) != 0) {
            z15 = dVar.f198795e;
        }
        boolean z24 = z15;
        boolean z25 = (i14 & 32) != 0 ? dVar.f198796f : z16;
        boolean z26 = (i14 & 64) != 0 ? dVar.f198797g : z17;
        boolean z27 = (i14 & 128) != 0 ? dVar.f198798h : z18;
        boolean z28 = dVar.f198799i;
        dVar.getClass();
        oVar2.getClass();
        gVar2.getClass();
        bVar2.getClass();
        return new d(oVar2, gVar2, bVar2, z19, z24, z25, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f198791a, dVar.f198791a) && this.f198792b == dVar.f198792b && this.f198793c == dVar.f198793c && this.f198794d == dVar.f198794d && this.f198795e == dVar.f198795e && this.f198796f == dVar.f198796f && this.f198797g == dVar.f198797g && this.f198798h == dVar.f198798h && this.f198799i == dVar.f198799i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198799i) + f.g(f.g(f.g(f.g(f.g((this.f198793c.hashCode() + f.i(this.f198792b, this.f198791a.f16206a.hashCode() * 31, 31)) * 31, 31, this.f198794d), 31, this.f198795e), 31, this.f198796f), 31, this.f198797g), 31, this.f198798h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StepsUiState(initialDate=");
        sb3.append(this.f198791a);
        sb3.append(", initialIntervalType=");
        sb3.append(this.f198792b);
        sb3.append(", selectedYearlyTab=");
        sb3.append(this.f198793c);
        sb3.append(", isLoading=");
        sb3.append(this.f198794d);
        sb3.append(", isPortrait=");
        kg.f.q(", isTooltipVisible=", ", isSensorOrientation=", sb3, this.f198795e, this.f198796f);
        kg.f.q(", isEditGoalAvailable=", ", isOneDaySelected=", sb3, this.f198797g, this.f198798h);
        return hb.a.k(sb3, this.f198799i, ")");
    }

    public d(o oVar, g gVar, yd1.b bVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        oVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.f198791a = oVar;
        this.f198792b = gVar;
        this.f198793c = bVar;
        this.f198794d = z14;
        this.f198795e = z15;
        this.f198796f = z16;
        this.f198797g = z17;
        this.f198798h = z18;
        this.f198799i = z19;
    }

    public d() {
        this(null, null, null, false, false, false, false, false, false, 511, null);
    }
}
