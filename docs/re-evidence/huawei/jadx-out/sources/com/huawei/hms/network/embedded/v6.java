package com.huawei.hms.network.embedded;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes34.dex */
public final class v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v6 f15493c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<b> f15494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final qa f15495b;

    public int hashCode() {
        return (Objects.hashCode(this.f15495b) * 31) + this.f15494a.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return Objects.equals(this.f15495b, v6Var.f15495b) && this.f15494a.equals(v6Var.f15494a);
    }

    public void a(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        a(str, Arrays.asList(certificateArr));
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        qa qaVar = this.f15495b;
        if (qaVar != null) {
            list = qaVar.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listA.size();
            eb ebVarB = null;
            eb ebVarA = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = listA.get(i2);
                if (bVar.f15499c.equals("sha256/")) {
                    if (ebVarB == null) {
                        ebVarB = b(x509Certificate);
                    }
                    if (bVar.d.equals(ebVarB)) {
                        return;
                    }
                } else {
                    if (!bVar.f15499c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f15499c);
                    }
                    if (ebVarA == null) {
                        ebVarA = a(x509Certificate);
                    }
                    if (bVar.d.equals(ebVarA)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listA.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = listA.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public List<b> a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f15494a) {
            if (bVar.a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static final class b {
        public static final String e = "*.";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15499c;
        public final eb d;

        public String toString() {
            return this.f15499c + this.d.b();
        }

        public int hashCode() {
            return ((((this.f15497a.hashCode() + 527) * 31) + this.f15499c.hashCode()) * 31) + this.d.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15497a.equals(bVar.f15497a) && this.f15499c.equals(bVar.f15499c) && this.d.equals(bVar.d);
        }

        public boolean a(String str) {
            if (!this.f15497a.startsWith(e)) {
                return str.equals(this.f15498b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f15498b.length()) {
                return false;
            }
            String str2 = this.f15498b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public b(String str, String str2) {
            StringBuilder sb;
            int i;
            this.f15497a = str;
            if (str.startsWith(e)) {
                sb = new StringBuilder("http://");
                str = str.substring(2);
            } else {
                sb = new StringBuilder("http://");
            }
            sb.append(str);
            this.f15498b = m7.f(sb.toString()).h();
            if (str2.startsWith("sha1/")) {
                this.f15499c = "sha1/";
                i = 5;
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                }
                this.f15499c = "sha256/";
                i = 7;
            }
            eb ebVarA = eb.a(str2.substring(i));
            this.d = ebVarA;
            if (ebVarA != null) {
                return;
            }
            throw new IllegalArgumentException("pins must be base64: " + str2);
        }
    }

    public v6 a(@Nullable qa qaVar) {
        return Objects.equals(this.f15495b, qaVar) ? this : new v6(this.f15494a, qaVar);
    }

    public static eb b(X509Certificate x509Certificate) {
        return eb.e(x509Certificate.getPublicKey().getEncoded()).h();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f15496a = new ArrayList();

        public v6 a() {
            return new v6(new LinkedHashSet(this.f15496a), null);
        }

        public a a(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.f15496a.add(new b(str, str2));
            }
            return this;
        }
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + b((X509Certificate) certificate).b();
    }

    public static eb a(X509Certificate x509Certificate) {
        return eb.e(x509Certificate.getPublicKey().getEncoded()).g();
    }

    public v6(Set<b> set, @Nullable qa qaVar) {
        this.f15494a = set;
        this.f15495b = qaVar;
    }
}
