package org.joda.time.tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class Info {
        private String iNameKey;
        Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        public Info(DateTimeZone dateTimeZone, long j8) {
            this.iPeriodStart = j8;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j8) {
            Info info = this.iNextInfo;
            if (info != null && j8 >= info.iPeriodStart) {
                return info.getNameKey(j8);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j8) {
            Info info = this.iNextInfo;
            if (info != null && j8 >= info.iPeriodStart) {
                return info.getOffset(j8);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j8) {
            Info info = this.iNextInfo;
            if (info != null && j8 >= info.iPeriodStart) {
                return info.getStandardOffset(j8);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer integer;
        int i14;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i14 = 512;
        } else {
            int i15 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i15++;
            }
            i14 = 1 << i15;
        }
        cInfoCacheMask = i14 - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j8) {
        long j14 = j8 & (-4294967296L);
        Info info = new Info(this.iZone, j14);
        long j15 = 4294967295L | j14;
        Info info2 = info;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j14);
            if (jNextTransition == j14 || jNextTransition > j15) {
                break;
            }
            Info info3 = new Info(this.iZone, jNextTransition);
            info2.iNextInfo = info3;
            info2 = info3;
            j14 = jNextTransition;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private Info getInfo(long j8) {
        int i14 = (int) (j8 >> 32);
        Info[] infoArr = this.iInfoCache;
        int i15 = cInfoCacheMask & i14;
        Info info = infoArr[i15];
        if (info != null && ((int) (info.iPeriodStart >> 32)) == i14) {
            return info;
        }
        Info infoCreateInfo = createInfo(j8);
        infoArr[i15] = infoCreateInfo;
        return infoCreateInfo;
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
    public String getNameKey(long j8) {
        return getInfo(j8).getNameKey(j8);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j8) {
        return getInfo(j8).getOffset(j8);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j8) {
        return getInfo(j8).getStandardOffset(j8);
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
    public long nextTransition(long j8) {
        return this.iZone.nextTransition(j8);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j8) {
        return this.iZone.previousTransition(j8);
    }
}
