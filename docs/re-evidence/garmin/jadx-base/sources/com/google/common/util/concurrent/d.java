package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j8, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j8, obj, obj2)) {
            if (unsafe.getObject(abstractFuture, j8) != obj) {
                return false;
            }
        }
        return true;
    }
}
