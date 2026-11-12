package com.huawei.openalliance.ad.utils;

import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes41.dex */
public class u<V> implements Callable<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Callable<V> f20686a;

    @Override // java.util.concurrent.Callable
    public V call() {
        Callable<V> callable = this.f20686a;
        if (callable != null) {
            try {
                try {
                    V vCall = callable.call();
                    this.f20686a = null;
                    return vCall;
                } finally {
                    this.f20686a = null;
                }
            } catch (Throwable unused) {
                Log.e("SafeCallable", "Exception in CallableWrapper");
                return null;
            }
        }
        return null;
    }

    public u(Callable<V> callable) {
        this.f20686a = callable;
    }
}
