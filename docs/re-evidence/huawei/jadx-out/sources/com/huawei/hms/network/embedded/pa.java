package com.huawei.hms.network.embedded;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes34.dex */
public final class pa implements ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<X500Principal, Set<X509Certificate>> f15208a = new LinkedHashMap();

    public int hashCode() {
        return this.f15208a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pa) && ((pa) obj).f15208a.equals(this.f15208a);
    }

    @Override // com.huawei.hms.network.embedded.ta
    public X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f15208a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public pa(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f15208a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f15208a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }
}
