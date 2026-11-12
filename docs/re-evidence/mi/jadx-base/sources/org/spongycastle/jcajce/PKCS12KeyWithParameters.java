package org.spongycastle.jcajce;

import defpackage.wj1;
import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i) {
        super(cArr);
        this.salt = wj1.d(bArr);
        this.iterationCount = i;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }

    public PKCS12KeyWithParameters(char[] cArr, boolean z, byte[] bArr, int i) {
        super(cArr, z);
        this.salt = wj1.d(bArr);
        this.iterationCount = i;
    }
}
