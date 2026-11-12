package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.network.inner.api.NetworkReceiver;

/* JADX INFO: loaded from: classes34.dex */
public class m1 implements NetworkReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1 f15075a;

    @Override // com.huawei.hms.network.inner.api.NetworkReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        l1 l1Var = this.f15075a;
        if (l1Var != null) {
            l1Var.processNetworkReceiveMsg();
        }
    }

    public m1(l1 l1Var) {
        this.f15075a = l1Var;
    }
}
