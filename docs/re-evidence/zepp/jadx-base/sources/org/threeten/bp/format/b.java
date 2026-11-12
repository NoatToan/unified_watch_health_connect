package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.chrono.Chronology;

/* JADX INFO: loaded from: classes23.dex */
abstract class b {
    public static b c() {
        return new e();
    }

    public Locale[] a() {
        throw new UnsupportedOperationException();
    }

    public abstract DateTimeFormatter b(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale);
}
