package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.Arrays;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.Strings;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class DERPrintableString extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    public DERPrintableString(byte[] bArr) {
        this.string = bArr;
    }

    public static DERPrintableString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERPrintableString)) {
            return (DERPrintableString) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (DERPrintableString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static boolean isPrintableString(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt = str.charAt(length);
            if (cCharAt > 127) {
                return false;
            }
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && (('0' > cCharAt || cCharAt > '9') && cCharAt != ' ' && cCharAt != ':' && cCharAt != '=' && cCharAt != '?'))) {
                switch (cCharAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (cCharAt) {
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                return false;
                        }
                        break;
                }
            }
        }
        return true;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERPrintableString) {
            return Arrays.areEqual(this.string, ((DERPrintableString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(19, this.string);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERPrintableString(String str) {
        this(str, false);
    }

    public DERPrintableString(String str, boolean z) {
        if (z && !isPrintableString(str)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.string = Strings.toByteArray(str);
    }

    public static DERPrintableString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERPrintableString)) {
            return new DERPrintableString(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}
