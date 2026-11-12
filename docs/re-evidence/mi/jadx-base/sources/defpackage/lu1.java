package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public class lu1 extends ff {
    public lu1(boolean z, int i, hd hdVar) {
        super(z, i, hdVar);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        Enumeration enumerationV;
        keVar.k(160, this.f17720a);
        keVar.c(128);
        if (!this.f17721b) {
            if (this.c) {
                keVar.j(this.d);
            } else {
                hd hdVar = this.d;
                if (hdVar instanceof he) {
                    enumerationV = hdVar instanceof zt1 ? ((zt1) hdVar).w() : new zt1(((he) hdVar).r()).w();
                } else if (hdVar instanceof te) {
                    enumerationV = ((te) hdVar).u();
                } else {
                    if (!(hdVar instanceof xe)) {
                        throw new ASN1Exception("not implemented: " + this.d.getClass().getName());
                    }
                    enumerationV = ((xe) hdVar).v();
                }
                while (enumerationV.hasMoreElements()) {
                    keVar.j((hd) enumerationV.nextElement());
                }
            }
        }
        keVar.c(0);
        keVar.c(0);
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int iB;
        if (this.f17721b) {
            return yio.b(this.f17720a) + 1;
        }
        int i = this.d.toASN1Primitive().i();
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
        return this.d.toASN1Primitive().l().k();
    }
}
