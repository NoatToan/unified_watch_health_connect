package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class gu1 extends we {
    public gu1(id idVar) {
        super(idVar, false);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.c(49);
        oeVar.c(128);
        Enumeration enumerationV = v();
        while (enumerationV.hasMoreElements()) {
            oeVar.j((gd) enumerationV.nextElement());
        }
        oeVar.c(0);
        oeVar.c(0);
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        Enumeration enumerationV = v();
        int i = 0;
        while (enumerationV.hasMoreElements()) {
            i += ((gd) enumerationV.nextElement()).toASN1Primitive().i();
        }
        return i + 4;
    }

    public gu1(gd[] gdVarArr) {
        super(gdVarArr, false);
    }

    public gu1() {
    }

    public gu1(gd gdVar) {
        super(gdVar);
    }
}
