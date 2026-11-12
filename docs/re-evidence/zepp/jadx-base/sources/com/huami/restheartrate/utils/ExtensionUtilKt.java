package com.huami.restheartrate.utils;

import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0004"}, d2 = {"", "", "getDate", "secondToMills", "restheartrate_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionUtilKt {
    @NotNull
    public static final String getDate(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(secondToMills(j));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('-');
        int i4 = i2 + 1;
        if (i4 < 10) {
            sb.append(0);
        }
        sb.append(i4);
        sb.append('-');
        if (i3 < 10) {
            sb.append(0);
        }
        sb.append(i3);
        return sb.toString();
    }

    public static final long secondToMills(long j) {
        return String.valueOf(j).length() == 10 ? j * ((long) 1000) : j;
    }
}
