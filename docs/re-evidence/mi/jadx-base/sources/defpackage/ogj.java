package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public interface ogj extends Comparable<ogj> {
    int get(DateTimeFieldType dateTimeFieldType);

    bw3 getChronology();

    gq5 getField(int i);

    DateTimeFieldType getFieldType(int i);

    int getValue(int i);

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();
}
