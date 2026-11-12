package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Set, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.write(49);
        aSN1OutputStream.write(128);
        Enumeration objects = getObjects();
        while (objects.hasMoreElements()) {
            aSN1OutputStream.writeObject((ASN1Encodable) objects.nextElement());
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        Enumeration objects = getObjects();
        int iEncodedLength = 0;
        while (objects.hasMoreElements()) {
            iEncodedLength += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().encodedLength();
        }
        return iEncodedLength + 4;
    }

    public BERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
    }
}
