package com.amazon.alexa.avs;

import android.annotation.SuppressLint;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class DateUtils {

    @SuppressLint({"NewApi"})
    public static final DateTimeFormatter AVS_ISO_OFFSET_DATE_TIME = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).appendOffset("+HHmm", "+0000").toFormatter();
}
