package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public interface IPermissionProvider {

    public interface OnPermissionCheckListener {
        void onDenied();

        void onGranted();
    }

    void checkLocationPermission(Context context, OnPermissionCheckListener onPermissionCheckListener);
}
