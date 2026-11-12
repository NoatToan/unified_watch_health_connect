package org.threeten.bp.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.temporal.TemporalField;

/* JADX INFO: loaded from: classes23.dex */
public abstract class DateTimeTextProvider {
    private static final AtomicReference<DateTimeTextProvider> a = new AtomicReference<>();

    public static class a {
        public static final DateTimeTextProvider a = a();

        public static DateTimeTextProvider a() {
            DateTimeTextProvider.a.compareAndSet(null, new f());
            return (DateTimeTextProvider) DateTimeTextProvider.a.get();
        }
    }

    public static DateTimeTextProvider b() {
        return a.a;
    }

    public static void setInitializer(DateTimeTextProvider dateTimeTextProvider) {
        if (!a.compareAndSet(null, dateTimeTextProvider)) {
            throw new IllegalStateException("Provider was already set, possibly with a default during initialization");
        }
    }

    public abstract String getText(TemporalField temporalField, long j, TextStyle textStyle, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> getTextIterator(TemporalField temporalField, TextStyle textStyle, Locale locale);
}
