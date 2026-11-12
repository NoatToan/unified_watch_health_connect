package com.huami.treadmill.util;

import com.google.android.material.timepicker.TimeModel;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.treadmill.R;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002J9\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0002R\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006#²\u0006\u000e\u0010\"\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/huami/treadmill/util/DataFormatter;", "", "", "data", "", "isLocale", "", "a", TdmillHmFragment.ARG_IS_METRIC, "b", "distance", "parseRawKilometerToFormatKilometer", "", "sportType", "", "shortCode", "", "getFormatDisAndUnit", "(FIZ[Z)[Ljava/lang/String;", "parseDis2MeterOrYardOrKmOrMile", "", "seconds", "getConsumeTime", "hourDisSeconds", "isDisUnitSupportMeterOrYads", "bulk", "index", "getBulkStrings", "dis", "formatKMDisToMI", "J", "secondsTimeof24h", "<init>", "()V", "dataConvert", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class DataFormatter {
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(DataFormatter.class), "dataConvert", "<v#0>"))};

    @NotNull
    public static final DataFormatter INSTANCE = new DataFormatter();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long secondsTimeof24h = 86400;

    private DataFormatter() {
    }

    private final String a(float data, boolean isLocale) {
        if (data <= 0.0f) {
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(0.0f, 2, new int[0]) : NumberFormatter.formatFloat2String(0.0f, 2, new int[0]);
        }
        if (data < 100.0f) {
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(data, 2, new int[0]) : NumberFormatter.formatFloat2String(data, 2, new int[0]);
        }
        if (data < 1000.0f) {
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(data, 1, new int[0]) : NumberFormatter.formatFloat2String(data, 1, new int[0]);
        }
        if (data < 10000.0f) {
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(data, 0, new int[0]) : NumberFormatter.formatFloat2String(data, 0, new int[0]);
        }
        return Intrinsics.stringPlus("", Integer.valueOf((int) data));
    }

    private final String b(float data, boolean isMetric, boolean isLocale) {
        if (data <= 0.0f) {
            return "0";
        }
        float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(data, isMetric);
        if (fConvertMeterToKmOrMile <= 10.0f) {
            ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
            if (!isMetric) {
                d(readWritePropertyNotNull, RunDataConversion.convertMeterToYard(data));
            }
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(c(readWritePropertyNotNull), 0, new int[0]) : NumberFormatter.formatFloat2String(c(readWritePropertyNotNull), 0, new int[0]);
        }
        if (fConvertMeterToKmOrMile < 100.0f) {
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(fConvertMeterToKmOrMile, 2, new int[0]) : NumberFormatter.formatFloat2String(fConvertMeterToKmOrMile, 2, new int[0]);
        }
        if (fConvertMeterToKmOrMile < 1000.0f) {
            return isLocale ? NumberFormatter.formatFloat2StringByLocale(fConvertMeterToKmOrMile, 1, new int[0]) : NumberFormatter.formatFloat2String(fConvertMeterToKmOrMile, 1, new int[0]);
        }
        return Intrinsics.stringPlus("", Integer.valueOf((int) fConvertMeterToKmOrMile));
    }

    private static final float c(ReadWriteProperty<Object, Float> readWriteProperty) {
        return readWriteProperty.getValue(null, a[0]).floatValue();
    }

    private static final void d(ReadWriteProperty<Object, Float> readWriteProperty, float f) {
        readWriteProperty.setValue(null, a[0], Float.valueOf(f));
    }

    @NotNull
    public final String formatKMDisToMI(float dis) {
        return parseRawKilometerToFormatKilometer(RunDataConversion.convertMeterToKmOrMile(dis * 1000, false));
    }

    @Nullable
    public final String getBulkStrings(@NotNull String bulk, int index) {
        int iIndexOf$default;
        if (index > 0) {
            int i = 0;
            iIndexOf$default = 0;
            do {
                i++;
                iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) bulk, ";", iIndexOf$default + 1, false, 4, (Object) null);
            } while (i < index);
        } else {
            iIndexOf$default = 0;
        }
        return bulk.substring(0, iIndexOf$default);
    }

    @NotNull
    public final String getConsumeTime(long seconds) {
        return getConsumeTime(seconds, 0);
    }

    @NotNull
    public final String[] getFormatDisAndUnit(float distance, int sportType, boolean isMetric, @NotNull boolean... shortCode) {
        int i;
        int i2;
        boolean z = (((shortCode.length == 0) ^ true) && shortCode.length == 1) ? shortCode[0] : true;
        String[] strArr = new String[2];
        float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(distance, isMetric);
        if (isDisUnitSupportMeterOrYads(sportType)) {
            strArr[0] = parseDis2MeterOrYardOrKmOrMile(distance, isMetric);
            if (isMetric) {
                if (fConvertMeterToKmOrMile <= 10.0f) {
                    i2 = R.string.td_m;
                } else {
                    i2 = z ? R.string.running_kilometers : R.string.td_kilometer;
                }
                strArr[1] = String.valueOf(i2);
            } else {
                if (fConvertMeterToKmOrMile <= 10.0f) {
                    i = R.string.unit_yard;
                } else {
                    i = z ? R.string.running_miles : R.string.td_mile;
                }
                strArr[1] = String.valueOf(i);
            }
        } else {
            if (z) {
                strArr[1] = String.valueOf(isMetric ? R.string.running_kilometers : R.string.running_miles);
            } else {
                strArr[1] = String.valueOf(isMetric ? R.string.td_kilometer : R.string.td_mile);
            }
            strArr[0] = parseRawKilometerToFormatKilometer(fConvertMeterToKmOrMile);
        }
        return strArr;
    }

    public final boolean isDisUnitSupportMeterOrYads(int sportType) {
        return sportType == 14 || sportType == 15 || sportType == 1015;
    }

    @NotNull
    public final String parseDis2MeterOrYardOrKmOrMile(float distance, boolean isMetric) {
        return b(distance, isMetric, true);
    }

    @NotNull
    public final String parseRawKilometerToFormatKilometer(float distance) {
        return a(distance, true);
    }

    @NotNull
    public final String getConsumeTime(long seconds, int hourDisSeconds) {
        if (seconds < 0) {
            return "00:00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = simpleDateFormat.getCalendar();
        calendar.setTimeInMillis(((long) 1000) * seconds);
        int i = calendar.get(11) + (((int) (seconds / secondsTimeof24h)) * 24);
        int i2 = calendar.get(12);
        int i3 = calendar.get(13);
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        sb.append(String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        sb.append(JsonLexerKt.COLON);
        sb.append(String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        if (hourDisSeconds <= 0 || i < hourDisSeconds) {
            sb.append(JsonLexerKt.COLON);
            sb.append(String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
        }
        return sb.toString();
    }
}
