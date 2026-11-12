package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.axa;
import defpackage.ee;
import defpackage.mwa;
import defpackage.olo;
import defpackage.owa;
import defpackage.q0e;
import defpackage.qg5;
import defpackage.t51;
import defpackage.te;
import defpackage.u45;
import defpackage.uwa;
import defpackage.wwa;
import defpackage.ywa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PublicKey implements GOST3410PublicKey {
    static final long serialVersionUID = -6251023343619275990L;
    private transient owa gost3410Spec;
    private BigInteger y;

    public BCGOST3410PublicKey(ywa ywaVar, mwa mwaVar) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new mwa(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new mwa(new wwa((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
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
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        return this.y.equals(bCGOST3410PublicKey.y) && this.gost3410Spec.equals(bCGOST3410PublicKey.gost3410Spec);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            owa owaVar = this.gost3410Spec;
            return q0e.d(owaVar instanceof mwa ? owaVar.c() != null ? new SubjectPublicKeyInfo(new t51(u45.l, new uwa(new ee(this.gost3410Spec.b()), new ee(this.gost3410Spec.d()), new ee(this.gost3410Spec.c()))), new qg5(bArr)) : new SubjectPublicKeyInfo(new t51(u45.l, new uwa(new ee(this.gost3410Spec.b()), new ee(this.gost3410Spec.d()))), new qg5(bArr)) : new SubjectPublicKeyInfo(new t51(u45.l), new qg5(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PublicKey
    public owa getParameters() {
        return this.gost3410Spec;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode() ^ this.gost3410Spec.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        stringBuffer.append("GOST3410 Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCGOST3410PublicKey(axa axaVar) {
        throw null;
    }

    public BCGOST3410PublicKey(BigInteger bigInteger, mwa mwaVar) {
        this.y = bigInteger;
        this.gost3410Spec = mwaVar;
    }

    public BCGOST3410PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        uwa uwaVar = new uwa((te) subjectPublicKeyInfo.h().i());
        try {
            byte[] bArrR = ((qg5) subjectPublicKeyInfo.k()).r();
            byte[] bArr = new byte[bArrR.length];
            for (int i = 0; i != bArrR.length; i++) {
                bArr[i] = bArrR[(bArrR.length - 1) - i];
            }
            this.y = new BigInteger(1, bArr);
            this.gost3410Spec = mwa.e(uwaVar);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    public BCGOST3410PublicKey(GOST3410PublicKey gOST3410PublicKey) {
        this.y = gOST3410PublicKey.getY();
        this.gost3410Spec = gOST3410PublicKey.getParameters();
    }
}
