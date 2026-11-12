package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
class DateTimePrinterInternalPrinter implements InternalPrinter {
    private final DateTimePrinter underlying;

    private DateTimePrinterInternalPrinter(DateTimePrinter dateTimePrinter) {
        this.underlying = dateTimePrinter;
    }

    public static InternalPrinter of(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter instanceof InternalPrinterDateTimePrinter) {
            return (InternalPrinter) dateTimePrinter;
        }
        if (dateTimePrinter == null) {
            return null;
        }
        return new DateTimePrinterInternalPrinter(dateTimePrinter);
    }

    @Override // org.joda.time.format.InternalPrinter
    public int estimatePrintedLength() {
        return this.underlying.estimatePrintedLength();
    }

    public DateTimePrinter getUnderlying() {
        return this.underlying;
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.underlying.printTo((StringBuffer) appendable, j8, chronology, i14, dateTimeZone, locale);
        } else if (appendable instanceof Writer) {
            this.underlying.printTo((Writer) appendable, j8, chronology, i14, dateTimeZone, locale);
        } else {
            StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
            this.underlying.printTo(stringBuffer, j8, chronology, i14, dateTimeZone, locale);
            appendable.append(stringBuffer);
        }
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.underlying.printTo((StringBuffer) appendable, readablePartial, locale);
        } else if (appendable instanceof Writer) {
            this.underlying.printTo((Writer) appendable, readablePartial, locale);
        } else {
            StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
            this.underlying.printTo(stringBuffer, readablePartial, locale);
            appendable.append(stringBuffer);
        }
    }
}
