package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class erk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f17000b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((kqk) message.obj).recycle();
            return true;
        }
    }

    public synchronized void a(kqk<?> kqkVar, boolean z) {
        try {
            if (this.f16999a || z) {
                this.f17000b.obtainMessage(1, kqkVar).sendToTarget();
            } else {
                this.f16999a = true;
                kqkVar.recycle();
                this.f16999a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
