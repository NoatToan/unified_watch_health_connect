package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class ch5 extends xe {
    public int c;

    public ch5() {
        this.c = -1;
    }

    private int A() throws IOException {
        if (this.c < 0) {
            Enumeration enumerationV = v();
            int i = 0;
            while (enumerationV.hasMoreElements()) {
                i += ((hd) enumerationV.nextElement()).toASN1Primitive().l().i();
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        ke keVarA = keVar.a();
        int iA = A();
        keVar.c(49);
        keVar.i(iA);
        Enumeration enumerationV = v();
        while (enumerationV.hasMoreElements()) {
            keVarA.j((hd) enumerationV.nextElement());
        }
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int iA = A();
        return yio.a(iA) + 1 + iA;
    }

    public ch5(jd jdVar) {
        super(jdVar, true);
        this.c = -1;
    }

    public ch5(jd jdVar, boolean z) {
        super(jdVar, z);
        this.c = -1;
    }
}
