package com.sogou.map.loc;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
final class t0 implements ThreadFactory {
    private AtomicInteger a = new AtomicInteger(0);
    private /* synthetic */ s0 b;

    public t0(s0 s0Var) {
        this.b = s0Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        u0 u0Var = new u0(this, runnable);
        u0Var.setName(String.valueOf(this.b.d) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.a.incrementAndGet());
        return u0Var;
    }
}
