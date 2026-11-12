package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1EncodableVector {
    private final Vector v = new Vector();

    public void add(ASN1Encodable aSN1Encodable) {
        this.v.addElement(aSN1Encodable);
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        Enumeration enumerationElements = aSN1EncodableVector.v.elements();
        while (enumerationElements.hasMoreElements()) {
            this.v.addElement(enumerationElements.nextElement());
        }
    }

    public ASN1Encodable get(int i) {
        return (ASN1Encodable) this.v.elementAt(i);
    }

    public int size() {
        return this.v.size();
    }
}
