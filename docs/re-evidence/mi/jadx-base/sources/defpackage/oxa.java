package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class oxa extends be implements dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gd f29783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29784b;

    public oxa(int i, gd gdVar) {
        this.f29783a = gdVar;
        this.f29784b = i;
    }

    public static oxa g(Object obj) {
        if (obj == null || (obj instanceof oxa)) {
            return (oxa) obj;
        }
        if (obj instanceof ef) {
            ef efVar = (ef) obj;
            int iQ = efVar.q();
            switch (iQ) {
                case 0:
                    return new oxa(iQ, se.o(efVar, false));
                case 1:
                    return new oxa(iQ, jg5.o(efVar, false));
                case 2:
                    return new oxa(iQ, jg5.o(efVar, false));
                case 3:
                    throw new IllegalArgumentException("unknown tag: " + iQ);
                case 4:
                    return new oxa(iQ, lpr.g(efVar, true));
                case 5:
                    return new oxa(iQ, se.o(efVar, false));
                case 6:
                    return new oxa(iQ, jg5.o(efVar, false));
                case 7:
                    return new oxa(iQ, ge.o(efVar, false));
                case 8:
                    return new oxa(iQ, fe.v(efVar, false));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return g(pe.j((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public gd h() {
        return this.f29783a;
    }

    public int i() {
        return this.f29784b;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this.f29784b == 4 ? new hh5(true, this.f29784b, this.f29783a) : new hh5(false, this.f29784b, this.f29783a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f29784b);
        stringBuffer.append(": ");
        int i = this.f29784b;
        if (i == 1 || i == 2) {
            stringBuffer.append(jg5.q(this.f29783a).getString());
        } else if (i == 4) {
            stringBuffer.append(lpr.i(this.f29783a).toString());
        } else if (i != 6) {
            stringBuffer.append(this.f29783a.toString());
        } else {
            stringBuffer.append(jg5.q(this.f29783a).getString());
        }
        return stringBuffer.toString();
    }
}
