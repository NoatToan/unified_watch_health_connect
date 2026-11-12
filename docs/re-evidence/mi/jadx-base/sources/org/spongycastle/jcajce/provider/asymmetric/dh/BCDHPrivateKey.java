package org.spongycastle.jcajce.provider.asymmetric.dh;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.eai;
import defpackage.egh;
import defpackage.f17;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.igh;
import defpackage.s51;
import defpackage.se;
import defpackage.tqr;
import defpackage.vd;
import defpackage.vh5;
import defpackage.yh5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPrivateKey implements DHPrivateKey, egh {
    static final long serialVersionUID = 311058815616901812L;
    private transient ggh attrCarrier = new ggh();
    private transient DHParameterSpec dhSpec;
    private transient eai info;
    private BigInteger x;

    public BCDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new ggh();
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
        try {
            eai eaiVar = this.info;
            return eaiVar != null ? eaiVar.f(ASN1Encoding.DER) : new eai(new s51(igh.M3, new vh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new vd(getX())).f(ASN1Encoding.DER);
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

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        this.attrCarrier.setBagAttribute(feVar, gdVar);
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(eai eaiVar) throws IOException {
        se seVarQ = se.q(eaiVar.i().i());
        vd vdVar = (vd) eaiVar.j();
        fe feVarG = eaiVar.i().g();
        this.info = eaiVar;
        this.x = vdVar.r();
        if (feVarG.equals(igh.M3)) {
            vh5 vh5VarH = vh5.h(seVarQ);
            if (vh5VarH.i() != null) {
                this.dhSpec = new DHParameterSpec(vh5VarH.j(), vh5VarH.g(), vh5VarH.i().intValue());
                return;
            } else {
                this.dhSpec = new DHParameterSpec(vh5VarH.j(), vh5VarH.g());
                return;
            }
        }
        if (feVarG.equals(tqr.ka)) {
            f17 f17VarH = f17.h(seVarQ);
            this.dhSpec = new DHParameterSpec(f17VarH.j(), f17VarH.g());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + feVarG);
        }
    }

    public BCDHPrivateKey(yh5 yh5Var) {
        throw null;
    }
}
