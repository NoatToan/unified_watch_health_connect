package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public interface kgj extends Comparable<kgj> {
    int get(DateTimeFieldType dateTimeFieldType);

    bw3 getChronology();

    long getMillis();

    boolean isBefore(kgj kgjVar);

    Instant toInstant();
}
