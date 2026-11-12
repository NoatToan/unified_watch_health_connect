package com.huawei.phoneservice.feedback.photolibrary.internal.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.wearengine.sensor.DataResult;
import defpackage.zcp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21693b = new c();
    private static final ThreadLocal<SimpleDateFormat> e = new ThreadLocal<>();

    public final SimpleDateFormat e() {
        ThreadLocal<SimpleDateFormat> threadLocal = e;
        if (threadLocal.get() == null) {
            threadLocal.set(new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA));
        }
        return threadLocal.get();
    }

    @JvmStatic
    public static final boolean c(String str, Context context) {
        c cVar = f21693b;
        String strD = d(str, "yyyy-MM-dd HH:mm", context);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        Calendar calendar2 = Calendar.getInstance();
        try {
            SimpleDateFormat simpleDateFormatE = cVar.e();
            zcp.e(simpleDateFormatE);
            calendar2.setTime(simpleDateFormatE.parse(strD));
            return calendar2.get(1) == calendar.get(1) && calendar2.get(6) - calendar.get(6) == 0;
        } catch (ParseException e2) {
            g.c("FeedbackTimeUtils", e2.getMessage());
            return false;
        }
    }

    @JvmStatic
    public static final String d(String str, String str2, Context context) {
        if (!TextUtils.isEmpty(str)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
            try {
                Date date = simpleDateFormat.parse(str);
                zcp.b((Object) date, "");
                if (!TextUtils.isEmpty(str2)) {
                    simpleDateFormat = new SimpleDateFormat(str2);
                }
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                String str3 = simpleDateFormat.format(Long.valueOf(date.getTime()));
                zcp.b((Object) str3, "");
                return str3;
            } catch (ParseException e2) {
                g.a("FeedbackTimeUtils", "utc2Local failed. " + e2.getMessage(), new Object[0]);
            }
        }
        return "";
    }

    private c() {
    }
}
