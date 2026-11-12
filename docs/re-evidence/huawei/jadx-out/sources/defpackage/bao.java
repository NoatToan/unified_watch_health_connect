package defpackage;

/* JADX INFO: loaded from: classes22.dex */
final class bao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f897a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f898c;

    bao(String str, String str2) {
        this.f898c = str;
        this.f897a = str2;
    }

    String b() {
        return this.f898c;
    }

    String c() {
        return this.f897a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bao)) {
            return false;
        }
        bao baoVar = (bao) obj;
        return baoVar.f898c.equals(this.f898c) && baoVar.f897a.equals(this.f897a);
    }

    public int hashCode() {
        return this.f898c.hashCode() + this.f897a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("oldVer:");
        sb.append(this.f898c);
        sb.append(", newVer:");
        sb.append(this.f897a);
        return sb.toString();
    }
}
