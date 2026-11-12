package org.bouncycastle.jce.provider;

import defpackage.bi5;
import defpackage.ee;
import defpackage.jgh;
import defpackage.q0e;
import defpackage.sh5;
import defpackage.t51;
import defpackage.te;
import defpackage.uqr;
import defpackage.wd;
import defpackage.wh5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private SubjectPublicKeyInfo info;
    private BigInteger y;

    public JCEDHPublicKey(bi5 bi5Var) {
        this.y = bi5Var.c();
        this.dhSpec = new DHParameterSpec(bi5Var.b().d(), bi5Var.b().b(), bi5Var.b().c());
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
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.info;
        return subjectPublicKeyInfo != null ? q0e.d(subjectPublicKeyInfo) : q0e.c(new t51(jgh.G6, new wh5(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new wd(this.y));
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

    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEDHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        DHParameterSpec dHParameterSpec;
        this.info = subjectPublicKeyInfo;
        try {
            this.y = ((wd) subjectPublicKeyInfo.k()).r();
            te teVarQ = te.q(subjectPublicKeyInfo.h().i());
            ee eeVarG = subjectPublicKeyInfo.h().g();
            if (eeVarG.equals(jgh.G6) || isPKCSParam(teVarQ)) {
                wh5 wh5VarH = wh5.h(teVarQ);
                dHParameterSpec = wh5VarH.i() != null ? new DHParameterSpec(wh5VarH.j(), wh5VarH.g(), wh5VarH.i().intValue()) : new DHParameterSpec(wh5VarH.j(), wh5VarH.g());
            } else {
                if (!eeVarG.equals(uqr.Db)) {
                    throw new IllegalArgumentException("unknown algorithm type: " + eeVarG);
                }
                sh5 sh5VarH = sh5.h(teVarQ);
                dHParameterSpec = new DHParameterSpec(sh5VarH.j().r(), sh5VarH.g().r());
            }
            this.dhSpec = dHParameterSpec;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }
}
