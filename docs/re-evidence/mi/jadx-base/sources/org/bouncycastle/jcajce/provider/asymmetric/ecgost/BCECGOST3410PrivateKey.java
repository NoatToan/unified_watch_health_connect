package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.a87;
import defpackage.a97;
import defpackage.ae;
import defpackage.d87;
import defpackage.ee;
import defpackage.eqr;
import defpackage.f97;
import defpackage.fgh;
import defpackage.hd;
import defpackage.he;
import defpackage.hgh;
import defpackage.iqr;
import defpackage.m97;
import defpackage.mg5;
import defpackage.o87;
import defpackage.o97;
import defpackage.q87;
import defpackage.q97;
import defpackage.qg5;
import defpackage.re;
import defpackage.t51;
import defpackage.t77;
import defpackage.te;
import defpackage.u45;
import defpackage.uwa;
import defpackage.wd;
import defpackage.xf5;
import defpackage.y87;
import defpackage.y97;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, fgh {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient hgh attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient hd gostParams;
    private transient xf5 publicKey;
    private boolean withCompression;

    public BCECGOST3410PrivateKey() {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
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

    private xf5 getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return SubjectPublicKeyInfo.i(re.j(bCECGOST3410PublicKey.getEncoded())).j();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x013d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0148  */
    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        a97 a97Var;
        hd hdVarJ;
        BigInteger bigIntegerR;
        String strD;
        hd hdVarI = privateKeyInfo.i().i();
        re aSN1Primitive = hdVarI.toASN1Primitive();
        if ((aSN1Primitive instanceof te) && (te.q(aSN1Primitive).size() == 2 || te.q(aSN1Primitive).size() == 3)) {
            uwa uwaVarI = uwa.i(hdVarI);
            this.gostParams = uwaVarI;
            y87 y87VarA = o87.a(q87.c(uwaVarI.j()));
            this.ecSpec = new a97(q87.c(uwaVarI.j()), t77.b(y87VarA.a(), y87VarA.e()), t77.f(y87VarA.b()), y87VarA.d(), y87VarA.c());
            hd hdVarJ2 = privateKeyInfo.j();
            if (hdVarJ2 instanceof wd) {
                bigIntegerR = wd.o(hdVarJ2).q();
            } else {
                byte[] bArrR = he.q(hdVarJ2).r();
                byte[] bArr = new byte[bArrR.length];
                for (int i = 0; i != bArrR.length; i++) {
                    bArr[i] = bArrR[(bArrR.length - 1) - i];
                }
                bigIntegerR = new BigInteger(1, bArr);
            }
        } else {
            eqr eqrVarG = eqr.g(hdVarI);
            if (eqrVarG.j()) {
                ee eeVarW = ee.w(eqrVarG.h());
                iqr iqrVarG = y97.g(eeVarW);
                if (iqrVarG == null) {
                    d87 d87VarB = q87.b(eeVarW);
                    iqr iqrVar = new iqr(d87VarB.a(), d87VarB.b(), d87VarB.d(), d87VarB.c(), d87VarB.e());
                    strD = q87.c(eeVarW);
                    iqrVarG = iqrVar;
                } else {
                    strD = y97.d(eeVarW);
                }
                a97Var = new a97(strD, t77.b(iqrVarG.g(), iqrVarG.l()), t77.f(iqrVarG.h()), iqrVarG.k(), iqrVarG.i());
            } else {
                if (eqrVarG.i()) {
                    a97Var = null;
                } else {
                    iqr iqrVarJ = iqr.j(eqrVarG.h());
                    this.ecSpec = new ECParameterSpec(t77.b(iqrVarJ.g(), iqrVarJ.l()), t77.f(iqrVarJ.h()), iqrVarJ.k(), iqrVarJ.i().intValue());
                }
                hdVarJ = privateKeyInfo.j();
                if (hdVarJ instanceof wd) {
                    m97 m97VarG = m97.g(hdVarJ);
                    this.d = m97VarG.h();
                    this.publicKey = m97VarG.j();
                    return;
                }
                bigIntegerR = wd.o(hdVarJ).r();
            }
            this.ecSpec = a97Var;
            hdVarJ = privateKeyInfo.j();
            if (hdVarJ instanceof wd) {
                m97 m97VarG2 = m97.g(hdVarJ);
                this.d = m97VarG2.h();
                this.publicKey = m97VarG2.j();
                return;
            }
            bigIntegerR = wd.o(hdVarJ).r();
        }
        this.d = bigIntegerR;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(PrivateKeyInfo.h(re.j((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public f97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? t77.g(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // defpackage.fgh
    public hd getBagAttribute(ee eeVar) {
        return this.attrCarrier.getBagAttribute(eeVar);
    }

    @Override // defpackage.fgh
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c0  */
    @Override // java.security.Key
    public byte[] getEncoded() {
        eqr eqrVar;
        int i;
        m97 m97Var;
        if (this.gostParams != null) {
            byte[] bArr = new byte[32];
            extractBytes(bArr, 0, getS());
            try {
                return new PrivateKeyInfo(new t51(u45.m, this.gostParams), new qg5(bArr)).f(ASN1Encoding.DER);
            } catch (IOException unused) {
                return null;
            }
        }
        ECParameterSpec eCParameterSpec = this.ecSpec;
        try {
            if (!(eCParameterSpec instanceof a97)) {
                if (eCParameterSpec == null) {
                    eqrVar = new eqr((ae) mg5.f26130a);
                    i = y97.i(BouncyCastleProvider.CONFIGURATION, null, getS());
                } else {
                    a87 a87VarA = t77.a(eCParameterSpec.getCurve());
                    eqrVar = new eqr(new iqr(a87VarA, t77.d(a87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                if (this.publicKey != null) {
                    m97Var = new m97(i, getS(), this.publicKey, eqrVar);
                } else {
                    m97Var = new m97(i, getS(), eqrVar);
                }
                return new PrivateKeyInfo(new t51(u45.m, eqrVar.toASN1Primitive()), m97Var.toASN1Primitive()).f(ASN1Encoding.DER);
            }
            ee eeVarH = y97.h(((a97) eCParameterSpec).a());
            if (eeVarH == null) {
                eeVarH = new ee(((a97) this.ecSpec).a());
            }
            eqrVar = new eqr(eeVarH);
            return new PrivateKeyInfo(new t51(u45.m, eqrVar.toASN1Primitive()), m97Var.toASN1Primitive()).f(ASN1Encoding.DER);
        } catch (IOException unused2) {
            return null;
        }
        i = y97.i(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
        if (this.publicKey != null) {
            m97Var = new m97(i, getS(), this.publicKey, eqrVar);
        } else {
            m97Var = new m97(i, getS(), eqrVar);
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
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

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        this.attrCarrier.setBagAttribute(eeVar, hdVar);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return y97.j(this.algorithm, this.d, engineGetSpec());
    }

    public BCECGOST3410PrivateKey(q97 q97Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        throw null;
    }

    public BCECGOST3410PrivateKey(String str, o97 o97Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECGOST3410PrivateKey(String str, o97 o97Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, f97 f97Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECGOST3410PrivateKey(String str, o97 o97Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new hgh();
        this.d = bCECGOST3410PrivateKey.d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }
}
