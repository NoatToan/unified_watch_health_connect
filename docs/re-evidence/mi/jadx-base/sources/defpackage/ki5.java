package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class ki5 extends se {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23870b;

    public ki5() {
        this.f23870b = -1;
    }

    private int w() throws IOException {
        if (this.f23870b < 0) {
            Enumeration enumerationU = u();
            int i = 0;
            while (enumerationU.hasMoreElements()) {
                i += ((gd) enumerationU.nextElement()).toASN1Primitive().m().i();
            }
            this.f23870b = i;
        }
        return this.f23870b;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oe oeVarB = oeVar.b();
        int iW = w();
        oeVar.c(48);
        oeVar.i(iW);
        Enumeration enumerationU = u();
        while (enumerationU.hasMoreElements()) {
            oeVarB.j((gd) enumerationU.nextElement());
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iW = w();
        return zio.a(iW) + 1 + iW;
    }

    public ki5(gd gdVar) {
        super(gdVar);
        this.f23870b = -1;
    }

    public ki5(id idVar) {
        super(idVar);
        this.f23870b = -1;
    }
}
