package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class ku1 extends ef {
    public ku1(boolean z, int i, gd gdVar) {
        super(z, i, gdVar);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        Enumeration enumerationV;
        oeVar.k(160, this.f16575a);
        oeVar.c(128);
        if (!this.f16576b) {
            if (this.c) {
                oeVar.j(this.d);
            } else {
                gd gdVar = this.d;
                if (gdVar instanceof ge) {
                    enumerationV = gdVar instanceof yt1 ? ((yt1) gdVar).w() : new yt1(((ge) gdVar).r()).w();
                } else if (gdVar instanceof se) {
                    enumerationV = ((se) gdVar).u();
                } else {
                    if (!(gdVar instanceof we)) {
                        throw new RuntimeException("not implemented: " + this.d.getClass().getName());
                    }
                    enumerationV = ((we) gdVar).v();
                }
                while (enumerationV.hasMoreElements()) {
                    oeVar.j((gd) enumerationV.nextElement());
                }
            }
        }
        oeVar.c(0);
        oeVar.c(0);
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iB;
        if (this.f16576b) {
            return zio.b(this.f16575a) + 1;
        }
        int i = this.d.toASN1Primitive().i();
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
