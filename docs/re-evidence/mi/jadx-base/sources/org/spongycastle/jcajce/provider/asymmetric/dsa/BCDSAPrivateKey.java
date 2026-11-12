package org.spongycastle.jcajce.provider.asymmetric.dsa;

import defpackage.eai;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.s0e;
import defpackage.s51;
import defpackage.tqr;
import defpackage.ui5;
import defpackage.vd;
import defpackage.xi5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, egh {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient ggh attrCarrier = new ggh();
    private transient DSAParams dsaSpec;
    private BigInteger x;

    public BCDSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new ggh();
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

    @Override // defpackage.egh
    public gd getBagAttribute(fe feVar) {
        return this.attrCarrier.getBagAttribute(feVar);
    }

    @Override // defpackage.egh
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return s0e.a(new s51(tqr.da, new ui5(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).toASN1Primitive()), new vd(getX()));
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

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        this.attrCarrier.setBagAttribute(feVar, gdVar);
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(eai eaiVar) throws IOException {
        ui5 ui5VarH = ui5.h(eaiVar.i().i());
        this.x = ((vd) eaiVar.j()).r();
        this.dsaSpec = new DSAParameterSpec(ui5VarH.i(), ui5VarH.j(), ui5VarH.g());
    }

    public BCDSAPrivateKey(xi5 xi5Var) {
        throw null;
    }
}
