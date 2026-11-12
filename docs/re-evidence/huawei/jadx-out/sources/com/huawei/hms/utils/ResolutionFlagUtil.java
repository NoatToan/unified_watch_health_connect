package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ResolutionFlagUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ResolutionFlagUtil f16911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Long> f16912b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f16913c = new Object();

    private ResolutionFlagUtil() {
    }

    private void a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime();
        for (String str : f16912b.keySet()) {
            Map<String, Long> map = f16912b;
            Long l = map.get(str);
            if (l == null || l.longValue() == 0) {
                map.remove(str);
                HMSLog.i("ResolutionFlagUtil", "remove resolution flag because the data in this pair was abnormal: " + str);
            } else if (time - 10800000 >= l.longValue()) {
                map.remove(str);
                HMSLog.i("ResolutionFlagUtil", "remove resolution flag because aging time: " + str);
            }
        }
    }

    public static ResolutionFlagUtil getInstance() {
        if (f16911a != null) {
            return f16911a;
        }
        synchronized (f16913c) {
            if (f16911a == null) {
                f16911a = new ResolutionFlagUtil();
            }
        }
        return f16911a;
    }

    public long getResolutionFlag(String str) {
        if (str == null) {
            HMSLog.e("ResolutionFlagUtil", "transactionId is null");
            return 0L;
        }
        Map<String, Long> map = f16912b;
        if (map.get(str) != null) {
            return map.get(str).longValue();
        }
        return 0L;
    }

    public void removeResolutionFlag(String str) {
        if (str == null) {
            HMSLog.e("ResolutionFlagUtil", "transactionId is null");
        } else {
            f16912b.remove(str);
            HMSLog.i("ResolutionFlagUtil", "remove resolution flag");
        }
    }

    public void saveResolutionFlag(String str, long j) {
        if (!TextUtils.isEmpty(str) && j != 0) {
            a(str, j);
            return;
        }
        HMSLog.e("ResolutionFlagUtil", "saveResolutionFlag error, transactionId: " + str + ", timestamp: " + j);
    }

    private void a(String str, long j) {
        Map<String, Long> map = f16912b;
        synchronized (map) {
            a();
            map.put(str, Long.valueOf(j));
            HMSLog.i("ResolutionFlagUtil", "save resolution flag");
        }
    }
}
