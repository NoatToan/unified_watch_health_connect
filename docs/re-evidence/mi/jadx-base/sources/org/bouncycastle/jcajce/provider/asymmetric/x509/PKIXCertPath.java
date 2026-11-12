package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.ch5;
import defpackage.hd;
import defpackage.hqh;
import defpackage.jd;
import defpackage.jgh;
import defpackage.lqh;
import defpackage.mh4;
import defpackage.nt1;
import defpackage.re;
import defpackage.te;
import defpackage.ud;
import defpackage.wd;
import defpackage.xbm;
import defpackage.yg5;
import defpackage.zqd;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final zqd helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        nt1 nt1Var = new nt1();
        this.helper = nt1Var;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: " + str);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                CertificateFactory certificateFactoryA = nt1Var.a("X.509");
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactoryA.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.certificates.add(certificateGenerateCertificate);
                    }
                }
            } else {
                re reVarS = new ud(inputStream).s();
                if (!(reVarS instanceof te)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumerationU = ((te) reVarS).u();
                this.certificates = new ArrayList();
                CertificateFactory certificateFactoryA2 = nt1Var.a("X.509");
                while (enumerationU.hasMoreElements()) {
                    this.certificates.add(0, certificateFactoryA2.generateCertificate(new ByteArrayInputStream(((hd) enumerationU.nextElement()).toASN1Primitive().f(ASN1Encoding.DER))));
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e2.toString());
        }
    }

    private List sortCerts(List list) {
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        for (int i = 1; i != list.size(); i++) {
            if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                ArrayList arrayList = new ArrayList(list.size());
                ArrayList arrayList2 = new ArrayList(list);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                    int i3 = 0;
                    while (true) {
                        if (i3 == list.size()) {
                            arrayList.add(x509Certificate);
                            list.remove(i2);
                            break;
                        }
                        if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                            break;
                        }
                        i3++;
                    }
                }
                if (arrayList.size() > 1) {
                    return arrayList2;
                }
                for (int i4 = 0; i4 != arrayList.size(); i4++) {
                    X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                        if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                            arrayList.add(x509Certificate2);
                            list.remove(i5);
                            break;
                        }
                    }
                }
                return list.size() > 0 ? arrayList2 : arrayList;
            }
            issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
        }
        return list;
    }

    private re toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new ud(x509Certificate.getEncoded()).s();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e.toString());
        }
    }

    private byte[] toDEREncoded(hd hdVar) throws CertificateEncodingException {
        try {
            return hdVar.toASN1Primitive().f(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }

    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new nt1();
        this.certificates = sortCerts(new ArrayList(list));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            jd jdVar = new jd();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                jdVar.a(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new yg5(jdVar));
        }
        int i = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            mh4 mh4Var = new mh4(jgh.e7, null);
            jd jdVar2 = new jd();
            while (i != this.certificates.size()) {
                jdVar2.a(toASN1Object((X509Certificate) this.certificates.get(i)));
                i++;
            }
            return toDEREncoded(new mh4(jgh.f7, new xbm(new wd(1L), new ch5(), mh4Var, new ch5(jdVar2), null, new ch5())));
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lqh lqhVar = new lqh(new OutputStreamWriter(byteArrayOutputStream));
        while (i != this.certificates.size()) {
            try {
                lqhVar.b(new hqh("CERTIFICATE", ((X509Certificate) this.certificates.get(i)).getEncoded()));
                i++;
            } catch (Exception unused) {
                throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
        }
        lqhVar.close();
        return byteArrayOutputStream.toByteArray();
    }
}
