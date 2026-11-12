package qr1;

import b63.o;
import b63.z;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqr1/c;", "", "Lb63/o;", "initialDate", "Lo82/g;", "initialIntervalType", "", "isScreenInPortrait", "isLoading", "isTooltipVisible", "isSensorOrientation", "", "averageStressLevel", "isAutorotateEnabled", "<init>", "(Lb63/o;Lo82/g;ZZZZIZ)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f146896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f146897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f146898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f146899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f146900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f146901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f146902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f146903h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(o oVar, g gVar, boolean z14, boolean z15, boolean z16, boolean z17, int i14, boolean z18, int i15, j jVar) {
        if ((i15 & 1) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(oVar, (i15 & 2) != 0 ? g.f130850c : gVar, (i15 & 4) != 0 ? true : z14, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? true : z17, (i15 & 64) != 0 ? 0 : i14, (i15 & 128) != 0 ? false : z18);
    }

    public static c a(c cVar, o oVar, g gVar, boolean z14, boolean z15, boolean z16, boolean z17, int i14, boolean z18, int i15) {
        if ((i15 & 1) != 0) {
            oVar = cVar.f146896a;
        }
        o oVar2 = oVar;
        if ((i15 & 2) != 0) {
            gVar = cVar.f146897b;
        }
        g gVar2 = gVar;
        if ((i15 & 4) != 0) {
            z14 = cVar.f146898c;
        }
        boolean z19 = z14;
        if ((i15 & 8) != 0) {
            z15 = cVar.f146899d;
        }
        boolean z24 = z15;
        if ((i15 & 16) != 0) {
            z16 = cVar.f146900e;
        }
        boolean z25 = z16;
        if ((i15 & 32) != 0) {
            z17 = cVar.f146901f;
        }
        boolean z26 = z17;
        int i16 = (i15 & 64) != 0 ? cVar.f146902g : i14;
        boolean z27 = (i15 & 128) != 0 ? cVar.f146903h : z18;
        cVar.getClass();
        oVar2.getClass();
        gVar2.getClass();
        return new c(oVar2, gVar2, z19, z24, z25, z26, i16, z27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f146896a, cVar.f146896a) && this.f146897b == cVar.f146897b && this.f146898c == cVar.f146898c && this.f146899d == cVar.f146899d && this.f146900e == cVar.f146900e && this.f146901f == cVar.f146901f && this.f146902g == cVar.f146902g && this.f146903h == cVar.f146903h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146903h) + q2.d(this.f146902g, f.g(f.g(f.g(f.g(f.i(this.f146897b, this.f146896a.f16206a.hashCode() * 31, 31), 31, this.f146898c), 31, this.f146899d), 31, this.f146900e), 31, this.f146901f), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StressDetailsUiState(initialDate=");
        sb3.append(this.f146896a);
        sb3.append(", initialIntervalType=");
        sb3.append(this.f146897b);
        sb3.append(", isScreenInPortrait=");
        kg.f.q(", isLoading=", ", isTooltipVisible=", sb3, this.f146898c, this.f146899d);
        kg.f.q(", isSensorOrientation=", ", averageStressLevel=", sb3, this.f146900e, this.f146901f);
        sb3.append(this.f146902g);
        sb3.append(", isAutorotateEnabled=");
        sb3.append(this.f146903h);
        sb3.append(")");
        return sb3.toString();
    }

    public c(o oVar, g gVar, boolean z14, boolean z15, boolean z16, boolean z17, int i14, boolean z18) {
        oVar.getClass();
        gVar.getClass();
        this.f146896a = oVar;
        this.f146897b = gVar;
        this.f146898c = z14;
        this.f146899d = z15;
        this.f146900e = z16;
        this.f146901f = z17;
        this.f146902g = i14;
        this.f146903h = z18;
    }

    public c() {
        this(null, null, false, false, false, false, 0, false, 255, null);
    }
}
