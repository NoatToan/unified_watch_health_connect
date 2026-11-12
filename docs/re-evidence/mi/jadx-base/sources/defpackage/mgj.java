package defpackage;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/* JADX INFO: loaded from: classes3.dex */
public interface mgj {
    bw3 getChronology();

    DateTime getEnd();

    long getEndMillis();

    DateTime getStart();

    long getStartMillis();

    long toDurationMillis();

    Period toPeriod(PeriodType periodType);
}
