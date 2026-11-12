package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.bi5;
import defpackage.ci5;
import defpackage.dnq;
import defpackage.ee;
import defpackage.g17;
import defpackage.jgh;
import defpackage.q0e;
import defpackage.t51;
import defpackage.te;
import defpackage.uqr;
import defpackage.wd;
import defpackage.wh5;
import defpackage.xh5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient bi5 dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient SubjectPublicKeyInfo info;
    private BigInteger y;

    public BCDHPublicKey(bi5 bi5Var) {
        this.y = bi5Var.c();
        this.dhSpec = new DHParameterSpec(bi5Var.b().d(), bi5Var.b().b(), bi5Var.b().c());
        this.dhPublicKey = bi5Var;
    }

    private boolean isPKCSParam(te teVar) {
        if (teVar.size() == 2) {
            return true;
        }
        if (teVar.size() > 3) {
            return false;
        }
        return wd.o(teVar.t(2)).r().compareTo(BigInteger.valueOf((long) wd.o(teVar.t(0)).r().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public bi5 engineGetKeyParameters() {
        return this.dhPublicKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.info;
        return subjectPublicKeyInfo != null ? q0e.d(subjectPublicKeyInfo) : q0e.c(new t51(jgh.G6, new wh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new wd(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
        this.dhPublicKey = new bi5(bigInteger, new xh5(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
        this.dhPublicKey = new bi5(this.y, new xh5(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.dhPublicKey = new bi5(this.y, new xh5(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }

    public BCDHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.info = subjectPublicKeyInfo;
        try {
            this.y = ((wd) subjectPublicKeyInfo.k()).r();
            te teVarQ = te.q(subjectPublicKeyInfo.g().i());
            ee eeVarG = subjectPublicKeyInfo.g().g();
            if (eeVarG.equals(jgh.G6) || isPKCSParam(teVarQ)) {
                wh5 wh5VarH = wh5.h(teVarQ);
                this.dhSpec = wh5VarH.i() != null ? new DHParameterSpec(wh5VarH.j(), wh5VarH.g(), wh5VarH.i().intValue()) : new DHParameterSpec(wh5VarH.j(), wh5VarH.g());
                this.dhPublicKey = new bi5(this.y, new xh5(this.dhSpec.getP(), this.dhSpec.getG()));
            } else {
                if (!eeVarG.equals(uqr.Db)) {
                    throw new IllegalArgumentException("unknown algorithm type: " + eeVarG);
                }
                g17 g17VarH = g17.h(teVarQ);
                this.dhSpec = new DHParameterSpec(g17VarH.k(), g17VarH.g());
                dnq dnqVarM = g17VarH.m();
                if (dnqVarM != null) {
                    this.dhPublicKey = new bi5(this.y, new xh5(g17VarH.k(), g17VarH.g(), g17VarH.l(), g17VarH.i(), new ci5(dnqVarM.i(), dnqVarM.h().intValue())));
                } else {
                    this.dhPublicKey = new bi5(this.y, new xh5(g17VarH.k(), g17VarH.g(), g17VarH.l(), g17VarH.i(), null));
                }
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }
}
