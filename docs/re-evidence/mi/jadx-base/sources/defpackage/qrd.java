package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class qrd implements il8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kl8 f31768b;
    public int c;
    public int d;
    public int e;
    public MotionPhotoMetadata g;
    public jl8 h;
    public tbo i;
    public f9g j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f31767a = new okh(6);
    public long f = -1;

    public static MotionPhotoMetadata e(String str, long j) throws IOException {
        r8g r8gVarA;
        if (j == -1 || (r8gVarA = nsr.a(str)) == null) {
            return null;
        }
        return r8gVarA.a(j);
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((f9g) rk1.e(this.j)).a(j, j2);
        }
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f31768b = kl8Var;
    }

    public final void c(jl8 jl8Var) throws IOException {
        this.f31767a.L(2);
        jl8Var.i(this.f31767a.d(), 0, 2);
        jl8Var.o(this.f31767a.J() - 2);
    }

    public final void d() {
        h(new Metadata.Entry[0]);
        ((kl8) rk1.e(this.f31768b)).m();
        this.f31768b.k(new arl.b(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        int i = this.c;
        if (i == 0) {
            j(jl8Var);
            return 0;
        }
        if (i == 1) {
            l(jl8Var);
            return 0;
        }
        if (i == 2) {
            k(jl8Var);
            return 0;
        }
        if (i == 4) {
            long position = jl8Var.getPosition();
            long j = this.f;
            if (position != j) {
                r4iVar.f32179a = j;
                return 1;
            }
            m(jl8Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || jl8Var != this.h) {
            this.h = jl8Var;
            this.i = new tbo(jl8Var, this.f);
        }
        int iF = ((f9g) rk1.e(this.j)).f(this.i, r4iVar);
        if (iF == 1) {
            r4iVar.f32179a += this.f;
        }
        return iF;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        if (i(jl8Var) != 65496) {
            return false;
        }
        int i = i(jl8Var);
        this.d = i;
        if (i == 65504) {
            c(jl8Var);
            this.d = i(jl8Var);
        }
        if (this.d != 65505) {
            return false;
        }
        jl8Var.o(2);
        this.f31767a.L(6);
        jl8Var.i(this.f31767a.d(), 0, 6);
        return this.f31767a.F() == 1165519206 && this.f31767a.J() == 0;
    }

    public final void h(Metadata.Entry... entryArr) {
        ((kl8) rk1.e(this.f31768b)).d(1024, 4).b(new Format.b().X(new Metadata(entryArr)).E());
    }

    public final int i(jl8 jl8Var) throws IOException {
        this.f31767a.L(2);
        jl8Var.i(this.f31767a.d(), 0, 2);
        return this.f31767a.J();
    }

    public final void j(jl8 jl8Var) throws IOException {
        this.f31767a.L(2);
        jl8Var.readFully(this.f31767a.d(), 0, 2);
        int iJ = this.f31767a.J();
        this.d = iJ;
        if (iJ == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                d();
                return;
            }
        }
        if ((iJ < 65488 || iJ > 65497) && iJ != 65281) {
            this.c = 1;
        }
    }

    public final void k(jl8 jl8Var) throws IOException {
        String strX;
        if (this.d == 65505) {
            okh okhVar = new okh(this.e);
            jl8Var.readFully(okhVar.d(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(okhVar.x()) && (strX = okhVar.x()) != null) {
                MotionPhotoMetadata motionPhotoMetadataE = e(strX, jl8Var.getLength());
                this.g = motionPhotoMetadataE;
                if (motionPhotoMetadataE != null) {
                    this.f = motionPhotoMetadataE.d;
                }
            }
        } else {
            jl8Var.p(this.e);
        }
        this.c = 0;
    }

    public final void l(jl8 jl8Var) throws IOException {
        this.f31767a.L(2);
        jl8Var.readFully(this.f31767a.d(), 0, 2);
        this.e = this.f31767a.J() - 2;
        this.c = 2;
    }

    public final void m(jl8 jl8Var) throws IOException {
        if (!jl8Var.k(this.f31767a.d(), 0, 1, true)) {
            d();
            return;
        }
        jl8Var.l();
        if (this.j == null) {
            this.j = new f9g();
        }
        tbo tboVar = new tbo(jl8Var, this.f);
        this.i = tboVar;
        if (!this.j.g(tboVar)) {
            d();
        } else {
            this.j.b(new ubo(this.f, (kl8) rk1.e(this.f31768b)));
            n();
        }
    }

    public final void n() {
        h((Metadata.Entry) rk1.e(this.g));
        this.c = 5;
    }

    @Override // defpackage.il8
    public void release() {
        f9g f9gVar = this.j;
        if (f9gVar != null) {
            f9gVar.release();
        }
    }
}
