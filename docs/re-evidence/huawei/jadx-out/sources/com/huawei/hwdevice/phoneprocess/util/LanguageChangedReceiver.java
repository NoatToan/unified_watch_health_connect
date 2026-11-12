package com.huawei.hwdevice.phoneprocess.util;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nes;
import defpackage.nff;

/* JADX INFO: loaded from: classes2.dex */
public class LanguageChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.j("LanguageChangedReceiver", "device language change receiver intent is none, operation ignored");
            return;
        }
        LogUtil.a("LanguageChangedReceiver", "device language change receiver, context:", context, " intent:", intent.getAction());
        if (context == null || !"android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.a("LanguageChangedReceiver", "switch not on, not need start service!");
            return;
        }
        nff.e(null);
        nes.e();
        Intent intent2 = new Intent(context, (Class<?>) HwUpdateService.class);
        intent2.setAction("action_band_manual_change_language");
        boolean zC = c(context, intent2);
        if (!zC) {
            zC = c(context, intent2);
        }
        LogUtil.a("LanguageChangedReceiver", "isStartSuccess = ", Boolean.valueOf(zC));
    }

    private boolean c(Context context, Intent intent) {
        try {
            context.startService(intent);
            return true;
        } catch (IllegalStateException | SecurityException unused) {
            LogUtil.e("LanguageChange enter HwUpdateService IllegalStateException or SecurityException", new Object[0]);
            return false;
        }
    }
}
