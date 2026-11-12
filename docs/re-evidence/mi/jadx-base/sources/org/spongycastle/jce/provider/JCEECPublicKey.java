package org.spongycastle.jce.provider;

import defpackage.b87;
import defpackage.c87;
import defpackage.dqr;
import defpackage.e97;
import defpackage.fe;
import defpackage.gd;
import defpackage.ge;
import defpackage.hqr;
import defpackage.i97;
import defpackage.lg5;
import defpackage.lqr;
import defpackage.n87;
import defpackage.p87;
import defpackage.pe;
import defpackage.pg5;
import defpackage.plo;
import defpackage.rno;
import defpackage.rqr;
import defpackage.s0e;
import defpackage.s51;
import defpackage.s77;
import defpackage.se;
import defpackage.t45;
import defpackage.t97;
import defpackage.tqr;
import defpackage.twa;
import defpackage.v97;
import defpackage.wf5;
import defpackage.x87;
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

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPublicKey implements ECPublicKey, org.spongycastle.jce.interfaces.ECPublicKey {
    private String algorithm;
    private ECParameterSpec ecSpec;
    private twa gostParams;
    private i97 q;
    private boolean withCompression;

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.q = jCEECPublicKey.q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
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
        b87 b87VarG;
        byte b2;
        if (rnoVar.h().g().equals(t45.j)) {
            wf5 wf5VarJ = rnoVar.j();
            this.algorithm = "ECGOST3410";
            try {
                byte[] bArrR = ((ge) pe.j(wf5VarJ.r())).r();
                byte[] bArr = new byte[32];
                byte[] bArr2 = new byte[32];
                for (int i = 0; i != 32; i++) {
                    bArr[i] = bArrR[31 - i];
                }
                for (int i2 = 0; i2 != 32; i2++) {
                    bArr2[i2] = bArrR[63 - i2];
                }
                twa twaVar = new twa((se) rnoVar.h().i());
                this.gostParams = twaVar;
                x87 x87VarA = n87.a(p87.c(twaVar.j()));
                b87 b87VarA = x87VarA.a();
                EllipticCurve ellipticCurveB = s77.b(b87VarA, x87VarA.e());
                this.q = b87VarA.e(new BigInteger(1, bArr), new BigInteger(1, bArr2), false);
                this.ecSpec = new z87(p87.c(this.gostParams.j()), ellipticCurveB, new ECPoint(x87VarA.b().f().s(), x87VarA.b().g().s()), x87VarA.d(), x87VarA.c());
                return;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        dqr dqrVar = new dqr((pe) rnoVar.h().i());
        if (dqrVar.j()) {
            fe feVar = (fe) dqrVar.h();
            hqr hqrVarC = x97.c(feVar);
            b87VarG = hqrVarC.g();
            this.ecSpec = new z87(x97.b(feVar), s77.b(b87VarG, hqrVarC.l()), new ECPoint(hqrVarC.h().f().s(), hqrVarC.h().g().s()), hqrVarC.k(), hqrVarC.i());
        } else if (dqrVar.i()) {
            this.ecSpec = null;
            b87VarG = BouncyCastleProvider.CONFIGURATION.a().a();
        } else {
            hqr hqrVarJ = hqr.j(dqrVar.h());
            b87VarG = hqrVarJ.g();
            this.ecSpec = new ECParameterSpec(s77.b(b87VarG, hqrVarJ.l()), new ECPoint(hqrVarJ.h().f().s(), hqrVarJ.h().g().s()), hqrVarJ.k(), hqrVarJ.i().intValue());
        }
        byte[] bArrR2 = rnoVar.j().r();
        ge pg5Var = new pg5(bArrR2);
        if (bArrR2[0] == 4 && bArrR2[1] == bArrR2.length - 2 && (((b2 = bArrR2[2]) == 2 || b2 == 3) && new rqr().a(b87VarG) >= bArrR2.length - 3)) {
            try {
                pg5Var = (ge) pe.j(bArrR2);
            } catch (IOException unused2) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.q = new lqr(b87VarG, pg5Var).g();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPubKeyInfo(rno.i(pe.j((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public i97 engineGetQ() {
        return this.q;
    }

    public e97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? s77.f(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return engineGetQ().e(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        dqr dqrVar;
        rno rnoVar;
        gd dqrVar2;
        if (this.algorithm.equals("ECGOST3410")) {
            gd gdVar = this.gostParams;
            if (gdVar == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof z87) {
                    dqrVar2 = new twa(p87.d(((z87) eCParameterSpec).a()), t45.m);
                } else {
                    b87 b87VarA = s77.a(eCParameterSpec.getCurve());
                    dqrVar2 = new dqr(new hqr(b87VarA, s77.d(b87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                gdVar = dqrVar2;
            }
            BigInteger bigIntegerS = this.q.f().s();
            BigInteger bigIntegerS2 = this.q.g().s();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, bigIntegerS);
            extractBytes(bArr, 32, bigIntegerS2);
            try {
                rnoVar = new rno(new s51(t45.j, gdVar), new pg5(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof z87) {
                fe feVarD = x97.d(((z87) eCParameterSpec2).a());
                if (feVarD == null) {
                    feVarD = new fe(((z87) this.ecSpec).a());
                }
                dqrVar = new dqr(feVarD);
            } else if (eCParameterSpec2 == null) {
                dqrVar = new dqr((zd) lg5.f25030a);
            } else {
                b87 b87VarA2 = s77.a(eCParameterSpec2.getCurve());
                dqrVar = new dqr(new hqr(b87VarA2, s77.d(b87VarA2, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            rnoVar = new rno(new s51(tqr.r9, dqrVar), ((ge) new lqr(engineGetQ().i().e(getQ().f().s(), getQ().g().s(), this.withCompression)).toASN1Primitive()).r());
        }
        return s0e.d(rnoVar);
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

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKeySpec.getW(), false);
    }

    public JCEECPublicKey(String str, v97 v97Var) {
        this.algorithm = str;
        throw null;
    }

    public JCEECPublicKey(String str, t97 t97Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        throw null;
    }

    public JCEECPublicKey(String str, t97 t97Var, e97 e97Var) {
        this.algorithm = "EC";
        throw null;
    }

    public JCEECPublicKey(String str, t97 t97Var) {
        this.algorithm = str;
        throw null;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKey.getW(), false);
    }

    public JCEECPublicKey(rno rnoVar) {
        this.algorithm = "EC";
        populateFromPubKeyInfo(rnoVar);
    }
}
