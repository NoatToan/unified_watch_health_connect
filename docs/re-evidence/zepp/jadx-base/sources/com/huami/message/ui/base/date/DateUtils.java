package com.huami.message.ui.base.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\t\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\r\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0011\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huami/message/ui/base/date/DateUtils;", "", "Ljava/text/SimpleDateFormat;", "a", "Ljava/text/SimpleDateFormat;", "dateFormat", "", "getMondayPlus", "()I", "mondayPlus", "", "getCurrentMonday", "()Ljava/lang/String;", "currentMonday", "getPreviousSunday", "previousSunday", "getGetWeekFormat", "getWeekFormat", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class DateUtils {

    @NotNull
    public static final DateUtils INSTANCE = new DateUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("M.d");

    private DateUtils() {
    }

    @NotNull
    public final String getCurrentMonday() {
        int mondayPlus = getMondayPlus();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(5, mondayPlus);
        return dateFormat.format(gregorianCalendar.getTime());
    }

    @NotNull
    public final String getGetWeekFormat() {
        return getCurrentMonday() + '-' + getPreviousSunday();
    }

    public final int getMondayPlus() {
        int i = Calendar.getInstance().get(7);
        if (i == 1) {
            return -6;
        }
        return 2 - i;
    }

    @NotNull
    public final String getPreviousSunday() {
        int mondayPlus = getMondayPlus();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(5, mondayPlus + 6);
        return dateFormat.format(gregorianCalendar.getTime());
    }
}
