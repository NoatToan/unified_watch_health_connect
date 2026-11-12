package com.google.typography.font.sfntly.table.bitmap;

import defpackage.apr;
import defpackage.jgj;
import defpackage.nno;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e extends nno {
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public static abstract class a<T extends e> extends nno.a<T> {
        public int g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9801k;

        public a(jgj jgjVar, int i, int i2) {
            super(jgjVar);
            this.g = i;
            this.h = i2;
            y(jgjVar);
        }

        public static a<? extends e> u(jgj jgjVar, int i, int i2) {
            int i3 = (i2 * c.b.F.f9800a) + i;
            int iV = jgjVar.v(c.b.G.f9800a + i3);
            int iV2 = jgjVar.v(c.b.H.f9800a + i3);
            int iU = i + jgjVar.u(i3 + c.b.I.f9800a);
            int iV3 = jgjVar.v(iU);
            if (iV3 == 1) {
                return f.b.D(jgjVar, iU, iV, iV2);
            }
            if (iV3 == 2) {
                return g.b.D(jgjVar, iU, iV, iV2);
            }
            if (iV3 == 3) {
                return h.b.D(jgjVar, iU, iV, iV2);
            }
            if (iV3 == 4) {
                return i.b.D(jgjVar, iU, iV, iV2);
            }
            if (iV3 == 5) {
                return j.b.E(jgjVar, iU, iV, iV2);
            }
            throw new IllegalArgumentException(String.format("Invalid Index SubTable Foramt %i%n", Integer.valueOf(iV3)));
        }

        private void y(jgj jgjVar) {
            this.i = jgjVar.v(c.b.K.f9800a);
            this.j = jgjVar.v(c.b.L.f9800a);
            this.f9801k = jgjVar.u(c.b.M.f9800a);
        }

        public void A() {
            n(false);
            y(g());
        }

        public int B(apr aprVar) {
            return aprVar.Q(c.b.K.f9800a, this.i) + aprVar.Q(c.b.L.f9800a, this.j) + aprVar.O(c.b.M.f9800a, this.f9801k);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: C */
        public T o(jgj jgjVar) {
            return null;
        }

        @Override // xz9.a
        public void p() {
        }

        @Override // xz9.a
        public int q() {
            return 0;
        }

        @Override // xz9.a
        public boolean r() {
            return false;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            return 0;
        }

        public String toString() {
            return "IndexSubTable: [0x" + Integer.toHexString(v()) + " : Ox" + Integer.toHexString(z()) + "], format = " + this.i + ", image format = " + x() + ", imageOff = 0x" + Integer.toHexString(w()) + "\n";
        }

        public int v() {
            return this.g;
        }

        public int w() {
            return this.f9801k;
        }

        public int x() {
            return this.j;
        }

        public int z() {
            return this.h;
        }
    }

    public e(jgj jgjVar, int i, int i2) {
        super(jgjVar);
        this.d = i;
        this.e = i2;
        this.f = this.f39611a.v(c.b.K.f9800a);
        this.g = this.f39611a.v(c.b.L.f9800a);
        this.h = this.f39611a.u(c.b.M.f9800a);
    }

    public static e k(jgj jgjVar, int i, int i2) {
        a<? extends e> aVarU = a.u(jgjVar, i, i2);
        if (aVarU == null) {
            return null;
        }
        return aVarU.a();
    }

    public int l() {
        return this.d;
    }

    public int m() {
        return this.h;
    }

    public int o() {
        return this.g;
    }

    public int q() {
        return this.e;
    }

    @Override // defpackage.xz9
    public String toString() {
        return "IndexSubTable: [0x" + Integer.toHexString(l()) + " : Ox" + Integer.toHexString(q()) + "], format = " + this.f + ", image format = " + o() + ", imageOff = " + Integer.toHexString(m()) + "\n";
    }
}
