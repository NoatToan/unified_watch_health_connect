package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1Boolean extends ASN1Primitive {
    private final byte[] value;
    private static final byte[] TRUE_VALUE = {-1};
    private static final byte[] FALSE_VALUE = {0};
    public static final ASN1Boolean FALSE = new ASN1Boolean(false);
    public static final ASN1Boolean TRUE = new ASN1Boolean(true);

    public ASN1Boolean(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        if (b2 == 0) {
            this.value = FALSE_VALUE;
        } else if ((b2 & 255) == 255) {
            this.value = TRUE_VALUE;
        } else {
            this.value = Arrays.clone(bArr);
        }
    }

    public static ASN1Boolean fromOctetString(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        if (b2 == 0) {
            return FALSE;
        }
        return (b2 & 255) == 255 ? TRUE : new ASN1Boolean(bArr);
    }

    public static ASN1Boolean getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1Boolean) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e.getMessage());
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof ASN1Boolean) && this.value[0] == ((ASN1Boolean) aSN1Primitive).value[0];
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(1, this.value);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return 3;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.value[0];
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public boolean isTrue() {
        return this.value[0] != 0;
    }

    public String toString() {
        return this.value[0] != 0 ? "TRUE" : "FALSE";
    }

    public ASN1Boolean(boolean z) {
        this.value = z ? TRUE_VALUE : FALSE_VALUE;
    }

    public static ASN1Boolean getInstance(boolean z) {
        return z ? TRUE : FALSE;
    }

    public static ASN1Boolean getInstance(int i) {
        return i != 0 ? TRUE : FALSE;
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1Boolean)) {
            return fromOctetString(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
