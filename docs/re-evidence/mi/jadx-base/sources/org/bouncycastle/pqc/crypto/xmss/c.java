package org.bouncycastle.pqc.crypto.xmss;

import defpackage.zgh;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {
    public final int e;
    public final int f;
    public final int g;

    public static class b extends f.a<b> {
        public int e;
        public int f;
        public int g;

        public b() {
            super(1);
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }

        public f l() {
            return new c(this);
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.f.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        public b n(int i) {
            this.e = i;
            return this;
        }

        public b o(int i) {
            this.f = i;
            return this;
        }

        public b p(int i) {
            this.g = i;
            return this;
        }
    }

    public c(b bVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
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
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }
}
