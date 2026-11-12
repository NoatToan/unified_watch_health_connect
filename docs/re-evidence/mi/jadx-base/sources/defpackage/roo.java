package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class roo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlh f32758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32759b;

    public roo(qlh qlhVar, boolean z) {
        this.f32758a = qlhVar;
        this.f32759b = z;
    }

    public roo a(qlh qlhVar) {
        return qlhVar == this.f32758a ? this : new roo(qlhVar, this.f32759b);
    }

    public boolean b() {
        return this.f32759b;
    }

    public qlh c() {
        return this.f32758a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof roo)) {
            return false;
        }
        roo rooVar = (roo) obj;
        return rooVar.f32758a.equals(this.f32758a) && rooVar.f32759b == this.f32759b;
    }

    public int hashCode() {
        return (((this.f32758a.hashCode() + 41) * 41) + (this.f32759b ? 1 : 0)) * 41;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("${");
        sb.append(this.f32759b ? "?" : "");
        sb.append(this.f32758a.k());
        sb.append("}");
        return sb.toString();
    }
}
