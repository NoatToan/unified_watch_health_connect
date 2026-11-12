package org.bouncycastle.jce.provider;

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
import defpackage.hgh;
import defpackage.iqr;
import defpackage.mg5;
import defpackage.o97;
import defpackage.olo;
import defpackage.q87;
import defpackage.q97;
import defpackage.re;
import defpackage.s97;
import defpackage.t51;
import defpackage.t77;
import defpackage.te;
import defpackage.u45;
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

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, fgh {
    private String algorithm;
    private hgh attrCarrier;
    private BigInteger d;
    private ECParameterSpec ecSpec;
    private xf5 publicKey;
    private boolean withCompression;

    public JCEECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
    }

    private xf5 getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return SubjectPublicKeyInfo.i(re.j(jCEECPublicKey.getEncoded())).j();
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
            s97 s97Var = new s97((te) hdVarJ);
            this.d = s97Var.g();
            this.publicKey = s97Var.i();
        }
        ee eeVarW = ee.w(eqrVar.h());
        iqr iqrVarG = y97.g(eeVarW);
        if (iqrVarG == null) {
            d87 d87VarB = q87.b(eeVarW);
            eCParameterSpec = new a97(q87.c(eeVarW), t77.b(d87VarB.a(), d87VarB.e()), t77.f(d87VarB.b()), d87VarB.d(), d87VarB.c());
        } else {
            eCParameterSpec = new a97(y97.d(eeVarW), t77.b(iqrVarG.g(), iqrVarG.l()), t77.f(iqrVarG.h()), iqrVarG.k(), iqrVarG.i());
        }
        this.ecSpec = eCParameterSpec;
        hdVarJ = privateKeyInfo.j();
        if (hdVarJ instanceof wd) {
            this.d = wd.o(hdVarJ).r();
            return;
        }
        s97 s97Var2 = new s97((te) hdVarJ);
        this.d = s97Var2.g();
        this.publicKey = s97Var2.i();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPrivKeyInfo(PrivateKeyInfo.h(re.j((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        hgh hghVar = new hgh();
        this.attrCarrier = hghVar;
        hghVar.a(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.b(objectOutputStream);
    }

    public f97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? t77.g(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
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

    @Override // java.security.Key
    public byte[] getEncoded() {
        eqr eqrVar;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof a97) {
            ee eeVarH = y97.h(((a97) eCParameterSpec).a());
            if (eeVarH == null) {
                eeVarH = new ee(((a97) this.ecSpec).a());
            }
            eqrVar = new eqr(eeVarH);
        } else if (eCParameterSpec == null) {
            eqrVar = new eqr((ae) mg5.f26130a);
        } else {
            a87 a87VarA = t77.a(eCParameterSpec.getCurve());
            eqrVar = new eqr(new iqr(a87VarA, t77.d(a87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        s97 s97Var = this.publicKey != null ? new s97(getS(), this.publicKey, eqrVar) : new s97(getS(), eqrVar);
        try {
            return (this.algorithm.equals("ECGOST3410") ? new PrivateKeyInfo(new t51(u45.m, eqrVar.toASN1Primitive()), s97Var.toASN1Primitive()) : new PrivateKeyInfo(new t51(uqr.Ja, eqrVar.toASN1Primitive()), s97Var.toASN1Primitive())).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
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
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(strD);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.d.toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public JCEECPrivateKey(String str, o97 o97Var) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public JCEECPrivateKey(String str, o97 o97Var, JCEECPublicKey jCEECPublicKey, f97 f97Var) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public JCEECPrivateKey(String str, o97 o97Var, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public JCEECPrivateKey(String str, q97 q97Var) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        this.d = jCEECPrivateKey.d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public JCEECPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        populateFromPrivKeyInfo(privateKeyInfo);
    }
}
