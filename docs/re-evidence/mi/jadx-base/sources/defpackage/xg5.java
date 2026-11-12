package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class xg5 extends se {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39091b;

    public xg5() {
        this.f39091b = -1;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oe oeVarA = oeVar.a();
        int iW = w();
        oeVar.c(48);
        oeVar.i(iW);
        Enumeration enumerationU = u();
        while (enumerationU.hasMoreElements()) {
            oeVarA.j((gd) enumerationU.nextElement());
        }
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int iW = w();
        return zio.a(iW) + 1 + iW;
    }

    public final int w() throws IOException {
        if (this.f39091b < 0) {
            Enumeration enumerationU = u();
            int i = 0;
            while (enumerationU.hasMoreElements()) {
                i += ((gd) enumerationU.nextElement()).toASN1Primitive().l().i();
            }
            this.f39091b = i;
        }
        return this.f39091b;
    }

    public xg5(id idVar) {
        super(idVar);
        this.f39091b = -1;
    }

    public xg5(gd[] gdVarArr) {
        super(gdVarArr);
        this.f39091b = -1;
    }
}
