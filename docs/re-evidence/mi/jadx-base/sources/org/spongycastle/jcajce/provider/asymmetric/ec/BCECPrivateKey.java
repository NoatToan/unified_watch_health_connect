package org.spongycastle.jcajce.provider.asymmetric.ec;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.b87;
import defpackage.dqr;
import defpackage.e97;
import defpackage.eai;
import defpackage.eei;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.hqr;
import defpackage.l97;
import defpackage.lg5;
import defpackage.n97;
import defpackage.p97;
import defpackage.pe;
import defpackage.plo;
import defpackage.rno;
import defpackage.s51;
import defpackage.s77;
import defpackage.tqr;
import defpackage.vd;
import defpackage.wf5;
import defpackage.x97;
import defpackage.z87;
import defpackage.zd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPrivateKey implements ECPrivateKey, org.spongycastle.jce.interfaces.ECPrivateKey, egh {
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm;
    private transient ggh attrCarrier;
    private transient eei configuration;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient wf5 publicKey;
    private boolean withCompression;

    public BCECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
    }

    private wf5 getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return rno.i(pe.j(bCECPublicKey.getEncoded())).j();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(eai eaiVar) throws IOException {
        dqr dqrVarG = dqr.g(eaiVar.i().i());
        this.ecSpec = s77.g(dqrVarG, s77.h(this.configuration, dqrVarG));
        gd gdVarJ = eaiVar.j();
        if (gdVarJ instanceof vd) {
            this.d = vd.o(gdVarJ).r();
            return;
        }
        l97 l97VarG = l97.g(gdVarJ);
        this.d = l97VarG.h();
        this.publicKey = l97VarG.j();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(eai.h(pe.j((byte[]) objectInputStream.readObject())));
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        this.attrCarrier = new ggh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public e97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? s77.f(eCParameterSpec, this.withCompression) : this.configuration.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // defpackage.egh
    public gd getBagAttribute(fe feVar) {
        return this.attrCarrier.getBagAttribute(feVar);
    }

    @Override // defpackage.egh
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.spongycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        dqr dqrVar;
        int iE;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof z87) {
            fe feVarD = x97.d(((z87) eCParameterSpec).a());
            if (feVarD == null) {
                feVarD = new fe(((z87) this.ecSpec).a());
            }
            dqrVar = new dqr(feVarD);
            iE = x97.e(this.ecSpec.getOrder(), getS());
        } else if (eCParameterSpec == null) {
            dqrVar = new dqr((zd) lg5.f25030a);
            iE = x97.e(null, getS());
        } else {
            b87 b87VarA = s77.a(eCParameterSpec.getCurve());
            dqrVar = new dqr(new hqr(b87VarA, s77.d(b87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            iE = x97.e(this.ecSpec.getOrder(), getS());
        }
        try {
            return new eai(new s51(tqr.r9, dqrVar), this.publicKey != null ? new l97(iE, getS(), this.publicKey, dqrVar) : new l97(iE, getS(), dqrVar)).f(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.spongycastle.jce.interfaces.ECPrivateKey
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

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        this.attrCarrier.setBagAttribute(feVar, gdVar);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = plo.d();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(strD);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.d.toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, eei eeiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = eeiVar;
    }

    public BCECPrivateKey(String str, p97 p97Var, eei eeiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, eei eeiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = eeiVar;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        this.d = bCECPrivateKey.d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(String str, n97 n97Var, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, eei eeiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        throw null;
    }

    public BCECPrivateKey(String str, n97 n97Var, BCECPublicKey bCECPublicKey, e97 e97Var, eei eeiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        throw null;
    }

    public BCECPrivateKey(String str, n97 n97Var, eei eeiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(String str, eai eaiVar, eei eeiVar) throws IOException {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        this.configuration = eeiVar;
        populateFromPrivKeyInfo(eaiVar);
    }
}
