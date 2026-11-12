package org.bouncycastle.jcajce.provider.asymmetric.dh;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ee;
import defpackage.fgh;
import defpackage.g17;
import defpackage.hd;
import defpackage.hgh;
import defpackage.jgh;
import defpackage.t51;
import defpackage.te;
import defpackage.uqr;
import defpackage.wd;
import defpackage.wh5;
import defpackage.zh5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPrivateKey implements DHPrivateKey, fgh {
    static final long serialVersionUID = 311058815616901812L;
    private transient hgh attrCarrier = new hgh();
    private transient DHParameterSpec dhSpec;
    private transient PrivateKeyInfo info;
    private BigInteger x;

    public BCDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
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
        return "DH";
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
            PrivateKeyInfo privateKeyInfo = this.info;
            return privateKeyInfo != null ? privateKeyInfo.f(ASN1Encoding.DER) : new PrivateKeyInfo(new t51(jgh.G6, new wh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new wd(getX())).f(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
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

    public BCDHPrivateKey(zh5 zh5Var) {
        throw null;
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        DHParameterSpec dHParameterSpec;
        te teVarQ = te.q(privateKeyInfo.i().i());
        wd wdVar = (wd) privateKeyInfo.j();
        ee eeVarG = privateKeyInfo.i().g();
        this.info = privateKeyInfo;
        this.x = wdVar.r();
        if (eeVarG.equals(jgh.G6)) {
            wh5 wh5VarH = wh5.h(teVarQ);
            dHParameterSpec = wh5VarH.i() != null ? new DHParameterSpec(wh5VarH.j(), wh5VarH.g(), wh5VarH.i().intValue()) : new DHParameterSpec(wh5VarH.j(), wh5VarH.g());
        } else {
            if (!eeVarG.equals(uqr.Db)) {
                throw new IllegalArgumentException("unknown algorithm type: " + eeVarG);
            }
            g17 g17VarH = g17.h(teVarQ);
            dHParameterSpec = new DHParameterSpec(g17VarH.k(), g17VarH.g());
        }
        this.dhSpec = dHParameterSpec;
    }
}
