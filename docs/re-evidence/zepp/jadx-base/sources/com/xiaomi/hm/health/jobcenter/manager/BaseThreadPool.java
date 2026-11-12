package com.xiaomi.hm.health.jobcenter.manager;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class BaseThreadPool extends ThreadPoolExecutor {
    public BaseThreadPool(a threadPoolParamter) {
        super(threadPoolParamter.a(), threadPoolParamter.e(), threadPoolParamter.c(), TimeUnit.MILLISECONDS, new LinkedBlockingDeque(threadPoolParamter.f()), new ThreadPoolExecutor.CallerRunsPolicy());
        allowCoreThreadTimeOut(threadPoolParamter.h());
    }
}
