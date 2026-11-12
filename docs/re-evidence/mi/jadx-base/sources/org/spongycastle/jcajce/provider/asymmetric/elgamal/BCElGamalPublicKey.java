package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.a48;
import defpackage.q38;
import defpackage.rno;
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
public class BCElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient s38 elSpec;
    private BigInteger y;

    public BCElGamalPublicKey(a48 a48Var) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elSpec = new s38((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new rno(new s51(x2h.l, new q38(this.elSpec.b(), this.elSpec.a())), new vd(this.y)).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
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

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new s38(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public BCElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new s38(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(y38 y38Var) {
        throw null;
    }

    public BCElGamalPublicKey(BigInteger bigInteger, s38 s38Var) {
        this.y = bigInteger;
        this.elSpec = s38Var;
    }

    public BCElGamalPublicKey(rno rnoVar) {
        q38 q38VarH = q38.h(rnoVar.g().i());
        try {
            this.y = ((vd) rnoVar.k()).r();
            this.elSpec = new s38(q38VarH.i(), q38VarH.g());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
