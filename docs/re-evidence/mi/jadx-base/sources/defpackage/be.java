package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class be implements gd {
    public byte[] e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new oe(byteArrayOutputStream).j(this);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gd) {
            return toASN1Primitive().equals(((gd) obj).toASN1Primitive());
        }
        return false;
    }

    public byte[] f(String str) throws IOException {
        if (str.equals(ASN1Encoding.DER)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new tg5(byteArrayOutputStream).j(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals(ASN1Encoding.DL)) {
            return e();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new ii5(byteArrayOutputStream2).j(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    @Override // defpackage.gd
    public abstract pe toASN1Primitive();
}
