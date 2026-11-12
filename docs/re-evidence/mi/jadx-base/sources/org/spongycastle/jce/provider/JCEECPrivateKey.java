package org.spongycastle.jce.provider;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.b87;
import defpackage.c87;
import defpackage.dqr;
import defpackage.e97;
import defpackage.eai;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.hqr;
import defpackage.lg5;
import defpackage.n97;
import defpackage.p87;
import defpackage.p97;
import defpackage.pe;
import defpackage.plo;
import defpackage.r97;
import defpackage.rno;
import defpackage.s51;
import defpackage.s77;
import defpackage.se;
import defpackage.t45;
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
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPrivateKey implements ECPrivateKey, org.spongycastle.jce.interfaces.ECPrivateKey, egh {
    private String algorithm;
    private ggh attrCarrier;
    private BigInteger d;
    private ECParameterSpec ecSpec;
    private wf5 publicKey;
    private boolean withCompression;

    public JCEECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
    }

    private wf5 getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return rno.i(pe.j(jCEECPublicKey.getEncoded())).j();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(eai eaiVar) throws IOException {
        dqr dqrVar = new dqr((pe) eaiVar.i().i());
        if (dqrVar.j()) {
            fe feVarW = fe.w(dqrVar.h());
            hqr hqrVarC = x97.c(feVarW);
            if (hqrVarC == null) {
                c87 c87VarB = p87.b(feVarW);
                this.ecSpec = new z87(p87.c(feVarW), s77.b(c87VarB.a(), c87VarB.e()), new ECPoint(c87VarB.b().f().s(), c87VarB.b().g().s()), c87VarB.d(), c87VarB.c());
            } else {
                this.ecSpec = new z87(x97.b(feVarW), s77.b(hqrVarC.g(), hqrVarC.l()), new ECPoint(hqrVarC.h().f().s(), hqrVarC.h().g().s()), hqrVarC.k(), hqrVarC.i());
            }
        } else if (dqrVar.i()) {
            this.ecSpec = null;
        } else {
            hqr hqrVarJ = hqr.j(dqrVar.h());
            this.ecSpec = new ECParameterSpec(s77.b(hqrVarJ.g(), hqrVarJ.l()), new ECPoint(hqrVarJ.h().f().s(), hqrVarJ.h().g().s()), hqrVarJ.k(), hqrVarJ.i().intValue());
        }
        gd gdVarJ = eaiVar.j();
        if (gdVarJ instanceof vd) {
            this.d = vd.o(gdVarJ).r();
            return;
        }
        r97 r97Var = new r97((se) gdVarJ);
        this.d = r97Var.g();
        this.publicKey = r97Var.i();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPrivKeyInfo(eai.h(pe.j((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        ggh gghVar = new ggh();
        this.attrCarrier = gghVar;
        gghVar.a(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.b(objectOutputStream);
    }

    public e97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? s77.f(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
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
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof z87) {
            fe feVarD = x97.d(((z87) eCParameterSpec).a());
            if (feVarD == null) {
                feVarD = new fe(((z87) this.ecSpec).a());
            }
            dqrVar = new dqr(feVarD);
        } else if (eCParameterSpec == null) {
            dqrVar = new dqr((zd) lg5.f25030a);
        } else {
            b87 b87VarA = s77.a(eCParameterSpec.getCurve());
            dqrVar = new dqr(new hqr(b87VarA, s77.d(b87VarA, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        r97 r97Var = this.publicKey != null ? new r97(getS(), this.publicKey, dqrVar) : new r97(getS(), dqrVar);
        try {
            return (this.algorithm.equals("ECGOST3410") ? new eai(new s51(t45.j, dqrVar.toASN1Primitive()), r97Var.toASN1Primitive()) : new eai(new s51(tqr.r9, dqrVar.toASN1Primitive()), r97Var.toASN1Primitive())).f(ASN1Encoding.DER);
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

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public JCEECPrivateKey(String str, p97 p97Var) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        throw null;
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        this.d = jCEECPrivateKey.d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(String str, n97 n97Var, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        throw null;
    }

    public JCEECPrivateKey(String str, n97 n97Var, JCEECPublicKey jCEECPublicKey, e97 e97Var) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        throw null;
    }

    public JCEECPrivateKey(String str, n97 n97Var) {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        throw null;
    }

    public JCEECPrivateKey(eai eaiVar) throws IOException {
        this.algorithm = "EC";
        this.attrCarrier = new ggh();
        populateFromPrivKeyInfo(eaiVar);
    }
}
