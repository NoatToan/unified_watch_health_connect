package org.bouncycastle.jcajce;

import defpackage.vj1;
import defpackage.wt3;
import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF2KeyWithParameters extends PBKDF2Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PBKDF2KeyWithParameters(char[] cArr, wt3 wt3Var, byte[] bArr, int i) {
        super(cArr, wt3Var);
        this.salt = vj1.e(bArr);
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
}
