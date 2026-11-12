package org.spongycastle.jcajce.provider.asymmetric.dsa;

import defpackage.gd;
import defpackage.lg5;
import defpackage.plo;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s51;
import defpackage.tqr;
import defpackage.ui5;
import defpackage.vd;
import defpackage.zi5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private BigInteger y;

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    private boolean isNotNull(gd gdVar) {
        return (gdVar == null || lg5.f25030a.equals(gdVar.toASN1Primitive())) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        return dSAParams == null ? s0e.c(new s51(tqr.da), new vd(this.y)) : s0e.c(new s51(tqr.da, new ui5(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).toASN1Primitive()), new vd(this.y));
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
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = plo.d();
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    public BCDSAPublicKey(zi5 zi5Var) {
        throw null;
    }

    public BCDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    public BCDSAPublicKey(rno rnoVar) {
        try {
            this.y = ((vd) rnoVar.k()).r();
            if (isNotNull(rnoVar.g().i())) {
                ui5 ui5VarH = ui5.h(rnoVar.g().i());
                this.dsaSpec = new DSAParameterSpec(ui5VarH.i(), ui5VarH.j(), ui5VarH.g());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
