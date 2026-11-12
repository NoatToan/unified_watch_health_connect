package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import defpackage.nno;
import defpackage.yz9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends nno {
    public final Object d;
    public volatile List<e> e;

    public static final class a extends nno.a<b> {
        public List<e.a<? extends e>> g;

        public a(jgj jgjVar, jgj jgjVar2) {
            super(jgjVar, jgjVar2);
        }

        public static a u(jgj jgjVar, jgj jgjVar2) {
            return new a(jgjVar, jgjVar2);
        }

        public void A() {
            this.g = null;
            n(false);
        }

        public void B(int i) {
            i().O(c.b.g.f9800a, i);
        }

        public void C(int i) {
            i().O(c.b.h.f9800a, i);
        }

        public final void D(int i) {
            i().O(c.b.i.f9800a, i);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public b o(jgj jgjVar) {
            return new b(jgjVar, t());
        }

        @Override // xz9.a
        public void p() {
            A();
        }

        @Override // xz9.a
        public int q() {
            boolean z = false;
            if (y() == null) {
                return 0;
            }
            int iAbs = c.b.f.f9800a;
            for (e.a<? extends e> aVar : this.g) {
                int i = iAbs + c.b.F.f9800a;
                int iQ = aVar.q();
                int iB = yz9.b(Math.abs(iQ), FontData.DataSize.ULONG.size());
                if (iQ <= 0) {
                    z = true;
                }
                iAbs = i + Math.abs(iQ) + iB;
            }
            return z ? -iAbs : iAbs;
        }

        @Override // xz9.a
        public boolean r() {
            return y() != null;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            D(y().size());
            return g().j(aprVar);
        }

        public final e.a<? extends e> v(int i) {
            return e.a.u(t(), x(), i);
        }

        public final List<e.a<? extends e>> w() {
            if (this.g == null) {
                z(g());
                m();
            }
            return this.g;
        }

        public int x() {
            return g().u(c.b.g.f9800a);
        }

        public List<e.a<? extends e>> y() {
            return w();
        }

        public final void z(jgj jgjVar) {
            List<e.a<? extends e>> list = this.g;
            if (list == null) {
                this.g = new ArrayList();
            } else {
                list.clear();
            }
            if (jgjVar != null) {
                int iT = b.t(jgjVar, 0);
                for (int i = 0; i < iT; i++) {
                    this.g.add(v(i));
                }
            }
        }
    }

    public b(jgj jgjVar, jgj jgjVar2) {
        super(jgjVar, jgjVar2);
        this.d = new Object();
        this.e = null;
    }

    public static int t(jgj jgjVar, int i) {
        return jgjVar.u(i + c.b.i.f9800a);
    }

    public final e l(int i) {
        return e.k(h(), q(), i);
    }

    public int m() {
        return this.f39611a.v(c.b.n.f9800a);
    }

    public final List<e> o() {
        if (this.e == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        ArrayList arrayList = new ArrayList(r());
                        for (int i = 0; i < r(); i++) {
                            arrayList.add(l(i));
                        }
                        this.e = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }

    public int q() {
        return this.f39611a.u(c.b.g.f9800a);
    }

    public int r() {
        return t(this.f39611a, 0);
    }

    @Override // defpackage.xz9
    public String toString() {
        StringBuilder sb = new StringBuilder("BitmapSizeTable: ");
        List<e> listO = o();
        sb.append("[s=0x");
        sb.append(Integer.toHexString(v()));
        sb.append(", e=0x");
        sb.append(Integer.toHexString(m()));
        sb.append(", ppemx=");
        sb.append(u());
        sb.append(", index subtables count=");
        sb.append(r());
        sb.append("]");
        for (int i = 0; i < listO.size(); i++) {
            sb.append("\n\t");
            sb.append(i);
            sb.append(": ");
            sb.append(listO.get(i));
            sb.append(", ");
        }
        sb.append("\n");
        return sb.toString();
    }

    public int u() {
        return this.f39611a.m(c.b.o.f9800a);
    }

    public int v() {
        return this.f39611a.v(c.b.m.f9800a);
    }
}
