package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes34.dex */
public class u implements NetworkReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15417b = "DNSNetworkReceiver";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NetworkInfo f15418a;

    @Override // com.huawei.hms.network.inner.api.NetworkReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        NetworkInfo networkInfo = NetworkUtil.getNetworkInfo(context);
        if (networkInfo == null) {
            Logger.v(f15417b, "Get NetworkInfo failed");
            return;
        }
        Logger.v(f15417b, "networkInfo: %s", networkInfo);
        if (a(this.f15418a, networkInfo)) {
            a0.a(networkInfo);
            this.f15418a = networkInfo;
        }
    }

    private boolean a(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        return NetworkUtil.isChangeToConnected(networkInfo, networkInfo2) || NetworkUtil.isConnectTypeChange(networkInfo, networkInfo2);
    }

    public u() {
        NetworkInfo networkInfo = NetworkUtil.getNetworkInfo(ContextHolder.getAppContext());
        this.f15418a = networkInfo;
        Logger.v(f15417b, "lastActivityNetInfo: %s", networkInfo == null ? Constants.NULL : networkInfo.toString());
    }
}
