package com.xmlywind.sdk.base.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.videoAd.BaseAdActivity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class AdActivity extends BaseAdActivity implements h {
    private g a;
    private String b;

    private g a(BaseAdUnit baseAdUnit, Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("ad_view_class_name");
        stringExtra.hashCode();
        switch (stringExtra) {
            case "LandNative":
                return new com.xmlywind.sdk.nativead.o(this, baseAdUnit, getIntent().getExtras(), bundle, this.b, this);
            case "LandPage":
                return new q(this, baseAdUnit, getIntent().getExtras(), bundle, this.b, this);
            case "DisLike":
                return new com.xmlywind.sdk.nativead.l(this, baseAdUnit, getIntent().getExtras(), bundle, this.b, this);
            case "reward":
                return new com.xmlywind.sdk.videoAd.h(this, baseAdUnit, getIntent().getExtras(), bundle, this.b, this);
            case "mraid":
                return new com.xmlywind.sdk.mraid.i(this, baseAdUnit, getIntent().getExtras(), bundle, this.b, this);
            default:
                return null;
        }
    }

    private static String a(Intent intent) {
        return intent.getStringExtra(Constants.BROADCAST_IDENTIFIER_KEY);
    }

    @Override // com.xmlywind.sdk.base.common.h
    public void a() {
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.xmlywind.sdk.base.common.h
    public void a(int i) {
        setRequestedOrientation(i);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(i, i2, intent);
        }
    }

    @Override // android.app.Activity, com.xmlywind.sdk.base.common.h
    public void onBackPressed() {
        g gVar = this.a;
        if (gVar == null || !gVar.g()) {
            return;
        }
        super.onBackPressed();
        this.a.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x002f, B:5:0x0035, B:8:0x003c, B:12:0x0050, B:14:0x0058, B:11:0x004c), top: B:20:0x002f }] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SigmobLog.i("TaskId :" + getTaskId());
        this.b = a(getIntent());
        String stringExtra = getIntent().getStringExtra("adUnit_requestId_key");
        try {
            if (com.xmlywind.sdk.common.a.n() == null || TextUtils.isEmpty(stringExtra)) {
                finish();
            } else {
                BaseAdUnit baseAdUnitA = d.a(stringExtra);
                if (this.b.equals("dislike_broadcastIdentifier") || baseAdUnitA != null) {
                    g gVarA = a(baseAdUnitA, bundle);
                    this.a = gVarA;
                    if (gVarA != null) {
                        gVarA.b();
                    }
                } else {
                    finish();
                }
            }
        } catch (Throwable th) {
            SigmobLog.e("AdActivity onCreate Throwable:" + th.getMessage());
            HashMap map = new HashMap();
            map.put("error", th.getMessage());
            BaseBroadcastReceiver.a(this, this.b, map, IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL);
            finish();
        }
    }

    @Override // com.xmlywind.sdk.videoAd.BaseAdActivity, android.app.Activity
    public void onDestroy() {
        SigmobLog.d("RewardVideoAdPlayerActivity onDestroy() called");
        g gVar = this.a;
        if (gVar != null) {
            gVar.e();
        }
        this.a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        try {
            super.onPause();
            g gVar = this.a;
            if (gVar != null) {
                gVar.c();
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            HashMap map = new HashMap();
            map.put("error", th.getMessage());
            BaseBroadcastReceiver.a(this, this.b, map, IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        try {
            super.onResume();
            g gVar = this.a;
            if (gVar != null) {
                gVar.d();
            }
        } catch (Throwable th) {
            HashMap map = new HashMap();
            map.put("error", th.getMessage());
            BaseBroadcastReceiver.a(this, this.b, map, IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(bundle);
        }
    }

    @Override // com.xmlywind.sdk.base.common.h
    public void onSetContentView(View view) {
        setContentView(view);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Exception e) {
            SigmobLog.e("setRequestedOrientation: " + e.getMessage());
        }
    }
}
