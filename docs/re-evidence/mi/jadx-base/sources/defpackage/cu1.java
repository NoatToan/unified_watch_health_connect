package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class cu1 extends se {
    public cu1() {
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.c(48);
        oeVar.c(128);
        Enumeration enumerationU = u();
        while (enumerationU.hasMoreElements()) {
            oeVar.j((gd) enumerationU.nextElement());
        }
        oeVar.c(0);
        oeVar.c(0);
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        Enumeration enumerationU = u();
        int i = 0;
        while (enumerationU.hasMoreElements()) {
            i += ((gd) enumerationU.nextElement()).toASN1Primitive().i();
        }
        return i + 4;
    }

    public cu1(gd gdVar) {
        super(gdVar);
    }

    public cu1(id idVar) {
        super(idVar);
    }
}
