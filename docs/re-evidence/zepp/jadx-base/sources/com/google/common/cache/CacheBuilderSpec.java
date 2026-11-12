package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
public final class CacheBuilderSpec {
    private static final Splitter o = Splitter.on(',').trimResults();
    private static final Splitter p = Splitter.on(com.alipay.sdk.m.n.a.h).trimResults();
    private static final ImmutableMap<String, m> q;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public Integer a;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public Long b;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public Long c;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public Integer d;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public com.google.common.cache.a.t e;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public com.google.common.cache.a.t f;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public Boolean g;

    @VisibleForTesting
    public long h;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public TimeUnit i;

    @VisibleForTesting
    public long j;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public TimeUnit k;

    @VisibleForTesting
    public long l;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public TimeUnit m;
    private final String n;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.google.common.cache.a.t.values().length];
            a = iArr;
            try {
                iArr[com.google.common.cache.a.t.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.google.common.cache.a.t.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b extends d {
        @Override // com.google.common.cache.CacheBuilderSpec.d
        public void b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.k == null, "expireAfterAccess already set");
            cacheBuilderSpec.j = j;
            cacheBuilderSpec.k = timeUnit;
        }
    }

    public static class c extends f {
        @Override // com.google.common.cache.CacheBuilderSpec.f
        public void b(CacheBuilderSpec cacheBuilderSpec, int i) {
            Integer num = cacheBuilderSpec.d;
            Preconditions.checkArgument(num == null, "concurrency level was already set to ", num);
            cacheBuilderSpec.d = Integer.valueOf(i);
        }
    }

    public static abstract class d implements m {
        @Override // com.google.common.cache.CacheBuilderSpec.m
        public void a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            TimeUnit timeUnit;
            Preconditions.checkArgument((str2 == null || str2.isEmpty()) ? false : true, "value of key %s omitted", str);
            try {
                char cCharAt = str2.charAt(str2.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (cCharAt != 's') {
                        throw new IllegalArgumentException(CacheBuilderSpec.c("key %s invalid format.  was %s, must end with one of [dDhHmMsS]", str, str2));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                b(cacheBuilderSpec, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(CacheBuilderSpec.c("key %s value set to %s, must be integer", str, str2));
            }
        }

        public abstract void b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit);
    }

    public static class e extends f {
        @Override // com.google.common.cache.CacheBuilderSpec.f
        public void b(CacheBuilderSpec cacheBuilderSpec, int i) {
            Integer num = cacheBuilderSpec.a;
            Preconditions.checkArgument(num == null, "initial capacity was already set to ", num);
            cacheBuilderSpec.a = Integer.valueOf(i);
        }
    }

    public static abstract class f implements m {
        @Override // com.google.common.cache.CacheBuilderSpec.m
        public void a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            Preconditions.checkArgument((str2 == null || str2.isEmpty()) ? false : true, "value of key %s omitted", str);
            try {
                b(cacheBuilderSpec, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.c("key %s value set to %s, must be integer", str, str2), e);
            }
        }

        public abstract void b(CacheBuilderSpec cacheBuilderSpec, int i);
    }

    public static class g implements m {
        private final com.google.common.cache.a.t a;

        public g(com.google.common.cache.a.t tVar) {
            this.a = tVar;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.m
        public void a(CacheBuilderSpec cacheBuilderSpec, String str, @NullableDecl String str2) {
            Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            com.google.common.cache.a.t tVar = cacheBuilderSpec.e;
            Preconditions.checkArgument(tVar == null, "%s was already set to %s", str, tVar);
            cacheBuilderSpec.e = this.a;
        }
    }

    public static abstract class h implements m {
        @Override // com.google.common.cache.CacheBuilderSpec.m
        public void a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            Preconditions.checkArgument((str2 == null || str2.isEmpty()) ? false : true, "value of key %s omitted", str);
            try {
                b(cacheBuilderSpec, Long.parseLong(str2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.c("key %s value set to %s, must be integer", str, str2), e);
            }
        }

        public abstract void b(CacheBuilderSpec cacheBuilderSpec, long j);
    }

    public static class i extends h {
        @Override // com.google.common.cache.CacheBuilderSpec.h
        public void b(CacheBuilderSpec cacheBuilderSpec, long j) {
            Long l = cacheBuilderSpec.b;
            Preconditions.checkArgument(l == null, "maximum size was already set to ", l);
            Long l2 = cacheBuilderSpec.c;
            Preconditions.checkArgument(l2 == null, "maximum weight was already set to ", l2);
            cacheBuilderSpec.b = Long.valueOf(j);
        }
    }

    public static class j extends h {
        @Override // com.google.common.cache.CacheBuilderSpec.h
        public void b(CacheBuilderSpec cacheBuilderSpec, long j) {
            Long l = cacheBuilderSpec.c;
            Preconditions.checkArgument(l == null, "maximum weight was already set to ", l);
            Long l2 = cacheBuilderSpec.b;
            Preconditions.checkArgument(l2 == null, "maximum size was already set to ", l2);
            cacheBuilderSpec.c = Long.valueOf(j);
        }
    }

    public static class k implements m {
        @Override // com.google.common.cache.CacheBuilderSpec.m
        public void a(CacheBuilderSpec cacheBuilderSpec, String str, @NullableDecl String str2) {
            Preconditions.checkArgument(str2 == null, "recordStats does not take values");
            Preconditions.checkArgument(cacheBuilderSpec.g == null, "recordStats already set");
            cacheBuilderSpec.g = Boolean.TRUE;
        }
    }

    public static class l extends d {
        @Override // com.google.common.cache.CacheBuilderSpec.d
        public void b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.m == null, "refreshAfterWrite already set");
            cacheBuilderSpec.l = j;
            cacheBuilderSpec.m = timeUnit;
        }
    }

    public interface m {
        void a(CacheBuilderSpec cacheBuilderSpec, String str, @NullableDecl String str2);
    }

    public static class n implements m {
        private final com.google.common.cache.a.t a;

        public n(com.google.common.cache.a.t tVar) {
            this.a = tVar;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.m
        public void a(CacheBuilderSpec cacheBuilderSpec, String str, @NullableDecl String str2) {
            Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            com.google.common.cache.a.t tVar = cacheBuilderSpec.f;
            Preconditions.checkArgument(tVar == null, "%s was already set to %s", str, tVar);
            cacheBuilderSpec.f = this.a;
        }
    }

    public static class o extends d {
        @Override // com.google.common.cache.CacheBuilderSpec.d
        public void b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.i == null, "expireAfterWrite already set");
            cacheBuilderSpec.h = j;
            cacheBuilderSpec.i = timeUnit;
        }
    }

    static {
        ImmutableMap.Builder builderPut = ImmutableMap.builder().put("initialCapacity", new e()).put("maximumSize", new i()).put("maximumWeight", new j()).put("concurrencyLevel", new c());
        com.google.common.cache.a.t tVar = com.google.common.cache.a.t.WEAK;
        q = builderPut.put("weakKeys", new g(tVar)).put("softValues", new n(com.google.common.cache.a.t.SOFT)).put("weakValues", new n(tVar)).put("recordStats", new k()).put("expireAfterAccess", new b()).put("expireAfterWrite", new o()).put("refreshAfterWrite", new l()).put("refreshInterval", new l()).build();
    }

    private CacheBuilderSpec(String str) {
        this.n = str;
    }

    @NullableDecl
    private static Long b(long j2, @NullableDecl TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CacheBuilderSpec parse(String str) {
        CacheBuilderSpec cacheBuilderSpec = new CacheBuilderSpec(str);
        if (!str.isEmpty()) {
            for (String str2 : o.split(str)) {
                ImmutableList immutableListCopyOf = ImmutableList.copyOf(p.split(str2));
                Preconditions.checkArgument(!immutableListCopyOf.isEmpty(), "blank key-value pair");
                Preconditions.checkArgument(immutableListCopyOf.size() <= 2, "key-value pair %s with more than one equals sign", str2);
                String str3 = (String) immutableListCopyOf.get(0);
                m mVar = q.get(str3);
                Preconditions.checkArgument(mVar != null, "unknown key %s", str3);
                mVar.a(cacheBuilderSpec, str3, immutableListCopyOf.size() == 1 ? null : (String) immutableListCopyOf.get(1));
            }
        }
        return cacheBuilderSpec;
    }

    public CacheBuilder<Object, Object> d() {
        CacheBuilder<Object, Object> cacheBuilderNewBuilder = CacheBuilder.newBuilder();
        Integer num = this.a;
        if (num != null) {
            cacheBuilderNewBuilder.initialCapacity(num.intValue());
        }
        Long l2 = this.b;
        if (l2 != null) {
            cacheBuilderNewBuilder.maximumSize(l2.longValue());
        }
        Long l3 = this.c;
        if (l3 != null) {
            cacheBuilderNewBuilder.maximumWeight(l3.longValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            cacheBuilderNewBuilder.concurrencyLevel(num2.intValue());
        }
        com.google.common.cache.a.t tVar = this.e;
        if (tVar != null) {
            if (a.a[tVar.ordinal()] != 1) {
                throw new AssertionError();
            }
            cacheBuilderNewBuilder.weakKeys();
        }
        com.google.common.cache.a.t tVar2 = this.f;
        if (tVar2 != null) {
            int i2 = a.a[tVar2.ordinal()];
            if (i2 == 1) {
                cacheBuilderNewBuilder.weakValues();
            } else {
                if (i2 != 2) {
                    throw new AssertionError();
                }
                cacheBuilderNewBuilder.softValues();
            }
        }
        Boolean bool = this.g;
        if (bool != null && bool.booleanValue()) {
            cacheBuilderNewBuilder.recordStats();
        }
        TimeUnit timeUnit = this.i;
        if (timeUnit != null) {
            cacheBuilderNewBuilder.expireAfterWrite(this.h, timeUnit);
        }
        TimeUnit timeUnit2 = this.k;
        if (timeUnit2 != null) {
            cacheBuilderNewBuilder.expireAfterAccess(this.j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.m;
        if (timeUnit3 != null) {
            cacheBuilderNewBuilder.refreshAfterWrite(this.l, timeUnit3);
        }
        return cacheBuilderNewBuilder;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        return Objects.equal(this.a, cacheBuilderSpec.a) && Objects.equal(this.b, cacheBuilderSpec.b) && Objects.equal(this.c, cacheBuilderSpec.c) && Objects.equal(this.d, cacheBuilderSpec.d) && Objects.equal(this.e, cacheBuilderSpec.e) && Objects.equal(this.f, cacheBuilderSpec.f) && Objects.equal(this.g, cacheBuilderSpec.g) && Objects.equal(b(this.h, this.i), b(cacheBuilderSpec.h, cacheBuilderSpec.i)) && Objects.equal(b(this.j, this.k), b(cacheBuilderSpec.j, cacheBuilderSpec.k)) && Objects.equal(b(this.l, this.m), b(cacheBuilderSpec.l, cacheBuilderSpec.m));
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e, this.f, this.g, b(this.h, this.i), b(this.j, this.k), b(this.l, this.m));
    }

    public String toParsableString() {
        return this.n;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }
}
