package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.miuipub.internal.hybrid.SignUtils;
import defpackage.ee;
import defpackage.fgh;
import defpackage.h9j;
import defpackage.hd;
import defpackage.hgh;
import defpackage.jgh;
import defpackage.m9j;
import defpackage.mg5;
import defpackage.q0e;
import defpackage.t51;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, fgh {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    private transient hgh attrCarrier = new hgh();
    protected BigInteger modulus;
    protected BigInteger privateExponent;

    public BCRSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return SignUtils.KEY_RSA;
    }

    @Override // defpackage.fgh
    public hd getBagAttribute(ee eeVar) {
        return this.attrCarrier.getBagAttribute(eeVar);
    }

    @Override // defpackage.fgh
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        t51 t51Var = new t51(jgh.o6, mg5.f26130a);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return q0e.a(t51Var, new m9j(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        this.attrCarrier.setBagAttribute(eeVar, hdVar);
    }

    public BCRSAPrivateKey(h9j h9jVar) {
        throw null;
    }

    public BCRSAPrivateKey(m9j m9jVar) {
        this.modulus = m9jVar.k();
        this.privateExponent = m9jVar.o();
    }

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
    }
}
