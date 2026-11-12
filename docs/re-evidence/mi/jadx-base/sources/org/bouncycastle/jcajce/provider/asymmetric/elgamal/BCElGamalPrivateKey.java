package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ee;
import defpackage.fgh;
import defpackage.hd;
import defpackage.hgh;
import defpackage.r38;
import defpackage.t38;
import defpackage.t51;
import defpackage.v38;
import defpackage.wd;
import defpackage.x38;
import defpackage.y2h;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, fgh {
    static final long serialVersionUID = 4819350091141529678L;
    private transient hgh attrCarrier = new hgh();
    private transient t38 elSpec;
    private BigInteger x;

    public BCElGamalPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elSpec = new t38((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
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
        try {
            return new PrivateKeyInfo(new t51(y2h.l, new r38(this.elSpec.b(), this.elSpec.a())), new wd(getX())).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey
    public t38 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        this.attrCarrier.setBagAttribute(eeVar, hdVar);
    }

    public BCElGamalPrivateKey(v38 v38Var) {
        throw null;
    }

    public BCElGamalPrivateKey(x38 x38Var) {
        throw null;
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new t38(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new t38(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        r38 r38VarH = r38.h(privateKeyInfo.i().i());
        this.x = wd.o(privateKeyInfo.j()).r();
        this.elSpec = new t38(r38VarH.i(), r38VarH.g());
    }

    public BCElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }
}
