package org.threeten.bp.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.chrono.Chronology;

/* JADX INFO: loaded from: classes23.dex */
final class e extends b {
    private static final ConcurrentMap<String, Object> a = new ConcurrentHashMap(16, 0.75f, 2);

    private int d(FormatStyle formatStyle) {
        return formatStyle.ordinal();
    }

    @Override // org.threeten.bp.format.b
    public Locale[] a() {
        return DateFormat.getAvailableLocales();
    }

    @Override // org.threeten.bp.format.b
    public DateTimeFormatter b(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat timeInstance;
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }
        String str = chronology.getId() + '|' + locale.toString() + '|' + formatStyle + formatStyle2;
        ConcurrentMap<String, Object> concurrentMap = a;
        Object obj = concurrentMap.get(str);
        if (obj != null) {
            if (obj.equals("")) {
                throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
            }
            return (DateTimeFormatter) obj;
        }
        if (formatStyle != null) {
            timeInstance = formatStyle2 != null ? DateFormat.getDateTimeInstance(d(formatStyle), d(formatStyle2), locale) : DateFormat.getDateInstance(d(formatStyle), locale);
        } else {
            timeInstance = DateFormat.getTimeInstance(d(formatStyle2), locale);
        }
        if (!(timeInstance instanceof SimpleDateFormat)) {
            concurrentMap.putIfAbsent(str, "");
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        }
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(((SimpleDateFormat) timeInstance).toPattern()).toFormatter(locale);
        concurrentMap.putIfAbsent(str, formatter);
        return formatter;
    }
}
