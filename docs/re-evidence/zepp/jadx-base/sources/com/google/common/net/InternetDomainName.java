package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.Immutable;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Beta
@GwtCompatible
public final class InternetDomainName {
    private static final CharMatcher e = CharMatcher.anyOf(".。．｡");
    private static final Splitter f = Splitter.on('.');
    private static final Joiner g = Joiner.on('.');
    private static final int h = -1;
    private static final int i = 127;
    private static final int j = 253;
    private static final int k = 63;
    private static final CharMatcher l;
    private static final CharMatcher m;
    private final String a;
    private final ImmutableList<String> b;
    private final int c;
    private final int d;

    static {
        CharMatcher charMatcherAnyOf = CharMatcher.anyOf("-_");
        l = charMatcherAnyOf;
        m = CharMatcher.javaLetterOrDigit().or(charMatcherAnyOf);
    }

    public InternetDomainName(String str) {
        String lowerCase = Ascii.toLowerCase(e.replaceFrom((CharSequence) str, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        Preconditions.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.a = lowerCase;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf(f.split(lowerCase));
        this.b = immutableListCopyOf;
        Preconditions.checkArgument(immutableListCopyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        Preconditions.checkArgument(f(immutableListCopyOf), "Not a valid domain name: '%s'", lowerCase);
        this.c = b(Optional.absent());
        this.d = b(Optional.of(PublicSuffixType.REGISTRY));
    }

    private InternetDomainName a(int i2) {
        Joiner joiner = g;
        ImmutableList<String> immutableList = this.b;
        return from(joiner.join(immutableList.subList(i2, immutableList.size())));
    }

    private int b(Optional<PublicSuffixType> optional) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strJoin = g.join(this.b.subList(i2, size));
            if (c(optional, Optional.fromNullable(PublicSuffixPatterns.EXACT.get(strJoin)))) {
                return i2;
            }
            if (PublicSuffixPatterns.EXCLUDED.containsKey(strJoin)) {
                return i2 + 1;
            }
            if (d(optional, strJoin)) {
                return i2;
            }
        }
        return -1;
    }

    private static boolean c(Optional<PublicSuffixType> optional, Optional<PublicSuffixType> optional2) {
        return optional.isPresent() ? optional.equals(optional2) : optional2.isPresent();
    }

    private static boolean d(Optional<PublicSuffixType> optional, String str) {
        List<String> listSplitToList = f.limit(2).splitToList(str);
        return listSplitToList.size() == 2 && c(optional, Optional.fromNullable(PublicSuffixPatterns.UNDER.get(listSplitToList.get(1))));
    }

    private static boolean e(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!m.matchesAllOf(CharMatcher.ascii().retainFrom(str))) {
                return false;
            }
            CharMatcher charMatcher = l;
            if (!charMatcher.matches(str.charAt(0)) && !charMatcher.matches(str.charAt(str.length() - 1))) {
                return (z && CharMatcher.digit().matches(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    private static boolean f(List<String> list) {
        int size = list.size() - 1;
        if (!e(list.get(size), true)) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!e(list.get(i2), false)) {
                return false;
            }
        }
        return true;
    }

    public static InternetDomainName from(String str) {
        return new InternetDomainName((String) Preconditions.checkNotNull(str));
    }

    public static boolean isValid(String str) {
        try {
            from(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public InternetDomainName child(String str) {
        return from(((String) Preconditions.checkNotNull(str)) + "." + this.a);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.a.equals(((InternetDomainName) obj).a);
        }
        return false;
    }

    public boolean hasParent() {
        return this.b.size() > 1;
    }

    public boolean hasPublicSuffix() {
        return this.c != -1;
    }

    public boolean hasRegistrySuffix() {
        return this.d != -1;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isPublicSuffix() {
        return this.c == 0;
    }

    public boolean isRegistrySuffix() {
        return this.d == 0;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        return this.d == 1;
    }

    public boolean isTopPrivateDomain() {
        return this.c == 1;
    }

    public boolean isUnderPublicSuffix() {
        return this.c > 0;
    }

    public boolean isUnderRegistrySuffix() {
        return this.d > 0;
    }

    public InternetDomainName parent() {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.a);
        return a(1);
    }

    public ImmutableList<String> parts() {
        return this.b;
    }

    public InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return a(this.c);
        }
        return null;
    }

    public InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return a(this.d);
        }
        return null;
    }

    public String toString() {
        return this.a;
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.a);
        return a(this.d - 1);
    }

    public InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.a);
        return a(this.c - 1);
    }
}
