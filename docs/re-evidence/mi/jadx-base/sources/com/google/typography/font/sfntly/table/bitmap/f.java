package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends e {

    public static final class b extends e.a<f> {
        public List<Integer> l;

        public b(jgj jgjVar, int i, int i2) {
            super(jgjVar, i, i2);
        }

        public static b D(jgj jgjVar, int i, int i2, int i3) {
            return new b(jgjVar.A(i, E(jgjVar, i, i2, i3)), i2, i3);
        }

        public static int E(jgj jgjVar, int i, int i2, int i3) {
            return c.b.J.f9800a + (((i3 - i2) + 2) * FontData.DataSize.ULONG.size());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a
        public void A() {
            super.A();
            this.l = null;
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public f o(jgj jgjVar) {
            return new f(jgjVar, v(), z());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public void p() {
            A();
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public int q() {
            List<Integer> list = this.l;
            return list == null ? g().e() : c.b.J.f9800a + (list.size() * FontData.DataSize.ULONG.size());
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
                c.b bVar = c.b.N;
                return iB + jgjVarG.z(bVar.f9800a).j(aprVar.z(bVar.f9800a));
            }
            Iterator<Integer> it = this.l.iterator();
            while (it.hasNext()) {
                iB += aprVar.O(iB, it.next().intValue());
            }
            return iB;
        }
    }

    public f(jgj jgjVar, int i, int i2) {
        super(jgjVar, i, i2);
    }
}
