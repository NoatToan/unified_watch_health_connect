package ic1;

import b63.o;
import b63.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lic1/n;", "", "Lb63/o;", "initialDate", "Lo82/g;", "initialIntervalType", "", "isLoading", "<init>", "(Lb63/o;Lo82/g;Z)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f92639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f92640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92641c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(o oVar, o82.g gVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(oVar, (i14 & 2) != 0 ? o82.g.f130850c : gVar, (i14 & 4) != 0 ? false : z14);
    }

    public static n a(n nVar, o oVar, o82.g gVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            oVar = nVar.f92639a;
        }
        if ((i14 & 2) != 0) {
            gVar = nVar.f92640b;
        }
        if ((i14 & 4) != 0) {
            z14 = nVar.f92641c;
        }
        nVar.getClass();
        oVar.getClass();
        gVar.getClass();
        return new n(oVar, gVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f92639a, nVar.f92639a) && this.f92640b == nVar.f92640b && this.f92641c == nVar.f92641c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92641c) + q6.f.i(this.f92640b, this.f92639a.f16206a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PulseOxUiState(initialDate=");
        sb3.append(this.f92639a);
        sb3.append(", initialIntervalType=");
        sb3.append(this.f92640b);
        sb3.append(", isLoading=");
        return hb.a.k(sb3, this.f92641c, ")");
    }

    public n(o oVar, o82.g gVar, boolean z14) {
        oVar.getClass();
        gVar.getClass();
        this.f92639a = oVar;
        this.f92640b = gVar;
        this.f92641c = z14;
    }

    public n() {
        this(null, null, false, 7, null);
    }
}
