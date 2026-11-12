package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class bh5 extends we {
    public int c;

    public bh5(id idVar) {
        super(idVar, true);
        this.c = -1;
    }

    private int A() throws IOException {
        if (this.c < 0) {
            Enumeration enumerationV = v();
            int i = 0;
            while (enumerationV.hasMoreElements()) {
                i += ((gd) enumerationV.nextElement()).toASN1Primitive().l().i();
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oe oeVarA = oeVar.a();
        int iA = A();
        oeVar.c(49);
        oeVar.i(iA);
        Enumeration enumerationV = v();
        while (enumerationV.hasMoreElements()) {
            oeVarA.j((gd) enumerationV.nextElement());
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iA = A();
        return zio.a(iA) + 1 + iA;
    }

    public bh5() {
        this.c = -1;
    }

    public bh5(id idVar, boolean z) {
        super(idVar, z);
        this.c = -1;
    }
}
