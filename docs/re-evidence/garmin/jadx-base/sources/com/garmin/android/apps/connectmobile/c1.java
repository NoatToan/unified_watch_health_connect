package com.garmin.android.apps.connectmobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public class c1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d1 d1Var = d1.f33126h;
        if (d1Var.f33135g) {
            d1Var.f33135g = false;
            d1Var.a();
        }
    }
}
