package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import defpackage.a87;
import defpackage.a97;
import defpackage.d87;
import defpackage.dj5;
import defpackage.ee;
import defpackage.eqr;
import defpackage.f6q;
import defpackage.f97;
import defpackage.fei;
import defpackage.fj5;
import defpackage.h97;
import defpackage.hd;
import defpackage.he;
import defpackage.hj5;
import defpackage.iqr;
import defpackage.jj5;
import defpackage.lj5;
import defpackage.q0e;
import defpackage.qg5;
import defpackage.re;
import defpackage.t51;
import defpackage.t77;
import defpackage.te;
import defpackage.u97;
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
public class BCDSTU4145PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient jj5 dstuParams;
    private transient u97 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCDSTU4145PublicKey(w97 w97Var, fei feiVar) {
        this.algorithm = "DSTU4145";
        throw null;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, d87 d87Var) {
        return new ECParameterSpec(ellipticCurve, t77.f(d87Var.b()), d87Var.d(), d87Var.c().intValue());
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        f97 f97Var;
        xf5 xf5VarJ = subjectPublicKeyInfo.j();
        this.algorithm = "DSTU4145";
        try {
            byte[] bArrR = ((he) re.j(xf5VarJ.r())).r();
            ee eeVarG = subjectPublicKeyInfo.g().g();
            ee eeVar = f6q.f17472b;
            if (eeVarG.equals(eeVar)) {
                reverseBytes(bArrR);
            }
            jj5 jj5VarJ = jj5.j((te) subjectPublicKeyInfo.g().i());
            this.dstuParams = jj5VarJ;
            if (jj5VarJ.l()) {
                ee eeVarK = this.dstuParams.k();
                d87 d87VarA = hj5.a(eeVarK);
                f97Var = new y87(eeVarK.u(), d87VarA.a(), d87VarA.b(), d87VarA.d(), d87VarA.c(), d87VarA.e());
            } else {
                fj5 fj5VarI = this.dstuParams.i();
                byte[] bArrH = fj5VarI.h();
                if (subjectPublicKeyInfo.g().g().equals(eeVar)) {
                    reverseBytes(bArrH);
                }
                dj5 dj5VarI = fj5VarI.i();
                a87.d dVar = new a87.d(dj5VarI.k(), dj5VarI.h(), dj5VarI.i(), dj5VarI.j(), fj5VarI.g(), new BigInteger(1, bArrH));
                byte[] bArrJ = fj5VarI.j();
                if (subjectPublicKeyInfo.g().g().equals(eeVar)) {
                    reverseBytes(bArrJ);
                }
                f97Var = new f97(dVar, lj5.a(dVar, bArrJ), fj5VarI.l());
            }
            a87 a87VarA = f97Var.a();
            EllipticCurve ellipticCurveB = t77.b(a87VarA, f97Var.e());
            this.ecSpec = this.dstuParams.l() ? new a97(this.dstuParams.k().u(), ellipticCurveB, t77.f(f97Var.b()), f97Var.d(), f97Var.c()) : new ECParameterSpec(ellipticCurveB, t77.f(f97Var.b()), f97Var.d(), f97Var.c().intValue());
            this.ecPublicKey = new u97(lj5.a(a87VarA, bArrR), t77.k(null, this.ecSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(SubjectPublicKeyInfo.i(re.j((byte[]) objectInputStream.readObject())));
    }

    private void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b2 = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b2;
        }
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
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.ecPublicKey.c().e(bCDSTU4145PublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        hd eqrVar = this.dstuParams;
        if (eqrVar == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof a97) {
                eqrVar = new jj5(new ee(((a97) this.ecSpec).a()));
            } else {
                a87 a87VarA = t77.a(eCParameterSpec.getCurve());
                eqrVar = new eqr(new iqr(a87VarA, t77.d(a87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        try {
            return q0e.d(new SubjectPublicKeyInfo(new t51(f6q.c, eqrVar), new qg5(lj5.b(this.ecPublicKey.c()))));
        } catch (IOException unused) {
            return null;
        }
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
        h97 h97VarC = this.ecPublicKey.c();
        return this.ecSpec == null ? h97VarC.k() : h97VarC;
    }

    public byte[] getSbox() {
        jj5 jj5Var = this.dstuParams;
        return jj5Var != null ? jj5Var.g() : jj5.h();
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

    public BCDSTU4145PublicKey(String str, u97 u97Var) {
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        this.ecSpec = null;
    }

    public BCDSTU4145PublicKey(String str, u97 u97Var, f97 f97Var) {
        this.algorithm = "DSTU4145";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.ecSpec = f97Var == null ? createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB) : t77.h(t77.b(f97Var.a(), f97Var.e()), f97Var);
        this.ecPublicKey = u97Var;
    }

    public BCDSTU4145PublicKey(String str, u97 u97Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new u97(t77.e(params, eCPublicKeySpec.getW(), false), t77.k(null, this.ecSpec));
    }

    public BCDSTU4145PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.algorithm = "DSTU4145";
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.algorithm = "DSTU4145";
        this.ecPublicKey = bCDSTU4145PublicKey.ecPublicKey;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }
}
