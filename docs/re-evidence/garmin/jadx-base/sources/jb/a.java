package jb;

import bb.f0;
import bb.i0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f98076a;

    public a(int i14) {
        if ((i14 & 1) != 0) {
            this.f98076a = new i0(65496, 2, MimeTypes.IMAGE_JPEG);
        } else {
            this.f98076a = new b();
        }
    }

    @Override // bb.n
    public final int b(o oVar, f0 f0Var) {
        return this.f98076a.b(oVar, f0Var);
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f98076a.c(pVar);
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        return this.f98076a.d(oVar);
    }

    @Override // bb.n
    public final void release() {
        this.f98076a.release();
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f98076a.seek(j8, j14);
    }

    public a() {
        this(0);
    }
}
