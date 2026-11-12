package com.huawei.hms.network.embedded;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f14878a = 253402300799999L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f14879b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f14880c = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    public static final DateFormat[] d = new DateFormat[15];

    public class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(f8.i);
            return simpleDateFormat;
        }
    }

    public static Date a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f14879b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f14880c;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = d;
                DateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f14880c[i], Locale.US);
                    simpleDateFormat.setTimeZone(f8.i);
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }

    public static String a(Date date) {
        return f14879b.get().format(date);
    }
}
