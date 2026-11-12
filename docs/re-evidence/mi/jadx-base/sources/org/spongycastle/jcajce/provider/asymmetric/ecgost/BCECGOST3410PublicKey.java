package org.spongycastle.jcajce.provider.asymmetric.ecgost;

import defpackage.b87;
import defpackage.c87;
import defpackage.dqr;
import defpackage.e97;
import defpackage.gd;
import defpackage.ge;
import defpackage.hqr;
import defpackage.i97;
import defpackage.n87;
import defpackage.p87;
import defpackage.pe;
import defpackage.pg5;
import defpackage.plo;
import defpackage.rno;
import defpackage.s0e;
import defpackage.s51;
import defpackage.s77;
import defpackage.t45;
import defpackage.t97;
import defpackage.twa;
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
public class BCECGOST3410PublicKey implements ECPublicKey, org.spongycastle.jce.interfaces.ECPublicKey {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient ECParameterSpec ecSpec;
    private transient twa gostParams;
    private transient i97 q;
    private boolean withCompression;

    public BCECGOST3410PublicKey(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        this.algorithm = "ECGOST3410";
        this.q = bCECGOST3410PublicKey.q;
        this.ecSpec = bCECGOST3410PublicKey.ecSpec;
        this.withCompression = bCECGOST3410PublicKey.withCompression;
        this.gostParams = bCECGOST3410PublicKey.gostParams;
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
            twa twaVarI = twa.i(rnoVar.g().i());
            this.gostParams = twaVarI;
            x87 x87VarA = n87.a(p87.c(twaVarI.j()));
            b87 b87VarA = x87VarA.a();
            EllipticCurve ellipticCurveB = s77.b(b87VarA, x87VarA.e());
            this.q = b87VarA.d(new BigInteger(1, bArr), new BigInteger(1, bArr2));
            this.ecSpec = new z87(p87.c(this.gostParams.j()), ellipticCurveB, new ECPoint(x87VarA.b().f().s(), x87VarA.b().g().s()), x87VarA.d(), x87VarA.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(rno.i(pe.j((byte[]) objectInputStream.readObject())));
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
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return engineGetQ().e(bCECGOST3410PublicKey.engineGetQ()) && engineGetSpec().equals(bCECGOST3410PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        gd dqrVar;
        gd gdVar = this.gostParams;
        if (gdVar == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof z87) {
                dqrVar = new twa(p87.d(((z87) eCParameterSpec).a()), t45.m);
            } else {
                b87 b87VarA = s77.a(eCParameterSpec.getCurve());
                dqrVar = new dqr(new hqr(b87VarA, s77.d(b87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            gdVar = dqrVar;
        }
        BigInteger bigIntegerS = this.q.f().s();
        BigInteger bigIntegerS2 = this.q.g().s();
        byte[] bArr = new byte[64];
        extractBytes(bArr, 0, bigIntegerS);
        extractBytes(bArr, 32, bigIntegerS2);
        try {
            return s0e.d(new rno(new s51(t45.j, gdVar), new pg5(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public twa getGostParams() {
        return this.gostParams;
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

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKeySpec.getW(), false);
    }

    public BCECGOST3410PublicKey(v97 v97Var) {
        this.algorithm = "ECGOST3410";
        throw null;
    }

    public BCECGOST3410PublicKey(String str, t97 t97Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        throw null;
    }

    public BCECGOST3410PublicKey(String str, t97 t97Var, e97 e97Var) {
        this.algorithm = "ECGOST3410";
        throw null;
    }

    public BCECGOST3410PublicKey(String str, t97 t97Var) {
        this.algorithm = str;
        throw null;
    }

    public BCECGOST3410PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = s77.e(params, eCPublicKey.getW(), false);
    }

    public BCECGOST3410PublicKey(rno rnoVar) {
        this.algorithm = "ECGOST3410";
        populateFromPubKeyInfo(rnoVar);
    }
}
