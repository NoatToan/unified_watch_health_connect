package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class yg5 extends te {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40149b;

    public yg5() {
        this.f40149b = -1;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        ke keVarA = keVar.a();
        int iW = w();
        keVar.c(48);
        keVar.i(iW);
        Enumeration enumerationU = u();
        while (enumerationU.hasMoreElements()) {
            keVarA.j((hd) enumerationU.nextElement());
        }
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int iW = w();
        return yio.a(iW) + 1 + iW;
    }

    public final int w() throws IOException {
        if (this.f40149b < 0) {
            Enumeration enumerationU = u();
            int i = 0;
            while (enumerationU.hasMoreElements()) {
                i += ((hd) enumerationU.nextElement()).toASN1Primitive().l().i();
            }
            this.f40149b = i;
        }
        return this.f40149b;
    }

    public yg5(jd jdVar) {
        super(jdVar);
        this.f40149b = -1;
    }

    public yg5(hd[] hdVarArr) {
        super(hdVarArr);
        this.f40149b = -1;
    }
}
