package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldy1/m;", "", "Lr22/p;", "startRounds", "endRounds", "<init>", "(Lr22/p;Lr22/p;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r22.p f61577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r22.p f61578b;

    public m(r22.p pVar, r22.p pVar2) {
        pVar.getClass();
        pVar2.getClass();
        this.f61577a = pVar;
        this.f61578b = pVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f61577a.equals(mVar.f61577a) && this.f61578b.equals(mVar.f61578b);
    }

    public final int hashCode() {
        return this.f61578b.hashCode() + (this.f61577a.hashCode() * 31);
    }

    public final String toString() {
        return "RoundsDashboardState(startRounds=" + this.f61577a + ", endRounds=" + this.f61578b + ")";
    }
}
