package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class o6r implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Handler.Callback> f28804a;

    public o6r(Handler.Callback callback) {
        this.f28804a = new WeakReference<>(callback);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Handler.Callback callback = this.f28804a.get();
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
