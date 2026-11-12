package com.datatheorem.android.trustkit.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class DomainPinningPolicy {
    private static final URL g;

    @NonNull
    private final String a;
    private final boolean b;

    @NonNull
    private final Set<PublicKeyPin> c;

    @Nullable
    private final Date d;
    private final boolean e;

    @NonNull
    private final Set<URL> f;

    public static final class Builder {
        private String a;
        private Boolean b;
        private Set<String> c;
        private Date d;
        private Boolean e;
        private Set<String> f;
        private Boolean g;
        private Builder h = null;

        public Date a() {
            return this.d;
        }

        public Set<String> b() {
            return this.c;
        }

        @Nullable
        public DomainPinningPolicy build() throws MalformedURLException {
            Builder builder = this.h;
            if (builder != null) {
                if (this.b == null) {
                    this.b = builder.f();
                }
                if (this.c == null) {
                    this.c = this.h.b();
                }
                if (this.d == null) {
                    this.d = this.h.a();
                }
                if (this.e == null) {
                    this.e = this.h.e();
                }
                if (this.f == null) {
                    this.f = this.h.c();
                }
                if (this.g == null) {
                    this.g = this.h.d();
                }
            }
            if (this.c == null) {
                return null;
            }
            return new DomainPinningPolicy(this.a, this.b, this.c, this.e, this.d, this.f, this.g);
        }

        public Set<String> c() {
            return this.f;
        }

        public Boolean d() {
            return this.g;
        }

        public Boolean e() {
            return this.e;
        }

        public Boolean f() {
            return this.b;
        }

        public Builder setExpirationDate(Date date) {
            this.d = date;
            return this;
        }

        public Builder setHostname(String str) {
            this.a = str;
            return this;
        }

        public Builder setParent(Builder builder) {
            for (Builder builder2 = builder; builder2 != null; builder2 = builder2.h) {
                if (builder2 == this) {
                    throw new IllegalArgumentException("Loops are not allowed in Builder parents");
                }
            }
            this.h = builder;
            return this;
        }

        public Builder setPublicKeyHashes(Set<String> set) {
            this.c = set;
            return this;
        }

        public Builder setReportUris(Set<String> set) {
            this.f = set;
            return this;
        }

        public Builder setShouldDisableDefaultReportUri(Boolean bool) {
            this.g = bool;
            return this;
        }

        public Builder setShouldEnforcePinning(Boolean bool) {
            this.e = bool;
            return this;
        }

        public Builder setShouldIncludeSubdomains(Boolean bool) {
            this.b = bool;
            return this;
        }
    }

    static {
        try {
            g = new URL("https://overmind.datatheorem.com/trustkit/report");
        } catch (MalformedURLException unused) {
            throw new IllegalStateException("Bad DEFAULT_REPORTING_URL");
        }
    }

    public DomainPinningPolicy(@NonNull String str, Boolean bool, Set<String> set, Boolean bool2, @Nullable Date date, @Nullable Set<String> set2, Boolean bool3) throws MalformedURLException {
        if (!DomainValidator.e().i(str)) {
            throw new ConfigurationException("Tried to pin an invalid domain: " + str);
        }
        String strTrim = str.trim();
        this.a = strTrim;
        set = set == null ? new HashSet<>() : set;
        if (bool2 == null) {
            this.e = false;
        } else {
            this.e = bool2.booleanValue();
        }
        if (bool == null) {
            this.b = false;
        } else {
            this.b = bool.booleanValue();
        }
        if (set.isEmpty() && this.e) {
            throw new ConfigurationException("An empty pin-set was supplied for domain " + strTrim + " with the enforcePinning set to true. An empty pin-set disables pinning and can't be use with enforcePinning set to true.");
        }
        if (set.size() < 2 && this.e) {
            throw new ConfigurationException("Less than two pins were supplied for domain " + strTrim + ". This might brick your App; please review the Getting Started guide in ./docs/getting-started.md");
        }
        this.c = new HashSet();
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            this.c.add(new PublicKeyPin(it2.next()));
        }
        this.f = new HashSet();
        if (set2 != null) {
            Iterator<String> it3 = set2.iterator();
            while (it3.hasNext()) {
                this.f.add(new URL(it3.next()));
            }
        }
        if (bool3 == null || !bool3.booleanValue()) {
            this.f.add(g);
        }
        this.d = date;
    }

    @Nullable
    public Date getExpirationDate() {
        return this.d;
    }

    @NonNull
    public String getHostname() {
        return this.a;
    }

    @NonNull
    public Set<PublicKeyPin> getPublicKeyPins() {
        return this.c;
    }

    @NonNull
    public Set<URL> getReportUris() {
        return this.f;
    }

    public boolean shouldEnforcePinning() {
        return this.e;
    }

    public boolean shouldIncludeSubdomains() {
        return this.b;
    }

    public String toString() {
        return "DomainPinningPolicy{hostname = " + this.a + "\nknownPins = " + Arrays.toString(this.c.toArray()) + "\nshouldEnforcePinning = " + this.e + "\nreportUris = " + this.f + "\nshouldIncludeSubdomains = " + this.b + "\n}";
    }
}
