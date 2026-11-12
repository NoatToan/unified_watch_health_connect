package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class oi5 extends ef {
    public static final byte[] e = new byte[0];

    public oi5(boolean z, int i, gd gdVar) {
        super(z, i, gdVar);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        if (this.f16576b) {
            oeVar.f(160, this.f16575a, e);
            return;
        }
        pe peVarM = this.d.toASN1Primitive().m();
        if (!this.c) {
            oeVar.k(peVarM.k() ? 160 : 128, this.f16575a);
            oeVar.h(peVarM);
        } else {
            oeVar.k(160, this.f16575a);
            oeVar.i(peVarM.i());
            oeVar.j(peVarM);
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iB;
        if (this.f16576b) {
            return zio.b(this.f16575a) + 1;
        }
        int i = this.d.toASN1Primitive().m().i();
        if (this.c) {
            iB = zio.b(this.f16575a) + zio.a(i);
        } else {
            i--;
            iB = zio.b(this.f16575a);
        }
        return iB + i;
    }

    @Override // defpackage.pe
    public boolean k() {
        if (this.f16576b || this.c) {
            return true;
        }
        return this.d.toASN1Primitive().m().k();
    }
}
