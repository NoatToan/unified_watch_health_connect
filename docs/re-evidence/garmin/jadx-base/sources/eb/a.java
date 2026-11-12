package eb;

import bb.f0;
import bb.i;
import bb.i0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import fa.r;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f63653a = new r(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f63654b = new i0(-1, -1, "image/avif");

    @Override // bb.n
    public final int b(o oVar, f0 f0Var) {
        return this.f63654b.b(oVar, f0Var);
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f63654b.c(pVar);
    }

    @Override // bb.n
    public final boolean d(o oVar) throws EOFException, InterruptedIOException {
        i iVar = (i) oVar;
        iVar.advancePeekPosition(4, false);
        r rVar = this.f63653a;
        rVar.D(4);
        iVar.peekFully(rVar.f70054a, 0, 4, false);
        if (rVar.w() == Atom.TYPE_ftyp) {
            rVar.D(4);
            iVar.peekFully(rVar.f70054a, 0, 4, false);
            if (rVar.w() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f63654b.seek(j8, j14);
    }
}
