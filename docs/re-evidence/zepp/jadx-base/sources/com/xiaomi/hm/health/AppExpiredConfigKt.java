package com.xiaomi.hm.health;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "pattern", "Ljava/util/Calendar;", "toCalendar", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class AppExpiredConfigKt {
    @NotNull
    public static final Calendar toCalendar(@NotNull String str, @NotNull String str2) {
        try {
            long time = new SimpleDateFormat(str2, Locale.getDefault()).parse(str).getTime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time);
            return calendar;
        } catch (ParseException e) {
            e.printStackTrace();
            return new GregorianCalendar(2099, 11, 31, 23, 59, 59);
        }
    }

    public static /* synthetic */ Calendar toCalendar$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd HH:mm:ss";
        }
        return toCalendar(str, str2);
    }
}
