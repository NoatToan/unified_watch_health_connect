package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldy1/k;", "", "Lmx1/b;", "stpDay", "Li53/c;", "Lmx1/a;", "benchmarkTypes", "<init>", "(Lmx1/b;Li53/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx1.b f61572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<mx1.a> f61573b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(mx1.b bVar, i53.c<? extends mx1.a> cVar) {
        bVar.getClass();
        cVar.getClass();
        this.f61572a = bVar;
        this.f61573b = cVar;
    }

    public static k a(k kVar, i53.c cVar) {
        mx1.b bVar = kVar.f61572a;
        cVar.getClass();
        return new k(bVar, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f61572a == kVar.f61572a && this.f61573b.equals(kVar.f61573b);
    }

    public final int hashCode() {
        return this.f61573b.hashCode() + (this.f61572a.hashCode() * 31);
    }

    public final String toString() {
        return "PrimaryLiftState(stpDay=" + this.f61572a + ", benchmarkTypes=" + this.f61573b + ")";
    }
}
