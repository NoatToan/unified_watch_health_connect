package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public class f8o {
    public final rfi a(String str, char c) {
        int iIndexOf = str.indexOf(c);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException(c + " was not found in " + str);
        }
        int i = c == '<' ? 1 : 0;
        if (!str.substring(0, iIndexOf).trim().equalsIgnoreCase("date_time")) {
            throw new IllegalArgumentException("not found date_time in " + str);
        }
        String strTrim = str.substring(iIndexOf + 1).trim();
        if (!strTrim.startsWith("=")) {
            if (strTrim.length() == 1 && strTrim.startsWith("?")) {
                return new rfi(i, 4, iIndexOf);
            }
            if (TextUtils.isDigitsOnly(strTrim)) {
                return new rfi(i, 3, iIndexOf, Long.parseLong(strTrim));
            }
            throw new IllegalArgumentException("there is an error in " + str);
        }
        String strTrim2 = strTrim.substring(1).trim();
        if (strTrim2.length() == 1 && strTrim2.startsWith("?")) {
            return new rfi(i, 4, iIndexOf);
        }
        if (TextUtils.isDigitsOnly(strTrim2)) {
            return new rfi(i, 3, iIndexOf, Long.parseLong(strTrim2));
        }
        throw new IllegalArgumentException("error in " + strTrim2);
    }

    public final rfi b(String str) {
        if (str.indexOf(60) != -1) {
            return a(str, Typography.less);
        }
        if (str.indexOf(62) != -1) {
            return a(str, Typography.greater);
        }
        throw new IllegalArgumentException("error in " + str);
    }

    public Pair<Long, Long> c(String str, String[] strArr) {
        String strTrim = str.toLowerCase(Locale.US).trim();
        int iIndexOf = strTrim.indexOf("and");
        if (iIndexOf != -1) {
            return d(b(strTrim.substring(0, iIndexOf)), b(strTrim.substring(iIndexOf + 3)), strArr);
        }
        throw new IllegalArgumentException("'and' not found in " + str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final Pair<Long, Long> d(rfi rfiVar, rfi rfiVar2, String[] strArr) {
        int i = rfiVar.f32494a;
        int i2 = rfiVar.f32495b;
        long j = rfiVar.d;
        int i3 = rfiVar2.f32494a;
        int i4 = rfiVar2.f32495b;
        long j2 = rfiVar2.d;
        if (i != 0) {
            if (i != 1) {
                j = 0;
                j2 = 0;
            } else if (i3 != 0) {
                if (i3 == 1) {
                    throw new IllegalArgumentException("error selection range");
                }
                j = 0;
                j2 = 0;
            } else {
                if (i2 != 3) {
                    j = Long.parseLong(strArr[0]);
                }
                if (i4 != 3) {
                    j2 = Long.parseLong(strArr[1]);
                }
            }
        } else {
            if (i3 == 0) {
                throw new IllegalArgumentException("error selection range");
            }
            if (i3 != 1) {
                j = 0;
                j2 = 0;
            } else {
                if (i2 != 3) {
                    j = Long.parseLong(strArr[0]);
                }
                if (i4 != 3) {
                    j2 = Long.parseLong(strArr[1]);
                }
                long j3 = j;
                j = j2;
                j2 = j3;
            }
        }
        if (j2 <= j) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j));
        }
        throw new IllegalArgumentException("startTime can't be bigger than endTime");
    }
}
