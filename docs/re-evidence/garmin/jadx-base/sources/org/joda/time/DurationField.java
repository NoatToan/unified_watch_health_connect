package org.joda.time;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DurationField implements Comparable<DurationField> {
    public abstract long add(long j8, int i14);

    public abstract long add(long j8, long j14);

    public abstract int getDifference(long j8, long j14);

    public abstract long getDifferenceAsLong(long j8, long j14);

    public abstract long getMillis(int i14);

    public abstract long getMillis(int i14, long j8);

    public abstract long getMillis(long j8);

    public abstract long getMillis(long j8, long j14);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long j8);

    public abstract int getValue(long j8, long j14);

    public abstract long getValueAsLong(long j8);

    public abstract long getValueAsLong(long j8, long j14);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long j8, long j14) {
        if (j14 != Long.MIN_VALUE) {
            return add(j8, -j14);
        }
        e.u("Long.MIN_VALUE cannot be negated");
        return 0L;
    }

    public abstract String toString();

    public long subtract(long j8, int i14) {
        if (i14 == Integer.MIN_VALUE) {
            return subtract(j8, i14);
        }
        return add(j8, -i14);
    }
}
