package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class xf5 extends yc {
    public xf5(hd hdVar) throws IOException {
        super(hdVar.toASN1Primitive().f(ASN1Encoding.DER), 0);
    }

    public static xf5 v(Object obj) {
        if (obj == null || (obj instanceof xf5)) {
            return (xf5) obj;
        }
        if (obj instanceof hi5) {
            hi5 hi5Var = (hi5) obj;
            return new xf5(hi5Var.f40027a, hi5Var.f40028b);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (xf5) re.j((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        byte[] bArrO = yc.o(this.f40027a, this.f40028b);
        int length = bArrO.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) u();
        System.arraycopy(bArrO, 0, bArr, 1, length);
        keVar.g(3, bArr);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f40027a.length + 1) + 1 + this.f40027a.length + 1;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public xf5(byte[] bArr) {
        this(bArr, 0);
    }

    public xf5(byte[] bArr, int i) {
        super(bArr, i);
    }
}
