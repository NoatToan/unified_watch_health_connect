package org.spongycastle.jce.provider;

import defpackage.ai5;
import defpackage.fe;
import defpackage.igh;
import defpackage.rh5;
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
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private rno info;
    private BigInteger y;

    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
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

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        rno rnoVar = this.info;
        return rnoVar != null ? s0e.d(rnoVar) : s0e.c(new s51(igh.M3, new vh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new vd(this.y));
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

    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public JCEDHPublicKey(ai5 ai5Var) {
        throw null;
    }

    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPublicKey(rno rnoVar) {
        this.info = rnoVar;
        try {
            this.y = ((vd) rnoVar.k()).r();
            se seVarQ = se.q(rnoVar.h().i());
            fe feVarG = rnoVar.h().g();
            if (!feVarG.equals(igh.M3) && !isPKCSParam(seVarQ)) {
                if (feVarG.equals(tqr.ka)) {
                    rh5 rh5VarH = rh5.h(seVarQ);
                    this.dhSpec = new DHParameterSpec(rh5VarH.j().r(), rh5VarH.g().r());
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
