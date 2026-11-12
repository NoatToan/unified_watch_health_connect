package com.huawei.openalliance.ad.processor.eventbeans;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f20062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f20063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f20064c;
    private String d;
    private String e;
    private boolean f;
    private Integer g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private boolean l;

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.processor.eventbeans.a$a, reason: collision with other inner class name */
    public static class C0229a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f20065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f20066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f20067c;
        private String h;
        private String i;
        private String k;
        private String d = null;
        private String e = null;
        private boolean f = true;
        private Integer g = null;
        private boolean j = true;
        private boolean l = false;

        public C0229a e(String str) {
            this.k = str;
            return this;
        }

        public C0229a d(String str) {
            this.i = str;
            return this;
        }

        public C0229a c(boolean z) {
            this.l = z;
            return this;
        }

        public C0229a c(String str) {
            this.h = str;
            return this;
        }

        public C0229a c(Integer num) {
            this.g = num;
            return this;
        }

        public C0229a b(boolean z) {
            this.f = z;
            return this;
        }

        public C0229a b(String str) {
            this.e = str;
            return this;
        }

        public C0229a b(Integer num) {
            this.f20067c = num;
            return this;
        }

        public a a() {
            return new a(this);
        }

        public C0229a a(boolean z) {
            this.j = z;
            return this;
        }

        public C0229a a(String str) {
            this.d = str;
            return this;
        }

        public C0229a a(Long l) {
            this.f20065a = l;
            return this;
        }

        public C0229a a(Integer num) {
            this.f20066b = num;
            return this;
        }
    }

    public boolean l() {
        return this.l;
    }

    public String k() {
        return this.i;
    }

    public String j() {
        return this.h;
    }

    public Integer i() {
        return this.g;
    }

    public boolean h() {
        return this.f;
    }

    public String g() {
        return this.e;
    }

    public String f() {
        return this.d;
    }

    public Integer e() {
        return this.f20064c;
    }

    public Integer d() {
        return this.f20063b;
    }

    public Long c() {
        return this.f20062a;
    }

    public boolean b() {
        return this.j;
    }

    public String a() {
        return this.k;
    }

    private a(C0229a c0229a) {
        this.j = true;
        this.l = false;
        this.f20062a = c0229a.f20065a;
        this.f20063b = c0229a.f20066b;
        this.f20064c = c0229a.f20067c;
        this.d = c0229a.d;
        this.e = c0229a.e;
        this.f = c0229a.f;
        this.g = c0229a.g;
        this.h = c0229a.h;
        this.i = c0229a.i;
        this.j = c0229a.j;
        this.k = c0229a.k;
        this.l = c0229a.l;
    }

    private a() {
        this.j = true;
        this.l = false;
    }
}
