package com.xiaomi.continuity.netbus;

import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.ijg;
import defpackage.nl1;
import defpackage.uoe;

/* JADX INFO: loaded from: classes7.dex */
class NetBusManager$1 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nl1 f11215b;

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        bundle.setClassLoader(getClass().getClassLoader());
        uoe.f("NetBusManager", "%s result code:%s, message:%s, data:%s", this.f11214a, Integer.valueOf(i), bundle.getString("message"), bundle.getParcelable("data"));
        if (i == 0) {
            this.f11215b.c(bundle.getParcelable("data"));
        } else {
            this.f11215b.b(i, bundle.getString("message"));
            ijg.a(null);
        }
    }
}
