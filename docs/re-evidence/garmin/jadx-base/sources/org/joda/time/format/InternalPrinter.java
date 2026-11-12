package org.joda.time.format;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
interface InternalPrinter {
    int estimatePrintedLength();

    void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale);

    void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale);
}
