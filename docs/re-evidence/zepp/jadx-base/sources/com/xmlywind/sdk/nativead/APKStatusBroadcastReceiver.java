package com.xmlywind.sdk.nativead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.models.IntentActions;

/* JADX INFO: loaded from: classes22.dex */
public class APKStatusBroadcastReceiver extends BaseBroadcastReceiver {
    public com.xmlywind.sdk.base.common.k.a a;
    public IntentFilter b;

    public APKStatusBroadcastReceiver(com.xmlywind.sdk.base.common.k.a aVar, String str) {
        super(str);
        this.a = aVar;
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public IntentFilter a() {
        if (this.b == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.b = intentFilter;
            intentFilter.addAction(IntentActions.ACTION_INTERSTITIAL_DOWNLOAD_START);
            this.b.addAction(IntentActions.ACTION_INTERSTITIAL_DOWNLOAD_END);
            this.b.addAction(IntentActions.ACTION_INTERSTITIAL_INSTALL_START);
            this.b.addAction(IntentActions.ACTION_INTERSTITIAL_INSTALL_END);
        }
        return this.b;
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public void a(BroadcastReceiver broadcastReceiver) {
        super.a(broadcastReceiver);
        this.a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.xmlywind.sdk.common.utils.m.a.a(context);
        com.xmlywind.sdk.common.utils.m.a.a(intent);
        if (this.a != null && a(intent)) {
            String action = intent.getAction();
            boolean zEqualsIgnoreCase = "1".equalsIgnoreCase(intent.getStringExtra("result"));
            action.hashCode();
            switch (action) {
                case "com.sigmob.action.interstitial.install.end":
                    this.a.d(zEqualsIgnoreCase);
                    break;
                case "com.sigmob.action.interstitial.download.start":
                    this.a.a(zEqualsIgnoreCase);
                    break;
                case "com.sigmob.action.interstitial.download.end":
                    this.a.b(zEqualsIgnoreCase);
                    break;
                case "com.sigmob.action.interstitial.install.start":
                    this.a.c(zEqualsIgnoreCase);
                    break;
            }
        }
    }
}
