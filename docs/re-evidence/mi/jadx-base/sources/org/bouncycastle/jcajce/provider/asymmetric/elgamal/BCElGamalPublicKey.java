package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.b48;
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
public class BCElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient t38 elSpec;
    private BigInteger y;

    public BCElGamalPublicKey(z38 z38Var) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elSpec = new t38((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
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
            return new SubjectPublicKeyInfo(new t51(y2h.l, new r38(this.elSpec.b(), this.elSpec.a())), new wd(this.y)).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
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

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public BCElGamalPublicKey(b48 b48Var) {
        throw null;
    }

    public BCElGamalPublicKey(BigInteger bigInteger, t38 t38Var) {
        this.y = bigInteger;
        this.elSpec = t38Var;
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new t38(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new t38(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public BCElGamalPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        r38 r38VarH = r38.h(subjectPublicKeyInfo.g().i());
        try {
            this.y = ((wd) subjectPublicKeyInfo.k()).r();
            this.elSpec = new t38(r38VarH.i(), r38VarH.g());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public BCElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }
}
