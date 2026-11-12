package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.miuipub.internal.hybrid.SignUtils;
import defpackage.h9j;
import defpackage.jgh;
import defpackage.mg5;
import defpackage.o9j;
import defpackage.olo;
import defpackage.q0e;
import defpackage.s9j;
import defpackage.t51;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPublicKey implements RSAPublicKey {
    private static final t51 DEFAULT_ALGORITHM_IDENTIFIER = new t51(jgh.o6, mg5.f26130a);
    static final long serialVersionUID = 2675817738516720772L;
    private transient t51 algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public BCRSAPublicKey(h9j h9jVar) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        throw null;
    }

    private void populateFromPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            o9j o9jVarG = o9j.g(subjectPublicKeyInfo.k());
            this.algorithmIdentifier = subjectPublicKeyInfo.g();
            this.modulus = o9jVarG.h();
            this.publicExponent = o9jVarG.i();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = t51.h(objectInputStream.readObject());
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
        return q0e.c(this.algorithmIdentifier, new o9j(getModulus(), getPublicExponent()));
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
        String strD = olo.d();
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(s9j.a(getModulus(), getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    public BCRSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        populateFromPublicKeyInfo(subjectPublicKeyInfo);
    }
}
