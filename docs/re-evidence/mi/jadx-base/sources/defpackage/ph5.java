package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ph5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30388a;

    public ph5(byte[] bArr) {
        this.f30388a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof ph5) {
            return wj1.a(this.f30388a, ((ph5) peVar).f30388a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f30388a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(26, this.f30388a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f30388a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f30388a.length) + 1 + this.f30388a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
