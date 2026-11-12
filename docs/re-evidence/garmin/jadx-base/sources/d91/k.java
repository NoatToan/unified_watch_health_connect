package d91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld91/k;", "", "Ld91/q;", "name", "Ld91/r;", "value", "<init>", "(Ld91/q;Ld91/r;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f58550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f58551b;

    public k(q qVar, r rVar) {
        this.f58550a = qVar;
        this.f58551b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f58550a == kVar.f58550a && this.f58551b == kVar.f58551b;
    }

    public final int hashCode() {
        q qVar = this.f58550a;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        r rVar = this.f58551b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "MessageLinkParameter(name=" + this.f58550a + ", value=" + this.f58551b + ")";
    }
}
