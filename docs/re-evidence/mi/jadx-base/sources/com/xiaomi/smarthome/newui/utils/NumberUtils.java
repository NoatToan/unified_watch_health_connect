package com.xiaomi.smarthome.newui.utils;

import com.xiaomi.fitness.common.utils.TimeUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class NumberUtils {
    private static final String TAG = "NumberUtils";

    public static Number add(Object obj, Object obj2) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Double.valueOf(valueOf(obj2, 0.0d) + valueOf(obj, 0.0d));
        }
        if ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) {
            return numberToBigDecimal((Number) obj).add(numberToBigDecimal((Number) obj2));
        }
        return ((obj instanceof Double) || (obj2 instanceof Double) || (obj instanceof Float) || (obj2 instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue() + ((Number) obj2).doubleValue()) : Long.valueOf(((Number) obj).longValue() + ((Number) obj2).longValue());
    }

    public static long checkTime(long j) {
        return j > 30000000000L ? j : j * 1000;
    }

    public static Number divide(Object obj, Object obj2) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Double.valueOf(valueOf(obj2, 0.0d) / valueOf(obj, 0.0d));
        }
        if (!(obj instanceof BigDecimal) && !(obj2 instanceof BigDecimal)) {
            return ((obj instanceof Double) || (obj2 instanceof Double) || (obj instanceof Float) || (obj2 instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue() / ((Number) obj2).doubleValue()) : Long.valueOf(((Number) obj).longValue() / ((Number) obj2).longValue());
        }
        BigDecimal bigDecimalNumberToBigDecimal = numberToBigDecimal((Number) obj);
        BigDecimal bigDecimalNumberToBigDecimal2 = numberToBigDecimal((Number) obj2);
        return bigDecimalNumberToBigDecimal.divide(bigDecimalNumberToBigDecimal2, Math.max(bigDecimalNumberToBigDecimal.scale(), bigDecimalNumberToBigDecimal2.scale()), RoundingMode.HALF_UP);
    }

    public static boolean equalsBigValue(Object obj, Object obj2) {
        if (Objects.equals(obj, obj2) || String.valueOf(obj).equals(String.valueOf(obj2))) {
            return true;
        }
        double dValueOf = valueOf(obj, -1.0d);
        double dValueOf2 = valueOf(obj2, -2.0d);
        return dValueOf == dValueOf2 || dValueOf > dValueOf2;
    }

    public static boolean equalsSmallValue(Object obj, Object obj2) {
        if (Objects.equals(obj, obj2) || String.valueOf(obj).equals(String.valueOf(obj2))) {
            return true;
        }
        double dValueOf = valueOf(obj, -1.0d);
        double dValueOf2 = valueOf(obj2, -2.0d);
        return dValueOf == dValueOf2 || dValueOf < dValueOf2;
    }

    public static boolean equalsValue(Object obj, Object obj2) {
        return Objects.equals(obj, obj2) || String.valueOf(obj).equals(String.valueOf(obj2)) || valueOf(obj, -1.0d, false) == valueOf(obj2, -2.0d, false);
    }

    public static String formatDate(Locale locale, long j) {
        long jCheckTime = checkTime(j);
        return (System.currentTimeMillis() - 86400000 > jCheckTime ? new SimpleDateFormat("MM-dd", locale) : new SimpleDateFormat(TimeUtils.FORMAT_H_M, locale)).format(new Date(jCheckTime));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    public static boolean isDigits(String str) {
        if (str == null) {
            return false;
        }
        switch (str) {
            case "int8":
            case "uint8":
            case "int16":
            case "uint16":
            case "int32":
            case "uint32":
            case "int64":
            case "byte":
            case "short":
            case "int":
            case "uint":
            case "long":
                return true;
            case "double":
            case "string":
            case "float":
            case "bool":
            default:
                return false;
        }
    }

    public static Number multiply(Object obj, Object obj2) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Double.valueOf(valueOf(obj2, 0.0d) * valueOf(obj, 0.0d));
        }
        if ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) {
            return numberToBigDecimal((Number) obj).multiply(numberToBigDecimal((Number) obj2));
        }
        return ((obj instanceof Double) || (obj2 instanceof Double) || (obj instanceof Float) || (obj2 instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue() * ((Number) obj2).doubleValue()) : Long.valueOf(((Number) obj).longValue() * ((Number) obj2).longValue());
    }

    private static BigDecimal numberToBigDecimal(Number number) {
        if (number instanceof BigDecimal) {
            return (BigDecimal) number;
        }
        return ((number instanceof Double) || (number instanceof Float)) ? BigDecimal.valueOf(number.doubleValue()) : BigDecimal.valueOf(number.longValue());
    }

    public static Number remainder(Object obj, Object obj2) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Double.valueOf(valueOf(obj2, 0.0d) % valueOf(obj, 0.0d));
        }
        if ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) {
            return numberToBigDecimal((Number) obj).remainder(numberToBigDecimal((Number) obj2));
        }
        return ((obj instanceof Double) || (obj2 instanceof Double) || (obj instanceof Float) || (obj2 instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue()) : Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
    }

    public static ArrayList<Integer> split(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i2 = 1; i >= i2; i2 <<= 1) {
            if ((i2 & i) == i2) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    public static Number subtract(Object obj, Object obj2) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Double.valueOf(valueOf(obj2, 0.0d) - valueOf(obj, 0.0d));
        }
        if ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) {
            return numberToBigDecimal((Number) obj).subtract(numberToBigDecimal((Number) obj2));
        }
        return ((obj instanceof Double) || (obj2 instanceof Double) || (obj instanceof Float) || (obj2 instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) : Long.valueOf(((Number) obj).longValue() - ((Number) obj2).longValue());
    }

    public static double valueOf(Object obj, double d) {
        return valueOf(obj, d, true);
    }

    public static double valueOf(Object obj, double d, boolean z) {
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(String.valueOf(obj));
        } catch (Exception unused) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("parseDouble ");
                sb.append(obj);
                sb.append(" catch exception, return defalut value ");
                sb.append(d);
            }
            return d;
        }
    }

    public static long valueOf(Object obj, long j) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            return Long.parseLong(String.valueOf(obj));
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("parseLong ");
            sb.append(obj);
            sb.append(" catch exception, return defalut value ");
            sb.append(j);
            return j;
        }
    }

    public static int valueOf(Object obj, int i) {
        return valueOf(obj, 10, i);
    }

    public static int valueOf(Object obj, int i, int i2) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return Integer.parseInt(String.valueOf(obj), i);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("parseDouble ");
            sb.append(obj);
            sb.append(" catch exception, return defalut value ");
            sb.append(i2);
            return i2;
        }
    }
}
