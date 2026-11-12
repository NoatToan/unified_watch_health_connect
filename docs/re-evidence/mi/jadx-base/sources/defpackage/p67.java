package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class p67 implements snp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30054a = new byte[4096];

    @Override // defpackage.snp
    public void a(okh okhVar, int i, int i2) {
        okhVar.Q(i);
    }

    @Override // defpackage.snp
    public void b(Format format) {
    }

    @Override // defpackage.snp
    public void e(long j, int i, int i2, int i3, snp.a aVar) {
    }

    @Override // defpackage.snp
    public int f(zm5 zm5Var, int i, boolean z, int i2) throws IOException {
        int i3 = zm5Var.read(this.f30054a, 0, Math.min(this.f30054a.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
