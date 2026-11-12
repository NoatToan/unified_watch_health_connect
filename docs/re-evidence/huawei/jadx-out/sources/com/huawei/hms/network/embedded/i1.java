package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.security.SecureRandom;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14898a = "TrafficController";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f14899b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f14900c = 2.0d;
    public static final double d = 0.5d;

    public static void waiting(long j) {
        try {
            Logger.v(f14898a, "is await success: " + new CountDownLatch(1).await(j, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            Logger.w(f14898a, "countDownLatch await interruptedException");
        }
    }

    public static long requestDiscreteControl(Request request) {
        if (!(request instanceof h1.d)) {
            return 0L;
        }
        long maxRequestDiscreteTime = ((h1.d) request).getNetConfig().getMaxRequestDiscreteTime();
        if (maxRequestDiscreteTime <= 0) {
            return 0L;
        }
        long jNextDouble = (long) (new SecureRandom().nextDouble() * maxRequestDiscreteTime);
        waiting(jNextDouble);
        return jNextDouble;
    }

    public static long getWaitingInterval(int i, long j) {
        return Math.min((long) (Math.pow(2.0d, i) * 1000.0d * ((((new SecureRandom().nextDouble() * (-2.0d)) + 1.0d) * 0.5d) + 1.0d)), j);
    }

    public static long enableTrafficControlWith429(Request request, Response<ResponseBody> response) {
        if (!(request instanceof h1.d)) {
            return 0L;
        }
        long jStringToLong = StringUtils.stringToLong(Headers.of(response.getHeaders()).get(q0.f), 0L);
        long retryAfterTime = ((h1.d) request).getNetConfig().getRetryAfterTime();
        if (retryAfterTime <= 0 || jStringToLong <= 0) {
            return 0L;
        }
        long jMin = Math.min(retryAfterTime, jStringToLong);
        waiting(jMin);
        return jMin;
    }

    public static long enableRetryIntervalBackoff(Request request, int i) {
        int maxRetryWaitingTime;
        if (!(request instanceof h1.d) || (maxRetryWaitingTime = ((h1.d) request).getNetConfig().getMaxRetryWaitingTime()) <= 0) {
            return 0L;
        }
        long waitingInterval = getWaitingInterval(i, maxRetryWaitingTime);
        waiting(waitingInterval);
        return waitingInterval;
    }
}
