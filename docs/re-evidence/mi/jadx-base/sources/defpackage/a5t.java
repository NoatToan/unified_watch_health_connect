package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes11.dex */
public class a5t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Handler f666b;
    public static final Object c = new Object();

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return b(context, broadcastReceiver, intentFilter, null, i);
    }

    public static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        return d(context, broadcastReceiver, intentFilter, str, f(), i);
    }

    public static Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return d(context, broadcastReceiver, intentFilter, str, handler, 2);
    }

    public static Intent d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Handler e() {
        if (f666b == null) {
            synchronized (c) {
                try {
                    if (f666b == null) {
                        HandlerThread handlerThread = new HandlerThread("receiver_task");
                        handlerThread.start();
                        f666b = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f666b;
    }

    public static Handler f() {
        if (f665a == null) {
            synchronized (a5t.class) {
                try {
                    if (f665a == null) {
                        HandlerThread handlerThread = new HandlerThread("handle_receiver");
                        handlerThread.start();
                        f665a = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f665a;
    }
}
