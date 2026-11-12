package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.Logger;
import com.huami.moving.ui.animator.AnimatorViewWrapper;

/* JADX INFO: loaded from: classes3.dex */
class b {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private final Float a;
    private final boolean b;

    private b(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static b a(Context context) {
        Float fD = null;
        boolean zF = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zF = f(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e2) {
            Logger.getLogger().e("An error occurred getting battery state.", e2);
        }
        return new b(fD, zF);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
        int intExtra2 = intent.getIntExtra(AnimatorViewWrapper.SCALE, -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f;
        if (!this.b || (f = this.a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public boolean e() {
        return this.b;
    }
}
