package com.huawei.hianalytics.visual;

import android.app.Notification;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class u0 {
    public static u0 g;
    public WeakReference d;
    public final Handler e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f11702a = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f11704c = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11703b = Process.myPid();
    public final boolean f = false;

    public u0() {
        HandlerThread handlerThread = new HandlerThread("HASDKNotice");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    public static u0 a() {
        u0 u0Var;
        synchronized (u0.class) {
            if (g == null) {
                g = new u0();
            }
            u0Var = g;
        }
        return u0Var;
    }

    public final void b(Intent intent) {
        try {
            try {
                if (intent.hasExtra("HA_NOTICE_ID")) {
                    final String stringExtra = intent.getStringExtra("HA_NOTICE_ID");
                    intent.removeExtra("HA_NOTICE_ID");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        this.e.post(new Runnable() { // from class: com.huawei.hianalytics.visual.u0$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.a(stringExtra);
                            }
                        });
                    }
                }
            } catch (Exception unused) {
                HiLog.d("PushNotificationManager", "fail to get notice id");
            }
        } catch (Throwable unused2) {
            HiLog.d("PushNotificationManager", "fail to handle notification click event");
        }
    }

    public final void a(int i, final Notification notification) {
        final t0 t0Var;
        boolean z = this.f;
        if (z || notification == null || notification.contentIntent == null) {
            return;
        }
        if (z) {
            t0Var = null;
        } else {
            try {
                t0Var = new t0(notification.extras.getString(NotificationCompat.EXTRA_TITLE), i, notification.getChannelId(), 0L);
            } catch (Exception unused) {
                HiLog.d("PushNotificationManager", "fail to acquire notification event");
                t0Var = null;
            }
        }
        if (t0Var == null) {
            return;
        }
        this.e.post(new Runnable() { // from class: com.huawei.hianalytics.visual.u0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(notification, t0Var);
            }
        });
    }

    public static void b(t0 t0Var, String str) {
        try {
            String str2 = w.a().h().getFilesDir() + File.separator + "hasdk_push";
            o.a(str2);
            o.a(str2, str, t0Var.a());
        } catch (Exception unused) {
            HiLog.d("PushNotificationManager", "fail to save notification event to file");
        }
    }

    public final void a(Notification notification, t0 t0Var) {
        if (notification.contentIntent == null) {
            return;
        }
        a(t0Var, "$AppNoticeDisplay");
        try {
            String str = (String) this.f11702a.get(notification.contentIntent);
            if (str == null) {
                return;
            }
            b(t0Var, str);
        } catch (Exception unused) {
            HiLog.d("PushNotificationManager", "fail to save notification event");
        }
    }

    public final void a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            WeakReference weakReference = this.d;
            if (weakReference == null || weakReference.get() != intent) {
                this.d = new WeakReference(intent);
                if (this.f) {
                    return;
                }
                b(intent);
            }
        } catch (Exception unused) {
            HiLog.d("PushNotificationManager", "fail to handle notification click event");
        }
    }

    public static void a(t0 t0Var, String str) {
        if (t0Var == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$app_notice_title", t0Var.f11696a);
            jSONObject.put("$app_notice_id", t0Var.f11697b);
            jSONObject.put("$app_notice_channel_id", t0Var.f11698c);
            w.a().a(str, jSONObject);
        } catch (JSONException unused) {
            HiLog.e("PushNotificationManager", "fail to report notification event");
        }
    }

    public final void a(String str) {
        t0 t0Var;
        try {
            String str2 = w.a().h().getFilesDir() + File.separator + "hasdk_push";
            o.a(str2);
            String strA = o.a(str2, str);
            if (TextUtils.isEmpty(strA)) {
                t0Var = null;
            } else {
                HiLog.d("PushNotificationManager", "local notification info:" + strA);
                JSONObject jSONObject = new JSONObject(strA);
                t0Var = new t0(jSONObject.getString("title"), jSONObject.getInt("id"), jSONObject.getString("channelId"), Utils.parseStringToLong(jSONObject.getString("time")));
            }
        } catch (Exception unused) {
            HiLog.d("PushNotificationManager", "fail to get notification event from file");
        }
        a(t0Var, "$AppNoticeClick");
    }
}
