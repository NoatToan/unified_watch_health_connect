package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40451c;
    private final int d;
    private final String e;
    private final String f;

    private lmm(e eVar) {
        this.d = eVar.f40452a;
        this.f40449a = eVar.e;
        this.f = eVar.g;
        this.f40450b = eVar.d;
        this.f40451c = eVar.f40454c;
        this.e = eVar.f40453b;
    }

    public int c() {
        return this.d;
    }

    public String a() {
        return this.f40449a;
    }

    public String h() {
        return this.f;
    }

    public String d() {
        return this.f40450b;
    }

    public String b() {
        return this.f40451c;
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        return "PushOpenAppBiInfo{biType=" + this.d + ", name='" + this.f40449a + "', url='" + this.f + "', pushId='" + this.f40450b + "', serviceId='" + this.f40451c + "', content='" + this.e + "'}";
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f40452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40454c;
        private String d;
        private String e;
        private String g;

        public e c(int i) {
            this.f40452a = i;
            return this;
        }

        public e b(String str) {
            this.e = str;
            return this;
        }

        public e a(String str) {
            this.g = str;
            return this;
        }

        public e d(String str) {
            this.d = str;
            return this;
        }

        public e e(String str) {
            this.f40454c = str;
            return this;
        }

        public e c(String str) {
            this.f40453b = str;
            return this;
        }

        public lmm e() {
            return new lmm(this);
        }
    }
}
