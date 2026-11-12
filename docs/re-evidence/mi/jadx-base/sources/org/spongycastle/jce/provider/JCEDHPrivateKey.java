package org.spongycastle.jce.provider;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.eai;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.igh;
import defpackage.rh5;
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
public class JCEDHPrivateKey implements DHPrivateKey, egh {
    static final long serialVersionUID = 311058815616901812L;
    private egh attrCarrier = new ggh();
    private DHParameterSpec dhSpec;
    private eai info;
    BigInteger x;

    public JCEDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
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
            return eaiVar != null ? eaiVar.f(ASN1Encoding.DER) : new eai(new s51(igh.M3, new vh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new vd(getX())).f(ASN1Encoding.DER);
        } catch (IOException unused) {
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

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        this.attrCarrier.setBagAttribute(feVar, gdVar);
    }

    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEDHPrivateKey(eai eaiVar) throws IOException {
        se seVarQ = se.q(eaiVar.g().i());
        vd vdVarO = vd.o(eaiVar.j());
        fe feVarG = eaiVar.g().g();
        this.info = eaiVar;
        this.x = vdVarO.r();
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
            rh5 rh5VarH = rh5.h(seVarQ);
            this.dhSpec = new DHParameterSpec(rh5VarH.j().r(), rh5VarH.g().r());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + feVarG);
        }
    }

    public JCEDHPrivateKey(yh5 yh5Var) {
        throw null;
    }
}
