package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    private static final byte[] ZERO_BYTES = new byte[0];

    public DERTaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1TaggedObject, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        if (this.empty) {
            aSN1OutputStream.writeEncoded(160, this.tagNo, ZERO_BYTES);
            return;
        }
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        if (!this.explicit) {
            aSN1OutputStream.writeTag(dERObject.isConstructed() ? 160 : 128, this.tagNo);
            aSN1OutputStream.writeImplicitObject(dERObject);
        } else {
            aSN1OutputStream.writeTag(160, this.tagNo);
            aSN1OutputStream.writeLength(dERObject.encodedLength());
            aSN1OutputStream.writeObject(dERObject);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        int iCalculateTagLength;
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        int iEncodedLength = this.obj.toASN1Primitive().toDERObject().encodedLength();
        if (this.explicit) {
            iCalculateTagLength = StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(iEncodedLength);
        } else {
            iEncodedLength--;
            iCalculateTagLength = StreamUtil.calculateTagLength(this.tagNo);
        }
        return iCalculateTagLength + iEncodedLength;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        if (this.empty || this.explicit) {
            return true;
        }
        return this.obj.toASN1Primitive().toDERObject().isConstructed();
    }

    public DERTaggedObject(int i, ASN1Encodable aSN1Encodable) {
        super(true, i, aSN1Encodable);
    }
}
