package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.eai;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.q38;
import defpackage.s38;
import defpackage.s51;
import defpackage.u38;
import defpackage.vd;
import defpackage.w38;
import defpackage.x2h;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, egh {
    static final long serialVersionUID = 4819350091141529678L;
    private transient ggh attrCarrier = new ggh();
    private transient s38 elSpec;
    private BigInteger x;

    public BCElGamalPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elSpec = new s38((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new ggh();
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
            return new eai(new s51(x2h.l, new q38(this.elSpec.b(), this.elSpec.a())), new vd(getX())).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPrivateKey
    public s38 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
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

    public BCElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new s38(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(w38 w38Var) {
        throw null;
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new s38(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(eai eaiVar) throws IOException {
        q38 q38VarH = q38.h(eaiVar.i().i());
        this.x = vd.o(eaiVar.j()).r();
        this.elSpec = new s38(q38VarH.i(), q38VarH.g());
    }

    public BCElGamalPrivateKey(u38 u38Var) {
        throw null;
    }
}
