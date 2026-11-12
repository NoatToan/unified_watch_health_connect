package org.spongycastle.jcajce;

import defpackage.vt3;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF1Key implements PBKDFKey {
    private final vt3 converter;
    private final char[] password;

    public PBKDF1Key(char[] cArr, vt3 vt3Var) {
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        throw null;
    }

    public char[] getPassword() {
        return this.password;
    }
}
