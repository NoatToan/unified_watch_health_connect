package com.xmlywind.sdk.base.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;

/* JADX INFO: loaded from: classes22.dex */
public class EventForwardingBroadcastReceiver extends BaseBroadcastReceiver {
    private static IntentFilter b;
    public BaseAdUnit a;
    private k.b c;

    public EventForwardingBroadcastReceiver(BaseAdUnit baseAdUnit, k.b bVar, String str) {
        super(str);
        this.a = baseAdUnit;
        this.c = bVar;
        a();
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public IntentFilter a() {
        if (b == null) {
            IntentFilter intentFilter = new IntentFilter();
            b = intentFilter;
            intentFilter.addAction(IntentActions.ACTION_INTERSTITIAL_FAIL);
            b.addAction(IntentActions.ACTION_INTERSTITIAL_SHOW);
            b.addAction(IntentActions.ACTION_INTERSTITIAL_DISMISS);
            b.addAction(IntentActions.ACTION_INTERSTITIAL_CLICK);
        }
        return b;
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public void a(BroadcastReceiver broadcastReceiver) {
        super.a(broadcastReceiver);
        this.c = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.c == null || this.a == null || !a(intent)) {
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        switch (action) {
            case "com.sigmob.action.interstitial.click":
                this.c.d(this.a);
                break;
            case "com.sigmob.action.interstitial.fail":
                this.c.a(this.a, intent.getStringExtra("error"));
                break;
            case "com.sigmob.action.interstitial.show":
                this.c.c(this.a);
                break;
            case "com.sigmob.action.interstitial.dismiss":
                this.c.e(this.a);
                a(this);
                this.a = null;
                break;
        }
    }
}
