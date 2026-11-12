package com.xiaomi.hm.health.bt.profile.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001\"\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryTemperatureData;", "Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryDateTime;", "dateTime", "Ljava/util/Calendar;", "toCalendar", "", "INVALID_TEMPE_VALUE", ExifInterface.LATITUDE_SOUTH, "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class TemperatureKt {
    public static final short INVALID_TEMPE_VALUE = Short.MAX_VALUE;

    private static final TimeZone a(byte b) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(b(b));
        return timeZone;
    }

    private static final int b(int i) {
        if (i == -128) {
            return 28800000;
        }
        int i2 = i < 0 ? -1 : 1;
        int iAbs = Math.abs(i);
        return (((iAbs / 4) * 60) + ((iAbs % 4) * 15)) * 60 * 1000 * i2;
    }

    @NotNull
    public static final BinaryDateTime dateTime(@NotNull BinaryTemperatureData binaryTemperatureData) {
        return new BinaryDateTime(binaryTemperatureData.getDateYear(), binaryTemperatureData.getDateMonth(), binaryTemperatureData.getDateDay(), binaryTemperatureData.getTimeHour(), binaryTemperatureData.getTimeMinute(), binaryTemperatureData.getTimeSecond(), binaryTemperatureData.getTimeZone());
    }

    @NotNull
    public static final Calendar toCalendar(@NotNull BinaryDateTime binaryDateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0L);
        calendar.set(1, binaryDateTime.getDateYear());
        calendar.set(2, binaryDateTime.getDateMonth() - 1);
        calendar.set(5, binaryDateTime.getDateDay());
        calendar.set(11, binaryDateTime.getTimeHour());
        calendar.set(12, binaryDateTime.getTimeMinute());
        calendar.set(13, binaryDateTime.getTimeSecond());
        calendar.setTimeZone(a(binaryDateTime.getTimeZone()));
        return calendar;
    }
}
