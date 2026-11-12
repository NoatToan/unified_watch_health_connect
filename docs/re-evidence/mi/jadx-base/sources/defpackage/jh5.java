package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class jh5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22796a;

    public jh5(byte[] bArr) {
        this.f22796a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof jh5) {
            return wj1.a(this.f22796a, ((jh5) peVar).f22796a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.c(this.f22796a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(12, this.f22796a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f22796a);
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        return zio.a(this.f22796a.length) + 1 + this.f22796a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
