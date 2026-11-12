package com.huami.tools.log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0002"}, d2 = {"", "getCurrentTimeZone", "log_release"}, k = 2, mv = {1, 4, 0})
public final class UtilsKt {
    @Nullable
    public static final String getCurrentTimeZone() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeZone(calendar2.getTimeZone());
            calendar.set(calendar2.get(1), 11, 31, 13, 0, 0);
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ");
            simpleDateFormat.setTimeZone(calendar2.getTimeZone());
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(date));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }
}
