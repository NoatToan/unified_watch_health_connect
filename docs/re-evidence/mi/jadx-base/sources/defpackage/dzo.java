package defpackage;

import com.google.typography.font.sfntly.table.bitmap.EbdtTable;
import com.google.typography.font.sfntly.table.bitmap.c;
import com.google.typography.font.sfntly.table.core.FontHeaderTable;
import com.google.typography.font.sfntly.table.core.NameTable;
import com.google.typography.font.sfntly.table.core.OS2Table;
import com.google.typography.font.sfntly.table.core.j;
import com.google.typography.font.sfntly.table.truetype.GlyphTable;

/* JADX INFO: loaded from: classes5.dex */
public class dzo extends xz9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ylb f16095b;

    public dzo(ylb ylbVar, jgj jgjVar) {
        super(jgjVar);
        this.f16095b = ylbVar;
    }

    public long i() {
        return this.f39611a.g();
    }

    public ylb j() {
        return this.f16095b;
    }

    public int k() {
        return j().f();
    }

    @Override // defpackage.xz9
    public String toString() {
        return "[" + tzo.e(this.f16095b.f()) + ", cs=0x" + Long.toHexString(this.f16095b.c()) + ", offset=0x" + Integer.toHexString(this.f16095b.e()) + ", size=0x" + Integer.toHexString(this.f16095b.d()) + "]";
    }

    public static abstract class a<T extends dzo> extends xz9.a<T> {
        public ylb f;

        public a(ylb ylbVar, apr aprVar) {
            super(aprVar);
            this.f = ylbVar;
        }

        public static a<? extends dzo> t(ylb ylbVar, apr aprVar) {
            int iF = ylbVar.f();
            if (iF == tzo.f35226b) {
                return j.b.x(ylbVar, aprVar);
            }
            if (iF == tzo.c) {
                return FontHeaderTable.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.d) {
                return mac.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.e) {
                return nac.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.f) {
                return q9f.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.g) {
                return NameTable.b.w(ylbVar, aprVar);
            }
            if (iF == tzo.h) {
                return OS2Table.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.i) {
                return w4i.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.j) {
                return rj4.a.y(ylbVar, aprVar);
            }
            if (iF == tzo.l) {
                return GlyphTable.b.w(ylbVar, aprVar);
            }
            if (iF == tzo.m) {
                return tie.b.x(ylbVar, aprVar);
            }
            if (iF == tzo.n) {
                return qj4.a.y(ylbVar, aprVar);
            }
            if (iF == tzo.q) {
                return EbdtTable.a.w(ylbVar, aprVar);
            }
            if (iF == tzo.f35228r) {
                return c.a.w(ylbVar, aprVar);
            }
            if (iF == tzo.s) {
                return ha7.b.w(ylbVar, aprVar);
            }
            if (iF == tzo.w) {
                return cxa.b.w(ylbVar, aprVar);
            }
            if (iF == tzo.A) {
                return lac.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.S) {
                return FontHeaderTable.b.y(ylbVar, aprVar);
            }
            if (iF == tzo.T) {
                return EbdtTable.a.w(ylbVar, aprVar);
            }
            return iF == tzo.U ? c.a.w(ylbVar, aprVar) : iya.y(ylbVar, aprVar);
        }

        public String toString() {
            return "Table Builder for - " + this.f.toString();
        }

        public final ylb u() {
            return this.f;
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void k(T t) {
            if (j() || f()) {
                t.f16095b = new ylb(u().f(), t.e());
            }
        }

        public a(ylb ylbVar, jgj jgjVar) {
            super(jgjVar);
            this.f = ylbVar;
        }
    }
}
