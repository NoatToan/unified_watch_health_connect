package com.huawei.health.h5pro.vengine;

import com.huawei.health.h5pro.utils.LogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class H5AppLockUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, e> f7004b = new ConcurrentHashMap();

    private H5AppLockUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        return LogUtil.getTag(str, "AppLocker");
    }

    static class e {
        private final AtomicBoolean e = new AtomicBoolean(true);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile CountDownLatch f7005b = new CountDownLatch(1);

        e() {
        }

        public void b(String str) {
            if (!this.e.compareAndSet(true, false) || this.f7005b.getCount() <= 0) {
                LogUtil.w(H5AppLockUtil.b(str), "unLock: failed");
            } else {
                LogUtil.i(H5AppLockUtil.b(str), "unLock: succeeded");
                this.f7005b.countDown();
            }
        }

        public boolean d(String str, long j) {
            LogUtil.i(H5AppLockUtil.b(str), "lock: start -> " + j);
            if (this.f7005b.getCount() != 0 || !this.e.compareAndSet(false, true)) {
                LogUtil.i(H5AppLockUtil.b(str), "lock: await");
                try {
                    if (this.f7005b.await(j, TimeUnit.MILLISECONDS)) {
                        LogUtil.i(H5AppLockUtil.b(str), "lock: await -> true");
                        if (this.e.compareAndSet(false, true)) {
                            this.f7005b = new CountDownLatch(1);
                            LogUtil.i(H5AppLockUtil.b(str), "lock: true");
                            return true;
                        }
                        LogUtil.i(H5AppLockUtil.b(str), "lock: end");
                        return false;
                    }
                    LogUtil.w(H5AppLockUtil.b(str), "lock: await -> false");
                    return false;
                } catch (InterruptedException e) {
                    LogUtil.e("H5PRO_H5AppLockUtil", "lock: exception -> " + e.getMessage());
                }
            } else {
                this.f7005b = new CountDownLatch(1);
                LogUtil.i(H5AppLockUtil.b(str), "lock: true");
                return true;
            }
        }
    }

    public static void unLock(String str) {
        e eVar = f7004b.get(str);
        if (eVar != null) {
            eVar.b(str);
        } else {
            LogUtil.w(b(str), "unLock: h5AppLock is null");
        }
    }

    public static boolean lock(String str, long j) {
        Map<String, e> map = f7004b;
        e eVar = map.get(str);
        LogUtil.i(b(str), "lock: getH5AppLock-> " + eVar);
        if (eVar == null) {
            synchronized (map) {
                eVar = map.get(str);
                if (eVar == null) {
                    map.put(str, new e());
                    LogUtil.i(b(str), "lock: getH5AppLock -> new");
                    return true;
                }
            }
        }
        return eVar.d(str, j);
    }
}
