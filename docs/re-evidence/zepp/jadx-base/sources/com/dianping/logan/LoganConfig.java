package com.dianping.logan;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LoganConfig {
    private static final long i = 86400000;
    private static final long j = 1048576;
    private static final long k = 604800000;
    private static final long l = 10485760;
    private static final long m = 52428800;
    private static final int n = 500;
    public String a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public byte[] g;
    public byte[] h;

    public static final class Builder {
        public String a;
        public String b;
        public byte[] e;
        public byte[] f;
        public long c = LoganConfig.l;
        public long d = LoganConfig.k;
        public long g = LoganConfig.m;

        public LoganConfig build() {
            LoganConfig loganConfig = new LoganConfig();
            loganConfig.i(this.a);
            loganConfig.o(this.b);
            loganConfig.m(this.c);
            loganConfig.n(this.g);
            loganConfig.j(this.d);
            loganConfig.l(this.e);
            loganConfig.k(this.f);
            return loganConfig;
        }

        public Builder setCachePath(String str) {
            this.a = str;
            return this;
        }

        public Builder setDay(long j) {
            this.d = j * 86400000;
            return this;
        }

        public Builder setEncryptIV16(byte[] bArr) {
            this.f = bArr;
            return this;
        }

        public Builder setEncryptKey16(byte[] bArr) {
            this.e = bArr;
            return this;
        }

        public Builder setMaxFile(long j) {
            this.c = j * 1048576;
            return this;
        }

        public Builder setMinSDCard(long j) {
            this.g = j;
            return this;
        }

        public Builder setPath(String str) {
            this.b = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j2) {
        this.d = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(byte[] bArr) {
        this.h = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(byte[] bArr) {
        this.g = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(long j2) {
        this.c = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(long j2) {
        this.f = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        this.b = str;
    }

    public boolean h() {
        return (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b) || this.g == null || this.h == null) ? false : true;
    }

    private LoganConfig() {
        this.c = l;
        this.d = k;
        this.e = 500L;
        this.f = m;
    }
}
