package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class rca extends rbx {
    private static final long serialVersionUID = 4616993774983545235L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private rbu f47111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47112b;

    public String b() {
        return this.f47112b;
    }

    public void b(String str) {
        this.f47112b = str;
    }

    public rbu a() {
        return this.f47111a;
    }

    public void a(rbu rbuVar) {
        this.f47111a = rbuVar;
    }

    public String toString() {
        return "SwitchFace{name='" + this.f47112b + "', config=" + this.f47111a + ", partType=" + this.d + '}';
    }
}
