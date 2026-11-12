package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnApplicationProvider {
    Context getApplicationContext();

    void startScanCode(Activity activity, Callback callback);
}
