package com.huawei.dnurse.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DnurseDeviceTest f5477a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i("HWHealthSDK", "Get event");
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            if (intent.getIntExtra("state", 0) == 0 || intent.getIntExtra("microphone", 0) != 1) {
                if (this.f5477a.B) {
                    if (this.f5477a.f != 0) {
                        this.f5477a.c();
                        this.f5477a.K.postDelayed(this.f5477a.f5466b, this.f5477a.q);
                    }
                    this.f5477a.B = false;
                    Log.i("HWHealthSDK", "Headset removed");
                    return;
                }
                return;
            }
            if (this.f5477a.B) {
                return;
            }
            Log.i("HWHealthSDK", "Model: " + Build.MODEL);
            Log.i("HWHealthSDK", "Ver: " + Build.VERSION.RELEASE);
            this.f5477a.B = true;
            this.f5477a.wakeupDevice();
        }
    }

    a(DnurseDeviceTest dnurseDeviceTest) {
        this.f5477a = dnurseDeviceTest;
    }
}
