package com.huami.sleep.sleepintrodetail.convert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "", "minutesToTime", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class SleepQuotientConvertKt {
    @NotNull
    public static final String minutesToTime(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(12, i);
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(calendar.getTime());
    }
}
