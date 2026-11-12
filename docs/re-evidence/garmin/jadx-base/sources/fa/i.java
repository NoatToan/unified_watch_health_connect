package fa;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    public interface a {
    }

    void a();

    boolean b(long j8);

    boolean c();

    boolean d(a aVar);

    Looper getLooper();

    u.b obtainMessage(int i14);

    u.b obtainMessage(int i14, int i15, int i16);

    u.b obtainMessage(int i14, Object obj);

    boolean post(Runnable runnable);

    void removeMessages(int i14);

    boolean sendEmptyMessage(int i14);
}
