package in0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lin0/g;", "", "Li53/e;", "Lin0/m;", "notSupported", "notEnabled", "", "wristHrTurnedOff", "<init>", "(Li53/e;Li53/e;Z)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.e<m> f94442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.e<m> f94443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94444c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(i53.e<? extends m> eVar, i53.e<? extends m> eVar2, boolean z14) {
        eVar.getClass();
        eVar2.getClass();
        this.f94442a = eVar;
        this.f94443b = eVar2;
        this.f94444c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f94442a.equals(gVar.f94442a) && this.f94443b.equals(gVar.f94443b) && this.f94444c == gVar.f94444c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94444c) + ((this.f94443b.hashCode() + (this.f94442a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HealthStatusFeaturesState(notSupported=");
        sb3.append(this.f94442a);
        sb3.append(", notEnabled=");
        sb3.append(this.f94443b);
        sb3.append(", wristHrTurnedOff=");
        return hb.a.k(sb3, this.f94444c, ")");
    }
}
