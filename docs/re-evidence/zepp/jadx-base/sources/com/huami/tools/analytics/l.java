package com.huami.tools.analytics;

/* JADX INFO: loaded from: classes15.dex */
class l {
    private String a;
    private int b;
    private String c;
    private String d;
    private String e;

    public static class b {
        private String a;
        private int b;
        private String c;
        private String d;
        private String e;

        public l f() {
            return new l(this);
        }

        public b g(String str) {
            this.a = str;
            return this;
        }

        public b h(String str) {
            this.e = str;
            return this;
        }

        public b i(String str) {
            this.d = str;
            return this;
        }

        public b j(int i) {
            this.b = i;
            return this;
        }

        public b k(String str) {
            this.c = str;
            return this;
        }

        public b() {
        }

        private b(l lVar) {
            this.a = lVar.a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.d = lVar.d;
            this.e = lVar.e;
        }
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.d;
    }

    public int i() {
        return this.b;
    }

    public String j() {
        return this.c;
    }

    public b k() {
        return new b();
    }

    private l(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }
}
