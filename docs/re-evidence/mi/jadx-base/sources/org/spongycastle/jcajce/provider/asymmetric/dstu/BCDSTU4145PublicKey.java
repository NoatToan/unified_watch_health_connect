package org.spongycastle.jcajce.provider.asymmetric.dstu;

import defpackage.b87;
import defpackage.c87;
import defpackage.cj5;
import defpackage.dqr;
import defpackage.e6q;
import defpackage.e97;
import defpackage.ej5;
import defpackage.fe;
import defpackage.gd;
import defpackage.ge;
import defpackage.gj5;
import defpackage.hqr;
import defpackage.i97;
import defpackage.ij5;
import defpackage.kj5;
import defpackage.pe;
import defpackage.pg5;
import defpackage.plo;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s51;
import defpackage.s77;
import defpackage.se;
import defpackage.t97;
import defpackage.v97;
import defpackage.wf5;
import defpackage.x87;
import defpackage.z87;
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
public class BCDSTU4145PublicKey implements ECPublicKey, org.spongycastle.jce.interfaces.ECPublicKey {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient ij5 dstuParams;
    private transient ECParameterSpec ecSpec;
    private transient i97 q;
    private boolean withCompression;

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.algorithm = "DSTU4145";
        this.q = bCDSTU4145PublicKey.q;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, c87 c87Var) {
        return new ECParameterSpec(ellipticCurve, new ECPoint(c87Var.b().f().s(), c87Var.b().g().s()), c87Var.d(), c87Var.c().intValue());
    }

    private void populateFromPubKeyInfo(rno rnoVar) {
        e97 e97Var;
        wf5 wf5VarJ = rnoVar.j();
        this.algorithm = "DSTU4145";
        try {
            byte[] bArrR = ((ge) pe.j(wf5VarJ.r())).r();
            fe feVarG = rnoVar.g().g();
            fe feVar = e6q.f16331b;
            if (feVarG.equals(feVar)) {
                reverseBytes(bArrR);
            }
            ij5 ij5VarJ = ij5.j((se) rnoVar.g().i());
            this.dstuParams = ij5VarJ;
            if (ij5VarJ.l()) {
                fe feVarK = this.dstuParams.k();
                c87 c87VarA = gj5.a(feVarK);
                e97Var = new x87(feVarK.u(), c87VarA.a(), c87VarA.b(), c87VarA.d(), c87VarA.c(), c87VarA.e());
            } else {
                ej5 ej5VarI = this.dstuParams.i();
                byte[] bArrH = ej5VarI.h();
                if (rnoVar.g().g().equals(feVar)) {
                    reverseBytes(bArrH);
                }
                cj5 cj5VarI = ej5VarI.i();
                b87.d dVar = new b87.d(cj5VarI.k(), cj5VarI.h(), cj5VarI.i(), cj5VarI.j(), ej5VarI.g(), new BigInteger(1, bArrH));
                byte[] bArrJ = ej5VarI.j();
                if (rnoVar.g().g().equals(feVar)) {
                    reverseBytes(bArrJ);
                }
                e97Var = new e97(dVar, kj5.a(dVar, bArrJ), ej5VarI.l());
            }
            b87 b87VarA = e97Var.a();
            EllipticCurve ellipticCurveB = s77.b(b87VarA, e97Var.e());
            this.q = kj5.a(b87VarA, bArrR);
            if (this.dstuParams.l()) {
                this.ecSpec = new z87(this.dstuParams.k().u(), ellipticCurveB, new ECPoint(e97Var.b().f().s(), e97Var.b().g().s()), e97Var.d(), e97Var.c());
            } else {
                this.ecSpec = new ECParameterSpec(ellipticCurveB, new ECPoint(e97Var.b().f().s(), e97Var.b().g().s()), e97Var.d(), e97Var.c().intValue());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(rno.i(pe.j((byte[]) objectInputStream.readObject())));
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

    public i97 engineGetQ() {
        return this.q;
    }

    public e97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? s77.f(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return engineGetQ().e(bCDSTU4145PublicKey.engineGetQ()) && engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        gd dqrVar = this.dstuParams;
        if (dqrVar == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof z87) {
                dqrVar = new ij5(new fe(((z87) this.ecSpec).a()));
            } else {
                b87 b87VarA = s77.a(eCParameterSpec.getCurve());
                dqrVar = new dqr(new hqr(b87VarA, s77.d(b87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        try {
            return s0e.d(new rno(new s51(e6q.c, dqrVar), new pg5(kj5.b(this.q))));
        } catch (IOException unused) {
            return null;
        }
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

    public byte[] getSbox() {
        ij5 ij5Var = this.dstuParams;
        return ij5Var != null ? ij5Var.g() : ij5.h();
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

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKeySpec.getW(), false);
    }

    public BCDSTU4145PublicKey(v97 v97Var) {
        this.algorithm = "DSTU4145";
        throw null;
    }

    public BCDSTU4145PublicKey(String str, t97 t97Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        throw null;
    }

    public BCDSTU4145PublicKey(String str, t97 t97Var, e97 e97Var) {
        this.algorithm = "DSTU4145";
        throw null;
    }

    public BCDSTU4145PublicKey(String str, t97 t97Var) {
        this.algorithm = str;
        throw null;
    }

    public BCDSTU4145PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "DSTU4145";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKey.getW(), false);
    }

    public BCDSTU4145PublicKey(rno rnoVar) {
        this.algorithm = "DSTU4145";
        populateFromPubKeyInfo(rnoVar);
    }
}
