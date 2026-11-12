package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class mi5 extends we {
    public int c;

    public mi5(id idVar) {
        super(idVar, false);
        this.c = -1;
    }

    private int A() throws IOException {
        if (this.c < 0) {
            Enumeration enumerationV = v();
            int i = 0;
            while (enumerationV.hasMoreElements()) {
                i += ((gd) enumerationV.nextElement()).toASN1Primitive().m().i();
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oe oeVarB = oeVar.b();
        int iA = A();
        oeVar.c(49);
        oeVar.i(iA);
        Enumeration enumerationV = v();
        while (enumerationV.hasMoreElements()) {
            oeVarB.j((gd) enumerationV.nextElement());
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iA = A();
        return zio.a(iA) + 1 + iA;
    }

    public mi5(gd[] gdVarArr) {
        super(gdVarArr, false);
        this.c = -1;
    }

    public mi5() {
        this.c = -1;
    }

    public mi5(gd gdVar) {
        super(gdVar);
        this.c = -1;
    }
}
