package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class vg5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36863a;

    public vg5(byte[] bArr) {
        this.f36863a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof vg5) {
            return wj1.a(this.f36863a, ((vg5) peVar).f36863a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f36863a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(19, this.f36863a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f36863a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f36863a.length) + 1 + this.f36863a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
