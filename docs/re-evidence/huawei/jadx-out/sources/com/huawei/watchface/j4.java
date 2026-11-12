package com.huawei.watchface;

import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes45.dex */
public abstract class j4 {
    public static String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
}
