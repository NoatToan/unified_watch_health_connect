package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.a87;
import defpackage.a97;
import defpackage.ae;
import defpackage.d87;
import defpackage.ee;
import defpackage.eqr;
import defpackage.f6q;
import defpackage.f97;
import defpackage.fgh;
import defpackage.hd;
import defpackage.hgh;
import defpackage.hj5;
import defpackage.iqr;
import defpackage.m97;
import defpackage.mg5;
import defpackage.o97;
import defpackage.q97;
import defpackage.re;
import defpackage.t51;
import defpackage.t77;
import defpackage.uqr;
import defpackage.wd;
import defpackage.xf5;
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
public class BCDSTU4145PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, fgh {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient hgh attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient xf5 publicKey;
    private boolean withCompression;

    public BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
    }

    private xf5 getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return SubjectPublicKeyInfo.i(re.j(bCDSTU4145PublicKey.getEncoded())).j();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c1  */
    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        ECParameterSpec eCParameterSpec;
        hd hdVarJ;
        eqr eqrVar = new eqr((re) privateKeyInfo.i().i());
        if (!eqrVar.j()) {
            if (eqrVar.i()) {
                this.ecSpec = null;
            } else {
                iqr iqrVarJ = iqr.j(eqrVar.h());
                eCParameterSpec = new ECParameterSpec(t77.b(iqrVarJ.g(), iqrVarJ.l()), t77.f(iqrVarJ.h()), iqrVarJ.k(), iqrVarJ.i().intValue());
            }
            hdVarJ = privateKeyInfo.j();
            if (hdVarJ instanceof wd) {
                this.d = wd.o(hdVarJ).r();
                return;
            }
            m97 m97VarG = m97.g(hdVarJ);
            this.d = m97VarG.h();
            this.publicKey = m97VarG.j();
        }
        ee eeVarW = ee.w(eqrVar.h());
        iqr iqrVarG = y97.g(eeVarW);
        if (iqrVarG == null) {
            d87 d87VarA = hj5.a(eeVarW);
            eCParameterSpec = new a97(eeVarW.u(), t77.b(d87VarA.a(), d87VarA.e()), t77.f(d87VarA.b()), d87VarA.d(), d87VarA.c());
        } else {
            eCParameterSpec = new a97(y97.d(eeVarW), t77.b(iqrVarG.g(), iqrVarG.l()), t77.f(iqrVarG.h()), iqrVarG.k(), iqrVarG.i());
        }
        this.ecSpec = eCParameterSpec;
        hdVarJ = privateKeyInfo.j();
        if (hdVarJ instanceof wd) {
            this.d = wd.o(hdVarJ).r();
            return;
        }
        m97 m97VarG2 = m97.g(hdVarJ);
        this.d = m97VarG2.h();
        this.publicKey = m97VarG2.j();
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
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec());
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

    /* JADX WARN: Code duplicated, block: B:14:0x0089  */
    /* JADX WARN: Code duplicated, block: B:15:0x0095  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a8 A[Catch: IOException -> 0x00d8, TryCatch #0 {IOException -> 0x00d8, blocks: (B:16:0x009e, B:18:0x00a8, B:20:0x00d1, B:19:0x00bd), top: B:23:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00bd A[Catch: IOException -> 0x00d8, TryCatch #0 {IOException -> 0x00d8, blocks: (B:16:0x009e, B:18:0x00a8, B:20:0x00d1, B:19:0x00bd), top: B:23:0x009e }] */
    @Override // java.security.Key
    public byte[] getEncoded() {
        eqr eqrVar;
        int i;
        m97 m97Var;
        PrivateKeyInfo privateKeyInfo;
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
                if (this.algorithm.equals("DSTU4145")) {
                    privateKeyInfo = new PrivateKeyInfo(new t51(f6q.c, eqrVar.toASN1Primitive()), m97Var.toASN1Primitive());
                } else {
                    privateKeyInfo = new PrivateKeyInfo(new t51(uqr.Ja, eqrVar.toASN1Primitive()), m97Var.toASN1Primitive());
                }
                return privateKeyInfo.f(ASN1Encoding.DER);
            }
            ee eeVarH = y97.h(((a97) eCParameterSpec).a());
            if (eeVarH == null) {
                eeVarH = new ee(((a97) this.ecSpec).a());
            }
            eqrVar = new eqr(eeVarH);
            if (this.algorithm.equals("DSTU4145")) {
                privateKeyInfo = new PrivateKeyInfo(new t51(f6q.c, eqrVar.toASN1Primitive()), m97Var.toASN1Primitive());
            } else {
                privateKeyInfo = new PrivateKeyInfo(new t51(uqr.Ja, eqrVar.toASN1Primitive()), m97Var.toASN1Primitive());
            }
            return privateKeyInfo.f(ASN1Encoding.DER);
        } catch (IOException unused) {
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

    public BCDSTU4145PrivateKey(q97 q97Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        throw null;
    }

    public BCDSTU4145PrivateKey(String str, o97 o97Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCDSTU4145PrivateKey(String str, o97 o97Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, f97 f97Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        throw null;
    }

    public BCDSTU4145PrivateKey(String str, o97 o97Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        throw null;
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new hgh();
        this.d = bCDSTU4145PrivateKey.d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }
}
