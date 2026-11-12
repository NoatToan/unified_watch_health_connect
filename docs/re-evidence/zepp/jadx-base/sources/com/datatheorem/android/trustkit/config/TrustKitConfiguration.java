package com.datatheorem.android.trustkit.config;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class TrustKitConfiguration {

    @NonNull
    private final Set<DomainPinningPolicy> a;
    private final boolean b;

    @Nullable
    private final Set<Certificate> c;

    public TrustKitConfiguration(@NonNull Set<DomainPinningPolicy> set) {
        this(set, false, null);
    }

    private static boolean a(@NonNull String str, @NonNull String str2) {
        return str2.endsWith(str) && str2.charAt((str2.length() - str.length()) - 1) == '.';
    }

    public static TrustKitConfiguration fromXmlPolicy(@NonNull Context context, @NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, CertificateException {
        return b.b(context, xmlPullParser);
    }

    public Set<DomainPinningPolicy> getAllPolicies() {
        return this.a;
    }

    @Nullable
    public Set<Certificate> getDebugCaCertificates() {
        return this.c;
    }

    @Nullable
    public DomainPinningPolicy getPolicyForHostname(@NonNull String str) {
        if (!DomainValidator.f(true).i(str)) {
            throw new IllegalArgumentException("Invalid domain supplied: " + str);
        }
        DomainPinningPolicy domainPinningPolicy = null;
        for (DomainPinningPolicy domainPinningPolicy2 : this.a) {
            if (domainPinningPolicy2.getHostname().equals(str)) {
                return domainPinningPolicy2;
            }
            if (domainPinningPolicy2.shouldIncludeSubdomains() && a(domainPinningPolicy2.getHostname(), str) && (domainPinningPolicy == null || domainPinningPolicy2.getHostname().length() > domainPinningPolicy.getHostname().length())) {
                domainPinningPolicy = domainPinningPolicy2;
            }
        }
        return domainPinningPolicy;
    }

    public boolean shouldOverridePins() {
        return this.b;
    }

    public TrustKitConfiguration(@NonNull Set<DomainPinningPolicy> set, boolean z, @Nullable Set<Certificate> set2) {
        HashSet hashSet = new HashSet();
        for (DomainPinningPolicy domainPinningPolicy : set) {
            if (hashSet.contains(domainPinningPolicy.getHostname())) {
                throw new ConfigurationException("Policy contains the same domain defined twice: " + domainPinningPolicy.getHostname());
            }
            hashSet.add(domainPinningPolicy.getHostname());
        }
        this.a = set;
        this.b = z;
        this.c = set2;
    }
}
