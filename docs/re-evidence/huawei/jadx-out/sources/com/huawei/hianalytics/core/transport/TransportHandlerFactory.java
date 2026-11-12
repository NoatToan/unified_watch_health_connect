package com.huawei.hianalytics.core.transport;

import androidx.media3.common.C;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.i;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.net.TransportHandler;
import com.huawei.hianalytics.core.transport.net.a;
import com.huawei.hianalytics.core.transport.net.b;
import com.huawei.hms.network.NetworkKit;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class TransportHandlerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f11476a = false;

    public static void a() {
        if (f11476a) {
            return;
        }
        f11476a = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        NetworkKit.init(EnvUtils.getAppContext(), new i(countDownLatch));
        try {
            HiLog.i("TransportHandler", "initNetworkKitSync await " + countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            HiLog.w("TransportHandler", "InterruptedException");
        }
    }

    public static TransportHandler create(String str, Map<String, String> map, byte[] bArr, int i, boolean z) {
        try {
            Class.forName("com.huawei.hms.network.NetworkKit");
            a();
            return new b(str, map, bArr, i, z);
        } catch (Exception unused) {
            HiLog.w("TransportHandler", "visit NetworkKit Exception");
            return new a(str, map, bArr);
        }
    }

    public static TransportHandler create(String str, Map<String, String> map, byte[] bArr, int i) {
        return create(str, map, bArr, i, false);
    }
}
