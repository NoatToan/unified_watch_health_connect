package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public class DLSet extends ASN1Set {
    private int bodyLength;

    public DLSet() {
        this.bodyLength = -1;
    }

    private int getBodyLength() throws IOException {
        if (this.bodyLength < 0) {
            Enumeration objects = getObjects();
            int iEncodedLength = 0;
            while (objects.hasMoreElements()) {
                iEncodedLength += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().toDLObject().encodedLength();
            }
            this.bodyLength = iEncodedLength;
        }
        return this.bodyLength;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Set, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        ASN1OutputStream dLSubStream = aSN1OutputStream.getDLSubStream();
        int bodyLength = getBodyLength();
        aSN1OutputStream.write(49);
        aSN1OutputStream.writeLength(bodyLength);
        Enumeration objects = getObjects();
        while (objects.hasMoreElements()) {
            dLSubStream.writeObject((ASN1Encodable) objects.nextElement());
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        int bodyLength = getBodyLength();
        return StreamUtil.calculateBodyLength(bodyLength) + 1 + bodyLength;
    }

    public DLSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.bodyLength = -1;
    }

    public DLSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.bodyLength = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
        this.bodyLength = -1;
    }
}
