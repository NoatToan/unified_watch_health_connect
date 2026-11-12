package com.xiaomi.fitness.common.extensions;

import android.text.format.DateUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0004¨\u0006\u0006"}, d2 = {"toLocalFormatDateString", "", "", "toFormatDate", "Lorg/joda/time/LocalDate;", "toMillis", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeExtKt {
    @NotNull
    public static final String toFormatDate(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        String dateTime = DateUtils.formatDateTime(ApplicationExtKt.getApplication(), toMillis(localDate), 4);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @NotNull
    public static final String toLocalFormatDateString(long j) {
        return toFormatDate(new LocalDate(j));
    }

    public static final long toMillis(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.toDateTimeAtCurrentTime().getMillis();
    }
}
