package com.thanosfisherman.wifiutils.wifiConnect;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;
import com.thanosfisherman.elvis.Elvis;
import com.thanosfisherman.elvis.interfaces.Function;
import com.thanosfisherman.wifiutils.ConnectorUtils;
import com.thanosfisherman.wifiutils.WeakHandler;
import com.thanosfisherman.wifiutils.WifiUtils;
import com.thanosfisherman.wifiutils.utils.VersionUtils;
import defpackage.fc2;

/* JADX INFO: loaded from: classes18.dex */
public class TimeoutHandler {
    private final WifiManager a;
    private final WeakHandler b;
    private final WifiConnectionCallback c;
    private ScanResult d;
    private final Runnable e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WifiUtils.wifiLog("Connection Timed out...");
            if (!VersionUtils.isAndroidQOrLater()) {
                ConnectorUtils.reEnableNetworkIfPossible(TimeoutHandler.this.a, TimeoutHandler.this.d);
            }
            if (ConnectorUtils.isAlreadyConnected(TimeoutHandler.this.a, (String) Elvis.of(TimeoutHandler.this.d).next(new Function() { // from class: com.thanosfisherman.wifiutils.wifiConnect.a
                @Override // com.thanosfisherman.elvis.interfaces.Function
                public /* synthetic */ Function andThen(Function function) {
                    return fc2.a(this, function);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Function
                public final Object apply(Object obj) {
                    return ((ScanResult) obj).BSSID;
                }

                @Override // com.thanosfisherman.elvis.interfaces.Function
                public /* synthetic */ Function compose(Function function) {
                    return fc2.b(this, function);
                }
            }).get())) {
                TimeoutHandler.this.c.successfulConnect();
            } else {
                TimeoutHandler.this.c.errorConnect(ConnectionErrorCode.TIMEOUT_OCCURRED);
            }
            TimeoutHandler.this.b.removeCallbacks(this);
        }
    }

    public TimeoutHandler(@NonNull WifiManager wifiManager, @NonNull WeakHandler weakHandler, @NonNull WifiConnectionCallback wifiConnectionCallback) {
        this.a = wifiManager;
        this.b = weakHandler;
        this.c = wifiConnectionCallback;
    }

    public void startTimeout(ScanResult scanResult, long j) {
        this.b.removeCallbacks(this.e);
        this.d = scanResult;
        this.b.postDelayed(this.e, j);
    }

    public void stopTimeout() {
        this.b.removeCallbacks(this.e);
    }
}
