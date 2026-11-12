package com.huami.feedback.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "millis", "getDateFromSeconds", "", "a", LogUtil.I, "MILLISECOND_OF_HOUR", "", "b", "J", "getConnectDuration", "()J", "setConnectDuration", "(J)V", "connectDuration", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {
    private static final int a = 3600000;
    private static long b;

    public static final long getConnectDuration() {
        return b;
    }

    @Nullable
    public static final String getDateFromSeconds(@NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(Long.parseLong(str));
            String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
            objM3845constructorimpl = Result.m3845constructorimpl(((Object) str2) + "(utc+" + (calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 3600000) + ')');
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }

    public static final void setConnectDuration(long j) {
        b = j;
    }
}
