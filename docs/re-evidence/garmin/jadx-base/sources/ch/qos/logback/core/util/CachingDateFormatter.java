package ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class CachingDateFormatter {
    String cachedStr;
    long lastTimestamp;
    final SimpleDateFormat sdf;

    public CachingDateFormatter(String str, Locale locale) {
        this.lastTimestamp = -1L;
        this.cachedStr = null;
        this.sdf = new SimpleDateFormat(str, locale);
    }

    public final String format(long j8) {
        String str;
        synchronized (this) {
            try {
                if (j8 != this.lastTimestamp) {
                    this.lastTimestamp = j8;
                    this.cachedStr = this.sdf.format(new Date(j8));
                }
                str = this.cachedStr;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.sdf.setTimeZone(timeZone);
    }

    public CachingDateFormatter(String str) {
        this(str, Locale.US);
    }
}
