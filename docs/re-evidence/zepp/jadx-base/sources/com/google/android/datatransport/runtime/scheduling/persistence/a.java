package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes2.dex */
final class a extends c {
    private final long g;
    private final int h;
    private final int i;
    private final long j;
    private final int k;

    public static final class b extends c.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.c.a
        public c a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.c.a
        public c.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.c.a
        public c.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.c.a
        public c.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.c.a
        public c.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.c.a
        public c.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public int b() {
        return this.i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public long c() {
        return this.j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public int d() {
        return this.h;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.g == cVar.f() && this.h == cVar.d() && this.i == cVar.b() && this.j == cVar.c() && this.k == cVar.e();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public long f() {
        return this.g;
    }

    public int hashCode() {
        long j = this.g;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        long j2 = this.j;
        return this.k ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.g + ", loadBatchSize=" + this.h + ", criticalSectionEnterTimeoutMs=" + this.i + ", eventCleanUpAge=" + this.j + ", maxBlobByteSizePerRow=" + this.k + com.alipay.sdk.m.u.i.d;
    }

    private a(long j, int i, int i2, long j2, int i3) {
        this.g = j;
        this.h = i;
        this.i = i2;
        this.j = j2;
        this.k = i3;
    }
}
