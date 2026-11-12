package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class fh5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17782a;

    public fh5(byte[] bArr) {
        this.f17782a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof fh5) {
            return wj1.a(this.f17782a, ((fh5) peVar).f17782a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f17782a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(20, this.f17782a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f17782a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f17782a.length) + 1 + this.f17782a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
