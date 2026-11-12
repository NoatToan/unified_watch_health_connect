package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hcs extends uk1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19940b;
    public final String c;
    public final String d;

    public hcs(int i, String str, String str2) {
        this.f19940b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.uk1
    public final String a() {
        return this.d;
    }

    @Override // defpackage.uk1
    public final int b() {
        return this.f19940b;
    }

    @Override // defpackage.uk1
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uk1) {
            uk1 uk1Var = (uk1) obj;
            if (this.f19940b == uk1Var.b() && ((str = this.c) != null ? str.equals(uk1Var.c()) : uk1Var.c() == null) && ((str2 = this.d) != null ? str2.equals(uk1Var.a()) : uk1Var.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.f19940b;
        String str2 = this.d;
        return ((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AssetPackLocation{packStorageMethod=" + this.f19940b + ", path=" + this.c + ", assetsPath=" + this.d + "}";
    }
}
