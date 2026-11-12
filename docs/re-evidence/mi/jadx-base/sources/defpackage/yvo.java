package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yvo implements skb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("messagePool")
    public static final List<b> f40620b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f40621a;

    public static final class b implements skb.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f40622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public yvo f40623b;

        public b() {
        }

        @Override // skb.a
        public void a() {
            ((Message) rk1.e(this.f40622a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f40622a = null;
            this.f40623b = null;
            yvo.m(this);
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) rk1.e(this.f40622a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, yvo yvoVar) {
            this.f40622a = message;
            this.f40623b = yvoVar;
            return this;
        }
    }

    public yvo(Handler handler) {
        this.f40621a = handler;
    }

    public static b l() {
        b bVar;
        List<b> list = f40620b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void m(b bVar) {
        List<b> list = f40620b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.skb
    public skb.a a(int i) {
        return l().d(this.f40621a.obtainMessage(i), this);
    }

    @Override // defpackage.skb
    public boolean b(int i) {
        return this.f40621a.hasMessages(i);
    }

    @Override // defpackage.skb
    public skb.a c(int i, Object obj) {
        return l().d(this.f40621a.obtainMessage(i, obj), this);
    }

    @Override // defpackage.skb
    public void d(Object obj) {
        this.f40621a.removeCallbacksAndMessages(obj);
    }

    @Override // defpackage.skb
    public skb.a e(int i, int i2, int i3) {
        return l().d(this.f40621a.obtainMessage(i, i2, i3), this);
    }

    @Override // defpackage.skb
    public boolean f(skb.a aVar) {
        return ((b) aVar).c(this.f40621a);
    }

    @Override // defpackage.skb
    public skb.a g(int i, int i2, int i3, Object obj) {
        return l().d(this.f40621a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // defpackage.skb
    public boolean h(int i) {
        return this.f40621a.sendEmptyMessage(i);
    }

    @Override // defpackage.skb
    public boolean i(int i, long j) {
        return this.f40621a.sendEmptyMessageAtTime(i, j);
    }

    @Override // defpackage.skb
    public void j(int i) {
        this.f40621a.removeMessages(i);
    }

    @Override // defpackage.skb
    public boolean post(Runnable runnable) {
        return this.f40621a.post(runnable);
    }
}
