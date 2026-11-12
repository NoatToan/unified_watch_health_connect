package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.IOException;
import java.security.Principal;

/* JADX INFO: loaded from: classes3.dex */
public class ypr extends upr implements Principal {
    @Override // defpackage.de
    public byte[] e() {
        try {
            return f(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }
}
