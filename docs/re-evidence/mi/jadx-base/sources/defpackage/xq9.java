package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes10.dex */
public class xq9 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f39359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f39360b = new Handler(Looper.getMainLooper(), this);

    public interface a {
        void a(int i);
    }

    public xq9(a aVar) {
        this.f39359a = aVar;
    }

    public void a(int i) {
        this.f39360b.sendEmptyMessage(i);
    }

    public void b(int i, int i2) {
        this.f39360b.sendEmptyMessageDelayed(i, i2);
    }

    public void c() {
        this.f39360b.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.f39360b.removeMessages(1);
        int i = message.what;
        if (i == -1) {
            this.f39360b.removeCallbacksAndMessages(null);
            return false;
        }
        if (i == 1) {
            this.f39359a.a(1);
            return false;
        }
        if (i == 2) {
            this.f39359a.a(2);
            return false;
        }
        if (i == 3) {
            this.f39359a.a(3);
            return false;
        }
        if (i != 4) {
            return false;
        }
        this.f39359a.a(4);
        return false;
    }
}
