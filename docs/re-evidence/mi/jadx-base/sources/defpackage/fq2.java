package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class fq2 implements dbi<w14<u14>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<w14<u14>> f18074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18075b;
    public final int c;
    public final boolean d;

    public static class a extends sy5<w14<u14>, w14<u14>> {
        public final int c;
        public final int d;

        public a(cg4<w14<u14>> cg4Var, int i, int i2) {
            super(cg4Var);
            this.c = i;
            this.d = i2;
        }

        public final void p(w14<u14> w14Var) {
            u14 u14VarN;
            Bitmap bitmapD;
            int rowBytes;
            if (w14Var == null || !w14Var.s() || (u14VarN = w14Var.n()) == null || u14VarN.isClosed() || !(u14VarN instanceof z14) || (bitmapD = ((z14) u14VarN).d()) == null || (rowBytes = bitmapD.getRowBytes() * bitmapD.getHeight()) < this.c || rowBytes > this.d) {
                return;
            }
            bitmapD.prepareToDraw();
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(w14<u14> w14Var, int i) {
            p(w14Var);
            o().b(w14Var, i);
        }
    }

    public fq2(dbi<w14<u14>> dbiVar, int i, int i2, boolean z) {
        b6i.b(i <= i2);
        this.f18074a = (dbi) b6i.g(dbiVar);
        this.f18075b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // defpackage.dbi
    public void a(cg4<w14<u14>> cg4Var, ebi ebiVar) {
        if (!ebiVar.e() || this.d) {
            this.f18074a.a(new a(cg4Var, this.f18075b, this.c), ebiVar);
        } else {
            this.f18074a.a(cg4Var, ebiVar);
        }
    }
}
