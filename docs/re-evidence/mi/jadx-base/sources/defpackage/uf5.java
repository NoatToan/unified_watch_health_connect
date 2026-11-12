package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class uf5 extends pe implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f35708a;

    public uf5(char[] cArr) {
        this.f35708a = cArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof uf5) {
            return wj1.b(this.f35708a, ((uf5) peVar).f35708a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        return new String(this.f35708a);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.c(30);
        oeVar.i(this.f35708a.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.f35708a;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            oeVar.c((byte) (c >> '\b'));
            oeVar.c((byte) c);
            i++;
        }
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.l(this.f35708a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f35708a.length * 2) + 1 + (this.f35708a.length * 2);
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
