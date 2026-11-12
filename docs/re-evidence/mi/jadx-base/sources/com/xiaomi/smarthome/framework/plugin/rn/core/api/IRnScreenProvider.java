package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnScreenProvider {
    float getDisplayDensity(Activity activity);

    View getRootView(Activity activity);

    boolean isPad();
}
