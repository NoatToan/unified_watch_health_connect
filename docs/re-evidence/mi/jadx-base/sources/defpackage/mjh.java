package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class mjh<L, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f26929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R f26930b;

    public mjh(L l, R r2) {
        this.f26929a = l;
        this.f26930b = r2;
    }

    public static <L, R> mjh<L, R> e(L l, R r2) {
        return new mjh<>(l, r2);
    }

    public final L a() {
        return this.f26929a;
    }

    public final L b() {
        return this.f26929a;
    }

    public final R c() {
        return this.f26930b;
    }

    public final R d() {
        return this.f26930b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mjh)) {
            return false;
        }
        mjh mjhVar = (mjh) obj;
        return this.f26929a.equals(mjhVar.a()) && this.f26930b.equals(mjhVar.d());
    }

    public int hashCode() {
        return (a() == null ? 0 : a().hashCode()) ^ (d() != null ? d().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(b());
        sb.append(',');
        sb.append(c());
        sb.append(')');
        return sb.toString();
    }
}
