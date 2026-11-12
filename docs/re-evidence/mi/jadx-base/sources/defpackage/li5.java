package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class li5 extends te {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25094b;

    public li5() {
        this.f25094b = -1;
    }

    private int w() throws IOException {
        if (this.f25094b < 0) {
            Enumeration enumerationU = u();
            int i = 0;
            while (enumerationU.hasMoreElements()) {
                i += ((hd) enumerationU.nextElement()).toASN1Primitive().m().i();
            }
            this.f25094b = i;
        }
        return this.f25094b;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        ke keVarB = keVar.b();
        int iW = w();
        keVar.c(48);
        keVar.i(iW);
        Enumeration enumerationU = u();
        while (enumerationU.hasMoreElements()) {
            keVarB.j((hd) enumerationU.nextElement());
        }
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int iW = w();
        return yio.a(iW) + 1 + iW;
    }

    public li5(hd hdVar) {
        super(hdVar);
        this.f25094b = -1;
    }

    public li5(jd jdVar) {
        super(jdVar);
        this.f25094b = -1;
    }
}
