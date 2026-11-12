package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class a2d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f547a = new okh(10);

    public Metadata a(jl8 jl8Var, z1d.a aVar) throws IOException {
        Metadata metadataE = null;
        int i = 0;
        while (true) {
            try {
                jl8Var.i(this.f547a.d(), 0, 10);
                this.f547a.P(0);
                if (this.f547a.G() != 4801587) {
                    break;
                }
                this.f547a.Q(3);
                int iC = this.f547a.C();
                int i2 = iC + 10;
                if (metadataE == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f547a.d(), 0, bArr, 0, 10);
                    jl8Var.i(bArr, 10, iC);
                    metadataE = new z1d(aVar).e(bArr, i2);
                } else {
                    jl8Var.o(iC);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        jl8Var.l();
        jl8Var.o(i);
        return metadataE;
    }
}
