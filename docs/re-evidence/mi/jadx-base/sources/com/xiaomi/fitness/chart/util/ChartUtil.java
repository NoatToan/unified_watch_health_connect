package com.xiaomi.fitness.chart.util;

import android.icu.text.SimpleDateFormat;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.qzi;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007J\u001a\u0010\t\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0007J \u0010\t\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\f\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0013J\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/chart/util/ChartUtil;", "", "<init>", "()V", "getTheMaxNumber", "", "entries", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "getTheMinNumber", "", "validValue", "getTheAvgNumber", "getMaxInt", "", "yAxisMaximum", "convertToDayString", "", "days", "", "timestampToLocalDay", "timestamp", "zone", "Ljava/time/ZoneId;", "localDayToTimestamp", "day", "timestampToHourFloat", "timestampMillis", "timestampToHourFloatWithBase", "baseTimeStampMillis", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChartUtil {

    @NotNull
    public static final ChartUtil INSTANCE = new ChartUtil();

    private ChartUtil() {
    }

    @JvmStatic
    public static final float getTheMaxNumber(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.size() == 0) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = (float) Math.max(y, entries.get(i).getY());
        }
        return y;
    }

    @JvmStatic
    public static final float getTheMinNumber(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.size() == 0) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = (float) Math.min(y, entries.get(i).getY());
        }
        return y;
    }

    public static /* synthetic */ long timestampToLocalDay$default(ChartUtil chartUtil, long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return chartUtil.timestampToLocalDay(j, zoneId);
    }

    @NotNull
    public final String convertToDayString(long days) {
        String str = new SimpleDateFormat(ResourceExtKt.getString(qzi.h), Locale.getDefault()).format(new Date(localDayToTimestamp(days)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final int getMaxInt(float yAxisMaximum) {
        return (int) (yAxisMaximum + 10);
    }

    public final float getTheAvgNumber(@Nullable List<? extends RecyclerBarEntry> entries) {
        float y = 0.0f;
        if (entries == null || entries.size() == 0) {
            return 0.0f;
        }
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y += entries.get(i).getY();
        }
        return y / (size * 1.0f);
    }

    public final long localDayToTimestamp(long day) {
        return LocalDate.ofEpochDay(day).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final float timestampToHourFloat(long timestampMillis) {
        LocalTime localTime = Instant.ofEpochMilli(timestampMillis).atZone(ZoneId.systemDefault()).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        return localTime.getHour() + (localTime.getMinute() / 60.0f);
    }

    public final float timestampToHourFloatWithBase(long timestampMillis, long baseTimeStampMillis) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalTime localTime = Instant.ofEpochMilli(timestampMillis).atZone(zoneIdSystemDefault).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        long epochDay = Instant.ofEpochMilli(timestampMillis).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay();
        Instant.ofEpochMilli(baseTimeStampMillis).atZone(zoneIdSystemDefault).toLocalTime();
        return epochDay > Instant.ofEpochMilli(baseTimeStampMillis).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay() ? localTime.getHour() + (localTime.getMinute() / 60.0f) + 24.0f : localTime.getHour() + (localTime.getMinute() / 60.0f);
    }

    public final long timestampToLocalDay(long timestamp, @NotNull ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        return Instant.ofEpochMilli(timestamp).atZone(zone).toLocalDate().toEpochDay();
    }

    public final float getTheMinNumber(@Nullable List<? extends RecyclerBarEntry> entries, float validValue) {
        if (entries == null || entries.size() == 0) {
            return 0.0f;
        }
        entries.get(0);
        int size = entries.size();
        float fMin = Float.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            RecyclerBarEntry recyclerBarEntry = entries.get(i);
            if (recyclerBarEntry.getY() >= validValue) {
                fMin = (float) Math.min(fMin, recyclerBarEntry.getY());
            }
        }
        return fMin;
    }
}
