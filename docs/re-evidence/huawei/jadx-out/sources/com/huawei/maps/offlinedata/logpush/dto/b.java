package com.huawei.maps.offlinedata.logpush.dto;

/* JADX INFO: loaded from: classes12.dex */
public class b extends c {
    private String l;
    private String m;
    private Throwable n;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f17854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f17855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Throwable f17856c;

        public a a(String str) {
            this.f17855b = str;
            return this;
        }

        public a b(String str) {
            this.f17854a = str;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(a aVar) {
        this.l = aVar.f17854a;
        this.m = aVar.f17855b;
        this.n = aVar.f17856c;
    }

    public String l() {
        return this.m;
    }

    public String m() {
        return this.l;
    }

    public Throwable n() {
        return this.n;
    }

    public String toString() {
        return "ErrorTraceLogDTO{ scenario='" + this.l + "', message='" + this.m + "'}";
    }
}
