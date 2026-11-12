package org.apache.commons.text.lookup;

import java.util.Date;
import org.apache.commons.lang3.time.FastDateFormat;

/* JADX INFO: loaded from: classes3.dex */
final class DateStringLookup extends AbstractStringLookup {
    static final DateStringLookup INSTANCE = new DateStringLookup();

    private DateStringLookup() {
    }

    private String formatDate(long j8, String str) {
        FastDateFormat fastDateFormat;
        if (str != null) {
            try {
                fastDateFormat = FastDateFormat.getInstance(str);
            } catch (Exception e4) {
                throw IllegalArgumentExceptions.format(e4, "Invalid date format: [%s]", str);
            }
        } else {
            fastDateFormat = null;
        }
        if (fastDateFormat == null) {
            fastDateFormat = FastDateFormat.getInstance();
        }
        return fastDateFormat.format(new Date(j8));
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        return formatDate(System.currentTimeMillis(), str);
    }
}
