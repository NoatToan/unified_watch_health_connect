package fa;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f70060b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f70061a;

    public static final class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f70062a;

        private b() {
        }

        public final void a() {
            this.f70062a = null;
            ArrayList arrayList = u.f70060b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void b() {
            Message message = this.f70062a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public u(Handler handler) {
        this.f70061a = handler;
    }

    public static b e() {
        b bVar;
        ArrayList arrayList = f70060b;
        synchronized (arrayList) {
            try {
                bVar = arrayList.isEmpty() ? new b() : (b) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    @Override // fa.i
    public final void a() {
        this.f70061a.removeCallbacksAndMessages(null);
    }

    @Override // fa.i
    public final boolean b(long j8) {
        return this.f70061a.sendEmptyMessageAtTime(2, j8);
    }

    @Override // fa.i
    public final boolean c() {
        return this.f70061a.hasMessages(1);
    }

    @Override // fa.i
    public final boolean d(i.a aVar) {
        b bVar = (b) aVar;
        Message message = bVar.f70062a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f70061a.sendMessageAtFrontOfQueue(message);
        bVar.a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // fa.i
    public final Looper getLooper() {
        return this.f70061a.getLooper();
    }

    @Override // fa.i
    public final b obtainMessage(int i14) {
        b bVarE = e();
        bVarE.f70062a = this.f70061a.obtainMessage(i14);
        return bVarE;
    }

    @Override // fa.i
    public final boolean post(Runnable runnable) {
        return this.f70061a.post(runnable);
    }

    @Override // fa.i
    public final void removeMessages(int i14) {
        fa.a.a(i14 != 0);
        this.f70061a.removeMessages(i14);
    }

    @Override // fa.i
    public final boolean sendEmptyMessage(int i14) {
        return this.f70061a.sendEmptyMessage(i14);
    }

    @Override // fa.i
    public final b obtainMessage(int i14, Object obj) {
        b bVarE = e();
        bVarE.f70062a = this.f70061a.obtainMessage(i14, obj);
        return bVarE;
    }

    @Override // fa.i
    public final b obtainMessage(int i14, int i15, int i16) {
        b bVarE = e();
        bVarE.f70062a = this.f70061a.obtainMessage(i14, i15, i16);
        return bVarE;
    }
}
