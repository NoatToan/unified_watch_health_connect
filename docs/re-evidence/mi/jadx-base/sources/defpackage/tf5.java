package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class tf5 extends nc {
    public tf5(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // defpackage.nc, defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.f(this.f27763a ? 96 : 64, this.f27764b, this.c);
    }

    public String toString() {
        String strD;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (k()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(o()));
        stringBuffer.append("]");
        if (this.c != null) {
            stringBuffer.append(" #");
            strD = h7c.d(this.c);
        } else {
            strD = " #null";
        }
        stringBuffer.append(strD);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
