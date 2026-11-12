package com.xmlywind.sdk.rewardVideoAd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.common.utils.m;

/* JADX INFO: loaded from: classes22.dex */
public class RewardVideoAdBroadcastReceiver extends BaseBroadcastReceiver {
    private static IntentFilter a;
    private f.a b;
    private BaseAdUnit c;

    public RewardVideoAdBroadcastReceiver(BaseAdUnit baseAdUnit, f.a aVar, String str) {
        super(str);
        this.c = baseAdUnit;
        this.b = aVar;
        a();
    }

    @Override // com.xmlywind.sdk.base.common.BaseBroadcastReceiver
    public IntentFilter a() {
        if (a == null) {
            IntentFilter intentFilter = new IntentFilter();
            a = intentFilter;
            intentFilter.addAction(IntentActions.ACTION_REWARDED_VIDEO_PLAY);
            a.addAction(IntentActions.ACTION_REWARDED_VIDEO_SKIP);
            a.addAction(IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL);
            a.addAction(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
            a.addAction(IntentActions.ACTION_REWARDED_VIDEO_CLOSE);
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
        m.a.a(context);
        m.a.a(intent);
        if (this.b == null || this.c == null || !a(intent)) {
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        switch (action) {
            case "com.sigmob.action.rewardedvideo.Close":
                this.b.i(this.c);
                break;
            case "com.sigmob.action.rewardedvideo.play":
                this.b.g(this.c);
                return;
            case "com.sigmob.action.rewardedvideo.skip":
                this.b.h(this.c);
                return;
            case "com.sigmob.action.rewardedvideo.complete":
                this.b.f(this.c);
                return;
            case "com.sigmob.action.rewardedvideo.playFail":
                this.b.b(this.c, intent.getStringExtra("error"));
                break;
            default:
                return;
        }
        a(this);
        this.c = null;
    }
}
