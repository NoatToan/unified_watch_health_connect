package org.bouncycastle.jce.provider;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ee;
import defpackage.fgh;
import defpackage.hd;
import defpackage.hgh;
import defpackage.jgh;
import defpackage.sh5;
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
public class JCEDHPrivateKey implements DHPrivateKey, fgh {
    static final long serialVersionUID = 311058815616901812L;
    private fgh attrCarrier = new hgh();
    private DHParameterSpec dhSpec;
    private PrivateKeyInfo info;
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
            return privateKeyInfo != null ? privateKeyInfo.f(ASN1Encoding.DER) : new PrivateKeyInfo(new t51(jgh.G6, new wh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new wd(getX())).f(ASN1Encoding.DER);
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

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        this.attrCarrier.setBagAttribute(eeVar, hdVar);
    }

    public JCEDHPrivateKey(zh5 zh5Var) {
        throw null;
    }

    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        DHParameterSpec dHParameterSpec;
        te teVarQ = te.q(privateKeyInfo.g().i());
        wd wdVarO = wd.o(privateKeyInfo.j());
        ee eeVarG = privateKeyInfo.g().g();
        this.info = privateKeyInfo;
        this.x = wdVarO.r();
        if (eeVarG.equals(jgh.G6)) {
            wh5 wh5VarH = wh5.h(teVarQ);
            dHParameterSpec = wh5VarH.i() != null ? new DHParameterSpec(wh5VarH.j(), wh5VarH.g(), wh5VarH.i().intValue()) : new DHParameterSpec(wh5VarH.j(), wh5VarH.g());
        } else {
            if (!eeVarG.equals(uqr.Db)) {
                throw new IllegalArgumentException("unknown algorithm type: " + eeVarG);
            }
            sh5 sh5VarH = sh5.h(teVarQ);
            dHParameterSpec = new DHParameterSpec(sh5VarH.j().r(), sh5VarH.g().r());
        }
        this.dhSpec = dHParameterSpec;
    }
}
