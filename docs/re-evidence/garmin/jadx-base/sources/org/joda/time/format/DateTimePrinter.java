package org.joda.time.format;

import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
public interface DateTimePrinter {
    int estimatePrintedLength();

    void printTo(Writer writer, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale);

    void printTo(Writer writer, ReadablePartial readablePartial, Locale locale);

    void printTo(StringBuffer stringBuffer, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale);

    void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale);
}
