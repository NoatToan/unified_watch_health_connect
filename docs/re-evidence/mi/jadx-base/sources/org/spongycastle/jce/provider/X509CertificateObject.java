package org.spongycastle.jce.provider;

import defpackage.cf;
import defpackage.dk8;
import defpackage.egh;
import defpackage.fe;
import defpackage.gd;
import defpackage.ge;
import defpackage.ggh;
import defpackage.i7c;
import defpackage.lg5;
import defpackage.lpr;
import defpackage.ls3;
import defpackage.oe;
import defpackage.oxa;
import defpackage.pe;
import defpackage.plo;
import defpackage.rd;
import defpackage.s51;
import defpackage.scd;
import defpackage.se;
import defpackage.t6j;
import defpackage.vf2;
import defpackage.wf5;
import defpackage.wj1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertificateObject extends X509Certificate implements egh {
    private egh attrCarrier = new ggh();
    private vf2 basicConstraints;
    private ls3 c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(ls3 ls3Var) throws CertificateParsingException {
        try {
            byte[] extensionBytes = getExtensionBytes("2.5.29.19");
            if (extensionBytes != null) {
                this.basicConstraints = vf2.g(pe.j(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes("2.5.29.15");
                if (extensionBytes2 == null) {
                    this.keyUsage = null;
                    return;
                }
                wf5 wf5VarV = wf5.v(pe.j(extensionBytes2));
                byte[] bArrR = wf5VarV.r();
                int length = (bArrR.length * 8) - wf5VarV.u();
                int i = 9;
                if (length >= 9) {
                    i = length;
                }
                this.keyUsage = new boolean[i];
                for (int i2 = 0; i2 != length; i2++) {
                    this.keyUsage[i2] = (bArrR[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                }
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e);
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e2);
        }
    }

    private int calculateHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    private void checkSignature(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        throw null;
    }

    private static Collection getAlternativeNames(byte[] bArr) throws CertificateParsingException {
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationU = se.q(bArr).u();
            while (enumerationU.hasMoreElements()) {
                oxa oxaVarG = oxa.g(enumerationU.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(scd.b(oxaVarG.i()));
                switch (oxaVarG.i()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(oxaVarG.e());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((cf) oxaVarG.h()).getString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        arrayList2.add(lpr.h(t6j.V, oxaVarG.h()).toString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(ge.q(oxaVarG.h()).r()).getHostAddress());
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                        break;
                    case 8:
                        arrayList2.add(fe.w(oxaVarG.h()).u());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException("Bad tag number: " + oxaVarG.i());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    private byte[] getExtensionBytes(String str) {
        throw null;
    }

    private boolean isAlgIdEqual(s51 s51Var, s51 s51Var2) {
        if (!s51Var.g().equals(s51Var2.g())) {
            return false;
        }
        if (s51Var.i() == null) {
            return s51Var2.i() == null || s51Var2.i().equals(lg5.f25030a);
        }
        if (s51Var2.i() == null) {
            return s51Var.i() == null || s51Var.i().equals(lg5.f25030a);
        }
        return s51Var.i().equals(s51Var2.i());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return wj1.a(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // defpackage.egh
    public gd getBagAttribute(fe feVar) {
        return this.attrCarrier.getBagAttribute(feVar);
    }

    @Override // defpackage.egh
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        vf2 vf2Var = this.basicConstraints;
        if (vf2Var == null || !vf2Var.i()) {
            return -1;
        }
        if (this.basicConstraints.h() == null) {
            return Integer.MAX_VALUE;
        }
        return this.basicConstraints.h().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        new HashSet();
        throw null;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] extensionBytes = getExtensionBytes("2.5.29.37");
        if (extensionBytes == null) {
            return null;
        }
        try {
            se seVar = (se) new rd(extensionBytes).s();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != seVar.size(); i++) {
                arrayList.add(((fe) seVar.t(i)).u());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(dk8.f.u()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        try {
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            new oe(new ByteArrayOutputStream());
            throw null;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.keyUsage;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        new HashSet();
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        throw null;
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(dk8.e.u()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            new oe(new ByteArrayOutputStream());
            throw null;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        if (getVersion() != 3) {
            return false;
        }
        throw null;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        try {
            if (!this.hashValueSet) {
                this.hashValue = calculateHashCode();
                this.hashValueSet = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hashValue;
    }

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        this.attrCarrier.setBagAttribute(feVar, gdVar);
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = plo.d();
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(strD);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(strD);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(strD);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(strD);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(strD);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(strD);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(strD);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(strD);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(i7c.c(signature, 0, 20)));
        stringBuffer.append(strD);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(i7c.c(signature, i, 20)));
                stringBuffer.append(strD);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(i7c.c(signature, i, signature.length - i)));
                stringBuffer.append(strD);
            }
        }
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            new StringBuilder().append("certificate expired on ");
            throw null;
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        new StringBuilder().append("certificate not valid till ");
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        throw null;
    }
}
