package com.xiaomi.fitness.health.sleep.interfere.utils;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/utils/DateTimeUtils;", "", "<init>", "()V", "titleDateFormat", "Ljava/text/SimpleDateFormat;", "descDateFormat", "formatTitleDate", "", DialWidgetType.DATE, "", CloudContract.COL_ZONE_OFFSET, "", "formatDescDate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DateTimeUtils {

    @NotNull
    public static final DateTimeUtils INSTANCE = new DateTimeUtils();

    @Nullable
    private static SimpleDateFormat descDateFormat;

    @Nullable
    private static SimpleDateFormat titleDateFormat;

    private DateTimeUtils() {
    }

    @SuppressLint({"SimpleDateFormat"})
    @NotNull
    public final String formatDescDate(long date, int zoneOffset) {
        if (descDateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/M/dd");
            simpleDateFormat.setTimeZone(FitnessDateUtils.INSTANCE.getTimeZone(zoneOffset));
            descDateFormat = simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = descDateFormat;
        Intrinsics.checkNotNull(simpleDateFormat2);
        String str = simpleDateFormat2.format(new Date(date * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @SuppressLint({"SimpleDateFormat"})
    @NotNull
    public final String formatTitleDate(long date, int zoneOffset) {
        if (titleDateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/M/dd");
            simpleDateFormat.setTimeZone(FitnessDateUtils.INSTANCE.getTimeZone(zoneOffset));
            titleDateFormat = simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = titleDateFormat;
        Intrinsics.checkNotNull(simpleDateFormat2);
        String str = simpleDateFormat2.format(new Date(date * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
