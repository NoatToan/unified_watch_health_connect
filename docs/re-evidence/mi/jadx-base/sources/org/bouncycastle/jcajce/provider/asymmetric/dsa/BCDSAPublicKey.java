package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.aj5;
import defpackage.bj5;
import defpackage.hd;
import defpackage.mg5;
import defpackage.olo;
import defpackage.q0e;
import defpackage.t51;
import defpackage.uqr;
import defpackage.vi5;
import defpackage.wd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient aj5 lwKeyParams;
    private BigInteger y;

    public BCDSAPublicKey(aj5 aj5Var) {
        this.y = aj5Var.c();
        this.dsaSpec = new DSAParameterSpec(aj5Var.b().b(), aj5Var.b().c(), aj5Var.b().a());
        this.lwKeyParams = aj5Var;
    }

    private boolean isNotNull(hd hdVar) {
        return (hdVar == null || mg5.f26130a.equals(hdVar.toASN1Primitive())) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new aj5(this.y, bj5.b(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger g;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            g = ZERO;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.dsaSpec.getQ());
            g = this.dsaSpec.getG();
        }
        objectOutputStream.writeObject(g);
    }

    public aj5 engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        if (this.dsaSpec != null) {
            return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        return dSAParams == null ? q0e.c(new t51(uqr.wb), new wd(this.y)) : q0e.c(new t51(uqr.wb, new vi5(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).toASN1Primitive()), new wd(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.dsaSpec != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(bj5.a(this.y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new aj5(this.y, bj5.b(this.dsaSpec));
    }

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new aj5(this.y, bj5.b(this.dsaSpec));
    }

    public BCDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            this.y = ((wd) subjectPublicKeyInfo.k()).r();
            if (isNotNull(subjectPublicKeyInfo.g().i())) {
                vi5 vi5VarH = vi5.h(subjectPublicKeyInfo.g().i());
                this.dsaSpec = new DSAParameterSpec(vi5VarH.i(), vi5VarH.j(), vi5VarH.g());
            } else {
                this.dsaSpec = null;
            }
            this.lwKeyParams = new aj5(this.y, bj5.b(this.dsaSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
