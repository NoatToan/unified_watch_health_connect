package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.akh;
import defpackage.c0e;
import defpackage.ee;
import defpackage.lw3;
import defpackage.sfh;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCPBEKey implements PBEKey {
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    ee oid;
    lw3 param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong = false;
    int type;

    public BCPBEKey(String str, ee eeVar, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, lw3 lw3Var) {
        this.algorithm = str;
        this.oid = eeVar;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.pbeKeySpec = pBEKeySpec;
        this.param = lw3Var;
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
        lw3 lw3VarB = this.param;
        if (lw3VarB != null) {
            if (lw3VarB instanceof akh) {
                lw3VarB = ((akh) lw3VarB).b();
            }
            return ((c0e) lw3VarB).a();
        }
        int i = this.type;
        if (i == 2) {
            return sfh.a(this.pbeKeySpec.getPassword());
        }
        return i == 5 ? sfh.c(this.pbeKeySpec.getPassword()) : sfh.b(this.pbeKeySpec.getPassword());
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

    public ee getOID() {
        return this.oid;
    }

    public lw3 getParam() {
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

    public BCPBEKey(String str, KeySpec keySpec, lw3 lw3Var) {
        this.algorithm = str;
        this.param = lw3Var;
    }
}
