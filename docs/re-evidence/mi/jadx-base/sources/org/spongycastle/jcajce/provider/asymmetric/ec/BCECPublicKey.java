package org.spongycastle.jcajce.provider.asymmetric.ec;

import defpackage.b87;
import defpackage.c87;
import defpackage.dqr;
import defpackage.e97;
import defpackage.eei;
import defpackage.fe;
import defpackage.ge;
import defpackage.hqr;
import defpackage.i97;
import defpackage.lg5;
import defpackage.lqr;
import defpackage.pe;
import defpackage.pg5;
import defpackage.plo;
import defpackage.rno;
import defpackage.rqr;
import defpackage.s0e;
import defpackage.s51;
import defpackage.s77;
import defpackage.t97;
import defpackage.tqr;
import defpackage.v97;
import defpackage.x97;
import defpackage.z87;
import defpackage.zd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPublicKey implements ECPublicKey, org.spongycastle.jce.interfaces.ECPublicKey {
    static final long serialVersionUID = 2422789860422731812L;
    private String algorithm;
    private transient eei configuration;
    private transient ECParameterSpec ecSpec;
    private transient i97 q;
    private boolean withCompression;

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.q = bCECPublicKey.q;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, c87 c87Var) {
        return new ECParameterSpec(ellipticCurve, new ECPoint(c87Var.b().f().s(), c87Var.b().g().s()), c87Var.d(), c87Var.c().intValue());
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private void populateFromPubKeyInfo(rno rnoVar) {
        byte b2;
        dqr dqrVar = new dqr((pe) rnoVar.g().i());
        b87 b87VarH = s77.h(this.configuration, dqrVar);
        this.ecSpec = s77.g(dqrVar, b87VarH);
        byte[] bArrR = rnoVar.j().r();
        ge pg5Var = new pg5(bArrR);
        if (bArrR[0] == 4 && bArrR[1] == bArrR.length - 2 && (((b2 = bArrR[2]) == 2 || b2 == 3) && new rqr().a(b87VarH) >= bArrR.length - 3)) {
            try {
                pg5Var = (ge) pe.j(bArrR);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.q = new lqr(b87VarH, pg5Var).g();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(rno.i(pe.j((byte[]) objectInputStream.readObject())));
        this.configuration = BouncyCastleProvider.CONFIGURATION;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public i97 engineGetQ() {
        return this.q;
    }

    public e97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? s77.f(eCParameterSpec, this.withCompression) : this.configuration.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return engineGetQ().e(bCECPublicKey.engineGetQ()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        dqr dqrVar;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof z87) {
            fe feVarD = x97.d(((z87) eCParameterSpec).a());
            if (feVarD == null) {
                feVarD = new fe(((z87) this.ecSpec).a());
            }
            dqrVar = new dqr(feVarD);
        } else if (eCParameterSpec == null) {
            dqrVar = new dqr((zd) lg5.f25030a);
        } else {
            b87 b87VarA = s77.a(eCParameterSpec.getCurve());
            dqrVar = new dqr(new hqr(b87VarA, s77.d(b87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        b87 b87VarI = engineGetQ().i();
        return s0e.d(new rno(new s51(tqr.r9, dqrVar), (this.ecSpec == null ? (ge) new lqr(b87VarI.e(getQ().p().s(), getQ().q().s(), this.withCompression)).toASN1Primitive() : (ge) new lqr(b87VarI.e(getQ().f().s(), getQ().g().s(), this.withCompression)).toASN1Primitive()).r()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.spongycastle.jce.interfaces.ECPublicKey
    public e97 getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return s77.f(eCParameterSpec, this.withCompression);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // org.spongycastle.jce.interfaces.ECPublicKey
    public i97 getQ() {
        return this.ecSpec == null ? this.q.k() : this.q;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return new ECPoint(this.q.f().s(), this.q.g().s());
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = plo.d();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.q.f().s().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.q.g().s().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, eei eeiVar) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKeySpec.getW(), false);
        this.configuration = eeiVar;
    }

    public BCECPublicKey(String str, v97 v97Var, eei eeiVar) {
        this.algorithm = str;
        throw null;
    }

    public BCECPublicKey(String str, t97 t97Var, ECParameterSpec eCParameterSpec, eei eeiVar) {
        this.algorithm = "EC";
        throw null;
    }

    public BCECPublicKey(String str, t97 t97Var, e97 e97Var, eei eeiVar) {
        this.algorithm = "EC";
        throw null;
    }

    public BCECPublicKey(String str, t97 t97Var, eei eeiVar) {
        this.algorithm = str;
        throw null;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, eei eeiVar) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKey.getW(), false);
    }

    public BCECPublicKey(String str, rno rnoVar, eei eeiVar) {
        this.algorithm = str;
        this.configuration = eeiVar;
        populateFromPubKeyInfo(rnoVar);
    }
}
