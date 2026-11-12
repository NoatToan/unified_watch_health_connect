package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class ni5 extends xe {
    public int c;

    public ni5() {
        this.c = -1;
    }

    private int A() throws IOException {
        if (this.c < 0) {
            Enumeration enumerationV = v();
            int i = 0;
            while (enumerationV.hasMoreElements()) {
                i += ((hd) enumerationV.nextElement()).toASN1Primitive().m().i();
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        ke keVarB = keVar.b();
        int iA = A();
        keVar.c(49);
        keVar.i(iA);
        Enumeration enumerationV = v();
        while (enumerationV.hasMoreElements()) {
            keVarB.j((hd) enumerationV.nextElement());
        }
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int iA = A();
        return yio.a(iA) + 1 + iA;
    }

    public ni5(hd hdVar) {
        super(hdVar);
        this.c = -1;
    }

    public ni5(jd jdVar) {
        super(jdVar, false);
        this.c = -1;
    }

    public ni5(hd[] hdVarArr) {
        super(hdVarArr, false);
        this.c = -1;
    }
}
