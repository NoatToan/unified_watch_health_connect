package jf1;

import b63.o;
import b63.z;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljf1/f;", "", "", "isLoading", "Lo82/g;", "selectedIntervalType", "Lb63/o;", "selectedDate", "<init>", "(ZLo82/g;Lb63/o;)V", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f98717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f98718c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(boolean z14, g gVar, o oVar, int i14, j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        gVar = (i14 & 2) != 0 ? g.f130850c : gVar;
        if ((i14 & 4) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(z14, gVar, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f98716a == fVar.f98716a && this.f98717b == fVar.f98717b && s.g(this.f98718c, fVar.f98718c);
    }

    public final int hashCode() {
        return this.f98718c.f16206a.hashCode() + q6.f.i(this.f98717b, Boolean.hashCode(this.f98716a) * 31, 31);
    }

    public final String toString() {
        return "RunningToleranceUiState(isLoading=" + this.f98716a + ", selectedIntervalType=" + this.f98717b + ", selectedDate=" + this.f98718c + ")";
    }

    public f(boolean z14, g gVar, o oVar) {
        gVar.getClass();
        oVar.getClass();
        this.f98716a = z14;
        this.f98717b = gVar;
        this.f98718c = oVar;
    }

    public f() {
        this(false, null, null, 7, null);
    }
}
