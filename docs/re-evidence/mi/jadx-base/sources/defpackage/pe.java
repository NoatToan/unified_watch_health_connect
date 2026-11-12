package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pe extends be {
    public static pe j(byte[] bArr) throws IOException {
        rd rdVar = new rd(bArr);
        try {
            pe peVarS = rdVar.s();
            if (rdVar.available() == 0) {
                return peVarS;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // defpackage.be
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd) && g(((gd) obj).toASN1Primitive());
    }

    public abstract boolean g(pe peVar);

    public abstract void h(oe oeVar) throws IOException;

    @Override // defpackage.be
    public abstract int hashCode();

    public abstract int i() throws IOException;

    public abstract boolean k();

    public pe l() {
        return this;
    }

    public pe m() {
        return this;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this;
    }
}
