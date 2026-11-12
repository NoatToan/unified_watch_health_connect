package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class nh5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f27924a;

    public nh5(byte[] bArr) {
        this.f27924a = wj1.d(bArr);
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof nh5) {
            return wj1.a(this.f27924a, ((nh5) peVar).f27924a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f27924a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(21, this.f27924a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f27924a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f27924a.length) + 1 + this.f27924a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }
}
