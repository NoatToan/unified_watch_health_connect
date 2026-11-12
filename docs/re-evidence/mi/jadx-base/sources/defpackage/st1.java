package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class st1 extends tb {
    public st1(int i, id idVar) {
        super(true, i, o(idVar));
    }

    public static byte[] o(id idVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != idVar.c(); i++) {
            try {
                byteArrayOutputStream.write(((be) idVar.b(i)).f(ASN1Encoding.BER));
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed object: " + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.tb, defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.k(this.f34527a ? 96 : 64, this.f34528b);
        oeVar.c(128);
        oeVar.d(this.c);
        oeVar.c(0);
        oeVar.c(0);
    }
}
