package defpackage;

/* JADX INFO: loaded from: classes43.dex */
public class txt {
    protected String c(String str, int i) {
        return str + "&from=" + i;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f49763a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f49764c;
        private String d;
        private String e;

        public String c() {
            return this.d;
        }

        public void a(String str) {
            this.d = str;
        }

        public String e() {
            return this.f49764c;
        }

        public void d(String str) {
            this.f49764c = str;
        }

        public String d() {
            return this.e;
        }

        public void e(String str) {
            this.e = str;
        }

        public String a() {
            return this.f49763a;
        }

        public void b(String str) {
            this.f49763a = str;
        }

        public String toString() {
            return "title: " + this.d + " content: " + this.f49764c + " watchDeeplink: " + this.f49763a + " phoneDeeplink: " + this.f49763a;
        }
    }
}
