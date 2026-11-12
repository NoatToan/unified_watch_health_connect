package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class hg5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20038a;

    public hg5(byte[] bArr) {
        this.f20038a = wj1.d(bArr);
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof hg5) {
            return wj1.a(this.f20038a, ((hg5) peVar).f20038a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f20038a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(25, this.f20038a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f20038a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f20038a.length) + 1 + this.f20038a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }
}
