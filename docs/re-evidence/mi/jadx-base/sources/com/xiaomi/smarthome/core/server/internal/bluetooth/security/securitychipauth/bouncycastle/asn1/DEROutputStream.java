package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class DEROutputStream extends ASN1OutputStream {
    public DEROutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1OutputStream
    public ASN1OutputStream getDERSubStream() {
        return this;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1OutputStream
    public ASN1OutputStream getDLSubStream() {
        return this;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1OutputStream
    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        aSN1Encodable.toASN1Primitive().toDERObject().encode(this);
    }
}
