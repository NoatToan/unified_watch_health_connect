package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f16041a = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})Z");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16042b = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f16043c = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");
    private static final Pattern d = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})\\d{6}Z");

    private static void a(HmsScan.EventTime eventTime, int i, int i2, int i3) {
        eventTime.year = i;
        eventTime.month = i2;
        eventTime.day = i3;
    }

    static void a(String str, HmsScan.EventTime eventTime) {
        Matcher matcher = f16041a.matcher(str);
        Matcher matcher2 = f16042b.matcher(str);
        Matcher matcher3 = f16043c.matcher(str);
        Matcher matcher4 = d.matcher(str);
        try {
            if (matcher.matches()) {
                a(eventTime, Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
                b(eventTime, Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                eventTime.isUTCTime = true;
                eventTime.originalValue = str;
                return;
            }
            if (matcher2.matches()) {
                a(eventTime, Integer.parseInt(matcher2.group(1)), Integer.parseInt(matcher2.group(2)), Integer.parseInt(matcher2.group(3)));
                b(eventTime, Integer.parseInt(matcher2.group(4)), Integer.parseInt(matcher2.group(5)), Integer.parseInt(matcher2.group(6)));
                eventTime.originalValue = str;
            } else if (matcher3.matches()) {
                a(eventTime, Integer.parseInt(matcher3.group(1)), Integer.parseInt(matcher3.group(2)), Integer.parseInt(matcher3.group(3)));
                eventTime.originalValue = str;
            } else if (matcher4.matches()) {
                a(eventTime, Integer.parseInt(matcher4.group(1)), Integer.parseInt(matcher4.group(2)), Integer.parseInt(matcher4.group(3)));
            }
        } catch (NullPointerException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "NullPointerException");
        }
    }

    private static void b(HmsScan.EventTime eventTime, int i, int i2, int i3) {
        eventTime.hours = i;
        eventTime.minutes = i2;
        eventTime.seconds = i3;
    }
}
