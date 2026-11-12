package org.spongycastle.jcajce.provider.asymmetric.gost;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.eai;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ge;
import defpackage.ggh;
import defpackage.lwa;
import defpackage.nwa;
import defpackage.pg5;
import defpackage.pwa;
import defpackage.rwa;
import defpackage.s51;
import defpackage.se;
import defpackage.t45;
import defpackage.twa;
import defpackage.vwa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.jce.interfaces.GOST3410PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PrivateKey implements GOST3410PrivateKey, egh {
    static final long serialVersionUID = 8581661527592305464L;
    private transient egh attrCarrier = new ggh();
    private transient nwa gost3410Spec;
    private BigInteger x;

    public BCGOST3410PrivateKey() {
    }

    private boolean compareObj(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new lwa(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new lwa(new vwa((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new ggh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.gost3410Spec.b() != null) {
            objectOutputStream.writeObject(this.gost3410Spec.b());
            objectOutputStream.writeObject(this.gost3410Spec.d());
            objectOutputStream.writeObject(this.gost3410Spec.c());
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.gost3410Spec.a().b());
            objectOutputStream.writeObject(this.gost3410Spec.a().c());
            objectOutputStream.writeObject(this.gost3410Spec.a().a());
            objectOutputStream.writeObject(this.gost3410Spec.d());
            objectOutputStream.writeObject(this.gost3410Spec.c());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PrivateKey)) {
            return false;
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) obj;
        return getX().equals(gOST3410PrivateKey.getX()) && getParameters().a().equals(gOST3410PrivateKey.getParameters().a()) && getParameters().d().equals(gOST3410PrivateKey.getParameters().d()) && compareObj(getParameters().c(), gOST3410PrivateKey.getParameters().c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
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
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.gost3410Spec instanceof lwa ? new eai(new s51(t45.i, new twa(new fe(this.gost3410Spec.b()), new fe(this.gost3410Spec.d()))), new pg5(bArr)) : new eai(new s51(t45.i), new pg5(bArr))).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.spongycastle.jce.interfaces.GOST3410PrivateKey
    public nwa getParameters() {
        return this.gost3410Spec;
    }

    @Override // org.spongycastle.jce.interfaces.GOST3410PrivateKey
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.gost3410Spec.hashCode();
    }

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        this.attrCarrier.setBagAttribute(feVar, gdVar);
    }

    public BCGOST3410PrivateKey(GOST3410PrivateKey gOST3410PrivateKey) {
        this.x = gOST3410PrivateKey.getX();
        this.gost3410Spec = gOST3410PrivateKey.getParameters();
    }

    public BCGOST3410PrivateKey(rwa rwaVar) {
        throw null;
    }

    public BCGOST3410PrivateKey(eai eaiVar) throws IOException {
        twa twaVar = new twa((se) eaiVar.g().i());
        byte[] bArrR = ge.q(eaiVar.j()).r();
        byte[] bArr = new byte[bArrR.length];
        for (int i = 0; i != bArrR.length; i++) {
            bArr[i] = bArrR[(bArrR.length - 1) - i];
        }
        this.x = new BigInteger(1, bArr);
        this.gost3410Spec = lwa.e(twaVar);
    }

    public BCGOST3410PrivateKey(pwa pwaVar, lwa lwaVar) {
        throw null;
    }
}
