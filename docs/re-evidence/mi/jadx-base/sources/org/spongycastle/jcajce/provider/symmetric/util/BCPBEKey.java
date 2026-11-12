package org.spongycastle.jcajce.provider.symmetric.util;

import defpackage.bkh;
import defpackage.d0e;
import defpackage.fe;
import defpackage.mw3;
import defpackage.rfh;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCPBEKey implements PBEKey {
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    fe oid;
    mw3 param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong = false;
    int type;

    public BCPBEKey(String str, fe feVar, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, mw3 mw3Var) {
        this.algorithm = str;
        this.oid = feVar;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.pbeKeySpec = pBEKeySpec;
        this.param = mw3Var;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    public int getDigest() {
        return this.digest;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        mw3 mw3Var = this.param;
        if (mw3Var != null) {
            return (mw3Var instanceof bkh ? (d0e) ((bkh) mw3Var).a() : (d0e) mw3Var).a();
        }
        int i = this.type;
        if (i == 2) {
            return rfh.a(this.pbeKeySpec.getPassword());
        }
        return i == 5 ? rfh.c(this.pbeKeySpec.getPassword()) : rfh.b(this.pbeKeySpec.getPassword());
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    public int getIvSize() {
        return this.ivSize;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public fe getOID() {
        return this.oid;
    }

    public mw3 getParam() {
        return this.param;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }

    public int getType() {
        return this.type;
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}
