package org.bouncycastle.pqc.crypto.xmss;

import defpackage.zgh;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {
    public final int e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: org.bouncycastle.pqc.crypto.xmss.b$b, reason: collision with other inner class name */
    public static class C1064b extends f.a<C1064b> {
        public int e;
        public int f;

        public C1064b() {
            super(2);
            this.e = 0;
            this.f = 0;
        }

        public f k() {
            return new b(this);
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.f.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C1064b e() {
            return this;
        }

        public C1064b m(int i) {
            this.e = i;
            return this;
        }

        public C1064b n(int i) {
            this.f = i;
            return this;
        }
    }

    public b(C1064b c1064b) {
        super(c1064b);
        this.e = 0;
        this.f = c1064b.e;
        this.g = c1064b.f;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.f
    public byte[] d() {
        byte[] bArrD = super.d();
        zgh.d(this.e, bArrD, 16);
        zgh.d(this.f, bArrD, 20);
        zgh.d(this.g, bArrD, 24);
        return bArrD;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }
}
