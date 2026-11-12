package org.spongycastle.jce.provider;

import defpackage.a48;
import defpackage.q38;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s38;
import defpackage.s51;
import defpackage.vd;
import defpackage.x2h;
import defpackage.y38;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private s38 elSpec;
    private BigInteger y;

    public JCEElGamalPublicKey(a48 a48Var) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new s38((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
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
        return s0e.c(new s51(x2h.l, new q38(this.elSpec.b(), this.elSpec.a())), new vd(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPublicKey
    public s38 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new s38(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new s38(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(y38 y38Var) {
        throw null;
    }

    public JCEElGamalPublicKey(BigInteger bigInteger, s38 s38Var) {
        this.y = bigInteger;
        this.elSpec = s38Var;
    }

    public JCEElGamalPublicKey(rno rnoVar) {
        q38 q38VarH = q38.h(rnoVar.g().i());
        try {
            this.y = ((vd) rnoVar.k()).r();
            this.elSpec = new s38(q38VarH.i(), q38VarH.g());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
