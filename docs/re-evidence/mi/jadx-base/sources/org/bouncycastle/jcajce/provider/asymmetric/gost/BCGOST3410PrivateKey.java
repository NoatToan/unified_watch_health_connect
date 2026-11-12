package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ee;
import defpackage.fgh;
import defpackage.hd;
import defpackage.he;
import defpackage.hgh;
import defpackage.mwa;
import defpackage.owa;
import defpackage.qg5;
import defpackage.qwa;
import defpackage.swa;
import defpackage.t51;
import defpackage.u45;
import defpackage.uwa;
import defpackage.wd;
import defpackage.wwa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PrivateKey implements GOST3410PrivateKey, fgh {
    static final long serialVersionUID = 8581661527592305464L;
    private transient fgh attrCarrier = new hgh();
    private transient owa gost3410Spec;
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
            this.gost3410Spec = new mwa(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new mwa(new wwa((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object objA;
        objectOutputStream.defaultWriteObject();
        if (this.gost3410Spec.b() != null) {
            objA = this.gost3410Spec.b();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.gost3410Spec.a().b());
            objectOutputStream.writeObject(this.gost3410Spec.a().c());
            objA = this.gost3410Spec.a().a();
        }
        objectOutputStream.writeObject(objA);
        objectOutputStream.writeObject(this.gost3410Spec.d());
        objectOutputStream.writeObject(this.gost3410Spec.c());
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
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.gost3410Spec instanceof mwa ? new PrivateKeyInfo(new t51(u45.l, new uwa(new ee(this.gost3410Spec.b()), new ee(this.gost3410Spec.d()))), new qg5(bArr)) : new PrivateKeyInfo(new t51(u45.l), new qg5(bArr))).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public owa getParameters() {
        return this.gost3410Spec;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.gost3410Spec.hashCode();
    }

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        this.attrCarrier.setBagAttribute(eeVar, hdVar);
    }

    public BCGOST3410PrivateKey(qwa qwaVar, mwa mwaVar) {
        throw null;
    }

    public BCGOST3410PrivateKey(swa swaVar) {
        throw null;
    }

    public BCGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        BigInteger bigInteger;
        uwa uwaVarI = uwa.i(privateKeyInfo.i().i());
        hd hdVarJ = privateKeyInfo.j();
        if (hdVarJ instanceof wd) {
            bigInteger = wd.o(hdVarJ).q();
        } else {
            byte[] bArrR = he.q(privateKeyInfo.j()).r();
            byte[] bArr = new byte[bArrR.length];
            for (int i = 0; i != bArrR.length; i++) {
                bArr[i] = bArrR[(bArrR.length - 1) - i];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        this.x = bigInteger;
        this.gost3410Spec = mwa.e(uwaVarI);
    }

    public BCGOST3410PrivateKey(GOST3410PrivateKey gOST3410PrivateKey) {
        this.x = gOST3410PrivateKey.getX();
        this.gost3410Spec = gOST3410PrivateKey.getParameters();
    }
}
