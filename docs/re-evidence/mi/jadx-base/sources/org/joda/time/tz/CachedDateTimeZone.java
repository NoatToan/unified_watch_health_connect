package org.joda.time.tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient a[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f29555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTimeZone f29556b;
        public a c;
        public String d;
        public int e = Integer.MIN_VALUE;
        public int f = Integer.MIN_VALUE;

        public a(DateTimeZone dateTimeZone, long j) {
            this.f29555a = j;
            this.f29556b = dateTimeZone;
        }

        public String a(long j) {
            a aVar = this.c;
            if (aVar != null && j >= aVar.f29555a) {
                return aVar.a(j);
            }
            if (this.d == null) {
                this.d = this.f29556b.getNameKey(this.f29555a);
            }
            return this.d;
        }

        public int b(long j) {
            a aVar = this.c;
            if (aVar != null && j >= aVar.f29555a) {
                return aVar.b(j);
            }
            if (this.e == Integer.MIN_VALUE) {
                this.e = this.f29556b.getOffset(this.f29555a);
            }
            return this.e;
        }

        public int c(long j) {
            a aVar = this.c;
            if (aVar != null && j >= aVar.f29555a) {
                return aVar.c(j);
            }
            if (this.f == Integer.MIN_VALUE) {
                this.f = this.f29556b.getStandardOffset(this.f29555a);
            }
            return this.f;
        }
    }

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        cInfoCacheMask = i - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new a[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private a createInfo(long j) {
        long j2 = j & (-4294967296L);
        a aVar = new a(this.iZone, j2);
        long j3 = 4294967295L | j2;
        a aVar2 = aVar;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j2);
            if (jNextTransition == j2 || jNextTransition > j3) {
                break;
            }
            a aVar3 = new a(this.iZone, jNextTransition);
            aVar2.c = aVar3;
            aVar2 = aVar3;
            j2 = jNextTransition;
        }
        return aVar;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private a getInfo(long j) {
        int i = (int) (j >> 32);
        a[] aVarArr = this.iInfoCache;
        int i2 = cInfoCacheMask & i;
        a aVar = aVarArr[i2];
        if (aVar != null && ((int) (aVar.f29555a >> 32)) == i) {
            return aVar;
        }
        a aVarCreateInfo = createInfo(j);
        aVarArr[i2] = aVarCreateInfo;
        return aVarCreateInfo;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j) {
        return getInfo(j).a(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j) {
        return getInfo(j).b(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j) {
        return getInfo(j).c(j);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j) {
        return this.iZone.nextTransition(j);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j) {
        return this.iZone.previousTransition(j);
    }
}
