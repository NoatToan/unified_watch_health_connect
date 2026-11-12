package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class tt1 extends nc {
    public tt1(int i, jd jdVar) {
        super(true, i, q(jdVar));
    }

    public static byte[] q(jd jdVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != jdVar.c(); i++) {
            try {
                byteArrayOutputStream.write(((de) jdVar.b(i)).f(ASN1Encoding.BER));
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed object: " + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.nc, defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.k(this.f27763a ? 96 : 64, this.f27764b);
        keVar.c(128);
        keVar.d(this.c);
        keVar.c(0);
        keVar.c(0);
    }
}
