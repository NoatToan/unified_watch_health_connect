package org.bouncycastle.pqc.crypto.xmss;

import defpackage.fsr;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class XMSSNode implements Serializable {
    private static final long serialVersionUID = 1;
    private final int height;
    private final byte[] value;

    public XMSSNode(int i, byte[] bArr) {
        this.height = i;
        this.value = bArr;
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getValue() {
        return fsr.c(this.value);
    }

    public XMSSNode clone() {
        return new XMSSNode(getHeight(), getValue());
    }
}
