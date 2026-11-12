package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class du1 extends te {
    public du1() {
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.c(48);
        keVar.c(128);
        Enumeration enumerationU = u();
        while (enumerationU.hasMoreElements()) {
            keVar.j((hd) enumerationU.nextElement());
        }
        keVar.c(0);
        keVar.c(0);
    }

    @Override // defpackage.re
    public int i() throws IOException {
        Enumeration enumerationU = u();
        int i = 0;
        while (enumerationU.hasMoreElements()) {
            i += ((hd) enumerationU.nextElement()).toASN1Primitive().i();
        }
        return i + 4;
    }

    public du1(hd hdVar) {
        super(hdVar);
    }

    public du1(jd jdVar) {
        super(jdVar);
    }
}
