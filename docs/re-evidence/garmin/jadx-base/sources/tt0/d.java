package tt0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltt0/d;", "", "", "canHideSection", "Lyz1/d;", "status", "Li53/c;", "Ltt0/b;", "challenges", "<init>", "(ZLyz1/d;Li53/c;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz1.d f166369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<b> f166370c;

    public d(boolean z14, yz1.d dVar, i53.c<b> cVar) {
        dVar.getClass();
        cVar.getClass();
        this.f166368a = z14;
        this.f166369b = dVar;
        this.f166370c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f166368a == dVar.f166368a && this.f166369b.equals(dVar.f166369b) && this.f166370c.equals(dVar.f166370c);
    }

    public final int hashCode() {
        return this.f166370c.hashCode() + ((this.f166369b.hashCode() + (Boolean.hashCode(this.f166368a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChallengeSectionData(canHideSection=");
        sb3.append(this.f166368a);
        sb3.append(", status=");
        sb3.append(this.f166369b);
        sb3.append(", challenges=");
        return l2.e(sb3, this.f166370c, ")");
    }
}
