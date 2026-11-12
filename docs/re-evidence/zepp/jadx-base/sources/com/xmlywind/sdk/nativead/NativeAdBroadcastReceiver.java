package com.xmlywind.sdk.nativead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.models.IntentActions;

/* JADX INFO: loaded from: classes22.dex */
public class NativeAdBroadcastReceiver extends BaseBroadcastReceiver {
    private static IntentFilter a;
    private c.a b;

    public NativeAdBroadcastReceiver(c.a aVar, String str) {
        super(str);
        this.b = aVar;
        a();
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public IntentFilter a() {
        if (a == null) {
            IntentFilter intentFilter = new IntentFilter();
            a = intentFilter;
            intentFilter.addAction(IntentActions.ACTION_NATIVE_TEMPLIE_SHOW);
            a.addAction(IntentActions.ACTION_NATIVE_TEMPLE_CLICK);
            a.addAction(IntentActions.ACTION_NATIVE_TEMPLE_DISMISS);
            a.addAction(IntentActions.ACTION_LANDPAGE_SHOW);
            a.addAction(IntentActions.ACTION_LANDPAGE_DISMISS);
        }
        return a;
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public void a(BroadcastReceiver broadcastReceiver) {
        super.a(broadcastReceiver);
        this.b = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.xmlywind.sdk.common.utils.m.a.a(context);
        com.xmlywind.sdk.common.utils.m.a.a(intent);
        if (this.b != null && a(intent)) {
            String action = intent.getAction();
            action.hashCode();
            switch (action) {
                case "com.sigmob.action.native.temple.click":
                    this.b.d();
                    break;
                case "com.sigmob.action.loadpage.show":
                    this.b.a();
                    break;
                case "com.sigmob.action.loadpage.dismiss":
                    this.b.b();
                    break;
                case "com.sigmob.action.native.temple.show":
                    this.b.c();
                    break;
                case "com.sigmob.action.native.temple.dismiss":
                    this.b.e();
                    break;
            }
        }
    }
}
