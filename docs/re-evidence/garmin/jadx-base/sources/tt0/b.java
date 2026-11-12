package tt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltt0/b;", "", "Lyz1/d;", "status", "Ltt0/e;", "challengesData", "<init>", "(Lyz1/d;Ltt0/e;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f166366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f166367b;

    public b(yz1.d dVar, e eVar) {
        dVar.getClass();
        eVar.getClass();
        this.f166366a = dVar;
        this.f166367b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f166366a.equals(bVar.f166366a) && this.f166367b.equals(bVar.f166367b);
    }

    public final int hashCode() {
        return this.f166367b.hashCode() + (this.f166366a.hashCode() * 31);
    }

    public final String toString() {
        return "ChallengeCardData(status=" + this.f166366a + ", challengesData=" + this.f166367b + ")";
    }
}
