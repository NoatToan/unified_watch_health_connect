package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
class LazyEncodedSequence extends ASN1Sequence {
    private byte[] encoded;

    public LazyEncodedSequence(byte[] bArr) throws IOException {
        this.encoded = bArr;
    }

    private void parse() {
        LazyConstructionEnumeration lazyConstructionEnumeration = new LazyConstructionEnumeration(this.encoded);
        while (lazyConstructionEnumeration.hasMoreElements()) {
            this.seq.addElement(lazyConstructionEnumeration.nextElement());
        }
        this.encoded = null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Sequence, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            aSN1OutputStream.writeEncoded(48, bArr);
        } else {
            super.toDLObject().encode(aSN1OutputStream);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        byte[] bArr = this.encoded;
        return bArr != null ? StreamUtil.calculateBodyLength(bArr.length) + 1 + this.encoded.length : super.toDLObject().encodedLength();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Sequence
    public synchronized ASN1Encodable getObjectAt(int i) {
        try {
            if (this.encoded != null) {
                parse();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.getObjectAt(i);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Sequence
    public synchronized Enumeration getObjects() {
        byte[] bArr = this.encoded;
        if (bArr == null) {
            return super.getObjects();
        }
        return new LazyConstructionEnumeration(bArr);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Sequence
    public synchronized int size() {
        try {
            if (this.encoded != null) {
                parse();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.size();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Sequence, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        if (this.encoded != null) {
            parse();
        }
        return super.toDERObject();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Sequence, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        if (this.encoded != null) {
            parse();
        }
        return super.toDLObject();
    }
}
