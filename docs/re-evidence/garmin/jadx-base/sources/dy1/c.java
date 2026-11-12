package dy1;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldy1/c;", "", "", "showBarbell", "Li53/c;", "Ldy1/d;", "benchmarks", "", "benchmarkNames", "showConfirmButton", "<init>", "(ZLi53/c;Li53/c;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f61535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<d> f61536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<String> f61537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61539e;

    public c(boolean z14, i53.c<d> cVar, i53.c<String> cVar2, boolean z15) {
        cVar.getClass();
        cVar2.getClass();
        this.f61535a = z14;
        this.f61536b = cVar;
        this.f61537c = cVar2;
        this.f61538d = z15;
        boolean z16 = true;
        if (!cVar.isEmpty()) {
            for (d dVar : cVar) {
                if (dVar.f61541b) {
                    b bVar = dVar.f61542c;
                    if ((bVar != null ? bVar.f61533f : null) == null) {
                        z16 = false;
                        break;
                    }
                } else {
                    b bVar2 = dVar.f61543d;
                    if ((bVar2 != null ? bVar2.f61533f : null) == null) {
                        z16 = false;
                        break;
                    }
                }
            }
        }
        this.f61539e = z16;
    }

    public static c a(c cVar, boolean z14, i53.c cVar2, i53.c cVar3, int i14) {
        if ((i14 & 1) != 0) {
            z14 = cVar.f61535a;
        }
        if ((i14 & 4) != 0) {
            cVar3 = cVar.f61537c;
        }
        boolean z15 = (i14 & 8) != 0 ? cVar.f61538d : true;
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        return new c(z14, cVar2, cVar3, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f61535a == cVar.f61535a && p005kotlin.jvm.internal.s.g(this.f61536b, cVar.f61536b) && p005kotlin.jvm.internal.s.g(this.f61537c, cVar.f61537c) && this.f61538d == cVar.f61538d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61538d) + l2.a(this.f61537c, l2.a(this.f61536b, Boolean.hashCode(this.f61535a) * 31, 31), 31);
    }

    public final String toString() {
        return "BenchmarkScreenState(showBarbell=" + this.f61535a + ", benchmarks=" + this.f61536b + ", benchmarkNames=" + this.f61537c + ", showConfirmButton=" + this.f61538d + ")";
    }

    public c() {
        this(false, null, null, false, 15, null);
    }

    public c(boolean z14, i53.c cVar, i53.c cVar2, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j53.l.b() : cVar, (i14 & 4) != 0 ? j53.l.b() : cVar2, (i14 & 8) != 0 ? false : z15);
    }
}
