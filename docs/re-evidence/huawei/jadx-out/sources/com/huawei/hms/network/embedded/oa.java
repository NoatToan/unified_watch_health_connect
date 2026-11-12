package com.huawei.hms.network.embedded;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes34.dex */
public final class oa extends qa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15154b = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta f15155a;

    public int hashCode() {
        return this.f15155a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof oa) && ((oa) obj).f15155a.equals(this.f15155a);
    }

    @Override // com.huawei.hms.network.embedded.qa
    public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateA = this.f15155a.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (a(x509CertificateA, x509CertificateA)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!a(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    private boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public oa(ta taVar) {
        this.f15155a = taVar;
    }
}
