package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldy1/l;", "", "Li53/c;", "Ldy1/j;", "primaryLiftsStates", "", "isLimitReached", "isNextButtonEnabled", "<init>", "(Li53/c;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<j> f61574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61576c;

    public l(i53.c cVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j53.l.b() : cVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f61574a, lVar.f61574a) && this.f61575b == lVar.f61575b && this.f61576c == lVar.f61576c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61576c) + q6.f.g(this.f61574a.hashCode() * 31, 31, this.f61575b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrimaryLiftsScreenState(primaryLiftsStates=");
        sb3.append(this.f61574a);
        sb3.append(", isLimitReached=");
        sb3.append(this.f61575b);
        sb3.append(", isNextButtonEnabled=");
        return hb.a.k(sb3, this.f61576c, ")");
    }

    public l(i53.c<j> cVar, boolean z14, boolean z15) {
        cVar.getClass();
        this.f61574a = cVar;
        this.f61575b = z14;
        this.f61576c = z15;
    }

    public l() {
        this(null, false, false, 7, null);
    }
}
