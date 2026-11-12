package org.spongycastle.jcajce.provider.asymmetric.dh;

import defpackage.ai5;
import defpackage.f17;
import defpackage.fe;
import defpackage.igh;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s51;
import defpackage.se;
import defpackage.tqr;
import defpackage.vd;
import defpackage.vh5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient DHParameterSpec dhSpec;
    private transient rno info;
    private BigInteger y;

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    private boolean isPKCSParam(se seVar) {
        if (seVar.size() == 2) {
            return true;
        }
        if (seVar.size() > 3) {
            return false;
        }
        return vd.o(seVar.t(2)).r().compareTo(BigInteger.valueOf((long) vd.o(seVar.t(0)).r().bitLength())) <= 0;
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
        rno rnoVar = this.info;
        return rnoVar != null ? s0e.d(rnoVar) : s0e.c(new s51(igh.M3, new vh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new vd(this.y));
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

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public BCDHPublicKey(ai5 ai5Var) {
        throw null;
    }

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public BCDHPublicKey(rno rnoVar) {
        this.info = rnoVar;
        try {
            this.y = ((vd) rnoVar.k()).r();
            se seVarQ = se.q(rnoVar.g().i());
            fe feVarG = rnoVar.g().g();
            if (!feVarG.equals(igh.M3) && !isPKCSParam(seVarQ)) {
                if (feVarG.equals(tqr.ka)) {
                    f17 f17VarH = f17.h(seVarQ);
                    this.dhSpec = new DHParameterSpec(f17VarH.j(), f17VarH.g());
                    return;
                } else {
                    throw new IllegalArgumentException("unknown algorithm type: " + feVarG);
                }
            }
            vh5 vh5VarH = vh5.h(seVarQ);
            if (vh5VarH.i() != null) {
                this.dhSpec = new DHParameterSpec(vh5VarH.j(), vh5VarH.g(), vh5VarH.i().intValue());
            } else {
                this.dhSpec = new DHParameterSpec(vh5VarH.j(), vh5VarH.g());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }
}
