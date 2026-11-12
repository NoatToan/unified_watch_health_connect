package org.bouncycastle.jcajce;

import defpackage.wt3;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF1Key implements PBKDFKey {
    private final wt3 converter;
    private final char[] password;

    public PBKDF1Key(char[] cArr, wt3 wt3Var) {
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        this.converter = wt3Var;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.converter.convert(this.password);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.converter.getType();
    }

    public char[] getPassword() {
        return this.password;
    }
}
