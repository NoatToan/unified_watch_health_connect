package com.xmlywind.sdk.videoAd;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.xmlywind.sdk.common.Constants;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b extends com.xmlywind.sdk.base.common.g {
    public b(Activity activity, String str, com.xmlywind.sdk.base.common.h hVar) {
        super(activity, str, hVar);
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void b() {
        this.f.onSetContentView(this.e);
    }

    public void b(Bundle bundle) {
        try {
            boolean z = bundle.getBoolean(Constants.ENABLEKEEPON, false);
            boolean z2 = bundle.getBoolean(Constants.ENABLESCREENLOCKDISPLAYAD, false);
            if (Build.VERSION.SDK_INT < 27) {
                if (z2) {
                    k().getWindow().addFlags(2621440);
                }
                if (z) {
                    k().getWindow().addFlags(128);
                    return;
                }
                return;
            }
            if (z2) {
                k().setShowWhenLocked(true);
                k().setTurnScreenOn(true);
            }
            if (z) {
                k().setShowWhenLocked(true);
            }
        } catch (Throwable unused) {
        }
    }
}
