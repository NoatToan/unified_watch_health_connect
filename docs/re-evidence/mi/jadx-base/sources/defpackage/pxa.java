package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class pxa extends de implements ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hd f30874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30875b;

    public pxa(int i, hd hdVar) {
        this.f30874a = hdVar;
        this.f30875b = i;
    }

    public static pxa g(Object obj) {
        if (obj == null || (obj instanceof pxa)) {
            return (pxa) obj;
        }
        if (obj instanceof ff) {
            ff ffVar = (ff) obj;
            int iR = ffVar.r();
            switch (iR) {
                case 0:
                    return new pxa(iR, te.o(ffVar, false));
                case 1:
                    return new pxa(iR, kg5.o(ffVar, false));
                case 2:
                    return new pxa(iR, kg5.o(ffVar, false));
                case 3:
                    throw new IllegalArgumentException("unknown tag: " + iR);
                case 4:
                    return new pxa(iR, mpr.g(ffVar, true));
                case 5:
                    return new pxa(iR, te.o(ffVar, false));
                case 6:
                    return new pxa(iR, kg5.o(ffVar, false));
                case 7:
                    return new pxa(iR, he.o(ffVar, false));
                case 8:
                    return new pxa(iR, ee.v(ffVar, false));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return g(re.j((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public hd h() {
        return this.f30874a;
    }

    public int i() {
        return this.f30875b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this.f30875b == 4 ? new ih5(true, this.f30875b, this.f30874a) : new ih5(false, this.f30875b, this.f30874a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    public String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f30875b);
        stringBuffer.append(": ");
        int i = this.f30875b;
        if (i == 1 || i == 2) {
            string = kg5.q(this.f30874a).getString();
        } else if (i == 4) {
            string = mpr.i(this.f30874a).toString();
        } else if (i != 6) {
            string = this.f30874a.toString();
        } else {
            string = kg5.q(this.f30874a).getString();
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }
}
