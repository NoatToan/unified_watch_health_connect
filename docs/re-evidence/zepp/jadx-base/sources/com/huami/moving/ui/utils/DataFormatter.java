package com.huami.moving.ui.utils;

import android.content.Context;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.R;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class DataFormatter {
    private static final char a = ':';
    private static final long b = 86400;
    private static Gson c;

    private DataFormatter() {
    }

    private static String a(float f, boolean z) {
        if (f <= 0.0f) {
            return z ? NumberFormatter.formatFloat2StringByLocale(0.0f, 2, new int[0]) : NumberFormatter.formatFloat2String(0.0f, 2, new int[0]);
        }
        if (f < 100.0f) {
            return z ? NumberFormatter.formatFloat2StringByLocale(f, 2, new int[0]) : NumberFormatter.formatFloat2String(f, 2, new int[0]);
        }
        if (f < 1000.0f) {
            return z ? NumberFormatter.formatFloat2StringByLocale(f, 1, new int[0]) : NumberFormatter.formatFloat2String(f, 1, new int[0]);
        }
        if (f < 10000.0f) {
            return z ? NumberFormatter.formatFloat2StringByLocale(f, 0, new int[0]) : NumberFormatter.formatFloat2String(f, 0, new int[0]);
        }
        return "" + ((int) f);
    }

    private static String b(float f, boolean z, boolean z2) {
        if (f <= 0.0f) {
            return "0";
        }
        float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(f, z);
        if (fConvertMeterToKmOrMile <= 10.0f) {
            if (!z) {
                f = RunDataConversion.convertMeterToYard(f);
            }
            return z2 ? NumberFormatter.formatFloat2StringByLocale(f, 0, new int[0]) : NumberFormatter.formatFloat2String(f, 0, new int[0]);
        }
        if (fConvertMeterToKmOrMile < 100.0f) {
            return z2 ? NumberFormatter.formatFloat2StringByLocale(fConvertMeterToKmOrMile, 2, new int[0]) : NumberFormatter.formatFloat2String(fConvertMeterToKmOrMile, 2, new int[0]);
        }
        if (fConvertMeterToKmOrMile < 1000.0f) {
            return z2 ? NumberFormatter.formatFloat2StringByLocale(fConvertMeterToKmOrMile, 1, new int[0]) : NumberFormatter.formatFloat2String(fConvertMeterToKmOrMile, 1, new int[0]);
        }
        return "" + ((int) fConvertMeterToKmOrMile);
    }

    private static int c(int[] iArr) {
        if (iArr == null || iArr.length != 1 || iArr[0] < 0 || iArr[0] > 6) {
            return 1;
        }
        return iArr[0];
    }

    public static float convertSecondValue(float f) {
        int i = (int) (f / 3600.0f);
        int i2 = (int) ((f - ((i * 60) * 60)) / 60.0f);
        int i3 = i * 3600;
        int i4 = i2 * 60;
        return ((int) ((f - ((float) i3)) - ((float) i4))) < 30 ? i3 + i4 : i3 + i4 + 60;
    }

    public static float format(float f, int i, int... iArr) {
        return new BigDecimal(String.valueOf(f)).setScale(i, c(iArr)).floatValue();
    }

    public static String formatDate_no_y(Context context, Date date, boolean z) {
        return new SimpleDateFormat(z ? context.getString(R.string.date_Md_pattern) : context.getString(R.string.date_Md_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatFloat2String(float f, int i, int... iArr) {
        float f2 = (iArr == null || iArr.length != 1) ? format(f, i, new int[0]) : format(f, i, iArr[0]);
        return String.format(Locale.getDefault(), "%." + i + "f", Float.valueOf(f2));
    }

    public static String formatTime(long j, String str, boolean z) {
        if (j <= 0) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        if (z) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String formatTimeInSportForm(long j) {
        if (j <= 0) {
            return "00'00\"";
        }
        long j2 = ((j % TimeUtils.TIME_1_HOURS) / 60) + ((j / TimeUtils.TIME_1_HOURS) * 60);
        long j3 = j % 60;
        StringBuilder sb = new StringBuilder();
        if (j2 <= 0) {
            sb.append("00'");
        } else if (j2 < 10) {
            sb.append('0');
            sb.append(j2);
            sb.append('\'');
        } else {
            sb.append(j2);
            sb.append('\'');
        }
        if (j3 <= 0) {
            sb.append("00\"");
        } else if (j3 < 10) {
            sb.append('0');
            sb.append(j3);
            sb.append('\"');
        } else {
            sb.append(j3);
            sb.append('\"');
        }
        return sb.toString();
    }

    public static String formatTimeInSportFormForPace(long j) {
        if (j <= 0) {
            return "00'00\"";
        }
        long j2 = ((j % TimeUtils.TIME_1_HOURS) / 60) + ((j / TimeUtils.TIME_1_HOURS) * 60);
        long j3 = j % 60;
        if (RunnerData.getRunner().isMetric()) {
            if (j2 >= 30) {
                return "--";
            }
        } else if (j2 >= 48) {
            return "--";
        }
        StringBuilder sb = new StringBuilder();
        if (j2 <= 0) {
            sb.append("00'");
        } else if (j2 < 10) {
            sb.append('0');
            sb.append(j2);
            sb.append('\'');
        } else {
            sb.append(j2);
            sb.append('\'');
        }
        if (j3 <= 0) {
            sb.append("00\"");
        } else if (j3 < 10) {
            sb.append('0');
            sb.append(j3);
            sb.append('\"');
        } else {
            sb.append(j3);
            sb.append('\"');
        }
        return sb.toString();
    }

    public static String getConsumeTime(long j) {
        return getConsumeTime(j, 0);
    }

    public static String[] getFormatDisAndUnit(float f, int i, boolean z, boolean... zArr) {
        int i2;
        int i3;
        boolean z2 = (zArr == null || zArr.length != 1) ? true : zArr[0];
        String[] strArr = new String[2];
        float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(f, z);
        if (SportTypeIdentifier.isDisUnitSupportMeterOrYads(i)) {
            strArr[0] = parseDis2MeterOrYardOrKmOrMile(f, z);
            if (z) {
                if (fConvertMeterToKmOrMile <= 10.0f) {
                    i3 = R.string.unit_m;
                } else {
                    i3 = z2 ? R.string.running_kilometers : R.string.running_kilometer;
                }
                strArr[1] = String.valueOf(i3);
            } else {
                if (fConvertMeterToKmOrMile <= 10.0f) {
                    i2 = R.string.unit_yard;
                } else {
                    i2 = z2 ? R.string.running_miles : R.string.running_mile;
                }
                strArr[1] = String.valueOf(i2);
            }
        } else {
            if (z2) {
                strArr[1] = String.valueOf(z ? R.string.running_kilometers : R.string.running_miles);
            } else {
                strArr[1] = String.valueOf(z ? R.string.running_kilometer : R.string.running_mile);
            }
            strArr[0] = parseRawKilometerToFormatKilometer(fConvertMeterToKmOrMile);
        }
        return strArr;
    }

    public static String getFormatDurationTime(long j) {
        if (j < 0) {
            return "00:00:00";
        }
        int i = (int) (j / TimeUtils.TIME_1_HOURS);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return String.format("%1$02d:%2$02d:%3$02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j2 - ((long) (i2 * 60)))));
    }

    public static String[] getFormatPaceAndUnit(float f, int i, boolean z) {
        String[] strArr = new String[2];
        boolean zIsDisUnitSupportMeterOrYads = SportTypeIdentifier.isDisUnitSupportMeterOrYads(i);
        if (RunDataConversion.convertTokmph(f) < 0.01d) {
            strArr[0] = formatTimeInSportFormForPace(0L);
        } else if (zIsDisUnitSupportMeterOrYads) {
            float f2 = f * 100.0f;
            if (!z) {
                f2 *= 0.9144f;
            }
            strArr[0] = formatTimeInSportFormForPace((long) f2);
        } else {
            strArr[0] = formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(f, z));
        }
        if (z) {
            strArr[1] = String.valueOf(zIsDisUnitSupportMeterOrYads ? R.string.running_pace_per_100m : R.string.running_detail_pace_desc);
        } else {
            strArr[1] = String.valueOf(zIsDisUnitSupportMeterOrYads ? R.string.running_pace_per_100yds : R.string.running_detail_pace_desc_br);
        }
        return strArr;
    }

    public static String getHHMMSSTimeBySecond(Context context, int i) {
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        int i2 = i / 3600;
        int i3 = (i - ((i2 * 60) * 60)) / 60;
        int i4 = (i - (i2 * 3600)) - (i3 * 60);
        if (i2 < 10) {
            sb = new StringBuilder();
            sb.append("0");
        } else {
            sb = new StringBuilder();
            sb.append("");
        }
        sb.append(i2);
        String string = sb.toString();
        if (i3 < 10) {
            sb2 = new StringBuilder();
            sb2.append("0");
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
        }
        sb2.append(i3);
        String string2 = sb2.toString();
        if (i4 < 10) {
            str = "0" + i4;
        } else {
            str = "" + i4;
        }
        return string + ":" + string2 + ":" + str;
    }

    public static String getHHMMTimeBySecond(Context context, float f) {
        float fConvertSecondValue = convertSecondValue(f);
        int i = (int) (fConvertSecondValue / 3600.0f);
        int i2 = (int) ((fConvertSecondValue - ((i * 60) * 60)) / 60.0f);
        if (i == 0) {
            return i2 + context.getString(R.string.unit_min);
        }
        return i + context.getString(R.string.unit_hour) + i2 + context.getString(R.string.unit_min);
    }

    public static String getTimeWithColon(long j) {
        if (j < 0) {
            return "00:00";
        }
        long j2 = j / TimeUtils.TIME_1_HOURS;
        long j3 = (j % TimeUtils.TIME_1_HOURS) / 60;
        long j4 = j % 60;
        StringBuilder sb = new StringBuilder();
        if (j2 <= 0) {
            if (j3 < 10) {
                sb.append('0');
                sb.append(j3);
            } else {
                sb.append(j3);
            }
            sb.append(':');
            if (j4 < 10) {
                sb.append('0');
                sb.append(j4);
            } else {
                sb.append(j4);
            }
        } else {
            if (j2 < 10) {
                sb.append('0');
                sb.append(j2);
            } else {
                sb.append(j2);
            }
            sb.append(':');
            if (j3 < 10) {
                sb.append('0');
                sb.append(j3);
                sb.append(':');
            } else {
                sb.append(j3);
                sb.append(':');
            }
            if (j4 < 10) {
                sb.append('0');
                sb.append(j4);
            } else {
                sb.append(j4);
            }
        }
        return sb.toString();
    }

    public static Gson gson() {
        if (c == null) {
            c = new GsonBuilder().create();
        }
        return c;
    }

    public static String parseDis2MeterOrYardOrKmOrMile(float f, boolean z) {
        return b(f, z, true);
    }

    public static int parsePaceStr(String str) {
        int length = str.length();
        return (Integer.parseInt(str.substring(0, length - 4)) * 60) + Integer.parseInt(str.substring(length - 3, length - 1));
    }

    public static String parseRawKilometerToFormatKilometer(float f) {
        return a(f, true);
    }

    public static String getConsumeTime(long j, int i) {
        if (j < 0) {
            return "00:00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = simpleDateFormat.getCalendar();
        calendar.setTimeInMillis(1000 * j);
        int i2 = calendar.get(11) + (((int) (j / 86400)) * 24);
        int i3 = calendar.get(12);
        int i4 = calendar.get(13);
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2)));
        sb.append(':');
        sb.append(String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3)));
        if (i <= 0 || i2 < i) {
            sb.append(':');
            sb.append(String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i4)));
        }
        return sb.toString();
    }
}
