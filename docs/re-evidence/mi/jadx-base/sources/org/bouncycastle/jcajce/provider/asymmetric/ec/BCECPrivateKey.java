package org.bouncycastle.jcajce.provider.asymmetric.ec;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ee;
import defpackage.eqr;
import defpackage.f97;
import defpackage.fei;
import defpackage.fgh;
import defpackage.h97;
import defpackage.hd;
import defpackage.hgh;
import defpackage.m97;
import defpackage.o97;
import defpackage.q97;
import defpackage.re;
import defpackage.t51;
import defpackage.t77;
import defpackage.uqr;
import defpackage.wd;
import defpackage.xf5;
import defpackage.y97;
import defpackage.z97;
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
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, fgh {
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm;
    private transient hgh attrCarrier;
    private transient fei configuration;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient xf5 publicKey;
    private boolean withCompression;

    public BCECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
    }

    private h97 calculateQ(f97 f97Var) {
        return f97Var.b().w(this.d).y();
    }

    private xf5 getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return SubjectPublicKeyInfo.i(re.j(bCECPublicKey.getEncoded())).j();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        eqr eqrVarG = eqr.g(privateKeyInfo.i().i());
        this.ecSpec = t77.i(eqrVarG, t77.j(this.configuration, eqrVarG));
        hd hdVarJ = privateKeyInfo.j();
        if (hdVarJ instanceof wd) {
            this.d = wd.o(hdVarJ).r();
            return;
        }
        m97 m97VarG = m97.g(hdVarJ);
        this.d = m97VarG.h();
        this.publicKey = m97VarG.j();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPrivKeyInfo(PrivateKeyInfo.h(re.j(bArr)));
        this.attrCarrier = new hgh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public f97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? t77.g(eCParameterSpec, this.withCompression) : this.configuration.a();
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
        eqr eqrVarA = z97.a(this.ecSpec, this.withCompression);
        ECParameterSpec eCParameterSpec = this.ecSpec;
        int i = eCParameterSpec == null ? y97.i(this.configuration, null, getS()) : y97.i(this.configuration, eCParameterSpec.getOrder(), getS());
        try {
            return new PrivateKeyInfo(new t51(uqr.Ja, eqrVarA), this.publicKey != null ? new m97(i, getS(), this.publicKey, eqrVarA) : new m97(i, getS(), eqrVarA)).f(ASN1Encoding.DER);
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
        return y97.j("EC", this.d, engineGetSpec());
    }

    public BCECPrivateKey(String str, o97 o97Var, fei feiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(String str, o97 o97Var, BCECPublicKey bCECPublicKey, f97 f97Var, fei feiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(String str, o97 o97Var, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, fei feiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(String str, q97 q97Var, fei feiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, fei feiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = feiVar;
    }

    public BCECPrivateKey(String str, PrivateKeyInfo privateKeyInfo, fei feiVar) throws IOException {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        this.configuration = feiVar;
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.algorithm = str;
        this.d = bCECPrivateKey.d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, fei feiVar) {
        this.algorithm = "EC";
        this.attrCarrier = new hgh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = feiVar;
    }
}
