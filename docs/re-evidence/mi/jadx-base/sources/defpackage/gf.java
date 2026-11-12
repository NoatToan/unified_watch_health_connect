package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class gf extends pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18909a;

    public gf(byte[] bArr) {
        this.f18909a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof gf) {
            return wj1.a(this.f18909a, ((gf) peVar).f18909a);
        }
        return false;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.c(23);
        int length = this.f18909a.length;
        oeVar.i(length);
        for (int i = 0; i != length; i++) {
            oeVar.c(this.f18909a[i]);
        }
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f18909a);
    }

    @Override // defpackage.pe
    public int i() {
        int length = this.f18909a.length;
        return zio.a(length) + 1 + length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return plo.b(this.f18909a);
    }
}
