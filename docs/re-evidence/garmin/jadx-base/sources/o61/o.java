package o61;

import i71.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo61/o;", "", "Li53/c;", "Li71/y;", "trainingStatusPoints", "", "last4WeeksDataAvailable", "last2WeeksDataAvailable", "<init>", "(Li53/c;ZZ)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<y> f129627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129629c;

    public o(i53.c<y> cVar, boolean z14, boolean z15) {
        cVar.getClass();
        this.f129627a = cVar;
        this.f129628b = z14;
        this.f129629c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f129627a.equals(oVar.f129627a) && this.f129628b == oVar.f129628b && this.f129629c == oVar.f129629c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129629c) + q6.f.g(this.f129627a.hashCode() * 31, 31, this.f129628b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingStatusSummariesData(trainingStatusPoints=");
        sb3.append(this.f129627a);
        sb3.append(", last4WeeksDataAvailable=");
        sb3.append(this.f129628b);
        sb3.append(", last2WeeksDataAvailable=");
        return hb.a.k(sb3, this.f129629c, ")");
    }
}
