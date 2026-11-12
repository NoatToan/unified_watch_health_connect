package com.huami.tools.analytics.internal.utils;

import androidx.annotation.Nullable;
import com.huami.tools.analytics.internal.function.Consumer;
import com.huami.tools.analytics.internal.function.Function;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class JavaUtils {
    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String getElapsedTimeLog(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        long seconds = timeUnit.toSeconds(j);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long seconds2 = seconds - timeUnit2.toSeconds(minutes);
        return String.format(Locale.getDefault(), "%02d:%02d.%03d", Long.valueOf(minutes), Long.valueOf(seconds2), Long.valueOf((j - timeUnit2.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds2)));
    }

    public static Calendar getNowCalendar() {
        return Calendar.getInstance();
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static int getTimeZoneKey(int i) {
        int i2 = (i / 1000) / 60;
        int i3 = i2 < 0 ? -1 : 1;
        int iAbs = Math.abs(i2);
        return (((iAbs / 60) * 4) + ((iAbs % 60) / 15)) * i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, K> void groupList(List<T> list, Function<T, K> function, Function<K, Consumer<List<T>>> function2) {
        HashMap map = new HashMap();
        for (T t : list) {
            K kApply = function.apply(t);
            List arrayList = (List) map.get(function.apply(t));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(kApply, arrayList);
            }
            arrayList.add(t);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2 != null) {
                ((Consumer) function2.apply(key)).accept(list2);
            }
        }
    }

    public static boolean isEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static <T> void segmentList(List<T> list, int i, Consumer<List<T>> consumer) {
        int i2 = 0;
        int size = (list.size() / i) + (list.size() % i > 0 ? 1 : 0);
        while (i2 < size) {
            int i3 = i2 * i;
            i2++;
            int size2 = i2 * i;
            if (size2 > list.size()) {
                size2 = list.size();
            }
            consumer.accept(list.subList(i3, size2));
        }
    }
}
