package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class wf5 extends xc {
    public wf5(byte[] bArr) {
        this(bArr, 0);
    }

    public static wf5 v(Object obj) {
        if (obj == null || (obj instanceof wf5)) {
            return (wf5) obj;
        }
        if (obj instanceof gi5) {
            gi5 gi5Var = (gi5) obj;
            return new wf5(gi5Var.f38958a, gi5Var.f38959b);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        byte[] bArrO = xc.o(this.f38958a, this.f38959b);
        int length = bArrO.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) u();
        System.arraycopy(bArrO, 0, bArr, 1, length);
        oeVar.g(3, bArr);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f38958a.length + 1) + 1 + this.f38958a.length + 1;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public wf5(byte[] bArr, int i) {
        super(bArr, i);
    }

    public wf5(gd gdVar) throws IOException {
        super(gdVar.toASN1Primitive().f(ASN1Encoding.DER), 0);
    }
}
