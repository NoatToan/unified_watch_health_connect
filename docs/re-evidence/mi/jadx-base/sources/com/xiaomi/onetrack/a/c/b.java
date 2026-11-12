package com.xiaomi.onetrack.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.onetrack.b.n;
import com.xiaomi.onetrack.util.p;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13708a = "AdMonitorUploadTimer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13709b = 10;
    private static volatile b c;
    private a d;
    private BroadcastReceiver e = new c(this);

    private b() {
        HandlerThread handlerThread = new HandlerThread("onetrack_ad_monitor_uploader");
        handlerThread.start();
        this.d = new a(handlerThread.getLooper());
        a(com.xiaomi.onetrack.f.a.a());
    }

    public void b() {
        this.d.a(0);
    }

    public static b a() {
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void a(int i) {
            if (hasMessages(i)) {
                p.a(b.f13708a, "has message\u3000prio=" + i);
                return;
            }
            long jA = n.a(i);
            p.a(b.f13708a, "will check prio=" + i + ", delay=" + jA);
            a(i, jA);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            p.a(b.f13708a, "AdMonitorUploadTimer.handleMessage, msg.what=" + message.what);
            if (message.what != 10) {
                d.a();
                return;
            }
            boolean zA = com.xiaomi.onetrack.g.c.a();
            p.a(b.f13708a, "AdMonitorUploadTimer netReceiver, 网络是否可用=" + zA);
            if (zA) {
                a(0, 1000L);
            }
        }

        public void a() {
            removeCallbacksAndMessages(null);
        }

        private void a(int i, long j) {
            removeMessages(i);
            p.a(b.f13708a, "will post msg, prio=" + i + ", delay=" + j);
            sendEmptyMessageDelayed(i, j);
        }
    }

    private void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.e, intentFilter);
        } catch (Exception e) {
            p.a(f13708a, "registerNetReceiver: " + e);
        }
    }
}
