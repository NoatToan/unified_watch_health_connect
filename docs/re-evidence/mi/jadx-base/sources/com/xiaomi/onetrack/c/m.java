package com.xiaomi.onetrack.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class m extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13852a = "UploadTimer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13853b = 5000;
    private static final int c = 15000;
    private static final int d = 1200000;
    private final int e;
    private final int f;
    private final int g;
    private int h;
    private AtomicBoolean i;
    private BroadcastReceiver j;

    public m(Looper looper) {
        super(looper);
        this.e = 1000;
        this.f = 10000;
        this.g = d;
        this.h = 10000;
        this.i = new AtomicBoolean(false);
        this.j = new n(this);
        a(com.xiaomi.onetrack.f.a.b());
    }

    private void b() {
        if (q.a().a(2)) {
            this.h = 10000;
            com.xiaomi.onetrack.util.p.a(f13852a, "retry success");
            return;
        }
        removeMessages(1000);
        int i = this.h * 2;
        this.h = i;
        if (i > d) {
            this.h = d;
        }
        com.xiaomi.onetrack.util.p.a(f13852a, "will restart retry msg after " + this.h);
        sendEmptyMessageDelayed(1000, (long) this.h);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (!com.xiaomi.onetrack.b.n.a() || !com.xiaomi.onetrack.b.n.c() || com.xiaomi.onetrack.b.n.b()) {
            com.xiaomi.onetrack.util.p.a(f13852a, "不用处理消息, available=" + com.xiaomi.onetrack.b.n.a() + ", 是否有网=" + com.xiaomi.onetrack.b.n.c() + ", 数据库是否为空=" + com.xiaomi.onetrack.b.n.b());
            return;
        }
        int i = message.what;
        if (i == 1000) {
            b();
            return;
        }
        boolean zA = q.a().a(i);
        com.xiaomi.onetrack.util.p.a(f13852a, "handleCheckUpload ret=" + zA + ", prio=" + i);
        if (zA) {
            return;
        }
        com.xiaomi.onetrack.util.p.a(f13852a, "handleCheckUpload failed, will check if need to send retry msg");
        if (hasMessages(1000)) {
            return;
        }
        sendEmptyMessageDelayed(1000, this.h);
        com.xiaomi.onetrack.util.p.a(f13852a, "fire retry timer after " + this.h);
    }

    public void a(int i, boolean z) {
        if (hasMessages(1000)) {
            com.xiaomi.onetrack.util.p.a(f13852a, "in retry mode, return, prio=" + i);
            return;
        }
        if (z) {
            removeMessages(i);
        }
        if (hasMessages(i)) {
            return;
        }
        long jA = z ? 0L : com.xiaomi.onetrack.b.n.a(i);
        com.xiaomi.onetrack.util.p.a(f13852a, "will check prio=" + i + ", delay=" + jA);
        a(i, jA);
    }

    private void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.j, intentFilter, null, this);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.a(f13852a, "registerNetReceiver: " + e);
        }
    }

    private void a(int i, long j) {
        removeMessages(i);
        com.xiaomi.onetrack.util.p.a(f13852a, "will post msg, prio=" + i + ", delay=" + j);
        sendEmptyMessageDelayed(i, j);
    }

    public void a() {
        com.xiaomi.onetrack.util.i.a(new p(this));
    }
}
