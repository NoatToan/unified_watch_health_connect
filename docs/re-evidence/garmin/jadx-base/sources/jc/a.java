package jc;

import bb.f0;
import bb.i;
import bb.i0;
import bb.n;
import bb.o;
import bb.p;
import fa.r;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f98123a = new r(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f98124b = new i0(-1, -1, "image/webp");

    @Override // bb.n
    public final int b(o oVar, f0 f0Var) {
        return this.f98124b.b(oVar, f0Var);
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f98124b.c(pVar);
    }

    @Override // bb.n
    public final boolean d(o oVar) throws EOFException, InterruptedIOException {
        r rVar = this.f98123a;
        rVar.D(4);
        i iVar = (i) oVar;
        iVar.peekFully(rVar.f70054a, 0, 4, false);
        if (rVar.w() == 1380533830) {
            iVar.advancePeekPosition(4, false);
            rVar.D(4);
            iVar.peekFully(rVar.f70054a, 0, 4, false);
            if (rVar.w() == 1464156752) {
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
        this.f98124b.seek(j8, j14);
    }
}
