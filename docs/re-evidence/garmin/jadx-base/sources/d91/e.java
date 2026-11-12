package d91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld91/e;", "", "Ld91/p;", "status", "Ld91/c;", "message", "<init>", "(Ld91/p;Ld91/c;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f58523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f58524b;

    public e(p pVar, c cVar) {
        pVar.getClass();
        this.f58523a = pVar;
        this.f58524b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f58523a == eVar.f58523a && p005kotlin.jvm.internal.s.g(this.f58524b, eVar.f58524b);
    }

    public final int hashCode() {
        int iHashCode = this.f58523a.hashCode() * 31;
        c cVar = this.f58524b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "GlobalMessageWrapper(status=" + this.f58523a + ", message=" + this.f58524b + ")";
    }
}
