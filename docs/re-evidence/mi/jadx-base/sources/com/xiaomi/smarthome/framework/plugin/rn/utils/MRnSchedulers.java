package com.xiaomi.smarthome.framework.plugin.rn.utils;

import defpackage.hfl;
import defpackage.ifl;
import defpackage.ofl;
import defpackage.pfl;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class MRnSchedulers {
    private static final int CORE_THREAD_COUNT;
    private static final int CPU_COUNT;
    private static final ThreadPoolExecutor IO_THREAD_POOL_EXECUTOR;
    private static final String TAG = "MRnSchedulers";
    private static volatile ifl sRx1IoInstance;
    private static volatile hfl sRx2IoInstance;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int iMin = Math.min(5, iAvailableProcessors);
        CORE_THREAD_COUNT = iMin;
        IO_THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(iMin, 32, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    }

    public static ifl RX1_IO() {
        return sRx1IoInstance == null ? createRx1IoScheduler() : sRx1IoInstance;
    }

    public static hfl RX2_IO() {
        return sRx2IoInstance == null ? createRx2IoScheduler() : sRx2IoInstance;
    }

    private static ifl createRx1IoScheduler() {
        if (sRx1IoInstance == null) {
            synchronized (TAG) {
                try {
                    if (sRx1IoInstance == null) {
                        sRx1IoInstance = pfl.a(IO_THREAD_POOL_EXECUTOR);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sRx1IoInstance;
    }

    private static hfl createRx2IoScheduler() {
        if (sRx2IoInstance == null) {
            synchronized (TAG) {
                try {
                    if (sRx2IoInstance == null) {
                        sRx2IoInstance = ofl.b(IO_THREAD_POOL_EXECUTOR);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sRx2IoInstance;
    }
}
