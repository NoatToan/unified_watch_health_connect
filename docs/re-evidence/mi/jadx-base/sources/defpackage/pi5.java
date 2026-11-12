package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class pi5 extends ff {
    public static final byte[] e = new byte[0];

    public pi5(boolean z, int i, hd hdVar) {
        super(z, i, hdVar);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        if (this.f17721b) {
            keVar.f(160, this.f17720a, e);
            return;
        }
        re reVarM = this.d.toASN1Primitive().m();
        if (!this.c) {
            keVar.k(reVarM.k() ? 160 : 128, this.f17720a);
            keVar.h(reVarM);
        } else {
            keVar.k(160, this.f17720a);
            keVar.i(reVarM.i());
            keVar.j(reVarM);
        }
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int iB;
        if (this.f17721b) {
            return yio.b(this.f17720a) + 1;
        }
        int i = this.d.toASN1Primitive().m().i();
        if (this.c) {
            iB = yio.b(this.f17720a) + yio.a(i);
        } else {
            i--;
            iB = yio.b(this.f17720a);
        }
        return iB + i;
    }

    @Override // defpackage.re
    public boolean k() {
        if (this.f17721b || this.c) {
            return true;
        }
        return this.d.toASN1Primitive().m().k();
    }
}
