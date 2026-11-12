package org.joda.time.format;

import java.util.Locale;
import org.joda.time.ReadWritablePeriod;

/* JADX INFO: loaded from: classes3.dex */
public interface PeriodParser {
    int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i14, Locale locale);
}
