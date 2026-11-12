package sc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsc2/f;", "", "", "logintoken", "service", "Lsc2/q;", "grantor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lsc2/q;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f158500c;

    public f(String str, String str2, q qVar) {
        str.getClass();
        str2.getClass();
        qVar.getClass();
        this.f158498a = str;
        this.f158499b = str2;
        this.f158500c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f158498a.equals(fVar.f158498a) && this.f158499b.equals(fVar.f158499b) && this.f158500c == fVar.f158500c;
    }

    public final int hashCode() {
        return this.f158500c.hashCode() + wr.g.j(this.f158498a.hashCode() * 31, 31, this.f158499b);
    }

    public final String toString() {
        return am.j.o(this.f158500c.name(), ")", p6.b.i("ITLoginToken(logintoken='", this.f158498a, "', service='", this.f158499b, "', grantor="));
    }
}
