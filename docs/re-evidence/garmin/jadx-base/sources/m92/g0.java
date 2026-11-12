package m92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm92/g0;", "", "Lu4/d;", "vectorRes", "Lo4/d0;", "vectorColor", "<init>", "(Lu4/d;JLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f117313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f117314b;

    private g0(u4.d dVar, long j8) {
        dVar.getClass();
        this.f117313a = dVar;
        this.f117314b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f117313a, g0Var.f117313a) && o4.d0.d(this.f117314b, g0Var.f117314b);
    }

    public final int hashCode() {
        int iHashCode = this.f117313a.hashCode() * 31;
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f117314b) + iHashCode;
    }

    public final String toString() {
        return "PainterResourceConfig(vectorRes=" + this.f117313a + ", vectorColor=" + o4.d0.j(this.f117314b) + ")";
    }

    public /* synthetic */ g0(u4.d dVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(dVar, j8);
    }
}
