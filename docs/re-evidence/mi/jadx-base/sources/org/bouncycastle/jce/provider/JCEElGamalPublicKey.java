package org.bouncycastle.jce.provider;

import defpackage.b48;
import defpackage.q0e;
import defpackage.r38;
import defpackage.t38;
import defpackage.t51;
import defpackage.wd;
import defpackage.y2h;
import defpackage.z38;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private t38 elSpec;
    private BigInteger y;

    public JCEElGamalPublicKey(z38 z38Var) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new t38((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return q0e.c(new t51(y2h.l, new r38(this.elSpec.b(), this.elSpec.a())), new wd(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey
    public t38 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public JCEElGamalPublicKey(b48 b48Var) {
        throw null;
    }

    public JCEElGamalPublicKey(BigInteger bigInteger, t38 t38Var) {
        this.y = bigInteger;
        this.elSpec = t38Var;
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new t38(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new t38(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEElGamalPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        r38 r38VarH = r38.h(subjectPublicKeyInfo.g().i());
        try {
            this.y = ((wd) subjectPublicKeyInfo.k()).r();
            this.elSpec = new t38(r38VarH.i(), r38VarH.g());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }
}
