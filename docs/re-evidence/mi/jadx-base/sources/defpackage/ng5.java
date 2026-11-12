package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ng5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f27901a;

    public ng5(byte[] bArr) {
        this.f27901a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof ng5) {
            return wj1.a(this.f27901a, ((ng5) peVar).f27901a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f27901a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(18, this.f27901a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f27901a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f27901a.length) + 1 + this.f27901a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
