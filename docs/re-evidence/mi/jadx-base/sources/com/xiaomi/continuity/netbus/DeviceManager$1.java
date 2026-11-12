package com.xiaomi.continuity.netbus;

import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.nl1;
import defpackage.uoe;

/* JADX INFO: loaded from: classes7.dex */
class DeviceManager$1 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nl1 f11208b;

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        bundle.setClassLoader(getClass().getClassLoader());
        String string = i == 0 ? "" : bundle.getString("message");
        uoe.a("NetBusDeviceManager", "%s result code:%s,message:%s", this.f11207a, Integer.valueOf(i), string);
        if (i == 0) {
            throw null;
        }
        this.f11208b.b(i, string);
    }
}
