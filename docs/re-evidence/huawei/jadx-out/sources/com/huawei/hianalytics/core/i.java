package com.huawei.hianalytics.core;

import com.huawei.hms.network.NetworkKit;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends NetworkKit.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f11472a;

    public i(CountDownLatch countDownLatch) {
        this.f11472a = countDownLatch;
    }

    @Override // com.huawei.hms.network.NetworkKit.Callback
    public final void onResult(boolean z) {
        this.f11472a.countDown();
    }
}
