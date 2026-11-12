package com.huawei.maps.offlinedata.service.persist;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f17994a;

    private a() {
        this.f17994a = new ThreadPoolExecutor(1, 50, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(400), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static a b() {
        return AbstractC0191a.f17995a;
    }

    public ThreadPoolExecutor a() {
        return this.f17994a;
    }

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.service.persist.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0191a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f17995a = new a();
    }
}
