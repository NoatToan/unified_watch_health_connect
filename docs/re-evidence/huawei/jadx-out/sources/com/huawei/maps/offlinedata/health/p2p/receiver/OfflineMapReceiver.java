package com.huawei.maps.offlinedata.health.p2p.receiver;

import android.app.Application;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapP2pMessage;
import com.huawei.maps.offlinedata.service.device.c;
import com.huawei.maps.offlinedata.utils.a;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapReceiver implements IOfflineMapDataReceiver, IOfflineMapConnectStatusListener {
    private static final String TAG = "OfflineMapReceiver";
    private static volatile OfflineMapReceiver mInstance;

    private OfflineMapReceiver() {
    }

    public static OfflineMapReceiver getInstance() {
        if (mInstance == null) {
            synchronized (OfflineMapReceiver.class) {
                if (mInstance == null) {
                    mInstance = new OfflineMapReceiver();
                }
            }
        }
        return mInstance;
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.receiver.IOfflineMapConnectStatusListener
    public void onConnectStatusChanged(Application application, String str, final int i) {
        g.c(TAG, "onConnectStatusChanged: " + i);
        a.a(application);
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.health.p2p.receiver.OfflineMapReceiver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.huawei.maps.offlinedata.service.device.a.a().b(i);
            }
        }).start();
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.receiver.IOfflineMapDataReceiver
    public void onDataReceived(int i, OfflineMapP2pMessage offlineMapP2pMessage) {
        g.c(TAG, "onDataReceived: " + i);
        c.a().a(i, offlineMapP2pMessage);
    }
}
