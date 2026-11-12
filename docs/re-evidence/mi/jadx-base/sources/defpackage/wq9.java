package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes10.dex */
public class wq9 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f38250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f38251b = new Handler(Looper.getMainLooper(), this);

    public interface a {
        void a(int i);
    }

    public wq9(a aVar) {
        this.f38250a = aVar;
    }

    public void a(int i) {
        this.f38251b.sendEmptyMessage(i);
    }

    public void b(int i, int i2) {
        this.f38251b.sendEmptyMessageDelayed(i, i2);
    }

    public void c() {
        this.f38251b.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.f38251b.removeMessages(1);
        int i = message.what;
        if (i == -1) {
            this.f38251b.removeCallbacksAndMessages(null);
            return false;
        }
        if (i == 1) {
            this.f38250a.a(1);
            return false;
        }
        if (i == 2) {
            this.f38250a.a(2);
            return false;
        }
        if (i == 3) {
            this.f38250a.a(3);
            return false;
        }
        if (i != 4) {
            return false;
        }
        this.f38250a.a(4);
        return false;
    }
}
