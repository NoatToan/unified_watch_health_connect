package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import defpackage.a87;
import defpackage.a97;
import defpackage.d87;
import defpackage.ee;
import defpackage.eqr;
import defpackage.f97;
import defpackage.fei;
import defpackage.gxk;
import defpackage.h97;
import defpackage.hd;
import defpackage.he;
import defpackage.iqr;
import defpackage.o87;
import defpackage.q0e;
import defpackage.q87;
import defpackage.qg5;
import defpackage.re;
import defpackage.t51;
import defpackage.t77;
import defpackage.u97;
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
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECGOST3410_2012PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient u97 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient uwa gostParams;
    private boolean withCompression;

    public BCECGOST3410_2012PublicKey(w97 w97Var, fei feiVar) {
        this.algorithm = "ECGOST3410-2012";
        throw null;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, d87 d87Var) {
        return new ECParameterSpec(ellipticCurve, t77.f(d87Var.b()), d87Var.d(), d87Var.c().intValue());
    }

    private void extractBytes(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ee eeVarG = subjectPublicKeyInfo.g().g();
        xf5 xf5VarJ = subjectPublicKeyInfo.j();
        this.algorithm = "ECGOST3410-2012";
        try {
            byte[] bArrR = ((he) re.j(xf5VarJ.r())).r();
            int i = eeVarG.equals(gxk.h) ? 64 : 32;
            int i2 = i * 2;
            byte[] bArr = new byte[i2 + 1];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = bArrR[i - i3];
                bArr[i3 + i] = bArrR[i2 - i3];
            }
            uwa uwaVarI = uwa.i(subjectPublicKeyInfo.g().i());
            this.gostParams = uwaVarI;
            y87 y87VarA = o87.a(q87.c(uwaVarI.j()));
            a87 a87VarA = y87VarA.a();
            EllipticCurve ellipticCurveB = t77.b(a87VarA, y87VarA.e());
            this.ecPublicKey = new u97(a87VarA.j(bArr), y97.e(null, y87VarA));
            this.ecSpec = new a97(q87.c(this.gostParams.j()), ellipticCurveB, t77.f(y87VarA.b()), y87VarA.d(), y87VarA.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(SubjectPublicKeyInfo.i(re.j((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public u97 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public f97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? t77.g(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.ecPublicKey.c().e(bCECGOST3410_2012PublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCECGOST3410_2012PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ee eeVar;
        int i;
        hd eqrVar;
        uwa uwaVar;
        BigInteger bigIntegerT = this.ecPublicKey.c().f().t();
        BigInteger bigIntegerT2 = this.ecPublicKey.c().g().t();
        boolean z = bigIntegerT.bitLength() > 256;
        uwa gostParams = getGostParams();
        hd hdVar = gostParams;
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof a97) {
                ee eeVarD = q87.d(((a97) eCParameterSpec).a());
                if (z) {
                    eqrVar = uwaVar;
                    uwaVar = new uwa(eeVarD, gxk.d);
                } else {
                    eqrVar = uwaVar;
                    uwaVar = new uwa(eeVarD, gxk.c);
                }
            } else {
                a87 a87VarA = t77.a(eCParameterSpec.getCurve());
                eqrVar = new eqr(new iqr(a87VarA, t77.d(a87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            hdVar = eqrVar;
        }
        int i2 = 64;
        if (z) {
            eeVar = gxk.h;
            i = 64;
            i2 = 128;
        } else {
            eeVar = gxk.g;
            i = 32;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        extractBytes(bArr, i3, 0, bigIntegerT);
        extractBytes(bArr, i3, i, bigIntegerT2);
        try {
            return q0e.d(new SubjectPublicKeyInfo(new t51(eeVar, hdVar), new qg5(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public uwa getGostParams() {
        if (this.gostParams == null && (this.ecSpec instanceof a97)) {
            this.gostParams = this.ecPublicKey.c().f().t().bitLength() > 256 ? new uwa(q87.d(((a97) this.ecSpec).a()), gxk.d) : new uwa(q87.d(((a97) this.ecSpec).a()), gxk.c);
        }
        return this.gostParams;
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
        return this.ecSpec == null ? this.ecPublicKey.c().k() : this.ecPublicKey.c();
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return t77.f(this.ecPublicKey.c());
    }

    public int hashCode() {
        return this.ecPublicKey.c().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return y97.k(this.algorithm, this.ecPublicKey.c(), engineGetSpec());
    }

    public BCECGOST3410_2012PublicKey(String str, u97 u97Var) {
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PublicKey(String str, u97 u97Var, f97 f97Var) {
        this.algorithm = "ECGOST3410-2012";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        this.ecSpec = f97Var == null ? createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB) : t77.h(t77.b(f97Var.a(), f97Var.e()), f97Var);
    }

    public BCECGOST3410_2012PublicKey(String str, u97 u97Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410-2012";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new u97(t77.e(params, eCPublicKey.getW(), false), t77.k(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410-2012";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new u97(t77.e(params, eCPublicKeySpec.getW(), false), t77.k(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.algorithm = "ECGOST3410-2012";
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.ecPublicKey = bCECGOST3410_2012PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410_2012PublicKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PublicKey.withCompression;
        this.gostParams = bCECGOST3410_2012PublicKey.gostParams;
    }
}
