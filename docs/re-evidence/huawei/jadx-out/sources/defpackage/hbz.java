package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class hbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36381b;
    private String d;
    private String e;

    private hbz() {
    }

    public String a() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public String b() {
        return this.f36380a;
    }

    public void b(String str) {
        this.f36380a = str;
    }

    public String j() {
        return this.f36381b;
    }

    public void c(String str) {
        this.f36381b = str;
    }

    public String d() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e() {
        this.e = "";
        this.d = "";
        this.f36380a = "";
        this.f36381b = "";
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final hbz f36382a = new hbz();
    }

    public static final hbz c() {
        return a.f36382a;
    }
}
