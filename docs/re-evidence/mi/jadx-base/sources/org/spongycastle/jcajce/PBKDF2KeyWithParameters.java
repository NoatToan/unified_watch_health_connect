package org.spongycastle.jcajce;

import defpackage.vt3;
import defpackage.wj1;
import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF2KeyWithParameters extends PBKDF2Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PBKDF2KeyWithParameters(char[] cArr, vt3 vt3Var, byte[] bArr, int i) {
        super(cArr, vt3Var);
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
}
