package com.huami.watch.dataflow.model.health.process;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class Utils {
    public static final boolean DEBUG_SLEEP = true;

    private Utils() {
    }

    public static float format(double d) {
        return Math.round(d * 1000.0d) / 1000.0f;
    }

    public static void updateDateAsIndex(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(12, i);
        date.setTime(calendar.getTimeInMillis());
    }
}
