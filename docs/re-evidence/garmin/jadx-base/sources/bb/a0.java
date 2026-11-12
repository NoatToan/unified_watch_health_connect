package bb;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.r f17091a = new fa.r(10);

    public final androidx.media3.common.w a(o oVar, pb.g.a aVar) {
        fa.r rVar = this.f17091a;
        androidx.media3.common.w wVarC = null;
        int i14 = 0;
        while (true) {
            try {
                oVar.peekFully(rVar.f70054a, 0, 10);
                rVar.G(0);
                if (rVar.x() != 4801587) {
                    break;
                }
                rVar.H(3);
                int iT = rVar.t();
                int i15 = iT + 10;
                if (wVarC == null) {
                    byte[] bArr = new byte[i15];
                    System.arraycopy(rVar.f70054a, 0, bArr, 0, 10);
                    oVar.peekFully(bArr, 10, iT);
                    wVarC = new pb.g(aVar).c(i15, bArr);
                } else {
                    oVar.advancePeekPosition(iT);
                }
                i14 += i15;
            } catch (EOFException unused) {
            }
        }
        oVar.resetPeekPosition();
        oVar.advancePeekPosition(i14);
        return wVarC;
    }
}
