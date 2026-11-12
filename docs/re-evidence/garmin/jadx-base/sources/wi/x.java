package wi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f185468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f185469b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u) message.obj).b();
            return true;
        }
    }

    public final synchronized void a(u<?> uVar, boolean z14) {
        try {
            if (this.f185468a || z14) {
                this.f185469b.obtainMessage(1, uVar).sendToTarget();
            } else {
                this.f185468a = true;
                uVar.b();
                this.f185468a = false;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
