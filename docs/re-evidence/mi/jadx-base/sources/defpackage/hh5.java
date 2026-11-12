package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class hh5 extends ef {
    public static final byte[] e = new byte[0];

    public hh5(boolean z, int i, gd gdVar) {
        super(z, i, gdVar);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        if (this.f16576b) {
            oeVar.f(160, this.f16575a, e);
            return;
        }
        pe peVarL = this.d.toASN1Primitive().l();
        if (!this.c) {
            oeVar.k(peVarL.k() ? 160 : 128, this.f16575a);
            oeVar.h(peVarL);
        } else {
            oeVar.k(160, this.f16575a);
            oeVar.i(peVarL.i());
            oeVar.j(peVarL);
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iB;
        if (this.f16576b) {
            return zio.b(this.f16575a) + 1;
        }
        int i = this.d.toASN1Primitive().l().i();
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
        return this.d.toASN1Primitive().l().k();
    }
}
