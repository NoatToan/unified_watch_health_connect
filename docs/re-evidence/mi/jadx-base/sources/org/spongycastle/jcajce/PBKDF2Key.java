package org.spongycastle.jcajce;

import defpackage.vt3;
import defpackage.wj1;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF2Key implements PBKDFKey {
    private final vt3 converter;
    private final char[] password;

    public PBKDF2Key(char[] cArr, vt3 vt3Var) {
        this.password = wj1.e(cArr);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
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
