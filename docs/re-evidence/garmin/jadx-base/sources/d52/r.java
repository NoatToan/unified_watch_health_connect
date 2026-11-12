package d52;

import b63.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld52/r;", "", "Lb63/o;", "initialDate", "Lo82/g;", "initialIntervalType", "Lyd1/b;", "selectedYearlyTab", "", "isLoading", "isPortrait", "isTooltipVisible", "isSensorOrientation", "isEditGoalAvailable", "isAutorotateEnabled", "<init>", "(Lb63/o;Lo82/g;Lyd1/b;ZZZZZZ)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f57656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f57657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd1.b f57658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f57661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f57662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f57664i;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r(b63.o oVar, o82.g gVar, yd1.b bVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(oVar, (i14 & 2) != 0 ? o82.g.f130850c : gVar, (i14 & 4) != 0 ? yd1.b.WEEKLY : bVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? true : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? true : z17, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? false : z19);
    }

    public static r a(r rVar, b63.o oVar, o82.g gVar, yd1.b bVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14) {
        if ((i14 & 1) != 0) {
            oVar = rVar.f57656a;
        }
        b63.o oVar2 = oVar;
        if ((i14 & 2) != 0) {
            gVar = rVar.f57657b;
        }
        o82.g gVar2 = gVar;
        if ((i14 & 4) != 0) {
            bVar = rVar.f57658c;
        }
        yd1.b bVar2 = bVar;
        if ((i14 & 8) != 0) {
            z14 = rVar.f57659d;
        }
        boolean z24 = z14;
        if ((i14 & 16) != 0) {
            z15 = rVar.f57660e;
        }
        boolean z25 = z15;
        boolean z26 = (i14 & 32) != 0 ? rVar.f57661f : z16;
        boolean z27 = (i14 & 64) != 0 ? rVar.f57662g : z17;
        boolean z28 = (i14 & 128) != 0 ? rVar.f57663h : z18;
        boolean z29 = (i14 & 256) != 0 ? rVar.f57664i : z19;
        rVar.getClass();
        oVar2.getClass();
        gVar2.getClass();
        bVar2.getClass();
        return new r(oVar2, gVar2, bVar2, z24, z25, z26, z27, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f57656a, rVar.f57656a) && this.f57657b == rVar.f57657b && this.f57658c == rVar.f57658c && this.f57659d == rVar.f57659d && this.f57660e == rVar.f57660e && this.f57661f == rVar.f57661f && this.f57662g == rVar.f57662g && this.f57663h == rVar.f57663h && this.f57664i == rVar.f57664i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57664i) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f57658c.hashCode() + q6.f.i(this.f57657b, this.f57656a.f16206a.hashCode() * 31, 31)) * 31, 31, this.f57659d), 31, this.f57660e), 31, this.f57661f), 31, this.f57662g), 31, this.f57663h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PushesUiState(initialDate=");
        sb3.append(this.f57656a);
        sb3.append(", initialIntervalType=");
        sb3.append(this.f57657b);
        sb3.append(", selectedYearlyTab=");
        sb3.append(this.f57658c);
        sb3.append(", isLoading=");
        sb3.append(this.f57659d);
        sb3.append(", isPortrait=");
        kg.f.q(", isTooltipVisible=", ", isSensorOrientation=", sb3, this.f57660e, this.f57661f);
        kg.f.q(", isEditGoalAvailable=", ", isAutorotateEnabled=", sb3, this.f57662g, this.f57663h);
        return hb.a.k(sb3, this.f57664i, ")");
    }

    public r(b63.o oVar, o82.g gVar, yd1.b bVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        oVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.f57656a = oVar;
        this.f57657b = gVar;
        this.f57658c = bVar;
        this.f57659d = z14;
        this.f57660e = z15;
        this.f57661f = z16;
        this.f57662g = z17;
        this.f57663h = z18;
        this.f57664i = z19;
    }

    public r() {
        this(null, null, null, false, false, false, false, false, false, 511, null);
    }
}
