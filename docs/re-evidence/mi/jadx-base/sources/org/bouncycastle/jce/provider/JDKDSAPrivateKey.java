package org.bouncycastle.jce.provider;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ee;
import defpackage.fgh;
import defpackage.hd;
import defpackage.hgh;
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
public class JDKDSAPrivateKey implements DSAPrivateKey, fgh {
    private static final long serialVersionUID = -4677259546958385734L;
    private hgh attrCarrier = new hgh();
    DSAParams dsaSpec;
    BigInteger x;

    public JDKDSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.x = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        hgh hghVar = new hgh();
        this.attrCarrier = hghVar;
        hghVar.a(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.x);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
        this.attrCarrier.b(objectOutputStream);
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
        try {
            return new PrivateKeyInfo(new t51(uqr.wb, new vi5(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new wd(getX())).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
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

    public JDKDSAPrivateKey(yi5 yi5Var) {
        throw null;
    }

    public JDKDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public JDKDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public JDKDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        vi5 vi5VarH = vi5.h(privateKeyInfo.i().i());
        this.x = wd.o(privateKeyInfo.j()).r();
        this.dsaSpec = new DSAParameterSpec(vi5VarH.i(), vi5VarH.j(), vi5VarH.g());
    }
}
