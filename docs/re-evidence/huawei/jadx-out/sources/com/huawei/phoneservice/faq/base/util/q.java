package com.huawei.phoneservice.faq.base.util;

import android.util.LruCache;
import android.view.View;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LruCache<Integer, Long> f21598b = new LruCache<>(10);

    public static boolean b(View view) {
        boolean z = true;
        if (view != null) {
            Integer numValueOf = Integer.valueOf(view.getId());
            LruCache<Integer, Long> lruCache = f21598b;
            Long l = lruCache.get(numValueOf);
            long jNanoTime = System.nanoTime() / 1000000;
            Logger.d("NoDoubleClickUtil", "isDoubleClick view:%s, lastClickTime:%s,  currentTime:%s", numValueOf, l, Long.valueOf(jNanoTime));
            if (l != null) {
                long jLongValue = jNanoTime - l.longValue();
                if (jLongValue > 800) {
                    lruCache.put(numValueOf, Long.valueOf(jNanoTime));
                    z = false;
                }
                Logger.d("NoDoubleClickUtil", "isDoubleClick gap:%s, BREAK_TIME:%s", Long.valueOf(jLongValue), 800);
            } else {
                lruCache.put(numValueOf, Long.valueOf(jNanoTime));
                z = false;
            }
        }
        Logger.d("NoDoubleClickUtil", "isDoubleClick result:%s", Boolean.valueOf(z));
        return z;
    }
}
