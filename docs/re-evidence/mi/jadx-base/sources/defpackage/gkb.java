package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class gkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19079b;
    public final String c;
    public final String d;
    public final boolean e;

    public gkb(int i, String str, String str2, String str3, boolean z) {
        this.f19078a = i;
        this.f19079b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.f19079b;
    }

    public int d() {
        return this.f19078a;
    }

    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gkb)) {
            return false;
        }
        gkb gkbVar = (gkb) obj;
        return this.f19078a == gkbVar.f19078a && this.e == gkbVar.e && this.f19079b.equals(gkbVar.f19079b) && this.c.equals(gkbVar.c) && this.d.equals(gkbVar.d);
    }

    public int hashCode() {
        return this.f19078a + (this.e ? 64 : 0) + (this.f19079b.hashCode() * this.c.hashCode() * this.d.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19079b);
        sb.append('.');
        sb.append(this.c);
        sb.append(this.d);
        sb.append(" (");
        sb.append(this.f19078a);
        sb.append(this.e ? " itf" : "");
        sb.append(')');
        return sb.toString();
    }
}
