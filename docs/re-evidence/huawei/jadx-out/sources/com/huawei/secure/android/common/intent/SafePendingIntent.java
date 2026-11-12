package com.huawei.secure.android.common.intent;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.secure.android.common.activity.a;

/* JADX INFO: loaded from: classes42.dex */
public final class SafePendingIntent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22848a = "SafePendingIntent";

    public static PendingIntent getSafeActivity(Context context, int i, Intent intent, int i2) {
        try {
            return PendingIntent.getActivity(context, i, intent, i2 | 67108864);
        } catch (Throwable th) {
            a.a(f22848a, "PendingIntent getSafeActivity: " + th.getMessage(), true);
            return null;
        }
    }

    public static PendingIntent getSafeBroadcast(Context context, int i, Intent intent, int i2) {
        try {
            return PendingIntent.getBroadcast(context, i, intent, i2 | 67108864);
        } catch (Throwable th) {
            a.a(f22848a, "PendingIntent getSafeBroadcast: " + th.getMessage(), true);
            return null;
        }
    }

    public static PendingIntent getSafeService(Context context, int i, Intent intent, int i2) {
        try {
            return PendingIntent.getService(context, i, intent, i2 | 67108864);
        } catch (Throwable th) {
            a.a(f22848a, "PendingIntent getSafeService: " + th.getMessage(), true);
            return null;
        }
    }

    public static PendingIntent getSafeActivities(Context context, int i, Intent[] intentArr, int i2) {
        try {
            return PendingIntent.getActivities(context, i, intentArr, i2 | 67108864);
        } catch (Throwable th) {
            a.a(f22848a, "PendingIntent getSafeActivities: " + th.getMessage(), true);
            return null;
        }
    }

    public static PendingIntent getSafeActivity(Context context, int i, Intent intent, Bundle bundle, int i2) {
        try {
            return PendingIntent.getActivity(context, i, intent, i2 | 67108864, bundle);
        } catch (Throwable th) {
            a.a(f22848a, "PendingIntent getSafeActivity: " + th.getMessage(), true);
            return null;
        }
    }
}
