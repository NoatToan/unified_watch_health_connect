package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class hu1 extends xe {
    public hu1() {
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.c(49);
        keVar.c(128);
        Enumeration enumerationV = v();
        while (enumerationV.hasMoreElements()) {
            keVar.j((hd) enumerationV.nextElement());
        }
        keVar.c(0);
        keVar.c(0);
    }

    @Override // defpackage.re
    public int i() throws IOException {
        Enumeration enumerationV = v();
        int i = 0;
        while (enumerationV.hasMoreElements()) {
            i += ((hd) enumerationV.nextElement()).toASN1Primitive().i();
        }
        return i + 4;
    }

    public hu1(hd hdVar) {
        super(hdVar);
    }

    public hu1(jd jdVar) {
        super(jdVar, false);
    }

    public hu1(hd[] hdVarArr) {
        super(hdVarArr, false);
    }
}
