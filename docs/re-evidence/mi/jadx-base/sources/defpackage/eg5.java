package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class eg5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16618a;

    public eg5(byte[] bArr) {
        this.f16618a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof eg5) {
            return wj1.a(this.f16618a, ((eg5) peVar).f16618a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return plo.b(this.f16618a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(27, this.f16618a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f16618a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f16618a.length) + 1 + this.f16618a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
