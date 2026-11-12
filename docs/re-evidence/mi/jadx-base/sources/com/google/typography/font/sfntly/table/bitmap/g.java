package com.google.typography.font.sfntly.table.bitmap;

import defpackage.apr;
import defpackage.jgj;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends e {
    public final int i;

    public static final class b extends e.a<g> {
        public com.google.typography.font.sfntly.table.bitmap.a.C0262a l;

        public b(jgj jgjVar, int i, int i2) {
            super(jgjVar, i, i2);
        }

        public static b D(jgj jgjVar, int i, int i2, int i3) {
            return new b(jgjVar.A(i, E(jgjVar, i, i2, i3)), i2, i3);
        }

        private static int E(jgj jgjVar, int i, int i2, int i3) {
            return c.b.P.f9800a;
        }

        public int F() {
            return g().u(c.b.Q.f9800a);
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public g o(jgj jgjVar) {
            return new g(jgjVar, v(), z());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public void p() {
            A();
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public int q() {
            return c.b.P.f9800a;
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public boolean r() {
            return true;
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public int s(apr aprVar) {
            int iS;
            int iB = super.B(aprVar);
            if (this.l == null) {
                iS = g().z(iB).j(aprVar.z(iB));
            } else {
                iB += aprVar.K(c.b.Q.f9800a, F());
                iS = this.l.s(aprVar.z(iB));
            }
            return iB + iS;
        }
    }

    public g(jgj jgjVar, int i, int i2) {
        super(jgjVar, i, i2);
        this.i = this.f39611a.u(c.b.Q.f9800a);
    }
}
