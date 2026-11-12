package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class CacheBuilderSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    Integer f4220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    Integer f4221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    LocalCache.Strength f4222c;

    @CheckForNull
    TimeUnit d;
    long e;

    @CheckForNull
    Boolean f;

    @CheckForNull
    Long g;

    @CheckForNull
    Long h;
    long i;

    @CheckForNull
    TimeUnit j;

    @CheckForNull
    TimeUnit l;
    long m;

    @CheckForNull
    LocalCache.Strength o;
    private final String q;
    private static final Splitter n = Splitter.on(',').trimResults();
    private static final Splitter k = Splitter.on('=').trimResults();
    private static final ImmutableMap<String, ValueParser> t = ImmutableMap.builder().c("initialCapacity", new a()).c("maximumSize", new d()).c("maximumWeight", new g()).c("concurrencyLevel", new b()).c("weakKeys", new c(LocalCache.Strength.WEAK)).c("softValues", new j(LocalCache.Strength.SOFT)).c("weakValues", new j(LocalCache.Strength.WEAK)).c("recordStats", new f()).c("expireAfterAccess", new e()).c("expireAfterWrite", new i()).c("refreshAfterWrite", new h()).c("refreshInterval", new h()).j();

    interface ValueParser {
        void parse(CacheBuilderSpec cacheBuilderSpec, String str, @CheckForNull String str2);
    }

    public String c() {
        return this.q;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(c()).toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.f4220a, this.h, this.g, this.f4221b, this.f4222c, this.o, this.f, a(this.m, this.l), a(this.e, this.d), a(this.i, this.j));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        return Objects.equal(this.f4220a, cacheBuilderSpec.f4220a) && Objects.equal(this.h, cacheBuilderSpec.h) && Objects.equal(this.g, cacheBuilderSpec.g) && Objects.equal(this.f4221b, cacheBuilderSpec.f4221b) && Objects.equal(this.f4222c, cacheBuilderSpec.f4222c) && Objects.equal(this.o, cacheBuilderSpec.o) && Objects.equal(this.f, cacheBuilderSpec.f) && Objects.equal(a(this.m, this.l), a(cacheBuilderSpec.m, cacheBuilderSpec.l)) && Objects.equal(a(this.e, this.d), a(cacheBuilderSpec.e, cacheBuilderSpec.d)) && Objects.equal(a(this.i, this.j), a(cacheBuilderSpec.i, cacheBuilderSpec.j));
    }

    @CheckForNull
    private static Long a(long j2, @CheckForNull TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }

    static abstract class IntegerParser implements ValueParser {
        protected abstract void parseInteger(CacheBuilderSpec cacheBuilderSpec, int i);

        IntegerParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (Strings.isNullOrEmpty(str2)) {
                throw new IllegalArgumentException("value of key " + str + " omitted");
            }
            try {
                parseInteger(cacheBuilderSpec, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.a("key %s value set to %s, must be integer", str, str2), e);
            }
        }
    }

    static abstract class LongParser implements ValueParser {
        protected abstract void parseLong(CacheBuilderSpec cacheBuilderSpec, long j);

        LongParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (Strings.isNullOrEmpty(str2)) {
                throw new IllegalArgumentException("value of key " + str + " omitted");
            }
            try {
                parseLong(cacheBuilderSpec, Long.parseLong(str2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.a("key %s value set to %s, must be integer", str, str2), e);
            }
        }
    }

    static class a extends IntegerParser {
        a() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(CacheBuilderSpec cacheBuilderSpec, int i) {
            Preconditions.checkArgument(cacheBuilderSpec.f4220a == null, "initial capacity was already set to %s", cacheBuilderSpec.f4220a);
            cacheBuilderSpec.f4220a = Integer.valueOf(i);
        }
    }

    static class d extends LongParser {
        d() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(CacheBuilderSpec cacheBuilderSpec, long j) {
            Preconditions.checkArgument(cacheBuilderSpec.h == null, "maximum size was already set to %s", cacheBuilderSpec.h);
            Preconditions.checkArgument(cacheBuilderSpec.g == null, "maximum weight was already set to %s", cacheBuilderSpec.g);
            cacheBuilderSpec.h = Long.valueOf(j);
        }
    }

    static class g extends LongParser {
        g() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(CacheBuilderSpec cacheBuilderSpec, long j) {
            Preconditions.checkArgument(cacheBuilderSpec.g == null, "maximum weight was already set to %s", cacheBuilderSpec.g);
            Preconditions.checkArgument(cacheBuilderSpec.h == null, "maximum size was already set to %s", cacheBuilderSpec.h);
            cacheBuilderSpec.g = Long.valueOf(j);
        }
    }

    static class b extends IntegerParser {
        b() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(CacheBuilderSpec cacheBuilderSpec, int i) {
            Preconditions.checkArgument(cacheBuilderSpec.f4221b == null, "concurrency level was already set to %s", cacheBuilderSpec.f4221b);
            cacheBuilderSpec.f4221b = Integer.valueOf(i);
        }
    }

    static class c implements ValueParser {
        private final LocalCache.Strength e;

        public c(LocalCache.Strength strength) {
            this.e = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, @CheckForNull String str2) {
            Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            Preconditions.checkArgument(cacheBuilderSpec.f4222c == null, "%s was already set to %s", str, cacheBuilderSpec.f4222c);
            cacheBuilderSpec.f4222c = this.e;
        }
    }

    static class j implements ValueParser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocalCache.Strength f4223a;

        public j(LocalCache.Strength strength) {
            this.f4223a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, @CheckForNull String str2) {
            Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            Preconditions.checkArgument(cacheBuilderSpec.o == null, "%s was already set to %s", str, cacheBuilderSpec.o);
            cacheBuilderSpec.o = this.f4223a;
        }
    }

    static class f implements ValueParser {
        f() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, @CheckForNull String str2) {
            Preconditions.checkArgument(str2 == null, "recordStats does not take values");
            Preconditions.checkArgument(cacheBuilderSpec.f == null, "recordStats already set");
            cacheBuilderSpec.f = true;
        }
    }

    static abstract class DurationParser implements ValueParser {
        protected abstract void parseDuration(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit);

        DurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, @CheckForNull String str2) {
            TimeUnit timeUnit;
            if (Strings.isNullOrEmpty(str2)) {
                throw new IllegalArgumentException("value of key " + str + " omitted");
            }
            try {
                char cCharAt = str2.charAt(str2.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else if (cCharAt == 's') {
                    timeUnit = TimeUnit.SECONDS;
                } else {
                    throw new IllegalArgumentException(CacheBuilderSpec.a("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
                }
                parseDuration(cacheBuilderSpec, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(CacheBuilderSpec.a("key %s value set to %s, must be integer", str, str2));
            }
        }
    }

    static class e extends DurationParser {
        e() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.d == null, "expireAfterAccess already set");
            cacheBuilderSpec.e = j;
            cacheBuilderSpec.d = timeUnit;
        }
    }

    static class i extends DurationParser {
        i() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.l == null, "expireAfterWrite already set");
            cacheBuilderSpec.m = j;
            cacheBuilderSpec.l = timeUnit;
        }
    }

    static class h extends DurationParser {
        h() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.j == null, "refreshAfterWrite already set");
            cacheBuilderSpec.i = j;
            cacheBuilderSpec.j = timeUnit;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }
}
