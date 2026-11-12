package org.bouncycastle.pqc.crypto.xmss;

import defpackage.zgh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29517b;
    public final int c;
    public final int d;

    public static abstract class a<T extends a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29519b = 0;
        public long c = 0;
        public int d = 0;

        public a(int i) {
            this.f29518a = i;
        }

        public abstract T e();

        public T f(int i) {
            this.d = i;
            return (T) e();
        }

        public T g(int i) {
            this.f29519b = i;
            return (T) e();
        }

        public T h(long j) {
            this.c = j;
            return (T) e();
        }
    }

    public f(a aVar) {
        this.f29516a = aVar.f29519b;
        this.f29517b = aVar.c;
        this.c = aVar.f29518a;
        this.d = aVar.d;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.f29516a;
    }

    public final long c() {
        return this.f29517b;
    }

    public byte[] d() {
        byte[] bArr = new byte[32];
        zgh.d(this.f29516a, bArr, 0);
        zgh.j(this.f29517b, bArr, 4);
        zgh.d(this.c, bArr, 12);
        zgh.d(this.d, bArr, 28);
        return bArr;
    }
}
