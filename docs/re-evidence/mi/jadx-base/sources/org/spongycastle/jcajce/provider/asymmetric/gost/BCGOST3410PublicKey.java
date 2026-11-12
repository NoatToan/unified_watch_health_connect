package org.spongycastle.jcajce.provider.asymmetric.gost;

import defpackage.fe;
import defpackage.lwa;
import defpackage.nwa;
import defpackage.pg5;
import defpackage.plo;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s51;
import defpackage.se;
import defpackage.t45;
import defpackage.twa;
import defpackage.vwa;
import defpackage.xwa;
import defpackage.zwa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import org.spongycastle.jce.interfaces.GOST3410PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PublicKey implements GOST3410PublicKey {
    static final long serialVersionUID = -6251023343619275990L;
    private transient nwa gost3410Spec;
    private BigInteger y;

    public BCGOST3410PublicKey(zwa zwaVar) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new lwa(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new lwa(new vwa((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
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
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            nwa nwaVar = this.gost3410Spec;
            return s0e.d(nwaVar instanceof lwa ? nwaVar.c() != null ? new rno(new s51(t45.i, new twa(new fe(this.gost3410Spec.b()), new fe(this.gost3410Spec.d()), new fe(this.gost3410Spec.c()))), new pg5(bArr)) : new rno(new s51(t45.i, new twa(new fe(this.gost3410Spec.b()), new fe(this.gost3410Spec.d()))), new pg5(bArr)) : new rno(new s51(t45.i), new pg5(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.spongycastle.jce.interfaces.GOST3410PublicKey
    public nwa getParameters() {
        return this.gost3410Spec;
    }

    @Override // org.spongycastle.jce.interfaces.GOST3410PublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode() ^ this.gost3410Spec.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = plo.d();
        stringBuffer.append("GOST3410 Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCGOST3410PublicKey(GOST3410PublicKey gOST3410PublicKey) {
        this.y = gOST3410PublicKey.getY();
        this.gost3410Spec = gOST3410PublicKey.getParameters();
    }

    public BCGOST3410PublicKey(xwa xwaVar, lwa lwaVar) {
        throw null;
    }

    public BCGOST3410PublicKey(BigInteger bigInteger, lwa lwaVar) {
        this.y = bigInteger;
        this.gost3410Spec = lwaVar;
    }

    public BCGOST3410PublicKey(rno rnoVar) {
        twa twaVar = new twa((se) rnoVar.h().i());
        try {
            byte[] bArrR = ((pg5) rnoVar.k()).r();
            byte[] bArr = new byte[bArrR.length];
            for (int i = 0; i != bArrR.length; i++) {
                bArr[i] = bArrR[(bArrR.length - 1) - i];
            }
            this.y = new BigInteger(1, bArr);
            this.gost3410Spec = lwa.e(twaVar);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }
}
