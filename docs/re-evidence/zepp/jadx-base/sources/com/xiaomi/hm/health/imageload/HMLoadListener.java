package com.xiaomi.hm.health.imageload;

/* JADX INFO: loaded from: classes21.dex */
public interface HMLoadListener<R> {
    boolean onLoadFailed(Exception exc);

    boolean onLoadFinish(R r);
}
