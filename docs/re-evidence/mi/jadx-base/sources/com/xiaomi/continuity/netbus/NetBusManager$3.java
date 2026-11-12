package com.xiaomi.continuity.netbus;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.mibi.sdk.common.CommonConstants;
import defpackage.uoe;

/* JADX INFO: loaded from: classes7.dex */
class NetBusManager$3 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        int i2 = bundle.getInt(CommonConstants.KEY_VERSION_CODE);
        uoe.e("NetBusManager", String.format("service versionCode:%s, versionName:%s", Integer.valueOf(i2), bundle.getString(CommonConstants.KEY_VERSION_NAME)));
        throw null;
    }
}
