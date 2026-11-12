package com.huami.bluetooth.profile.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\"\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006\"\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006\"\u0016\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"", "Ljava/util/Calendar;", "toCalendar", "toBytes", "", "a", LogUtil.I, "YEAR_BYTES", "b", "MONTH_BYTES", "c", "DAY_BYTES", GoogleApiAvailabilityLight.a, "HOUR_BYTES", "e", "MINUTE_BYTES", "f", "SECOND_BYTES", "g", "DATE_TIME_BYTES", "h", "TIME_ZONE_BYTES", "TIME_BYTES", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class TimeKt {
    public static final int TIME_BYTES = 8;
    private static final int a = 2;
    private static final int b = 1;
    private static final int c = 1;
    private static final int d = 1;
    private static final int e = 1;
    private static final int f = 1;
    private static final int g = 7;
    private static final int h = 1;

    @NotNull
    public static final byte[] toBytes(@NotNull Calendar calendar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(calendar.get(1), 2));
        byteArrayOutputStream.write(calendar.get(2) + 1);
        byteArrayOutputStream.write(calendar.get(5));
        byteArrayOutputStream.write(calendar.get(11));
        byteArrayOutputStream.write(calendar.get(12));
        byteArrayOutputStream.write(calendar.get(13));
        byteArrayOutputStream.write(ProfileUtils.getTimezoneKey(calendar.getTimeZone()));
        return byteArrayOutputStream.toByteArray();
    }

    @Nullable
    public static final Calendar toCalendar(@NotNull byte[] bArr) {
        if (bArr.length < 8) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ByteUtilsKt.toInt$default(bArr, 2, 0, 2, null), ByteUtilsKt.toInt(bArr, 1, 2) - 1, ByteUtilsKt.toInt(bArr, 1, 3), ByteUtilsKt.toInt(bArr, 1, 4), ByteUtilsKt.toInt(bArr, 1, 5), ByteUtilsKt.toInt(bArr, 1, 6));
        gregorianCalendar.setTimeZone(ProfileUtils.getTimezone(bArr[7]));
        return gregorianCalendar;
    }
}
