package we1;

import b63.o;
import b63.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwe1/c;", "", "", "isLoading", "Lo82/g;", "selectedIntervalType", "Lb63/o;", "selectedDate", "<init>", "(ZLo82/g;Lb63/o;)V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f184772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f184773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f184774c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(boolean z14, o82.g gVar, o oVar, int i14, j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        gVar = (i14 & 2) != 0 ? o82.g.f130850c : gVar;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f184772a == cVar.f184772a && this.f184773b == cVar.f184773b && s.g(this.f184774c, cVar.f184774c);
    }

    public final int hashCode() {
        return this.f184774c.f16206a.hashCode() + q6.f.i(this.f184773b, Boolean.hashCode(this.f184772a) * 31, 31);
    }

    public final String toString() {
        return "RunningEconomyUiState(isLoading=" + this.f184772a + ", selectedIntervalType=" + this.f184773b + ", selectedDate=" + this.f184774c + ")";
    }

    public c(boolean z14, o82.g gVar, o oVar) {
        gVar.getClass();
        oVar.getClass();
        this.f184772a = z14;
        this.f184773b = gVar;
        this.f184774c = oVar;
    }

    public c() {
        this(false, null, null, 7, null);
    }
}
