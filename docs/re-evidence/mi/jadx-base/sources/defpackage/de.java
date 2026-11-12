package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class de implements hd {
    public byte[] e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ke(byteArrayOutputStream).j(this);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hd) {
            return toASN1Primitive().equals(((hd) obj).toASN1Primitive());
        }
        return false;
    }

    public byte[] f(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (str.equals(ASN1Encoding.DER)) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new ug5(byteArrayOutputStream).j(this);
        } else {
            if (!str.equals(ASN1Encoding.DL)) {
                return e();
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            new ji5(byteArrayOutputStream).j(this);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    @Override // defpackage.hd
    public abstract re toASN1Primitive();
}
