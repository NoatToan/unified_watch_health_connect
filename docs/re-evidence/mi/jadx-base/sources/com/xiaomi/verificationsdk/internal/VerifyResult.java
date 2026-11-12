package com.xiaomi.verificationsdk.internal;

/* JADX INFO: loaded from: classes2.dex */
public class VerifyResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14375b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14377b;

        public VerifyResult c() {
            return new VerifyResult(this);
        }

        public b d(String str) {
            this.f14377b = str;
            return this;
        }

        public b e(String str) {
            this.f14376a = str;
            return this;
        }
    }

    public String a() {
        return this.f14374a;
    }

    public VerifyResult(b bVar) {
        this.f14374a = bVar.f14376a;
        this.f14375b = bVar.f14377b;
    }
}
