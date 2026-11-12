package org.bouncycastle.jce.provider;

import defpackage.a87;
import defpackage.a97;
import defpackage.ae;
import defpackage.d87;
import defpackage.ee;
import defpackage.eqr;
import defpackage.f97;
import defpackage.h97;
import defpackage.hd;
import defpackage.he;
import defpackage.iqr;
import defpackage.mg5;
import defpackage.mqr;
import defpackage.o87;
import defpackage.olo;
import defpackage.q0e;
import defpackage.q87;
import defpackage.qg5;
import defpackage.re;
import defpackage.sqr;
import defpackage.t51;
import defpackage.t77;
import defpackage.te;
import defpackage.u45;
import defpackage.u97;
import defpackage.uqr;
import defpackage.uwa;
import defpackage.w97;
import defpackage.xf5;
import defpackage.y87;
import defpackage.y97;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    private String algorithm;
    private ECParameterSpec ecSpec;
    private uwa gostParams;
    private h97 q;
    private boolean withCompression;

    public JCEECPublicKey(String str, u97 u97Var) {
        this.algorithm = str;
        this.q = u97Var.c();
        this.ecSpec = null;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, d87 d87Var) {
        return new ECParameterSpec(ellipticCurve, t77.f(d87Var.b()), d87Var.d(), d87Var.c().intValue());
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

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        a87 a87VarG;
        ECParameterSpec eCParameterSpec;
        byte[] bArrR;
        he qg5Var;
        byte b2;
        if (subjectPublicKeyInfo.h().g().equals(u45.m)) {
            xf5 xf5VarJ = subjectPublicKeyInfo.j();
            this.algorithm = "ECGOST3410";
            try {
                byte[] bArrR2 = ((he) re.j(xf5VarJ.r())).r();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i = 1; i <= 32; i++) {
                    bArr[i] = bArrR2[32 - i];
                    bArr[i + 32] = bArrR2[64 - i];
                }
                uwa uwaVar = new uwa((te) subjectPublicKeyInfo.h().i());
                this.gostParams = uwaVar;
                y87 y87VarA = o87.a(q87.c(uwaVar.j()));
                a87 a87VarA = y87VarA.a();
                EllipticCurve ellipticCurveB = t77.b(a87VarA, y87VarA.e());
                this.q = a87VarA.j(bArr);
                this.ecSpec = new a97(q87.c(this.gostParams.j()), ellipticCurveB, t77.f(y87VarA.b()), y87VarA.d(), y87VarA.c());
                return;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        eqr eqrVar = new eqr((re) subjectPublicKeyInfo.h().i());
        if (!eqrVar.j()) {
            if (eqrVar.i()) {
                this.ecSpec = null;
                a87VarG = BouncyCastleProvider.CONFIGURATION.a().a();
            } else {
                iqr iqrVarJ = iqr.j(eqrVar.h());
                a87VarG = iqrVarJ.g();
                eCParameterSpec = new ECParameterSpec(t77.b(a87VarG, iqrVarJ.l()), t77.f(iqrVarJ.h()), iqrVarJ.k(), iqrVarJ.i().intValue());
            }
            bArrR = subjectPublicKeyInfo.j().r();
            qg5Var = new qg5(bArrR);
            if (bArrR[0] == 4 && bArrR[1] == bArrR.length - 2 && (((b2 = bArrR[2]) == 2 || b2 == 3) && new sqr().a(a87VarG) >= bArrR.length - 3)) {
                try {
                    qg5Var = (he) re.j(bArrR);
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
            this.q = new mqr(a87VarG, qg5Var).g();
        }
        ee eeVar = (ee) eqrVar.h();
        iqr iqrVarG = y97.g(eeVar);
        a87VarG = iqrVarG.g();
        eCParameterSpec = new a97(y97.d(eeVar), t77.b(a87VarG, iqrVarG.l()), t77.f(iqrVarG.h()), iqrVarG.k(), iqrVarG.i());
        this.ecSpec = eCParameterSpec;
        bArrR = subjectPublicKeyInfo.j().r();
        qg5Var = new qg5(bArrR);
        if (bArrR[0] == 4) {
            qg5Var = (he) re.j(bArrR);
        }
        this.q = new mqr(a87VarG, qg5Var).g();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPubKeyInfo(SubjectPublicKeyInfo.i(re.j((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public h97 engineGetQ() {
        return this.q;
    }

    public f97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? t77.g(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
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
        eqr eqrVar;
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        hd eqrVar2;
        if (this.algorithm.equals("ECGOST3410")) {
            hd hdVar = this.gostParams;
            if (hdVar == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof a97) {
                    eqrVar2 = new uwa(q87.d(((a97) eCParameterSpec).a()), u45.p);
                } else {
                    a87 a87VarA = t77.a(eCParameterSpec.getCurve());
                    eqrVar2 = new eqr(new iqr(a87VarA, t77.d(a87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                hdVar = eqrVar2;
            }
            BigInteger bigIntegerT = this.q.f().t();
            BigInteger bigIntegerT2 = this.q.g().t();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, bigIntegerT);
            extractBytes(bArr, 32, bigIntegerT2);
            try {
                subjectPublicKeyInfo = new SubjectPublicKeyInfo(new t51(u45.m, hdVar), new qg5(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof a97) {
                ee eeVarH = y97.h(((a97) eCParameterSpec2).a());
                if (eeVarH == null) {
                    eeVarH = new ee(((a97) this.ecSpec).a());
                }
                eqrVar = new eqr(eeVarH);
            } else if (eCParameterSpec2 == null) {
                eqrVar = new eqr((ae) mg5.f26130a);
            } else {
                a87 a87VarA2 = t77.a(eCParameterSpec2.getCurve());
                eqrVar = new eqr(new iqr(a87VarA2, t77.d(a87VarA2, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            subjectPublicKeyInfo = new SubjectPublicKeyInfo(new t51(uqr.Ja, eqrVar), ((he) new mqr(engineGetQ().i().g(getQ().f().t(), getQ().g().t(), this.withCompression)).toASN1Primitive()).r());
        }
        return q0e.d(subjectPublicKeyInfo);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public f97 getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return t77.g(eCParameterSpec, this.withCompression);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public h97 getQ() {
        return this.ecSpec == null ? this.q.k() : this.q;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return t77.f(this.q);
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.q.f().t().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.q.g().t().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public JCEECPublicKey(String str, u97 u97Var, f97 f97Var) {
        this.algorithm = "EC";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.q = u97Var.c();
        this.ecSpec = f97Var == null ? createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB) : t77.h(t77.b(f97Var.a(), f97Var.e()), f97Var);
    }

    public JCEECPublicKey(String str, u97 u97Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.q = u97Var.c();
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, w97 w97Var) {
        this.algorithm = str;
        throw null;
    }

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = t77.e(params, eCPublicKeySpec.getW(), false);
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.q = jCEECPublicKey.q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = t77.e(params, eCPublicKey.getW(), false);
    }

    public JCEECPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.algorithm = "EC";
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }
}
