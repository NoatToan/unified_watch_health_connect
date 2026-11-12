package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public interface DatePrinter {
    <B extends Appendable> B format(long j8, B b14);

    <B extends Appendable> B format(Calendar calendar, B b14);

    <B extends Appendable> B format(Date date, B b14);

    String format(long j8);

    String format(Calendar calendar);

    String format(Date date);

    @Deprecated
    StringBuffer format(long j8, StringBuffer stringBuffer);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    @Deprecated
    StringBuffer format(Calendar calendar, StringBuffer stringBuffer);

    @Deprecated
    StringBuffer format(Date date, StringBuffer stringBuffer);

    Locale getLocale();

    String getPattern();

    TimeZone getTimeZone();
}
