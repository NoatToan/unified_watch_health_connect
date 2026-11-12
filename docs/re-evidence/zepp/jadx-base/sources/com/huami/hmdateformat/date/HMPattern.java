package com.huami.hmdateformat.date;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/huami/hmdateformat/date/HMPattern;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "YEAR", "MONTH", "ABBR_MONTH", "DAY", "YEAR_MONTH", "YEAR_ABBR_MONTH", "MONTH_DAY", "ABBR_MONTH_DAY", "YEAR_MONTH_DAY", "YEAR_ABBR_MONTH_DAY", "HOUR", "HOUR24", "MINUTE", "SECOND", "HOUR_MINUTE", "HOUR24_MINUTE", "MINUTE_SECOND", "HOUR_MINUTE_SECOND", "HOUR24_MINUTE_SECOND", "WEEKDAY", "ABBR_WEEKDAY", "ABBR_MONTH_DAY_HOUR24_MINUTE", "YEAR_ABBR_MONTH_DAY_HOUR24_MINUTE", "MONTH_DAY_SHORT", "YEAR_MONTH_DAY_SHORT", "library_release"}, k = 1, mv = {1, 5, 1})
public enum HMPattern {
    YEAR("y"),
    MONTH("MMMM"),
    ABBR_MONTH("MMM"),
    DAY(GoogleApiAvailabilityLight.a),
    YEAR_MONTH("yMMMM"),
    YEAR_ABBR_MONTH("yMMM"),
    MONTH_DAY("MMMMd"),
    ABBR_MONTH_DAY("MMMd"),
    YEAR_MONTH_DAY("yMMMMd"),
    YEAR_ABBR_MONTH_DAY("yMMMd"),
    HOUR(z.j),
    HOUR24("H"),
    MINUTE("m"),
    SECOND(SOAP.XMLNS),
    HOUR_MINUTE("jm"),
    HOUR24_MINUTE("Hm"),
    MINUTE_SECOND("ms"),
    HOUR_MINUTE_SECOND("jms"),
    HOUR24_MINUTE_SECOND("Hms"),
    WEEKDAY("EEEE"),
    ABBR_WEEKDAY("E"),
    ABBR_MONTH_DAY_HOUR24_MINUTE("MMMdHm"),
    YEAR_ABBR_MONTH_DAY_HOUR24_MINUTE("yMMMdHm"),
    MONTH_DAY_SHORT("ddMM"),
    YEAR_MONTH_DAY_SHORT("ddMMyyyy");


    @NotNull
    private final String value;

    HMPattern(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
