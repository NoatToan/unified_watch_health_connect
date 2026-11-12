package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends e {
    public final int i;

    public static final class b extends e.a<j> {
        public List<Integer> l;
        public com.google.typography.font.sfntly.table.bitmap.a.C0262a m;

        public b(jgj jgjVar, int i, int i2) {
            super(jgjVar, i, i2);
        }

        public static b E(jgj jgjVar, int i, int i2, int i3) {
            return new b(jgjVar.A(i, F(jgjVar, i, i2, i3)), i2, i3);
        }

        private static int F(jgj jgjVar, int i, int i2, int i3) {
            return c.b.e0.f9800a + (j.t(jgjVar, i) * FontData.DataSize.USHORT.size());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a
        public void A() {
            super.A();
            this.l = null;
        }

        public com.google.typography.font.sfntly.table.bitmap.a.C0262a D() {
            if (this.m == null) {
                this.m = new com.google.typography.font.sfntly.table.bitmap.a.C0262a(i().A(c.b.c0.f9800a, com.google.typography.font.sfntly.table.bitmap.a.b.metricsLength.f9796a));
                m();
            }
            return this.m;
        }

        public int G() {
            return g().u(c.b.b0.f9800a);
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public j o(jgj jgjVar) {
            return new j(jgjVar, v(), z());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public void p() {
            A();
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public int q() {
            List<Integer> list = this.l;
            return list == null ? g().e() : c.b.f0.f9800a + (list.size() * FontData.DataSize.USHORT.size());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public boolean r() {
            return this.l != null;
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public int s(apr aprVar) {
            int iB = super.B(aprVar);
            if (!j()) {
                jgj jgjVarG = g();
                c.b bVar = c.b.b0;
                return iB + jgjVarG.z(bVar.f9800a).j(aprVar.z(bVar.f9800a));
            }
            int iO = iB + aprVar.O(c.b.b0.f9800a, G());
            int iS = iO + D().s(aprVar.z(iO));
            int iO2 = iS + aprVar.O(iS, this.l.size());
            Iterator<Integer> it = this.l.iterator();
            while (it.hasNext()) {
                iO2 += aprVar.Q(iO2, it.next().intValue());
            }
            return iO2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(jgj jgjVar, int i) {
        return jgjVar.u(i + c.b.d0.f9800a);
    }

    public j(jgj jgjVar, int i, int i2) {
        super(jgjVar, i, i2);
        this.i = this.f39611a.u(c.b.b0.f9800a);
    }
}
