package cn.hutool.core.lang;

import defpackage.e2d;
import defpackage.svo;
import defpackage.tt3;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Snowflake implements Serializable {
    private static final long DATA_CENTER_ID_BITS = 5;
    private static final long DATA_CENTER_ID_SHIFT = 17;
    public static long DEFAULT_TIME_OFFSET = 2000;
    public static long DEFAULT_TWEPOCH = 1288834974657L;
    private static final long MAX_DATA_CENTER_ID = 31;
    private static final long MAX_WORKER_ID = 31;
    private static final long SEQUENCE_BITS = 12;
    private static final long SEQUENCE_MASK = 4095;
    private static final long TIMESTAMP_LEFT_SHIFT = 22;
    private static final long WORKER_ID_BITS = 5;
    private static final long WORKER_ID_SHIFT = 12;
    private static final long serialVersionUID = 1;
    private final long dataCenterId;
    private long lastTimestamp;
    private long sequence;
    private final long timeOffset;
    private final long twepoch;
    private final boolean useSystemClock;
    private final long workerId;

    public Snowflake() {
        this(e2d.b(e2d.a(31L), 31L), e2d.a(31L));
    }

    private long genTime() {
        return this.useSystemClock ? svo.f() : System.currentTimeMillis();
    }

    private long tilNextMillis(long j) {
        long jGenTime = genTime();
        while (jGenTime == j) {
            jGenTime = genTime();
        }
        if (jGenTime >= j) {
            return jGenTime;
        }
        throw new IllegalStateException(tt3.y("Clock moved backwards. Refusing to generate id for {}ms", Long.valueOf(j - jGenTime)));
    }

    public long getDataCenterId(long j) {
        return (j >> DATA_CENTER_ID_SHIFT) & 31;
    }

    public long getGenerateDateTime(long j) {
        return ((j >> TIMESTAMP_LEFT_SHIFT) & 2199023255551L) + this.twepoch;
    }

    public long getWorkerId(long j) {
        return (j >> 12) & 31;
    }

    public synchronized long nextId() {
        long jGenTime;
        try {
            jGenTime = genTime();
            long j = this.lastTimestamp;
            if (jGenTime < j) {
                if (j - jGenTime >= this.timeOffset) {
                    throw new IllegalStateException(tt3.y("Clock moved backwards. Refusing to generate id for {}ms", Long.valueOf(this.lastTimestamp - jGenTime)));
                }
                jGenTime = j;
            }
            if (jGenTime == j) {
                long j2 = (this.sequence + 1) & SEQUENCE_MASK;
                if (j2 == 0) {
                    jGenTime = tilNextMillis(j);
                }
                this.sequence = j2;
            } else {
                this.sequence = 0L;
            }
            this.lastTimestamp = jGenTime;
        } catch (Throwable th) {
            throw th;
        }
        return ((jGenTime - this.twepoch) << TIMESTAMP_LEFT_SHIFT) | (this.dataCenterId << DATA_CENTER_ID_SHIFT) | (this.workerId << 12) | this.sequence;
    }

    public String nextIdStr() {
        return Long.toString(nextId());
    }

    public Snowflake(long j) {
        this(j, e2d.a(31L));
    }

    public Snowflake(long j, long j2) {
        this(j, j2, false);
    }

    public Snowflake(long j, long j2, boolean z) {
        this(null, j, j2, z);
    }

    public Snowflake(Date date, long j, long j2, boolean z) {
        this(date, j, j2, z, DEFAULT_TIME_OFFSET);
    }

    public Snowflake(Date date, long j, long j2, boolean z, long j3) {
        this.sequence = 0L;
        this.lastTimestamp = -1L;
        if (date != null) {
            this.twepoch = date.getTime();
        } else {
            this.twepoch = DEFAULT_TWEPOCH;
        }
        if (j > 31 || j < 0) {
            throw new IllegalArgumentException(tt3.y("worker Id can't be greater than {} or less than 0", 31L));
        }
        if (j2 <= 31 && j2 >= 0) {
            this.workerId = j;
            this.dataCenterId = j2;
            this.useSystemClock = z;
            this.timeOffset = j3;
            return;
        }
        throw new IllegalArgumentException(tt3.y("datacenter Id can't be greater than {} or less than 0", 31L));
    }
}
