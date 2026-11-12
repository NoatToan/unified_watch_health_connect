package com.xiaomi.verificationsdk.internal;

/* JADX INFO: loaded from: classes2.dex */
public class VerifyError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14371b;
    public int c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14373b;
        public int c;

        public VerifyError d() {
            return new VerifyError(this);
        }

        public a e(int i) {
            this.f14372a = i;
            return this;
        }

        public a f(int i) {
            this.c = i;
            return this;
        }

        public a g(String str) {
            this.f14373b = str;
            return this;
        }
    }

    public VerifyError(a aVar) {
        this.f14370a = aVar.f14372a;
        this.f14371b = aVar.f14373b;
        this.c = aVar.c;
    }

    public int a() {
        return this.f14370a;
    }

    public int b() {
        return this.c;
    }
}
