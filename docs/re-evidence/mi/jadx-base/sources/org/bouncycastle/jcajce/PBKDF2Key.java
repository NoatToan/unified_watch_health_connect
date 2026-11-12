package org.bouncycastle.jcajce;

import defpackage.vj1;
import defpackage.wt3;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF2Key implements PBKDFKey {
    private final wt3 converter;
    private final char[] password;

    public PBKDF2Key(char[] cArr, wt3 wt3Var) {
        this.password = vj1.f(cArr);
        this.converter = wt3Var;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
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
