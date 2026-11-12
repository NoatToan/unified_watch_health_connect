package org.spongycastle.jce.provider;

import com.miuipub.internal.hybrid.SignUtils;
import defpackage.g9j;
import defpackage.igh;
import defpackage.lg5;
import defpackage.n9j;
import defpackage.plo;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s51;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class JCERSAPublicKey implements RSAPublicKey {
    static final long serialVersionUID = 2675817738516720772L;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public JCERSAPublicKey(g9j g9jVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return SignUtils.KEY_RSA;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return s0e.c(new s51(igh.w3, lg5.f25030a), new n9j(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = plo.d();
        stringBuffer.append("RSA Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public JCERSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    public JCERSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public JCERSAPublicKey(rno rnoVar) {
        try {
            n9j n9jVarG = n9j.g(rnoVar.k());
            this.modulus = n9jVarG.h();
            this.publicExponent = n9jVarG.i();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }
}
