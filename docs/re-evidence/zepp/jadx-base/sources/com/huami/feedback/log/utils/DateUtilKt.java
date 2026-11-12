package com.huami.feedback.log.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "a", "Ljava/lang/String;", "FORMAT_PATTERN", "getFormatTimeDisplay", "()Ljava/lang/String;", "formatTimeDisplay", "feedback-sync-device-log-impl_release"}, k = 2, mv = {1, 5, 1})
public final class DateUtilKt {

    @NotNull
    private static final String a = "yyyyMMddHHmmss";

    @NotNull
    public static final String getFormatTimeDisplay() {
        return new SimpleDateFormat(a, Locale.getDefault()).format(new Date());
    }
}
