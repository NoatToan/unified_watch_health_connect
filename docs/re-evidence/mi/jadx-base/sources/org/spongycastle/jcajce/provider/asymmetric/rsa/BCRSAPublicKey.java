package org.spongycastle.jcajce.provider.asymmetric.rsa;

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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPublicKey implements RSAPublicKey {
    private static final s51 DEFAULT_ALGORITHM_IDENTIFIER = new s51(igh.w3, lg5.f25030a);
    static final long serialVersionUID = 2675817738516720772L;
    private transient s51 algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public BCRSAPublicKey(g9j g9jVar) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        throw null;
    }

    private void populateFromPublicKeyInfo(rno rnoVar) {
        try {
            n9j n9jVarG = n9j.g(rnoVar.k());
            this.algorithmIdentifier = rnoVar.g();
            this.modulus = n9jVarG.h();
            this.publicExponent = n9jVarG.i();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = s51.h(objectInputStream.readObject());
        } catch (Exception unused) {
            this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.algorithmIdentifier.equals(DEFAULT_ALGORITHM_IDENTIFIER)) {
            return;
        }
        objectOutputStream.writeObject(this.algorithmIdentifier.e());
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
        return s0e.c(this.algorithmIdentifier, new n9j(getModulus(), getPublicExponent()));
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

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public BCRSAPublicKey(rno rnoVar) {
        populateFromPublicKeyInfo(rnoVar);
    }
}
