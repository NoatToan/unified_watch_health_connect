package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pug<T> extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<T> f30798a;

    public pug(T t) {
        this.f30798a = new WeakReference<>(t);
    }

    public void a(Message message, T t) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        T t = this.f30798a.get();
        if (t != null) {
            a(message, t);
        }
    }
}
