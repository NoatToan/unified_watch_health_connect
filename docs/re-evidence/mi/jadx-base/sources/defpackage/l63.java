package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l63 implements kl8, dw3 {
    public static final dw3.a j = new dw3.a() { // from class: k63
        @Override // dw3.a
        public final dw3 a(int i, Format format, boolean z, List list, snp snpVar) {
            return l63.g(i, format, z, list, snpVar);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r4i f24708k = new r4i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final il8 f24709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24710b;
    public final Format c;
    public final SparseArray<a> d = new SparseArray<>();
    public boolean e;
    public dw3.b f;
    public long g;
    public arl h;
    public Format[] i;

    public static final class a implements snp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24712b;
        public final Format c;
        public final p67 d = new p67();
        public Format e;
        public snp f;
        public long g;

        public a(int i, int i2, Format format) {
            this.f24711a = i;
            this.f24712b = i2;
            this.c = format;
        }

        @Override // defpackage.snp
        public void a(okh okhVar, int i, int i2) {
            ((snp) wlq.j(this.f)).d(okhVar, i);
        }

        @Override // defpackage.snp
        public void b(Format format) {
            Format format2 = this.c;
            if (format2 != null) {
                format = format.g(format2);
            }
            this.e = format;
            ((snp) wlq.j(this.f)).b(this.e);
        }

        @Override // defpackage.snp
        public void e(long j, int i, int i2, int i3, snp.a aVar) {
            long j2 = this.g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f = this.d;
            }
            ((snp) wlq.j(this.f)).e(j, i, i2, i3, aVar);
        }

        @Override // defpackage.snp
        public int f(zm5 zm5Var, int i, boolean z, int i2) throws IOException {
            return ((snp) wlq.j(this.f)).c(zm5Var, i, z);
        }

        public void g(dw3.b bVar, long j) {
            if (bVar == null) {
                this.f = this.d;
                return;
            }
            this.g = j;
            snp snpVarD = bVar.d(this.f24711a, this.f24712b);
            this.f = snpVarD;
            Format format = this.e;
            if (format != null) {
                snpVarD.b(format);
            }
        }
    }

    public l63(il8 il8Var, int i, Format format) {
        this.f24709a = il8Var;
        this.f24710b = i;
        this.c = format;
    }

    public static /* synthetic */ dw3 g(int i, Format format, boolean z, List list, snp snpVar) {
        il8 znaVar;
        String str = format.f7817k;
        if (ayf.r(str)) {
            if (!"application/x-rawcc".equals(str)) {
                return null;
            }
            znaVar = new zbj(format);
        } else if (ayf.q(str)) {
            znaVar = new z8f(1);
        } else {
            znaVar = new zna(z ? 4 : 0, null, null, list, snpVar);
        }
        return new l63(znaVar, i, format);
    }

    @Override // defpackage.dw3
    public boolean a(jl8 jl8Var) throws IOException {
        int iF = this.f24709a.f(jl8Var, f24708k);
        rk1.g(iF != 1);
        return iF == 0;
    }

    @Override // defpackage.dw3
    public void b(dw3.b bVar, long j2, long j3) {
        this.f = bVar;
        this.g = j3;
        if (!this.e) {
            this.f24709a.b(this);
            if (j2 != -9223372036854775807L) {
                this.f24709a.a(0L, j2);
            }
            this.e = true;
            return;
        }
        il8 il8Var = this.f24709a;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        il8Var.a(0L, j2);
        for (int i = 0; i < this.d.size(); i++) {
            this.d.valueAt(i).g(bVar, j3);
        }
    }

    @Override // defpackage.dw3
    public fw3 c() {
        arl arlVar = this.h;
        if (arlVar instanceof fw3) {
            return (fw3) arlVar;
        }
        return null;
    }

    @Override // defpackage.kl8
    public snp d(int i, int i2) {
        a aVar = this.d.get(i);
        if (aVar == null) {
            rk1.g(this.i == null);
            aVar = new a(i, i2, i2 == this.f24710b ? this.c : null);
            aVar.g(this.f, this.g);
            this.d.put(i, aVar);
        }
        return aVar;
    }

    @Override // defpackage.dw3
    public Format[] e() {
        return this.i;
    }

    @Override // defpackage.kl8
    public void k(arl arlVar) {
        this.h = arlVar;
    }

    @Override // defpackage.kl8
    public void m() {
        Format[] formatArr = new Format[this.d.size()];
        for (int i = 0; i < this.d.size(); i++) {
            formatArr[i] = (Format) rk1.i(this.d.valueAt(i).e);
        }
        this.i = formatArr;
    }

    @Override // defpackage.dw3
    public void release() {
        this.f24709a.release();
    }
}
