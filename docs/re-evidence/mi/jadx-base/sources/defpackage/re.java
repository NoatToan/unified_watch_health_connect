package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class re extends de {
    public static re j(byte[] bArr) throws IOException {
        ud udVar = new ud(bArr);
        try {
            re reVarS = udVar.s();
            if (udVar.available() == 0) {
                return reVarS;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // defpackage.de
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd) && g(((hd) obj).toASN1Primitive());
    }

    public abstract boolean g(re reVar);

    public abstract void h(ke keVar) throws IOException;

    @Override // defpackage.de
    public abstract int hashCode();

    public abstract int i() throws IOException;

    public abstract boolean k();

    public re l() {
        return this;
    }

    public re m() {
        return this;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this;
    }
}
