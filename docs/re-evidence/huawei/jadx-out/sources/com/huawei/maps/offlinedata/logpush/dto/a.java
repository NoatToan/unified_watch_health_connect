package com.huawei.maps.offlinedata.logpush.dto;

/* JADX INFO: loaded from: classes12.dex */
public class a extends c {
    private String l;
    private String m;
    private String n;
    private long o;
    private long p;

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.logpush.dto.a$a, reason: collision with other inner class name */
    public static final class C0185a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f17851a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f17852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17853c;

        private C0185a() {
        }

        public static C0185a b() {
            C0185a c0185a = new C0185a();
            c0185a.f17853c = "cloud";
            return c0185a;
        }

        public static C0185a c() {
            C0185a c0185a = new C0185a();
            c0185a.f17853c = "sdk";
            return c0185a;
        }

        public C0185a a(String str) {
            this.f17852b = str;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    private a(C0185a c0185a) {
        this.l = "";
        this.m = "";
        this.n = "";
        this.l = c0185a.f17851a;
        this.m = c0185a.f17852b;
        this.o = System.currentTimeMillis();
        a(c0185a.f17853c);
    }

    public void a(long j) {
        this.p = j;
    }

    public void b(String str) {
        this.n = str;
    }

    public void c(String str) {
        this.l = str;
    }

    public String l() {
        return this.m;
    }

    public long m() {
        return this.p;
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.l;
    }

    public long p() {
        return this.o;
    }

    public String toString() {
        return "AccessTraceLogDTO{ requestId='" + this.l + "', apiName='" + this.m + "', errorCode='" + this.n + "', startTime=" + this.o + ", endTime=" + this.p + '}';
    }
}
