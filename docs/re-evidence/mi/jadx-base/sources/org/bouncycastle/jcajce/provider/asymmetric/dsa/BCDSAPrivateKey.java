package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.bj5;
import defpackage.ee;
import defpackage.fgh;
import defpackage.hd;
import defpackage.hgh;
import defpackage.olo;
import defpackage.q0e;
import defpackage.t51;
import defpackage.uqr;
import defpackage.vi5;
import defpackage.wd;
import defpackage.yi5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, fgh {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient hgh attrCarrier = new hgh();
    private transient DSAParams dsaSpec;
    private BigInteger x;

    public BCDSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
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
        return q0e.a(new t51(uqr.wb, new vi5(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).toASN1Primitive()), new wd(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        this.attrCarrier.setBagAttribute(eeVar, hdVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        BigInteger bigIntegerModPow = getParams().getG().modPow(this.x, getParams().getP());
        stringBuffer.append("DSA Private Key [");
        stringBuffer.append(bj5.a(bigIntegerModPow, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(bigIntegerModPow.toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCDSAPrivateKey(yi5 yi5Var) {
        throw null;
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        vi5 vi5VarH = vi5.h(privateKeyInfo.i().i());
        this.x = ((wd) privateKeyInfo.j()).r();
        this.dsaSpec = new DSAParameterSpec(vi5VarH.i(), vi5VarH.j(), vi5VarH.g());
    }
}
