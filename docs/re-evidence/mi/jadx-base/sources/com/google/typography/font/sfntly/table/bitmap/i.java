package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends e {
    public static final Comparator<c> i = new d();

    public static final class b extends e.a<i> {
        public List<Object> l;

        public b(jgj jgjVar, int i, int i2) {
            super(jgjVar, i, i2);
        }

        public static b D(jgj jgjVar, int i, int i2, int i3) {
            return new b(jgjVar.A(i, E(jgjVar, i, i2, i3)), i2, i3);
        }

        private static int E(jgj jgjVar, int i, int i2, int i3) {
            return com.google.typography.font.sfntly.table.bitmap.c.b.W.f9800a + (i.t(jgjVar, i) * com.google.typography.font.sfntly.table.bitmap.c.b.X.f9800a);
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a
        public void A() {
            super.A();
            this.l = null;
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public i o(jgj jgjVar) {
            return new i(jgjVar, v(), z());
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public void p() {
            A();
        }

        @Override // com.google.typography.font.sfntly.table.bitmap.e.a, xz9.a
        public int q() {
            return this.l == null ? g().e() : com.google.typography.font.sfntly.table.bitmap.c.b.J.f9800a + FontData.DataSize.ULONG.size() + (this.l.size() * com.google.typography.font.sfntly.table.bitmap.c.b.X.f9800a);
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
                com.google.typography.font.sfntly.table.bitmap.c.b bVar = com.google.typography.font.sfntly.table.bitmap.c.b.V;
                return iB + jgjVarG.z(bVar.f9800a).j(aprVar.z(bVar.f9800a));
            }
            int iK = iB + aprVar.K(iB, this.l.size() - 1);
            Iterator<Object> it = this.l.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                int iQ = iK + aprVar.Q(iK, cVar.a());
                iK = iQ + aprVar.Q(iQ, cVar.b());
            }
            return iK;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9803b;

        public int a() {
            return this.f9802a;
        }

        public int b() {
            return this.f9803b;
        }
    }

    public static final class d implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return cVar.f9802a - cVar2.f9802a;
        }

        public d() {
        }
    }

    public static int t(jgj jgjVar, int i2) {
        return jgjVar.u(i2 + com.google.typography.font.sfntly.table.bitmap.c.b.V.f9800a);
    }

    public i(jgj jgjVar, int i2, int i3) {
        super(jgjVar, i2, i3);
    }
}
