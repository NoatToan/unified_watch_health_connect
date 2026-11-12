package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.a87;
import defpackage.d87;
import defpackage.eqr;
import defpackage.f97;
import defpackage.fei;
import defpackage.h97;
import defpackage.he;
import defpackage.mqr;
import defpackage.q0e;
import defpackage.qg5;
import defpackage.re;
import defpackage.sqr;
import defpackage.t51;
import defpackage.t77;
import defpackage.u97;
import defpackage.uqr;
import defpackage.w97;
import defpackage.y97;
import defpackage.z97;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    static final long serialVersionUID = 2422789860422731812L;
    private String algorithm;
    private transient fei configuration;
    private transient u97 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCECPublicKey(String str, u97 u97Var, f97 f97Var, fei feiVar) {
        this.algorithm = "EC";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.ecSpec = f97Var == null ? createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB) : t77.h(t77.b(f97Var.a(), f97Var.e()), f97Var);
        this.ecPublicKey = u97Var;
        this.configuration = feiVar;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, d87 d87Var) {
        return new ECParameterSpec(ellipticCurve, t77.f(d87Var.b()), d87Var.d(), d87Var.c().intValue());
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte b2;
        eqr eqrVarG = eqr.g(subjectPublicKeyInfo.g().i());
        a87 a87VarJ = t77.j(this.configuration, eqrVarG);
        this.ecSpec = t77.i(eqrVarG, a87VarJ);
        byte[] bArrR = subjectPublicKeyInfo.j().r();
        he qg5Var = new qg5(bArrR);
        if (bArrR[0] == 4 && bArrR[1] == bArrR.length - 2 && (((b2 = bArrR[2]) == 2 || b2 == 3) && new sqr().a(a87VarJ) >= bArrR.length - 3)) {
            try {
                qg5Var = (he) re.j(bArrR);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.ecPublicKey = new u97(new mqr(a87VarJ, qg5Var).g(), y97.f(this.configuration, eqrVarG));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPubKeyInfo(SubjectPublicKeyInfo.i(re.j(bArr)));
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
        return eCParameterSpec != null ? t77.g(eCParameterSpec, this.withCompression) : this.configuration.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.ecPublicKey.c().e(bCECPublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return q0e.d(new SubjectPublicKeyInfo(new t51(uqr.Ja, z97.a(this.ecSpec, this.withCompression)), he.q(new mqr(this.ecPublicKey.c(), this.withCompression).toASN1Primitive()).r()));
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
        return y97.k("EC", this.ecPublicKey.c(), engineGetSpec());
    }

    public BCECPublicKey(String str, u97 u97Var, fei feiVar) {
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        this.ecSpec = null;
        this.configuration = feiVar;
    }

    public BCECPublicKey(String str, u97 u97Var, ECParameterSpec eCParameterSpec, fei feiVar) {
        this.algorithm = "EC";
        d87 d87VarB = u97Var.b();
        this.algorithm = str;
        this.ecPublicKey = u97Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(t77.b(d87VarB.a(), d87VarB.e()), d87VarB);
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.configuration = feiVar;
    }

    public BCECPublicKey(String str, w97 w97Var, fei feiVar) {
        this.algorithm = str;
        throw null;
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, fei feiVar) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new u97(t77.e(params, eCPublicKeySpec.getW(), false), t77.k(feiVar, eCPublicKeySpec.getParams()));
        this.configuration = feiVar;
    }

    public BCECPublicKey(String str, SubjectPublicKeyInfo subjectPublicKeyInfo, fei feiVar) {
        this.algorithm = str;
        this.configuration = feiVar;
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.ecPublicKey = bCECPublicKey.ecPublicKey;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, fei feiVar) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new u97(t77.e(params, eCPublicKey.getW(), false), t77.k(feiVar, eCPublicKey.getParams()));
    }
}
