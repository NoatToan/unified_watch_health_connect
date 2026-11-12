package org.spongycastle.jcajce.provider.asymmetric.dstu;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.b87;
import defpackage.c87;
import defpackage.dqr;
import defpackage.e6q;
import defpackage.e97;
import defpackage.eai;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ggh;
import defpackage.gj5;
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
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, org.spongycastle.jce.interfaces.ECPrivateKey, egh {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient ggh attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient wf5 publicKey;
    private boolean withCompression;

    public BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
    }

    private wf5 getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return rno.i(pe.j(bCDSTU4145PublicKey.getEncoded())).j();
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
                c87 c87VarA = gj5.a(feVarW);
                this.ecSpec = new z87(feVarW.u(), s77.b(c87VarA.a(), c87VarA.e()), new ECPoint(c87VarA.b().f().s(), c87VarA.b().g().s()), c87VarA.d(), c87VarA.c());
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
        l97 l97VarG = l97.g(gdVarJ);
        this.d = l97VarG.h();
        this.publicKey = l97VarG.j();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(eai.h(pe.j((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new ggh();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public e97 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? s77.f(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.a();
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
        l97 l97Var = this.publicKey != null ? new l97(iE, getS(), this.publicKey, dqrVar) : new l97(iE, getS(), dqrVar);
        try {
            return (this.algorithm.equals("DSTU4145") ? new eai(new s51(e6q.c, dqrVar.toASN1Primitive()), l97Var.toASN1Primitive()) : new eai(new s51(tqr.r9, dqrVar.toASN1Primitive()), l97Var.toASN1Primitive())).f(ASN1Encoding.DER);
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

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(p97 p97Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        throw null;
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        this.d = bCDSTU4145PrivateKey.d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }

    public BCDSTU4145PrivateKey(String str, n97 n97Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        throw null;
    }

    public BCDSTU4145PrivateKey(String str, n97 n97Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, e97 e97Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        throw null;
    }

    public BCDSTU4145PrivateKey(String str, n97 n97Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        this.algorithm = str;
        throw null;
    }

    public BCDSTU4145PrivateKey(eai eaiVar) throws IOException {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new ggh();
        populateFromPrivKeyInfo(eaiVar);
    }
}
