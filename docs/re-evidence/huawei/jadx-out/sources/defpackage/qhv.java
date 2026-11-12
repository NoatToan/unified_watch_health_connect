package defpackage;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class qhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46256c;
    private String d;
    private String e;
    private String j;

    public qhv(d dVar) {
        if (dVar == null) {
            LogUtil.b("ThemeProductQueryParam", "builder is null");
            return;
        }
        this.e = dVar.f46257a;
        this.d = dVar.d;
        this.f46255b = dVar.f46258b;
        this.f46256c = dVar.e;
        this.j = dVar.j;
        this.f46254a = dVar.f46259c;
    }

    public String e() {
        return this.e;
    }

    public String a() {
        return this.d;
    }

    public String c() {
        return this.f46255b;
    }

    public String b() {
        return this.f46256c;
    }

    public String h() {
        return this.j;
    }

    public String d() {
        return this.f46254a;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46259c;
        private String d;
        private String e;
        private String j;

        public qhv b() {
            return new qhv(this);
        }

        public d b(String str) {
            this.f46257a = str;
            return this;
        }

        public d c(String str) {
            this.d = str;
            return this;
        }

        public d d(String str) {
            this.f46258b = str;
            return this;
        }

        public d e(String str) {
            this.e = str;
            return this;
        }

        public d i(String str) {
            this.j = str;
            return this;
        }

        public d a(String str) {
            this.f46259c = str;
            return this;
        }
    }
}
