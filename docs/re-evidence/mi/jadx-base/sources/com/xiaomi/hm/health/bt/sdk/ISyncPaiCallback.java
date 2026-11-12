package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.data.PaiDataResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public interface ISyncPaiCallback extends Serializable {
    public static final long serialVersionUID = 1;

    void onFinish(PaiDataResult paiDataResult);

    void onProgress(Progress progress);

    void onStart();
}
