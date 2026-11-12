package com.huawei.hms.network.embedded;

import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes34.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7 f14915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6 f14916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Certificate> f14917c;
    public final List<Certificate> d;

    public String toString() {
        return "Handshake{tlsVersion=" + this.f14915a + " cipherSuite=" + this.f14916b + " peerCertificates=" + a(this.f14917c) + " localCertificates=" + a(this.d) + '}';
    }

    public int hashCode() {
        return ((((((this.f14915a.hashCode() + 527) * 31) + this.f14916b.hashCode()) * 31) + this.f14917c.hashCode()) * 31) + this.d.hashCode();
    }

    public y7 f() {
        return this.f14915a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return this.f14915a.equals(i7Var.f14915a) && this.f14916b.equals(i7Var.f14916b) && this.f14917c.equals(i7Var.f14917c) && this.d.equals(i7Var.d);
    }

    @Nullable
    public Principal e() {
        if (this.f14917c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f14917c.get(0)).getSubjectX500Principal();
    }

    public List<Certificate> d() {
        return this.f14917c;
    }

    @Nullable
    public Principal c() {
        if (this.d.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.d.get(0)).getSubjectX500Principal();
    }

    public List<Certificate> b() {
        return this.d;
    }

    public x6 a() {
        return this.f14916b;
    }

    private List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public static i7 a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        x6 x6VarA = x6.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (HealthDataMergePolicy.NONE.equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        y7 y7VarA = y7.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? f8.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new i7(y7VarA, x6VarA, listA, localCertificates != null ? f8.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public static i7 a(y7 y7Var, x6 x6Var, List<Certificate> list, List<Certificate> list2) {
        if (y7Var == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (x6Var != null) {
            return new i7(y7Var, x6Var, f8.a(list), f8.a(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }

    public i7(y7 y7Var, x6 x6Var, List<Certificate> list, List<Certificate> list2) {
        this.f14915a = y7Var;
        this.f14916b = x6Var;
        this.f14917c = list;
        this.d = list2;
    }
}
