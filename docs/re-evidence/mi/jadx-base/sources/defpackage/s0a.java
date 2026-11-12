package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class s0a {
    @SuppressLint({"ObsoleteSdkInt"})
    public static boolean a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 125 || i == 200;
    }
}
