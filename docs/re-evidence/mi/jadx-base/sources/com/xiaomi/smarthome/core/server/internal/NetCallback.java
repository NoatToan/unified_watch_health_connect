package com.xiaomi.smarthome.core.server.internal;

import com.xiaomi.smarthome.core.entity.Error;

/* JADX INFO: loaded from: classes10.dex */
public interface NetCallback<R, E extends Error> {
    void onCache(R r2);

    void onFailure(E e);

    void onSuccess(R r2);
}
