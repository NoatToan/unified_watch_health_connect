package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* JADX INFO: loaded from: classes34.dex */
public class h2 extends NetworkQualityRttListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14854a = "CronetNetworkQualityRtt";

    public void onRttObservation(int i, long j, int i2) {
        Logger.v(f14854a, "onRttObservation[%s]: %d, %d", new Date(j).toString(), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public h2(Executor executor) {
        super(executor);
    }
}
