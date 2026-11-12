package com.huawei.health.h5pro.core;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class H5ProConfigGuardian {
    public static final H5ProConfigGuardian d = new H5ProConfigGuardian();
    private static volatile OnConfigGuardianListener e;

    public interface OnConfigGuardianListener {
        void onConfigGuardian(Context context);
    }

    private H5ProConfigGuardian() {
    }

    public void addOnConfigGuardianListener(OnConfigGuardianListener onConfigGuardianListener) {
        synchronized (this) {
            if (e == null) {
                e = onConfigGuardianListener;
            }
        }
    }

    public void onConfigGuardian(Context context) {
        if (e == null) {
            return;
        }
        e.onConfigGuardian((Context) new WeakReference(context).get());
    }
}
